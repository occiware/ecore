package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi2ecore.docker.ConvertDocker;
import org.occiware.clouddesigner.occi2ecore.docker.ConvertDockerConfig;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

public class OCCI2Ecore implements IConverterPaths {
	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		EPackage infraEPackage = convertInfrastructure(false);
		EPackage dockerEPackage = convertDocker(false);

		// Convert Docker configurations
		ConvertDockerConfig dockerConfigConverter = new ConvertDockerConfig(
				infraEPackage, dockerEPackage);

		dockerConfigConverter.convertConfiguration("file:/"
				+ DOCKER_SAMPLE1_OCCI_PATH, "file:/" + DOCKER_SAMPLE1_DSL_PATH);
		dockerConfigConverter.convertConfiguration("file:/"
				+ DOCKER_SAMPLE2_OCCI_PATH, "file:/" + DOCKER_SAMPLE2_DSL_PATH);
	}

	/*
	 * Convert Docker metamodel
	 */
	private static EPackage convertDocker(boolean persist) throws IOException {
		Extension dockerExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "file:/" + DOCKER_EXT_PATH);
		EPackage dockerEPackage = new ConvertDocker()
				.convertExtension(dockerExt);
		if (persist) {
			ConverterUtils.save(resourceSet, dockerEPackage, "file:/"
					+ DOCKER_MM_PATH);
		}
		fixMetamodelRefs(new File(DOCKER_MM_PATH));
		return dockerEPackage;
	}

	/*
	 * Convert Infrastructure metamodel
	 */
	private static EPackage convertInfrastructure(boolean persist)
			throws IOException {
		Extension infraExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "file:/" + INFRA_EXT_PATH);
		EPackage infraEPackage = new OCCIExtension2Ecore()
				.convertExtension(infraExt);
		if (persist) {
			ConverterUtils.save(resourceSet, infraEPackage, "file:/"
					+ INFRA_MM_PATH);
		}
		resourceSet.getPackageRegistry().put(infraEPackage.getNsURI(),
				infraEPackage);
		fixMetamodelRefs(new File(INFRA_MM_PATH));
		return infraEPackage;
	}

	public static void fixMetamodelRefs(File metamodelFile) throws IOException {
		String content = ConverterUtils.readFileAsString(metamodelFile);
		content = content.replaceAll("../../../metamodel/OCCI.ecore#",
				"../../org.occiware.clouddesigner.occi/model/OCCI.ecore#");
		content = content
				.replaceAll(
						"output/Infrastructure.ecore#",
						"../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#");
		content = content.replaceAll("http://schemas.ogf.org/occi#",
				"../../org.occiware.clouddesigner.occi/model/OCCI.ecore#");
		content = content
				.replaceAll(
						"http://schemas.ogf.org/occi/infrastructure#",
						"../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#");
		ConverterUtils.writeStringToFile(metamodelFile, content);
	}
}
