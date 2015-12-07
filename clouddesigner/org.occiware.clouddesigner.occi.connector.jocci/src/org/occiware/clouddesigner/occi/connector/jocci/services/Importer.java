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

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

/**
 *
 * @author Philippe Merle <Philippe.Merle@inria.fr>
 */
public class Importer
{
	public static cz.cesnet.cloud.occi.api.Client newJocciClient(String serverURL)
			throws cz.cesnet.cloud.occi.api.exception.CommunicationException
	{
		// Create a jOCCI client.
		cz.cesnet.cloud.occi.api.Client jocciClient = new cz.cesnet.cloud.occi.api.http.HTTPClient(java.net.URI.create(serverURL));
		// Connect to the OCCI server.
		jocciClient.connect();
		// Return the jOCCI client.
		return jocciClient;
	}

	public static void importFromOcciServer(org.occiware.clouddesigner.occi.Configuration configuration, String serverUrl)
			throws cz.cesnet.cloud.occi.api.exception.CommunicationException
	{
		cz.cesnet.cloud.occi.api.Client jocciClient = newJocciClient(serverUrl);
		// Update the jOCCI model when erocci used.
		updateModelForErocci(jocciClient.getModel());
		// Import entities from the OCCI server.
		importFromOcciServer(configuration, jocciClient);
	}

	public static void importFromOcciServer(org.occiware.clouddesigner.occi.Configuration configuration, cz.cesnet.cloud.occi.api.Client jocciClient)
					throws cz.cesnet.cloud.occi.api.exception.CommunicationException
	{
    	// Get the list of entities' uris.
    	List<java.net.URI> uris = jocciClient.list();

    	// List storing all entities of the OCCI server.
    	List<cz.cesnet.cloud.occi.core.Entity> entities = new ArrayList<cz.cesnet.cloud.occi.core.Entity>();
    	// Map associating each entity and its uri.
    	Map<cz.cesnet.cloud.occi.core.Entity, String> entities2uri = new HashMap<cz.cesnet.cloud.occi.core.Entity, String>();

		String jocciClientUri = jocciClient.getEndpoint().toString();

		// Get all OCCI server's entities.
    	for(java.net.URI uri : uris) {
    		// Get the OCCI entities
    		cz.cesnet.cloud.occi.core.Entity entity = jocciClient.describe(uri).get(0);
    		entities.add(entity);
    		// Compute entity's uri related to the OCCI server.
    		String uriAsString = uri.toString();
    		if(jocciClient.getEndpoint().getHost().equals(uri.getHost())) {
//    		if(uriAsString.startsWith(jocciClientUri)) {
    			uriAsString = uri.getPath();
    		}
    		System.out.println(jocciClientUri + "   " + uriAsString);
    		entities2uri.put(entity, uriAsString);
    	}

		// Obtain the factory to create OCCI objects.
		org.occiware.clouddesigner.occi.OCCIFactory factory = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE;

		// Map associating uri to a resource.
		Map<String, org.occiware.clouddesigner.occi.Resource> targetResources = new HashMap<String,org.occiware.clouddesigner.occi.Resource>();

		List<org.occiware.clouddesigner.occi.Resource> targetConfigurationResources = configuration.getResources();
		// Iterate over all server's entities.
		for(cz.cesnet.cloud.occi.core.Entity entity : entities) {
			if(entity instanceof cz.cesnet.cloud.occi.core.Resource) {
				// Create the target resource.
				org.occiware.clouddesigner.occi.Resource targetResource = factory.createResource();
				// Add the target resource to the configuration.
				targetConfigurationResources.add(targetResource);
				// Update the map of <uri, resource>.
				targetResources.put(entities2uri.get(entity), targetResource);
			}
		}

		// Iterate over all server's entities.
		for(cz.cesnet.cloud.occi.core.Entity entity : entities) {
			if(entity instanceof cz.cesnet.cloud.occi.core.Resource) {
				// Get the source resource.
				cz.cesnet.cloud.occi.core.Resource sourceResource = (cz.cesnet.cloud.occi.core.Resource)entity;
				// Retrieve the target resource.
				org.occiware.clouddesigner.occi.Resource targetResource = targetResources.get(entities2uri.get(sourceResource));
				// Copy the source resource to the target resource.
				copyEntity(configuration, sourceResource, targetResource);
				// Copy all resource's links.
				for(cz.cesnet.cloud.occi.core.Link sourceLink : sourceResource.getLinks()) {
					// Create the target link.
					org.occiware.clouddesigner.occi.Link targetLink = factory.createLink();
					// Add this link to the target resource.
					targetLink.setSource(targetResource);
					// Copy the source link to the target link.
					copyEntity(configuration, sourceLink, targetLink);
					// Set the target's link target.
					String sourceLinkTarget = sourceLink.getTarget();
					org.occiware.clouddesigner.occi.Resource linkTargetResource = targetResources.get(sourceLinkTarget);
					if(linkTargetResource != null) {
						targetLink.setTarget(linkTargetResource);
					} else {
						// TODO: Use Eclipse error report.
						System.err.println("Resource " + sourceLinkTarget + " unknown!");
					}
				}
			} else if (entity instanceof cz.cesnet.cloud.occi.core.Link) {
				// Get the source link.
				cz.cesnet.cloud.occi.core.Link sourceLink = (cz.cesnet.cloud.occi.core.Link)entity;
				// Create the target link.
				org.occiware.clouddesigner.occi.Link targetLink = factory.createLink();
				// Copy the source link to the target link.
				copyEntity(configuration, sourceLink, targetLink);
				// Set the target's link source.
				String sourceLinkSource = sourceLink.getSource();
				org.occiware.clouddesigner.occi.Resource sourceResource = targetResources.get(sourceLinkSource);
				if(sourceResource != null) {
					targetLink.setSource(sourceResource);
				} else {
					// TODO: Use Eclipse error report.
					System.err.println("Resource " + sourceLinkSource + " unknown!");
				}
				// Set the target's link target.
				String sourceLinkTarget = sourceLink.getTarget();
				org.occiware.clouddesigner.occi.Resource targetResource = targetResources.get(sourceLinkTarget);
				if(targetResource != null) {
					targetLink.setTarget(targetResource);
				} else {
					// TODO: Use Eclipse error report.
					System.err.println("Resource " + sourceLinkTarget + " unknown!");
				}
			} else {
				// TODO: Use Eclipse error report.
				throw new Error("Should never happen! entity=" + entity.toString());
			}
    	}
	}

