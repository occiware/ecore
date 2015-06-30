package org.occiware.clouddesigner.occi.design.wizard;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;

/**
 * The wizard to create a new Extension designer project.
 *
 * @author Stephane Thibaudeau <a
 *         href="mailto:stephane.thibaudeau@obeo.fr">stephane
 *         .thibaudeau@obeo.fr</a>
 * @author Melanie Bats <a
 *         href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class NewExtensionWizard extends BasicNewProjectResourceWizard {

	private static final String EXTENSION_DIAGRAM_NAME = "Extension diagram"; //$NON-NLS-1$

	/**
	 * project.
	 */
	protected IProject project;

	protected WizardNewProjectCreationPage newProjectPage;

	/**
	 * Name of the Extension.
	 */
	protected String extensionName;

	private Text extensionNameText;

	/**
	 * Scheme of the Extension.
	 */
	protected String extensionScheme;

	private Text extensionSchemeText;

	private void openRepresentation(IProject curProject,
			IProgressMonitor monitor) {
		final Option<ModelingProject> optionalModelingProject = ModelingProject
				.asModelingProject(curProject);
		if (optionalModelingProject.some()) {
			final Session session = optionalModelingProject.get().getSession();
			if (session != null) {
				if (!session.getSelectedViews().isEmpty()) {
					for (final DView view : session.getSelectedViews()) {
						if (!view.getOwnedRepresentations().isEmpty()) {
							for (final DRepresentation representation : view
									.getOwnedRepresentations()) {
								final RepresentationDescription description = DialectManager.INSTANCE
										.getDescription(representation);
								if (EXTENSION_DIAGRAM_NAME.equals(description
										.getName())) { //$NON-NLS-1$
									DialectUIManager.INSTANCE.openEditor(
											session, representation, monitor);
									return;
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Create a default model then select it in the explorer and switch to
	 * modeling perspective. The project, the rootObjectName and the
	 * newUmlModelFileName must be initialized before calling the performFinish
	 * method. {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		IProgressMonitor monitor = new NullProgressMonitor();
		try {
			project = ModelingProjectManager.INSTANCE.createNewModelingProject(
					newProjectPage.getProjectName(),
					newProjectPage.getLocationPath(), true, monitor);
		} catch (CoreException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							Messages.NewExtensionWizard_ProjectCreationError, e));
		}

		if (project == null || extensionName == null || extensionScheme == null) {
			throw new IllegalArgumentException();
		}

		final IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				// Do not call super as we don't want to use the super perform
				// method to create the project,
				// in our case the project was created using the modeling
				// project api, we need to extends the
				// BasicNewProjectResourceWizard to implement the perspective
				// switch easily.
				final InitExtensionModel init = new InitExtensionModel(project,
						extensionName, extensionScheme);
				try {
					getContainer().run(false, true, init);
				} catch (final InterruptedException e) {
					// Ignore.
				} catch (final InvocationTargetException e) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(
									IStatus.ERROR,
									Activator.PLUGIN_ID,
									Messages.NewExtensionWizard_ModelCreationError,
									e));
				}

				// Get the newly created file
				final IResource newModelFile = project.findMember(extensionName
						+ InitExtensionModel.FILE_EXT);

				// Switch to the modeling perspective
				updatePerspective();

				// Select it in the explorer
				selectAndReveal(newModelFile, PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow());

				// Init the representation
				final Option<ModelingProject> optionalModelingProject = ModelingProject
						.asModelingProject(project);
				if (optionalModelingProject.some()) {
					final Session session = optionalModelingProject.get()
							.getSession();

					final EObject rootObject = session.getSemanticResources()
							.iterator().next().getContents().get(0);
					final RepresentationDescription representationDescription = getRepresentationDescription(
							rootObject, session, EXTENSION_DIAGRAM_NAME);

					RecordingCommand createcommand = new RecordingCommand(
							session.getTransactionalEditingDomain()) {

						@Override
						protected void doExecute() {
							DialectManager.INSTANCE.createRepresentation(
									extensionName, rootObject,
									representationDescription, session,
									new NullProgressMonitor());
						}
					};
					try {
						session.getTransactionalEditingDomain()
								.getCommandStack().execute(createcommand);
					} catch (Exception e) {
						Activator
								.getDefault()
								.getLog()
								.log(new Status(
										IStatus.ERROR,
										Activator.PLUGIN_ID,
										Messages.NewExtensionWizard_RepresentationCreationError,
										e));
					}
					// Open the diagram
					openRepresentation(project, monitor);
				}
			}
		};
		try {
			// create modeling project
			getContainer().run(false, true, op);

			// convert to plugin project
			getContainer().run(
					false,
					true,
					new ConvertProjectToPluginOperation(
							new IProject[] { project }, false));

			// convert to OCCIE plugin
			getContainer().run(false, true, new WorkspaceModifyOperation() {

				@Override
				protected void execute(IProgressMonitor monitor)
						throws CoreException, InvocationTargetException,
						InterruptedException {
					configureOCCIEExtension(monitor);
				}

			});

		} catch (final InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.NewExtensionWizard_ModelCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								Messages.NewExtensionWizard_ModelCreationError,
								e));
			}
		} catch (final InterruptedException e) {
			return false;
		}
		return true;
	}

	private void configureOCCIEExtension(IProgressMonitor monitor)
			throws CoreException {
		IFile manifest = PDEProject.getManifest(project);
		String manifestContent = "Manifest-Version: 1.0\n"
				+ "Bundle-ManifestVersion: 2\n" + "Bundle-Name: "
				+ project.getName() + "\n" + "Bundle-SymbolicName: "
				+ project.getName() + ";singleton:=true\n"
				+ "Bundle-Version: 1.0.0.qualifier\n"
				+ "Require-Bundle: org.occiware.clouddesigner.occi\n";
		manifest.setContents(
				new ByteArrayInputStream(manifestContent.getBytes()), true,
				false, monitor);

		IFile pluginXML = PDEProject.getPluginXml(project);
		String pluginContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<?eclipse version=\"3.0\"?>\n"
				+ "<plugin>\n"
				+ "<extension point=\"org.occiware.clouddesigner.occi.occie\">\n"
				+ "<occie file=\"model/" + extensionName + ".occie\" scheme=\""
				+ extensionScheme + "\">\n" + "</occie>\n" + "</extension>\n"
				+ "</plugin>\n";
		pluginXML.create(new ByteArrayInputStream(pluginContent.getBytes()),
				true, monitor);

		IFile build = PDEProject.getBuildProperties(project);
		String buildContent = "bin.includes = META-INF/,\\n"
				+ "               plugin.xml";
		build.setContents(new ByteArrayInputStream(buildContent.getBytes()),
				true, false, monitor);
	}

	@Override
	public void addPages() {
		// we're not calling the super as we want to control the project
		// creation, we don't want the default
		// page.
		// super.addPages();

		newProjectPage = new WizardNewProjectCreationPage(
				Messages.NewExtensionWizard_PageName) {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				Composite control = (Composite) getControl();

				Composite extensionGroup = new Composite(control, SWT.NONE);
				GridLayout layout = new GridLayout();
				layout.numColumns = 2;
				extensionGroup.setLayout(layout);
				extensionGroup.setLayoutData(new GridData(
						GridData.FILL_HORIZONTAL));

				Label projectLabel = new Label(extensionGroup, SWT.NONE);
				projectLabel
						.setText(Messages.NewExtensionWizard_ExtensionNameLabel);
				projectLabel.setFont(parent.getFont());

				extensionNameText = new Text(extensionGroup, SWT.BORDER);
				GridData data = new GridData(GridData.FILL_HORIZONTAL);
				extensionNameText.setLayoutData(data);
				extensionNameText.setFont(parent.getFont());

				extensionNameText.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						extensionName = extensionNameText.getText();
					}
				});

				Label schemeLabel = new Label(extensionGroup, SWT.NONE);
				schemeLabel
						.setText(Messages.NewExtensionWizard_ExtensionSchemeLabel);
				schemeLabel.setFont(parent.getFont());

				extensionSchemeText = new Text(extensionGroup, SWT.BORDER);
				GridData data1 = new GridData(GridData.FILL_HORIZONTAL);
				extensionSchemeText.setLayoutData(data1);
				extensionSchemeText.setFont(parent.getFont());

				extensionSchemeText.addModifyListener(new ModifyListener() {

					@Override
					public void modifyText(ModifyEvent e) {
						extensionScheme = extensionSchemeText.getText();
					}
				});
			}
		};
		newProjectPage.setInitialProjectName(""); //$NON-NLS-1$
		newProjectPage.setTitle(Messages.NewExtensionWizard_PageTitle);
		newProjectPage
				.setDescription(Messages.NewExtensionWizard_PageDescription);
		addPage(newProjectPage);
	}

	/**
	 * Get a representation description.
	 *
	 * @param eObject
	 *            Semantic object
	 * @param session
	 *            Session
	 * @param representationDescriptionId
	 *            Representation description id
	 * @return Representation description
	 */
	private static RepresentationDescription getRepresentationDescription(
			EObject eObject, Session session, String representationDescriptionId) {
		final Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(
						session.getSelectedViewpoints(false), eObject);
		for (final RepresentationDescription representationDescription : representationDescriptions) {
			if (representationDescriptionId.equals(representationDescription
					.getName())) {
				return representationDescription;
			}
		}
		return null;
	}

}
