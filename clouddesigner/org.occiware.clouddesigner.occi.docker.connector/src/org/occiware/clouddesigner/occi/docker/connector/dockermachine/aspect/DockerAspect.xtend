package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.occiware.clouddesigner.OCCI.Link
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.DockerFactory
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
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2Aspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspect.*
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.Graph
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import org.eclipse.emf.ecore.EObject
import org.occiware.clouddesigner.OCCI.Configuration
import org.occiware.clouddesigner.OCCI.Resource

class DockerAspect {
	var public Machine machine
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
	var public Container container
	var public Configuration configuration
	var static public Map<String, Machine> register = new HashMap<String, Machine>

	new() {
		initModel
	}

	new(Container container) {
		this.container = container
	}

	new(Machine machine) {
		if (machine instanceof Machine_VirtualBox) {
			machine_VirtualBox = machine as Machine_VirtualBox
		} else if (machine instanceof Machine_Amazon_EC2) {
			machine_Amazon_EC2 = machine as Machine_Amazon_EC2
		} else if (machine instanceof Machine_Digital_Ocean) {
			machine_Digital_Ocean = machine as Machine_Digital_Ocean
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

		// Register the machine
		register(machine)
	}

	new(Configuration conf) {
		this.configuration = conf
	}

	def void start() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.machineStart
			return;
		}
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.machineStart
			return;
		}
		if (machine_Digital_Ocean != null) {
			machine_Digital_Ocean.machineStart
			return;
		}
		if (machine_Google_Compute_Engine != null) {
			machine_Google_Compute_Engine.machineStart
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			machine_IBM_SoftLayer.machineStart
			return;
		}
		if (machine_Microsoft_Azure != null) {
			machine_Microsoft_Azure.machineStart
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			machine_Microsoft_Hyper_V.machineStart
			return;
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.machineStart
			return;
		}

		if (machine_Rackspace != null) {
			machine_Rackspace.machineStart
			return;
		}

		if (machine_VMware_Fusion != null) {
			machine_VMware_Fusion.machineStart
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			machine_VMware_vCloud_Air.machineStart
			return;
		}
		if (machine_VMware_vSphere != null) {
			machine_VMware_vSphere.machineStart
			return;
		}

	}

	def void startAll() {
		if (machine_VirtualBox != null) {
			machine_VirtualBox.machineStartAll
			return;
		}
		if (machine_Amazon_EC2 != null) {
			machine_Amazon_EC2.machineStartAll
			return;
		}
		if (machine_Digital_Ocean != null) {
			machine_Digital_Ocean.machineStartAll
			return;
		}
		if (machine_Google_Compute_Engine != null) {
			machine_Google_Compute_Engine.machineStartAll
			return;
		}
		if (machine_IBM_SoftLayer != null) {
			machine_IBM_SoftLayer.machineStartAll
			return;
		}
		if (machine_Microsoft_Azure != null) {
			machine_Microsoft_Azure.machineStartAll
			return;
		}
		if (machine_Microsoft_Hyper_V != null) {
			machine_Microsoft_Hyper_V.machineStartAll
			return;
		}

		if (machine_OpenStack != null) {
			machine_OpenStack.machineStartAll
			return;
		}

		if (machine_Rackspace != null) {
			machine_Rackspace.machineStartAll
			return;
		}

		if (machine_VMware_Fusion != null) {
			machine_VMware_Fusion.machineStartAll
			return;
		}

		if (machine_VMware_vCloud_Air != null) {
			machine_VMware_vCloud_Air.machineStartAll
			return;
		}
		if (machine_VMware_vSphere != null) {
			machine_VMware_vSphere.machineStartAll
			return;
		}

	}

	def void register(Machine machine) {
		register.put(machine.name, machine)
	}

	def loadMachine() {

		// Retrieve the default factory singleton
		machine = DockerFactory.eINSTANCE.createMachine

		// Register the machine
		register(machine)
		return machine
	}

	def loadMachine_VirtualBox() {

		// Retrieve the default factory singleton
		machine_VirtualBox = DockerFactory.eINSTANCE.createMachine_VirtualBox

		// Register the machine
		register(machine_VirtualBox)
		return machine_VirtualBox
	}

	def loadMachine_Amazon_EC2() {

		// Retrieve the default factory singleton
		machine_Amazon_EC2 = DockerFactory.eINSTANCE.createMachine_Amazon_EC2

		// Register the machine
		register(machine_Amazon_EC2)
		return machine_Amazon_EC2
	}

	def loadMachine_Google_Compute_Engine() {

		// Retrieve the default factory singleton
		machine_Google_Compute_Engine = DockerFactory.eINSTANCE.createMachine_Google_Compute_Engine

		// Register the machine
		register(machine_Google_Compute_Engine)
		return machine_Google_Compute_Engine
	}

	def loadMachine_Digital_Ocean() {

		// Retrieve the default factory singleton
		machine_Digital_Ocean = DockerFactory.eINSTANCE.createMachine_Digital_Ocean

		// Register the machine
		register(machine_Digital_Ocean)
		return machine_Digital_Ocean
	}

	def loadMachine_IBM_SoftLayer() {

		// Retrieve the default factory singleton
		machine_IBM_SoftLayer = DockerFactory.eINSTANCE.createMachine_IBM_SoftLayer
		register(machine_IBM_SoftLayer)
		return machine_IBM_SoftLayer
	}

	def loadMachine_Microsoft_Azure() {

		// Retrieve the default factory singleton
		machine_Microsoft_Azure = DockerFactory.eINSTANCE.createMachine_Microsoft_Azure

		// Register the machine
		register(machine_Microsoft_Azure)
		return machine_Microsoft_Azure
	}

	def loadMachine_Microsoft_Hyper_V() {

		// Retrieve the default factory singleton
		machine_Microsoft_Hyper_V = DockerFactory.eINSTANCE.createMachine_Microsoft_Hyper_V

		// Register the machine
		register(machine_Microsoft_Hyper_V)
		return machine_Microsoft_Hyper_V
	}

	def loadMachine_OpenStack() {

		// Retrieve the default factory singleton
		machine_OpenStack = DockerFactory.eINSTANCE.createMachine_OpenStack
		register(machine_OpenStack)
		return machine_OpenStack
	}

	def loadMachine_Rackspace() {

		// Retrieve the default factory singleton
		machine_Rackspace = DockerFactory.eINSTANCE.createMachine_Rackspace

		// Register the machine
		register(machine_Rackspace)
		return machine_Rackspace
	}

	def loadMachine_VMware_Fusion() {

		// Retrieve the default factory singleton
		machine_VMware_Fusion = DockerFactory.eINSTANCE.createMachine_VMware_Fusion

		// Register the machine
		register(machine_VMware_Fusion)
		return machine_VMware_Fusion
	}

	def loadMachine_VMware_vCloud_Air() {

		// Retrieve the default factory singleton
		machine_VMware_vCloud_Air = DockerFactory.eINSTANCE.createMachine_VMware_vCloud_Air

		// Register the machine
		register(machine_VMware_vCloud_Air)
		return machine_VMware_vCloud_Air
	}

	def loadMachine_VMware_vSphere() {

		// Retrieve the default factory singleton
		machine_VMware_vSphere = DockerFactory.eINSTANCE.createMachine_VMware_vSphere

		// Register the machine
		register(machine_VMware_vSphere)
		return machine_VMware_vSphere
	}

	def loadContainer() {

		// Retrieve the default factory singleton of Container
		container = DockerFactory.eINSTANCE.createContainer
	}

	def initModel() {

		// Initialize the model
		return DockerFactory.eINSTANCE.eClass
	}

	def void importModel() {
		val hosts = DockerUtil.getHosts
		val instanceMH = new ModelHandler
		println(hosts)
		for (Map.Entry<String, String> entry : hosts.entrySet) {
			var machine = instanceMH.getModel(entry.getKey(), entry.getValue())
			if (!containMachine(machine)) {
				this.configuration.resources.add(machine)
				if (machine.links != null) {
					machine.links.forEach[elt|this.configuration.resources.add((elt.target as Container))]
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

	def void synchronize() {
		this.machine_VirtualBox.synchronize
	}

}

@Aspect(className=Machine)
class MachineAspect {
	protected boolean isDeployed = false

	def String createMachineCommand() {
	}
}

@Aspect(className=Machine_VirtualBox)
class MachineVirtualBoxAspect extends MachineAspect {
	protected boolean isDeployed = false
	protected Map<String, String> containerDependency = new HashMap

	@ReplaceAspectMethod
	def void start() {
		println("Je redefinis la methode start \n\n\n")
	}

	@OverrideAspectMethod
	def String createMachineCommand() {
		var command = new StringBuilder("docker-machine create --driver ")

		// Set the driver name
		command.append(Provider.virtualbox.toString)
		if (_self.name != null) {
			command.append(" " + _self.name)
			if (_self.disk_size > 0) {
				command.append(" --virtualbox-disk-size " + _self.disk_size)
			}
			if (_self.memory > 0.0F) {
				command.append(" --virtualbox-memory " + _self.memory)
			} else if (_self.memory == 0.0F) {
				command.append(" --virtualbox-memory " + 1024.0)
			}
			if (_self.cores > 0) {
				command.append(" --virtualbox-cpu-count " + _self.cores) // TODO verify is the default value is set
			} else if (_self.cores == 0) {
				command.append(" --virtualbox-cpu-count " + -1)
			}
			if (_self.boot2docker_url != null) {
				command.append(" --virtualbox-boot2docker-url " + _self.disk_size)
			}
		} else if (_self.name == null) {
			// TODO Manage error...
		}

		return command.toString
	}

	def void machineStartAll() {
		val runtime = Runtime.getRuntime

		if (_self.name != null) {

			// Get the active machine
			val activeHosts = DockerUtil.getActiveHosts

			// Get the existing machines
			val hosts = DockerUtil.getHosts

			if (!hosts.containsKey(_self.name)) { // Check if machine exists in the real environment

				// Create VitualBox machine and start it
				ProcessManager.runCommand(_self.createMachineCommand, runtime, true)

				//Create the Containers belong to this machine.
				if (_self.links.size > 0) {

					// Start the containers without create graph
					if (!_self.linkFound) {
						_self.links.forEach[elt|
							(elt.target as Container).createContainer(_self, _self.containerDependency)]
					} else { // Create the graph
						_self.deploymentOrder.forEach[c|c.createContainer(_self, _self.containerDependency)]
					}
				}
			} else {
				if (!activeHosts.containsKey(_self.name)) {

					// Start the machine
					DockerMachineManager.startCmd(runtime, _self.name)

					//Create the Containers belong to this machine.
					if (_self.links.size > 0) {

						// Start the containers without create graph
						if (!_self.linkFound) {
							_self.links.forEach[elt|
								(elt.target as Container).createContainer(_self, _self.containerDependency)]
						} else { // Create the graph
							_self.deploymentOrder.forEach[c|c.createContainer(_self, _self.containerDependency)]
						}
					}
				}
			}

			// Set State
			_self.state = ComputeStatus.get(0)

			// Set isDeployed
			_self.isDeployed = DockerMachineManager.setEnvCmd(runtime, _self.name)
		}
	}

	def void machineStart() {
		val runtime = Runtime.getRuntime

		if (_self.name != null) {

			// Get the active machine
			val activeHosts = DockerUtil.getActiveHosts

			// Get the existing machines
			val hosts = DockerUtil.getHosts

			if (!hosts.containsKey(_self.name)) { // Check if machine exists in the real environment

				// Create VitualBox machine and start it
				ProcessManager.runCommand(_self.createMachineCommand, runtime, true)
			} else {
				if (!activeHosts.containsKey(_self.name)) {

					// Start the machine
					DockerMachineManager.startCmd(runtime, _self.name)
				}
			}

			// Set State
			_self.state = ComputeStatus.get(0)

			// Set isDeployed
			_self.isDeployed = DockerMachineManager.setEnvCmd(runtime, _self.name)
		}
	}

	def void machineStop() {
		if (_self.name != null) {
			DockerMachineManager.stopCmd(Runtime.getRuntime, _self.name)

			// Set State
			_self.state = ComputeStatus.get(1)
		}
	}

	def void machineRemove() {
		if (_self.name != null) {
			DockerMachineManager.removeCmd(Runtime.getRuntime, _self.name)

			// Set State
			_self.state = ComputeStatus.get(1)

			// Set isDeployed
			_self.isDeployed = false
		}
	}

	def void machineRestart() {
		if (_self.name != null) {
			DockerMachineManager.restartCmd(Runtime.getRuntime, _self.name)

			// Set State
			_self.state = ComputeStatus.get(0)

		}
	}

	def void save() {
		val instanceMH = new ModelHandler

		// Save an instance of model
		instanceMH.saveMachine(_self)
	}

	def List<Container> getContainers() {
		val List<Container> containers = newArrayList
		_self.links.forEach[elt|containers.add((elt.target as Container))]
		return containers
	}

	def List<Container> leafContainers() {
		val List<Container> containers = _self.containers
		val List<Container> leafContainers = new ArrayList
		for (Container c : containers) {
			if (c.links.size == 0) {
				leafContainers.add(c)
			}
		}
		return leafContainers
	}

	def boolean linkFound() {
		val List<Container> containers = _self.containers
		var boolean link = false
		for (Container c : containers) {
			if (c.links.size > 0) {
				link = true
				return link
			}
		}
		return link
	}

	def List<Container> deploymentOrder() {
		val List<Container> containers = newArrayList
		var Graph<Container> graph = new Graph<Container>

		for (Link l : _self.links) {
			val container = l.target as Container
			if (!container.links.isEmpty) {
				for (Link cl : container.links) {
					graph.addDependency(container, (cl.target as Container))
					_self.containerDependency.put(container.name, (cl.target as Container).name)
				}
			}
		}
		for (GraphNode<Container> c : graph.deploymentOrder) {
			containers.add(c.value)
		}

		// Add standalone container
		for (Container standaloneContainer : _self.leafContainers) {
			if (!containers.contains(standaloneContainer)) {
				containers.add(standaloneContainer)
			}
		}
		containers.forEach[c|println(c.name)]
		return containers
	}

	def void synchronize() {

		// compare
		val hosts = DockerUtil.getHosts
		val instanceMH = new ModelHandler
		val instance = new DockerContainerManager
		val machine = instanceMH.getModel(_self.name, hosts.get(_self.name))
		_self.state = machine.state

	//		if (_self.state.toString.equalsIgnoreCase("active")) {
	//
	//			// Introspect containers
	//			val contains = instance.listContainer(machine)
	//			if (contains != null) {
	//
	//				//linkContainerToMachine(buildContainer(containers), vbox)
	//				for (com.github.dockerjava.api.model.Container c : contains) {
	//					instanceMH.buildContainer(c).linkContainerToMachine(_self)
	//				}
	//			}
	//
	//		}
	}
}

@Aspect(className=Machine_Amazon_EC2)
class MachineAmazonEC2Aspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_Digital_Ocean)
class MachineDigitalOceanAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		var command = new StringBuilder("docker-machine create --driver ")

		// Set the driver name
		command.append(Provider.digitalocean.toString)
		if (_self.name != null && _self.access_token != null) {
			command.append(" " + _self.name)
			command.append(" --digitalocean-access-token=" + _self.access_token)
			if (_self.image != null) {
				command.append(" --digitalocean-image " + _self.image)
			}
			if (_self.region != null) {
				command.append(" --digitalocean-region " + _self.region)
			}
			if (_self.size != null) {
				command.append(" --digitalocean-size " + _self.size)
			}

		} else if (_self.name == null || _self.access_token == null) {
			// TODO Manage error
		}
		return command.toString
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_Google_Compute_Engine)
class MachineGoogleComputeEngineAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		var command = new StringBuilder("docker-machine create --driver ")

		// Set the driver name
		command.append(Provider.google.toString)
		if (_self.name != null) {
			command.append(" --google-instance-name " + _self.instance_name)
			if (_self.zone != null) {
				command.append("")
			}
			if (_self.username != null) {
				command.append(" --google-username " + _self.name)
			}
			if (_self.project != null) {
				command.append(" --google-project " + _self.name)
			}
			if (_self.machine_type != null) {
				command.append(" --google-machine-type " + _self.machine_type)
			}

		// TODO --google-scopes
		} else {
			// Manager error
		}
		return command.toString
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_IBM_SoftLayer)
class MachineIBMSoftLayerAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_Microsoft_Azure)
class MachineMicrosoftAzureAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_Microsoft_Hyper_V)
class MachineMicrosoftHyperVAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_OpenStack)
class MachineOpenStackAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		var command = new StringBuilder("docker-machine create --driver ")

		// Set the driver name
		command.append(Provider.openstack.toString)
		if (_self.username != null && _self.flavor_id != null && _self.image_id != null && _self.password != null) {
			command.append(" --openstack-username " + _self.name)
			command.append(" --openstack-password " + _self.password)
			command.append(" --openstack-image-id " + _self.image_id)
			command.append(" --openstack-flavor-id" + _self.flavor_id)
			if (_self.auth_url != null) {
				command.append(" --openstack-auth-url " + _self.auth_url)
			}
			if (_self.tenant_id != null || _self.tenant_name != null) {
				val value = if(_self.tenant_id == null) _self.tenant_id else _self.tenant_id
				command.append(" --openstack-tenant-name " + value)
			}
			if (_self.region != null) {
				command.append(" --openstack-region " + _self.region)
			}
			if (_self.endpoint_type != null) {
				command.append(" --openstack-endpoint-type " + _self.endpoint_type)
			}
			if (_self.net_id != null) {
				command.append(" --openstack-net-id " + _self.net_id)
			}
			if (_self.sec_groups != null) {
				command.append(" --openstack-sec-groups " + _self.sec_groups)
			}
			if (_self.floatingip_pool != null) {
				command.append(" --openstack-floatingip-pool " + _self.floatingip_pool)
			}

		// TODO --openstack-ssh-user and --openstack-ssh-port
		} else if (_self.username == null || _self.flavor_id == null || _self.image_id == null || _self.password == null) {
			// TODO manage error
		}

		return command.toString
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_Rackspace)
class MachineRackspaceAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_VMware_Fusion)
class Machine_VMwareFusionAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_VMware_vCloud_Air)
class MachineVMwarevCloudAirAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Machine_VMware_vSphere)
class MachineVMwarevSphereAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}

	def void machineStartAll() {}

	def void machineStart() {}
}

