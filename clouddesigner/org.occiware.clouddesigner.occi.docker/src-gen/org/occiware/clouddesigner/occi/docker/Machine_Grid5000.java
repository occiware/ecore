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
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Grid5000</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSite <em>Site</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getWalltime <em>Walltime</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSsh_private_key <em>Ssh private key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSsh_public_key <em>Ssh public key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getResource_properties <em>Resource properties</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getUse_job_reservation <em>Use job reservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getHost_to_provision <em>Host to provision</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000()
 * @model annotation="OCCIE2Ecore title='Grid5000 cluster'"
 * @generated
 */
public interface Machine_Grid5000 extends Machine {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Username()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Password()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' attribute.
	 * @see #setSite(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Site()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSite();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSite <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' attribute.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(String value);

	/**
	 * Returns the value of the '<em><b>Walltime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Walltime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walltime</em>' attribute.
	 * @see #setWalltime(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Walltime()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getWalltime();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getWalltime <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walltime</em>' attribute.
	 * @see #getWalltime()
	 * @generated
	 */
	void setWalltime(String value);

	/**
	 * Returns the value of the '<em><b>Ssh private key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh private key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh private key</em>' attribute.
	 * @see #setSsh_private_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Ssh_private_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSsh_private_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSsh_private_key <em>Ssh private key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh private key</em>' attribute.
	 * @see #getSsh_private_key()
	 * @generated
	 */
	void setSsh_private_key(String value);

	/**
	 * Returns the value of the '<em><b>Ssh public key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh public key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh public key</em>' attribute.
	 * @see #setSsh_public_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Ssh_public_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSsh_public_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getSsh_public_key <em>Ssh public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh public key</em>' attribute.
	 * @see #getSsh_public_key()
	 * @generated
	 */
	void setSsh_public_key(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Image()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Resource properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource properties</em>' attribute.
	 * @see #setResource_properties(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Resource_properties()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getResource_properties();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getResource_properties <em>Resource properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource properties</em>' attribute.
	 * @see #getResource_properties()
	 * @generated
	 */
	void setResource_properties(String value);

	/**
	 * Returns the value of the '<em><b>Use job reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use job reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use job reservation</em>' attribute.
	 * @see #setUse_job_reservation(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Use_job_reservation()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getUse_job_reservation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getUse_job_reservation <em>Use job reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use job reservation</em>' attribute.
	 * @see #getUse_job_reservation()
	 * @generated
	 */
	void setUse_job_reservation(String value);

	/**
	 * Returns the value of the '<em><b>Host to provision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host to provision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host to provision</em>' attribute.
	 * @see #setHost_to_provision(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Grid5000_Host_to_provision()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHost_to_provision();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000#getHost_to_provision <em>Host to provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host to provision</em>' attribute.
	 * @see #getHost_to_provision()
	 * @generated
	 */
	void setHost_to_provision(String value);

} // Machine_Grid5000
