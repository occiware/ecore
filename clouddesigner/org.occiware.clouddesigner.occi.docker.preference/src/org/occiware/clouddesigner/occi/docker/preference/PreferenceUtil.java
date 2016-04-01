package org.occiware.clouddesigner.occi.docker.preference;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreferenceUtil {
	static String DOCKER_PROPERTIES_PROPERTY = "docker.properties";
	// Initialize logger for PreferenceValues.
	private static Logger LOGGER = LoggerFactory.getLogger(PreferenceUtil.class);

	public Properties loadConfig() {
		try {
			Properties p = new Properties();
			p.load(PreferenceUtil.class.getResourceAsStream("/" + DOCKER_PROPERTIES_PROPERTY));
			return p;
		} catch (IOException e) {
			LOGGER.error("Error: unable to load docker.properties file");
			throw new RuntimeException(e);
		}
	}

}
