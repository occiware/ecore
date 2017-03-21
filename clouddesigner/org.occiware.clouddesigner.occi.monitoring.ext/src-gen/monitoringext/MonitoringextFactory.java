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
package monitoringext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see monitoringext.MonitoringextPackage
 * @generated
 */
public interface MonitoringextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitoringextFactory eINSTANCE = monitoringext.impl.MonitoringextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sshcollector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sshcollector</em>'.
	 * @generated
	 */
	Sshcollector createSshcollector();

	/**
	 * Returns a new object of class '<em>Centreoncollector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centreoncollector</em>'.
	 * @generated
	 */
	Centreoncollector createCentreoncollector();

	/**
	 * Returns a new object of class '<em>Sensorext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensorext</em>'.
	 * @generated
	 */
	Sensorext createSensorext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MonitoringextPackage getMonitoringextPackage();

} //MonitoringextFactory