	public static final Set<String> attributesToOmit = new HashSet<String>();
	static {
		attributesToOmit.add("occi.core.id");
		attributesToOmit.add("occi.core.source");
		attributesToOmit.add("occi.core.target");
	};

	private static void copyEntity(org.occiware.clouddesigner.occi.Configuration configuration, cz.cesnet.cloud.occi.core.Entity source, org.occiware.clouddesigner.occi.Entity target)
	{
		// Set the target entity's id.
		target.setId(source.getId());
		// Set the target entity's kind.
		String sourceKindIdentifier = source.getKind().getIdentifier();
		org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			// TODO: Use Eclipse error report.
			System.err.println("Kind " + sourceKindIdentifier + " unknown!");
		}
		// Set target entity's mixins.
		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
		for(cz.cesnet.cloud.occi.core.Mixin mixin : source.getMixins()) {
			String mixinIdentifier = mixin.getIdentifier();
			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				// TODO: Use Eclipse error report.
				System.err.println("Mixin " + mixinIdentifier + " unknown!");
			}
		}
		// Create all target entity's attributes.
		List<org.occiware.clouddesigner.occi.AttributeState> targetAttributes = target.getAttributes();
		for(Map.Entry<cz.cesnet.cloud.occi.core.Attribute, String> sourceAttribute : source.getAttributes().entrySet()) {
			String attributeName = sourceAttribute.getKey().getName();
			if(!attributesToOmit.contains(attributeName)) {
				org.occiware.clouddesigner.occi.AttributeState targetAttribute = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createAttributeState();
				targetAttributes.add(targetAttribute);
				targetAttribute.setName(sourceAttribute.getKey().getName());
				targetAttribute.setValue(sourceAttribute.getValue());
			}
		}
	}

	private static org.occiware.clouddesigner.occi.Kind searchKind(org.occiware.clouddesigner.occi.Configuration configuration, cz.cesnet.cloud.occi.core.Kind kind)
	{
		org.occiware.clouddesigner.occi.Extension extension = searchExtension(configuration, kind.getScheme().toString());
		String term = kind.getTerm();
		for(org.occiware.clouddesigner.occi.Kind k : extension.getKinds()) {
			if(term.equals(k.getTerm())) {
				return k;
			}
		}
		return null;
	}

	private static org.occiware.clouddesigner.occi.Mixin searchMixin(org.occiware.clouddesigner.occi.Configuration configuration, cz.cesnet.cloud.occi.core.Mixin mixin)
	{
		String mixinSchemeWithoutSharp = schemeWithoutSharp(mixin.getScheme().toString());
		org.occiware.clouddesigner.occi.Extension extension = null;
		for(org.occiware.clouddesigner.occi.Extension ext : configuration.getUse()) {
			if(mixinSchemeWithoutSharp.startsWith(schemeWithoutSharp(ext.getScheme()))) {
				extension = ext;
				break;
			}
		}
		if(extension == null) {
			extension = searchExtension(configuration, mixin.getScheme().toString());
		}

		String term = mixin.getTerm();
		for(org.occiware.clouddesigner.occi.Mixin m : extension.getMixins()) {
			if(term.equals(m.getTerm())) {
				return m;
			}
		}
		org.occiware.clouddesigner.occi.Mixin result = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createMixin();
		result.setScheme(mixin.getScheme().toString());
		result.setTerm(mixin.getTerm());
		extension.getMixins().add(result);
		return result;
	}

	private static org.occiware.clouddesigner.occi.Extension searchExtension(org.occiware.clouddesigner.occi.Configuration configuration, String scheme)
	{
		for(org.occiware.clouddesigner.occi.Extension extension : configuration.getUse()) {
			if(scheme.equals(extension.getScheme())) {
				return extension;
			}
		}
		org.occiware.clouddesigner.occi.Extension extension = null;
		String extensionURI = org.occiware.clouddesigner.occi.OCCIRegistry.getInstance().getExtensionURI(scheme);
		if(extensionURI != null) {
			// Load the OCCI extension.
			URI uri = URI.createURI(extensionURI);
			Resource resource = null;
			Session session = SessionManager.INSTANCE.getSession(configuration);
			if(session != null) {
				session.addSemanticResource(uri, new NullProgressMonitor());
				resource = session.getTransactionalEditingDomain().getResourceSet().getResource(uri, true);
			} else {
				resource = configuration.eResource();
				if(resource != null) {
					resource = resource.getResourceSet().getResource(uri, true);
				} else {
					resource = new OCCIResourceSet().getResource(uri, true);
				}
			}
			extension = (org.occiware.clouddesigner.occi.Extension)resource.getContents().get(0);
		} else {
			extension = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createExtension();
			extension.setName(scheme.substring(scheme.lastIndexOf("/") + 1, scheme.length()-2));
			extension.setScheme(scheme);
			if(configuration.eResource() != null) {
				configuration.eResource().getContents().add(extension);
			}
		}
		configuration.getUse().add(extension);
		return extension;
	}

	private static String schemeWithoutSharp(String scheme) {
		return scheme.substring(0, scheme.length()-2);
	}
	
	private static void updateModelForErocci(cz.cesnet.cloud.occi.Model model)
	{
		for(cz.cesnet.cloud.occi.core.Kind kind : model.getKinds()) {
			updateCategoryForErocci(kind);
		}
		for(cz.cesnet.cloud.occi.core.Mixin mixin : model.getMixins()) {
			updateCategoryForErocci(mixin);
		}
	}

	private static void updateCategoryForErocci(cz.cesnet.cloud.occi.core.Category category)
	{
		java.net.URI locationURI = category.getLocation();
		if(locationURI == null) return;
		String location = locationURI.toString();
		int index = location.indexOf("/collections/");
		if(index != -1) {
			String newLocation = location.substring(0,  index + 1) + location.substring(index + "/collections/".length());
			System.out.println(location + " replaced by " + newLocation);
			category.setLocation(java.net.URI.create(newLocation));
		}
	}
}
