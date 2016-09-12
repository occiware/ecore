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
 * - term: virtualnetworkadapter
 * - title: a network adapter for a virtual machine (virtual nic), describes a virtual network adapter representing an adapter that connects to a virtual switch. A VirtualNic differs from a PhysicalNic in that the latter corresponds to a physical device that is connected to the physical network. The former is a virtual device that is connected to a virtual switch. A VirtualNic accesses the external network through a virtual switch that is bridged through a PhysicalNic to a physical network
 */
public class VirtualnetworkadapterConnector extends org.occiware.clouddesigner.occi.vmware.impl.VirtualnetworkadapterImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(VirtualnetworkadapterConnector.class);

	/**
	 * Constructs a virtualnetworkadapter connector.
	 */
	VirtualnetworkadapterConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Virtualnetworkadapter instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualnetworkadapter instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualnetworkadapter instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualnetworkadapter instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Virtualnetworkadapter actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/virtualnetworkadapter/action#
     * - term: connectAdaptater
     * - title: Connect virtual machine to vswitch
	 */
	@Override
	public void connectAdaptater()
	{
		LOGGER.debug("Action connectAdaptater() called on " + this);

		// TODO: Implement how to connectAdaptater this virtualnetworkadapter.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/virtualnetworkadapter/action#
     * - term: disconnectAdaptater
     * - title: Disconnect virtual machine and vswitch
	 */
	@Override
	public void disconnectAdaptater()
	{
		LOGGER.debug("Action disconnectAdaptater() called on " + this);

		// TODO: Implement how to disconnectAdaptater this virtualnetworkadapter.
	}

}	
