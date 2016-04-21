/*******************************************************************************
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.emfgen.design.services;

import org.eclipse.emf.ecore.EEnumLiteral;

public class GenUtils
{
	/**
	 * Get a color.
	 */
	public String getColor(EEnumLiteral eEnumLiteral)
	{
		int value = eEnumLiteral.getValue();
		if(value >= colors.length) return "light_gray";
		return colors[value];
	}

	private static String colors[] = new String[] { "light_green", "light_red", "light_orange"};
}
