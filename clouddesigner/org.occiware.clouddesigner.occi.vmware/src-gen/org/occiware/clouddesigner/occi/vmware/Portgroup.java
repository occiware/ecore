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
package org.occiware.clouddesigner.occi.vmware;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getVlanId <em>Vlan Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getPortgroup()
 * @model annotation="OCCIE2Ecore title='A port group aggregates multiple ports under a common configuration and provides a stable anchor point for virtual machines connecting to the labeled networks. It is identified by a label, which must be unique to the current host. The optional VLAN ID restricts port group traffic to a logical Ethernet segment within the network'"
 * @generated
 */
public interface Portgroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getPortgroup_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vlan Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlan Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan Id</em>' attribute.
	 * @see #setVlanId(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getPortgroup_VlanId()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The VLAN ID for ports using this port group. Possible values:\nA value of 0 specifies that you do not want the port group associated with a VLAN.\nA value from 1 to 4094 specifies a VLAN ID for the port group.\nA value of 4095 specifies that the port group should use trunk mode, which allows the guest operating system to manage its own VLAN tags'"
	 * @generated
	 */
	int getVlanId();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getVlanId <em>Vlan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan Id</em>' attribute.
	 * @see #getVlanId()
	 * @generated
	 */
	void setVlanId(int value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getPortgroup_Key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The linkable identifier'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Portgroup#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // Portgroup
