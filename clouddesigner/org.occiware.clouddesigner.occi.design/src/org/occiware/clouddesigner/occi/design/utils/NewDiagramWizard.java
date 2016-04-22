/**
 */
package org.occiware.clouddesigner.occi.design.utils;

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
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
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
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OcciCoreConstants;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewDiagramWizard extends Wizard implements INewWizard {
	/**
	 * This is the file creation page.
	 */
	private WizardNewFileCreationPage newFileCreationPage;

	protected String viewpointURI;
	protected String fileExt;
	protected String diagramName;

	protected String extensionScheme;

	/**
	 * Remember the selection during initialization for populating the default
	 * container.
	 */
	private IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 */
	private IWorkbench workbench;

	private ResourceSet resourceSet;

	public NewDiagramWizard(String viewpointURI, String fileExt, String diagramName) {
		super();
		this.viewpointURI = viewpointURI;
		this.fileExt = fileExt;
		this.diagramName = diagramName;
	}

	public NewDiagramWizard(String extensionScheme, String viewpointURI, String fileExt, String diagramName) {
		this(viewpointURI, fileExt, diagramName);
		this.extensionScheme = extensionScheme;
	}

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
	 * Create a new model.
	 */
	protected void createInitialModel(Resource resource) {
		Configuration configuration = OCCIFactory.eINSTANCE.createConfiguration();
		
		final Extension coreExtension = (Extension)
				getResourceSet().getResource(
						URI.createURI(OcciCoreConstants.OCCI_CORE_SCHEME, true), true)
				.getContents().get(0);
		configuration.getUse().add(coreExtension);

		if(extensionScheme != null) {
			final Extension extension = (Extension)
					getResourceSet().getResource(
						URI.createURI(extensionScheme, true), true)
					.getContents().get(0);
			configuration.getUse().add(extension);
		}

		resource.getContents().add(configuration);
	}

	protected WizardNewFileCreationPage createNewFilePage() {
		return new NewFilePage(getSelection(), fileExt);
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
						createInitialModel(resource);

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
							ModelingProjectManager.INSTANCE.convertToModelingProject(project,
									new NullProgressMonitor());
						}
						final Session session = ModelingProject.asModelingProject(project).get().getSession();
						session.getTransactionalEditingDomain().getCommandStack()
								.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
							@Override
							protected void doExecute() {
								session.addSemanticResource(resource.getURI(), new NullProgressMonitor());
							}
						});

						WizardUtils.enableViewpoint(session, viewpointURI);

						String diagramInstanceName = modelFile.getName().substring(0,
								modelFile.getName().length() - (modelFile.getFileExtension().length() + 1));
						EObject root = WizardUtils.getRoot(session, resource.getURI());

						WizardUtils.openDiagram(progressMonitor, modelFile.getProject(), diagramName,
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

	public IStructuredSelection getSelection() {
		return selection;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * Get the file from the page.
	 */
	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(newFileCreationPage.getContainerFullPath().append(newFileCreationPage.getFileName()));
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 */
	@Override
	public void addPages() {
		newFileCreationPage = createNewFilePage();
		newFileCreationPage.setTitle(Messages.NewConfigurationWizard_PageTitle);
		newFileCreationPage.setDescription(Messages.NewConfigurationWizard_PageDescription);
		newFileCreationPage.setFileName(Messages.NewConfigurationWizard_DefaultModelName + "." + fileExt); // $NON-NLS-2$
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
					String modelFilename = defaultModelBaseFilename + "." + fileExt; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + fileExt; //$NON-NLS-1$
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
	}
}
