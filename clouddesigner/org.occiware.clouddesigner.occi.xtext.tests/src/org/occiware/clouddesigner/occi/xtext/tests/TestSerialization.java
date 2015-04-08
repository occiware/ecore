package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;

public class TestSerialization {
	private static final String WORKSPACE_PATH = new File(
			new File("").getAbsolutePath()).getParent();

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		OCCIStandaloneSetup.doSetup();
	}

	public static void main(String[] args) throws IOException {

		// TODO auto tests / checking

		serialize(URI.createURI("data/input/default.xmi"));
		// serialize(URI.createFileURI(WORKSPACE_PATH
		// + "/org.occiware.clouddesigner.occi.samples"
		// + "/extensions/Core.xmi"));
		// serialize(URI.createFileURI(WORKSPACE_PATH
		// + "/org.occiware.clouddesigner.occi.samples"
		// + "/extensions/Infrastructure.xmi"));
		// serialize(URI.createFileURI(WORKSPACE_PATH
		// + "/org.occiware.clouddesigner.occi.samples"
		// + "/extensions/Docker.xmi"));
	}

	private static void serialize(URI uri) throws IOException {
		System.err.println("Serializing " + uri);
		Builder builder = SaveOptions.newBuilder();

		builder.noValidation();

		Map<Object, Object> options = builder.format().getOptions()
				.toOptionsMap();

		Resource source = resourceSet.getResource(uri, true);
		Resource target = resourceSet.createResource(URI
				.createURI("data/output/"
						+ uri.lastSegment().replace(".xmi", ".occi")));
		target.getContents().addAll(source.getContents());

		target.save(options);

	}
}
