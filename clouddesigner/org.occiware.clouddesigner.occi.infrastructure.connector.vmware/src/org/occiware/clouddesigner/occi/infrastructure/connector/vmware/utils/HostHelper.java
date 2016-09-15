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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.Network;

public class HostHelper {
	private static Logger LOGGER = LoggerFactory.getLogger(HostHelper.class);

	/**
	 * Search for a host system for a name.
	 * 
	 * @param folder
	 * @param name
	 * @return a hostSystem object, if not found, return null.
	 */
	public static HostSystem findHostSystemForName(final Folder folder, final String name) {
		HostSystem hostSystem = null;
		try {
			hostSystem = (HostSystem) new InventoryNavigator(folder).searchManagedEntity("HostSystem", name);
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a hostSystem name: " + name + " --> " + ex.getMessage());
		}
		return hostSystem;
	}

	/**
	 * Search all hostsystems on a folder, usually the rootFolder.
	 * 
	 * @param folder
	 * @return
	 */
	public static List<HostSystem> findAllHostSystem(final Folder folder) {
		List<HostSystem> hostSystems = new ArrayList<HostSystem>();

		try {
			HostSystem hostSystem;
			ManagedEntity[] hosts = (ManagedEntity[]) new InventoryNavigator(folder)
					.searchManagedEntities("HostSystem");
			if (hosts != null && hosts.length > 0) {
				for (int i = 0; i < hosts.length; i++) {
					hostSystem = (HostSystem) hosts[i];
					hostSystems.add(hostSystem);
				}
			}
		} catch (RemoteException e) {
			LOGGER.error("Error while searching all hostsystems for this folder: " + folder.getName());
		}

		return hostSystems;
	}

	/**
	 * Search all host systems on a cluster.
	 * 
	 * @param folder
	 * @return
	 */
	public static List<HostSystem> findAllHostSystemOnCluster(final ClusterComputeResource cluster) {
		List<HostSystem> hostSystems = new ArrayList<HostSystem>();
		HostSystem[] hosts = cluster.getHosts();
		hostSystems = Arrays.asList(hosts);
		return hostSystems;
	}

	/**
	 * Find the first host.
	 * 
	 * @param folder
	 * @return
	 */
	public static HostSystem findFirstHostSystem(final ClusterComputeResource cluster) {
		HostSystem host = null;
		// Search for the first cluster found and assign it.
		List<HostSystem> hosts = findAllHostSystemOnCluster(cluster);
		if (hosts != null && !hosts.isEmpty()) {
			for (HostSystem hostTmp : hosts) {
				host = hostTmp;
				break;
			}
		}

		return host;
	}

	/**
	 * Find the first Host network.
	 */
	public static Network findFirstHostNetwork(HostSystem host) {
		Network network = null;
		Network[] networks = null;
		if (host != null) {
			try {
				networks = host.getNetworks();
				if (networks != null && networks.length > 0) {
					network = networks[0];
					LOGGER.info("Network found : " + network.getName());
				}
			} catch (RemoteException ex) {
				LOGGER.error("Error while allocating a network from host: " + host.getName());
			}
		}
		return network;
	}

	/**
	 * Find a hostsystem for a port group name.
	 * 
	 * @param portGroupName
	 * @return a hostsystem.
	 */
	public static HostSystem findHostForPortGroup(final Folder rootFolder, final String portGroupName) {
		HostSystem host = null;
		List<HostSystem> hosts = findAllHostSystem(rootFolder);
		if (hosts.isEmpty()) {
			return null; // TODO : Launch an notfound exception.
		}
		try {
			for (HostSystem sys : hosts) {
				Network[] networks = sys.getNetworks();
				if (networks != null && networks.length > 0) {
					for (Network net : networks) {
						if (net.getName().equals(portGroupName)) {
							LOGGER.info("Host found : " + sys.getName());
							host = sys;
							break;
						}
					}
					if (host != null) {
						break;
					}
				}
			}
		} catch (RemoteException ex) {
			LOGGER.error("Exception RemoteException thrown, cant retrieve a host for a port group.");
			return null;
		}
		return host;
	}

}
