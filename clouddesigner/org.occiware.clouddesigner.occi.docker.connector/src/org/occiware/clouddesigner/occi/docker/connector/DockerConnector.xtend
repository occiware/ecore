/**
 * This file contains the OCCIware Docker connector.
 *
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 *
 * Copyright 2015 - Inria
 *
 * Contributors:
 * - Philippe Merle - Inria
 */
package org.occiware.clouddesigner.occi.docker.connector

import org.occiware.clouddesigner.OCCI.Link
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Contains
import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.occiware.clouddesigner.occi.docker.Machine
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

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
class ExecutableDockerFactory extends DockerFactoryImpl
{
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
		System.out.println(this.class.name + ":createContainer()");
		new ExecutableContainer;
	}

	/**
	 * Create an executable Machine instance.
	 */
	override def createMachine() {
		System.out.println(this.class.name + ":createMachine()");
		new ExecutableMachine;
	}

	/**
	 * Create an executable Machine_Amazon_EC2 instance.
	 */
	override def createMachine_Amazon_EC2() {
		System.out.println(this.class.name + ":createMachine_Amazon_EC2()");
		new ExecutableMachine_Amazon_EC2;
	}

	/**
	 * Create an executable Machine_Digital_Ocean instance.
	 */
	override def createMachine_Digital_Ocean() {
		System.out.println(this.class.name + ":createMachine_Digital_Ocean()");
		new ExecutableMachine_Digital_Ocean;
	}

	/**
	 * Create an executable Machine_Google_Compute_Engine instance.
	 */
	override def createMachine_Google_Compute_Engine() {
		System.out.println(this.class.name + ":createMachine_Google_Compute_Engine()");
		new ExecutableMachine_Google_Compute_Engine;
	}

	/**
	 * Create an executable Machine_IBM_SoftLayer instance.
	 */
	override def createMachine_IBM_SoftLayer() {
		System.out.println(this.class.name + ":createMachine_IBM_SoftLayer()");
		new ExecutableMachine_IBM_SoftLayer;
	}

	/**
	 * Create an executable Machine_Microsoft_Azure instance.
	 */
	override def createMachine_Microsoft_Azure() {
		System.out.println(this.class.name + ":createMachine_Microsoft_Azure()");
		new ExecutableMachine_Microsoft_Azure;
	}

	/**
	 * Create an executable Machine_Microsoft_Hyper_V instance.
	 */
	override def createMachine_Microsoft_Hyper_V() {
		System.out.println(this.class.name + ":createMachine_Microsoft_Hyper_V()");
		new ExecutableMachine_Microsoft_Hyper_V;
	}

	/**
	 * Create an executable Machine_OpenStack instance.
	 */
	override def createMachine_OpenStack() {
		System.out.println(this.class.name + ":createMachine_OpenStack()");
		new ExecutableMachine_OpenStack;
	}

	/**
	 * Create an executable Machine_Rackspace instance.
	 */
	override def createMachine_Rackspace() {
		System.out.println(this.class.name + ":createMachine_Rackspace()");
		new ExecutableMachine_Rackspace;
	}

	/**
	 * Create an executable Machine_VirtualBox instance.
	 */
	override def createMachine_VirtualBox() {
		System.out.println(this.class.name + ":createMachine_VirtualBox()");
		new ExecutableMachine_VirtualBox;
	}

	/**
	 * Create an executable Machine_VMware_Fusion instance.
	 */
	override def createMachine_VMware_Fusion() {
		System.out.println(this.class.name + ":createMachine_VMware_Fusion()");
		new ExecutableMachine_VMware_Fusion;
	}

	/**
	 * Create an executable Machine_VMware_vCloud_Air instance.
	 */
	override def createMachine_VMware_vCloud_Air() {
		System.out.println("ExecutableDockerFactory:createMachine_VMware_vCloud_Air()");
		new ExecutableMachine_VMware_vCloud_Air;
	}

	/**
	 * Create an executable Machine_VMware_vSphere instance.
	 */
	override def createMachine_VMware_vSphere() {
		System.out.println(this.class.name + ":createMachine_VMware_vSphere()");
		new ExecutableMachine_VMware_vSphere;
	}
}

