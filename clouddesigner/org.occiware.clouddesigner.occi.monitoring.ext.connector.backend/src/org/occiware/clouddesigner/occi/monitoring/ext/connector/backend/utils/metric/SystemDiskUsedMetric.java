package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric;

import org.occiware.driver.ssh.SSHShellThread;

public class SystemDiskUsedMetric extends SSHMetric {

	public SystemDiskUsedMetric(String name) {
		super(name);
		setOutputNames(new String[] { METRIC_STORAGE_SYSTEM_DISK_USED });
	}
	
	public SystemDiskUsedMetric(String name, SSHShellThread monitor) {
		super(name, monitor);
		setOutputNames(new String[] { METRIC_STORAGE_SYSTEM_DISK_USED });
	}

	@Override
	public String get(String channelName) throws NoSuchFieldException {
		return super.get(channelName);
	}
}
