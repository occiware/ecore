/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Mon Mar 13 17:10:17 CET 2017 from platform:/resource/org.occiware.clouddesigner.occi.monitoring.ext/model/monitoringext.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend;

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus;
import org.occiware.clouddesigner.occi.infrastructure.Networkinterface;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception.MonitorException;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.SshTinomCollector;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.CPUPercentMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.LoadAverageMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.RAMPercentMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SSHMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SystemDiskUsedMetric;
import org.occiware.tinom.model.Collector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/monitoring/ext# - term: sshcollector - title:
 * Collector data metrics with an ssh script
 */
public class SshcollectorConnector extends monitoringext.impl.SshcollectorImpl implements CollectorType {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SshcollectorConnector.class);
	
	// TODO : When v2 will be available, use here an interface. Mixin will give collector typology and implementation.
	private SshTinomCollector tinomCollector;
	
	/**
	 * Constructs a sshcollector connector.
	 */
	SshcollectorConnector() {
		LOGGER.debug("Constructor called on " + this);
		System.out.println("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Sshcollector instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
		// Start or restart the timon collector.
		if (tinomCollector != null) {
			tinomCollector.stop();
			tinomCollector.setPeriod(period);
			tinomCollector.start();
		}
	}

	/**
	 * Called when this Sshcollector instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sshcollector instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sshcollector instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		if (tinomCollector != null) {
			tinomCollector.stop();
		}
	}

	// private void addMonitoringListener() {
	// if (!activeMonitoringListener) {
	// monitoringObserver.AddListener(this);
	// activeMonitoringListener = true;
	// }
	// }

	//
	// Sshcollector actions.
	//
	
	
	//
	// Specific TINOM part.
	//
	
	/**
	 * Get a mapped tinom collector used by sensor to build the complete monitoring sequence.
	 * @return a tinom collector object, this must never return null.
	 */
	@Override
	public Collector getTinomCollector() throws MonitorException {
		// check the collector type has changed.
		if (tinomCollector == null) {
			tinomCollector = buildCollectorWithValues(new SshTinomCollector(id, period));
		}
		return tinomCollector;
	}
	
	/**
	 * Retrieve values from linked resources target and build collector
	 * consequently.
	 * 
	 * @param collector
	 * @return
	 */
	private SshTinomCollector buildCollectorWithValues(SshTinomCollector collector) throws MonitorException {
		// Retrieve the linked compute.
		Resource res = this.getTarget();
		Compute compute = null;
		if (res instanceof Compute) {
			compute = (Compute) res;
			if (compute.getState().equals(ComputeStatus.ACTIVE)) {
				// Retrieve ip address.
				String ipAddress = null;
				String username = null;
				String password = null;
				// TODO : Find to a way to get ip address without guest tools
				// for VMware....
				// TODO : Enable usage of keypair for next iteration (include
				// update of occissh driver).
				// TODO : Enable of passphrases. Retrieve passphrase.
				// TODO : Enable knwonHost file....
				// TODO : Enable ssh timeout client value (to retrieve via a ssh
				// mixin for example), this is idem for the port number.

				// find the connected network interface and get ipAdress value.
				Networkinterface networkInt = null;
				EList<AttributeState> attrs = null;
				EList<Link> links = compute.getLinks();
				
				if (links == null || links.isEmpty()) {
					throw new MonitorException("Cant retrieve ipAddress for ssh connection, there is no NetworkInterface defined in the scope of this compute : " + compute);
				}
				for (Link link : links) {
					if (link instanceof Networkinterface) {
						networkInt = (Networkinterface) link;
						if (networkInt.getState().equals(NetworkInterfaceStatus.ACTIVE)) {
							attrs = networkInt.getAttributes();
							for (AttributeState attr : attrs) {
								if (attr.getName().equals("occi.networkinterface.address")) {
									ipAddress = attr.getValue();
									break;
								}
							}
						}
					}
					if (ipAddress != null) {
						break;
					}
				}
				if (ipAddress == null || ipAddress.trim().isEmpty()) {
					throw new MonitorException("Cant retrieve ipAddress for ssh connection, there is no IpAddress attribute defined on NetworkInterface in the scope of this compute : " + compute);
				}
				// Retrieve the username and password.
				attrs = compute.getAttributes();
				for (AttributeState attr : attrs) {
					// Those values is used within backend --> credential mixin.
					if (attr.getName().equals("user")) {
						username = attr.getValue();
					}
					if (attr.getName().equals("password")) {
						password = attr.getValue();
					}
					if (username != null && password != null) {
						break;
					}
				}
				if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
					throw new MonitorException("Username or password is not set on the compute.");
				}
				if (ipAddress == null || ipAddress.trim().isEmpty()) {
					throw new MonitorException("Ip address is not retrieved.");
				}
				collector.setIpAddress(ipAddress);
				collector.setPassword(password);
				collector.setUsername(username);
				collector.withMetric(new CPUPercentMetric(SSHMetric.METRIC_CPU_PERCENT));
				collector.withMetric(new RAMPercentMetric(SSHMetric.METRIC_RAM_PERCENT));
				collector.withMetric(new LoadAverageMetric(SSHMetric.METRIC_LOAD_AVG));
				collector.withMetric(new SystemDiskUsedMetric(SSHMetric.METRIC_STORAGE_SYSTEM_DISK_USED));
				
				if (period == 0) {
					// Minimal period is 0 but for Tinom the period -1 is one shot. 
					period = -1;
				}
				
			}
		} else {
			LOGGER.warn("Collector not implemented for storage and network link, this will be on next release..");
			
		}
		// TODO : If link is on network or storage. Build collectors consequently.
		return collector;
	}
	
	
}
