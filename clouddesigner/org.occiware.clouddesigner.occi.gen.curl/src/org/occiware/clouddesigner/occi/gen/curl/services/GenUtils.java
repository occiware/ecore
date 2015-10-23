package org.occiware.clouddesigner.occi.gen.curl.services;

import org.occiware.clouddesigner.occi.Configuration;

public class GenUtils {

	public String configurationFileName(Configuration configuration) {
		return configuration.eResource().getURI().lastSegment();
	}
}
