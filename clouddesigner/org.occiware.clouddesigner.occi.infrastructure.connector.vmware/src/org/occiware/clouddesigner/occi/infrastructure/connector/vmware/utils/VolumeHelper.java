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
import java.util.HashMap;
import java.util.Map;

import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.Volume;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.AttachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.CreateDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DeleteDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DetachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DiskNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.LoadVolumeException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.RenameDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.ResizeDiskException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.mo.VirtualMachine;

public class VolumeHelper {

	private static Logger LOGGER = LoggerFactory.getLogger(VolumeHelper.class);

	private static Volume volume = null;

	/**
	 * Load or refresh volume information from vcenter.
	 * 
	 * @param dsName
	 * @param volumeName
	 * @param dcName
	 * @param vmName
	 *            (may be null if volume is not attached.)
	 * @throws LoadVolumeException 
	 */
	public static void loadVolumeInformation(String dsName, String volumeName, String dcName, String vmName) throws LoadVolumeException {
		// Load a volume.
		volume = new Volume(volumeName, dsName, dcName, vmName);
		volume.loadVolume();
	}

	/**
	 * Is the volume exist on vcenter ?
	 * 
	 * @param dsName
	 * @param volumeName
	 * @param dcName
	 * @param vmName
	 *            (may be null if volume is not attached).
	 * @return true if volume exist, else false.
	 * @throws LoadVolumeException 
	 */
	public static boolean isExistVolumeForName(String dsName, String volumeName, String dcName, String vmName) {
		// Search the volume on datastore.
		if (!checkVolume(volumeName)) {
			// Load the volume.
			try {
				loadVolumeInformation(dsName, volumeName, dcName, vmName);
			} catch (LoadVolumeException ex) {
			}
		}

		return volume.isExist();
	}

	/**
	 * Create an empty disk if no attachment on vm or a virtual disk attached to
	 * a vm.
	 * 
	 * @param dcName
	 *            (Datacenter name)
	 * @param dsName
	 *            (Datastore name)
	 * @param volumeName
	 * @param volumeSize
	 * @throws LoadVolumeException 
	 * @throws CreateDiskException 
	 */
	public static void createVolume(final String dcName, final String dsName, final String volumeName,
			final Float volumeSize) throws LoadVolumeException, CreateDiskException {
		// build a new disk.
		if (!checkVolume(volumeName)) {
			loadVolumeInformation(dsName, volumeName, dcName, null);
		}
		if (volume.isExist()) {
			LOGGER.warn("The disk " + volumeName + " already exist, cant create it.");
			return;
		}
		if (volume.getVmName() != null) {
			volume.createAttachedVolume();
		} else {
			volume.createEmptyVolume();
		}
	}
	
	// Delegate methods.
	/**
	 * Set the disk size on volume object.
	 * 
	 * @param size
	 */
	public static void setSize(final String volumeName, final Float size) {
		if (checkVolume(volumeName)) {
			volume.setSize(size);
		}
	}

	public static Float getSize(String volumeName) throws DiskNotFoundException {
		if (checkVolume(volumeName)) {
			return volume.getSize();
		} else {
			LOGGER.warn("No disk information loaded, cant give a size.");
			throw new DiskNotFoundException("No disk information loaded, cant give a size.");
		}
	}

	/**
	 * 
	 * @return the volume state, null if no volume defined.
	 * @throws DiskNotFoundException
	 */
	public static String getDiskState(final String volumeName) throws DiskNotFoundException {
		if (checkVolume(volumeName)) {
			return volume.getVolumeState();
		} else {
			LOGGER.warn("No disk information loaded, cant give a state.");
			throw new DiskNotFoundException("No disk information loaded, cant give a state.");
		}
	}

	/**
	 * 
	 * @return
	 * @throws DiskNotFoundException
	 */
	public static boolean isAttached(final String volumeName) throws DiskNotFoundException {
		boolean result;
		if (checkVolume(volumeName)) {
			result = volume.isAttached();
		} else {
			LOGGER.warn("No disk information loaded, cant give an attachment state.");
			throw new DiskNotFoundException("No disk information loaded, cant give an attachment state.");
		}
		return result;
	}

	/**
	 * Resize the specified disk.
	 * 
	 * @param dc
	 * @param ds
	 * @param volumeName
	 * @param vmName
	 * @throws ResizeDiskException 
	 */
	public static void resizeDisk(final String volumeName, Float newSize) throws DiskNotFoundException, ResizeDiskException {
		
		if (checkVolume(volumeName)) {
			volume.resize(newSize);
			
		} else {
			LOGGER.warn("No disk information loaded, cant resize the disk.");
			throw new DiskNotFoundException("No disk information loaded, cant resize the disk.");
		}

	}

