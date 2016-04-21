/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.design.wizard;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OcciCoreConstants;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;
import org.occiware.clouddesigner.occi.design.utils.WizardUtils;

import com.google.common.base.Strings;

/**
 * The wizard to create a new Extension designer project.
 *
 * @author William Piers
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 * @author Philippe Merle
 *         <a href="mailto:philippe.merle@inria.fr">philippe.merle@inria.fr</a>
 */
public class NewExtensionWizard extends BasicNewProjectResourceWizard {

	private static final String EXTENSION_DIAGRAM_NAME = "Extension diagram"; //$NON-NLS-1$

	protected static final String EXTENSION_FILEEXT = "occie"; //$NON-NLS-1$

	private CheckboxTableViewer refExtensionViewer;

	private final class NewExtensionWizardPage extends WizardNewProjectCreationPage {

		private NewExtensionWizardPage(String pageName) {
			super(pageName);
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

			Label projectLabel = new Label(extensionGroup, SWT.NONE);
			projectLabel.setText(Messages.NewExtensionWizard_ExtensionNameLabel);
			projectLabel.setFont(parent.getFont());

			extensionNameText = new Text(extensionGroup, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			extensionNameText.setLayoutData(data);
			extensionNameText.setFont(parent.getFont());

			extensionNameText.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					extensionName = extensionNameText.getText();
					setPageComplete(validatePage());
				}
			});

			Label schemeLabel = new Label(extensionGroup, SWT.NONE);
			schemeLabel.setText(Messages.NewExtensionWizard_ExtensionSchemeLabel);
			schemeLabel.setFont(parent.getFont());

			extensionSchemeText = new Text(extensionGroup, SWT.BORDER);
			GridData data1 = new GridData(GridData.FILL_HORIZONTAL);
			extensionSchemeText.setLayoutData(data1);
			extensionSchemeText.setFont(parent.getFont());

