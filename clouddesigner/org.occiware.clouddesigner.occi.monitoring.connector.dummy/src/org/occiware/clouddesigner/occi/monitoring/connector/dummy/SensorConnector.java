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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/monitoring#
 * - term: sensor
 * - title: Sensor Resource
 */
public class SensorConnector extends org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SensorConnector.class);

	/**
	 * Constructs a sensor connector.
	 */
	SensorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Sensor instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sensor instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sensor instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Sensor instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Sensor actions.
	//

}	
