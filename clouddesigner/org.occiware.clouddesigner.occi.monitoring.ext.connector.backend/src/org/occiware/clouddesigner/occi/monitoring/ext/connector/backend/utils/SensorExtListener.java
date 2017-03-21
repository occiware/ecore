package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Level;
// import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.occi.AttributeState;
// import org.eclipse.jface.operation.IRunnableWithProgress;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.SensorextConnector;
import org.occiware.driver.ssh.SSHShellThread;
import org.occiware.driver.ssh.SshClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import old.MetricsComputePublisher;

/**
 * This class observe the activateMonitoring value and attach listener for
 * metrics automatically.
 * 
 * @author Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
public class SensorExtListener {
	private static Logger LOGGER = LoggerFactory.getLogger(SensorExtListener.class);

	// protected static ComputeConnector compute = null;

	// For monitoring with occissh library (with ssh shell monitoring script.).
	private SSHShellThread sshMonitor = null;
	
	private MetricsComputePublisher metricsLightPublisher = null;

	public void AddListener(SensorextConnector sensorExtConn) {
		// For debug purpose...
		System.out.println("In add listener to sensor method : " + sensorExtConn.getTitle() + " --> " + sensorExtConn.getId());
		
		// Make a reference copy
		// compute = (ComputeConnector) EcoreUtil.copy(computeConn);

		// ADD listener to Class to manage start and stop monitoring...
		sensorExtConn.eAdapters().add(new EContentAdapter() {

			@Override
			public void notifyChanged(Notification notification) {
				// super.notifyChanged(notification);
				SensorextConnector deletedSensor = null;
				SensorextConnector newSensor = null;

				// Case of deleting a sensor.
				if (notification.getEventType() == Notification.REMOVE
						&& notification.getNotifier() instanceof SensorextConnector) {
					deletedSensor = (SensorextConnector) notification.getNotifier();
					// Notify the deleted element in the model
					LOGGER.info("Delete model sensor element with ID: {}", deletedSensor.getId());
					// Stop the monitoring.
					LOGGER.info("Stopping the monitoring for this sensor : " + deletedSensor.getId());
					deletedSensor.stopMonitoring();
				}
				// Updating attributes.
				if (notification.getEventType() == Notification.SET && notification.getNotifier() instanceof SensorextConnector) {
					String featureClassName = notification.getFeature().getClass().getName();
					if (notification.getFeature() instanceof EAttribute) {
						EAttribute eAttr = (EAttribute)notification.getFeature();
						String attrName = eAttr.getName();
						
						// To manage specific attribute changed and events about them..
						
					}
					System.out.println("Set notification send : " + featureClassName);
				}

				if (notification.getNotifier() instanceof SensorextConnector) {
					newSensor = (SensorextConnector) notification.getNotifier();
					
					
					// Manage activeMonitoring attribute.
					// Start the ssh thread if true.
					// Stop the monitoring if false.
					// if (newSensor.hasMixin(newCompute.VMWARE_MIXIN_CREDENTIAL) && newCompute.hasMixin(newCompute.MIXIN_USERDATA)) {
						// Get the attribute value activateMonitor...
						// TODO: Reactivate here when refactor is done.
						// Boolean activateMonitor = Boolean
						//		.valueOf(newCompute.getAttributeValueByOcciKey(ComputeConnector.ATTR_MONITOR_ACTIVATE));
						// if (activateMonitor == null) {
						//	activateMonitor = false;
						// }
						// if (activateMonitor
						//		&& newCompute.getState().equals(ComputeStatus.ACTIVE)) {
						//	// Start the monitoring service.
						//	try {
						//		startMonitoring(newCompute);
						//	} catch (MonitorException ex) {
						//		LOGGER.error(ex.getClass().getName() + " --> " + ex.getMessage());
						//	}
						//}
						//if (!activateMonitor) {
						//	// Stop the monitoring service.
						//	// For debug purpose...
						//	System.out.println("Stopping monitoring service from compute : " + newCompute.getTitle() + " --> " + newCompute.getId());
							
						//	stopMonitoring();
						// }
						// If the instance becomes inactive, it must stop the monitoring. 
					//	if (newCompute.getState().equals(ComputeStatus.INACTIVE)) {
					//		stopMonitoring();
					//	}	
					}
				}

		});

	}
		
		
	/*}

	private void startMonitoring(ComputeConnector computeConn) throws MonitorException {
		if (computeConn != null && (sshMonitor == null || !this.sshMonitor.isStarted()) ) {
			String ipv4Address = computeConn.getIpv4Address();
			
			// if (ipv4Address == null || ipv4Address.trim().isEmpty()) {
			//	computeConn.retrieveIpAddresses(); // Retrieve ip.
			// }
			
			
			if (ipv4Address != null && !ipv4Address.trim().isEmpty()) {
				// For debug purpose...
				System.out.println("Starting monitoring service to compute : " + computeConn.getTitle() + " --> " + computeConn.getId());
				
				// Connect to ssh.
				// TODO : Add a new attribute within ssh mixin for known hosts
				// filename.
				String knownHosts = System.getProperty("user.home") + File.separator + ".ssh" + File.separator
						+ "known_hosts";
				// TODO : Add a new ssh attribute for port.
				int port = 22;
				// TODO : Add a new ssh attribute for passphrase.
				String userPassPhrase = null;

				// TODO : Add a new ssh attribute for keypair support
				// (privatekey filename because there is already a mixin for ssh
				// public key, with default value id_rsa.).
				String username = computeConn.getAttributeValueByOcciKey(ComputeConnector.ATTR_USERNAME);
				String password = computeConn.getAttributeValueByOcciKey(ComputeConnector.ATTR_PASSWORD);

				// TODO : Add a new ssh attribute for client timeout session.
				int sshClientTimeOut = 5000;

				SshClient sshClient = new SshClient(username, password, userPassPhrase, knownHosts, ipv4Address, port);
				sshClient.setTimeout(sshClientTimeOut);

				// Load monitoring script.
				StringBuilder scriptB = readScriptMonitoringFile("marsmon.sh");
				if (scriptB.toString().length() > 0) {
					ByteArrayInputStream in = new ByteArrayInputStream(scriptB.toString().getBytes());
					sshMonitor = new SSHShellThread(sshClient);
					sshMonitor.setScriptInputStream(in);
					LOGGER.info("Start the monitoring light service.");
					// Launch the monitoring thread.
					Thread thread = new Thread(sshMonitor);
					thread.start();

				} else {
					LOGGER.warn("Cant load script monitoring file !, cannot start monitoring.");
				}
				// Launch the publisher thread if none...
				if (metricsLightPublisher == null) {
					// TODO : Make period an attribute of a mixin (period will be taken from sensor object after).
					metricsLightPublisher = new MetricsComputePublisher(sshMonitor, 1, computeConn);
				}
				if (metricsLightPublisher.isStarted()) {
					// Stop the publisher thread and restart it.
					System.out.println("Stopping metrics publisher...");
					metricsLightPublisher.stopPublish();
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
					}
				}
				System.out.println("Starting metrics publisher thread...");
				Thread metricsPublisherTh = new Thread(metricsLightPublisher);
				metricsPublisherTh.start();
			}
		}

	}

	*//**
	 * Read a script
	 * 
	 * @throws MonitorException
	 *//*
	private StringBuilder readScriptMonitoringFile(String fileName) throws MonitorException {
		InputStream in = ComputeMonitoringObserver.class.getResourceAsStream(("/resources/" + fileName));
		StringBuilder script = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;

			while ((line = reader.readLine()) != null) {
				script.append(line).append("\n");
			}

		} catch (IOException ex) {
			// For debug purpose...
			System.out.println("Can't load monitoring script file, exiting... Message: " + ex.getMessage());
			LOGGER.error("Can't load monitoring script file, exiting... Message: " + ex.getMessage());
			throw new MonitorException("Can't load monitoring script file.", ex);
		} finally {
			org.occiware.driver.ssh.Utils.closeQuietly(in);
		}
		return script;
	}

	private void stopMonitoring() {
		if (sshMonitor != null && sshMonitor.isStarted()) {
			LOGGER.info("Desactivate the monitoring process thread.");
			
			if (metricsLightPublisher != null && metricsLightPublisher.isStarted()) {
				metricsLightPublisher.stopPublish();
			}
			
			// This will cause the thread to stop after reading last metrics
			// values.
			sshMonitor.stop();	
		}
	}*/

}
