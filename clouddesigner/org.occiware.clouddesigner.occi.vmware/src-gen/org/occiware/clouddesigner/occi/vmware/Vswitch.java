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

import org.occiware.clouddesigner.occi.infrastructure.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vswitch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getNbport <em>Nbport</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getBeaconInterval <em>Beacon Interval</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getMtu <em>Mtu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getChangeOperation <em>Change Operation</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch()
 * @model annotation="OCCIE2Ecore title='a virtual switch for linking virtual network adapter to a hostsystem network'"
 * @generated
 */
public interface Vswitch extends Network {
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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Standard virtual switch name, note that the name must be unique on current host'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nbport</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbport</em>' attribute.
	 * @see #setNbport(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch_Nbport()
	 * @model default="8" dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='The number of ports that this virtual switch is configured to use. Changing this setting does not take effect until the next reboot. The maximum value is 1024, although other constraints, such as memory limits, may establish a lower effective limit'"
	 * @generated
	 */
	int getNbport();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getNbport <em>Nbport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbport</em>' attribute.
	 * @see #getNbport()
	 * @generated
	 */
	void setNbport(int value);

	/**
	 * Returns the value of the '<em><b>Beacon Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beacon Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beacon Interval</em>' attribute.
	 * @see #setBeaconInterval(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch_BeaconInterval()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Determines how often, in seconds, a beacon should be sent. See HostVirtualSwitchBeaconConfig and nicfailurecriteria.checkBeacon, for use with bond bridge'"
	 * @generated
	 */
	int getBeaconInterval();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getBeaconInterval <em>Beacon Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beacon Interval</em>' attribute.
	 * @see #getBeaconInterval()
	 * @generated
	 */
	void setBeaconInterval(int value);

	/**
	 * Returns the value of the '<em><b>Mtu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mtu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mtu</em>' attribute.
	 * @see #setMtu(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch_Mtu()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The maximum transmission unit (MTU) of the virtual switch in bytes'"
	 * @generated
	 */
	int getMtu();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getMtu <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtu</em>' attribute.
	 * @see #getMtu()
	 * @generated
	 */
	void setMtu(int value);

	/**
	 * Returns the value of the '<em><b>Change Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Operation</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @see #setChangeOperation(NetworkChangeOperation)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVswitch_ChangeOperation()
	 * @model annotation="OCCIE2Ecore description='This property indicates the change operation to apply on this configuration\nadd: Indicates the addition of a network entity to the configuration.\nedit: Indicates changes on the network entity. The entity must exist or a NotFound error will be thrown\nremove: Indicates the removal of a network entity from the configuration'"
	 * @generated
	 */
	NetworkChangeOperation getChangeOperation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vswitch#getChangeOperation <em>Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Operation</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation
	 * @see #getChangeOperation()
	 * @generated
	 */
	void setChangeOperation(NetworkChangeOperation value);

} // Vswitch
