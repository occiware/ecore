/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	- Philippe MERLE
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.occiware.clouddesigner.OCCI.Configuration
import org.occiware.clouddesigner.OCCI.Link
import org.occiware.clouddesigner.OCCI.Resource
import org.occiware.clouddesigner.occi.docker.Contains
import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.Graph
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager
import org.occiware.clouddesigner.occi.docker.impl.ContainerImpl
import org.occiware.clouddesigner.occi.docker.impl.DockerFactoryImpl
import org.occiware.clouddesigner.occi.docker.impl.MachineImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl
import org.occiware.clouddesigner.occi.infrastructure.Compute
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod
import org.occiware.clouddesigner.occi.infrastructure.StopMethod
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod

import static com.google.common.base.Preconditions.checkNotNull
import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver
import org.occiware.clouddesigner.occi.docker.Container

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
class ExecutableDockerFactory extends DockerFactoryImpl {

	// Initialize logger for Graph.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableDockerFactory))

	/**
	 * Initialize the ExecutableDockerFactory singleton.
	 */
	def static init() {

		// Replace the default generated factory of the Docker package by an executable docker factory.
		val factory = new ExecutableDockerFactory
		DockerPackage.eINSTANCE.setEFactoryInstance(factory)
		return factory
	}

	/**
	 * Create an executable Container instance.
	 */
	override def createContainer() {
		LOGGER.info(this.class.name + ":createContainer()")
		return new ExecutableContainer
	}

	/**
	 * Create an executable Machine instance.
	 */
	override def createMachine() {
		LOGGER.info(this.class.name + ":createMachine()")
		return new ExecutableMachine
	}

	/**
	 * Create an executable Machine_Amazon_EC2 instance.
	 */
	override def createMachine_Amazon_EC2() {
		LOGGER.info(this.class.name + ":createMachine_Amazon_EC2()")
		new ExecutableMachine_Amazon_EC2
	}

	/**
	 * Create an executable Machine_Digital_Ocean instance.
	 */
	override def createMachine_Digital_Ocean() {
		LOGGER.info(this.class.name + ":createMachine_Digital_Ocean()")
		new ExecutableMachine_Digital_Ocean
	}

	/**
	 * Create an executable Machine_Google_Compute_Engine instance.
	 */
	override def createMachine_Google_Compute_Engine() {
		LOGGER.info(this.class.name + ":createMachine_Google_Compute_Engine()")
		new ExecutableMachine_Google_Compute_Engine
	}

	/**
	 * Create an executable Machine_IBM_SoftLayer instance.
	 */
	override def createMachine_IBM_SoftLayer() {
		LOGGER.info(this.class.name + ":createMachine_IBM_SoftLayer()")
		new ExecutableMachine_IBM_SoftLayer
	}

	/**
	 * Create an executable Machine_Microsoft_Azure instance.
	 */
	override def createMachine_Microsoft_Azure() {
		LOGGER.info(this.class.name + ":createMachine_Microsoft_Azure()")
		new ExecutableMachine_Microsoft_Azure
	}

	/**
	 * Create an executable Machine_Microsoft_Hyper_V instance.
	 */
	override def createMachine_Microsoft_Hyper_V() {
		LOGGER.info(this.class.name + ":createMachine_Microsoft_Hyper_V()")
		new ExecutableMachine_Microsoft_Hyper_V
	}

	/**
	 * Create an executable Machine_OpenStack instance.
	 */
	override def createMachine_OpenStack() {
		LOGGER.info(this.class.name + ":createMachine_OpenStack()")
		new ExecutableMachine_OpenStack
	}

	/**
	 * Create an executable Machine_Rackspace instance.
	 */
	override def createMachine_Rackspace() {
		LOGGER.info(this.class.name + ":createMachine_Rackspace()")
		new ExecutableMachine_Rackspace
	}

	/**
	 * Create an executable Machine_VirtualBox instance.
	 */
	override def createMachine_VirtualBox() {
		LOGGER.info(this.class.name + ":createMachine_VirtualBox()")
		new ExecutableMachine_VirtualBox
	}

	/**
	 * Create an executable Machine_VMware_Fusion instance.
	 */
	override def createMachine_VMware_Fusion() {
		LOGGER.info(this.class.name + ":createMachine_VMware_Fusion()")
		new ExecutableMachine_VMware_Fusion
	}

	/**
	 * Create an executable Machine_VMware_vCloud_Air instance.
	 */
	override def createMachine_VMware_vCloud_Air() {
		LOGGER.info("ExecutableDockerFactory:createMachine_VMware_vCloud_Air()")
		new ExecutableMachine_VMware_vCloud_Air
	}

	/**
	 * Create an executable Machine_VMware_vSphere instance.
	 */
	override def createMachine_VMware_vSphere() {
		LOGGER.info(this.class.name + ":createMachine_VMware_vSphere()")
		new ExecutableMachine_VMware_vSphere
	}
}

