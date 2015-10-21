package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;

public final class XTextUtils {

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		OCCIStandaloneSetup.doSetup();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("occie", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("occic", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("txt",
				resourceSet.getResourceFactoryRegistry().getFactory(URI.createURI("temp.occi")));
	}

	public static void parse(URI input, URI output) throws IOException {
		Resource source = resourceSet.getResource(input, true);
		// SUPER IMPORTANT for resolving cross-references.
		EcoreUtil.resolveAll(source);
		Resource target = resourceSet.createResource(output);
		target.getContents().addAll(source.getContents());
		target.save(Collections.EMPTY_MAP);
	}

	public static void serialize(URI input, URI output) throws IOException {
		Resource source = resourceSet.getResource(input, true);
		Resource target = resourceSet.createResource(output);
		target.getContents().addAll(source.getContents());
		target.save(Collections.EMPTY_MAP);
	}

	public static String getFileAsString(File file) throws IOException {
		String result = "";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedReader dis = null;
		StringBuffer sb = new StringBuffer();

		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		dis = new BufferedReader(new InputStreamReader(bis));

		while (dis.ready()) {
			sb.append(dis.readLine() + "\n");
		}

		fis.close();
		bis.close();
		dis.close();

		result = sb.toString();
		return result;

	}
}
