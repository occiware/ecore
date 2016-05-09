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
package org.occiware.clouddesigner.occi.infrastructure.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory;
import org.occiware.clouddesigner.occi.infrastructure.Storage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#online() <em>Online</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#offline() <em>Offline</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StorageTest extends TestCase {

	/**
	 * The fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Storage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StorageTest.class);
	}

	/**
	 * Constructs a new Storage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Storage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Storage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Storage getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createStorage());
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

	/**
	 * Tests the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#online() <em>Online</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage#online()
	 * @generated
	 */
	public void testOnline() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#offline() <em>Offline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage#offline()
	 * @generated
	 */
	public void testOffline() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StorageTest
