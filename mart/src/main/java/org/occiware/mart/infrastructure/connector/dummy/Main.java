/*******************************************************************************
 *
 * OCCIware MART: OCCI Infrastructure Dummy Connector
 *
 * Copyright (c) 2016 Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *
 *******************************************************************************/
package org.occiware.mart.infrastructure.connector.dummy;

import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.occiware.clouddesigner.occi.util.OcciPrinter;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.occiware.mart.MART;

/**
 * This class illustrates how to interact with an OCCI Infrastructure dummy connector.
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
		// Initialize MART.
		MART.initMART();

		// Set the EMF factory of the OCCI Infrastructure package with the factory of the infrastructure dummy connector.
		InfrastructurePackage.eINSTANCE.setEFactoryInstance(new ConnectorFactory());
		// TODO: This would be done into the initMART() method automatically.

		MART.reportJavaInformation();

		System.out.println("Created an OCCI Infrastructure configuration programmatically...");
		Configuration configurationInfrastructure = createInfrastructureConfiguration();
		OcciPrinter.print(System.out, configurationInfrastructure);
		if(OcciHelper.validate(configurationInfrastructure)) {
			System.out.println("Youpi OCCI Infrastructure configuration created programmatically was validated by EMF and OCL Validation.");
		}

		// Execute actions on resources.
		for(Resource resource : configurationInfrastructure.getResources()) {
			if(resource instanceof Compute) {
				Compute compute = (Compute)resource;
				compute.start();
				System.out.println(compute);
			}
			if(resource instanceof Network) {
				Network network = (Network)resource;
				network.up();
				System.out.println(network);
			}
			if(resource instanceof Storage) {
				Storage storage = (Storage)resource;
				storage.online();
				System.out.println(storage);
			}
		}

		MART.reportJavaInformation();
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
		// TODO: Set attributes.
		// Add network to the OCCI configuration.
		configuration.getResources().add(network);

		// Create a storage resource.
		Resource storage = (Resource)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "storage"));
		// TODO: Set attributes.
		// Add storage to the OCCI configuration.
		configuration.getResources().add(storage);

		for(int i=0; i<5; i++) {
			// Create a compute resource.
			Resource resource = (Resource)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "compute"));			
			// TODO: Set attributes.
			// Add the compute to the OCCI configuration.
			configuration.getResources().add(resource);
			// Create a storage link.
			Link storagelink = (Link)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "storagelink"));			
			storagelink.setTarget(storage);
			// TODO: Set attributes.
			// Add the storage link to the compute.
			resource.getLinks().add(storagelink);
			// Create a network interface.
			Link networkinterface = (Link)OcciHelper.createEntity(OcciHelper.getKindByTerm(infrastructure, "networkinterface"));			
			networkinterface.setTarget(network);
			// TODO: Set attributes.
			// Add the network interface to the compute.
			resource.getLinks().add(networkinterface);
		}
		return configuration;
	}
}
