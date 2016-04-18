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
package org.occiware.clouddesigner.occi.infrastructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/infrastructure/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__VLAN = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LABEL = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl <em>Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getCompute()
	 * @generated
	 */
	int COMPUTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ARCHITECTURE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__CORES = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__HOSTNAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__MEMORY = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SIZE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl <em>Storagelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStoragelink()
	 * @generated
	 */
	int STORAGELINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__DEVICEID = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__MOUNTPOINT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__STATE = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storagelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl <em>Networkinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkinterface()
	 * @generated
	 */
	int NETWORKINTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__INTERFACE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__MAC = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__STATE = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Networkinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.SuspendMethod
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getSuspendMethod()
	 * @generated
	 */
	int SUSPEND_METHOD = 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkStatus <em>Network Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkStatus
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkStatus()
	 * @generated
	 */
	int NETWORK_STATUS = 6;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus <em>Compute Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getComputeStatus()
	 * @generated
	 */
	int COMPUTE_STATUS = 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterfaceStatus()
	 * @generated
	 */
	int NETWORK_INTERFACE_STATUS = 8;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.Architecture <em>Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 9;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.StopMethod <em>Stop Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.StopMethod
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStopMethod()
	 * @generated
	 */
	int STOP_METHOD = 10;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.RestartMethod <em>Restart Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.RestartMethod
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getRestartMethod()
	 * @generated
	 */
	int RESTART_METHOD = 11;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.Allocation <em>Allocation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.Allocation
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 12;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.StorageStatus <em>Storage Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageStatus()
	 * @generated
	 */
	int STORAGE_STATUS = 13;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageLinkStatus()
	 * @generated
	 */
	int STORAGE_LINK_STATUS = 14;

	/**
	 * The meta object id for the '<em>Integer4095</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getInteger4095()
	 * @generated
	 */
	int INTEGER4095 = 15;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 16;

	/**
	 * The meta object id for the '<em>Ip Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddress()
	 * @generated
	 */
	int IP_ADDRESS = 17;

	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 18;

	/**
	 * The meta object id for the '<em>GHz</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getGHz()
	 * @generated
	 */
	int GHZ = 19;

	/**
	 * The meta object id for the '<em>Gi B</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getGiB()
	 * @generated
	 */
	int GI_B = 20;

	/**
	 * The meta object id for the '<em>Ip Address Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddressRange()
	 * @generated
	 */
	int IP_ADDRESS_RANGE = 21;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getVlan <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vlan</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Network#getVlan()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Vlan();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Network#getLabel()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Network#getState()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_State();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.infrastructure.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute
	 * @generated
	 */
	EClass getCompute();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getCores()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Cores();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Speed();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Memory();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute#getState()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_State();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage#getSize()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage#getState()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_State();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink <em>Storagelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storagelink</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storagelink
	 * @generated
	 */
	EClass getStoragelink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getDeviceid <em>Deviceid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deviceid</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storagelink#getDeviceid()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_Deviceid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getMountpoint <em>Mountpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mountpoint</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storagelink#getMountpoint()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_Mountpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storagelink#getState()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_State();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface <em>Networkinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networkinterface</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Networkinterface
	 * @generated
	 */
	EClass getNetworkinterface();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_Mac();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_State();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Suspend Method</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.SuspendMethod
	 * @generated
	 */
	EEnum getSuspendMethod();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkStatus <em>Network Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Status</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkStatus
	 * @generated
	 */
	EEnum getNetworkStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus <em>Compute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compute Status</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @generated
	 */
	EEnum getComputeStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Interface Status</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @generated
	 */
	EEnum getNetworkInterfaceStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Architecture</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @generated
	 */
	EEnum getArchitecture();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.StopMethod <em>Stop Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stop Method</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StopMethod
	 * @generated
	 */
	EEnum getStopMethod();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.RestartMethod <em>Restart Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restart Method</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.RestartMethod
	 * @generated
	 */
	EEnum getRestartMethod();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allocation</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Allocation
	 * @generated
	 */
	EEnum getAllocation();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.StorageStatus <em>Storage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Status</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @generated
	 */
	EEnum getStorageStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Link Status</em>'.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus
	 * @generated
	 */
	EEnum getStorageLinkStatus();

	/**
	 * Returns the meta object for data type '<em>Integer4095</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer4095</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minInclusive='0' maxInclusive='4095'"
	 * @generated
	 */
	EDataType getInteger4095();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getToken();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIpAddress();

	/**
	 * Returns the meta object for data type '<em>Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the meta object for data type '<em>GHz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GHz</em>'.
	 * @model instanceClass="float"
	 * @generated
	 */
	EDataType getGHz();

	/**
	 * Returns the meta object for data type '<em>Gi B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gi B</em>'.
	 * @model instanceClass="float"
	 * @generated
	 */
	EDataType getGiB();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address Range</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIpAddressRange();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Vlan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__VLAN = eINSTANCE.getNetwork_Vlan();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__LABEL = eINSTANCE.getNetwork_Label();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__STATE = eINSTANCE.getNetwork_State();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl <em>Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getCompute()
		 * @generated
		 */
		EClass COMPUTE = eINSTANCE.getCompute();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__ARCHITECTURE = eINSTANCE.getCompute_Architecture();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__CORES = eINSTANCE.getCompute_Cores();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__HOSTNAME = eINSTANCE.getCompute_Hostname();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__SPEED = eINSTANCE.getCompute_Speed();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__MEMORY = eINSTANCE.getCompute_Memory();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__STATE = eINSTANCE.getCompute_State();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__SIZE = eINSTANCE.getStorage_Size();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__STATE = eINSTANCE.getStorage_State();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl <em>Storagelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStoragelink()
		 * @generated
		 */
		EClass STORAGELINK = eINSTANCE.getStoragelink();

		/**
		 * The meta object literal for the '<em><b>Deviceid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__DEVICEID = eINSTANCE.getStoragelink_Deviceid();

		/**
		 * The meta object literal for the '<em><b>Mountpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__MOUNTPOINT = eINSTANCE.getStoragelink_Mountpoint();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__STATE = eINSTANCE.getStoragelink_State();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl <em>Networkinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkinterface()
		 * @generated
		 */
		EClass NETWORKINTERFACE = eINSTANCE.getNetworkinterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__INTERFACE = eINSTANCE.getNetworkinterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__MAC = eINSTANCE.getNetworkinterface_Mac();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__STATE = eINSTANCE.getNetworkinterface_State();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.SuspendMethod
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getSuspendMethod()
		 * @generated
		 */
		EEnum SUSPEND_METHOD = eINSTANCE.getSuspendMethod();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkStatus <em>Network Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkStatus
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkStatus()
		 * @generated
		 */
		EEnum NETWORK_STATUS = eINSTANCE.getNetworkStatus();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus <em>Compute Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getComputeStatus()
		 * @generated
		 */
		EEnum COMPUTE_STATUS = eINSTANCE.getComputeStatus();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterfaceStatus()
		 * @generated
		 */
		EEnum NETWORK_INTERFACE_STATUS = eINSTANCE.getNetworkInterfaceStatus();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.Architecture <em>Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getArchitecture()
		 * @generated
		 */
		EEnum ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.StopMethod <em>Stop Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.StopMethod
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStopMethod()
		 * @generated
		 */
		EEnum STOP_METHOD = eINSTANCE.getStopMethod();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.RestartMethod <em>Restart Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.RestartMethod
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getRestartMethod()
		 * @generated
		 */
		EEnum RESTART_METHOD = eINSTANCE.getRestartMethod();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.Allocation <em>Allocation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.Allocation
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getAllocation()
		 * @generated
		 */
		EEnum ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.StorageStatus <em>Storage Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageStatus()
		 * @generated
		 */
		EEnum STORAGE_STATUS = eINSTANCE.getStorageStatus();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageLinkStatus()
		 * @generated
		 */
		EEnum STORAGE_LINK_STATUS = eINSTANCE.getStorageLinkStatus();

		/**
		 * The meta object literal for the '<em>Integer4095</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getInteger4095()
		 * @generated
		 */
		EDataType INTEGER4095 = eINSTANCE.getInteger4095();

		/**
		 * The meta object literal for the '<em>Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getToken()
		 * @generated
		 */
		EDataType TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em>Ip Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddress()
		 * @generated
		 */
		EDataType IP_ADDRESS = eINSTANCE.getIpAddress();

		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '<em>GHz</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getGHz()
		 * @generated
		 */
		EDataType GHZ = eINSTANCE.getGHz();

		/**
		 * The meta object literal for the '<em>Gi B</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getGiB()
		 * @generated
		 */
		EDataType GI_B = eINSTANCE.getGiB();

		/**
		 * The meta object literal for the '<em>Ip Address Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddressRange()
		 * @generated
		 */
		EDataType IP_ADDRESS_RANGE = eINSTANCE.getIpAddressRange();

	}

} //InfrastructurePackage
