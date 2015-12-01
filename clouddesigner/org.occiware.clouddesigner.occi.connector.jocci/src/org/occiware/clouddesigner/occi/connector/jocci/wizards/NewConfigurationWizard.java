/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.connector.jocci.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.connector.jocci.Activator;
import org.occiware.clouddesigner.occi.connector.jocci.Messages;
import org.occiware.clouddesigner.occi.connector.jocci.services.Importer;
import org.occiware.clouddesigner.occi.design.utils.WizardUtils;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends Wizard implements INewWizard {
	private static final String CONFIG_VIEWPOINT_URI = "viewpoint:/org.occiware.clouddesigner.occi.connector.jocci/OCCI Configuration - jOCCI connector"; //$NON-NLS-1$
	private static final String CONFIG_FILEEXT = "occic"; //$NON-NLS-1$

	private static final String CONFIG_DIAGRAM_NAME = "OCCI Configuration - jOCCI connector"; //$NON-NLS-1$

	/**
	 * This caches an instance of the model package.
	 */
	protected OCCIPackage occiPackage = OCCIPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 */
	protected OCCIFactory occiFactory = occiPackage.getOCCIFactory();

	/**
	 * This is the file creation page.
	 */
	protected OCCIModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container.
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 */
	protected IWorkbench workbench;

	private ResourceSet resourceSet;

	/**
	 * This just records the information.
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.NewConfigurationWizard_WindowTitle);
	}

	/**
	 * Do the work after everything is specified.
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(final IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						final Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						Configuration rootObject = occiFactory.createConfiguration();
						resource.getContents().add(rootObject);
						try {
							Importer.importFromOcciServer(rootObject, newFileCreationPage.getOcciServerUrl());
						} catch(Throwable throwable) {
							Shell shell = Display.getCurrent().getActiveShell();
							Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, null, throwable);
							ErrorDialog.openError(shell, null, throwable.getMessage(), status);
							return;
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						resource.save(options);

						// Select the new file resource in the current view.
						//
						IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
						IWorkbenchPage page = workbenchWindow.getActivePage();
						final IWorkbenchPart activePart = page.getActivePart();
						if (activePart instanceof ISetSelectionTarget) {
							final ISelection targetSelection = new StructuredSelection(modelFile);
							getShell().getDisplay().asyncExec(new Runnable() {
								@Override
								public void run() {
									((ISetSelectionTarget) activePart).selectReveal(targetSelection);
								}
							});
						}

						PlatformUI.getWorkbench().showPerspective(WizardUtils.MODELING_PERSPECTIVE_ID,
								PlatformUI.getWorkbench().getActiveWorkbenchWindow());

						IProject project = modelFile.getProject();
						if (!project.hasNature("org.eclipse.sirius.nature.modelingproject")) {
							ModelingProjectManager.INSTANCE.convertToModelingProject(project, progressMonitor);
						}
						final Session session = ModelingProject.asModelingProject(project).get().getSession();
						session.getTransactionalEditingDomain().getCommandStack()
								.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
							@Override
							protected void doExecute() {
								session.addSemanticResource(resource.getURI(), progressMonitor);
							}
						});

						WizardUtils.enableViewpoint(session, CONFIG_VIEWPOINT_URI);

						String diagramInstanceName = modelFile.getName().substring(0,
								modelFile.getName().length() - (modelFile.getFileExtension().length() + 1));
						EObject root = WizardUtils.getRoot(session, resource.getURI());

						WizardUtils.openDiagram(progressMonitor, modelFile.getProject(), CONFIG_DIAGRAM_NAME,
								diagramInstanceName, root);
					} catch (Exception exception) {
						Activator.getDefault().getLog()
								.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, exception.getMessage(), exception));
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);
			return true;
		} catch (

		Exception exception)

		{
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, exception.getMessage()));
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 */
	public class OCCIModelWizardNewFileCreationPage extends WizardNewFileCreationPage {

		private String occiServerUrl;

		/**
		 * Pass in the selection.
		 */
		public OCCIModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !NewConfigurationWizard.CONFIG_FILEEXT.equals(extension)) {
					setErrorMessage(
							Messages.NewConfigurationWizard_FileExtError + NewConfigurationWizard.CONFIG_FILEEXT);
					return false;
				}
				return true;
			}
			return false;
		}

		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}

		@Override
		public void createControl(Composite parent) {
			super.createControl(parent);
			Composite area = (Composite) getControl();
			Composite container = new Composite(area, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			Label lbtOcciServerUrl = new Label(container, SWT.NONE);
			lbtOcciServerUrl.setText(Messages.NewConfigurationWizard_OcciServerUrl);
			final Text txtOcciServerUrl = new Text(container, SWT.BORDER);
			txtOcciServerUrl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			txtOcciServerUrl.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					occiServerUrl = txtOcciServerUrl.getText();
				}
			});
		}

		public String getOcciServerUrl() {
			return occiServerUrl;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new OCCIModelWizardNewFileCreationPage("Whatever", selection); //$NON-NLS-1$
		newFileCreationPage.setTitle(Messages.NewConfigurationWizard_PageTitle);
		newFileCreationPage.setDescription(Messages.NewConfigurationWizard_PageDescription);
		newFileCreationPage.setFileName(Messages.NewConfigurationWizard_DefaultModelName + "." + CONFIG_FILEEXT); // $NON-NLS-2$
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = Messages.NewConfigurationWizard_DefaultModelName;
					String modelFilename = defaultModelBaseFilename + "." + CONFIG_FILEEXT; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + CONFIG_FILEEXT; //$NON-NLS-1$
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
	}

	/**
	 * Get the file from the page.
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
