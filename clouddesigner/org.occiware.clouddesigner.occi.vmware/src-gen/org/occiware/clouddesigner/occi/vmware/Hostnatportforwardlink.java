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

import org.occiware.clouddesigner.occi.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostnatportforwardlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestIpAddress <em>Guest Ip Address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestPort <em>Guest Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink()
 * @model annotation="OCCIE2Ecore title='Define the port forward to hostnatrule, it may be multiple links to a single hostnatrule, this define the port forwarding specifications to allow network connections to be initiated from outside the firewall. '"
 * @generated
 */
public interface Hostnatportforwardlink extends Link {
	/**
	 * Returns the value of the '<em><b>Guest Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Ip Address</em>' attribute.
	 * @see #setGuestIpAddress(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink_GuestIpAddress()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The IP address for the guest. Network traffic from the host is forwarded to this IP address'"
	 * @generated
	 */
	String getGuestIpAddress();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestIpAddress <em>Guest Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Ip Address</em>' attribute.
	 * @see #getGuestIpAddress()
	 * @generated
	 */
	void setGuestIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Guest Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Port</em>' attribute.
	 * @see #setGuestPort(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink_GuestPort()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The port number for the guest. Network traffic from the host is forwarded to this port. '"
	 * @generated
	 */
	int getGuestPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getGuestPort <em>Guest Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Port</em>' attribute.
	 * @see #getGuestPort()
	 * @generated
	 */
	void setGuestPort(int value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink_HostPort()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The port number on the host. Network traffic sent to the host on this TCP/UDP port is forwarded to the guest at the specified IP address and port.'"
	 * @generated
	 */
	int getHostPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(int value);

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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The user-defined name to identify the service being forwarded. No white spaces are allowed in the string'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @see #setType(HostNetworkProtocol)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatportforwardlink_Type()
	 * @model annotation="OCCIE2Ecore description='Either \"tcp\" or \"udp\".'"
	 * @generated
	 */
	HostNetworkProtocol getType();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @see #getType()
	 * @generated
	 */
	void setType(HostNetworkProtocol value);

} // Hostnatportforwardlink
