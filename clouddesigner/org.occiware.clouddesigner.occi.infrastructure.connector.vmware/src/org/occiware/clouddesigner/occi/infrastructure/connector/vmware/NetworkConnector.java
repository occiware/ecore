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
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatacenterNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.DatastoreNotFoundException;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.Allocator;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator.AllocatorImpl;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatacenterHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.DatastoreHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.NetworkHelper;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VCenterClient;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.VMHelper;

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

		// TODO : Create a new vSwitch and set his network name.
		// 1 : Check if this vSwitch exist.
		
		// 2 : If not exist create it with default parameters.
		
		// 3 : check if created and connect adapters.
		
		
		VCenterClient.disconnect();

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
		
		// TODO : Remove vSwitch network and detach his linked adapters device from network.
		
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
		
		// TODO : Connect all the networks interface.

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
     * @param key ex: occi.core.title.
     * @return an AttributeState object, if attribute doesnt exist, null value is returned.
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
    
    /**
     * Get the connected computes to this network vswitch.
     * @return a list of connected computes.
     */
    public List<ComputeConnector> getComputes() {
    	List<ComputeConnector> computes = new ArrayList<ComputeConnector>();
    	
    	// Configuration config = OCCIHelper
    	
    	
    	
    	return computes;
    }
    
//    /**
//     * Get the connected network adapter interfaces with this network.
//     * @return a list of network adapter connector.
//     */
//    public List<NetworkinterfaceConnector> getNetworkInterfaces() {
//    	List<NetworkinterfaceConnector> networkInts = new ArrayList<>();
//    	
//    	
//    	
//    	
//    	return networkInts;
//    }
    
    
}
