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

import org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl;

import org.occiware.clouddesigner.occi.vmware.OverallStatus;
import org.occiware.clouddesigner.occi.vmware.Vm;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getInstanceUUID <em>Instance UUID</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getCoresPerSocket <em>Cores Per Socket</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getGuestState <em>Guest State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#isVmwareToolsInstalled <em>Vmware Tools Installed</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#isVmwareToolsRunning <em>Vmware Tools Running</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getGuestFullName <em>Guest Full Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#isCpuhotAddEnabled <em>Cpuhot Add Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#isCpuHotRemoveEnabled <em>Cpu Hot Remove Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getVmwarePowerState <em>Vmware Power State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VmImpl#getOverallStatus <em>Overall Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmImpl extends ComputeImpl implements Vm {
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
	 * The default value of the '{@link #getInstanceUUID() <em>Instance UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceUUID() <em>Instance UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceUUID()
	 * @generated
	 * @ordered
	 */
	protected String instanceUUID = INSTANCE_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected boolean template = TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPUS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected int vcpus = VCPUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoresPerSocket() <em>Cores Per Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoresPerSocket()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_PER_SOCKET_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCoresPerSocket() <em>Cores Per Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoresPerSocket()
	 * @generated
	 * @ordered
	 */
	protected int coresPerSocket = CORES_PER_SOCKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestState() <em>Guest State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestState()
	 * @generated
	 * @ordered
	 */
	protected static final String GUEST_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestState() <em>Guest State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestState()
	 * @generated
	 * @ordered
	 */
	protected String guestState = GUEST_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVmwareToolsInstalled() <em>Vmware Tools Installed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmwareToolsInstalled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VMWARE_TOOLS_INSTALLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVmwareToolsInstalled() <em>Vmware Tools Installed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmwareToolsInstalled()
	 * @generated
	 * @ordered
	 */
	protected boolean vmwareToolsInstalled = VMWARE_TOOLS_INSTALLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isVmwareToolsRunning() <em>Vmware Tools Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmwareToolsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VMWARE_TOOLS_RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVmwareToolsRunning() <em>Vmware Tools Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmwareToolsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean vmwareToolsRunning = VMWARE_TOOLS_RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestFullName() <em>Guest Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String GUEST_FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestFullName() <em>Guest Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestFullName()
	 * @generated
	 * @ordered
	 */
	protected String guestFullName = GUEST_FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isCpuhotAddEnabled() <em>Cpuhot Add Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCpuhotAddEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CPUHOT_ADD_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCpuhotAddEnabled() <em>Cpuhot Add Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCpuhotAddEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean cpuhotAddEnabled = CPUHOT_ADD_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCpuHotRemoveEnabled() <em>Cpu Hot Remove Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCpuHotRemoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CPU_HOT_REMOVE_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCpuHotRemoveEnabled() <em>Cpu Hot Remove Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCpuHotRemoveEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean cpuHotRemoveEnabled = CPU_HOT_REMOVE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmwarePowerState() <em>Vmware Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmwarePowerState()
	 * @generated
	 * @ordered
	 */
	protected static final String VMWARE_POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmwarePowerState() <em>Vmware Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmwarePowerState()
	 * @generated
	 * @ordered
	 */
	protected String vmwarePowerState = VMWARE_POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallStatus() <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OverallStatus OVERALL_STATUS_EDEFAULT = OverallStatus.GRAY;

	/**
	 * The cached value of the '{@link #getOverallStatus() <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallStatus()
	 * @generated
	 * @ordered
	 */
	protected OverallStatus overallStatus = OVERALL_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getVm();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceUUID() {
		return instanceUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceUUID(String newInstanceUUID) {
		String oldInstanceUUID = instanceUUID;
		instanceUUID = newInstanceUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__INSTANCE_UUID, oldInstanceUUID, instanceUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(boolean newTemplate) {
		boolean oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpus() {
		return vcpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpus(int newVcpus) {
		int oldVcpus = vcpus;
		vcpus = newVcpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__VCPUS, oldVcpus, vcpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoresPerSocket() {
		return coresPerSocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoresPerSocket(int newCoresPerSocket) {
		int oldCoresPerSocket = coresPerSocket;
		coresPerSocket = newCoresPerSocket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__CORES_PER_SOCKET, oldCoresPerSocket, coresPerSocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestState() {
		return guestState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestState(String newGuestState) {
		String oldGuestState = guestState;
		guestState = newGuestState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__GUEST_STATE, oldGuestState, guestState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVmwareToolsInstalled() {
		return vmwareToolsInstalled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmwareToolsInstalled(boolean newVmwareToolsInstalled) {
		boolean oldVmwareToolsInstalled = vmwareToolsInstalled;
		vmwareToolsInstalled = newVmwareToolsInstalled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__VMWARE_TOOLS_INSTALLED, oldVmwareToolsInstalled, vmwareToolsInstalled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVmwareToolsRunning() {
		return vmwareToolsRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmwareToolsRunning(boolean newVmwareToolsRunning) {
		boolean oldVmwareToolsRunning = vmwareToolsRunning;
		vmwareToolsRunning = newVmwareToolsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__VMWARE_TOOLS_RUNNING, oldVmwareToolsRunning, vmwareToolsRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestFullName() {
		return guestFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestFullName(String newGuestFullName) {
		String oldGuestFullName = guestFullName;
		guestFullName = newGuestFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__GUEST_FULL_NAME, oldGuestFullName, guestFullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCpuhotAddEnabled() {
		return cpuhotAddEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuhotAddEnabled(boolean newCpuhotAddEnabled) {
		boolean oldCpuhotAddEnabled = cpuhotAddEnabled;
		cpuhotAddEnabled = newCpuhotAddEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__CPUHOT_ADD_ENABLED, oldCpuhotAddEnabled, cpuhotAddEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCpuHotRemoveEnabled() {
		return cpuHotRemoveEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuHotRemoveEnabled(boolean newCpuHotRemoveEnabled) {
		boolean oldCpuHotRemoveEnabled = cpuHotRemoveEnabled;
		cpuHotRemoveEnabled = newCpuHotRemoveEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__CPU_HOT_REMOVE_ENABLED, oldCpuHotRemoveEnabled, cpuHotRemoveEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmwarePowerState() {
		return vmwarePowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmwarePowerState(String newVmwarePowerState) {
		String oldVmwarePowerState = vmwarePowerState;
		vmwarePowerState = newVmwarePowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__VMWARE_POWER_STATE, oldVmwarePowerState, vmwarePowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallStatus getOverallStatus() {
		return overallStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallStatus(OverallStatus newOverallStatus) {
		OverallStatus oldOverallStatus = overallStatus;
		overallStatus = newOverallStatus == null ? OVERALL_STATUS_EDEFAULT : newOverallStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VM__OVERALL_STATUS, oldOverallStatus, overallStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cloneVM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mountVmwareToolsdisk() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markAsTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markAsVirtualMachine() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerVM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unregisterVM() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void defragmentAllDisks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetLocationId() {
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
			case VmwarePackage.VM__NAME:
				return getName();
			case VmwarePackage.VM__INSTANCE_UUID:
				return getInstanceUUID();
			case VmwarePackage.VM__TEMPLATE:
				return isTemplate();
			case VmwarePackage.VM__VCPUS:
				return getVcpus();
			case VmwarePackage.VM__CORES_PER_SOCKET:
				return getCoresPerSocket();
			case VmwarePackage.VM__GUEST_STATE:
				return getGuestState();
			case VmwarePackage.VM__VMWARE_TOOLS_INSTALLED:
				return isVmwareToolsInstalled();
			case VmwarePackage.VM__VMWARE_TOOLS_RUNNING:
				return isVmwareToolsRunning();
			case VmwarePackage.VM__GUEST_FULL_NAME:
				return getGuestFullName();
			case VmwarePackage.VM__CPUHOT_ADD_ENABLED:
				return isCpuhotAddEnabled();
			case VmwarePackage.VM__CPU_HOT_REMOVE_ENABLED:
				return isCpuHotRemoveEnabled();
			case VmwarePackage.VM__ANNOTATION:
				return getAnnotation();
			case VmwarePackage.VM__VMWARE_POWER_STATE:
				return getVmwarePowerState();
			case VmwarePackage.VM__OVERALL_STATUS:
				return getOverallStatus();
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
			case VmwarePackage.VM__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.VM__INSTANCE_UUID:
				setInstanceUUID((String)newValue);
				return;
			case VmwarePackage.VM__TEMPLATE:
				setTemplate((Boolean)newValue);
				return;
			case VmwarePackage.VM__VCPUS:
				setVcpus((Integer)newValue);
				return;
			case VmwarePackage.VM__CORES_PER_SOCKET:
				setCoresPerSocket((Integer)newValue);
				return;
			case VmwarePackage.VM__GUEST_STATE:
				setGuestState((String)newValue);
				return;
			case VmwarePackage.VM__VMWARE_TOOLS_INSTALLED:
				setVmwareToolsInstalled((Boolean)newValue);
				return;
			case VmwarePackage.VM__VMWARE_TOOLS_RUNNING:
				setVmwareToolsRunning((Boolean)newValue);
				return;
			case VmwarePackage.VM__GUEST_FULL_NAME:
				setGuestFullName((String)newValue);
				return;
			case VmwarePackage.VM__CPUHOT_ADD_ENABLED:
				setCpuhotAddEnabled((Boolean)newValue);
				return;
			case VmwarePackage.VM__CPU_HOT_REMOVE_ENABLED:
				setCpuHotRemoveEnabled((Boolean)newValue);
				return;
			case VmwarePackage.VM__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case VmwarePackage.VM__VMWARE_POWER_STATE:
				setVmwarePowerState((String)newValue);
				return;
			case VmwarePackage.VM__OVERALL_STATUS:
				setOverallStatus((OverallStatus)newValue);
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
			case VmwarePackage.VM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.VM__INSTANCE_UUID:
				setInstanceUUID(INSTANCE_UUID_EDEFAULT);
				return;
			case VmwarePackage.VM__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case VmwarePackage.VM__VCPUS:
				setVcpus(VCPUS_EDEFAULT);
				return;
			case VmwarePackage.VM__CORES_PER_SOCKET:
				setCoresPerSocket(CORES_PER_SOCKET_EDEFAULT);
				return;
			case VmwarePackage.VM__GUEST_STATE:
				setGuestState(GUEST_STATE_EDEFAULT);
				return;
			case VmwarePackage.VM__VMWARE_TOOLS_INSTALLED:
				setVmwareToolsInstalled(VMWARE_TOOLS_INSTALLED_EDEFAULT);
				return;
			case VmwarePackage.VM__VMWARE_TOOLS_RUNNING:
				setVmwareToolsRunning(VMWARE_TOOLS_RUNNING_EDEFAULT);
				return;
			case VmwarePackage.VM__GUEST_FULL_NAME:
				setGuestFullName(GUEST_FULL_NAME_EDEFAULT);
				return;
			case VmwarePackage.VM__CPUHOT_ADD_ENABLED:
				setCpuhotAddEnabled(CPUHOT_ADD_ENABLED_EDEFAULT);
				return;
			case VmwarePackage.VM__CPU_HOT_REMOVE_ENABLED:
				setCpuHotRemoveEnabled(CPU_HOT_REMOVE_ENABLED_EDEFAULT);
				return;
			case VmwarePackage.VM__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case VmwarePackage.VM__VMWARE_POWER_STATE:
				setVmwarePowerState(VMWARE_POWER_STATE_EDEFAULT);
				return;
			case VmwarePackage.VM__OVERALL_STATUS:
				setOverallStatus(OVERALL_STATUS_EDEFAULT);
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
			case VmwarePackage.VM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.VM__INSTANCE_UUID:
				return INSTANCE_UUID_EDEFAULT == null ? instanceUUID != null : !INSTANCE_UUID_EDEFAULT.equals(instanceUUID);
			case VmwarePackage.VM__TEMPLATE:
				return template != TEMPLATE_EDEFAULT;
			case VmwarePackage.VM__VCPUS:
				return vcpus != VCPUS_EDEFAULT;
			case VmwarePackage.VM__CORES_PER_SOCKET:
				return coresPerSocket != CORES_PER_SOCKET_EDEFAULT;
			case VmwarePackage.VM__GUEST_STATE:
				return GUEST_STATE_EDEFAULT == null ? guestState != null : !GUEST_STATE_EDEFAULT.equals(guestState);
			case VmwarePackage.VM__VMWARE_TOOLS_INSTALLED:
				return vmwareToolsInstalled != VMWARE_TOOLS_INSTALLED_EDEFAULT;
			case VmwarePackage.VM__VMWARE_TOOLS_RUNNING:
				return vmwareToolsRunning != VMWARE_TOOLS_RUNNING_EDEFAULT;
			case VmwarePackage.VM__GUEST_FULL_NAME:
				return GUEST_FULL_NAME_EDEFAULT == null ? guestFullName != null : !GUEST_FULL_NAME_EDEFAULT.equals(guestFullName);
			case VmwarePackage.VM__CPUHOT_ADD_ENABLED:
				return cpuhotAddEnabled != CPUHOT_ADD_ENABLED_EDEFAULT;
			case VmwarePackage.VM__CPU_HOT_REMOVE_ENABLED:
				return cpuHotRemoveEnabled != CPU_HOT_REMOVE_ENABLED_EDEFAULT;
			case VmwarePackage.VM__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case VmwarePackage.VM__VMWARE_POWER_STATE:
				return VMWARE_POWER_STATE_EDEFAULT == null ? vmwarePowerState != null : !VMWARE_POWER_STATE_EDEFAULT.equals(vmwarePowerState);
			case VmwarePackage.VM__OVERALL_STATUS:
				return overallStatus != OVERALL_STATUS_EDEFAULT;
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
			case VmwarePackage.VM___CLONE_VM:
				cloneVM();
				return null;
			case VmwarePackage.VM___MOUNT_VMWARE_TOOLSDISK:
				mountVmwareToolsdisk();
				return null;
			case VmwarePackage.VM___MARK_AS_TEMPLATE:
				markAsTemplate();
				return null;
			case VmwarePackage.VM___MARK_AS_VIRTUAL_MACHINE:
				markAsVirtualMachine();
				return null;
			case VmwarePackage.VM___REGISTER_VM:
				registerVM();
				return null;
			case VmwarePackage.VM___UNREGISTER_VM:
				unregisterVM();
				return null;
			case VmwarePackage.VM___DEFRAGMENT_ALL_DISKS:
				defragmentAllDisks();
				return null;
			case VmwarePackage.VM___RESET_LOCATION_ID:
				resetLocationId();
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
		result.append(", instanceUUID: ");
		result.append(instanceUUID);
		result.append(", template: ");
		result.append(template);
		result.append(", vcpus: ");
		result.append(vcpus);
		result.append(", coresPerSocket: ");
		result.append(coresPerSocket);
		result.append(", guestState: ");
		result.append(guestState);
		result.append(", vmwareToolsInstalled: ");
		result.append(vmwareToolsInstalled);
		result.append(", vmwareToolsRunning: ");
		result.append(vmwareToolsRunning);
		result.append(", guestFullName: ");
		result.append(guestFullName);
		result.append(", cpuhotAddEnabled: ");
		result.append(cpuhotAddEnabled);
		result.append(", cpuHotRemoveEnabled: ");
		result.append(cpuHotRemoveEnabled);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(", vmwarePowerState: ");
		result.append(vmwarePowerState);
		result.append(", overallStatus: ");
		result.append(overallStatus);
		result.append(')');
		return result.toString();
	}

} //VmImpl
