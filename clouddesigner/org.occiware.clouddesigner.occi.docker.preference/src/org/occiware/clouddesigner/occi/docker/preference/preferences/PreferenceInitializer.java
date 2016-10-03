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

package org.occiware.clouddesigner.occi.docker.preference.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.occiware.clouddesigner.occi.docker.preference.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_STRING_USERNAME,"occiwareuser");
		store.setDefault(PreferenceConstants.P_STRING_PASSWORD,"iloveocciware");
		store.setDefault(PreferenceConstants.P_STRING_EMAIL,"occiwareuser@yopmail.com");
		store.setDefault(PreferenceConstants.P_STRING_VERSION,"1.23");
		store.setDefault(PreferenceConstants.P_STRING_URL,"https://index.docker.io/v1/");
		
	}

}
