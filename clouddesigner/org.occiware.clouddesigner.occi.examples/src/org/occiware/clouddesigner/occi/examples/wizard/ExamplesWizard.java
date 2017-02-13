/*******************************************************************************
 * Copyright (c) 2017 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.examples.wizard;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.occiware.clouddesigner.occi.examples.Activator;
import org.occiware.clouddesigner.occi.examples.IExample;

/**
 * The wizard to create a new Example project.
 *
 * @author William Piers
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 */
public class ExamplesWizard extends Wizard implements INewWizard {

	public static final String MODELING_PERSPECTIVE_ID = "org.eclipse.sirius.ui.tools.perspective.modeling"; //$NON-NLS-1$

	/**
	 * The new project.
	 */
	protected IProject project;

	protected ExamplesWizardPage examplesPage;

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard#
	 *      performFinish()
	 */
	@Override
	public boolean performFinish() {
		final IExample example = examplesPage.getExample();
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					monitor.beginTask(Messages.ExamplesWizard_installing + example.getName(), 3);
					try {
						project = ResourcesPlugin.getWorkspace().getRoot().getProject(example.getProjectName());
						project.create(monitor);
						project.open(monitor);
						monitor.worked(1);

						copyFile(project, example.getSemantic());
						copyFile(project, example.getAird());
						project.refreshLocal(IResource.DEPTH_ONE, monitor);
						monitor.worked(1);

						ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
						PlatformUI.getWorkbench().showPerspective(MODELING_PERSPECTIVE_ID,
								PlatformUI.getWorkbench().getActiveWorkbenchWindow());
						final Session session = ModelingProject.asModelingProject(project).get().getSession();
						for (DRepresentation representation : DialectManager.INSTANCE.getAllRepresentations(session)) {
							DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
						}
						monitor.done();
					} catch (CoreException | IOException e) {
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

	private static void copyFile(IProject project, File examplefile) throws CoreException, IOException {
		IFile projectFile = project.getFile(examplefile.getName());
		FileInputStream is = new FileInputStream(examplefile);
		projectFile.create(is, true, null);
		is.close();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		examplesPage = new ExamplesWizardPage(Messages.ExamplesWizard_name);
		examplesPage.setTitle(Messages.ExamplesWizard_title);
		examplesPage.setDescription(Messages.ExamplesWizard_description);
		addPage(examplesPage);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench arg0, IStructuredSelection arg1) {
		setNeedsProgressMonitor(true);
	}

}
