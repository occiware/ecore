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

import org.occiware.clouddesigner.occi.vmware.ResourcePoolState;
import org.occiware.clouddesigner.occi.vmware.Resourcepool;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resourcepool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl#isExpandablereservation <em>Expandablereservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.ResourcepoolImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcepoolImpl extends ResourceImpl implements Resourcepool {
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
	 * The default value of the '{@link #isExpandablereservation() <em>Expandablereservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandablereservation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDABLERESERVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpandablereservation() <em>Expandablereservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandablereservation()
	 * @generated
	 * @ordered
	 */
	protected boolean expandablereservation = EXPANDABLERESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected long limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected static final long RESERVATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected long reservation = RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ResourcePoolState STATE_EDEFAULT = ResourcePoolState.UNKNOWN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ResourcePoolState state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcepoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getResourcepool();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.RESOURCEPOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpandablereservation() {
		return expandablereservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandablereservation(boolean newExpandablereservation) {
		boolean oldExpandablereservation = expandablereservation;
		expandablereservation = newExpandablereservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.RESOURCEPOOL__EXPANDABLERESERVATION, oldExpandablereservation, expandablereservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(long newLimit) {
		long oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.RESOURCEPOOL__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(long newReservation) {
		long oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.RESOURCEPOOL__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePoolState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ResourcePoolState newState) {
		ResourcePoolState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.RESOURCEPOOL__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.RESOURCEPOOL__NAME:
				return getName();
			case VmwarePackage.RESOURCEPOOL__EXPANDABLERESERVATION:
				return isExpandablereservation();
			case VmwarePackage.RESOURCEPOOL__LIMIT:
				return getLimit();
			case VmwarePackage.RESOURCEPOOL__RESERVATION:
				return getReservation();
			case VmwarePackage.RESOURCEPOOL__STATE:
				return getState();
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
			case VmwarePackage.RESOURCEPOOL__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.RESOURCEPOOL__EXPANDABLERESERVATION:
				setExpandablereservation((Boolean)newValue);
				return;
			case VmwarePackage.RESOURCEPOOL__LIMIT:
				setLimit((Long)newValue);
				return;
			case VmwarePackage.RESOURCEPOOL__RESERVATION:
				setReservation((Long)newValue);
				return;
			case VmwarePackage.RESOURCEPOOL__STATE:
				setState((ResourcePoolState)newValue);
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
			case VmwarePackage.RESOURCEPOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.RESOURCEPOOL__EXPANDABLERESERVATION:
				setExpandablereservation(EXPANDABLERESERVATION_EDEFAULT);
				return;
			case VmwarePackage.RESOURCEPOOL__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case VmwarePackage.RESOURCEPOOL__RESERVATION:
				setReservation(RESERVATION_EDEFAULT);
				return;
			case VmwarePackage.RESOURCEPOOL__STATE:
				setState(STATE_EDEFAULT);
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
			case VmwarePackage.RESOURCEPOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.RESOURCEPOOL__EXPANDABLERESERVATION:
				return expandablereservation != EXPANDABLERESERVATION_EDEFAULT;
			case VmwarePackage.RESOURCEPOOL__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case VmwarePackage.RESOURCEPOOL__RESERVATION:
				return reservation != RESERVATION_EDEFAULT;
			case VmwarePackage.RESOURCEPOOL__STATE:
				return state != STATE_EDEFAULT;
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
		result.append(", expandablereservation: ");
		result.append(expandablereservation);
		result.append(", limit: ");
		result.append(limit);
		result.append(", reservation: ");
		result.append(reservation);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ResourcepoolImpl
