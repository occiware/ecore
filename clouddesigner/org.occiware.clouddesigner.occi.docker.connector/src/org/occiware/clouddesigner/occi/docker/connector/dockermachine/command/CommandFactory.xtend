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

class CommandFactory {

	def createInfoCommand(String machineName) {
		val String command = String.format("docker-machine inspect %s", machineName)
		return command
	}

	def createLsCmd() {
		val String command = "docker-machine ls "
		return command
	}

	def createEnvCmd(String machineName) {
		val String command = String.format("eval \"$(docker-machine env %s)\" ", machineName)
		return command
	}

	def getEnvCmd(String machineName) {
		val String command = String.format("docker-machine env %s", machineName)
		return command
	}

	def createStartCommand(String machineName) {
		val String command = String.format("docker-machine start %s", machineName)
		return command
	}

	def createStopCommand(String machineName) {
		val String command = String.format("docker-machine stop %s", machineName)
		return command
	}

	def createReStartCommand(String machineName) {
		val String command = String.format("docker-machine restart %s", machineName)
		return command
	}

	def createRemoveCommand(String machineName) {
		val String command = String.format("docker-machine rm %s", machineName)
		return command
	}
	
	def createUrlCommand(String machineName) {
		val String command = String.format("docker-machine url %s", machineName)
		return command
	}
	
	def createRemoveStagingCommand(String machineName) {
		val String command = String.format("docker-machine rm %s staging", machineName)
		return command
	}

	def createActivateCommand(String machineName) {
		val String command = String.format("docker-machine activate %s staging", machineName)
		return command
	}

}
