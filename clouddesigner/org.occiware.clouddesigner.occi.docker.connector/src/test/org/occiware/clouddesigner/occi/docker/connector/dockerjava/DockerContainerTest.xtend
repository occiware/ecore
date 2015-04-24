package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerResponse
import java.security.SecureRandom
import java.util.Map
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect.*

class DockerContainerTest {
	def static void main(String[] args) {
		println("Running DockerContainerTest ...")
		val instance = new DockerContainerManager
		val instanceMH = new ModelHandler
		val instanceAspect = new DockerAspect

		// Retrieve the default factory singleton of Machine
		var machine = instanceAspect.loadMachine_VirtualBox

		// Choose one machine randomly
		val machineName = DockerUtil.getActiveHost
		if (machineName != null) {
			machine.name = machineName
		} else {
			throw new IllegalArgumentException("You should start at least one machine ...")
		}
		val String testImage = "busybox"

		// Download a pre-built image
		instance.pullImage(machine, testImage)

		// Create 3 Containers
		for (i : 0 ..< 3) {
			var map = containerCreate(instanceAspect, testImage, machine)

			// Inspect all containers
			println(instance.inspectContainer(map))
		}

		// Start container
		instanceAspect.container.startContainer()

		// Stop container
		instanceAspect.container.stopContainer()

		// Wait Container
		instanceAspect.container.waitContainer()

		// List all container here
		println("Content: " + machine.links.get(0).target)

		// Get model from real
		val containers = instance.listContainer(machine)
		containers.forEach[contain|instanceMH.saveContainer(instanceMH.getModel(contain))]
	}

	def static containerCreate(DockerAspect instanceAspect, String testImage, Machine_VirtualBox machine) {
		var container = instanceAspect.loadContainer

		// Set container name
		container.name = "container-test_" + new SecureRandom().nextInt
		container.command = "sleep,9999"
		container.image = testImage

		// Retrieve the default factory singleton of Contains
		var newmachine = instanceAspect.container.linkContainerToMachine(machine) as Machine_VirtualBox

		//Create Container
		var Map<DockerClient, CreateContainerResponse> map = instanceAspect.container.createContainer(newmachine)

		// Save Container
		instanceAspect.container.save
		return map
	}
}
