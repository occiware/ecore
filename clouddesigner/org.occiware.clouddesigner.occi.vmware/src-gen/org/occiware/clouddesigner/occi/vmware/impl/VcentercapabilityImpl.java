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

import org.occiware.clouddesigner.occi.vmware.Vcentercapability;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vcentercapability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl#isMultiHostSupported <em>Multi Host Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl#isProvisioningSupported <em>Provisioning Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl#isUserShellAccessSupported <em>User Shell Access Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl#getEVCModeVendor <em>EVC Mode Vendor</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VcentercapabilityImpl#getEVCModeVendorTier <em>EVC Mode Vendor Tier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VcentercapabilityImpl extends ResourceImpl implements Vcentercapability {
	/**
	 * The default value of the '{@link #isMultiHostSupported() <em>Multi Host Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHostSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_HOST_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiHostSupported() <em>Multi Host Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiHostSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean multiHostSupported = MULTI_HOST_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvisioningSupported() <em>Provisioning Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvisioningSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVISIONING_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvisioningSupported() <em>Provisioning Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvisioningSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean provisioningSupported = PROVISIONING_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserShellAccessSupported() <em>User Shell Access Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserShellAccessSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_SHELL_ACCESS_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserShellAccessSupported() <em>User Shell Access Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserShellAccessSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean userShellAccessSupported = USER_SHELL_ACCESS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEVCModeVendor() <em>EVC Mode Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVCModeVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String EVC_MODE_VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEVCModeVendor() <em>EVC Mode Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVCModeVendor()
	 * @generated
	 * @ordered
	 */
	protected String evcModeVendor = EVC_MODE_VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEVCModeVendorTier() <em>EVC Mode Vendor Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVCModeVendorTier()
	 * @generated
	 * @ordered
	 */
	protected static final int EVC_MODE_VENDOR_TIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEVCModeVendorTier() <em>EVC Mode Vendor Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVCModeVendorTier()
	 * @generated
	 * @ordered
	 */
	protected int evcModeVendorTier = EVC_MODE_VENDOR_TIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcentercapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getVcentercapability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiHostSupported() {
		return multiHostSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiHostSupported(boolean newMultiHostSupported) {
		boolean oldMultiHostSupported = multiHostSupported;
		multiHostSupported = newMultiHostSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VCENTERCAPABILITY__MULTI_HOST_SUPPORTED, oldMultiHostSupported, multiHostSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvisioningSupported() {
		return provisioningSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvisioningSupported(boolean newProvisioningSupported) {
		boolean oldProvisioningSupported = provisioningSupported;
		provisioningSupported = newProvisioningSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VCENTERCAPABILITY__PROVISIONING_SUPPORTED, oldProvisioningSupported, provisioningSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserShellAccessSupported() {
		return userShellAccessSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserShellAccessSupported(boolean newUserShellAccessSupported) {
		boolean oldUserShellAccessSupported = userShellAccessSupported;
		userShellAccessSupported = newUserShellAccessSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED, oldUserShellAccessSupported, userShellAccessSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEVCModeVendor() {
		return evcModeVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVCModeVendor(String newEVCModeVendor) {
		String oldEVCModeVendor = evcModeVendor;
		evcModeVendor = newEVCModeVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR, oldEVCModeVendor, evcModeVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEVCModeVendorTier() {
		return evcModeVendorTier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVCModeVendorTier(int newEVCModeVendorTier) {
		int oldEVCModeVendorTier = evcModeVendorTier;
		evcModeVendorTier = newEVCModeVendorTier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER, oldEVCModeVendorTier, evcModeVendorTier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.VCENTERCAPABILITY__MULTI_HOST_SUPPORTED:
				return isMultiHostSupported();
			case VmwarePackage.VCENTERCAPABILITY__PROVISIONING_SUPPORTED:
				return isProvisioningSupported();
			case VmwarePackage.VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED:
				return isUserShellAccessSupported();
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR:
				return getEVCModeVendor();
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER:
				return getEVCModeVendorTier();
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
			case VmwarePackage.VCENTERCAPABILITY__MULTI_HOST_SUPPORTED:
				setMultiHostSupported((Boolean)newValue);
				return;
			case VmwarePackage.VCENTERCAPABILITY__PROVISIONING_SUPPORTED:
				setProvisioningSupported((Boolean)newValue);
				return;
			case VmwarePackage.VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED:
				setUserShellAccessSupported((Boolean)newValue);
				return;
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR:
				setEVCModeVendor((String)newValue);
				return;
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER:
				setEVCModeVendorTier((Integer)newValue);
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
			case VmwarePackage.VCENTERCAPABILITY__MULTI_HOST_SUPPORTED:
				setMultiHostSupported(MULTI_HOST_SUPPORTED_EDEFAULT);
				return;
			case VmwarePackage.VCENTERCAPABILITY__PROVISIONING_SUPPORTED:
				setProvisioningSupported(PROVISIONING_SUPPORTED_EDEFAULT);
				return;
			case VmwarePackage.VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED:
				setUserShellAccessSupported(USER_SHELL_ACCESS_SUPPORTED_EDEFAULT);
				return;
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR:
				setEVCModeVendor(EVC_MODE_VENDOR_EDEFAULT);
				return;
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER:
				setEVCModeVendorTier(EVC_MODE_VENDOR_TIER_EDEFAULT);
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
			case VmwarePackage.VCENTERCAPABILITY__MULTI_HOST_SUPPORTED:
				return multiHostSupported != MULTI_HOST_SUPPORTED_EDEFAULT;
			case VmwarePackage.VCENTERCAPABILITY__PROVISIONING_SUPPORTED:
				return provisioningSupported != PROVISIONING_SUPPORTED_EDEFAULT;
			case VmwarePackage.VCENTERCAPABILITY__USER_SHELL_ACCESS_SUPPORTED:
				return userShellAccessSupported != USER_SHELL_ACCESS_SUPPORTED_EDEFAULT;
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR:
				return EVC_MODE_VENDOR_EDEFAULT == null ? evcModeVendor != null : !EVC_MODE_VENDOR_EDEFAULT.equals(evcModeVendor);
			case VmwarePackage.VCENTERCAPABILITY__EVC_MODE_VENDOR_TIER:
				return evcModeVendorTier != EVC_MODE_VENDOR_TIER_EDEFAULT;
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
		result.append(" (multiHostSupported: ");
		result.append(multiHostSupported);
		result.append(", provisioningSupported: ");
		result.append(provisioningSupported);
		result.append(", userShellAccessSupported: ");
		result.append(userShellAccessSupported);
		result.append(", EVCModeVendor: ");
		result.append(evcModeVendor);
		result.append(", EVCModeVendorTier: ");
		result.append(evcModeVendorTier);
		result.append(')');
		return result.toString();
	}

} //VcentercapabilityImpl
