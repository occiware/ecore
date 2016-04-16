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

/**
 * Connector EFactory for OCCI extension named infrastructure with scheme http://schemas.ogf.org/occi/infrastructure#.
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructureFactoryImpl
{
    /**
     * EFactory method for OCCI kind http://schemas.ogf.org/occi/infrastructure#network.
     */
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Network createNetwork() {
		return new NetworkConnector();
	}

    /**
     * EFactory method for OCCI kind http://schemas.ogf.org/occi/infrastructure#compute.
     */
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Compute createCompute() {
		return new ComputeConnector();
	}

    /**
     * EFactory method for OCCI kind http://schemas.ogf.org/occi/infrastructure#storage.
     */
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Storage createStorage() {
		return new StorageConnector();
	}

    /**
     * EFactory method for OCCI kind http://schemas.ogf.org/occi/infrastructure#storagelink.
     */
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Storagelink createStoragelink() {
		return new StoragelinkConnector();
	}

    /**
     * EFactory method for OCCI kind http://schemas.ogf.org/occi/infrastructure#networkinterface.
     */
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Networkinterface createNetworkinterface() {
		return new NetworkinterfaceConnector();
	}
}
