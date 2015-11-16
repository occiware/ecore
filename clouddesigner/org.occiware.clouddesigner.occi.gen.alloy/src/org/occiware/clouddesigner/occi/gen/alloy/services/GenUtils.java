/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.gen.alloy.services;

import java.util.Date;

import org.eclipse.emf.ecore.EDataType;

import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;

public class GenUtils
{
	/**
	 * Get the current date.
	 * @return the current date.
	 */
	public String getNow() {
		return new Date().toString();
	}

	/**
	 * Get the file path of an extension.
	 * @param extension the given extension.
	 * @return the file path of the given extension.
	 */
	public String getFilePath(Extension extension) {
		return extension.eResource().getURI().toString();
	}

	/**
	 * 
	 * @param category
	 * @param context
	 * @return
	 */
	public String getScope(Category category, Category context)
	{
		StringBuffer sb = new StringBuffer();
		if((Extension)category.eContainer() != (Extension)context.eContainer()) {
			sb.append(((Extension)category.eContainer()).getName()).append('/');
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param kind
	 * @return
	 */
	public String getScope4KindParent(Kind kind)
	{
		return getScope(kind.getParent(), kind);
	}

	/**
	 * 
	 * @param attribute
	 * @param suffix
	 * @return
	 */
	public String getSigAttributeType(Attribute attribute, String suffix)
	{
		StringBuffer sb = new StringBuffer();
		EDataType type = attribute.getType();
		Extension typeExtension = (Extension)type.eContainer();
		Extension attributeExtension = (Extension)attribute.eResource().getContents().get(0);
		if(typeExtension != attributeExtension) {
			if(! (suffix == null && type.getName().equals("String"))) {
				sb.append(typeExtension.getName()).append('/');
			}
		}
		sb.append(type.getName());
		if(suffix != null) {
			sb.append(suffix);
		}
		return sb.toString();
	}
}
