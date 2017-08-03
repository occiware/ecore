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
package org.occiware.clouddesigner.occi.linkeddata.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.linkeddata.Ldproject;
import org.occiware.clouddesigner.occi.linkeddata.Lifecycle;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage;
import org.occiware.clouddesigner.occi.linkeddata.Robustness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ldproject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdprojectImpl#getRobustness <em>Robustness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LdprojectImpl extends ResourceImpl implements Ldproject {
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
	 * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected static final Lifecycle LIFECYCLE_EDEFAULT = Lifecycle.DRAFT;

	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected Lifecycle lifecycle = LIFECYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRobustness() <em>Robustness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobustness()
	 * @generated
	 * @ordered
	 */
	protected static final Robustness ROBUSTNESS_EDEFAULT = Robustness.CLUSTER;

	/**
	 * The cached value of the '{@link #getRobustness() <em>Robustness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobustness()
	 * @generated
	 * @ordered
	 */
	protected Robustness robustness = ROBUSTNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LdprojectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkeddataPackage.Literals.LDPROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDPROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle(Lifecycle newLifecycle) {
		Lifecycle oldLifecycle = lifecycle;
		lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDPROJECT__LIFECYCLE, oldLifecycle, lifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robustness getRobustness() {
		return robustness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobustness(Robustness newRobustness) {
		Robustness oldRobustness = robustness;
		robustness = newRobustness == null ? ROBUSTNESS_EDEFAULT : newRobustness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDPROJECT__ROBUSTNESS, oldRobustness, robustness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void publish() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unpublish() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
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
			case LinkeddataPackage.LDPROJECT__NAME:
				return getName();
			case LinkeddataPackage.LDPROJECT__LIFECYCLE:
				return getLifecycle();
			case LinkeddataPackage.LDPROJECT__ROBUSTNESS:
				return getRobustness();
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
			case LinkeddataPackage.LDPROJECT__NAME:
				setName((String)newValue);
				return;
			case LinkeddataPackage.LDPROJECT__LIFECYCLE:
				setLifecycle((Lifecycle)newValue);
				return;
			case LinkeddataPackage.LDPROJECT__ROBUSTNESS:
				setRobustness((Robustness)newValue);
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
			case LinkeddataPackage.LDPROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LinkeddataPackage.LDPROJECT__LIFECYCLE:
				setLifecycle(LIFECYCLE_EDEFAULT);
				return;
			case LinkeddataPackage.LDPROJECT__ROBUSTNESS:
				setRobustness(ROBUSTNESS_EDEFAULT);
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
			case LinkeddataPackage.LDPROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LinkeddataPackage.LDPROJECT__LIFECYCLE:
				return lifecycle != LIFECYCLE_EDEFAULT;
			case LinkeddataPackage.LDPROJECT__ROBUSTNESS:
				return robustness != ROBUSTNESS_EDEFAULT;
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
			case LinkeddataPackage.LDPROJECT___PUBLISH:
				publish();
				return null;
			case LinkeddataPackage.LDPROJECT___UNPUBLISH:
				unpublish();
				return null;
			case LinkeddataPackage.LDPROJECT___UPDATE:
				update();
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
		result.append(", lifecycle: ");
		result.append(lifecycle);
		result.append(", robustness: ");
		result.append(robustness);
		result.append(')');
		return result.toString();
	}

} //LdprojectImpl
