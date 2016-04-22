/*******************************************************************************
 * Copyright (c) 2015-16 Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.mart;

import java.lang.reflect.Field;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides OCCIware Models@Run.time (MART).
 *
 * @author Philippe Merle - Inria
 */
public class MART
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MART.class);

	/**
	 * This method must be called before any usage of MART
	 * because MART is running outside of an Eclipse IDE and
	 * various EMF and OCCI initializations are required.
	 */
	public static void initMART()
	{
		LOGGER.info("OCCIware MART initializing...");

		// Get the current classloader.
		final ClassLoader classLoader = MART.class.getClassLoader();
		// Get the OCCI extension registry.
		final OCCIRegistry occiRegistry = OCCIRegistry.getInstance();
		// Get the EMF file extension to factory map.
		final Map<String,Object> ecoreExtensionToFactoryMap = Registry.INSTANCE.getExtensionToFactoryMap();
		// Add OCCI resource factory for any extension.
		ecoreExtensionToFactoryMap.put("*", new OCCIResourceFactoryImpl());

		// Map to store EMF package factory overriding.
		final Map<String, EFactory> ecoreFactoryOverrideMap = new HashMap<String, EFactory>();

		try {
			// Initialize DOM.
	        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = factory.newDocumentBuilder();

        	// Iterate over all plugin.xml files found into the classpath.
			LOGGER.info("  Scanning all plugin.xml found in the classpath...");
			Enumeration<URL> pluginResources = classLoader.getResources("plugin.xml");
			for(URL url : java.util.Collections.list(pluginResources)) {
				LOGGER.debug("  * " + url.toExternalForm() + "...");
				// Parse each plugin.xml file.
				final Document document = builder.parse(url.toURI().toString());
				final Element root = document.getDocumentElement();
				// Iterate over all child nodes.
				final NodeList rootNodes = root.getChildNodes();
				for (int i=0; i<rootNodes.getLength(); i++) {
					Node node = rootNodes.item(i);
					if(node.getNodeType() == Node.ELEMENT_NODE) {
						final Element element = (Element)node;
						if("extension".equals(element.getNodeName())) {
							// Manage <extension> element.
							final NodeList childNodes = element.getChildNodes();
						    String point = element.getAttribute("point");

						    if("org.eclipse.emf.ecore.generated_package".equals(point)) {
							    //
								// Manage <extension point="org.eclipse.emf.ecore.generated_package"> element.
							    //
								for (int j=0; j<childNodes.getLength(); j++) {
									Node childNode = childNodes.item(j);
									if(childNode.getNodeType() == Node.ELEMENT_NODE) {
										final Element childElement = (Element)childNode;
										if("package".equals(childElement.getNodeName())) {
											//
											// Manage <package uri="..." class="..."> element.
											//
											String uri = childElement.getAttribute("uri");
											String className = childElement.getAttribute("class");
											// Do not dealt with Eclipse packages.
											if(!className.startsWith("org.eclipse.")) {
												// Load the class.
												Class<?> ePackageClass = loadClass(className);
												if(ePackageClass != null) {
													try {
														// Force initialization of the Ecore package.
														Field eInstanceField = ePackageClass.getField("eINSTANCE");
														Object eInstance = eInstanceField.get(null);
														eInstance.toString();
														LOGGER.info("    - EMF package " + className + " at " + uri + " registered.");
													} catch (NoSuchFieldException e) {
														LOGGER.error("Class " + className + " has no eINSTANCE field!",e);
													} catch (SecurityException e) {
														LOGGER.error("Security exception!", e);
													} catch (IllegalArgumentException e) {
														LOGGER.error("Illegal argument exception!", e);
													} catch (IllegalAccessException e) {
														LOGGER.error("Illegal access exception!", e);
													}
												}
											}
										}
									}
								}

						    } else if("org.eclipse.emf.ecore.factory_override".equals(point)) {
						    	//
								// Manage <extension point="org.eclipse.emf.ecore.factory_override"> element.
						    	//
								for (int j=0; j<childNodes.getLength(); j++) {
									Node childNode = childNodes.item(j);
									if(childNode.getNodeType() == Node.ELEMENT_NODE) {
										final Element childElement = (Element)childNode;
										if("factory".equals(childElement.getNodeName())) {
											//
											// Manage <factory uri="..." class="...">
											//
											String uri = childElement.getAttribute("uri");
											String className = childElement.getAttribute("class");
											// Do not dealt with Eclipse packages.
											if(!className.startsWith("org.eclipse.")) {
												// Instantiate the factory class.
												EFactory eFactory = (EFactory)newInstance(className);
												if(eFactory != null) {
													// Register the factory.
													ecoreFactoryOverrideMap.put(uri, eFactory);
												}
											}
										}
									}
								}

						    } else if("org.eclipse.emf.ecore.extension_parser".equals(point)) {
						    	//
								// Manage <extension point="org.eclipse.emf.ecore.extension_parser"> element.
						    	//
								for (int j=0; j<childNodes.getLength(); j++) {
									Node childNode = childNodes.item(j);
									if(childNode.getNodeType() == Node.ELEMENT_NODE) {
										final Element childElement = (Element)childNode;
										if("parser".equals(childElement.getNodeName())) {
											//
											// Manage <parser type="..." class="..."> element.
											//
											String type = childElement.getAttribute("type");
											String className = childElement.getAttribute("class");
											// Do not dealt with Eclipse packages.
											if(!className.startsWith("org.eclipse.")) {
												// Instantiate the class.
												Object extensionParser = newInstance(className);
												if(extensionParser != null) {
													// Register the extension parser.
													ecoreExtensionToFactoryMap.put(type, extensionParser);
													LOGGER.info("    - Ecore factory " + className + " for file extension ." + type + " registered.");
												}
											}
										}
									}
								}

						    } else if("org.occiware.clouddesigner.occi.occie".equals(point)) {
						    	//
								// Manage <extension point="org.occiware.clouddesigner.occi.occie"> element.
						    	//
								for (int j=0; j<childNodes.getLength(); j++) {
									Node childNode = childNodes.item(j);
									if(childNode.getNodeType() == Node.ELEMENT_NODE) {
										final Element childElement = (Element)childNode;
										if("occie".equals(childElement.getNodeName())) {
											//
											// Manage <occie file="..." scheme="..."> element.
											//
											String file = childElement.getAttribute("file");
											String scheme = childElement.getAttribute("scheme");
											// Register the OCCI extension
											occiRegistry.registerExtension(scheme, getResourceFromClasspath("/" + file));
											LOGGER.info("    - OCCI extension " + scheme + " contained in " + file + " registered.");
										}
									}
								}
							}
						}
				    }
				}
			}
		} catch (ParserConfigurationException e) {
			LOGGER.error("Parser configuration exception!", e);
		} catch (SAXException e) {
			LOGGER.error("SAX exception!", e);
		} catch (URISyntaxException e) {
			LOGGER.error("URI syntax exception!", e);
		} catch (IOException e) {
			LOGGER.error("IO exception!", e);
		}

		// Iterate over all Ecore factory overrides
		for(Map.Entry<String, EFactory> entry : ecoreFactoryOverrideMap.entrySet()) {
			String uri = entry.getKey();
			EFactory eFactory = entry.getValue();
			// Search the Ecore package.
			EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(uri);
			if(epackage == null) {
				LOGGER.error("EPackage " + " uri unknown!");
			} else {
				epackage.setEFactoryInstance(eFactory);
				LOGGER.info("    - Ecore factory " + eFactory.getClass().getName() + " for package " + uri + " registered.");
			}
		}

		LOGGER.info("OCCIware MART initialized.");
	}

	/**
	 * Get a resource path from the classpath.
	 * @param path the path into the classpath.
	 * @return the resource path.
	 */
	public static String getResourceFromClasspath(String path)
	{
		return MART.class.getResource(path).toExternalForm();
	}

	/**
	 * Report various JVM information.
	 */
	public static void reportJavaInformation()
	{
        // Getting the runtime reference from system.
		java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
		LOGGER.info("Java Runtime available processor = " + runtime.availableProcessors());
		LOGGER.info("Java Runtime max memory   = " + runtime.maxMemory());
		LOGGER.info("Java Runtime total memory = " + runtime.totalMemory());
		LOGGER.info("Java Runtime free memory  = " + runtime.freeMemory());

        int mb = 1024*1024;
        LOGGER.info("##### Heap utilization statistics [MB] #####");
        // Print used memory
        LOGGER.info("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        // Print free memory
        LOGGER.info("Free Memory:" + runtime.freeMemory() / mb);
        // Print total available memory
        LOGGER.info("Total Memory:" + runtime.totalMemory() / mb);
        // Print Maximum available memory
        LOGGER.info("Max Memory:" + runtime.maxMemory() / mb);
	}

	/**
	 * Load a class.
	 */
	private static Class<?> loadClass(final String className)
	{
		try {
			LOGGER.debug("Loading class " + className + "...");
			return MART.class.getClassLoader().loadClass(className);
		} catch (ClassNotFoundException e) {
			LOGGER.error("Class " + className + " not found!",e);
		}
		return null;
	}

	/**
	 * Instantiate a class.
	 */
	private static Object newInstance(final String className)
	{
		Class<?> clazz = loadClass(className);
		if(clazz != null) {
			try {
				LOGGER.debug("Instantiating class " + className + "...");
				return clazz.newInstance();
			} catch (InstantiationException e) {
				LOGGER.error("Instantiation exception!", e);
			} catch (IllegalAccessException e) {
				LOGGER.error("Illegal access exception!", e);
			}
		}
		return null;
	}
}
