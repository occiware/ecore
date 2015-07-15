package org.occiware.clouddesigner.hypervisor;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi2ecore.OCCI2Ecore;

public class HypervisorToEcore extends OCCI2Ecore{
	private static final String WORKSPACE_PATH = new File(new File("").getAbsolutePath()).getParent();
	
	private static final String WORKSPACE_PATH_ROOT = new File(new File("").getAbsolutePath()).getParentFile().getParent();
	
	private static final  String LIBVIRT_EXT_PATH = WORKSPACE_PATH_ROOT + "/metamodel/hypervisor/Hypervisor.xmi";
	
	private static final  String LIBVIRT_MM_PATH = WORKSPACE_PATH + "/org.occiware.clouddesigner.occi.hypervisor/model/Hypervisor.ecore";
	
	

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
