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
import java.util.LinkedList;
import java.util.List;

import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.VirtualSwitchNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.Description;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostNetworkPolicy;
import com.vmware.vim25.HostPortGroup;
import com.vmware.vim25.HostPortGroupSpec;
import com.vmware.vim25.HostVirtualNicSpec;
import com.vmware.vim25.HostVirtualSwitch;
import com.vmware.vim25.HostVirtualSwitchConfig;
import com.vmware.vim25.HostVirtualSwitchSpec;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.MethodFault;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDeviceConfigSpecOperation;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import com.vmware.vim25.VirtualE1000;
import com.vmware.vim25.VirtualE1000e;
import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualEthernetCardNetworkBackingInfo;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualPCNet32;
import com.vmware.vim25.VirtualVmxnet;
import com.vmware.vim25.VirtualVmxnet2;
import com.vmware.vim25.VirtualVmxnet3;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.HostNetworkSystem;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * Helper for network operations.
 * 
 * @author Christophe Gourdin - Inria.
 *
 */
public class NetworkHelper {

	private static Logger LOGGER = LoggerFactory.getLogger(NetworkHelper.class);

	public static final String NETWORK = "Network";
	public static final String HOST_NETWORK_SYSTEM = "HostNetworkSystem";
	public static final String HOST_FIREWALL_SYSTEM = "HostFirewallSystem";
	public static final String HOST_SNMP_SYSTEM = "HostSnmpSystem";
	public static final String HOST_SERVICE_SYSTEM = "HostServiceSystem";
	public static final String HOST_VMOTION_SYSTEM = "HostVMotionSystem";
	public static final String DISTRIBUTED_VSWITCH = "DistributedVirtualSwitch";
	public static final String STANDARD_VSWITCH = "HostVirtualSwitch";
	// "generated", "manual", "assigned"
	/**
	 * Warning: these are for mac address.
	 */
	public static final String MODE_NETWORK_ADDRESS_GENERATED = "generated";
	public static final String MODE_NETWORK_ADDRESS_MANUAL = "manual";
	public static final String MODE_NETWORK_ADDRESS_ASSIGNED = "assigned";

	/**
	 * Find a list of ethernet device for a vm with the specified
	 * hostnetworkname.
	 * 
	 * @param hostNetworkName
	 * @param vm
	 * @return {@link List}{@link VirtualEthernetCard} if none, empty list is
	 *         returned.
	 */
	public static List<VirtualEthernetCard> findNetDeviceForHostNetName(final String hostNetworkName,
			VirtualMachine vm) {
		List<VirtualEthernetCard> vEths = new ArrayList<VirtualEthernetCard>();
		VirtualMachineConfigInfo config = vm.getConfig();
		VirtualHardware hw = config.getHardware();
		VirtualDevice[] devices = hw.getDevice();
		for (VirtualDevice device : devices) {
			if (device instanceof VirtualEthernetCard) {
				VirtualEthernetCard vEth = (VirtualEthernetCard) device;
				VirtualDeviceBackingInfo properties = vEth.getBacking();
				VirtualEthernetCardNetworkBackingInfo nicBacking = (VirtualEthernetCardNetworkBackingInfo) properties;
				if (nicBacking != null && nicBacking.getDeviceName().equals(hostNetworkName)) {
					// Device is in hostNetworkName field.
					vEths.add(vEth);
				}
			}
		}

		return vEths;
	}

	/**
	 * Find a specific virtual ethernet card on vm for the ethernet card name or
	 * externalId property.
	 * 
	 * @param networkAdapterName
	 * @param vm
	 * @return a {@link VirtualEthernetCard} object or null if none is found.
	 */
	public static VirtualEthernetCard findVirtualEthernetCardForVM(final String networkAdapterName,
			final VirtualMachine vm) {
		VirtualEthernetCard result = null;
		VirtualEthernetCard vEth = null;
		String externalId = null;
		String deviceName = null;
		if (vm == null) {
			return result;
		}
		VirtualDevice[] vdevices = vm.getConfig().getHardware().getDevice();
		if (vdevices == null) {
			return result;
		}

		for (VirtualDevice device : vdevices) {
			if (device instanceof VirtualEthernetCard) {
				vEth = (VirtualEthernetCard) device;
				// Get the name.
				deviceName = vEth.getDeviceInfo().getLabel();
				externalId = vEth.getExternalId();
				if (deviceName != null && deviceName.equals(networkAdapterName)) {
					result = vEth;
					break;
				}
				if (externalId != null && externalId.equals(networkAdapterName)) {
					result = vEth;
					break;
				}
			}
		}

		return result;
	}

