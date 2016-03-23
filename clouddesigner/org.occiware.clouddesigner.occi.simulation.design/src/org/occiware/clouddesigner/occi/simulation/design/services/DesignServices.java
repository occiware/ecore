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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OCCIUtils;
import org.occiware.clouddesigner.occi.Resource;


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

}
