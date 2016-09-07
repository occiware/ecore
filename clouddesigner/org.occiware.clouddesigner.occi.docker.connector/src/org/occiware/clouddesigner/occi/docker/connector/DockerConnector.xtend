/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.model.Event
import com.github.dockerjava.api.model.Statistics
import com.github.dockerjava.core.async.ResultCallbackTemplate
import com.github.dockerjava.core.command.EventsResultCallback
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.Iterator
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.RollbackException
import org.eclipse.emf.transaction.TransactionalCommandStack
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.occiware.clouddesigner.occi.Configuration
import org.occiware.clouddesigner.occi.Link
import org.occiware.clouddesigner.occi.Resource
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
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver
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
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static com.google.common.base.Preconditions.checkNotNull
import static org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer.*

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
class ExecutableDockerFactory extends DockerFactoryImpl {

	// Initialize logger for ExecutableDockerFactory.
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
		LOGGER.info(this.class.name + ":createMachine_VMware_vCloud_Air()")
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
 * This class notifies a new events to the connector.
 */
class EventCallBack extends EventsResultCallback {
	// Initialize logger for EventCallBack.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(EventCallBack))
	var ExecutableContainer container

	new(ExecutableContainer container) {
		this.container = container
	}

	def modifyResourceSet(Resource resource, String state, String containerId) {
		// Creating an editing domain
		var TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resource.eResource.resourceSet)
		var Command cmd = new RecordingCommand(domain) {
			override protected void doExecute() {
				// these modifications require a write transaction in this editing domain
				if (state.equalsIgnoreCase("stop")) {
					(resource as ExecutableContainer).state = ComputeStatus.INACTIVE
				}
				if (state.equalsIgnoreCase("start")) {
					(resource as ExecutableContainer).state = ComputeStatus.ACTIVE
				}
				if (state.equalsIgnoreCase("create")) {
					val instanceMH = new ModelHandler
					var machine = (resource as ExecutableContainer).currentMachine
					var org.occiware.clouddesigner.occi.docker.Container c = instanceMH.buildContainer(machine,
						containerId)
					instanceMH.linkContainerToMachine(c, machine)
					if (machine.eContainer instanceof Configuration) {
						(machine.eContainer as Configuration).resources.add(c as ExecutableContainer)
						LOGGER.info("Load new container")
					}
				}
				if (state.equalsIgnoreCase("destroy")) {
					val instanceMH = new ModelHandler
					var container = (resource as org.occiware.clouddesigner.occi.docker.Container)
					var machine = (resource as ExecutableContainer).currentMachine
					instanceMH.removeContainerFromMachine(container, machine)
					if (machine.eContainer instanceof Configuration) {
						(machine.eContainer as Configuration).resources.remove(container as ExecutableContainer)
						LOGGER.info("Destroy a container")
					}
				}
			}
		};

		try {
			(domain.getCommandStack() as TransactionalCommandStack).execute(cmd, null); // default options
		} catch (RollbackException rbe) {
			LOGGER.error(rbe.getStatus().toString)
		}
	}