/**
 * This class implements the state machine of any Compute resource.
 */
class ComputeStateMachine<T extends Compute> {

	// Initialize logger for ComputeStateMachine.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ComputeStateMachine))

	/**
	 * Reference to the Compute resource.
	 */
	protected T compute

	/**
	 * Construct a compute state machine for a given Compute resource.
	 */
	new(T c) {
		compute = c
	}

	/**
	 * Start OCCI Action.
	 */
	def start() {
		LOGGER.info(this.class.name + ":start() - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			LOGGER.info(this.class.name + ":start() - move from inactive to active state")
			start_from_inactive_state()
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.ACTIVE) {
			LOGGER.info(this.class.name + ":start() - already active state")
			start_from_active_state()
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			LOGGER.info(this.class.name + ":start() - move from suspended to active state")
			start_from_suspended_state()
			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":start() - final state is " + compute.state)
		if(compute.state != ComputeStatus.ACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * StartAll Modeler Action.
	 */
	def startAll() {
		LOGGER.info(this.class.name + ":start() - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			LOGGER.info(this.class.name + ":start() - move from inactive to active state")
			startAll_from_inactive_state()
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.ACTIVE) {
			LOGGER.info(this.class.name + ":start() - already active state")
			start_from_active_state()
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			LOGGER.info(this.class.name + ":start() - move from suspended to active state")
			start_from_suspended_state()
			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":start() - final state is " + compute.state)
		if(compute.state != ComputeStatus.ACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the start action.
	 * 
	 * By default, this method calls the start_execute method.
	 */
	def start_from_inactive_state() {
		start_execute
	}

	def startAll_from_inactive_state() {
		startAll_execute
	}

	/**
	 * This method implements the transition from active state for the start action.
	 * 
	 * By default, this method does nothing.
	 */
	def start_from_active_state() {
		LOGGER.info(this.class.name + ":start_from_active_state() - DO NOTHING")
		startAll_execute
	}

	/**
	 * This method implements the transition from suspended state for the start action.
	 * 
	 * By default, this method calls the start_execute method.
	 */
	def start_from_suspended_state() {
		start_execute
	}

	/**
	 * This method is the default implementation of the start action.
	 */
	def void start_execute() {
		LOGGER.info(this.class.name + ":start_execute() - DO NOTHING")
	}

	def void startAll_execute() {
		LOGGER.info(this.class.name + ":startAll_execute() - DO NOTHING")
	}

	/**
	 * Stop OCCI Action.
	 */
	def stop(StopMethod method) {
		LOGGER.info(this.class.name + ":stop(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			LOGGER.info(this.class.name + ":stop() - already inactive state")
			stop_from_inactive_state(method)
		} else if (compute.state == ComputeStatus.ACTIVE) {
			LOGGER.info(this.class.name + ":stop() - move from active to inactive state")
			stop_from_active_state(method)
			compute.state = ComputeStatus.INACTIVE
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			LOGGER.info(this.class.name + ":stop() - move from suspended to inactive state")
			stop_from_suspended_state(method)
			compute.state = ComputeStatus.INACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":stop() - final state is " + compute.state)
		if(compute.state != ComputeStatus.INACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the stop action.
	 * 
	 * By default, this method does nothing.
	 */
	def stop_from_inactive_state(StopMethod method) {
		LOGGER.info(this.class.name + ":stop_from_inactive_state() - DO NOTHING")
	}

	/**
	 * This method implements the transition from active state for the stop action.
	 * 
	 * By default, this method calls the stop_execute method.
	 */
	def stop_from_active_state(StopMethod method) {
		stop_execute(method)
	}

	/**
	 * This method implements the transition from suspended state for the stop action.
	 * 
	 * By default, this method calls the stop_execute method.
	 */
	def stop_from_suspended_state(StopMethod method) {
		stop_execute(method)
	}

	/**
	 * This method is the default implementation of the stop action.
	 */
	def void stop_execute(StopMethod method) {
		LOGGER.info(this.class.name + ":stop_execute(" + method + ") - DO NOTHING")
	}

	/**
	 * Restart OCCI Action.
	 */
	def restart(RestartMethod method) {
		LOGGER.info(this.class.name + ":restart(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			LOGGER.info(this.class.name + ":restart(" + method + ')' + " - move from inactive to active state")
			restart_from_inactive_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.ACTIVE) {
			LOGGER.info(this.class.name + ":restart(" + method + ')' + " - move from active to active state")
			restart_from_active_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			LOGGER.info(this.class.name + ":stop() - move from suspended to active state")
			restart_from_suspended_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":restart(" + method + ')' + " - final state is " + compute.state)
		if(compute.state != ComputeStatus.ACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the restart action.
	 * 
	 * By default, this method calls the restart_execute method.
	 */
	def restart_from_inactive_state(RestartMethod method) {
		restart_execute(method)
	}

	/**
	 * This method implements the transition from active state for the restart action.
	 * 
	 * By default, this method calls the restart_execute method.
	 */
	def restart_from_active_state(RestartMethod method) {
		restart_execute(method)
	}

	/**
	 * This method implements the transition from suspended state for the restart action.
	 * 
	 * By default, this method calls the restart_execute method.
	 */
	def restart_from_suspended_state(RestartMethod method) {
		restart_execute(method)
	}

	/**
	 * This method is the default implementation of the restart action.
	 */
	def void restart_execute(RestartMethod method) {
		LOGGER.info(this.class.name + ":restart_execute(" + method + ") - DO NOTHING")
	}

	/**
	 * Suspend OCCI Action.
	 */
	def suspend(SuspendMethod method) {
		LOGGER.info(this.class.name + ":suspend(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			LOGGER.info(this.class.name + ":suspend() - move from inactive to suspended state")
			suspend_from_inactive_state(method)
			compute.state = ComputeStatus.SUSPENDED
		} else if (compute.state == ComputeStatus.ACTIVE) {
			LOGGER.info(this.class.name + ":suspend() - move from active to suspended state")
			suspend_from_active_state(method)
			compute.state = ComputeStatus.SUSPENDED
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			LOGGER.info(this.class.name + ":suspend() - already suspended state")
			suspend_from_suspended_state(method)
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":suspend() - final state is " + compute.state)
		if(compute.state != ComputeStatus.SUSPENDED) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the suspend action.
	 * 
	 * By default, this method calls the suspend_execute method.
	 */
	def suspend_from_inactive_state(SuspendMethod method) {
		suspend_execute(method)
	}

	/**
	 * This method implements the transition from active state for the suspend action.
	 * 
	 * By default, this method calls the suspend_execute method.
	 */
	def suspend_from_active_state(SuspendMethod method) {
		suspend_execute(method)
	}

	/**
	 * This method implements the transition from suspended state for the suspend action.
	 * 
	 * By default, this method does nothing.
	 */
	def suspend_from_suspended_state(SuspendMethod method) {
		LOGGER.info(this.class.name + ":suspend_from_suspended_state() - DO NOTHING")
	}

	/**
	 * This method is the default implementation of the suspend action.
	 */
	def void suspend_execute(SuspendMethod method) {
		LOGGER.info(this.class.name + ":suspend_execute(" + method + ") - DO NOTHING")
	}
}

/**
 * This class implements an executable Docker container.
 */
class ExecutableContainer extends ContainerImpl {

	// Initialize logger for ExecutableContainer.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableContainer))
	var Map<DockerClient, CreateContainerResponse> map = null

	/**
	 * Docker containers have a state machine.
	 */
	val stateMachine = new ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container>(this) {

		/**
		 * Start the Docker container.
		 */
		override def start_execute() {
			LOGGER.info("EXECUTE container start")
			val machine = getCurrentMachine
			if (machine.state.toString.equalsIgnoreCase("active")) {
				val dockerContainerManager = new DockerContainerManager
				dockerContainerManager.startContainer(machine, this.compute.name)
			}
		}

		/**
		 * Stop the Docker container.
		 */
		override def stop_execute(StopMethod method) {
			LOGGER.info("EXECUTE container stop")
			val machine = getCurrentMachine
			if (machine.state.toString.equalsIgnoreCase("active")) {
				val dockerContainerManager = new DockerContainerManager
				if (this.compute.state.toString.equalsIgnoreCase("active")) {
					try {
						dockerContainerManager.stopContainer(machine, this.compute.name)
					} catch (Exception e) {
						this.compute.state = ComputeStatus.INACTIVE
					}
				}
			}
		}

		/**
		 * Restart the Docker container.
		 */
		override def restart_execute(RestartMethod method) {
			LOGGER.info("EXECUTE container restart")
			stop_execute(StopMethod.GRACEFUL)
			start_execute()
		}

		/**
		 * Suspend the Docker container.
		 */
		override def suspend_execute(SuspendMethod method) {
			LOGGER.info("EXECUTE container suspend")
		}
	}

	// Delegation to the container state machine.
	override def start() { stateMachine.start }

	override def stop(StopMethod method) { stateMachine.stop(method) }

	override def restart(RestartMethod method) { stateMachine.restart(method) }

	override def suspend(SuspendMethod method) { stateMachine.suspend(method) }

	def Map<DockerClient, CreateContainerResponse> createContainer(Machine machine,
		Multimap<String, String> containerDependency) {
		var DockerContainerManager dockercontainerManager = new DockerContainerManager

		// Set dockerClient
		var Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>

		// Download image
		dockercontainerManager.pullImage(machine, this.image)
		result = dockercontainerManager.createContainer(machine, this, containerDependency)
		this.map = new HashMap<DockerClient, CreateContainerResponse>(result)
		return result
	}

	def void createContainer(Machine machine) {
		var DockerContainerManager dockercontainerManager = new DockerContainerManager

		// Download image
		dockercontainerManager.pullImage(machine, this.image)
		dockercontainerManager.createContainer(machine, this)
	}

	def org.occiware.clouddesigner.occi.docker.Container linkContainerToContainer(
		org.occiware.clouddesigner.occi.docker.Container container) {

		// Retrieve the default factory singleton
		var links = DockerPackage.eINSTANCE.getDockerFactory.createLink

		// Add Container to the Contains
		links.target = container

		// Link Container to another
		this.links.add(links)
		return container
	}

	def Machine linkContainerToMachine(Machine machine) {

		// Retrieve the default factory singleton
		var contains = DockerPackage.eINSTANCE.getDockerFactory.createContains

		// Add Container to the Contains
		contains.target = this
		machine.links.add(contains)
		return machine
	}

	def Machine getCurrentMachine() {
		for (EObject eo : this.eContainer.eContents) {
			if (eo instanceof Machine) {
				val machine = eo as Machine
				for (Link l : machine.links) {
					if ((l.target as ExecutableContainer).id == this.id) {
						return machine
					}
				}
			}
		}
		return null
	}
}

/**
 * This class implements an executable Docker machine.
 */
class ExecutableMachine extends MachineImpl {
	val stateMachine = new ComputeStateMachine<Machine>(this)

	// Delegation to the container state machine.
	override def start() { stateMachine.start }

	override def stop(StopMethod method) { stateMachine.stop(method) }

	override def restart(RestartMethod method) { stateMachine.restart(method) }

	override def suspend(SuspendMethod method) { stateMachine.suspend(method) }
}

/**
 * This class implements an abstract Docker machine manager.
 */
abstract class MachineManager extends ComputeStateMachine<Machine> {

	// Initialize logger for MachineManager.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(MachineManager))
	protected Multimap<String, String> containerDependency = ArrayListMultimap.create
	protected Machine machine

	/**
	 * Construct a Docker machine manager for a given Docker machine.
	 */
	new(Machine m) {
		super(m)
		this.machine = m
	}

	/**
	 * Return the Docker machine driver name.
	 */
	def abstract String getDriverName()

	/**
	 * Append specific Docker machine driver parameters.
	 */
	def abstract void appendDriverParameters(StringBuilder sb)

	/**
	 * Start a Docker machine.
	 */
	override def start_execute() {

		// Initialize the runtime
		val runtime = Runtime.getRuntime

		// Execute the docker-machine start command.
		val StringBuilder command = new StringBuilder

		// Check requirements parameters
		checkNotNull(compute.name, "Machine name is null")
		checkNotNull(driverName, "Driver name is null")

		// Create the machine command
		command.append("docker-machine create --driver ").append(getDriverName).append(' ').append(compute.name)
		appendDriverParameters(command)

		// Get the active machine
		val activeHosts = DockerUtil.getActiveHosts

		// Get the existing machines
		val hosts = DockerUtil.getHosts
		if (!hosts.containsKey(compute.name)) { // Check if machine exists in the real environment

			// Create VitualBox machine and start it
			ProcessManager.runCommand(command.toString, runtime, true)
		} else {
			if (!activeHosts.containsKey(compute.name)) {

				// Start the machine
				DockerMachineManager.startCmd(runtime, compute.name)
			}
		}
	}

	override def startAll_execute() {

		// Initialize the runtime
		val runtime = Runtime.getRuntime

		// Execute the docker-machine start command.
		val StringBuilder command = new StringBuilder

		// Check requirements parameters are not null
		checkNotNull(compute.name, "Machine name is null")
		checkNotNull(driverName, "Driver name is null")

		// Create the machine command
		command.append("docker-machine create --driver ").append(getDriverName).append(' ').append(compute.name)
		appendDriverParameters(command)

		// Get the active machine
		val activeHosts = DockerUtil.getActiveHosts

		// Get the existing machines
		val hosts = DockerUtil.getHosts
		if (!hosts.containsKey(compute.name)) { // Check if machine exists in the real environment

			// Create VitualBox machine and start it
			ProcessManager.runCommand(command.toString, runtime, true)

			// Set state
			compute.state = ComputeStatus.ACTIVE

			//Create the Containers belong to this machine.
			if (compute.links.size > 0) {

				// Start the containers without create graph
				if (!this.linkFound) {
					for (Link link : compute.links) {
						val con = link.target as ExecutableContainer
						if (!containerIsDeployed(con.name, this.machine)) {

							// Create container
							con.createContainer(this.machine)

							// Start container
							con.start
						} else {

							// Start container
							con.start
						}
					}
				} else { // Create the graph
					val dependencies = this.containerDependency
					for (Container c : this.deploymentOrder) {
						val con = c as ExecutableContainer
						if (!containerIsDeployed(con.name, compute)) {

							// Create container
							con.createContainer(this.machine, dependencies)

							// Start container
							con.start
						} else {

							// Start container
							con.start
						}
					}
				}
			}
		} else {
			if (!activeHosts.containsKey(compute.name)) {

				// Start the machine
				DockerMachineManager.startCmd(runtime, compute.name)

				// Set state
				compute.state = ComputeStatus.ACTIVE

				// Create the Containers belong to this machine.
				if (compute.links.size > 0) {

					// Start the containers without create graph
					if (!this.linkFound) {
						for (Link link : compute.links) {
							val con = link.target as ExecutableContainer
							if (!containerIsDeployed(con.name, this.machine)) {

								// Create container
								con.createContainer(this.machine)

								// Start container
								con.start
							} else {

								// Start container
								con.start
							}
						}
					} else {
						for (Container c : this.deploymentOrder) {
							val con = c as ExecutableContainer
							if (!containerIsDeployed(con.name, compute)) {

								// Create container
								con.createContainer(this.machine, this.containerDependency)

								// Start container
								con.start
							} else {

								// Start container
								con.start
							}
						}
					}
				}
			}
		}

		LOGGER.info("EXECUTE COMMAND: " + command.toString)
	}

	def void synchronize() {

		// compare
		val hosts = DockerUtil.getHosts
		val instanceMH = new ModelHandler
		val instance = new DockerContainerManager
		val machine = instanceMH.getModel(this.compute.name, hosts.get(this.compute.name))
		this.compute.state = machine.state

		if (this.compute.state.toString.equalsIgnoreCase("active")) {

			// Introspect containers
			val contains = instance.listContainer(machine)
			if (contains != null) {
				val modelContainers = instanceMH.buildContainer(this.compute, contains)
				for (org.occiware.clouddesigner.occi.docker.Container container : modelContainers) {
					(container as ExecutableContainer).linkContainerToMachine(this.compute)
				}
				if (this.compute.links != null) {
					for (Link link : compute.links) {
						this.compute.eContainer.eResource.allContents.toList.add(link)
						if (link instanceof Link) {
							val c = link as Contains
							if (c.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
								this.compute.eContainer.eResource.allContents.toList.add(
									(c.target as org.occiware.clouddesigner.occi.docker.Container))
							}
						}
					}

				}
			}

		} else {
			if (compute.links.size > 0) {

				// Stop the containers 
				compute.links.forEach[elt|(elt.target as ExecutableContainer).stop(StopMethod.GRACEFUL)]

			}
		}
	}

	def boolean linkFound() {
		val List<org.occiware.clouddesigner.occi.docker.Container> containers = this.containers
		var boolean link = false
		for (org.occiware.clouddesigner.occi.docker.Container c : containers) {
			if (c.links.size > 0) {
				link = true
				return link
			}
		}
		return link
	}

	def List<org.occiware.clouddesigner.occi.docker.Container> deploymentOrder() {
		val List<org.occiware.clouddesigner.occi.docker.Container> containers = newArrayList
		var Graph<org.occiware.clouddesigner.occi.docker.Container> graph = new Graph<org.occiware.clouddesigner.occi.docker.Container>

		for (Link l : compute.links) {
			val container = l.target as org.occiware.clouddesigner.occi.docker.Container
			if (!container.links.isEmpty) {
				for (Link cl : container.links) {
					if (cl.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
						graph.addDependency(container, (cl.target as org.occiware.clouddesigner.occi.docker.Container))
						this.containerDependency.put(container.name,
							(cl.target as org.occiware.clouddesigner.occi.docker.Container).name)
					}
				}
			}
		}

		for (GraphNode<org.occiware.clouddesigner.occi.docker.Container> c : graph.deploymentOrder) {
			containers.add(c.value)
			LOGGER.info("--->" + c.value)
		}

		// Add standalone container
		for (org.occiware.clouddesigner.occi.docker.Container standaloneContainer : this.leafContainers) {
			if (!containers.contains(standaloneContainer)) {
				containers.add(standaloneContainer)
			}
		}
		containers.forEach[c|LOGGER.info(c.name)]
		return containers
	}

	def List<org.occiware.clouddesigner.occi.docker.Container> getContainers() {
		val List<org.occiware.clouddesigner.occi.docker.Container> containers = newArrayList
		compute.links.forEach[elt|containers.add((elt.target as org.occiware.clouddesigner.occi.docker.Container))]
		return containers
	}

	def List<org.occiware.clouddesigner.occi.docker.Container> leafContainers() {
		val List<org.occiware.clouddesigner.occi.docker.Container> containers = this.containers
		val List<org.occiware.clouddesigner.occi.docker.Container> leafContainers = new ArrayList
		for (org.occiware.clouddesigner.occi.docker.Container c : containers) {
			if (c.links.size == 0) {
				leafContainers.add(c)
			}
		}
		return leafContainers
	}

	def boolean containerIsDeployed(String containerName, Machine machine) {
		val containers = new DockerContainerManager
		val listContainers = containers.listContainer(machine)
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

	/**
	 * Stop a Docker machine.
	 */
	override def stop_execute(StopMethod method) {

		// Stop all Docker containers contained by this Docker machine.
		if (method == StopMethod.GRACEFUL) {
			for (Link link : compute.links) {
				if (link instanceof Link) {
					val contains = link as Contains
					if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
						val org.occiware.clouddesigner.occi.docker.Container container = contains.target as org.occiware.clouddesigner.occi.docker.Container
						container.stop(StopMethod.GRACEFUL)
					}
				}
			}

			// Stop the machine
			DockerMachineManager.stopCmd(Runtime.getRuntime, compute.name)
		}

		// Execute the docker-machine stop command.
		LOGGER.info("EXECUTE COMMAND: docker machine stop: " + compute.name)

	// TODO: must be implemented
	}

	/**
	 * Restart a Docker machine.
	 */
	override def restart_execute(RestartMethod method) {
		LOGGER.info("EXECUTE COMMAND: docker machine restart " + compute.name)
		stop_execute(StopMethod.GRACEFUL)
		start_execute()
	}

	/**
	 * Suspend a Docker machine.
	 */
	override def suspend_execute(SuspendMethod method) {
		LOGGER.info("EXECUTE COMMAND: docker machine suspend " + compute.name)

	// TODO: must be implemented
	}
}

/**
 * This class implements executable Docker Machine on Amazon EC2.
 */
class ExecutableMachine_Amazon_EC2 extends Machine_Amazon_EC2Impl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"amazonec2" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on Digital Ocean.
 */
class ExecutableMachine_Digital_Ocean extends Machine_Digital_OceanImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"digitalocean" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on Google Compute Engine.
 */
class ExecutableMachine_Google_Compute_Engine extends Machine_Google_Compute_EngineImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"google" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on IBM SoftLayer.
 */
class ExecutableMachine_IBM_SoftLayer extends Machine_IBM_SoftLayerImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"ibmsoflayer" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on Microsoft Azure.
 */
class ExecutableMachine_Microsoft_Azure extends Machine_Microsoft_AzureImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"azure" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on Microsoft Hyper V.
 */
class ExecutableMachine_Microsoft_Hyper_V extends Machine_Microsoft_Hyper_VImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"hyperv" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on OpenStack.
 */
class ExecutableMachine_OpenStack extends Machine_OpenStackImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"openstack" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on Rackspace.
 */
class ExecutableMachine_Rackspace extends Machine_RackspaceImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"rackspace" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.start }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on VirtualBox.
 */
class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"virtualbox"
		}

		override def appendDriverParameters(StringBuilder sb) {
			if (disk_size > 0) {
				sb.append(" --virtualbox-disk-size ").append(disk_size)
			}
			if (memory > 0.0F) {
				sb.append(" --virtualbox-memory ").append(memory)
			} else if (memory == 0.0F) {
				sb.append(" --virtualbox-memory ").append(1024.0)
			}
			if (cores > 0) {
				sb.append(" --virtualbox-cpu-count ").append(cores) // TODO verify is the default value is set
			} else if (cores == 0) {
				sb.append(" --virtualbox-cpu-count ").append(-1)
			}
			if (boot2docker_url != null) {
				sb.append(" --virtualbox-boot2docker-url ").append(boot2docker_url)
			}
		}
	}

	// Delegation to the manager.
	override def start() {
		manager.start()

		// Add listener here
		val observer = new DockerObserver
		observer.listener(this)
	}

	def startAll() { manager.startAll }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on VMware Fusion.
 */
class ExecutableMachine_VMware_Fusion extends Machine_VMware_FusionImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"fusion" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on VMware vCloud Air.
 */
class ExecutableMachine_VMware_vCloud_Air extends Machine_VMware_vCloud_AirImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"vcloudair" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

/**
 * This class implements executable Docker Machine on VMware vSphere.
 */
class ExecutableMachine_VMware_vSphere extends Machine_VMware_vSphereImpl {

	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"vsphere" // TODO: check driver name
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

	// Delegation to the manager.
	def startAll() { manager.startAll }

	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def synchronize() { manager.synchronize }
}

class ExecutableDockerModel {

	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableDockerModel))
	var public Machine machine
	var public org.occiware.clouddesigner.occi.docker.Container container
	var public Configuration configuration
	var public Machine_VirtualBox machine_VirtualBox
	var public Machine_Amazon_EC2 machine_Amazon_EC2
	var public Machine_Digital_Ocean machine_Digital_Ocean
	var public Machine_Google_Compute_Engine machine_Google_Compute_Engine
	var public Machine_IBM_SoftLayer machine_IBM_SoftLayer
	var public Machine_Microsoft_Azure machine_Microsoft_Azure
	var public Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V
	var public Machine_OpenStack machine_OpenStack
	var public Machine_Rackspace machine_Rackspace
	var public Machine_VMware_Fusion machine_VMware_Fusion
	var public Machine_VMware_vCloud_Air machine_VMware_vCloud_Air
	var public Machine_VMware_vSphere machine_VMware_vSphere

	new() {
	}

	new(Machine machine) {
		this.machine = machine
		if (machine instanceof Machine_VirtualBox) {
			machine_VirtualBox = machine
		} else if (machine instanceof Machine_Amazon_EC2) {
			machine_Amazon_EC2 = machine
		} else if (machine instanceof Machine_Digital_Ocean) {
			machine_Digital_Ocean = machine
		} else if (machine instanceof Machine_Google_Compute_Engine) {
			machine_Google_Compute_Engine = machine
		} else if (machine instanceof Machine_IBM_SoftLayer) {
			machine_IBM_SoftLayer = machine
		} else if (machine instanceof Machine_Microsoft_Azure) {
			machine_Microsoft_Azure = machine
		} else if (machine instanceof Machine_Microsoft_Hyper_V) {
			machine_Microsoft_Hyper_V = machine
		} else if (machine instanceof Machine_OpenStack) {
			machine_OpenStack = machine
		} else if (machine instanceof Machine_Rackspace) {
			machine_Rackspace = machine
		} else if (machine instanceof Machine_VMware_Fusion) {
			machine_VMware_Fusion = machine
		} else if (machine instanceof Machine_VMware_vCloud_Air) {
			machine_VMware_vCloud_Air = machine
		} else if (machine instanceof Machine_VMware_vSphere) {
			machine_VMware_vSphere = machine
		}
	}

	new(Configuration configuration) {
		this.configuration = configuration
	}

	new(org.occiware.clouddesigner.occi.docker.Container container) {
		this.container = container
	}

	def void start() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.start
			return;
		}
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.start
			return;
		}
		if (machine_Digital_Ocean != null) {
			machine_Digital_Ocean.start
			return
		}
		if (machine_Google_Compute_Engine != null) {
			machine_Google_Compute_Engine.start
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			machine_IBM_SoftLayer.start
			return;
		}
		if (machine_Microsoft_Azure != null) {
			machine_Microsoft_Azure.start
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			machine_Microsoft_Hyper_V.start
			return
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.start
			return;
		}

		if (machine_Rackspace != null) {
			machine_Rackspace.start
			return
		}

		if (machine_VMware_Fusion != null) {
			machine_VMware_Fusion.start
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			machine_VMware_vCloud_Air.start
			return
		}
		if (machine_VMware_vSphere != null) {
			machine_VMware_vSphere.start
			return;
		}

	}

	def void startAll() {
		if (machine_VirtualBox != null) {
			(machine_VirtualBox as ExecutableMachine_VirtualBox).startAll
			return;
		}
		if (machine_Amazon_EC2 != null) {
			(machine_Amazon_EC2 as ExecutableMachine_Amazon_EC2).startAll
			return;
		}
		if (machine_Digital_Ocean != null) {
			(machine_Digital_Ocean as ExecutableMachine_Digital_Ocean).startAll
			return
		}
		if (machine_Google_Compute_Engine != null) {
			(machine_Google_Compute_Engine as ExecutableMachine_Google_Compute_Engine).startAll
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			(machine_IBM_SoftLayer as ExecutableMachine_IBM_SoftLayer).startAll
			return;
		}
		if (machine_Microsoft_Azure != null) {
			(machine_Microsoft_Azure as ExecutableMachine_Microsoft_Azure).startAll
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			(machine_Microsoft_Hyper_V as ExecutableMachine_Microsoft_Hyper_V).startAll
			return;
		}

		if (machine_OpenStack != null) {
			(machine_OpenStack as ExecutableMachine_OpenStack).startAll
			return;
		}

		if (machine_Rackspace != null) {
			(machine_Rackspace as ExecutableMachine_Rackspace).startAll
			return;
		}

		if (machine_VMware_Fusion != null) {
			(machine_VMware_Fusion as ExecutableMachine_VMware_Fusion).startAll
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			(machine_VMware_vCloud_Air as ExecutableMachine_VMware_vCloud_Air).startAll
			return;
		}
		if (machine_VMware_vSphere != null) {
			(machine_VMware_vSphere as ExecutableMachine_VMware_vSphere).startAll
			return;
		}

	}

	def void stop() {
		if (machine_VirtualBox != null) {
			(machine_VirtualBox as ExecutableMachine_VirtualBox).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Amazon_EC2 != null) {
			(machine_Amazon_EC2 as ExecutableMachine_Amazon_EC2).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Digital_Ocean != null) {
			(machine_Digital_Ocean as ExecutableMachine_Digital_Ocean).stop(StopMethod.GRACEFUL)
			return
		}
		if (machine_Google_Compute_Engine != null) {
			(machine_Google_Compute_Engine as ExecutableMachine_Google_Compute_Engine).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			(machine_IBM_SoftLayer as ExecutableMachine_IBM_SoftLayer).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Microsoft_Azure != null) {
			(machine_Microsoft_Azure as ExecutableMachine_Microsoft_Azure).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			(machine_Microsoft_Hyper_V as ExecutableMachine_Microsoft_Hyper_V).stop(StopMethod.GRACEFUL)
			return
		}

		if (machine_OpenStack != null) {
			(machine_OpenStack as ExecutableMachine_OpenStack).stop(StopMethod.GRACEFUL)
			return;
		}

		if (machine_Rackspace != null) {
			(machine_Rackspace as ExecutableMachine_Rackspace).stop(StopMethod.GRACEFUL)
			return
		}

		if (machine_VMware_Fusion != null) {
			(machine_VMware_Fusion as ExecutableMachine_VMware_Fusion).stop(StopMethod.GRACEFUL)
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			(machine_VMware_vCloud_Air as ExecutableMachine_VMware_vCloud_Air).stop(StopMethod.GRACEFUL)
			return
		}
		if (machine_VMware_vSphere != null) {
			(machine_VMware_vSphere as ExecutableMachine_VMware_vSphere).stop(StopMethod.GRACEFUL)
			return;
		}

	}

	def void restart() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Digital_Ocean != null) {
			machine_Digital_Ocean.restart(RestartMethod.GRACEFUL)
			return
		}
		if (machine_Google_Compute_Engine != null) {
			machine_Google_Compute_Engine.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			machine_IBM_SoftLayer.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Microsoft_Azure != null) {
			machine_Microsoft_Azure.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			machine_Microsoft_Hyper_V.restart(RestartMethod.GRACEFUL)
			return
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.restart(RestartMethod.GRACEFUL)
			return;
		}

		if (machine_Rackspace != null) {
			machine_Rackspace.restart(RestartMethod.GRACEFUL)
			return
		}

		if (machine_VMware_Fusion != null) {
			machine_VMware_Fusion.restart(RestartMethod.GRACEFUL)
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			machine_VMware_vCloud_Air.restart(RestartMethod.GRACEFUL)
			return
		}
		if (machine_VMware_vSphere != null) {
			machine_VMware_vSphere.restart(RestartMethod.GRACEFUL)
			return;
		}

	}

