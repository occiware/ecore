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
package org.occiware.clouddesigner.occi.linkeddata.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.linkeddata.Ldcontains;
import org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink;
import org.occiware.clouddesigner.occi.linkeddata.Ldnode;
import org.occiware.clouddesigner.occi.linkeddata.Ldproject;
import org.occiware.clouddesigner.occi.linkeddata.Ldprojectlink;
import org.occiware.clouddesigner.occi.linkeddata.Lifecycle;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataFactory;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage;
import org.occiware.clouddesigner.occi.linkeddata.Robustness;
import org.occiware.clouddesigner.occi.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkeddataPackageImpl extends EPackageImpl implements LinkeddataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldprojectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lddatabaselinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldprojectlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldnodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldcontainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum robustnessEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinkeddataPackageImpl() {
		super(eNS_URI, LinkeddataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LinkeddataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinkeddataPackage init() {
		if (isInited) return (LinkeddataPackage)EPackage.Registry.INSTANCE.getEPackage(LinkeddataPackage.eNS_URI);

		// Obtain or create and register package
		LinkeddataPackageImpl theLinkeddataPackage = (LinkeddataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinkeddataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinkeddataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLinkeddataPackage.createPackageContents();

		// Initialize created meta-data
		theLinkeddataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinkeddataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinkeddataPackage.eNS_URI, theLinkeddataPackage);
		return theLinkeddataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdproject() {
		return ldprojectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdproject_Name() {
		return (EAttribute)ldprojectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdproject_Lifecycle() {
		return (EAttribute)ldprojectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdproject_Robustness() {
		return (EAttribute)ldprojectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLdproject__Publish() {
		return ldprojectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLdproject__Unpublish() {
		return ldprojectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLdproject__Update() {
		return ldprojectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLddatabaselink() {
		return lddatabaselinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLddatabaselink_Database() {
		return (EAttribute)lddatabaselinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLddatabaselink_Port() {
		return (EAttribute)lddatabaselinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdprojectlink() {
		return ldprojectlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdnode() {
		return ldnodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdnode_Name() {
		return (EAttribute)ldnodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdnode_MongoHosts() {
		return (EAttribute)ldnodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdnode_MainProject() {
		return (EAttribute)ldnodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLdnode_AnalyticsReadPreference() {
		return (EAttribute)ldnodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdcontains() {
		return ldcontainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifecycle() {
		return lifecycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRobustness() {
		return robustnessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkeddataFactory getLinkeddataFactory() {
		return (LinkeddataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ldprojectEClass = createEClass(LDPROJECT);
		createEAttribute(ldprojectEClass, LDPROJECT__NAME);
		createEAttribute(ldprojectEClass, LDPROJECT__LIFECYCLE);
		createEAttribute(ldprojectEClass, LDPROJECT__ROBUSTNESS);
		createEOperation(ldprojectEClass, LDPROJECT___PUBLISH);
		createEOperation(ldprojectEClass, LDPROJECT___UNPUBLISH);
		createEOperation(ldprojectEClass, LDPROJECT___UPDATE);

		lddatabaselinkEClass = createEClass(LDDATABASELINK);
		createEAttribute(lddatabaselinkEClass, LDDATABASELINK__DATABASE);
		createEAttribute(lddatabaselinkEClass, LDDATABASELINK__PORT);

		ldprojectlinkEClass = createEClass(LDPROJECTLINK);

		ldnodeEClass = createEClass(LDNODE);
		createEAttribute(ldnodeEClass, LDNODE__NAME);
		createEAttribute(ldnodeEClass, LDNODE__MONGO_HOSTS);
		createEAttribute(ldnodeEClass, LDNODE__MAIN_PROJECT);
		createEAttribute(ldnodeEClass, LDNODE__ANALYTICS_READ_PREFERENCE);

		ldcontainsEClass = createEClass(LDCONTAINS);

		// Create enums
		lifecycleEEnum = createEEnum(LIFECYCLE);
		robustnessEEnum = createEEnum(ROBUSTNESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ldprojectEClass.getESuperTypes().add(theOCCIPackage.getResource());
		lddatabaselinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ldprojectlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ldnodeEClass.getESuperTypes().add(theOCCIPackage.getResource());
		ldcontainsEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(ldprojectEClass, Ldproject.class, "Ldproject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLdproject_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Ldproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdproject_Lifecycle(), this.getLifecycle(), "lifecycle", null, 0, 1, Ldproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdproject_Robustness(), this.getRobustness(), "robustness", null, 0, 1, Ldproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLdproject__Publish(), null, "publish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLdproject__Unpublish(), null, "unpublish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLdproject__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lddatabaselinkEClass, Lddatabaselink.class, "Lddatabaselink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLddatabaselink_Database(), theOCCIPackage.getString(), "database", "datacore", 1, 1, Lddatabaselink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLddatabaselink_Port(), theOCCIPackage.getNumber(), "port", "27017", 0, 1, Lddatabaselink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldprojectlinkEClass, Ldprojectlink.class, "Ldprojectlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldnodeEClass, Ldnode.class, "Ldnode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLdnode_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Ldnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdnode_MongoHosts(), theOCCIPackage.getString(), "mongoHosts", null, 1, 1, Ldnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdnode_MainProject(), theOCCIPackage.getString(), "mainProject", null, 1, 1, Ldnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdnode_AnalyticsReadPreference(), theOCCIPackage.getString(), "analyticsReadPreference", null, 1, 1, Ldnode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldcontainsEClass, Ldcontains.class, "Ldcontains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(lifecycleEEnum, Lifecycle.class, "Lifecycle");
		addEEnumLiteral(lifecycleEEnum, Lifecycle.DRAFT);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.PUBLISHED);

		initEEnum(robustnessEEnum, Robustness.class, "Robustness");
		addEEnumLiteral(robustnessEEnum, Robustness.CLUSTER);
		addEEnumLiteral(robustnessEEnum, Robustness.NODE);
		addEEnumLiteral(robustnessEEnum, Robustness.NONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>OCCIE2Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCCIE2EcoreAnnotations() {
		String source = "OCCIE2Ecore";	
		addAnnotation
		  (ldprojectEClass, 
		   source, 
		   new String[] {
			 "title", "LDProject"
		   });	
		addAnnotation
		  (getLdproject__Publish(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getLdproject__Unpublish(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getLdproject__Update(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getLdproject_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLdproject_Lifecycle(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLdproject_Robustness(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (lddatabaselinkEClass, 
		   source, 
		   new String[] {
			 "title", "LDDatabaseLink"
		   });	
		addAnnotation
		  (getLddatabaselink_Database(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLddatabaselink_Port(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (ldprojectlinkEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (ldnodeEClass, 
		   source, 
		   new String[] {
			 "title", "LDNode"
		   });	
		addAnnotation
		  (getLdnode_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLdnode_MongoHosts(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLdnode_MainProject(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getLdnode_AnalyticsReadPreference(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (ldcontainsEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });
	}

} //LinkeddataPackageImpl
