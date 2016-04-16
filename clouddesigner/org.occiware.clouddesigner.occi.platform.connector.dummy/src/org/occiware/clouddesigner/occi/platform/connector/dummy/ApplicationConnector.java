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
 * Generated at Sun Apr 17 01:09:58 CEST 2016 from platform:/plugin/org.occiware.clouddesigner.occi.platform/model/platform.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.platform.connector.dummy;

import org.occiware.clouddesigner.occi.platform.Status;

/**
 * Connector implementation for OCCI kind http://schemas.ogf.org/occi/platform#application.
 */
public class ApplicationConnector extends org.occiware.clouddesigner.occi.platform.impl.ApplicationImpl
{
	/**
	 * Constructs a application connector.
	 */
	ApplicationConnector()
	{
		System.err.println("DEBUG constructor " + this);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/platform/application/action#start.
     */
	@Override
    public void start()
	{
		System.err.println("DEBUG start on " + this);

		// Dummy start implementation.

		setState(Status.ACTIVE);
	}

    /**
     * OCCI action http://schemas.ogf.org/occi/platform/application/action#stop.
     */
	@Override
    public void stop()
	{
		System.err.println("DEBUG stop on " + this);

		// Dummy stop implementation.

		setState(Status.INACTIVE);
	}
}	