@Aspect(className=Container)
class ContainerAspect {
	var Map<DockerClient, CreateContainerResponse> map = null

	def Map<DockerClient, CreateContainerResponse> createContainer(Machine machine,
		Map<String, String> containerDependency) {
		println(_self.name)
		var DockerContainerManager dockercontainerManager = new DockerContainerManager

		// Set dockerClient
		var Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>

		// Download image
		dockercontainerManager.pullImage(machine, _self.image)
		result = dockercontainerManager.createContainer(machine, _self, containerDependency)
		_self.map = new HashMap<DockerClient, CreateContainerResponse>(result)
		return result
	}

	def Map<DockerClient, CreateContainerResponse> createContainer(Container container) {
		val machine = container.links.get(0).source as Machine
		var DockerContainerManager dockercontainerManager = new DockerContainerManager

		// Set dockerClient
		var Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>

		// Download image
		dockercontainerManager.pullImage(machine, _self.image)
		result = dockercontainerManager.createContainer(machine, _self)
		_self.map = new HashMap<DockerClient, CreateContainerResponse>(result)
		return result
	}

	def Machine linkContainerToMachine(Machine machine) {

		// Retrieve the default factory singleton
		var contains = DockerFactory.eINSTANCE.createContains

		// Add Container to the Contains
		contains.target = _self
		machine.links.add(contains)
		return machine
	}

