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
 * - term: datacenter
 * - title: The interface to the common container object for hosts and virtual machines. Every host and virtual machine must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters.
 */
public class DatacenterConnector extends org.occiware.clouddesigner.occi.vmware.impl.DatacenterImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DatacenterConnector.class);

	/**
	 * Constructs a datacenter connector.
	 */
	DatacenterConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Datacenter instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Datacenter instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Datacenter instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Datacenter instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Datacenter actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/datacenter/action#
     * - term: powerOnMultiVMs
     * - title: 
	 */
	@Override
	public void powerOnMultiVMs()
	{
		LOGGER.debug("Action powerOnMultiVMs() called on " + this);

		// TODO: Implement how to powerOnMultiVMs this datacenter.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/datacenter/action#
     * - term: discoverAll
     * - title: This action create or synchronize all the infrastructure elements detected on VMware in Cloud designer diagram, but does nothing on VMware. This make take some times to synchronize if there is a lot of elements
	 */
	@Override
	public void discoverAll()
	{
		LOGGER.debug("Action discoverAll() called on " + this);

		// TODO: Implement how to discoverAll this datacenter.
	}

}	
