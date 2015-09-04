package org.occiware.clouddesigner.occi.emfgen.tests.extensions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.emfgen.ConverterUtils;

public class ConvertDockerConfig {
	private ResourceSet resourceSet = new ResourceSetImpl();

	private Map<Resource, Resource> traces = new HashMap<Resource, Resource>();

	public ConvertDockerConfig(EPackage... convertedEPackages) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		for (EPackage ePackage : convertedEPackages) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
	}

	public void convertConfiguration(String inputPath, String outputPath,
			EPackage... converted) throws IOException {
		Configuration config = (Configuration) ConverterUtils.getRootElement(
				resourceSet, inputPath);
		Configuration convertedConfig = convertConfiguration(config);
		ConverterUtils.save(resourceSet, convertedConfig, outputPath);
	}

	private Configuration convertConfiguration(
			Configuration dynamicConfiguration) {
		Configuration res = OCCIFactory.eINSTANCE.createConfiguration();
		for (Resource resource : dynamicConfiguration.getResources()) {
			EClass mappedEClass = ConverterUtils.getMappedEClass(resource
					.getKind());
			Resource converted = (Resource) EcoreUtil.create(mappedEClass);
			converted.setId(resource.getId());
			for (AttributeState attrState : resource.getAttributes()) {
				EAttribute attr = (EAttribute) mappedEClass
						.getEStructuralFeature(ConverterUtils
								.formatName(attrState.getName()));
				setValue(converted, attr, attrState.getValue());
			}
			res.getResources().add(converted);
			traces.put(resource, converted);
		}

		for (Resource resource : dynamicConfiguration.getResources()) {
			for (Link link : resource.getLinks()) {
				EClass actualLinkType = ConverterUtils.getMappedEClass(link
						.getKind());
				Link actualLink = (Link) EcoreUtil.create(actualLinkType);
				actualLink.setId(link.getId());
				Resource converted = traces.get(resource);
				actualLink.setSource(converted);
				actualLink.setTarget(traces.get(link.getTarget()));
				for (AttributeState attrState : link.getAttributes()) {
					EAttribute attr = (EAttribute) actualLinkType
							.getEStructuralFeature(ConverterUtils
									.formatName(attrState.getName()));
					setValue(actualLink, attr, attrState.getValue());
				}
				converted.getLinks().add(actualLink);
			}
		}

		// resolve links
		return res;
	}

	private void setValue(EObject element, EAttribute attr, String value) {
		String typeName = attr.getEType().getInstanceClassName();
		if ("java.lang.String".equals(typeName)) {
			element.eSet(attr, value);
		} else if ("java.lang.Float".equals(typeName)
				|| "float".equals(typeName)) {
			element.eSet(attr, Float.valueOf(value));
		} else if ("int".equals(typeName)) {
			element.eSet(attr, Integer.valueOf(value));
		} else if ("boolean".equals(typeName)) {
			element.eSet(attr, Boolean.valueOf(value));
		} else if (attr.getEType() instanceof EEnum) {
			element.eSet(attr, ((EEnum) attr.getEType())
					.getEEnumLiteralByLiteral(String.valueOf(value))
					.getInstance());
		} else
			throw new UnsupportedOperationException();
	}

}
