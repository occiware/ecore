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
package org.occiware.clouddesigner.occi.linkeddata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage
 * @generated
 */
public interface LinkeddataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkeddataFactory eINSTANCE = org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ldproject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ldproject</em>'.
	 * @generated
	 */
	Ldproject createLdproject();

	/**
	 * Returns a new object of class '<em>Lddatabaselink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lddatabaselink</em>'.
	 * @generated
	 */
	Lddatabaselink createLddatabaselink();

	/**
	 * Returns a new object of class '<em>Ldprojectlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ldprojectlink</em>'.
	 * @generated
	 */
	Ldprojectlink createLdprojectlink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinkeddataPackage getLinkeddataPackage();

} //LinkeddataFactory
