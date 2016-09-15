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

import org.occiware.clouddesigner.occi.impl.ResourceImpl;
import org.occiware.clouddesigner.occi.vmware.Datacenter;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.DatacenterImpl#getDefaultHardwareVersionKey <em>Default Hardware Version Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.DatacenterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatacenterImpl extends ResourceImpl implements Datacenter {
	/**
	 * The default value of the '{@link #getDefaultHardwareVersionKey() <em>Default Hardware Version Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHardwareVersionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_HARDWARE_VERSION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultHardwareVersionKey() <em>Default Hardware Version Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHardwareVersionKey()
	 * @generated
	 * @ordered
	 */
	protected String defaultHardwareVersionKey = DEFAULT_HARDWARE_VERSION_KEY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatacenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getDatacenter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultHardwareVersionKey() {
		return defaultHardwareVersionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHardwareVersionKey(String newDefaultHardwareVersionKey) {
		String oldDefaultHardwareVersionKey = defaultHardwareVersionKey;
		defaultHardwareVersionKey = newDefaultHardwareVersionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.DATACENTER__DEFAULT_HARDWARE_VERSION_KEY, oldDefaultHardwareVersionKey, defaultHardwareVersionKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.DATACENTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void powerOnMultiVMs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void discoverAll() {
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
			case VmwarePackage.DATACENTER__DEFAULT_HARDWARE_VERSION_KEY:
				return getDefaultHardwareVersionKey();
			case VmwarePackage.DATACENTER__NAME:
				return getName();
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
			case VmwarePackage.DATACENTER__DEFAULT_HARDWARE_VERSION_KEY:
				setDefaultHardwareVersionKey((String)newValue);
				return;
			case VmwarePackage.DATACENTER__NAME:
				setName((String)newValue);
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
			case VmwarePackage.DATACENTER__DEFAULT_HARDWARE_VERSION_KEY:
				setDefaultHardwareVersionKey(DEFAULT_HARDWARE_VERSION_KEY_EDEFAULT);
				return;
			case VmwarePackage.DATACENTER__NAME:
				setName(NAME_EDEFAULT);
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
			case VmwarePackage.DATACENTER__DEFAULT_HARDWARE_VERSION_KEY:
				return DEFAULT_HARDWARE_VERSION_KEY_EDEFAULT == null ? defaultHardwareVersionKey != null : !DEFAULT_HARDWARE_VERSION_KEY_EDEFAULT.equals(defaultHardwareVersionKey);
			case VmwarePackage.DATACENTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case VmwarePackage.DATACENTER___POWER_ON_MULTI_VMS:
				powerOnMultiVMs();
				return null;
			case VmwarePackage.DATACENTER___DISCOVER_ALL:
				discoverAll();
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
		result.append(" (defaultHardwareVersionKey: ");
		result.append(defaultHardwareVersionKey);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DatacenterImpl
