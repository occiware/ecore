/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/

package org.occiware.clouddesigner.occi.cloud.design.wizard;

import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard{

	public NewConfigurationWizard() {
		super("http://occiware.org/occi/cloud/ecore#", "viewpoint:/org.occiware.clouddesigner.occi.cloud.design/Cloud", "cloud", "Cloud configuration");
	}

}
