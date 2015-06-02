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
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver.*
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.MemoryManager
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager

class DockerObserver {

	// Initialize logger for CommandFactory.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerObserver))
	var protected static Container cpContainer = null

	def listener(Machine machine) {

		// Make a reference copy
		val cpMachine = EcoreUtil.copy(machine) as Machine

		// ADD listener to Class
		machine.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {
					LOGGER.info("Ancienne Valeur : " + notification.oldValue)
					LOGGER.info("Nouvelle Valeur : " + notification.newValue)

					// Rollback changes 
					var machine = cpMachine
					println(
						"<-------------------------Attention on veut me modifier -------------------------->\n\n\n\n\n\n\n\n")
				}
			}
		)

		return machine
	}

	def listener(Container container, Machine machine) {

		// Make a reference copy
		cpContainer = EcoreUtil.copy(container) as ExecutableContainer
		val privateKey = DockerUtil.getEnv(machine.name) + "/" + "id_rsa"
		val host = DockerMachineManager.ipCmd(Runtime.getRuntime, machine.name)

		// ADD listener to Class
		container.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {
					LOGGER.info("The Container has Changed")
					var newContainer = notification.notifier as Container
					val containerId = getContainerId(newContainer.name, machine)
					LOGGER.info("Ancienne Valeur : " + notification.oldValue)
					LOGGER.info("Nouvelle Valeur : " + notification.newValue)

					// CPU Changes
					if (!cpContainer.cores.equals(newContainer.cores)) {
						val cpuManager = new CPUManager

						// Update CPU value
						cpContainer.cores = container.cores
						cpuManager.setCPUValue(host, privateKey, containerId, String.valueOf(newContainer.cores))
					}

					// CPU Frequency Changes
					if (!cpContainer.speed.equals(newContainer.speed)) {
						val cpuManager = new CPUManager

						// Update CPU value
						cpContainer.cores = container.cores
						cpuManager.setFreqValue(host, privateKey, containerId,
							String.valueOf(Math.round(newContainer.speed)))
					}

					// Memory changes
					if (!cpContainer.memory.equals(newContainer.memory)) {
						val memoryManager = new MemoryManager

						// Update Memory value
						cpContainer.memory = container.memory
						memoryManager.setMemValue(host, privateKey, containerId, String.valueOf(newContainer.memory))
					}
				}
			}
		)

		return container
	}

	def String getContainerId(String containerName, Machine machine) {
		val dockerContainerManager = new DockerContainerManager
		val listContainers = dockerContainerManager.listContainer(machine.name)
		for (com.github.dockerjava.api.model.Container c : listContainers) {
			var String contName = null
			val name = c.names.get(0)
			val linkName = "LinkTo"
			val index = name.indexOf(linkName)
			if (index == -1) {
				contName = name.replaceAll("/", "")
			} else {

				// index = index + linkName.length
				contName = name.substring(index + linkName.length)
			}
			if (contName.equalsIgnoreCase(containerName)) {
				return c.id
			}
		}
		return null
	}
}