			extensionSchemeText.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					extensionScheme = extensionSchemeText.getText();
					if (!extensionScheme.endsWith("#")) {
						extensionScheme += "#";
					}
					setPageComplete(validatePage());
				}
			});

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
			// added by default
			registeredExtensions.remove(OcciCoreConstants.OCCI_CORE_SCHEME);
			refExtensionViewer.setInput(registeredExtensions);
		}

		@Override
		protected boolean validatePage() {
			// TODO add error messages
			return super.validatePage() && !Strings.isNullOrEmpty(extensionNameText.getText().trim())
					&& !Strings.isNullOrEmpty(extensionSchemeText.getText().trim());
		}
	}

	/**
	 * project.
	 */
	protected IProject project;

	protected NewExtensionWizardPage newProjectPage;

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

	/**
	 * Create a default model then select it in the explorer and switch to
	 * modeling perspective. The project, the rootObjectName and the
	 * newUmlModelFileName must be initialized before calling the performFinish
	 * method. {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						project = ModelingProjectManager.INSTANCE.createNewModelingProject(
								newProjectPage.getProjectName(), newProjectPage.getLocationPath(), true, monitor);

						ModelingProject.asModelingProject(project).get().getSession().getSelectedViewpoints(false);
					} catch (CoreException e) {
						Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								Messages.NewExtensionWizard_ProjectCreationError, e));
					}

					if (project == null || extensionName == null || extensionScheme == null) {
						throw new IllegalArgumentException();
					}

					final IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
						@Override
						protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
							final InitExtensionModel init = new InitExtensionModel(project, extensionName,
									extensionScheme, WizardUtils.getRefExtensionSchemes(refExtensionViewer));
							try {
								getContainer().run(false, true, init);
							} catch (final InterruptedException e) {
								// Ignore.
							} catch (final InvocationTargetException e) {
								Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
										Messages.NewExtensionWizard_ModelCreationError, e));
							}

							// Register this new OCCI extension.
							OCCIRegistry.getInstance().registerExtension(extensionScheme, init.getSemanticModelURI().toString());

							// Get the newly created file
							final IResource newModelFile = project.findMember("/model/" //$NON-NLS-1$
									+ extensionName.toLowerCase() + "." + NewExtensionWizard.EXTENSION_FILEEXT);
							selectAndReveal(newModelFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow());

							// Switch to the modeling perspective
							// updatePerspective();
							PlatformUI.getWorkbench().showPerspective(WizardUtils.MODELING_PERSPECTIVE_ID,
									PlatformUI.getWorkbench().getActiveWorkbenchWindow());

							WizardUtils.openDiagram(monitor, project, EXTENSION_DIAGRAM_NAME, extensionName,
									WizardUtils.getRoot(ModelingProject.asModelingProject(project).get().getSession(),
											init.getSemanticModelURI()));

						}
					};
					try {
						// create modeling project
						getContainer().run(false, true, op);

						// convert to plugin project
						getContainer().run(false, true,
								new ConvertProjectToPluginOperation(new IProject[] { project }, false));

						// add XText nature for using OCCI XText Editor.
						WizardUtils.addXTextNature(project, monitor);

						project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

						// convert to OCCIE plugin
						getContainer().run(false, true, new WorkspaceModifyOperation() {

							@Override
							protected void execute(IProgressMonitor monitor)
									throws CoreException, InvocationTargetException, InterruptedException {
								configureOCCIEExtension(monitor);
							}

						});

						project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

					} catch (final InvocationTargetException e) {
						if (e.getTargetException() instanceof CoreException) {
							ErrorDialog.openError(getContainer().getShell(),
									Messages.NewExtensionWizard_ModelCreationError, null,
									((CoreException) e.getTargetException()).getStatus());
						} else {
							Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									Messages.NewExtensionWizard_ModelCreationError, e));
						}
					} catch (CoreException | InterruptedException e) {
						Activator.getDefault().getLog()
								.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
					}
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		return true;
	}

	private void configureOCCIEExtension(IProgressMonitor monitor) throws CoreException {
		IFile manifest = PDEProject.getManifest(project);
		String manifestContent =
				"Manifest-Version: 1.0\n" +
				"Bundle-ManifestVersion: 2\n" +
				"Bundle-Name: " + project.getName() + "\n" +
				"Bundle-SymbolicName: " + project.getName() + ";singleton:=true\n" +
				"Bundle-Version: 1.0.0.qualifier\n" +
				"Bundle-ClassPath: .\n" +
				"Bundle-Vendor: OCCIware\n" +
//				"Bundle-Localization: plugin\n" + // FIXME: require to generate plugin.properties
				"Bundle-RequiredExecutionEnvironment: JavaSE-1.7\n" +
				"Bundle-ActivationPolicy: lazy\n" +
				"Require-Bundle: org.eclipse.emf.ecore;visibility:=reexport,\n" +
				" org.occiware.clouddesigner.occi;visibility:=reexport,\n" +
				" org.occiware.clouddesigner.occi.emfgen.ui\n";
		manifest.setContents(new ByteArrayInputStream(manifestContent.getBytes()), true, false, monitor);

		IFile pluginXML = PDEProject.getPluginXml(project);
		String pluginContent =
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<?eclipse version=\"3.0\"?>\n" +
				"<!--\n" +
				" Copyright (c) 2015-2016 Obeo, Inria\n" +
				" All rights reserved. This program and the accompanying materials\n" +
				" are made available under the terms of the Eclipse Public License v1.0\n" +
				" which accompanies this distribution, and is available at\n" +
				" http://www.eclipse.org/legal/epl-v10.html\n" +
				"\n" +
				" Contributors:\n" +
				" - William Piers <william.piers@obeo.fr>\n" +
				" - Philippe Merle <philippe.merle@inria.fr>\n" +
				"-->\n" +
				"<plugin>\n" +
				"\n" +
				"   <!-- Register the " + extensionName + " extension. -->\n" +
				"   <extension point=\"org.occiware.clouddesigner.occi.occie\">\n" +
				"      <occie scheme=\"" + extensionScheme + "\" file=\"model/" + extensionName + ".occie\"/>\n" +
				"   </extension>\n" +
				"\n" +
				"   <!-- Define URI mapping. -->\n" +
				"   <extension point=\"org.eclipse.emf.ecore.uri_mapping\">\n" +
				"      <mapping source=\"" + extensionScheme.substring(0,extensionScheme.length()-1) + "\" target=\"platform:/plugin/" + project.getName() + "/model/" + extensionName + ".occie\"/>\n" +
				"   </extension>\n" +
				"\n" +
				"   <!-- Register the parser for ." + extensionName + " files. -->\n" +
				"   <extension point=\"org.eclipse.emf.ecore.extension_parser\">\n" +
				"      <parser type=\"" + extensionName + "\" class=\"org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl\"/>\n" +
				"   </extension>\n" +
				"\n" +
				"   <!-- Popup menu for converting to an OCCI Configuration file. -->\n" +
				"   <extension point=\"org.eclipse.ui.popupMenus\">\n" +
				"      <objectContribution\n" +
				"            id=\"" +  newProjectPage.getProjectName() + ".contribution\"\n" +
				"            nameFilter=\"*." + extensionName +"\"\n" +
				"            objectClass=\"org.eclipse.core.resources.IFile\">\n" +
				"         <menu\n" +
				"               id=\"org.occiware.clouddesigner.menu\"\n" +
				"               label=\"Cloud Designer\"\n" +
				"               path=\"additionsCloudDesigner\">\n" +
				"            <separator name=\"group\"/>\n" +
				"         </menu>\n" +
				"         <action\n" +
				"               class=\"org.occiware.clouddesigner.occi.emfgen.ui.popup.actions.Ecore2OCCIAction\"\n" +
				"               enablesFor=\"1\"\n" +
			 	"               id=\"" +  newProjectPage.getProjectName() + ".ecore2occi\"\n" +
			 	"               label=\"Convert to an OCCI Configuration File\"\n" +
			 	"               menubarPath=\"org.occiware.clouddesigner.menu/group\">\n" +
				"         </action>\n" +
				"      </objectContribution>\n" +
				"   </extension>\n" +
				"</plugin>\n";
		pluginXML.create(new ByteArrayInputStream(pluginContent.getBytes()), true, monitor);

		IFile build = PDEProject.getBuildProperties(project);
		String buildContent = 
				"# Copyright (c) 2015-2016 Obeo, Inria\n" +
				"# All rights reserved. This program and the accompanying materials\n" +
				"# are made available under the terms of the Eclipse Public License v1.0\n" +
				"# which accompanies this distribution, and is available at\n" +
				"# http://www.eclipse.org/legal/epl-v10.html\n" +
				"#\n" +
				"# Contributors:\n" +
				"# - William Piers <william.piers@obeo.fr>\n" +
				"# - Philippe Merle <philippe.merle@inria.fr>\n" +
				"\n" +
				"source.. = src-gen/\n" +
				"jars.compile.order = .\n" +
				"output.. = bin/\n" +
				"bin.includes = .,\\\n" +
				"				model/,\\\n" +
				"				META-INF/,\\\n" +
				"				plugin.xml\n";
		build.setContents(new ByteArrayInputStream(buildContent.getBytes()), true, false, monitor);
	}

	@Override
	public void addPages() {
		// we're not calling the super as we want to control the project
		// creation, we don't want the default
		// page.
		// super.addPages();

		newProjectPage = new NewExtensionWizardPage(Messages.NewExtensionWizard_PageName);
		newProjectPage.setInitialProjectName(""); //$NON-NLS-1$
		newProjectPage.setTitle(Messages.NewExtensionWizard_PageTitle);
		newProjectPage.setDescription(Messages.NewExtensionWizard_PageDescription);
		addPage(newProjectPage);
	}

}
