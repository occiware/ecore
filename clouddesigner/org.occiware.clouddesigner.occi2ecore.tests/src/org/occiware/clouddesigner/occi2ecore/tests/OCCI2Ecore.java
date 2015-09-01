package org.occiware.clouddesigner.occi2ecore.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi2ecore.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.tests.extensions.ConvertDocker;
import org.occiware.clouddesigner.occi2ecore.tests.extensions.ConvertDockerConfig;

public class OCCI2Ecore implements IConverterPaths {

	private static final boolean PERSIST_METAMODELS = true;

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		EPackage infraEPackage = convertExtension(INFRA_EXT_PATH, INFRA_MM_PATH);
		resourceSet.getPackageRegistry().put(infraEPackage.getNsURI(), infraEPackage);
		EPackage dockerEPackage = convertExtension(DOCKER_EXT_PATH, DOCKER_MM_PATH);

		// Convert Docker configurations
		ConvertDockerConfig dockerConfigConverter = new ConvertDockerConfig(infraEPackage, dockerEPackage);
		dockerConfigConverter.convertConfiguration("file:/" + DOCKER_SAMPLE1_OCCI_PATH,
				"file:/" + DOCKER_SAMPLE1_DSL_PATH);
		dockerConfigConverter.convertConfiguration("file:/" + DOCKER_SAMPLE2_OCCI_PATH,
				"file:/" + DOCKER_SAMPLE2_DSL_PATH);
	}

	protected static EPackage convertExtension(String extensionPath, String metamodelPath) throws IOException {
		Extension dockerExt = (Extension) ConverterUtils.getRootElement(resourceSet, "file:/" + extensionPath);
		EPackage dockerEPackage = new ConvertDocker().convertExtension(dockerExt);
		if (PERSIST_METAMODELS) {
			ConverterUtils.persistMetamodel(resourceSet, dockerEPackage, metamodelPath);
			fixMetamodelRefs(new File(metamodelPath));
		}
		return dockerEPackage;
	}

	public static void fixMetamodelRefs(File metamodelFile) throws IOException {
		String content = ConverterUtils.readFileAsString(metamodelFile);
		content = content.replaceAll("../../../metamodel/OCCI.ecore#",
				"../../org.occiware.clouddesigner.occi/model/OCCI.ecore#");
		content = content.replaceAll("output/Infrastructure.ecore#",
				"../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#");
		content = content.replaceAll("http://schemas.ogf.org/occi#",
				"../../org.occiware.clouddesigner.occi/model/OCCI.ecore#");
		content = content.replaceAll("http://schemas.ogf.org/occi/infrastructure#",
				"../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#");
		ConverterUtils.writeStringToFile(metamodelFile, content);
	}
}
