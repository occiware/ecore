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

import org.eclipse.jface.preference.*;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.occiware.clouddesigner.occi.docker.preference.Activator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class DockerPreference extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private StringFieldEditor username;
	private StringFieldEditor password;
	private StringFieldEditor email;
	private StringFieldEditor version;
	private StringFieldEditor url;

	// Initialize logger for DockerPreference.
	private static Logger LOGGER = LoggerFactory.getLogger(PreferenceValues.class);

	public DockerPreference() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Docker modeler preference page");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		username = new StringFieldEditor(PreferenceConstants.P_STRING_USERNAME, "Docker &username:",
				getFieldEditorParent());
		addField(username);

		password = new StringFieldEditor(PreferenceConstants.P_STRING_PASSWORD, "Docker &password:",
				getFieldEditorParent());
		addField(password);

		email = new StringFieldEditor(PreferenceConstants.P_STRING_EMAIL, "Docker &email:", getFieldEditorParent());
		addField(email);

		version = new StringFieldEditor(PreferenceConstants.P_STRING_VERSION, "Docker &version:",
				getFieldEditorParent());
		addField(version);

		url = new StringFieldEditor(PreferenceConstants.P_STRING_URL, "Docker &url:", getFieldEditorParent());
		addField(url);
		
		LOGGER.info("All text fields where created");

		// add change listener to the preferences store so that we are notified
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getProperty() == PreferenceConstants.P_STRING_USERNAME) {
					LOGGER.info(event.getNewValue().toString());
					textValidation(event, PreferenceConstants.E_MSG_USERNAME);
				}
				if (event.getProperty() == PreferenceConstants.P_STRING_PASSWORD) {
					LOGGER.info(event.getNewValue().toString());
					textValidation(event, PreferenceConstants.E_MSG_PASSWORD);
				}
				if (event.getProperty() == PreferenceConstants.P_STRING_EMAIL) {
					LOGGER.info(event.getNewValue().toString());
					textValidation(event, PreferenceConstants.E_MSG_EMAIL);
				}
				if (event.getProperty() == PreferenceConstants.P_STRING_VERSION) {
					LOGGER.info(event.getNewValue().toString());
					textValidation(event, PreferenceConstants.E_MSG_VERSION);
				}
				if (event.getProperty() == PreferenceConstants.P_STRING_URL) {
					LOGGER.info(event.getNewValue().toString());
					textValidation(event, PreferenceConstants.E_MSG_URL);
				}

			}

			private void textValidation(PropertyChangeEvent event, String errorMessage) {
				if (event.getNewValue() != null && !event.getNewValue().equals("")) {
					setErrorMessage(null);
					setValid(true);
				} else {
					setErrorMessage(errorMessage);
					setValid(false);
				}
			}
		});
	}

	protected void checkState() {
		super.checkState();
		// Validate docker username
		if (username.getStringValue() != null && !username.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage(PreferenceConstants.E_MSG_USERNAME);
			setValid(false);
		}

		// Validate docker password
		if (password.getStringValue() != null && !password.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage(PreferenceConstants.E_MSG_PASSWORD);
			setValid(false);
		}

		// Validate docker email
		if (email.getStringValue() != null && !email.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage(PreferenceConstants.E_MSG_EMAIL);
			setValid(false);
		}

		// Validate docker version
		if (version.getStringValue() != null && !version.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage(PreferenceConstants.E_MSG_VERSION);
			setValid(false);
		}

		// Validate docker url
		if (url.getStringValue() != null && !url.getStringValue().equals("")) {
			setErrorMessage(null);
			setValid(true);
		} else {
			setErrorMessage(PreferenceConstants.E_MSG_URL);
			setValid(false);
		}
		
	}

	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		if (event.getProperty().equals(FieldEditor.VALUE)) {
			checkState();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}