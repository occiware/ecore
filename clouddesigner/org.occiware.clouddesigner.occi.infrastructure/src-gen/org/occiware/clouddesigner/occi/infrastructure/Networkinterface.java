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

import org.occiware.clouddesigner.occi.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networkinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac <em>Mac</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState <em>State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface()
 * @model annotation="OCCIE2Ecore title='NetworkInterface Link'"
 * @generated
 */
public interface Networkinterface extends Link {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_Interface()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Identifier that relates the link to the link\'s device interface'"
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_Mac()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.Mac" required="true"
	 *        annotation="OCCIE2Ecore description='MAC address associated with the link\'s device interface'"
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @see #setState(NetworkInterfaceStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_State()
	 * @model required="true"
	 *        annotation="OCCIE2Ecore description='Current status of the instance'"
	 * @generated
	 */
	NetworkInterfaceStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(NetworkInterfaceStatus value);

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
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_Message()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Human-readable explanation of the current instance state'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Networkinterface
