package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi2ecore.docker.ConvertDocker;
import org.occiware.clouddesigner.occi2ecore.docker.ConvertDockerConfig;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;

public class OCCI2Ecore implements IConverterPaths {

	private static final boolean PERSIST_METAMODELS = true;

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		EPackage infraEPackage = convertExtension(INFRA_EXT_PATH, INFRA_MM_PATH);
		resourceSet.getPackageRegistry().put(infraEPackage.getNsURI(),
				infraEPackage);
		EPackage dockerEPackage = convertExtension(DOCKER_EXT_PATH,
				DOCKER_MM_PATH);

		// Convert Docker configurations
		ConvertDockerConfig dockerConfigConverter = new ConvertDockerConfig(
				infraEPackage, dockerEPackage);
		dockerConfigConverter.convertConfiguration("file:/"
				+ DOCKER_SAMPLE1_OCCI_PATH, "file:/" + DOCKER_SAMPLE1_DSL_PATH);
		dockerConfigConverter.convertConfiguration("file:/"
				+ DOCKER_SAMPLE2_OCCI_PATH, "file:/" + DOCKER_SAMPLE2_DSL_PATH);
	}

	private static EPackage convertExtension(String extensionPath,
			String metamodelPath) throws IOException {
		Extension dockerExt = (Extension) ConverterUtils.getRootElement(
				resourceSet, "file:/" + extensionPath);
		EPackage dockerEPackage = new ConvertDocker()
				.convertExtension(dockerExt);
		if (PERSIST_METAMODELS) {
			persistMetamodel(dockerEPackage, metamodelPath);
		}
		return dockerEPackage;
	}

	private static void persistMetamodel(EPackage generated, String path)
			throws IOException {
		EPackage existing = (EPackage) ConverterUtils.getRootElement(
				resourceSet, "file:/" + path);
		for (Iterator<EObject> iterator = existing.eAllContents(); iterator
				.hasNext();) {
			EObject eo = (EObject) iterator.next();
			if (eo instanceof EAnnotation && isOCLRelated((EAnnotation) eo)) {
				EModelElement existingContainer = (EModelElement) eo
						.eContainer();
				EModelElement generatedContainer = (EModelElement) getGeneratedElement(
						generated, existingContainer);
				if (generatedContainer == null) {
					throw new RuntimeException("Unable to find "
							+ existingContainer + " to reattach " + eo + " "
							+ ((EAnnotation) eo).getEAnnotations());
				} else {
					generatedContainer.getEAnnotations().add(
							(EAnnotation) EcoreUtil.copy(eo));
				}
			}
		}
		ConverterUtils.save(resourceSet, generated, "file:/" + path);
		fixMetamodelRefs(new File(path));

		// TODO reload genmodel (kinda tricky in standalone)
		// TODO generate code (OCLinEcore adds compilation errors, with
		// generatednot it could be workaround-ed
		// TODO check consistency of generators, designers
	}

	private static EObject getGeneratedElement(EObject generatedRoot,
			EObject existing) {
		if (areEquivalent(generatedRoot, existing)) {
			return generatedRoot;
		}
		for (Iterator<EObject> iterator = generatedRoot.eAllContents(); iterator
				.hasNext();) {
			EObject generated = (EObject) iterator.next();
			if (areEquivalent(generated, existing)) {
				return generated;
			}
		}
		return null;
	}

	private static boolean areEquivalent(EObject generated, EObject existing) {
		if (generated.eClass().equals(existing.eClass())) {
			boolean allAttributeMatch = true;
			for (EAttribute ea : existing.eClass().getEAllAttributes()) {
				Object existingValue = String.valueOf(existing.eGet(ea));
				Object generatedValue = String.valueOf(generated.eGet(ea));
				allAttributeMatch = allAttributeMatch
						&& ((existingValue == null && generatedValue == null) || existingValue
								.equals(generatedValue));
			}
			if (allAttributeMatch) {
				return true;
			}
		}
		return false;
	}

	private static boolean isOCLRelated(EAnnotation annotation) {
		return annotation.getSource().equals(
				"http://www.eclipse.org/emf/2002/Ecore")
				|| annotation.getSource().equals(
						"http://www.eclipse.org/OCL/Import")
				|| annotation.getSource().equals(
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
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
