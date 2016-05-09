/**
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.monitoring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.LinkImpl;

import org.occiware.clouddesigner.occi.monitoring.Collector;
import org.occiware.clouddesigner.occi.monitoring.MonitoringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl#getGranularity <em>Granularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectorImpl extends LinkImpl implements Collector {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCURACY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected int accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final int GRANULARITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected int granularity = GRANULARITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.COLLECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(int newAccuracy) {
		int oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGranularity() {
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGranularity(int newGranularity) {
		int oldGranularity = granularity;
		granularity = newGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__GRANULARITY, oldGranularity, granularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.COLLECTOR__PERIOD:
				return getPeriod();
			case MonitoringPackage.COLLECTOR__ACCURACY:
				return getAccuracy();
			case MonitoringPackage.COLLECTOR__GRANULARITY:
				return getGranularity();
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
			case MonitoringPackage.COLLECTOR__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case MonitoringPackage.COLLECTOR__ACCURACY:
				setAccuracy((Integer)newValue);
				return;
			case MonitoringPackage.COLLECTOR__GRANULARITY:
				setGranularity((Integer)newValue);
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
			case MonitoringPackage.COLLECTOR__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case MonitoringPackage.COLLECTOR__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case MonitoringPackage.COLLECTOR__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
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
			case MonitoringPackage.COLLECTOR__PERIOD:
				return period != PERIOD_EDEFAULT;
			case MonitoringPackage.COLLECTOR__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
			case MonitoringPackage.COLLECTOR__GRANULARITY:
				return granularity != GRANULARITY_EDEFAULT;
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
		result.append(" (period: ");
		result.append(period);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(", granularity: ");
		result.append(granularity);
		result.append(')');
		return result.toString();
	}

} //CollectorImpl
