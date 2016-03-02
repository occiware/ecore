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
package org.occiware.mart;

import org.eclipse.emf.common.util.Diagnostic;
// import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.util.Diagnostician;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

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
		OCCIRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/core#", "model/core.occie");
		OCCIRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "model/infrastructure.occie");
	}

	/**
	 * Main program.
	 * @param args command-line arguments.
	 */
	public static void main(String[] args)
	{
		reportJavaInformation();

		System.out.println("Loading model/core.occie...");
		Extension core1 = loadExtension("model/core.occie");
		print(core1);
		if(validate(core1)) {
			System.out.println("Youpi model/core.occie was validated by EMF and OCL Validation.");
		}
		System.out.println("");

		System.out.println("Loading http://schemas.ogf.org/occi/core...");
		Extension core2 = loadExtension("http://schemas.ogf.org/occi/core");
		print(core2);
		if(validate(core2)) {
			System.out.println("Youpi http://schemas.ogf.org/occi/core was validated by EMF and OCL Validation.");
		}
		System.out.println("");

		System.out.println("Loading model/infrastructure.occie...");
		Extension infrastructure1 = loadExtension("model/infrastructure.occie");
		print(infrastructure1);
		if(validate(infrastructure1)) {
			System.out.println("Youpi model/infrastructure.occie was validated by EMF and OCL Validation.");
		}
		System.out.println("");

		System.out.println("Loading http://schemas.ogf.org/occi/infrastructure...");
		Extension infrastructure2 = loadExtension("http://schemas.ogf.org/occi/infrastructure");
		print(infrastructure2);
		if(validate(infrastructure2)) {
			System.out.println("Youpi http://schemas.ogf.org/occi/infrastructure was validated by EMF and OCL Validation.");
		}
		System.out.println("");

		System.out.println("Loading model/infrastructure.occic...");
		Configuration conf1 = loadConfiguration("model/infrastructure.occic");
		print(conf1);
		if(validate(conf1)) {
			System.out.println("Youpi model/infrastructure.occic was validated by EMF and OCL Validation.");
		}
		System.out.println("");

		System.out.println("Created an OCCI configuration programmatically...");
		Configuration conf2 = createConfiguration();
		print(conf2);
		if(validate(conf2)) {
			System.out.println("Youpi configuration created programmatically was validated by EMF and OCL Validation.");
		}

		reportJavaInformation();
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
//				link.setTarget(resource);
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
	 * Print a given OCCI extension.
	 * @param extension the given OCCI extension.
	 */
	public static void print(Extension extension)
	{
		System.out.println("Extension");
		System.out.println("  - name: " + extension.getName());
		System.out.println("  - scheme: " + extension.getScheme());
		System.out.println("  - import extensions:");
		for(Extension importExtension : extension.getImport()) {
			System.out.println("        * Extension " + importExtension.getName() + " " + importExtension.getScheme());
		}
		System.out.println("  - kinds:");
		for(Kind kind : extension.getKinds()) {
			System.out.println("    * Kind");
			System.out.println("      - term: " + kind.getTerm());
			System.out.println("      - scheme: " + kind.getScheme());
			System.out.println("      - title: " + kind.getTitle());
			Kind parent = kind.getParent();
			if(parent != null) {
				System.out.println("      - parent: " + parent.getScheme() + parent.getTerm());					
			} else {
				System.out.println("      - no parent");
			}
			System.out.println("      - attributes:");
			for(Attribute attribute : kind.getAttributes()) {
				System.out.println("        * Attribute");
				System.out.println("          - name: " + attribute.getName());
				System.out.println("          - description: " + attribute.getDescription());
				System.out.println("          - mutable: " + attribute.isMutable());
				System.out.println("          - required: " + attribute.isRequired());
				System.out.println("          - type: " + attribute.getType().getName());
				System.out.println("          - default: " + attribute.getDefault());
			}
			System.out.println("      - actions:");
			for(Action action : kind.getActions()) {
				System.out.println("        * Action");
				System.out.println("          - term: " + action.getTerm());
				System.out.println("          - scheme: " + action.getScheme());
				System.out.println("          - title: " + action.getTitle());
			}
			System.out.println("      - entities:");
			for(Entity entity : kind.getEntities()) {
				System.out.println("        * Entity id " + entity.getId());
			}
		}
		System.out.println("  - mixins:");
		for(Mixin mixin : extension.getMixins()) {
			System.out.println("    * Mixin");
			System.out.println("      - term: " + mixin.getTerm());
			System.out.println("      - scheme: " + mixin.getScheme());
			System.out.println("      - title: " + mixin.getTitle());
			System.out.println("      - depends:");
			for(Mixin depend : mixin.getDepends()) {
				System.out.println("        * Mixin " + depend.getScheme() + depend.getTerm());
			}
			System.out.println("      - applies:");
			for(Kind apply : mixin.getApplies()) {
				System.out.println("        * Kind " + apply.getScheme() + apply.getTerm());
			}				
			System.out.println("      - attributes:");
			for(Attribute attribute : mixin.getAttributes()) {
				System.out.println("        * Attribute");
				System.out.println("          - name: " + attribute.getName());
				System.out.println("          - description: " + attribute.getDescription());
				System.out.println("          - mutable: " + attribute.isMutable());
				System.out.println("          - required: " + attribute.isRequired());
				System.out.println("          - type: " + attribute.getType().getName());
				System.out.println("          - default: " + attribute.getDefault());
			}
			System.out.println("      - actions:");
			for(Action action : mixin.getActions()) {
				System.out.println("        * Action");
				System.out.println("          - term: " + action.getTerm());
				System.out.println("          - scheme: " + action.getScheme());
				System.out.println("          - title: " + action.getTitle());
			}
			System.out.println("      - entities:");
			for(Entity entity : mixin.getEntities()) {
				System.out.println("        * Entity id " + entity.getId());
			}
		}
		System.out.println("  - types:");
		for(EDataType type : extension.getTypes()) {
			System.out.println("    * EDataType " + type.getName());
		}
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
	
	/**
	 * EMF and OCL validation of a given OCCI object.
	 * @param occi the given OCCI object.
	 */
	public static boolean validate(EObject occi)
	{
		if(!Boolean.getBoolean("validation")) { return true; }
		// Does the validation when the Java system property 'validation' is set to 'true'.
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(occi);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuffer stringBuffer = printDiagnostic(diagnostic, "", new StringBuffer());
	        System.err.println(stringBuffer.toString());
	        return false;
		}
		return true;
	}

	/**
	 * Print an EMF validation diagnostic.
	 * @param diagnostic
	 * @param indent
	 * @param stringBuffer
	 * @return
	 */
	private static StringBuffer printDiagnostic(Diagnostic diagnostic, String indent, StringBuffer stringBuffer)
	{
		stringBuffer.append(indent);
		stringBuffer.append(diagnostic.getMessage());
		stringBuffer.append("\n");
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ", stringBuffer);
		}
		return stringBuffer;
	}

	/**
	 * Load an OCCI extension.
	 * @param extensionURI URI of the extension to load.
	 * @return the loaded extension.
	 */
	public static Extension loadExtension(String extensionURI)
	{
		 return (Extension)loadOCCI(extensionURI);
	}

	/**
	 * Load an OCCI configuration.
	 * @param configurationURI URI of the configuration to load.
	 * @return the loaded configuration.
	 */
	public static Configuration loadConfiguration(String configurationURI)
	{
		 return (Configuration)loadOCCI(configurationURI);
	}

	/**
	 * Load an OCCI object.
	 * @param uri URI of the OCCI object to load.
	 * @return the loaded OCCI object.
	 */
	private static Object loadOCCI(String uri)
	{
		 // Create a new resource set.
		 ResourceSet resourceSet = new OCCIResourceSet();
		 // Load the OCCI resource.
		 org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		 // Return the first element.
		 return resource.getContents().get(0);
	}

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
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