	def Container linkContainerToContainer(Container container) {

		// Retrieve the default factory singleton
		var contains = DockerFactory.eINSTANCE.createContains

		// Add Container to the Contains
		contains.target = container

		// Link Container to another
		_self.links.add(contains)
		return container
	}

	def void containerStart() {
		val machine = _self.getCurrentMachine
		if (machine.isDeployed) {
			val dockerContainerManager = new DockerContainerManager
			dockerContainerManager.startContainer(machine, _self)
		}
	}

	def void containerStop() {
		val machine = _self.getCurrentMachine
		if (machine.isDeployed) {
			val dockerContainerManager = new DockerContainerManager
			dockerContainerManager.stopContainer(machine, _self)
		}
	}

	def void containerWait() {
		val machine = _self.getCurrentMachine
		if (machine.isDeployed) {
			val dockerContainerManager = new DockerContainerManager
			dockerContainerManager.waitContainer(machine, _self)
		}
	}

	def void save() {
		val instanceMH = new ModelHandler

		// Save an instance of model
		instanceMH.saveContainer(_self)
	}

	def Machine getCurrentMachine() {
		for (EObject eo : _self.eContainer.eContents) {
			if (eo instanceof Machine) {
				val machine = eo as Machine
				for (Link l : machine.links) {
					if ((l.target as Container).id == _self.id) {
						return machine
					}
				}
			}
		}
		return null
	}
}
