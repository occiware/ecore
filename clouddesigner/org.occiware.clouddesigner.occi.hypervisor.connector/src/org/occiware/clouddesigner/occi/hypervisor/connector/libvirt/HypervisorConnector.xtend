/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO 
 * 	- Philippe MERELE
 *******************************************************************************/
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt

import java.util.HashMap
import java.util.List
import java.util.Map
import org.libvirt.Connect
import org.libvirt.ConnectAuth
import org.libvirt.Domain
import org.libvirt.LibvirtException
import org.occiware.clouddesigner.occi.Configuration
import org.occiware.clouddesigner.occi.Resource
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage
import org.occiware.clouddesigner.occi.hypervisor.Machine
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util.CustomsConnectAuth
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util.DomainMarshaller
import org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorFactoryImpl
import org.occiware.clouddesigner.occi.hypervisor.impl.MachineImpl
import org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl
import org.occiware.clouddesigner.occi.infrastructure.Compute
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod
import org.occiware.clouddesigner.occi.infrastructure.StopMethod
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * This class overrides the generated EMF factory of the  package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
class ExecutableHypervisorFactory extends HypervisorFactoryImpl {
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableHypervisorFactory))

	/**
	 * Initialize the ExecutableFactory singleton.
	 */
	def static init() {

		// Replace the default generated factory of the  package by an executable  factory.
		val factory = new ExecutableHypervisorFactory
		HypervisorPackage.eINSTANCE.setEFactoryInstance(factory)
		return factory
	}

	/**
	 * Create an executable Machine instance.
	 */
	override def Machine createMachine() {
		println(this.class.name + ":createCompute()")
		return new ExecutableMachine
	}

	/**
	 * Create an executable Machine_VirtualBox instance.
	 */
	override def Machine_VirtualBox createMachine_VirtualBox() {
		println(this.class.name + ":createMachine_VirtualBox()")
		return new ExecutableMachine_VirtualBox
	}

}

/**
 * This class implements the state machine of any Compute resource.
 */
