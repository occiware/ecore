package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine

import java.util.Random
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DockerMachineTest {
	// Initialize logger for ModelHandler.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerMachineTest))

	def static void main(String[] args) {
		// Initialize the executable Docker factory.
		val init = ExecutableDockerFactory.init()
		LOGGER.info("Running DockerMachineTest ...")
		val instance = new DockerMachineTest
		instance.testScenario()
		LOGGER.info("**************END*********************")
	}

	def testScenario() {
		// Initialize the model
		DockerFactory.eINSTANCE.eClass

		// Retrieve the default factory singleton
		var machine = DockerPackage.eINSTANCE.getDockerFactory.createMachine_VirtualBox
		val Random randomGenerator = new Random
		val int randomInt = randomGenerator.nextInt(100)

		// Set an instance of Docker Machine_VirtualBox
		machine.name = "test-machine-" + randomInt
		
		val instanceExecDocker = new ExecutableDockerModel(machine)
		// Create the contents of VirtualBox machine model
		instanceExecDocker.start
			
	}

}
