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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.infrastructure.impl.NetworkinterfaceImpl;

import org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostnetworkadapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#getPci <em>Pci</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostnetworkadapterImpl#isWakeOnLanSupported <em>Wake On Lan Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostnetworkadapterImpl extends NetworkinterfaceImpl implements Hostnetworkadapter {
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
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPci() <em>Pci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPci()
	 * @generated
	 * @ordered
	 */
	protected static final String PCI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPci() <em>Pci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPci()
	 * @generated
	 * @ordered
	 */
	protected String pci = PCI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected String subnetMask = SUBNET_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #isWakeOnLanSupported() <em>Wake On Lan Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWakeOnLanSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAKE_ON_LAN_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWakeOnLanSupported() <em>Wake On Lan Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWakeOnLanSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean wakeOnLanSupported = WAKE_ON_LAN_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostnetworkadapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHostnetworkadapter();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPci() {
		return pci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPci(String newPci) {
		String oldPci = pci;
		pci = newPci;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__PCI, oldPci, pci));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetMask(String newSubnetMask) {
		String oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWakeOnLanSupported() {
		return wakeOnLanSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWakeOnLanSupported(boolean newWakeOnLanSupported) {
		boolean oldWakeOnLanSupported = wakeOnLanSupported;
		wakeOnLanSupported = newWakeOnLanSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED, oldWakeOnLanSupported, wakeOnLanSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTNETWORKADAPTER__NAME:
				return getName();
			case VmwarePackage.HOSTNETWORKADAPTER__DRIVER:
				return getDriver();
			case VmwarePackage.HOSTNETWORKADAPTER__KEY:
				return getKey();
			case VmwarePackage.HOSTNETWORKADAPTER__PCI:
				return getPci();
			case VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK:
				return getSubnetMask();
			case VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED:
				return isWakeOnLanSupported();
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
			case VmwarePackage.HOSTNETWORKADAPTER__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__DRIVER:
				setDriver((String)newValue);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__KEY:
				setKey((String)newValue);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__PCI:
				setPci((String)newValue);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED:
				setWakeOnLanSupported((Boolean)newValue);
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
			case VmwarePackage.HOSTNETWORKADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__PCI:
				setPci(PCI_EDEFAULT);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED:
				setWakeOnLanSupported(WAKE_ON_LAN_SUPPORTED_EDEFAULT);
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
			case VmwarePackage.HOSTNETWORKADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.HOSTNETWORKADAPTER__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case VmwarePackage.HOSTNETWORKADAPTER__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case VmwarePackage.HOSTNETWORKADAPTER__PCI:
				return PCI_EDEFAULT == null ? pci != null : !PCI_EDEFAULT.equals(pci);
			case VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED:
				return wakeOnLanSupported != WAKE_ON_LAN_SUPPORTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VmwarePackage.HOSTNETWORKADAPTER___CONNECT:
				connect();
				return null;
			case VmwarePackage.HOSTNETWORKADAPTER___DISCONNECT:
				disconnect();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", driver: ");
		result.append(driver);
		result.append(", key: ");
		result.append(key);
		result.append(", pci: ");
		result.append(pci);
		result.append(", subnetMask: ");
		result.append(subnetMask);
		result.append(", wakeOnLanSupported: ");
		result.append(wakeOnLanSupported);
		result.append(')');
		return result.toString();
	}

} //HostnetworkadapterImpl
