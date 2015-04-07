package org.occiware.clouddesigner.occi2ecore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.AttributeState;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.OCCIFactory;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;

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
			EClass mappedEClass = ConverterUtils.getMappedEClass(resource.getKind());
			Resource converted = (Resource) EcoreUtil.create(mappedEClass);
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
				EClass actualLinkType = ConverterUtils.getMappedEClass(link.getKind());
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
		String type = attr.getEType().getInstanceClassName();
		if ("java.lang.String".equals(type)) {
			element.eSet(attr, value);
		} else if ("java.lang.Float".equals(type) || "float".equals(type)) {
			element.eSet(attr, Float.valueOf(value));
		} else if ("int".equals(type)) {
			element.eSet(attr, Integer.valueOf(value));
		} else if ("boolean".equals(type)) {
			element.eSet(attr, Boolean.valueOf(value));
		}
	}

}
