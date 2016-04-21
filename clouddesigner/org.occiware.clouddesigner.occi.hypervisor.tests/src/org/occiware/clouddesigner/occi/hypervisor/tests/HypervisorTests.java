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
package org.occiware.clouddesigner.occi.hypervisor.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hypervisor</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypervisorTests extends TestSuite {

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
		TestSuite suite = new HypervisorTests("hypervisor Tests");
		suite.addTestSuite(MachineTest.class);
		suite.addTestSuite(ContainsTest.class);
		suite.addTestSuite(DiskTest.class);
		suite.addTestSuite(InterfaceTest.class);
		suite.addTestSuite(Machine_VirtualBoxTest.class);
		suite.addTestSuite(BridgeTest.class);
		suite.addTestSuite(UserTest.class);
		suite.addTestSuite(ParallelTest.class);
		suite.addTestSuite(SerialTest.class);
		suite.addTestSuite(DirectTest.class);
		suite.addTestSuite(EthernetTest.class);
		suite.addTestSuite(FilesystemTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorTests(String name) {
		super(name);
	}

} //HypervisorTests
