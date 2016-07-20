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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.ComputeConnector;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.NetworkConnector;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.NetworkinterfaceConnector;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.StorageConnector;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.StoragelinkConnector;
import org.occiware.clouddesigner.occi.util.OcciHelper;

/**
 * This class discover all resources around a {@link ComputeConnector}.
 * @author Christophe Gourdin
 *
 */
public class DiscoverCompute {

	private ComputeConnector compute;
	
	public DiscoverCompute(ComputeConnector compute) {
		this.compute = compute;
	}
	
	public void discoverCompute() {
		// The following part is for discovery resources feature on
		// Configuration object. This will be implemented in near
		// future.

		// Get the related entity and update or create them if not
		// declared on
		// designer.

		// Storage part.
		// List<StoragelinkConnector> storageLinks =
		// this.getLinkedStorages();
		// // Get the storages from vm and check if there are designed,
		// if yes,
		// // update entity, if not designed, entity for storage are
		// created and
		// // updated..
		// Map<String, VirtualDisk> disks =
		// VolumeHelper.getVirtualDiskForVM(vm);
		//
		// for (Map.Entry<String, VirtualDisk> entry : disks.entrySet())
		// {
		// // format: [datastoreName] filename.vmdk
		// String diskName = entry.getKey();
		// String tmp = diskName.replace(".vmdk", "");
		// String tampon[] = tmp.split("]");
		// String datastoreStorage = tampon[0].substring(1);
		//
		// tampon = tampon[1].split("/");
		// diskName = tampon[tampon.length - 1];
		//
		// VirtualDisk disk = entry.getValue();
		// storageLinks = this.getLinkedStorages();
		// // Check if the disk is on designer..
		// StorageConnector storageConnector =
		// getStorageConnectorInLinks(diskName, storageLinks);
		// StoragelinkConnector storageLinkConnector;
		// if (storageLinks.isEmpty() || storageConnector == null) {
		// // Create the resource entity and the link.
		// LOGGER.info("Creating a new StorageConnector...");
		// storageConnector = createStorageConnector(diskName);
		// storageConnector.setDatastoreName(datastoreStorage);
		// // Create the link
		// storageLinkConnector =
		// createStorageLinkConnector(storageConnector);
		//
		// } else {
		//
		// // Get the corresponding link.
		// storageLinkConnector = getStorageLink(diskName,
		// storageLinks);
		// storageConnector.setDatastoreName(datastoreStorage);
		// // storageConnector.setSummary(datastoreStorage);
		//
		// // If the link doesnt exit create it.
		// if (storageLinkConnector == null) {
		// storageLinkConnector =
		// createStorageLinkConnector(storageConnector);
		// }
		//
		// }
		//
		// if (storageLinkConnector != null) {
		// // Retrieve link value this will update the storageConnector
		// // object before (in target).
		// storageLinkConnector.setVmName(vmName);
		// storageLinkConnector.occiRetrieve();
		//
		// }
		//
		// } // end for each entry disk.
		//
		// // if (this.getState().equals(ComputeStatus.ACTIVE)) {
		// // Networks (switch, port group and nic) part.
		// List<NetworkinterfaceConnector> networkLinks =
		// this.getNetworkInterfaces();
		// // Must disconnect here, the number of vcenter max query may
		// be
		// achieve
		// // and the risk is to fail query.
		// VCenterClient.disconnect();
		// VCenterClient.checkConnection();
		// List<VirtualEthernetCard> vEths =
		// NetworkHelper.getNetworkAdaptersForVM(vmName);
		//
		// for (VirtualEthernetCard vEth : vEths) {
		// String networkName = vEth.getDeviceInfo().getSummary();
		// String nicName = vEth.getDeviceInfo().getLabel();
		// LOGGER.info("Network name: " + networkName);
		// LOGGER.info("network Adapter name: " + nicName);
		// networkLinks = this.getNetworkInterfaces();
		// // Check if the virtual switch (+ port group) is on designer.
		// // Note
		// // that it use one port group for one switch.
		// NetworkConnector networkConn =
		// getNetworkConnectorInLinks(networkName, networkLinks);
		// NetworkinterfaceConnector netIntConn;
		//
		// if (networkLinks.isEmpty() || networkConn == null) {
		// // Create the ressource entity and the linked interface
		// // adapter.
		// networkConn = createNetworkConnector(networkName);
		//
		// // Create the link
		// netIntConn = createNetworkInterfaceConnector(nicName,
		// networkConn);
		// } else {
		// // Get the corresponding link.
		// netIntConn = getNetworkInterface(nicName, networkLinks);
		// if (netIntConn == null) {
		// netIntConn = createNetworkInterfaceConnector(nicName,
		// networkConn);
		// }
		// }
		// if (netIntConn != null) {
		// netIntConn.occiRetrieve();
		// }
		//
		// } // End for each virtual network devices.
		// }
	}
	
	
	
