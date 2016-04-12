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
	 * This class can not be instantiated.
	 */
	private Occi2Ecore()
	{
	}

	/**
	 * Converts an OCCI scheme to an Ecore name space.
	 * @param scheme the OCCI scheme.
	 * @return the Ecore name space.
	 */
	public static String convertOcciScheme2EcoreNamespace(final String scheme) {
		return scheme.substring(0, scheme.length()-1) + "/ecore";
	}
}
