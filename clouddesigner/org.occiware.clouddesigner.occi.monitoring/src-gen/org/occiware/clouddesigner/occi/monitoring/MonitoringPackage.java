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
package org.occiware.clouddesigner.occi.monitoring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringFactory
 * @model kind="package"
 * @generated
 */
public interface MonitoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "monitoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/monitoring/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "monitoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitoringPackage eINSTANCE = org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIMEBASE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIMESTART = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIMESTOP = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PERIOD = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__GRANULARITY = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ACCURACY = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl <em>Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getCollector()
	 * @generated
	 */
	int COLLECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__PERIOD = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__ACCURACY = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__GRANULARITY = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Second</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getSecond()
	 * @generated
	 */
	int SECOND = 2;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 3;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.monitoring.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimebase <em>Timebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timebase</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getTimebase()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Timebase();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestart <em>Timestart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestart</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestart()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Timestart();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestop <em>Timestop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestop</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestop()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Timestop();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getPeriod()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getGranularity()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Granularity();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Sensor#getAccuracy()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Accuracy();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.monitoring.Collector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collector</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Collector
	 * @generated
	 */
	EClass getCollector();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Collector#getPeriod()
	 * @see #getCollector()
	 * @generated
	 */
	EAttribute getCollector_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Collector#getAccuracy()
	 * @see #getCollector()
	 * @generated
	 */
	EAttribute getCollector_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granularity</em>'.
	 * @see org.occiware.clouddesigner.occi.monitoring.Collector#getGranularity()
	 * @see #getCollector()
	 * @generated
	 */
	EAttribute getCollector_Granularity();

	/**
	 * Returns the meta object for data type '<em>Second</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Second</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minInclusive='0'"
	 * @generated
	 */
	EDataType getSecond();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$'"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonitoringFactory getMonitoringFactory();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Timebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TIMEBASE = eINSTANCE.getSensor_Timebase();

		/**
		 * The meta object literal for the '<em><b>Timestart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TIMESTART = eINSTANCE.getSensor_Timestart();

		/**
		 * The meta object literal for the '<em><b>Timestop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TIMESTOP = eINSTANCE.getSensor_Timestop();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__PERIOD = eINSTANCE.getSensor_Period();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__GRANULARITY = eINSTANCE.getSensor_Granularity();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ACCURACY = eINSTANCE.getSensor_Accuracy();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl <em>Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getCollector()
		 * @generated
		 */
		EClass COLLECTOR = eINSTANCE.getCollector();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTOR__PERIOD = eINSTANCE.getCollector_Period();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTOR__ACCURACY = eINSTANCE.getCollector_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTOR__GRANULARITY = eINSTANCE.getCollector_Granularity();

		/**
		 * The meta object literal for the '<em>Second</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getSecond()
		 * @generated
		 */
		EDataType SECOND = eINSTANCE.getSecond();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.monitoring.impl.MonitoringPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

	}

} //MonitoringPackage
