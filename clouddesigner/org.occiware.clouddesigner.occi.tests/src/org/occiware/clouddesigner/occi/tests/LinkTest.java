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

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.OCCIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Kind Is In Parent</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LinkTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkTest.class);
	}

	/**
	 * Constructs a new Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Link getFixture() {
		return (Link)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCCIFactory.eINSTANCE.createLink());
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
	 * Tests the '{@link org.occiware.clouddesigner.occi.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testLinkKindIsInParent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //LinkTest
