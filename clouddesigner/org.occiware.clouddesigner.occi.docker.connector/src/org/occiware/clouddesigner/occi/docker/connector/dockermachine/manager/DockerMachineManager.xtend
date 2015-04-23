package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager

import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.command.CommandFactory
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus

class DockerMachineManager {

	val private static cf = new CommandFactory

	def static boolean createHostCmd(Runtime runtime, Machine machine) {
		val String command = cf.createMachineCommand(machine)
		println(" Run ::==> " + command)
		ProcessManager.runCommand(command, runtime, true)
		// Set machine state
		machine.state = ComputeStatus.get(0)
		return setEnvCmd(runtime, machine.name)
	}

	def static boolean listMachinesCmd(Runtime runtime) {
		return ProcessManager.runCommand("docker-machine ls", runtime, true)
	}

	def static String inspectHostCmd(Runtime runtime, String machine) {
		val String command = cf.createInfoCommand(machine)
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static String listHostCmd(Runtime runtime) {
		val String command = cf.createLsCmd
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static setEnvCmd(Runtime runtime, String machineName) {
		val String command = cf.createEnvCmd(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static getEnvCmd(Runtime runtime, String machineName) {
		val String command = cf.getEnvCmd(machineName)
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static startCmd(Runtime runtime, String machineName) {
		val String command = cf.createStartCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static stopCmd(Runtime runtime, String machineName) {
		val String command = cf.createStopCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static restartCmd(Runtime runtime, String machineName) {
		val String command = cf.createReStartCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static removeCmd(Runtime runtime, String machineName) {
		val String command = cf.createRemoveCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static urlCmd(Runtime runtime, String machineName) {
		val String command = cf.createUrlCommand(machineName)
		val temp = ProcessManager.getOutputCommand(command, runtime).replace("tcp", "https")
		return temp
	}
}
