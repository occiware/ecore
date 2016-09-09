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
 * A representation of the model object '<em><b>Hostnatrule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isActiveFtp <em>Active Ftp</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isAllowAnyOui <em>Allow Any Oui</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isConfigPort <em>Config Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatKey <em>Nat Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatChangeOperation <em>Nat Change Operation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getIpGatewayAddress <em>Ip Gateway Address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getUdpTimeOut <em>Udp Time Out</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule()
 * @model annotation="OCCIE2Ecore title='Ruleset for nat service linked to virtual switch via hostnatportforwardlink, this may be multiple for a vswitch'"
 * @generated
 */
public interface Hostnatrule extends Resource {
	/**
	 * Returns the value of the '<em><b>Active Ftp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Ftp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Ftp</em>' attribute.
	 * @see #setActiveFtp(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_ActiveFtp()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean" required="true"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not non-passive mode FTP connections should be allowed'"
	 * @generated
	 */
	boolean isActiveFtp();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isActiveFtp <em>Active Ftp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Ftp</em>' attribute.
	 * @see #isActiveFtp()
	 * @generated
	 */
	void setActiveFtp(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Any Oui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Any Oui</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Any Oui</em>' attribute.
	 * @see #setAllowAnyOui(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_AllowAnyOui()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean" required="true"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not the NAT Service allows media access control traffic from any Organizational Unique Identifier (OUI)? By default, it does not allow traffic that originated from the host to avoid packet loops.'"
	 * @generated
	 */
	boolean isAllowAnyOui();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isAllowAnyOui <em>Allow Any Oui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Any Oui</em>' attribute.
	 * @see #isAllowAnyOui()
	 * @generated
	 */
	void setAllowAnyOui(boolean value);

	/**
	 * Returns the value of the '<em><b>Config Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Port</em>' attribute.
	 * @see #setConfigPort(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_ConfigPort()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean" required="true"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not the NAT Service should open a configuration port.'"
	 * @generated
	 */
	boolean isConfigPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#isConfigPort <em>Config Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Port</em>' attribute.
	 * @see #isConfigPort()
	 * @generated
	 */
	void setConfigPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Nat Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nat Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Key</em>' attribute.
	 * @see #setNatKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_NatKey()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The instance ID of the NAT service'"
	 * @generated
	 */
	String getNatKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatKey <em>Nat Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Key</em>' attribute.
	 * @see #getNatKey()
	 * @generated
	 */
	void setNatKey(String value);

	/**
	 * Returns the value of the '<em><b>Nat Change Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nat Change Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nat Change Operation</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @see #setNatChangeOperation(NetworkChangeOperation)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_NatChangeOperation()
	 * @model annotation="OCCIE2Ecore description='Indicates the change operation to apply on this configuration specification'"
	 * @generated
	 */
	NetworkChangeOperation getNatChangeOperation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getNatChangeOperation <em>Nat Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nat Change Operation</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @see #getNatChangeOperation()
	 * @generated
	 */
	void setNatChangeOperation(NetworkChangeOperation value);

	/**
	 * Returns the value of the '<em><b>Ip Gateway Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Gateway Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Gateway Address</em>' attribute.
	 * @see #setIpGatewayAddress(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_IpGatewayAddress()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The IP address that the NAT Service should use on the virtual network.'"
	 * @generated
	 */
	String getIpGatewayAddress();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getIpGatewayAddress <em>Ip Gateway Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Gateway Address</em>' attribute.
	 * @see #getIpGatewayAddress()
	 * @generated
	 */
	void setIpGatewayAddress(String value);

	/**
	 * Returns the value of the '<em><b>Udp Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udp Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Time Out</em>' attribute.
	 * @see #setUdpTimeOut(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnatrule_UdpTimeOut()
	 * @model dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The time alloted for UDP packets'"
	 * @generated
	 */
	int getUdpTimeOut();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule#getUdpTimeOut <em>Udp Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udp Time Out</em>' attribute.
	 * @see #getUdpTimeOut()
	 * @generated
	 */
	void setUdpTimeOut(int value);

} // Hostnatrule