	/**
	 * Get the storage connector from a diskname and a list of storage links.
	 * 
	 * @param diskName
	 * @param storageLinks
	 * @return {@link StorageConnector} object.
	 */
	private StorageConnector getStorageConnectorInLinks(final String diskName,
			List<StoragelinkConnector> storageLinks) {
		StorageConnector result = null;
		for (StoragelinkConnector storageLink : storageLinks) {
			Resource target = storageLink.getTarget();
			if (target != null && target instanceof StorageConnector) {
				// Check if title is the disk name.
				String title = target.getTitle();
				if (title.equals(diskName)) {
					result = (StorageConnector) target;
					break;
				}
			}
		}

		return result;

	}
	
	/**
	 * Get a storagelinkconnector from a list of storage link connector.
	 * 
	 * @param name
	 * @param stLinks
	 * @return a {@link StoragelinkConnector} object, null if not found.
	 */
	private StoragelinkConnector getStorageLink(String name, List<StoragelinkConnector> stLinks) {

		StoragelinkConnector storageLink = null;
		for (StoragelinkConnector conn : stLinks) {
			if (conn.getTitle().equals(name)) {
				storageLink = conn;
				break;
			}
		}
		return storageLink;
	}

	/**
	 * Create entity storageLinkConnector with link set.
	 * 
	 * @param storageConnector
	 * @return a new {@link StoragelinkConnector} object with link on source and
	 *         target set.
	 */
	private StoragelinkConnector createStorageLinkConnector(StorageConnector storageConnector) {

		Configuration config = OcciHelper.getConfiguration(compute);
		StoragelinkConnector stLink = null;

		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("infrastructure")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stLinkKind = OcciHelper.getKindByTerm(currentExt, "storagelink");
			Entity entity = OcciHelper.createEntity(stLinkKind);
			stLink = (StoragelinkConnector) entity;
			stLink.setTitle(storageConnector.getTitle()); // It is temporary
															// that, occi
															// retrieve will
															// retrieve the
															// volumeName from
															// the operating
															// system.
			stLink.setSource(compute);
			stLink.setTarget(storageConnector);

		}