	override def void onNext(Event event) {
		LOGGER.info("Received event #{}", event)
		var machine = this.container.currentMachine
		// Apply modification only when the machine is active
		if (machine.state == ComputeStatus.ACTIVE) {
			var EList<Link> links = machine.links
			LOGGER.info("Link size #{}", links.size)
			try {

				for (Link l : links) {
					var contains = l as Contains
					if (contains != null) {
						if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
							if ((contains.target as ExecutableContainer).containerid == event.id) {
								if (event.getStatus().equalsIgnoreCase("stop")) {
									modifyResourceSet(contains.target, event.getStatus(), event.id)
									LOGGER.info("Apply stop notification to model")
								}
								if (event.getStatus().equalsIgnoreCase("start")) {
									modifyResourceSet(contains.target, event.getStatus(), event.id)
									LOGGER.info("Apply start notification to model")
								}
								if (event.getStatus().equalsIgnoreCase("destroy")) {
									modifyResourceSet(contains.target, event.getStatus(), event.id)
									LOGGER.info("Apply destroy notification to model")
								}

							} else {
								if (event.getStatus().equalsIgnoreCase("create") &&
									!containerIsInsideMachine(machine, event.id)) {
									modifyResourceSet(contains.target, event.getStatus(), event.id)
									LOGGER.info("Apply create notification to model")
								}
							}
						}

					}

				}

			} catch (Exception e) {
			}
		}
	}

	def listContainers(Machine machine) {
		var containers = new ArrayList
		for (Link l : machine.links) {
			var contains = l as Contains
			if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
				containers.add(contains.target as ExecutableContainer)
			}
		}
		return containers
	}

	def boolean containerIsInsideMachine(Machine machine, String containerId) {
		val container = dockerContainerManager.inspectContainer(machine, containerId)
		val name = container.name.replaceAll("/", "")
		var listContainer = listContainers(machine)
		for (ExecutableContainer ec : listContainer) {
			if (ec.name.equalsIgnoreCase(name)) {
				return true
			}
		}
		return false
	}

	def Resource getResourceById(Machine machine, String containerId) {
		var EList<Link> links = machine.links
		var Iterator<Link> iterat = links.iterator()
		while (iterat.hasNext) {
			var Link contains = iterat.next
			if (contains != null) {
				if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
					if ((contains.target as ExecutableContainer).containerid == containerId) {
						return contains.target
					}
				}
			}
		}
		return null
	}

}

/**
 * This class notifies monitoring events from the connector.
 */

class StatsCallback extends ResultCallbackTemplate<StatsCallback, Statistics> {

	// Initialize logger for StatsCallback.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(StatsCallback))

	var private List<Statistics> statisticsList = new LinkedList

	var private Boolean gotStats = false;

	var String containerId
	
	var private org.occiware.clouddesigner.occi.docker.Container container
	
	var containersMap = newLinkedHashMap
	
	new(String containerId) {
		this.containerId = containerId
	}

	new(org.occiware.clouddesigner.occi.docker.Container container) {
		this.container = container
	}

	override def void onNext(Statistics stats) {
		LOGGER.info("Received stats #{} :: {} :: {}",statisticsList.size(), this.container.containerid, stats)
		
		statisticsList.add(stats)
		
		// Update the monitoring metrics
		modifyResourceSet(this.container, stats)
		
		if (stats != null) {
			gotStats = true;
		}
		
	}

	def void modifyResourceSet(Resource resource, Statistics stats){
		// Creating an editing domain
		var TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resource.eResource.resourceSet)
		
		Thread.sleep(30*1000) // Pause for 1000 ms
		var Command cmd = new RecordingCommand(domain) {
			override protected void doExecute() {
				// these modifications require a write transaction in this editing domain
				var Integer memory = stats.memoryStats.get("usage") as Integer
				var Map<String, Object> cpu = stats.cpuStats
				var LinkedHashMap tmpcpu = cpu.get("cpu_usage") as LinkedHashMap
				var cpu_used = tmpcpu.get("total_usage")
				//.get("cpu_usage")
				
				LOGGER.info("Received CPU <=====> {}", cpu_used)
				(resource as ExecutableContainer).memory_used = String.valueOf(memory)
				(resource as ExecutableContainer).cpu_used  = String.valueOf(cpu_used)
			}
		};

		try {
			(domain.getCommandStack() as TransactionalCommandStack).execute(cmd, null); // default options
		} catch (RollbackException rbe) {
			LOGGER.error(rbe.getStatus().toString)
		}		
	}
	
	def Boolean gotStats() {
		return gotStats;
	}

	def String getContainerId(){
		return this.containerId
	}

	def List<Statistics> getStatisticsList() {
		return this.statisticsList
	}
	
	def Boolean compateTo(Statistics stats1, Statistics stats2){
		return stats1.toString.equals(stats2.toString)
	}
}	

/**
 * This class implements an executable Docker container.
 */
class ExecutableContainer extends ContainerImpl {

	// Initialize logger for ExecutableContainer.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableContainer))
	var Map<DockerClient, CreateContainerResponse> map = null
	protected static DockerContainerManager dockerContainerManager = null

