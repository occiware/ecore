/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.gen.conf.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;

public class GenUtils
{
	/**
	 * Get the current date.
	 * @return the current date.
	 */
	public String getNow() {
		return new Date().toString();
	}

	/**
	 * Get the file path of a configuration.
	 * @param extension the given configuration.
	 * @return the file path of the given configuration.
	 */
	public String getFilePath(Configuration configuration) {
		return configuration.eResource().getURI().toString();
	}

	/**
	 * Get the filename of a given configuration.
	 * @param configuration a given configuration.
	 * @return the filename of the given configuration.
	 */
	public String configurationFileName(Configuration configuration) {
		return configuration.eResource().getURI().lastSegment();
	}

	public List<Container> getOrderedContainers(Machine machine) {
		List<Container> res = new ArrayList<Container>();
		for (Link link : machine.getLinks()) {
			Resource target = link.getTarget();
			if (target instanceof Container) {
				// TODO improve algo
				if (target.getLinks().isEmpty()) {
					res.add(0, (Container) target);
				} else {
					res.add((Container) target);
				}
			}
		}
		return res;
	}

	public Integer toInteger(Float f) {
		return Math.round(f);
	}
}
