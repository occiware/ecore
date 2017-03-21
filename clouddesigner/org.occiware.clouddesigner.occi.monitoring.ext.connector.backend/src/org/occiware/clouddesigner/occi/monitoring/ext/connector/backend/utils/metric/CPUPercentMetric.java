package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric;

import org.occiware.driver.ssh.SSHShellThread;

public class CPUPercentMetric extends SSHMetric {
	
	public CPUPercentMetric(String name) {
		super(name);
		setOutputNames(new String[] { METRIC_CPU_PERCENT });
		
	}
	
	public CPUPercentMetric(String name, SSHShellThread monitor) {
		super(name, monitor);
		setOutputNames(new String[] { METRIC_CPU_PERCENT });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		String value = super.get(channelName);
		System.out.println("Value from cpupercentmetric: " + value + " --> from channel name : " + channelName);
		return value;
	}

}
