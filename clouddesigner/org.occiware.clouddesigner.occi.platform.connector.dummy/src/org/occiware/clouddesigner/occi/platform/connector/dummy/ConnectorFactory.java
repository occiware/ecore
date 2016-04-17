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

/**
 * Connector EFactory for OCCI extension named platform with scheme http://schemas.ogf.org/occi/platform#.
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.platform.impl.PlatformFactoryImpl
{
	/**
	 * EFactory method for OCCI kind http://schemas.ogf.org/occi/platform#application.
	 */
	@Override
	public org.occiware.clouddesigner.occi.platform.Application createApplication() {
		return new ApplicationConnector();
	}

	/**
	 * EFactory method for OCCI kind http://schemas.ogf.org/occi/platform#component.
	 */
	@Override
	public org.occiware.clouddesigner.occi.platform.Component createComponent() {
		return new ComponentConnector();
	}

	/**
	 * EFactory method for OCCI kind http://schemas.ogf.org/occi/platform#componentlink.
	 */
	@Override
	public org.occiware.clouddesigner.occi.platform.Componentlink createComponentlink() {
		return new ComponentlinkConnector();
	}
}
