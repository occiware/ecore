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
 * A representation of the model object '<em><b>Virtualnetworkadapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getKey <em>Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getPort <em>Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getDeviceDriver <em>Device Driver</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter()
 * @model annotation="OCCIE2Ecore title='a network adapter for a virtual machine (virtual nic), describes a virtual network adapter representing an adapter that connects to a virtual switch. A VirtualNic differs from a PhysicalNic in that the latter corresponds to a physical device that is connected to the physical network. The former is a virtual device that is connected to a virtual switch. A VirtualNic accesses the external network through a virtual switch that is bridged through a PhysicalNic to a physical network'"
 * @generated
 */
public interface Virtualnetworkadapter extends Networkinterface {
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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Device name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter_Key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The linkable identifier. '"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter_SubnetMask()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The subnet mask.\nNote: When DHCP is not enabled, this property can be set explicitly. When DHCP is enabled, this property reflects the current IP configuration and cannot be set. '"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter_Port()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The port on the port group that the virtual network adapter is using when it is enabled. '"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Device Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Driver</em>' attribute.
	 * @see #setDeviceDriver(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualnetworkadapter_DeviceDriver()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='like vmxnet etc.'"
	 * @generated
	 */
	String getDeviceDriver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter#getDeviceDriver <em>Device Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Driver</em>' attribute.
	 * @see #getDeviceDriver()
	 * @generated
	 */
	void setDeviceDriver(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Connect virtual machine to vswitch'"
	 * @generated
	 */
	void connectAdaptater();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Disconnect virtual machine and vswitch'"
	 * @generated
	 */
	void disconnectAdaptater();

} // Virtualnetworkadapter
