/**
 */
package org.occiware.clouddesigner.occi.design.wizard;

import java.util.ArrayList;
import java.util.Collection;
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
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
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
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;
import org.occiware.clouddesigner.occi.design.utils.WizardUtils;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends Wizard implements INewWizard {
	private static final String CONFIG_VIEWPOINT_URI = "viewpoint:/org.occiware.clouddesigner.occi.design/OCCI Configuration"; //$NON-NLS-1$
	private static final String CONFI_FILEEXT = "occic"; //$NON-NLS-1$

	private static final String CONFIG_DIAGRAM_NAME = "Configuration diagram"; //$NON-NLS-1$

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

	private CheckboxTableViewer refExtensionViewer;
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
	 * Create a new model.
	 */
	protected EObject createInitialModel() {
		Configuration rootObject = occiFactory.createConfiguration();
		for (String scheme : WizardUtils.getRefExtensionSchemes(refExtensionViewer)) {
			String refExtensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
			final Resource refExtensionResource = resourceSet.getResource(URI.createURI(refExtensionURI, true), true);
			final Extension refExtension = (Extension) refExtensionResource.getContents().get(0);
			rootObject.getUse().add(refExtension);
		}
		return rootObject;
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
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
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
			System.err.println(exception);
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, exception.getMessage()));
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 */
	public class OCCIModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
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
				if (extension == null || !NewConfigurationWizard.CONFI_FILEEXT.equals(extension)) {
					setErrorMessage(
							Messages.NewConfigurationWizard_FileExtError + NewConfigurationWizard.CONFI_FILEEXT);
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
			Composite control = (Composite) getControl();

			Composite extensionGroup = new Composite(control, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			extensionGroup.setLayout(layout);
			extensionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			Label refOccieLabel = new Label(extensionGroup, SWT.NONE);
			refOccieLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true));
			refOccieLabel.setText(Messages.NewExtensionWizard_RefExtensionLabel);
			refOccieLabel.setFont(parent.getFont());

			Composite composite = new Composite(extensionGroup, SWT.NULL);
			GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
			composite.setLayoutData(layoutData);
			TableColumnLayout tableLayout = new TableColumnLayout();
			composite.setLayout(tableLayout);

			Table table = new Table(composite,
					SWT.CHECK | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
			refExtensionViewer = new CheckboxTableViewer(table);

			refExtensionViewer.setContentProvider(ArrayContentProvider.getInstance());

			Collection<String> registeredExtensions = new ArrayList<String>(
					OCCIRegistry.getInstance().getRegisteredExtensions());
			refExtensionViewer.setInput(registeredExtensions);
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
		newFileCreationPage.setFileName(Messages.NewConfigurationWizard_DefaultModelName + "." + CONFI_FILEEXT); // $NON-NLS-2$
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
					String modelFilename = defaultModelBaseFilename + "." + CONFI_FILEEXT; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + CONFI_FILEEXT; //$NON-NLS-1$
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
