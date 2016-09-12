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
 * - term: cluster
 * - title: Represents a cluster of HostSystem objects as a unified compute resource for virtual machines.
 */
public class ClusterConnector extends org.occiware.clouddesigner.occi.vmware.impl.ClusterImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ClusterConnector.class);

	/**
	 * Constructs a cluster connector.
	 */
	ClusterConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Cluster instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Cluster instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Cluster instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Cluster instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Cluster actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/cluster/action#
     * - term: addAllHostSystem
     * - title: Add all hostsystem linked to this cluster and not already added on this cluster, if hostsystem are not connectable, the host will not be added
	 */
	@Override
	public void addAllHostSystem()
	{
		LOGGER.debug("Action addAllHostSystem() called on " + this);

		// TODO: Implement how to addAllHostSystem this cluster.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/cluster/action#
     * - term: applyRecommendation
     * - title: 
	 */
	@Override
	public void applyRecommendation()
	{
		LOGGER.debug("Action applyRecommendation() called on " + this);

		// TODO: Implement how to applyRecommendation this cluster.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/cluster/action#
     * - term: enterMaintenanceMode
     * - title: 
	 */
	@Override
	public void enterMaintenanceMode()
	{
		LOGGER.debug("Action enterMaintenanceMode() called on " + this);

		// TODO: Implement how to enterMaintenanceMode this cluster.
	}

}	
