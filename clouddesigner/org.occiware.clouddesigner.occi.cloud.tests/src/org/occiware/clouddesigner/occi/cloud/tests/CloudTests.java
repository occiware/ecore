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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cloud</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CloudTests("cloud Tests");
		suite.addTestSuite(MachineTest.class);
		suite.addTestSuite(Machine_CloudSigmaTest.class);
		suite.addTestSuite(Machine_Amazon_EC2Test.class);
		suite.addTestSuite(Machine_GogridTest.class);
		suite.addTestSuite(Machine_Hp_HelionTest.class);
		suite.addTestSuite(Machine_GCETest.class);
		suite.addTestSuite(Machine_RackSpaceTest.class);
		suite.addTestSuite(Machine_ProfitBricksTest.class);
		suite.addTestSuite(Machine_OpenStackTest.class);
		suite.addTestSuite(Machine_SoftLayerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTests(String name) {
		super(name);
	}

} //CloudTests
