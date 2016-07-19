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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.Description;
import com.vmware.vim25.GuestNicInfo;
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
import com.vmware.vim25.mox.VirtualMachineDeviceManager;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xtext.ecoreInference.EClassifierInfo.EClassInfo.FindResult;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatacenterNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatastoreNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.VirtualSwitchNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.Allocator;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.HostHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.NetworkHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;
import org.occiware.clouddesigner.occi.util.OcciHelper;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://schemas.ogf.org/occi/infrastructure# - term: network - title: Network
 * Resource
 */
public class NetworkConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkConnector.class);

	private static final String OCCI_ATTRIBUTE_HOSTSYSTEM_NAME = "occi.network.vmware.hostsystemname";
	private static final String OCCI_ATTRIBUTE_VSWITCH_NBPORT = "occi.network.vmware.nbport";
	
	
	
	/**
	 * Represent the physical compute which be used for this standard switch.
	 */
	private String hostSystemName = null;

	/**
	 * Constructs a network connector.
	 */
	NetworkConnector() {
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Network instance is completely created.
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

		String vSwitchName = this.getTitle();
		String networkName = this.getLabel();

		if (vSwitchName == null) {
			// No name ==> no vswitch.
			LOGGER.warn("The vswitch name is not setted, please check your configuration (attribute title).");
			VCenterClient.disconnect();
			return;
		}
		Allocator allocator = new AllocatorImpl(rootFolder);

		// Create a new vSwitch and add his network name.

		// 1 : Check if this vSwitch exist.

		// Get the attribute value for occi.network.vmware.hostsystemname.
		hostSystemName = this.getAttributeValueByOcciKey(OCCI_ATTRIBUTE_HOSTSYSTEM_NAME);
		if (hostSystemName == null) {
			// Get the host system if set on computes link via network adapters
			// and set it.
			findAndSetHostSystemNameFromLinkedVMs();
		}
		if (hostSystemName == null) {
			// Auto allocation.
			LOGGER.info("Auto allocating a host system");
			allocator.allocateDatacenter();
			allocator.allocateCluster();
			allocator.allocateHostSystem();
		}

		if (hostSystemName == null) {
			LOGGER.error(
					"Cant create the vswitch and port group, no host system defined, please set the attribute occi.network.vmware.hostsystemname");
			VCenterClient.disconnect();
			return;
		}
		// Load the hostsystem object.
		
		HostSystem host = HostHelper.findHostSystemForName(rootFolder, this.getHostSystemName());
		if (host == null) {
			LOGGER.error("The host system : " + hostSystemName + " doesnt exist on vCenter with your ids.");
			VCenterClient.disconnect();
			return;
		}
		HostVirtualSwitch hostVswitch = null;
		try {
			hostVswitch = NetworkHelper.findVSwitch(host, vSwitchName);
		} catch (VirtualSwitchNotFoundException ex) {
			// no op.
		}
		if (hostVswitch == null) {
			String nbPortStr = this.getAttributeValueByOcciKey(OCCI_ATTRIBUTE_VSWITCH_NBPORT);
			if (nbPortStr == null || nbPortStr.isEmpty()) {
				nbPortStr = "8";
			}
			int nbPort = 8;
			try {
				nbPort = Integer.valueOf(nbPortStr);
			} catch (NumberFormatException ex) {
				LOGGER.error("bad value for " + OCCI_ATTRIBUTE_VSWITCH_NBPORT);
				LOGGER.error("Cant create the vswitch.");
				VCenterClient.disconnect();
				return;
			}
			
			// Create the vswitch.
			// NetworkHelper.createVSwitch(vSwitchName, networkName, nbPort, this.getVlan(), host, macAddress, ipAddress, subnetMask, dhcpMode)
		} else {
			LOGGER.warn("Cant create the vswitch : " + vSwitchName + " for the host : " + hostSystemName + " , cause it already exist.");
			VCenterClient.disconnect();
			return;
		}
		
		// 2 : check if created.
		try {
			hostVswitch = NetworkHelper.findVSwitch(host, vSwitchName);
		} catch (VirtualSwitchNotFoundException ex) {
			LOGGER.warn("The vswitch is not created, please check your configuration.");
		}
		VCenterClient.disconnect();
		
	}

	/**
	 * Search on the linked virtual machine if any the host system name.
	 * 
	 * @return
	 */
	private void findAndSetHostSystemNameFromLinkedVMs() {
		String hostSysName;
		Configuration conf = OcciHelper.getConfiguration(this);

		List<Resource> resources = conf.getResources();
		ComputeConnector compute = null;
		Resource target;
		boolean found;
		for (Resource res : resources) {
			found = false;
			if (res instanceof ComputeConnector) {
				// Check if this compute is linked to this vswitch by his
				// adapters.
				EList<Link> links = res.getLinks();
				for (Link link : links) {
					if (link instanceof NetworkinterfaceConnector) {
						// Check if this network interface is linked to this
						// vswitch.
						target = link.getTarget();
						if (target != null && this.equals(target)) {
							// We found a compute linked to this network
							// vswitch.
							compute = (ComputeConnector) res;
							found = true;
							break;
						}
					}
				}
				if (found) {
					break;
				}

			}
		}
		if (compute != null) {
			// Get the host system name.
			// to be sure to get the host system name, we refresh this object
			// before.
			compute.occiRetrieve();

			if (compute.getHostSystemName() != null) {
				this.setHostSystemName(compute.getHostSystemName());
			}

		}

	}

	/**
	 * Called when this Network instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}
		List<Mixin> mixins;
		ServiceInstance si = VCenterClient.getServiceInstance();
		Folder rootFolder = si.getRootFolder();

		VCenterClient.disconnect();

	}

	/**
	 * Called when this Network instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// TODO : Update network name, update vlan id, update ipAddress etc.

		VCenterClient.disconnect();
	}

	/**
	 * Called when this Network instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// TODO : Remove vSwitch network and detach his linked adapters device
		// from network.

		VCenterClient.disconnect();
	}

	//
	// Network actions.
	//

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/network/action# - term: up -
	 * title:
	 */
	@Override
	public void up() {
		LOGGER.debug("Action up() called on " + this);

		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// Activate vswitch.

		VCenterClient.disconnect();
	}

	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/network/action# - term: down -
	 * title:
	 */
	@Override
	public void down() {
		LOGGER.debug("Action down() called on " + this);
		if (!VCenterClient.checkConnection()) {
			// Must return true if connection is established.
			return;
		}

		// TODO : Disconnect all network interfaces.

		VCenterClient.disconnect();
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

	public String getHostSystemName() {
		return hostSystemName;
	}

	public void setHostSystemName(String hostSystemName) {
		this.hostSystemName = hostSystemName;
		if (this.getAttributeValueByOcciKey(OCCI_ATTRIBUTE_HOSTSYSTEM_NAME) == null) {
			AttributeState attr = createAttribute(OCCI_ATTRIBUTE_HOSTSYSTEM_NAME, hostSystemName);
			this.getAttributes().add(attr);
		} else {
			// Update the attribute.
			AttributeState attr = getAttributeStateObject(OCCI_ATTRIBUTE_HOSTSYSTEM_NAME);
			attr.setValue(hostSystemName);
		}
	}

}
