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
import java.util.List;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.UIDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.GuestDiskInfo;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://schemas.ogf.org/occi/infrastructure# - term: storagelink - title:
 * StorageLink Link
 * This class intend to manage the storage on system level.
 */
public class StoragelinkConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StoragelinkConnector.class);

	public static String DATASTORE = "Datastore";

	private String vmName;
	private StorageLinkStatus tmpStatus = this.getState();
	private String mountPath = mountpoint;
	
	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;
	
	/**
	 * Constructs a storagelink connector.
	 */
	StoragelinkConnector() {
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Storagelink instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
	}

	/**
	 * Called when this Storagelink instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		titleMessage = "Retrieve a system volume : " + getTitle();
		
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					retrieveStorageSystem(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveStorageSystem(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			
			updateAttributesOnSystemStorage();

		}
		
		globalMessage = "";
		levelMessage = null;
		
	}

	/**
	 * Called when this Storagelink instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Storagelink instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Storagelink actions.
	//

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

	/**
	 * Assign logical disk information to deviceId to be done in StorageLink.
	 */
	public void assignDeviceIdStorageToStorageLink(final String volumeName) {
		VirtualMachine vm = null;
		if (vmName != null) {
			// Load the vm information.
			vm = VMHelper.loadVirtualMachine(vmName);
			if (vm != null && VMHelper.isToolsInstalled(vm) && VMHelper.isToolsRunning(vm)) {
				// ??? no information via tools. Maybe via an agent or a ssh connection !
			}
		}
		
//     TODO : Assign logical disk like /dev/sda (or /dev/hda), c: , ssh command ? 		
	}
	
	/**
	 * Retrieve the mount path of a disk.
	 */
	private void retrieveStorageDiskPath() {
		VirtualMachine vm = null;
		if (vmName != null) {
			// Load the vm information.
			vm = VMHelper.loadVirtualMachine(vmName);
			if (vm != null && VMHelper.isToolsInstalled(vm) && VMHelper.isToolsRunning(vm)) {
				GuestDiskInfo[] guestDskInfos = vm.getGuest().getDisk();
				for (GuestDiskInfo guestDisk : guestDskInfos) {
					mountPath = guestDisk.getDiskPath();
					break;
				}
				// TODO : Search a better solution, no id defined to link between the system disk AND the virtualDisks.
			}
		}	
	}
	
	/**
	 * Update the attributes...
	 */
	public void updateAttributesOnSystemStorage() {
		if (tmpStatus != null) {
			setState(tmpStatus);
		}
		if (mountPath != null) {
			setMountpoint(mountPath);
		}
		
	}
	
	/**
	 * business code for retrieving a system volume.
	 * @param monitor
	 */
	public void retrieveStorageSystem(IProgressMonitor monitor) {
		globalMessage = "";
		levelMessage = null;
		
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
		
		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
		// Find a datastore.
		Resource target = getTarget();
		if (target == null) {
			globalMessage = "No target storage link for this storage link";
			levelMessage = Level.ERROR;
			LOGGER.error("No target storage link for this storage link.");
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}
		String datastoreName = null;
		if (target instanceof StorageConnector) {
			StorageConnector conn = (StorageConnector) target;
			datastoreName = conn.getDatastoreName();
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		
		if (datastoreName == null) {
			globalMessage = "The datastore name is not setted, please set the attribute " + StorageConnector.ATTR_DATASTORE_NAME + " on Storage entity. \n Cant retrieve datastore.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}
		Datastore datastore = DatastoreHelper.findDatastoreForName(rootFolder, datastoreName);

		if (datastore == null) {
			globalMessage = "The datastore " + datastoreName + " doesnt exist. Check your configuration.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			tmpStatus = StorageLinkStatus.ERROR;
			return;
		}

		// Load the vm and get his represented ComputeConnector if any.
		// Research vm information if vm exist, get the compute source.
		Resource computeRes = getSource();

		if (computeRes != null && computeRes instanceof ComputeConnector) {
			ComputeConnector computeConn = (ComputeConnector) getSource();
			vmName = computeConn.getTitle();
			// TODO : Check if the disk is effectively mounted.
			// Set state.
			if (computeConn.getState().equals(ComputeStatus.ACTIVE)) {
				tmpStatus = StorageLinkStatus.ACTIVE;
			} else {
				tmpStatus = StorageLinkStatus.INACTIVE;
			}

		} else {
			tmpStatus = StorageLinkStatus.INACTIVE;
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}
		
		retrieveStorageDiskPath();
		if (toMonitor) {
			subMonitor.worked(70);
		}
		// Refresh the storage part.
		// if (target != null && target instanceof StorageConnector) {
		// StorageConnector storage = (StorageConnector) target;
		// if (vmName != null) {
		// storage.setVmName(vmName);
		// }
		// storage.retrieve();
		//
		// } // if no target, no more retrieve.
		
		if (UIDialog.isStandAlone()) {
			updateAttributesOnSystemStorage();
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		VCenterClient.disconnect();
	}
	
}
