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
 * A representation of the model object '<em><b>Machine Microsoft Hyper V</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch <em>Virtual switch</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getStatic_macaddress <em>Static macaddress</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVlan_id <em>Vlan id</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V()
 * @model annotation="OCCIE2Ecore title='Machine on Microsoft Hyper-V'"
 * @generated
 */
public interface Machine_Microsoft_Hyper_V extends Machine {
	/**
	 * Returns the value of the '<em><b>Virtual switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual switch</em>' attribute.
	 * @see #setVirtual_switch(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Virtual_switch()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getVirtual_switch();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch <em>Virtual switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual switch</em>' attribute.
	 * @see #getVirtual_switch()
	 * @generated
	 */
	void setVirtual_switch(String value);

	/**
	 * Returns the value of the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker url</em>' attribute.
	 * @see #setBoot2docker_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Static macaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static macaddress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static macaddress</em>' attribute.
	 * @see #setStatic_macaddress(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Static_macaddress()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getStatic_macaddress();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getStatic_macaddress <em>Static macaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static macaddress</em>' attribute.
	 * @see #getStatic_macaddress()
	 * @generated
	 */
	void setStatic_macaddress(String value);

	/**
	 * Returns the value of the '<em><b>Vlan id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlan id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan id</em>' attribute.
	 * @see #setVlan_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Vlan_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getVlan_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVlan_id <em>Vlan id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan id</em>' attribute.
	 * @see #getVlan_id()
	 * @generated
	 */
	void setVlan_id(String value);

} // Machine_Microsoft_Hyper_V