class ComputeStateMachine<T extends Compute> {

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
		println(this.class.name + ":start() - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			println(this.class.name + ":start() - move from inactive to active state")
			start_from_inactive_state()
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.ACTIVE) {
			println(this.class.name + ":start() - already active state")
			start_from_active_state()
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			println(this.class.name + ":start() - move from suspended to active state")
			start_from_suspended_state()
			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		println(this.class.name + ":start() - final state is " + compute.state)
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

	/**
	 * This method implements the transition from active state for the start action.
	 * 
	 * By default, this method does nothing.
	 */
	def start_from_active_state() {
		println(this.class.name + ":start_from_active_state() - DO NOTHING")
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
		println(this.class.name + ":start_execute() - DO NOTHING")
	}

	/**
	 * Stop OCCI Action.
	 */
	def stop(StopMethod method) {
		println(this.class.name + ":stop(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			println(this.class.name + ":stop() - already inactive state")
			stop_from_inactive_state(method)
		} else if (compute.state == ComputeStatus.ACTIVE) {
			println(this.class.name + ":stop() - move from active to inactive state")
			stop_from_active_state(method)
			compute.state = ComputeStatus.INACTIVE
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			println(this.class.name + ":stop() - move from suspended to inactive state")
			stop_from_suspended_state(method)
			compute.state = ComputeStatus.INACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		println(this.class.name + ":stop() - final state is " + compute.state)
		if(compute.state != ComputeStatus.INACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the stop action.
	 * 
	 * By default, this method does nothing.
	 */
	def stop_from_inactive_state(StopMethod method) {
		println(this.class.name + ":stop_from_inactive_state() - DO NOTHING")
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
		println(this.class.name + ":stop_execute(" + method + ") - DO NOTHING")
	}

	/**
	 * Restart OCCI Action.
	 */
	def restart(RestartMethod method) {
		println(this.class.name + ":restart(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			println(this.class.name + ":restart(" + method + ')' + " - move from inactive to active state")
			restart_from_inactive_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.ACTIVE) {
			println(this.class.name + ":restart(" + method + ')' + " - move from active to active state")
			restart_from_active_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			println(this.class.name + ":stop() - move from suspended to active state")
			restart_from_suspended_state(method)
			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		println(this.class.name + ":restart(" + method + ')' + " - final state is " + compute.state)
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
		println(this.class.name + ":restart_execute(" + method + ") - DO NOTHING")
	}

	/**
	 * Suspend OCCI Action.
	 */
	def suspend(SuspendMethod method) {
		println(this.class.name + ":suspend(" + method + ") - current state is " + compute.state)
		if (compute.state == ComputeStatus.INACTIVE) {
			println(this.class.name + ":suspend() - move from inactive to suspended state")
			suspend_from_inactive_state(method)
			compute.state = ComputeStatus.SUSPENDED
		} else if (compute.state == ComputeStatus.ACTIVE) {
			println(this.class.name + ":suspend() - move from active to suspended state")
			suspend_from_active_state(method)
			compute.state = ComputeStatus.SUSPENDED
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			println(this.class.name + ":suspend() - already suspended state")
			suspend_from_suspended_state(method)
		} else {
			throw new RuntimeException("Must never happen!")
		}
		println(this.class.name + ":suspend() - final state is " + compute.state)
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
		println(this.class.name + ":suspend_from_suspended_state() - DO NOTHING")
	}

	/**
	 * This method is the default implementation of the suspend action.
	 */
	def void suspend_execute(SuspendMethod method) {
		println(this.class.name + ":suspend_execute(" + method + ") - DO NOTHING")
	}
}

/**
 * This class implements an abstract Libvirt node manager.
 */
abstract class HypervisorManager extends ComputeStateMachine<Machine> {
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(HypervisorManager))

	/**
	 * Construct a  machine manager for a given  machine.
	 */
	new(Machine m) {
		super(m)
	}

	/**
	 * Return the  machine driver name.
	 */
	def abstract String getDriver()

	/**
	 * Append specific libvirt hypervisor driver parameters.
	 */
	def abstract void appendHypervisorParameters(String sb)

	/**
	 * Start Libvirt node.
	 */
	override def start_execute() {

		// Execute the -machine start command.
		val domainMarshaller = new DomainMarshaller
		domainMarshaller.loadUri
		var Connect connection = null;
		val String libvirtURI = domainMarshaller.uri.get(getDriver)
		if (libvirtURI != null) {
			LOGGER.info("Hypervisor URI is: {}", libvirtURI)
			try {

				// initialize connection to vm
				connection = new Connect(libvirtURI)

				// Create virtual machine XMl
				val vmDomain = domainMarshaller.createComputeDescription(this.compute)
				var String domainDescription = domainMarshaller.asString(vmDomain.getUuid)
				LOGGER.info("Domain description: " + domainDescription)
				// Check if machine exists 
				if (listMachines.contains(this.compute.name)) {
					val Domain domain = connection.domainLookupByName(this.compute.name)
					// start the machine
					domain.create()
					LOGGER.debug("VM with id {} is started.", domain.UUIDString)

					LOGGER.info("VM with id {} is running.", this.compute.id)

				} else { // The machine does not exist
				// create domain 
					val Domain domain = connection.domainDefineXML(domainDescription)
					domain.create()

					LOGGER.debug("VM with id {} is created.", domain.UUIDString)

					LOGGER.info("VM with id {} is running.", this.compute.id)
				}

				// TODO save hypervisor for stop, suspend and resume
				// methods
				// ComputeLocation location = new ComputeLocation(libvirtURI, this.compute);
				LOGGER.debug("closing connection to libvirt")
				connection.close
			} catch (Exception e) {
				LOGGER.error("Error while processing. ", e)
				this.compute.state = ComputeStatus.INACTIVE
				connection.close
			}
		}
	}

	/**
	 * Stop a libvirt node.
	 */
	override def stop_execute(StopMethod method) {

		// Stop libvirt node.
		val domainMarshaller = new DomainMarshaller
		domainMarshaller.loadUri
		var Connect connection = null;
		val String libvirtURI = domainMarshaller.uri.get(getDriver)
		if (libvirtURI != null) {
			LOGGER.info("Hypervisor URI is: {}", libvirtURI)
			try {
				var Domain domain = null
				// initialize connection to vm
				connection = new Connect(libvirtURI)
				// Check if machine exists 
				if (listMachines.contains(this.compute.name)) {
					domain = connection.domainLookupByName(this.compute.name)
					// stop the machine
					if (method == StopMethod.GRACEFUL) {
						domain.shutdown
					}
					if (method == StopMethod.POWEROFF) {
						domain.destroy
					}

					LOGGER.debug("VM with id {} is stopped.", domain.UUIDString)

					LOGGER.info("VM with id {} is going down.", this.compute.id)

				} else { // The machine does not exist
					domain = connection.domainLookupByUUIDString(this.compute.uuid)
					LOGGER.debug("going to shutdown vm {} through acpi-event", this.compute.id)
					if (method == StopMethod.GRACEFUL) {
						domain.shutdown
					}
					if (method == StopMethod.POWEROFF) {
						domain.destroy
					}
				}
				connection.close
			} catch (Exception e) {
				LOGGER.error("Exception caught: ", e)
				connection.close
			}
		}
		// Execute the -machine stop command.
		println("EXECUTE COMMAND:  machine stop " + compute.hostname);

	// TODO: must be implemented
	}

	/**
	 * Restart a libvirt node.
	 */
	override def restart_execute(RestartMethod method) {
		println("EXECUTE COMMAND:  machine restart " + compute.hostname)
		stop_execute(StopMethod.GRACEFUL)
		start_execute()
	}

	/**
	 * Suspend a libvirt node.
	 */
	override def suspend_execute(SuspendMethod method) {
		println("EXECUTE COMMAND:  machine suspend " + compute.hostname)
	// TODO: must be implemented
	}

	def List<String> listMachines() {
		val listMachines = newArrayList()

		val domainMarshaller = new DomainMarshaller
		domainMarshaller.loadUri
		var Connect connection = null;
		val String libvirtURI = domainMarshaller.uri.get("vbox")
		if (libvirtURI != null) {
			LOGGER.info("Hypervisor URI is: {}", libvirtURI)
			try {
				// initialize connection to vm
				connection = new Connect(libvirtURI)
				val String[] definedDomainNames = connection.listDefinedDomains()
				val int[] activeDomainIds = connection.listDomains
				// Get inactive domain
				for (String definedDomainName : definedDomainNames) {
					println(definedDomainName)
					val Domain inactiveDomain = connection.domainLookupByName(definedDomainName)
					listMachines.add(inactiveDomain.name)
				}
				// Get active domain
				for (int domainnId : activeDomainIds) {
					println(domainnId)
					val Domain activeDomain = connection.domainLookupByID(domainnId)
					listMachines.add(activeDomain.name)
				}
				connection.close
			} catch (LibvirtException e) {
				LOGGER.error("Exception caught: ", e)
				connection.close
			}
		}

		return listMachines

	}
}

/**
 * This class implements an abstract JClouds node manager.
 */
abstract class JCloudsManager extends ComputeStateMachine<Compute> {

	/**
	 * Construct a  machine manager for a given  machine.
	 */
	new(Compute m) {
		super(m)
	}

	/**
	 * Return the JClouds machine driver name.
	 */
	def abstract String getDriverName()

	/**
	 * Append specific JClouds machine driver parameters.
	 */
	def abstract void appendDriverParameters(StringBuilder sb)

	/**
	 * Start JClouds node.
	 */
	override def start_execute() {
		// Execute the -machine start command.
	}

	/**
	 * Stop a JClouds node.
	 */
	override def stop_execute(StopMethod method) {

		// Stop libvirt node.
		if (method == StopMethod.GRACEFUL) {
		}

		// Execute the -machine stop command.
		println("EXECUTE COMMAND:  machine stop " + compute.hostname);

	// TODO: must be implemented
	}

	/**
	 * Restart a JClouds node.
	 */
	override def restart_execute(RestartMethod method) {
		println("EXECUTE COMMAND:  machine restart " + compute.hostname);

	// TODO: must be implemented
	}

	/**
	 * Suspend a JClouds node.
	 */
	override def suspend_execute(SuspendMethod method) {
		println("EXECUTE COMMAND:  machine suspend " + compute.hostname);

	// TODO: must be implemented
	}
}

class ExecutableMachine extends MachineImpl {
	protected String driver = "vbox"

	// val stateMachine = new ComputeStateMachine<Compute>(this)
	/**
	 * The hypervisor manager.
	 */
	val manager = new HypervisorManager(this) {
		override def getDriver() {
			"vbox" // TODO: check driver name
		}

		override def appendHypervisorParameters(String sb) {

			// TODO: must be implemented
			throw new UnsupportedOperationException
		}

	}

	// Delegation to the container state machine.
	override def start() { manager.start }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def String getDriver() { manager.driver }
}

class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl {
	protected String driver = "vbox"

	// val stateMachine = new ComputeStateMachine<Compute>(this)
	/**
	 * The hypervisor manager.
	 */
	val manager = new HypervisorManager(this) {
		override def getDriver() {
			"vbox" // TODO: check driver name
		}

		override def appendHypervisorParameters(String sb) {
			// TODO Check not null of attributes
			throw new UnsupportedOperationException
		}

	}

	// Delegation to the container state machine.
	override def start() { manager.start }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }

	def String getDriver() { manager.driver }

}

class ExecutableHypervisorModel {
	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableHypervisorModel))
	var public Machine machine
	var public Configuration configuration
	var public Machine_VirtualBox machine_VirtualBox

	new() {
	}

	new(Machine machine) {
		this.machine = machine
		if (machine instanceof Machine_VirtualBox) {
			machine_VirtualBox = machine
		}
	}

	new(Configuration configuration) {
		this.configuration = configuration
	}

	def void start() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.start
			return;
		}
		if (machine_VirtualBox != null) {
			machine_VirtualBox.start
			return;
		}

	}

