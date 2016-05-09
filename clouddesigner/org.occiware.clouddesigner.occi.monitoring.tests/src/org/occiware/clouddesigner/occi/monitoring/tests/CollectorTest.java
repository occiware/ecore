/**
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.monitoring.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.monitoring.Collector;
import org.occiware.clouddesigner.occi.monitoring.MonitoringFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectorTest extends TestCase {

	/**
	 * The fixture for this Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectorTest.class);
	}

	/**
	 * Constructs a new Collector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Collector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collector getFixture() {
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
		setFixture(MonitoringFactory.eINSTANCE.createCollector());
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

} //CollectorTest
