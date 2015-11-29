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
package org.occiware.clouddesigner.occi.connector.jocci.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.connector.jocci.Messages;

public class OcciActionDialog extends Dialog {

	private Action[] actions;
	private String selectedAction;

	public OcciActionDialog(Shell parentShell, Action[] actions) {
		super(parentShell);
		this.actions = actions;
	}

	@Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.OcciActionDialog_WindowTitle);
    }

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		Label lbtOcciServerUrl = new Label(container, SWT.NONE);
		lbtOcciServerUrl.setText(Messages.OcciActionDialog_Label);
		final List listOcciActions = new List (container, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		listOcciActions.addSelectionListener(
				  new SelectionAdapter() {
					  @Override
					  public void widgetSelected(SelectionEvent e) {
						  selectedAction = listOcciActions.getSelection()[0];
					  }					  
				  }
				);
		listOcciActions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		for(Action action : actions) {
			listOcciActions.add(action.getScheme() +  action.getTerm());
		}
		return area;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	public String getSelectedAction() {
		return selectedAction;
	}

}
