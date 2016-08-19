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
package org.occiware.clouddesigner.occi.linkeddata.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lddatabaselink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LddatabaselinkTest extends TestCase {

	/**
	 * The fixture for this Lddatabaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lddatabaselink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LddatabaselinkTest.class);
	}

	/**
	 * Constructs a new Lddatabaselink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LddatabaselinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Lddatabaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Lddatabaselink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Lddatabaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lddatabaselink getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LinkeddataFactory.eINSTANCE.createLddatabaselink());
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

} //LddatabaselinkTest
