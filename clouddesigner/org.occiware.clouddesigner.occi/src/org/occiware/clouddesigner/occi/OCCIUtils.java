/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public final class OCCIUtils
{
	/**
	 * This class can not be instantiated.
	 */
	private OCCIUtils() {}

	/**
	 * Convert an OCCI attribute name to an EMF feature name.
	 * @param attributeName the given OCCI attribute name.
	 * @return the converted EMF attribute name.
	 */
	public static String computeEmfAttributeNameFromOcciAttributeName(final String attributeName) {
		int index = attributeName.lastIndexOf('.');
		return (index != -1) ? attributeName.substring(index+1) : attributeName;
	}

	 /**
	  * Convert an EClass name to an OCCI entity term.
	  * @param eclassName the given Eclass's name.
	  * @return an OCCI entity term.
	  */
	 public static String convertEclassName2EntityTerm(String eclassName) {
		return eclassName.substring(0, 1).toLowerCase() + eclassName.substring(1);
	 }

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
			OCCIUtils.addAllAttributes(attributes, entityKind);
		}
		for(Mixin mixin : entity.getMixins()) {
			OCCIUtils.addAllAttributes(attributes, mixin);
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
	 * Get a kind from an extension. 
	 * @param extension the given extension where kind will be searched.
	 * @param kindTerm the term of the kind to search.
	 * @return the found kind, otherwise null.
	 */
	public static Kind getKindByTerm(final Extension extension, final String kindTerm) {
		// Iterate over all kinds of the given extension.
		for (Kind kind : extension.getKinds()) {
			// If this kind has the same term that those searched then return this kind.
			if (kind.getTerm().equals(kindTerm)) {
				return kind;
			}
		}
		// Kind not found.
		return null;
	}

	/**
	 * Get the configuration containing a given entity.
	 * @param entity the given entity.
	 * @return the entity's configuration.
	 */
	public static Configuration getConfiguration(final Entity entity) {
		if(entity instanceof Resource) {
			return (Configuration)entity.eContainer();
		} else if(entity instanceof Link) {
			EObject econtainer = entity.eContainer();
			return (econtainer == null) ? null : (Configuration)econtainer.eContainer();
		} else {
			throw new Error("Given entity is not a resource or link");
		}
	}
}
