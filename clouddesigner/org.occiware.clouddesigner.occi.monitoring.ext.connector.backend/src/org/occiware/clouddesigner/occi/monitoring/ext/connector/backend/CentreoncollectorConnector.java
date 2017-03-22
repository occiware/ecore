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

import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception.MonitorException;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.CentreonTinomCollector;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.SshTinomCollector;
import org.occiware.tinom.model.Collector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/monitoring/ext# - term: centreoncollector - title:
 * Connect to a centreon server and use its api
 */
public class CentreoncollectorConnector extends monitoringext.impl.CentreoncollectorImpl implements CollectorType {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CentreoncollectorConnector.class);

	private CentreonTinomCollector collector;
	
	/**
	 * Constructs a centreoncollector connector.
	 */
	CentreoncollectorConnector() {
		LOGGER.debug("Constructor called on " + this);
	}
	
	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Centreoncollector instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Centreoncollector instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Centreoncollector instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Centreoncollector instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Centreoncollector actions.
	//
	
	//
	// Specific TINOM part.
	//
	@Override
	public Collector getTinomCollector() throws MonitorException {
		if (collector == null) {
			// Build a new collector.
			collector = new CentreonTinomCollector(this.getId());
			// TODO : Check period...
			collector.setPeriod(getPeriod());
			// TODO : Add attributes to tinom collector object....
		}
		return collector;
	}
	

}
