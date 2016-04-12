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
package org.occiware.clouddesigner.occi.platform.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.platform.Componentlink;
import org.occiware.clouddesigner.occi.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Componentlink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentlinkTest extends TestCase {

	/**
	 * The fixture for this Componentlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Componentlink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentlinkTest.class);
	}

	/**
	 * Constructs a new Componentlink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentlinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Componentlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Componentlink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Componentlink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Componentlink getFixture() {
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
		setFixture(PlatformFactory.eINSTANCE.createComponentlink());
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

} //ComponentlinkTest
