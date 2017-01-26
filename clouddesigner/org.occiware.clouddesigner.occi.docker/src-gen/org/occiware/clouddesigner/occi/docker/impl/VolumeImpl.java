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
import org.occiware.clouddesigner.occi.docker.Volume;

import org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getRw <em>Rw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends StorageImpl implements Volume {
	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = "local";

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected String labels = LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected String options = OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRw() <em>Rw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRw()
	 * @generated
	 * @ordered
	 */
	protected static final String RW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRw() <em>Rw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRw()
	 * @generated
	 * @ordered
	 */
	protected String rw = RW_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPAGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected String propagation = PROPAGATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabels(String newLabels) {
		String oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__LABELS, oldLabels, labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(String newOptions) {
		String oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRw() {
		return rw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRw(String newRw) {
		String oldRw = rw;
		rw = newRw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__RW, oldRw, rw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagation(String newPropagation) {
		String oldPropagation = propagation;
		propagation = newPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__PROPAGATION, oldPropagation, propagation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.VOLUME__DRIVER:
				return getDriver();
			case DockerPackage.VOLUME__LABELS:
				return getLabels();
			case DockerPackage.VOLUME__OPTIONS:
				return getOptions();
			case DockerPackage.VOLUME__SOURCE:
				return getSource();
			case DockerPackage.VOLUME__DESTINATION:
				return getDestination();
			case DockerPackage.VOLUME__MODE:
				return getMode();
			case DockerPackage.VOLUME__RW:
				return getRw();
			case DockerPackage.VOLUME__PROPAGATION:
				return getPropagation();
			case DockerPackage.VOLUME__NAME:
				return getName();
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
			case DockerPackage.VOLUME__DRIVER:
				setDriver((String)newValue);
				return;
			case DockerPackage.VOLUME__LABELS:
				setLabels((String)newValue);
				return;
			case DockerPackage.VOLUME__OPTIONS:
				setOptions((String)newValue);
				return;
			case DockerPackage.VOLUME__SOURCE:
				setSource((String)newValue);
				return;
			case DockerPackage.VOLUME__DESTINATION:
				setDestination((String)newValue);
				return;
			case DockerPackage.VOLUME__MODE:
				setMode((String)newValue);
				return;
			case DockerPackage.VOLUME__RW:
				setRw((String)newValue);
				return;
			case DockerPackage.VOLUME__PROPAGATION:
				setPropagation((String)newValue);
				return;
			case DockerPackage.VOLUME__NAME:
				setName((String)newValue);
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
			case DockerPackage.VOLUME__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case DockerPackage.VOLUME__LABELS:
				setLabels(LABELS_EDEFAULT);
				return;
			case DockerPackage.VOLUME__OPTIONS:
				setOptions(OPTIONS_EDEFAULT);
				return;
			case DockerPackage.VOLUME__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case DockerPackage.VOLUME__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case DockerPackage.VOLUME__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case DockerPackage.VOLUME__RW:
				setRw(RW_EDEFAULT);
				return;
			case DockerPackage.VOLUME__PROPAGATION:
				setPropagation(PROPAGATION_EDEFAULT);
				return;
			case DockerPackage.VOLUME__NAME:
				setName(NAME_EDEFAULT);
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
			case DockerPackage.VOLUME__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case DockerPackage.VOLUME__LABELS:
				return LABELS_EDEFAULT == null ? labels != null : !LABELS_EDEFAULT.equals(labels);
			case DockerPackage.VOLUME__OPTIONS:
				return OPTIONS_EDEFAULT == null ? options != null : !OPTIONS_EDEFAULT.equals(options);
			case DockerPackage.VOLUME__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case DockerPackage.VOLUME__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case DockerPackage.VOLUME__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case DockerPackage.VOLUME__RW:
				return RW_EDEFAULT == null ? rw != null : !RW_EDEFAULT.equals(rw);
			case DockerPackage.VOLUME__PROPAGATION:
				return PROPAGATION_EDEFAULT == null ? propagation != null : !PROPAGATION_EDEFAULT.equals(propagation);
			case DockerPackage.VOLUME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (driver: ");
		result.append(driver);
		result.append(", labels: ");
		result.append(labels);
		result.append(", options: ");
		result.append(options);
		result.append(", source: ");
		result.append(source);
		result.append(", destination: ");
		result.append(destination);
		result.append(", mode: ");
		result.append(mode);
		result.append(", rw: ");
		result.append(rw);
		result.append(", propagation: ");
		result.append(propagation);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
