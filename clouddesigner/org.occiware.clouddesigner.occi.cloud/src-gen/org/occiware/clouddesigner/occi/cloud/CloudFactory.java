/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.cloud;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage
 * @generated
 */
public interface CloudFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudFactory eINSTANCE = org.occiware.clouddesigner.occi.cloud.impl.CloudFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Machine Cloud Sigma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Cloud Sigma</em>'.
	 * @generated
	 */
	Machine_CloudSigma createMachine_CloudSigma();

	/**
	 * Returns a new object of class '<em>Machine Amazon EC2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Amazon EC2</em>'.
	 * @generated
	 */
	Machine_Amazon_EC2 createMachine_Amazon_EC2();

	/**
	 * Returns a new object of class '<em>Machine Gogrid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Gogrid</em>'.
	 * @generated
	 */
	Machine_Gogrid createMachine_Gogrid();

	/**
	 * Returns a new object of class '<em>Machine Hp Helion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Hp Helion</em>'.
	 * @generated
	 */
	Machine_Hp_Helion createMachine_Hp_Helion();

	/**
	 * Returns a new object of class '<em>Machine GCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine GCE</em>'.
	 * @generated
	 */
	Machine_GCE createMachine_GCE();

	/**
	 * Returns a new object of class '<em>Machine Rack Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Rack Space</em>'.
	 * @generated
	 */
	Machine_RackSpace createMachine_RackSpace();

	/**
	 * Returns a new object of class '<em>Machine Profit Bricks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Profit Bricks</em>'.
	 * @generated
	 */
	Machine_ProfitBricks createMachine_ProfitBricks();

	/**
	 * Returns a new object of class '<em>Machine Open Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Open Stack</em>'.
	 * @generated
	 */
	Machine_OpenStack createMachine_OpenStack();

	/**
	 * Returns a new object of class '<em>Machine Soft Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Soft Layer</em>'.
	 * @generated
	 */
	Machine_SoftLayer createMachine_SoftLayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudPackage getCloudPackage();

} //CloudFactory
