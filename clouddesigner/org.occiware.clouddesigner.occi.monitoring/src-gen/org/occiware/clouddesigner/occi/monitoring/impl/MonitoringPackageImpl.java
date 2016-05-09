/**
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.monitoring.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.monitoring.Collector;
import org.occiware.clouddesigner.occi.monitoring.MonitoringFactory;
import org.occiware.clouddesigner.occi.monitoring.MonitoringPackage;
import org.occiware.clouddesigner.occi.monitoring.Sensor;

import org.occiware.clouddesigner.occi.monitoring.util.MonitoringValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoringPackageImpl extends EPackageImpl implements MonitoringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType secondEDataType = null;

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
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MonitoringPackageImpl() {
		super(eNS_URI, MonitoringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MonitoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MonitoringPackage init() {
		if (isInited) return (MonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(MonitoringPackage.eNS_URI);

		// Obtain or create and register package
		MonitoringPackageImpl theMonitoringPackage = (MonitoringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MonitoringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MonitoringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMonitoringPackage.createPackageContents();

		// Initialize created meta-data
		theMonitoringPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMonitoringPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MonitoringValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMonitoringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MonitoringPackage.eNS_URI, theMonitoringPackage);
		return theMonitoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Timebase() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Timestart() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Timestop() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Period() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Granularity() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Accuracy() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollector() {
		return collectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollector_Period() {
		return (EAttribute)collectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollector_Accuracy() {
		return (EAttribute)collectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollector_Granularity() {
		return (EAttribute)collectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSecond() {
		return secondEDataType;
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
	public MonitoringFactory getMonitoringFactory() {
		return (MonitoringFactory)getEFactoryInstance();
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
		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__TIMEBASE);
		createEAttribute(sensorEClass, SENSOR__TIMESTART);
		createEAttribute(sensorEClass, SENSOR__TIMESTOP);
		createEAttribute(sensorEClass, SENSOR__PERIOD);
		createEAttribute(sensorEClass, SENSOR__GRANULARITY);
		createEAttribute(sensorEClass, SENSOR__ACCURACY);

		collectorEClass = createEClass(COLLECTOR);
		createEAttribute(collectorEClass, COLLECTOR__PERIOD);
		createEAttribute(collectorEClass, COLLECTOR__ACCURACY);
		createEAttribute(collectorEClass, COLLECTOR__GRANULARITY);

		// Create data types
		secondEDataType = createEDataType(SECOND);
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
		sensorEClass.getESuperTypes().add(theOCCIPackage.getResource());
		collectorEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Timebase(), this.getDateTime(), "timebase", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Timestart(), this.getSecond(), "timestart", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Timestop(), this.getSecond(), "timestop", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Period(), this.getSecond(), "period", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Granularity(), this.getSecond(), "granularity", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Accuracy(), this.getSecond(), "accuracy", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectorEClass, Collector.class, "Collector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollector_Period(), this.getSecond(), "period", null, 1, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollector_Accuracy(), this.getSecond(), "accuracy", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollector_Granularity(), this.getSecond(), "granularity", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(secondEDataType, int.class, "Second", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		  (secondEDataType, 
		   source, 
		   new String[] {
			 "minInclusive", "0"
		   });	
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
		  (sensorEClass, 
		   source, 
		   new String[] {
			 "title", "Sensor Resource"
		   });	
		addAnnotation
		  (getSensor_Timebase(), 
		   source, 
		   new String[] {
			 "description", "Base time reference (ISO8601)"
		   });	
		addAnnotation
		  (getSensor_Timestart(), 
		   source, 
		   new String[] {
			 "description", "Start time offset (seconds)"
		   });	
		addAnnotation
		  (getSensor_Timestop(), 
		   source, 
		   new String[] {
			 "description", "Stop time offset (seconds)"
		   });	
		addAnnotation
		  (getSensor_Period(), 
		   source, 
		   new String[] {
			 "description", "Time between two following measurements (seconds)"
		   });	
		addAnnotation
		  (getSensor_Granularity(), 
		   source, 
		   new String[] {
			 "description", "Granularity of time measument (seconds)"
		   });	
		addAnnotation
		  (getSensor_Accuracy(), 
		   source, 
		   new String[] {
			 "description", "Accuracy of time measument (seconds)"
		   });	
		addAnnotation
		  (collectorEClass, 
		   source, 
		   new String[] {
			 "title", "Collector Link"
		   });	
		addAnnotation
		  (getCollector_Period(), 
		   source, 
		   new String[] {
			 "description", "Time between two following measurements (seconds)"
		   });	
		addAnnotation
		  (getCollector_Accuracy(), 
		   source, 
		   new String[] {
			 "description", "Accuracy of time measument (seconds)"
		   });	
		addAnnotation
		  (getCollector_Granularity(), 
		   source, 
		   new String[] {
			 "description", "Granularity of time measument (seconds)"
		   });
	}

} //MonitoringPackageImpl
