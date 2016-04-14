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

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OCCIPackage;
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
		// TODO: Loads all plugin.xml files contained into the classpath and does the various EMF/OCCI initializations automatically.

		// Init EMF to deal with OCCI files.
		Registry.INSTANCE.getExtensionToFactoryMap().put("occie", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("occic", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("*", new OCCIResourceFactoryImpl());

		// Register the OCCI package into EMF.
		OCCIPackage.eINSTANCE.toString();

		// Register OCCI extensions available into the classpath.
		OCCIRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/core#", getResourceFromClasspath("/model/Core.occie"));
		OCCIRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", getResourceFromClasspath("/model/Infrastructure.occie"));
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
