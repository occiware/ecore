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
 * Generated at Fri Jun 03 17:38:12 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.linkeddata/model/linkeddata.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.linkeddata.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/linkeddata#
 * - term: LDProject
 * - title: 
 */
public class LdprojectConnector extends org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(LdprojectConnector.class);
	
	/**
	 * Constructs a LDProject connector.
	 */
	LdprojectConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this LDProject instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this LDProject instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this LDProject instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this LDProject instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// LDProject actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/linkeddata/LDProject/action#
     * - term: publish
     * - title: 
	 */
	@Override
	public void publish()
	{
		LOGGER.debug("Action publish() called on " + this);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/linkeddata/LDProject/action#
     * - term: unpublish
     * - title: 
	 */
	@Override
	public void unpublish()
	{
		LOGGER.debug("Action unpublish() called on " + this);
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/linkeddata/LDProject/action#
     * - term: update
     * - title: 
	 */
	@Override
	public void update()
	{
		LOGGER.debug("Action update() called on " + this);
	}
	   
}	
