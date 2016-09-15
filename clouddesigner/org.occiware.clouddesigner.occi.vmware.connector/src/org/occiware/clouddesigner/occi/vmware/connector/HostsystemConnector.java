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
 * - term: hostsystem
 * - title: 
 */
public class HostsystemConnector extends org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HostsystemConnector.class);

	/**
	 * Constructs a hostsystem connector.
	 */
	HostsystemConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Hostsystem instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostsystem instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostsystem instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostsystem instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Hostsystem actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: disconnectHost
     * - title: Disconnects from a host and instructs the server to stop sending heartbeats.
	 */
	@Override
	public void disconnectHost()
	{
		LOGGER.debug("Action disconnectHost() called on " + this);

		// TODO: Implement how to disconnectHost this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: enterlLockDownMode
     * - title: Modifies the permissions on the host, so that it will only be accessible through local console or an authorized centralized management application. Any user defined permissions found on the host are lost.Access via a VI client connected to the host is blocked. Access though other services running on the host is also blocked.If the operation is successful, adminDisabled will be set to true. This API is not supported on the host, If invoked directly on a host, a NotSupported fault will be thrown.
	 */
	@Override
	public void enterlLockDownMode()
	{
		LOGGER.debug("Action enterlLockDownMode() called on " + this);

		// TODO: Implement how to enterlLockDownMode this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: enterMaintenanceMode
     * - title: Puts the host in maintenance mode. While this task is running and when the host is in maintenance mode, no virtual machines can be powered on and no provisioning operations can be performed on the host. Once the call completes, it is safe to turn off a host without disrupting any virtual machines
	 */
	@Override
	public void enterMaintenanceMode()
	{
		LOGGER.debug("Action enterMaintenanceMode() called on " + this);

		// TODO: Implement how to enterMaintenanceMode this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: exitLockDownMode
     * - title: Restores Administrator permission for the local administrative account for the host that was removed by prior call to EnterLockdownMode. If the operation is successful, adminDisabled will be set to false. This API is not supported on the host. If invoked directly on a host, a NotSupported fault will be thrown.
	 */
	@Override
	public void exitLockDownMode()
	{
		LOGGER.debug("Action exitLockDownMode() called on " + this);

		// TODO: Implement how to exitLockDownMode this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: exitMaintenanceMode
     * - title: Takes the host out of maintenance mode. This blocks if any concurrent running maintenance-only host configurations operations are being performed. For example, if VMFS volumes are being upgraded.
	 */
	@Override
	public void exitMaintenanceMode()
	{
		LOGGER.debug("Action exitMaintenanceMode() called on " + this);

		// TODO: Implement how to exitMaintenanceMode this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: reconfigureHostForDAS
     * - title: reconfigures the host for the VMware High Availability (HA) cluster. If the host is part of an HA cluster, this operation reconfigures the host for HA. For example, this operation may be used if a host is added to an HA-enabled cluster and the automatic HA configuration system task fails. Automatic HA configuration may fail for a variety of rea- sons. For example, the host may be configured incorrectly
	 */
	@Override
	public void reconfigureHostForDAS()
	{
		LOGGER.debug("Action reconfigureHostForDAS() called on " + this);

		// TODO: Implement how to reconfigureHostForDAS this hostsystem.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostsystem/action#
     * - term: reconnectHost
     * - title: reconnects to a host. This method is supported only in VirtualCenter
	 */
	@Override
	public void reconnectHost()
	{
		LOGGER.debug("Action reconnectHost() called on " + this);

		// TODO: Implement how to reconnectHost this hostsystem.
	}

}	
