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

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.vmware.Hostnatrule;
import org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostnatrule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#isActiveFtp <em>Active Ftp</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#isAllowAnyOui <em>Allow Any Oui</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#isConfigPort <em>Config Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#getNatKey <em>Nat Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#getNatChangeOperation <em>Nat Change Operation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#getIpGatewayAddress <em>Ip Gateway Address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnatruleImpl#getUdpTimeOut <em>Udp Time Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostnatruleImpl extends ResourceImpl implements Hostnatrule {
	/**
	 * The default value of the '{@link #isActiveFtp() <em>Active Ftp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveFtp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_FTP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActiveFtp() <em>Active Ftp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveFtp()
	 * @generated
	 * @ordered
	 */
	protected boolean activeFtp = ACTIVE_FTP_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowAnyOui() <em>Allow Any Oui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAnyOui()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_ANY_OUI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowAnyOui() <em>Allow Any Oui</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAnyOui()
	 * @generated
	 * @ordered
	 */
	protected boolean allowAnyOui = ALLOW_ANY_OUI_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfigPort() <em>Config Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIG_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfigPort() <em>Config Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfigPort()
	 * @generated
	 * @ordered
	 */
	protected boolean configPort = CONFIG_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatKey() <em>Nat Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatKey()
	 * @generated
	 * @ordered
	 */
	protected static final String NAT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatKey() <em>Nat Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatKey()
	 * @generated
	 * @ordered
	 */
	protected String natKey = NAT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatChangeOperation() <em>Nat Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatChangeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkChangeOperation NAT_CHANGE_OPERATION_EDEFAULT = NetworkChangeOperation.ADD;

	/**
	 * The cached value of the '{@link #getNatChangeOperation() <em>Nat Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatChangeOperation()
	 * @generated
	 * @ordered
	 */
	protected NetworkChangeOperation natChangeOperation = NAT_CHANGE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpGatewayAddress() <em>Ip Gateway Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpGatewayAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_GATEWAY_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpGatewayAddress() <em>Ip Gateway Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpGatewayAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipGatewayAddress = IP_GATEWAY_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUdpTimeOut() <em>Udp Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdpTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final int UDP_TIME_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUdpTimeOut() <em>Udp Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdpTimeOut()
	 * @generated
	 * @ordered
	 */
	protected int udpTimeOut = UDP_TIME_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostnatruleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHostnatrule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActiveFtp() {
		return activeFtp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveFtp(boolean newActiveFtp) {
		boolean oldActiveFtp = activeFtp;
		activeFtp = newActiveFtp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__ACTIVE_FTP, oldActiveFtp, activeFtp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowAnyOui() {
		return allowAnyOui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowAnyOui(boolean newAllowAnyOui) {
		boolean oldAllowAnyOui = allowAnyOui;
		allowAnyOui = newAllowAnyOui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI, oldAllowAnyOui, allowAnyOui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfigPort() {
		return configPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigPort(boolean newConfigPort) {
		boolean oldConfigPort = configPort;
		configPort = newConfigPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__CONFIG_PORT, oldConfigPort, configPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatKey() {
		return natKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatKey(String newNatKey) {
		String oldNatKey = natKey;
		natKey = newNatKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__NAT_KEY, oldNatKey, natKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkChangeOperation getNatChangeOperation() {
		return natChangeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatChangeOperation(NetworkChangeOperation newNatChangeOperation) {
		NetworkChangeOperation oldNatChangeOperation = natChangeOperation;
		natChangeOperation = newNatChangeOperation == null ? NAT_CHANGE_OPERATION_EDEFAULT : newNatChangeOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION, oldNatChangeOperation, natChangeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpGatewayAddress() {
		return ipGatewayAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpGatewayAddress(String newIpGatewayAddress) {
		String oldIpGatewayAddress = ipGatewayAddress;
		ipGatewayAddress = newIpGatewayAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS, oldIpGatewayAddress, ipGatewayAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUdpTimeOut() {
		return udpTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdpTimeOut(int newUdpTimeOut) {
		int oldUdpTimeOut = udpTimeOut;
		udpTimeOut = newUdpTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNATRULE__UDP_TIME_OUT, oldUdpTimeOut, udpTimeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTNATRULE__ACTIVE_FTP:
				return isActiveFtp();
			case VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI:
				return isAllowAnyOui();
			case VmwarePackage.HOSTNATRULE__CONFIG_PORT:
				return isConfigPort();
			case VmwarePackage.HOSTNATRULE__NAT_KEY:
				return getNatKey();
			case VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION:
				return getNatChangeOperation();
			case VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS:
				return getIpGatewayAddress();
			case VmwarePackage.HOSTNATRULE__UDP_TIME_OUT:
				return getUdpTimeOut();
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
			case VmwarePackage.HOSTNATRULE__ACTIVE_FTP:
				setActiveFtp((Boolean)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI:
				setAllowAnyOui((Boolean)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__CONFIG_PORT:
				setConfigPort((Boolean)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__NAT_KEY:
				setNatKey((String)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION:
				setNatChangeOperation((NetworkChangeOperation)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS:
				setIpGatewayAddress((String)newValue);
				return;
			case VmwarePackage.HOSTNATRULE__UDP_TIME_OUT:
				setUdpTimeOut((Integer)newValue);
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
			case VmwarePackage.HOSTNATRULE__ACTIVE_FTP:
				setActiveFtp(ACTIVE_FTP_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI:
				setAllowAnyOui(ALLOW_ANY_OUI_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__CONFIG_PORT:
				setConfigPort(CONFIG_PORT_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__NAT_KEY:
				setNatKey(NAT_KEY_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION:
				setNatChangeOperation(NAT_CHANGE_OPERATION_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS:
				setIpGatewayAddress(IP_GATEWAY_ADDRESS_EDEFAULT);
				return;
			case VmwarePackage.HOSTNATRULE__UDP_TIME_OUT:
				setUdpTimeOut(UDP_TIME_OUT_EDEFAULT);
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
			case VmwarePackage.HOSTNATRULE__ACTIVE_FTP:
				return activeFtp != ACTIVE_FTP_EDEFAULT;
			case VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI:
				return allowAnyOui != ALLOW_ANY_OUI_EDEFAULT;
			case VmwarePackage.HOSTNATRULE__CONFIG_PORT:
				return configPort != CONFIG_PORT_EDEFAULT;
			case VmwarePackage.HOSTNATRULE__NAT_KEY:
				return NAT_KEY_EDEFAULT == null ? natKey != null : !NAT_KEY_EDEFAULT.equals(natKey);
			case VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION:
				return natChangeOperation != NAT_CHANGE_OPERATION_EDEFAULT;
			case VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS:
				return IP_GATEWAY_ADDRESS_EDEFAULT == null ? ipGatewayAddress != null : !IP_GATEWAY_ADDRESS_EDEFAULT.equals(ipGatewayAddress);
			case VmwarePackage.HOSTNATRULE__UDP_TIME_OUT:
				return udpTimeOut != UDP_TIME_OUT_EDEFAULT;
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
		result.append(" (activeFtp: ");
		result.append(activeFtp);
		result.append(", allowAnyOui: ");
		result.append(allowAnyOui);
		result.append(", configPort: ");
		result.append(configPort);
		result.append(", natKey: ");
		result.append(natKey);
		result.append(", natChangeOperation: ");
		result.append(natChangeOperation);
		result.append(", ipGatewayAddress: ");
		result.append(ipGatewayAddress);
		result.append(", udpTimeOut: ");
		result.append(udpTimeOut);
		result.append(')');
		return result.toString();
	}

} //HostnatruleImpl
