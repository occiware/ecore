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

public final class OCCIUtils
{
	/**
	 * This class can not be instantiated.
	 */
	private OCCIUtils() {}

	/**
	 * Get all the attributes of an Entity instance.
	 * @param entity the given Entity instance.
	 * @return all the attributes of the given instance.
	 */
	public static Collection<Attribute> getAllAttributes(final Entity entity)
	{
		List<Attribute> attributes = new ArrayList<Attribute>();
		OCCIUtils.addAllAttributes(attributes, entity.getKind());
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
		if (kind.getParent() != null) {
			addAllAttributes(attributes, kind.getParent());
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
	 * Compute the EMF feature name of an OCCI attribute name.
	 * @param attributeName the given OCCI attribute name.
	 * @return the computed EMF attribute name.
	 */
	public static String computeEmfAttributeNameFromOcciAttributeName(final String attributeName) {
		int index = attributeName.lastIndexOf('.');
		return (index != -1) ? attributeName.substring(index+1) : attributeName;
	}
}
