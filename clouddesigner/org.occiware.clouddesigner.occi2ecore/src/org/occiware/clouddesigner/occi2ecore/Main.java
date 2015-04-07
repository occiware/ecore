package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

public class Main {
	private static final String WORKSPACE_PATH = new File(
			new File("").getAbsolutePath()).getParentFile().getParent();

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		EPackage infraEPackage = convertInfrastructure();
		EPackage dockerEPackage = convertDocker();

		// Convert Docker configurations
		ConvertDockerConfig dockerConfigConverter = new ConvertDockerConfig(
				infraEPackage, dockerEPackage);

		dockerConfigConverter.convertConfiguration("file:/" + WORKSPACE_PATH
				+ "/metamodel/docker/first-docker-configuration.xmi",
				"output/first-docker-configuration.xmi");
		dockerConfigConverter.convertConfiguration("file:/" + WORKSPACE_PATH
				+ "/metamodel/docker/demo/demo.xmi", "output/demo.xmi");
	}

	/*
	 * Convert Docker metamodel
	 */
	private static EPackage convertDocker() throws IOException {
		Extension dockerExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "file:/" + WORKSPACE_PATH
						+ "/metamodel/docker/Docker.xmi");
		EPackage dockerEPackage = new ConvertDocker()
				.convertExtension(dockerExt);
		ConverterUtils.save(resourceSet, dockerEPackage, "output/Docker.ecore");
		fixMetamodelRefs(new File(
				WORKSPACE_PATH
						+ "/clouddesigner/org.occiware.clouddesigner.occi2ecore/output/Docker.ecore"));
		return dockerEPackage;
	}

	/*
	 * Convert Infrastructure metamodel
	 */
	private static EPackage convertInfrastructure() throws IOException {
		Extension infraExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "file:/" + WORKSPACE_PATH
						+ "/metamodel/extensions/Infrastructure.xmi");
		EPackage infraEPackage = new OCCIExtension2Ecore()
				.convertExtension(infraExt);
		ConverterUtils.save(resourceSet, infraEPackage,
				"output/Infrastructure.ecore");
		resourceSet.getPackageRegistry().put(infraEPackage.getNsURI(),
				infraEPackage);
		fixMetamodelRefs(new File(
				WORKSPACE_PATH
						+ "/clouddesigner/org.occiware.clouddesigner.occi2ecore/output/Infrastructure.ecore"));
		return infraEPackage;
	}

	public static void fixMetamodelRefs(File metamodelFile) throws IOException {
		String content = ConverterUtils.readFileAsString(metamodelFile);
		content = content.replaceAll("file:/.+OCCI.ecore#",
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
