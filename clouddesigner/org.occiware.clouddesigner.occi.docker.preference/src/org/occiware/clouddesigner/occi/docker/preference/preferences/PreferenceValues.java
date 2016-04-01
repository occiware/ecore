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

import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.occiware.clouddesigner.occi.docker.preference.Activator;
import org.occiware.clouddesigner.occi.docker.preference.PreferenceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreferenceValues extends AbstractHandler{

	// Initialize logger for PreferenceValues.
	private static Logger LOGGER = LoggerFactory.getLogger(PreferenceValues.class);
	
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String version;	

	private String url;

	public PreferenceValues() {

		try {
			String username = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_USERNAME);
			setUsername(username);

			String password = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_PASSWORD);
			setPassword(password);
			
			String email = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_EMAIL);
			setEmail(email);

			String version = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_VERSION);
			setVersion(version);

			String url = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_URL);
			setUrl(url);
			Activator.getDefault().getPreferenceStore()
	        .addPropertyChangeListener(new IPropertyChangeListener() {
	          @Override
	          public void propertyChange(PropertyChangeEvent event) {
	            if (event.getProperty() == PreferenceConstants.P_STRING_USERNAME) {
	            	setUsername(event.getNewValue().toString());
	            }
	            if (event.getProperty() == PreferenceConstants.P_STRING_PASSWORD) {
	            	setPassword(event.getNewValue().toString());
	              }
	            if (event.getProperty() == PreferenceConstants.P_STRING_EMAIL) {
	            	setEmail(event.getNewValue().toString());
	              }

	            if (event.getProperty() == PreferenceConstants.P_STRING_VERSION) {
	            	setEmail(event.getNewValue().toString());
	              }

	            if (event.getProperty() == PreferenceConstants.P_STRING_URL) {
	            	setEmail(event.getNewValue().toString());
	              }
	            
	          }
	        });		
			
		} catch (NullPointerException e) {
			// Load data from docker properties file.
			Properties p = (new PreferenceUtil()).loadConfig();
			setUsername(p.get("docker.username").toString());
			setPassword(p.get("docker.password").toString());
			setEmail(p.get("docker.email").toString());
			setVersion(p.get("docker.version").toString());
			setUrl(p.get("docker.url").toString());
		}
		
	}
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		String username = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_USERNAME);
		setUsername(username);
		
		MessageDialog.openInformation(shell, "Info", username);
		LOGGER.info(username + "\n\n\n\n\n");
		
		String password = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_PASSWORD);
		setPassword(password);
		LOGGER.info(password + "\n\n\n\n\n");
		
		String email = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_STRING_EMAIL);
		setEmail(email);
		LOGGER.info(email + "\n\n\n\n\n");
		
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
