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
 * Generated at Mon May 09 08:51:57 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.monitoring/model/monitoring.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.monitoring.connector.dummy;

/**
 * Connector EFactory for the OCCI extension:
 * - name: monitoring
 * - scheme: http://schemas.ogf.org/occi/monitoring#
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.monitoring.impl.MonitoringFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: sensor
	 * - title: Sensor Resource
	 */
	@Override
	public org.occiware.clouddesigner.occi.monitoring.Sensor createSensor() {
		return new SensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: collector
	 * - title: Collector Link
	 */
	@Override
	public org.occiware.clouddesigner.occi.monitoring.Collector createCollector() {
		return new CollectorConnector();
	}

}
