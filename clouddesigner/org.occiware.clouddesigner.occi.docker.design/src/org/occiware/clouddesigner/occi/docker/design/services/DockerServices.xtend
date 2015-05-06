package org.occiware.clouddesigner.occi.docker.design.services

import org.eclipse.emf.ecore.EObject
import org.occiware.clouddesigner.OCCI.Configuration
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel

class DockerServices {

	// Initialize the executable Docker factory.
	val init = ExecutableDockerFactory.init()

	/**
	 * Popup menu Start action.
	 */
	def void start(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			val main = new ExecutableDockerModel(machine)
			main.start

		} else if (eo instanceof Container) {
			var container = eo as Container
			val main = new ExecutableDockerModel(container)
			main.container.start
		}
	}

	/**
	 * Popup menu importModel cation.
	 */
	def void importModel(Configuration conf) {
		val main = new ExecutableDockerModel(conf)
		main.importModel
	}

	/**
	 * Popum menu synchronize action.
	 */
	def void synchronize(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			val main = new ExecutableDockerModel(machine)
			main.synchronize
		}
	}

	/**
	 * Popup menu StartAll action
	 */
	def void startAll(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			val main = new ExecutableDockerModel(machine)
			main.startAll

		}
	}

	/**
	 * Popup menu stop action.
	 */
	def void stop(EObject eo) {
		if (eo instanceof Machine) {
			var machine = eo as Machine
			val main = new ExecutableDockerModel(machine)
			main.stop
		} else if (eo instanceof Container) {
			var container = eo as Container
			val main = new ExecutableDockerModel(container)
			main.stop
		}
	}
}
