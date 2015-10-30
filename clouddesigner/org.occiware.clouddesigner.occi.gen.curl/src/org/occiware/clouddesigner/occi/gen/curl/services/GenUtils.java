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
package org.occiware.clouddesigner.occi.gen.curl.services;

import java.util.Date;
import org.occiware.clouddesigner.occi.Configuration;

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
	 * Get the file path of a configuration.
	 * @param extension the given configuration.
	 * @return the file path of the given configuration.
	 */
	public String getFilePath(Configuration configuration) {
		return configuration.eResource().getURI().toString();
	}

	/**
	 * Get the filename of a given configuration.
	 * @param configuration a given configuration.
	 * @return the filename of the given configuration.
	 */
	public String configurationFileName(Configuration configuration) {
		return configuration.eResource().getURI().lastSegment();
	}
}
