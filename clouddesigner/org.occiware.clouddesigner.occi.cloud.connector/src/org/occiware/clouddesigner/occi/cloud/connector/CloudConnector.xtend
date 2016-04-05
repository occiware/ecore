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
package org.occiware.clouddesigner.occi.cloud.connector

import org.occiware.clouddesigner.occi.cloud.impl.CloudFactoryImpl
import org.occiware.clouddesigner.occi.cloud.CloudPackage
import org.occiware.clouddesigner.occi.infrastructure.Compute
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
import org.occiware.clouddesigner.occi.infrastructure.StopMethod
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod
import org.occiware.clouddesigner.occi.cloud.impl.MachineImpl
import org.occiware.clouddesigner.occi.cloud.Machine
import org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_CloudSigmaImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_GogridImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_ProfitBricksImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_RackSpaceImpl
import org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl

import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.occiware.clouddesigner.occi.Configuration
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2
import org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma
import org.occiware.clouddesigner.occi.cloud.Machine_GCE
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer
import org.occiware.clouddesigner.occi.cloud.Machine_Gogrid
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace
import org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.JcloudsOpenStack
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.JcloudsRackSpace

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
class ExecutableCloudFactory extends CloudFactoryImpl {
	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableCloudFactory))

	/**
	 * Initialize the ExecutableDockerFactory singleton.
	 */
	def static init() {
		// Replace the default generated factory of the Docker package by an executable docker factory.
		val factory = new ExecutableCloudFactory
		CloudPackage.eINSTANCE.setEFactoryInstance(factory)
		return factory
	}

	/**
	 * Create an executable Machine instance.
	 */
	override def createMachine() {
		LOGGER.info(this.class.name + ":createMachine()");
		new ExecutableMachine;
	}

	/**
	 * Create an executable Machine_Amazon_EC2 instance.
	 */
	override def createMachine_Amazon_EC2() {
		LOGGER.info(this.class.name + ":createMachine_Amazon_EC2()");
		new ExecutableMachine_Amazon_EC2;
	}

	/**
	 * Create an executable CloudSigma instance.
	 */
	override def createMachine_CloudSigma() {
		LOGGER.info(this.class.name + ":createMachine_CloudSigma()");
		new ExecutableMachine_CloudSigma
	}

	/**
	 * Create an executable Gogrid instance.
	 */
	override def createMachine_Gogrid() {
		LOGGER.info(this.class.name + ":createMachine_Gogrid()");
		new ExecutableMachine_Gogrid
	}

	/**
	 * Create an executable HP Helion instance.
	 */
	override def createMachine_Hp_Helion() {
		LOGGER.info(this.class.name + ":createMachine_Hp_Helion()");
		new ExecutableMachine_Hp_Helion
	}

	/**
	 * Create an executable Google Compute Engine instance.
	 */
	override def createMachine_GCE() {
		LOGGER.info(this.class.name + ":createMachine_GCE()");
		new ExecutableMachine_GCE
	}

	/**
	 * Create an executable RackSpace instance.
	 */
	override def createMachine_RackSpace() {
		LOGGER.info(this.class.name + ":createMachine_RackSpace()");
		new ExecutableMachine_RackSpace
	}

	/**
	 * Create an executable ProfitBrikcs instance.
	 */
	override def createMachine_ProfitBricks() {
		LOGGER.info(this.class.name + ":createMachine_ProfitBricks()");
		new ExecutableMachine_ProfitBricks
	}

	/**
	 * Create an executable OpenStack instance.
	 */
	override def createMachine_OpenStack() {
		LOGGER.info(this.class.name + ":createMachine_OpenStack()");
		new ExecutableMachine_OpenStack
	}

	/**
	 * Create an executable SoftLayer instance.
	 */
	override def createMachine_SoftLayer() {
		LOGGER.info(this.class.name + ":createMachine_SoftLayer()");
		new ExecutableMachine_SoftLayer
	}
}

/**
 * This class implements the state machine of any Compute resource.
 */
