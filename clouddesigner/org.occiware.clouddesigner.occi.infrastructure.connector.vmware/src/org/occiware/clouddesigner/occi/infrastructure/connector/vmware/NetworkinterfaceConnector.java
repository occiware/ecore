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

import java.rmi.RemoteException;
import java.util.List;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.Allocator;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.NetworkHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.Description;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.GuestStackInfo;
import com.vmware.vim25.HostPortGroup;
import com.vmware.vim25.HostVirtualSwitch;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://schemas.ogf.org/occi/infrastructure# - term: networkinterface - title:
 * NetworkInterface Link Represent a network adapter. (nic).
 */
public class NetworkinterfaceConnector
		extends org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkinterfaceConnector.class);

	private String vmName = null;
	private String networkAdapterName = null;

	/**
	 * Host network name.
	 */
	private String networkName = null;

	private String oldNetworkAdapterName = null;

	/**
	 * Constructs a networkinterface connector.
	 */
	NetworkinterfaceConnector() {
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Networkinterface instance is completely created.
	 */
	@Override
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);

		boolean nicExist = false;
		boolean created = false;
		LOGGER.debug("occiCreate() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// 1 - Get vm connector link, if no vm ==> no create, vmName is set with
		// this method.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			LOGGER.warn("No virtual machine is linked on the network.");
			VCenterClient.disconnect();
			return;
		}

		// 2 - Check if this network adapter already exist.
		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			LOGGER.warn("No network adapter name setted. Cant create the network.");
			VCenterClient.disconnect();
			return;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}

		// 3 - if exist, network is not created.
		nicExist = NetworkHelper.isNICExist(networkAdapterName, vm);
		if (nicExist) {
			LOGGER.warn("This network adapter: " + networkAdapterName + " already exist for the virtual machine: "
					+ vmName);
			VCenterClient.disconnect();
			return;
		}
		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
		HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);

		// Get the linked Network interface connector.
		NetworkConnector netConn = getLinkedNetwork();
		if (networkName == null && netConn != null) {
			networkName = netConn.getLabel();
		} else {

			Allocator allocator = new AllocatorImpl(rootFolder);
			allocator.setHost(host);

			Network net = allocator.allocateNetwork();

			networkName = net.getName();
		}

		// 4 - if not exist, check attributes and create the network.
		// Check the hostNetworkName...
		if (networkName == null || !NetworkHelper.isHostNetworkExist(networkName, host)) {
			LOGGER.error("Host network name doesnt exist");
			VCenterClient.disconnect();
			return;
		}

		// TODO : Manual configuration network mode (mac address).
		// TODO : Customization with ipAddress and other cool things...
		VirtualDeviceConfigSpec nicSpec = NetworkHelper.createNicSpec(networkName, networkAdapterName,
				NetworkHelper.MODE_NETWORK_ADDRESS_GENERATED, null);
		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
		VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
		vmConfigSpec.setDeviceChange(nicSpecArray);

		// Launch the reconfig task.

		Task task;
		try {
			task = vm.reconfigVM_Task(vmConfigSpec);
			task.waitForTask();

		} catch (RemoteException | InterruptedException e) {
			LOGGER.error("Error while creating a network adapter : " + networkAdapterName + " --< to vm : " + vmName,
					e);
			LOGGER.error("Message: " + e.getMessage());
			return;
		}

		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				LOGGER.error(
						"Error while creating a network adapter : " + networkAdapterName + " --< to vm : " + vmName,
						fault.detail);
				LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
			} else {
				created = true;
			}
		} catch (RemoteException e) {
			LOGGER.error("Error while creating an network adapter : " + networkAdapterName + " --< to vm : " + vmName,
					e);
			LOGGER.error("Message : " + e.getMessage());
		}

		// 5 - Reload network information, and update accordingly the object
		// (via occiRetrieve() method.)
		if (created) {
			LOGGER.info("Network : " + networkAdapterName + " has been created.");
			occiRetrieve();
		}

		VCenterClient.disconnect();
	}

	/**
	 * Called when this Networkinterface instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();
		// Load virtual machine if any.
		// Note: vmName is set with this method.
		VirtualMachine vm = getVirtualMachineFromLinks();

		if (vm == null) {
			LOGGER.warn("The linked virtual machine doesnt exist on Vcenter, no network to retrieve.");
			// No vm adapter found so.
			VCenterClient.disconnect();
			return;
		}

		// Get the linked Network connector target.
		NetworkConnector netConn = getLinkedNetwork();

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkName != null && networkName.isEmpty()) {
			networkName = null;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}
		// Search the appropriate adapter if vm exist on vcenter.
		getVMHostNetworkName(vm, netConn);
		List<VirtualEthernetCard> vEths = null;
		VirtualEthernetCard vEthDevice = null;
		if (networkName != null) {
			// Search after network adapter name for the backing name :
			// hostNetworkName.
			// List of all virtual ethernet card on the vm.
			vEths = NetworkHelper.findNetDeviceForHostNetName(networkName, vm);
			if (vEths.isEmpty()) {
				LOGGER.warn("No network adapter found for this host network: " + networkName);
				VCenterClient.disconnect();
				return;
			}

		} else {
			LOGGER.warn("The host network name is not found on vcenter, no network to retrieve.");
			VCenterClient.disconnect();
			return;
		}
		String externalId = null;
		for (VirtualEthernetCard vEth : vEths) {
			externalId = vEth.getExternalId();
			if (networkAdapterName == null) {
				LOGGER.info("The network adapter is not set (title attribute), searching info on vcenter...");
				if (externalId != null) {
					networkAdapterName = externalId;
				} else {
					// Find the first on the list.
					networkAdapterName = vEth.getDeviceInfo().getLabel();
				}
				vEthDevice = vEth;
				break;
			} else {
				if (vEth.getDeviceInfo().getLabel().equals(networkAdapterName)) {
					vEthDevice = vEth;
					break;
				} else if (externalId != null) {
					if (externalId.equals(networkAdapterName)) {
						vEthDevice = vEth;
					}
				}

			}
		}

		// Set the informations...
		this.setTitle(networkAdapterName);
		String[] ipAddressesLocal;
		String ipAddressPlainLocal = "";
		String macAddress = null;
		boolean dhcpMode = false;
		Boolean wakeOnLan = true;
		// String dnsName;

		if (VMHelper.isToolsInstalled(vm) && VMHelper.isToolsRunning(vm) && vEthDevice != null) {
			// Get guest information.
			GuestNicInfo[] guestNicInf = vm.getGuest().getNet();
			int i;
			int key = vEthDevice.getKey();
			if (guestNicInf != null) {
				for (GuestNicInfo nicInfo : guestNicInf) {
					ipAddressesLocal = nicInfo.getIpAddress();
					// TODO : How to get dhcp mode of a network adapter system ? (without null value)
					// dhcpMode = nicInfo.getIpConfig().getDhcp().getIpv4().isEnable();
					// nicInfo.getIpConfig().ipAddress[0].state; 
					// TODO : State of the network adapter ??? (otherwise connected / disconnected)
					// TODO : How to obtain gateway address ? the gateway
					
					macAddress = nicInfo.getMacAddress();
					
					
					int deviceConfigId = nicInfo.getDeviceConfigId();
					LOGGER.info("Network : " + nicInfo.getNetwork());
					LOGGER.info("Device Config Id : " + deviceConfigId);
					if (deviceConfigId == key) {
						// i = 0;
						for (String ipAddress : ipAddressesLocal) {
							ipAddressPlainLocal = ipAddress;
							break;
							// i++;
							//
							// if (i == ipAddressesLocal.length) {
							// ipAddressPlainLocal += ipAddress;
							// } else {
							// ipAddressPlainLocal += ipAddress + ";";
							// }
							//
						}
						break;
					}
				}
			}

		}
		if (ipAddressPlainLocal.isEmpty()) {
			this.setMessage("No ip address setup.");
		} else {
			this.setMessage("ip address setup: " + ipAddressPlainLocal);
			
			AttributeState attr = this.getAttributeStateObject("occi.networkinterface.address");
			if (attr != null) {
				// set the new value for this attribute.
				attr.setValue(ipAddressPlainLocal);
				// Create the attribute and set his value.
				// attr = createAttribute("occi.networkinterface.address", ipAddressPlainLocal);
				// this.getAttributes().add(attr);
			// } else {
				
				
			}

		}
		// Mac address.
		if (macAddress != null) {
			AttributeState attr = this.getAttributeStateObject("occi.networkinterface.mac");
			if (attr != null) {
				// Create the attribute and set his value.
				// attr = createAttribute("occi.networkinterface.mac", macAddress);
				// this.getAttributes().add(attr);
			// } else {
				attr.setValue(macAddress);
			}
		}

		// TODO : Gateway value, how to get this value ? not found on guest object.
		
		
		// allocation value (dynamic or static).
//		String allocation;
//		if (dhcpMode) {
//			allocation = "dynamic";
//		} else {
//			allocation = "static";
//		}
		// Set the allocation.
//		AttributeState attrib = this.getAttributeStateObject("occi.networkinterface.allocation");
//		if (attrib == null) {
//			// Create the attribute and set his value.
//
//			attrib = createAttribute("occi.networkinterface.allocation", allocation);
//			this.getAttributes().add(attrib);
//		} else {
//			attrib.setValue(allocation);
//		}

		// May be null if the device is not started...

		if (vEthDevice != null && vEthDevice.getConnectable() != null) {
			if (vEthDevice.getConnectable().connected) {
				this.setState(NetworkInterfaceStatus.ACTIVE);
			} else {
				this.setState(NetworkInterfaceStatus.INACTIVE);
			}
			
			// Wake on lan value
//			wakeOnLan = vEthDevice.getWakeOnLanEnabled();
//			String wakeOnLanStr = wakeOnLan.toString();
//			AttributeState attr = this.getAttributeStateObject("occi.networkinterface.wakeonlan");
//			if (attr == null) {
//				// Create the attribute and set his value.
//				attr = createAttribute("occi.networkinterface.wakeonlan", wakeOnLanStr);
//				this.getAttributes().add(attr);
//			} else {
//				attr.setValue(wakeOnLanStr);
//			}

		}

		// TODO : move networkpart in network connector via occiRetrieve. 
		
		if (vEthDevice != null && netConn != null) {

			// Get the attached vswitch for device.
			HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);
			if (host == null) {
				LOGGER.error("No host found for this vm : " + vmName);
				VCenterClient.disconnect();
				return;
			}
			HostPortGroup portGroup = NetworkHelper.findPortGroup(host, networkName);
			if (portGroup == null) {
				LOGGER.error("No portGroup found cant retrieve vswitch informations.");
				VCenterClient.disconnect();
			}

			String vSwitchName = portGroup.getSpec().getVswitchName();
			int vlanId = portGroup.getSpec().getVlanId();

			netConn.setTitle(vSwitchName);
			netConn.setVlan(vlanId);
			netConn.setLabel(networkName);

			// Set the network state.
			if (vEthDevice.getConnectable().connected && netConn != null) {
				netConn.setState(NetworkStatus.ACTIVE);
			} else {
				if (netConn != null) {
					// TODO : How to check that vswitch / port group is active ?
					
					
					netConn.setState(NetworkStatus.INACTIVE);
				}
			}
		}
		if (vEthDevice == null) {
			if (netConn != null) {
				netConn.setLabel(networkName);
			}
			this.setState(NetworkInterfaceStatus.INACTIVE);

			LOGGER.warn("No ethernet device found. Cant retrieve informations about network.");
			VCenterClient.disconnect();
			return;
		}
		
		VCenterClient.disconnect();

	}

	/**
	 * Called when this Networkinterface instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		// TODO : Change ipAddress, change Mac address, dhcp active/inactive
		// etc.
		// Note: vmName is set with this method.
		VirtualMachine vm = getVirtualMachineFromLinks();

		if (vm == null) {
			LOGGER.warn("The linked virtual machine doesnt exist on Vcenter, no network to retrieve.");
			// No vm adapter found so.
			VCenterClient.disconnect();
			return;
		}

		// Get the linked Network connector.
		NetworkConnector netConn = getLinkedNetwork();

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkName != null && networkName.isEmpty()) {
			networkName = null;
		}
		if (oldNetworkAdapterName == null) {
			oldNetworkAdapterName = networkAdapterName;
		}
		if (oldNetworkAdapterName != null && networkAdapterName != null
				&& !oldNetworkAdapterName.equals(networkAdapterName)) {
			// Change the label name of the adapter.
			VirtualEthernetCard vEthDevice = NetworkHelper.findVirtualEthernetCardForVM(oldNetworkAdapterName, vm);
			if (vEthDevice == null) {
				LOGGER.warn("no virtual device for this name: " + oldNetworkAdapterName
						+ " , cant update the network device: " + oldNetworkAdapterName + " on vm: " + vmName);
				oldNetworkAdapterName = null;
				VCenterClient.disconnect();
				return;
			}
			vEthDevice.setExternalId(networkAdapterName);
			Description desc = vEthDevice.getDeviceInfo();
			desc.setLabel(networkAdapterName);
			vEthDevice.setDeviceInfo(desc);

			VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
			VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
			nicSpec.setOperation(VirtualDeviceConfigSpecOperation.edit);
			nicSpec.setDevice(vEthDevice);
			VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
			vmConfigSpec.setDeviceChange(nicSpecArray);
			// Launch the reconfig task.
			// Launch the task.
			Task task;
			try {
				task = vm.reconfigVM_Task(vmConfigSpec);
				task.waitForTask();

			} catch (RemoteException | InterruptedException e) {
				LOGGER.error(
						"Error while updating a network adapter : " + networkAdapterName + " --< from vm : " + vmName,
						e);
				LOGGER.error("Message: " + e.getMessage());
				VCenterClient.disconnect();
				return;
			}

			TaskInfo taskInfo;
			try {
				taskInfo = task.getTaskInfo();
				if (taskInfo.getState() != TaskInfoState.success) {
					MethodFault fault = taskInfo.getError().getFault();
					LOGGER.error(
							"Error while updating a network adapter : " + networkAdapterName + " --< on vm : " + vmName,
							fault.detail);
					LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
				} else {
					LOGGER.info("The network : " + networkAdapterName + " is updated on virtual machine : " + vmName);
				}
			} catch (RemoteException e) {
				LOGGER.error(
						"Error while updating an network adapter : " + networkAdapterName + " --< to vm : " + vmName,
						e);
				LOGGER.error("Message : " + e.getMessage());
			}

		} else {
			LOGGER.warn("No value change, cant update.");
		}

		VCenterClient.disconnect();
	}

	/**
	 * Called when this Networkinterface instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			LOGGER.warn("No virtual machine is linked on the network.");
			VCenterClient.disconnect();
			return;
		}

		// Check if the network nic device exist.
		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			LOGGER.warn("No network adapter name setted. Cant delete the network.");
			VCenterClient.disconnect();
			return;
		}

		boolean nicExist = NetworkHelper.isNICExist(networkAdapterName, vm);
		if (!nicExist) {
			LOGGER.warn(
					"This network adapter: " + networkAdapterName + " doesnt exist for the virtual machine: " + vmName);
			VCenterClient.disconnect();
			return;
		}

		// Remove this device.
		// Load the eth device.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			LOGGER.error("Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for deletion on virtual machine : " + vmName);
			VCenterClient.disconnect();
			return;
		}

		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
		VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
		nicSpec.setOperation(VirtualDeviceConfigSpecOperation.remove);
		nicSpec.setDevice(vEth);
		VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
		vmConfigSpec.setDeviceChange(nicSpecArray);

		// Launch the task.
		Task task;
		try {
			task = vm.reconfigVM_Task(vmConfigSpec);
			task.waitForTask();

		} catch (RemoteException | InterruptedException e) {
			LOGGER.error("Error while deleting a network adapter : " + networkAdapterName + " --< from vm : " + vmName,
					e);
			LOGGER.error("Message: " + e.getMessage());
			return;
		}

		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				LOGGER.error(
						"Error while deleting a network adapter : " + networkAdapterName + " --< from vm : " + vmName,
						fault.detail);
				LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
			} else {
				LOGGER.info("The network : " + networkAdapterName + " is removed from virtual machine : " + vmName);
			}
		} catch (RemoteException e) {
			LOGGER.error("Error while deleting an network adapter : " + networkAdapterName + " --< to vm : " + vmName,
					e);
			LOGGER.error("Message : " + e.getMessage());
		}
		VCenterClient.disconnect();

	}

	//
	// Networkinterface actions.
	//
	/**
	 * Connect a network adapter.
	 */
	public void up() {
		LOGGER.debug("Action up() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			LOGGER.warn("No virtual machine is linked on the network.");
			VCenterClient.disconnect();
			return;
		}

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			LOGGER.warn("No network adapter name setted. Cant load the network information.");
			VCenterClient.disconnect();
			return;
		}

		// Load the virtual ethernet card object from vm.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			LOGGER.error("Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for action up, on virtual machine : " + vmName);
			VCenterClient.disconnect();
			return;
		}
		// Load the connect info.
		VirtualDeviceConnectInfo connectInfo = vEth.getConnectable();
		if (connectInfo == null) {
			LOGGER.error("No connection information is found for this network : " + networkAdapterName);
			VCenterClient.disconnect();
			return;
		}
		boolean result = false;

		NetworkConnector netConn = getLinkedNetwork();
		// Network State Machine.
		switch (getState().getValue()) {

		case NetworkInterfaceStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"up\")...");
			if (connectInfo.isConnected()) {
				// Disconnect and reconnect.
				result = NetworkHelper.down(vm, vEth);
				if (result) {
					this.setState(NetworkInterfaceStatus.INACTIVE);
					result = NetworkHelper.up(vm, vEth);
				}
			} else {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		case NetworkInterfaceStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"up\")...");
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		case NetworkInterfaceStatus.ERROR_VALUE:
			LOGGER.debug("Fire transition(state=error, action=\"up\")...");
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;

		default:
			if (!connectInfo.isConnected()) {
				result = NetworkHelper.up(vm, vEth);
			}
			break;
		}

		if (result) {
			LOGGER.info("The network adapter : " + networkAdapterName + " is connected.");
			this.setState(NetworkInterfaceStatus.ACTIVE);
			if (netConn != null) {
				netConn.setState(NetworkStatus.ACTIVE);
			}
		} else {
			if (connectInfo.isConnected()) {
				LOGGER.info("The network adapter: " + networkAdapterName + " was already connected.");
				this.setState(NetworkInterfaceStatus.ACTIVE);
				if (netConn != null) {
					netConn.setState(NetworkStatus.ACTIVE);
				}
			} else {
				LOGGER.warn("The network adapter is not connected, check your configuration.");
				this.setState(NetworkInterfaceStatus.INACTIVE);
			}
		}

		VCenterClient.disconnect();
	}

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/network/action# - term: down -
	 * title:
	 */
	public void down() {
		LOGGER.debug("Action down() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// Load the virtual machine.
		VirtualMachine vm = getVirtualMachineFromLinks();
		if (vm == null) {
			LOGGER.warn("No virtual machine is linked on the network.");
			VCenterClient.disconnect();
			return;
		}

		networkAdapterName = this.getTitle();

		if (networkAdapterName != null && networkAdapterName.isEmpty()) {
			networkAdapterName = null;
		}
		if (networkAdapterName == null) {
			LOGGER.warn("No network adapter name setted. Cant load the network information.");
			VCenterClient.disconnect();
			return;
		}

		// Load the virtual ethernet card object from vm.
		VirtualEthernetCard vEth = NetworkHelper.findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (vEth == null) {
			LOGGER.error("Cant retrieve virtual ethernet card: " + networkAdapterName
					+ " for action up, on virtual machine : " + vmName);
			VCenterClient.disconnect();
			return;
		}
		// Load the connect info.
		VirtualDeviceConnectInfo connectInfo = vEth.getConnectable();
		if (connectInfo == null) {
			LOGGER.error("No connection information is found for this network : " + networkAdapterName);
			VCenterClient.disconnect();
			return;
		}
		boolean result = false;

		NetworkConnector netConn = getLinkedNetwork();
		// Network State Machine.
		if (connectInfo.isConnected()) {
			result = NetworkHelper.down(vm, vEth);
			if (!result) {
				this.setState(NetworkInterfaceStatus.ACTIVE);
				if (netConn != null) {
					netConn.setState(NetworkStatus.ACTIVE);
				}
			}
		}
		if (result) {
			this.setState(NetworkInterfaceStatus.INACTIVE);
		}

		VCenterClient.disconnect();
	}

	/**
	 * Get the linked virtual machine object.
	 * 
	 * @return a virtual machine object, or null if none.
	 */
	public VirtualMachine getVirtualMachineFromLinks() {
		VirtualMachine vm = null;

		if (this.getSource() instanceof ComputeConnector) {
			ComputeConnector compute = (ComputeConnector) this.getSource();

			if (compute != null) {
				// Get vm title and search in vcenter.
				this.vmName = compute.getTitle();
				Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
				vm = VMHelper.findVMForName(rootFolder, vmName);
			}
		}
		return vm;
	}

	/**
	 * Get the network interface designed for this vm.
	 * 
	 * @return a {@link NetworkinterfaceConnector} object, null if none.
	 */
	private NetworkConnector getLinkedNetwork() {
		NetworkConnector conn = null;
		conn = (NetworkConnector) this.getTarget();
		return conn;
	}

	/**
	 * Get the port group name (port group name), or allocate an vswitch and
	 * port group if no network.
	 * 
	 * @param vm
	 * @param netConn
	 * @return
	 */
	public String getVMHostNetworkName(VirtualMachine vm, NetworkConnector netConn) {

		Network[] networks = null;
		try {
			networks = vm.getNetworks();
			if (networks == null) {
				// No network found. No value to retrieve.
				LOGGER.warn("No network found, no values to retrieve.");

				return networkName;
			}
			if (netConn == null) {
				// No network designed.
				// Search the first default interface.
				Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();
				HostSystem host = VMHelper.findHostSystemForVM(rootFolder, vmName);
				Allocator allocator = new AllocatorImpl(rootFolder);
				allocator.setHost(host);
				Network net = allocator.allocateNetwork();
				if (net != null) {
					networkName = net.getName();
				} else {
					LOGGER.error("The host " + host.getName() + " has no network.");
					return networkName;
				}

			} else {
				// A network interface is defined.
				if (netConn.getLabel() == null || netConn.getLabel().isEmpty()) {
					// No host network name is defined.
					networkName = null;
					return networkName;

				}

				for (Network network : networks) {
					if (network.getName().equals(netConn.getLabel())) {
						networkName = network.getName();
						break;
					}
				}

			}

		} catch (RemoteException ex) {
			LOGGER.error("Cant get default network for vm : " + vmName);
		}
		return networkName;
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

	public String getNetworkAdapterName() {
		return networkAdapterName;
	}

	public void setNetworkAdapterName(String networkAdapterName) {
		this.networkAdapterName = networkAdapterName;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String hostNetworkName) {
		this.networkName = hostNetworkName;
	}

}
