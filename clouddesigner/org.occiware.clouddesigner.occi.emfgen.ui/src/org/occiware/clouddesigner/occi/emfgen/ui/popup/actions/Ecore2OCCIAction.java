package org.occiware.clouddesigner.occi.emfgen.ui.popup.actions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.emfgen.ConverterUtils;
import org.occiware.clouddesigner.occi.emfgen.Ecore2OCCI;

public class Ecore2OCCIAction implements IObjectActionDelegate {

	private ISelection selection;

	private ResourceSet resourceSet = new ResourceSetImpl();

	// private Shell shell =
	// PlatformUI.getWorkbench().getDisplay().getActiveShell();

	public Ecore2OCCIAction() {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		IFile configFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		try {
			EObject root = ConverterUtils.getRootElement(resourceSet, "file:/" + configFile.getLocation().toString());
			Configuration newConfig = new Ecore2OCCI().convertConfig((Configuration) root);
			Resource newResource = resourceSet
					.createResource(URI.createURI("file:/" + configFile.getLocation().addFileExtension("occic").toString()));
			newResource.getContents().add(newConfig);
			newResource.save(Collections.EMPTY_MAP);
			configFile.getParent().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
