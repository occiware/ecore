/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.connector.jocci.services;

import cz.cesnet.cloud.occi.Model;
import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.EntityBuilder;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.exception.EntityBuildingException;
// import Resource;
import cz.cesnet.cloud.occi.exception.InvalidAttributeValueException;

import java.net.URI;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.connector.jocci.dialogs.OcciServerDialog;

public class DesignServices {

	// TODO: add a location attribute to the Configuration class.
	private Client jocciClient;

	/**
	 * 
	 * @param throwable
	 */
	private static void reportException(Throwable throwable)
	{
		// TODO: use Eclipse error logs.
		throwable.printStackTrace(System.err);
	}

	/**
	 * Get the jOCCI client.
	 * It is created the first time.
	 * @return the jOCCI client.
	 */
	private Client getJocciClient()
	{
		if(jocciClient == null) {
			Shell shell = Display.getCurrent().getActiveShell();
			OcciServerDialog occiServerDialog = new OcciServerDialog(shell);
			occiServerDialog.create();
			if (occiServerDialog.open() == Window.OK) {
				String occiServerUrl = occiServerDialog.getOcciServerUrl();
				// TODO: check !occiServerUrl.isEmpty()
				try {
					// Create a jOCCI client.
					jocciClient = Importer.newJocciClient(occiServerUrl);
				} catch(CommunicationException ce) {
					reportException(ce);
					jocciClient = null;
				}
			}
		}
		return jocciClient;
	}

	/**
	 * 
	 * @param category
	 * @return
	 */
	private static URI createURI(org.occiware.clouddesigner.occi.Category category)
	{
		return URI.create(category.getScheme() + category.getTerm());
	}

	private String getLocation(org.occiware.clouddesigner.occi.Entity entity)
	{
		org.occiware.clouddesigner.occi.Kind entityKind = entity.getKind();
		cz.cesnet.cloud.occi.core.Kind jocciKind = jocciClient.getModel().findKind(createURI(entityKind));
		if(jocciKind == null) {
			reportException(new Error("Kind " + entityKind.getScheme() + entityKind.getTerm() + " not found!"));
			return null;
		}
		return jocciKind.getLocation().toString() + entity.getId();
	}

	private cz.cesnet.cloud.occi.core.Entity newJocciEntity(org.occiware.clouddesigner.occi.Entity entity)
	{
		// Get the jOCCI model.
        Model jocciModel = jocciClient.getModel();
        // Get an jOCCI entity builder.
        EntityBuilder eb = new EntityBuilder(jocciModel);
        
        // The jOCCI entity to create.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = null;
        
        if(entity instanceof org.occiware.clouddesigner.occi.Resource) {
        	try {
        		jocciEntity = eb.getResource(createURI(entity.getKind()));
        	} catch (EntityBuildingException ebe) {
				reportException(ebe);
        		return null;
        	}
        } else if(entity instanceof org.occiware.clouddesigner.occi.Link) {
        	org.occiware.clouddesigner.occi.Link link = (org.occiware.clouddesigner.occi.Link)entity;
        	cz.cesnet.cloud.occi.core.Link jocciLink = null;
        	try {
        		jocciLink = eb.getLink(createURI(entity.getKind()));
        		jocciEntity = jocciLink;
        	} catch (EntityBuildingException ebe) {
				reportException(ebe);
        		return null;
        	}
        	try {
				jocciLink.setSource(getLocation(link.getSource()));
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
				return null;
			}
        	try {
				jocciLink.setTarget(getLocation(link.getTarget()));
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
				return null;
			}
        } else {
        	// Should never happen!
        	reportException(new Error("Must be a Resource or a Link"));
        	return null;
        }
        
        // Iterate over all entity's mixins.
        for(org.occiware.clouddesigner.occi.Mixin mixin : entity.getMixins()) {
        	cz.cesnet.cloud.occi.core.Mixin jocciMixin = jocciModel.findMixin(createURI(mixin));
        	jocciEntity.addMixin(jocciMixin);
        }

        // Iterate over all entity's attributes.
        for(org.occiware.clouddesigner.occi.AttributeState as : entity.getAttributes()) {
        	try {
        		jocciEntity.addAttribute(as.getName(), as.getValue());
			} catch (InvalidAttributeValueException iave) {
				reportException(iave);
			}
        }

        return jocciEntity;
	}

