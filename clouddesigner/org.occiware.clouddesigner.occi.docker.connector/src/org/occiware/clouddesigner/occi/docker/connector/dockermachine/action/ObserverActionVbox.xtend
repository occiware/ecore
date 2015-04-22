package org.occiware.clouddesigner.occi.docker.connector.dockermachine.action

import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.action.api.ObserverAction
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager

class ObserverActionVbox implements ObserverAction {

	override apply(Machine machine) {
		var vbox = machine as Machine_VirtualBox

		// Stop the machine
		DockerMachineManager.stopCmd(Runtime.getRuntime, vbox.name)

		// Remove the machine
		DockerMachineManager.removeCmd(Runtime.getRuntime, vbox.name)

		// Create new machine
		DockerMachineManager.createHostCmd(Runtime.getRuntime, vbox)
	}

}
