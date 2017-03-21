package old;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.occiware.driver.ssh.SSHShellThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetricsComputePublisher implements Runnable {

	private static Logger LOGGER = LoggerFactory.getLogger(MetricsComputePublisher.class);
	private boolean stopPublish = false;
	private boolean isStarted = false;

	private SSHShellThread sshMonitor;
	// protected ComputeConnector compute;

	/**
	 * Period in seconds.
	 */
	private int period = 1;
	private int periodmillis = 1000;

	/*public MetricsComputePublisher(SSHShellThread sshMonitor, int period, ComputeConnector compute) {
		this.sshMonitor = sshMonitor;
		this.period = period;
		// this.compute = compute;
	}
*/
	@Override
	public void run() {

		/*if (sshMonitor == null || !sshMonitor.isStarted() || compute == null) {
			stopPublish = true;
			isStarted = false;
			return;
		}
		isStarted = true;
		if (sshMonitor.isStarted()) {

			while (sshMonitor.getShellStream() == null) {
				LOGGER.debug("Ssh shell monitor : no shell stream...");
			}

			if (period < 0) {
				period = 1;
			}

			try {
				Thread.sleep(3000);
				// Wait 3 secs before reading metrics values.
			} catch (InterruptedException ex) {
			}

			boolean end = false;
			while (!end && !stopPublish) {
				try {
					periodmillis = period * 1000;
					Thread.sleep(periodmillis);
				} catch (InterruptedException ex) {
					// No op.
				}

				// Get the values.
				int cpuUsed = sshMonitor.getCurrentCpuUtilization();
				int diskUsed = sshMonitor.getCurrentDiskUsed();
				int ramUsed = sshMonitor.getCurrentRamUtilization();
				double loadAverage = sshMonitor.getLoadAverageDbl();

				// Update attributes on the compute emf entity.
				modifyResourceSet(cpuUsed, ramUsed, loadAverage, diskUsed);
			}*/
		}

//		isStarted = false;
//	}

	/**
	 * Update metrics attribute on a compute with mixin monitorcurrent and mixin
	 * credential.
	 * 
	 * @param cpuUsed
	 * @param memUsed
	 * @param loadAverage
	 * @param diskUsed
	 */
	public synchronized void modifyResourceSet(Integer cpuUsed, Integer memUsed, double loadAverage, Integer diskUsed) {

		/*if (compute.hasMixinMonitoring() && compute.hasMixinCredential()
				&& "true".equals(compute.getAttributeValueByOcciKey(ComputeConnector.ATTR_MONITOR_ACTIVATE))) {
			Map<String, String> attrsToCreate = new HashMap<>();
			Map<String, String> attrsToUpdate = new HashMap<>();
			List<String> attrsToDelete = new ArrayList<>();

			if (compute.getAttributeStateObject(ComputeConnector.ATTR_MONITOR_CPU_PERCENT) == null) {
				attrsToCreate.put(ComputeConnector.ATTR_MONITOR_CPU_PERCENT, cpuUsed + "");
			} else {
				attrsToUpdate.put(ComputeConnector.ATTR_MONITOR_CPU_PERCENT, cpuUsed + "");
			}
			if (compute.getAttributeStateObject(ComputeConnector.ATTR_MONITOR_RAM_PERCENT) == null) {
				attrsToCreate.put(ComputeConnector.ATTR_MONITOR_RAM_PERCENT, memUsed + "");
			} else {
				attrsToUpdate.put(ComputeConnector.ATTR_MONITOR_RAM_PERCENT, memUsed + "");
			}
			if (compute.getAttributeStateObject(ComputeConnector.ATTR_MONITOR_LOAD_AVERAGE) == null) {
				attrsToCreate.put(ComputeConnector.ATTR_MONITOR_LOAD_AVERAGE, loadAverage + "");
			} else {
				attrsToUpdate.put(ComputeConnector.ATTR_MONITOR_LOAD_AVERAGE, loadAverage + "");
			}
			if (compute.getAttributeStateObject(ComputeConnector.ATTR_MONITOR_DISK_USED) == null) {
				attrsToCreate.put(ComputeConnector.ATTR_MONITOR_DISK_USED, diskUsed + "");
			} else {
				attrsToUpdate.put(ComputeConnector.ATTR_MONITOR_DISK_USED, diskUsed + "");
			}

			if (UIDialog.isStandAlone()) {
				// Headless environment.
				EntityUtilsHeadless.updateAttributes(compute, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				EntityUtils.updateAttributes(compute, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
		}*/
	}

	public void stopPublish() {
		this.stopPublish = true;
	}

	public boolean isStarted() {
		return this.isStarted;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

}
