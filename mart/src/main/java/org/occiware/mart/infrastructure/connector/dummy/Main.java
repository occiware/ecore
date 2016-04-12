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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.util.Occi2Ecore;

public class Main
     extends org.occiware.mart.Main
{
	/**
	 * Main program.
	 * @param args command-line arguments.
	 */
	public static void main(String[] args)
	{
		// Set the EMF factory of the OCCI Infrastructure package with the factory of the infrastructure dummy connector.
		InfrastructurePackage.eINSTANCE.setEFactoryInstance(new ConnectorFactory());

		reportJavaInformation();

		System.out.println("Created an OCCI Infrastructure configuration programmatically...");
		Configuration configurationInfrastructure = createInfrastructureConfiguration();
		print(configurationInfrastructure);
		if(validate(configurationInfrastructure)) {
			System.out.println("Youpi configuration created programmatically was validated by EMF and OCL Validation.");
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

		reportJavaInformation();
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
//		Extension infrastructure = loadExtension("http://schemas.ogf.org/occi/infrastructure#");
		// ... or an extension file name.
		Extension infrastructure = loadExtension(getFromClasspath("/model/Infrastructure.occie"));

		configuration.getUse().add(infrastructure);

		// Create OCCI resources.

		// Create a network resource.
		Resource network = (Resource)createEntity(getKindByTerm(infrastructure, "network"));
		// TODO: Set attributes.
		// Add network to the OCCI configuration.
		configuration.getResources().add(network);

		// Create a storage resource.
		Resource storage = (Resource)createEntity(getKindByTerm(infrastructure, "storage"));
		// TODO: Set attributes.
		// Add storage to the OCCI configuration.
		configuration.getResources().add(storage);

		for(int i=0; i<5; i++) {
			// Create a compute resource.
			Resource resource = (Resource)createEntity(getKindByTerm(infrastructure, "compute"));			
			// TODO: Set attributes.
			// Add the compute to the OCCI configuration.
			configuration.getResources().add(resource);
			// Create a storage link.
			Link storagelink = (Link)createEntity(getKindByTerm(infrastructure, "storagelink"));			
			storagelink.setTarget(storage);
			// TODO: Set attributes.
			// Add the storage link to the compute.
			resource.getLinks().add(storagelink);
			// Create a network interface.
			Link networkinterface = (Link)createEntity(getKindByTerm(infrastructure, "networkinterface"));			
			networkinterface.setTarget(network);
			// TODO: Set attributes.
			// Add the network interface to the compute.
			resource.getLinks().add(networkinterface);
		}

		return configuration;
	}

	/**
	 * Get a kind by its term. 
	 * @param extension The extension where to search.
	 * @param term The term of the kind to search.
	 * @return The found kind, else null.
	 * TODO: More this method into the org.occiware.clouddesigner.occi module.
	 */
	public static Kind getKindByTerm(Extension extension, String term)
	{
		for(Kind kind : extension.getKinds()) {
			if(kind.getTerm().equals(term)) {
				return kind;
			}
		}
		return null;
	}

	/**
	 * Create an entity of a given kind.
	 * @param kind The kind of the entity to create.
	 * @return The created entity, else null.
	 * TODO: More this method into the org.occiware.clouddesigner.occi module.
	 */
	public static Entity createEntity(Kind kind)
	{
		Entity createdEntity = null;

		// Get the name space of the Ecore package for this kind.
		String epackageNS = Occi2Ecore.convertOcciScheme2EcoreNamespace(kind.getScheme());
		// Get the Ecore package associated to the kind.
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(epackageNS);
		if(epackage == null) {
			System.err.println("WARNING: EPackage " + epackageNS + " not found!");
		} else {
			String classname = occiterm2emfclassname(kind.getTerm());
			// Get the Ecore class associated to the kind.
			EClass eclass = (EClass) epackage.getEClassifier(classname);
			if(eclass == null) {
				System.err.println("WARNING: EClass " + classname + " not found!");
			} else {
				// Get the Ecore factory associated to the kind.
				EFactory efactory = EPackage.Registry.INSTANCE.getEFactory(epackageNS);
				if(efactory == null) {
					System.err.println("WARNING: EFactory " + epackageNS + " not found!");
				} else {
					// Create the EObject for this kind.
					createdEntity = (Entity)efactory.create(eclass);
				}
			}
		}
		if(createdEntity == null) {
			System.err.println("WARNING: Create OCCI Core Resource!");
			createdEntity = OCCIFactory.eINSTANCE.createResource();
			createdEntity.setKind(kind);
		}

		System.err.println("DEBUG: created entity=" + createdEntity);
		// Return the new entity.
		return createdEntity;
	}

	/**
	 * Converts an OCCI term to an EMF class name.
	 * @param term the OCCI term.
	 * @return the EMF class name.
	 * TODO: More this method into the org.occiware.clouddesigner.occi module.
	 */
	private static String occiterm2emfclassname(String term) {
		return term.substring(0,1).toUpperCase() + term.substring(1);
	}
}
