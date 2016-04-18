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

import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;

/**
 * Connector implementation for OCCI kind http://schemas.ogf.org/occi/infrastructure#network.
 */
public class NetworkConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl
{
	/**
	 * Constructs a network connector.
	 */
	NetworkConnector()
	{
		System.err.println("DEBUG constructor " + this);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/network/action#up.
	 */
	@Override
	public void up()
	{
		System.err.println("DEBUG up on " + this);

		// Dummy up implementation.

		setState(NetworkStatus.ACTIVE);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/network/action#down.
	 */
	@Override
	public void down()
	{
		System.err.println("DEBUG down on " + this);

		// Dummy down implementation.

		setState(NetworkStatus.INACTIVE);
	}
}	
