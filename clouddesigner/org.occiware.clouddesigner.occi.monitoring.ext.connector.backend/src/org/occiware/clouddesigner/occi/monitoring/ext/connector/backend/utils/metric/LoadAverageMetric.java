package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric;

import org.occiware.driver.ssh.SSHShellThread;

public class LoadAverageMetric extends SSHMetric {
	
	public LoadAverageMetric(String name) {
		super(name);
		setOutputNames(new String[] { METRIC_LOAD_AVG });
	}
	
	public LoadAverageMetric(String name, SSHShellThread monitor) {
		super(name, monitor);
		setOutputNames(new String[] { METRIC_LOAD_AVG });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		return super.get(channelName);
	}
}
