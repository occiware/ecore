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

import org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl;

import org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;
import org.occiware.clouddesigner.occi.vmware.Vswitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vswitch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl#getNbport <em>Nbport</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl#getBeaconInterval <em>Beacon Interval</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl#getMtu <em>Mtu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.VswitchImpl#getChangeOperation <em>Change Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VswitchImpl extends NetworkImpl implements Vswitch {
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
	 * The default value of the '{@link #getNbport() <em>Nbport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbport()
	 * @generated
	 * @ordered
	 */
	protected static final int NBPORT_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getNbport() <em>Nbport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbport()
	 * @generated
	 * @ordered
	 */
	protected int nbport = NBPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeaconInterval() <em>Beacon Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeaconInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int BEACON_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeaconInterval() <em>Beacon Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeaconInterval()
	 * @generated
	 * @ordered
	 */
	protected int beaconInterval = BEACON_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMtu() <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtu()
	 * @generated
	 * @ordered
	 */
	protected static final int MTU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMtu() <em>Mtu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMtu()
	 * @generated
	 * @ordered
	 */
	protected int mtu = MTU_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeOperation() <em>Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeOperation()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkChangeOperation CHANGE_OPERATION_EDEFAULT = NetworkChangeOperation.ADD;

	/**
	 * The cached value of the '{@link #getChangeOperation() <em>Change Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeOperation()
	 * @generated
	 * @ordered
	 */
	protected NetworkChangeOperation changeOperation = CHANGE_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VswitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getVswitch();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VSWITCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbport() {
		return nbport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbport(int newNbport) {
		int oldNbport = nbport;
		nbport = newNbport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VSWITCH__NBPORT, oldNbport, nbport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeaconInterval() {
		return beaconInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeaconInterval(int newBeaconInterval) {
		int oldBeaconInterval = beaconInterval;
		beaconInterval = newBeaconInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VSWITCH__BEACON_INTERVAL, oldBeaconInterval, beaconInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMtu() {
		return mtu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtu(int newMtu) {
		int oldMtu = mtu;
		mtu = newMtu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VSWITCH__MTU, oldMtu, mtu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkChangeOperation getChangeOperation() {
		return changeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeOperation(NetworkChangeOperation newChangeOperation) {
		NetworkChangeOperation oldChangeOperation = changeOperation;
		changeOperation = newChangeOperation == null ? CHANGE_OPERATION_EDEFAULT : newChangeOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VSWITCH__CHANGE_OPERATION, oldChangeOperation, changeOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.VSWITCH__NAME:
				return getName();
			case VmwarePackage.VSWITCH__NBPORT:
				return getNbport();
			case VmwarePackage.VSWITCH__BEACON_INTERVAL:
				return getBeaconInterval();
			case VmwarePackage.VSWITCH__MTU:
				return getMtu();
			case VmwarePackage.VSWITCH__CHANGE_OPERATION:
				return getChangeOperation();
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
			case VmwarePackage.VSWITCH__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.VSWITCH__NBPORT:
				setNbport((Integer)newValue);
				return;
			case VmwarePackage.VSWITCH__BEACON_INTERVAL:
				setBeaconInterval((Integer)newValue);
				return;
			case VmwarePackage.VSWITCH__MTU:
				setMtu((Integer)newValue);
				return;
			case VmwarePackage.VSWITCH__CHANGE_OPERATION:
				setChangeOperation((NetworkChangeOperation)newValue);
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
			case VmwarePackage.VSWITCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.VSWITCH__NBPORT:
				setNbport(NBPORT_EDEFAULT);
				return;
			case VmwarePackage.VSWITCH__BEACON_INTERVAL:
				setBeaconInterval(BEACON_INTERVAL_EDEFAULT);
				return;
			case VmwarePackage.VSWITCH__MTU:
				setMtu(MTU_EDEFAULT);
				return;
			case VmwarePackage.VSWITCH__CHANGE_OPERATION:
				setChangeOperation(CHANGE_OPERATION_EDEFAULT);
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
			case VmwarePackage.VSWITCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.VSWITCH__NBPORT:
				return nbport != NBPORT_EDEFAULT;
			case VmwarePackage.VSWITCH__BEACON_INTERVAL:
				return beaconInterval != BEACON_INTERVAL_EDEFAULT;
			case VmwarePackage.VSWITCH__MTU:
				return mtu != MTU_EDEFAULT;
			case VmwarePackage.VSWITCH__CHANGE_OPERATION:
				return changeOperation != CHANGE_OPERATION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nbport: ");
		result.append(nbport);
		result.append(", beaconInterval: ");
		result.append(beaconInterval);
		result.append(", mtu: ");
		result.append(mtu);
		result.append(", changeOperation: ");
		result.append(changeOperation);
		result.append(')');
		return result.toString();
	}

} //VswitchImpl
