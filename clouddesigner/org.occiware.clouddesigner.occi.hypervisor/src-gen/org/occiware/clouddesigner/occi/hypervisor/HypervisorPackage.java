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
package org.occiware.clouddesigner.occi.hypervisor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

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
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory
 * @model kind="package"
 * @generated
 */
public interface HypervisorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hypervisor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/hypervisor/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hypervisor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HypervisorPackage eINSTANCE = org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.MachineImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ARCHITECTURE = InfrastructurePackage.COMPUTE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CORES = InfrastructurePackage.COMPUTE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__HOSTNAME = InfrastructurePackage.COMPUTE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SPEED = InfrastructurePackage.COMPUTE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MEMORY = InfrastructurePackage.COMPUTE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STATE = InfrastructurePackage.COMPUTE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BOOT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__UUID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OFFSET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Os type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OS_TYPE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.ContainsImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.DiskImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TYPE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__DEVICE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SOURCE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__READONLY = InfrastructurePackage.STORAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TARGET_DEV = InfrastructurePackage.STORAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TARGET_BUS = InfrastructurePackage.STORAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.InterfaceImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VLAN = InfrastructurePackage.NETWORK__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LABEL = InfrastructurePackage.NETWORK__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STATE = InfrastructurePackage.NETWORK__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE = InfrastructurePackage.NETWORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODEL = InfrastructurePackage.NETWORK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mac addresss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MAC_ADDRESSS = InfrastructurePackage.NETWORK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ROUTE = InfrastructurePackage.NETWORK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl <em>Machine Virtual Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getMachine_VirtualBox()
	 * @generated
	 */
	int MACHINE_VIRTUAL_BOX = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__BOOT = MACHINE__BOOT;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__UUID = MACHINE__UUID;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__OFFSET = MACHINE__OFFSET;

	/**
	 * The feature id for the '<em><b>Os type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__OS_TYPE = MACHINE__OS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__TYPE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__FEATURES = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On poweroff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ON_POWEROFF = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On reboot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ON_REBOOT = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On crash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ON_CRASH = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Current memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__CURRENT_MEMORY = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__VCPU = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Machine Virtual Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.BridgeImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__TITLE = INTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__KIND = INTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__MIXINS = INTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__ATTRIBUTES = INTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__SUMMARY = INTERFACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__LINKS = INTERFACE__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__VLAN = INTERFACE__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__LABEL = INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__STATE = INTERFACE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__TYPE = INTERFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__MODEL = INTERFACE__MODEL;

	/**
	 * The feature id for the '<em><b>Mac addresss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__MAC_ADDRESSS = INTERFACE__MAC_ADDRESSS;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__ROUTE = INTERFACE__ROUTE;

	/**
	 * The feature id for the '<em><b>Source bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__SOURCE_BRIDGE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.UserImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getUser()
	 * @generated
	 */
	int USER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TITLE = INTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__KIND = INTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MIXINS = INTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ATTRIBUTES = INTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUMMARY = INTERFACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LINKS = INTERFACE__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__VLAN = INTERFACE__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LABEL = INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATE = INTERFACE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TYPE = INTERFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MODEL = INTERFACE__MODEL;

	/**
	 * The feature id for the '<em><b>Mac addresss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MAC_ADDRESSS = INTERFACE__MAC_ADDRESSS;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROUTE = INTERFACE__ROUTE;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.ParallelImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SOURCE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TARGET = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.SerialImpl <em>Serial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.SerialImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getSerial()
	 * @generated
	 */
	int SERIAL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__SOURCE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL__TARGET = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Serial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.DirectImpl <em>Direct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.DirectImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getDirect()
	 * @generated
	 */
	int DIRECT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__TITLE = INTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__KIND = INTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__MIXINS = INTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__ATTRIBUTES = INTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__SUMMARY = INTERFACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__LINKS = INTERFACE__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__VLAN = INTERFACE__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__LABEL = INTERFACE__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__STATE = INTERFACE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__TYPE = INTERFACE__TYPE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__MODEL = INTERFACE__MODEL;

	/**
	 * The feature id for the '<em><b>Mac addresss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__MAC_ADDRESSS = INTERFACE__MAC_ADDRESSS;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__ROUTE = INTERFACE__ROUTE;

	/**
	 * The feature id for the '<em><b>Source dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__SOURCE_DEV = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT__SOURCE_MODE = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Direct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl <em>Ethernet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getEthernet()
	 * @generated
	 */
	int ETHERNET = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Target dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__TARGET_DEV = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__SCRIPT_PATH = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ethernet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.FilesystemImpl <em>Filesystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.FilesystemImpl
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getFilesystem()
	 * @generated
	 */
	int FILESYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__SOURCE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__TARGET = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.CLOCK <em>CLOCK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.CLOCK
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getCLOCK()
	 * @generated
	 */
	int CLOCK = 12;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.FEATURES <em>FEATURES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.FEATURES
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getFEATURES()
	 * @generated
	 */
	int FEATURES = 13;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.hypervisor.OS <em>OS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.hypervisor.OS
	 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getOS()
	 * @generated
	 */
	int OS = 14;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getBoot <em>Boot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine#getBoot()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Boot();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine#getUuid()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine#getOffset()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOs_type <em>Os type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os type</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine#getOs_type()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Os_type();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getName()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getType()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getDevice()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Device();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getSource()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#isReadonly()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_dev <em>Target dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target dev</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_dev()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Target_dev();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_bus <em>Target bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target bus</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_bus()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Target_bus();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface#getType()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface#getModel()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getMac_addresss <em>Mac addresss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac addresss</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface#getMac_addresss()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Mac_addresss();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Interface#getRoute()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Route();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox <em>Machine Virtual Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Virtual Box</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox
	 * @generated
	 */
	EClass getMachine_VirtualBox();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getType()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Features</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getFeatures()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_poweroff <em>On poweroff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On poweroff</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_poweroff()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_On_poweroff();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_reboot <em>On reboot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On reboot</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_reboot()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_On_reboot();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_crash <em>On crash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On crash</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getOn_crash()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_On_crash();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getMaximum_memory <em>Maximum memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum memory</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getMaximum_memory()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Maximum_memory();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getCurrent_memory <em>Current memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current memory</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getCurrent_memory()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Current_memory();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getVcpu <em>Vcpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpu</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox#getVcpu()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Vcpu();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Bridge#getSource_bridge <em>Source bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source bridge</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Bridge#getSource_bridge()
	 * @see #getBridge()
	 * @generated
	 */
	EAttribute getBridge_Source_bridge();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Parallel#getName()
	 * @see #getParallel()
	 * @generated
	 */
	EAttribute getParallel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Parallel#getSource()
	 * @see #getParallel()
	 * @generated
	 */
	EAttribute getParallel_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Parallel#getTarget()
	 * @see #getParallel()
	 * @generated
	 */
	EAttribute getParallel_Target();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Serial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serial</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Serial
	 * @generated
	 */
	EClass getSerial();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Serial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Serial#getName()
	 * @see #getSerial()
	 * @generated
	 */
	EAttribute getSerial_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Serial#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Serial#getSource()
	 * @see #getSerial()
	 * @generated
	 */
	EAttribute getSerial_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Serial#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Serial#getTarget()
	 * @see #getSerial()
	 * @generated
	 */
	EAttribute getSerial_Target();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Direct <em>Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Direct
	 * @generated
	 */
	EClass getDirect();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_dev <em>Source dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source dev</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_dev()
	 * @see #getDirect()
	 * @generated
	 */
	EAttribute getDirect_Source_dev();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_mode <em>Source mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source mode</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_mode()
	 * @see #getDirect()
	 * @generated
	 */
	EAttribute getDirect_Source_mode();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Ethernet
	 * @generated
	 */
	EClass getEthernet();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getTarget_dev <em>Target dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target dev</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Ethernet#getTarget_dev()
	 * @see #getEthernet()
	 * @generated
	 */
	EAttribute getEthernet_Target_dev();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getScript_path <em>Script path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script path</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Ethernet#getScript_path()
	 * @see #getEthernet()
	 * @generated
	 */
	EAttribute getEthernet_Script_path();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.hypervisor.Filesystem <em>Filesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filesystem</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Filesystem
	 * @generated
	 */
	EClass getFilesystem();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Filesystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Filesystem#getName()
	 * @see #getFilesystem()
	 * @generated
	 */
	EAttribute getFilesystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Filesystem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Filesystem#getSource()
	 * @see #getFilesystem()
	 * @generated
	 */
	EAttribute getFilesystem_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.hypervisor.Filesystem#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.Filesystem#getTarget()
	 * @see #getFilesystem()
	 * @generated
	 */
	EAttribute getFilesystem_Target();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.hypervisor.CLOCK <em>CLOCK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CLOCK</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.CLOCK
	 * @generated
	 */
	EEnum getCLOCK();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.hypervisor.FEATURES <em>FEATURES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FEATURES</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.FEATURES
	 * @generated
	 */
	EEnum getFEATURES();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.hypervisor.OS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS</em>'.
	 * @see org.occiware.clouddesigner.occi.hypervisor.OS
	 * @generated
	 */
	EEnum getOS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HypervisorFactory getHypervisorFactory();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.MachineImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Boot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__BOOT = eINSTANCE.getMachine_Boot();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__UUID = eINSTANCE.getMachine_Uuid();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__OFFSET = eINSTANCE.getMachine_Offset();

		/**
		 * The meta object literal for the '<em><b>Os type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__OS_TYPE = eINSTANCE.getMachine_Os_type();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.ContainsImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.DiskImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__NAME = eINSTANCE.getDisk_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__TYPE = eINSTANCE.getDisk_Type();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__DEVICE = eINSTANCE.getDisk_Device();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__SOURCE = eINSTANCE.getDisk_Source();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__READONLY = eINSTANCE.getDisk_Readonly();

		/**
		 * The meta object literal for the '<em><b>Target dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__TARGET_DEV = eINSTANCE.getDisk_Target_dev();

		/**
		 * The meta object literal for the '<em><b>Target bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__TARGET_BUS = eINSTANCE.getDisk_Target_bus();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.InterfaceImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__TYPE = eINSTANCE.getInterface_Type();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__MODEL = eINSTANCE.getInterface_Model();

		/**
		 * The meta object literal for the '<em><b>Mac addresss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__MAC_ADDRESSS = eINSTANCE.getInterface_Mac_addresss();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__ROUTE = eINSTANCE.getInterface_Route();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl <em>Machine Virtual Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getMachine_VirtualBox()
		 * @generated
		 */
		EClass MACHINE_VIRTUAL_BOX = eINSTANCE.getMachine_VirtualBox();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__TYPE = eINSTANCE.getMachine_VirtualBox_Type();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__FEATURES = eINSTANCE.getMachine_VirtualBox_Features();

		/**
		 * The meta object literal for the '<em><b>On poweroff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__ON_POWEROFF = eINSTANCE.getMachine_VirtualBox_On_poweroff();

		/**
		 * The meta object literal for the '<em><b>On reboot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__ON_REBOOT = eINSTANCE.getMachine_VirtualBox_On_reboot();

		/**
		 * The meta object literal for the '<em><b>On crash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__ON_CRASH = eINSTANCE.getMachine_VirtualBox_On_crash();

		/**
		 * The meta object literal for the '<em><b>Maximum memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY = eINSTANCE.getMachine_VirtualBox_Maximum_memory();

		/**
		 * The meta object literal for the '<em><b>Current memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__CURRENT_MEMORY = eINSTANCE.getMachine_VirtualBox_Current_memory();

		/**
		 * The meta object literal for the '<em><b>Vcpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__VCPU = eINSTANCE.getMachine_VirtualBox_Vcpu();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.BridgeImpl <em>Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.BridgeImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getBridge()
		 * @generated
		 */
		EClass BRIDGE = eINSTANCE.getBridge();

		/**
		 * The meta object literal for the '<em><b>Source bridge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE__SOURCE_BRIDGE = eINSTANCE.getBridge_Source_bridge();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.UserImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.ParallelImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL__NAME = eINSTANCE.getParallel_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL__SOURCE = eINSTANCE.getParallel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL__TARGET = eINSTANCE.getParallel_Target();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.SerialImpl <em>Serial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.SerialImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getSerial()
		 * @generated
		 */
		EClass SERIAL = eINSTANCE.getSerial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIAL__NAME = eINSTANCE.getSerial_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIAL__SOURCE = eINSTANCE.getSerial_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIAL__TARGET = eINSTANCE.getSerial_Target();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.DirectImpl <em>Direct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.DirectImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getDirect()
		 * @generated
		 */
		EClass DIRECT = eINSTANCE.getDirect();

		/**
		 * The meta object literal for the '<em><b>Source dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT__SOURCE_DEV = eINSTANCE.getDirect_Source_dev();

		/**
		 * The meta object literal for the '<em><b>Source mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT__SOURCE_MODE = eINSTANCE.getDirect_Source_mode();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl <em>Ethernet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getEthernet()
		 * @generated
		 */
		EClass ETHERNET = eINSTANCE.getEthernet();

		/**
		 * The meta object literal for the '<em><b>Target dev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET__TARGET_DEV = eINSTANCE.getEthernet_Target_dev();

		/**
		 * The meta object literal for the '<em><b>Script path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET__SCRIPT_PATH = eINSTANCE.getEthernet_Script_path();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.impl.FilesystemImpl <em>Filesystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.FilesystemImpl
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getFilesystem()
		 * @generated
		 */
		EClass FILESYSTEM = eINSTANCE.getFilesystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILESYSTEM__NAME = eINSTANCE.getFilesystem_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILESYSTEM__SOURCE = eINSTANCE.getFilesystem_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILESYSTEM__TARGET = eINSTANCE.getFilesystem_Target();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.CLOCK <em>CLOCK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.CLOCK
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getCLOCK()
		 * @generated
		 */
		EEnum CLOCK = eINSTANCE.getCLOCK();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.FEATURES <em>FEATURES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.FEATURES
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getFEATURES()
		 * @generated
		 */
		EEnum FEATURES = eINSTANCE.getFEATURES();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.hypervisor.OS <em>OS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.hypervisor.OS
		 * @see org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorPackageImpl#getOS()
		 * @generated
		 */
		EEnum OS = eINSTANCE.getOS();

	}

} //HypervisorPackage
