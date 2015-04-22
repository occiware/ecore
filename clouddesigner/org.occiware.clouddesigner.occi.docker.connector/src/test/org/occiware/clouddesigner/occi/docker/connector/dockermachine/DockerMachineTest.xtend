package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine

import java.util.Random
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.ResourceDifferencesEngine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

class DockerMachineTest {

	def static void main(String[] args) {
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
		val instanceMH = new ModelHandler

		// Retrieve the default factory singleton
		var machine = DockerFactory.eINSTANCE.createMachine_VirtualBox

		// Create the contents of VirtualBox machine model
		val vbox = createVirtualBoxMachineTest(machine)
		val Machine vboxf = instanceDO.listener(vbox)

		/*
		 * Change the model content
		 */
		// Set machine content
		vboxf.name = "new-name"

		/*
		 * Initialize a model from execution environment
		 */
		val hosts = DockerUtil.getHosts
		println(hosts)
		hosts.forEach[k, v|instanceMH.saveMachine(instanceMH.getModel(k, v))]

		/*
		  * Compare model
		  */
		//TODO remove comparison test befor commit
		val String xmiPath = "/Users/spirals/git/ecore/clouddesigner/org.occiware.clouddesigner.occi.docker.connector/bin/new-name.xmi"
		val cp = new ResourceDifferencesEngine
		println(cp.isSimilar(xmiPath, xmiPath))
		instanceMH.load(xmiPath)
	}

	def createVirtualBoxMachineTest(Machine_VirtualBox vbox) {
		val instanceMH = new ModelHandler
		val Random randomGenerator = new Random
		val int randomInt = randomGenerator.nextInt(100)

		// Set an instance of Docker Machine_VirtualBox
		vbox.name = "test-machine-" + randomInt

		// Create VitualBox machine
		DockerMachineManager.createHostCmd(Runtime.getRuntime, vbox)

		// Save an instance of model
		instanceMH.saveMachine(vbox)

		return vbox
	}

}
