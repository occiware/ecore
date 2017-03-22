/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;

import org.occiware.tinom.extensions.utils.PrintStreamPublisher;

public class SystemOutTinomPublisher extends PrintStreamPublisher {

	public SystemOutTinomPublisher(String name) {
		super(name, System.out);
	}

	@Override
	public void run() {
		String inputNames[] = getInputNames();

		for (String inputName : inputNames) {
			try {
				doPublish(inputName, get(inputName));
			} catch (NoSuchFieldException e) {
				doPublish(inputName, e);
			}
		}

	}

	public void stop() {
		// Release publisher.
		// LOGGER.debug("Stop specific publisher call.");
	}

}
