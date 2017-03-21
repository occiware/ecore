package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception.MonitorException;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.CPUPercentMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.LoadAverageMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.RAMPercentMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SSHMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SystemDiskUsedMetric;
import org.occiware.driver.ssh.SSHShellThread;
import org.occiware.driver.ssh.SshClient;
import org.occiware.tinom.model.Collector;
import org.occiware.tinom.model.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SshTinomCollector extends Collector {
	private static Logger LOGGER = LoggerFactory.getLogger(SshTinomCollector.class);

	// For monitoring with occissh library (with ssh shell monitoring script.).
	private SSHShellThread sshMonitor = null;

	private String ipAddress;
	private String username;
	private String password;
	private String knownHostFileName = System.getProperty("user.home") + File.separator + ".ssh" + File.separator
			+ "known_hosts";
	private int port = 22;
	private String userPassPhrase = null;

	private String privateKeyFileName = null;
	private int sshClientTimeOut = 5000;

	public SshTinomCollector(String name) {
		super(name);
		System.out.println("Constructor with name called.");
	}

	public SshTinomCollector(String name, int period) {
		super(name, period);
		System.out.println("Constructor with name AND period called. : " + name + " --> " + period);
	}

	@Override
	public void run() {
		// Note: Default implementation (Collector) does nothing.
		System.out.println("SshTinomCollector run() method called.");
		if (sshMonitor == null || !sshMonitor.isStarted()) {
			// Launch ssh thread.
			if (ipAddress != null && ((username != null && password != null) || privateKeyFileName != null)) {
				SshClient sshClient = new SshClient(username, password, userPassPhrase, knownHostFileName, ipAddress,
						port);
				sshClient.setTimeout(sshClientTimeOut);
				StringBuilder scriptB;
				try {
					scriptB = readScriptMonitoringFile("marsmon.sh");
				} catch (MonitorException ex) {
					return;
				}
				if (scriptB.toString().length() > 0) {
					ByteArrayInputStream in = new ByteArrayInputStream(scriptB.toString().getBytes());
					sshMonitor = new SSHShellThread(sshClient);
					sshMonitor.setScriptInputStream(in);
					
					// Assign sshMonitor to metrics to retrieve values after.
					List<Metric> metricVals = this.getMetrics();
					for (Metric metric : metricVals) {
						if (metric instanceof SSHMetric) {
							SSHMetric sshMetric = (SSHMetric) metric;
							sshMetric.setSshMonitor(sshMonitor);
						}
					}
					LOGGER.info("Start the monitoring service via ssh.");
					// Launch the monitoring thread.
					Thread thread = new Thread(sshMonitor);
					thread.start();

				} else {
					LOGGER.warn("Cant load script monitoring file : !, cannot start monitoring.");
				}

			} else {
				LOGGER.warn("Cant start monitoring from collector on " + ipAddress
						+ ", this should be : username is missing or private filename is missing.");
			}
		} // endif ssh thread is null or not started.
	}

	/**
	 * Read a script
	 * 
	 * @throws MonitorException
	 */
	private StringBuilder readScriptMonitoringFile(String fileName) throws MonitorException {
		InputStream in = SshTinomCollector.class.getResourceAsStream(("/resources/" + fileName));
		StringBuilder script = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;

			while ((line = reader.readLine()) != null) {
				script.append(line).append("\n");
			}

		} catch (IOException ex) {
			// For debug purpose...
			System.err.println("Can't load monitoring script file, exiting... Message: " + ex.getMessage());
			LOGGER.error("Can't load monitoring script file, exiting... Message: " + ex.getMessage());
			throw new MonitorException("Can't load monitoring script file.", ex);
		} finally {
			org.occiware.driver.ssh.Utils.closeQuietly(in);
		}
		return script;
	}

	@Override
	public void stop() {
		// Stop timer.
		super.stop();
		// Stop monitoring thread.
		if (sshMonitor != null && sshMonitor.isStarted()) {
			sshMonitor.stop();
		}

	}

	public SSHShellThread getSshMonitor() {
		return sshMonitor;
	}

	public void setSshMonitor(SSHShellThread sshMonitor) {
		this.sshMonitor = sshMonitor;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKnownHostFileName() {
		return knownHostFileName;
	}

	public void setKnownHostFileName(String knownHostFileName) {
		this.knownHostFileName = knownHostFileName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUserPassPhrase() {
		return userPassPhrase;
	}

	public void setUserPassPhrase(String userPassPhrase) {
		this.userPassPhrase = userPassPhrase;
	}

	public String getPrivateKeyFileName() {
		return privateKeyFileName;
	}

	public void setPrivateKeyFileName(String privateKeyFileName) {
		this.privateKeyFileName = privateKeyFileName;
	}

	public int getSshClientTimeOut() {
		return sshClientTimeOut;
	}

	public void setSshClientTimeOut(int sshClientTimeOut) {
		this.sshClientTimeOut = sshClientTimeOut;
	}

}
