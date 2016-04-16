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
 * Generated at Sun Apr 17 01:09:07 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.dummy;

import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;

/**
 * Connector implementation for OCCI kind http://schemas.ogf.org/occi/infrastructure#storage.
 */
public class StorageConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl
{
	/**
	 * Constructs a storage connector.
	 */
	StorageConnector()
	{
		System.err.println("DEBUG constructor " + this);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/infrastructure/storage/action#online.
     */
	@Override
    public void online()
	{
		System.err.println("DEBUG online on " + this);

		// Dummy online implementation.

		setState(StorageStatus.ONLINE);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/infrastructure/storage/action#offline.
     */
	@Override
    public void offline()
	{
		System.err.println("DEBUG offline on " + this);

		// Dummy offline implementation.

		setState(StorageStatus.OFFLINE);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/infrastructure/storage/action#backup.
     */
	@Override
    public void backup()
	{
		System.err.println("DEBUG backup on " + this);

		// Dummy backup implementation.

		setState(StorageStatus.BACKUP);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/infrastructure/storage/action#snapshot.
     */
	@Override
    public void snapshot()
	{
		System.err.println("DEBUG snapshot on " + this);

		// Dummy snapshot implementation.

		setState(StorageStatus.SNAPSHOT);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/infrastructure/storage/action#resize.
     */
	@Override
    public void resize(final float size)
	{
		System.err.println("DEBUG resize on " + this);
		System.err.println("  - size=" + size);

		// Dummy resize implementation.

		setSize(size);
	}
}	
