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

import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.CollectorType;
import org.occiware.driver.ssh.SSHShellThread;

public class CPUPercentMetric extends SSHMetric {

	public CPUPercentMetric(String name) {
		super(name);
		setOutputNames(new String[] { CollectorType.MIXIN_METRIC_CPU_PERCENT });

	}

	public CPUPercentMetric(String name, SSHShellThread monitor) {
		super(name, monitor);
		setOutputNames(new String[] { CollectorType.MIXIN_METRIC_CPU_PERCENT });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		String value = super.get(channelName);
		// System.out.println("Value from cpupercentmetric: " + value + " -->
		// from channel name : " + channelName);
		return value;
	}

}
