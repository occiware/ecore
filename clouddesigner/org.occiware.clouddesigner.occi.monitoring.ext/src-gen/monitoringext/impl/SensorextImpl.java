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
package monitoringext.impl;

import java.lang.reflect.InvocationTargetException;

import monitoringext.MonitorState;
import monitoringext.MonitoringextPackage;
import monitoringext.Sensorext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.monitoring.impl.SensorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensorext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link monitoringext.impl.SensorextImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link monitoringext.impl.SensorextImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link monitoringext.impl.SensorextImpl#getLoadavg <em>Loadavg</em>}</li>
 *   <li>{@link monitoringext.impl.SensorextImpl#getMonitorstate <em>Monitorstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorextImpl extends SensorImpl implements Sensorext {
	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected int cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected int ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadavg() <em>Loadavg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadavg()
	 * @generated
	 * @ordered
	 */
	protected static final float LOADAVG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadavg() <em>Loadavg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadavg()
	 * @generated
	 * @ordered
	 */
	protected float loadavg = LOADAVG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorstate() <em>Monitorstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorstate()
	 * @generated
	 * @ordered
	 */
	protected static final MonitorState MONITORSTATE_EDEFAULT = MonitorState.OFF;

	/**
	 * The cached value of the '{@link #getMonitorstate() <em>Monitorstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorstate()
	 * @generated
	 * @ordered
	 */
	protected MonitorState monitorstate = MONITORSTATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringextPackage.Literals.SENSOREXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(int newCpu) {
		int oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringextPackage.SENSOREXT__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(int newRam) {
		int oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringextPackage.SENSOREXT__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadavg() {
		return loadavg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadavg(float newLoadavg) {
		float oldLoadavg = loadavg;
		loadavg = newLoadavg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringextPackage.SENSOREXT__LOADAVG, oldLoadavg, loadavg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorState getMonitorstate() {
		return monitorstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorstate(MonitorState newMonitorstate) {
		MonitorState oldMonitorstate = monitorstate;
		monitorstate = newMonitorstate == null ? MONITORSTATE_EDEFAULT : newMonitorstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringextPackage.SENSOREXT__MONITORSTATE, oldMonitorstate, monitorstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startMonitoring() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stopMonitoring() {
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
			case MonitoringextPackage.SENSOREXT__CPU:
				return getCpu();
			case MonitoringextPackage.SENSOREXT__RAM:
				return getRam();
			case MonitoringextPackage.SENSOREXT__LOADAVG:
				return getLoadavg();
			case MonitoringextPackage.SENSOREXT__MONITORSTATE:
				return getMonitorstate();
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
			case MonitoringextPackage.SENSOREXT__CPU:
				setCpu((Integer)newValue);
				return;
			case MonitoringextPackage.SENSOREXT__RAM:
				setRam((Integer)newValue);
				return;
			case MonitoringextPackage.SENSOREXT__LOADAVG:
				setLoadavg((Float)newValue);
				return;
			case MonitoringextPackage.SENSOREXT__MONITORSTATE:
				setMonitorstate((MonitorState)newValue);
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
			case MonitoringextPackage.SENSOREXT__CPU:
				setCpu(CPU_EDEFAULT);
				return;
			case MonitoringextPackage.SENSOREXT__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case MonitoringextPackage.SENSOREXT__LOADAVG:
				setLoadavg(LOADAVG_EDEFAULT);
				return;
			case MonitoringextPackage.SENSOREXT__MONITORSTATE:
				setMonitorstate(MONITORSTATE_EDEFAULT);
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
			case MonitoringextPackage.SENSOREXT__CPU:
				return cpu != CPU_EDEFAULT;
			case MonitoringextPackage.SENSOREXT__RAM:
				return ram != RAM_EDEFAULT;
			case MonitoringextPackage.SENSOREXT__LOADAVG:
				return loadavg != LOADAVG_EDEFAULT;
			case MonitoringextPackage.SENSOREXT__MONITORSTATE:
				return monitorstate != MONITORSTATE_EDEFAULT;
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
			case MonitoringextPackage.SENSOREXT___START_MONITORING:
				startMonitoring();
				return null;
			case MonitoringextPackage.SENSOREXT___STOP_MONITORING:
				stopMonitoring();
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
		result.append(" (cpu: ");
		result.append(cpu);
		result.append(", ram: ");
		result.append(ram);
		result.append(", loadavg: ");
		result.append(loadavg);
		result.append(", monitorstate: ");
		result.append(monitorstate);
		result.append(')');
		return result.toString();
	}

} //SensorextImpl
