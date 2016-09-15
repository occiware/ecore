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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Calendar;

import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.AttachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.CreateDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatacenterNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatastoreNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DeleteDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DetachDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.LoadVolumeException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.RenameDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.ResizeDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.ArrayOfHostDatastoreBrowserSearchResults;
import com.vmware.vim25.FileBackedVirtualDiskSpec;
import com.vmware.vim25.FileInfo;
import com.vmware.vim25.FileQuery;
import com.vmware.vim25.FileQueryFlags;
import com.vmware.vim25.HostDatastoreBrowserSearchResults;
import com.vmware.vim25.HostDatastoreBrowserSearchSpec;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecFileOperation;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualDeviceFileBackingInfo;
import com.vmware.vim25.VirtualDisk;
import com.vmware.vim25.VirtualDiskAdapterType;
import com.vmware.vim25.VirtualDiskFlatVer2BackingInfo;
import com.vmware.vim25.VirtualDiskType;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualSCSIController;
import com.vmware.vim25.VmDiskFileQuery;
import com.vmware.vim25.VmDiskFileQueryFilter;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.FileManager;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostDatastoreBrowser;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualDiskManager;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * This class define a virtual volumes as virtual disk AND as vmdk file.
 * 
 * @author Christophe Gourdin - Inria
 *
 */
public class Volume {
	private static Logger LOGGER = LoggerFactory.getLogger(Volume.class);
	public static final String VIRTUAL_DISK = "VirtualDisk";
	public static final String CONTROLLER_IDE = "VirtualIDEController";
	public static final String CONTROLLER_SCSI = "VirtualSCSIController";
	public static final String CONTROLLER_SATA = "VirtualSATAController";

	private String dcName;
	private String dsName;
	private String volumeName;
	/**
	 * Linked virtual machine name (null if none).
	 */
	private String vmName;
	/**
	 * VI java data object.
	 */
	private VirtualDisk vdisk = null;
	/**
	 * Size is in GB.
	 */
	private Float size = 0.0f;
	/**
	 * Physical full path on VMWare infra.
	 */
	private String fullPath = null;
	/**
	 * Mount point like : /home/user/ .
	 */
	private String mountPoint = null;

	/**
	 * Define if this volume is the main on a compute or not.
	 */
	private boolean mainVolume = false;
	/**
	 * VMWare state of this volume.
	 */
	private String volumeState = null;

	/**
	 * VMWare controller type of this volume like : VirtualSCSIController,
	 * VirtualIDEController, VirtualSATAController.
	 */
	private String controllerType = CONTROLLER_SCSI; // Default to scsi
														// controller.
	/**
	 * Define if this volume exist on vmware vcenter.
	 */
	private boolean exist = false;
	private boolean attached = false;

	private Calendar modifiedDate;

	/**
	 * Build a volume object from vcenter server information.
	 * 
	 * @param volumeName
	 * @param ds
	 * @param dc
	 */
	public Volume(final String volumeName, final String dsName, final String dcName, final String vmName) {
		this.volumeName = volumeName;
		this.dsName = dsName;
		this.dcName = dcName;
		this.vmName = vmName;
	}

	/**
	 * Load all the attributes of this object from vcenter. If none found, this
	 * volume doesnt exist anymore.
	 * @throws LoadVolumeException 
	 */
	public void loadVolume() throws LoadVolumeException {
		if (dsName == null) {
			exist = false;
			throw new LoadVolumeException("Cant load the disk information without datastore reference.");
		}
		if (dcName == null) {
			exist = false;
			throw new LoadVolumeException("Cant load the disk information without datacenter reference");
		}
		// Load datastore info.
		Datastore ds;
		try {
			ds = loadDatastore();
		} catch (DatastoreNotFoundException ex) {
			exist = false;
			throw new LoadVolumeException(ex.getMessage(), ex.getCause());
		}

		if (fullPath == null) {
			// Load the fullPath and check if it exist.
			try {
				fullPath = findVolumeVMDKPathForName(ds);
			} catch (Exception ex) {
				exist = false;
				throw new LoadVolumeException(ex.getMessage(), ex.getCause());
			}
		}
		if (fullPath == null) {
			exist = false;
			throw new LoadVolumeException("No vmware path found on this volume, cant load the volume informations.");
		}

		exist = exists(fullPath, ds);
		if (!exist) {
			throw new LoadVolumeException("The disk doesnt exist for path : " + fullPath + " on datastore : " + ds.getName());
		}

		// Load its information.
		if (vmName != null) {
			// Load the corresponding virtualDisk.
			loadVirtualDisk();
		}
		if (vdisk != null) {
			// Get the size of this disk.
			Long sizeCapaKB = vdisk.getCapacityInKB();
			size = sizeCapaKB.floatValue() / (1024 * 1024);
			// Disk is attached.
			attached = true;
			// Determine if this volume is a main disk.
			Integer unitNumber = vdisk.getUnitNumber();
			// TODO : Check if there are other ways to know about a system disk.
			if (unitNumber == 0) {
				mainVolume = true;
			} else {
				mainVolume = false;
			}
			if (attached) {
				volumeState = "attached";
			}

		} else {
			// Disk is not attached to a vm.
			attached = false;
			// this volume is not the main...
			mainVolume = false;

			// The disk size has been set on findVolumeVMDKPathForName...
			volumeState = "detached";
		}

	}

