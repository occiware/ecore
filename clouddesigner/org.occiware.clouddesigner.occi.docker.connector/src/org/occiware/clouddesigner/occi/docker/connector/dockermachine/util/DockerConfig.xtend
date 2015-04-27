package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util

import java.io.IOException
import java.util.Properties

class DockerConfig {
	val static String DOCKER_PROPERTIES_PROPERTY = "docker.properties"

	def static loadConfig() {
		try {
			val Properties p = new Properties
			p.load(DockerConfig.getResourceAsStream("/" + DOCKER_PROPERTIES_PROPERTY))

			//replaceProperties(p, systemProperties);
			return p;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