	/**
	 * Get the uuid of the disk.
	 * 
	 * @param volumeName
	 * @return
	 * @throws RemoteException 
	 */
	public static String getDiskUUID(String volumeName) throws RemoteException {
		String uuid = "unknown";
		if (checkVolume(volumeName)) {
			uuid = volume.getUUID();
		}
		return uuid;
	}

	/**
	 * Rename a disk from oldVolumeName to newVolumeName and the vmdk file
	 * accordingly.
	 * 
	 * @param oldVolumeName
	 * @param newVolumeName
	 * @return true if operation succeed
	 * @throws DiskNotFoundException
	 * @throws RenameDiskException 
	 */
	public static void renameDisk(final String oldVolumeName, final String newVolumeName)
			throws DiskNotFoundException, RenameDiskException {
		if (checkVolume(oldVolumeName)) {
			volume.renameDisk(newVolumeName);

		} else {
			LOGGER.warn("No disk information loaded, cant rename the disk: " + oldVolumeName);
			throw new DiskNotFoundException("No disk information loaded, cant rename the disk : " + oldVolumeName);
		}
	}

	/**
	 * Destroy definitively a disk from vcenter. If the disk is attached, the
	 * disk is detached before.
	 * 
	 * @param volumeName
	 * @param dcName
	 * @param dsName
	 * @param vmName
	 * @throws DetachDiskException
	 * @throws DeleteDiskException 
	 * @throws LoadVolumeException 
	 */
	public static void destroyDisk(final String volumeName, final String dcName, final String dsName,
			final String vmName) throws DetachDiskException, DeleteDiskException, LoadVolumeException {
		
		if (checkVolume(volumeName)) {
			// The volume is loaded
			// Destroy the vmdk.
			if (volume.isAttached()) {
				// Detach the disk before the deletion.
				detachDisk(volumeName);
			}
			volume.destroyVolume();

		} else {
			if (isExistVolumeForName(dsName, volumeName, dcName, vmName)) {
				// disk is reloaded successfully, destroy the vmdk.
				volume.destroyVolume();
			}
		}
	}

	/**
	 * Detach the disk from vm instance.
	 * 
	 * @param volumeName
	 * @throws DetachDiskException
	 */
	public static void detachDisk(final String volumeName) throws DetachDiskException {
		if (checkVolume(volumeName)) {
			if (volume.isAttached()) {
				volume.detachVolume();
			}
		}
	}

	/**
	 * Attach the disk from vm instance.
	 * 
	 * @param volumeName
	 * @param vmName
	 * @throws AttachDiskException
	 * @throws DetachDiskException
	 */
	public static void attachDisk(final String volumeName, final String vmName)
			throws AttachDiskException, DetachDiskException {
		
		if (checkVolume(volumeName)) {
			if (volume.isAttached()) {
				detachDisk(volumeName);
				if (volume.isAttached()) {
					LOGGER.warn("Cant detach the disk, please check your configuration and logs.");
				}
			}
			volume.attachVolume();
		}
		
	}

	/**
	 * Check if volume object is the good one with volumeName info.
	 * 
	 * @param volumeName
	 * @return true if ok, false otherwise.
	 */
	private static boolean checkVolume(final String volumeName) {
		boolean result = false;
		if (volume != null && volume.getVolumeName().equals(volumeName)) {
			result = true;
		}
		return result;
	}

	/**
	 * Get all vmware virtual disk object for a VM.
	 * 
	 * @param vm
	 * @return a map of String (diskName), VirtualDisk.
	 */
	public static Map<String, VirtualDisk> getVirtualDiskForVM(VirtualMachine vm) {

		Map<String, VirtualDisk> mapDisks = new HashMap<String, VirtualDisk>();
		if (vm == null) {
			return mapDisks;
		}
		VirtualDevice[] devices = vm.getConfig().getHardware().getDevice();

		String diskName;

		// Search on devices.
		for (VirtualDevice device : devices) {
			diskName = null;
			if (device == null) {
				continue;
			} else if (device instanceof VirtualDisk) {
				VirtualDisk disk = (VirtualDisk) device;
				VirtualDeviceBackingInfo vdbi = device.getBacking();

				if (vdbi instanceof VirtualDeviceFileBackingInfo) {
					diskName = ((VirtualDeviceFileBackingInfo) vdbi).getFileName();
					// Add to map.
					mapDisks.put(diskName, disk);
				}
			}
		}

		return mapDisks;
	}

}
