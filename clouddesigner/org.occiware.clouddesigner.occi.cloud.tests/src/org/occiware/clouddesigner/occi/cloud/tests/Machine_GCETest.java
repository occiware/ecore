/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.cloud.tests;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.Machine_GCE;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Machine GCE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_GCETest extends MachineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Machine_GCETest.class);
	}

	/**
	 * Constructs a new Machine GCE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_GCETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Machine GCE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Machine_GCE getFixture() {
		return (Machine_GCE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CloudFactory.eINSTANCE.createMachine_GCE());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Machine_GCETest
