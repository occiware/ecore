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
		// addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH,
		// "&Directory preference:", getFieldEditorParent()));
		// addField(
		// new BooleanFieldEditor(
		// PreferenceConstants.P_BOOLEAN,
		// "&An example of a boolean preference",
		// getFieldEditorParent()));
		//
		// addField(new RadioGroupFieldEditor(
		// PreferenceConstants.P_CHOICE,
		// "An example of a multiple-choice preference",
		// 1,
		// new String[][] { { "&Choice 1", "choice1" }, {
		// "C&hoice 2", "choice2" }
		// }, getFieldEditorParent()));

		username = new StringFieldEditor(PreferenceConstants.P_STRING_USERNAME, "Docker &username:",
				getFieldEditorParent());
		addField(username);
		password = new StringFieldEditor(PreferenceConstants.P_STRING_PASSWORD, "Docker &password:",
				getFieldEditorParent());
		addField(password);
		email = new StringFieldEditor(PreferenceConstants.P_STRING_EMAIL, "Docker &email:", getFieldEditorParent());
		addField(email);
		
		// add change listener to the preferences store so that we are notified
//		Activator.getDefault().getPreferenceStore()
//        .addPropertyChangeListener(new IPropertyChangeListener() {
//          @Override
//          public void propertyChange(PropertyChangeEvent event) {
//            if (event.getProperty() == PreferenceConstants.P_STRING_USERNAME) {
//            	LOGGER.info(event.getNewValue().toString() + "\n\n\n\n\n");
//            }
//            if (event.getProperty() == PreferenceConstants.P_STRING_PASSWORD) {
//            	LOGGER.info(event.getNewValue().toString() + "\n\n\n\n\n");
//              }
//            if (event.getProperty() == PreferenceConstants.P_STRING_EMAIL) {
//            	LOGGER.info(event.getNewValue().toString() + "\n\n\n\n\n");
//              }
//
//          }
//        });		
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