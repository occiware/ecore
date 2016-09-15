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

import org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostfirewallsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostfirewallsystemImpl#isDefaultIncomingBlocked <em>Default Incoming Blocked</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostfirewallsystemImpl#isDefaultOutgoingBlocked <em>Default Outgoing Blocked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostfirewallsystemImpl extends ResourceImpl implements Hostfirewallsystem {
	/**
	 * The default value of the '{@link #isDefaultIncomingBlocked() <em>Default Incoming Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultIncomingBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_INCOMING_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultIncomingBlocked() <em>Default Incoming Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultIncomingBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultIncomingBlocked = DEFAULT_INCOMING_BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultOutgoingBlocked() <em>Default Outgoing Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultOutgoingBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_OUTGOING_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultOutgoingBlocked() <em>Default Outgoing Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultOutgoingBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultOutgoingBlocked = DEFAULT_OUTGOING_BLOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostfirewallsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHostfirewallsystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultIncomingBlocked() {
		return defaultIncomingBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIncomingBlocked(boolean newDefaultIncomingBlocked) {
		boolean oldDefaultIncomingBlocked = defaultIncomingBlocked;
		defaultIncomingBlocked = newDefaultIncomingBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED, oldDefaultIncomingBlocked, defaultIncomingBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultOutgoingBlocked() {
		return defaultOutgoingBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOutgoingBlocked(boolean newDefaultOutgoingBlocked) {
		boolean oldDefaultOutgoingBlocked = defaultOutgoingBlocked;
		defaultOutgoingBlocked = newDefaultOutgoingBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED, oldDefaultOutgoingBlocked, defaultOutgoingBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED:
				return isDefaultIncomingBlocked();
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED:
				return isDefaultOutgoingBlocked();
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
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED:
				setDefaultIncomingBlocked((Boolean)newValue);
				return;
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED:
				setDefaultOutgoingBlocked((Boolean)newValue);
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
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED:
				setDefaultIncomingBlocked(DEFAULT_INCOMING_BLOCKED_EDEFAULT);
				return;
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED:
				setDefaultOutgoingBlocked(DEFAULT_OUTGOING_BLOCKED_EDEFAULT);
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
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_INCOMING_BLOCKED:
				return defaultIncomingBlocked != DEFAULT_INCOMING_BLOCKED_EDEFAULT;
			case VmwarePackage.HOSTFIREWALLSYSTEM__DEFAULT_OUTGOING_BLOCKED:
				return defaultOutgoingBlocked != DEFAULT_OUTGOING_BLOCKED_EDEFAULT;
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
		result.append(" (defaultIncomingBlocked: ");
		result.append(defaultIncomingBlocked);
		result.append(", defaultOutgoingBlocked: ");
		result.append(defaultOutgoingBlocked);
		result.append(')');
		return result.toString();
	}

} //HostfirewallsystemImpl
