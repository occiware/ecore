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
 * - term: virtualdisk
 * - title: A virtual disk
 */
public class VirtualdiskConnector extends org.occiware.clouddesigner.occi.vmware.impl.VirtualdiskImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(VirtualdiskConnector.class);

	/**
	 * Constructs a virtualdisk connector.
	 */
	VirtualdiskConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Virtualdisk instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualdisk instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualdisk instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Virtualdisk instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Virtualdisk actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/virtualdisk/action#
     * - term: zeroFill
     * - title: Overwrite all blocks of the virtual disk with zeros. All data will be lost.
The datacenter parameter may be omitted if a URL is used to name the disk.

Requires Datastore.FileManagement privilege on the datastore where the virtual disk resides.
	 */
	@Override
	public void zeroFill()
	{
		LOGGER.debug("Action zeroFill() called on " + this);

		// TODO: Implement how to zeroFill this virtualdisk.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/virtualdisk/action#
     * - term: shrink
     * - title: Shrink a sparse virtual disk.
The datacenter parameter may be omitted if a URL is used to name the disk.

The optional parameter copy specifies whether to shrink the disk in copy-shrink mode or in-place mode. In copy-shrink mode, additional space is required, but will result in a shrunk disk that is also defragmented. In-place shrink does not require additional space, but will increase fragmentation. The default behavior is to perform copy-shrink if the parameter is not specified.

Requires Datastore.FileManagement privilege on the datastore where the virtual disk resides.
	 */
	@Override
	public void shrink()
	{
		LOGGER.debug("Action shrink() called on " + this);

		// TODO: Implement how to shrink this virtualdisk.
	}

}	
