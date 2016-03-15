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

import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class is a dummy implementation of the OCCI Infrastructure Compute kind.
 *
 * A skeleton of this class can be generated automatically.
 * See issue https://github.com/occiware/ecore/issues/54.
 *
 * @author philippe.merle@inria.fr
 */
public class ComputeConnector 
     extends org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl
{
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		System.err.println("DEBUG constructor " + this);
	}

	@Override
    public void start()
	{
		System.err.println("DEBUG start " + this);

		// TODO: Implement how to start this compute.

		setState(ComputeStatus.ACTIVE);
	}

	@Override
	public void stop(final StopMethod method)
	{
		System.err.println("DEBUG stop " + this + " with method=" + method);

		// TODO: Implement how to stop this compute.

		setState(ComputeStatus.INACTIVE);
	}

	@Override
	public void restart(final RestartMethod method)
	{
		System.err.println("DEBUG restart " + this + " with method=" + method);

		// TODO: Implement how to restart this compute.

		setState(ComputeStatus.ACTIVE);
	}

	@Override
	public void suspend(final SuspendMethod method)
	{
		System.err.println("DEBUG suspend " + this + " with method=" + method);

		// TODO: Implement how to suspend this compute.

		setState(ComputeStatus.SUSPENDED);
	}
}
