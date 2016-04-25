/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.emfgen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.util.Occi2Ecore;

public class Ecore2OCCI {

	private Map<Resource, Resource> mappedResources = new HashMap<Resource, Resource>();

	private Set<Extension> usedExtensions = new HashSet<Extension>();

	public Configuration convertConfig(Configuration sourceConfig) {
		Configuration targetConfig = OCCIFactory.eINSTANCE.createConfiguration();
		// create all resources
		for (Resource sourceResource : sourceConfig.getResources()) {
			Resource targetResource = convertResource(sourceResource);
			targetConfig.getResources().add(targetResource);
		}

		// create & resolve links
		for (Resource sourceResource : sourceConfig.getResources()) {
			Resource targetResource = mappedResources.get(sourceResource);
			for (Link sourceLink : sourceResource.getLinks()) {
				targetResource.getLinks().add(convertLink(sourceLink));
			}
		}
		// add dependencies
		targetConfig.getUse().addAll(usedExtensions);
		return targetConfig;
	}

	private Resource convertResource(Resource sourceResource) {
		Resource targetResource = OCCIFactory.eINSTANCE.createResource();
		targetResource.setId(sourceResource.getId());
		targetResource.setTitle(sourceResource.getTitle());
		targetResource.setSummary(sourceResource.getSummary());

		Kind kind = getKind(sourceResource);
		targetResource.setKind(kind);

		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName());
			EAttribute eAttribute = (EAttribute) sourceResource.eClass().getEStructuralFeature(convertedAttributeName);
			// an attr cannot be set twice
			if (eAttribute != null && !setAttributes.contains(eAttribute)) {
				Object value = sourceResource.eGet(eAttribute);
				if (value != null && !value.equals(eAttribute.getDefaultValue())) {
					AttributeState attributeState = OCCIFactory.eINSTANCE.createAttributeState();
					attributeState.setName(attribute.getName());
					attributeState.setValue(String.valueOf(value));
					targetResource.getAttributes().add(attributeState);
					setAttributes.add(eAttribute);
				}
			}
		}
		mappedResources.put(sourceResource, targetResource);
		return targetResource;
	}

	private Link convertLink(Link sourceLink) {
		Link targetLink = OCCIFactory.eINSTANCE.createLink();
		targetLink.setId(sourceLink.getId());
		targetLink.setTitle(sourceLink.getTitle());
		Kind kind = getKind(sourceLink);
		targetLink.setKind(kind);
		targetLink.setSource(mappedResources.get(sourceLink.getSource()));
		targetLink.setTarget(mappedResources.get(sourceLink.getTarget()));
		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName());
			EAttribute eAttribute = (EAttribute) sourceLink.eClass().getEStructuralFeature(convertedAttributeName);
			// an attr cannot be set twice
			if (eAttribute != null && !setAttributes.contains(eAttribute)) {
				Object value = sourceLink.eGet(eAttribute);
				if (value != null && !value.equals(eAttribute.getDefaultValue())) {
					AttributeState attributeState = OCCIFactory.eINSTANCE.createAttributeState();
					attributeState.setName(attribute.getName());
					attributeState.setValue(String.valueOf(value));
					targetLink.getAttributes().add(attributeState);
					setAttributes.add(eAttribute);
				}
			}
		}
		return targetLink;
	}

	private Kind getKind(EObject element) {
		String term = element.eClass().getName();
		String scheme = Occi2Ecore.convertEcoreNamespace2OcciScheme(element.eClass().getEPackage().getNsURI());
		String extensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
		final org.eclipse.emf.ecore.resource.Resource extensionResource = element.eResource().getResourceSet()
				.getResource(URI.createURI(extensionURI, true), true);
		final Extension extension = (Extension) extensionResource.getContents().get(0);
		for (Kind kind : extension.getKinds()) {
			if (kind.getTerm().equalsIgnoreCase(term)) {
				usedExtensions.add(extension);
				return kind;
			}
		}
		return null;
	}
}
