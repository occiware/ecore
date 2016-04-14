/*******************************************************************************
 * Copyright (c) 2015-16 Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.impl.AttributeStateImpl;

/**
 * This class provides some utility methods for the OCCI metamodel.
 *
 * @author Philippe Merle - Inria
 */
public final class OcciHelper
{
	/**
	 * This class can not be instantiated.
	 */
	private OcciHelper()
	{
	}

	// ----------------------------------------------------------------------
	//
	// Related to EMF validation.
	//
	// ----------------------------------------------------------------------

	/**
	 * Validates a given OCCI object according to the EMF and OCL constraints of its metamodel.
	 * @param occiObject the given OCCI object.
	 */
	public static boolean validate(EObject occiObject)
	{
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(occiObject);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuffer stringBuffer = printDiagnostic(diagnostic, "", new StringBuffer());
			System.out.flush();
	        System.err.println(stringBuffer.toString());
			System.err.flush();
	        return false;
		}
		return true;
	}

	/**
	 * Print an EMF validation diagnostic.
	 * @param diagnostic
	 * @param indent
	 * @param stringBuffer
	 * @return
	 */
	private static StringBuffer printDiagnostic(Diagnostic diagnostic, String indent, StringBuffer stringBuffer)
	{
		stringBuffer.append(indent);
		stringBuffer.append(diagnostic.getMessage());
		stringBuffer.append("\n");
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ", stringBuffer);
		}
		return stringBuffer;
	}

	// ----------------------------------------------------------------------
	//
	// Related to loading OCCI files.
	//
	// ----------------------------------------------------------------------

	/**
	 * Load an OCCI extension.
	 * @param extensionURI URI of the extension to load.
	 * @return the loaded OCCI extension.
	 */
	public static Extension loadExtension(String extensionURI)
	{
		 return (Extension)loadOCCI(extensionURI);
	}

	/**
	 * Load an OCCI configuration.
	 * @param configurationURI URI of the configuration to load.
	 * @return the loaded OCCI configuration.
	 */
	public static Configuration loadConfiguration(String configurationURI)
	{
		 return (Configuration)loadOCCI(configurationURI);
	}

	/**
	 * Load an OCCI object.
	 * @param uri URI of the OCCI object to load.
	 * @return the loaded OCCI object.
	 */
	private static Object loadOCCI(String uri)
	{
		 // Create a new resource set.
		 ResourceSet resourceSet = new ResourceSetImpl();
		 // Load the OCCI resource.
		 org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		 // Return the first element.
		 return resource.getContents().get(0);
	}

	// ----------------------------------------------------------------------
	//
	// Related to Configuration.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get the configuration containing a given entity.
	 * @param entity the given entity.
	 * @return the entity configuration.
	 * @throws java.lang.IllegalArgumentException If the given entity is not a resource or a link.
	 */
	public static Configuration getConfiguration(final Entity entity) {
		if(entity instanceof Resource) {
			return (Configuration)entity.eContainer();
		} else if(entity instanceof Link) {
			EObject econtainer = entity.eContainer();
			return (econtainer == null) ? null : (Configuration)econtainer.eContainer();
		} else {
			throw new IllegalArgumentException(entity.toString() + " is not a resource or link!");
		}
	}

	// ----------------------------------------------------------------------
	//
	// Related to Kind.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get a kind by its term. 
	 * @param extension The extension where to search.
	 * @param kindTerm The term of the kind to search.
	 * @return The found kind.
	 * @throws java.lang.IllegalArgumentException If the term is not found into the given extension.
	 */
	public static Kind getKindByTerm(final Extension extension, final String kindTerm)
	{
		// Iterate over all kinds of the given extension.
		for(Kind kind : extension.getKinds()) {
			// If this kind has the same term that those searched then return this kind.
			if(kind.getTerm().equals(kindTerm)) {
				return kind;
			}
		}
		// Kind not found.
		throw new IllegalArgumentException("term '" + kindTerm + "' is not found into extension '" + extension.getScheme() + "'!");
	}

	// ----------------------------------------------------------------------
	//
	// Related to Entity.
	//
	// ----------------------------------------------------------------------

	/**
	 * Get all the attributes of an Entity instance.
	 * @param entity the given Entity instance.
	 * @return all the attributes of the given instance.
	 */
	public static Collection<Attribute> getAllAttributes(final Entity entity)
	{
		List<Attribute> attributes = new ArrayList<Attribute>();
		Kind entityKind = entity.getKind();
		if(entityKind != null) {
			addAllAttributes(attributes, entityKind);
		}
		for(Mixin mixin : entity.getMixins()) {
			addAllAttributes(attributes, mixin);
		}	
		return attributes;
	}

	/**
	 * Add all the attributes of a given Kind instance and all its parent kinds.
	 *
	 * @param attributes the collection where attributes will be added.
	 * @param kind the given Kind instance.
	 */
	public static void addAllAttributes(final Collection<Attribute> attributes, final Kind kind)
	{
		Kind kindParent = kind.getParent();
		if (kindParent != null) {
			addAllAttributes(attributes, kindParent);
		}
		attributes.addAll(kind.getAttributes());
	}

	/**
	 * Add all the attributes of a given Mixin instance and all its depend mixins.
	 *
	 * @param attributes the collection where attributes will be added.
	 * @param mixin the given Mixin instance.
	 */
	public static void addAllAttributes(final Collection<Attribute> attributes, final Mixin mixin)
	{
		for(Mixin md : mixin.getDepends()) {
			addAllAttributes(attributes, md);
		}
		attributes.addAll(mixin.getAttributes());
	}

	/**
	 * Create an entity of a given kind.
	 * @param kind The kind of the entity to create.
	 * @return The created entity, else null.
	 */
	public static Entity createEntity(Kind kind)
	{
		Entity createdEntity = null;

		// Get the name space of the Ecore package for this kind.
		String epackageNS = Occi2Ecore.convertOcciScheme2EcoreNamespace(kind.getScheme());
		// Get the Ecore package associated to the kind.
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(epackageNS);
		if(epackage == null) {
			System.err.println("WARNING: EPackage " + epackageNS + " not found!");
		} else {
			String classname = Occi2Ecore.convertOcciCategoryTerm2EcoreClassName(kind.getTerm());
			// Get the Ecore class associated to the kind.
			EClass eclass = (EClass) epackage.getEClassifier(classname);
			if(eclass == null) {
				System.err.println("WARNING: EClass " + classname + " not found!");
			} else {
				// Get the Ecore factory associated to the kind.
				EFactory efactory = EPackage.Registry.INSTANCE.getEFactory(epackageNS);
				if(efactory == null) {
					System.err.println("WARNING: EFactory " + epackageNS + " not found!");
				} else {
					// Create the EObject for this kind.
					createdEntity = (Entity)efactory.create(eclass);
				}
			}
		}
		if(createdEntity == null) {
			System.err.println("WARNING: Create OCCI Core Resource!");
			createdEntity = OCCIFactory.eINSTANCE.createResource();
			createdEntity.setKind(kind);
		}

		System.err.println("DEBUG: created entity=" + createdEntity);
		// Return the new entity.
		return createdEntity;
	}

	/**
	 * Set an attribute of an OCCI entity.
	 * @param entity the given entity.
	 * @param attributeName the attribute name.
	 * @param attributeValue the attribute value.
	 * @throws java.lang.IllegalArgumentException Thrown when the attribute name is unknown or the attribute value is invalid.
	 */
	public static void setAttribute(Entity entity, String attributeName, String attributeValue)
	{
		// Check that attribute name exists from this entity.
		getAttribute(entity, attributeName);

		// Search the Ecore structural feature associated to the OCCI attribute.
		String eAttributeName = Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attributeName);
		final EStructuralFeature eStructuralFeature = entity.eClass().getEStructuralFeature(eAttributeName);

		if(eStructuralFeature == null) {
			throw new IllegalArgumentException("Ecore structural feature '" + eAttributeName + "' not found!");
		}
		if(!(eStructuralFeature instanceof EAttribute)) {
			throw new IllegalArgumentException("Ecore structural feature '" + eAttributeName + "' is not an Ecore attribute!");
		}

		// Obtain the attribute type.
		EDataType eAttributeType = ((EAttribute)eStructuralFeature).getEAttributeType();

		// Convert the attribute value according to the attribute type.
		Object eAttributeValue = eAttributeType.getEPackage().getEFactoryInstance().createFromString(eAttributeType, attributeValue);

		// Set the Ecore attribute.
		entity.eSet(eStructuralFeature, eAttributeValue);
	}

	/**
	 * Get an attribute of an OCCI entity.
	 * @param entity the given entity.
	 * @param attributeName the attribute name.
	 * @throws java.lang.IllegalArgumentException Thrown when the attribute name is unknown.
	 */
	public static Attribute getAttribute(Entity entity, String attributeName)
	{
		for(Attribute attribute : getAllAttributes(entity)) {
			if(attribute.getName().equals(attributeName)) {
				return attribute;
			}
		}
		throw new IllegalArgumentException("attribute '" + attributeName + "' is not found in " + entity + "!");
	}
}
