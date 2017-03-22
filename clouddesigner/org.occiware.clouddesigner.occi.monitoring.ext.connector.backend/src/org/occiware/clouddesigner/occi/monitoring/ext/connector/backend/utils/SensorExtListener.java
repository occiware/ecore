/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.SensorextConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class observe the activateMonitoring value and attach listener for
 * metrics automatically.
 * 
 * @author Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
public class SensorExtListener {
	private static Logger LOGGER = LoggerFactory.getLogger(SensorExtListener.class);

	public void AddListener(SensorextConnector sensorExtConn) {
		LOGGER.debug(
				"In add listener to sensor method : " + sensorExtConn.getTitle() + " --> " + sensorExtConn.getId());

		// Make a reference copy
		// sensor = (SensorextConnector) EcoreUtil.copy(sensorExtConn);

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
				if (notification.getEventType() == Notification.SET
						&& notification.getNotifier() instanceof SensorextConnector) {
					String featureClassName = notification.getFeature().getClass().getName();
					if (notification.getFeature() instanceof EAttribute) {
						EAttribute eAttr = (EAttribute) notification.getFeature();
						String attrName = eAttr.getName();

						// To manage specific attribute changed and events about
						// them..

					}
					LOGGER.debug("Set notification send : " + featureClassName);
				}

				/*if (notification.getNotifier() instanceof SensorextConnector) {
					newSensor = (SensorextConnector) notification.getNotifier();
				}*/
			}
		});

	}

}
