/*******************************************************************************
 *
 * OCCIware MART: OCCI Infrastructure Dummy Connector
 *
 * Copyright (c) 2016 Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *
 *******************************************************************************/
package org.occiware.mart.infrastructure.connector.dummy;

import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;

/**
 * This class is a dummy implementation of the OCCI Infrastructure Storage kind.
 *
 * A skeleton of this class can be generated automatically.
 * See issue https://github.com/occiware/ecore/issues/54.
 *
 * @author philippe.merle@inria.fr
 */
public class StorageConnector 
     extends org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl
{
	/**
	 * Constructs a storage connector.
	 */
	StorageConnector()
	{
		System.err.println("DEBUG constructor " + this);		
	}

	@Override
    public void online()
	{
		System.err.println("DEBUG online " + this);

		// TODO: Implement how to online this storage.

		setState(StorageStatus.ONLINE);
	}

	@Override
	public void offline()
	{
		System.err.println("DEBUG offline " + this);

		// TODO: Implement how to offline this storage.

		setState(StorageStatus.OFFLINE);
	}

	@Override
	public void backup()
	{
		System.err.println("DEBUG backup " + this);

		// TODO: Implement how to backup this storage.

		setState(StorageStatus.BACKUP);
	}

	@Override
	public void snapshot()
	{
		System.err.println("DEBUG snapshot " + this);

		// TODO: Implement how to snapshot this storage.

		setState(StorageStatus.SNAPSHOT);
	}

	@Override
	public void resize(final float size)
	{
		System.err.println("DEBUG resize " + this + " with size=" + size);

		// TODO: Implement how to resize this storage.

		setSize(size);
	}
}