/**
 * This class implements the state machine of any Compute resource.
 */
class ComputeStateMachine<T extends Compute>
{
	/**
	 * Reference to the Compute resource.
	 */
	protected T compute;

	/**
	 * Construct a compute state machine for a given Compute resource.
	 */
	new(T c) { compute = c }

	/**
	 * Start OCCI Action.
	 */
	def start() {
		System.out.println(this.class.name + ":start() - current state is " + compute.state);
		if(compute.state == ComputeStatus.INACTIVE) {
			System.out.println(this.class.name + ":start() - move from inactive to active state");
			start_from_inactive_state()
  			compute.state = ComputeStatus.ACTIVE
		} else
		if(compute.state == ComputeStatus.ACTIVE) {
			System.out.println(this.class.name + ":start() - already active state")
			start_from_active_state()
		} else
		if(compute.state == ComputeStatus.SUSPENDED) {
			System.out.println(this.class.name + ":start() - move from suspended to active state" )
			start_from_suspended_state()
  			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		System.out.println(this.class.name + ":start() - final state is " + compute.state);
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
		System.out.println(this.class.name + ":start_from_active_state() - DO NOTHING");
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
		System.out.println(this.class.name + ":start_execute() - DO NOTHING");
    }
 
	/**
	 * Stop OCCI Action.
	 */
	def stop(StopMethod method) {
		System.out.println(this.class.name + ":stop(" + method + ") - current state is " + compute.state);
		if(compute.state == ComputeStatus.INACTIVE) {
			System.out.println(this.class.name + ":stop() - already inactive state");
			stop_from_inactive_state(method)
		} else
		if(compute.state == ComputeStatus.ACTIVE) {
			System.out.println(this.class.name + ":stop() - move from active to inactive state")
			stop_from_active_state(method)
  			compute.state = ComputeStatus.INACTIVE
		} else
		if(compute.state == ComputeStatus.SUSPENDED) {
			System.out.println(this.class.name + ":stop() - move from suspended to inactive state" )
			stop_from_suspended_state(method)
  			compute.state = ComputeStatus.INACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		System.out.println(this.class.name + ":stop() - final state is " + compute.state);
		if(compute.state != ComputeStatus.INACTIVE) throw new RuntimeException("Must never happen!")  
	}

	/**
	 * This method implements the transition from inactive state for the stop action.
	 * 
	 * By default, this method does nothing.
	 */
	def stop_from_inactive_state(StopMethod method) {
		System.out.println(this.class.name + ":stop_from_inactive_state() - DO NOTHING");
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
		System.out.println(this.class.name + ":stop_execute(" + method + ") - DO NOTHING");
    }

	/**
	 * Restart OCCI Action.
	 */
	def restart(RestartMethod method) {
		System.out.println(this.class.name + ":restart(" + method + ") - current state is " + compute.state);
		if(compute.state == ComputeStatus.INACTIVE) {
			System.out.println(this.class.name + ":restart(" + method + ')' + " - move from inactive to active state");
			restart_from_inactive_state(method)
  			compute.state = ComputeStatus.ACTIVE
  		} else
		if(compute.state == ComputeStatus.ACTIVE) {
			System.out.println(this.class.name + ":restart(" + method + ')' + " - move from active to active state")
			restart_from_active_state(method)
  			compute.state = ComputeStatus.ACTIVE
		} else
		if(compute.state == ComputeStatus.SUSPENDED) {
			System.out.println(this.class.name + ":stop() - move from suspended to active state" )
			restart_from_suspended_state(method)
  			compute.state = ComputeStatus.ACTIVE
		} else {
			throw new RuntimeException("Must never happen!")
		}
		System.out.println(this.class.name + ":restart(" + method + ')' + " - final state is " + compute.state);
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
		System.out.println(this.class.name + ":restart_execute(" + method + ") - DO NOTHING");
    }
    
	/**
	 * Suspend OCCI Action.
	 */
	def suspend(SuspendMethod method) {
		System.out.println(this.class.name + ":suspend(" + method + ") - current state is " + compute.state);
		if(compute.state == ComputeStatus.INACTIVE) {
			System.out.println(this.class.name + ":suspend() - move from inactive to suspended state");
			suspend_from_inactive_state(method)
  			compute.state = ComputeStatus.SUSPENDED
		} else
		if(compute.state == ComputeStatus.ACTIVE) {
			System.out.println(this.class.name + ":suspend() - move from active to suspended state")
			suspend_from_active_state(method)
  			compute.state = ComputeStatus.SUSPENDED
		} else
		if(compute.state == ComputeStatus.SUSPENDED) {
			System.out.println(this.class.name + ":suspend() - already suspended state" )
			suspend_from_suspended_state(method)
		} else {
			throw new RuntimeException("Must never happen!")
		}
		System.out.println(this.class.name + ":suspend() - final state is " + compute.state);
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
		System.out.println(this.class.name + ":suspend_from_suspended_state() - DO NOTHING");
	}
	
	/**
	 * This method is the default implementation of the suspend action.
	 */
    def void suspend_execute(SuspendMethod method) {
		System.out.println(this.class.name + ":suspend_execute(" + method + ") - DO NOTHING");
    }
}

/**
 * This class implements an executable Docker container.
 */
class ExecutableContainer extends ContainerImpl
{
	/**
	 * Docker containers have a state machine.
	 */
	val stateMachine = new ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container>(this)
	{
		/**
		 * Start the Docker container.
		 */
    	override def start_execute() {
    		System.out.println("EXECUTE container start")
    	}

		/**
		 * Stop the Docker container.
		 */
   		override def stop_execute(StopMethod method) {
    		System.out.println("EXECUTE container stop")
   		}

		/**
		 * Restart the Docker container.
		 */
   		override def restart_execute(RestartMethod method) {
    		System.out.println("EXECUTE container restart")
   		}

		/**
		 * Suspend the Docker container.
		 */
   		override def suspend_execute(SuspendMethod method) {
    		System.out.println("EXECUTE container suspend")   			
   		}
	}

    // Delegation to the container state machine.
	override def start() { stateMachine.start }
	override def stop(StopMethod method) { stateMachine.stop(method) }
	override def restart(RestartMethod method) { stateMachine.restart(method) }
	override def suspend(SuspendMethod method) { stateMachine.suspend(method) }
}

/**
 * This class implements an executable Docker machine.
 */
class ExecutableMachine extends MachineImpl
{
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
abstract class MachineManager extends ComputeStateMachine<Machine>
{
	/**
	 * Construct a Docker machine manager for a given Docker machine.
	 */
    new(Machine m) { super(m) }

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
		// Execute the docker-machine start command.
		val StringBuilder command = new StringBuilder;
		command.append("docker machine start ").append(compute.name).append(" --driver ").append(getDriverName).append(' ');
		appendDriverParameters(command);
		System.out.println("EXECUTE COMMAND: " + command.toString);
		// TODO: must be implemented

		// Start all Docker containers contained by this Docker machine.
		for(Link link : compute.links) {
			if(link instanceof Link) {
				val contains = link as Contains
				if(contains.target instanceof Container) {
					val Container container = contains.target as Container
					container.start()
				}
			}
		}
	}
 
	/**
	 * Stop a Docker machine.
	 */
	override def stop_execute(StopMethod method)
	{
		// Stop all Docker containers contained by this Docker machine.
		if(method == StopMethod.GRACEFUL) {
			for(Link link : compute.links) {
				if(link instanceof Link) {
					val contains = link as Contains
					if(contains.target instanceof Container) {
						val Container container = contains.target as Container
						container.stop(StopMethod.GRACEFUL)
					}
				}
			}
		}

		// Execute the docker-machine stop command.
		System.out.println("EXECUTE COMMAND: docker machine stop " + compute.name);		
		// TODO: must be implemented
	}

	/**
	 * Restart a Docker machine.
	 */
	override def restart_execute(RestartMethod method) {
		System.out.println("EXECUTE COMMAND: docker machine restart " + compute.name);
		// TODO: must be implemented
	}

	/**
	 * Suspend a Docker machine.
	 */
	override def suspend_execute(SuspendMethod method) {
		System.out.println("EXECUTE COMMAND: docker machine suspend " + compute.name);		
		// TODO: must be implemented
	}
}

/**
 * This class implements executable Docker Machine on Amazon EC2.
 */
class ExecutableMachine_Amazon_EC2 extends Machine_Amazon_EC2Impl
{ 
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"amazonec2" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Digital Ocean.
 */
class ExecutableMachine_Digital_Ocean extends Machine_Digital_OceanImpl
{ 
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"digitalocean" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Google Compute Engine.
 */
class ExecutableMachine_Google_Compute_Engine extends Machine_Google_Compute_EngineImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"google"// TODO: check driver name
    	} 

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on IBM SoftLayer.
 */
class ExecutableMachine_IBM_SoftLayer extends Machine_IBM_SoftLayerImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"ibmsoflayer"// TODO: check driver name
    	} 

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Microsoft Azure.
 */
class ExecutableMachine_Microsoft_Azure extends Machine_Microsoft_AzureImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"azure" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Microsoft Hyper V.
 */
class ExecutableMachine_Microsoft_Hyper_V extends Machine_Microsoft_Hyper_VImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"hyperv" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on OpenStack.
 */
class ExecutableMachine_OpenStack extends Machine_OpenStackImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		 "openstack" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on Rackspace.
 */
class ExecutableMachine_Rackspace extends Machine_RackspaceImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"rackspace" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on VirtualBox.
 */
class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"virtualbox"
    	}

