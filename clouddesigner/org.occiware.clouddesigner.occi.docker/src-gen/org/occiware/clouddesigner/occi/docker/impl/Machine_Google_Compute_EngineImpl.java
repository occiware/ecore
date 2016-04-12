/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Google Compute Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl#getMachine_type <em>Machine type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl#getInstance_name <em>Instance name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Google_Compute_EngineImpl extends MachineImpl implements Machine_Google_Compute_Engine {
	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = "us-central1-a";

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMachine_type() <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine_type()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_TYPE_EDEFAULT = "f1-micro";

	/**
	 * The cached value of the '{@link #getMachine_type() <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine_type()
	 * @generated
	 * @ordered
	 */
	protected String machine_type = MACHINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = "docker-user";

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstance_name() <em>Instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_name()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getInstance_name() <em>Instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_name()
	 * @generated
	 * @ordered
	 */
	protected String instance_name = INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected String project = PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Google_Compute_EngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachine_type() {
		return machine_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine_type(String newMachine_type) {
		String oldMachine_type = machine_type;
		machine_type = newMachine_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE, oldMachine_type, machine_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance_name() {
		return instance_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_name(String newInstance_name) {
		String oldInstance_name = instance_name;
		instance_name = newInstance_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME, oldInstance_name, instance_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE:
				return getZone();
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE:
				return getMachine_type();
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME:
				return getInstance_name();
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT:
				return getProject();
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
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE:
				setZone((String)newValue);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE:
				setMachine_type((String)newValue);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME:
				setInstance_name((String)newValue);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT:
				setProject((String)newValue);
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
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE:
				setZone(ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE:
				setMachine_type(MACHINE_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME:
				setInstance_name(INSTANCE_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT:
				setProject(PROJECT_EDEFAULT);
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
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE:
				return MACHINE_TYPE_EDEFAULT == null ? machine_type != null : !MACHINE_TYPE_EDEFAULT.equals(machine_type);
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instance_name != null : !INSTANCE_NAME_EDEFAULT.equals(instance_name);
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
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
		result.append(" (zone: ");
		result.append(zone);
		result.append(", machine_type: ");
		result.append(machine_type);
		result.append(", username: ");
		result.append(username);
		result.append(", instance_name: ");
		result.append(instance_name);
		result.append(", project: ");
		result.append(project);
		result.append(')');
		return result.toString();
	}

} //Machine_Google_Compute_EngineImpl
