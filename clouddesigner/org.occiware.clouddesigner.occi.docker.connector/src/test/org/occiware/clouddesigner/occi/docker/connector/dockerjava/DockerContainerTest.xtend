package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava

import java.security.SecureRandom
import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.Container

class DockerContainerTest {
	def static void main(String[] args) {

		// Initialize the executable Docker factory.
		val init = ExecutableDockerFactory.init()
		println("Running DockerContainerTest ...")
		val instance = new DockerContainerManager
		val instanceExecDocker = new ExecutableDockerModel

		// Obtain the Docker package factory.
		val machine = DockerPackage.eINSTANCE.getDockerFactory.createMachine_VirtualBox

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

		// Create 2 Containers
		for (i : 0 ..< 2) {
			val container = containerCreate(instanceExecDocker, testImage, machine)
			instance.createContainer(machine, container)

		}
	}

	def static Container containerCreate(ExecutableDockerModel instanceExecDocker, String testImage,
		Machine_VirtualBox machine) {

		// Create a container
		val container = DockerPackage.eINSTANCE.getDockerFactory.createContainer
		container.name = "container-test" + new SecureRandom().nextInt
		container.command = "sleep,9999"
		container.image = testImage

		// Put the Docker container inside the Docker machine.
		val contains = DockerPackage.eINSTANCE.getDockerFactory.createContains
		contains.target = container
		machine.links.add(contains)
		return container
	}
}
