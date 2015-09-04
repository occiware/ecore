package org.occiware.clouddesigner.occi.emfgen.tests.extensions;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.emfgen.tests.OCCI2Ecore;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

public class LibvirtToEcore extends OCCI2Ecore{
	private static final String WORKSPACE_PATH = new File(new File("").getAbsolutePath()).getParent();

	private static final  String LIBVIRT_EXT_PATH = WORKSPACE_PATH + "/org.occiware.clouddesigner.occi.infrastructure.connector/src/model/Hypervisor.xmi";
	
	private static final  String LIBVIRT_MM_PATH = WORKSPACE_PATH + "/org.occiware.clouddesigner.occi.infrastructure.connector/src/model/Hypervisor.ecore";
	
	

	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(InfrastructurePackage.eNS_URI, InfrastructurePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}
	
	public static void main(String[] args) throws IOException {
		EPackage epackage = convertExtension(LIBVIRT_EXT_PATH, LIBVIRT_MM_PATH);
	}
}
