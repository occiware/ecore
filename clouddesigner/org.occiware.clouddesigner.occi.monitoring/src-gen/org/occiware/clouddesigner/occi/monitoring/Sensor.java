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

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimebase <em>Timebase</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestart <em>Timestart</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestop <em>Timestop</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getAccuracy <em>Accuracy</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor()
 * @model annotation="OCCIE2Ecore title='Sensor Resource'"
 * @generated
 */
public interface Sensor extends Resource {
	/**
	 * Returns the value of the '<em><b>Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timebase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timebase</em>' attribute.
	 * @see #setTimebase(String)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Timebase()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.DateTime"
	 *        annotation="OCCIE2Ecore description='Base time reference (ISO8601)'"
	 * @generated
	 */
	String getTimebase();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimebase <em>Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timebase</em>' attribute.
	 * @see #getTimebase()
	 * @generated
	 */
	void setTimebase(String value);

	/**
	 * Returns the value of the '<em><b>Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestart</em>' attribute.
	 * @see #setTimestart(int)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Timestart()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Start time offset (seconds)'"
	 * @generated
	 */
	int getTimestart();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestart <em>Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestart</em>' attribute.
	 * @see #getTimestart()
	 * @generated
	 */
	void setTimestart(int value);

	/**
	 * Returns the value of the '<em><b>Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestop</em>' attribute.
	 * @see #setTimestop(int)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Timestop()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Stop time offset (seconds)'"
	 * @generated
	 */
	int getTimestop();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getTimestop <em>Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestop</em>' attribute.
	 * @see #getTimestop()
	 * @generated
	 */
	void setTimestop(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Period()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second" required="true"
	 *        annotation="OCCIE2Ecore description='Time between two following measurements (seconds)'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Granularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see #setGranularity(int)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Granularity()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Granularity of time measument (seconds)'"
	 * @generated
	 */
	int getGranularity();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(int value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(int)
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getSensor_Accuracy()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Accuracy of time measument (seconds)'"
	 * @generated
	 */
	int getAccuracy();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Sensor#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(int value);

} // Sensor
