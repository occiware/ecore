 /*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.command

import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

class CommandFactory {
	// Initialize logger for CommandFactory.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(CommandFactory))
	private var String dockerMachineCmd = DockerUtil.dockerMachineCmd 

	def createInfoCommand(String machineName) {
		val String command = String.format("%s inspect %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createLsCmd() {
		val String command = String.format("%s ls", this.dockerMachineCmd)
		return command
	}

	def createEnvCmd(String machineName) {
		val String command = String.format("eval \"$(%s env %s)\" ", this.dockerMachineCmd, machineName)
		return command
	}

	def getEnvCmd(String machineName) {
		val String command = String.format("%s env %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createStartCommand(String machineName) {
		val String command = String.format("%s start %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createStopCommand(String machineName) {
		val String command = String.format("%s stop %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createReStartCommand(String machineName) {
		val String command = String.format("%s restart %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createRemoveCommand(String machineName) {
		val String command = String.format("%s rm %s", this.dockerMachineCmd, machineName)
		return command
	}
	
	def createUrlCommand(String machineName) {
		val String command = String.format("%s url %s", this.dockerMachineCmd, machineName)
		return command
	}

	def createCertCommand(String machineName) {
		val String command = String.format("%s regenerate-certs %s -f", this.dockerMachineCmd, machineName)
		return command
	}

	
	def createRemoveStagingCommand(String machineName) {
		val String command = String.format("%s rm %s staging", this.dockerMachineCmd, machineName)
		return command
	}

	def createActivateCommand(String machineName) {
		val String command = String.format("%s activate %s staging", this.dockerMachineCmd, machineName)
		return command
	}

}
