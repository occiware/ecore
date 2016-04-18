/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;

public final class OCCIRegistry {

	/**
	 * The occie extension point.
	 */
	private static final String OCCIE_EXTENSION_POINT = "org.occiware.clouddesigner.occi.occie"; //$NON-NLS-1$

	/**
	 * Stores OCCI extensions URIs per scheme.
	 */
	private static Map<String, String> registry = new HashMap<String, String>();

	/**
	 * Constructor.
	 * 
	 * @throws CoreException
	 */
	private OCCIRegistry() {
		initialize();
	}

	private static OCCIRegistry instance;

	public static OCCIRegistry getInstance() {
		if (instance == null) {
			instance = new OCCIRegistry();
		}
		return instance;
	}

	/**
	 * Initializes the extensions map.
	 * 
	 * @throws CoreException
	 *             if the registry cannot be initialized
	 */
	public void initialize() {
	  try {
		if (Platform.isRunning()) {
			registry.clear();
			final IExtension[] extensions = Platform.getExtensionRegistry()
					.getExtensionPoint(OCCIE_EXTENSION_POINT).getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				final IConfigurationElement[] configElements = extensions[i]
						.getConfigurationElements();
				for (int j = 0; j < configElements.length; j++) {
					String scheme = configElements[j].getAttribute("scheme"); //$NON-NLS-1$
					String uri = "platform:/plugin/" + extensions[i].getContributor().getName() + "/" + configElements[j].getAttribute("file"); //$NON-NLS-1$
					registerExtension(scheme, uri);
				}
			}
		}
	  } catch(NoClassDefFoundError ncdfe) {
		  System.out.println("Running out of an Eclipse Platform...");
	  }
	}

	/**
	 * Registers an extension.
	 * 
	 * @param scheme
	 *            the extension scheme
	 * @param uri
	 *            the {@link Extension} URI
	 */
	public void registerExtension(String scheme, String uri) {
		registry.put(scheme, uri);

		// Add a mapping from the extension scheme to its file URI.
		String tmp = scheme.substring(0, scheme.length()-1);
		URIConverter.URI_MAP.put(URI.createURI(tmp), URI.createURI(uri));
	}

	/**
	 * Retrieves the {@link Extension} URI associated to the given scheme if
	 * existing.
	 * 
	 * @param scheme
	 *            the extension scheme
	 * @return the {@link Extension} URI
	 */
	public String getExtensionURI(String scheme) {
		String tmp = registry.get(scheme);
		return tmp == null ? null : scheme.substring(0,scheme.length()-1);
	}

	/**
	 * Retrieves the {@link Extension} file associated to a given scheme if
	 * existing.
	 * 
	 * @param scheme
	 *            the extension scheme
	 * @return the {@link Extension} file URI
	 */
	public String getFileURI(String scheme) {
		return registry.get(scheme);
	}

	public Collection<String> getRegisteredExtensions() {
		return registry.keySet();
	}

}
