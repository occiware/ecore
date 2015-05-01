package org.occiware.clouddesigner.occi.docker.design.services

import org.eclipse.emf.ecore.EObject
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.*
import org.occiware.clouddesigner.OCCI.Configuration

class DockerService {
	var public DockerAspect instanceAspect

	def void start(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			instanceAspect = new DockerAspect(machine)

			// Start only the machine
			instanceAspect.start

		} else if (eo instanceof Container) {
			var container = eo as Container
			instanceAspect = new DockerAspect(container)
			instanceAspect.container.containerStart
		}
	}

	def void importModel(Configuration conf) {
		instanceAspect = new DockerAspect(conf)
		instanceAspect.importModel
	}
	
	def void synchronize(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			instanceAspect = new DockerAspect(machine)
			instanceAspect.synchronize
		}
	}
	
	def void startAll(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			instanceAspect = new DockerAspect(machine)

			// Start the machine and all the containers inside it
			instanceAspect.startAll

		}
	}

	def void stop(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			instanceAspect = new DockerAspect(machine)

			// Stop the machine
			instanceAspect.machine_VirtualBox.machineStop
		} else if (eo instanceof Container) {
			var container = eo as Container
			instanceAspect = new DockerAspect(container)

			// Stop the container
			instanceAspect.container.containerStop
		}
	}
}
