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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.AttachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.CreateDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatacenterNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatastoreNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DeleteDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DetachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DiskNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.LoadVolumeException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.RenameDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.ResizeDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VolumeHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.EntityUtils;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.EntityUtilsHeadless;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.UIDialog;
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
	private String volumeName = null;

	private String oldDiskName = null;
	private Float oldDiskSize = null;

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	/**
	 * Attributes key for object that are not manage by infrastructure extension
	 * default.
	 */
	public static final String ATTR_DATACENTER_NAME = "datacentername";
	public static final String ATTR_DATASTORE_NAME = "datastorename";
	private static final String VMWARE_MIXIN_FOLDERS_TERM = "vmwarefolders";
	

	/**
	 * Managed object reference id. Unique reference for virtual machine.
	 */
	private String morId;
	
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
		titleMessage = "Create a virtual disk : " + getTitle();
		LOGGER.debug("occiCreate() called on " + this);
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					createStorage(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					createStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
		
	}

	/**
	 * Called when this Storage instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {

		titleMessage = "Retrieve a virtual disk : " + getTitle();
		LOGGER.debug("occiRetrieve() called on " + this);
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			retrieveStorage(null);
			

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			
			updateAttributesOnStorage();

		}
		
		globalMessage = "";
		levelMessage = null;
	}

	/**
	 * Called when this Storage instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		titleMessage = "Update a virtual disk : " + getTitle();
		LOGGER.debug("occiUpdate() called on " + this);
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					updateStorage(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					updateStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;

	}

	/**
	 * Called when this Storage instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		titleMessage = "Delete a virtual disk : " + getTitle();
		LOGGER.debug("occiDelete() called on " + this);
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					deleteStorage(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					deleteStorage(monitor);
				}
			};

			if (UIDialog.showConfirmDialog()) {
				UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			}

			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}

		}

		globalMessage = "";
		levelMessage = null;
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
		titleMessage = "Virtual disk : " + getTitle() + " , action: online";
		LOGGER.debug("Action online() called on " + this);
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					attachStorage(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					attachStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
				
	}

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/storage/action# - term:
	 * offline - title: Set storage offline
	 */
	@Override
	public void offline() {
		titleMessage = "Virtual disk : " + getTitle() + " , action: offline";
		LOGGER.debug("Action offline() called on " + this);
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					detachStorage(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					detachStorage(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			// retrieve resource informations when no errors has been launched.
			if ((levelMessage != null && !Level.ERROR.equals(levelMessage)) || levelMessage == null) {
				occiRetrieve();
			}
		}

		globalMessage = "";
		levelMessage = null;
		
	}

	// Getters and setters and private methods.

	/**
	 * Usage with Mixin in future.
	 * 
	 * @return
	 */
	public String getDatacenterName() {
		if (datacenterName == null) {
			datacenterName = getAttributeValueByOcciKey(ATTR_DATACENTER_NAME);
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
	}

	/**
	 * Usage with mixin in future.
	 * 
	 * @return
	 */
	public String getDatastoreName() {
		if (datastoreName == null) {
			datastoreName = getAttributeValueByOcciKey(ATTR_DATASTORE_NAME);
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
	 * Check if this compute has mixin vmware folder addon.
	 * 
	 * @return
	 */
	public boolean hasMixinVMwareFolders() {
		boolean result = false;
		String mixinTerm = null;
		List<Mixin> mixins = this.getMixins();
		for (Mixin mixin : mixins) {
			mixinTerm = mixin.getTerm();
			// This mixin contains attributes for datacenter, datastore, cluster
			// and others goodies on folders.
			if (mixinTerm.equals(VMWARE_MIXIN_FOLDERS_TERM)) {
				result = true;
				break;
			}
		}
		return result;
	}
	

	/**
	 * Load from referenced objects, the datacenter information and datastore.
	 */
	private void loadDatastoreAndDatacenter() throws DatastoreNotFoundException, DatacenterNotFoundException {

		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();

		// Search for linked computes.

		List<ComputeConnector> computes = getLinkedComputes();
		
		boolean hasMixinVmwareFolders = hasMixinVMwareFolders();
		if (hasMixinVmwareFolders) {
			String datacenterTmp = getAttributeValueByOcciKey(ATTR_DATACENTER_NAME);
			String datastoreTmp = getAttributeValueByOcciKey(ATTR_DATASTORE_NAME);
			// get and set datastorename and datacentername.
			if (datacenterTmp != null && !datacenterTmp.trim().isEmpty()) {
				datacenterName = datacenterTmp;
			}
			if (datastoreTmp != null && !datastoreTmp.trim().isEmpty()) {
				datastoreName = datastoreTmp;
			}
		}
		
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
		if (datacenterName != null) {
			datacenter = DatacenterHelper.findDatacenterForName(rootFolder, datacenterName);
		} 
		if (datacenter == null) {
			// Another solution is to get datacenter object from datastore.
			datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastoreName);
		}
		
		
		if (datacenter == null && datastoreName != null) {
			
			
			throw new DatacenterNotFoundException(
					"Cannot retrieve datacenter, cause: datacenter not found for the datastore: "
							+ datastore.getName());
		
		} else if (datacenter == null && datastoreName == null) {
			
			throw new DatacenterNotFoundException("Cannot retrieve datacenter, cause: no datastore defined for this virtual disk : " + this.getTitle());
		
		} else {

			this.setDatacenterName(datacenter.getName());

		}
		if (vmName == null) {
			for (ComputeConnector compute : computes) {
				vmName = compute.getTitle();
				break;
			}
		}

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

	public void updateAttributesOnStorage() {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();
		boolean hasMixinVMwareFolders = hasMixinVMwareFolders();
		if (datacenterName != null && hasMixinVMwareFolders) {
			if (this.getAttributeStateObject(ATTR_DATACENTER_NAME) == null) {
				attrsToCreate.put(ATTR_DATACENTER_NAME, datacenterName);
			} else {
				// update
				attrsToUpdate.put(ATTR_DATACENTER_NAME, datacenterName);
			}
		}
		if (datastoreName != null && hasMixinVMwareFolders) {
			// ATTR_DATASTORE_NAME
			if (this.getAttributeStateObject(ATTR_DATASTORE_NAME) == null) {
				attrsToCreate.put(ATTR_DATASTORE_NAME, datastoreName);
			} else {
				attrsToUpdate.put(ATTR_DATASTORE_NAME, datastoreName);
			}
		}
		if (UIDialog.isStandAlone()) {
			// Headless environment.
			EntityUtilsHeadless.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
			
		} else {
			// Gui environment
			EntityUtils.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
		}
		if (volumeName != null && !volumeName.equals(getTitle())) {
			setTitle(volumeName);
		}

		if (size == 0.0f) {
			setState(StorageStatus.ERROR);
			setMessage("Volume size is required");
		} else {
			try {
				if (VolumeHelper.isAttached(volumeName)) {
					setState(StorageStatus.ONLINE);
				} else {
					setState(StorageStatus.OFFLINE);
				}
			} catch (DiskNotFoundException ex) {
				setState(StorageStatus.ERROR);
				setMessage(ex.getMessage());
			}
		}

	}
	
	/**
	 * Business code for creating a storage.
	 * @param monitor
	 */
	public void createStorage(IProgressMonitor monitor) {
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}
		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			subMonitor.worked(10);
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();

		AllocatorImpl allocator = new AllocatorImpl(rootFolder);

		List<ComputeConnector> computes = getLinkedComputes();

		if (computes.isEmpty()) {
			LOGGER.warn("the volume is not linked to a compute.");
		} else {
			// Search for a datastore name on attribute.
			setDatastoreName(getDatastoreName());
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		Float size = getSize();
		volumeName = getTitle();

		oldDiskSize = size;
		oldDiskName = volumeName;

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			// Allocate the datacenter and datastore when necessary.
			if (datastore == null) {
				datastore = allocator.allocateDatastore();
				if (datastore != null) {
					LOGGER.info("Assigning datastore: " + datastore.getName());
					setDatastoreName(datastore.getName());
				}
			}
			if (datastore != null && datacenter == null && vmName == null) {
				datacenter = DatacenterHelper.findDatacenterFromDatastore(rootFolder, datastore.getName());
				setDatacenterName(datacenter.getName());
				setDatastoreName(datastore.getName());
			}
			if (datastore == null) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		
		if (monitor != null) {
			subMonitor.worked(40);
		}
		// Load the volume information. If the volume doesn't exist, the
		// volume object will have default value.

		try {
			VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName);
			if (monitor != null) {
				subMonitor.worked(60);
			}
		} catch (LoadVolumeException ex) {
		}
		// Check if the volume already exist in the vcenter.
		if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
			// The volume already exist.
			globalMessage = "Virtual disk : " + volumeName + " already exist in datacenter.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (monitor != null) {
			subMonitor.worked(70);
		}
		// set the attributes on volume object.
		if (getSize() == 0.0f) {
			globalMessage = "The disk size is not setted, please set this attributes in GB float value.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VolumeHelper.setSize(volumeName, getSize());
		// Create a new disk with or with or without vm information.
		try {
			if (monitor != null) {
				subMonitor.worked(80);
			}
			VolumeHelper.createVolume(datacenterName, datastoreName, volumeName, getSize());
			if (monitor != null) {
				subMonitor.worked(100);
			}
			if (vmName == null) {
				globalMessage = "The virtual disk : " + volumeName + " is created ";
			} else {
				globalMessage = "The virtual disk : " + volumeName + " is created and attached to virtual machine : " + vmName;
			}
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);
			
		} catch (LoadVolumeException | CreateDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}

		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
	
	/**
	 * Business code for retrieving storage informations.
	 * @param monitor
	 */
	public void retrieveStorage(IProgressMonitor monitor) {
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		volumeName = getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = getSize();
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		
		// Check if disk name has changed.
		if (!oldDiskName.equals(volumeName)) {
			// Volume name has changed.
			if (VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
				// All ok.
				oldDiskName = volumeName;
				LOGGER.info("The disk " + oldDiskName + " name has changed to : " + volumeName);

			} else if (VolumeHelper.isExistVolumeForName(datastoreName, oldDiskName, datacenterName, vmName)) {
				volumeName = oldDiskName;
			}
		} else {
			// Load the volume object.
			try {
				VolumeHelper.loadVolumeInformation(datastoreName, volumeName, datacenterName, vmName);
			} catch (LoadVolumeException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		// Update disk information on screen.
		try {
			if (!VolumeHelper.isExistVolumeForName(datastoreName, volumeName, datacenterName, vmName)) {
				globalMessage = "Cant find the disk on vcenter, there's no disk with the name : " + volumeName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
			size = VolumeHelper.getSize(volumeName);
			
		} catch (DiskNotFoundException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		if (UIDialog.isStandAlone()) {
			updateAttributesOnStorage();
		}
		
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
	
	/**
	 * Update a storage.
	 * @param monitor
	 */
	public void updateStorage(IProgressMonitor monitor) {
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		volumeName = getTitle();

		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		} 
		
		if (monitor != null) {
			subMonitor.worked(40);
		}
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (oldDiskSize == null) {
			oldDiskSize = getSize();
		}

		// Resizing.
		if (oldDiskSize != size) {
			VolumeHelper.setSize(volumeName, size);
			try {
				VolumeHelper.resizeDisk(volumeName, size);
				globalMessage = "Resize disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
			} catch (DiskNotFoundException | ResizeDiskException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}
		}
		if (monitor != null) {
			subMonitor.worked(60);
		}
		// Renaming. (include vmdk file rename).
		if (!oldDiskName.equals(volumeName)) {
			// Try to rename the disk (and the vmdk file).
			try {
				VolumeHelper.renameDisk(oldDiskName, volumeName);
				oldDiskName = volumeName;
				globalMessage += " \n rename disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
			} catch (DiskNotFoundException | RenameDiskException ex) {
				globalMessage = ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
	
	
	/**
	 * Delete a storage.
	 * @param monitor
	 */
	public void deleteStorage(IProgressMonitor monitor) {
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		volumeName = getTitle();
		if (oldDiskName == null) {
			oldDiskName = volumeName;
		}
		if (monitor != null) {
			subMonitor.worked(20);
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(60);
		}
		try {
			VolumeHelper.destroyDisk(volumeName, datacenterName, datastoreName, vmName);
			globalMessage = "Delete disk operation success";
			levelMessage = Level.INFO;
			LOGGER.error(globalMessage);
		} catch (DetachDiskException | LoadVolumeException | DeleteDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
	
	/**
	 * Business code for attach a disk to a virtual machine. (online)
	 * @param monitor
	 */
	public void attachStorage(IProgressMonitor monitor) {
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			// consume..
			subMonitor.worked(10);

		}
		volumeName = getTitle();
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		} 
		if (monitor != null) {
			subMonitor.worked(40);
		}
		try {
			// Storage State Machine.
			switch (getState().getValue()) {

			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"online\")...");
				
				VolumeHelper.detachDisk(volumeName);
				if (monitor != null) {
					subMonitor.worked(60);
				}
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"online\")...");
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"online\")...");
				VolumeHelper.detachDisk(volumeName);
				if (monitor != null) {
					subMonitor.worked(60);
				}
				VolumeHelper.attachDisk(volumeName, vmName);
				globalMessage = "attach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;

			default:
				globalMessage = "Unknown disk state";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				break;
			}
			if (monitor != null) {
				subMonitor.worked(100);
			}
		} catch (AttachDiskException | DetachDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
	
	/**
	 * Detach a storage from a virtual machine.
	 * @param monitor
	 */
	public void detachStorage(IProgressMonitor monitor) {
		volumeName = getTitle();
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			return;
		}

		SubMonitor subMonitor = null;
		boolean toMonitor = false;
		if (monitor != null) {
			toMonitor = true;
		}

		if (toMonitor) {
			subMonitor = SubMonitor.convert(monitor, 100);
			subMonitor.worked(10);
		}
		try {
			loadDatastoreAndDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			if (datastore == null) {
				globalMessage = "Cant locate a datastore for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
			if (datacenter == null) {
				globalMessage = "Cant locate a datacenter for this storage disk.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		if (monitor != null) {
			subMonitor.worked(40);
		}
		try {
			switch (getState().getValue()) {
			
			case StorageStatus.ONLINE_VALUE:
				LOGGER.debug("Fire transition(state=online, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;
			case StorageStatus.OFFLINE_VALUE:
				LOGGER.debug("Fire transition(state=offline, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;
			case StorageStatus.ERROR_VALUE:
				LOGGER.debug("Fire transition(state=error, action=\"offline\")...");
				VolumeHelper.detachDisk(volumeName);
				globalMessage = "detach disk operation success";
				levelMessage = Level.INFO;
				LOGGER.error(globalMessage);
				break;
				
			default:
				globalMessage = "Unknown disk state";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				break;
			}
			
			
		} catch (DetachDiskException ex) {
			globalMessage = ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
		}
		if (monitor != null) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}
}
