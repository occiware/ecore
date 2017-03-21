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
package monitoringext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.monitoring.MonitoringPackage;

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
 * @see monitoringext.MonitoringextFactory
 * @model kind="package"
 * @generated
 */
public interface MonitoringextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "monitoringext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/monitoring/ext/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "monitoringext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitoringextPackage eINSTANCE = monitoringext.impl.MonitoringextPackageImpl.init();

	/**
	 * The meta object id for the '{@link monitoringext.impl.SshcollectorImpl <em>Sshcollector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see monitoringext.impl.SshcollectorImpl
	 * @see monitoringext.impl.MonitoringextPackageImpl#getSshcollector()
	 * @generated
	 */
	int SSHCOLLECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__ID = MonitoringPackage.COLLECTOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__TITLE = MonitoringPackage.COLLECTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__KIND = MonitoringPackage.COLLECTOR__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__MIXINS = MonitoringPackage.COLLECTOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__ATTRIBUTES = MonitoringPackage.COLLECTOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__SOURCE = MonitoringPackage.COLLECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__TARGET = MonitoringPackage.COLLECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__PERIOD = MonitoringPackage.COLLECTOR__PERIOD;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__ACCURACY = MonitoringPackage.COLLECTOR__ACCURACY;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR__GRANULARITY = MonitoringPackage.COLLECTOR__GRANULARITY;

	/**
	 * The number of structural features of the '<em>Sshcollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR_FEATURE_COUNT = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR___OCCI_CREATE = MonitoringPackage.COLLECTOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR___OCCI_RETRIEVE = MonitoringPackage.COLLECTOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR___OCCI_UPDATE = MonitoringPackage.COLLECTOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR___OCCI_DELETE = MonitoringPackage.COLLECTOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Sshcollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSHCOLLECTOR_OPERATION_COUNT = MonitoringPackage.COLLECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link monitoringext.impl.CentreoncollectorImpl <em>Centreoncollector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see monitoringext.impl.CentreoncollectorImpl
	 * @see monitoringext.impl.MonitoringextPackageImpl#getCentreoncollector()
	 * @generated
	 */
	int CENTREONCOLLECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__ID = MonitoringPackage.COLLECTOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__TITLE = MonitoringPackage.COLLECTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__KIND = MonitoringPackage.COLLECTOR__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__MIXINS = MonitoringPackage.COLLECTOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__ATTRIBUTES = MonitoringPackage.COLLECTOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__SOURCE = MonitoringPackage.COLLECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__TARGET = MonitoringPackage.COLLECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__PERIOD = MonitoringPackage.COLLECTOR__PERIOD;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__ACCURACY = MonitoringPackage.COLLECTOR__ACCURACY;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR__GRANULARITY = MonitoringPackage.COLLECTOR__GRANULARITY;

	/**
	 * The number of structural features of the '<em>Centreoncollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR_FEATURE_COUNT = MonitoringPackage.COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR___OCCI_CREATE = MonitoringPackage.COLLECTOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR___OCCI_RETRIEVE = MonitoringPackage.COLLECTOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR___OCCI_UPDATE = MonitoringPackage.COLLECTOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR___OCCI_DELETE = MonitoringPackage.COLLECTOR___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Centreoncollector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTREONCOLLECTOR_OPERATION_COUNT = MonitoringPackage.COLLECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link monitoringext.impl.SensorextImpl <em>Sensorext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see monitoringext.impl.SensorextImpl
	 * @see monitoringext.impl.MonitoringextPackageImpl#getSensorext()
	 * @generated
	 */
	int SENSOREXT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__ID = MonitoringPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__TITLE = MonitoringPackage.SENSOR__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__KIND = MonitoringPackage.SENSOR__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__MIXINS = MonitoringPackage.SENSOR__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__ATTRIBUTES = MonitoringPackage.SENSOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__SUMMARY = MonitoringPackage.SENSOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__LINKS = MonitoringPackage.SENSOR__LINKS;

	/**
	 * The feature id for the '<em><b>Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__TIMEBASE = MonitoringPackage.SENSOR__TIMEBASE;

	/**
	 * The feature id for the '<em><b>Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__TIMESTART = MonitoringPackage.SENSOR__TIMESTART;

	/**
	 * The feature id for the '<em><b>Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__TIMESTOP = MonitoringPackage.SENSOR__TIMESTOP;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__PERIOD = MonitoringPackage.SENSOR__PERIOD;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__GRANULARITY = MonitoringPackage.SENSOR__GRANULARITY;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__ACCURACY = MonitoringPackage.SENSOR__ACCURACY;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__CPU = MonitoringPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__RAM = MonitoringPackage.SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loadavg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__LOADAVG = MonitoringPackage.SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitorstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT__MONITORSTATE = MonitoringPackage.SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sensorext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT_FEATURE_COUNT = MonitoringPackage.SENSOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___OCCI_CREATE = MonitoringPackage.SENSOR___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___OCCI_RETRIEVE = MonitoringPackage.SENSOR___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___OCCI_UPDATE = MonitoringPackage.SENSOR___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___OCCI_DELETE = MonitoringPackage.SENSOR___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start Monitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___START_MONITORING = MonitoringPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop Monitoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT___STOP_MONITORING = MonitoringPackage.SENSOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensorext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOREXT_OPERATION_COUNT = MonitoringPackage.SENSOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link monitoringext.MonitorState <em>Monitor State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see monitoringext.MonitorState
	 * @see monitoringext.impl.MonitoringextPackageImpl#getMonitorState()
	 * @generated
	 */
	int MONITOR_STATE = 3;

	/**
	 * The meta object id for the '<em>Float Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see monitoringext.impl.MonitoringextPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link monitoringext.Sshcollector <em>Sshcollector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sshcollector</em>'.
	 * @see monitoringext.Sshcollector
	 * @generated
	 */
	EClass getSshcollector();

	/**
	 * Returns the meta object for class '{@link monitoringext.Centreoncollector <em>Centreoncollector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centreoncollector</em>'.
	 * @see monitoringext.Centreoncollector
	 * @generated
	 */
	EClass getCentreoncollector();

	/**
	 * Returns the meta object for class '{@link monitoringext.Sensorext <em>Sensorext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensorext</em>'.
	 * @see monitoringext.Sensorext
	 * @generated
	 */
	EClass getSensorext();

	/**
	 * Returns the meta object for the attribute '{@link monitoringext.Sensorext#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see monitoringext.Sensorext#getCpu()
	 * @see #getSensorext()
	 * @generated
	 */
	EAttribute getSensorext_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link monitoringext.Sensorext#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see monitoringext.Sensorext#getRam()
	 * @see #getSensorext()
	 * @generated
	 */
	EAttribute getSensorext_Ram();

	/**
	 * Returns the meta object for the attribute '{@link monitoringext.Sensorext#getLoadavg <em>Loadavg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loadavg</em>'.
	 * @see monitoringext.Sensorext#getLoadavg()
	 * @see #getSensorext()
	 * @generated
	 */
	EAttribute getSensorext_Loadavg();

	/**
	 * Returns the meta object for the attribute '{@link monitoringext.Sensorext#getMonitorstate <em>Monitorstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitorstate</em>'.
	 * @see monitoringext.Sensorext#getMonitorstate()
	 * @see #getSensorext()
	 * @generated
	 */
	EAttribute getSensorext_Monitorstate();

	/**
	 * Returns the meta object for the '{@link monitoringext.Sensorext#startMonitoring() <em>Start Monitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Monitoring</em>' operation.
	 * @see monitoringext.Sensorext#startMonitoring()
	 * @generated
	 */
	EOperation getSensorext__StartMonitoring();

	/**
	 * Returns the meta object for the '{@link monitoringext.Sensorext#stopMonitoring() <em>Stop Monitoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Monitoring</em>' operation.
	 * @see monitoringext.Sensorext#stopMonitoring()
	 * @generated
	 */
	EOperation getSensorext__StopMonitoring();

	/**
	 * Returns the meta object for enum '{@link monitoringext.MonitorState <em>Monitor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitor State</em>'.
	 * @see monitoringext.MonitorState
	 * @generated
	 */
	EEnum getMonitorState();

	/**
	 * Returns the meta object for data type '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Type</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="mininclusive='0'"
	 * @generated
	 */
	EDataType getFloatType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonitoringextFactory getMonitoringextFactory();

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
		 * The meta object literal for the '{@link monitoringext.impl.SshcollectorImpl <em>Sshcollector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see monitoringext.impl.SshcollectorImpl
		 * @see monitoringext.impl.MonitoringextPackageImpl#getSshcollector()
		 * @generated
		 */
		EClass SSHCOLLECTOR = eINSTANCE.getSshcollector();

		/**
		 * The meta object literal for the '{@link monitoringext.impl.CentreoncollectorImpl <em>Centreoncollector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see monitoringext.impl.CentreoncollectorImpl
		 * @see monitoringext.impl.MonitoringextPackageImpl#getCentreoncollector()
		 * @generated
		 */
		EClass CENTREONCOLLECTOR = eINSTANCE.getCentreoncollector();

		/**
		 * The meta object literal for the '{@link monitoringext.impl.SensorextImpl <em>Sensorext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see monitoringext.impl.SensorextImpl
		 * @see monitoringext.impl.MonitoringextPackageImpl#getSensorext()
		 * @generated
		 */
		EClass SENSOREXT = eINSTANCE.getSensorext();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOREXT__CPU = eINSTANCE.getSensorext_Cpu();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOREXT__RAM = eINSTANCE.getSensorext_Ram();

		/**
		 * The meta object literal for the '<em><b>Loadavg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOREXT__LOADAVG = eINSTANCE.getSensorext_Loadavg();

		/**
		 * The meta object literal for the '<em><b>Monitorstate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOREXT__MONITORSTATE = eINSTANCE.getSensorext_Monitorstate();

		/**
		 * The meta object literal for the '<em><b>Start Monitoring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOREXT___START_MONITORING = eINSTANCE.getSensorext__StartMonitoring();

		/**
		 * The meta object literal for the '<em><b>Stop Monitoring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOREXT___STOP_MONITORING = eINSTANCE.getSensorext__StopMonitoring();

		/**
		 * The meta object literal for the '{@link monitoringext.MonitorState <em>Monitor State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see monitoringext.MonitorState
		 * @see monitoringext.impl.MonitoringextPackageImpl#getMonitorState()
		 * @generated
		 */
		EEnum MONITOR_STATE = eINSTANCE.getMonitorState();

		/**
		 * The meta object literal for the '<em>Float Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see monitoringext.impl.MonitoringextPackageImpl#getFloatType()
		 * @generated
		 */
		EDataType FLOAT_TYPE = eINSTANCE.getFloatType();

	}

} //MonitoringextPackage
