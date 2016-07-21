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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator;

import java.rmi.RemoteException;
import java.util.List;

import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.ClusterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.HostHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.ServiceConsoleReservationInfo;
import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostMemorySystem;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ResourcePool;

public class AllocatorImpl implements Allocator {

	private static Logger LOGGER = LoggerFactory.getLogger(AllocatorImpl.class);
	
	private Folder rootFolder;
	private Datacenter dc = null;
	private Datastore datastore = null;
	private ResourcePool resourcePool = null;
	private ClusterComputeResource cluster = null;
	private HostSystem host = null;
	
	private double memoryHostMini = 1.0;
	
	public AllocatorImpl(Folder folder) {
		this.rootFolder = folder;
	}

	/**
	 * Allocate the first datacenter found in tree.
	 */
	public Datacenter allocateDatacenter() {
		// Find the first datacenter
		dc = DatacenterHelper.findFirstDatacenter(rootFolder);
		if (dc == null) {
			// None has been found, creating a new one.
			// dc = DatacenterHelper.createDatacenter(rootFolder, "datacenter1");
			LOGGER.error("No datacenter available to allocate.");
		}
		
		return dc;
	}

	

	/**
	 * Allocate a cluster, if none found, return null value.
	 */
	public ClusterComputeResource allocateCluster() {
		cluster = null;
		
		cluster = ClusterHelper.findFirstCluster(dc);
		
		// Find the first, if none are found, no cluster so null returned.
		return cluster;
	}
	
	/**
	 * Allocate an hostSystem. Take the first.
	 */
	public HostSystem allocateHostSystem() {
		host = null;
		if (cluster == null) {
			LOGGER.warn("No cluster defined to allocate a host.");
			
		} else {
			host = HostHelper.findFirstHostSystem(cluster);
		}
		return host;
	}
	
	/**
	 * Allocate a datastore.
	 */
	public Datastore allocateDatastore() {
		try {
			ManagedEntity[] entities = new InventoryNavigator(rootFolder).searchManagedEntities("Datastore");
			if (entities != null) {
				for (ManagedEntity vmwEntity : entities) {
					datastore = (Datastore)vmwEntity;
					if (datastore != null) {
						// Check if there is available space.
						Long free = datastore.getSummary().getFreeSpace();
						// Default val for mini freespace.
						if (free >= 10L) {
							break;
						}
					}
				}
			} else {
				// Cant get a datastore info. returning null value.
				LOGGER.warn("No datastores found on vCenter !! ");
			}
			
			
			
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching all datastores of vCenter.");
		}
		
		return datastore;
	}
	
	/**
	 * Allocate a network for host.
	 */
	public Network allocateNetwork() {
		Network network = null;
		if (this.host != null) {
			network = HostHelper.findFirstHostNetwork(host);
		}
		return network;
	}
	

	public ResourcePool allocateResourcePool() {
		ResourcePool rp = null;
		try { 
			rp = (ResourcePool) new InventoryNavigator(dc).searchManagedEntities("ResourcePool")[0];
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a resource pool to allocate from the datacenter:  " + dc.getName());
			LOGGER.error("Message: " + ex.getMessage());
			ex.printStackTrace();
		}
		return rp;
	}

	public Folder getRootFolder() {
		return rootFolder;
	}

	public void setRootFolder(Folder rootFolder) {
		this.rootFolder = rootFolder;
	}

	public Datacenter getDc() {
		return dc;
	}

	public void setDc(Datacenter dc) {
		this.dc = dc;
	}

	public Datastore getDatastore() {
		return datastore;
	}

	public void setDatastore(Datastore datastore) {
		this.datastore = datastore;
	}

	public ResourcePool getResourcePool() {
		return resourcePool;
	}

	public void setResourcePool(ResourcePool resourcePool) {
		this.resourcePool = resourcePool;
	}

	public ClusterComputeResource getCluster() {
		return cluster;
	}

	public void setCluster(ClusterComputeResource cluster) {
		this.cluster = cluster;
	}

	public double getMemoryHostMini() {
		return memoryHostMini;
	}

	public void setMemoryHostMini(double memoryHostMini) {
		this.memoryHostMini = memoryHostMini;
	}

	public HostSystem getHost() {
		
		return host;
	}

	public void setHost(HostSystem host) {
		this.host = host;
	}

	
	
	


}
