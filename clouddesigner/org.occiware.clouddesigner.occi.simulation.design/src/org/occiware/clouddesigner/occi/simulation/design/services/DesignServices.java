package org.occiware.clouddesigner.occi.simulation.design.services;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

public class DesignServices {


	public Boolean isEDataType(EObject eObj) {
		return eObj.eClass() == EcorePackage.eINSTANCE.getEDataType();
	}


	public void importExtension(Extension extension) {
		extension = loadExtension("../org.occiware.clouddesigner.occi.simulation/model/Simulation.occie");
		
		Shell shell = Display.getCurrent().getActiveShell();
		Session session = SessionManager.INSTANCE.getSession(extension);
		String reg = OCCIRegistry.getInstance().getExtensionURI(extension.getScheme());
		System.out.println(reg);
		
		//LoadExtensionDialog dialog = new LoadExtensionDialog(shell, session.getTransactionalEditingDomain());
		//dialog.open();
		URI uri = URI.createURI(reg);
		session.addSemanticResource(uri, new NullProgressMonitor());
		Resource resource = session.getTransactionalEditingDomain().getResourceSet().getResource(uri, true);
		if (!resource.getContents().isEmpty() && (resource.getContents().get(0) instanceof Extension)
				&& !extension.getImport().contains(resource.getContents().get(0))) {
			extension.getImport().add((Extension) resource.getContents().get(0));
		}
	}
	
	/**
	 * Load an OCCI extension.
	 * @param extensionURI URI of the extension to load.
	 * @return the loaded extension.
	 */
	public static Extension loadExtension(String extensionURI)
	{
		 return (Extension)loadOCCI(extensionURI);
	}

	/**
	 * Load an OCCI object.
	 * @param uri URI of the OCCI object to load.
	 * @return the loaded OCCI object.
	 */
	private static Object loadOCCI(String uri)
	{
		 // Create a new resource set.
		 ResourceSet resourceSet = new OCCIResourceSet();
		 // Load the OCCI resource.
		 org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		 // Return the first element.
		 return resource.getContents().get(0);
	}

}