		return stLink;
	}

	/**
	 * Create a storage entity without link.
	 * 
	 * @param diskName
	 * @return a new {@link StorageConnector} entity.
	 */
	private StorageConnector createStorageConnector(String diskName) {
		Configuration config = OcciHelper.getConfiguration(compute);
		StorageConnector conn = null;
		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("infrastructure")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stKind = OcciHelper.getKindByTerm(currentExt, "storage");
			Entity entity = OcciHelper.createEntity(stKind);
			conn = (StorageConnector) entity;
			conn.setTitle(diskName); // It is temporary that, occi retrieve will
										// retrieve the volumeName from the
										// operating system.
			conn.getAttributes();
			config.getResources().add(conn);
		}
		return conn;
	}

	/**
	 * Get a network connector from linked network interfaces.
	 * 
	 * @param networkName
	 * @param networkLinks
	 * @return a {@link NetworkConnector} entity object.
	 */
	private NetworkConnector getNetworkConnectorInLinks(final String networkName,
			List<NetworkinterfaceConnector> networkLinks) {
		NetworkConnector netConn = null;
		for (NetworkinterfaceConnector networkInt : networkLinks) {
			Resource target = networkInt.getTarget();
			if (target != null && target instanceof NetworkConnector) {
				// Check if title is the disk name.
				NetworkConnector conn = (NetworkConnector) target;
				String label = conn.getLabel();
				if (label.equals(networkName)) {
					netConn = (NetworkConnector) target;
					break;
				}
			}
		}

		return netConn;

	}

	/**
	 * Create a new {@link NetworkConnector} entity with title set to
	 * networkName, without links.
	 * 
	 * @param networkName
	 * @return a new {@link NetworkConnector}
	 */
	private NetworkConnector createNetworkConnector(final String networkName) {
		Configuration config = OcciHelper.getConfiguration(compute);
		NetworkConnector conn = null;
		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("infrastructure")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stKind = OcciHelper.getKindByTerm(currentExt, "network");
			Entity entity = OcciHelper.createEntity(stKind);
			conn = (NetworkConnector) entity;
			conn.setLabel(networkName);
			// Add mixin ipnetwork
			EList<Mixin> mixins = currentExt.getMixins();
			Mixin ipnetworkMixin = null;
			for (Mixin mixin : mixins) {
				if (mixin.getTerm().equalsIgnoreCase("ipnetwork")) {
					ipnetworkMixin = mixin;
					break;
				}
			}
			if (ipnetworkMixin != null) {
				conn.getMixins().add(ipnetworkMixin);
			}

			config.getResources().add(conn);
		}
		return conn;

	}

	/**
	 * Create a new {@link NetworkinterfaceConnector} with links set from this
	 * compute to the networkConnector in parameter.
	 * 
	 * @param nicName
	 * @param networkConn
	 * @return a {@link NetworkinterfaceConnector} with links set.
	 */
	private NetworkinterfaceConnector createNetworkInterfaceConnector(final String nicName,
			NetworkConnector networkConn) {
		Configuration config = OcciHelper.getConfiguration(compute);

		NetworkinterfaceConnector netIntConn = null;

		EList<Extension> extensions = config.getUse();
		Extension currentExt = null;
		for (Extension ext : extensions) {
			if (ext.getName().equalsIgnoreCase("infrastructure")) {
				currentExt = ext;
				break;
			}
		}
		if (currentExt != null) {
			Kind stLinkKind = OcciHelper.getKindByTerm(currentExt, "networkinterface");
			Entity entity = OcciHelper.createEntity(stLinkKind);
			netIntConn = (NetworkinterfaceConnector) entity;
			netIntConn.setTitle(nicName);
			netIntConn.setSource(compute);
			netIntConn.setTarget(networkConn);
			EList<Mixin> mixins = currentExt.getMixins();
			Mixin ipnetworkMixin = null;
			for (Mixin mixin : mixins) {
				if (mixin.getTerm().equalsIgnoreCase("ipnetworkinterface")) {
					ipnetworkMixin = mixin;
					break;
				}
			}
			if (ipnetworkMixin != null) {
				netIntConn.getMixins().add(ipnetworkMixin);
			}

		}
		return netIntConn;
	}

	/**
	 * Get the network interface connector from a list of network interfaces and
	 * a network adapter name.
	 * 
	 * @param nicName
	 * @param networkLinks
	 * @return a {@link NetworkinterfaceConnector}
	 */
	private NetworkinterfaceConnector getNetworkInterface(final String nicName,
			List<NetworkinterfaceConnector> networkLinks) {
		NetworkinterfaceConnector networkIntConn = null;
		for (NetworkinterfaceConnector conn : networkLinks) {
			if (conn.getTitle().equals(nicName)) {
				networkIntConn = conn;
				break;
			}
		}
		return networkIntConn;
	}
	
	
}
