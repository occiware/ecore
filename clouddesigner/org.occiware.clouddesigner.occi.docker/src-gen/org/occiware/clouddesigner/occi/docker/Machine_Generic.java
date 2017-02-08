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
 * A representation of the model object '<em><b>Machine Generic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getEngine_port <em>Engine port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getIp_address <em>Ip address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_key <em>Ssh key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_port <em>Ssh port</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic()
 * @model annotation="OCCIE2Ecore title='Create machines using an existing VM/Host with SSH'"
 * @generated
 */
public interface Machine_Generic extends Machine {
	/**
	 * Returns the value of the '<em><b>Engine port</b></em>' attribute.
	 * The default value is <code>"2376"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine port</em>' attribute.
	 * @see #setEngine_port(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic_Engine_port()
	 * @model default="2376" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Port to use for Docker Daemon (Note: This flag will not work with boot2docker).'"
	 * @generated
	 */
	int getEngine_port();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getEngine_port <em>Engine port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine port</em>' attribute.
	 * @see #getEngine_port()
	 * @generated
	 */
	void setEngine_port(int value);

	/**
	 * Returns the value of the '<em><b>Ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip address</em>' attribute.
	 * @see #setIp_address(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic_Ip_address()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description=' required IP Address of host.'"
	 * @generated
	 */
	String getIp_address();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getIp_address <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip address</em>' attribute.
	 * @see #getIp_address()
	 * @generated
	 */
	void setIp_address(String value);

	/**
	 * Returns the value of the '<em><b>Ssh key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh key</em>' attribute.
	 * @see #setSsh_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic_Ssh_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Path to the SSH user private key.'"
	 * @generated
	 */
	String getSsh_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_key <em>Ssh key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh key</em>' attribute.
	 * @see #getSsh_key()
	 * @generated
	 */
	void setSsh_key(String value);

	/**
	 * Returns the value of the '<em><b>Ssh user</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh user</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh user</em>' attribute.
	 * @see #setSsh_user(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic_Ssh_user()
	 * @model default="root" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='SSH username used to connect.'"
	 * @generated
	 */
	String getSsh_user();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_user <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh user</em>' attribute.
	 * @see #getSsh_user()
	 * @generated
	 */
	void setSsh_user(String value);

	/**
	 * Returns the value of the '<em><b>Ssh port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh port</em>' attribute.
	 * @see #setSsh_port(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Generic_Ssh_port()
	 * @model default="22" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Port to use for SSH.'"
	 * @generated
	 */
	int getSsh_port();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Generic#getSsh_port <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh port</em>' attribute.
	 * @see #getSsh_port()
	 * @generated
	 */
	void setSsh_port(int value);

} // Machine_Generic
