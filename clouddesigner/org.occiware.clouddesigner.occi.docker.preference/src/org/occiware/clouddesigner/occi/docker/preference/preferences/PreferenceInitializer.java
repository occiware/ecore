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
		store.setDefault(PreferenceConstants.P_BOOLEAN, true);
		store.setDefault(PreferenceConstants.P_CHOICE, "choice2");
		store.setDefault(PreferenceConstants.P_STRING_USERNAME,"occiwareuser");
		store.setDefault(PreferenceConstants.P_STRING_PASSWORD,"iloveocciware");
		store.setDefault(PreferenceConstants.P_STRING_EMAIL,"occiwareuser@yopmail.com");
		
	}

}
