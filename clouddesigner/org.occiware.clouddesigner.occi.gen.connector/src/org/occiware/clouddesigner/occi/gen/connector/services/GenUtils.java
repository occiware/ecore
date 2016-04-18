/*******************************************************************************
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.gen.connector.services;

import java.util.Date;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.util.Occi2Ecore;

public class GenUtils
{
	/**
	 * Get the current date.
	 * @return the current date.
	 */
	public String getNow()
	{
		return new Date().toString();
	}

	/**
	 * Get the file path of an extension.
	 * @param extension the given extension.
	 * @return the file path of the given extension.
	 */
	public String getFilePath(Extension extension)
	{
		return extension.eResource().getURI().toString();
	}

	/**
	 * Get the Java package associated to an extension.
	 */
	public String getJavaPackage(Extension extension)
	{
		// Get the EPackage associated to this Extension.
		EPackage ePackage = getEPackage(extension);
		// Get the name of the Java package containing the EPackage.
		String javaPackage = ePackage.getClass().getPackage().getName();
		// Remove .impl
		int index = javaPackage.lastIndexOf('.');
		return index == -1 ? javaPackage : javaPackage.substring(0, index);
	}

	/**
	 * Get the name of the EPackage associated to an extension.
	 */
	public String getEPackageName(Extension extension)
	{
		EPackage ePackage = getEPackage(extension);
		return ePackage.getName();		
	}

	/**
	 * Get the EPackage associated to an extension.
	 */
	public EPackage getEPackage(Extension extension)
	{
		String occiExtensionScheme = extension.getScheme();
		String ecoreNamespace = Occi2Ecore.convertOcciScheme2EcoreNamespace(occiExtensionScheme);
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ecoreNamespace);
		return ePackage;
	}

	/**
	 * Get the Java type of an OCCI attribute.
	 */
	public String getJavaTypeName(Attribute attribute)
	{
		// Get the data type of this attribute.
		EDataType attributeType = attribute.getType();
		// Get the extension containing this attribute type.
		Extension extension = (Extension)(attributeType.eContainer());
		// Get the Epackage for this extension.
		EPackage ePackage = getEPackage(extension);
		// Get the data type.
		EDataType eDataType = (EDataType)ePackage.getEClassifier(attributeType.getName());
		// Return the instance class name of this data type.
		return eDataType.getInstanceClass().getName();
	}
}
