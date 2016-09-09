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

import org.occiware.clouddesigner.occi.vmware.Virtualcdrom;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtualcdrom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VirtualcdromImpl#getIsoFilename <em>Iso Filename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualcdromImpl extends VirtualdiskImpl implements Virtualcdrom {
	/**
	 * The default value of the '{@link #getIsoFilename() <em>Iso Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO_FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsoFilename() <em>Iso Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoFilename()
	 * @generated
	 * @ordered
	 */
	protected String isoFilename = ISO_FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualcdromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getVirtualcdrom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsoFilename() {
		return isoFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsoFilename(String newIsoFilename) {
		String oldIsoFilename = isoFilename;
		isoFilename = newIsoFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VIRTUALCDROM__ISO_FILENAME, oldIsoFilename, isoFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.VIRTUALCDROM__ISO_FILENAME:
				return getIsoFilename();
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
			case VmwarePackage.VIRTUALCDROM__ISO_FILENAME:
				setIsoFilename((String)newValue);
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
			case VmwarePackage.VIRTUALCDROM__ISO_FILENAME:
				setIsoFilename(ISO_FILENAME_EDEFAULT);
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
			case VmwarePackage.VIRTUALCDROM__ISO_FILENAME:
				return ISO_FILENAME_EDEFAULT == null ? isoFilename != null : !ISO_FILENAME_EDEFAULT.equals(isoFilename);
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
		result.append(" (isoFilename: ");
		result.append(isoFilename);
		result.append(')');
		return result.toString();
	}

} //VirtualcdromImpl