		override def appendDriverParameters(StringBuilder sb)
		{
			if (disk_size > 0) {
				sb.append(" --virtualbox-disk-size ").append(disk_size);
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
	};

    // Delegation to the manager.
	override def start() { manager.start() }
 	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on VMware Fusion.
 */
class ExecutableMachine_VMware_Fusion extends Machine_VMware_FusionImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"fusion" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on VMware vCloud Air.
 */
class ExecutableMachine_VMware_vCloud_Air extends Machine_VMware_vCloud_AirImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"vcloudair" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

/**
 * This class implements executable Docker Machine on VMware vSphere.
 */
class ExecutableMachine_VMware_vSphere extends Machine_VMware_vSphereImpl
{
	/**
	 * The machine manager.
	 */
	val manager = new MachineManager(this)
	{
    	override def getDriverName() {
    		"vsphere" // TODO: check driver name
    	}

		override def appendDriverParameters(StringBuilder sb) {
			// TODO: must be implemented
			throw new UnsupportedOperationException
		}
	}

    // Delegation to the manager.
	override def start() { manager.start() }
	override def stop(StopMethod method) { manager.stop(method) }
	override def restart(RestartMethod method) { manager.restart(method) }
	override def suspend(SuspendMethod method) { manager.suspend(method) }
}

class ExecutableMain
{
	def static void main(String[] args)
	{
		// Initialize the executable Docker factory.
		ExecutableDockerFactory.init()

		// Obtain the Docker package factory.
		val factory = DockerPackage.eINSTANCE.getDockerFactory

		// Create a Docker VirtualBox machine.
		val machine = factory.createMachine_VirtualBox
		machine.name = "m1"
		machine.memory = 2048.0f

		// Create a Docker container.
		val container = factory.createContainer
		container.name = "m1"
		container.image = "ubuntu"

		// Put the Docker container inside the Docker machine.
        val contains = factory.createContains
        contains.target = container
        machine.links.add(contains)

		// Start then stop the Docker machine.
		machine.start
		machine.stop(StopMethod.GRACEFUL)

		// Start then stop the Docker container.
        container.start
        container.start
        container.stop(StopMethod.GRACEFUL)
        container.stop(StopMethod.GRACEFUL)
	}
}
