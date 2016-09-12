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
 *
 * Generated at Fri Sep 09 14:22:40 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.vmware.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/vmware#
 * - term: vm
 * - title: Virtual machine compute on a host system
 */
public class VmConnector extends org.occiware.clouddesigner.occi.vmware.impl.VmImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(VmConnector.class);

	/**
	 * Constructs a vm connector.
	 */
	VmConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Vm instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Vm instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Vm instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Vm instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Vm actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: cloneVM
     * - title: Clone a virtual machine
	 */
	@Override
	public void cloneVM()
	{
		LOGGER.debug("Action cloneVM() called on " + this);

		// TODO: Implement how to cloneVM this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: mountVmwareToolsdisk
     * - title: Mount vmware tools iso
	 */
	@Override
	public void mountVmwareToolsdisk()
	{
		LOGGER.debug("Action mountVmwareToolsdisk() called on " + this);

		// TODO: Implement how to mountVmwareToolsdisk this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: markAsTemplate
     * - title: Mark this virtual machine as a template image
	 */
	@Override
	public void markAsTemplate()
	{
		LOGGER.debug("Action markAsTemplate() called on " + this);

		// TODO: Implement how to markAsTemplate this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: markAsVirtualMachine
     * - title: Mark this template image as a virtual machine
	 */
	@Override
	public void markAsVirtualMachine()
	{
		LOGGER.debug("Action markAsVirtualMachine() called on " + this);

		// TODO: Implement how to markAsVirtualMachine this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: registerVM
     * - title: Register this virtual machine on vcenter
	 */
	@Override
	public void registerVM()
	{
		LOGGER.debug("Action registerVM() called on " + this);

		// TODO: Implement how to registerVM this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: unregisterVM
     * - title: Unregister this virtual machine from vcenter
	 */
	@Override
	public void unregisterVM()
	{
		LOGGER.debug("Action unregisterVM() called on " + this);

		// TODO: Implement how to unregisterVM this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: defragmentAllDisks
     * - title: Defragment all virtual disk on this virtual machine
	 */
	@Override
	public void defragmentAllDisks()
	{
		LOGGER.debug("Action defragmentAllDisks() called on " + this);

		// TODO: Implement how to defragmentAllDisks this vm.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/vm/action#
     * - term: resetLocationId
     * - title: 128-bit hash based on the virtual machine's configuration file location and the UUID of the host assigned to run the virtual machine.Normally, this property is not set by a client, allowing the Virtual Infrastructure environment to assign a location ID when the virtual machine is created. However, if the virtual machine's configuration file has been manually moved, it may be desirable to clear this property, setting it to an empty string, so the property is regenerated.Reconfigure privilege: VirtualMachine.Config.Settings
	 */
	@Override
	public void resetLocationId()
	{
		LOGGER.debug("Action resetLocationId() called on " + this);

		// TODO: Implement how to resetLocationId this vm.
	}

}	
