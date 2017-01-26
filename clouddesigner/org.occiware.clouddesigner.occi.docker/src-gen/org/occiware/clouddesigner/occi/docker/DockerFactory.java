/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage
 * @generated
 */
public interface DockerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerFactory eINSTANCE = org.occiware.clouddesigner.occi.docker.impl.DockerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Link</em>'.
	 * @generated
	 */
	NetworkLink createNetworkLink();

	/**
	 * Returns a new object of class '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volumesfrom</em>'.
	 * @generated
	 */
	Volumesfrom createVolumesfrom();

	/**
	 * Returns a new object of class '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains</em>'.
	 * @generated
	 */
	Contains createContains();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Machine Amazon EC2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Amazon EC2</em>'.
	 * @generated
	 */
	Machine_Amazon_EC2 createMachine_Amazon_EC2();

	/**
	 * Returns a new object of class '<em>Machine Digital Ocean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Digital Ocean</em>'.
	 * @generated
	 */
	Machine_Digital_Ocean createMachine_Digital_Ocean();

	/**
	 * Returns a new object of class '<em>Machine Google Compute Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Google Compute Engine</em>'.
	 * @generated
	 */
	Machine_Google_Compute_Engine createMachine_Google_Compute_Engine();

	/**
	 * Returns a new object of class '<em>Machine IBM Soft Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine IBM Soft Layer</em>'.
	 * @generated
	 */
	Machine_IBM_SoftLayer createMachine_IBM_SoftLayer();

	/**
	 * Returns a new object of class '<em>Machine Microsoft Azure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Microsoft Azure</em>'.
	 * @generated
	 */
	Machine_Microsoft_Azure createMachine_Microsoft_Azure();

	/**
	 * Returns a new object of class '<em>Machine Microsoft Hyper V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Microsoft Hyper V</em>'.
	 * @generated
	 */
	Machine_Microsoft_Hyper_V createMachine_Microsoft_Hyper_V();

	/**
	 * Returns a new object of class '<em>Machine Open Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Open Stack</em>'.
	 * @generated
	 */
	Machine_OpenStack createMachine_OpenStack();

	/**
	 * Returns a new object of class '<em>Machine Rackspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Rackspace</em>'.
	 * @generated
	 */
	Machine_Rackspace createMachine_Rackspace();

	/**
	 * Returns a new object of class '<em>Machine Virtual Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Virtual Box</em>'.
	 * @generated
	 */
	Machine_VirtualBox createMachine_VirtualBox();

	/**
	 * Returns a new object of class '<em>Machine VMware Fusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine VMware Fusion</em>'.
	 * @generated
	 */
	Machine_VMware_Fusion createMachine_VMware_Fusion();

	/**
	 * Returns a new object of class '<em>Machine VMware vCloud Air</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine VMware vCloud Air</em>'.
	 * @generated
	 */
	Machine_VMware_vCloud_Air createMachine_VMware_vCloud_Air();

	/**
	 * Returns a new object of class '<em>Machine VMware vSphere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine VMware vSphere</em>'.
	 * @generated
	 */
	Machine_VMware_vSphere createMachine_VMware_vSphere();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DockerPackage getDockerPackage();

} //DockerFactory
