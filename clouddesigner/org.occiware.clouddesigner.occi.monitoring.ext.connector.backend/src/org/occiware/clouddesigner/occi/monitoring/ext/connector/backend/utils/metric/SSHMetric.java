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
import org.occiware.tinom.model.Metric;

public class SSHMetric extends Metric {
	
	// Ref to runnable monitor values.
	private SSHShellThread sshMonitor = null;

	public SSHMetric(String name) {
		super(name);
	}

	public SSHMetric(String name, SSHShellThread sshMonitor) {
		super(name);
		this.sshMonitor = sshMonitor;
	}

	/**
	 * Get value from metrics...
	 */
	@Override
	public String get(String channelName) throws NoSuchFieldException {
		String value = "0.0";
		if (sshMonitor != null && sshMonitor.isStarted()) {
			switch (channelName) {
			case CollectorType.MIXIN_METRIC_CPU_PERCENT: {
				value = Double.toString(sshMonitor.getCurrentCpuUtilizationDbl());
				break;
			}
			case CollectorType.MIXIN_METRIC_RAM_PERCENT: {
				value = Double.toString(sshMonitor.getCurrentRamUtilizationDbl());
				break;
			}
			case CollectorType.MIXIN_METRIC_LOAD_AVG: {
				value = Double.toString(sshMonitor.getLoadAverageDbl());
				break;
			}
			case CollectorType.MIXIN_METRIC_DISK_USED: {
				value = Double.toString(sshMonitor.getCurrentDiskUsedDbl());
				break;
			}
			}
		}
		return value;
	}

	public SSHShellThread getSshMonitor() {
		return sshMonitor;
	}

	public void setSshMonitor(SSHShellThread sshMonitor) {
		this.sshMonitor = sshMonitor;
	}

}