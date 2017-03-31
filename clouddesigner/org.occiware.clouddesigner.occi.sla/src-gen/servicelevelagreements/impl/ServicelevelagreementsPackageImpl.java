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
package servicelevelagreements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import servicelevelagreements.Agreement;
import servicelevelagreements.AgreementStatus;
import servicelevelagreements.AgreementTermStatus;
import servicelevelagreements.AgreementTermType;
import servicelevelagreements.Agreement_link;
import servicelevelagreements.ServicelevelagreementsFactory;
import servicelevelagreements.ServicelevelagreementsPackage;

import servicelevelagreements.util.ServicelevelagreementsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicelevelagreementsPackageImpl extends EPackageImpl implements ServicelevelagreementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreement_linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementTermTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementTermStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

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
	 * @see servicelevelagreements.ServicelevelagreementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicelevelagreementsPackageImpl() {
		super(eNS_URI, ServicelevelagreementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicelevelagreementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicelevelagreementsPackage init() {
		if (isInited) return (ServicelevelagreementsPackage)EPackage.Registry.INSTANCE.getEPackage(ServicelevelagreementsPackage.eNS_URI);

		// Obtain or create and register package
		ServicelevelagreementsPackageImpl theServicelevelagreementsPackage = (ServicelevelagreementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicelevelagreementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicelevelagreementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicelevelagreementsPackage.createPackageContents();

		// Initialize created meta-data
		theServicelevelagreementsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theServicelevelagreementsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ServicelevelagreementsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theServicelevelagreementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicelevelagreementsPackage.eNS_URI, theServicelevelagreementsPackage);
		return theServicelevelagreementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_State() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_AgreedAt() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_EffectiveFrom() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_EffectiveUntil() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Accept() {
		return agreementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Reject() {
		return agreementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Suspend() {
		return agreementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Resume() {
		return agreementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Terminate() {
		return agreementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement_link() {
		return agreement_linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementStatus() {
		return agreementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementTermType() {
		return agreementTermTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementTermStatus() {
		return agreementTermStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicelevelagreementsFactory getServicelevelagreementsFactory() {
		return (ServicelevelagreementsFactory)getEFactoryInstance();
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
		agreementEClass = createEClass(AGREEMENT);
		createEAttribute(agreementEClass, AGREEMENT__STATE);
		createEAttribute(agreementEClass, AGREEMENT__AGREED_AT);
		createEAttribute(agreementEClass, AGREEMENT__EFFECTIVE_FROM);
		createEAttribute(agreementEClass, AGREEMENT__EFFECTIVE_UNTIL);
		createEOperation(agreementEClass, AGREEMENT___ACCEPT);
		createEOperation(agreementEClass, AGREEMENT___REJECT);
		createEOperation(agreementEClass, AGREEMENT___SUSPEND);
		createEOperation(agreementEClass, AGREEMENT___RESUME);
		createEOperation(agreementEClass, AGREEMENT___TERMINATE);

		agreement_linkEClass = createEClass(AGREEMENT_LINK);

		// Create enums
		agreementStatusEEnum = createEEnum(AGREEMENT_STATUS);
		agreementTermTypeEEnum = createEEnum(AGREEMENT_TERM_TYPE);
		agreementTermStatusEEnum = createEEnum(AGREEMENT_TERM_STATUS);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
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
		agreementEClass.getESuperTypes().add(theOCCIPackage.getResource());
		agreement_linkEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(agreementEClass, Agreement.class, "Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreement_State(), this.getAgreementStatus(), "state", null, 1, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_AgreedAt(), this.getDateTime(), "agreedAt", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_EffectiveFrom(), this.getDateTime(), "effectiveFrom", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_EffectiveUntil(), this.getDateTime(), "effectiveUntil", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAgreement__Accept(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Reject(), null, "reject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Suspend(), null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Resume(), null, "resume", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Terminate(), null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agreement_linkEClass, Agreement_link.class, "Agreement_link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(agreementStatusEEnum, AgreementStatus.class, "AgreementStatus");
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.PENDING);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.ACCEPTED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.REJECTED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.SUSPENDED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.TERMINATED);

		initEEnum(agreementTermTypeEEnum, AgreementTermType.class, "AgreementTermType");
		addEEnumLiteral(agreementTermTypeEEnum, AgreementTermType.SERVICE);
		addEEnumLiteral(agreementTermTypeEEnum, AgreementTermType.SLO);

		initEEnum(agreementTermStatusEEnum, AgreementTermStatus.class, "AgreementTermStatus");
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.UNDEFINED);
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.FULFILLED);
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.VIOLATED);

		// Initialize data types
		initEDataType(dateTimeEDataType, String.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (dateTimeEDataType, 
		   source, 
		   new String[] {
			 "pattern", "^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$"
		   });
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
		  (agreementEClass, 
		   source, 
		   new String[] {
			 "title", "A Service Level Agreement"
		   });	
		addAnnotation
		  (getAgreement__Accept(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAgreement__Reject(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAgreement__Suspend(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAgreement__Resume(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAgreement__Terminate(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getAgreement_State(), 
		   source, 
		   new String[] {
			 "description", "Current state of the instance"
		   });	
		addAnnotation
		  (getAgreement_AgreedAt(), 
		   source, 
		   new String[] {
			 "description", "The point in time when the agreement was made"
		   });	
		addAnnotation
		  (getAgreement_EffectiveFrom(), 
		   source, 
		   new String[] {
			 "description", "The point in time when the agreement\u2019s effectiveness begins"
		   });	
		addAnnotation
		  (getAgreement_EffectiveUntil(), 
		   source, 
		   new String[] {
			 "description", "The point in time when the agreement\u2019s effectiveness ends"
		   });	
		addAnnotation
		  (agreement_linkEClass, 
		   source, 
		   new String[] {
			 "title", "Link between a SLA and its associated resource"
		   });
	}

} //ServicelevelagreementsPackageImpl
