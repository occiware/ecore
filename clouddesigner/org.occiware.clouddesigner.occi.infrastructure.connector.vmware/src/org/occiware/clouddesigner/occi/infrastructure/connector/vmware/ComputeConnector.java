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
import java.rmi.RemoteException;
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
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.Architecture;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.MountVMWareToolsDiskException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.ClusterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.HostHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.NetworkHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.EntityUtils;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.EntityUtilsHeadless;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread.UIDialog;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineGuestOsIdentifier;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ResourcePool;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://schemas.ogf.org/occi/infrastructure# - term: compute - title: Compute
 * Resource
 */
public class ComputeConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

	private static final String ATTR_HOSTSYSTEM_NAME = "hostsystemname";
	private static final String ATTR_DATACENTER_NAME = "datacentername";
	private static final String ATTR_DATASTORE_NAME = "datastorename";
	private static final String ATTR_CLUSTER_NAME = "clustername";

	private static final String ATTR_IMAGE_NAME = "imagename";
	private static final String ATTR_VCPU_NUMBER = "vcpu";
	private static final String ATTR_VM_GUEST_STATE = "gueststate";
	private static final String ATTR_MARKED_AS_TEMPLATE = "markedastemplate";
	private static final String ATTR_VM_GUEST_OS_ID = "guestosid";
	private static final String ATTR_VM_EPHEMERAL_DISK_SIZE_GB = "occi.compute.ephemeral_storage.size"; 
	private static final String VMWARE_MIXIN_FOLDERS_TERM = "vmwarefolders";
	private static final String VMWARE_MIXIN_VM_ADDON_TERM = "vmaddon";
	
	/**
	 * Managed object reference id. Unique reference for virtual machine.
	 */
	private String morId;

	/**
	 * Define VMWare specifications for this compute.
	 */
	protected VirtualMachineConfigSpec vmSpec = null;

	private String datacenterName = null;
	private String datastoreName = null;
	private String clusterName = null;
	/**
	 * Represent the physical compute which be used for host this virtual
	 * machine.
	 */
	private String hostSystemName = null;

	private String vmOldName = null;
	private String vmTemplateName = null;
	private String vcpusStr = "0";
	private Integer vcpus = 0;
	private Integer numCores;
	private Float memoryGB;
	private String architecture;
	private Float speed;
	private String vmState = null;
	private String hostname = null;
	private String vmGuestState = null;
	private String guestOsId = null;
	private String markedAsTemplate = null;
	private boolean vmExist = false;
	// default to 15GB
	private Float ephemeralDiskSizeGB = 15.0f;
	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	private boolean toCreateOnStartOperation = false;
	
	
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector() {
		LOGGER.debug("Constructor called on " + this);

	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Compute instance is completely created.
	 */
	@Override
	public void occiCreate() {
		titleMessage = "Create a virtual machine : " + getTitle();
		LOGGER.debug("occiCreate() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					createCompute(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					createCompute(monitor);
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
	 * Called when this Compute instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		titleMessage = "Retrieve a virtual machine : " + getTitle();

		LOGGER.debug("occiRetrieve() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			LOGGER.debug("Console mode.");
			
			// Retrieve a compute without monitoring on the main thread.
			retrieveCompute(null);

			// UIDialog.executeActionThread(runnable, titleMessage);
			
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			LOGGER.debug("UI mode.");
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					retrieveCompute(monitor);
				}
			};
			UIDialog.executeActionThread(runnableWithProgress, titleMessage);
			if (globalMessage != null && !globalMessage.isEmpty()) {
				UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
			}
			if (!vmExist) {
				vmState = VMHelper.POWER_OFF;
			}
			updateAttributesOnCompute();

		}
		
		
		
		globalMessage = "";
		levelMessage = null;

	}

	/**
	 * Called when this Compute instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		titleMessage = "Update a virtual machine : " + getTitle();
		LOGGER.debug("occiUpdate() called on " + this);

		if (UIDialog.isStandAlone()) {
			// headless mode.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					updateCompute(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {

			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					updateCompute(monitor);
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

		if (globalMessage != null && !globalMessage.isEmpty()) {
			UIDialog.showUserMessage(titleMessage, globalMessage, levelMessage);
		}
		globalMessage = "";
		levelMessage = null;

	}

	/**
	 * Called when this Compute instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		titleMessage = "Delete a virtual machine : " + getTitle();
		LOGGER.debug("occiDelete() called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					deleteCompute(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);

		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					deleteCompute(monitor);
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
	// Compute actions.
	//

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: start
	 * - title: Start the system
	 */
	@Override
	public void start() {
		titleMessage = "Power on a virtual machine : " + getTitle();
		LOGGER.debug("Action start() called on " + this);
		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					startCompute(null);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					startCompute(monitor);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

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

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: stop -
	 * title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final org.occiware.clouddesigner.occi.infrastructure.StopMethod method) {
		titleMessage = "Power off a virtual machine : " + getTitle();
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					stopCompute(null, method);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					stopCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

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

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term:
	 * restart - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final org.occiware.clouddesigner.occi.infrastructure.RestartMethod method) {
		titleMessage = "Reboot a virtual machine : " + getTitle();
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					restartCompute(null, method);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					restartCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

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

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term:
	 * suspend - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final org.occiware.clouddesigner.occi.infrastructure.SuspendMethod method) {

		titleMessage = "Suspend a virtual machine : " + getTitle();
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					suspendCompute(null, method);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					suspendCompute(monitor, method);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

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

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: save -
	 * title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final org.occiware.clouddesigner.occi.infrastructure.SaveMethod method,
			final java.lang.String name) {

		titleMessage = "Save a virtual machine : " + getTitle();
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		if (UIDialog.isStandAlone()) {
			// Launching thread with business code.
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					saveCompute(null, method, name);
				}
			};
			UIDialog.executeActionThread(runnable, titleMessage);
		} else {
			// Launching IRunnableWithProgress UI thread with business code.
			IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					saveCompute(monitor, method, name);
				}
			};

			UIDialog.executeActionThread(runnableWithProgress, titleMessage);

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

	/**
	 * Get the datacenter name.
	 * 
	 * @return
	 */
	public String getDatacenterName() {
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
	 * Get the datastore name.
	 * 
	 * @return
	 */
	public String getDatastoreName() {

		return datastoreName;
	}

	/**
	 * set the datastore name.
	 * 
	 * @return
	 */
	public void setDatastoreName(String datastoreName) {
		this.datastoreName = datastoreName;
	}

	/**
	 * get cluster name.
	 * 
	 * @return
	 */
	public String getClusterName() {
		return clusterName;
	}

	/**
	 * Set the cluster name.
	 * 
	 * @return
	 */
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getHostSystemName() {
		return hostSystemName;
	}

	public void setHostSystemName(String hostSystemName) {
		this.hostSystemName = hostSystemName;

	}

	// /**
	// * Get Main storage link (link on main disk).
	// *
	// * @return if a main storage is present return the main storagelink, if
	// none
	// * null value is returned.
	// */
	// private StoragelinkConnector getMainStorageLink() {
	//
	// List<StoragelinkConnector> storageLinks = getLinkedStorages();
	// StoragelinkConnector mainStorageLink = null;
	//
	// int storageLinkSize = storageLinks.size();
	// StorageConnector storageConnector;
	// // Detect where's the main disk.
	// for (StoragelinkConnector stLink : storageLinks) {
	// if (storageLinkSize == 1) {
	// mainStorageLink = stLink;
	// break;
	// } else if ((stLink.getMountpoint() != null &&
	// (stLink.getMountpoint().equals("/")
	// || stLink.getMountpoint().startsWith("C:") ||
	// stLink.getMountpoint().startsWith("c:")))) {
	// mainStorageLink = stLink;
	// break;
	// } else {
	// // Detect if the storage name finished by _1. ex:
	// // serverstorage_1.
	// if (stLink.getTarget() != null && stLink.getTarget() instanceof
	// StorageConnector) {
	// storageConnector = (StorageConnector) stLink.getTarget();
	// if (storageConnector.getTitle().endsWith("_1")) {
	// mainStorageLink = stLink;
	// break;
	// }
	// }
	// }
	// }
	//
	// return mainStorageLink;
	// }

	// /**
	// * Get the other storageLinks, if none empty list is returned.
	// *
	// * @return a list of storageLinkConnector if other storagelink found (not
	// * the main storageLink).
	// */
	// private List<StoragelinkConnector> getOtherStorageLink() {
	//
	// List<StoragelinkConnector> storageLinks = getLinkedStorages();
	// List<StoragelinkConnector> stOthers = new
	// ArrayList<StoragelinkConnector>();
	// StoragelinkConnector stMain = getMainStorageLink();
	// StoragelinkConnector stOther = null;
	// for (StoragelinkConnector link : storageLinks) {
	// if (stMain != null) {
	// stOther = (StoragelinkConnector) link;
	// if (!stOther.equals(stMain)) {
	// stOthers.add(stOther);
	// }
	// } else {
	// // St main is null, return all the storagelinks.
	// stOthers.add(link);
	// }
	// }
	// return storageLinks;
	// }

	/**
	 * Define the corresponding status from VMWare power state.
	 * 
	 * @param vmwarePowerState
	 * @return
	 */
	private ComputeStatus defineStatus(final String vmwarePowerState) {
		ComputeStatus status = this.getState();
		int power = 0;
		if (vmwarePowerState != null) {
			if (vmwarePowerState.equals(VMHelper.POWER_OFF)) {
				power = VMHelper.POWER_OFF_INT;
			} else if (vmwarePowerState.equals(VMHelper.POWER_ON)) {
				power = VMHelper.POWER_ON_INT;
			} else if (vmwarePowerState.equals(VMHelper.SUSPENDED)) {
				power = VMHelper.SUSPENDED_INT;
			}

			switch (power) {
			case VMHelper.POWER_ON_INT:
				status = ComputeStatus.ACTIVE;
				LOGGER.info("vm status is active.");

				break;
			case VMHelper.POWER_OFF_INT:
				status = ComputeStatus.INACTIVE;
				LOGGER.info("vm status is inactive");
				break;
			case VMHelper.SUSPENDED_INT:
				status = ComputeStatus.SUSPENDED;
				LOGGER.info("vm status is suspended.");

				break;
			default:
				status = ComputeStatus.ERROR;
				LOGGER.info("vm status error.");
			}
		}

		return status;

	}

	/**
	 * Get the linked storages.
	 * 
	 * @return a list of storagelink or empty if none.
	 */
	private List<StoragelinkConnector> getLinkedStorages() {
		List<StoragelinkConnector> storages = new ArrayList<StoragelinkConnector>();

		List<Link> links = this.getLinks();
		for (Link link : links) {
			if (link instanceof StoragelinkConnector) {
				StoragelinkConnector storage = (StoragelinkConnector) link;
				storages.add(storage);
			}
		}

		return storages;
	}

	/**
	 * Get the network interfaces from designer.
	 * 
	 * @return a list of interfaces or empty if none.
	 */
	private List<NetworkinterfaceConnector> getNetworkInterfaces() {
		List<NetworkinterfaceConnector> interfaces = new ArrayList<NetworkinterfaceConnector>();

		List<Link> links = this.getLinks();
		for (Link link : links) {
			if (link instanceof NetworkinterfaceConnector) {
				NetworkinterfaceConnector adapter = (NetworkinterfaceConnector) link;
				interfaces.add(adapter);
			}
		}

		return interfaces;
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
	 * Allocate vcpus et nb core per socket.
	 */
	private void assignVCpuToVMSpec() {
		int nbCore = this.getCores();
		vcpus = 0;
		vcpusStr = this.getAttributeValueByOcciKey(ATTR_VCPU_NUMBER);
		if (vcpusStr != null && !vcpusStr.trim().isEmpty()) {
			try {
				vcpus = Integer.valueOf(vcpusStr);
			} catch (NumberFormatException ex) {
				LOGGER.error("Vcpu is not a number, please set the attribute to an integer value.");
				vcpus = 1;
			}
		}
		if (vcpus == 0) {
			vcpus = this.getCores();
		}

		if (nbCore < 2) {
			if (vcpus == 0) {
				vmSpec.setNumCPUs(1);
				vmSpec.setNumCoresPerSocket(1);
			} else {
				vmSpec.setNumCPUs(vcpus);
				vmSpec.setNumCoresPerSocket(vcpus);
			}

		} else {
			if (vcpus == 0) {
				vcpus = nbCore;
			}
			vmSpec.setNumCPUs(vcpus);
			vmSpec.setNumCoresPerSocket(vcpus / nbCore);
		}

	}

	/**
	 * Get the first network where possible. (ex: eth0)
	 * 
	 * @param netInterfaceConn
	 * @return the first network connector (vSwitch),
	 */
	private NetworkConnector getFirstAdapterNetwork(List<NetworkinterfaceConnector> netInterfaceConn) {

		NetworkConnector netConn = null;

		for (NetworkinterfaceConnector netInt : netInterfaceConn) {
			String netSysInterface = netInt.getInterface();
			String netIntName = netInt.getTitle();
			if (netSysInterface != null) {
				if (netInt.getInterface().equals("eth0")) {
					netConn = (NetworkConnector) netInt.getTarget();
					break;
				}
				if (netIntName != null) {
					if (netIntName.contains("Adaptateur réseau 1") || netIntName.contains("Network adapter 1")) {
						Resource res = netInt.getTarget();
						if (res != null && res instanceof NetworkConnector) {
							netConn = (NetworkConnector) res;
							break;
						}
					}
				}
			}

		}
		if (netConn == null) {
			// Get only the first adapter found on list.
			for (NetworkinterfaceConnector netInt : netInterfaceConn) {
				Resource res = netInt.getTarget();
				if (res != null && res instanceof NetworkConnector) {
					netConn = (NetworkConnector) res;
					break;
				}
			}
		}

		return netConn;
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

	public String getVmOldName() {
		return vmOldName;
	}

	public void setVmOldName(String vmOldName) {
		this.vmOldName = vmOldName;
	}

	public String getVmTemplateName() {
		return vmTemplateName;
	}

	public void setVmTemplateName(String vmTemplateName) {
		this.vmTemplateName = vmTemplateName;
	}

	public String getVcpusStr() {
		return vcpusStr;
	}

	public void setVcpusStr(String vcpusStr) {
		this.vcpusStr = vcpusStr;
	}

	public Integer getVcpus() {
		return vcpus;
	}

	public void setVcpus(Integer vcpus) {
		this.vcpus = vcpus;
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
	 * Check if this compute has mixin vmware compute addon.
	 * 
	 * @return
	 */
	public boolean hasMixinVMwareComputeAddOn() {
		boolean result = false;
		String mixinTerm = null;
		List<Mixin> mixins = this.getMixins();
		for (Mixin mixin : mixins) {
			mixinTerm = mixin.getTerm();
			if (mixinTerm.equals(VMWARE_MIXIN_VM_ADDON_TERM)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Check if this compute has mixin vmware ephemral addon (crtp).
	 * 
	 * @return
	 */
	public boolean hasMixinEphemeral() {
		boolean result = false;
		String mixinTerm = null;
		List<Mixin> mixins = this.getMixins();
		for (Mixin mixin : mixins) {
			mixinTerm = mixin.getTerm();
			// Linked to crtp extension of infrastructure extension.
			if (mixinTerm.equals("small") || mixinTerm.equals("medium") || mixinTerm.equals("large")
					|| mixinTerm.startsWith("mem_")) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Update this object attributes.
	 */
	public void updateAttributesOnCompute() {
		Map<String, String> attrsToCreate = new HashMap<>();
		Map<String, String> attrsToUpdate = new HashMap<>();
		List<String> attrsToDelete = new ArrayList<>();

		boolean hasMixinFoldersData = hasMixinVMwareFolders();
		boolean hasMixinVMwareComputeAddOn = hasMixinVMwareComputeAddOn();
		// For disk ephemeral storage mandatory here to create a vm with a fixed
		// system storage, elsewhere the ephemeral will be 15.0GB.
		boolean hasMixinEphemeral = hasMixinEphemeral();

		// ATTR_DATACENTER_NAME
		if (datacenterName != null && hasMixinFoldersData) {
			if (this.getAttributeStateObject(ATTR_DATACENTER_NAME) == null) {
				attrsToCreate.put(ATTR_DATACENTER_NAME, datacenterName);
			} else {
				// update
				attrsToUpdate.put(ATTR_DATACENTER_NAME, datacenterName);
			}
		}
		if (datastoreName != null && hasMixinFoldersData) {
			// ATTR_DATASTORE_NAME
			if (this.getAttributeStateObject(ATTR_DATASTORE_NAME) == null) {
				attrsToCreate.put(ATTR_DATASTORE_NAME, datastoreName);
			} else {
				attrsToUpdate.put(ATTR_DATASTORE_NAME, datastoreName);
			}
		}

		// ATTR_CLUSTER_NAME
		if (clusterName != null && hasMixinFoldersData) {
			if (this.getAttributeStateObject(ATTR_CLUSTER_NAME) == null) {
				attrsToCreate.put(ATTR_CLUSTER_NAME, clusterName);
			} else {
				attrsToUpdate.put(ATTR_CLUSTER_NAME, clusterName);
			}
		}
		// ATTR_HOSTSYSTEM_NAME
		if (hostSystemName != null && hasMixinFoldersData) {
			if (this.getAttributeStateObject(ATTR_HOSTSYSTEM_NAME) == null) {
				attrsToCreate.put(ATTR_HOSTSYSTEM_NAME, hostSystemName);
			} else {
				attrsToUpdate.put(ATTR_HOSTSYSTEM_NAME, hostSystemName);
			}
		}

		// ATTR_IMAGE_NAME
		if (vmTemplateName != null && hasMixinVMwareComputeAddOn) {
			if (this.getAttributeStateObject(ATTR_IMAGE_NAME) == null) {
				attrsToCreate.put(ATTR_IMAGE_NAME, vmTemplateName);
			} else {
				attrsToUpdate.put(ATTR_IMAGE_NAME, vmTemplateName);
			}
		}

		// ATTR_VCPU_NUMBER
		if (vcpus != 0 && hasMixinVMwareComputeAddOn) {
			if (this.getAttributeStateObject(ATTR_VCPU_NUMBER) == null) {
				attrsToCreate.put(ATTR_VCPU_NUMBER, vcpus.toString());
			} else {
				attrsToUpdate.put(ATTR_VCPU_NUMBER, vcpus.toString());
			}
		}
		// ATTR_VM_GUEST_STATE
		if (vmGuestState != null && hasMixinVMwareComputeAddOn) {
			if (this.getAttributeStateObject(ATTR_VM_GUEST_STATE) == null) {
				attrsToCreate.put(ATTR_VM_GUEST_STATE, vmGuestState);
			} else {
				attrsToUpdate.put(ATTR_VM_GUEST_STATE, vmGuestState);
			}
		}
		// ATTR_VM_GUEST_OS_ID
		if (guestOsId != null && hasMixinVMwareComputeAddOn) {
			if (this.getAttributeStateObject(ATTR_VM_GUEST_OS_ID) == null) {
				attrsToCreate.put(ATTR_VM_GUEST_OS_ID, guestOsId);
			} else {
				attrsToUpdate.put(ATTR_VM_GUEST_OS_ID, guestOsId);
			}
		}

		if (markedAsTemplate == null) {
			markedAsTemplate = "false";
		}
		if (hasMixinVMwareComputeAddOn) {
			if (this.getAttributeStateObject(ATTR_MARKED_AS_TEMPLATE) == null) {
				attrsToCreate.put(ATTR_MARKED_AS_TEMPLATE, markedAsTemplate);
			} else {
				attrsToUpdate.put(ATTR_MARKED_AS_TEMPLATE, markedAsTemplate);
			}
		}

		if (hasMixinEphemeral) {
			if (this.getAttributeStateObject(ATTR_VM_EPHEMERAL_DISK_SIZE_GB) == null) {
				attrsToCreate.put(ATTR_VM_EPHEMERAL_DISK_SIZE_GB, "" + ephemeralDiskSizeGB);
			} else {
				attrsToCreate.put(ATTR_VM_EPHEMERAL_DISK_SIZE_GB, "" + ephemeralDiskSizeGB);
			}
		}
		
		// if (!attrsToCreate.isEmpty() || !attrsToUpdate.isEmpty() || !attrsToDelete.isEmpty()) {
			// Update the attributes via a transaction (or not if standalone).
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				EntityUtilsHeadless.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
				
			} else {
				// Gui environment
				EntityUtils.updateAttributes(this, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
		// }

		if (architecture != null) {
			if (architecture.equals("x64")) {
				setArchitecture(Architecture.X64);
			} else {
				setArchitecture(Architecture.X86);
			}
		}
		if (numCores != null) {
			setCores(numCores);
		}
		if (memoryGB != null) {
			setMemory(memoryGB);
		}
		if (speed != null) {
			setSpeed(speed);
		}
		if (vmState != null) {
			setState(defineStatus(vmState));
		}
		if (hostname != null) {
			setHostname(hostname);
		}
	}

	/**
	 * Get the storages resources without links and those have their title
	 * equals to this compute title. Used only when no storage linked and
	 * there's no main disk found when creating a new virtual machine.
	 * 
	 * @return
	 */
	public List<StorageConnector> getStorageNotLinked() {
		List<StorageConnector> stConnectors = new ArrayList<>();
		Configuration config = OcciHelper.getConfiguration(this);
		List<Resource> resources = config.getResources();

		for (Resource res : resources) {
			if (res instanceof StorageConnector && res.getLinks().isEmpty()
					&& res.getTitle().contains(this.getTitle())) {
				stConnectors.add((StorageConnector) res);
			}
		}
		return stConnectors;
	}

	/**
	 * Business code for creating a compute.
	 * 
	 * @param monitor
	 */
	public void createCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		AllocatorImpl allocator = new AllocatorImpl(rootFolder);

		String vmName = getTitle();
		vmOldName = vmName;
		HostSystem host = null;
		ClusterComputeResource cluster = null;

		if (vmName == null) {
			globalMessage = "Cant create a new virtual machine, the vm name is not set (check title attribute). ";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}

		// Check if this vm already exist if this is the case, we
		// retrieve his
		// value but no other things to create.....

		if (VMHelper.isVMExistForName(rootFolder, vmName)) {
			globalMessage = "VM : " + vmName + " already exist. Cant create.";
			levelMessage = Level.ERROR;
			LOGGER.warn(globalMessage);
			return;
		}
		
		

		// Get the list of linked network adapters, by this we get the
		// network
		// vSwitch, if none declared we allocate an available network,
		// if none
		// we create the network.
		List<NetworkinterfaceConnector> netInterfaceConn = getNetworkInterfaces();

		// Same for storage we get the storage links.
		List<StoragelinkConnector> storageLinks = getLinkedStorages();
		
		// Template or not ?
		vmTemplateName = getAttributeValueByOcciKey(ATTR_IMAGE_NAME);
		boolean hasTemplate = (vmTemplateName != null && !vmTemplateName.trim().isEmpty());
		
		// Check if we create the virtual machine on start operation.
		
		if (!toCreateOnStartOperation && !hasTemplate) {
			// check if we have no networkinterface connected, if this is the case we check if a network is in the configuration space.
			if (netInterfaceConn.isEmpty()) {
				// Check if network is on configuration object.
				Configuration config = OcciHelper.getConfiguration(this);
				if (config != null) {
					List<Resource> resources = config.getResources();
					for (Resource resource : resources) {
						if (resource instanceof NetworkConnector) {
							
							toCreateOnStartOperation = true;
							globalMessage = "Network detected on this configuration, for creating this vm, you must use start operation, no network adapter found for this vm.";
							levelMessage = Level.WARN; 
							LOGGER.warn(globalMessage);
							return;
						}
					}
				}
			}
		} else {
			toCreateOnStartOperation = false;
		}

		guestOsId = getAttributeValueByOcciKey(ATTR_VM_GUEST_OS_ID);
		if (guestOsId != null && guestOsId.trim().isEmpty()) {
			guestOsId = null;
		}

		// For now, we set manually attributes for datacenterName,
		// datastoreName
		// and clusterName.
		for (AttributeState attrState : getAttributes()) {

			String attrName = attrState.getName();
			String attrValue = attrState.getValue();
			if (attrValue != null && attrValue.trim().isEmpty()) {
				attrValue = null;
			}
			if (attrName.equals(ATTR_DATACENTER_NAME)) {
				setDatacenterName(attrValue);
			}
			if (attrName.equals(ATTR_CLUSTER_NAME)) {
				setClusterName(attrValue);
			}
			if (attrName.equals(ATTR_HOSTSYSTEM_NAME)) {
				setHostSystemName(attrValue);
			}
			if (attrName.equals(ATTR_DATASTORE_NAME)) {
				setDatastoreName(attrValue);
			}

		}
		if (toMonitor) {
			subMonitor.worked(30);
		}
		// Datacenter part. first objects of the tree.
		Datacenter datacenter = DatacenterHelper.findDatacenterForName(rootFolder, getDatacenterName());
		if (datacenter == null) {
			// Allocate automaticly the datacenter, if no datacenter
			// found, a
			// default datacenter will be created.
			datacenter = allocator.allocateDatacenter();
			if (datacenter == null) {
				globalMessage = "Cant allocate a datacenter, cause : no available datacenter to allocate.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		} else {
			allocator.setDc(datacenter);
		}

		setDatacenterName(datacenter.getName());

		cluster = ClusterHelper.findClusterForName(datacenter, getClusterName());
		if (cluster == null) {
			// Assign a cluster that already exist, if none found, no
			// cluster.
			cluster = allocator.allocateCluster();
		}
		if (cluster == null) {
			globalMessage = "cant allocate a cluster --< No cluster available on datacenter : " + datacenter.getName();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		} else {
			setClusterName(cluster.getName());
		}
		// Detect the hostsystem for deploying this virtual machine on.
		try {
			host = HostHelper.findHostSystemForName(datacenter.getHostFolder(), getHostSystemName());
		} catch (RemoteException ex) {
			globalMessage = "Error while searching host folder. \n ";
			globalMessage += "Message: " + ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (host == null) {
			if (getHostSystemName() == null) {
				host = allocator.allocateHostSystem();
				if (host == null) {
					globalMessage = "cant allocate automatically an hostsystem, cause: there's no available host on the datacenter: "
							+ datacenter.getName();
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}
			} else {
				// Error on allocating the hostsystem.
				globalMessage = "cant allocate the hostSystem: " + getHostSystemName()
						+ " --< cause: this doesnt exist on the datacenter: " + datacenter.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		setHostSystemName(host.getName());

		// Image part, we load the vmtemplate object.
		VirtualMachine vmTemplate = null;
		if (hasTemplate) {
			try {
				vmTemplate = VMHelper.findVMForName(datacenter.getVmFolder(), vmTemplateName);
			} catch (RemoteException ex) {
				globalMessage = "Error while searching the vm template folder. \n ";
				globalMessage += "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}

		// Define guestOsId.
		if (hasTemplate && vmTemplate == null) {
			LOGGER.warn("No virtual machine template found for template: " + vmTemplateName);
			globalMessage = "The template " + vmTemplateName + " doesnt exist ! \n ";
			globalMessage += "Please define an existing template.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		if (!hasTemplate && guestOsId == null) {
			// Get the architecture to define the good default guestos.
			if (this.getArchitecture().equals("x86")) {
				LOGGER.warn("Guest OS Id is unknown, assign other 32 bits guest os by default.");
				// No VM template found, retrograde to guestOSId.
				// Get the corresponding value from api :
				guestOsId = VirtualMachineGuestOsIdentifier.otherGuest.toString();
			} else {
				LOGGER.warn("Guest OS Id is unknown, assign other 64 bits guest os by default.");
				guestOsId = VirtualMachineGuestOsIdentifier.otherGuest64.toString();
			}
			
		}
		if (hasTemplate) {
			// Get the guestOsId from template (not the attribute of this
			// compute).
			if (vmTemplate.getConfig().isTemplate()) {
				LOGGER.info("Template : " + vmTemplateName + " is used for building the virtual machine.");
				guestOsId = vmTemplate.getConfig().getGuestId();
			} else {
				LOGGER.warn("The virtual machine : " + vmTemplateName + " is not a template vm.");
				globalMessage = "The virtual machine : " + vmTemplateName + " is not a template vm. \n";
				globalMessage += "Please mark as a template this virtual machine or use another one. And retry after.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;
			}
		}

		// Check if guestOsId string is found on
		// VirtualMachineGuestOsIdentifier.
		if (VirtualMachineGuestOsIdentifier.valueOf(guestOsId) == null) {
			LOGGER.error("Guest OS Id : " + guestOsId + " not found !");
			globalMessage = "Valid values are : \n";
			int i = 0;
			for (VirtualMachineGuestOsIdentifier guestVal : VirtualMachineGuestOsIdentifier.values()) {
				globalMessage += guestVal.name() + ";";
				i++;
				if (i == 10) {
					globalMessage += "\n";
					i = 0;
				}
			}
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}

		// Get the devices storage.
		// The storage is based on a datastore, we must find the
		// corresponding datastore.

		Datastore datastore = null;
		// StoragelinkConnector stMain = getMainStorageLink();
		List<StoragelinkConnector> stLinks = getLinkedStorages(); // For additionnal disks.

		// Get the datastore vmware object.
		if (datastoreName != null) {
			datastore = DatastoreHelper.findDatastoreForName(datacenter, getDatastoreName());
		}

		// Datastore automatic allocation if none found.
		if (datastore == null) {
			// Allocate a datastore automaticly.
			datastore = allocator.allocateDatastore();
			if (datastore == null) {
				globalMessage = "cant allocate a datastore on datacenter: " + datacenter.getName()
						+ " --> there's no available datastore on the datacenter.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		setDatastoreName(datastore.getName());
		// For V2, folder is on an attribute with vmware light extension.
		Folder vmFolder;

		// Get the first adapter (eth0 or name Network adapter 1 or
		// Adaptateur réseau 1).
		NetworkConnector firstConnector = getFirstAdapterNetwork(netInterfaceConn);
		if (toMonitor) {
			subMonitor.worked(50);
		}
		// Creation part.
		if (vmTemplate != null) {
			// We clone the vm.
			try {
				vmFolder = (Folder) datacenter.getVmFolder();
				ResourcePool rp = (ResourcePool) new InventoryNavigator(datacenter)
						.searchManagedEntities("ResourcePool")[0];
				VirtualMachineCloneSpec cloneSpec = new VirtualMachineCloneSpec();
				VirtualMachineRelocateSpec vmRelocate = new VirtualMachineRelocateSpec();
				vmRelocate.setHost(host.getMOR());
				vmRelocate.setPool(rp.getMOR());
				vmRelocate.setDatastore(datastore.getMOR());
				cloneSpec.setLocation(vmRelocate);
				cloneSpec.setTemplate(false);
				cloneSpec.setPowerOn(false);

				if (vmTemplate.getCurrentSnapShot() != null) {
					cloneSpec.snapshot = vmTemplate.getCurrentSnapShot().getMOR();
				}

				LOGGER.info(
						"Creating the Virtual Machine >> " + getTitle() + " << from template: " + vmTemplate.getName());

				// // TODO : guest hostname (lvl OS), when set, create a
				// // customizationSpec.setDomain(hostname) for the
				// // corresponding operating system. It is not implemented
				// // for
				// // now.
				// // On linux or windows ?
				// boolean onWindows = false;
				// boolean onLinux = false;
				// if (guestOsId != null) {
				// if (guestOsId.toLowerCase().contains("linux") ||
				// guestOsId.contains("ubuntu")
				// || guestOsId.contains("debian") ||
				// guestOsId.contains("fedora")
				// || guestOsId.contains("redhat")) {
				// onLinux = true;
				// }
				// if (guestOsId.toLowerCase().contains("windows") ||
				// guestOsId.contains("win")) {
				// onWindows = true;
				// }
				// if (guestOsId.toLowerCase().contains("other")) {
				// // default on linux.
				// onLinux = true;
				// }
				// }
				//
				// // Customize
				//
				// CustomizationSpec customSpec = new CustomizationSpec();
				// String ipAddress = null;
				// String gateway = null;
				// if (firstConnector != null) {
				// ipAddress =
				// firstConnector.getAttributeValueByOcciKey("occi.networkinterface.address");
				// gateway =
				// firstConnector.getAttributeValueByOcciKey("occi.networkinterface.gateway");
				// }
				//
				// if (onLinux) {
				// customSpec = createLinuxCustomization(ipAddress, gateway,
				// host);
				// }
				// if (onWindows) {
				// // customSpec = createWindowsCustomization();
				// }
				// cloneSpec.setCustomization(customSpec);

				vmSpec = new VirtualMachineConfigSpec();
				vmSpec.setName(vmName);

				if (summary != null && !summary.trim().isEmpty()) {
					vmSpec.setAnnotation(summary);
				} else {
					vmSpec.setAnnotation("Virtual Machine Annotation");
				}
				Float memSizeGB = getMemory();

				Long memSizeGBLng = memSizeGB.longValue();
				Long memSizeMB = memSizeGBLng * 1024;

				if (memSizeGBLng == 0L || getCores() == 0) {
					globalMessage = "You must set the memory size (in GB) and the number of cores.";
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}

				vmSpec.setMemoryMB(memSizeMB);

				// If attribute vcpu is setted, we
				// calculate the nb
				// cores per socket.
				assignVCpuToVMSpec();

				vmSpec.setGuestId(guestOsId);
				vmSpec.setCpuHotAddEnabled(true);
				// vmSpec.setCpuHotRemoveEnabled(true);
				vmSpec.setMemoryHotAddEnabled(true);
				// TODO : Check why it is not working network allocation
				// clone
				// customize....

				// // Rebuild the networks allocation.
				// String networkName = null;
				// List<VirtualDeviceConfigSpec> nicSpecs = new
				// LinkedList<>();
				// // Load each network interfaces and their network and
				// nic
				// names,
				// // add to device change.
				// if (!netInterfaceConn.isEmpty()) {
				//
				// // Get the network name.
				// for (NetworkinterfaceConnector netInt :
				// netInterfaceConn) {
				// NetworkConnector networkConn = (NetworkConnector)
				// netInt.getTarget();
				// if (networkConn != null) {
				// networkName = ((NetworkConnector)
				// netInt.getTarget()).getLabel();
				// }
				// if (networkConn == null || networkName == null ||
				// networkName.trim().isEmpty()) {
				//
				// Network network = allocator.allocateNetwork();
				// if (network == null) {
				// LOGGER.error(
				// "No virtual networks is available for this virtual
				// machine,
				// please setup a new network in vcenter.");
				// VCenterClient.disconnect();
				// return;
				// }
				// networkName = network.getName();
				// } else {
				// // Check if this network exist.
				// if (!NetworkHelper.isHostNetworkExist(networkName,
				// host)) {
				// // We create the vSwitch and port group.
				// String vSwitchName = networkConn.getTitle();
				// String macAddress = null;
				// // TODO : ipAddress CIDR and subnetmask
				// // association with vswitch ??? No informations
				// // about that. Searching....
				// String dhcp =
				// networkConn.getAttributeValueByOcciKey("occi.network.allocation");
				// boolean dhcpMode = true;
				// if (dhcp != null) {
				// if (dhcp.equals("static")) {
				// dhcpMode = false;
				// }
				// }
				// // TODO : To replace when a solution is found
				// // for cidr addresses with network.
				// dhcpMode = true;
				// NetworkHelper.createVSwitch(vSwitchName, networkName,
				// 8,
				// networkConn.getVlan(), host,
				// macAddress, null, null, dhcpMode);
				// }
				// }
				//
				// VirtualDeviceConfigSpec deviceConf =
				// NetworkHelper.createNicSpec(networkName,
				// netInt.getTitle(),
				// "generated",
				// netInt.getAttributeValueByOcciKey("occi.networkinterface.address"));
				// nicSpecs.add(deviceConf);
				// VirtualDeviceConfigSpec[] vDevices = new
				// VirtualDeviceConfigSpec[nicSpecs.size()];
				//
				// int i = 0;
				// for (VirtualDeviceConfigSpec nicSpec : nicSpecs) {
				// vDevices[i] = nicSpec;
				// i++;
				// }
				//
				// // Add networks specs to device change.
				// vmSpec.setDeviceChange(vDevices);
				// }
				// }

				// Create vm file info for vmx file.
				VirtualMachineFileInfo vmfi = new VirtualMachineFileInfo();
				vmfi.setVmPathName("[" + datastoreName + "]");
				vmSpec.setFiles(vmfi);

				cloneSpec.setConfig(vmSpec);

				// TODO : Other Network and other storages allocation
				// ref on
				// designer when vm is created.
				com.vmware.vim25.mo.Task taskVm = vmTemplate.cloneVM_Task(vmFolder, vmName, cloneSpec);
				
				if (!UIDialog.isStandAlone()) {
					
					String result = taskVm.waitForTask();
					if (toMonitor) {
						subMonitor.worked(80);
					}
					if (result == com.vmware.vim25.mo.Task.SUCCESS) {
						globalMessage = "Virtual Machine successfully created from template : " + vmTemplate.getName();
						levelMessage = Level.INFO;
						LOGGER.info(globalMessage);

					} else {
						globalMessage = "VM couldn't be created ! vm name: " + vmName + " from template: "
								+ vmTemplate.getName();
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
					}
				} else {
					// in headless mode (console), we don't need to wait the task completion.
					// This is to user to poll the service it's done. This is a long long task, here it made in 13 mins for 20 Go to clone.
					globalMessage = "The clone task is launched, vm name: " + vmName + " from template: "
							+ vmTemplate.getName();
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				}
				
			} catch (RemoteException | InterruptedException ex) {

				globalMessage = "VM was not created or has errors, please check your vcenter and your configuration \n "
						+ "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				if (ex.getMessage() == null) {
					ex.printStackTrace();
				}
				VCenterClient.disconnect();
				return;
			}
		} else {
			try {
				// No vm template defined, building a new vm from
				// scratch,
				// there
				// is no os system installed on..
				LOGGER.info("Creating the Virtual Machine from scratch : " + vmName);
				int cKey = 1000;

				String diskMode = null;
				// Get the disk mode.
				// mode: persistent|independent_persistent,
				// independent_nonpersistent
				LOGGER.warn("Default diskmode setted to persistent");
				diskMode = "persistent";
				
				// "occi.compute.ephemeral.diskmode", "persistent");
				// }

				// Disk size in kiloBytes.
				// Set the ephemeral disk size, if the add one crtp mixin is set.
				if (hasMixinEphemeral()) {
					// read the ephemeral size attribute before creating.
					Float ephemeralTmp = Float.valueOf(getAttributeValueByOcciKey(ATTR_VM_EPHEMERAL_DISK_SIZE_GB));
					if (ephemeralTmp != null && ephemeralTmp > 0) {
						ephemeralDiskSizeGB = ephemeralTmp;
					}
				}
				
				Long diskSizeGB = ephemeralDiskSizeGB.longValue();
				if (diskSizeGB == 0L) {
					globalMessage = "The main disk size must be > 0 in GigaBytes";
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}

				Long diskSizeKB = diskSizeGB * 1024 * 1024;
				VirtualDeviceConfigSpec scsiSpec = VMHelper.createScsiSpec(cKey);
				// Define the datastore if there is one referenced on
				// StorageConnector.
				String storageDatastoreName =  getDatastoreName();
				
				VirtualDeviceConfigSpec diskSpec = VMHelper.createDiskSpec(storageDatastoreName, cKey, diskSizeKB,
						diskMode);

				// Network part : VM Network.
				// We use predefined network interface (from host).

				// Get the virtual network interface name.
				String networkName = null;
				// Get The network adapter name.
				String nicName = null;
				if (netInterfaceConn == null || netInterfaceConn.isEmpty()) {
					// Searching an existing network device on host.
					LOGGER.info("No network defined, searching for a network on host : " + host.getName());
					if (host != null) {
						allocator.setDc(datacenter);
						allocator.setCluster(cluster);
						allocator.setHost(host);
					}
					Network network = allocator.allocateNetwork();
					if (network == null) {
						globalMessage = "No virtual networks is available for this virtual machine, please setup a new network in vcenter.";
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
						VCenterClient.disconnect();
						return;
					}

					networkName = network.getName();
					// createNetworksSpec(networkName,
					// netInterfaceConn);

				} else {
					// TODO : We could allocate any networks on any
					// adapter
					// interfaces..
					// Get the network name.
					for (NetworkinterfaceConnector netInt : netInterfaceConn) {
						networkName = ((NetworkConnector) netInt.getTarget()).getLabel();
						nicName = netInt.getTitle();
						// createNetworksSpecs(networkName, netInt);
						break;
					}
				}
				

				// Get the virtual adapter network name.
				if (nicName == null) {
					// Default virtual network name.
					nicName = "Adaptateur réseau 1";
				}

				// TODO : Check VMWare tools, if no vmware tools, the
				// sdk
				// will not give the ipv4, nor ipv6 .
				// + upgrade automaticly VMWare Tools via VIJava.

				// Network configuration.
				// TODO : Manual configuration mode within mixin
				// ipAddress and
				// ipNetworkInterfaceAddress.

				VirtualDeviceConfigSpec nicSpec = NetworkHelper.createNicSpec(networkName, nicName,
						NetworkHelper.MODE_NETWORK_ADDRESS_GENERATED, null);

				// Define the vmSpec configuration object.
				vmSpec = new VirtualMachineConfigSpec();

				vmSpec.setName(vmName);
				if (summary != null && !summary.trim().isEmpty()) {
					vmSpec.setAnnotation(summary);
				} else {
					vmSpec.setAnnotation("Virtual Machine Annotation");
				}

				Float memSizeGB = getMemory();

				Long memSizeGBLng = memSizeGB.longValue();
				Long memSizeMB = memSizeGBLng * 1024;

				if (memSizeGBLng == 0L || getCores() == 0) {
					globalMessage = "You must set the memory size (in GB) and the number of cores.";
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
					VCenterClient.disconnect();
					return;
				}

				vmSpec.setMemoryMB(memSizeMB);

				// If attribute occi.compute.vcpu is setted, we
				// calculate the nb
				// cores per socket.
				assignVCpuToVMSpec();

				vmSpec.setGuestId(guestOsId);
				vmSpec.setCpuHotAddEnabled(true);
				// vmSpec.setCpuHotRemoveEnabled(true);
				vmSpec.setMemoryHotAddEnabled(true);

				vmSpec.setDeviceChange(new VirtualDeviceConfigSpec[] { scsiSpec, diskSpec, nicSpec });
				// Create vm file info for vmx file.
				VirtualMachineFileInfo vmfi = new VirtualMachineFileInfo();
				vmfi.setVmPathName("[" + datastoreName + "]");
				vmSpec.setFiles(vmfi);

				ResourcePool rp = (ResourcePool) new InventoryNavigator(datacenter)
						.searchManagedEntities("ResourcePool")[0];
				
				// TODO : V2 custom folder path.
				vmFolder = datacenter.getVmFolder();

				// Create effectively the vm on folder.
				com.vmware.vim25.mo.Task taskVm = vmFolder.createVM_Task(vmSpec, rp, host);
				// TODO : Monitoring task object in other thread. See :
				// http://benohead.com/vi-java-api-monitoring-task-completion/
				String result = taskVm.waitForTask();
				if (toMonitor) {
					subMonitor.worked(80);
				}
				if (result == com.vmware.vim25.mo.Task.SUCCESS) {
					globalMessage = "Virtual Machine successfully created !";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
					vmExist = true;

				} else {
					globalMessage = "VM couldn't be created, result: " + result;
					levelMessage = Level.ERROR;
					LOGGER.error(globalMessage);
				}

				// Create vm terminated

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Cannot create the virtual machine : " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
				VCenterClient.disconnect();
				return;
			}

		} // endif vmTemplate exist.

		// } // Endif toCreate.
		if (toMonitor) {
			subMonitor.worked(100);
		}
		// In all case invoke a disconnect from vcenter.
		VCenterClient.disconnect();
	}

	/**
	 * Business code for retrieving a compute.
	 * 
	 * @param monitor
	 */
	public void retrieveCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			vmExist = false;
			return;
		}
		// Retrieve all informations about this compute.
		String vmName = getTitle();
		if (vmOldName == null) {
			vmOldName = vmName;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		// Search for the vm object.
		VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);
		if (vm == null) {
			// Check if the name has changed...
			if (!vmOldName.equals(vmName)) {
				// The title attribute has changed from the last use
				// this may
				// cause to not find the vm on vcenter.
				vm = VMHelper.findVMForName(rootFolder, vmOldName);
				// if found we set the title on the old name.
				if (vm != null) {
					setTitle(vmOldName);
					vmName = vmOldName;
				} else {
					// Find vm by morId
					if (morId != null) {
						vm = VMHelper.findVMForMorId(rootFolder, morId);
					}
					if (vm == null) {
						// no vm exist with this name.
						globalMessage = "This virtual machine doesnt exist anymore.";
						levelMessage = Level.WARN;
						LOGGER.warn(globalMessage);
						VCenterClient.disconnect();
						vmExist = false;
						return;
					}
				}
			} else {
				if (morId != null) {
					vm = VMHelper.findVMForMorId(rootFolder, morId);
				}
				if (vm == null) {
					// no vm exist with this name.
					globalMessage = "This virtual machine doesnt exist anymore.";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
					VCenterClient.disconnect();
					vmExist = false;
					return;
				}

			}
		}
		morId = vm.getMOR().getVal();
		vmName = vm.getName();
		if (toMonitor) {
			subMonitor.worked(30);
		}
		HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);
		if (host == null) {
			globalMessage = "No host found for this vm : " + vmName;
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			vmExist = false;
			return;
		} else {
			if (hostSystemName == null || !hostSystemName.equals(host.getName())) {
				setHostSystemName(host.getName());
			}
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		Datacenter dc = null;
		ClusterComputeResource cluster = null;
		Datastore ds = null;

		// Search for the cluster and datacenter info. (if any, it is
		// not
		// mandatory to have a cluster, so it is a simple information.
		ManagedEntity mEntity = host.getParent();
		while (mEntity != null) {

			if (mEntity instanceof Datacenter) {
				dc = (Datacenter) mEntity;
			}
			if (mEntity instanceof ClusterComputeResource) {
				cluster = (ClusterComputeResource) mEntity;
			}
			if (mEntity instanceof Datastore) {
				ds = (Datastore) mEntity;
			}
			mEntity = mEntity.getParent();
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}
		if (dc == null) {
			LOGGER.warn("No datacenter found for this virtual machine: " + vm.getName());
		} else {
			if (datacenterName == null) {
				setDatacenterName(dc.getName());
			}
		}
		if (cluster == null) {
			LOGGER.warn("No cluster found for this virtual machine: " + vm.getName());
		} else {
			if (clusterName == null) {
				setClusterName(cluster.getName());
			}
		}
		if (ds == null) {
			// There is another way to find the dsname.
			try {
				Datastore[] dss = vm.getDatastores();
				if (dss != null && dss.length > 0) {
					ds = dss[0];
				}
				if (ds != null) {
					if (datastoreName == null) {
						setDatastoreName(ds.getName());
					}
				}

			} catch (RemoteException ex) {
				globalMessage = "Error while searching all datastores for this virtual machine: " + vm.getName()
						+ " \n ";
				globalMessage += "Message: " + ex.getMessage();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				vmExist = false;
				return;
			}

		} else {
			if (datastoreName == null) {
				setDatastoreName(ds.getName());
			}
		}
		if (toMonitor) {
			subMonitor.worked(60);
		}
		if (vm.getConfig() == null) {
			// The instance may be in clone mode or other task that impact the vm configurartion.
			LOGGER.warn("VM configuration is not accessible, this may be caused by a task that updating the vm configuration.");
		} else {
			// Load the compute information from vCenter.
			numCores = VMHelper.getCoreNumber(vm);
			vcpus = VMHelper.getNumCPU(vm);
			memoryGB = VMHelper.getMemoryGB(vm);
			architecture = VMHelper.getArchitecture(vm);
			speed = VMHelper.getCPUSpeed(vm);
			// Define the states of this vm.
			vmState = VMHelper.getPowerState(vm);
			hostname = VMHelper.getGuestHostname(vm);
			vmGuestState = VMHelper.getGuestState(vm);
			guestOsId = vm.getConfig().getGuestId();
			summary = vm.getConfig().getAnnotation();
			ephemeralDiskSizeGB = VMHelper.getEphemalDiskSize(vm);
			// Determine if this vm is marked as template also an image..
			if (vm.getConfig().isTemplate()) {
				markedAsTemplate = "true";
			} else {
				markedAsTemplate = "false";
			}
			if (toMonitor) {
				subMonitor.worked(70);
			}
		}
		
		vmExist = true;
		if (toMonitor) {
			subMonitor.worked(80);
		}
		
		globalMessage = "The virtual machine informations has been retrieved and are updated.";
		levelMessage = Level.INFO;
		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
		
		if (UIDialog.isStandAlone()) {
			updateAttributesOnCompute();
		}
		
	}

	/**
	 * Business code for updating a compute.
	 * 
	 * @param monitor
	 */
	public void updateCompute(IProgressMonitor monitor) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		// Load the vm information.
		String vmName = getTitle();
		if (toMonitor) {
			subMonitor.worked(20);
		}
		if (vmName == null || vmName.isEmpty()) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (vmOldName == null) {
			vmOldName = vmName;
		}

		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (toMonitor) {
			subMonitor.worked(30);
		}
		if (vm == null) {
			// The title may has been changed.
			if (!vmOldName.equals(vmName)) {
				// The title have been changed.
				// We load the vm with the old one.
				vm = VMHelper.loadVirtualMachine(vmOldName);
				if (vm != null) {
					LOGGER.info("The virtual machine name has been changed to a new one, updating...");
					try {
						VMHelper.renameVM(vm, vmName);
						vm = VMHelper.loadVirtualMachine(vmName);
						if (toMonitor) {
							subMonitor.worked(40);
						}
						globalMessage = "The virtual machine : " + vmOldName + " has been renamed to : " + vmName;
						levelMessage = Level.INFO;
						LOGGER.info(globalMessage);
					} catch (RemoteException ex) {
						globalMessage = "Error while trying to rename a virtual machine, message: " + ex.getMessage();
						levelMessage = Level.ERROR;
						LOGGER.error(globalMessage);
						ex.printStackTrace();
					}
					vmOldName = vmName;
				} else {
					VCenterClient.disconnect();
					return;
				}
			}

		}

		// Update config.
		try {

			if (vmSpec == null) {
				vmSpec = new VirtualMachineConfigSpec();
			}
			if (summary != null && !summary.trim().isEmpty()) {
				vmSpec.setAnnotation(summary);
			}
			assignVCpuToVMSpec();
			VMHelper.reconfigureVm(vm, vcpus, getMemory(), summary);
		} catch (RemoteException ex) {
			globalMessage = "Error while updating the virtual machine configuration : " + vmName + " \n message: "
					+ ex.getMessage();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}
		if (toMonitor) {
			subMonitor.worked(50);
		}
		// Reading template attribute for detecting if it may be updated
		// or not.
		markedAsTemplate = getAttributeValueByOcciKey(ATTR_MARKED_AS_TEMPLATE);
		if (markedAsTemplate == null) {
			if (vm.getConfig().isTemplate()) {
				markedAsTemplate = "true";
			} else {
				markedAsTemplate = "false";
			}
		}
		if (toMonitor) {
			subMonitor.worked(60);
		}
		// Check if transform vm to vmTemplate.
		if (!vm.getConfig().isTemplate() && "true".equals(markedAsTemplate)) {
			// Mark the vm as a template.
			try {

				if (VMHelper.markAsTemplate(vm)) {
					globalMessage += "The virtual machine " + vmName + " has been marked as template.";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage += "The virtual machine " + vmName + " is already marked as a template.";
					levelMessage = Level.WARN;
					LOGGER.info(globalMessage);
				}
			} catch (RemoteException ex) {
				globalMessage = "Error while marking the virtual machine as a template: " + vm.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}
		if (toMonitor) {
			subMonitor.worked(70);
		}
		// Check if transform template to VM.
		if (vm.getConfig().isTemplate() && "false".equals(markedAsTemplate)) {

			ServiceInstance si = VCenterClient.getServiceInstance();
			Folder rootFolder = si.getRootFolder();
			AllocatorImpl allocator = new AllocatorImpl(rootFolder);
			// Search a cluster.
			Datacenter datacenter = allocator.allocateDatacenter();
			ClusterComputeResource cluster = allocator.allocateCluster();
			HostSystem host = allocator.allocateHostSystem();
			ResourcePool pool = allocator.allocateResourcePool();
			try {
				if (VMHelper.markAsVirtualMachine(vm, host, pool)) {
					globalMessage += "The template machine " + vmName + " has been marked as a virtual machine.";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage += "The template machine " + vmName + " is not a template but a virtual machine.";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException ex) {
				globalMessage = "Error while marking the machine template as a virtual machine : " + vm.getName();
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}
		if (toMonitor) {
			subMonitor.worked(100);
		}
		// In the end we disconnect.
		VCenterClient.disconnect();

	}

	/**
	 * Business code to delete a compute.
	 * 
	 * @param monitor
	 */
	public void deleteCompute(IProgressMonitor monitor) {
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
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		String vmName = getTitle();
		if (vmName == null) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (toMonitor) {
			subMonitor.worked(40);
		}
		if (vm == null) {
			// Check if an old name exist.
			if (vmOldName != null && !vmOldName.equals(vmName)) {
				vm = VMHelper.loadVirtualMachine(vmOldName);
				if (vm == null) {
					VCenterClient.disconnect();
					return;
				}
			} else {
				VCenterClient.disconnect();
				return;
			}

		}

		// Check if vm state is inactive, if vm is started, powered it off.
		vmState = VMHelper.getPowerState(vm);
		if (vmState.equals(VMHelper.POWER_ON)) {
			try {
				boolean result = VMHelper.powerOff(vm);
				if (!result) {
					throw new RemoteException("");
				}
			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Cant power off a virtual machine : " + vm.getName() + " \n ";
				globalMessage += "Cant delete a virtual machine, it must be stopped before.";

				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				VCenterClient.disconnect();
				return;
			}
		}
		VMHelper.destroyVM(vm);
		if (toMonitor) {
			subMonitor.worked(100);
		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		globalMessage = "The virtual machine " + vmName + " has been fully removed from vcenter.";
		levelMessage = Level.INFO;
		LOGGER.info(globalMessage);
	}

	/**
	 * Business code for starting a compute.
	 * 
	 * @param monitor
	 */
	public void startCompute(IProgressMonitor monitor) {
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
		
		if (toCreateOnStartOperation) {
			LOGGER.info("Creating the virtual machine and start after.");
			this.createCompute(monitor);
			if (toMonitor) {
				subMonitor.worked(10);
			}
		}
		
		LOGGER.debug("Action start() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(30);
		}
		String vmName = getTitle();
		if (vmName == null) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		vmState = VMHelper.getPowerState(vm);
		if (toMonitor) {
			subMonitor.worked(40);
		}
		if (vmState.equals(VMHelper.POWER_ON)) {
			globalMessage = "The virtual machine " + vmName + " is already started.";
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);

		} else {
			// in the other case we start the compute.
			try {
				if (VMHelper.powerOn(vm)) {
					globalMessage = "VM " + vmName + " switched On";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);
				} else {
					globalMessage = "VM " + vmName + " cannot be switched on";
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Error while starting a virtual machine : " + vmName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}
		if (toMonitor) {
			subMonitor.worked(80);
		}
		// Is vmware tools is installed ? if not mount the vmware guest
		// tools disk for installation.
		if (!VMHelper.isToolsInstalled(vm)) {
			if (vm != null) {
				try {
					VMHelper.mountGuestVmTools((Folder) vm.getParent(), getTitle());
				} catch (MountVMWareToolsDiskException ex) {
					globalMessage = ex.getMessage() + " on virtual machine : " + vmName;
					levelMessage = Level.WARN;
					LOGGER.warn(globalMessage);
				}
				// assign hot config enabled (default).
				// VMHelper.hotReconfigEnable((Folder)
				// vm.getParent(),
				// getTitle(), true);
			}

		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Business code for stopping a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void stopCompute(IProgressMonitor monitor,
			org.occiware.clouddesigner.occi.infrastructure.StopMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();
		if (vmName == null) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		vmState = VMHelper.getPowerState(vm);
		if (vmState.equals(VMHelper.POWER_OFF)) {
			globalMessage = "This virtual machine " + vmName + " is already stopped.";
			levelMessage = Level.WARN;
			LOGGER.info(globalMessage);
			if (toMonitor) {
				subMonitor.worked(70);
			}
		} else {
			// in the other case we start the compute.
			// if (graceful) shutdown guest os and poweroff.
			// if acpioff ??
			// if poweroff direct poweroff.
			try {
				boolean result = false;
				switch (method) {
				case GRACEFUL:
					result = VMHelper.graceFulPowerOff(vm);
					break;
				case POWEROFF:
					result = VMHelper.powerOff(vm);
					break;
				case ACPIOFF:
					result = VMHelper.powerOff(vm);
					break;
				}
				if (toMonitor) {
					subMonitor.worked(70);
				}
				if (result) {
					globalMessage = "VM " + vmName + " switched Off";
					levelMessage = Level.INFO;
					LOGGER.info(globalMessage);

				} else {
					globalMessage = "VM " + vmName + " cannot be switched off";
					levelMessage = Level.INFO;
					LOGGER.warn(globalMessage);
				}

			} catch (RemoteException | InterruptedException ex) {
				globalMessage = "Error while stopping a virtual machine : " + vmName;
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				ex.printStackTrace();
			}
		}

		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Business code for restarting a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void restartCompute(IProgressMonitor monitor,
			final org.occiware.clouddesigner.occi.infrastructure.RestartMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();
		if (vmName == null) {
			globalMessage = "The title must be set, as it is used as the VM name.";
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (toMonitor) {
			subMonitor.worked(30);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(40);
		}
		String vmPowerState = VMHelper.getPowerState(vm);
		boolean result = false;
		try {
			if (vmPowerState.equals(VMHelper.POWER_OFF)) {
				// Direct starting the vm.
				result = VMHelper.powerOn(vm);

			} else {
				// in the other case we restart the compute.
				// if (graceful) shutdown guest os and poweron.
				// if cold hard reboot.
				// if warm soft reboot.
				switch (method) {
				case GRACEFUL:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					VMHelper.graceFulPowerOff(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					result = VMHelper.powerOn(vm);
					break;
				case COLD:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					VMHelper.powerOff(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					result = VMHelper.powerOn(vm);
					break;
				case WARM:
					if (vmPowerState.equals(VMHelper.SUSPENDED)) {
						if (toMonitor) {
							subMonitor.worked(50);
						}
						VMHelper.powerOn(vm);
					}
					if (toMonitor) {
						subMonitor.worked(60);
					}
					result = VMHelper.rebootGuest(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				}
			}

		} catch (RemoteException | InterruptedException ex) {
			globalMessage = "Error while rebooting the virtual machine " + vm.getName();
			levelMessage = Level.ERROR;
			LOGGER.warn(globalMessage);
			ex.printStackTrace();
		}
		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
		if (result) {
			globalMessage = "Restart virtual machine has succeed.";
			levelMessage = Level.INFO;
			LOGGER.info(globalMessage);
		} else {
			globalMessage = "Restart virtual machine has failed.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
		}
	}

	/**
	 * Business code for suspend a compute.
	 * 
	 * @param monitor
	 * @param method
	 */
	public void suspendCompute(IProgressMonitor monitor,
			final org.occiware.clouddesigner.occi.infrastructure.SuspendMethod method) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		if (toMonitor) {
			subMonitor.worked(20);
		}
		String vmName = getTitle();
		if (vmName == null) {
			LOGGER.error("The title must be set, as it is used as the VM name (unique).");
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		if (toMonitor) {
			subMonitor.worked(30);
		}
		String vmPowerState = VMHelper.getPowerState(vm);
		try {
			boolean result = false;
			if (vmPowerState.equals(VMHelper.SUSPENDED)) {
				// already suspended.
				LOGGER.info("The virtual machine " + vmName + " is already suspended.");

			} else {
				// in the other case we restart the compute.
				// if hibernate .
				// if acpioff ??
				// if poweroff direct poweroff.
				switch (method) {
				case HIBERNATE:
					if (toMonitor) {
						subMonitor.worked(50);
					}
					result = VMHelper.hibernateVM(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				case SUSPEND:
					if (toMonitor) {
						subMonitor.worked(50);
					}
					result = VMHelper.suspendVM(vm);
					if (toMonitor) {
						subMonitor.worked(70);
					}
					break;
				}
			}

			if (result) {
				globalMessage = "Suspend virtual machine has succeed.";
				levelMessage = Level.INFO;
				LOGGER.info(globalMessage);
			} else {
				globalMessage = "Suspend virtual machine has failed.";
				levelMessage = Level.WARN;
				LOGGER.warn(globalMessage);
			}
		} catch (RemoteException | InterruptedException ex) {
			globalMessage = "Error while suspending a virtual machine : " + vmName;
			levelMessage = Level.WARN;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}

		// In the end we disconnect.
		VCenterClient.disconnect();
		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

	/**
	 * Save a compute.
	 * 
	 * @param monitor
	 * @param method
	 * @param name
	 */
	public void saveCompute(IProgressMonitor monitor,
			final org.occiware.clouddesigner.occi.infrastructure.SaveMethod method, final String name) {
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

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			globalMessage = "No connection to Vcenter has been established.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			return;
		}
		String vmName = getTitle();
		if (vmName == null) {
			LOGGER.error("The title must be set, as it is used as the VM name (unique).");
			VCenterClient.disconnect();
			return;
		}
		VirtualMachine vm = VMHelper.loadVirtualMachine(vmName);
		if (toMonitor) {
			subMonitor.worked(20);
		}
		if (vm == null) {
			globalMessage = "This virtual machine doesnt exist anymore.";
			levelMessage = Level.WARN;
			LOGGER.warn(globalMessage);
			VCenterClient.disconnect();
			return;
		}
		try {
			if (VMHelper.markAsTemplate(vm)) {
				globalMessage = "The virtual machine " + vmName + " has been marked as template.";
				levelMessage = Level.INFO;
				LOGGER.info(globalMessage);
			} else {
				globalMessage = "The virtual machine " + vmName + " is already marked as a template.";
				levelMessage = Level.WARN;
				LOGGER.info(globalMessage);
			}

			markedAsTemplate = "true";

		} catch (RemoteException ex) {
			globalMessage = "Error while marking the virtual machine as a template: " + vm.getName();
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			ex.printStackTrace();
		}
		if (toMonitor) {
			subMonitor.worked(80);
		}
		vm = VMHelper.loadVirtualMachine(vmName);
		// In the end we disconnect.
		VCenterClient.disconnect();

		if (toMonitor) {
			subMonitor.worked(100);
		}
	}

}
