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
 * Generated at Fri Sep 09 14:22:40 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.vmware.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/vmware#
 * - term: hostnetworkadapter
 * - title: Physical Network adaptater on a hostsystem, describes the physical network adapter as seen by the primary operating system
 */
public class HostnetworkadapterConnector extends org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HostnetworkadapterConnector.class);

	/**
	 * Constructs a hostnetworkadapter connector.
	 */
	HostnetworkadapterConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Hostnetworkadapter instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostnetworkadapter instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostnetworkadapter instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostnetworkadapter instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Hostnetworkadapter actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostnetworkadapter/action#
     * - term: connect
     * - title: 
	 */
	@Override
	public void connect()
	{
		LOGGER.debug("Action connect() called on " + this);

		// TODO: Implement how to connect this hostnetworkadapter.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostnetworkadapter/action#
     * - term: disconnect
     * - title: 
	 */
	@Override
	public void disconnect()
	{
		LOGGER.debug("Action disconnect() called on " + this);

		// TODO: Implement how to disconnect this hostnetworkadapter.
	}

}	
