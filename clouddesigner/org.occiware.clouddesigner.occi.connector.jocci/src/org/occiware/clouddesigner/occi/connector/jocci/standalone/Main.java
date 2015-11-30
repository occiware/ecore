/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.connector.jocci.standalone;

import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.connector.jocci.services.Importer;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;
// import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

/**
 *
 * @author Philippe Merle <Philippe.Merle@inria.fr>
 */
public class Main
{
	//
	// This Java program runs outside of an Eclipse IDE.
	// Then it is required to do some initializations manually.
	//
	static {
		// Init EMF to dealt with OCCI files.
		Registry.INSTANCE.getExtensionToFactoryMap().put("occie", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("occic", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("*", new OCCIResourceFactoryImpl());

		// Register the OCCI package into EMF.
		OCCIPackage.eINSTANCE.toString();	

		// Register OCCI extensions.
		OCCIRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie");
	}

	public static void main(String[] args) throws Exception
	{
		String serverURL =
				"http://rocci-server-1-1-x.herokuapp.com" // rOCCI
//				"http://192.168.99.100:8080" // erocci
			;

		// Obtain the factory to create OCCI objects.
		OCCIFactory factory = OCCIFactory.eINSTANCE;

		// Create an OCCI configuration.
		org.occiware.clouddesigner.occi.Configuration targetConfiguration = factory.createConfiguration();

		Importer.importFromOcciServer(targetConfiguration, serverURL);

		print(targetConfiguration);
		
		// Create a new resource set.
//		OCCIResourceSet resourceSet = new OCCIResourceSet();

		// create a resource
//		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("configuration.occic"));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
//		resource.getContents().add(targetConfiguration);

		// now save the content.
//		resource.save(Collections.EMPTY_MAP);
	}

	/**
	 * Print a given OCCI configuration.
	 * @param configuration the given OCCI configuration.
	 */
	public static void print(Configuration configuration)
	{
		System.out.println("Configuration");
		System.out.println("  - used extensions:");
		for(Extension extension : configuration.getUse()) {
			System.out.println("    * Extension " + extension.getName() + " " + extension.getScheme());
		}
		System.out.println("  - resources:");
		for(Resource resource : configuration.getResources()) {
			System.out.println("    * Resource id " + resource.getId());
			Kind resourceKind = resource.getKind();
			System.out.println("      - Kind " + resourceKind.getScheme() + resourceKind.getTerm());
			System.out.println("      - mixins:");
			for(Mixin mixin : resource.getMixins()) {
				System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
			}
			System.out.println("      - attributes:");
			for(AttributeState as : resource.getAttributes()) {
				System.out.println("        * AttributeState " + as.getName() + "=" + as.getValue());
			}
			System.out.println("      - links:");
			for(Link link : resource.getLinks()) {
				System.out.println("        * Link id " + link.getId());
				Kind linkKind = link.getKind();
				System.out.println("         - Kind " + linkKind.getScheme() + linkKind.getTerm());
				System.out.println("         - mixins:");
				for(Mixin mixin : link.getMixins()) {
					System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
				}
				System.out.println("         - attributes:");
				for(AttributeState as : link.getAttributes()) {
					System.out.println("           * AttributeState " + as.getName() + "=" + as.getValue());
				}
				Resource source = link.getSource();
				System.out.println("        - source id " + source.getId());
				Resource target = link.getTarget();
				if(target != null) {
					System.out.println("        - target id " + target.getId());
				} else {
					System.out.println("        - no target");
				}
			}
		}
	}
}
