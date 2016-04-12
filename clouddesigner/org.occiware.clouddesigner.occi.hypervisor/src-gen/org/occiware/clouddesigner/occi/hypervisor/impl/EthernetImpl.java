/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.hypervisor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.hypervisor.Ethernet;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl#getTarget_dev <em>Target dev</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.EthernetImpl#getScript_path <em>Script path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthernetImpl extends ResourceImpl implements Ethernet {
	/**
	 * The default value of the '{@link #getTarget_dev() <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_dev()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_dev() <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_dev()
	 * @generated
	 * @ordered
	 */
	protected String target_dev = TARGET_DEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getScript_path() <em>Script path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript_path()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript_path() <em>Script path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript_path()
	 * @generated
	 * @ordered
	 */
	protected String script_path = SCRIPT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.ETHERNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget_dev() {
		return target_dev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_dev(String newTarget_dev) {
		String oldTarget_dev = target_dev;
		target_dev = newTarget_dev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.ETHERNET__TARGET_DEV, oldTarget_dev, target_dev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript_path() {
		return script_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript_path(String newScript_path) {
		String oldScript_path = script_path;
		script_path = newScript_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.ETHERNET__SCRIPT_PATH, oldScript_path, script_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.ETHERNET__TARGET_DEV:
				return getTarget_dev();
			case HypervisorPackage.ETHERNET__SCRIPT_PATH:
				return getScript_path();
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
			case HypervisorPackage.ETHERNET__TARGET_DEV:
				setTarget_dev((String)newValue);
				return;
			case HypervisorPackage.ETHERNET__SCRIPT_PATH:
				setScript_path((String)newValue);
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
			case HypervisorPackage.ETHERNET__TARGET_DEV:
				setTarget_dev(TARGET_DEV_EDEFAULT);
				return;
			case HypervisorPackage.ETHERNET__SCRIPT_PATH:
				setScript_path(SCRIPT_PATH_EDEFAULT);
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
			case HypervisorPackage.ETHERNET__TARGET_DEV:
				return TARGET_DEV_EDEFAULT == null ? target_dev != null : !TARGET_DEV_EDEFAULT.equals(target_dev);
			case HypervisorPackage.ETHERNET__SCRIPT_PATH:
				return SCRIPT_PATH_EDEFAULT == null ? script_path != null : !SCRIPT_PATH_EDEFAULT.equals(script_path);
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
		result.append(" (target_dev: ");
		result.append(target_dev);
		result.append(", script_path: ");
		result.append(script_path);
		result.append(')');
		return result.toString();
	}

} //EthernetImpl
