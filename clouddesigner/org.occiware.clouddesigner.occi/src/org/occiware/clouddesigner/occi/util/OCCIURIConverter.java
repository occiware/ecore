/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import org.occiware.clouddesigner.occi.OCCIRegistry;

public class OCCIURIConverter extends ExtensibleURIConverterImpl
{
	/**
	 * Constructor.
	 */
	public OCCIURIConverter()
	{
	}

	@Override
	public java.io.InputStream createInputStream(URI uri)
			throws java.io.IOException
	{
		uri = replaceRegisteredOcciExtensionScheme(uri);
		return super.createInputStream(uri);
	}
			 
	@Override
	public java.io.InputStream createInputStream(URI uri,
			java.util.Map<?,?> options)
		throws java.io.IOException
	{
		uri = replaceRegisteredOcciExtensionScheme(uri);
		return super.createInputStream(uri, options);
	}

	/**
	 * Replace a URI when it is an registered OCCI extension scheme.
	 * @param uri the given uri.
	 * @return
	 */
	private URI replaceRegisteredOcciExtensionScheme(URI uri)
	{
		// Search the URI into the registry of OCCI extensions.
		String extensionURI = OCCIRegistry.getInstance().getExtensionURI(uri.toString() + '#');
		if(extensionURI != null) {
			uri = URI.createURI(extensionURI);
		}
		return uri;
	}
}
