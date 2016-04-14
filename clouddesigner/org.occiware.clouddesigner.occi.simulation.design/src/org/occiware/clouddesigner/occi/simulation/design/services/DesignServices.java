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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.design.dialog.LoadExtensionDialog;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.BrigeConfigSimulation;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Simulation;


public class DesignServices {

	public static final Set<String> attributesToOmit = new HashSet<String>();
	static {
		attributesToOmit.add("occi.core.id");
		attributesToOmit.add("occi.core.source");
		attributesToOmit.add("occi.core.target");
	};

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
		System.out.println("start simulation ... ");
		//print(conf);
		BrigeConfigSimulation bridge = new BrigeConfigSimulation(config); 
		Map<Entity, Set<Entity>> entities= bridge.ExtaractEntities();
		Shell shell = this.getShell();
		if(bridge.checkEntities()){
			System.out.println("Configuration contains correct informations");
			Simulation simulation = new Simulation(entities);
			simulation.runExtension();

			JOptionPane.showMessageDialog(null, simulation.getResult(),
					"Simulation Result",
					JOptionPane.INFORMATION_MESSAGE);
			return;
			//MessageDialog.openInformation(shell, "Simulation Result", simulation.getResult());

		}else{
			System.err.println("Thanks to verify your linked resources in configuration");
			MessageDialog.openInformation(shell, "Info", "Thanks to verify your linked resources in configuration");
		}


	}

	public Shell getShell() {
		Display _current = Display.getCurrent();
		return _current.getActiveShell();
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

	public void importConfiguration(Configuration configuration) {
		Shell shell = Display.getCurrent().getActiveShell();
		Session session = SessionManager.INSTANCE.getSession(configuration);
		LoadExtensionDialog dialog = new LoadExtensionDialog(shell, session.getTransactionalEditingDomain());
		dialog.open();
		
		org.occiware.clouddesigner.occi.Extension extension = searchExtension(configuration, scheme);
		System.out.println(extension);
		configuration.getUse().add(extension);
		
		URI uri_ = dialog.getURIs().get(0);
		Configuration conf = OcciHelper.loadConfiguration(uri_.toString());
		org.occiware.clouddesigner.occi.OCCIFactory factory = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE;
	
		List<org.occiware.clouddesigner.occi.Resource> targetConfigurationResources = configuration.getResources();	
		Map<String, org.occiware.clouddesigner.occi.Resource> targetResources = new HashMap<String,org.occiware.clouddesigner.occi.Resource>();
		for(Resource resource : conf.getResources()) {
			Resource targetResource = factory.createResource();
			targetConfigurationResources.add(targetResource);
			copyEntity(configuration, resource,targetResource);
			targetResources.put(resource.getId(), targetResource);
		}

		for(Resource resource : conf.getResources()) {
			Resource targetResource = targetResources.get(resource.getId());
			System.out.println(">>> "+targetResource.getKind());
			System.out.println("<<< "+resource.getKind());
			for(Link sourceLink: resource.getLinks()){
				org.occiware.clouddesigner.occi.Link targetLink = factory.createLink();
				targetLink.setSource(targetResource);
				copyEntity(configuration, sourceLink, targetLink);
				// Set the target's link target.
				String sourceLinkTarget = sourceLink.getTarget().getId();
				org.occiware.clouddesigner.occi.Resource linkTargetResource = targetResources.get(sourceLinkTarget);
				if(linkTargetResource != null) {
					targetLink.setTarget(linkTargetResource);
				} else {
					System.err.println("Resource " + sourceLinkTarget + " unknown!");
				}
			}
		}
	}

	private static void copyEntity(Configuration configuration, Link source, Link target)
	{
		target.setId(source.getId());
		String sourceKindIdentifier = source.getId();
		org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind " + sourceKindIdentifier + " unknown!");
		}
		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin  unknown!");
			}
		}
	}


	private static void copyEntity(Configuration configuration, Resource source, Resource target)
	{
		target.setId(source.getId());
		org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind  unknown!");
		}
		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin unknown!");
			}
		}
		// Create all target entity's attributes.
		List<org.occiware.clouddesigner.occi.AttributeState> targetAttributes = target.getAttributes();
		for(AttributeState att: source.getAttributes()) {
			String attributeName = att.getName();
			if(!attributesToOmit.contains(attributeName)) {
				org.occiware.clouddesigner.occi.AttributeState targetAttribute = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createAttributeState();
				targetAttributes.add(targetAttribute);
				targetAttribute.setName(att.getName());
				targetAttribute.setValue(att.getValue());
			}
		}
	}

	private static org.occiware.clouddesigner.occi.Kind searchKind(org.occiware.clouddesigner.occi.Configuration configuration, Kind kind)
	{
		org.occiware.clouddesigner.occi.Extension extension = searchExtension(configuration, kind.getScheme().toString());
		String term = kind.getTerm();
		for(org.occiware.clouddesigner.occi.Kind k : extension.getKinds()) {
			if(term.equals(k.getTerm())) {
				return k;
			}
		}
		return null;
	}

	private static org.occiware.clouddesigner.occi.Mixin searchMixin(org.occiware.clouddesigner.occi.Configuration configuration, Mixin mixin)
	{
		String mixinSchemeWithoutSharp = schemeWithoutSharp(mixin.getScheme().toString());
		org.occiware.clouddesigner.occi.Extension extension = null;
		for(org.occiware.clouddesigner.occi.Extension ext : configuration.getUse()) {
			if(mixinSchemeWithoutSharp.startsWith(schemeWithoutSharp(ext.getScheme()))) {
				extension = ext;
				break;
			}
		}
		if(extension == null) {
			extension = searchExtension(configuration, mixin.getScheme().toString());
		}

		String term = mixin.getTerm();
		for(org.occiware.clouddesigner.occi.Mixin m : extension.getMixins()) {
			if(term.equals(m.getTerm())) {
				return m;
			}
		}
		org.occiware.clouddesigner.occi.Mixin result = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createMixin();
		result.setScheme(mixin.getScheme().toString());
		result.setTerm(mixin.getTerm());
		extension.getMixins().add(result);
		return result;
	}

	private static org.occiware.clouddesigner.occi.Extension searchExtension(org.occiware.clouddesigner.occi.Configuration configuration, String scheme)
	{
		for(org.occiware.clouddesigner.occi.Extension extension : configuration.getUse()) {
			if(scheme.equals(extension.getScheme())) {
				return extension;
			}
		}
		org.occiware.clouddesigner.occi.Extension extension = null;
		String extensionURI = org.occiware.clouddesigner.occi.OCCIRegistry.getInstance().getExtensionURI(scheme);
		if(extensionURI != null) {
			// Load the OCCI extension.
			URI uri = URI.createURI(extensionURI);
			org.eclipse.emf.ecore.resource.Resource resource = null;
			Session session = SessionManager.INSTANCE.getSession(configuration);
			if(session != null) {
				session.addSemanticResource(uri, new NullProgressMonitor());
				resource = session.getTransactionalEditingDomain().getResourceSet().getResource(uri, true);
			} else {
				resource = configuration.eResource();
				if(resource != null) {
					resource = resource.getResourceSet().getResource(uri, true);
				} else {
					resource = new ResourceSetImpl().getResource(uri, true);
				}
			}
			extension = (org.occiware.clouddesigner.occi.Extension)resource.getContents().get(0);
		} else {
			extension = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createExtension();
			extension.setName(scheme.substring(scheme.lastIndexOf("/") + 1, scheme.length()-2));
			extension.setScheme(scheme);
			if(configuration.eResource() != null) {
				configuration.eResource().getContents().add(extension);
			}
		}
		configuration.getUse().add(extension);
		return extension;
	}

	private static String schemeWithoutSharp(String scheme) {
		return scheme.substring(0, scheme.length()-2);
	}

}
