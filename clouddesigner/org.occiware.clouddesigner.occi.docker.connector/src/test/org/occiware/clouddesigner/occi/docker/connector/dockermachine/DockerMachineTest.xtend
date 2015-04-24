package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine

import java.util.Random
import org.occiware.clouddesigner.occi.docker.DockerFactory
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

import static extension org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.*

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
		val instanceAspect = new DockerAspect

		// Retrieve the default factory singleton
		var machine = instanceAspect.loadMachine_VirtualBox
		val Random randomGenerator = new Random
		val int randomInt = randomGenerator.nextInt(100)

		// Set an instance of Docker Machine_VirtualBox
		machine.name = "test-machine-" + randomInt
		
		// Create the contents of VirtualBox machine model
		instanceAspect.machine_VirtualBox.machineStart
		// Add Listener
		val Machine vboxf = instanceDO.listener(machine)
		
		// Save an instance of model
		instanceAspect.machine_VirtualBox.save

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
	}

}
