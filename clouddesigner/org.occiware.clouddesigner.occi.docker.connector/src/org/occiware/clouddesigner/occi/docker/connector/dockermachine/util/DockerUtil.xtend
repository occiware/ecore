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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.StringWriter
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.List
import java.util.Map
import org.apache.commons.io.IOUtils
import org.apache.commons.io.LineIterator
import org.codehaus.jackson.JsonFactory
import org.codehaus.jackson.JsonParser
import org.codehaus.jackson.map.ObjectMapper
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager

import org.slf4j.LoggerFactory
import org.slf4j.Logger

class DockerUtil {
	
	public static final String HOST_RUNNING = "Running"

	protected static String OS = System.getProperty("os.name").toLowerCase()

	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerUtil))
	
	private static String DOCKER_MACHINE = "/usr/local/bin/docker-machine"

	
	/**
	 * Run the good docker-machine according to the OS.
	 */
	def static getDockerMachineCmd() {
		var String command = "docker-machine"
		if (getOS().equalsIgnoreCase("osx")) {
			command = DOCKER_MACHINE
			LOGGER.info("Machine OS={}", getOS())
		}
		return command
	}

	/**
	 * Parse String to Json data.
	 */
	def static jsonify(String jsonString) {
		if (jsonString != null || jsonString == "") {
			val ObjectMapper mapper = new ObjectMapper
			val JsonFactory factory = mapper.jsonFactory
			val JsonParser parser = factory.createJsonParser(jsonString)
			val node = mapper.readTree(parser)
			return node
		}
		return null
	}

	/**
	 * Parse `docker-machine ls` host from the running environment.
	 */
	def static getHosts() {
		val String data = DockerMachineManager.listHostCmd(Runtime.getRuntime)
		var Map<String, String> hosts = new HashMap
		if (data != null) {
			var String[] st = data.split("\\r?\\n")
			val list = Arrays.copyOfRange(st, 1, st.length)
			for (line : list) {

				// clean the line
				var l = line
				l = l.replaceAll("\\*", "")
				val String[] lsCmd = l.split("\\s+")
				if (lsCmd.length >= 3 && lsCmd.length < 5) {
					hosts.put(lsCmd.get(0), lsCmd.get(2))
				} else if (lsCmd.length >= 5) {
					if (lsCmd.contains("(master)")) {
						hosts.put(lsCmd.get(0), lsCmd.get(3))
					} else {
						hosts.put(lsCmd.get(0), lsCmd.get(3))
					}

				}
			}
		}
		return hosts
	}

	/**
	 * Get all existing hosts.
	 */
	def static getActiveHost() {
		val hosts = getHosts
		for (Map.Entry<String, String> entry : hosts.entrySet) {
			if (entry.value.equalsIgnoreCase(HOST_RUNNING)) {
				return entry.key
			}
		}

		// Start the machine
		val firstHost = hosts.keySet.get(0)
		println("first host" + firstHost)
		if (DockerMachineManager.startCmd(Runtime.getRuntime, firstHost)) {
			return firstHost
		}
	}

	/**
	 * Get all active hosts.
	 */
	def static getActiveHosts() {
		var Map<String, String> hosts = new HashMap
		for (Map.Entry<String, String> entry : getHosts.entrySet) {
			if (entry.value.equalsIgnoreCase(HOST_RUNNING)) {
				hosts.put(entry.key, entry.value)
			}
		}
		return hosts
	}

	/**
	 * Get all active ones from hosts, without calling Docker again 
	 */
	def static getActiveHosts(Map<String, String> hosts) {
		return hosts.filter[host, status|DockerUtil.HOST_RUNNING.equalsIgnoreCase(status)]
	}

	
	/**
	 * Parse `docker-machine ls` command as table.
	 */
	def static getEnv(String machineName) {
		val String data = DockerMachineManager.getEnvCmd(Runtime.getRuntime, machineName)
		var List<String[]> hosts = new ArrayList
		var String[] result = null
		val String charset = "DOCKER_CERT_PATH"
		if (data != null) {
			var String[] st = data.split("\\r?\\n")
			for (line : st) {
				if (line.startsWith("export") && line.contains(charset)) {
					val String[] lsCmd = line.split("\\s+")
					hosts.add(lsCmd)
					// var currentLine = (hosts.get(0) as String[]).get(1)
					var currentLine = lsCmd.get(1)
					result = currentLine.split("=")
					return result.get(1).replaceAll("\"", "")
				}
			}
		}
		val defaultMachineCertPath = #[ System.getProperty("user.home"), ".docker", "machine", "machines", machineName ].join(File.separator);
		if (new File(defaultMachineCertPath).canRead()) {
			return defaultMachineCertPath; // else DockerException because null certPath
		}
		return null
	}

	/**
	 * Delete a model.
	 */
	def deleteAllOldModels() {
		val File myFile = new File("Models")
		if (myFile.isDirectory()) {
			myFile.delete()
		}
	}

	/**
	 * Transform InputStream into String.
	 */
	def static String asString(InputStream response) {

		val StringWriter logwriter = new StringWriter

		try {
			val LineIterator itr = IOUtils.lineIterator(response, "UTF-8")

			while (itr.hasNext()) {
				var String line = itr.next()
				if (itr.hasNext()) {
					logwriter.write(line + "\n")
				} else {
					logwriter.write(line + "")
				}
			}
			response.close()

			return logwriter.toString()
		} catch (IOException e) {
			throw new RuntimeException(e)
		} finally {
			IOUtils.closeQuietly(response)
		}
	}

	/**
	 * Parse String in order to detect if it is Integer.
	 */
	def static isInteger(String value) {
		try {
			Integer.parseInt(value)
		} catch (NumberFormatException e) {
			return false
		}
		return true
	}
	
	/**
	 * Get the OS.
	 */
	def static boolean isWindows() {
		return (OS.indexOf("win") >= 0)
	}

	def static boolean isMac() {
		return (OS.indexOf("mac") >= 0)
	}

	def static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 )
	}

	def static boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0)
	}

	def static String getOS() {
		if (isWindows()) {
			return "win"
		} else if (isMac()) {
			return "osx"
		} else if (isUnix()) {
			return "uni"
		} else if (isSolaris()) {
			return "sol"
		} else {
			return "err"
		}
	}

}
