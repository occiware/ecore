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
package org.occiware.clouddesigner.occi.cloud.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.cloud.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudFactoryImpl extends EFactoryImpl implements CloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudFactory init() {
		try {
			CloudFactory theCloudFactory = (CloudFactory)EPackage.Registry.INSTANCE.getEFactory(CloudPackage.eNS_URI);
			if (theCloudFactory != null) {
				return theCloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudPackage.MACHINE: return createMachine();
			case CloudPackage.MACHINE_CLOUD_SIGMA: return createMachine_CloudSigma();
			case CloudPackage.MACHINE_AMAZON_EC2: return createMachine_Amazon_EC2();
			case CloudPackage.MACHINE_GOGRID: return createMachine_Gogrid();
			case CloudPackage.MACHINE_HP_HELION: return createMachine_Hp_Helion();
			case CloudPackage.MACHINE_GCE: return createMachine_GCE();
			case CloudPackage.MACHINE_RACK_SPACE: return createMachine_RackSpace();
			case CloudPackage.MACHINE_PROFIT_BRICKS: return createMachine_ProfitBricks();
			case CloudPackage.MACHINE_OPEN_STACK: return createMachine_OpenStack();
			case CloudPackage.MACHINE_SOFT_LAYER: return createMachine_SoftLayer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_CloudSigma createMachine_CloudSigma() {
		Machine_CloudSigmaImpl machine_CloudSigma = new Machine_CloudSigmaImpl();
		return machine_CloudSigma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Amazon_EC2 createMachine_Amazon_EC2() {
		Machine_Amazon_EC2Impl machine_Amazon_EC2 = new Machine_Amazon_EC2Impl();
		return machine_Amazon_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Gogrid createMachine_Gogrid() {
		Machine_GogridImpl machine_Gogrid = new Machine_GogridImpl();
		return machine_Gogrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Hp_Helion createMachine_Hp_Helion() {
		Machine_Hp_HelionImpl machine_Hp_Helion = new Machine_Hp_HelionImpl();
		return machine_Hp_Helion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_GCE createMachine_GCE() {
		Machine_GCEImpl machine_GCE = new Machine_GCEImpl();
		return machine_GCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_RackSpace createMachine_RackSpace() {
		Machine_RackSpaceImpl machine_RackSpace = new Machine_RackSpaceImpl();
		return machine_RackSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_ProfitBricks createMachine_ProfitBricks() {
		Machine_ProfitBricksImpl machine_ProfitBricks = new Machine_ProfitBricksImpl();
		return machine_ProfitBricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_OpenStack createMachine_OpenStack() {
		Machine_OpenStackImpl machine_OpenStack = new Machine_OpenStackImpl();
		return machine_OpenStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_SoftLayer createMachine_SoftLayer() {
		Machine_SoftLayerImpl machine_SoftLayer = new Machine_SoftLayerImpl();
		return machine_SoftLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPackage getCloudPackage() {
		return (CloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudPackage getPackage() {
		return CloudPackage.eINSTANCE;
	}

} //CloudFactoryImpl
