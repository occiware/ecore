/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.cloud.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getFlavor_name <em>Flavor name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getNetwork_name <em>Network name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getFloating_ip_pool <em>Floating ip pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getImage_name <em>Image name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getKeypair <em>Keypair</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_OpenStackImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_OpenStackImpl extends MachineImpl implements Machine_OpenStack {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;

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
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected String image_id = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavor_name() <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavor_name() <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_name()
	 * @generated
	 * @ordered
	 */
	protected String flavor_name = FLAVOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected String flavor_id = FLAVOR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getNetwork_name() <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_name() <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_name()
	 * @generated
	 * @ordered
	 */
	protected String network_name = NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected String network_id = NETWORK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloating_ip_pool() <em>Floating ip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip_pool()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_IP_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloating_ip_pool() <em>Floating ip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip_pool()
	 * @generated
	 * @ordered
	 */
	protected String floating_ip_pool = FLOATING_IP_POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected String image_name = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypair() <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPAIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypair() <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair()
	 * @generated
	 * @ordered
	 */
	protected String keypair = KEYPAIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_OpenStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.MACHINE_OPEN_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__TENANT, oldTenant, tenant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_id() {
		return image_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_id(String newImage_id) {
		String oldImage_id = image_id;
		image_id = newImage_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID, oldImage_id, image_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor_name() {
		return flavor_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor_name(String newFlavor_name) {
		String oldFlavor_name = flavor_name;
		flavor_name = newFlavor_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME, oldFlavor_name, flavor_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor_id() {
		return flavor_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor_id(String newFlavor_id) {
		String oldFlavor_id = flavor_id;
		flavor_id = newFlavor_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID, oldFlavor_id, flavor_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP, oldSecurity_group, security_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_name() {
		return network_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_name(String newNetwork_name) {
		String oldNetwork_name = network_name;
		network_name = newNetwork_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME, oldNetwork_name, network_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_id() {
		return network_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_id(String newNetwork_id) {
		String oldNetwork_id = network_id;
		network_id = newNetwork_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloating_ip_pool() {
		return floating_ip_pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating_ip_pool(String newFloating_ip_pool) {
		String oldFloating_ip_pool = floating_ip_pool;
		floating_ip_pool = newFloating_ip_pool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL, oldFloating_ip_pool, floating_ip_pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_name() {
		return image_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_name(String newImage_name) {
		String oldImage_name = image_name;
		image_name = newImage_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME, oldImage_name, image_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeypair() {
		return keypair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeypair(String newKeypair) {
		String oldKeypair = keypair;
		keypair = newKeypair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__KEYPAIR, oldKeypair, keypair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_OPEN_STACK__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.MACHINE_OPEN_STACK__PROVIDER:
				return getProvider();
			case CloudPackage.MACHINE_OPEN_STACK__TENANT:
				return getTenant();
			case CloudPackage.MACHINE_OPEN_STACK__USERNAME:
				return getUsername();
			case CloudPackage.MACHINE_OPEN_STACK__PASSWORD:
				return getPassword();
			case CloudPackage.MACHINE_OPEN_STACK__ENDPOINT:
				return getEndpoint();
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return getImage_id();
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				return getFlavor_name();
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return getFlavor_id();
			case CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP:
				return getSecurity_group();
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME:
				return getNetwork_name();
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID:
				return getNetwork_id();
			case CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL:
				return getFloating_ip_pool();
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				return getImage_name();
			case CloudPackage.MACHINE_OPEN_STACK__KEYPAIR:
				return getKeypair();
			case CloudPackage.MACHINE_OPEN_STACK__REGION:
				return getRegion();
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
			case CloudPackage.MACHINE_OPEN_STACK__PROVIDER:
				setProvider((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__TENANT:
				setTenant((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				setFlavor_name((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP:
				setSecurity_group((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME:
				setNetwork_name((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID:
				setNetwork_id((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL:
				setFloating_ip_pool((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				setImage_name((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__KEYPAIR:
				setKeypair((String)newValue);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__REGION:
				setRegion((String)newValue);
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
			case CloudPackage.MACHINE_OPEN_STACK__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id(IMAGE_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				setFlavor_name(FLAVOR_NAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id(FLAVOR_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP:
				setSecurity_group(SECURITY_GROUP_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME:
				setNetwork_name(NETWORK_NAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID:
				setNetwork_id(NETWORK_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL:
				setFloating_ip_pool(FLOATING_IP_POOL_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				setImage_name(IMAGE_NAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__KEYPAIR:
				setKeypair(KEYPAIR_EDEFAULT);
				return;
			case CloudPackage.MACHINE_OPEN_STACK__REGION:
				setRegion(REGION_EDEFAULT);
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
			case CloudPackage.MACHINE_OPEN_STACK__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CloudPackage.MACHINE_OPEN_STACK__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case CloudPackage.MACHINE_OPEN_STACK__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CloudPackage.MACHINE_OPEN_STACK__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CloudPackage.MACHINE_OPEN_STACK__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? image_id != null : !IMAGE_ID_EDEFAULT.equals(image_id);
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				return FLAVOR_NAME_EDEFAULT == null ? flavor_name != null : !FLAVOR_NAME_EDEFAULT.equals(flavor_name);
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavor_id != null : !FLAVOR_ID_EDEFAULT.equals(flavor_id);
			case CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? security_group != null : !SECURITY_GROUP_EDEFAULT.equals(security_group);
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? network_name != null : !NETWORK_NAME_EDEFAULT.equals(network_name);
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? network_id != null : !NETWORK_ID_EDEFAULT.equals(network_id);
			case CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL:
				return FLOATING_IP_POOL_EDEFAULT == null ? floating_ip_pool != null : !FLOATING_IP_POOL_EDEFAULT.equals(floating_ip_pool);
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? image_name != null : !IMAGE_NAME_EDEFAULT.equals(image_name);
			case CloudPackage.MACHINE_OPEN_STACK__KEYPAIR:
				return KEYPAIR_EDEFAULT == null ? keypair != null : !KEYPAIR_EDEFAULT.equals(keypair);
			case CloudPackage.MACHINE_OPEN_STACK__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", flavor_name: ");
		result.append(flavor_name);
		result.append(", flavor_id: ");
		result.append(flavor_id);
		result.append(", security_group: ");
		result.append(security_group);
		result.append(", network_name: ");
		result.append(network_name);
		result.append(", network_id: ");
		result.append(network_id);
		result.append(", floating_ip_pool: ");
		result.append(floating_ip_pool);
		result.append(", image_name: ");
		result.append(image_name);
		result.append(", keypair: ");
		result.append(keypair);
		result.append(", region: ");
		result.append(region);
		result.append(')');
		return result.toString();
	}

} //Machine_OpenStackImpl
