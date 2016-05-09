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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.util.OcciPrinter;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.occiware.mart.MART;

/**
 * This class illustrates how to use the OCCI metamodel in a standalone Java program,
 * i.e., a program running out of an Eclipse IDE, and
 * how to interact with an OCCI Infrastructure dummy connector.
 *
 * @author Philippe Merle - Inria
 */
public class Main
{
	/**
	 * Main program.
	 * @param args command-line arguments.
	 */
	public static void main(String[] args)
	{
		MART.reportJavaInformation();

		// Initialize MART.
		MART.initMART();
		
		MART.reportJavaInformation();

		// OCCI Core.
		loadPrintValidateExtension("http://schemas.ogf.org/occi/core");
		loadPrintValidateExtension(MART.getResourceFromClasspath("/model/Core.occie"));

		// OCCI Infrastructure Extension.
		loadPrintValidateExtension("http://schemas.ogf.org/occi/infrastructure");
		loadPrintValidateExtension(MART.getResourceFromClasspath("/model/Infrastructure.occie"));

		// OCCI Platform Extension.
		loadPrintValidateExtension("http://schemas.ogf.org/occi/platform");
		loadPrintValidateExtension(MART.getResourceFromClasspath("/model/platform.occie"));

		System.out.println("Loading model/infrastructure.occic...");
		Configuration conf1 = OcciHelper.loadConfiguration("model/infrastructure.occic");
		OcciPrinter.print(System.out, conf1);
		if(validate(conf1)) {
			System.out.println("Youpi model/infrastructure.occic was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Created an OCCI configuration programmatically...");
		Configuration conf2 = createConfiguration();
		OcciPrinter.print(System.out, conf2);
		if(validate(conf2)) {
			System.out.println("Youpi configuration created programmatically was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Created an OCCI Infrastructure configuration programmatically...");
		Configuration configurationInfrastructure = createInfrastructureConfiguration();
		OcciPrinter.print(System.out, configurationInfrastructure);
		if(validate(configurationInfrastructure)) {
			System.out.println("Youpi OCCI Infrastructure configuration created programmatically was validated by EMF and OCL Validation.");
		}

		// Execute actions on resources.
		try {
			for(Resource resource : configurationInfrastructure.getResources()) {
				if(resource instanceof Compute) {
					// Static Java invocation.
					Compute compute = (Compute)resource;
					compute.start();
					compute.stop(StopMethod.GRACEFUL);
					compute.suspend(SuspendMethod.SUSPEND);
					compute.restart(RestartMethod.WARM);
					System.out.println(compute);
					// Dynamic OCCI invocation.
					OcciHelper.executeAction(resource, "start");
					OcciHelper.executeAction(resource, "stop", "graceful");
					OcciHelper.executeAction(resource, "suspend", "suspend");
					OcciHelper.executeAction(resource, "restart", "warm");
					System.out.println(resource);
				}
				if(resource instanceof Network) {
					// Static Java invocation.
					Network network = (Network)resource;
					network.up();
					network.down();
					System.out.println(network);
					// Dynamic OCCI invocation.
					OcciHelper.executeAction(resource, "up");
					OcciHelper.executeAction(resource, "down");
					System.out.println(resource);
				}
				if(resource instanceof Storage) {
					// Static Java invocation.
					Storage storage = (Storage)resource;
					storage.online();
					storage.offline();
// Following actions were removed from OCCI Infrastructure 1.2
//					storage.backup();
//					storage.snapshot();
//					storage.resize(100);
					System.out.println(storage);
					// Dynamic OCCI invocation.
					OcciHelper.executeAction(resource, "online");
					OcciHelper.executeAction(resource, "offline");
// Following actions were removed from OCCI Infrastructure 1.2
//					OcciHelper.executeAction(resource, "backup");
//					OcciHelper.executeAction(resource, "snapshot");
//					OcciHelper.executeAction(resource, "resize", "100");
					System.out.println(resource);
				}
			}
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MART.reportJavaInformation();
	}
	
	/**
	 * Load, print, and validate an OCCI extension.
	 * @param extensionURI the URI of the extension to load, print and validate.
	 */
	public static void loadPrintValidateExtension(String extensionURI)
	{
		System.out.println("Loading " + extensionURI +"...");
		Extension extension = OcciHelper.loadExtension(extensionURI);
		OcciPrinter.print(System.out, extension);
		if(validate(extension)) {
			System.out.println("Youpi " + extensionURI + " was validated by EMF and OCL Validation.");
		}
		System.out.println();
	}
		
	/**
	 * Create an OCCI configuration containing some OCCI resources with some OCCI links programmatically.
	 * @return the created configuration.
	 */
	public static Configuration createConfiguration()
	{
		// Obtain the factory to create OCCI objects.
		OCCIFactory factory = OCCIFactory.eINSTANCE;

		// Create an OCCI configuration.
		Configuration configuration = factory.createConfiguration();
		// Create some OCCI resources.
		for(int i=0; i<5; i++) {
			// Create an OCCI resource.
			Resource resource = factory.createResource();
			// Add this resource to the OCCI configuration.
			configuration.getResources().add(resource);
			// Add some attributes to this resource.
			for(int j=0; j<5; j++) {
				// Create an OCCI attribute state.
				AttributeState as = factory.createAttributeState();
				// Set both name and value of this attribute.
				as.setName("attribute-" + j);
				as.setValue("value-" + j);
				// Add it to the resource.
				resource.getAttributes().add(as);
			}
			// Create some OCCI links.
			for(int j=0; j<3; j++) {
				// Create an OCCI link.
				Link link = factory.createLink();
				// Add this link to the resource.
				resource.getLinks().add(link);
				// Set the target of this link.
				link.setTarget(resource);
				// Add some attributes to this link.
				for(int k=0; k<5; k++) {
					// Create an OCCI attribute state.
					AttributeState as = factory.createAttributeState();
					// Set both name and value of this attribute.
					as.setName("attribute-" + k);
					as.setValue("value-" + k);
					// Add it to the link.
					link.getAttributes().add(as);
				}
			}
		}
		return configuration;
	}

	/**
	 * Create an OCCI Infrastructure configuration containing some OCCI resources with some OCCI links programmatically.
	 * @return the created configuration.
	 */
	public static Configuration createInfrastructureConfiguration()
	{
		// Create an OCCI configuration.
		Configuration configuration = OCCIFactory.eINSTANCE.createConfiguration();

		// Load infrastructure extension ...
		System.out.println("Loading OCCI infrastructure extension...");
        // ... via an extension scheme ...
		Extension infrastructure = OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure#");
		// ... or an extension file name.
//		Extension infrastructure = OcciHelper.loadExtension(MART.getResourceFromClasspath("/model/Infrastructure.occie"));

		// Use infrastructure into the configuration.
		configuration.getUse().add(infrastructure);

		//
		// Create OCCI resources.
		//

		// Create a network resource.
		Resource network = (Resource)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "network"));
        OcciHelper.setAttribute(network, "occi.network.vlan", "10");
        OcciHelper.setAttribute(network, "occi.network.label", "public");
        OcciHelper.setAttribute(network, "occi.network.state", "active");
		// Add network to the OCCI configuration.
		configuration.getResources().add(network);

		// Create a storage resource.
		Resource storage = (Resource)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "storage"));
        OcciHelper.setAttribute(storage, "occi.storage.size", "100");
        OcciHelper.setAttribute(storage, "occi.storage.state", "online");
		// Add storage to the OCCI configuration.
		configuration.getResources().add(storage);

