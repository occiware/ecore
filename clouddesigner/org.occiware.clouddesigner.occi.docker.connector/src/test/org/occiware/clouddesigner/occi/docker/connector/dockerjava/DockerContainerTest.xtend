package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import java.security.SecureRandom
import java.util.Map
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

class DockerContainerTest {
	def static void main(String[] args) {
		println("Running DockerContainerTest ...")
		val instance = new DockerContainerManager
		val instanceMH = new ModelHandler

		// Initialize the model
		DockerFactory.eINSTANCE.eClass

		// Retrieve the default factory singleton of Machine
		var machine = DockerFactory.eINSTANCE.createMachine_VirtualBox
		// Choose one machine randomly
		val machineName = DockerUtil.getActiveHost
		if( machineName!= null){
			machine.name = machineName  
		}else{
			throw new IllegalArgumentException("You should start at least one machine ...")
		}
		val String testImage = "busybox"
		
		// Download a pre-built image
		instance.pullImage(machine, testImage)
		// Retrieve the default factory singleton
		var container = DockerFactory.eINSTANCE.createContainer
		container.name = "container-test_" + new SecureRandom().nextInt
		container.command = "sleep,9999"
		container.image = testImage
		// Retrieve the default factory singleton of Contains
		machine = instanceMH.linkContainerToMachine(container, machine) as Machine_VirtualBox
		//Create Container
		var Map<DockerClient, CreateContainerResponse>  map = instance.createContainer(machine, container)
		// Save Container
		instanceMH.saveContainer(container)
		// Inspect container
		println(instance.inspectContainer(map))
		// Start container
		instance.startContainer(map)
		// Stop container
		instance.stopContainer(map)
		// Wait Container
		instance.waitContainer(map)
		// List all container here
		println("Content: " + machine.links.get(0).target)
		// Get model from real
		val containers = instance.listContainer(machine)
		containers.forEach[contain | instanceMH.saveContainer(instanceMH.getModel(contain))]
	}
}