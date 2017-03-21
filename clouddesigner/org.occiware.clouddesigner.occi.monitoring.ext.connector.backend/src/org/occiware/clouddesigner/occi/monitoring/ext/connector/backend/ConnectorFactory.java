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

/**
 * Connector EFactory for the OCCI extension: - name: monitoringext - scheme:
 * http://occiware.org/occi/monitoring/ext#
 */
public class ConnectorFactory extends monitoringext.impl.MonitoringextFactoryImpl {
	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/monitoring/ext# - term: sshcollector - title:
	 * Collector data metrics with an ssh script
	 */
	@Override
	public monitoringext.Sshcollector createSshcollector() {
		return new SshcollectorConnector();
	}

	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/monitoring/ext# - term: centreoncollector -
	 * title: Connect to a centreon server and use its api
	 */
	@Override
	public monitoringext.Centreoncollector createCentreoncollector() {
		return new CentreoncollectorConnector();
	}

	/**
	 * EFactory method for OCCI kind: - scheme:
	 * http://occiware.org/occi/monitoring/ext# - term: sensorext - title: A
	 * sensor with a publisher to directly have bars and display its values in a
	 * nice way on designer
	 */
	@Override
	public monitoringext.Sensorext createSensorext() {
		return new SensorextConnector();
	}

}
