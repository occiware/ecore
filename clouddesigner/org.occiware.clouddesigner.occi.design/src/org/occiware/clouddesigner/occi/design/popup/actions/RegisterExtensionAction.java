package org.occiware.clouddesigner.occi.design.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.design.Messages;

public class RegisterExtensionAction implements IObjectActionDelegate {
	private ISelection selection;
	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public RegisterExtensionAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selection != null) {
			IFile selectedFile = (IFile) ((IStructuredSelection) selection)
					.getFirstElement();

			URI uri = URI.createFileURI(selectedFile.getLocation().toFile()
					.getPath());

			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.getResource(uri, true);

			Extension extension = (Extension) r.getContents().get(0);
			OCCIRegistry.getInstance().registerExtension(extension.getScheme(),
					uri.toString());
			MessageDialog.openInformation(shell,
					Messages.RegisterExtensionAction_ExtRegistration,
					Messages.RegisterExtensionAction_RegisteredExtension
							+ extension.getScheme());
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