	/**
	 * Get all virtual ethernet card object for a VM.
	 * 
	 * @param vm
	 * @return
	 */
	public static List<VirtualEthernetCard> getNetworkAdaptersForVM(String vmName) {
		List<VirtualEthernetCard> vEths = new ArrayList<VirtualEthernetCard>();
		if (vmName == null) {
			return vEths;
		}

		VirtualEthernetCard vEth;

		Folder rootFolder = VCenterClient.getServiceInstance().getRootFolder();

		VirtualMachine vm = VMHelper.findVMForName(rootFolder, vmName);

		VirtualDevice[] vdevices = vm.getConfig().getHardware().getDevice();
		for (VirtualDevice device : vdevices) {
			if (device instanceof VirtualEthernetCard) {
				vEth = (VirtualEthernetCard) device;
				vEths.add(vEth);
			}
		}
		return vEths;
	}

	/**
	 * Return the type of virtual device. (E1000, PCnet32, vmxnet etc.)
	 * 
	 * @param vEth
	 * @return the network adapter type or "unknown" if newer types.
	 */
	public static String getVirtualDeviceAdapterType(VirtualEthernetCard vEth) {
		String type = null;
		if (vEth instanceof VirtualE1000) {
			type = "E1000";
		} else if (vEth instanceof VirtualE1000e) {
			type = "E1000E";
		} else if (vEth instanceof VirtualPCNet32) {
			type = "PCnet32";
		} else if (vEth instanceof VirtualVmxnet) {
			type = "Vmxnet";
		} else if (vEth instanceof VirtualVmxnet2) {
			type = "Vmxnet2";
		} else if (vEth instanceof VirtualVmxnet3) {
			type = "Vmxnet3";
		} else {
			type = "unknown";
		}

		return type;
	}

	/**
	 * Check if a nic exist on virtual machine.
	 * 
	 * @param networkAdapterName
	 * @param vm
	 * @return true if exist, false otherwise.
	 */
	public static boolean isNICExist(String networkAdapterName, VirtualMachine vm) {
		boolean exist = false;
		VirtualEthernetCard eth = findVirtualEthernetCardForVM(networkAdapterName, vm);
		if (eth != null) {
			exist = true;
		}
		return exist;

	}

	/**
	 * Check if hostnetwork exist for a name.
	 * 
	 * @param hostNetworkName
	 * @param host
	 * @return
	 */
	public static boolean isHostNetworkExist(String hostNetworkName, HostSystem host) {
		boolean exist = false;
		try {
			Network[] networks = host.getNetworks();
			if (networks != null) {
				for (Network network : networks) {
					String hostNetwork = network.getName();
					if (hostNetwork.equals(hostNetworkName)) {
						exist = true;
						break;
					}
				}
			}
		} catch (RemoteException ex) {
			LOGGER.error("Error while reading networks on host: " + host.getName(), ex);
			LOGGER.error("Message: " + ex.getMessage());
		}

		return exist;
	}

	/**
	 * Create device spec for network adapter (nic).
	 * 
	 * @param netName
	 * @param nicName
	 * @param mode
	 *            ("generated", "manual", "assigned" by VC),this mode set the
	 *            mac address.
	 * @param ipAddress
	 *            (ex: 192.168.1.1)
	 * @return
	 */
	public static VirtualDeviceConfigSpec createNicSpec(String netName, String nicName, String mode, String ipAddress) {
		// TODO : Set ipAddress manually. via HostVirtualNicSpec see vijava
		// sample AddVirtualNic..it is for vswitch not the nic for virtual
		// machine.

		VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
		nicSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
		// TODO : Choose adapter type. E1000, pcnet etc.
		// VirtualEthernetCard nic = new VirtualPCNet32();
		VirtualEthernetCard nic = new VirtualE1000();

		VirtualEthernetCardNetworkBackingInfo nicBacking = new VirtualEthernetCardNetworkBackingInfo();
		nicBacking.setDeviceName(netName);

		if (mode.equals(MODE_NETWORK_ADDRESS_MANUAL)) {
			// TODO : Customize macAdress, manual configuration mode.
		}

		nic.setAddressType(mode);
		nic.setBacking(nicBacking);
		nic.setKey(0);
		LOGGER.info("Creating Network adapter : " + nicName + " on network: " + netName + " in progress...");

		Description info = new Description();
		info.setLabel(nicName);
		info.setSummary(netName);
		nic.setDeviceInfo(info);
		nic.setExternalId(nicName);

		VirtualDeviceConnectInfo connectInfo = new VirtualDeviceConnectInfo();
		connectInfo.setAllowGuestControl(true);
		connectInfo.setStartConnected(true);
		connectInfo.setConnected(true);
		nic.setConnectable(connectInfo);
		nicSpec.setDevice(nic);
		return nicSpec;
	}

