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

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.lang.reflect.Field;

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

/**
 * This class provides OCCIware Models@Run.time (MART).
 *
 * @author Philippe Merle - Inria
 */
public class MART
{
	/**
	 * This method must be called before any usage of MART
	 * because MART is running outside of an Eclipse IDE and
	 * various EMF and OCCI initializations are required.
	 */
	public static void initMART()
	{
		System.out.println("OCCIware MART initializing...");

		// Get the current classloader.
		final ClassLoader classLoader = MART.class.getClassLoader();
		// Get the OCCI extension registry.
		final OCCIRegistry occiRegistry = OCCIRegistry.getInstance();
		// Get the EMF file extension to factory map.
		final Map<String,Object> ecoreExtensionToFactoryMap = Registry.INSTANCE.getExtensionToFactoryMap();
		// Add OCCI resource factory for any extension.
		ecoreExtensionToFactoryMap.put("*", new OCCIResourceFactoryImpl());

		try {
			// Initialize DOM.
	        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = factory.newDocumentBuilder();

        	// Iterate over all plugin.xml files found into the classpath.
			System.out.println("  Scanning all plugin.xml found in the classpath...");
			Enumeration<URL> pluginResources = classLoader.getResources("plugin.xml");
			for(URL url : java.util.Collections.list(pluginResources)) {
//				System.out.println("  * " + url.toExternalForm() + "...");
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
												try {
													// Load the class.
													Class<?> ePackageClass = classLoader.loadClass(className);
													// Force initialization of the Ecore package.
													Field eInstanceField = ePackageClass.getField("eINSTANCE");
													Object eInstance = eInstanceField.get(null);
													eInstance.toString();
													System.out.println("    - EMF package " + className + " at " + uri + " registered.");
												} catch (ClassNotFoundException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (NoSuchFieldException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (SecurityException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (IllegalArgumentException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (IllegalAccessException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
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
												// Search the Ecore package.
												EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(uri);
												try {
													// Load the factory class.
													Class<?> factoryClass = classLoader.loadClass(className);
													// Instantiate the factory class.
													EFactory eFactory = (EFactory)factoryClass.newInstance();
													// Register the factory.
													epackage.setEFactoryInstance(eFactory);
													System.out.println("    - Ecore factory " + className + " for package " + uri + " registered.");
												} catch (ClassNotFoundException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (InstantiationException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (IllegalAccessException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
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
												try {
													// Load the class.
													Class<?> extensionParserClass = classLoader.loadClass(className);
													// Instantiate the class.
													Object extensionParser = extensionParserClass.newInstance();
													// Register the extension parser.
													ecoreExtensionToFactoryMap.put(type, extensionParser);
													System.out.println("    - Ecore factory " + className + " for file extension ." + type + " registered.");
												} catch (ClassNotFoundException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (InstantiationException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (IllegalAccessException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
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
											System.out.println("    - OCCI extension " + scheme + " contained in " + file + " registered.");
										}
									}
								}
							}
						}
				    }
				}
			}
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OCCIware MART initialized.");
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
		System.out.println("Java Runtime available processor = " + runtime.availableProcessors());
		System.out.println("Java Runtime max memory   = " + runtime.maxMemory());
		System.out.println("Java Runtime total memory = " + runtime.totalMemory());
		System.out.println("Java Runtime free memory  = " + runtime.freeMemory());

        int mb = 1024*1024;
        System.out.println("##### Heap utilization statistics [MB] #####");
        // Print used memory
        System.out.println("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        // Print free memory
        System.out.println("Free Memory:" + runtime.freeMemory() / mb);
        // Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
        // Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
