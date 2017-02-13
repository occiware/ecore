/*******************************************************************************
 * Copyright (c) 2017 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.examples.wizard;

import org.eclipse.osgi.util.NLS;

/**
 * Examples-related messages.
 *
 * @author William Piers
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.occiware.clouddesigner.occi.examples.wizard.messages"; //$NON-NLS-1$
	public static String ExamplesWizard_description;
	public static String ExamplesWizard_error_already_exists_message;
	public static String ExamplesWizard_error_already_exists_title;
	public static String ExamplesWizard_installing;
	public static String ExamplesWizard_name;
	public static String ExamplesWizard_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
