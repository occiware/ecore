package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util

import java.io.IOException
import java.util.Properties

class DockerConfig {
	val static String DOCKER_PROPERTIES_PROPERTY = "docker.properties"

	def loadConfig() {
		try {
			val Properties p = new Properties
			p.load(DockerConfig.getResourceAsStream("/" + DOCKER_PROPERTIES_PROPERTY))
			return p;
		} catch (IOException e) {
			println("Erreur \n\n\n\n")
			throw new RuntimeException(e)
		}
	}
}
