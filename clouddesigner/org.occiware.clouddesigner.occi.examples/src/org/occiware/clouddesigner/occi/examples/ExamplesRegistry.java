/*******************************************************************************
 * Copyright (c) 2017 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.examples;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.occiware.clouddesigner.occi.examples.Activator;
import org.osgi.framework.Bundle;

/**
 * The examples registry.
 *
 * @author William Piers
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 */
public class ExamplesRegistry {

	private static final String EXAMPLES_EXTENSION_POINT = "org.occiware.clouddesigner.occi.examples.example"; //$NON-NLS-1$

	private static final String EXAMPLE_NAME_ATTR = "name"; //$NON-NLS-1$

	private static final String EXAMPLE_DESCRIPTION_ATTR = "description"; //$NON-NLS-1$

	private static final String EXAMPLE_PROJECT_NAME_ATTR = "projectName"; //$NON-NLS-1$

	private static final String EXAMPLE_SCREENSHOT_ATTR = "screenshot"; //$NON-NLS-1$

	private static final String EXAMPLE_AIRD_ATTR = "aird"; //$NON-NLS-1$

	private static final String EXAMPLE_SEMANTIC_ATTR = "semantic"; //$NON-NLS-1$

	private List<IExample> registry = new ArrayList<IExample>();

	/**
	 * Constructor.
	 * 
	 * @throws CoreException
	 */
	private ExamplesRegistry() {
		initialize();
	}

	private static ExamplesRegistry instance;

	public static ExamplesRegistry getInstance() {
		if (instance == null) {
			instance = new ExamplesRegistry();
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
		if (Platform.isRunning()) {
			registry.clear();
			for (IExtension extension : Platform.getExtensionRegistry().getExtensionPoint(EXAMPLES_EXTENSION_POINT)
					.getExtensions()) {
				for (final IConfigurationElement configElement : extension.getConfigurationElements()) {
					registry.add(new IExample() {

						@Override
						public String getProjectName() {
							return configElement.getAttribute(EXAMPLE_PROJECT_NAME_ATTR);
						}

						@Override
						public String getName() {
							return configElement.getAttribute(EXAMPLE_NAME_ATTR);
						}

						@Override
						public String getDescription() {
							return configElement.getAttribute(EXAMPLE_DESCRIPTION_ATTR);
						}

						@Override
						public Image getScreenshot() {
							return resolveImage(configElement.getContributor().getName(),
									configElement.getAttribute(EXAMPLE_SCREENSHOT_ATTR));
						}

						@Override
						public File getAird() {
							return resolveFile(configElement.getContributor().getName(),
									configElement.getAttribute(EXAMPLE_AIRD_ATTR));
						}

						@Override
						public File getSemantic() {
							return resolveFile(configElement.getContributor().getName(),
									configElement.getAttribute(EXAMPLE_SEMANTIC_ATTR));
						}

					});
				}
			}
		}
	}

	public IExample[] getRegisteredExamples() {
		return registry.toArray(new IExample[registry.size()]);
	}

	private static File resolveFile(String pluginName, String path) {
		Bundle bundle = Platform.getBundle(pluginName);
		URL fileURL = bundle.getEntry(path);
		try {
			URL resolvedFileURL = FileLocator.toFileURL(fileURL);
			URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
			return new File(resolvedURI);
		} catch (URISyntaxException | IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		return null;
	}

	private static Image resolveImage(String pluginName, String path) {
		Bundle bundle = Platform.getBundle(pluginName);
		URL fileURL = bundle.getEntry(path);
		try {
			URL resolvedFileURL = FileLocator.toFileURL(fileURL);
			return ImageDescriptor.createFromURL(resolvedFileURL).createImage();
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		return null;
	}

}
