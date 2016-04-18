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
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Hp Helion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getKey_pair <em>Key pair</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Hp_HelionImpl#getFloating_ip <em>Floating ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Hp_HelionImpl extends MachineImpl implements Machine_Hp_Helion {
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
	 * The default value of the '{@link #getAccess_key() <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_key()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess_key() <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_key()
	 * @generated
	 * @ordered
	 */
	protected String access_key = ACCESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecret_key() <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_key()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecret_key() <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_key()
	 * @generated
	 * @ordered
	 */
	protected String secret_key = SECRET_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = null;

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
	 * The default value of the '{@link #getKey_pair() <em>Key pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_pair()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PAIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey_pair() <em>Key pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey_pair()
	 * @generated
	 * @ordered
	 */
	protected String key_pair = KEY_PAIR_EDEFAULT;

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
	 * The default value of the '{@link #getFloating_ip() <em>Floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloating_ip() <em>Floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip()
	 * @generated
	 * @ordered
	 */
	protected String floating_ip = FLOATING_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Hp_HelionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.MACHINE_HP_HELION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess_key() {
		return access_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_key(String newAccess_key) {
		String oldAccess_key = access_key;
		access_key = newAccess_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__ACCESS_KEY, oldAccess_key, access_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecret_key() {
		return secret_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecret_key(String newSecret_key) {
		String oldSecret_key = secret_key;
		secret_key = newSecret_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__SECRET_KEY, oldSecret_key, secret_key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__IMAGE, oldImage, image));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__ZONE, oldZone, zone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__FLAVOR_ID, oldFlavor_id, flavor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey_pair() {
		return key_pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey_pair(String newKey_pair) {
		String oldKey_pair = key_pair;
		key_pair = newKey_pair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__KEY_PAIR, oldKey_pair, key_pair));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP, oldSecurity_group, security_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloating_ip() {
		return floating_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating_ip(String newFloating_ip) {
		String oldFloating_ip = floating_ip;
		floating_ip = newFloating_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_HP_HELION__FLOATING_IP, oldFloating_ip, floating_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.MACHINE_HP_HELION__PROVIDER:
				return getProvider();
			case CloudPackage.MACHINE_HP_HELION__TENANT:
				return getTenant();
			case CloudPackage.MACHINE_HP_HELION__ACCESS_KEY:
				return getAccess_key();
			case CloudPackage.MACHINE_HP_HELION__SECRET_KEY:
				return getSecret_key();
			case CloudPackage.MACHINE_HP_HELION__IMAGE:
				return getImage();
			case CloudPackage.MACHINE_HP_HELION__ZONE:
				return getZone();
			case CloudPackage.MACHINE_HP_HELION__FLAVOR_ID:
				return getFlavor_id();
			case CloudPackage.MACHINE_HP_HELION__KEY_PAIR:
				return getKey_pair();
			case CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP:
				return getSecurity_group();
			case CloudPackage.MACHINE_HP_HELION__FLOATING_IP:
				return getFloating_ip();
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
			case CloudPackage.MACHINE_HP_HELION__PROVIDER:
				setProvider((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__TENANT:
				setTenant((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__ACCESS_KEY:
				setAccess_key((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__SECRET_KEY:
				setSecret_key((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__IMAGE:
				setImage((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__ZONE:
				setZone((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__FLAVOR_ID:
				setFlavor_id((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__KEY_PAIR:
				setKey_pair((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP:
				setSecurity_group((String)newValue);
				return;
			case CloudPackage.MACHINE_HP_HELION__FLOATING_IP:
				setFloating_ip((String)newValue);
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
			case CloudPackage.MACHINE_HP_HELION__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__ACCESS_KEY:
				setAccess_key(ACCESS_KEY_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__SECRET_KEY:
				setSecret_key(SECRET_KEY_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__ZONE:
				setZone(ZONE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__FLAVOR_ID:
				setFlavor_id(FLAVOR_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__KEY_PAIR:
				setKey_pair(KEY_PAIR_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP:
				setSecurity_group(SECURITY_GROUP_EDEFAULT);
				return;
			case CloudPackage.MACHINE_HP_HELION__FLOATING_IP:
				setFloating_ip(FLOATING_IP_EDEFAULT);
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
			case CloudPackage.MACHINE_HP_HELION__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CloudPackage.MACHINE_HP_HELION__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case CloudPackage.MACHINE_HP_HELION__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? access_key != null : !ACCESS_KEY_EDEFAULT.equals(access_key);
			case CloudPackage.MACHINE_HP_HELION__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secret_key != null : !SECRET_KEY_EDEFAULT.equals(secret_key);
			case CloudPackage.MACHINE_HP_HELION__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case CloudPackage.MACHINE_HP_HELION__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
			case CloudPackage.MACHINE_HP_HELION__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavor_id != null : !FLAVOR_ID_EDEFAULT.equals(flavor_id);
			case CloudPackage.MACHINE_HP_HELION__KEY_PAIR:
				return KEY_PAIR_EDEFAULT == null ? key_pair != null : !KEY_PAIR_EDEFAULT.equals(key_pair);
			case CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? security_group != null : !SECURITY_GROUP_EDEFAULT.equals(security_group);
			case CloudPackage.MACHINE_HP_HELION__FLOATING_IP:
				return FLOATING_IP_EDEFAULT == null ? floating_ip != null : !FLOATING_IP_EDEFAULT.equals(floating_ip);
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
		result.append(", access_key: ");
		result.append(access_key);
		result.append(", secret_key: ");
		result.append(secret_key);
		result.append(", image: ");
		result.append(image);
		result.append(", zone: ");
		result.append(zone);
		result.append(", flavor_id: ");
		result.append(flavor_id);
		result.append(", key_pair: ");
		result.append(key_pair);
		result.append(", security_group: ");
		result.append(security_group);
		result.append(", floating_ip: ");
		result.append(floating_ip);
		result.append(')');
		return result.toString();
	}

} //Machine_Hp_HelionImpl
