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
 * Generated at Mon May 09 10:30:10 CEST 2016 from  by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.simulation.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: simulation
 * - scheme: http://occiware.org/simulation#
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.simulation.impl.SimulationFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/simulation#
	 * - term: SimulationResource
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.simulation.SimulationResource createSimulationResource() {
		return new SimulationResourceConnector();
	}

}
