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

import org.occiware.clouddesigner.occi.monitoring.MonitoringFactory;
import org.occiware.clouddesigner.occi.monitoring.Sensor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorTest extends TestCase {

	/**
	 * The fixture for this Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sensor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SensorTest.class);
	}

	/**
	 * Constructs a new Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sensor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sensor getFixture() {
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
		setFixture(MonitoringFactory.eINSTANCE.createSensor());
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

} //SensorTest
