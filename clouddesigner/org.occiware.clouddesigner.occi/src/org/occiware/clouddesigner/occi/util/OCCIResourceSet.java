/*******************************************************************************
 * Copyright (c) 2015 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.util;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class OCCIResourceSet extends ResourceSetImpl
{
	/**
	 * Constructor.
	 */
	public OCCIResourceSet()
	{
		// Use the OCCI URI converter automatically.
		this.setURIConverter(new OCCIURIConverter());
	}
}
