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
package org.occiware.clouddesigner.occi.design.utils;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
//FIXME: don' build on Travis CI!
// import org.eclipse.xtext.ui.XtextProjectHelper;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;

public final class WizardUtils {

	public static final String MODELING_PERSPECTIVE_ID = "org.eclipse.sirius.ui.tools.perspective.modeling";

	public static String[] getRefExtensionSchemes(CheckboxTableViewer refExtensionViewer) {
		return Arrays.copyOf(refExtensionViewer.getCheckedElements(), refExtensionViewer.getCheckedElements().length,
				String[].class);
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
	public static RepresentationDescription getRepresentationDescription(EObject eObject, Session session,
			String representationDescriptionId) {
		final Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), eObject);
		for (final RepresentationDescription representationDescription : representationDescriptions) {
			if (representationDescriptionId.equals(representationDescription.getName())) {
				return representationDescription;
			}
		}
		return null;
	}

	/**
	 * The current perspective must be modeling.
	 */
	public static void openDiagram(final IProgressMonitor monitor, IProject project, final String diagramName,
			final String diagramInstanceName, final EObject rootObject) {
		// Init the representation
		final Option<ModelingProject> optionalModelingProject = ModelingProject.asModelingProject(project);
		if (optionalModelingProject.some()) {
			final Session session = optionalModelingProject.get().getSession();

			final RepresentationDescription representationDescription = WizardUtils
					.getRepresentationDescription(rootObject, session, diagramName);

			RecordingCommand createcommand = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					DRepresentation representation = DialectManager.INSTANCE.createRepresentation(diagramInstanceName, rootObject,
							representationDescription, session, monitor);
					DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
				}
			};
			try {
				session.getTransactionalEditingDomain().getCommandStack().execute(createcommand);
			} catch (Exception e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.NewExtensionWizard_RepresentationCreationError, e));
			}
		}
	}

	/**
	 * Enable OCCI Extension viewpoints.
	 *
	 * @param session
	 *            Session
	 */
	public static void enableViewpoint(final Session session, final String viewpointURI) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
							selection.selectViewpoint(
									ViewpointRegistry.getInstance().getViewpoint(URI.createURI(viewpointURI)), session,
									new NullProgressMonitor());
						}
					});
		}
	}

	public static EObject getRoot(Session session, URI resourceURI) {
		for (Resource resource : session.getSemanticResources()) {
			if (resource.getURI().equals(resourceURI)) {
				return resource.getContents().get(0);
			}
		}
		return null;
	}

	public static void addNature(final IProject project, String nature, final IProgressMonitor progressMonitor) throws CoreException
	{
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = nature;
		description.setNatureIds(newNatures);
		project.setDescription(description, progressMonitor);
	}

	public static void addXTextNature(final IProject project, final IProgressMonitor progressMonitor) throws CoreException
	{
		// add XText nature
// FIXME: don' build on Travis CI!
//		addNature(project, XtextProjectHelper.NATURE_ID, progressMonitor);
		addNature(project, "org.eclipse.xtext.ui.shared.xtextNature", progressMonitor);
	}
}
