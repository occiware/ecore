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
import org.occiware.clouddesigner.occi.docker.Machine_Grid5000;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Grid5000</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getSite <em>Site</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getWalltime <em>Walltime</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getSsh_private_key <em>Ssh private key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getSsh_public_key <em>Ssh public key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getResource_properties <em>Resource properties</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getUse_job_reservation <em>Use job reservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl#getHost_to_provision <em>Host to provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Grid5000Impl extends MachineImpl implements Machine_Grid5000 {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSite() <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected String site = SITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWalltime() <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalltime()
	 * @generated
	 * @ordered
	 */
	protected static final String WALLTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWalltime() <em>Walltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalltime()
	 * @generated
	 * @ordered
	 */
	protected String walltime = WALLTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_private_key() <em>Ssh private key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_private_key()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsh_private_key() <em>Ssh private key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_private_key()
	 * @generated
	 * @ordered
	 */
	protected String ssh_private_key = SSH_PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_public_key() <em>Ssh public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_public_key()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsh_public_key() <em>Ssh public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_public_key()
	 * @generated
	 * @ordered
	 */
	protected String ssh_public_key = SSH_PUBLIC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource_properties() <em>Resource properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_properties()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource_properties() <em>Resource properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_properties()
	 * @generated
	 * @ordered
	 */
	protected String resource_properties = RESOURCE_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUse_job_reservation() <em>Use job reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse_job_reservation()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_JOB_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse_job_reservation() <em>Use job reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse_job_reservation()
	 * @generated
	 * @ordered
	 */
	protected String use_job_reservation = USE_JOB_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost_to_provision() <em>Host to provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_to_provision()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_TO_PROVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost_to_provision() <em>Host to provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_to_provision()
	 * @generated
	 * @ordered
	 */
	protected String host_to_provision = HOST_TO_PROVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Grid5000Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_GRID5000;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(String newSite) {
		String oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWalltime() {
		return walltime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalltime(String newWalltime) {
		String oldWalltime = walltime;
		walltime = newWalltime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__WALLTIME, oldWalltime, walltime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_private_key() {
		return ssh_private_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_private_key(String newSsh_private_key) {
		String oldSsh_private_key = ssh_private_key;
		ssh_private_key = newSsh_private_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY, oldSsh_private_key, ssh_private_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_public_key() {
		return ssh_public_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_public_key(String newSsh_public_key) {
		String oldSsh_public_key = ssh_public_key;
		ssh_public_key = newSsh_public_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY, oldSsh_public_key, ssh_public_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource_properties() {
		return resource_properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_properties(String newResource_properties) {
		String oldResource_properties = resource_properties;
		resource_properties = newResource_properties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES, oldResource_properties, resource_properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUse_job_reservation() {
		return use_job_reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse_job_reservation(String newUse_job_reservation) {
		String oldUse_job_reservation = use_job_reservation;
		use_job_reservation = newUse_job_reservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION, oldUse_job_reservation, use_job_reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost_to_provision() {
		return host_to_provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost_to_provision(String newHost_to_provision) {
		String oldHost_to_provision = host_to_provision;
		host_to_provision = newHost_to_provision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION, oldHost_to_provision, host_to_provision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_GRID5000__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_GRID5000__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINE_GRID5000__SITE:
				return getSite();
			case DockerPackage.MACHINE_GRID5000__WALLTIME:
				return getWalltime();
			case DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY:
				return getSsh_private_key();
			case DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY:
				return getSsh_public_key();
			case DockerPackage.MACHINE_GRID5000__IMAGE:
				return getImage();
			case DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES:
				return getResource_properties();
			case DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION:
				return getUse_job_reservation();
			case DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION:
				return getHost_to_provision();
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
			case DockerPackage.MACHINE_GRID5000__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__SITE:
				setSite((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__WALLTIME:
				setWalltime((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY:
				setSsh_private_key((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY:
				setSsh_public_key((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES:
				setResource_properties((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION:
				setUse_job_reservation((String)newValue);
				return;
			case DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION:
				setHost_to_provision((String)newValue);
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
			case DockerPackage.MACHINE_GRID5000__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__SITE:
				setSite(SITE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__WALLTIME:
				setWalltime(WALLTIME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY:
				setSsh_private_key(SSH_PRIVATE_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY:
				setSsh_public_key(SSH_PUBLIC_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES:
				setResource_properties(RESOURCE_PROPERTIES_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION:
				setUse_job_reservation(USE_JOB_RESERVATION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION:
				setHost_to_provision(HOST_TO_PROVISION_EDEFAULT);
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
			case DockerPackage.MACHINE_GRID5000__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_GRID5000__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINE_GRID5000__SITE:
				return SITE_EDEFAULT == null ? site != null : !SITE_EDEFAULT.equals(site);
			case DockerPackage.MACHINE_GRID5000__WALLTIME:
				return WALLTIME_EDEFAULT == null ? walltime != null : !WALLTIME_EDEFAULT.equals(walltime);
			case DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY:
				return SSH_PRIVATE_KEY_EDEFAULT == null ? ssh_private_key != null : !SSH_PRIVATE_KEY_EDEFAULT.equals(ssh_private_key);
			case DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY:
				return SSH_PUBLIC_KEY_EDEFAULT == null ? ssh_public_key != null : !SSH_PUBLIC_KEY_EDEFAULT.equals(ssh_public_key);
			case DockerPackage.MACHINE_GRID5000__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES:
				return RESOURCE_PROPERTIES_EDEFAULT == null ? resource_properties != null : !RESOURCE_PROPERTIES_EDEFAULT.equals(resource_properties);
			case DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION:
				return USE_JOB_RESERVATION_EDEFAULT == null ? use_job_reservation != null : !USE_JOB_RESERVATION_EDEFAULT.equals(use_job_reservation);
			case DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION:
				return HOST_TO_PROVISION_EDEFAULT == null ? host_to_provision != null : !HOST_TO_PROVISION_EDEFAULT.equals(host_to_provision);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", site: ");
		result.append(site);
		result.append(", walltime: ");
		result.append(walltime);
		result.append(", ssh_private_key: ");
		result.append(ssh_private_key);
		result.append(", ssh_public_key: ");
		result.append(ssh_public_key);
		result.append(", image: ");
		result.append(image);
		result.append(", resource_properties: ");
		result.append(resource_properties);
		result.append(", use_job_reservation: ");
		result.append(use_job_reservation);
		result.append(", host_to_provision: ");
		result.append(host_to_provision);
		result.append(')');
		return result.toString();
	}

} //Machine_Grid5000Impl
