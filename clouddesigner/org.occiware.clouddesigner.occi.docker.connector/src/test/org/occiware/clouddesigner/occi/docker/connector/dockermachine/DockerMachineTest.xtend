package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine

import java.util.Random
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver

class DockerMachineTest {

	def static void main(String[] args) {
		// Initialize the executable Docker factory.
		val init = ExecutableDockerFactory.init()
		println("Running DockerMachineTest ...")
		val instance = new DockerMachineTest
		instance.testScenario()
		println("**************END*********************")
	}

	def testScenario() {
		// Initialize the model
		DockerFactory.eINSTANCE.eClass

		/*
		 *  Load model, set and execute it 
		 */
		val instanceDO = new DockerObserver

		// Retrieve the default factory singleton
		var machine = DockerPackage.eINSTANCE.getDockerFactory.createMachine_VirtualBox
		val Random randomGenerator = new Random
		val int randomInt = randomGenerator.nextInt(100)

		// Set an instance of Docker Machine_VirtualBox
		machine.name = "test-machine-" + randomInt
		
		val instanceExecDocker = new ExecutableDockerModel(machine)
		// Create the contents of VirtualBox machine model
		instanceExecDocker.start
		// Add Listener
		val Machine vboxf = instanceDO.listener(machine)
		
		// Model Comparison
		val compare = new ModelHandler
		println(compare.isSimilar(vboxf, vboxf))	
	}

}
