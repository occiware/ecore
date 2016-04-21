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
package org.occiware.clouddesigner.occi.platform;

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
 * @see org.occiware.clouddesigner.occi.platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/platform/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.platform.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.platform.impl.ApplicationImpl
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTEXT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__URL = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.platform.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.platform.impl.ComponentImpl
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.platform.impl.ComponentlinkImpl <em>Componentlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.platform.impl.ComponentlinkImpl
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getComponentlink()
	 * @generated
	 */
	int COMPONENTLINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Componentlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTLINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.platform.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.platform.Status
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 3;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getURL()
	 * @generated
	 */
	int URL = 4;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getURI()
	 * @generated
	 */
	int URI = 5;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.platform.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Application#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application#getContext()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Application#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application#getUrl()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Application#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application#getState()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_State();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Application#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Application#getMessage()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Message();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.platform.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Component#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Component#getState()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_State();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.platform.Component#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Component#getMessage()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Message();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.platform.Componentlink <em>Componentlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componentlink</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Componentlink
	 * @generated
	 */
	EClass getComponentlink();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.platform.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.occiware.clouddesigner.occi.platform.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.platform.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.platform.impl.ApplicationImpl
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__CONTEXT = eINSTANCE.getApplication_Context();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__URL = eINSTANCE.getApplication_Url();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__STATE = eINSTANCE.getApplication_State();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__MESSAGE = eINSTANCE.getApplication_Message();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.platform.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.platform.impl.ComponentImpl
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STATE = eINSTANCE.getComponent_State();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MESSAGE = eINSTANCE.getComponent_Message();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.platform.impl.ComponentlinkImpl <em>Componentlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.platform.impl.ComponentlinkImpl
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getComponentlink()
		 * @generated
		 */
		EClass COMPONENTLINK = eINSTANCE.getComponentlink();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.platform.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.platform.Status
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.occiware.clouddesigner.occi.platform.impl.PlatformPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //PlatformPackage
