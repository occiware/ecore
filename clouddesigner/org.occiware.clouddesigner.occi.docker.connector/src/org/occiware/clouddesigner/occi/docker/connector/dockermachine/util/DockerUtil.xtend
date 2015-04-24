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
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager

class DockerUtil {
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

	def static getHosts() {
		val String data = DockerMachineManager.listHostCmd(Runtime.getRuntime)
		var Map<String, String> hosts = new HashMap
		if (data != null) {
			var String[] st = data.split("\\r?\\n")
			val list = Arrays.copyOfRange(st, 1, st.length)
			for (line : list) {
				val String[] lsCmd = line.split("\\s+")
				if (lsCmd.length >= 3 && lsCmd.length < 5) {
					hosts.put(lsCmd.get(0), lsCmd.get(2))
				} else if (lsCmd.length >= 5) {
					hosts.put(lsCmd.get(0), lsCmd.get(3))
				}
			}
		}
		return hosts
	}

	def static getActiveHost() {
		val hosts = getHosts
		for (Map.Entry<String, String> entry : hosts.entrySet) {
			if (entry.value == "Running") {
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

	def static getActiveHosts() {
		var Map<String, String> hosts = new HashMap
		for (Map.Entry<String, String> entry : hosts.entrySet) {
			if (entry.value == "Running") {
				hosts.put(entry.key, entry.value)
			}
		}
		return hosts
	}

	def static getEnv(String machineName) {
		println("Machine name: " + machineName)
		val String data = DockerMachineManager.getEnvCmd(Runtime.getRuntime, machineName)
		var List hosts = new ArrayList
		var String[] result = null
		if (data != null) {
			var String[] st = data.split("\\r?\\n")
			for (line : st) {
				if (line.startsWith("export")) {
					val String[] lsCmd = line.split("\\s+")
					hosts.add(lsCmd)
				}
			}
			var currentLine = (hosts.get(1) as String[]).get(1)
			result = currentLine.split("=")
		}
		return result.get(1).replaceAll("\"", "")
	}

	def deleteAllOldModels() {
		val File myFile = new File("Models");
		if (myFile.isDirectory()) {
			myFile.delete();
		}
	}

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
}
