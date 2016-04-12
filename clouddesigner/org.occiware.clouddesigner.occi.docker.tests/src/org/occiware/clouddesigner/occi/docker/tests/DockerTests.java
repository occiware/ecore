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
package org.occiware.clouddesigner.occi.docker.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>docker</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerTests extends TestSuite {

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
		TestSuite suite = new DockerTests("docker Tests");
		suite.addTestSuite(ContainerTest.class);
		suite.addTestSuite(MachineTest.class);
		suite.addTestSuite(Machine_Amazon_EC2Test.class);
		suite.addTestSuite(Machine_Digital_OceanTest.class);
		suite.addTestSuite(Machine_Google_Compute_EngineTest.class);
		suite.addTestSuite(Machine_IBM_SoftLayerTest.class);
		suite.addTestSuite(Machine_Microsoft_AzureTest.class);
		suite.addTestSuite(Machine_Microsoft_Hyper_VTest.class);
		suite.addTestSuite(Machine_OpenStackTest.class);
		suite.addTestSuite(Machine_RackspaceTest.class);
		suite.addTestSuite(Machine_VirtualBoxTest.class);
		suite.addTestSuite(Machine_VMware_FusionTest.class);
		suite.addTestSuite(Machine_VMware_vCloud_AirTest.class);
		suite.addTestSuite(Machine_VMware_vSphereTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerTests(String name) {
		super(name);
	}

} //DockerTests
