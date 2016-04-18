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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.occiware.clouddesigner.occi.cloud.CloudFactory
 * @model kind="package"
 * @generated
 */
public interface CloudPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloud";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/cloud/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloud";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudPackage eINSTANCE = org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.MachineImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine()
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
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_CloudSigmaImpl <em>Machine Cloud Sigma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_CloudSigmaImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_CloudSigma()
	 * @generated
	 */
	int MACHINE_CLOUD_SIGMA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__EMAIL = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA__PASSWORD = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine Cloud Sigma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_CLOUD_SIGMA_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Amazon_EC2()
	 * @generated
	 */
	int MACHINE_AMAZON_EC2 = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ACCESS_KEY = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SECRET_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__REGION = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__IMAGE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Key pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__KEY_PAIR = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Machine Amazon EC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GogridImpl <em>Machine Gogrid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_GogridImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Gogrid()
	 * @generated
	 */
	int MACHINE_GOGRID = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__KEY = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shared secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__SHARED_SECRET = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID__IMAGE_ID = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machine Gogrid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOGRID_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl <em>Machine Hp Helion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Hp_Helion()
	 * @generated
	 */
	int MACHINE_HP_HELION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__TENANT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__ACCESS_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__SECRET_KEY = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__IMAGE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__ZONE = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__FLAVOR_ID = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__KEY_PAIR = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION__FLOATING_IP = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Machine Hp Helion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_HP_HELION_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl <em>Machine GCE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_GCE()
	 * @generated
	 */
	int MACHINE_GCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__ZONE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__REGION = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Machine type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__MACHINE_TYPE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Machine url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__MACHINE_URL = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Firewall tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__FIREWALL_TAG = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Startup script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__STARTUP_SCRIPT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Json file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__JSON_FILE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE__PROVIDER = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Machine GCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GCE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_RackSpaceImpl <em>Machine Rack Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_RackSpaceImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_RackSpace()
	 * @generated
	 */
	int MACHINE_RACK_SPACE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__USERNAME = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__API_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__REGION = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE__IMAGE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machine Rack Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACK_SPACE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_ProfitBricksImpl <em>Machine Profit Bricks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_ProfitBricksImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_ProfitBricks()
	 * @generated
	 */
	int MACHINE_PROFIT_BRICKS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__USERNAME = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__API_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__EMAIL = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__PASSWORD = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS__LOCATION = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Machine Profit Bricks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_PROFIT_BRICKS_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl <em>Machine Open Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_OpenStack()
	 * @generated
	 */
	int MACHINE_OPEN_STACK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__TENANT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__USERNAME = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__PASSWORD = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENDPOINT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__IMAGE_ID = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flavor name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__FLAVOR_NAME = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__FLAVOR_ID = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Network name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NETWORK_NAME = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NETWORK_ID = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Floating ip pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__FLOATING_IP_POOL = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Image name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__IMAGE_NAME = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Keypair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__KEYPAIR = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__REGION = MACHINE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Machine Open Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl <em>Machine Soft Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl
	 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_SoftLayer()
	 * @generated
	 */
	int MACHINE_SOFT_LAYER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__PROVIDER = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__USERNAME = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__API_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__LOCATION_ID = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__IMAGE_ID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__DOMAIN_NAME = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Disk type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__DISK_TYPE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__TENANT = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER__ENDPOINT = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Machine Soft Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_SOFT_LAYER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma <em>Machine Cloud Sigma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Cloud Sigma</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma
	 * @generated
	 */
	EClass getMachine_CloudSigma();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getProvider()
	 * @see #getMachine_CloudSigma()
	 * @generated
	 */
	EAttribute getMachine_CloudSigma_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getEmail()
	 * @see #getMachine_CloudSigma()
	 * @generated
	 */
	EAttribute getMachine_CloudSigma_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma#getPassword()
	 * @see #getMachine_CloudSigma()
	 * @generated
	 */
	EAttribute getMachine_CloudSigma_Password();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2 <em>Machine Amazon EC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Amazon EC2</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2
	 * @generated
	 */
	EClass getMachine_Amazon_EC2();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getProvider()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getAccess_key()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Access_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecret_key()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Secret_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getRegion()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getImage()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security group</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecurity_group()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Security_group();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getKey_pair <em>Key pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key pair</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getKey_pair()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Key_pair();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid <em>Machine Gogrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Gogrid</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Gogrid
	 * @generated
	 */
	EClass getMachine_Gogrid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getProvider()
	 * @see #getMachine_Gogrid()
	 * @generated
	 */
	EAttribute getMachine_Gogrid_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getKey()
	 * @see #getMachine_Gogrid()
	 * @generated
	 */
	EAttribute getMachine_Gogrid_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getShared_secret <em>Shared secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared secret</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getShared_secret()
	 * @see #getMachine_Gogrid()
	 * @generated
	 */
	EAttribute getMachine_Gogrid_Shared_secret();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getImage_id <em>Image id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getImage_id()
	 * @see #getMachine_Gogrid()
	 * @generated
	 */
	EAttribute getMachine_Gogrid_Image_id();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion <em>Machine Hp Helion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Hp Helion</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion
	 * @generated
	 */
	EClass getMachine_Hp_Helion();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getProvider()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getTenant()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Tenant();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getAccess_key <em>Access key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getAccess_key()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Access_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecret_key <em>Secret key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecret_key()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Secret_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getImage()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getZone()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Zone();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFlavor_id <em>Flavor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFlavor_id()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Flavor_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getKey_pair <em>Key pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key pair</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getKey_pair()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Key_pair();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecurity_group <em>Security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security group</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecurity_group()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Security_group();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFloating_ip <em>Floating ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating ip</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFloating_ip()
	 * @see #getMachine_Hp_Helion()
	 * @generated
	 */
	EAttribute getMachine_Hp_Helion_Floating_ip();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE <em>Machine GCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine GCE</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE
	 * @generated
	 */
	EClass getMachine_GCE();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getZone()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Zone();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getRegion()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_type <em>Machine type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine type</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_type()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Machine_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_url <em>Machine url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine url</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_url()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Machine_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getFirewall_tag <em>Firewall tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firewall tag</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getFirewall_tag()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Firewall_tag();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getStartup_script <em>Startup script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup script</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getStartup_script()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Startup_script();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getJson_file <em>Json file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json file</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getJson_file()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Json_file();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_GCE#getProvider()
	 * @see #getMachine_GCE()
	 * @generated
	 */
	EAttribute getMachine_GCE_Provider();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace <em>Machine Rack Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Rack Space</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace
	 * @generated
	 */
	EClass getMachine_RackSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getProvider()
	 * @see #getMachine_RackSpace()
	 * @generated
	 */
	EAttribute getMachine_RackSpace_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getUsername()
	 * @see #getMachine_RackSpace()
	 * @generated
	 */
	EAttribute getMachine_RackSpace_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getApi_key()
	 * @see #getMachine_RackSpace()
	 * @generated
	 */
	EAttribute getMachine_RackSpace_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getRegion()
	 * @see #getMachine_RackSpace()
	 * @generated
	 */
	EAttribute getMachine_RackSpace_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_RackSpace#getImage()
	 * @see #getMachine_RackSpace()
	 * @generated
	 */
	EAttribute getMachine_RackSpace_Image();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks <em>Machine Profit Bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Profit Bricks</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks
	 * @generated
	 */
	EClass getMachine_ProfitBricks();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getProvider()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getUsername()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getApi_key()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getEmail()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getPassword()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks#getLocation()
	 * @see #getMachine_ProfitBricks()
	 * @generated
	 */
	EAttribute getMachine_ProfitBricks_Location();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack <em>Machine Open Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Open Stack</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack
	 * @generated
	 */
	EClass getMachine_OpenStack();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getProvider()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getTenant()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Tenant();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getUsername()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getPassword()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getEndpoint()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_id <em>Image id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Image_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_name <em>Flavor name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor name</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_name()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Flavor_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Flavor_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getSecurity_group <em>Security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security group</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getSecurity_group()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Security_group();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_name <em>Network name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network name</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_name()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Network_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Network_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFloating_ip_pool <em>Floating ip pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating ip pool</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFloating_ip_pool()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Floating_ip_pool();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_name <em>Image name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image name</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_name()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Image_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getKeypair <em>Keypair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keypair</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getKeypair()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Keypair();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getRegion()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Region();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer <em>Machine Soft Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Soft Layer</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer
	 * @generated
	 */
	EClass getMachine_SoftLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getProvider()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getUsername()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getApi_key()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getLocation_id <em>Location id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getLocation_id()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Location_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getImage_id <em>Image id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image id</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getImage_id()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Image_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getDomain_name <em>Domain name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain name</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getDomain_name()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Domain_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getDisk_type <em>Disk type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk type</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getDisk_type()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Disk_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getTenant()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Tenant();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer#getEndpoint()
	 * @see #getMachine_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_SoftLayer_Endpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudFactory getCloudFactory();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.MachineImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine()
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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_CloudSigmaImpl <em>Machine Cloud Sigma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_CloudSigmaImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_CloudSigma()
		 * @generated
		 */
		EClass MACHINE_CLOUD_SIGMA = eINSTANCE.getMachine_CloudSigma();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_CLOUD_SIGMA__PROVIDER = eINSTANCE.getMachine_CloudSigma_Provider();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_CLOUD_SIGMA__EMAIL = eINSTANCE.getMachine_CloudSigma_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_CLOUD_SIGMA__PASSWORD = eINSTANCE.getMachine_CloudSigma_Password();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Amazon_EC2()
		 * @generated
		 */
		EClass MACHINE_AMAZON_EC2 = eINSTANCE.getMachine_Amazon_EC2();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__PROVIDER = eINSTANCE.getMachine_Amazon_EC2_Provider();

		/**
		 * The meta object literal for the '<em><b>Access key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__ACCESS_KEY = eINSTANCE.getMachine_Amazon_EC2_Access_key();

		/**
		 * The meta object literal for the '<em><b>Secret key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SECRET_KEY = eINSTANCE.getMachine_Amazon_EC2_Secret_key();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__REGION = eINSTANCE.getMachine_Amazon_EC2_Region();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__IMAGE = eINSTANCE.getMachine_Amazon_EC2_Image();

		/**
		 * The meta object literal for the '<em><b>Security group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SECURITY_GROUP = eINSTANCE.getMachine_Amazon_EC2_Security_group();

		/**
		 * The meta object literal for the '<em><b>Key pair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__KEY_PAIR = eINSTANCE.getMachine_Amazon_EC2_Key_pair();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GogridImpl <em>Machine Gogrid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_GogridImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Gogrid()
		 * @generated
		 */
		EClass MACHINE_GOGRID = eINSTANCE.getMachine_Gogrid();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOGRID__PROVIDER = eINSTANCE.getMachine_Gogrid_Provider();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOGRID__KEY = eINSTANCE.getMachine_Gogrid_Key();

		/**
		 * The meta object literal for the '<em><b>Shared secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOGRID__SHARED_SECRET = eINSTANCE.getMachine_Gogrid_Shared_secret();

		/**
		 * The meta object literal for the '<em><b>Image id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOGRID__IMAGE_ID = eINSTANCE.getMachine_Gogrid_Image_id();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl <em>Machine Hp Helion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_Hp_Helion()
		 * @generated
		 */
		EClass MACHINE_HP_HELION = eINSTANCE.getMachine_Hp_Helion();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__PROVIDER = eINSTANCE.getMachine_Hp_Helion_Provider();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__TENANT = eINSTANCE.getMachine_Hp_Helion_Tenant();

		/**
		 * The meta object literal for the '<em><b>Access key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__ACCESS_KEY = eINSTANCE.getMachine_Hp_Helion_Access_key();

		/**
		 * The meta object literal for the '<em><b>Secret key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__SECRET_KEY = eINSTANCE.getMachine_Hp_Helion_Secret_key();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__IMAGE = eINSTANCE.getMachine_Hp_Helion_Image();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__ZONE = eINSTANCE.getMachine_Hp_Helion_Zone();

		/**
		 * The meta object literal for the '<em><b>Flavor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__FLAVOR_ID = eINSTANCE.getMachine_Hp_Helion_Flavor_id();

		/**
		 * The meta object literal for the '<em><b>Key pair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__KEY_PAIR = eINSTANCE.getMachine_Hp_Helion_Key_pair();

		/**
		 * The meta object literal for the '<em><b>Security group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__SECURITY_GROUP = eINSTANCE.getMachine_Hp_Helion_Security_group();

		/**
		 * The meta object literal for the '<em><b>Floating ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_HP_HELION__FLOATING_IP = eINSTANCE.getMachine_Hp_Helion_Floating_ip();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl <em>Machine GCE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_GCE()
		 * @generated
		 */
		EClass MACHINE_GCE = eINSTANCE.getMachine_GCE();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__ZONE = eINSTANCE.getMachine_GCE_Zone();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__REGION = eINSTANCE.getMachine_GCE_Region();

		/**
		 * The meta object literal for the '<em><b>Machine type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__MACHINE_TYPE = eINSTANCE.getMachine_GCE_Machine_type();

		/**
		 * The meta object literal for the '<em><b>Machine url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__MACHINE_URL = eINSTANCE.getMachine_GCE_Machine_url();

		/**
		 * The meta object literal for the '<em><b>Firewall tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__FIREWALL_TAG = eINSTANCE.getMachine_GCE_Firewall_tag();

		/**
		 * The meta object literal for the '<em><b>Startup script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__STARTUP_SCRIPT = eINSTANCE.getMachine_GCE_Startup_script();

		/**
		 * The meta object literal for the '<em><b>Json file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__JSON_FILE = eINSTANCE.getMachine_GCE_Json_file();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GCE__PROVIDER = eINSTANCE.getMachine_GCE_Provider();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_RackSpaceImpl <em>Machine Rack Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_RackSpaceImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_RackSpace()
		 * @generated
		 */
		EClass MACHINE_RACK_SPACE = eINSTANCE.getMachine_RackSpace();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACK_SPACE__PROVIDER = eINSTANCE.getMachine_RackSpace_Provider();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACK_SPACE__USERNAME = eINSTANCE.getMachine_RackSpace_Username();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACK_SPACE__API_KEY = eINSTANCE.getMachine_RackSpace_Api_key();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACK_SPACE__REGION = eINSTANCE.getMachine_RackSpace_Region();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACK_SPACE__IMAGE = eINSTANCE.getMachine_RackSpace_Image();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_ProfitBricksImpl <em>Machine Profit Bricks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_ProfitBricksImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_ProfitBricks()
		 * @generated
		 */
		EClass MACHINE_PROFIT_BRICKS = eINSTANCE.getMachine_ProfitBricks();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__PROVIDER = eINSTANCE.getMachine_ProfitBricks_Provider();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__USERNAME = eINSTANCE.getMachine_ProfitBricks_Username();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__API_KEY = eINSTANCE.getMachine_ProfitBricks_Api_key();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__EMAIL = eINSTANCE.getMachine_ProfitBricks_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__PASSWORD = eINSTANCE.getMachine_ProfitBricks_Password();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_PROFIT_BRICKS__LOCATION = eINSTANCE.getMachine_ProfitBricks_Location();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl <em>Machine Open Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_OpenStack()
		 * @generated
		 */
		EClass MACHINE_OPEN_STACK = eINSTANCE.getMachine_OpenStack();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__PROVIDER = eINSTANCE.getMachine_OpenStack_Provider();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__TENANT = eINSTANCE.getMachine_OpenStack_Tenant();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__USERNAME = eINSTANCE.getMachine_OpenStack_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__PASSWORD = eINSTANCE.getMachine_OpenStack_Password();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__ENDPOINT = eINSTANCE.getMachine_OpenStack_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Image id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__IMAGE_ID = eINSTANCE.getMachine_OpenStack_Image_id();

		/**
		 * The meta object literal for the '<em><b>Flavor name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__FLAVOR_NAME = eINSTANCE.getMachine_OpenStack_Flavor_name();

		/**
		 * The meta object literal for the '<em><b>Flavor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__FLAVOR_ID = eINSTANCE.getMachine_OpenStack_Flavor_id();

		/**
		 * The meta object literal for the '<em><b>Security group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__SECURITY_GROUP = eINSTANCE.getMachine_OpenStack_Security_group();

		/**
		 * The meta object literal for the '<em><b>Network name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__NETWORK_NAME = eINSTANCE.getMachine_OpenStack_Network_name();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__NETWORK_ID = eINSTANCE.getMachine_OpenStack_Network_id();

		/**
		 * The meta object literal for the '<em><b>Floating ip pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__FLOATING_IP_POOL = eINSTANCE.getMachine_OpenStack_Floating_ip_pool();

		/**
		 * The meta object literal for the '<em><b>Image name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__IMAGE_NAME = eINSTANCE.getMachine_OpenStack_Image_name();

		/**
		 * The meta object literal for the '<em><b>Keypair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__KEYPAIR = eINSTANCE.getMachine_OpenStack_Keypair();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__REGION = eINSTANCE.getMachine_OpenStack_Region();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl <em>Machine Soft Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl
		 * @see org.occiware.clouddesigner.occi.cloud.impl.CloudPackageImpl#getMachine_SoftLayer()
		 * @generated
		 */
		EClass MACHINE_SOFT_LAYER = eINSTANCE.getMachine_SoftLayer();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__PROVIDER = eINSTANCE.getMachine_SoftLayer_Provider();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__USERNAME = eINSTANCE.getMachine_SoftLayer_Username();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__API_KEY = eINSTANCE.getMachine_SoftLayer_Api_key();

		/**
		 * The meta object literal for the '<em><b>Location id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__LOCATION_ID = eINSTANCE.getMachine_SoftLayer_Location_id();

		/**
		 * The meta object literal for the '<em><b>Image id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__IMAGE_ID = eINSTANCE.getMachine_SoftLayer_Image_id();

		/**
		 * The meta object literal for the '<em><b>Domain name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__DOMAIN_NAME = eINSTANCE.getMachine_SoftLayer_Domain_name();

		/**
		 * The meta object literal for the '<em><b>Disk type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__DISK_TYPE = eINSTANCE.getMachine_SoftLayer_Disk_type();

		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__TENANT = eINSTANCE.getMachine_SoftLayer_Tenant();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_SOFT_LAYER__ENDPOINT = eINSTANCE.getMachine_SoftLayer_Endpoint();

	}

} //CloudPackage