	/**
	 * Import into a configuration.
	 * @param configuration
	 */
	public void importConfiguration(Configuration configuration) {
		Client jocciClient = getJocciClient();
		if(jocciClient != null) {
			try {
				Importer.importFromOcciServer(configuration, jocciClient);
			} catch(Throwable throwable) {
				reportException(throwable);
			}
		}
	}

	/**
	 * Create an OCCI entity.
	 * @param entity the entity to create.
	 */
	public void createEntity(org.occiware.clouddesigner.occi.Entity entity)
	{
		// Get the jOCCI client to interact with an OCCI server.
		Client jocciClient = getJocciClient();
		if(jocciClient == null) {
			return;
		}

        // Create the jOCCI entity.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = newJocciEntity(entity);

        if(jocciEntity != null) {
        	URI location = null;
        	try {
        		// Create the OCCI resource.
        		location = jocciClient.create(jocciEntity);
        	} catch (CommunicationException ce) {
        		reportException(ce);
        		return;
        	}
        	String path = location.getPath();
        	String id = path.substring(path.lastIndexOf('/') + 1);
        	entity.setId(id);
        }
	}

	/**
	 * Retrieve an OCCI entity.
	 * @param entity the entity to retrieve.
	 */
	public void retrieveEntity(org.occiware.clouddesigner.occi.Entity entity)
	{
		Client jocciClient = getJocciClient();
		if(jocciClient == null) {
			return;
		}
		// TODO: implement
		System.err.println("retrieveEntity not implemented!");
	}

	/**
	 * Update an OCCI entity.
	 * @param entity the entity to update.
	 */
	public void updateEntity(org.occiware.clouddesigner.occi.Entity entity)
	{
		Client jocciClient = getJocciClient();
		if(jocciClient == null) {
			return;
		}

        // Create the jOCCI entity.
        cz.cesnet.cloud.occi.core.Entity jocciEntity = newJocciEntity(entity);
        try {
			jocciEntity.setId(entity.getId());
		} catch (InvalidAttributeValueException iave) {
			reportException(iave);
			return;
		}

        if(jocciEntity != null) {
        	try {
        		// Update the OCCI resource.
        		boolean updated = jocciClient.update(jocciEntity);
        		System.out.println("was " + getLocation(entity) + " updated? " + updated);
        	} catch (CommunicationException ce) {
        		reportException(ce);
        		return;
        	}
        }
	}

	/**
	 * Execute an OCCI action on an OCCI entity.
	 * @param entity the entity on which an OCCI action will be executed.
	 */
	public void executeAction(org.occiware.clouddesigner.occi.Entity entity)
	{
		Client jocciClient = getJocciClient();
		if(jocciClient == null) {
			return;
		}
		System.err.println("executeAction not implemented!");
		// TODO: Implement it.
	}

	/**
	 * Delete an OCCI entity.
	 * @param entity the entity to delete.
	 */
	public void deleteEntity(org.occiware.clouddesigner.occi.Entity entity)
	{
		Client jocciClient = getJocciClient();
		if(jocciClient == null) {
			return;
		}
		
		boolean deleted = false;
		try {
			deleted = jocciClient.delete(URI.create(getLocation(entity)));
		} catch (CommunicationException ce) {
			reportException(ce);
			return;
		}

		System.out.println("was " + getLocation(entity) + " deleted? " + deleted);

		if(deleted) {
			if(entity instanceof org.occiware.clouddesigner.occi.Resource) {
				Configuration configuration = (Configuration)entity.eContainer();
				configuration.getResources().remove(entity);
			} else if(entity instanceof org.occiware.clouddesigner.occi.Link) {
				org.occiware.clouddesigner.occi.Link link = (org.occiware.clouddesigner.occi.Link)entity;
				link.getSource().getLinks().remove(link);
			} else {
				// Should never happen!
				reportException(new Error("Must be a Resource or a Link"));
				return;
			}
		}
	}
}
