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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

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
 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataFactory
 * @model kind="package"
 * @generated
 */
public interface LinkeddataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linkeddata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/linkeddata/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linkeddata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkeddataPackage eINSTANCE = org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl <em>Ldproject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdproject()
	 * @generated
	 */
	int LDPROJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__LIFECYCLE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robustness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT__ROBUSTNESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ldproject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___PUBLISH = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unpublish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___UNPUBLISH = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT___UPDATE = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ldproject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECT_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl <em>Lddatabaselink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLddatabaselink()
	 * @generated
	 */
	int LDDATABASELINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__DATABASE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK__PORT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lddatabaselink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Lddatabaselink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDDATABASELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectlinkImpl <em>Ldprojectlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectlinkImpl
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdprojectlink()
	 * @generated
	 */
	int LDPROJECTLINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Ldprojectlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Ldprojectlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDPROJECTLINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl <em>Ldnode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdnode()
	 * @generated
	 */
	int LDNODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mongo Hosts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__MONGO_HOSTS = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__MAIN_PROJECT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Analytics Read Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE__ANALYTICS_READ_PREFERENCE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ldnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Ldnode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDNODE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.Lifecycle <em>Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lifecycle
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 4;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.linkeddata.Robustness <em>Robustness</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.linkeddata.Robustness
	 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getRobustness()
	 * @generated
	 */
	int ROBUSTNESS = 5;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject <em>Ldproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldproject</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject
	 * @generated
	 */
	EClass getLdproject();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#getName()
	 * @see #getLdproject()
	 * @generated
	 */
	EAttribute getLdproject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#getLifecycle()
	 * @see #getLdproject()
	 * @generated
	 */
	EAttribute getLdproject_Lifecycle();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getRobustness <em>Robustness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Robustness</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#getRobustness()
	 * @see #getLdproject()
	 * @generated
	 */
	EAttribute getLdproject_Robustness();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#publish() <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#publish()
	 * @generated
	 */
	EOperation getLdproject__Publish();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#unpublish() <em>Unpublish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unpublish</em>' operation.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#unpublish()
	 * @generated
	 */
	EOperation getLdproject__Unpublish();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldproject#update()
	 * @generated
	 */
	EOperation getLdproject__Update();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink <em>Lddatabaselink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lddatabaselink</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink
	 * @generated
	 */
	EClass getLddatabaselink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getDatabase()
	 * @see #getLddatabaselink()
	 * @generated
	 */
	EAttribute getLddatabaselink_Database();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getPort()
	 * @see #getLddatabaselink()
	 * @generated
	 */
	EAttribute getLddatabaselink_Port();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.linkeddata.Ldprojectlink <em>Ldprojectlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldprojectlink</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldprojectlink
	 * @generated
	 */
	EClass getLdprojectlink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode <em>Ldnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldnode</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldnode
	 * @generated
	 */
	EClass getLdnode();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldnode#getName()
	 * @see #getLdnode()
	 * @generated
	 */
	EAttribute getLdnode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMongoHosts <em>Mongo Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mongo Hosts</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMongoHosts()
	 * @see #getLdnode()
	 * @generated
	 */
	EAttribute getLdnode_MongoHosts();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMainProject <em>Main Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Project</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMainProject()
	 * @see #getLdnode()
	 * @generated
	 */
	EAttribute getLdnode_MainProject();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getAnalyticsReadPreference <em>Analytics Read Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analytics Read Preference</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Ldnode#getAnalyticsReadPreference()
	 * @see #getLdnode()
	 * @generated
	 */
	EAttribute getLdnode_AnalyticsReadPreference();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.linkeddata.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lifecycle
	 * @generated
	 */
	EEnum getLifecycle();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.linkeddata.Robustness <em>Robustness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Robustness</em>'.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Robustness
	 * @generated
	 */
	EEnum getRobustness();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinkeddataFactory getLinkeddataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl <em>Ldproject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdproject()
		 * @generated
		 */
		EClass LDPROJECT = eINSTANCE.getLdproject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDPROJECT__NAME = eINSTANCE.getLdproject_Name();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDPROJECT__LIFECYCLE = eINSTANCE.getLdproject_Lifecycle();

		/**
		 * The meta object literal for the '<em><b>Robustness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDPROJECT__ROBUSTNESS = eINSTANCE.getLdproject_Robustness();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LDPROJECT___PUBLISH = eINSTANCE.getLdproject__Publish();

		/**
		 * The meta object literal for the '<em><b>Unpublish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LDPROJECT___UNPUBLISH = eINSTANCE.getLdproject__Unpublish();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LDPROJECT___UPDATE = eINSTANCE.getLdproject__Update();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl <em>Lddatabaselink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLddatabaselink()
		 * @generated
		 */
		EClass LDDATABASELINK = eINSTANCE.getLddatabaselink();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDDATABASELINK__DATABASE = eINSTANCE.getLddatabaselink_Database();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDDATABASELINK__PORT = eINSTANCE.getLddatabaselink_Port();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectlinkImpl <em>Ldprojectlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectlinkImpl
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdprojectlink()
		 * @generated
		 */
		EClass LDPROJECTLINK = eINSTANCE.getLdprojectlink();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl <em>Ldnode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLdnode()
		 * @generated
		 */
		EClass LDNODE = eINSTANCE.getLdnode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDNODE__NAME = eINSTANCE.getLdnode_Name();

		/**
		 * The meta object literal for the '<em><b>Mongo Hosts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDNODE__MONGO_HOSTS = eINSTANCE.getLdnode_MongoHosts();

		/**
		 * The meta object literal for the '<em><b>Main Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDNODE__MAIN_PROJECT = eINSTANCE.getLdnode_MainProject();

		/**
		 * The meta object literal for the '<em><b>Analytics Read Preference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDNODE__ANALYTICS_READ_PREFERENCE = eINSTANCE.getLdnode_AnalyticsReadPreference();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.Lifecycle <em>Lifecycle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.Lifecycle
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getLifecycle()
		 * @generated
		 */
		EEnum LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.linkeddata.Robustness <em>Robustness</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.linkeddata.Robustness
		 * @see org.occiware.clouddesigner.occi.linkeddata.impl.LinkeddataPackageImpl#getRobustness()
		 * @generated
		 */
		EEnum ROBUSTNESS = eINSTANCE.getRobustness();

	}

} //LinkeddataPackage
