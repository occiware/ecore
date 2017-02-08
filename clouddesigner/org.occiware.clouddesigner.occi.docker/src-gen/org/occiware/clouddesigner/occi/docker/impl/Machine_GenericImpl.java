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
import org.occiware.clouddesigner.occi.docker.Machine_Generic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Generic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl#getEngine_port <em>Engine port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl#getIp_address <em>Ip address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl#getSsh_key <em>Ssh key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl#getSsh_port <em>Ssh port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_GenericImpl extends MachineImpl implements Machine_Generic {
	/**
	 * The default value of the '{@link #getEngine_port() <em>Engine port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_port()
	 * @generated
	 * @ordered
	 */
	protected static final int ENGINE_PORT_EDEFAULT = 2376;

	/**
	 * The cached value of the '{@link #getEngine_port() <em>Engine port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_port()
	 * @generated
	 * @ordered
	 */
	protected int engine_port = ENGINE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp_address() <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_address()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp_address() <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_address()
	 * @generated
	 * @ordered
	 */
	protected String ip_address = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_key() <em>Ssh key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_key()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsh_key() <em>Ssh key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_key()
	 * @generated
	 * @ordered
	 */
	protected String ssh_key = SSH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "root";

	/**
	 * The cached value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected String ssh_user = SSH_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected static final int SSH_PORT_EDEFAULT = 22;

	/**
	 * The cached value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected int ssh_port = SSH_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_GenericImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_GENERIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEngine_port() {
		return engine_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_port(int newEngine_port) {
		int oldEngine_port = engine_port;
		engine_port = newEngine_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GENERIC__ENGINE_PORT, oldEngine_port, engine_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp_address() {
		return ip_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_address(String newIp_address) {
		String oldIp_address = ip_address;
		ip_address = newIp_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GENERIC__IP_ADDRESS, oldIp_address, ip_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_key() {
		return ssh_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_key(String newSsh_key) {
		String oldSsh_key = ssh_key;
		ssh_key = newSsh_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GENERIC__SSH_KEY, oldSsh_key, ssh_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_user() {
		return ssh_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_user(String newSsh_user) {
		String oldSsh_user = ssh_user;
		ssh_user = newSsh_user;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GENERIC__SSH_USER, oldSsh_user, ssh_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSsh_port() {
		return ssh_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_port(int newSsh_port) {
		int oldSsh_port = ssh_port;
		ssh_port = newSsh_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GENERIC__SSH_PORT, oldSsh_port, ssh_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_GENERIC__ENGINE_PORT:
				return getEngine_port();
			case DockerPackage.MACHINE_GENERIC__IP_ADDRESS:
				return getIp_address();
			case DockerPackage.MACHINE_GENERIC__SSH_KEY:
				return getSsh_key();
			case DockerPackage.MACHINE_GENERIC__SSH_USER:
				return getSsh_user();
			case DockerPackage.MACHINE_GENERIC__SSH_PORT:
				return getSsh_port();
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
			case DockerPackage.MACHINE_GENERIC__ENGINE_PORT:
				setEngine_port((Integer)newValue);
				return;
			case DockerPackage.MACHINE_GENERIC__IP_ADDRESS:
				setIp_address((String)newValue);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_KEY:
				setSsh_key((String)newValue);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_USER:
				setSsh_user((String)newValue);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_PORT:
				setSsh_port((Integer)newValue);
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
			case DockerPackage.MACHINE_GENERIC__ENGINE_PORT:
				setEngine_port(ENGINE_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GENERIC__IP_ADDRESS:
				setIp_address(IP_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_KEY:
				setSsh_key(SSH_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_USER:
				setSsh_user(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GENERIC__SSH_PORT:
				setSsh_port(SSH_PORT_EDEFAULT);
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
			case DockerPackage.MACHINE_GENERIC__ENGINE_PORT:
				return engine_port != ENGINE_PORT_EDEFAULT;
			case DockerPackage.MACHINE_GENERIC__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ip_address != null : !IP_ADDRESS_EDEFAULT.equals(ip_address);
			case DockerPackage.MACHINE_GENERIC__SSH_KEY:
				return SSH_KEY_EDEFAULT == null ? ssh_key != null : !SSH_KEY_EDEFAULT.equals(ssh_key);
			case DockerPackage.MACHINE_GENERIC__SSH_USER:
				return SSH_USER_EDEFAULT == null ? ssh_user != null : !SSH_USER_EDEFAULT.equals(ssh_user);
			case DockerPackage.MACHINE_GENERIC__SSH_PORT:
				return ssh_port != SSH_PORT_EDEFAULT;
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
		result.append(" (engine_port: ");
		result.append(engine_port);
		result.append(", ip_address: ");
		result.append(ip_address);
		result.append(", ssh_key: ");
		result.append(ssh_key);
		result.append(", ssh_user: ");
		result.append(ssh_user);
		result.append(", ssh_port: ");
		result.append(ssh_port);
		result.append(')');
		return result.toString();
	}

} //Machine_GenericImpl
