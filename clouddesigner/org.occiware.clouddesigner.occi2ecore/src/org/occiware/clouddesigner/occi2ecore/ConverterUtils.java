package org.occiware.clouddesigner.occi2ecore;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Kind;

public final class ConverterUtils {

	public static String readFileAsString(File file) throws IOException {
		byte[] buffer = new byte[(int) file.length()];
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file));
		stream.read(buffer);
		String res = new String(buffer);
		stream.close();
		return res;
	}

	public static void writeStringToFile(File file, String content) throws IOException {
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
		stream.write(content.getBytes());
		stream.close();
	}

	public static EObject getRootElement(ResourceSet resourceSet, String path) {
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		EcoreUtil.resolveAll(resource);
		return resource.getContents().get(0);
	}

	public static void save(ResourceSet resourceSet, EObject rootElement, String path) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(rootElement);
		Map options = new HashMap();
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);
	}

	public static String formatName(String name) {
		String temp = name.replaceAll(" ", "_");
		if (temp.startsWith("occi.")) {
			String[] split = temp.split("\\.");
			temp = split[split.length - 1];
		}
		return temp;
	}

	public static String toU1Case(String temp) {
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
		return temp;
	}

	public static EClass getMappedEClass(Kind kind) {
		String eClassName = toU1Case(kind.getTerm());

		// we must use platform:/plugin URI to enable genmodels
		String uri = kind.eResource().getURI().toString().replaceAll(".occie", ".ecore");
		// special case for core
		uri = uri.replaceAll("model/Core.ecore", "model/OCCI.ecore");
		EPackage p = (EPackage) kind.eResource().getResourceSet().getResource(URI.createURI(uri), true).getContents()
				.get(0);

		return (EClass) p.getEClassifier(eClassName);
	}

	public static String convertScheme2URI(String scheme) {
		String uri = scheme.substring(0, scheme.length() - 1);
		return uri;
	}

	public static Collection<Attribute> getAllAttributes(Kind kind) {
		List<Attribute> res = new ArrayList<Attribute>();
		res.addAll(kind.getAttributes());
		if (kind.getParent() != null) {
			res.addAll(getAllAttributes(kind.getParent()));
		}
		return res;
	}

	public static void persistMetamodel(ResourceSet resourceSet, EPackage generated, String path) throws IOException {
		if (new File(path).exists()) {
			EPackage existing = (EPackage) ConverterUtils.getRootElement(resourceSet, "file:/" + path);
			for (Iterator<EObject> iterator = existing.eAllContents(); iterator.hasNext();) {
				EObject eo = iterator.next();
				if (eo instanceof EAnnotation && isOCLRelated((EAnnotation) eo)) {
					EModelElement existingContainer = (EModelElement) eo.eContainer();
					EModelElement generatedContainer = (EModelElement) getGeneratedElement(generated,
							existingContainer);
					if (generatedContainer == null) {
						throw new RuntimeException("Unable to find " + existingContainer + " to reattach " + eo + " "
								+ ((EAnnotation) eo).getEAnnotations());
					} else {
						generatedContainer.getEAnnotations().add((EAnnotation) EcoreUtil.copy(eo));
					}
				}
			}
		}
		ConverterUtils.save(resourceSet, generated, "file:/" + path);
	}

	private static EObject getGeneratedElement(EObject generatedRoot, EObject existing) {
		if (areEquivalent(generatedRoot, existing)) {
			return generatedRoot;
		}
		for (Iterator<EObject> iterator = generatedRoot.eAllContents(); iterator.hasNext();) {
			EObject generated = iterator.next();
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
						&& ((existingValue == null && generatedValue == null) || existingValue.equals(generatedValue));
			}
			if (allAttributeMatch) {
				return true;
			}
		}
		return false;
	}

	private static boolean isOCLRelated(EAnnotation annotation) {
		return annotation.getSource().equals("http://www.eclipse.org/emf/2002/Ecore")
				|| annotation.getSource().equals("http://www.eclipse.org/OCL/Import")
				|| annotation.getSource().equals("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
	}

}
