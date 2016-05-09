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
 * Generated at Tue May 10 00:06:30 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: network
 * - title: Network Resource
 */
public class NetworkConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkConnector.class);

	/**
	 * Constructs a network connector.
	 */
	NetworkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Network instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Network instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Network instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Network instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Network actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: up
     * - title: 
	 */
	@Override
	public void up()
	{
		LOGGER.debug("Action up() called on " + this);

		// Network State Machine.
		switch(getState().getValue()) {

		case NetworkStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"up\")...");

			// Nothing to do.

			break;

		case NetworkStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"up\")...");

			// TODO Implement transition(state=inactive, action="up")

			setState(NetworkStatus.ACTIVE);
			break;

		case NetworkStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"up\")...");

			// TODO Implement transition(state=error, action="up")

			setState(NetworkStatus.ACTIVE);
			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: down
     * - title: 
	 */
	@Override
	public void down()
	{
		LOGGER.debug("Action down() called on " + this);

		// Network State Machine.
		switch(getState().getValue()) {

		case NetworkStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"down\")...");

			// TODO Implement transition(state=active, action="down")

			setState(NetworkStatus.INACTIVE);
			break;

		case NetworkStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"down\")...");

			// Nothing to do.

			break;

		case NetworkStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"down\")...");

			// TODO Implement transition(state=error, action="down")

			setState(NetworkStatus.INACTIVE);
			break;

		default:
			break;
		}
	}

}	
