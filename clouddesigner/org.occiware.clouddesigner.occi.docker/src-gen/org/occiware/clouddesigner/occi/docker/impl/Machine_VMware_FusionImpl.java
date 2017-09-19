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
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine VMware Fusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl#isNo_share <em>No share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_VMware_FusionImpl extends MachineImpl implements Machine_VMware_Fusion {
	/**
	 * The default value of the '{@link #getBoot2docker_url() <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_url()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2docker_url() <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_url()
	 * @generated
	 * @ordered
	 */
	protected String boot2docker_url = BOOT2DOCKER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_size() <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_size()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SIZE_EDEFAULT = 20000;

	/**
	 * The cached value of the '{@link #getDisk_size() <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_size()
	 * @generated
	 * @ordered
	 */
	protected int disk_size = DISK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_EDEFAULT = 1024;

	/**
	 * The cached value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected int memory_size = MEMORY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNo_share() <em>No share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_share()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SHARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNo_share() <em>No share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_share()
	 * @generated
	 * @ordered
	 */
	protected boolean no_share = NO_SHARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_VMware_FusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_VMWARE_FUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2docker_url() {
		return boot2docker_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2docker_url(String newBoot2docker_url) {
		String oldBoot2docker_url = boot2docker_url;
		boot2docker_url = newBoot2docker_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL, oldBoot2docker_url, boot2docker_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisk_size() {
		return disk_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_size(int newDisk_size) {
		int oldDisk_size = disk_size;
		disk_size = newDisk_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_FUSION__DISK_SIZE, oldDisk_size, disk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_size() {
		return memory_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_size(int newMemory_size) {
		int oldMemory_size = memory_size;
		memory_size = newMemory_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_FUSION__MEMORY_SIZE, oldMemory_size, memory_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNo_share() {
		return no_share;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_share(boolean newNo_share) {
		boolean oldNo_share = no_share;
		no_share = newNo_share;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_FUSION__NO_SHARE, oldNo_share, no_share));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL:
				return getBoot2docker_url();
			case DockerPackage.MACHINE_VMWARE_FUSION__DISK_SIZE:
				return getDisk_size();
			case DockerPackage.MACHINE_VMWARE_FUSION__MEMORY_SIZE:
				return getMemory_size();
			case DockerPackage.MACHINE_VMWARE_FUSION__NO_SHARE:
				return isNo_share();
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
			case DockerPackage.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL:
				setBoot2docker_url((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__DISK_SIZE:
				setDisk_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__MEMORY_SIZE:
				setMemory_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__NO_SHARE:
				setNo_share((Boolean)newValue);
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
			case DockerPackage.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL:
				setBoot2docker_url(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__DISK_SIZE:
				setDisk_size(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__MEMORY_SIZE:
				setMemory_size(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_FUSION__NO_SHARE:
				setNo_share(NO_SHARE_EDEFAULT);
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
			case DockerPackage.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2docker_url != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2docker_url);
			case DockerPackage.MACHINE_VMWARE_FUSION__DISK_SIZE:
				return disk_size != DISK_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_FUSION__MEMORY_SIZE:
				return memory_size != MEMORY_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_FUSION__NO_SHARE:
				return no_share != NO_SHARE_EDEFAULT;
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
		result.append(" (boot2docker_url: ");
		result.append(boot2docker_url);
		result.append(", disk_size: ");
		result.append(disk_size);
		result.append(", memory_size: ");
		result.append(memory_size);
		result.append(", no_share: ");
		result.append(no_share);
		result.append(')');
		return result.toString();
	}

} //Machine_VMware_FusionImpl
