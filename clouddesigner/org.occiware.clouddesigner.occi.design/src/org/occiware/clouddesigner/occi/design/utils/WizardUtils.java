package org.occiware.clouddesigner.occi.design.utils;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.occiware.clouddesigner.occi.design.Activator;
import org.occiware.clouddesigner.occi.design.Messages;

public final class WizardUtils {

	public static final String MODELING_PERSPECTIVE_ID = "org.eclipse.sirius.ui.tools.perspective.modeling";
	public static final String OCCI_CORE_EXTENSION_SCHEME = "http://schemas.ogf.org/occi/core#";

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
	public static void openDiagram(IProgressMonitor monitor, IProject project, String diagramName,
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
					DialectManager.INSTANCE.createRepresentation(diagramInstanceName, rootObject,
							representationDescription, session, new NullProgressMonitor());
				}
			};
			try {
				session.getTransactionalEditingDomain().getCommandStack().execute(createcommand);
			} catch (Exception e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						Messages.NewExtensionWizard_RepresentationCreationError, e));
			}
			// Open the diagram
			openRepresentation(project, monitor, diagramName);
		}
	}

	private static void openRepresentation(IProject curProject, IProgressMonitor monitor, String diagramName) {
		final Option<ModelingProject> optionalModelingProject = ModelingProject.asModelingProject(curProject);
		if (optionalModelingProject.some()) {
			final Session session = optionalModelingProject.get().getSession();
			if (session != null) {
				if (!session.getSelectedViews().isEmpty()) {
					for (final DView view : session.getSelectedViews()) {
						if (!view.getOwnedRepresentations().isEmpty()) {
							for (final DRepresentation representation : view.getOwnedRepresentations()) {
								final RepresentationDescription description = DialectManager.INSTANCE
										.getDescription(representation);
								if (diagramName.equals(description.getName())) {
									DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
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
}
