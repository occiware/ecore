/*******************************************************************************
 * Copyright (c) 2009, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.occiware.clouddesigner.occi.design.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIFactory;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;

import com.google.common.collect.Maps;

/**
 * An operation to create and initialize a new session with empty semantic
 * extension model.
 *
 * @author Stephane Thibaudeau <a
 *         href="mailto:stephane.thibaudeau@obeo.fr">stephane
 *         .thibaudeau@obeo.fr</a>
 * @author Melanie Bats <a
 *         href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class InitExtensionModel extends WorkspaceModifyOperation {
	static final String FILE_EXT = ".xmi"; //$NON-NLS-1$

	/**
	 * The project.
	 */
	private final IProject project;

	/**
	 * The name of the Extension.
	 */
	private final String extensionName;

	/**
	 * Constructor.
	 *
	 * @param project
	 *            An {@link IProject} handle representing the project
	 * @param rootObjectName
	 *            The name of the semantic root element
	 * @param extensionName
	 */
	public InitExtensionModel(IProject project, String extensionName) {
		super(null);
		this.project = project;
		this.extensionName = extensionName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void execute(final IProgressMonitor monitor)
			throws CoreException, InterruptedException {
		final Option<ModelingProject> created = ModelingProject
				.asModelingProject(project);
		if (created.some()) {
			Display.getDefault().syncExec(new Runnable() {

				public void run() {
					// Create default empty Extension model
					InitExtensionModel.createSemanticResource(project,
							extensionName);

					// Enable OCCI viewpoints
					final ModelingProject modelingProject = created.get();
					OCCIViewpoints.enable(modelingProject.getSession());
				}
			});
		}
	}

	/**
	 * Create a new OCCI model in a project.
	 *
	 * @param project
	 *            Modeling project
	 * @param extensionName
	 *            Name of the OCCI file
	 */
	public static Option<IFile> createSemanticResource(final IProject project,
			final String extensionName) {
		final Extension rootObject = OCCIFactory.eINSTANCE.createExtension();
		rootObject.setName(extensionName);
		final Option<ModelingProject> modelingProject = ModelingProject
				.asModelingProject(project);
		final Session session = modelingProject.get().getSession();
		final String platformPath = getNewModelFilePath(project, extensionName);
		session.getTransactionalEditingDomain()
				.getCommandStack()
				.execute(
						new RecordingCommand(session
								.getTransactionalEditingDomain()) {
							@Override
							protected void doExecute() {

								final URI semanticModelURI = URI
										.createPlatformResourceURI(
												platformPath, true);
								final Resource res = new ResourceSetImpl()
										.createResource(semanticModelURI);
								/* Add the initial model object to the contents. */

								if (rootObject != null) {
									res.getContents().add(rootObject);
								}
								try {
									res.save(Maps.newHashMap());
								} catch (final IOException e) {
									Activator
											.getDefault()
											.getLog()
											.log(new Status(
													IStatus.ERROR,
													Activator.PLUGIN_ID,
													Messages.NewExtensionWizard_ModelCreationError,
													e));
								}

								session.addSemanticResource(semanticModelURI,
										new NullProgressMonitor());

								session.save(new NullProgressMonitor());
							}
						});
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(platformPath)));
	}

	/**
	 * Get the new model file path.
	 *
	 * @param project
	 *            Project
	 * @param extensionName
	 *            File name
	 * @return model file path
	 */
	private static String getNewModelFilePath(IProject project,
			String extensionName) {
		return '/' + project.getName() + "/model/" //$NON-NLS-1$
				+ extensionName.toLowerCase() + FILE_EXT;
	}
}
