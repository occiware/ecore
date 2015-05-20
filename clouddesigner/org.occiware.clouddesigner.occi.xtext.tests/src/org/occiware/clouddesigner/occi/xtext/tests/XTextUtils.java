package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;

public final class XTextUtils {

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		OCCIStandaloneSetup.doSetup();
	}
	
	public static void parse(URI uri) throws IOException {
		System.out.println("Loading " + uri + "...");
		Resource source = resourceSet.getResource(uri, true);
		// SUPER IMPORTANT for resolving cross-references.
		EcoreUtil.resolveAll(source);
		System.out.println(uri + " loaded");

		Resource target = resourceSet.createResource(URI
				.createURI("data/output/"
						+ uri.lastSegment().replace(".occi", ".xmi")));
		
		target.getContents().addAll(source.getContents());

		System.out.println("Saving " + target.getURI() + "...");
		target.save(Collections.EMPTY_MAP);
		System.out.println(target.getURI() + " saved");
	}

	public static void serialize(URI uri) throws IOException {
		System.out.println("Loading " + uri + "...");
		Resource source = resourceSet.getResource(uri, true);
		System.out.println(uri + " loaded");

		Resource target = resourceSet.createResource(URI
				.createURI("data/output/"
						+ uri.lastSegment().replace(".xmi", ".occi")));

		target.getContents().addAll(source.getContents());

		System.out.println("Saving " + target.getURI() + "...");
		target.save(Collections.EMPTY_MAP);
		System.out.println(target.getURI() + " saved");
	}
}
