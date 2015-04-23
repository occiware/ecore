package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
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
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.*

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

	new() {
		initModel
	}

	def callAnAspect() {
		println(machine_VirtualBox.createMachineCommand)
		println(machine_VirtualBox.isDeployed)
	}

	def loadMachine_VirtualBox() {

		// Retrieve the default factory singleton
		machine_VirtualBox = DockerFactory.eINSTANCE.createMachine_VirtualBox
	}

	def loadMachine_Amazon_EC2() {

		// Retrieve the default factory singleton
		machine_Amazon_EC2 = DockerFactory.eINSTANCE.createMachine_Amazon_EC2
	}

	def loadMachine_Google_Compute_Engine() {

		// Retrieve the default factory singleton
		machine_Google_Compute_Engine = DockerFactory.eINSTANCE.createMachine_Google_Compute_Engine
	}

	def loadMachine_Digital_Ocean() {

		// Retrieve the default factory singleton
		machine_Digital_Ocean = DockerFactory.eINSTANCE.createMachine_Digital_Ocean
	}

	def loadMachine_IBM_SoftLayer() {

		// Initialize the model
		initModel()

		// Retrieve the default factory singleton
		machine_IBM_SoftLayer = DockerFactory.eINSTANCE.createMachine_IBM_SoftLayer
	}

	def loadMachine_Microsoft_Azure() {

		// Retrieve the default factory singleton
		machine_Microsoft_Azure = DockerFactory.eINSTANCE.createMachine_Microsoft_Azure
	}

	def loadMachine_Microsoft_Hyper_V() {

		// Retrieve the default factory singleton
		machine_Microsoft_Hyper_V = DockerFactory.eINSTANCE.createMachine_Microsoft_Hyper_V
	}

	def loadMachine_OpenStack() {

		// Retrieve the default factory singleton
		machine_OpenStack = DockerFactory.eINSTANCE.createMachine_OpenStack
	}

	def loadMachine_Rackspace() {

		// Initialize the model
		initModel()

		// Retrieve the default factory singleton
		machine_Rackspace = DockerFactory.eINSTANCE.createMachine_Rackspace
	}

	def loadMachine_VMware_Fusion() {

		// Retrieve the default factory singleton
		machine_VMware_Fusion = DockerFactory.eINSTANCE.createMachine_VMware_Fusion
	}

	def loadMachine_VMware_vCloud_Air() {

		// Retrieve the default factory singleton
		machine_VMware_vCloud_Air = DockerFactory.eINSTANCE.createMachine_VMware_vCloud_Air
	}

	def loadMachine_VMware_vSphere() {

		// Retrieve the default factory singleton
		machine_VMware_vSphere = DockerFactory.eINSTANCE.createMachine_VMware_vSphere
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
		} else if (_self.name == null) {
			// TODO Manage error...
		}

		return command.toString
	}

	def void machineStart() {
		val runtime = Runtime.getRuntime

		// Create VitualBox machine
		ProcessManager.runCommand(_self.createMachineCommand, runtime, true)

		// Set State
		_self.state = ComputeStatus.get(0)
		if (_self.name != null) {

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
		//		var command = new StringBuilder("docker-machine create --driver ")
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