	/**
	 * Create a new VSwitch and create a port group attached.
	 * 
	 * @param vSwitchName,
	 *            the vSwitch name.
	 * @param portGroupName,
	 *            this is here the network name.
	 * @param nbSwitchPort
	 *            (default to 8 if nb port = 0).
	 * @param vlanId
	 *            : the VLAN id to associate
	 * @param host
	 *            : the host real machine
	 * @param macAddress
	 *            : if null, mac address is set automatically
	 * @param ipAddress
	 *            IP Address to VMKernel.
	 * @param subnetMask
	 * @param dhcpMode
	 *            : true dhcp mode, false manual ip addressing mode.
	 * @return
	 * @throws RemoteException
	 * @throws RuntimeFault
	 * @throws InvalidProperty
	 */
	public static HostNetworkSystem createVSwitch(String vSwitchName, String portGroupName, int nbSwitchPort,
			int vlanId, HostSystem host, String macAddress, String ipAddress, String subnetMask, boolean dhcpMode)
			throws InvalidProperty, RuntimeFault, RemoteException {

		HostNetworkSystem hns = host.getHostNetworkSystem();
		// add a virtual switch
		HostVirtualSwitchSpec spec = new HostVirtualSwitchSpec();
		if (nbSwitchPort == 0) {
			nbSwitchPort = 8;
		}
		spec.setNumPorts(nbSwitchPort);
		hns.addVirtualSwitch(vSwitchName, spec);

		// add a port group
		HostPortGroupSpec hpgs = new HostPortGroupSpec();
		hpgs.setName(portGroupName);
		hpgs.setVlanId(vlanId); // 0 ==> not associated with a VLAN
		hpgs.setVswitchName(vSwitchName);
		hpgs.setPolicy(new HostNetworkPolicy());
		hns.addPortGroup(hpgs);

		// add a virtual NIC to VMKernel
		HostVirtualNicSpec hvns = new HostVirtualNicSpec();
		// If a mac address is set.
		if (macAddress != null) {
			hvns.setMac(macAddress);
		}
		HostIpConfig hic = new HostIpConfig();

		hic.setDhcp(dhcpMode);
		if (!dhcpMode) {
			if (ipAddress != null) {
				hic.setIpAddress(ipAddress);
			}
			if (subnetMask != null) {
				hic.setSubnetMask(subnetMask);
			}
		}

		hvns.setIp(hic);

		String result = hns.addVirtualNic("VMKernel", hvns);

		LOGGER.info(result);

		return hns;

	}

	/**
	 * Retrieve a hostPortGroup object to get vswitch info and port group info.
	 * 
	 * @param host
	 * @param networkName
	 *            (portGroupName)
	 * @return a {@link HostPortGroup} if none found, null value is returned.
	 */
	public static HostPortGroup findPortGroup(HostSystem host, String networkName) {
		HostPortGroup portGroupResult = null;
		try {
			HostPortGroup[] portGroups = host.getHostNetworkSystem().getNetworkInfo().getPortgroup();
			if (portGroups == null) {
				LOGGER.error("No port group on host: " + host.getName());
				return portGroupResult;
			}
			for (HostPortGroup portGroup : portGroups) {
				if (portGroup.getSpec().getName().equals(networkName)) {
					portGroupResult = portGroup;
					break;
				}

			}
		} catch (RemoteException ex) {
			LOGGER.error("Cant find hostPortGroup: " + networkName + "  on host: " + host.getName());
			LOGGER.error("Message: " + ex.getMessage());
			ex.printStackTrace();
		}
		return portGroupResult;
	}

