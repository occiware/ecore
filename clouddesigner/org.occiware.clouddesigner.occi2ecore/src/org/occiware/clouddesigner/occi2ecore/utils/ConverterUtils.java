package org.occiware.clouddesigner.occi2ecore.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.OCCI.Kind;

public final class ConverterUtils {

	public static String readFileAsString(File file) throws IOException {
		byte[] buffer = new byte[(int) file.length()];
		BufferedInputStream stream = new BufferedInputStream(
				new FileInputStream(file));
		stream.read(buffer);
		String res = new String(buffer);
		stream.close();
		return res;
	}

	public static void writeStringToFile(File file, String content)
			throws IOException {
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(file));
		stream.write(content.getBytes());
		stream.close();
	}

	public static EObject getRootElement(ResourceSet resourceSet, String path) {
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		EcoreUtil.resolveAll(resource);
		return resource.getContents().get(0);
	}

	public static void save(ResourceSet resourceSet, EObject rootElement,
			String path) throws IOException {
		Resource resource = resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(rootElement);
		resource.save(Collections.emptyMap());
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

	/**
	 * Ignore proxies issues. TODO fix proxy issues instead
	 */
	public static String getKindTerm(Kind kind) {
		if (kind.eIsProxy()) {
			return kind.toString().substring(
					kind.toString().indexOf("[term='") + 7,
					kind.toString().indexOf("'])"));
		} else {
			return kind.getTerm();
		}
	}
}
