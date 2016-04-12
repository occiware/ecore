/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Google Compute Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type <em>Machine type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name <em>Instance name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine()
 * @model annotation="OCCIE2Ecore title='Machine on Google Compute Engine'"
 * @generated
 */
public interface Machine_Google_Compute_Engine extends Machine {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>"us-central1-a"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Zone()
	 * @model default="us-central1-a" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The zone to launch the instance'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Machine type</b></em>' attribute.
	 * The default value is <code>"f1-micro"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine type</em>' attribute.
	 * @see #setMachine_type(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Machine_type()
	 * @model default="f1-micro" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The type of instance'"
	 * @generated
	 */
	String getMachine_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine type</em>' attribute.
	 * @see #getMachine_type()
	 * @generated
	 */
	void setMachine_type(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"docker-user"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Username()
	 * @model default="docker-user" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The username to use for the instance'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Instance name</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance name</em>' attribute.
	 * @see #setInstance_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Instance_name()
	 * @model default="docker-machine" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The name of the instance'"
	 * @generated
	 */
	String getInstance_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name <em>Instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance name</em>' attribute.
	 * @see #getInstance_name()
	 * @generated
	 */
	void setInstance_name(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Project()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The name of your project to use when launching the instance'"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

} // Machine_Google_Compute_Engine
