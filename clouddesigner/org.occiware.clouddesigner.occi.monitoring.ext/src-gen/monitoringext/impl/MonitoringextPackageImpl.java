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
package monitoringext.impl;

import monitoringext.Centreoncollector;
import monitoringext.MonitorState;
import monitoringext.MonitoringextFactory;
import monitoringext.MonitoringextPackage;
import monitoringext.Sensorext;
import monitoringext.Sshcollector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.monitoring.MonitoringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitoringextPackageImpl extends EPackageImpl implements MonitoringextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sshcollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centreoncollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitorStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatTypeEDataType = null;

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
	 * @see monitoringext.MonitoringextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MonitoringextPackageImpl() {
		super(eNS_URI, MonitoringextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MonitoringextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MonitoringextPackage init() {
		if (isInited) return (MonitoringextPackage)EPackage.Registry.INSTANCE.getEPackage(MonitoringextPackage.eNS_URI);

		// Obtain or create and register package
		MonitoringextPackageImpl theMonitoringextPackage = (MonitoringextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MonitoringextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MonitoringextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MonitoringPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMonitoringextPackage.createPackageContents();

		// Initialize created meta-data
		theMonitoringextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMonitoringextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MonitoringextPackage.eNS_URI, theMonitoringextPackage);
		return theMonitoringextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSshcollector() {
		return sshcollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentreoncollector() {
		return centreoncollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorext() {
		return sensorextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorext_Cpu() {
		return (EAttribute)sensorextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorext_Ram() {
		return (EAttribute)sensorextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorext_Loadavg() {
		return (EAttribute)sensorextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorext_Monitorstate() {
		return (EAttribute)sensorextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorext__StartMonitoring() {
		return sensorextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorext__StopMonitoring() {
		return sensorextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitorState() {
		return monitorStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatType() {
		return floatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringextFactory getMonitoringextFactory() {
		return (MonitoringextFactory)getEFactoryInstance();
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
		sshcollectorEClass = createEClass(SSHCOLLECTOR);

		centreoncollectorEClass = createEClass(CENTREONCOLLECTOR);

		sensorextEClass = createEClass(SENSOREXT);
		createEAttribute(sensorextEClass, SENSOREXT__CPU);
		createEAttribute(sensorextEClass, SENSOREXT__RAM);
		createEAttribute(sensorextEClass, SENSOREXT__LOADAVG);
		createEAttribute(sensorextEClass, SENSOREXT__MONITORSTATE);
		createEOperation(sensorextEClass, SENSOREXT___START_MONITORING);
		createEOperation(sensorextEClass, SENSOREXT___STOP_MONITORING);

		// Create enums
		monitorStateEEnum = createEEnum(MONITOR_STATE);

		// Create data types
		floatTypeEDataType = createEDataType(FLOAT_TYPE);
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
		MonitoringPackage theMonitoringPackage = (MonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(MonitoringPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sshcollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());
		centreoncollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());
		sensorextEClass.getESuperTypes().add(theMonitoringPackage.getSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(sshcollectorEClass, Sshcollector.class, "Sshcollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(centreoncollectorEClass, Centreoncollector.class, "Centreoncollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorextEClass, Sensorext.class, "Sensorext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorext_Cpu(), theOCCIPackage.getNumber(), "cpu", null, 0, 1, Sensorext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorext_Ram(), theOCCIPackage.getNumber(), "ram", null, 0, 1, Sensorext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorext_Loadavg(), this.getFloatType(), "loadavg", null, 0, 1, Sensorext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorext_Monitorstate(), this.getMonitorState(), "monitorstate", "off", 0, 1, Sensorext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSensorext__StartMonitoring(), null, "startMonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorext__StopMonitoring(), null, "stopMonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(monitorStateEEnum, MonitorState.class, "MonitorState");
		addEEnumLiteral(monitorStateEEnum, MonitorState.ON);
		addEEnumLiteral(monitorStateEEnum, MonitorState.OFF);

		// Initialize data types
		initEDataType(floatTypeEDataType, float.class, "FloatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (floatTypeEDataType, 
		   source, 
		   new String[] {
			 "mininclusive", "0"
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
		  (sshcollectorEClass, 
		   source, 
		   new String[] {
			 "title", "Collector data metrics with an ssh script"
		   });	
		addAnnotation
		  (centreoncollectorEClass, 
		   source, 
		   new String[] {
			 "title", "Connect to a centreon server and use its api"
		   });	
		addAnnotation
		  (sensorextEClass, 
		   source, 
		   new String[] {
			 "title", "A sensor with a publisher to directly have bars and display its values in a nice way on designer"
		   });	
		addAnnotation
		  (getSensorext__StartMonitoring(), 
		   source, 
		   new String[] {
			 "title", "Start the monitoring system for this sensor"
		   });	
		addAnnotation
		  (getSensorext__StopMonitoring(), 
		   source, 
		   new String[] {
			 "title", "Stop monitoring for this sensor"
		   });	
		addAnnotation
		  (getSensorext_Cpu(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getSensorext_Ram(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getSensorext_Loadavg(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getSensorext_Monitorstate(), 
		   source, 
		   new String[] {
			 "description", null
		   });
	}

} //MonitoringextPackageImpl
