package org.occiware.clouddesigner.occi2ecore;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

public class ConvertDocker extends OCCIExtension2Ecore {
	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(InfrastructurePackage.eNS_URI,
				InfrastructurePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		Extension ext = (Extension) ConverterUtils.getRootElement(resourceSet,
				"input/docker/Docker.xmi");
		EPackage res = new ConvertDocker().convertExtension(ext);
		res.setNsURI("http://schemas.ogf.org/occi/docker");
		ConverterUtils.save(resourceSet, res, "output/docker/Docker.ecore");
	}

	public Map<String, EClass> initParentKindMappings() {
		Map<String, EClass> kindMappings = new HashMap<String, EClass>();
		kindMappings.put("resource", OCCIPackage.eINSTANCE.getResource());
		kindMappings.put("link", OCCIPackage.eINSTANCE.getLink());
		kindMappings.put("entity", OCCIPackage.eINSTANCE.getEntity());
		for (EClassifier infraType : InfrastructurePackage.eINSTANCE
				.getEClassifiers()) {
			if (infraType instanceof EClass) {
				kindMappings.put(infraType.getName().toLowerCase(),
						(EClass) infraType);
			}
		}
		return kindMappings;
	}
}
