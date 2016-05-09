/*******************************************************************************
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/

package org.occiware.clouddesigner.occi.monitoring.design.wizard;

import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new monitoring model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard
{
	public NewConfigurationWizard()
	{
		super("http://schemas.ogf.org/occi/monitoring#", "viewpoint:/org.occiware.clouddesigner.occi.monitoring.design/MonitoringConfiguration", "monitoring", "MonitoringConfiguration Diagram");
	}
}