	def void synchronize() {
		if (machine instanceof Machine_VirtualBox) {
			(this.machine_VirtualBox as ExecutableMachine_VirtualBox).synchronize
		} else if (machine instanceof Machine_Amazon_EC2) {
			(machine_Amazon_EC2 as ExecutableMachine_Amazon_EC2).synchronize
		} else if (machine instanceof Machine_Digital_Ocean) {
			(machine_Digital_Ocean as ExecutableMachine_Digital_Ocean).synchronize
		} else if (machine instanceof Machine_Google_Compute_Engine) {
			(machine_Google_Compute_Engine as ExecutableMachine_Google_Compute_Engine).synchronize
		} else if (machine instanceof Machine_IBM_SoftLayer) {
			(machine_IBM_SoftLayer as ExecutableMachine_IBM_SoftLayer).synchronize
		} else if (machine instanceof Machine_Microsoft_Azure) {
			(machine_Microsoft_Azure as ExecutableMachine_Microsoft_Azure).synchronize
		} else if (machine instanceof Machine_Microsoft_Hyper_V) {
			(machine_Microsoft_Hyper_V as ExecutableMachine_Microsoft_Hyper_V).synchronize
		} else if (machine instanceof Machine_OpenStack) {
			(machine_OpenStack as ExecutableMachine_OpenStack).synchronize
		} else if (machine instanceof Machine_Rackspace) {
			(machine_Rackspace as ExecutableMachine_Rackspace).synchronize
		} else if (machine instanceof Machine_VMware_Fusion) {
			(machine_VMware_Fusion as ExecutableMachine_VMware_Fusion).synchronize
		} else if (machine instanceof Machine_VMware_vCloud_Air) {
			(machine_VMware_vCloud_Air as ExecutableMachine_VMware_vCloud_Air).synchronize
		} else if (machine instanceof Machine_VMware_vSphere) {
			(machine_VMware_vSphere as ExecutableMachine_VMware_vSphere).synchronize
		}
	}

	def void importModel() {
		val hosts = DockerUtil.getHosts
		val instanceMH = new ModelHandler
		LOGGER.info(hosts.toString)
		for (Map.Entry<String, String> entry : hosts.entrySet) {
			var machine = instanceMH.getModel(entry.getKey(), entry.getValue())
			if (!containMachine(machine)) {
				this.configuration.resources.add(machine)
				if (machine.links != null) {
					machine.links.forEach[elt|
						this.configuration.resources.add(
							(elt.target as org.occiware.clouddesigner.occi.docker.Container))]
				}
			}
		}
	}

	def boolean containMachine(Machine machine) {
		for (Resource r : this.configuration.resources) {
			if (r instanceof Machine) {
				if ((r as Machine).name == machine.name) {
					return true
				}
			}
		}
		return false
	}

}