	/**
	 * Find a standard vswitch by name on a host system.
	 * 
	 * @param host
	 * @param vSwitchName
	 * @return
	 * @throws VirtualSwitchNotFoundException
	 */
	public static HostVirtualSwitch findVSwitch(HostSystem host, String vSwitchName)
			throws VirtualSwitchNotFoundException {
		HostVirtualSwitch vSwitch = null;
		try {

			if (vSwitchName == null) {
				throw new VirtualSwitchNotFoundException("No virtual switch name defined, cant find the vswitch.");
			}

			if (host == null) {
				throw new VirtualSwitchNotFoundException(
						"No host defined, cant find the standard virtual switch : " + vSwitchName);
			}

			HostVirtualSwitch[] vswitchs = host.getHostNetworkSystem().getNetworkInfo().getVswitch();
			if (vswitchs == null) {
				throw new VirtualSwitchNotFoundException(
						"The virtual switch : " + vSwitchName + " has not been found on host : " + host.getName());
			}
			for (HostVirtualSwitch standardSwitch : vswitchs) {

				if (standardSwitch.getName().equals(vSwitchName)) {
					vSwitch = standardSwitch;
					break;
				}
			}
			if (vSwitch == null) {
				throw new VirtualSwitchNotFoundException(
						"The virtual switch : " + vSwitchName + " has not been found on host : " + host.getName());
			}

		} catch (RemoteException ex) {
			LOGGER.error("Cant find standard virtual switch");
			LOGGER.error("Message: " + ex.getMessage());
			ex.printStackTrace();
		}

		return vSwitch;
	}

	/**
	 * Action up on network adapter on vm.
	 * 
	 * @param vm
	 * @param vEth
	 * @return
	 */
	public static boolean up(VirtualMachine vm, VirtualEthernetCard vEth) {
		boolean result = false;
		VirtualDeviceConnectInfo connect = vEth.getConnectable();
		if (!connect.isConnected()) {
			connect.setConnected(true);
			vEth.setConnectable(connect);
		}

		// Launch the task.
		result = launchUpDownTask(vm, vEth, true);

		return result;
	}

	/**
	 * Action down on network adapter on vm.
	 * 
	 * @param vm
	 * @param vEth
	 * @return
	 */
	public static boolean down(VirtualMachine vm, VirtualEthernetCard vEth) {
		boolean result = false;
		// Get connect info.
		VirtualDeviceConnectInfo connect = vEth.getConnectable();
		if (connect.isConnected()) {
			connect.setConnected(false);
			vEth.setConnectable(connect);
		}
		result = launchUpDownTask(vm, vEth, false);
		return result;

	}

	/**
	 * The the task for disconnection or connection.
	 * 
	 * @param vm
	 * @param vEth
	 * @param from
	 * @return true if the task succeed.
	 */
	private static boolean launchUpDownTask(VirtualMachine vm, VirtualEthernetCard vEth, boolean from) {
		boolean result = false;
		VirtualMachineConfigSpec vmConfigSpec = new VirtualMachineConfigSpec();
		VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
		nicSpec.setOperation(VirtualDeviceConfigSpecOperation.edit);
		nicSpec.setDevice(vEth);
		VirtualDeviceConfigSpec[] nicSpecArray = { nicSpec };
		vmConfigSpec.setDeviceChange(nicSpecArray);
		String externalId = vEth.getExternalId();
		String name = null;
		if (externalId == null) {
			name = vEth.getDeviceInfo().getLabel();
		} else {
			name = externalId;
		}
		String status;
		if (from) {
			status = "connected";
		} else {
			status = "disconnected";
		}

		// Launch the task.
		Task task;
		try {
			task = vm.reconfigVM_Task(vmConfigSpec);
			task.waitForTask();

		} catch (RemoteException e) {
			LOGGER.error("Error while " + status + " a network adapter : " + name + " --< from vm : " + vm.getName(),
					e);
			LOGGER.error("Message: " + e.getMessage());
			return result;
		} catch (InterruptedException e) {
			LOGGER.error("Error while " + status + " a network adapter : " + name + " --< from vm : " + vm.getName(),
					e);
			LOGGER.error("Message: " + e.getMessage());
			return result;
		}

		TaskInfo taskInfo;
		try {
			taskInfo = task.getTaskInfo();
			if (taskInfo.getState() != TaskInfoState.success) {
				MethodFault fault = taskInfo.getError().getFault();
				LOGGER.error(
						"Error while " + status + " a network adapter : " + name + " --< from vm : " + vm.getName(),
						fault.detail);
				LOGGER.error("Fault message: " + fault.getMessage() + fault.getClass().getName());
			} else {
				LOGGER.info("The network : " + name + " is " + status + " from virtual machine : " + vm.getName());
				result = true;
			}
		} catch (RemoteException e) {
			LOGGER.error("Error while " + status + " an network adapter : " + name + " --< to vm : " + vm.getName(), e);
			LOGGER.error("Message : " + e.getMessage());
		}

		return result;
	}

}
