/**
 */
package org.occiware.clouddesigner.occi.docker.design.wizard;

import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard {

	public NewConfigurationWizard() {
		super("viewpoint:/org.occiware.clouddesigner.occi.docker.design/Docker", "docker", "Docker configuration");
	}

}
