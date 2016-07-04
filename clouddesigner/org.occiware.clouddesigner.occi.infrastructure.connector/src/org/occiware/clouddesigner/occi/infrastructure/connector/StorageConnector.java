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
 * Generated at Fri Jul 01 14:13:59 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.infrastructure.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: storage
 * - title: Storage Resource
 */
public class StorageConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StorageConnector.class);

	/**
	 * Constructs a storage connector.
	 */
	StorageConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Storage instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Storage instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Storage instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Storage instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Storage actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: online
     * - title: Set storage online
	 */
	@Override
	public void online()
	{
		LOGGER.debug("Action online() called on " + this);

		// Storage State Machine.
		switch(getState().getValue()) {

		case StorageStatus.ONLINE_VALUE:
			LOGGER.debug("Fire transition(state=online, action=\"online\")...");

			// TODO Implement transition(state=online, action="online")

			break;

		case StorageStatus.OFFLINE_VALUE:
			LOGGER.debug("Fire transition(state=offline, action=\"online\")...");

			// TODO Implement transition(state=offline, action="online")

			break;

		case StorageStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"online\")...");

			// TODO Implement transition(state=error, action="online")

			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: offline
     * - title: Set storage offline
	 */
	@Override
	public void offline()
	{
		LOGGER.debug("Action offline() called on " + this);

		// Storage State Machine.
		switch(getState().getValue()) {

		case StorageStatus.ONLINE_VALUE:
			LOGGER.debug("Fire transition(state=online, action=\"offline\")...");

			// TODO Implement transition(state=online, action="offline")

			break;

		case StorageStatus.OFFLINE_VALUE:
			LOGGER.debug("Fire transition(state=offline, action=\"offline\")...");

			// TODO Implement transition(state=offline, action="offline")

			break;

		case StorageStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"offline\")...");

			// TODO Implement transition(state=error, action="offline")

			break;

		default:
			break;
		}
	}

}	
