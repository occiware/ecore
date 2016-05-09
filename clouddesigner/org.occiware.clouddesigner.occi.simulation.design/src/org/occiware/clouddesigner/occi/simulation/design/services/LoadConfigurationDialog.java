package org.occiware.clouddesigner.occi.simulation.design.services;

import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.emf.edit.domain.EditingDomain;

public class LoadConfigurationDialog extends LoadResourceDialog{
	
	public LoadConfigurationDialog(Shell parent, EditingDomain domain) {
		super(parent, domain);
	}

}
