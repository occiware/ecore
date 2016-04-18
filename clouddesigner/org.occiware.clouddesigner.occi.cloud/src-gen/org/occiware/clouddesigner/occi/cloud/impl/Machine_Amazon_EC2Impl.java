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
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Amazon EC2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_Amazon_EC2Impl#getKey_pair <em>Key pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Amazon_EC2Impl extends MachineImpl implements Machine_Amazon_EC2 {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Amazon_EC2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.MACHINE_AMAZON_EC2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY, oldAccess_key, access_key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY, oldSecret_key, secret_key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__REGION, oldRegion, region));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__IMAGE, oldImage, image));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP, oldSecurity_group, security_group));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR, oldKey_pair, key_pair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.MACHINE_AMAZON_EC2__PROVIDER:
				return getProvider();
			case CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				return getAccess_key();
			case CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				return getSecret_key();
			case CloudPackage.MACHINE_AMAZON_EC2__REGION:
				return getRegion();
			case CloudPackage.MACHINE_AMAZON_EC2__IMAGE:
				return getImage();
			case CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				return getSecurity_group();
			case CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR:
				return getKey_pair();
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
			case CloudPackage.MACHINE_AMAZON_EC2__PROVIDER:
				setProvider((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				setAccess_key((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				setSecret_key((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__REGION:
				setRegion((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__IMAGE:
				setImage((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				setSecurity_group((String)newValue);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR:
				setKey_pair((String)newValue);
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
			case CloudPackage.MACHINE_AMAZON_EC2__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				setAccess_key(ACCESS_KEY_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				setSecret_key(SECRET_KEY_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				setSecurity_group(SECURITY_GROUP_EDEFAULT);
				return;
			case CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR:
				setKey_pair(KEY_PAIR_EDEFAULT);
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
			case CloudPackage.MACHINE_AMAZON_EC2__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? access_key != null : !ACCESS_KEY_EDEFAULT.equals(access_key);
			case CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secret_key != null : !SECRET_KEY_EDEFAULT.equals(secret_key);
			case CloudPackage.MACHINE_AMAZON_EC2__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudPackage.MACHINE_AMAZON_EC2__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? security_group != null : !SECURITY_GROUP_EDEFAULT.equals(security_group);
			case CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR:
				return KEY_PAIR_EDEFAULT == null ? key_pair != null : !KEY_PAIR_EDEFAULT.equals(key_pair);
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
		result.append(", access_key: ");
		result.append(access_key);
		result.append(", secret_key: ");
		result.append(secret_key);
		result.append(", region: ");
		result.append(region);
		result.append(", image: ");
		result.append(image);
		result.append(", security_group: ");
		result.append(security_group);
		result.append(", key_pair: ");
		result.append(key_pair);
		result.append(')');
		return result.toString();
	}

} //Machine_Amazon_EC2Impl