	// This is a cache of containers current machine
	protected static Map<String, Machine> listCurrentMachine = new HashMap

	// Listener of the events
	var eventCallback = new EventCallBack(this)

	// Listener of the stats
//	var statsCallback = new StatsCallback(this)

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
				try {
					if (dockerContainerManager == null) {
						dockerContainerManager = new DockerContainerManager(machine, eventCallback)
					}
					dockerContainerManager.startContainer(machine, this.compute)
				} catch (Exception e) {
					createContainer(machine)
					dockerContainerManager.startContainer(machine, this.compute)
				}
			}
		}

		/**
		 * Stop the Docker container.
		 */
		override def stop_execute(StopMethod method) {
			LOGGER.info("EXECUTE container stop")
			val machine = getCurrentMachine
			if (machine.state.toString.equalsIgnoreCase("active")) {
				if (this.compute.state.toString.equalsIgnoreCase("active")) {
					try {
						if (dockerContainerManager == null) {
							dockerContainerManager = new DockerContainerManager(machine, eventCallback)
						}
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
	override def start() {
		stateMachine.start

		// Add listener here
		val observer = new DockerObserver
		val machine = getCurrentMachine
		observer.listener(this, machine)
	}

	override def stop(StopMethod method) { stateMachine.stop(method) }

	override def restart(RestartMethod method) { stateMachine.restart(method) }

	override def suspend(SuspendMethod method) { stateMachine.suspend(method) }

	def Map<DockerClient, CreateContainerResponse> createContainer(Machine machine,
		Multimap<String, String> containerDependency) {

		// Set dockerClient
		var Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>
		if (dockerContainerManager == null) {
			dockerContainerManager = new DockerContainerManager(machine, eventCallback)
		}

		// Download image
		dockerContainerManager.pullImage(machine, this.image)
		result = dockerContainerManager.createContainer(machine, this, containerDependency)
		this.map = new HashMap<DockerClient, CreateContainerResponse>(result)
		return result
	}

	def void createContainer(Machine machine) {
		if (dockerContainerManager == null) {
			dockerContainerManager = new DockerContainerManager(machine, eventCallback)
		}

		// Download image
		dockerContainerManager.pullImage(machine, this.image)

		// Create the container
		dockerContainerManager.createContainer(machine, this)
	}

	def void removeContainer(Machine machine) {
		if (dockerContainerManager == null) {
			dockerContainerManager = new DockerContainerManager(machine, eventCallback)
		}
		dockerContainerManager.removeContainer(machine.name, this.name)
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

		// Checks if the current machine is cached
		if (listCurrentMachine.containsKey(this.id)) {
			return listCurrentMachine.get(this.id)
		}

		// get the current machine
		for (EObject eo : this.eContainer.eContents) {
			if (eo instanceof Machine) {
				val machine = eo as Machine
				for (Link l : machine.links) {
					if (l instanceof Contains) {
						val contains = l as Contains
						if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
							if ((l.target as ExecutableContainer).id == this.id) {

								// Update the cache
								listCurrentMachine.put(this.id, machine)
								return machine
							}
						}

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
	protected DockerContainerManager dockerContainerManager = new DockerContainerManager
	// Get docker-machine command
	private var String dockerMachineCmd = DockerUtil.dockerMachineCmd

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

		// build docker-machine command
		var String dockerMachineCMD = String.format("%s -D create --driver ", this.dockerMachineCmd)

		// Create the machine command
		command.append(dockerMachineCMD).append(getDriverName)
		appendDriverParameters(command)
		command.append(' ').append(compute.name)

		LOGGER.info("CMD : #{}", command.toString)

		// Get the active machine
		val activeHosts = DockerUtil.getActiveHosts

		// Get the existing machines
		val hosts = DockerUtil.getHosts
		if (!hosts.containsKey(compute.name)) { // Check if machine exists in the real environment
		// Create the machine and start it
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
		var String dockerMachineCMD = String.format("%s -D create --driver ", this.dockerMachineCmd)
		command.append(dockerMachineCMD).append(getDriverName)
		appendDriverParameters(command)
		command.append(' ').append(compute.name)
		// Get the active machine
		val activeHosts = DockerUtil.getActiveHosts

		// Get the existing machines
		val hosts = DockerUtil.getHosts
		if (!hosts.containsKey(compute.name)) { // Check if machine exists in the real environment
		// Create the machine and start it
			ProcessManager.runCommand(command.toString, runtime, true)

			// Set state
			compute.state = ComputeStatus.ACTIVE

			// Create the Containers belong to this machine.
			if (compute.links.size > 0) {

				// Start the containers without create graph
				if (!this.linkFound) {
					for (Link link : compute.links) {
						val contains = link as Contains
						if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
							val con = contains.target as ExecutableContainer

							// The container does not exists in the machine
							if (!containerIsDeployed(con.name, this.machine)) {

								// Create container
								con.createContainer(this.machine)

								// Start container
								con.start
							} else { // The container exists, then just starts it
							// Start container
								con.start
							}
						}
					}
				} else { // Create the graph
					val dependencies = this.containerDependency
					for (org.occiware.clouddesigner.occi.docker.Container c : this.deploymentOrder) {
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
		} else { // The machine exits, just start it and create the containers inside it
			if (!activeHosts.containsKey(compute.name)) {

				// Start the machine
				DockerMachineManager.startCmd(runtime, compute.name)
				
				// Regenerate Cert when IP addresses change
				DockerMachineManager.regenerateCert(runtime, compute.name)
				
				// Set state
				compute.state = ComputeStatus.ACTIVE

				// Create the Containers belong to this machine.
				if (compute.links.size > 0) {

					// Start the containers without create graph
					if (!this.linkFound) {
						for (Link link : compute.links) {
							val contains = link as Contains
							if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
								val con = contains.target as ExecutableContainer

								// The container does not exists in the machine
								if (!containerIsDeployed(con.name, this.machine)) {

									// Create container
									LOGGER.info("Creating the container: " + con.name)
									con.createContainer(this.machine)
									LOGGER.info("The container is created")

									// Start container
									con.start
								} else { // The machine exists
								// Start container
									LOGGER.info("Trying to start container: " + con.name)
									con.start
									LOGGER.info("Started ...")
								}
							}
						}
					} else {
						for (org.occiware.clouddesigner.occi.docker.Container c : this.deploymentOrder) {
							val con = c as ExecutableContainer

							// The container does not exists in the machine
							if (!containerIsDeployed(con.name, compute)) {

								// Create container
								con.createContainer(this.machine, this.containerDependency)

								// Start container
								con.start
							} else { // The container exists
							// Start container
								LOGGER.info("Trying to start container: " + con.name)
								con.start
								LOGGER.info("Started ... ")
							}
						}
					}
				}
			} else {

				// Create the Containers belong to this machine.
				if (compute.links.size > 0) {

					// Start the containers without create graph
					if (!this.linkFound) {
						for (Link link : compute.links) {
							val contains = link as Contains
							if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
								val con = contains.target as ExecutableContainer
								if (!containerIsDeployed(con.name, this.machine)) {

									// Create container
									con.createContainer(this.machine)

									// Start container
									con.start
								} else {

									// Start container
									LOGGER.info("Trying to start container: " + con.name)
									con.start
									LOGGER.info("Started ...")
								}
							}
						}
					} else {
						for (org.occiware.clouddesigner.occi.docker.Container c : this.deploymentOrder) {
							val con = c as ExecutableContainer

							// The container does not exists in the machine
							if (!containerIsDeployed(con.name, compute)) {

								// Create container
								con.createContainer(this.machine, this.containerDependency)

								// Start container
								LOGGER.info("Trying to start container: " + con.name)
								con.start
								LOGGER.info("Started ... ")
							} else { // The container exists
							// Start container
								LOGGER.info("Trying to start container: " + con.name)
								LOGGER.info("Started ... ")
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

		// Get all hosts in the real environment
		val hosts = DockerUtil.getHosts
		val instanceMH = new ModelHandler

		val instance = new DockerContainerManager(this.compute)
		val machine = instanceMH.getModel(this.compute.name, hosts.get(this.compute.name), false)
		this.compute.state = machine.state
		if (this.compute.state.toString.equalsIgnoreCase("active")) {

			if (this.compute.links.size > 0) {

				// Create the containers without create graph
				if (!this.linkFound) {
					var containersInModel = new ArrayList<String>
					for (Link link : compute.links) {
						val contains = link as Contains
						if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
							val con = contains.target as ExecutableContainer
							containersInModel.add(con.name)
							if (!containerIsDeployed(con.name, this.machine)) {

								// Create container
								LOGGER.info("Creating the container: " + con.name)
								con.createContainer(this.machine)
								LOGGER.info("The container is created")
							}
						}
					}

					// Remove the containers
					var containersToRemove = containerInReal(this.compute.name)
					if (!containersToRemove.empty) {
						containersToRemove.removeAll(containersInModel)
						for (String id : containersToRemove) {
							instance.removeContainer(this.compute.name, id)
						}

					}
				} else {
					var containersInModel = new ArrayList<String>
					for (org.occiware.clouddesigner.occi.docker.Container c : this.deploymentOrder) {
						val con = c as ExecutableContainer
						containersInModel.add(c.name)

						// The container does not exists in the machine
						if (!containerIsDeployed(con.name, compute)) {

							// Create container
							con.createContainer(this.machine, this.containerDependency)
						}
					}

					// Remove the containers
					var containersToRemove = containerInReal(this.compute.name)
					if (!containersToRemove.empty) {
						containersToRemove.removeAll(containersInModel)
						for (String id : containersToRemove) {
							instance.removeContainer(this.compute.name, id)
						}
					}

				}
			}

		/*
		 * 	// Introspect containers
		 * 	val contains = instance.listContainer(machine)
		 * 	if (contains != null) {
		 * 		val modelContainers = instanceMH.buildContainer(this.compute, contains)
		 * 		for (org.occiware.clouddesigner.occi.docker.Container container : modelContainers) {
		 * 			(container as ExecutableContainer).linkContainerToMachine(this.compute)
		 * 		}
		 * 		if (this.compute.links != null) {
		 * 			for (Link link : compute.links) {
		 * 				this.compute.eContainer.eResource.allContents.toList.add(link)
		 * 				if (link instanceof Link) {
		 * 					val c = link as Contains
		 * 					if (c.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
		 * 						this.compute.eContainer.eResource.allContents.toList.add(
		 * 							(c.target as org.occiware.clouddesigner.occi.docker.Container))
		 * 					}
		 * 				}
		 * 			}
		 * 
		 * 		}
		 * 	}
		 */
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
			if (c != null) {
				if (c.links.size >
					0) {
					link = true
					return link
				}

			}
		}
		return link
	}

	def List<org.occiware.clouddesigner.occi.docker.Container> deploymentOrder() {
		val List<org.occiware.clouddesigner.occi.docker.Container> containers = newArrayList
		var Graph<org.occiware.clouddesigner.occi.docker.Container> graph = new Graph<org.occiware.clouddesigner.occi.docker.Container>

		for (Link l : compute.links) {
			val contains = l as Contains
			if (contains.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
				val container = contains.target as org.occiware.clouddesigner.occi.docker.Container
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
		containers.removeAll(Collections.singleton(null))
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
				return true
			}
		}
		return false
	}

	def List<String> containerInReal(String machineName) {
		var containers = new ArrayList<String>
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
			containers.add(contName)
		}
		return containers
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
						val org.occiware.clouddesigner.occi.docker.Container container = contains.
							target as org.occiware.clouddesigner.occi.docker.Container
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
			"amazonec2"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not null of attributes
			checkNotNull(access_key, "access_key is null")
			checkNotNull(secret_key, "secret_key is null")
			checkNotNull(vpc_id, "vpc_id is null")
			checkNotNull(zone, "zone is null")

			if (StringUtils.isNotBlank(access_key)) {
				sb.append(" --amazonec2-access-key ").append(access_key)
			}
			if (StringUtils.isNotBlank(secret_key)) {
				sb.append(" --amazonec2-secret-key ").append(secret_key)
			}
			if (StringUtils.isNotBlank(vpc_id)) {
				sb.append(" --amazonec2-vpc-id ").append(vpc_id)
			}
			if (StringUtils.isNotBlank(zone)) {
				sb.append(" --amazonec2-zone ").append(zone)
			}
			if (StringUtils.isNotBlank(ami)) {
				sb.append(" --amazonec2-ami ").append(ami)
			}
			if (StringUtils.isNotBlank(region)) {
				sb.append(" --amazonec2-region ").append(region)
			}
			if (StringUtils.isNotBlank(instance_type)) {
				sb.append(" --amazonec2-instance-type ").append(instance_type)
			}
			if (root_size > 0) {
				sb.append(" --amazonec2-root-size ").append(root_size)
			}
			if (StringUtils.isNotBlank(subnet_id)) {
				sb.append(" --amazonec2-subnet-id ").append(subnet_id)
			}
			if (StringUtils.isNotBlank(session_token)) {
				sb.append(" --amazonec2-session-token ").append(session_token)
			}
			if (StringUtils.isNotBlank(security_group)) {
				sb.append(" --amazonec2-security-group ").append(security_group)
			}
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
			"digitalocean"
		}

		override def appendDriverParameters(StringBuilder sb) {
			checkNotNull(access_token, "access_token is null")
			checkNotNull(size, "size is null")
			if (StringUtils.isNotBlank(access_token)) {
				sb.append(" --digitalocean-access-token ").append(access_token)
			}
			if (StringUtils.isNotBlank(size)) {
				sb.append(" --digitalocean-size ").append(size)
			}
			if (StringUtils.isNotBlank(region)) {
				sb.append(" --digitalocean-region ").append(region)
			}
			if (StringUtils.isNotBlank(image)) {
				sb.append(" --digitalocean-image ").append(image)
			}

		// Update the model with the new attributs			
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
			"google"
		}

		override def appendDriverParameters(StringBuilder sb) {

			checkNotNull(project, "project is null")
			if (StringUtils.isNotBlank(project)) {
				sb.append(" --google-project ").append(project)
			}
			if (StringUtils.isNotBlank(username)) {
				sb.append(" --google-username ").append(username)
			}
			if (StringUtils.isNotBlank(machine_type)) {
				sb.append(" --google-machine-type ").append(machine_type)
			}
			if (StringUtils.isNotBlank(zone)) {
				sb.append(" --google-zone ").append(zone)
			}

		// TODO update the model attributs
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
			"softlayer"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not attributes
			if (StringUtils.isNotBlank(user)) {
				sb.append(" --softlayer-user ").append(user)
			}
			if (StringUtils.isNotBlank(domain)) {
				sb.append(" --softlayer-domain ").append(domain)
			}
			if (StringUtils.isNotBlank(api_endpoint)) {
				sb.append(" --softlayer-api-endpoint ").append(api_endpoint)
			}
			if (StringUtils.isNotBlank(api_key)) {
				sb.append(" --softlayer-api-key ").append(api_key)
			}
			if (cpu > 0) {
				sb.append(" --softlayer-cpu ").append(cpu)
			}
			if (disk_size > 0) {
				sb.append(" --softlayer-disk-size ").append(disk_size)
			}
			if (memory > 0) {
				sb.append(" --softlayer-memory ").append(memory)
			}
			if (StringUtils.isNotBlank(hostname)) {
				sb.append(" --softlayer-hostname ").append(hostname)
			}
			if (StringUtils.isNotBlank(image)) {
				sb.append(" --softlayer-image ").append(image)
			}
			if (private_net_only) {
				sb.append(" --softlayer-private-net-only ").append(private_net_only)
			}
			if (local_disk) {
				sb.append(" --softlayer-local-disk ").append(local_disk)
			}

		// Update the model attributs
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
			"azure"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not attributes
			checkNotNull(subscription_id, "subscription_id is null")
			checkNotNull(subscription_cert, "subscription_cert is null")

			if (StringUtils.isNotBlank(subscription_id)) {
				sb.append(" --azure-subscription-id ").append(subscription_id)
			}
			if (StringUtils.isNotBlank(subscription_cert)) {
				sb.append(" --azure-subscription-cert ").append(subscription_cert)
			}

		// Update the model with new attributs
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
			"openstack"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not attributes
			checkNotNull(auth_url, "auth_url is null")
			checkNotNull(flavor_id, "flavor_id is null")
			checkNotNull(image_id, "image_id is null")
			checkNotNull(tenant_id, "tenant_id is null")
			checkNotNull(tenant_name, "tenant_name is null")
			checkNotNull(username, "username is null")
			checkNotNull(password, "password is null")
			checkNotNull(floatingip_pool, "floatingip_pool is null")
			if (!auth_url.isEmpty) {
				sb.append(" --openstack-auth-url ").append(auth_url)
			}
			if (!flavor_id.isEmpty) {
				sb.append(" --openstack-flavor-id ").append(flavor_id)
			}
			if (!image_id.isEmpty) {
				sb.append(" --openstack-image-id ").append(image_id)
			}
			if (!tenant_id.isEmpty) {
				sb.append(" --openstack-tenant-id ").append(tenant_id)
			}
			if (!tenant_name.isEmpty) {
				sb.append(" --openstack-tenant-name ").append(tenant_name)
			}
			if (!username.isEmpty) {
				sb.append(" --openstack-username ").append(username)
			}
			if (!password.isEmpty) {
				sb.append(" --openstack-password ").append(password)
			}
			if (!floatingip_pool.isEmpty) {
				sb.append(" --openstack-floatingip-pool ").append(floatingip_pool)
			}
			if (StringUtils.isNotBlank(region)) {
				sb.append(" --openstack-region ").append(region)
			}
			if (StringUtils.isNotBlank(net_id)) {

				sb.append(" --openstack-net-id ").append(net_id)
			}
			if (StringUtils.isNotBlank(sec_groups)) {
				sb.append(" --openstack-sec-groups ").append(sec_groups)
			} else {
				sb.append(" --openstack-sec-groups ").append("default")
			}

			// Should be fixed in the model.
			sb.append(" --openstack-ssh-user ").append("occiware")
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
			"rackspace"
		}

		override def appendDriverParameters(StringBuilder sb) {

			checkNotNull(api_key, "api_key is null")
			checkNotNull(username, "username is null")
			checkNotNull(region, "region is null")

			if (StringUtils.isNotBlank(api_key)) {
				sb.append(" --rackspace-api-key ").append(api_key)
			}
			if (StringUtils.isNotBlank(username)) {
				sb.append(" --rackspace-username ").append(username)
			}
			if (StringUtils.isNotBlank(region)) {
				sb.append(" --rackspace-region ").append(region)
			}
			if (StringUtils.isNotBlank(endpoint_type)) {
				sb.append(" --rackspace-endpoint-type ").append(endpoint_type)
			}
			if (StringUtils.isNotBlank(ssh_user)) {
				sb.append(" --rackspace-ssh-user ").append(ssh_user)
			}
			if (ssh_port > 0) {
				sb.append(" --rackspace-ssh-port ").append(ssh_port)
			}
			if (StringUtils.isNotBlank(flavor_id)) {
				sb.append(" --rackspace-flavor-id ").append(flavor_id)
			}

		// TODO update the model attributs
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
				sb.append(" --virtualbox-memory ").append(1024)
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
			"vmwarefusion"
		}

		override def appendDriverParameters(StringBuilder sb) {
			if (disk_size > 0) {
				sb.append(" --vmwarefusion-disk-size ").append(disk_size)
			}
			if (memory > 0.0F) {
				sb.append(" --vmwarefusion-memory-size ").append(memory)
			} else if (memory == 0.0F) {
				sb.append(" --vmwarefusion-memory-size ").append(1024.0)
			}
			if (boot2docker_url != null) {
				sb.append(" --vmwarefusion-boot2docker-url ").append(boot2docker_url)
			}
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
			"vmwarevcloudair"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not attributes
			if (StringUtils.isNotBlank(username)) {
				sb.append(" --vmwarevcloudair-username ").append(username)
			}
			if (StringUtils.isNotBlank(password)) {
				sb.append(" --vmwarevcloudair-password ").append(password)
			}
			if (StringUtils.isNotBlank(computeid)) {
				sb.append(" --vmwarevcloudair-computeid ").append(computeid)
			}
			if (cpu_count > 0) {
				sb.append(" --vmwarevcloudair-computeid ").append(cpu_count)
			}
			if (StringUtils.isNotBlank(catalog)) {
				sb.append(" --vmwarevcloudair-catalog ").append(catalog)
			}
			if (docker_port > 0) {
				sb.append(" --vmwarevcloudair-docker-port ").append(docker_port)
			}
			if (StringUtils.isNotBlank(edgegateway)) {
				sb.append(" --vmwarevcloudair-edgegateway ").append(edgegateway)
			}
			if (memory_size > 0) {
				sb.append(" --vmwarevcloudair-edgegateway ").append(memory_size)
			}
			if (provision) {
				sb.append(" --vmwarevcloudair-provision ").append(provision)
			}
			if (StringUtils.isNotBlank(publicip)) {
				sb.append(" --vmwarevcloudair-publicip ").append(publicip)
			}
			if (StringUtils.isNotBlank(orgvdcnetwork)) {
				sb.append(" --vmwarevcloudair-orgvdcnetwork ").append(orgvdcnetwork)
			}
			if (ssh_port > 0) {
				sb.append(" --vmwarevcloudair-ssh-port ").append(ssh_port)
			}
			if (StringUtils.isNotBlank(vdcid)) {
				sb.append(" --vmwarevcloudair-vdcid ").append(vdcid)
			}

		// Update the model attributs
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
			"vmwarevsphere"
		}

		override def appendDriverParameters(StringBuilder sb) {

			// TODO Check not null of attributes
			if (StringUtils.isNotBlank(username)) {
				sb.append(" --vmwarevsphere-username ").append(username)
			}
			if (StringUtils.isNotBlank(password)) {
				sb.append(" --vmwarevsphere-password ").append(password)
			}
			if (StringUtils.isNotBlank(datacenter)) {
				sb.append(" --vmwarevsphere-datacenter ").append(datacenter)
			}
			if (StringUtils.isNotBlank(vcenter)) {
				sb.append(" --vmwarevsphere-vcenter ").append(vcenter)
			}
			if (StringUtils.isNotBlank(datastore)) {
				sb.append(" --vmwarevsphere-datastore ").append(datastore)
			}
			if (StringUtils.isNotBlank(network)) {
				sb.append(" --vmwarevsphere-network ").append(network)
			}
			if (StringUtils.isNotBlank(boot2docker_url)) {
				sb.append(" --vmwarevsphere-boot2docker-url ").append(boot2docker_url)
			}
			if (StringUtils.isNotBlank(compute_ip)) {
				sb.append(" --vmwarevsphere-compute-ip ").append(compute_ip)
			}
			if (StringUtils.isNotBlank(pool)) {
				sb.append(" --vmwarevsphere-pool ").append(pool)
			}
			if (memory > 0) {
				sb.append(" --vmwarevsphere-memory-size ").append(memory.intValue)
			}
			if (disk_size > 0) {
				sb.append(" --vmwarevsphere-disk-size ").append(disk_size)
			}

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
			val machineExistInModeler = containMachine(entry.getKey())
			if (!machineExistInModeler) {
				var machine = instanceMH.getModel(entry.getKey(), entry.getValue(), machineExistInModeler)
				this.configuration.resources.add(machine)
				if (machine.links != null) {
					machine.links.forEach [ elt |
						this.configuration.resources.add((
							elt.target as org.occiware.clouddesigner.occi.docker.Container))
					]
				}
			}
		}
	}

	def boolean containMachine(String machineName) {
		for (Resource r : this.configuration.resources) {
			if (r instanceof Machine) {
				if ((r as Machine).name == machineName) {
					return true
				}
			}
		}
		return false
	}

}
