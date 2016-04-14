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

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.util.OcciPrinter;
import org.occiware.clouddesigner.occi.util.OcciHelper;

/**
 * This class illustrates how to use the OCCI metamodel in a standalone Java program,
 * i.e., a program running out of an Eclipse IDE.
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
		
		MART.reportJavaInformation();

		System.out.println("Loading classpath:/model/Core.occie...");
		Extension core1 = OcciHelper.loadExtension(MART.getResourceFromClasspath("/model/Core.occie"));
		OcciPrinter.print(System.out, core1);
		if(OcciHelper.validate(core1)) {
			System.out.println("Youpi classpath:/model/Core.occie was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Loading http://schemas.ogf.org/occi/core...");
		Extension core2 = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core");
		OcciPrinter.print(System.out, core2);
		if(OcciHelper.validate(core2)) {
			System.out.println("Youpi http://schemas.ogf.org/occi/core was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Loading classpath:/model/Infrastructure.occie...");
		Extension infrastructure1 = OcciHelper.loadExtension(MART.getResourceFromClasspath("/model/Infrastructure.occie"));
		OcciPrinter.print(System.out, infrastructure1);
		if(OcciHelper.validate(infrastructure1)) {
			System.out.println("Youpi classpath:/model/Infrastructure.occie was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Loading http://schemas.ogf.org/occi/infrastructure...");
		Extension infrastructure2 = OcciHelper.loadExtension("http://schemas.ogf.org/occi/infrastructure");
		OcciPrinter.print(System.out, infrastructure2);
		if(OcciHelper.validate(infrastructure2)) {
			System.out.println("Youpi http://schemas.ogf.org/occi/infrastructure was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Loading model/infrastructure.occic...");
		Configuration conf1 = OcciHelper.loadConfiguration("model/infrastructure.occic");
		OcciPrinter.print(System.out, conf1);
		if(OcciHelper.validate(conf1)) {
			System.out.println("Youpi model/infrastructure.occic was validated by EMF and OCL Validation.");
		}
		System.out.println();

		System.out.println("Created an OCCI configuration programmatically...");
		Configuration conf2 = createConfiguration();
		OcciPrinter.print(System.out, conf2);
		if(OcciHelper.validate(conf2)) {
			System.out.println("Youpi configuration created programmatically was validated by EMF and OCL Validation.");
		}
		System.out.println();

		MART.reportJavaInformation();
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
}
