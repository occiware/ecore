/**
 */
package org.occiware.clouddesigner.occi.hypervisor.design.wizard;

import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard {

	public NewConfigurationWizard() {
		super("http://occiware.org/hypervisor#", "viewpoint:/org.occiware.clouddesigner.occi.hypervisor.design/Hypervisor", "hypervisor", "Hypervisor configuration");
	}

}
