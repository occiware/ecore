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

import org.occiware.clouddesigner.occi.infrastructure.Networkinterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostnetworkadapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getKey <em>Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getPci <em>Pci</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#isWakeOnLanSupported <em>Wake On Lan Supported</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter()
 * @model annotation="OCCIE2Ecore title='Physical Network adaptater on a hostsystem, describes the physical network adapter as seen by the primary operating system'"
 * @generated
 */
public interface Hostnetworkadapter extends Networkinterface {
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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The device name of the physical network adapter'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_Driver()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The name of the driver'"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_Key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The linkable identifier'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Pci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pci</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pci</em>' attribute.
	 * @see #setPci(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_Pci()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Device hash of the PCI device corresponding to this physical network adapter.'"
	 * @generated
	 */
	String getPci();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getPci <em>Pci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pci</em>' attribute.
	 * @see #getPci()
	 * @generated
	 */
	void setPci(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_SubnetMask()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The subnet mask.\nNote: When DHCP is not enabled, this property can be set explicitly. When DHCP is enabled, this property reflects the current IP configuration and cannot be set. '"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>Wake On Lan Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wake On Lan Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wake On Lan Supported</em>' attribute.
	 * @see #setWakeOnLanSupported(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostnetworkadapter_WakeOnLanSupported()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean" required="true"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether the NIC is wake-on-LAN capable'"
	 * @generated
	 */
	boolean isWakeOnLanSupported();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter#isWakeOnLanSupported <em>Wake On Lan Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wake On Lan Supported</em>' attribute.
	 * @see #isWakeOnLanSupported()
	 * @generated
	 */
	void setWakeOnLanSupported(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void disconnect();

} // Hostnetworkadapter
