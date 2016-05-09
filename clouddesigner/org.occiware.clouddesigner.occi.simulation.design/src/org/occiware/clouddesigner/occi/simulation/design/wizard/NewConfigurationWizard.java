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

package org.occiware.clouddesigner.occi.simulation.design.wizard;

import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new Simulation model file.
 */

public class NewConfigurationWizard extends NewDiagramWizard
{
	public NewConfigurationWizard()
	{
		super("http://occiware.org/simulation#", "viewpoint:/org.occiware.clouddesigner.occi.simulation.design/Simulation Configuration", "Simulation", "Simulation Configuration");
	}
}
