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
