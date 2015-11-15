/*******************************************************************************
 * Copyright (c) 2015 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

public class OCCIKindResolver
{
	/**
	 * OCCI Core scheme.
	 */
	public static final String OCCI_CORE_SCHEME = "http://schemas.ogf.org/occi/core#";

	/**
	 * OCCI Core entity term.
	 */
	public static final String OCCI_CORE_ENTITY_TERM = "entity";

	/**
	 * OCCI Core resource term.
	 */
	public static final String OCCI_CORE_RESOURCE_TERM = "resource";

	/**
	 * OCCI Core link term.
	 */
	public static final String OCCI_CORE_LINK_TERM = "link";
	
	/**
	 * Store mapping from EMF namespace to OCCI Extension.
	 */
	private static Map<String, Extension> namespace2extension = new HashMap<String, Extension>();

	/**
	 * Store mapping from EClass to OCCI Kind.
	 */
	private static Map<EClass, Kind> eclass2kind = new HashMap<EClass, Kind>();

	/**
	 * Resolve the kind of a given entity.
	 * @param entity the given entity.
	 * @return the resolved kind.
	 */
	 public static Kind resolveKind(final Entity entity)
	 {
		 // Get the Eclass of the given entity.
		 EClass entityEClass = entity.eClass();

		 Extension extension = null;
		 String kindTermToSearch = OCCIUtils.convertEclassName2EntityTerm(entityEClass.getName());

		 // Search the kind associated to the entity's eClass.
		 Kind entityKind = eclass2kind.get(entityEClass);
		 // If kind not found then
		 if (entityKind == null) {
			 // Search the extension associated to the ePackage of the entity's eClass.
			 String metamodelURI = entityEClass.getEPackage().getNsURI();
			 extension = namespace2extension.get(metamodelURI);
			 // If extension not found then
			 if (extension == null) {
				 // Search URI of the extension into the OCCI extension registry.
				 String scheme = metamodelURI + '#';
				 String extensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
				 // If extension URI not found then
				 if(extensionURI == null) {
					 // This is no way to resolve the kind of the given entity :-(
					 // TODO: perhaps compute extensionURI of the ePackage of the entity's eClass.

					 // Use OCCI Core resource, link or entity kind instances.
					 extensionURI = OCCIRegistry.getInstance().getExtensionURI(OCCI_CORE_SCHEME);
					 if(entity instanceof org.occiware.clouddesigner.occi.Resource) {
						 kindTermToSearch = OCCI_CORE_RESOURCE_TERM;
					 } else if(entity instanceof Link) {
						 kindTermToSearch = OCCI_CORE_LINK_TERM;						 
					 } else {
						 kindTermToSearch = OCCI_CORE_ENTITY_TERM;
						 throw new Error("Should never happens! entity=" + entity);
					 }
				 }

				 // Here extensionURI is set.
				 assert(extensionURI != null);

				 // Compute the resource set where loading the extension.
				 ResourceSet resourceSet = null;
				 Resource entityResource = entity.eResource();
				 // If entity not in a resource.
				 if(entityResource != null) {
					 // Reuse the resource set containing the resource containing the given entity.
					 resourceSet = entityResource.getResourceSet();
				 } else {
					 // Create a new resource set.
					 resourceSet = new OCCIResourceSet();
				 }
				 // Load the extension.
				 Resource extensionResource = resourceSet.getResource(URI.createURI(extensionURI), true);
				 extension = (Extension) extensionResource.getContents().get(0);

				 // Map the metamodelURI to the found extension for optimizing next searches.
				 namespace2extension.put(metamodelURI, extension);
			 }

			 // Here extension was loaded.
			 assert(extension != null);

			 // Search the entity's kind into the found extension.
			 entityKind = OCCIUtils.getKindByTerm(extension, kindTermToSearch);
			 if(entityKind != null) {
				 // Map the entity's eClass to the found kind for optimizing next searches.
				 eclass2kind.put(entityEClass, entityKind);
			 }
		 }

		 // Update the configuration of the entity.
		 Configuration owningConfiguration = OCCIUtils.getConfiguration(entity);
		 if(extension != null && owningConfiguration != null) {
			 EList<Extension> useList = owningConfiguration.getUse();
			 if (!useList.contains(extension)) {
				 // add the found extension to the use of the configuration owning the given entity.
				 try {
					 useList.add(extension);
				 } catch(Exception exc) {
					// TODO: Should never happen :-(
					exc.printStackTrace(System.err);
				 }
			 }
		 }
		// Return the found entity's kind.
		return entityKind;
	 }
}
