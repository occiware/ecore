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
package org.occiware.clouddesigner.occi.vmware.tests;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.vmware.Datacenterlink;
import org.occiware.clouddesigner.occi.vmware.VmwareFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Datacenterlink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatacenterlinkTest extends FolderlinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatacenterlinkTest.class);
	}

	/**
	 * Constructs a new Datacenterlink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacenterlinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Datacenterlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Datacenterlink getFixture() {
		return (Datacenterlink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmwareFactory.eINSTANCE.createDatacenterlink());
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

} //DatacenterlinkTest
