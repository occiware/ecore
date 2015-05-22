/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.occiware.clouddesigner.occi.design.wizard;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * OCCI Viewpoints.
 *
 * @author Melanie Bats <a
 *         href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class OCCIViewpoints {

	private static final String EXTENSION_VIEWPOINT_URI = "viewpoint:/org.occiware.clouddesigner.occi.design/OCCI Extension"; //$NON-NLS-1$
	private final ViewpointRegistry registry;

	/**
	 * Enable OCCI viewpoints.
	 *
	 * @param session
	 *            Session
	 */
	public static void enable(final Session session) {
		if (session != null) {
			session.getTransactionalEditingDomain()
					.getCommandStack()
					.execute(
							new RecordingCommand(session
									.getTransactionalEditingDomain()) {
								@Override
								protected void doExecute() {
									final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
									for (final Viewpoint previouslySelected : session
											.getSelectedViewpoints(false)) {
										selection.deselectViewpoint(
												previouslySelected, session,
												new NullProgressMonitor());
									}
									selection.selectViewpoint(OCCIViewpoints
											.fromViewpointRegistry()
											.extension(), session,
											new NullProgressMonitor());
								}
							});
		}
	}

	/**
	 * OCCI viewpoints from viewpoint registry.
	 *
	 * @return OCCI viewpoints from viewpoint registry
	 */
	public static OCCIViewpoints fromViewpointRegistry() {
		return new OCCIViewpoints(ViewpointRegistry.getInstance());
	}

	/**
	 * Constructor.
	 *
	 * @param registry
	 *            Viewpoint registry
	 */
	public OCCIViewpoints(ViewpointRegistry registry) {
		this.registry = registry;
	}

	/**
	 * Extension.
	 *
	 * @return viewpoint
	 */
	public Viewpoint extension() {
		return registry.getViewpoint(URI.createURI(EXTENSION_VIEWPOINT_URI));
	}

}
