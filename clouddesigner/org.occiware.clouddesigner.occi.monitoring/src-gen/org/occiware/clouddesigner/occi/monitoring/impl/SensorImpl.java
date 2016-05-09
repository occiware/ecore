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

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.monitoring.MonitoringPackage;
import org.occiware.clouddesigner.occi.monitoring.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getTimebase <em>Timebase</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getTimestart <em>Timestart</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getTimestop <em>Timestop</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl#getAccuracy <em>Accuracy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ResourceImpl implements Sensor {
	/**
	 * The default value of the '{@link #getTimebase() <em>Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimebase()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimebase() <em>Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimebase()
	 * @generated
	 * @ordered
	 */
	protected String timebase = TIMEBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestart() <em>Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestart()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMESTART_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimestart() <em>Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestart()
	 * @generated
	 * @ordered
	 */
	protected int timestart = TIMESTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestop() <em>Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestop()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMESTOP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimestop() <em>Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestop()
	 * @generated
	 * @ordered
	 */
	protected int timestop = TIMESTOP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimebase() {
		return timebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimebase(String newTimebase) {
		String oldTimebase = timebase;
		timebase = newTimebase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__TIMEBASE, oldTimebase, timebase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimestart() {
		return timestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestart(int newTimestart) {
		int oldTimestart = timestart;
		timestart = newTimestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__TIMESTART, oldTimestart, timestart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimestop() {
		return timestop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestop(int newTimestop) {
		int oldTimestop = timestop;
		timestop = newTimestop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__TIMESTOP, oldTimestop, timestop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__PERIOD, oldPeriod, period));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__GRANULARITY, oldGranularity, granularity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.SENSOR__TIMEBASE:
				return getTimebase();
			case MonitoringPackage.SENSOR__TIMESTART:
				return getTimestart();
			case MonitoringPackage.SENSOR__TIMESTOP:
				return getTimestop();
			case MonitoringPackage.SENSOR__PERIOD:
				return getPeriod();
			case MonitoringPackage.SENSOR__GRANULARITY:
				return getGranularity();
			case MonitoringPackage.SENSOR__ACCURACY:
				return getAccuracy();
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
			case MonitoringPackage.SENSOR__TIMEBASE:
				setTimebase((String)newValue);
				return;
			case MonitoringPackage.SENSOR__TIMESTART:
				setTimestart((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__TIMESTOP:
				setTimestop((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__GRANULARITY:
				setGranularity((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__ACCURACY:
				setAccuracy((Integer)newValue);
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
			case MonitoringPackage.SENSOR__TIMEBASE:
				setTimebase(TIMEBASE_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__TIMESTART:
				setTimestart(TIMESTART_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__TIMESTOP:
				setTimestop(TIMESTOP_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__GRANULARITY:
				setGranularity(GRANULARITY_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
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
			case MonitoringPackage.SENSOR__TIMEBASE:
				return TIMEBASE_EDEFAULT == null ? timebase != null : !TIMEBASE_EDEFAULT.equals(timebase);
			case MonitoringPackage.SENSOR__TIMESTART:
				return timestart != TIMESTART_EDEFAULT;
			case MonitoringPackage.SENSOR__TIMESTOP:
				return timestop != TIMESTOP_EDEFAULT;
			case MonitoringPackage.SENSOR__PERIOD:
				return period != PERIOD_EDEFAULT;
			case MonitoringPackage.SENSOR__GRANULARITY:
				return granularity != GRANULARITY_EDEFAULT;
			case MonitoringPackage.SENSOR__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
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
		result.append(" (timebase: ");
		result.append(timebase);
		result.append(", timestart: ");
		result.append(timestart);
		result.append(", timestop: ");
		result.append(timestop);
		result.append(", period: ");
		result.append(period);
		result.append(", granularity: ");
		result.append(granularity);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
