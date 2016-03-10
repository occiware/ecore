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

public class Ecore2OCCI {

	private Map<Resource, Resource> mappedResources = new HashMap<Resource, Resource>();

	private Set<Extension> usedExtensions = new HashSet<Extension>();

	public Configuration convertConfig(Configuration sourceConfig) {
		Configuration targetConfig = OCCIFactory.eINSTANCE.createConfiguration();
		// create all resources
		for (org.occiware.clouddesigner.occi.Resource sourceResource : sourceConfig.getResources()) {
			org.occiware.clouddesigner.occi.Resource targetResource = convertResource(sourceResource);
			targetConfig.getResources().add(targetResource);
		}

		// create & resolve links
		for (org.occiware.clouddesigner.occi.Resource sourceResource : sourceConfig.getResources()) {
			Resource targetResource = mappedResources.get(sourceResource);
			for (Link sourceLink : sourceResource.getLinks()) {
				targetResource.getLinks().add(convertLink(sourceLink));
			}
		}
		// add dependencies
		targetConfig.getUse().addAll(usedExtensions);
		return targetConfig;
	}

	private org.occiware.clouddesigner.occi.Resource convertResource(
			org.occiware.clouddesigner.occi.Resource sourceResource) {
		org.occiware.clouddesigner.occi.Resource targetResource = OCCIFactory.eINSTANCE.createResource();
		targetResource.setId(sourceResource.getId());
		Kind kind = getKind(sourceResource);
		targetResource.setKind(kind);

		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = ConverterUtils.formatName(attribute.getName());
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
		Kind kind = getKind(sourceLink);
		targetLink.setKind(kind);
		targetLink.setSource(mappedResources.get(sourceLink.getSource()));
		targetLink.setTarget(mappedResources.get(sourceLink.getTarget()));
		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = ConverterUtils.formatName(attribute.getName());
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
		String scheme = element.eClass().getEPackage().getNsURI() + '#';
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
