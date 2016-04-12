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

import org.occiware.clouddesigner.occi.hypervisor.FEATURES;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getOn_poweroff <em>On poweroff</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getOn_reboot <em>On reboot</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getOn_crash <em>On crash</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getMaximum_memory <em>Maximum memory</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getCurrent_memory <em>Current memory</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.impl.Machine_VirtualBoxImpl#getVcpu <em>Vcpu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_VirtualBoxImpl extends MachineImpl implements Machine_VirtualBox {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "hvm";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final FEATURES FEATURES_EDEFAULT = FEATURES.ACPI;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected FEATURES features = FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOn_poweroff() <em>On poweroff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_poweroff()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_POWEROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOn_poweroff() <em>On poweroff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_poweroff()
	 * @generated
	 * @ordered
	 */
	protected String on_poweroff = ON_POWEROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOn_reboot() <em>On reboot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_reboot()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_REBOOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOn_reboot() <em>On reboot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_reboot()
	 * @generated
	 * @ordered
	 */
	protected String on_reboot = ON_REBOOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOn_crash() <em>On crash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_crash()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CRASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOn_crash() <em>On crash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn_crash()
	 * @generated
	 * @ordered
	 */
	protected String on_crash = ON_CRASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_memory() <em>Maximum memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_memory()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_MEMORY_EDEFAULT = 256000;

	/**
	 * The cached value of the '{@link #getMaximum_memory() <em>Maximum memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_memory()
	 * @generated
	 * @ordered
	 */
	protected int maximum_memory = MAXIMUM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_memory() <em>Current memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_memory()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrent_memory() <em>Current memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_memory()
	 * @generated
	 * @ordered
	 */
	protected int current_memory = CURRENT_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPU_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected int vcpu = VCPU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_VirtualBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FEATURES getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(FEATURES newFeatures) {
		FEATURES oldFeatures = features;
		features = newFeatures == null ? FEATURES_EDEFAULT : newFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES, oldFeatures, features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOn_poweroff() {
		return on_poweroff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_poweroff(String newOn_poweroff) {
		String oldOn_poweroff = on_poweroff;
		on_poweroff = newOn_poweroff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF, oldOn_poweroff, on_poweroff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOn_reboot() {
		return on_reboot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_reboot(String newOn_reboot) {
		String oldOn_reboot = on_reboot;
		on_reboot = newOn_reboot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT, oldOn_reboot, on_reboot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOn_crash() {
		return on_crash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn_crash(String newOn_crash) {
		String oldOn_crash = on_crash;
		on_crash = newOn_crash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH, oldOn_crash, on_crash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximum_memory() {
		return maximum_memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum_memory(int newMaximum_memory) {
		int oldMaximum_memory = maximum_memory;
		maximum_memory = newMaximum_memory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY, oldMaximum_memory, maximum_memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrent_memory() {
		return current_memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_memory(int newCurrent_memory) {
		int oldCurrent_memory = current_memory;
		current_memory = newCurrent_memory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY, oldCurrent_memory, current_memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpu() {
		return vcpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpu(int newVcpu) {
		int oldVcpu = vcpu;
		vcpu = newVcpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU, oldVcpu, vcpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE:
				return getType();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES:
				return getFeatures();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF:
				return getOn_poweroff();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT:
				return getOn_reboot();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH:
				return getOn_crash();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY:
				return getMaximum_memory();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY:
				return getCurrent_memory();
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU:
				return getVcpu();
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
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE:
				setType((String)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES:
				setFeatures((FEATURES)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF:
				setOn_poweroff((String)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT:
				setOn_reboot((String)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH:
				setOn_crash((String)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY:
				setMaximum_memory((Integer)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY:
				setCurrent_memory((Integer)newValue);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU:
				setVcpu((Integer)newValue);
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
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES:
				setFeatures(FEATURES_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF:
				setOn_poweroff(ON_POWEROFF_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT:
				setOn_reboot(ON_REBOOT_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH:
				setOn_crash(ON_CRASH_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY:
				setMaximum_memory(MAXIMUM_MEMORY_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY:
				setCurrent_memory(CURRENT_MEMORY_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU:
				setVcpu(VCPU_EDEFAULT);
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
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES:
				return features != FEATURES_EDEFAULT;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF:
				return ON_POWEROFF_EDEFAULT == null ? on_poweroff != null : !ON_POWEROFF_EDEFAULT.equals(on_poweroff);
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT:
				return ON_REBOOT_EDEFAULT == null ? on_reboot != null : !ON_REBOOT_EDEFAULT.equals(on_reboot);
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH:
				return ON_CRASH_EDEFAULT == null ? on_crash != null : !ON_CRASH_EDEFAULT.equals(on_crash);
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY:
				return maximum_memory != MAXIMUM_MEMORY_EDEFAULT;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY:
				return current_memory != CURRENT_MEMORY_EDEFAULT;
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU:
				return vcpu != VCPU_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", features: ");
		result.append(features);
		result.append(", on_poweroff: ");
		result.append(on_poweroff);
		result.append(", on_reboot: ");
		result.append(on_reboot);
		result.append(", on_crash: ");
		result.append(on_crash);
		result.append(", maximum_memory: ");
		result.append(maximum_memory);
		result.append(", current_memory: ");
		result.append(current_memory);
		result.append(", vcpu: ");
		result.append(vcpu);
		result.append(')');
		return result.toString();
	}

} //Machine_VirtualBoxImpl
