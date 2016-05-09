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
package org.occiware.clouddesigner.occi.infrastructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.infrastructure.Architecture;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.SaveMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getShare <em>Share</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeImpl extends ResourceImpl implements Compute {
	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final Architecture ARCHITECTURE_EDEFAULT = Architecture.X86;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected int cores = CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShare() <em>Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare()
	 * @generated
	 * @ordered
	 */
	protected static final int SHARE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShare() <em>Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare()
	 * @generated
	 * @ordered
	 */
	protected int share = SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected float speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final float MEMORY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected float memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ComputeStatus STATE_EDEFAULT = ComputeStatus.INACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ComputeStatus state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.COMPUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Architecture newArchitecture) {
		Architecture oldArchitecture = architecture;
		architecture = newArchitecture == null ? ARCHITECTURE_EDEFAULT : newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(int newCores) {
		int oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShare() {
		return share;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShare(int newShare) {
		int oldShare = share;
		share = newShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__SHARE, oldShare, share));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		float oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(float newMemory) {
		float oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeStatus getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ComputeStatus newState) {
		ComputeStatus oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop(StopMethod method) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void restart(RestartMethod method) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend(SuspendMethod method) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save(SaveMethod method, String name) {
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
			case InfrastructurePackage.COMPUTE__ARCHITECTURE:
				return getArchitecture();
			case InfrastructurePackage.COMPUTE__CORES:
				return getCores();
			case InfrastructurePackage.COMPUTE__HOSTNAME:
				return getHostname();
			case InfrastructurePackage.COMPUTE__SHARE:
				return getShare();
			case InfrastructurePackage.COMPUTE__SPEED:
				return getSpeed();
			case InfrastructurePackage.COMPUTE__MEMORY:
				return getMemory();
			case InfrastructurePackage.COMPUTE__STATE:
				return getState();
			case InfrastructurePackage.COMPUTE__MESSAGE:
				return getMessage();
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
			case InfrastructurePackage.COMPUTE__ARCHITECTURE:
				setArchitecture((Architecture)newValue);
				return;
			case InfrastructurePackage.COMPUTE__CORES:
				setCores((Integer)newValue);
				return;
			case InfrastructurePackage.COMPUTE__HOSTNAME:
				setHostname((String)newValue);
				return;
			case InfrastructurePackage.COMPUTE__SHARE:
				setShare((Integer)newValue);
				return;
			case InfrastructurePackage.COMPUTE__SPEED:
				setSpeed((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTE__MEMORY:
				setMemory((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTE__STATE:
				setState((ComputeStatus)newValue);
				return;
			case InfrastructurePackage.COMPUTE__MESSAGE:
				setMessage((String)newValue);
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
			case InfrastructurePackage.COMPUTE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__SHARE:
				setShare(SHARE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.COMPUTE__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case InfrastructurePackage.COMPUTE__CORES:
				return cores != CORES_EDEFAULT;
			case InfrastructurePackage.COMPUTE__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case InfrastructurePackage.COMPUTE__SHARE:
				return share != SHARE_EDEFAULT;
			case InfrastructurePackage.COMPUTE__SPEED:
				return speed != SPEED_EDEFAULT;
			case InfrastructurePackage.COMPUTE__MEMORY:
				return memory != MEMORY_EDEFAULT;
			case InfrastructurePackage.COMPUTE__STATE:
				return state != STATE_EDEFAULT;
			case InfrastructurePackage.COMPUTE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
			case InfrastructurePackage.COMPUTE___START:
				start();
				return null;
			case InfrastructurePackage.COMPUTE___STOP__STOPMETHOD:
				stop((StopMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD:
				restart((RestartMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD:
				suspend((SuspendMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING:
				save((SaveMethod)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", cores: ");
		result.append(cores);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", share: ");
		result.append(share);
		result.append(", speed: ");
		result.append(speed);
		result.append(", memory: ");
		result.append(memory);
		result.append(", state: ");
		result.append(state);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //ComputeImpl
