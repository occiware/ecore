package org.occiware.clouddesigner.occi2ecore;

import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.AttributeState;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.OCCIFactory;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;

public class ConvertDockerConfiguration {
	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(InfrastructurePackage.eNS_URI,
				InfrastructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(DockerPackage.eNS_URI,
				DockerPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		Configuration config = (Configuration) ConverterUtils.getRootElement(
				resourceSet, "input/docker/first-docker-configuration.xmi");
		Configuration res = new ConvertDockerConfiguration()
				.convertConfiguration(config);
		ConverterUtils.save(resourceSet, res,
				"output/docker/first-docker-configuration.xmi");
	}

	public Configuration convertConfiguration(Configuration dynamicConfiguration) {
		Configuration res = OCCIFactory.eINSTANCE.createConfiguration();
		for (Resource resource : dynamicConfiguration.getResources()) {
			EClass mappedEClass = getMappedEClass(resource.getKind());
			Resource converted = (Resource) EcoreUtil.create(mappedEClass);
			for (AttributeState attrState : resource.getAttributes()) {
				EAttribute attr = (EAttribute) mappedEClass
						.getEStructuralFeature(ConverterUtils
								.formatName(attrState.getName()));
				setValue(converted, attr, attrState.getValue());
			}
			res.getResources().add(converted);
		}
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
		}
	}

	private EClass getMappedEClass(Kind kind) {
		EClass res = null;
		String eClassName = ConverterUtils.toU1Case(ConverterUtils
				.getKindTerm(kind));
		for (Object object : resourceSet.getPackageRegistry().values()) {
			if (object instanceof EPackage) {
				EPackage ePackage = (EPackage) object;
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					if (eClassifier instanceof EClass
							&& eClassifier.getName().equals(eClassName)) {
						return (EClass) eClassifier;
					}
				}
			}
		}
		return res;
	}
}
