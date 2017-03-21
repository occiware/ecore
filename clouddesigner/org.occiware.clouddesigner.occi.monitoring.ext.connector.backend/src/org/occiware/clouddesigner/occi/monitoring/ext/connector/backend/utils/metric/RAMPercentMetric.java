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
