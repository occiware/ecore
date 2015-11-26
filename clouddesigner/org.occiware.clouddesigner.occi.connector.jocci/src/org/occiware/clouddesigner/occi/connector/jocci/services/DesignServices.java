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
package org.occiware.clouddesigner.occi.connector.jocci.services;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.connector.jocci.dialogs.OcciServerDialog;

public class DesignServices {

	/**
	 * Import into a configuration.
	 * @param configuration
	 */
	public void importConfiguration(Configuration configuration) {
		Shell shell = Display.getCurrent().getActiveShell();
		OcciServerDialog occiServerDialog = new OcciServerDialog(shell);
		occiServerDialog.create();
		if (occiServerDialog.open() == Window.OK) {
			String serverURL = occiServerDialog.getOcciServerUrl();
			try {
				Importer.importFromOcciServer(configuration, serverURL);
			} catch(Throwable exc) {
				// TODO: Use Eclipse error report.
				exc.printStackTrace(System.err);
			}
		} 
	}
}
