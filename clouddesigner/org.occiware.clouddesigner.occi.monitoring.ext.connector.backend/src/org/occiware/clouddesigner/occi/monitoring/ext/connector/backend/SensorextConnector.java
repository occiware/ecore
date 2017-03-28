/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 * Generated at Mon Mar 13 17:10:17 CET 2017 from platform:/resource/org.occiware.clouddesigner.occi.monitoring.ext/model/monitoringext.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception.MonitorException;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.EMFTinomPublisher;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.EntityUtils;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.SensorExtListener;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.SshTinomCollector;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.SystemOutTinomPublisher;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SSHMetric;
import org.occiware.tinom.extensions.sample.jmx.CpuMetric;
import org.occiware.tinom.model.Aggregator;
import org.occiware.tinom.model.Collector;
import org.occiware.tinom.model.Metric;
import org.occiware.tinom.model.OutputInterface;
import org.occiware.tinom.model.Publisher;
import org.occiware.tinom.model.Sensor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import monitoringext.MonitorState;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/monitoring/ext# - term: sensorext - title: A sensor
 * with a publisher to directly have bars and display its values in a nice way
 * on designer
 */
public class SensorextConnector extends monitoringext.impl.SensorextImpl {

	public static final String SENSOR_MIXIN_SYSOUT_PUBLISHER = "systemout-publisher";
	public static final String SENSOR_MIXIN_EMF_PUBLISHER = "emf-publisher";

	/**
	 * This boolean is for updating cpu - ram etc. values of this sensor when an
	 * emf-publisher mixin is set.
	 */
	private boolean updateAttributesSensor = false;

	private Sensor tinomSensor;
	private List<Collector> tinomCollectors = new ArrayList<>();
	private List<Publisher> tinomPublishers = new ArrayList<>();
	
