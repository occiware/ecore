/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.simulation.impl;

import org.eclipse.emf.ecore.EClass;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimulationResourceImpl extends ResourceImpl implements SimulationResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.SIMULATION_RESOURCE;
	}

} //SimulationResourceImpl