class ComputeStateMachine<T extends Compute> {
	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ComputeStateMachine))

	/**
	 * Reference to the Compute resource.
	 */
	protected T compute;

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
		LOGGER.info(this.class.name + ":start() - current state is " + compute.state);
		if (compute.state == ComputeStatus.INACTIVE) {
			start_from_inactive_state()
			compute.state = ComputeStatus.ACTIVE
			LOGGER.info(this.class.name + ":start() - move from inactive to active state");
		} else if (compute.state == ComputeStatus.ACTIVE) {
			start_from_active_state()
			LOGGER.info(this.class.name + ":start() - already active state")
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			start_from_suspended_state()
			compute.state = ComputeStatus.ACTIVE
			LOGGER.info(this.class.name + ":start() - move from suspended to active state")
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":start() - final state is " + compute.state);
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
		LOGGER.info(this.class.name + ":start_from_active_state() - DO NOTHING");
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
		LOGGER.info(this.class.name + ":start_execute() - DO NOTHING");
	}

	/**
	 * Stop OCCI Action.
	 */
	def stop(StopMethod method) {
		LOGGER.info(this.class.name + ":stop(" + method + ") - current state is " + compute.state);
		if (compute.state == ComputeStatus.INACTIVE) {
			stop_from_inactive_state(method)
			LOGGER.info(this.class.name + ":stop() - already inactive state");
		} else if (compute.state == ComputeStatus.ACTIVE) {
			stop_from_active_state(method)
			compute.state = ComputeStatus.INACTIVE
			LOGGER.info(this.class.name + ":stop() - move from active to inactive state")
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			stop_from_suspended_state(method)
			compute.state = ComputeStatus.INACTIVE
			LOGGER.info(this.class.name + ":stop() - move from suspended to inactive state")
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":stop() - final state is " + compute.state);
		if(compute.state != ComputeStatus.INACTIVE) throw new RuntimeException("Must never happen!")
	}

	/**
	 * This method implements the transition from inactive state for the stop action.
	 * 
	 * By default, this method does nothing.
	 */
	def stop_from_inactive_state(StopMethod method) {
		LOGGER.info(this.class.name + ":stop_from_inactive_state() - DO NOTHING");
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
		LOGGER.info(this.class.name + ":stop_execute(" + method + ") -DO NOTHING");
	}

	/**
	 * Restart OCCI Action.
	 */
	def restart(RestartMethod method) {
		LOGGER.info(this.class.name + ":restart(" + method + ") - current state is " + compute.state);
		if (compute.state == ComputeStatus.INACTIVE) {
			restart_from_inactive_state(method)
			compute.state = ComputeStatus.ACTIVE
			LOGGER.info(this.class.name + ":restart(" + method + ')' + " - move from inactive to active state");
		} else if (compute.state == ComputeStatus.ACTIVE) {
			restart_from_active_state(method)
			compute.state = ComputeStatus.ACTIVE
			LOGGER.info(this.class.name + ":restart(" + method + ')' + " - move from active to active state")
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			restart_from_suspended_state(method)
			compute.state = ComputeStatus.ACTIVE
			LOGGER.info(this.class.name + ":stop() - move from suspended to active state")
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":restart(" + method + ')' + " - final state is " + compute.state);
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
		LOGGER.info(this.class.name + ":restart_execute(" + method + ") - DO NOTHING");
	}

	/**
	 * Suspend OCCI Action.
	 */
	def suspend(SuspendMethod method) {
		LOGGER.info(this.class.name + ":suspend(" + method + ") - current state is " + compute.state);
		if (compute.state == ComputeStatus.INACTIVE) {
			suspend_from_inactive_state(method)
			compute.state = ComputeStatus.SUSPENDED
			LOGGER.info(this.class.name + ":suspend() - move from inactive to suspended state");
		} else if (compute.state == ComputeStatus.ACTIVE) {
			suspend_from_active_state(method)
			compute.state = ComputeStatus.SUSPENDED
			LOGGER.info(this.class.name + ":suspend() - move from active to suspended state")
		} else if (compute.state == ComputeStatus.SUSPENDED) {
			suspend_from_suspended_state(method)
			LOGGER.info(this.class.name + ":suspend() - already suspended state")
		} else {
			throw new RuntimeException("Must never happen!")
		}
		LOGGER.info(this.class.name + ":suspend() - final state is " + compute.state);
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
		LOGGER.info(this.class.name + ":suspend_from_suspended_state() - DO NOTHING");
	}

	/**
	 * This method is the default implementation of the suspend action.
	 */
	def void suspend_execute(SuspendMethod method) {
		LOGGER.info(this.class.name + ":suspend_execute(" + method + ") - DO NOTHING");
	}
}

/**
 * This class implements an executable machine.
 */
class ExecutableMachine extends MachineImpl {
	val stateMachine = new ComputeStateMachine<Machine>(this)

	// Delegation to the state machine.
	override def start() { stateMachine.start }

	override def stop(StopMethod method) { stateMachine.stop(method) }

	override def restart(RestartMethod method) { stateMachine.restart(method) }

	override def suspend(SuspendMethod method) { stateMachine.suspend(method) }
}

