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

import org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl;

import org.occiware.clouddesigner.occi.vmware.Hoststorage;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoststorage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HoststorageImpl#getHostVolumeName <em>Host Volume Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoststorageImpl extends StorageImpl implements Hoststorage {
	/**
	 * The default value of the '{@link #getHostVolumeName() <em>Host Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVolumeName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_VOLUME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostVolumeName() <em>Host Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVolumeName()
	 * @generated
	 * @ordered
	 */
	protected String hostVolumeName = HOST_VOLUME_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoststorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHoststorage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostVolumeName() {
		return hostVolumeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostVolumeName(String newHostVolumeName) {
		String oldHostVolumeName = hostVolumeName;
		hostVolumeName = newHostVolumeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSTORAGE__HOST_VOLUME_NAME, oldHostVolumeName, hostVolumeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTSTORAGE__HOST_VOLUME_NAME:
				return getHostVolumeName();
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
			case VmwarePackage.HOSTSTORAGE__HOST_VOLUME_NAME:
				setHostVolumeName((String)newValue);
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
			case VmwarePackage.HOSTSTORAGE__HOST_VOLUME_NAME:
				setHostVolumeName(HOST_VOLUME_NAME_EDEFAULT);
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
			case VmwarePackage.HOSTSTORAGE__HOST_VOLUME_NAME:
				return HOST_VOLUME_NAME_EDEFAULT == null ? hostVolumeName != null : !HOST_VOLUME_NAME_EDEFAULT.equals(hostVolumeName);
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
		result.append(" (hostVolumeName: ");
		result.append(hostVolumeName);
		result.append(')');
		return result.toString();
	}

} //HoststorageImpl
