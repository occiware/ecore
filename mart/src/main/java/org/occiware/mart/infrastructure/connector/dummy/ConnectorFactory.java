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

/**
 * This class is the EMF factory for the OCCI Infrastructure extension.
 *
 * This class can be generated automatically.
 * See issue https://github.com/occiware/ecore/issues/54.
 *
 * @author philippe.merle@inria.fr
 */
public class ConnectorFactory
     extends org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructureFactoryImpl
{
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Network createNetwork() {
		return new NetworkConnector();
	}
	
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Compute createCompute() {
		return new ComputeConnector();
	}
	
	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Storage createStorage() {
		return new StorageConnector();
	}

	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Storagelink createStoragelink() {
		return new StorageLinkConnector();
	}

	@Override
	public org.occiware.clouddesigner.occi.infrastructure.Networkinterface createNetworkinterface() {
		return new NetworkInterfaceConnector();
	}
}