/**
 * This class implements an abstract machine manager.
 */
abstract class MachineManager extends ComputeStateMachine<Machine> {
	// Initialize logger for ExecutableMachineModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(MachineManager))
	protected Machine machine

	/**
	 * Construct a machine manager for a given machine.
	 */
	new(Machine m) {
		super(m)
		this.machine = m
	}

	/**
	 * Return the machine provider name.
	 */
	def abstract String getDriverName()

	/**
	 * Start a Cloud machine.
	 */
	override def start_execute() {

		LOGGER.info("STARTING MACHINE: " + this.compute.name)
		// Performs start on machine according to the provider
		if (this.compute instanceof Machine_OpenStack) {
			var provider = new JcloudsOpenStack(this.compute as Machine_OpenStack)
			provider.launchMachine
		} else if (this.compute instanceof Machine_Amazon_EC2) {
			// TODO
		} else if (this.compute instanceof Machine_CloudSigma) {
			// TODO
		} else if (this.compute instanceof Machine_GCE) {
			// TODO
		} else if (this.compute instanceof Machine_SoftLayer) {
			// TODO
		} else if (this.compute instanceof Machine_Gogrid) {
			// TODO
		} else if (this.compute instanceof Machine_Hp_Helion) {
			// TODO
		} else if (this.compute instanceof Machine_RackSpace) {
			var provider = new JcloudsRackSpace(this.compute as Machine_RackSpace)
			provider.launchMachine
		} else if (this.compute instanceof Machine_ProfitBricks) {
			// TODO
		}
		LOGGER.info("MACHINE: " + this.compute.name + " is started ...")

	}

	/**
	 * Stop a Cloud machine.
	 */
	override def stop_execute(StopMethod method) {
		// Stop all this machine.
		if (method == StopMethod.GRACEFUL) {
			// DO SOMETHING HERE
			if (this.compute instanceof Machine_OpenStack) {
				var provider = new JcloudsOpenStack
				provider.stopMachine(this.compute.id)
			} else if (this.compute instanceof Machine_Amazon_EC2) {
				// TODO
			} else if (this.compute instanceof Machine_CloudSigma) {
				// TODO
			} else if (this.compute instanceof Machine_GCE) {
				// TODO
			} else if (this.compute instanceof Machine_SoftLayer) {
				// TODO
			} else if (this.compute instanceof Machine_Gogrid) {
				// TODO
			} else if (this.compute instanceof Machine_Hp_Helion) {
				// TODO
			} else if (this.compute instanceof Machine_RackSpace) {
				// TODO			
			} else if (this.compute instanceof Machine_ProfitBricks) {
				// TODO
			}
		}

		LOGGER.info("EXECUTE STOP COMMAND on: " + compute.name);
	}

	/**
	 * Restart a Docker machine.
	 */
	override def restart_execute(RestartMethod method) {
		LOGGER.info("EXECUTE STOP COMMAND on: " + compute.name);
	// TODO: must be implemented
	}

	/**
	 * Suspend a Docker machine.
	 */
	override def suspend_execute(SuspendMethod method) {
		LOGGER.info("EXECUTE COMMAND: docker machine suspend " + compute.name);
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
	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on CloudSigma.
 */
class ExecutableMachine_CloudSigma extends Machine_CloudSigmaImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"cloudsigma" // TODO: check driver name
		}
	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Google COmpute Engine.
 */
class ExecutableMachine_GCE extends Machine_GCEImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"googlece" // TODO: check driver name
		}
	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Gogrid.
 */
class ExecutableMachine_Gogrid extends Machine_GogridImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"gogrid" // TODO: check driver name
		}
	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on HP Helion.
 */
class ExecutableMachine_Hp_Helion extends Machine_Hp_HelionImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"hphelion" // TODO: check driver name
		}

	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Machine on OpenStack.
 */
class ExecutableMachine_OpenStack extends Machine_OpenStackImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"openstack" // TODO: check driver name
		}

	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on ProfitBricks.
 */
class ExecutableMachine_ProfitBricks extends Machine_ProfitBricksImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"profitbricks" // TODO: check driver name
		}

	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on RackSapce.
 */
class ExecutableMachine_RackSpace extends Machine_RackSpaceImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"rackspace" // TODO: check driver name
		}

	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on SoftLayer.
 */
class ExecutableMachine_SoftLayer extends Machine_SoftLayerImpl {
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this) {
		override def getDriverName() {
			"softlayer" // TODO: check driver name
		}

	}

	// Delegation to the manager.
	override def start() { manager.start() }

	override def stop(StopMethod method) { manager.stop(method) }

	override def restart(RestartMethod method) { manager.restart(method) }

	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

