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

import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;

/**
 * Connector implementation for OCCI kind http://schemas.ogf.org/occi/infrastructure#compute.
 */
public class ComputeConnector extends org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl
{
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		System.err.println("DEBUG constructor " + this);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/compute/action#start.
	 */
	@Override
	public void start()
	{
		System.err.println("DEBUG start on " + this);

		// Dummy start implementation.

		setState(ComputeStatus.ACTIVE);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/compute/action#stop.
	 */
	@Override
	public void stop(final org.occiware.clouddesigner.occi.infrastructure.StopMethod method)
	{
		System.err.println("DEBUG stop on " + this);
		System.err.println("  - method=" + method);

		// Dummy stop implementation.

		setState(ComputeStatus.INACTIVE);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/compute/action#restart.
	 */
	@Override
	public void restart(final org.occiware.clouddesigner.occi.infrastructure.RestartMethod method)
	{
		System.err.println("DEBUG restart on " + this);
		System.err.println("  - method=" + method);

		// Dummy restart implementation.

		setState(ComputeStatus.ACTIVE);
	}

	/**
	 * OCCI action http://schemas.ogf.org/occi/infrastructure/compute/action#suspend.
	 */
	@Override
	public void suspend(final org.occiware.clouddesigner.occi.infrastructure.SuspendMethod method)
	{
		System.err.println("DEBUG suspend on " + this);
		System.err.println("  - method=" + method);

		// Dummy suspend implementation.

		setState(ComputeStatus.SUSPENDED);
	}
}	
