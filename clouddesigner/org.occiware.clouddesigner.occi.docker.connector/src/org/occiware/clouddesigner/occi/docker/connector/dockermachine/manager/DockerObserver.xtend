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
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.MemoryManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DockerObserver {

	// Initialize logger for DockerObserver.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerObserver))
	var protected static Container cpContainer = null
	var protected static Machine cpMachine = null

	def listener(Machine machine) {

		// Make a reference copy
		val cpMachine = EcoreUtil.copy(machine) as Machine

		// ADD listener to Class
		machine.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {
						// ID of the element deleted
						var Container deletedElement = null
					if (notification.notifier instanceof Machine) {
						var Machine newMachine = notification.notifier as Machine
						// Name Changes
						if (!cpMachine.name.equals(newMachine.name) && newMachine.state.toString.equalsIgnoreCase('active')) {
							machine.name = notification.oldValue.toString
							// Throw an exception
							throw new UnsupportedOperationException
						}
					}
					if (notification.eventType == Notification.SET && notification.getOldValue() instanceof Container) {
						deletedElement = notification.getOldValue() as Container
						// Notify the deleted element in the model 
						LOGGER.info("Model element ID: {}", deletedElement.containerid)
						// Remove the container from the machine
						var DockerContainerManager dockerManager = new DockerContainerManager(machine)
						if(containerNameExists(dockerManager, deletedElement.name, machine)){
							dockerManager.removeContainer(machine, deletedElement.containerid)
						}
						// Remove the container from the model
					}					
					LOGGER.info("Old value : " + notification.oldValue)
					LOGGER.info("New value : " + notification.newValue)
				}
			}
		)

		return machine
	}

	def listener(Container container, Machine machine) {
		
		LOGGER.info("Enable listener on {}", container.containerid)
		// Make a reference copy
		cpContainer = EcoreUtil.copy(container) as ExecutableContainer
		val privateKey = DockerUtil.getEnv(machine.name) + "/" + "id_rsa"
		val host = DockerMachineManager.ipCmd(Runtime.getRuntime, machine.name)
		val cpuManager = new CPUManager

		// Add listener to the machine
		listener(machine)

		// Add listener to the container
		container.eAdapters.add(
			new EContentAdapter() {
				public override notifyChanged(Notification notification) {
					LOGGER.info("The Container has Changed")
					// ID of the element deleted
					var Container deletedElement = null
					LOGGER.info("The machine model has Changed")
					var Container newContainer = null
					if (notification.eventType == Notification.REMOVE &&
						notification.getNotifier() instanceof Container) {
						deletedElement = notification.getOldValue() as Container
						// Notify the deleted element in the model 
						LOGGER.info("Model element ID: {}", deletedElement.containerid)
						// Remove the container from the machine
						var DockerContainerManager dockerManager = new DockerContainerManager(machine)
						dockerManager.removeContainer(machine, deletedElement.containerid)
					}
					if (notification.notifier instanceof Container) {
						newContainer = notification.notifier as ExecutableContainer

						// Elasticity method
//						var Elasticity elasticity = new Elasticity(newContainer as ExecutableContainer)
//						elasticity.action(cpuManager, host, privateKey, newContainer)
						
						LOGGER.info("Old container ID : {}", cpContainer.containerid)
						LOGGER.info("New container ID : {}", newContainer.containerid)
						// When the container name's Changes
						if (cpContainer.containerid.equals(newContainer.containerid) &&
							cpContainer.state.toString.equalsIgnoreCase('active')) {

							// The container name changed
							if (!cpContainer.name.equals(newContainer.name)) {
								var DockerContainerManager dockerManager = new DockerContainerManager(machine)
								if(!containerNameExists(dockerManager, newContainer.name, machine)){
									dockerManager.renameContainer(machine, newContainer.containerid, newContainer.name)
								}
							}
							
							// CPU Changes
							if (!cpContainer.cores.equals(newContainer.cores)) {
								// Update CPU value
								cpContainer.cores = container.cores
								cpuManager.setCPUValue(host, privateKey, newContainer,
									String.valueOf(newContainer.cores))
							}

							// CPU Frequency Changes
							if (!cpContainer.speed.equals(newContainer.speed)) {
								// Update CPU value
								cpContainer.cores = container.cores
								cpuManager.setFreqValue(host, privateKey, newContainer,
									String.valueOf(Math.round(newContainer.speed)))
							}

							// Memory changes
							if (!cpContainer.memory.equals(newContainer.memory)) {
								val memoryManager = new MemoryManager
								// Update Memory value
								cpContainer.memory = container.memory
								memoryManager.setMemValue(host, privateKey, newContainer,
									String.valueOf(newContainer.memory))
							}
						}
						
						LOGGER.info("Old value : " + notification.oldValue)
						LOGGER.info("New value : " + notification.newValue)
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
	
		def boolean containerNameExists(DockerContainerManager dockerContainerManager, String containerName, Machine machine) {
			containerNameExists(dockerContainerManager, containerName, machine.name)
		}

		def boolean containerNameExists(DockerContainerManager dockerContainerManager, String containerName, String machineName) {
		val listContainers = dockerContainerManager.listContainer(machineName)
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
				return true
			}
		}
		return false
	}
}
