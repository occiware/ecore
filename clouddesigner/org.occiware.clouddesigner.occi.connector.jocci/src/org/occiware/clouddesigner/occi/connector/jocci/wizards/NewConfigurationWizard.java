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
package org.occiware.clouddesigner.occi.connector.jocci.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.connector.jocci.Activator;
import org.occiware.clouddesigner.occi.connector.jocci.Messages;
import org.occiware.clouddesigner.occi.connector.jocci.services.Importer;
import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;
import org.occiware.clouddesigner.occi.design.utils.NewFilePage;

import com.google.common.base.Strings;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard {

	private static final String CONFIG_VIEWPOINT_URI = "viewpoint:/org.occiware.clouddesigner.occi.connector.jocci/OCCI Configuration - jOCCI connector"; //$NON-NLS-1$
	private static final String CONFIG_FILEEXT = "occic"; //$NON-NLS-1$
	private static final String CONFIG_DIAGRAM_NAME = "OCCI Configuration - jOCCI connector"; //$NON-NLS-1$

	private String occiServerUrl;

	public NewConfigurationWizard() {
		super(CONFIG_VIEWPOINT_URI, CONFIG_FILEEXT, CONFIG_DIAGRAM_NAME);
	}

	@Override
	protected void createInitialModel(Resource resource) {
		Configuration rootObject = OCCIFactory.eINSTANCE.createConfiguration();
		resource.getContents().add(rootObject);
		try {
			Importer.importFromOcciServer(rootObject, occiServerUrl);
			rootObject.setLocation(occiServerUrl);
		} catch (Throwable throwable) {
			Shell shell = Display.getCurrent().getActiveShell();
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, null, throwable);
			ErrorDialog.openError(shell, null, throwable.getMessage(), status);
			throwable.printStackTrace(System.err);
			return;
		}
	}

	@Override
	protected WizardNewFileCreationPage createNewFilePage() {
		return new NewFilePage(getSelection(), fileExt) {
			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				Composite area = (Composite) getControl();
				Composite container = new Composite(area, SWT.NONE);
				container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				GridLayout layout = new GridLayout(2, false);
				container.setLayout(layout);
				Label lbtOcciServerUrl = new Label(container, SWT.NONE);
				lbtOcciServerUrl.setText(Messages.NewConfigurationWizard_OcciServerUrl);
				final Text txtOcciServerUrl = new Text(container, SWT.BORDER);
				txtOcciServerUrl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				txtOcciServerUrl.addModifyListener(new ModifyListener() {
					public void modifyText(ModifyEvent e) {
						occiServerUrl = txtOcciServerUrl.getText();
						setPageComplete(validatePage());
					}
				});
			}

			@Override
			protected boolean validatePage() {
				// TODO add error messages
				return super.validatePage() && !Strings.isNullOrEmpty(occiServerUrl);
			}
		};
	}
}
