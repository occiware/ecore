package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
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
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager
import org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect.*
import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.*
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

class DockerAspect {

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
	var static public Map<String, Machine> register = new HashMap<String, Machine>

	new() {
		initModel
	}

	new(Machine machine) {
		if (machine instanceof Machine_VirtualBoxImpl) {
			machine_VirtualBox = machine
		} else if (machine instanceof Machine_Amazon_EC2Impl) {
			machine_Amazon_EC2 = machine
		} else if (machine instanceof Machine_Digital_OceanImpl) {
			machine_Digital_Ocean = machine
		} else if (machine instanceof Machine_Google_Compute_EngineImpl) {
			machine_Google_Compute_Engine = machine
		} else if (machine instanceof Machine_IBM_SoftLayerImpl) {
			machine_IBM_SoftLayer = machine
		} else if (machine instanceof Machine_Microsoft_AzureImpl) {
			machine_Microsoft_Azure = machine
		} else if (machine instanceof Machine_Microsoft_Hyper_VImpl) {
			machine_Microsoft_Hyper_V = machine
		} else if (machine instanceof Machine_OpenStackImpl) {
			machine_OpenStack = machine
		} else if (machine instanceof Machine_RackspaceImpl) {
			machine_Rackspace = machine
		} else if (machine instanceof Machine_VMware_Fusion) {
			machine_VMware_Fusion = machine
		} else if (machine instanceof Machine_VMware_vCloud_Air) {
			machine_VMware_vCloud_Air = machine
		} else if (machine instanceof Machine_VMware_vSphereImpl) {
			machine_VMware_vSphere = machine
		}

		// Register the machine
		register(machine)
	}

	def void register(Machine machine) {
		register.put(machine.name, machine)
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

}

@Aspect(className=Machine)
class MachineAspect {
	protected boolean isDeployed = false

	def String createMachineCommand() {
	}

	def void save() {
	}
}

@Aspect(className=Machine_VirtualBox)
class MachineVirtualBoxAspect extends MachineAspect {
	protected boolean isDeployed = false

	def void start() {
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

			//Create the Containers belong to this machine.
			if (_self.links.size > 0) {
				_self.links.forEach[elt|(elt.source as Container).createContainer(_self)]
			}
		} else if (_self.name == null) {
			// TODO Manage error...
		}

		return command.toString
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
		}
	}

	def void machineRemove() {
		if (_self.name != null) {
			DockerMachineManager.removeCmd(Runtime.getRuntime, _self.name)
		}
	}

	def void machineRestart() {
		if (_self.name != null) {
			DockerMachineManager.restartCmd(Runtime.getRuntime, _self.name)
		}
	}

	def void save() {
		val instanceMH = new ModelHandler

		// Save an instance of model
		instanceMH.saveMachine(_self)
	}
}

@Aspect(className=Machine_Amazon_EC2)
class MachineAmazonEC2Aspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
	}
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
}

@Aspect(className=Machine_IBM_SoftLayer)
class MachineIBMSoftLayerAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Machine_Microsoft_Azure)
class MachineMicrosoftAzureAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Machine_Microsoft_Hyper_V)
class MachineMicrosoftHyperVAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
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
}

@Aspect(className=Machine_Rackspace)
class MachineRackspaceAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Machine_VMware_Fusion)
class Machine_VMwareFusionAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Machine_VMware_vCloud_Air)
class MachineVMwarevCloudAirAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Machine_VMware_vSphere)
class MachineVMwarevSphereAspect extends MachineAspect {
	protected boolean isDeployed = false

	@OverrideAspectMethod
	def String createMachineCommand() {
		//		var command = new StringBuilder("docker-machine create --driver ")
	}
}

@Aspect(className=Container)
class ContainerAspect {
	var Map<DockerClient, CreateContainerResponse> map = new LinkedHashMap<DockerClient, CreateContainerResponse>

	def Map<DockerClient, CreateContainerResponse> createContainer(Machine machine) {
		val dockercontainerManager = new DockerContainerManager

		// Set dockerClient
		val dockerClient = dockercontainerManager.setConfig(machine)
		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = dockercontainerManager.containerFactory(_self, dockerClient)

		// Run Execution
		val CreateContainerResponse rcontainer = create.exec
		result.put(dockerClient, rcontainer)
		_self.map.put(dockerClient, rcontainer)
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

	def void startContainer() {
		val dockerContainerManager = new DockerContainerManager
		dockerContainerManager.startContainer(_self.map)
	}

	def void stopContainer() {
		val dockerContainerManager = new DockerContainerManager
		dockerContainerManager.stopContainer(_self.map)
	}

	def void waitContainer() {
		val dockerContainerManager = new DockerContainerManager
		dockerContainerManager.waitContainer(_self.map)
	}

	def void save() {
		val instanceMH = new ModelHandler

		// Save an instance of model
		instanceMH.saveContainer(_self)
	}

}
