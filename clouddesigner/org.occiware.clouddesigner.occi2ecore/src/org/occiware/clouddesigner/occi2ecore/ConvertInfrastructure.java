package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

public class ConvertInfrastructure extends OCCIExtension2Ecore {
	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		Extension infraExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "input/extensions/Infrastructure.xmi");
		EPackage res = new ConvertInfrastructure().convertExtension(infraExt);
		res.setNsURI("http://schemas.ogf.org/occi/infrastructure");
		ConverterUtils.save(resourceSet, res, "output/Infrastructure.ecore");
		File current = new File(new File("").getAbsolutePath());
		fixMetamodelRefs(new File(current.getPath()
				+ "/output/Infrastructure.ecore"));
	}

	public Map<String, EClass> initParentKindMappings() {
		Map<String, EClass> kindMappings = new HashMap<String, EClass>();
		kindMappings.put("resource", OCCIPackage.eINSTANCE.getResource());
		kindMappings.put("link", OCCIPackage.eINSTANCE.getLink());
		kindMappings.put("entity", OCCIPackage.eINSTANCE.getEntity());
		return kindMappings;
	}
}
