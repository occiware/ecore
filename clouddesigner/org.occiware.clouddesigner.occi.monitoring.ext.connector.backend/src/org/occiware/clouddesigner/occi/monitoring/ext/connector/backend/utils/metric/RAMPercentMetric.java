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
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric;

import org.occiware.driver.ssh.SSHShellThread;

public class RAMPercentMetric extends SSHMetric {

	public RAMPercentMetric(String name) {
		super(name);
		setOutputNames(new String[] { METRIC_RAM_PERCENT });
	}
	
	public RAMPercentMetric(String name, SSHShellThread monitor) {
		super(name, monitor);
		setOutputNames(new String[] { METRIC_RAM_PERCENT });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		return super.get(channelName);
	}
}
