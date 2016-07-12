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
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 * 
 * Generated at Tue May 10 13:08:38 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.AttachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatacenterNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatastoreNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DetachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DiskNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VolumeHelper;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://schemas.ogf.org/occi/infrastructure# - term: storage - title: Storage
 * Resource
 */
public class StorageConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StorageConnector.class);
	/**
	 * Datastore name, referenced on creation or on retrieve method.
	 */
	private String datastoreName = null;
	private String datacenterName = null;
	private Datastore datastore = null;
	private Datacenter datacenter = null;
	private String vmName = null;

	private String oldDiskName = null;
	private Float oldDiskSize = null;

	/**
	 * Constructs a storage connector.
	 */
	StorageConnector() {
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Storage instance is completely created.
	 */
	@Override
	public void occiCreate() {

		LOGGER.debug("occiCreate() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();

		AllocatorImpl allocator = new AllocatorImpl(rootFolder);

		List<ComputeConnector> computes = getLinkedComputes();

		if (computes.isEmpty()) {
			LOGGER.warn("the volume is not linked to a compute.");
		} else {
			// Search for a datastore name on attribute.
			this.setDatastoreName(this.getDatastoreName());
		}

		Float size = this.getSize();
		String volumeName = this.getTitle();

		oldDiskSize = size;
		oldDiskName = volumeName;

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			// Allocate the datacenter and datastore when necessary.
			if (datastore == null) {
				datastore = allocator.allocateDatastore();
				if (datastore != null) {
					this.setDatastoreName(datastore.getName());
				}
			}

			if (datastore != null && datacenter == null && vmName == null) {
				datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastore.getName());
				this.setDatacenterName(datacenter.getName());
				this.setDatastoreName(datastore.getName());
			}

			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
		}

		// Load the volume information. If the volume doesnt exist, the volume
		// object will be null.
		VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName);

		// Check if the volume already exist in the vcenter.
		if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
			// The volume already exist.
			LOGGER.warn("Volume : " + volumeName + " already exist in datacenter.");
			VCenterClient.disconnect();
			return;
		}
		// set the attributes on volume object.
		if (this.getSize() == 0.0f) {
			LOGGER.warn("The disk size is not setted, please set this attributes in GB float value.");
			VCenterClient.disconnect();
			return;
		}
		VolumeHelper.setSize(volumeName, this.getSize());

		// Create a new disk with or with or without vm information.
		VolumeHelper.createVolume(datacenterName, datastoreName, volumeName, this.getSize());

		occiRetrieve();
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	/**
	 * Called when this Storage instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		String volumeName = this.getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = this.getSize();
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				this.setState(StorageStatus.ERROR);
				this.setMessage("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			} 
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				this.setState(StorageStatus.ERROR);
				this.setMessage("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			} 
		}

		// Check if the volume name has changed, if this is the case, the
		// loadinfo method may not work.
		if (!oldDiskName.equals(volumeName)) {
			// Volume name has changed.
			if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
				// All ok.
				oldDiskName = volumeName;
				LOGGER.info("The disk " + oldDiskName + " name has changed to : " + volumeName);

			} else if (VolumeHelper.isExistVolumeForName(datastoreName, oldDiskName, datacenterName, vmName)) {
				volumeName = oldDiskName;
				this.setTitle(oldDiskName);
			}
		} else {
			// Load the volume object.
			VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName);
		}

		// Update disk information on screen.
		try {
			this.setMessage(null);

			if (!VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
				LOGGER.error("Cant find the disk on vcenter, there's no disk with the name : " + volumeName);
				this.setState(StorageStatus.ERROR);
				this.setMessage("Cant find the disk on vcenter, there's no disk with the name : " + volumeName);
				return;
			}
			size = VolumeHelper.getSize(volumeName);
			if (size == 0.0f) {
				this.setState(StorageStatus.ERROR);
			} else {
				if (VolumeHelper.isAttached(volumeName)) {
					this.setState(StorageStatus.ONLINE);
				} else {
					this.setState(StorageStatus.OFFLINE);
				}
				assignDeviceIdStorageToStorageLink(volumeName);

			}
		} catch (DiskNotFoundException ex) {
			LOGGER.error(ex.getMessage());
			this.setState(StorageStatus.ERROR);
			this.setMessage(ex.getMessage());
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	/**
	 * Called when this Storage instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		String volumeName = this.getTitle();

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
		}

		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = this.getSize();
		}

		// Resizing.
		if (oldDiskSize != size) {
			VolumeHelper.setSize(volumeName, size);
			try {
				VolumeHelper.resizeDisk(volumeName, size);
			} catch (DiskNotFoundException ex) {
				this.setMessage(ex.getMessage());
			}
		}

		// Renaming. (include vmdk file rename).
		if (!oldDiskName.equals(volumeName)) {
			// Try to rename the disk (and the vmdk file).
			try {
				boolean result = VolumeHelper.renameDisk(oldDiskName, volumeName);
				if (result) {
					oldDiskName = volumeName;
					occiRetrieve();
				}

			} catch (DiskNotFoundException ex) {
				this.setMessage(ex.getMessage());
			}

		}

		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();

	}

	/**
	 * Called when this Storage instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		String volumeName = this.getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
		}
		try {
			VolumeHelper.destroyDisk(volumeName, datacenterName, datastoreName, vmName);
			this.setState(StorageStatus.OFFLINE);
			this.setMessage("The disk " + volumeName + " has been deleted.");
		} catch (DetachDiskException ex) {
			this.setMessage(ex.getMessage());
			this.setState(StorageStatus.ERROR);
		}

		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	//
	// Storage actions.
	//

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/storage/action# - term: online
	 * - title: Set storage online
	 */
	@Override
	public void online() {
		LOGGER.debug("Action online() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		String volumeName = this.getTitle();
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
		}
		try {
			// Storage State Machine.
			switch (getState().getValue()) {

			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"online\")...");
				this.setState(StorageStatus.OFFLINE);
				VolumeHelper.detachDisk(volumeName);
				VolumeHelper.attachDisk(volumeName, vmName);
				try {
					if (VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.ONLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}
				break;

			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"online\")...");
				VolumeHelper.attachDisk(volumeName, vmName);
				try {
					if (VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.ONLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}

				break;

			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"online\")...");
				this.setState(StorageStatus.OFFLINE);
				VolumeHelper.detachDisk(volumeName);
				VolumeHelper.attachDisk(volumeName, vmName);
				try {
					if (VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.ONLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}

				break;

			default:
				break;
			}
		} catch (AttachDiskException | DetachDiskException ex) {
			this.setMessage(ex.getMessage());
			this.setState(StorageStatus.ERROR);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/storage/action# - term:
	 * offline - title: Set storage offline
	 */
	@Override
	public void offline() {
		LOGGER.debug("Action offline() called on " + this);
		String volumeName = this.getTitle();
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				LOGGER.error("Cant locate a datastore for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				LOGGER.error("Cant locate a datacenter for this storage disk.");
				VCenterClient.disconnect();
				return;
			}
		}
		try {
			// Storage State Machine.
			switch (getState().getValue()) {

			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"offline\")...");

				VolumeHelper.detachDisk(volumeName);
				try {
					if (!VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.OFFLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}

				break;

			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				try {
					if (VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.ONLINE);
					} else {
						this.setState(StorageStatus.OFFLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}

				break;

			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				try {
					if (VolumeHelper.isAttached(volumeName)) {
						this.setState(StorageStatus.ONLINE);
					} else {
						this.setState(StorageStatus.OFFLINE);
					}
				} catch (DiskNotFoundException e) {
					LOGGER.error(e.getMessage());
					this.setMessage(e.getMessage());
					this.setState(StorageStatus.ERROR);
				}

				break;

			default:
				break;
			}
		} catch (DetachDiskException ex) {
			this.setMessage(ex.getMessage());
			this.setState(StorageStatus.ERROR);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	/**
	 * Assign uuid to deviceId on all storageLinkConnector.
	 */
	public void assignDeviceIdStorageToStorageLink(final String volumeName) {
		EList<Link> links = this.getLinks();
		for (Link link : links) {
			if (link instanceof StoragelinkConnector) {
				StoragelinkConnector linkst = (StoragelinkConnector) link;
				linkst.setDeviceid(VolumeHelper.getDiskUUID(volumeName));
			}
		}

	}

	// Getters and setters and private methods.

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public String getDatacenterName() {
		if (datacenterName == null) {
			datacenterName = getAttributeValueByOcciKey("occi.storage.vmware.datacenter");
		}
		return datacenterName;
	}

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public void setDatacenterName(String datacenterName) {
		this.datacenterName = datacenterName;
		if (getAttributeValueByOcciKey("occi.storage.vmware.datacenter") == null) {
			AttributeState attr = this.createAttribute("occi.storage.vmware.datacenter", datacenterName);
			this.getAttributes().add(attr);
		} else {
			AttributeState attr = this.getAttributeStateObject("occi.storage.vmware.datacenter");
			attr.setValue(datacenterName);
		}
	}

	/**
	 * Usage with mixin in future.
	 * 
	 * @return
	 */
	public String getDatastoreName() {
		if (datastoreName == null) {
			datastoreName = getAttributeValueByOcciKey("occi.storage.vmware.datastore");
		}

		return datastoreName;
	}

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public void setDatastoreName(String datastoreName) {
		this.datastoreName = datastoreName;
		if (getAttributeValueByOcciKey("occi.storage.vmware.datastore") == null) {
			AttributeState attr = this.createAttribute("occi.storage.vmware.datastore", datastoreName);
			this.getAttributes().add(attr);
		} else {
			AttributeState attr = this.getAttributeStateObject("occi.storage.vmware.datastore");
			attr.setValue(datastoreName);
		}

	}

	/**
	 * Return a list of linked compute connector.
	 * 
	 * @return a list of ComputeConnector or empty if no linked instance.
	 */
	private List<ComputeConnector> getLinkedComputes() {

		List<ComputeConnector> computes = new ArrayList<ComputeConnector>();

		// As the links are not bidirectional, we search on configuration object
		// the entities connected to this storage.

		Configuration config = OcciHelper.getConfiguration(this);
		List<Resource> resources = config.getResources();
		List<Link> resLinks;
		for (Resource resource : resources) {
			if (resource instanceof ComputeConnector) {
				resLinks = resource.getLinks();
				for (Link link : resLinks) {
					Resource target = link.getTarget();
					if (target != null && target instanceof StorageConnector) {
						StorageConnector storage = (StorageConnector) target;
						if (storage.equals(this)) {
							// Linked to this object.
							ComputeConnector compute = (ComputeConnector) resource;
							computes.add(compute);
						}
					}
				}
			}
		}
		return computes;
	}

	/**
	 * Load from referenced objects, the datacenter information and datastore.
	 */
	private void loadDatastoreAndDatacenter() throws DatastoreNotFoundException, DatacenterNotFoundException {

		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();

		// Search for linked computes.

		List<ComputeConnector> computes = getLinkedComputes();
		// Load the datastore.
		if (datastoreName != null) {
			datastore = DatastoreHelper.findDatastoreForName(rootFolder, datastoreName);
			if (datastore == null) {
				throw new DatastoreNotFoundException(
						"Cant locate a datastore, cause: datastore is referenced but not found on vcenter, name of the datastore: "
								+ datastoreName);
			}
		} else {
			// search on computes the virtual disk that represent this storage,
			// and get the corresponding datastore.
			for (ComputeConnector compute : computes) {
				// Load the vm.
				String vmNameTmp = compute.getTitle();
				VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmNameTmp);
				Map<String, VirtualDisk> vdisks = VolumeHelper.getVirtualDiskForVM(vm);
				VirtualDisk vdiskOut = null;
				if (vdisks != null && !vdisks.isEmpty()) {
					// search the virtualdisk corresponding ref.
					for (Map.Entry<String, VirtualDisk> entry : vdisks.entrySet()) {
						String diskName = entry.getKey();
						String tmp = diskName.replace(".vmdk", "");
						String tampon[] = tmp.split("]");
						datastoreName = tampon[0].substring(1);

						tampon = tampon[1].split("/");
						diskName = tampon[tampon.length - 1];
						if (diskName.equals(this.getTitle())) {
							vdiskOut = entry.getValue();
							break;
						}
					}

				}
				if (datastoreName != null) {
					// add the attribute to persist value in addition.
					this.setDatastoreName(datastoreName);
				}
				if (vmName == null) {
					vmName = compute.getTitle();
				}
			}

		}

		datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastoreName);
		if (datacenter == null) {
			throw new DatacenterNotFoundException(
					"Cannot retrieve datacenter, cause: datacenter not found for the datastore: "
							+ datastore.getName());
		} else {
			
			this.setDatacenterName(datacenter.getName());

		}
		if (vmName == null) {
			for (ComputeConnector compute : computes) {
				vmName = compute.getTitle();
				break;
			}
		}

		//
		//
		//
		// if (computes.isEmpty()) {
		// LOGGER.warn("No storage link found, the volume " + this.getTitle() +
		// " is not linked to a compute.");
		// } else {
		// // Search for a datastore name on links.
		// if (datastoreName == null) {
		// this.setDatastoreName(this.findDatastoreNameOnAttribute());
		// }
		// // Take the first compute.
		// for (ComputeConnector compute : computes) {
		// if (compute.getTitle() != null) {
		// vmName = compute.getTitle();
		// if (datacenterName == null) {
		// datacenterName = compute.getDatacenterName();
		//
		// if (datastoreName == null) {
		// datastoreName = compute.getDatastoreName();
		// }
		//
		// }
		// break;
		// }
		// }
		// // Search for a datastore name on links.
		// if (datastoreName == null) {
		// this.setDatastoreName(this.findDatastoreNameOnAttribute());
		// }
		// }
		//
		// if (datastoreName != null) {
		// // Load datastore object.
		// datastore = DatastoreHelper.findDatastoreForName(rootFolder,
		// datastoreName);
		// // Search the datacenter with revert list of datastores.
		// datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder,
		// datastoreName);
		//
		// if (datacenter == null) {
		// throw new DatacenterNotFoundException(
		// "Cannot retrieve datacenter, cause: datacenter not found for the
		// datastore: "
		// + datastore.getName());
		// }
		//
		// if (datastore == null) {
		// throw new DatastoreNotFoundException(
		// "Cant locate a datastore, cause: datastore is referenced but not
		// found on vcenter, name of the datastore: "
		// + datastoreName);
		// }
		//
		// } else {
		// // Datastore is null, we must assign a datacenter and a
		// // datastore to continue.
		// // if at least one is not found.
		// if (datastore == null || datacenter == null) {
		// if (datacenter == null) {
		// throw new DatacenterNotFoundException("Cant locate a datacenter,
		// cause : no available datacenter.");
		// }
		// if (datastore == null) {
		// throw new DatastoreNotFoundException("Cant locate a datastore, cause:
		// no available datastore.");
		// }
		// }
		// }
		// if (datacenter != null) {
		// this.setDatacenterName(datacenter.getName());
		// }
		// if (datastore != null) {
		// this.setDatastoreName(datastore.getName());
		// }

	}

	/**
	 * get attribute value with his occi key, deserve when no property value
	 * set, with Mixin attribute as it is defined by Cloud designer.
	 * 
	 * @param key
	 * @return an attribute value, null if no one is found.
	 */
	public String getAttributeValueByOcciKey(String key) {
		String value = null;
		if (key == null) {
			return value;
		}

		List<AttributeState> attrs = this.getAttributes();
		for (AttributeState attr : attrs) {
			if (attr.getName().equals(key)) {
				value = attr.getValue();
				break;
			}
		}

		return value;

	}

	/**
	 * Create an attribute without add this to the current connector object.
	 * 
	 * @param name
	 * @param value
	 * @return AttributeState object.
	 */
	public AttributeState createAttribute(final String name, final String value) {
		AttributeState attr = OCCIFactory.eINSTANCE.createAttributeState();
		attr.setName(name);
		attr.setValue(value);
		return attr;
	}

	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
	 */
	private AttributeState getAttributeStateObject(final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : this.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

}
