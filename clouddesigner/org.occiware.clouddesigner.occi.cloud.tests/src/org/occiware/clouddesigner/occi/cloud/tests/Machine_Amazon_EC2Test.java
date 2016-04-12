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
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Machine Amazon EC2</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_Amazon_EC2Test extends MachineTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Machine_Amazon_EC2Test.class);
	}

	/**
	 * Constructs a new Machine Amazon EC2 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Amazon_EC2Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Machine Amazon EC2 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Machine_Amazon_EC2 getFixture() {
		return (Machine_Amazon_EC2)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CloudFactory.eINSTANCE.createMachine_Amazon_EC2());
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

} //Machine_Amazon_EC2Test
