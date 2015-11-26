/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.connector.jocci;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.occiware.clouddesigner.occi.connector.jocci.messages"; //$NON-NLS-1$
	public static String NewConfigurationWizard_DefaultModelName;
	public static String NewConfigurationWizard_FileExtError;
	public static String NewConfigurationWizard_PageDescription;
	public static String NewConfigurationWizard_PageTitle;
	public static String NewConfigurationWizard_WindowTitle;
	public static String NewConfigurationWizard_OcciServerUrl;
	public static String NewConfigurationWizard_OcciServerUrlRequired;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
