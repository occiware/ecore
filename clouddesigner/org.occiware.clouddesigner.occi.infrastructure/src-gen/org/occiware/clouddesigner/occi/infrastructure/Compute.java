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
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getShare <em>Share</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getState <em>State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute()
 * @model annotation="OCCIE2Ecore title='Compute Resource'"
 * @generated
 */
public interface Compute extends Resource {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @see #setArchitecture(Architecture)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Architecture()
	 * @model annotation="OCCIE2Ecore description='CPU Architecture of the instance'"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(int)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Cores()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.Core"
	 *        annotation="OCCIE2Ecore description='Number of CPU cores assigned to the instance'"
	 * @generated
	 */
	int getCores();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(int value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Hostname()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Fully Qualified DNS hostname for the instance'"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share</em>' attribute.
	 * @see #setShare(int)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Share()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.Share"
	 *        annotation="OCCIE2Ecore description='Relative number of CPU shares for the instance'"
	 * @generated
	 */
	int getShare();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getShare <em>Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share</em>' attribute.
	 * @see #getShare()
	 * @generated
	 */
	void setShare(int value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Speed()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GHz"
	 *        annotation="OCCIE2Ecore description='CPU Clock frequency (speed) in gigahertz'"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Memory()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GiB"
	 *        annotation="OCCIE2Ecore description='Maximum RAM in gigabytes allocated to the instance'"
	 * @generated
	 */
	float getMemory();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(float value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"inactive"</code>.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #setState(ComputeStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_State()
	 * @model default="inactive" required="true"
	 *        annotation="OCCIE2Ecore description='Current state of the instance'"
	 * @generated
	 */
	ComputeStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(ComputeStatus value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Message()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Human-readable explanation of the current instance state'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Start the system'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        methodAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='Stop the system (graceful, acpioff or poweroff)'"
	 * @generated
	 */
	void stop(StopMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        methodAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='Restart the system (graceful, warm or cold)'"
	 * @generated
	 */
	void restart(RestartMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        methodAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='Suspend the system (hibernate or in RAM)'"
	 * @generated
	 */
	void suspend(SuspendMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        methodAnnotation="OCCIE2Ecore description='null'" nameDataType="org.occiware.clouddesigner.occi.String" nameRequired="true"
	 *        nameAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='Save the system (hot, deferred)'"
	 * @generated
	 */
	void save(SaveMethod method, String name);

} // Compute
