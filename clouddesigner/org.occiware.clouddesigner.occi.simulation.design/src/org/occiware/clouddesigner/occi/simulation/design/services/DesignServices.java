/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.simulation.design.services;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OCCIUtils;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.BrigeConfigSimulation;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Simulation;


public class DesignServices {

	String scheme = "http://occiware.org/simulation#";


	public void tagDatacenter(Resource resource) {
		tagResource(resource, "datacenter");
	}

	public void tagHost(Resource resource) {
		tagResource(resource, "host");
	}

	public void tagVM(Resource resource) {
		tagResource(resource, "VM");
	}

	public void tagApplication(Resource resource) {
		tagResource(resource, "cloudlet");
	}

	public void tagResource(Resource resource, String term) {
		String extensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
		Session session = SessionManager.INSTANCE.getSession(resource);
		final org.eclipse.emf.ecore.resource.Resource extensionResource = resource.eResource().getResourceSet()
				.getResource(URI.createURI(extensionURI, true), true);
		final Extension extension = (Extension) extensionResource.getContents().get(0);
		//ResourceSet resourceSet = session.getSessionResource().getResourceSet();

		if (!extensionResource.getContents().isEmpty() && (extensionResource.getContents().get(0) instanceof Extension)
				&& !extension.getImport().contains(extensionResource.getContents().get(0))) {
			extension.getImport().add((Extension) extensionResource.getContents().get(0));
		}
		for (Mixin mixin : extension.getMixins()) {			
			if(mixin.getTerm().contains(term)){
				resource.getMixins().add(mixin);
				for(Attribute att: mixin.getAttributes()){
					AttributeState as = OCCIFactory.eINSTANCE.createAttributeState();
					as.setName(att.getName());
					as.setValue(att.getDefault());
					resource.getAttributes().add(as);
				}
			}
		}
	}

	public void start(Configuration config) {
		System.out.println("start simulation ");
		//print(conf);
		BrigeConfigSimulation bridge = new BrigeConfigSimulation(config); 
		Map<Entity, Set<Entity>> entities= bridge.ExtaractEntities();

		if(bridge.checkEntities()){
			System.out.println("Configuration contains correct informations");
			Simulation simulation = new Simulation(entities);
			simulation.runExtension();

		}else{
			System.err.println("Thanks to verify your linked resources in configuration");
		}
	}


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
