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
import org.occiware.clouddesigner.occi.docker.Machine_Exoscale;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Exoscale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getApi_secret_key <em>Api secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getInstance_profile <em>Instance profile</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_ExoscaleImpl#getAffinity_group <em>Affinity group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_ExoscaleImpl extends MachineImpl implements Machine_Exoscale {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = "https://api.exoscale.ch/compute";

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected String api_key = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi_secret_key() <em>Api secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_secret_key()
	 * @generated
	 * @ordered
	 */
	protected static final String API_SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_secret_key() <em>Api secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_secret_key()
	 * @generated
	 * @ordered
	 */
	protected String api_secret_key = API_SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstance_profile() <em>Instance profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_profile()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_PROFILE_EDEFAULT = "small";

	/**
	 * The cached value of the '{@link #getInstance_profile() <em>Instance profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_profile()
	 * @generated
	 * @ordered
	 */
	protected String instance_profile = INSTANCE_PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = "ubuntu-16.04";

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
	 * The default value of the '{@link #getSecurity_group() <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity_group() <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group()
	 * @generated
	 * @ordered
	 */
	protected String security_group = SECURITY_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected String availability_zone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "ubuntu";

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
	 * The default value of the '{@link #getUserdata() <em>Userdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserdata()
	 * @generated
	 * @ordered
	 */
	protected static final String USERDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserdata() <em>Userdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserdata()
	 * @generated
	 * @ordered
	 */
	protected String userdata = USERDATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAffinity_group() <em>Affinity group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity_group()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFINITY_GROUP_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getAffinity_group() <em>Affinity group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity_group()
	 * @generated
	 * @ordered
	 */
	protected String affinity_group = AFFINITY_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_ExoscaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_EXOSCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_key() {
		return api_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_key(String newApi_key) {
		String oldApi_key = api_key;
		api_key = newApi_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__API_KEY, oldApi_key, api_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_secret_key() {
		return api_secret_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_secret_key(String newApi_secret_key) {
		String oldApi_secret_key = api_secret_key;
		api_secret_key = newApi_secret_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__API_SECRET_KEY, oldApi_secret_key, api_secret_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance_profile() {
		return instance_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_profile(String newInstance_profile) {
		String oldInstance_profile = instance_profile;
		instance_profile = newInstance_profile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__INSTANCE_PROFILE, oldInstance_profile, instance_profile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity_group() {
		return security_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity_group(String newSecurity_group) {
		String oldSecurity_group = security_group;
		security_group = newSecurity_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__SECURITY_GROUP, oldSecurity_group, security_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability_zone() {
		return availability_zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability_zone(String newAvailability_zone) {
		String oldAvailability_zone = availability_zone;
		availability_zone = newAvailability_zone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__AVAILABILITY_ZONE, oldAvailability_zone, availability_zone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__SSH_USER, oldSsh_user, ssh_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserdata() {
		return userdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserdata(String newUserdata) {
		String oldUserdata = userdata;
		userdata = newUserdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__USERDATA, oldUserdata, userdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffinity_group() {
		return affinity_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity_group(String newAffinity_group) {
		String oldAffinity_group = affinity_group;
		affinity_group = newAffinity_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_EXOSCALE__AFFINITY_GROUP, oldAffinity_group, affinity_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_EXOSCALE__URL:
				return getUrl();
			case DockerPackage.MACHINE_EXOSCALE__API_KEY:
				return getApi_key();
			case DockerPackage.MACHINE_EXOSCALE__API_SECRET_KEY:
				return getApi_secret_key();
			case DockerPackage.MACHINE_EXOSCALE__INSTANCE_PROFILE:
				return getInstance_profile();
			case DockerPackage.MACHINE_EXOSCALE__IMAGE:
				return getImage();
			case DockerPackage.MACHINE_EXOSCALE__SECURITY_GROUP:
				return getSecurity_group();
			case DockerPackage.MACHINE_EXOSCALE__AVAILABILITY_ZONE:
				return getAvailability_zone();
			case DockerPackage.MACHINE_EXOSCALE__SSH_USER:
				return getSsh_user();
			case DockerPackage.MACHINE_EXOSCALE__USERDATA:
				return getUserdata();
			case DockerPackage.MACHINE_EXOSCALE__AFFINITY_GROUP:
				return getAffinity_group();
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
			case DockerPackage.MACHINE_EXOSCALE__URL:
				setUrl((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__API_KEY:
				setApi_key((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__API_SECRET_KEY:
				setApi_secret_key((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__INSTANCE_PROFILE:
				setInstance_profile((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__SECURITY_GROUP:
				setSecurity_group((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__AVAILABILITY_ZONE:
				setAvailability_zone((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__SSH_USER:
				setSsh_user((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__USERDATA:
				setUserdata((String)newValue);
				return;
			case DockerPackage.MACHINE_EXOSCALE__AFFINITY_GROUP:
				setAffinity_group((String)newValue);
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
			case DockerPackage.MACHINE_EXOSCALE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__API_KEY:
				setApi_key(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__API_SECRET_KEY:
				setApi_secret_key(API_SECRET_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__INSTANCE_PROFILE:
				setInstance_profile(INSTANCE_PROFILE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__SECURITY_GROUP:
				setSecurity_group(SECURITY_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__AVAILABILITY_ZONE:
				setAvailability_zone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__SSH_USER:
				setSsh_user(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__USERDATA:
				setUserdata(USERDATA_EDEFAULT);
				return;
			case DockerPackage.MACHINE_EXOSCALE__AFFINITY_GROUP:
				setAffinity_group(AFFINITY_GROUP_EDEFAULT);
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
			case DockerPackage.MACHINE_EXOSCALE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DockerPackage.MACHINE_EXOSCALE__API_KEY:
				return API_KEY_EDEFAULT == null ? api_key != null : !API_KEY_EDEFAULT.equals(api_key);
			case DockerPackage.MACHINE_EXOSCALE__API_SECRET_KEY:
				return API_SECRET_KEY_EDEFAULT == null ? api_secret_key != null : !API_SECRET_KEY_EDEFAULT.equals(api_secret_key);
			case DockerPackage.MACHINE_EXOSCALE__INSTANCE_PROFILE:
				return INSTANCE_PROFILE_EDEFAULT == null ? instance_profile != null : !INSTANCE_PROFILE_EDEFAULT.equals(instance_profile);
			case DockerPackage.MACHINE_EXOSCALE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINE_EXOSCALE__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? security_group != null : !SECURITY_GROUP_EDEFAULT.equals(security_group);
			case DockerPackage.MACHINE_EXOSCALE__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availability_zone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availability_zone);
			case DockerPackage.MACHINE_EXOSCALE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? ssh_user != null : !SSH_USER_EDEFAULT.equals(ssh_user);
			case DockerPackage.MACHINE_EXOSCALE__USERDATA:
				return USERDATA_EDEFAULT == null ? userdata != null : !USERDATA_EDEFAULT.equals(userdata);
			case DockerPackage.MACHINE_EXOSCALE__AFFINITY_GROUP:
				return AFFINITY_GROUP_EDEFAULT == null ? affinity_group != null : !AFFINITY_GROUP_EDEFAULT.equals(affinity_group);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", api_key: ");
		result.append(api_key);
		result.append(", api_secret_key: ");
		result.append(api_secret_key);
		result.append(", instance_profile: ");
		result.append(instance_profile);
		result.append(", image: ");
		result.append(image);
		result.append(", security_group: ");
		result.append(security_group);
		result.append(", availability_zone: ");
		result.append(availability_zone);
		result.append(", ssh_user: ");
		result.append(ssh_user);
		result.append(", userdata: ");
		result.append(userdata);
		result.append(", affinity_group: ");
		result.append(affinity_group);
		result.append(')');
		return result.toString();
	}

} //Machine_ExoscaleImpl
