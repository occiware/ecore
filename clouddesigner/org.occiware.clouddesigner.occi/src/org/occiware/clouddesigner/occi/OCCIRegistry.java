package org.occiware.clouddesigner.occi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

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
					registry.put(scheme, uri);
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
	}

	/**
	 * Retrieves the {@link Extension} associated to the given scheme if
	 * existing.
	 * 
	 * @param scheme
	 *            the extension scheme
	 * @return the {@link Extension} URI
	 */
	public String getExtensionURI(String scheme) {
		return registry.get(scheme);
	}

	public Collection<String> getRegisteredExtensions() {
		return registry.keySet();
	}

}
