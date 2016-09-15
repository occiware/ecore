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
package org.occiware.clouddesigner.occi.vmware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwareFactory
 * @model kind="package"
 * @generated
 */
public interface VmwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/vmware/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vmware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmwarePackage eINSTANCE = org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DatastoreImpl <em>Datastore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DatastoreImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatastore()
	 * @generated
	 */
	int DATASTORE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Enter Maintenance Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE___ENTER_MAINTENANCE_MODE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.FolderImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 22;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.ClusterImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Add All Host System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ADD_ALL_HOST_SYSTEM = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply Recommendation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___APPLY_RECOMMENDATION = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Enter Maintenance Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER___ENTER_MAINTENANCE_MODE = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DatacenterImpl <em>Datacenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DatacenterImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatacenter()
	 * @generated
	 */
	int DATACENTER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Default Hardware Version Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DEFAULT_HARDWARE_VERSION_KEY = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Power On Multi VMs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___POWER_ON_MULTI_VMS = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Discover All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___DISCOVER_ALL = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl <em>Hostsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostsystem()
	 * @generated
	 */
	int HOSTSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__ARCHITECTURE = InfrastructurePackage.COMPUTE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__CORES = InfrastructurePackage.COMPUTE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__HOSTNAME = InfrastructurePackage.COMPUTE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__SHARE = InfrastructurePackage.COMPUTE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__SPEED = InfrastructurePackage.COMPUTE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__MEMORY = InfrastructurePackage.COMPUTE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__STATE = InfrastructurePackage.COMPUTE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__MESSAGE = InfrastructurePackage.COMPUTE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cluster Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__CLUSTER_SUPPORTED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Das Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__IN_DAS_CLUSTER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serverip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__SERVERIP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vim Account Name Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agent Vm Datastore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__AGENT_VM_DATASTORE_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agent Vm Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__AGENT_VM_NETWORK_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__PORT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fault Tolerance Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__FAULT_TOLERANCE_ENABLED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host Feature Version Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Host Feature Version Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vmotion Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__VMOTION_ENABLED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Current EVC Mode Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__CURRENT_EVC_MODE_KEY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Custom Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__CUSTOM_VALUES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Management Serverip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__MANAGEMENT_SERVERIP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max EVC Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__MAX_EVC_KEY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Overall Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__OVERALL_STATUS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Distributed CPU Fairness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Distributed Memory Fairness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Overall CPU Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__OVERALL_CPU_USAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Overall Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__OVERALL_MEMORY_USAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reboot Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__REBOOT_REQUIRED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Boot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__BOOT_TIME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__CONNECTION_STATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>In Maintenance Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM__IN_MAINTENANCE_MODE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Hostsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Disconnect Host</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___DISCONNECT_HOST = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Enterl Lock Down Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___ENTERL_LOCK_DOWN_MODE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Enter Maintenance Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___ENTER_MAINTENANCE_MODE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Exit Lock Down Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___EXIT_LOCK_DOWN_MODE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Exit Maintenance Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___EXIT_MAINTENANCE_MODE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Reconfigure Host For DAS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___RECONFIGURE_HOST_FOR_DAS = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Reconnect Host</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM___RECONNECT_HOST = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hostsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEM_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl <em>Vm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVm()
	 * @generated
	 */
	int VM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ARCHITECTURE = InfrastructurePackage.COMPUTE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CORES = InfrastructurePackage.COMPUTE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__HOSTNAME = InfrastructurePackage.COMPUTE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SHARE = InfrastructurePackage.COMPUTE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SPEED = InfrastructurePackage.COMPUTE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MEMORY = InfrastructurePackage.COMPUTE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__STATE = InfrastructurePackage.COMPUTE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MESSAGE = InfrastructurePackage.COMPUTE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__INSTANCE_UUID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__TEMPLATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vcpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VCPUS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cores Per Socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CORES_PER_SOCKET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guest State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__GUEST_STATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vmware Tools Installed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VMWARE_TOOLS_INSTALLED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vmware Tools Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VMWARE_TOOLS_RUNNING = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guest Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__GUEST_FULL_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cpuhot Add Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CPUHOT_ADD_ENABLED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cpu Hot Remove Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CPU_HOT_REMOVE_ENABLED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ANNOTATION = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Vmware Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VMWARE_POWER_STATE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Overall Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OVERALL_STATUS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Clone VM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___CLONE_VM = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Mount Vmware Toolsdisk</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___MOUNT_VMWARE_TOOLSDISK = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Mark As Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___MARK_AS_TEMPLATE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Mark As Virtual Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___MARK_AS_VIRTUAL_MACHINE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Register VM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___REGISTER_VM = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Unregister VM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___UNREGISTER_VM = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Defragment All Disks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___DEFRAGMENT_ALL_DISKS = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Reset Location Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___RESET_LOCATION_ID = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.FolderlinkImpl <em>Folderlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.FolderlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getFolderlink()
	 * @generated
	 */
	int FOLDERLINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Folderlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Folderlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoollinkImpl <em>Resourcepoollink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.ResourcepoollinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getResourcepoollink()
	 * @generated
	 */
	int RESOURCEPOOLLINK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Resourcepoollink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Resourcepoollink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOLLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.ClusterlinkImpl <em>Clusterlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.ClusterlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterlink()
	 * @generated
	 */
	int CLUSTERLINK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Clusterlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Clusterlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl <em>Resourcepool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getResourcepool()
	 * @generated
	 */
	int RESOURCEPOOL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expandablereservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__EXPANDABLERESERVATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__LIMIT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__RESERVATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resourcepool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Resourcepool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCEPOOL_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DatacenterlinkImpl <em>Datacenterlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DatacenterlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatacenterlink()
	 * @generated
	 */
	int DATACENTERLINK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Datacenterlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Datacenterlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTERLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemlinkImpl <em>Hostsystemlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostsystemlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostsystemlink()
	 * @generated
	 */
	int HOSTSYSTEMLINK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Hostsystemlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostsystemlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSYSTEMLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DatastorelinkImpl <em>Datastorelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DatastorelinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatastorelink()
	 * @generated
	 */
	int DATASTORELINK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Datastorelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Datastorelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASTORELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualdiskImpl <em>Virtualdisk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualdiskImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualdisk()
	 * @generated
	 */
	int VIRTUALDISK = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK__VOLUME_NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtualdisk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The operation id for the '<em>Zero Fill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___ZERO_FILL = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Shrink</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK___SHRINK = InfrastructurePackage.STORAGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtualdisk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISK_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl <em>Vswitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVswitch()
	 * @generated
	 */
	int VSWITCH = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__VLAN = InfrastructurePackage.NETWORK__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__LABEL = InfrastructurePackage.NETWORK__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__STATE = InfrastructurePackage.NETWORK__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__MESSAGE = InfrastructurePackage.NETWORK__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__NAME = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nbport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__NBPORT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beacon Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__BEACON_INTERVAL = InfrastructurePackage.NETWORK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mtu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__MTU = InfrastructurePackage.NETWORK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH__CHANGE_OPERATION = InfrastructurePackage.NETWORK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_CREATE = InfrastructurePackage.NETWORK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_RETRIEVE = InfrastructurePackage.NETWORK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_UPDATE = InfrastructurePackage.NETWORK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___OCCI_DELETE = InfrastructurePackage.NETWORK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___UP = InfrastructurePackage.NETWORK___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH___DOWN = InfrastructurePackage.NETWORK___DOWN;

	/**
	 * The number of operations of the '<em>Vswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSWITCH_OPERATION_COUNT = InfrastructurePackage.NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.PortgroupImpl <em>Portgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.PortgroupImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getPortgroup()
	 * @generated
	 */
	int PORTGROUP = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__VLAN_ID = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP__KEY = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Portgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Portgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUP_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualnetworkadapterImpl <em>Virtualnetworkadapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualnetworkadapterImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualnetworkadapter()
	 * @generated
	 */
	int VIRTUALNETWORKADAPTER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__ID = InfrastructurePackage.NETWORKINTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__TITLE = InfrastructurePackage.NETWORKINTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__KIND = InfrastructurePackage.NETWORKINTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__MIXINS = InfrastructurePackage.NETWORKINTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__ATTRIBUTES = InfrastructurePackage.NETWORKINTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__SOURCE = InfrastructurePackage.NETWORKINTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__TARGET = InfrastructurePackage.NETWORKINTERFACE__TARGET;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__INTERFACE = InfrastructurePackage.NETWORKINTERFACE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__MAC = InfrastructurePackage.NETWORKINTERFACE__MAC;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__STATE = InfrastructurePackage.NETWORKINTERFACE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__MESSAGE = InfrastructurePackage.NETWORKINTERFACE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__NAME = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__KEY = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__SUBNET_MASK = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__PORT = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Device Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER__DEVICE_DRIVER = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Virtualnetworkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER_FEATURE_COUNT = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___OCCI_CREATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___OCCI_RETRIEVE = InfrastructurePackage.NETWORKINTERFACE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___OCCI_UPDATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___OCCI_DELETE = InfrastructurePackage.NETWORKINTERFACE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Connect Adaptater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___CONNECT_ADAPTATER = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect Adaptater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER___DISCONNECT_ADAPTATER = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtualnetworkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALNETWORKADAPTER_OPERATION_COUNT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualdisknetworkImpl <em>Virtualdisknetwork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualdisknetworkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualdisknetwork()
	 * @generated
	 */
	int VIRTUALDISKNETWORK = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK__VOLUME_NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtualdisknetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Virtualdisknetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORK_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualdisknetworklinkImpl <em>Virtualdisknetworklink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualdisknetworklinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualdisknetworklink()
	 * @generated
	 */
	int VIRTUALDISKNETWORKLINK = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__ID = InfrastructurePackage.STORAGELINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__TITLE = InfrastructurePackage.STORAGELINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__KIND = InfrastructurePackage.STORAGELINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__MIXINS = InfrastructurePackage.STORAGELINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__ATTRIBUTES = InfrastructurePackage.STORAGELINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__SOURCE = InfrastructurePackage.STORAGELINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__TARGET = InfrastructurePackage.STORAGELINK__TARGET;

	/**
	 * The feature id for the '<em><b>Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__DEVICEID = InfrastructurePackage.STORAGELINK__DEVICEID;

	/**
	 * The feature id for the '<em><b>Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__MOUNTPOINT = InfrastructurePackage.STORAGELINK__MOUNTPOINT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__STATE = InfrastructurePackage.STORAGELINK__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK__MESSAGE = InfrastructurePackage.STORAGELINK__MESSAGE;

	/**
	 * The number of structural features of the '<em>Virtualdisknetworklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK_FEATURE_COUNT = InfrastructurePackage.STORAGELINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK___OCCI_CREATE = InfrastructurePackage.STORAGELINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK___OCCI_RETRIEVE = InfrastructurePackage.STORAGELINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK___OCCI_UPDATE = InfrastructurePackage.STORAGELINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK___OCCI_DELETE = InfrastructurePackage.STORAGELINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Virtualdisknetworklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKNETWORKLINK_OPERATION_COUNT = InfrastructurePackage.STORAGELINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl <em>Hostnetworkadapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostnetworkadapter()
	 * @generated
	 */
	int HOSTNETWORKADAPTER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__ID = InfrastructurePackage.NETWORKINTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__TITLE = InfrastructurePackage.NETWORKINTERFACE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__KIND = InfrastructurePackage.NETWORKINTERFACE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__MIXINS = InfrastructurePackage.NETWORKINTERFACE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__ATTRIBUTES = InfrastructurePackage.NETWORKINTERFACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__SOURCE = InfrastructurePackage.NETWORKINTERFACE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__TARGET = InfrastructurePackage.NETWORKINTERFACE__TARGET;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__INTERFACE = InfrastructurePackage.NETWORKINTERFACE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__MAC = InfrastructurePackage.NETWORKINTERFACE__MAC;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__STATE = InfrastructurePackage.NETWORKINTERFACE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__MESSAGE = InfrastructurePackage.NETWORKINTERFACE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__NAME = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__DRIVER = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__KEY = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__PCI = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__SUBNET_MASK = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wake On Lan Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hostnetworkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER_FEATURE_COUNT = InfrastructurePackage.NETWORKINTERFACE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___OCCI_CREATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___OCCI_RETRIEVE = InfrastructurePackage.NETWORKINTERFACE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___OCCI_UPDATE = InfrastructurePackage.NETWORKINTERFACE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___OCCI_DELETE = InfrastructurePackage.NETWORKINTERFACE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___CONNECT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER___DISCONNECT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hostnetworkadapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNETWORKADAPTER_OPERATION_COUNT = InfrastructurePackage.NETWORKINTERFACE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DvswitchImpl <em>Dvswitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DvswitchImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDvswitch()
	 * @generated
	 */
	int DVSWITCH = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__ID = VSWITCH__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__TITLE = VSWITCH__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__KIND = VSWITCH__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__MIXINS = VSWITCH__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__ATTRIBUTES = VSWITCH__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__SUMMARY = VSWITCH__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__LINKS = VSWITCH__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__VLAN = VSWITCH__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__LABEL = VSWITCH__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__STATE = VSWITCH__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__MESSAGE = VSWITCH__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__NAME = VSWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Nbport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__NBPORT = VSWITCH__NBPORT;

	/**
	 * The feature id for the '<em><b>Beacon Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__BEACON_INTERVAL = VSWITCH__BEACON_INTERVAL;

	/**
	 * The feature id for the '<em><b>Mtu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__MTU = VSWITCH__MTU;

	/**
	 * The feature id for the '<em><b>Change Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH__CHANGE_OPERATION = VSWITCH__CHANGE_OPERATION;

	/**
	 * The number of structural features of the '<em>Dvswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH_FEATURE_COUNT = VSWITCH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___OCCI_CREATE = VSWITCH___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___OCCI_RETRIEVE = VSWITCH___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___OCCI_UPDATE = VSWITCH___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___OCCI_DELETE = VSWITCH___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___UP = VSWITCH___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH___DOWN = VSWITCH___DOWN;

	/**
	 * The number of operations of the '<em>Dvswitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DVSWITCH_OPERATION_COUNT = VSWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.SnapshotImpl <em>Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.SnapshotImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getSnapshot()
	 * @generated
	 */
	int SNAPSHOT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The number of structural features of the '<em>Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Restore</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT___RESTORE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.SnapshotlinkImpl <em>Snapshotlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.SnapshotlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getSnapshotlink()
	 * @generated
	 */
	int SNAPSHOTLINK = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Snapshotlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Snapshotlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOTLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostfolderImpl <em>Hostfolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostfolderImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostfolder()
	 * @generated
	 */
	int HOSTFOLDER = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hostfolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostfolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFOLDER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl <em>Vcentercapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVcentercapability()
	 * @generated
	 */
	int VCENTERCAPABILITY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Multi Host Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__MULTI_HOST_SUPPORTED = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provisioning Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__PROVISIONING_SUPPORTED = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Shell Access Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EVC Mode Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__EVC_MODE_VENDOR = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EVC Mode Vendor Tier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vcentercapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Vcentercapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCENTERCAPABILITY_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostfirewallsystemImpl <em>Hostfirewallsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostfirewallsystemImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostfirewallsystem()
	 * @generated
	 */
	int HOSTFIREWALLSYSTEM = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Default Incoming Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Outgoing Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hostfirewallsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostfirewallsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLSYSTEM_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostfirewallrulesetImpl <em>Hostfirewallruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostfirewallrulesetImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostfirewallruleset()
	 * @generated
	 */
	int HOSTFIREWALLRULESET = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__ENABLED = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__KEY = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__LABEL = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__REQUIRED = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET__SERVICE = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hostfirewallruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Disable Ruleset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___DISABLE_RULESET = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Enable Ruleset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET___ENABLE_RULESET = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hostfirewallruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULESET_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostfirewallruleImpl <em>Hostfirewallrule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostfirewallruleImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostfirewallrule()
	 * @generated
	 */
	int HOSTFIREWALLRULE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__DIRECTION = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__PORT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__END_PORT = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE__PROTOCOL = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hostfirewallrule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostfirewallrule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTFIREWALLRULE_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HoststorageImpl <em>Hoststorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HoststorageImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHoststorage()
	 * @generated
	 */
	int HOSTSTORAGE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Host Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE__HOST_VOLUME_NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hoststorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Hoststorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGE_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HoststoragelinkImpl <em>Hoststoragelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HoststoragelinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHoststoragelink()
	 * @generated
	 */
	int HOSTSTORAGELINK = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__ID = InfrastructurePackage.STORAGELINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__TITLE = InfrastructurePackage.STORAGELINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__KIND = InfrastructurePackage.STORAGELINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__MIXINS = InfrastructurePackage.STORAGELINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__ATTRIBUTES = InfrastructurePackage.STORAGELINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__SOURCE = InfrastructurePackage.STORAGELINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__TARGET = InfrastructurePackage.STORAGELINK__TARGET;

	/**
	 * The feature id for the '<em><b>Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__DEVICEID = InfrastructurePackage.STORAGELINK__DEVICEID;

	/**
	 * The feature id for the '<em><b>Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__MOUNTPOINT = InfrastructurePackage.STORAGELINK__MOUNTPOINT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__STATE = InfrastructurePackage.STORAGELINK__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK__MESSAGE = InfrastructurePackage.STORAGELINK__MESSAGE;

	/**
	 * The number of structural features of the '<em>Hoststoragelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK_FEATURE_COUNT = InfrastructurePackage.STORAGELINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK___OCCI_CREATE = InfrastructurePackage.STORAGELINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK___OCCI_RETRIEVE = InfrastructurePackage.STORAGELINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK___OCCI_UPDATE = InfrastructurePackage.STORAGELINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK___OCCI_DELETE = InfrastructurePackage.STORAGELINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hoststoragelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTSTORAGELINK_OPERATION_COUNT = InfrastructurePackage.STORAGELINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VmfolderImpl <em>Vmfolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmfolderImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmfolder()
	 * @generated
	 */
	int VMFOLDER = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vmfolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Vmfolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMFOLDER_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.ServiceconsolenicImpl <em>Serviceconsolenic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.ServiceconsolenicImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getServiceconsolenic()
	 * @generated
	 */
	int SERVICECONSOLENIC = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__ID = VIRTUALNETWORKADAPTER__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__TITLE = VIRTUALNETWORKADAPTER__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__KIND = VIRTUALNETWORKADAPTER__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__MIXINS = VIRTUALNETWORKADAPTER__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__ATTRIBUTES = VIRTUALNETWORKADAPTER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__SOURCE = VIRTUALNETWORKADAPTER__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__TARGET = VIRTUALNETWORKADAPTER__TARGET;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__INTERFACE = VIRTUALNETWORKADAPTER__INTERFACE;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__MAC = VIRTUALNETWORKADAPTER__MAC;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__STATE = VIRTUALNETWORKADAPTER__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__MESSAGE = VIRTUALNETWORKADAPTER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__NAME = VIRTUALNETWORKADAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__KEY = VIRTUALNETWORKADAPTER__KEY;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__SUBNET_MASK = VIRTUALNETWORKADAPTER__SUBNET_MASK;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__PORT = VIRTUALNETWORKADAPTER__PORT;

	/**
	 * The feature id for the '<em><b>Device Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC__DEVICE_DRIVER = VIRTUALNETWORKADAPTER__DEVICE_DRIVER;

	/**
	 * The number of structural features of the '<em>Serviceconsolenic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC_FEATURE_COUNT = VIRTUALNETWORKADAPTER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___OCCI_CREATE = VIRTUALNETWORKADAPTER___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___OCCI_RETRIEVE = VIRTUALNETWORKADAPTER___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___OCCI_UPDATE = VIRTUALNETWORKADAPTER___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___OCCI_DELETE = VIRTUALNETWORKADAPTER___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Connect Adaptater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___CONNECT_ADAPTATER = VIRTUALNETWORKADAPTER___CONNECT_ADAPTATER;

	/**
	 * The operation id for the '<em>Disconnect Adaptater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC___DISCONNECT_ADAPTATER = VIRTUALNETWORKADAPTER___DISCONNECT_ADAPTATER;

	/**
	 * The number of operations of the '<em>Serviceconsolenic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICECONSOLENIC_OPERATION_COUNT = VIRTUALNETWORKADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.PortgrouplinkImpl <em>Portgrouplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.PortgrouplinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getPortgrouplink()
	 * @generated
	 */
	int PORTGROUPLINK = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Portgrouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Portgrouplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTGROUPLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl <em>Hostnatrule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostnatrule()
	 * @generated
	 */
	int HOSTNATRULE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Active Ftp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__ACTIVE_FTP = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Any Oui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__ALLOW_ANY_OUI = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__CONFIG_PORT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nat Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__NAT_KEY = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nat Change Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__NAT_CHANGE_OPERATION = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ip Gateway Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__IP_GATEWAY_ADDRESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Udp Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE__UDP_TIME_OUT = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hostnatrule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostnatrule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATRULE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl <em>Hostnatportforwardlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostnatportforwardlink()
	 * @generated
	 */
	int HOSTNATPORTFORWARDLINK = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Guest Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guest Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__GUEST_PORT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__HOST_PORT = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__NAME = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK__TYPE = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hostnatportforwardlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Hostnatportforwardlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTNATPORTFORWARDLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.DistributedportgroupImpl <em>Distributedportgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.DistributedportgroupImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDistributedportgroup()
	 * @generated
	 */
	int DISTRIBUTEDPORTGROUP = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__ID = PORTGROUP__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__TITLE = PORTGROUP__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__KIND = PORTGROUP__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__MIXINS = PORTGROUP__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__ATTRIBUTES = PORTGROUP__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__SUMMARY = PORTGROUP__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__LINKS = PORTGROUP__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__NAME = PORTGROUP__NAME;

	/**
	 * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__VLAN_ID = PORTGROUP__VLAN_ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP__KEY = PORTGROUP__KEY;

	/**
	 * The number of structural features of the '<em>Distributedportgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP_FEATURE_COUNT = PORTGROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP___OCCI_CREATE = PORTGROUP___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP___OCCI_RETRIEVE = PORTGROUP___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP___OCCI_UPDATE = PORTGROUP___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP___OCCI_DELETE = PORTGROUP___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Distributedportgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTEDPORTGROUP_OPERATION_COUNT = PORTGROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualcdromImpl <em>Virtualcdrom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualcdromImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualcdrom()
	 * @generated
	 */
	int VIRTUALCDROM = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Iso Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__ISO_FILENAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM__VOLUME_NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtualcdrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Virtualcdrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALCDROM_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualfloppyImpl <em>Virtualfloppy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualfloppyImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualfloppy()
	 * @generated
	 */
	int VIRTUALFLOPPY = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY__VOLUME_NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtualfloppy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Virtualfloppy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALFLOPPY_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualdisklinkImpl <em>Virtualdisklink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VirtualdisklinkImpl
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualdisklink()
	 * @generated
	 */
	int VIRTUALDISKLINK = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__ID = InfrastructurePackage.STORAGELINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__TITLE = InfrastructurePackage.STORAGELINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__KIND = InfrastructurePackage.STORAGELINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__MIXINS = InfrastructurePackage.STORAGELINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__ATTRIBUTES = InfrastructurePackage.STORAGELINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__SOURCE = InfrastructurePackage.STORAGELINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__TARGET = InfrastructurePackage.STORAGELINK__TARGET;

	/**
	 * The feature id for the '<em><b>Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__DEVICEID = InfrastructurePackage.STORAGELINK__DEVICEID;

	/**
	 * The feature id for the '<em><b>Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__MOUNTPOINT = InfrastructurePackage.STORAGELINK__MOUNTPOINT;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__STATE = InfrastructurePackage.STORAGELINK__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__MESSAGE = InfrastructurePackage.STORAGELINK__MESSAGE;

	/**
	 * The feature id for the '<em><b>Vmdk File Path On Datastore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE = InfrastructurePackage.STORAGELINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtualdisklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK_FEATURE_COUNT = InfrastructurePackage.STORAGELINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK___OCCI_CREATE = InfrastructurePackage.STORAGELINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK___OCCI_RETRIEVE = InfrastructurePackage.STORAGELINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK___OCCI_UPDATE = InfrastructurePackage.STORAGELINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK___OCCI_DELETE = InfrastructurePackage.STORAGELINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Virtualdisklink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUALDISKLINK_OPERATION_COUNT = InfrastructurePackage.STORAGELINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.SharesLevel <em>Shares Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.SharesLevel
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getSharesLevel()
	 * @generated
	 */
	int SHARES_LEVEL = 39;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DvsNicTeamingPolicy <em>Dvs Nic Teaming Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DvsNicTeamingPolicy
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDvsNicTeamingPolicy()
	 * @generated
	 */
	int DVS_NIC_TEAMING_POLICY = 40;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.Bootdevice <em>Bootdevice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.Bootdevice
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getBootdevice()
	 * @generated
	 */
	int BOOTDEVICE = 41;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ResourceAllocationType <em>Resource Allocation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ResourceAllocationType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getResourceAllocationType()
	 * @generated
	 */
	int RESOURCE_ALLOCATION_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ResourcePoolState <em>Resource Pool State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ResourcePoolState
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getResourcePoolState()
	 * @generated
	 */
	int RESOURCE_POOL_STATE = 43;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.PowerOffType <em>Power Off Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.PowerOffType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getPowerOffType()
	 * @generated
	 */
	int POWER_OFF_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.GuestFirmwareType <em>Guest Firmware Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.GuestFirmwareType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getGuestFirmwareType()
	 * @generated
	 */
	int GUEST_FIRMWARE_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmHtSharing <em>Vm Ht Sharing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmHtSharing
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmHtSharing()
	 * @generated
	 */
	int VM_HT_SHARING = 46;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmMonitorType <em>Vm Monitor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmMonitorType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmMonitorType()
	 * @generated
	 */
	int VM_MONITOR_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmPowerOffBehavior <em>Vm Power Off Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmPowerOffBehavior
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmPowerOffBehavior()
	 * @generated
	 */
	int VM_POWER_OFF_BEHAVIOR = 48;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmExecUsage <em>Vm Exec Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmExecUsage
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmExecUsage()
	 * @generated
	 */
	int VM_EXEC_USAGE = 49;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmMMUusage <em>Vm MM Uusage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmMMUusage
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmMMUusage()
	 * @generated
	 */
	int VM_MM_UUSAGE = 50;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.NpivWwnType <em>Npiv Wwn Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.NpivWwnType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getNpivWwnType()
	 * @generated
	 */
	int NPIV_WWN_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmSwapPlacementType <em>Vm Swap Placement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmSwapPlacementType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmSwapPlacementType()
	 * @generated
	 */
	int VM_SWAP_PLACEMENT_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.GuestOsIdentifiers
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getGuestOsIdentifiers()
	 * @generated
	 */
	int GUEST_OS_IDENTIFIERS = 53;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ToolsUpgradePolicy <em>Tools Upgrade Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ToolsUpgradePolicy
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getToolsUpgradePolicy()
	 * @generated
	 */
	int TOOLS_UPGRADE_POLICY = 54;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.OverallStatus <em>Overall Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getOverallStatus()
	 * @generated
	 */
	int OVERALL_STATUS = 55;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostConnectionState <em>Host Connection State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostConnectionState
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostConnectionState()
	 * @generated
	 */
	int HOST_CONNECTION_STATE = 56;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DiagnosticPartitionType <em>Diagnostic Partition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DiagnosticPartitionType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDiagnosticPartitionType()
	 * @generated
	 */
	int DIAGNOSTIC_PARTITION_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.AutoStartWaitHeartbeatSetting <em>Auto Start Wait Heartbeat Setting</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.AutoStartWaitHeartbeatSetting
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getAutoStartWaitHeartbeatSetting()
	 * @generated
	 */
	int AUTO_START_WAIT_HEARTBEAT_SETTING = 58;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection <em>Host Firewall Rule Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostFirewallRuleDirection()
	 * @generated
	 */
	int HOST_FIREWALL_RULE_DIRECTION = 59;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol <em>Host Network Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostNetworkProtocol()
	 * @generated
	 */
	int HOST_NETWORK_PROTOCOL = 60;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsRestartPriority <em>Cluster DAS Vm Settings Restart Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsRestartPriority
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterDASVmSettingsRestartPriority()
	 * @generated
	 */
	int CLUSTER_DAS_VM_SETTINGS_RESTART_PRIORITY = 61;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsIsolationResponse <em>Cluster DAS Vm Settings Isolation Response</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsIsolationResponse
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterDASVmSettingsIsolationResponse()
	 * @generated
	 */
	int CLUSTER_DAS_VM_SETTINGS_ISOLATION_RESPONSE = 62;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DrsBehavior <em>Drs Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DrsBehavior
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDrsBehavior()
	 * @generated
	 */
	int DRS_BEHAVIOR = 63;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DpmBehavior <em>Dpm Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DpmBehavior
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDpmBehavior()
	 * @generated
	 */
	int DPM_BEHAVIOR = 64;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DatastoreHostMountMode <em>Datastore Host Mount Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DatastoreHostMountMode
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatastoreHostMountMode()
	 * @generated
	 */
	int DATASTORE_HOST_MOUNT_MODE = 65;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.NicPolicyTeamingValue <em>Nic Policy Teaming Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.NicPolicyTeamingValue
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getNicPolicyTeamingValue()
	 * @generated
	 */
	int NIC_POLICY_TEAMING_VALUE = 66;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.PortGroupConnecteeType <em>Port Group Connectee Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.PortGroupConnecteeType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getPortGroupConnecteeType()
	 * @generated
	 */
	int PORT_GROUP_CONNECTEE_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation <em>Network Change Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getNetworkChangeOperation()
	 * @generated
	 */
	int NETWORK_CHANGE_OPERATION = 68;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.NetworkBootProtocolType <em>Network Boot Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkBootProtocolType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getNetworkBootProtocolType()
	 * @generated
	 */
	int NETWORK_BOOT_PROTOCOL_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmForkConfigInfoChildType <em>Vm Fork Config Info Child Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmForkConfigInfoChildType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmForkConfigInfoChildType()
	 * @generated
	 */
	int VM_FORK_CONFIG_INFO_CHILD_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VmFaultToleranceType <em>Vm Fault Tolerance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VmFaultToleranceType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVmFaultToleranceType()
	 * @generated
	 */
	int VM_FAULT_TOLERANCE_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.LatencySensitivityLevel <em>Latency Sensitivity Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.LatencySensitivityLevel
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getLatencySensitivityLevel()
	 * @generated
	 */
	int LATENCY_SENSITIVITY_LEVEL = 72;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoHBDatastoreCandidate <em>Cluster Das Config Info HB Datastore Candidate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoHBDatastoreCandidate
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterDasConfigInfoHBDatastoreCandidate()
	 * @generated
	 */
	int CLUSTER_DAS_CONFIG_INFO_HB_DATASTORE_CANDIDATE = 73;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoVmMonitoringState <em>Cluster Das Config Info Vm Monitoring State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoVmMonitoringState
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterDasConfigInfoVmMonitoringState()
	 * @generated
	 */
	int CLUSTER_DAS_CONFIG_INFO_VM_MONITORING_STATE = 74;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoServiceState <em>Cluster Das Config Info Service State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoServiceState
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getClusterDasConfigInfoServiceState()
	 * @generated
	 */
	int CLUSTER_DAS_CONFIG_INFO_SERVICE_STATE = 75;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostFileSystemVolumeFileType <em>Host File System Volume File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostFileSystemVolumeFileType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostFileSystemVolumeFileType()
	 * @generated
	 */
	int HOST_FILE_SYSTEM_VOLUME_FILE_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.DatastoreMaintenanceModeState <em>Datastore Maintenance Mode State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.DatastoreMaintenanceModeState
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatastoreMaintenanceModeState()
	 * @generated
	 */
	int DATASTORE_MAINTENANCE_MODE_STATE = 77;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostNasVolumeSecurityType <em>Host Nas Volume Security Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostNasVolumeSecurityType
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostNasVolumeSecurityType()
	 * @generated
	 */
	int HOST_NAS_VOLUME_SECURITY_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.VirtualDeviceConnectStatus <em>Virtual Device Connect Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.VirtualDeviceConnectStatus
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getVirtualDeviceConnectStatus()
	 * @generated
	 */
	int VIRTUAL_DEVICE_CONNECT_STATUS = 79;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.vmware.HostCapabilityFtUnsupportedReason <em>Host Capability Ft Unsupported Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.HostCapabilityFtUnsupportedReason
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getHostCapabilityFtUnsupportedReason()
	 * @generated
	 */
	int HOST_CAPABILITY_FT_UNSUPPORTED_REASON = 80;

	/**
	 * The meta object id for the '<em>Long Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getLongNumber()
	 * @generated
	 */
	int LONG_NUMBER = 81;

	/**
	 * The meta object id for the '<em>Datetype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getDatetype()
	 * @generated
	 */
	int DATETYPE = 82;

	/**
	 * The meta object id for the '<em>Short Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getShortNumber()
	 * @generated
	 */
	int SHORT_NUMBER = 83;

	/**
	 * The meta object id for the '<em>Byte Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.vmware.impl.VmwarePackageImpl#getByteType()
	 * @generated
	 */
	int BYTE_TYPE = 84;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Datastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datastore</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastore
	 * @generated
	 */
	EClass getDatastore();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Datastore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastore#getName()
	 * @see #getDatastore()
	 * @generated
	 */
	EAttribute getDatastore_Name();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Datastore#enterMaintenanceMode() <em>Enter Maintenance Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Maintenance Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastore#enterMaintenanceMode()
	 * @generated
	 */
	EOperation getDatastore__EnterMaintenanceMode();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Cluster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster#getName()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Name();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Cluster#addAllHostSystem() <em>Add All Host System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add All Host System</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster#addAllHostSystem()
	 * @generated
	 */
	EOperation getCluster__AddAllHostSystem();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Cluster#applyRecommendation() <em>Apply Recommendation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Recommendation</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster#applyRecommendation()
	 * @generated
	 */
	EOperation getCluster__ApplyRecommendation();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Cluster#enterMaintenanceMode() <em>Enter Maintenance Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Maintenance Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster#enterMaintenanceMode()
	 * @generated
	 */
	EOperation getCluster__EnterMaintenanceMode();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenter</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter
	 * @generated
	 */
	EClass getDatacenter();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Datacenter#getDefaultHardwareVersionKey <em>Default Hardware Version Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Hardware Version Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter#getDefaultHardwareVersionKey()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DefaultHardwareVersionKey();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Datacenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter#getName()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Name();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Datacenter#powerOnMultiVMs() <em>Power On Multi VMs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Power On Multi VMs</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter#powerOnMultiVMs()
	 * @generated
	 */
	EOperation getDatacenter__PowerOnMultiVMs();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Datacenter#discoverAll() <em>Discover All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Discover All</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter#discoverAll()
	 * @generated
	 */
	EOperation getDatacenter__DiscoverAll();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem <em>Hostsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostsystem</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem
	 * @generated
	 */
	EClass getHostsystem();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getName()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isClusterSupported <em>Cluster Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster Supported</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isClusterSupported()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_ClusterSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInDasCluster <em>In Das Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Das Cluster</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isInDasCluster()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_InDasCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getServerip <em>Serverip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serverip</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getServerip()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_Serverip();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVimAccountNameRequired <em>Vim Account Name Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vim Account Name Required</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isVimAccountNameRequired()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_VimAccountNameRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmDatastoreName <em>Agent Vm Datastore Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Vm Datastore Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmDatastoreName()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_AgentVmDatastoreName();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmNetworkName <em>Agent Vm Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Vm Network Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmNetworkName()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_AgentVmNetworkName();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getPort()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isFaultToleranceEnabled <em>Fault Tolerance Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Tolerance Enabled</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isFaultToleranceEnabled()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_FaultToleranceEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionKeys <em>Host Feature Version Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Feature Version Keys</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionKeys()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_HostFeatureVersionKeys();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionValues <em>Host Feature Version Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Feature Version Values</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionValues()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_HostFeatureVersionValues();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVmotionEnabled <em>Vmotion Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmotion Enabled</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isVmotionEnabled()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_VmotionEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCurrentEVCModeKey <em>Current EVC Mode Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current EVC Mode Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getCurrentEVCModeKey()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_CurrentEVCModeKey();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCustomValues <em>Custom Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Values</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getCustomValues()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_CustomValues();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getManagementServerip <em>Management Serverip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Management Serverip</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getManagementServerip()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_ManagementServerip();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getMaxEVCKey <em>Max EVC Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max EVC Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getMaxEVCKey()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_MaxEVCKey();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallStatus <em>Overall Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Status</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallStatus()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_OverallStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedCPUFairness <em>Distributed CPU Fairness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distributed CPU Fairness</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedCPUFairness()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_DistributedCPUFairness();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedMemoryFairness <em>Distributed Memory Fairness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distributed Memory Fairness</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedMemoryFairness()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_DistributedMemoryFairness();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallCPUUsage <em>Overall CPU Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall CPU Usage</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallCPUUsage()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_OverallCPUUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallMemoryUsage <em>Overall Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Memory Usage</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallMemoryUsage()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_OverallMemoryUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isRebootRequired <em>Reboot Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reboot Required</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isRebootRequired()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_RebootRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getBootTime <em>Boot Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot Time</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getBootTime()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_BootTime();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#getConnectionState()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_ConnectionState();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInMaintenanceMode <em>In Maintenance Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Maintenance Mode</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#isInMaintenanceMode()
	 * @see #getHostsystem()
	 * @generated
	 */
	EAttribute getHostsystem_InMaintenanceMode();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#disconnectHost() <em>Disconnect Host</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect Host</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#disconnectHost()
	 * @generated
	 */
	EOperation getHostsystem__DisconnectHost();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#enterlLockDownMode() <em>Enterl Lock Down Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enterl Lock Down Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#enterlLockDownMode()
	 * @generated
	 */
	EOperation getHostsystem__EnterlLockDownMode();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#enterMaintenanceMode() <em>Enter Maintenance Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Maintenance Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#enterMaintenanceMode()
	 * @generated
	 */
	EOperation getHostsystem__EnterMaintenanceMode();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#exitLockDownMode() <em>Exit Lock Down Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit Lock Down Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#exitLockDownMode()
	 * @generated
	 */
	EOperation getHostsystem__ExitLockDownMode();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#exitMaintenanceMode() <em>Exit Maintenance Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exit Maintenance Mode</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#exitMaintenanceMode()
	 * @generated
	 */
	EOperation getHostsystem__ExitMaintenanceMode();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#reconfigureHostForDAS() <em>Reconfigure Host For DAS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconfigure Host For DAS</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#reconfigureHostForDAS()
	 * @generated
	 */
	EOperation getHostsystem__ReconfigureHostForDAS();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#reconnectHost() <em>Reconnect Host</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reconnect Host</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem#reconnectHost()
	 * @generated
	 */
	EOperation getHostsystem__ReconnectHost();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Vm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm
	 * @generated
	 */
	EClass getVm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getName()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getInstanceUUID <em>Instance UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance UUID</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getInstanceUUID()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_InstanceUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#isTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#isTemplate()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getVcpus <em>Vcpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpus</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getVcpus()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Vcpus();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getCoresPerSocket <em>Cores Per Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores Per Socket</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getCoresPerSocket()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_CoresPerSocket();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestState <em>Guest State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getGuestState()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_GuestState();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsInstalled <em>Vmware Tools Installed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmware Tools Installed</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsInstalled()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmwareToolsInstalled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsRunning <em>Vmware Tools Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmware Tools Running</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsRunning()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmwareToolsRunning();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestFullName <em>Guest Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Full Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getGuestFullName()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_GuestFullName();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuhotAddEnabled <em>Cpuhot Add Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpuhot Add Enabled</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#isCpuhotAddEnabled()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_CpuhotAddEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuHotRemoveEnabled <em>Cpu Hot Remove Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Hot Remove Enabled</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#isCpuHotRemoveEnabled()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_CpuHotRemoveEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getAnnotation()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getVmwarePowerState <em>Vmware Power State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmware Power State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getVmwarePowerState()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmwarePowerState();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vm#getOverallStatus <em>Overall Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Status</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#getOverallStatus()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_OverallStatus();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#cloneVM() <em>Clone VM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone VM</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#cloneVM()
	 * @generated
	 */
	EOperation getVm__CloneVM();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#mountVmwareToolsdisk() <em>Mount Vmware Toolsdisk</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mount Vmware Toolsdisk</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#mountVmwareToolsdisk()
	 * @generated
	 */
	EOperation getVm__MountVmwareToolsdisk();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#markAsTemplate() <em>Mark As Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark As Template</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#markAsTemplate()
	 * @generated
	 */
	EOperation getVm__MarkAsTemplate();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#markAsVirtualMachine() <em>Mark As Virtual Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark As Virtual Machine</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#markAsVirtualMachine()
	 * @generated
	 */
	EOperation getVm__MarkAsVirtualMachine();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#registerVM() <em>Register VM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register VM</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#registerVM()
	 * @generated
	 */
	EOperation getVm__RegisterVM();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#unregisterVM() <em>Unregister VM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister VM</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#unregisterVM()
	 * @generated
	 */
	EOperation getVm__UnregisterVM();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#defragmentAllDisks() <em>Defragment All Disks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Defragment All Disks</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#defragmentAllDisks()
	 * @generated
	 */
	EOperation getVm__DefragmentAllDisks();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Vm#resetLocationId() <em>Reset Location Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Location Id</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm#resetLocationId()
	 * @generated
	 */
	EOperation getVm__ResetLocationId();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Folderlink <em>Folderlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folderlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Folderlink
	 * @generated
	 */
	EClass getFolderlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Resourcepoollink <em>Resourcepoollink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resourcepoollink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepoollink
	 * @generated
	 */
	EClass getResourcepoollink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Clusterlink <em>Clusterlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clusterlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Clusterlink
	 * @generated
	 */
	EClass getClusterlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool <em>Resourcepool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resourcepool</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool
	 * @generated
	 */
	EClass getResourcepool();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool#getName()
	 * @see #getResourcepool()
	 * @generated
	 */
	EAttribute getResourcepool_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#isExpandablereservation <em>Expandablereservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expandablereservation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool#isExpandablereservation()
	 * @see #getResourcepool()
	 * @generated
	 */
	EAttribute getResourcepool_Expandablereservation();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool#getLimit()
	 * @see #getResourcepool()
	 * @generated
	 */
	EAttribute getResourcepool_Limit();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool#getReservation()
	 * @see #getResourcepool()
	 * @generated
	 */
	EAttribute getResourcepool_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool#getState()
	 * @see #getResourcepool()
	 * @generated
	 */
	EAttribute getResourcepool_State();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Datacenterlink <em>Datacenterlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenterlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenterlink
	 * @generated
	 */
	EClass getDatacenterlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostsystemlink <em>Hostsystemlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostsystemlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystemlink
	 * @generated
	 */
	EClass getHostsystemlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Datastorelink <em>Datastorelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datastorelink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastorelink
	 * @generated
	 */
	EClass getDatastorelink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisk <em>Virtualdisk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualdisk</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisk
	 * @generated
	 */
	EClass getVirtualdisk();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisk#getVolumeName <em>Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisk#getVolumeName()
	 * @see #getVirtualdisk()
	 * @generated
	 */
	EAttribute getVirtualdisk_VolumeName();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisk#zeroFill() <em>Zero Fill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zero Fill</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisk#zeroFill()
	 * @generated
	 */
	EOperation getVirtualdisk__ZeroFill();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisk#shrink() <em>Shrink</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shrink</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisk#shrink()
	 * @generated
	 */
	EOperation getVirtualdisk__Shrink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Vswitch <em>Vswitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vswitch</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch
	 * @generated
	 */
	EClass getVswitch();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch#getName()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getNbport <em>Nbport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbport</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch#getNbport()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_Nbport();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getBeaconInterval <em>Beacon Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beacon Interval</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch#getBeaconInterval()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_BeaconInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getMtu <em>Mtu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mtu</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch#getMtu()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_Mtu();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getChangeOperation <em>Change Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Operation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch#getChangeOperation()
	 * @see #getVswitch()
	 * @generated
	 */
	EAttribute getVswitch_ChangeOperation();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Portgroup <em>Portgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portgroup</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgroup
	 * @generated
	 */
	EClass getPortgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgroup#getName()
	 * @see #getPortgroup()
	 * @generated
	 */
	EAttribute getPortgroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getVlanId <em>Vlan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vlan Id</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgroup#getVlanId()
	 * @see #getPortgroup()
	 * @generated
	 */
	EAttribute getPortgroup_VlanId();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgroup#getKey()
	 * @see #getPortgroup()
	 * @generated
	 */
	EAttribute getPortgroup_Key();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter <em>Virtualnetworkadapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualnetworkadapter</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter
	 * @generated
	 */
	EClass getVirtualnetworkadapter();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getName()
	 * @see #getVirtualnetworkadapter()
	 * @generated
	 */
	EAttribute getVirtualnetworkadapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getKey()
	 * @see #getVirtualnetworkadapter()
	 * @generated
	 */
	EAttribute getVirtualnetworkadapter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getSubnetMask <em>Subnet Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Mask</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getSubnetMask()
	 * @see #getVirtualnetworkadapter()
	 * @generated
	 */
	EAttribute getVirtualnetworkadapter_SubnetMask();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getPort()
	 * @see #getVirtualnetworkadapter()
	 * @generated
	 */
	EAttribute getVirtualnetworkadapter_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getDeviceDriver <em>Device Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Driver</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getDeviceDriver()
	 * @see #getVirtualnetworkadapter()
	 * @generated
	 */
	EAttribute getVirtualnetworkadapter_DeviceDriver();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#connectAdaptater() <em>Connect Adaptater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect Adaptater</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#connectAdaptater()
	 * @generated
	 */
	EOperation getVirtualnetworkadapter__ConnectAdaptater();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#disconnectAdaptater() <em>Disconnect Adaptater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect Adaptater</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#disconnectAdaptater()
	 * @generated
	 */
	EOperation getVirtualnetworkadapter__DisconnectAdaptater();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork <em>Virtualdisknetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualdisknetwork</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork
	 * @generated
	 */
	EClass getVirtualdisknetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork#getVolumeName <em>Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork#getVolumeName()
	 * @see #getVirtualdisknetwork()
	 * @generated
	 */
	EAttribute getVirtualdisknetwork_VolumeName();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink <em>Virtualdisknetworklink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualdisknetworklink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink
	 * @generated
	 */
	EClass getVirtualdisknetworklink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter <em>Hostnetworkadapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostnetworkadapter</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter
	 * @generated
	 */
	EClass getHostnetworkadapter();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getName()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getDriver()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getKey()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getPci <em>Pci</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pci</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getPci()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_Pci();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getSubnetMask <em>Subnet Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Mask</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getSubnetMask()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_SubnetMask();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#isWakeOnLanSupported <em>Wake On Lan Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wake On Lan Supported</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#isWakeOnLanSupported()
	 * @see #getHostnetworkadapter()
	 * @generated
	 */
	EAttribute getHostnetworkadapter_WakeOnLanSupported();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#connect()
	 * @generated
	 */
	EOperation getHostnetworkadapter__Connect();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#disconnect()
	 * @generated
	 */
	EOperation getHostnetworkadapter__Disconnect();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Dvswitch <em>Dvswitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dvswitch</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Dvswitch
	 * @generated
	 */
	EClass getDvswitch();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Snapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshot</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Snapshot
	 * @generated
	 */
	EClass getSnapshot();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Snapshot#restore() <em>Restore</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restore</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Snapshot#restore()
	 * @generated
	 */
	EOperation getSnapshot__Restore();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Snapshotlink <em>Snapshotlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshotlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Snapshotlink
	 * @generated
	 */
	EClass getSnapshotlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostfolder <em>Hostfolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostfolder</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfolder
	 * @generated
	 */
	EClass getHostfolder();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfolder#getName()
	 * @see #getHostfolder()
	 * @generated
	 */
	EAttribute getHostfolder_Name();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability <em>Vcentercapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcentercapability</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability
	 * @generated
	 */
	EClass getVcentercapability();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isMultiHostSupported <em>Multi Host Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Host Supported</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability#isMultiHostSupported()
	 * @see #getVcentercapability()
	 * @generated
	 */
	EAttribute getVcentercapability_MultiHostSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isProvisioningSupported <em>Provisioning Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provisioning Supported</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability#isProvisioningSupported()
	 * @see #getVcentercapability()
	 * @generated
	 */
	EAttribute getVcentercapability_ProvisioningSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isUserShellAccessSupported <em>User Shell Access Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Shell Access Supported</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability#isUserShellAccessSupported()
	 * @see #getVcentercapability()
	 * @generated
	 */
	EAttribute getVcentercapability_UserShellAccessSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendor <em>EVC Mode Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EVC Mode Vendor</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendor()
	 * @see #getVcentercapability()
	 * @generated
	 */
	EAttribute getVcentercapability_EVCModeVendor();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendorTier <em>EVC Mode Vendor Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EVC Mode Vendor Tier</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendorTier()
	 * @see #getVcentercapability()
	 * @generated
	 */
	EAttribute getVcentercapability_EVCModeVendorTier();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem <em>Hostfirewallsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostfirewallsystem</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem
	 * @generated
	 */
	EClass getHostfirewallsystem();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultIncomingBlocked <em>Default Incoming Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Incoming Blocked</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultIncomingBlocked()
	 * @see #getHostfirewallsystem()
	 * @generated
	 */
	EAttribute getHostfirewallsystem_DefaultIncomingBlocked();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultOutgoingBlocked <em>Default Outgoing Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Outgoing Blocked</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultOutgoingBlocked()
	 * @see #getHostfirewallsystem()
	 * @generated
	 */
	EAttribute getHostfirewallsystem_DefaultOutgoingBlocked();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset <em>Hostfirewallruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostfirewallruleset</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset
	 * @generated
	 */
	EClass getHostfirewallruleset();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isEnabled()
	 * @see #getHostfirewallruleset()
	 * @generated
	 */
	EAttribute getHostfirewallruleset_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getKey()
	 * @see #getHostfirewallruleset()
	 * @generated
	 */
	EAttribute getHostfirewallruleset_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getLabel()
	 * @see #getHostfirewallruleset()
	 * @generated
	 */
	EAttribute getHostfirewallruleset_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isRequired()
	 * @see #getHostfirewallruleset()
	 * @generated
	 */
	EAttribute getHostfirewallruleset_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getService()
	 * @see #getHostfirewallruleset()
	 * @generated
	 */
	EAttribute getHostfirewallruleset_Service();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#disableRuleset() <em>Disable Ruleset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable Ruleset</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#disableRuleset()
	 * @generated
	 */
	EOperation getHostfirewallruleset__DisableRuleset();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#enableRuleset() <em>Enable Ruleset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable Ruleset</em>' operation.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#enableRuleset()
	 * @generated
	 */
	EOperation getHostfirewallruleset__EnableRuleset();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule <em>Hostfirewallrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostfirewallrule</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule
	 * @generated
	 */
	EClass getHostfirewallrule();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getDirection()
	 * @see #getHostfirewallrule()
	 * @generated
	 */
	EAttribute getHostfirewallrule_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getPort()
	 * @see #getHostfirewallrule()
	 * @generated
	 */
	EAttribute getHostfirewallrule_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getEndPort <em>End Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getEndPort()
	 * @see #getHostfirewallrule()
	 * @generated
	 */
	EAttribute getHostfirewallrule_EndPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getProtocol()
	 * @see #getHostfirewallrule()
	 * @generated
	 */
	EAttribute getHostfirewallrule_Protocol();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hoststorage <em>Hoststorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoststorage</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hoststorage
	 * @generated
	 */
	EClass getHoststorage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hoststorage#getHostVolumeName <em>Host Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Volume Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hoststorage#getHostVolumeName()
	 * @see #getHoststorage()
	 * @generated
	 */
	EAttribute getHoststorage_HostVolumeName();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hoststoragelink <em>Hoststoragelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoststoragelink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hoststoragelink
	 * @generated
	 */
	EClass getHoststoragelink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Vmfolder <em>Vmfolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmfolder</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vmfolder
	 * @generated
	 */
	EClass getVmfolder();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Vmfolder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Vmfolder#getName()
	 * @see #getVmfolder()
	 * @generated
	 */
	EAttribute getVmfolder_Name();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Serviceconsolenic <em>Serviceconsolenic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serviceconsolenic</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Serviceconsolenic
	 * @generated
	 */
	EClass getServiceconsolenic();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Portgrouplink <em>Portgrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portgrouplink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgrouplink
	 * @generated
	 */
	EClass getPortgrouplink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule <em>Hostnatrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostnatrule</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule
	 * @generated
	 */
	EClass getHostnatrule();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isActiveFtp <em>Active Ftp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Ftp</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#isActiveFtp()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_ActiveFtp();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isAllowAnyOui <em>Allow Any Oui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Any Oui</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#isAllowAnyOui()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_AllowAnyOui();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isConfigPort <em>Config Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#isConfigPort()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_ConfigPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatKey <em>Nat Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Key</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatKey()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_NatKey();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatChangeOperation <em>Nat Change Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Change Operation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatChangeOperation()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_NatChangeOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getIpGatewayAddress <em>Ip Gateway Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Gateway Address</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#getIpGatewayAddress()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_IpGatewayAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getUdpTimeOut <em>Udp Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udp Time Out</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule#getUdpTimeOut()
	 * @see #getHostnatrule()
	 * @generated
	 */
	EAttribute getHostnatrule_UdpTimeOut();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink <em>Hostnatportforwardlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostnatportforwardlink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink
	 * @generated
	 */
	EClass getHostnatportforwardlink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestIpAddress <em>Guest Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Ip Address</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestIpAddress()
	 * @see #getHostnatportforwardlink()
	 * @generated
	 */
	EAttribute getHostnatportforwardlink_GuestIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestPort <em>Guest Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestPort()
	 * @see #getHostnatportforwardlink()
	 * @generated
	 */
	EAttribute getHostnatportforwardlink_GuestPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getHostPort()
	 * @see #getHostnatportforwardlink()
	 * @generated
	 */
	EAttribute getHostnatportforwardlink_HostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getName()
	 * @see #getHostnatportforwardlink()
	 * @generated
	 */
	EAttribute getHostnatportforwardlink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getType()
	 * @see #getHostnatportforwardlink()
	 * @generated
	 */
	EAttribute getHostnatportforwardlink_Type();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Distributedportgroup <em>Distributedportgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributedportgroup</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Distributedportgroup
	 * @generated
	 */
	EClass getDistributedportgroup();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom <em>Virtualcdrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualcdrom</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualcdrom
	 * @generated
	 */
	EClass getVirtualcdrom();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getIsoFilename <em>Iso Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Filename</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getIsoFilename()
	 * @see #getVirtualcdrom()
	 * @generated
	 */
	EAttribute getVirtualcdrom_IsoFilename();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getVolumeName <em>Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getVolumeName()
	 * @see #getVirtualcdrom()
	 * @generated
	 */
	EAttribute getVirtualcdrom_VolumeName();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualfloppy <em>Virtualfloppy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualfloppy</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualfloppy
	 * @generated
	 */
	EClass getVirtualfloppy();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualfloppy#getVolumeName <em>Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Name</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualfloppy#getVolumeName()
	 * @see #getVirtualfloppy()
	 * @generated
	 */
	EAttribute getVirtualfloppy_VolumeName();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisklink <em>Virtualdisklink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtualdisklink</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisklink
	 * @generated
	 */
	EClass getVirtualdisklink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisklink#getVmdkFilePathOnDatastore <em>Vmdk File Path On Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmdk File Path On Datastore</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisklink#getVmdkFilePathOnDatastore()
	 * @see #getVirtualdisklink()
	 * @generated
	 */
	EAttribute getVirtualdisklink_VmdkFilePathOnDatastore();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.SharesLevel <em>Shares Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shares Level</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.SharesLevel
	 * @generated
	 */
	EEnum getSharesLevel();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DvsNicTeamingPolicy <em>Dvs Nic Teaming Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dvs Nic Teaming Policy</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DvsNicTeamingPolicy
	 * @generated
	 */
	EEnum getDvsNicTeamingPolicy();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.Bootdevice <em>Bootdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bootdevice</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.Bootdevice
	 * @generated
	 */
	EEnum getBootdevice();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ResourceAllocationType <em>Resource Allocation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Allocation Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ResourceAllocationType
	 * @generated
	 */
	EEnum getResourceAllocationType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ResourcePoolState <em>Resource Pool State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Pool State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ResourcePoolState
	 * @generated
	 */
	EEnum getResourcePoolState();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.PowerOffType <em>Power Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Off Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.PowerOffType
	 * @generated
	 */
	EEnum getPowerOffType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.GuestFirmwareType <em>Guest Firmware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Firmware Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.GuestFirmwareType
	 * @generated
	 */
	EEnum getGuestFirmwareType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmHtSharing <em>Vm Ht Sharing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Ht Sharing</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmHtSharing
	 * @generated
	 */
	EEnum getVmHtSharing();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmMonitorType <em>Vm Monitor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Monitor Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmMonitorType
	 * @generated
	 */
	EEnum getVmMonitorType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmPowerOffBehavior <em>Vm Power Off Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Power Off Behavior</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmPowerOffBehavior
	 * @generated
	 */
	EEnum getVmPowerOffBehavior();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmExecUsage <em>Vm Exec Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Exec Usage</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmExecUsage
	 * @generated
	 */
	EEnum getVmExecUsage();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmMMUusage <em>Vm MM Uusage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm MM Uusage</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmMMUusage
	 * @generated
	 */
	EEnum getVmMMUusage();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.NpivWwnType <em>Npiv Wwn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Npiv Wwn Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.NpivWwnType
	 * @generated
	 */
	EEnum getNpivWwnType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmSwapPlacementType <em>Vm Swap Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Swap Placement Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmSwapPlacementType
	 * @generated
	 */
	EEnum getVmSwapPlacementType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.GuestOsIdentifiers <em>Guest Os Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Os Identifiers</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.GuestOsIdentifiers
	 * @generated
	 */
	EEnum getGuestOsIdentifiers();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ToolsUpgradePolicy <em>Tools Upgrade Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tools Upgrade Policy</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ToolsUpgradePolicy
	 * @generated
	 */
	EEnum getToolsUpgradePolicy();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.OverallStatus <em>Overall Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overall Status</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @generated
	 */
	EEnum getOverallStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostConnectionState <em>Host Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Connection State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostConnectionState
	 * @generated
	 */
	EEnum getHostConnectionState();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DiagnosticPartitionType <em>Diagnostic Partition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Partition Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DiagnosticPartitionType
	 * @generated
	 */
	EEnum getDiagnosticPartitionType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.AutoStartWaitHeartbeatSetting <em>Auto Start Wait Heartbeat Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Start Wait Heartbeat Setting</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.AutoStartWaitHeartbeatSetting
	 * @generated
	 */
	EEnum getAutoStartWaitHeartbeatSetting();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection <em>Host Firewall Rule Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Firewall Rule Direction</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection
	 * @generated
	 */
	EEnum getHostFirewallRuleDirection();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol <em>Host Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Network Protocol</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @generated
	 */
	EEnum getHostNetworkProtocol();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsRestartPriority <em>Cluster DAS Vm Settings Restart Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster DAS Vm Settings Restart Priority</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsRestartPriority
	 * @generated
	 */
	EEnum getClusterDASVmSettingsRestartPriority();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsIsolationResponse <em>Cluster DAS Vm Settings Isolation Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster DAS Vm Settings Isolation Response</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsIsolationResponse
	 * @generated
	 */
	EEnum getClusterDASVmSettingsIsolationResponse();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DrsBehavior <em>Drs Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drs Behavior</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DrsBehavior
	 * @generated
	 */
	EEnum getDrsBehavior();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DpmBehavior <em>Dpm Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dpm Behavior</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DpmBehavior
	 * @generated
	 */
	EEnum getDpmBehavior();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DatastoreHostMountMode <em>Datastore Host Mount Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datastore Host Mount Mode</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DatastoreHostMountMode
	 * @generated
	 */
	EEnum getDatastoreHostMountMode();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.NicPolicyTeamingValue <em>Nic Policy Teaming Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nic Policy Teaming Value</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.NicPolicyTeamingValue
	 * @generated
	 */
	EEnum getNicPolicyTeamingValue();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.PortGroupConnecteeType <em>Port Group Connectee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Group Connectee Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.PortGroupConnecteeType
	 * @generated
	 */
	EEnum getPortGroupConnecteeType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation <em>Network Change Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Change Operation</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @generated
	 */
	EEnum getNetworkChangeOperation();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.NetworkBootProtocolType <em>Network Boot Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Boot Protocol Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkBootProtocolType
	 * @generated
	 */
	EEnum getNetworkBootProtocolType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmForkConfigInfoChildType <em>Vm Fork Config Info Child Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Fork Config Info Child Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmForkConfigInfoChildType
	 * @generated
	 */
	EEnum getVmForkConfigInfoChildType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VmFaultToleranceType <em>Vm Fault Tolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Fault Tolerance Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VmFaultToleranceType
	 * @generated
	 */
	EEnum getVmFaultToleranceType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.LatencySensitivityLevel <em>Latency Sensitivity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Latency Sensitivity Level</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.LatencySensitivityLevel
	 * @generated
	 */
	EEnum getLatencySensitivityLevel();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoHBDatastoreCandidate <em>Cluster Das Config Info HB Datastore Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster Das Config Info HB Datastore Candidate</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoHBDatastoreCandidate
	 * @generated
	 */
	EEnum getClusterDasConfigInfoHBDatastoreCandidate();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoVmMonitoringState <em>Cluster Das Config Info Vm Monitoring State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster Das Config Info Vm Monitoring State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoVmMonitoringState
	 * @generated
	 */
	EEnum getClusterDasConfigInfoVmMonitoringState();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoServiceState <em>Cluster Das Config Info Service State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster Das Config Info Service State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoServiceState
	 * @generated
	 */
	EEnum getClusterDasConfigInfoServiceState();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostFileSystemVolumeFileType <em>Host File System Volume File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host File System Volume File Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostFileSystemVolumeFileType
	 * @generated
	 */
	EEnum getHostFileSystemVolumeFileType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.DatastoreMaintenanceModeState <em>Datastore Maintenance Mode State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datastore Maintenance Mode State</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.DatastoreMaintenanceModeState
	 * @generated
	 */
	EEnum getDatastoreMaintenanceModeState();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostNasVolumeSecurityType <em>Host Nas Volume Security Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Nas Volume Security Type</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNasVolumeSecurityType
	 * @generated
	 */
	EEnum getHostNasVolumeSecurityType();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.VirtualDeviceConnectStatus <em>Virtual Device Connect Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtual Device Connect Status</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.VirtualDeviceConnectStatus
	 * @generated
	 */
	EEnum getVirtualDeviceConnectStatus();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.vmware.HostCapabilityFtUnsupportedReason <em>Host Capability Ft Unsupported Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Capability Ft Unsupported Reason</em>'.
	 * @see org.occiware.clouddesigner.occi.vmware.HostCapabilityFtUnsupportedReason
	 * @generated
	 */
	EEnum getHostCapabilityFtUnsupportedReason();

	/**
	 * Returns the meta object for data type '<em>Long Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long Number</em>'.
	 * @model instanceClass="long"
	 * @generated
	 */
	EDataType getLongNumber();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Datetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datetype</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDatetype();

	/**
	 * Returns the meta object for data type '<em>Short Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Short Number</em>'.
	 * @model instanceClass="short"
	 * @generated
	 */
	EDataType getShortNumber();

	/**
	 * Returns the meta object for data type '<em>Byte Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte Type</em>'.
	 * @model instanceClass="byte"
	 * @generated
	 */
	EDataType getByteType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmwareFactory getVmwareFactory();

} //VmwarePackage
