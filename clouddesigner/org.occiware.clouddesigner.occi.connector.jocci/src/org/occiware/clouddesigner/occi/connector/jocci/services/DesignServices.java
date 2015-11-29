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
import cz.cesnet.cloud.occi.core.ActionInstance;
import cz.cesnet.cloud.occi.exception.InvalidAttributeValueException;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.connector.jocci.Activator;
import org.occiware.clouddesigner.occi.connector.jocci.dialogs.OcciActionDialog;
import org.occiware.clouddesigner.occi.connector.jocci.dialogs.OcciServerDialog;

public class DesignServices {

	// TODO: add a location attribute to the Configuration class.
	private Client jocciClient;

	/**
	 * Report an exception.
	 * @param throwable the exception to report.
	 */
	private static void reportException(Throwable throwable)
	{
		Shell shell = Display.getCurrent().getActiveShell();
		Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, null, throwable);
		ErrorDialog.openError(shell, null, throwable.getMessage(), status);
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
				if(occiServerUrl == null || occiServerUrl.isEmpty()) {
					return null;
				}
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
	 * Create an URI for a given category.
	 * @param category the given category.
	 * @return the created URI.
	 */
	private static URI createURI(org.occiware.clouddesigner.occi.Category category)
	{
		return URI.create(category.getScheme() + category.getTerm());
	}

	/**
	 * Get the location of a given entity.
	 * @param entity the given entity.
	 * @return its location inside the OCCI server.
	 */
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

	/**
	 * Create a jOCCI entity from an OCCIware entity.
	 * @param entity the OCCIware entity.
	 * @return the jOCCI entity.
	 */
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
        		// Create an jOCCI resource.
        		jocciEntity = eb.getResource(createURI(entity.getKind()));
        	} catch (EntityBuildingException ebe) {
				reportException(ebe);
        		return null;
        	}
        } else if(entity instanceof org.occiware.clouddesigner.occi.Link) {
        	org.occiware.clouddesigner.occi.Link link = (org.occiware.clouddesigner.occi.Link)entity;
        	cz.cesnet.cloud.occi.core.Link jocciLink = null;
        	try {
        		// Create an jOCCI link.
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
        if(jocciEntity == null) {
        	return;
        }

        URI location = null;
        try {
        	// Create the OCCI resource.
        	location = jocciClient.create(jocciEntity);
        } catch (CommunicationException ce) {
        	reportException(ce);
        	return;
        }
        // Update the ID of the entity.
        String path = location.getPath();
        String id = path.substring(path.lastIndexOf('/') + 1);
        entity.setId(id);

        MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Create OCCI Entity", "Entity " + location.toString() + " created");
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
		reportException(new Error("retrieveEntity not implemented!"));
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
        if(jocciEntity == null) {
        	return;
        }
        try {
			jocciEntity.setId(entity.getId());
		} catch (InvalidAttributeValueException iave) {
			reportException(iave);
			return;
		}

        try {
        	// Update the OCCI resource.
        	boolean updated = jocciClient.update(jocciEntity);
        	if(updated) {
              MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Update OCCI Entity", "Entity " + getLocation(entity) + " updated");
        	} else {
              MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Update OCCI Entity", "Entity " + getLocation(entity) + " not updated");
        	}
        } catch (CommunicationException ce) {
        	reportException(ce);
        	return;
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

		// Get all actions of the entity.
		List<Action> actions = new ArrayList<Action>();
		addActions(entity, actions);

		// Display the OCCI action dialog.
		Shell shell = Display.getCurrent().getActiveShell();
		OcciActionDialog occiActionDialog = new OcciActionDialog(shell, actions.toArray(new Action[actions.size()]));
		occiActionDialog.create();
		if (occiActionDialog.open() != Window.OK) {
			return;
		}
		String selectedAction = occiActionDialog.getSelectedAction();
		if(selectedAction == null || selectedAction.isEmpty()) {
			return;
		}

		// Get an jOCCI entity builder.
        EntityBuilder eb = new EntityBuilder(jocciClient.getModel());
        
        // Create a jOCCI action instance.
		ActionInstance actionInstance;
		try {
			actionInstance = eb.getActionInstance(URI.create(selectedAction));
		} catch (EntityBuildingException ebe) {
			reportException(ebe);
			return;
		}

		// TODO: add action's parameters.

		// Execute the OCCI action.
        try {
        	boolean status = jocciClient.trigger(URI.create(getLocation(entity)), actionInstance);
        	if(status) {
                MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Execute OCCI Action", "Action " + selectedAction + " on " + getLocation(entity) + " executed");
          	} else {
                MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Execute OCCI Action", "Action " + selectedAction + " on " + getLocation(entity) + " failed");
          	}
		} catch (CommunicationException ce) {
			reportException(ce);
			return;
		}
	}

	private static void addActions(org.occiware.clouddesigner.occi.Entity entity, List<Action> actions)
	{
		addActions(entity.getKind(), actions);
		for(org.occiware.clouddesigner.occi.Mixin mixin : entity.getMixins()) {
			addActions(mixin, actions);
		}
	}

	private static void addActions(org.occiware.clouddesigner.occi.Kind kind, List<Action> actions)
	{
		if(kind == null) { return; }
		addActions(kind.getParent(), actions);
		actions.addAll(kind.getActions());
	}

	private static void addActions(org.occiware.clouddesigner.occi.Mixin mixin, List<Action> actions)
	{
		for(org.occiware.clouddesigner.occi.Mixin depend : mixin.getDepends()) {
			addActions(depend, actions);
		}
		actions.addAll(mixin.getActions());
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

    	if(deleted) {
            MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Delete OCCI Entity", "Entity " + getLocation(entity) + " deleted");
      	} else {
            MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Delete OCCI Entity", "Entity " + getLocation(entity) + " not deleted");
			return;
      	}

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
