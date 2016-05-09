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

import org.occiware.clouddesigner.occi.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Collector#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Collector#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.Collector#getGranularity <em>Granularity</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getCollector()
 * @model annotation="OCCIE2Ecore title='Collector Link'"
 * @generated
 */
public interface Collector extends Link {
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
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getCollector_Period()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second" required="true"
	 *        annotation="OCCIE2Ecore description='Time between two following measurements (seconds)'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

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
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getCollector_Accuracy()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Accuracy of time measument (seconds)'"
	 * @generated
	 */
	int getAccuracy();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(int value);

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
	 * @see org.occiware.clouddesigner.occi.monitoring.MonitoringPackage#getCollector_Granularity()
	 * @model dataType="org.occiware.clouddesigner.occi.monitoring.Second"
	 *        annotation="OCCIE2Ecore description='Granularity of time measument (seconds)'"
	 * @generated
	 */
	int getGranularity();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.monitoring.Collector#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(int value);

} // Collector
