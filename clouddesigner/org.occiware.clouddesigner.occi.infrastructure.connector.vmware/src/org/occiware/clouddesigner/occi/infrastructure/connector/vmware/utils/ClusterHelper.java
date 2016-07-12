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
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils;



import java.rmi.RemoteException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.ClusterConfigSpecEx;
import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;

public class ClusterHelper {
	private static Logger LOGGER = LoggerFactory.getLogger(ClusterHelper.class);

	/**
	 * Find a cluster for a name.
	 * 
	 * @param folder
	 * @param name
	 * @return a cluster if found, null if none.
	 */
	public static ClusterComputeResource findClusterForName(final Datacenter dc, final String name) {
		ClusterComputeResource cluster = null;
		try {
			cluster = (ClusterComputeResource) new InventoryNavigator(dc).searchManagedEntity("ClusterComputeResource",
					name);
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a cluster for name : " + name + " --> " + ex.getMessage());
		}
		return cluster;
	}

	/**
	 * Find the first cluster found on datacenter tree.
	 * 
	 * @param dc
	 * @return a cluster object, if not found, null value is returned.
	 */
	public static ClusterComputeResource findFirstCluster(final Datacenter dc) {
		ClusterComputeResource cluster = null;
		try {
			// Search for the first cluster found and assign it.
			ManagedEntity[] clusters = new InventoryNavigator(dc).searchManagedEntities("ClusterComputeResource");
			if (clusters != null && clusters.length > 0) {
				// Get the first.
				cluster = (ClusterComputeResource) clusters[0];
			}
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a cluster (first on tree) " + ex.getMessage());
		}

		return cluster;
	}

	/**
	 * Create a default cluster (no config spec defined).
	 * 
	 * @param folder
	 * @param name
	 * @return a new cluster , if the creation has errors, this method return
	 *         null.
	 */
	public static ClusterComputeResource createCluster(Datacenter dc, final String name) {
		ClusterComputeResource cluster = null;
		try {
			ClusterConfigSpecEx clusterConfig;
			// Default cluster (with no options defined, default options are
			// used).
			clusterConfig = new ClusterConfigSpecEx();
			cluster = dc.getHostFolder().createClusterEx(name, clusterConfig);

		} catch (RemoteException ex) {
			LOGGER.error("Cluster creation error : " + name + " : " + dc.getName());
		}
		return cluster;
	}

}
