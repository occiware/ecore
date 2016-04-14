/*******************************************************************************
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.util;

/**
 * This class provides utility functions related to the mapping of OCCI to Ecore.
 * 
 * @author Philippe Merle - Inria
 */
public class Occi2Ecore
{
	/**
	 * Suffix added to the name space of EPackage.
	 */
	static final String ECORE_SUFFIX = "/ecore";

	/**
	 * This class can not be instantiated.
	 */
	private Occi2Ecore()
	{
	}

	/**
	 * Converts an OCCI scheme to an Ecore name space.
	 * @param occiScheme the OCCI scheme.
	 * @return the Ecore name space.
	 */
	public static String convertOcciScheme2EcoreNamespace(final String occiScheme) {
		return occiScheme.substring(0, occiScheme.length()-1) + ECORE_SUFFIX;
	}

	/**
	 * Converts an Ecore name space to an OCCI scheme.
	 * @param ecoreNamespace the Ecore name space.
	 * @return the OCCI scheme.
	 */
	public static String convertEcoreNamespace2OcciScheme(final String ecoreNamespace) {
		return ecoreNamespace.substring(0, ecoreNamespace.length()-ECORE_SUFFIX.length()) + '#';
	}

	/**
	 * Converts an OCCI category term to an Ecore class name.
	 * @param term the OCCI category term.
	 * @return the Ecore class name.
	 */
	public static String convertOcciCategoryTerm2EcoreClassName(String term) {
		return term.substring(0,1).toUpperCase() + term.substring(1);
	}

	/**
	 * Convert an Ecore class name to an OCCI category term.
	 * @param eclassName the given Ecore class name.
	 * @return an OCCI category term.
	 */
	public static String convertEcoreClassName2OcciCategoryTerm(String eclassName)
	{
		return eclassName.substring(0, 1).toLowerCase() + eclassName.substring(1);
	}

	/**
	 * Convert an OCCI attribute name to an Ecore feature name.
	 * @param attributeName the given OCCI attribute name.
	 * @return the converted Ecore attribute name.
	 */
	public static String convertOcciAttributeName2EcoreAttributeName(final String attributeName)
	{
		int index = attributeName.lastIndexOf('.');
		return (index != -1) ? attributeName.substring(index+1) : attributeName;
	}
}