	/**
	 * Load the corresponding virtual disk object if this volume is attached on
	 * vm instance.
	 */
	public void loadVirtualDisk() {
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (vm == null) {
			LOGGER.warn("The attached virtual machine doesnt exist, cant load virtual disk information.");
			vdisk = null;
			attached = false;
			return;
		}
		VirtualDevice[] devices = vm.getConfig().getHardware().getDevice();
		if (devices == null) {
			LOGGER.warn("No attached devices on this virtual machine : " + vmName
					+ " --> can't load virtual disk information");
			vdisk = null;
			attached = false;
			return;
		}
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
				}
				if (diskName != null && diskName.equals(fullPath)) {
					// The disk has been found on the virtual machine.
					vdisk = disk;
					attached = true;
					exist = true;
					break;
				}
			}
		}
	}

	/**
	 * Create an empty volume on vmware vcenter, attached to a datastore but not
	 * attached on a compute. We create here a new VMDK file on the datastore
	 * with the given path.
	 * 
	 * @throws CreateDiskException
	 */
	public void createEmptyVolume() throws CreateDiskException {
		Datacenter dc;
		Datastore ds;
		try {
			ds = loadDatastore();
			dc = loadDatacenter();
		} catch (DatacenterNotFoundException ex) {
			throw new CreateDiskException(ex);
		} catch (DatastoreNotFoundException ex) {
			throw new CreateDiskException(ex);
		}
		if (fullPath == null) {
			try {
				fullPath = findVolumeVMDKPathForName(ds);
			} catch (Exception ex) {
				throw new CreateDiskException(ex.getMessage(), ex.getCause());
			}
		}

		// Check if this volume already exist in the datastore.
		if (fullPath == null) {
			// The volume doesnt exist, we create it in a temporary directory.
			try {
				mkdir(dc, ds, "/tmp");
				fullPath = "[" + dsName + "] " + "tmp" + "/" + volumeName + ".vmdk";
			} catch (IOException ex) {
				throw new CreateDiskException("Error IO : " + ex.getMessage(), ex.getCause());
			}
		} else {
			throw new CreateDiskException("Cant create the disk, it already exist for this path : " + fullPath);
		}
		if (size.longValue() <= 0L) {
			throw new CreateDiskException(
					"Cant create the disk, the size is not setted correctly, size must be superior or equal to 1 GB");
		}

		// Create an empty, unformatted and unpartitionned VMDK virtual disk
		// file.
		try {
			VirtualDiskManager diskManager = VCenterClient.getServiceInstance().getVirtualDiskManager();
			FileBackedVirtualDiskSpec fbvspec = new FileBackedVirtualDiskSpec();
			fbvspec.setAdapterType(VirtualDiskAdapterType.lsiLogic.name());
			fbvspec.setCapacityKb(size.longValue() * (1024 * 1024));
			fbvspec.setDiskType(VirtualDiskType.thin.name());
			Task task = diskManager.createVirtualDisk_Task(fullPath, dc, fbvspec);
			task.waitForTask();
			TaskInfo taskInfo;

			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				throw new CreateDiskException("Error while creating an empty detached disk : " + volumeName + "--> "
						+ fault.detail + " \n Fault message: " + fault.getMessage());
			} else {
				attached = false;
				mainVolume = false;
				exist = true;
				volumeState = "undefined";
				LOGGER.info("The disk : " + volumeName + " has been created (empty volume).");
			}

		} catch (RemoteException | InterruptedException ex) {
			throw new CreateDiskException("Error while creating an empty detached disk : " + volumeName, ex.getCause());
		}
	}

	/**
	 * Create a new volume attached on a vm compute, after, load it's
	 * information on this object attribute. We use the method of the
	 * virtualDevice from vijava SDK.
	 */
	public void createAttachedVolume() throws CreateDiskException {
		VirtualDisk disk = null;
		VirtualSCSIController scsiController;

		Datastore ds;
		try {
			ds = loadDatastore();
		} catch (DatastoreNotFoundException ex) {
			LOGGER.error(ex.getMessage());
			return;
		}
		if (dsName == null) {
			throw new CreateDiskException("Cant load the disk information without datastore reference.");
		}
		if (dcName == null) {
			throw new CreateDiskException("Cant load the disk information without datacenter reference");
		}

		if (volumeName == null) {
			throw new CreateDiskException(
					"The disk name is not setted, please defined it on title attribute, cant create an attached disk.");
		}
		if (vmName == null) {
			throw new CreateDiskException("The virtual machine is not defined, cant create an attached disk.");
		}
		if (size == 0.0f) {
			throw new CreateDiskException("The size must be set (in GB), cant create the attached disk.");
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (vm == null) {
			throw new CreateDiskException(
					"The virtual machine : " + vmName + " doesnt exist anymore, cant create the attached disk.");
		}
		scsiController = getSCSIController(vm);
		if (scsiController == null) {
			throw new CreateDiskException("No scsi controller found on virtual machine : " + vm.getName()
					+ " , cant create the attached disk.");
		}

		// Define the full filename path.
		fullPath = "[" + dsName + "] " + vm.getName() + "/" + volumeName + ".vmdk";

		// Check if the disk already exist on this path.
		if (exists(fullPath, ds)) {
			LOGGER.warn("The disk " + volumeName + " already exist, cant create.");
			exist = true;
			throw new CreateDiskException("The disk " + volumeName + " already exist, cant create.");
		}

		VirtualDisk mainDisk = findVirtualDiskForScsiId(vm, 0);
		VirtualDiskFlatVer2BackingInfo vdMainBackingInfo = (VirtualDiskFlatVer2BackingInfo) mainDisk.getBacking();
		disk = new VirtualDisk();
		Integer scsiId = getFreeUnitNumber(vm);
		if (scsiId > 14 || scsiId == 0) {
			throw new CreateDiskException(
					"No available scsi unit number, please check your vm configuration, cant create the attached disk.");
		}
		disk.setUnitNumber(scsiId);
		disk.setCapacityInKB(size.longValue() * 1024L * 1024L);
		disk.setControllerKey(scsiController.getKey());

		// VirtualDiskFlatVer2BackingInfo
		VirtualDiskFlatVer2BackingInfo backingInfo = new VirtualDiskFlatVer2BackingInfo();
		backingInfo.setDatastore(null);
		backingInfo.setFileName(fullPath);
		// TODO : Attribute on this object, valid values are : persistent,
		// independent_persistent, independent_nonpersistent, nonpersistent,
		// undoable,append
		backingInfo.setDiskMode("persistent");
		backingInfo.setSplit(false);
		backingInfo.setEagerlyScrub(false);
		backingInfo.setThinProvisioned(vdMainBackingInfo.getThinProvisioned());
		backingInfo.setWriteThrough(false);
		disk.setBacking(backingInfo);

		// VirtualDeviceConnectInfo
		VirtualDeviceConnectInfo connectInfo = new VirtualDeviceConnectInfo();
		connectInfo.setAllowGuestControl(false);
		connectInfo.setStartConnected(true);
		connectInfo.setConnected(true);
		disk.setConnectable(connectInfo);

		// Prepare the configuration.
		VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
		diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
		diskSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);
		diskSpec.setDevice(disk);

		VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
		configSpec.setDeviceChange(new VirtualDeviceConfigSpec[] { diskSpec });

		// Launch the task.
		Task task;
		try {
			task = vm.reconfigVM_Task(configSpec);
			task.waitForTask();

		} catch (RemoteException | InterruptedException e) {
			LOGGER.error("Error while creating an attached disk : " + volumeName + " --< to vm : " + vm.getName(), e.getCause());
			throw new CreateDiskException(
					"Error while creating an attached disk : " + volumeName + " --< to vm : " + vm.getName(), e.getCause());
		}

		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				throw new CreateDiskException("Error while creating an attached disk : " + volumeName + " --< to vm : "
						+ vm.getName() + " \n " + fault.detail + "Fault message: " + fault.getMessage() + " --> "
						+ fault.getClass().getName());

			}
		} catch (RemoteException e) {
			throw new CreateDiskException(
					"Error while creating an attached disk : " + volumeName + " --< to vm : " + vm.getName(), e.getCause());
		}

		// Update the vdisk infos.
		vdisk = findVirtualDiskForScsiId(vm, scsiId);
		if (vdisk != null) {
			attached = true;
			exist = true;
			mainVolume = false;
			// Connectable object is null here, custom status....
			volumeState = "connected";
			LOGGER.info("The disk is created and attached.");
		} else {
			LOGGER.warn("Cant reload the disk. Check on vcenter (or with retrieve operation) if the disk is created.");
			volumeState = "error";
			attached = false;
			mainVolume = false;
			exist = false;
		}
	}

	/**
	 * Destroy definitively this volume from datastore and vcenter.
	 */
	public void destroyVolume() throws DeleteDiskException {
		Datacenter dc;
		Datastore ds;
		try {
			ds = loadDatastore();
			dc = loadDatacenter();
		} catch (DatacenterNotFoundException ex) {
			throw new DeleteDiskException(ex);

		} catch (DatastoreNotFoundException ex) {
			throw new DeleteDiskException(ex);
		}

		FileManager fileManager = VCenterClient.getServiceInstance().getFileManager();

		if (fileManager == null) {

			throw new DeleteDiskException(
					"File manager is not supported or you have not the rights to use it, cant destroy the disk "
							+ volumeName);
		}
		if (fullPath == null) {
			try {
				fullPath = findVolumeVMDKPathForName(ds);
			} catch (Exception ex) {
				throw new DeleteDiskException(ex.getMessage(), ex.getCause()); 
			}
		}

		if (fullPath == null) {
			throw new DeleteDiskException("The disk path on vcenter is not found, cant destroy the disk " + volumeName);
		}
		if (!exists(fullPath, ds)) {
			LOGGER.warn("The disk doesnt exist anymore, cant destroy the disk " + volumeName);
			throw new DeleteDiskException("The disk doesnt exist anymore, cant destroy the disk " + volumeName);
		}
		Task task;
		try {
			task = fileManager.deleteDatastoreFile_Task(fullPath, dc);
			task.waitForTask();

		} catch (RemoteException | InterruptedException e) {
			throw new DeleteDiskException("Error while destroying a disk : " + volumeName, e);
		}
		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				throw new DeleteDiskException("Error while destroying a disk : " + volumeName + " --> " + fault.detail
						+ " \n Fault message: " + fault.getMessage() + " fault: " + fault.getClass().getName());
			} else {
				// OK, now destroy the hiding file flat version.
				String flatName = fullPath.substring(0, volumeName.length() - 5) + "-flat.vmdk";
				task = fileManager.deleteDatastoreFile_Task(flatName, dc);
				task.waitForTask();
				taskInfo = task.getTaskInfo();
				if (taskInfo.getState() != TaskInfoState.success) {
					MethodFault fault = taskInfo.getError().getFault();
					throw new DeleteDiskException("Error while destroying a flat disk : " + volumeName + fault.detail
							+ " \n Fault message: " + fault.getMessage() + " fault : " + fault.getClass().getName());
				} else {
					LOGGER.info("The disk " + volumeName + " has been destroyed.");
					volumeState = "deleted";
					exist = false;
					attached = false;
					mainVolume = false;
				}
			}
		} catch (RemoteException | InterruptedException e) {
			throw new DeleteDiskException("Error while destroying a disk : " + volumeName, e);
		}
		LOGGER.info("The disk : " + volumeName + " has been destroyed.");
	}

	/**
	 * Attach the volume to an instance. Dont forget to load virtualDisk object
	 * from vcenter and update vmdk path. if this volume is already attached,
	 * this method does nothing.
	 * 
	 * @throws AttachDiskException
	 */
	public void attachVolume() throws AttachDiskException {
		Datastore ds;
		try {
			ds = loadDatastore();
		} catch (DatastoreNotFoundException ex) {
			throw new AttachDiskException(ex.getMessage(), ex.getCause());
		}

		if (vmName == null) {
			throw new AttachDiskException("No virtual machine name is given for the attachment. Cant attach the disk.");
		}

		if (fullPath == null) {
			try {
				fullPath = findVolumeVMDKPathForName(ds);
			} catch (Exception ex) {
				throw new AttachDiskException(ex.getCause());
			}
		}

		loadVirtualDisk();
		if (attached) {
			throw new AttachDiskException("The disk : " + volumeName + " is already attached on the vm : " + vmName);
		}

		if (fullPath == null) {
			exist = false;
			// Create the disk
			try {
				this.createAttachedVolume();
			} catch (CreateDiskException ex) {
				throw new AttachDiskException(ex.getCause());
			}

		} else {
			// Reuse the disk.

			// Load the virtual machine.
			VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);

			if (vm == null) {
				throw new AttachDiskException("The virtual machine doesnt exist anymore. Cant attach the disk "
						+ volumeName + " on the vm: " + vmName);
			}

			VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();

			VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
			VirtualDeviceConfigSpec[] vdiskSpecArray = { diskSpec };
			vmConfigSpec.setDeviceChange(vdiskSpecArray);

			VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
			diskfileBacking.setFileName(fullPath);
			diskfileBacking.setDiskMode("persistent");

			VirtualSCSIController scsiController = getSCSIController(vm);
			int unitNumber = getFreeUnitNumber(vm);

			VirtualDisk disk = new VirtualDisk();
			disk.setControllerKey(scsiController.getKey());
			disk.setUnitNumber(unitNumber);
			disk.setBacking(diskfileBacking);
			// Unlike required by API ref, the capacityKB is optional. So skip
			// setCapacityInKB() method.
			disk.setKey(-100);

			diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
			diskSpec.setDevice(disk);

			// Launch the service task.
			Task task;
			try {
				task = vm.reconfigVM_Task(vmConfigSpec);
				task.waitForTask();
				TaskInfo taskInfo = task.getTaskInfo();
				if (taskInfo.getState() != TaskInfoState.success) {
					MethodFault fault = taskInfo.getError().getFault();
					throw new AttachDiskException("Error while attaching a disk : " + volumeName + " --> " + fault.detail + " \n Fault message: " + fault.getMessage() + " --< " + fault.getClass().getName());
				} else {
					LOGGER.info("The disk " + volumeName + " is attached.");
					attached = true;
					exist = true;
				}
			} catch (RemoteException | InterruptedException e) {
				throw new AttachDiskException(
						"Error while attaching a disk : " + volumeName + " on virtual machine: " + vmName, e.getCause());
			} 
		}
	}

	/**
	 * Detach this volume from the instance, don't forget to set virtualDisk
	 * object to null and update vmdk path accordingly. If this volume is not
	 * attached, this method does nothing. If this volume is a main volume,
	 * can't detach this volume.
	 */
	public void detachVolume() throws DetachDiskException {
		loadVirtualDisk();

		if (!attached) {
			throw new DetachDiskException("The disk is already detached.");
		}
		// VirtualMachine
		if (vmName == null) {
			attached = false;
			throw new DetachDiskException("The disk is already detached, no vm found for this disk.");
		}
		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
		VirtualMachine machine = VMHelper.findVMForName(rootFolder, vmName);

		loadVirtualDisk();
		if (vdisk == null) {
			attached = false;
			throw new DetachDiskException("The disk is already detached, no virtual disk found for name: " + volumeName
					+ " on virtual machine: " + vmName);
		}

		VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
		diskSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
		// diskSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.destroy);
		diskSpec.setDevice(vdisk);

		VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
		configSpec.setDeviceChange(new VirtualDeviceConfigSpec[] { diskSpec });

		Task task;
		try {
			task = machine.reconfigVM_Task(configSpec);
			task.waitForTask();
			TaskInfo taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				throw new DetachDiskException("Error while detaching a disk : " + volumeName + " --> " + fault.detail + " \n Fault message: " + fault.getMessage());
			} else {
				LOGGER.info("The disk " + volumeName + " has been detached.");
			}
		} catch (RemoteException | InterruptedException e) {
			throw new DetachDiskException(
					"Error while detaching a disk : " + volumeName + " from virtual machine: " + vmName, e.getCause());
		}
		
	}

	/**
	 * Migrate a volume from one datastore to another.
	 */
	public void MigrateVolumeOnAnotherDatastore() {
		// TODO : migrate a volume from origin ds to destination ds. in V2.
	}

	/**
	 * Migrate a volume from one instance vm to another instance vm.
	 */
	public void MigrateVolumeInstanceToAnother() {
		// TODO : migrate a volume from origin instance to destination instance.
		// in V2.
	}

	/**
	 * Extend a disk to a new size capacity.
	 * 
	 * @param newSize
	 *            (in GB).
	 * @return true if extend disk is success. false otherwise.
	 */
	public void resize(Float newSize) throws ResizeDiskException {
		Datacenter dc;
		Datastore ds;
		try {
			ds = loadDatastore();
			dc = loadDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException ex) {
			throw new ResizeDiskException(ex.getMessage(), ex.getCause());
		}
		
		Long sizeKB = newSize.longValue() * 1024 * 1024;
		LOGGER.info("Resizing volume " + volumeName + " to " + sizeKB);

		if (fullPath == null) {
			try {
				fullPath = findVolumeVMDKPathForName(ds);
			} catch (Exception ex) {
				throw new ResizeDiskException(ex.getMessage(), ex.getCause());
			}
			if (fullPath == null) {
				throw new ResizeDiskException("No vmware path found on this volume, cant resize the volume");
			}
		} else {
			LOGGER.debug("Full path: " + fullPath);
		}

		VirtualDiskManager vdiskManager = VCenterClient.getServiceInstance().getVirtualDiskManager();
		if (vdiskManager != null) {
			// Launch the task.
			Task task;
			try {
				task = vdiskManager.extendVirtualDisk_Task(fullPath, dc, sizeKB);
				task.waitForTask();

			} catch (RemoteException | InterruptedException e) {
				throw new ResizeDiskException("Error while resizing a disk : " + volumeName, e.getCause());
			}
			TaskInfo taskInfo;
			try {
				taskInfo = task.getTaskInfo();
				if (taskInfo.getState() != TaskInfoState.success) {

					MethodFault fault = taskInfo.getError().getFault();
					throw new ResizeDiskException("Error while resizing a disk : " + volumeName + " --> " + fault.detail + " \n Fault message: " + fault.getMessage() + " --< " + fault.getClass().getName());
				} else {
					size = newSize;
				}
			} catch (RemoteException e) {
				throw new ResizeDiskException("Error while resizing a disk : " + volumeName, e.getCause());

			}
		} else {
			// Cant use virtualDisk manager.
			loadVirtualDisk();
			if (isAttached() && vdisk != null) {
				vdisk.setCapacityInKB(sizeKB);
				// Load the virtual machine
				Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
				VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);
				VirtualDeviceConfigSpec vdcs = new VirtualDeviceConfigSpec();
				vdcs.setDevice(vdisk);
				vdcs.setOperation(VirtualDeviceConfigSpecOperation.edit);
				VirtualMachineConfigSpec vmcs = new VirtualMachineConfigSpec();
				vmcs.setDeviceChange(new VirtualDeviceConfigSpec[] { vdcs });

				Task task;
				try {
					task = vm.reconfigVM_Task(vmcs);
					task.waitForTask();

				} catch (RemoteException | InterruptedException e) {
					throw new ResizeDiskException("Error while resizing a disk : " + volumeName, e.getCause());
				} 
				TaskInfo taskInfo;
				try {
					taskInfo = task.getTaskInfo();
					if (taskInfo.getState() != TaskInfoState.success) {

						MethodFault fault = taskInfo.getError().getFault();
						throw new ResizeDiskException("Error while resizing a disk : " + volumeName + " --> " + fault.detail + " \n Fault message: " + fault.getMessage() + " --< " + fault.getClass().getName());
					} else {
						size = newSize;
					}
				} catch (RemoteException e) {
					throw new ResizeDiskException("Error while resizing a disk : " + volumeName, e.getCause());
				}

			} else {
				// Volume not attached and cant use virtual disk manager.
				throw new ResizeDiskException(
						"Cant resize the disk, the disk must be attached to a virtual machine or you must have the rights to VirtualDiskManager file operation.");
			}

		}
		LOGGER.info("The disk : " + volumeName + " has been resized to : " + size);
	}

	/**
	 * Rename a disk from volumeName to newVolumeName.
	 * 
	 * @param newVolumeName
	 * @return true if rename operation has succeed.
	 */
	public void renameDisk(final String newVolumeName) throws RenameDiskException {
		
		Datacenter dc;
		Datastore ds;
		try {
			ds = loadDatastore();
			dc = loadDatacenter();
		} catch (DatacenterNotFoundException | DatastoreNotFoundException e) {
			throw new RenameDiskException(e.getMessage(), e.getCause());
			
		} 
		// Check if we must power off the vm, only if the disk is attached..
		if (isAttached()) {
			// Load the vm.
			Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
			VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);
			if (vm != null) {
				if (!vm.getRuntime().getPowerState().equals(VirtualMachinePowerState.poweredOff)) {
					// Power off before.
					try {
						VMHelper.powerOff(vm);
					} catch (RemoteException | InterruptedException ex) {
						throw new RenameDiskException(
								"Cant power off the virtual machine : " + vm.getName() + " to rename a virtual disk.", ex.getCause());
					}

				}
			}
			if (vdisk == null) {
				loadVirtualDisk();
			}

		} // end if isAttached.

		String newPath = "[" + dsName + "] " + vmName + "/" + newVolumeName + ".vmdk";

		LOGGER.debug("Moving disk vmdk : " + fullPath + " --< to: " + newPath);
		Task task;
		try {
			VirtualDiskManager vdiskManager = VCenterClient.getServiceInstance().getVirtualDiskManager();
			task = vdiskManager.moveVirtualDisk_Task(fullPath, dc, newPath, dc, true);
			task.waitForTask();
		} catch (RemoteException | InterruptedException ex) {
			throw new RenameDiskException("Error while renaming a disk : " + volumeName + " to: " + newVolumeName, ex.getCause());
		}
		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {

				MethodFault fault = taskInfo.getError().getFault();
				throw new RenameDiskException("Error while renaming a disk : " + volumeName + " to: " + newVolumeName + " --> " + fault.detail + " \n Fault message: " + fault.getMessage() + " fault:" + fault.getClass().getName());
				
			} else {
				volumeName = newVolumeName;
				fullPath = newPath;
			}
		} catch (RemoteException e) {
			throw new RenameDiskException("Error while renaming a disk : " + volumeName, e.getCause());
		}
		LOGGER.info("The disk : " + volumeName + " has been renamed.");
	}

	/**
	 * Get the uuid of this disk (vmware value).
	 * 
	 * @return
	 */
	public String getUUID() throws RemoteException {
		String uuid = "unknwown";
		Datacenter dc;
		try {
			dc = loadDatacenter();
		} catch (DatacenterNotFoundException ex) {
			LOGGER.error(ex.getMessage());
			return null;
		}
		VirtualDiskManager virtDiskMgr = VCenterClient.getServiceInstance().getVirtualDiskManager();
		
		uuid = virtDiskMgr.queryVirtualDiskUuid(fullPath, dc);
		
		return uuid;
	}

	// Utility methods.

	/**
	 * Create a directory for the volume management.
	 * 
	 * @param dc
	 * @param ds
	 * @param destFolder
	 * @return
	 * @throws IOException
	 */
	private static boolean mkdir(final Datacenter dc, final Datastore ds, String destFolder) throws IOException {
		String dsName = ds.getName();
		destFolder = "[" + dsName + "]" + destFolder;

		FileManager fileManager = VCenterClient.getServiceInstance().getFileManager();

		if (fileManager == null) {
			LOGGER.warn("File manager is not available on this vcenter server !");
			LOGGER.warn("Cant create the directory " + destFolder + " on datastore : " + dsName);
			return false;
		}

		if (!exists(destFolder, ds)) {
			LOGGER.info("Creating directory : " + destFolder);
			fileManager.makeDirectory(destFolder, dc, true);
			return true;
		}
		LOGGER.warn("Directory : " + destFolder + " could not be created because it already exists");
		return false;
	}

	/**
	 * Find a volume full path for the volume name in datastore.
	 * 
	 * @param ds
	 * @param volumeName
	 *            (ex: data1)
	 * @return the full path like "[datastore1] /datavm1/data1.vmdk", may return
	 *         null if no volume is found.
	 */
	private String findVolumeVMDKPathForName(Datastore ds) throws RemoteException, InterruptedException {
		String fullPath = null;

		String basePath = null;

		VmDiskFileQueryFilter vdiskFilter = new VmDiskFileQueryFilter();
		// default is SCSI.
		vdiskFilter.setControllerType(new String[] { controllerType }); 
		VmDiskFileQuery fQuery = new VmDiskFileQuery();
		fQuery.setFilter(vdiskFilter);

		HostDatastoreBrowserSearchSpec searchSpec = new HostDatastoreBrowserSearchSpec();
		searchSpec.setQuery(new FileQuery[] { fQuery });
		searchSpec.setMatchPattern(new String[] { volumeName + ".vmdk" }); // ".*"

		FileQueryFlags fqf = new FileQueryFlags();
		fqf.setFileSize(true);
		fqf.setModification(true);
		fqf.setFileOwner(true);
		fqf.setFileType(true);

		searchSpec.setDetails(fqf);

		Task subFolderTask = ds.getBrowser().searchDatastoreSubFolders_Task("[" + dsName + "]", searchSpec);
		subFolderTask.waitForTask();
		TaskInfo tInfo = subFolderTask.getTaskInfo();
		ArrayOfHostDatastoreBrowserSearchResults searchResult = (ArrayOfHostDatastoreBrowserSearchResults) tInfo
				.getResult();
		HostDatastoreBrowserSearchResults[] results = null;
		if (searchResult == null) {
			return null;
		}
		results = searchResult.getHostDatastoreBrowserSearchResults();

		if (results == null) {
			return null;
		}
		int len = searchResult.getHostDatastoreBrowserSearchResults().length;

		for (int j = 0; j < len; j++) {
			HostDatastoreBrowserSearchResults sres = searchResult.HostDatastoreBrowserSearchResults[j];
			basePath = sres.getFolderPath();
			FileInfo[] fileArray = sres.getFile();
			if (fileArray == null) {
				continue;
			}

			for (FileInfo fileInfo : fileArray) {
				fullPath = basePath + fileInfo.getPath();
				// Real size on datastore.
				// File info is in bytes not kilo !!!
				size = fileInfo.getFileSize().floatValue() / (1024 * 1024 * 1024);
				modifiedDate = fileInfo.getModification();
				break;
			}
		}

		return fullPath;
	}

	/**
	 * Utility method, check if a folder exist or a path on the datastore.
	 * 
	 * @param path
	 * @param ds
	 * @return
	 * @throws IOException
	 */
	private static boolean exists(String path, Datastore ds) {
		// works for both files and folders
		String basePath = "[" + ds.getName() + "]";
		if (!path.contains(basePath)) {
			path = "[" + ds.getName() + "]" + path;
		}
		HostDatastoreBrowser hdb = ds.getBrowser();

		String[] splitPath = path.split("/");
		String fileName = splitPath[splitPath.length - 1];
		String folder = path.substring(0, path.length() - fileName.length());
		HostDatastoreBrowserSearchSpec fileSearchSpec = new HostDatastoreBrowserSearchSpec();
		fileSearchSpec.setMatchPattern(new String[] { fileName });

		try {
			Task task = hdb.searchDatastore_Task(folder, fileSearchSpec);
			task.waitForTask();
			HostDatastoreBrowserSearchResults searchResults = (HostDatastoreBrowserSearchResults) task.getTaskInfo()
					.getResult();
			if (searchResults == null) {
				return false;
			}
			FileInfo[] fileInfo = searchResults.getFile();
			return (fileInfo != null && fileInfo.length > 0);
		} catch (com.vmware.vim25.FileNotFound ex) {
			// normal case
		} catch (Exception ex) {
			LOGGER.error("Exception while testing if " + path + " exists ", ex);
		}

		return false;
	}

	/**
	 * Find a virtual disk for a scsiId.
	 * 
	 * @param vm
	 * @param scsiId
	 * @return a virtual disk for this scsiId, if none found return null.
	 */
	private VirtualDisk findVirtualDiskForScsiId(VirtualMachine vm, Integer scsiId) {
		VirtualSCSIController scsiController = getSCSIController(vm);
		VirtualDisk disk = null;
		for (VirtualDevice device : vm.getConfig().getHardware().getDevice()) {
			if (device instanceof VirtualDisk) {
				VirtualDisk tmpDisk = (VirtualDisk) device;
				if (tmpDisk.getControllerKey() != null && tmpDisk.getControllerKey().equals(scsiController.getKey())) {
					if (tmpDisk.getUnitNumber() != null && tmpDisk.getUnitNumber().equals(scsiId)) {
						disk = tmpDisk;
						break;
					}
				}
			}
		}
		return disk;
	}

	/**
	 * Get the first scsi controller on bus 0.
	 * 
	 * @param vm
	 * @return a virtual scsi controller (bus 0), if none, return null.
	 */
	private VirtualSCSIController getSCSIController(VirtualMachine vm) {
		// Search for the first scsi controller bus unit = 0.
		VirtualSCSIController scsiController = null;
		for (VirtualDevice device : vm.getConfig().getHardware().getDevice()) {
			if (device instanceof VirtualSCSIController) {
				VirtualSCSIController scsiController2 = (VirtualSCSIController) device;
				if (scsiController2.getBusNumber() == 0) {
					scsiController = scsiController2;
					break;
				}
			}
		}
		if (scsiController == null) {
			LOGGER.warn("No scsi controller found on this instance : " + vm.getName());
		}
		return scsiController;
	}

	/**
	 * Get a free unit number on the vm scsi controller.
	 * 
	 * @param vm
	 * @return
	 */
	private Integer getFreeUnitNumber(VirtualMachine vm) {
		Integer scsiId = 0;
		VirtualSCSIController scsiController = getSCSIController(vm);
		VirtualDisk disk = null;
		for (VirtualDevice device : vm.getConfig().getHardware().getDevice()) {
			if (device instanceof VirtualDisk) {
				VirtualDisk tmpDisk = (VirtualDisk) device;
				if (tmpDisk.getControllerKey() != null && tmpDisk.getControllerKey().equals(scsiController.getKey())) {
					// Search for a unit number free, get the last one and
					// increment. (max 13).
					if (tmpDisk.getUnitNumber() > scsiId) {
						scsiId = tmpDisk.getUnitNumber();
					}
				}
			}
		}
		scsiId = scsiId + 1;
		if (scsiId > 13) {
			LOGGER.warn("No scsi unit number is available !!!");
		}
		return scsiId;
	}

	/**
	 * Load a datastore from rootFolder.
	 * 
	 * @return a datastore object, if not found a
	 *         {@link DatastoreNotFoundException} is thrown.
	 * @throws DatastoreNotFoundException
	 */
	private Datastore loadDatastore() throws DatastoreNotFoundException {
		if (dsName == null) {
			throw new DatastoreNotFoundException("Datastore name is not set, cant locate a datastore by its name.");
		}
		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
		Datastore ds = DatastoreHelper.findDatastoreForName(rootFolder, dsName);
		if (ds == null) {
			throw new DatastoreNotFoundException();
		}
		return ds;
	}

	/**
	 * Load a datacenter object from rootFolder and datastore name.
	 * 
	 * @return a datacenter object, if not found a
	 *         {@link DatacenterNotFoundException} is thrown (or if datastore
	 *         name is null).
	 * @throws DatacenterNotFoundException
	 */
	private Datacenter loadDatacenter() throws DatacenterNotFoundException {
		if (dsName == null) {
			throw new DatacenterNotFoundException(
					"Datastore name is not set, cant locate datacenter from datastore name.");
		}
		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
		Datacenter dc = DatacenterHelper.findDatacenterFromDatastore(rootFolder, dsName);
		if (dc == null) {
			throw new DatacenterNotFoundException("Cant locate datacenter from datastore name: " + dsName);
		}

		return dc;
	}

	// Getters and setters.

	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getMountPoint() {
		return mountPoint;
	}

	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}

	public boolean isMainVolume() {
		return mainVolume;
	}

	public void setMainVolume(boolean mainVolume) {
		this.mainVolume = mainVolume;
	}

	public String getVolumeState() {
		return volumeState;
	}

	public void setVolumeState(String volumeState) {
		this.volumeState = volumeState;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	public boolean isAttached() {
		return attached;
	}

	public void setAttached(boolean attached) {
		this.attached = attached;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public Calendar getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Calendar modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