	def void stop() {
		if (machine_VirtualBox != null) {
			(machine_VirtualBox as ExecutableMachine_VirtualBox).stop(StopMethod.GRACEFUL)
			return;
		}
	}

	def void restart() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.restart(RestartMethod.GRACEFUL)
			return;
		}
	}

	def void connectToVMWARE() {
		val int connectFlags = 0
		val domainMarshaller = new DomainMarshaller
		domainMarshaller.loadUri
		var Connect connection = null;
		val String libvirtURI = domainMarshaller.uri.get("vmware")
		if (libvirtURI != null) {
			LOGGER.info("Hypervisor URI is: {}", libvirtURI)
			try {
				// Auth
				// val ConnectAuth cAuth = new ConnectAuthDefault()
				val ConnectAuth cAuth = new CustomsConnectAuth("!Scalair1!")
				// initialize connection to vm
				connection = new Connect(libvirtURI, cAuth, connectFlags)
				val String[] inactiveDomainNames = connection.listDefinedDomains()
				val int[] activeDomainIds = connection.listDomains
				// Get inactive domain
				for (String definedDomainName : inactiveDomainNames) {
					println(definedDomainName)
					val Domain inactiveDomain = connection.domainLookupByName(definedDomainName)
//					println(inactiveDomain.getXMLDesc(0))
					val machineExistInModeler = containMachine(inactiveDomain.name)
					if (!machineExistInModeler) {
						buildModel(inactiveDomain) // Create the machine in stopped state
					}
				}
				// Get active domain
				for (int domainnId : activeDomainIds) {
					println(domainnId)
					val Domain activeDomain = connection.domainLookupByID(domainnId)
					val machineExistInModeler = containMachine(activeDomain.name)
					if (!machineExistInModeler) {
						buildModel(activeDomain) // Create the machine in running state
					}
				}
				connection.close
			} catch (LibvirtException e) {
				LOGGER.error("Exception caught: ", e)
				if (connection != null) {
					connection.close
				}
			}
		}

	}

	def void importModel() {
		val domainMarshaller = new DomainMarshaller
		domainMarshaller.loadUri
		var Connect connection = null;
		val String libvirtURI = domainMarshaller.uri.get("vbox")
		if (libvirtURI != null) {
			LOGGER.info("Hypervisor URI is: {}", libvirtURI)
			try {
				// initialize connection to vm
				connection = new Connect(libvirtURI)
				val String[] definedDomainNames = connection.listDefinedDomains()
				val int[] activeDomainIds = connection.listDomains
				// Get inactive domain
				for (String definedDomainName : definedDomainNames) {
					println(definedDomainName)
					val Domain inactiveDomain = connection.domainLookupByName(definedDomainName)
//					println(inactiveDomain.getXMLDesc(0))
					val machineExistInModeler = containMachine(inactiveDomain.name)
					if (!machineExistInModeler) {
						buildModel(inactiveDomain) // Create the machine in stopped state
					}
				}
				// Get active domain
				for (int domainnId : activeDomainIds) {
					println(domainnId)
					val Domain activeDomain = connection.domainLookupByID(domainnId)
					val machineExistInModeler = containMachine(activeDomain.name)
					if (!machineExistInModeler) {
						buildModel(activeDomain) // Create the machine in running state
					}
				}
				connection.close
			} catch (LibvirtException e) {
				LOGGER.error("Exception caught: ", e)
				connection.close
			}
		}

	}

	def void buildModel(Domain domain) {
		var machine = getModel(domain)
		this.configuration.resources.add(machine)
	}

	def Machine getModel(Domain domain) {
		var vbox = getmodelEClass.get("virtualbox") // TODO use dynamic driver name.
		if (vbox instanceof Machine_VirtualBox) {
			var newvbox = vbox as Machine_VirtualBox

			// Set values
			machineFactory_VBOX(newvbox, domain)
			LOGGER.info("Model setting: " + newvbox)
			return newvbox
		}
	}

	def void machineFactory_VBOX(Machine_VirtualBox vbox, Domain domain) {
		vbox.name = domain.name
//		println(domain.getXMLDesc(1))
		println(domain.info.state.name)
		// VIR_DOMAIN_SHUTOFF
		// VIR_DOMAIN_RUNNING
		vbox.memory = domain.info.memory as float
		vbox.cores = domain.info.nrVirtCpu
		if (domain.info.state.name == "VIR_DOMAIN_RUNNING") {
			vbox.state = ComputeStatus.get(0)
		}
		if (domain.info.state.name == "VIR_DOMAIN_SHUTOFF") {
			vbox.state = ComputeStatus.get(1)
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

	def getmodelEClass() {
		val Map<String, Machine> m = new HashMap

		// TODO verify the good driver name
		m.put("virtualbox", HypervisorFactory.eINSTANCE.createMachine_VirtualBox)
//		m.put("microsofthyperv", HypervisorFactory.eINSTANCE.createMachine_Microsoft_Hyper_V)
//		m.put("openstack", HypervisorFactory.eINSTANCE.createMachine_OpenStack)
//		m.put("vmwarefusion", HypervisorFactory.eINSTANCE.createMachine_VMware_Fusion)
//		m.put("vmwarevcloud", HypervisorFactory.eINSTANCE.createMachine_VMware_vCloud_Air)
//		m.put("vmwaresphere", HypervisorFactory.eINSTANCE.createMachine_VMware_vSphere)
		return m
	}

}

class ExecutableJcloudsModel {
}

class LibvirtExecutableModel {
	def static void main(String[] args) {

		// Initialize the executable Docker factory.
		ExecutableHypervisorFactory.init

//		// Import
		val main = new ExecutableHypervisorModel()
		main.connectToVMWARE
//		main.importModel
	/*
	 * // Obtain the Infrastructure package factory.
	 * val factory = HypervisorPackage.eINSTANCE.hypervisorFactory
	 * 
	 * // Create a VirtualBox machine.
	 * val machine = factory.createMachine_VirtualBox
	 * machine.name = "libvirt-machine-b"
	 * machine.hostname = machine.id
	 * machine.memory = 654321f
	 * machine.cores = 2
	 * 
	 * // Create Interface
	 * val network = factory.createInterface
	 * network.type = 'bridge'
	 * network.label = "en0" // Set ethx for linux
	 * network.model = "82540EM"
	 * network.mac_addresss = '00:0c:29:76:78:50'
	 * 
	 * // Put the network inside the machine.
	 * val contains = factory.createContains
	 * contains.target = network
	 * machine.links.add(contains)
	 * 
	 * // Create Disk
	 * val disk = factory.createDisk
	 * disk.device = "cdrom"
	 * disk.source = "/Users/spirals/Downloads/ubuntu-14.04-server-i386.iso"
	 * 
	 */
//		disk.target = ""
	/*
	 * // Create Network
	 * val network = factory.createEthernet
	 * network.label = "en0" // Set ethx for linux
	 * 
	 * // NetworkLink
	 * val networkInterface = factory.createInterface
	 * networkInterface.target = network
	 * 
	 * //		networkInterface.mac = value
	 * machine.links.add(networkInterface)
	 * 
	 * // Create storage
	 * val storage = factory.createStorage
	 * 
	 * // StorageLink
	 * val storageLink = factory.createStoragelink
	 * 
	 * //		storageLink.deviceid = value
	 * storageLink.target = storage
	 * machine.links.add(storageLink)
	 */
//		machine.start
	}

}
