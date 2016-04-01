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

import java.io.IOException
import java.util.Properties
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DockerConfig {
	// Initialize logger for CommandFactory.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerConfig))	
	val static String DOCKER_PROPERTIES_PROPERTY = "docker.properties"

	def loadConfig() {
		try {
			val Properties p = new Properties
			p.load(DockerConfig.getResourceAsStream("/" + DOCKER_PROPERTIES_PROPERTY))
			return p;
		} catch (IOException e) {
			LOGGER.error("Error: unable to load docker.properties file")
			throw new RuntimeException(e)
		}
	}
}
