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

import org.occiware.clouddesigner.occi.monitoring.Sensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensorext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link monitoringext.Sensorext#getCpu <em>Cpu</em>}</li>
 *   <li>{@link monitoringext.Sensorext#getRam <em>Ram</em>}</li>
 *   <li>{@link monitoringext.Sensorext#getLoadavg <em>Loadavg</em>}</li>
 *   <li>{@link monitoringext.Sensorext#getMonitorstate <em>Monitorstate</em>}</li>
 * </ul>
 *
 * @see monitoringext.MonitoringextPackage#getSensorext()
 * @model annotation="OCCIE2Ecore title='A sensor with a publisher to directly have bars and display its values in a nice way on designer'"
 * @generated
 */
public interface Sensorext extends Sensor {
	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(int)
	 * @see monitoringext.MonitoringextPackage#getSensorext_Cpu()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getCpu();

	/**
	 * Sets the value of the '{@link monitoringext.Sensorext#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(int value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(int)
	 * @see monitoringext.MonitoringextPackage#getSensorext_Ram()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getRam();

	/**
	 * Sets the value of the '{@link monitoringext.Sensorext#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(int value);

	/**
	 * Returns the value of the '<em><b>Loadavg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loadavg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadavg</em>' attribute.
	 * @see #setLoadavg(float)
	 * @see monitoringext.MonitoringextPackage#getSensorext_Loadavg()
	 * @model dataType="monitoringext.FloatType"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	float getLoadavg();

	/**
	 * Sets the value of the '{@link monitoringext.Sensorext#getLoadavg <em>Loadavg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadavg</em>' attribute.
	 * @see #getLoadavg()
	 * @generated
	 */
	void setLoadavg(float value);

	/**
	 * Returns the value of the '<em><b>Monitorstate</b></em>' attribute.
	 * The default value is <code>"off"</code>.
	 * The literals are from the enumeration {@link monitoringext.MonitorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitorstate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitorstate</em>' attribute.
	 * @see monitoringext.MonitorState
	 * @see #setMonitorstate(MonitorState)
	 * @see monitoringext.MonitoringextPackage#getSensorext_Monitorstate()
	 * @model default="off"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	MonitorState getMonitorstate();

	/**
	 * Sets the value of the '{@link monitoringext.Sensorext#getMonitorstate <em>Monitorstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitorstate</em>' attribute.
	 * @see monitoringext.MonitorState
	 * @see #getMonitorstate()
	 * @generated
	 */
	void setMonitorstate(MonitorState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Start the monitoring system for this sensor'"
	 * @generated
	 */
	void startMonitoring();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Stop monitoring for this sensor'"
	 * @generated
	 */
	void stopMonitoring();

} // Sensorext
