package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric;

import org.occiware.driver.ssh.SSHShellThread;
import org.occiware.tinom.model.Metric;

public class SSHMetric extends Metric {
	public static final String METRIC_CPU_PERCENT = "cpuPercent";
	public static final String METRIC_RAM_PERCENT = "ramPercent";
	public static final String METRIC_LOAD_AVG = "loadAvg";
	public static final String METRIC_STORAGE_SYSTEM_DISK_USED = "diskUsed";

	// for future values.
	public static final String METRIC_NETWORK_IN = "netin";
	public static final String METRIC_NETWORK_OUT = "netout";

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
					case METRIC_CPU_PERCENT: {
						value = Double.toString(sshMonitor.getCurrentCpuUtilizationDbl());
						break;
					}
					case METRIC_RAM_PERCENT: {
						value = Double.toString(sshMonitor.getCurrentRamUtilizationDbl());
						break;
					}
					case METRIC_LOAD_AVG: {
						value = Double.toString(sshMonitor.getLoadAverageDbl());
						break;
					}
					case METRIC_STORAGE_SYSTEM_DISK_USED: {
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