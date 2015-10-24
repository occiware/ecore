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
package org.occiware.clouddesigner.occi.gen.xml.services;

import java.util.HashMap;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;

public class GenUtils {
	/**
	 * XML Schema namespace.
	 */
	static final String XML_SCHEMA_NAMESPACE = "xs:";

	/**
	 * Conversion map from Java types to XML Schema types.
	 */
	static HashMap<String, String> javaTypesToXmlSchemaTypes = new HashMap<String,String>();
	static {
		javaTypesToXmlSchemaTypes.put("char",    XML_SCHEMA_NAMESPACE + "string"); // TODO: find a better type that string.
		javaTypesToXmlSchemaTypes.put("byte",    XML_SCHEMA_NAMESPACE + "byte");
		javaTypesToXmlSchemaTypes.put("short",   XML_SCHEMA_NAMESPACE + "short");
		javaTypesToXmlSchemaTypes.put("int",     XML_SCHEMA_NAMESPACE + "int");
		javaTypesToXmlSchemaTypes.put("long",    XML_SCHEMA_NAMESPACE + "long");
		javaTypesToXmlSchemaTypes.put("float",   XML_SCHEMA_NAMESPACE + "float");
		javaTypesToXmlSchemaTypes.put("double",  XML_SCHEMA_NAMESPACE + "double");
		javaTypesToXmlSchemaTypes.put("boolean", XML_SCHEMA_NAMESPACE + "boolean");
		javaTypesToXmlSchemaTypes.put("java.lang.String", XML_SCHEMA_NAMESPACE + "string");
		// TODO: add other conversions like Date, URI, etc.
	};

	/**
	 * Converts an Ecore data type to an XML Schema type.
	 * @param datatype the given Ecore data type. 
	 * @return the resulting XML Schema type.
	 */
	public String toXmlSchemaType(EDataType datatype)
	{
       // Enumerations are converted to XML Schema strings.
       if(datatype instanceof EEnum) {
    	   return XML_SCHEMA_NAMESPACE + "string";
       }

       // For EDataType, Java instance class names are converted to XML Schema types.
       return javaTypesToXmlSchemaTypes.get(datatype.getInstanceClassName());
	}
}
