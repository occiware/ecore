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
 * Generated at Tue Jul 25 13:34:46 CEST 2017 from platform:/plugin/org.occiware.clouddesigner.occi.linkeddata/model/linkeddata.occie by org.occiware.clouddesigner.occi.gen.connector
 */

package org.occiware.clouddesigner.occi.linkeddata.connector;


/**
 * Connector EFactory for the OCCI extension:
 * - name: linkeddata
 * - scheme: http://occiware.org/linkeddata#
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/linkeddata#
	 * - term: ldproject
	 * - title: LDProject
	 */
	@Override
	public org.occiware.clouddesigner.occi.linkeddata.Ldproject createLdproject() {
		return new LdprojectConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/linkeddata#
	 * - term: lddatabaselink
	 * - title: LDDatabaseLink
	 */
	@Override
	public org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink createLddatabaselink() {
		return new LddatabaselinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/linkeddata#
	 * - term: ldnode
	 * - title: LDNode
	 */
	@Override
	public org.occiware.clouddesigner.occi.linkeddata.Ldnode createLdnode() {
		return new LdnodeConnector();
	}

}
