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
}
