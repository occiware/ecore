package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;

public class TestGrammar {
	private static final String WORKSPACE_PATH = new File(
			new File("").getAbsolutePath()).getParent();

	// TODO auto tests / checking
	public static void main(String[] args) throws IOException {
		XTextUtils.parse(URI.createURI("data/input/default.occi"));
		XTextUtils.serialize(URI.createURI("data/input/default.xmi"));
		
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

}
