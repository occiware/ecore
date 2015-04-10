package org.occiware.clouddesigner.occi2ecore;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.AttributeState;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.OCCIFactory;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;

public class Ecore2OCCI implements IConverterPaths {

	private Map<Resource, Resource> mappedResources = new HashMap<Resource, Resource>();

	private Set<Extension> usedExtensions = new HashSet<Extension>();

	private Map<String, Extension> extensions = new HashMap<String, Extension>();

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(InfrastructurePackage.eNS_URI,
				InfrastructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(DockerPackage.eNS_URI,
				DockerPackage.eINSTANCE);
		OCCIStandaloneSetup.doSetup();
	}

	public Ecore2OCCI() {
		registerExtension(CORE_EXT_PATH);
		registerExtension(INFRA_EXT_PATH);
		registerExtension(DOCKER_EXT_PATH);
	}

	public static void main(String[] args) throws IOException {
		ConverterUtils.save(resourceSet, new Ecore2OCCI()
				.convertConfig((Configuration) ConverterUtils.getRootElement(
						resourceSet, "file:/" + DOCKER_SAMPLE1_DSL_PATH)),
				"output/docker_sample1_OCCI.xmi");
		ConverterUtils.save(resourceSet, new Ecore2OCCI()
				.convertConfig((Configuration) ConverterUtils.getRootElement(
						resourceSet, "file:/" + DOCKER_SAMPLE2_DSL_PATH)),
				"output/docker_sample2_OCCI.xmi");
		// use the ".occi" extension to serialize using xtext
	}

	private Configuration convertConfig(Configuration sourceConfig) {
		Configuration targetConfig = OCCIFactory.eINSTANCE
				.createConfiguration();
		// create all resources
		for (org.occiware.clouddesigner.OCCI.Resource sourceResource : sourceConfig
				.getResources()) {
			org.occiware.clouddesigner.OCCI.Resource targetResource = convertResource(sourceResource);
			targetConfig.getResources().add(targetResource);
		}

		// create & resolve links
		for (org.occiware.clouddesigner.OCCI.Resource sourceResource : sourceConfig
				.getResources()) {
			Resource targetResource = mappedResources.get(sourceResource);
			for (Link sourceLink : sourceResource.getLinks()) {
				targetResource.getLinks().add(convertLink(sourceLink));
			}
		}
		// add dependencies
		targetConfig.getUse().addAll(usedExtensions);
		return targetConfig;
	}

	private org.occiware.clouddesigner.OCCI.Resource convertResource(
			org.occiware.clouddesigner.OCCI.Resource sourceResource) {
		org.occiware.clouddesigner.OCCI.Resource targetResource = OCCIFactory.eINSTANCE
				.createResource();
		targetResource.setId(sourceResource.getId());
		Kind kind = getKind(sourceResource.eClass());
		targetResource.setKind(kind);

		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = ConverterUtils.formatName(attribute
					.getName());
			EAttribute eAttribute = (EAttribute) sourceResource.eClass()
					.getEStructuralFeature(convertedAttributeName);
			// an attr cannot be set twice
			if (eAttribute != null && !setAttributes.contains(eAttribute)) {
				Object value = sourceResource.eGet(eAttribute);
				if (value != null
						&& !value.equals(eAttribute.getDefaultValue())) {
					AttributeState attributeState = OCCIFactory.eINSTANCE
							.createAttributeState();
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
		Kind kind = getKind(sourceLink.eClass());
		targetLink.setKind(kind);
		targetLink.setSource(mappedResources.get(sourceLink.getSource()));
		targetLink.setTarget(mappedResources.get(sourceLink.getTarget()));
		Set<EAttribute> setAttributes = new HashSet<EAttribute>();
		for (Attribute attribute : ConverterUtils.getAllAttributes(kind)) {
			String convertedAttributeName = ConverterUtils.formatName(attribute
					.getName());
			EAttribute eAttribute = (EAttribute) sourceLink.eClass()
					.getEStructuralFeature(convertedAttributeName);
			// an attr cannot be set twice
			if (eAttribute != null && !setAttributes.contains(eAttribute)) {
				Object value = sourceLink.eGet(eAttribute);
				if (value != null
						&& !value.equals(eAttribute.getDefaultValue())) {
					AttributeState attributeState = OCCIFactory.eINSTANCE
							.createAttributeState();
					attributeState.setName(attribute.getName());
					attributeState.setValue(String.valueOf(value));
					targetLink.getAttributes().add(attributeState);
					setAttributes.add(eAttribute);
				}
			}
		}
		return targetLink;
	}

	private Kind getKind(EClass type) {
		String term = type.getName();
		String scheme = type.getEPackage().getNsURI() + '#';
		Extension extension = extensions.get(scheme);
		for (Kind kind : extension.getKinds()) {
			if (kind.getTerm().equalsIgnoreCase(term)) {
				usedExtensions.add(extension);
				return kind;
			}
		}
		return null;
	}

	private void registerExtension(String path) {
		Extension ext = (Extension) ConverterUtils.getRootElement(resourceSet,
				"file:/" + path);
		extensions.put(ext.getScheme(), ext);
	}
}
