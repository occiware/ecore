/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.gen.connector.ui.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.occiware.clouddesigner.occi.gen.connector.ui.wizards.messages"; //$NON-NLS-1$

	public static String NewConnectorWizard_PageDescription;
	public static String NewConnectorWizard_PageName;
	public static String NewConnectorWizard_PageTitle;
	public static String NewConnectorWizard_ProjectCreationError;
	public static String NewConnectorWizard_RefExtensionLabel;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
