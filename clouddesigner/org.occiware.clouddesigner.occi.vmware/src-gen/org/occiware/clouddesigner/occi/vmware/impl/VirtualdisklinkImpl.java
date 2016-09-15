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

import org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl;

import org.occiware.clouddesigner.occi.vmware.Virtualdisklink;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtualdisklink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualdisklinkImpl#getVmdkFilePathOnDatastore <em>Vmdk File Path On Datastore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualdisklinkImpl extends StoragelinkImpl implements Virtualdisklink {
	/**
	 * The default value of the '{@link #getVmdkFilePathOnDatastore() <em>Vmdk File Path On Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmdkFilePathOnDatastore()
	 * @generated
	 * @ordered
	 */
	protected static final String VMDK_FILE_PATH_ON_DATASTORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmdkFilePathOnDatastore() <em>Vmdk File Path On Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmdkFilePathOnDatastore()
	 * @generated
	 * @ordered
	 */
	protected String vmdkFilePathOnDatastore = VMDK_FILE_PATH_ON_DATASTORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualdisklinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getVirtualdisklink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmdkFilePathOnDatastore() {
		return vmdkFilePathOnDatastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmdkFilePathOnDatastore(String newVmdkFilePathOnDatastore) {
		String oldVmdkFilePathOnDatastore = vmdkFilePathOnDatastore;
		vmdkFilePathOnDatastore = newVmdkFilePathOnDatastore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE, oldVmdkFilePathOnDatastore, vmdkFilePathOnDatastore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE:
				return getVmdkFilePathOnDatastore();
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
			case VmwarePackage.VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE:
				setVmdkFilePathOnDatastore((String)newValue);
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
			case VmwarePackage.VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE:
				setVmdkFilePathOnDatastore(VMDK_FILE_PATH_ON_DATASTORE_EDEFAULT);
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
			case VmwarePackage.VIRTUALDISKLINK__VMDK_FILE_PATH_ON_DATASTORE:
				return VMDK_FILE_PATH_ON_DATASTORE_EDEFAULT == null ? vmdkFilePathOnDatastore != null : !VMDK_FILE_PATH_ON_DATASTORE_EDEFAULT.equals(vmdkFilePathOnDatastore);
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
		result.append(" (vmdkFilePathOnDatastore: ");
		result.append(vmdkFilePathOnDatastore);
		result.append(')');
		return result.toString();
	}

} //VirtualdisklinkImpl
