/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerConfig {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerConfig.class);
  
  private final static String DOCKER_PROPERTIES_PROPERTY = "docker.properties";
  
  public Properties loadConfig() {
    try {
      final Properties p = new Properties();
      InputStream _resourceAsStream = DockerConfig.class.getResourceAsStream(("/" + DockerConfig.DOCKER_PROPERTIES_PROPERTY));
      p.load(_resourceAsStream);
      return p;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        DockerConfig.LOGGER.error("Error: unable to load docker.properties file");
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
