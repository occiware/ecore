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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager

import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.emf.ecore.util.EcoreUtil
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox

class DockerObserver {

	def static listener() {

		/*
		 * ADD listener
		 */
		// Initialize the model and Retrieve the default factory singleton
		val vbox = DockerFactory.eINSTANCE.createMachine_VirtualBox
		vbox.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {
					println("Ancienne Valeur : " + notification.oldValue)
					println("Nouvelle Valeur : " + notification.newValue)
					val m = notification.notifier as Machine_VirtualBox
					println("La memoire" + m.memory)
				}
			}
		)

		return vbox
	}

	def listener(Machine machine) {

		// Make a reference copy
		val cpMachine = EcoreUtil.copy(machine) as Machine

		// ADD listener to Class
		machine.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {

					// Rollback changes 
					var machine = cpMachine
				}
			}
		)

		return machine
	}
}