class ExecutableCloudModel {

	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ExecutableCloudModel))
	var public Machine machine
	var public Configuration configuration
	var public Machine_Amazon_EC2 machine_Amazon_EC2
	var public Machine_CloudSigma machine_CloudSigma
	var public Machine_GCE machine_GCE
	var public Machine_SoftLayer machine_SoftLayer
	var public Machine_Gogrid machine_Gogrid
	var public Machine_Hp_Helion machine_Hp_Helion
	var public Machine_OpenStack machine_OpenStack
	var public Machine_RackSpace machine_RackSpace
	var public Machine_ProfitBricks machine_ProfitBricks

	new() {
	}

	new(Machine machine) {
		this.machine = machine
		if (machine instanceof Machine_Amazon_EC2) {
			machine_Amazon_EC2 = machine
		} else if (machine instanceof Machine_CloudSigma) {
			machine_CloudSigma = machine
		} else if (machine instanceof Machine_GCE) {
			machine_GCE = machine
		} else if (machine instanceof Machine_SoftLayer) {
			machine_SoftLayer = machine
		} else if (machine instanceof Machine_Gogrid) {
			machine_Gogrid = machine
		} else if (machine instanceof Machine_Hp_Helion) {
			machine_Hp_Helion = machine
		} else if (machine instanceof Machine_RackSpace) {
			machine_RackSpace = machine
		} else if (machine instanceof Machine_OpenStack) {
			machine_OpenStack = machine
		} else if (machine instanceof Machine_ProfitBricks) {
			machine_ProfitBricks = machine
		}
	}

	new(Configuration configuration) {
		this.configuration = configuration
	}

	def void start() {
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.start
			return;
		}
		if (machine_CloudSigma != null) {
			machine_CloudSigma.start
			return;
		}
		if (machine_GCE != null) {
			machine_GCE.start
			return
		}
		if (machine_SoftLayer != null) {
			machine_SoftLayer.start
			return;
		}
		if (machine_Gogrid != null) {
			machine_Gogrid.start
			return;
		}
		if (machine_Hp_Helion != null) {
			machine_Hp_Helion.start
			return;
		}
		if (machine_RackSpace != null) {
			machine_RackSpace.start
			return
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.start
			return;
		}

		if (machine_ProfitBricks != null) {
			machine_ProfitBricks.start
			return
		}

	}

	def void stop() {
		if (machine_Amazon_EC2 != null) {
			(machine_Amazon_EC2 as ExecutableMachine_Amazon_EC2).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_CloudSigma != null) {
			(machine_CloudSigma as ExecutableMachine_CloudSigma).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_GCE != null) {
			(machine_GCE as ExecutableMachine_GCE).stop(StopMethod.GRACEFUL)
			return
		}
		if (machine_SoftLayer != null) {
			(machine_SoftLayer as ExecutableMachine_SoftLayer).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Gogrid != null) {
			(machine_Gogrid as ExecutableMachine_Gogrid).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_Hp_Helion != null) {
			(machine_Hp_Helion as ExecutableMachine_Hp_Helion).stop(StopMethod.GRACEFUL)
			return;
		}
		if (machine_RackSpace != null) {
			(machine_RackSpace as ExecutableMachine_RackSpace).stop(StopMethod.GRACEFUL)
			return
		}

		if (machine_OpenStack != null) {
			(machine_OpenStack as ExecutableMachine_OpenStack).stop(StopMethod.GRACEFUL)
			return
		}

		if (machine_ProfitBricks != null) {
			(machine_ProfitBricks as ExecutableMachine_ProfitBricks).stop(StopMethod.GRACEFUL)
			return;
		}

	}

	def void restart() {
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_CloudSigma != null) {
			machine_CloudSigma.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_GCE != null) {
			machine_GCE.restart(RestartMethod.GRACEFUL)
			return
		}
		if (machine_SoftLayer != null) {
			machine_SoftLayer.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Gogrid != null) {
			machine_Gogrid.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_Hp_Helion != null) {
			machine_Hp_Helion.restart(RestartMethod.GRACEFUL)
			return;
		}
		if (machine_RackSpace != null) {
			machine_RackSpace.restart(RestartMethod.GRACEFUL)
			return
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.restart(RestartMethod.GRACEFUL)
			return;
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.restart(RestartMethod.GRACEFUL)
			return
		}

		if (machine_ProfitBricks != null) {
			machine_ProfitBricks.restart(RestartMethod.GRACEFUL)
			return;
		}

	}

	def void importModel() {
		// TODO
	}

}
