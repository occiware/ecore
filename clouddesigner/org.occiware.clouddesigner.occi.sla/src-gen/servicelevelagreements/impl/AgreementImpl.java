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
package servicelevelagreements.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import servicelevelagreements.Agreement;
import servicelevelagreements.AgreementStatus;
import servicelevelagreements.ServicelevelagreementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link servicelevelagreements.impl.AgreementImpl#getState <em>State</em>}</li>
 *   <li>{@link servicelevelagreements.impl.AgreementImpl#getAgreedAt <em>Agreed At</em>}</li>
 *   <li>{@link servicelevelagreements.impl.AgreementImpl#getEffectiveFrom <em>Effective From</em>}</li>
 *   <li>{@link servicelevelagreements.impl.AgreementImpl#getEffectiveUntil <em>Effective Until</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementImpl extends ResourceImpl implements Agreement {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementStatus STATE_EDEFAULT = AgreementStatus.PENDING;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected AgreementStatus state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreedAt() <em>Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreedAt() <em>Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreedAt()
	 * @generated
	 * @ordered
	 */
	protected String agreedAt = AGREED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveFrom() <em>Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveFrom() <em>Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveFrom()
	 * @generated
	 * @ordered
	 */
	protected String effectiveFrom = EFFECTIVE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveUntil() <em>Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveUntil()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveUntil() <em>Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveUntil()
	 * @generated
	 * @ordered
	 */
	protected String effectiveUntil = EFFECTIVE_UNTIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelagreementsPackage.Literals.AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatus getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(AgreementStatus newState) {
		AgreementStatus oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicelevelagreementsPackage.AGREEMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreedAt() {
		return agreedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreedAt(String newAgreedAt) {
		String oldAgreedAt = agreedAt;
		agreedAt = newAgreedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicelevelagreementsPackage.AGREEMENT__AGREED_AT, oldAgreedAt, agreedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveFrom() {
		return effectiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveFrom(String newEffectiveFrom) {
		String oldEffectiveFrom = effectiveFrom;
		effectiveFrom = newEffectiveFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_FROM, oldEffectiveFrom, effectiveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveUntil() {
		return effectiveUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveUntil(String newEffectiveUntil) {
		String oldEffectiveUntil = effectiveUntil;
		effectiveUntil = newEffectiveUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_UNTIL, oldEffectiveUntil, effectiveUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resume() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminate() {
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
			case ServicelevelagreementsPackage.AGREEMENT__STATE:
				return getState();
			case ServicelevelagreementsPackage.AGREEMENT__AGREED_AT:
				return getAgreedAt();
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_FROM:
				return getEffectiveFrom();
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_UNTIL:
				return getEffectiveUntil();
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
			case ServicelevelagreementsPackage.AGREEMENT__STATE:
				setState((AgreementStatus)newValue);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__AGREED_AT:
				setAgreedAt((String)newValue);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_FROM:
				setEffectiveFrom((String)newValue);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_UNTIL:
				setEffectiveUntil((String)newValue);
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
			case ServicelevelagreementsPackage.AGREEMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__AGREED_AT:
				setAgreedAt(AGREED_AT_EDEFAULT);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_FROM:
				setEffectiveFrom(EFFECTIVE_FROM_EDEFAULT);
				return;
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_UNTIL:
				setEffectiveUntil(EFFECTIVE_UNTIL_EDEFAULT);
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
			case ServicelevelagreementsPackage.AGREEMENT__STATE:
				return state != STATE_EDEFAULT;
			case ServicelevelagreementsPackage.AGREEMENT__AGREED_AT:
				return AGREED_AT_EDEFAULT == null ? agreedAt != null : !AGREED_AT_EDEFAULT.equals(agreedAt);
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_FROM:
				return EFFECTIVE_FROM_EDEFAULT == null ? effectiveFrom != null : !EFFECTIVE_FROM_EDEFAULT.equals(effectiveFrom);
			case ServicelevelagreementsPackage.AGREEMENT__EFFECTIVE_UNTIL:
				return EFFECTIVE_UNTIL_EDEFAULT == null ? effectiveUntil != null : !EFFECTIVE_UNTIL_EDEFAULT.equals(effectiveUntil);
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
			case ServicelevelagreementsPackage.AGREEMENT___ACCEPT:
				accept();
				return null;
			case ServicelevelagreementsPackage.AGREEMENT___REJECT:
				reject();
				return null;
			case ServicelevelagreementsPackage.AGREEMENT___SUSPEND:
				suspend();
				return null;
			case ServicelevelagreementsPackage.AGREEMENT___RESUME:
				resume();
				return null;
			case ServicelevelagreementsPackage.AGREEMENT___TERMINATE:
				terminate();
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
		result.append(" (state: ");
		result.append(state);
		result.append(", agreedAt: ");
		result.append(agreedAt);
		result.append(", effectiveFrom: ");
		result.append(effectiveFrom);
		result.append(", effectiveUntil: ");
		result.append(effectiveUntil);
		result.append(')');
		return result.toString();
	}

} //AgreementImpl
