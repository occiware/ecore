/**
 * Copyright (c) 2015-2016 Obeo, Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>occi</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCCITests extends TestSuite {

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
		TestSuite suite = new OCCITests("occi Tests");
		suite.addTestSuite(KindTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(MixinTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(LinkTest.class);
		suite.addTestSuite(ExtensionTest.class);
		suite.addTestSuite(ConfigurationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCCITests(String name) {
		super(name);
	}

} //OCCITests
