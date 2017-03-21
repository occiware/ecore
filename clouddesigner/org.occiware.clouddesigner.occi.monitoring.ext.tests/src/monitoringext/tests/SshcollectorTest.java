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
package monitoringext.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import monitoringext.MonitoringextFactory;
import monitoringext.Sshcollector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sshcollector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SshcollectorTest extends TestCase {

	/**
	 * The fixture for this Sshcollector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sshcollector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SshcollectorTest.class);
	}

	/**
	 * Constructs a new Sshcollector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SshcollectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sshcollector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sshcollector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sshcollector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sshcollector getFixture() {
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
		setFixture(MonitoringextFactory.eINSTANCE.createSshcollector());
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

} //SshcollectorTest