	/**
	 * To manage the observer (when the object has changed).
	 */
	private boolean monitoringListener = false;
	
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SensorextConnector.class);

	/**
	 * Constructs a sensorext connector.
	 */
	SensorextConnector() {
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Sensorext instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);

		// For each linked collectors start sensor monitoring.
		// Be warned : if no linked collectors found, this must do nothing and
		// alert user.
		addMonitoringListener();
		buildTinomObjects();
		startMonitoring();
	}

	/**
	 * Called when this Sensorext instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);

	}

	/**
	 * Called when this Sensorext instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sensorext instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		stopMonitoring();
	}

	//
	// Sensorext actions.
	//

	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/monitoring/ext/sensorext/action# - term:
	 * startMonitoring - title: Start the monitoring system for this sensor
	 */
	@Override
	public void startMonitoring() {
		LOGGER.debug("Action startMonitoring() called on " + this);
		boolean sensorStarted = false;
		if (this.getMonitorstate().equals(MonitorState.OFF)) {
			LOGGER.debug("Starting monitoring...");
			if (tinomSensor == null) {
				buildTinomObjects();
				if (tinomSensor == null) {
					LOGGER.error("An unexpected error has been thrown, please see logs.");
					return;
				}
			}		
			tinomSensor.start();	
			sensorStarted = true;
		} else {
			tinomSensor.stop();
			for (Collector collector : tinomCollectors) {
				collector.stop();
			}
			this.setMonitorstate(MonitorState.OFF);
			// Restart sensor.
			tinomSensor.start();
			sensorStarted = true;
		}
		if (sensorStarted) {
			String collectorName = null;
			// start the collectors.
			for (OutputInterface collector : tinomCollectors) {
				collectorName = collector.getName();
				if (collector instanceof Aggregator) {
					// start period Managed by publisher...
				}
				if (collector instanceof Collector) {
					Collector tinomCollector = (Collector) collector;
					if (tinomCollector instanceof SshTinomCollector) {
						// Specific for ssh script, the ssh thread (from script launch) set values from his thread one second period callback.
						tinomCollector.run();
					} else {
						tinomCollector.start();
					}
					
					
				}
				/*String[] outputNames = collector.getOutputNames();
				if (outputNames != null && outputNames.length > 0) {
					for (String name : outputNames) {
						LOGGER.debug(name);
					}
					
				}
				String[] collectorInputChannels = tinomSensor.getInputNames();
				if (collectorInputChannels != null && collectorInputChannels.length > 0) {
					for (String name : collectorInputChannels) {
						LOGGER.debug(name);
					}
					
				}*/
				
			}
			try {
				LOGGER.debug("Collector name : " + collectorName);
				String result = tinomSensor.get(collectorName);
				LOGGER.debug("value available on a channel : " + collectorName + " ===> " + result);
			} catch (NoSuchFieldException e) {
				
			}
			// The monitoring is started.
			this.setMonitorstate(MonitorState.ON);
			
		}
	}
	

	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/monitoring/ext/sensorext/action# - term:
	 * stopMonitoring - title: Stop monitoring for this sensor
	 */
	@Override
	public void stopMonitoring() {
		LOGGER.debug("Action stopMonitoring() called on " + this);
		if (tinomSensor == null) {
			return;
		}
		if (this.getMonitorstate().equals(MonitorState.ON) && tinomSensor != null) {
			LOGGER.debug("Stop monitoring sensor and all collectors and publishers.");
			tinomSensor.stop();
			for (Collector collector : tinomCollectors) {
				collector.stop();
			}
			tinomSensor = null;
			tinomCollectors.clear();
			tinomPublishers.clear();
			
			this.setMonitorstate(MonitorState.OFF);
			
		} else {
			LOGGER.warn("The sensor state is off, dont need to stop monitoring sensor.");
		}
		this.updateAttributesSensor = false;
	}

	

	/**
	 * Build tinom objects from scratch...
	 */
	private void buildTinomObjects() {
		LOGGER.debug("Build TINOM objects");
		if (tinomSensor != null) {
			stopMonitoring();
		}
		
		// id of this sensor, the title may be not unique.
		tinomSensor = new Sensor(this.getId(), this.period);

		// Get the collectors instances and get their corresponding TINOM
		// collectors.
		EList<Link> links = this.getLinks();
		CollectorType collectorLink;
		
		tinomCollectors = new ArrayList<>();
		for (Link link : links) {
			if (link instanceof CollectorType) {
				collectorLink = (CollectorType) link;
				try {
					Collector tinomCollector = collectorLink.getTinomCollector();
					if (tinomCollector != null) {
						tinomCollectors.add(tinomCollector);
						tinomSensor.withCollector(tinomCollector);
					}
				} catch (MonitorException ex) {
					LOGGER.error("Error while creating ssh tinom collector : " + ex.getMessage());
				}
			}
		}

		if (tinomCollectors.isEmpty()) {
			LOGGER.warn("No linked collectors, cant start monitoring sensor...");
			tinomSensor = null;
			return;
		}
		
		
		tinomPublishers = new ArrayList<>();
		boolean hasEmfPublisher = EntityUtils.hasMixin(this, SENSOR_MIXIN_EMF_PUBLISHER);
		boolean hasSysOutPublisher = EntityUtils.hasMixin(this, SENSOR_MIXIN_SYSOUT_PUBLISHER);
		
		if (!hasEmfPublisher && !hasSysOutPublisher) {
			// No publisher is set.
			LOGGER.warn("No publisher is set. Please add at least one publisher. Default to sensor mixin system out console publisher.");
			hasSysOutPublisher = true;
		}

		if (hasEmfPublisher) {
			// The metrics attributes will be updated by publisher.
			this.updateAttributesSensor = true;
			EMFTinomPublisher emfTinom = new EMFTinomPublisher("emf" + this.getId(), this);
			LOGGER.info("Build sensor with publisher : EMFTinomPublisher");
			tinomPublishers.add(emfTinom);
		}
		if (hasSysOutPublisher) {
			
			SystemOutTinomPublisher outPublisher = new SystemOutTinomPublisher("console" + this.getId());
			
			LOGGER.info("Building sensor with publisher : SystemOutTinomPublisher");
			tinomPublishers.add(outPublisher);
		}
		
		for (Publisher publisher : tinomPublishers) {
			tinomSensor.withPublisher(publisher);
		}
		LOGGER.debug("TINOM objects are built !!!");

	}
	
	/**
	 * Add a listener to manage events on this sensor object.
	 */
	private void addMonitoringListener() {
		if (!monitoringListener) {
			// Add the listener...
			SensorExtListener sensorExtListener = new SensorExtListener();
			sensorExtListener.AddListener(this);
			monitoringListener = true; // dont need to add more than this listener.
		}
	}

}