		for(int i=0; i<5; i++) {
			// Create a compute resource.
			Resource compute = (Resource)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "compute"));			
	        OcciHelper.setAttribute(compute, "occi.compute.architecture", "x86");
	        OcciHelper.setAttribute(compute, "occi.compute.cores", "4");
	        OcciHelper.setAttribute(compute, "occi.compute.hostname", "compute" + i + ".occiware.org");
	        OcciHelper.setAttribute(compute, "occi.compute.speed", "100");
	        OcciHelper.setAttribute(compute, "occi.compute.memory", "16");
	        OcciHelper.setAttribute(compute, "occi.compute.state", "active");
			// Add the compute to the OCCI configuration.
			configuration.getResources().add(compute);

			// Create a storage link.
			Link storagelink = (Link)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "storagelink"));			
			storagelink.setTarget(storage);
			OcciHelper.setAttribute(storagelink, "occi.storagelink.deviceid", "fd0");
			OcciHelper.setAttribute(storagelink, "occi.storagelink.mountpoint", "/");
			OcciHelper.setAttribute(storagelink, "occi.storagelink.state", "active");
			// Add the storage link to the compute.
			compute.getLinks().add(storagelink);

			// Create a network interface.
			Link networkinterface = (Link)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "networkinterface"));			
			networkinterface.setTarget(network);
			OcciHelper.setAttribute(networkinterface, "occi.networkinterface.interface", "hd0");
			OcciHelper.setAttribute(networkinterface, "occi.networkinterface.mac", "1.1.1.1");
			OcciHelper.setAttribute(networkinterface, "occi.networkinterface.state", "active");
			// Add the network interface to the compute.
			compute.getLinks().add(networkinterface);
		}
		return configuration;
	}

	public static boolean validate(EObject eObject)
	{
		 if(!Boolean.getBoolean("validation")) { return true; }
		 // Does the validation when the Java system property 'validation' is set to 'true'.
		 return OcciHelper.validate(eObject);
	}
}
