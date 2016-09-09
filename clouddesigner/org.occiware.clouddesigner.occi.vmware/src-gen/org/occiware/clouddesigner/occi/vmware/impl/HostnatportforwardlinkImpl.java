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
package org.occiware.clouddesigner.occi.vmware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.LinkImpl;

import org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol;
import org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostnatportforwardlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl#getGuestIpAddress <em>Guest Ip Address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl#getGuestPort <em>Guest Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatportforwardlinkImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostnatportforwardlinkImpl extends LinkImpl implements Hostnatportforwardlink {
	/**
	 * The default value of the '{@link #getGuestIpAddress() <em>Guest Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String GUEST_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestIpAddress() <em>Guest Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String guestIpAddress = GUEST_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestPort() <em>Guest Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestPort()
	 * @generated
	 * @ordered
	 */
	protected static final int GUEST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuestPort() <em>Guest Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestPort()
	 * @generated
	 * @ordered
	 */
	protected int guestPort = GUEST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected int hostPort = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final HostNetworkProtocol TYPE_EDEFAULT = HostNetworkProtocol.TCP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected HostNetworkProtocol type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostnatportforwardlinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHostnatportforwardlink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestIpAddress() {
		return guestIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestIpAddress(String newGuestIpAddress) {
		String oldGuestIpAddress = guestIpAddress;
		guestIpAddress = newGuestIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS, oldGuestIpAddress, guestIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGuestPort() {
		return guestPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestPort(int newGuestPort) {
		int oldGuestPort = guestPort;
		guestPort = newGuestPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_PORT, oldGuestPort, guestPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPort(int newHostPort) {
		int oldHostPort = hostPort;
		hostPort = newHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATPORTFORWARDLINK__HOST_PORT, oldHostPort, hostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATPORTFORWARDLINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNetworkProtocol getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(HostNetworkProtocol newType) {
		HostNetworkProtocol oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATPORTFORWARDLINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS:
				return getGuestIpAddress();
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_PORT:
				return getGuestPort();
			case VmwarePackage.HOSTNATPORTFORWARDLINK__HOST_PORT:
				return getHostPort();
			case VmwarePackage.HOSTNATPORTFORWARDLINK__NAME:
				return getName();
			case VmwarePackage.HOSTNATPORTFORWARDLINK__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS:
				setGuestIpAddress((String)newValue);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_PORT:
				setGuestPort((Integer)newValue);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__HOST_PORT:
				setHostPort((Integer)newValue);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__TYPE:
				setType((HostNetworkProtocol)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS:
				setGuestIpAddress(GUEST_IP_ADDRESS_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_PORT:
				setGuestPort(GUEST_PORT_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__HOST_PORT:
				setHostPort(HOST_PORT_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_IP_ADDRESS:
				return GUEST_IP_ADDRESS_EDEFAULT == null ? guestIpAddress != null : !GUEST_IP_ADDRESS_EDEFAULT.equals(guestIpAddress);
			case VmwarePackage.HOSTNATPORTFORWARDLINK__GUEST_PORT:
				return guestPort != GUEST_PORT_EDEFAULT;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__HOST_PORT:
				return hostPort != HOST_PORT_EDEFAULT;
			case VmwarePackage.HOSTNATPORTFORWARDLINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.HOSTNATPORTFORWARDLINK__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guestIpAddress: ");
		result.append(guestIpAddress);
		result.append(", guestPort: ");
		result.append(guestPort);
		result.append(", hostPort: ");
		result.append(hostPort);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //HostnatportforwardlinkImpl
