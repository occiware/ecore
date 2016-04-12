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
import org.occiware.clouddesigner.occi.cloud.Machine_GCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine GCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getMachine_type <em>Machine type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getMachine_url <em>Machine url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getFirewall_tag <em>Firewall tag</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getStartup_script <em>Startup script</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getJson_file <em>Json file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_GCEImpl extends MachineImpl implements Machine_GCE {
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
	 * The default value of the '{@link #getMachine_type() <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine_type()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getMachine_url() <em>Machine url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine_url()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachine_url() <em>Machine url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine_url()
	 * @generated
	 * @ordered
	 */
	protected String machine_url = MACHINE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirewall_tag() <em>Firewall tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirewall_tag()
	 * @generated
	 * @ordered
	 */
	protected static final String FIREWALL_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirewall_tag() <em>Firewall tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirewall_tag()
	 * @generated
	 * @ordered
	 */
	protected String firewall_tag = FIREWALL_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartup_script() <em>Startup script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartup_script()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartup_script() <em>Startup script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartup_script()
	 * @generated
	 * @ordered
	 */
	protected String startup_script = STARTUP_SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJson_file() <em>Json file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJson_file()
	 * @generated
	 * @ordered
	 */
	protected static final String JSON_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJson_file() <em>Json file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJson_file()
	 * @generated
	 * @ordered
	 */
	protected String json_file = JSON_FILE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_GCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.MACHINE_GCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__ZONE, oldZone, zone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__REGION, oldRegion, region));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__MACHINE_TYPE, oldMachine_type, machine_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachine_url() {
		return machine_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine_url(String newMachine_url) {
		String oldMachine_url = machine_url;
		machine_url = newMachine_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__MACHINE_URL, oldMachine_url, machine_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirewall_tag() {
		return firewall_tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirewall_tag(String newFirewall_tag) {
		String oldFirewall_tag = firewall_tag;
		firewall_tag = newFirewall_tag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__FIREWALL_TAG, oldFirewall_tag, firewall_tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartup_script() {
		return startup_script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartup_script(String newStartup_script) {
		String oldStartup_script = startup_script;
		startup_script = newStartup_script;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__STARTUP_SCRIPT, oldStartup_script, startup_script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJson_file() {
		return json_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJson_file(String newJson_file) {
		String oldJson_file = json_file;
		json_file = newJson_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__JSON_FILE, oldJson_file, json_file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_GCE__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.MACHINE_GCE__ZONE:
				return getZone();
			case CloudPackage.MACHINE_GCE__REGION:
				return getRegion();
			case CloudPackage.MACHINE_GCE__MACHINE_TYPE:
				return getMachine_type();
			case CloudPackage.MACHINE_GCE__MACHINE_URL:
				return getMachine_url();
			case CloudPackage.MACHINE_GCE__FIREWALL_TAG:
				return getFirewall_tag();
			case CloudPackage.MACHINE_GCE__STARTUP_SCRIPT:
				return getStartup_script();
			case CloudPackage.MACHINE_GCE__JSON_FILE:
				return getJson_file();
			case CloudPackage.MACHINE_GCE__PROVIDER:
				return getProvider();
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
			case CloudPackage.MACHINE_GCE__ZONE:
				setZone((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__REGION:
				setRegion((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__MACHINE_TYPE:
				setMachine_type((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__MACHINE_URL:
				setMachine_url((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__FIREWALL_TAG:
				setFirewall_tag((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__STARTUP_SCRIPT:
				setStartup_script((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__JSON_FILE:
				setJson_file((String)newValue);
				return;
			case CloudPackage.MACHINE_GCE__PROVIDER:
				setProvider((String)newValue);
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
			case CloudPackage.MACHINE_GCE__ZONE:
				setZone(ZONE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__MACHINE_TYPE:
				setMachine_type(MACHINE_TYPE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__MACHINE_URL:
				setMachine_url(MACHINE_URL_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__FIREWALL_TAG:
				setFirewall_tag(FIREWALL_TAG_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__STARTUP_SCRIPT:
				setStartup_script(STARTUP_SCRIPT_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__JSON_FILE:
				setJson_file(JSON_FILE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_GCE__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
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
			case CloudPackage.MACHINE_GCE__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
			case CloudPackage.MACHINE_GCE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case CloudPackage.MACHINE_GCE__MACHINE_TYPE:
				return MACHINE_TYPE_EDEFAULT == null ? machine_type != null : !MACHINE_TYPE_EDEFAULT.equals(machine_type);
			case CloudPackage.MACHINE_GCE__MACHINE_URL:
				return MACHINE_URL_EDEFAULT == null ? machine_url != null : !MACHINE_URL_EDEFAULT.equals(machine_url);
			case CloudPackage.MACHINE_GCE__FIREWALL_TAG:
				return FIREWALL_TAG_EDEFAULT == null ? firewall_tag != null : !FIREWALL_TAG_EDEFAULT.equals(firewall_tag);
			case CloudPackage.MACHINE_GCE__STARTUP_SCRIPT:
				return STARTUP_SCRIPT_EDEFAULT == null ? startup_script != null : !STARTUP_SCRIPT_EDEFAULT.equals(startup_script);
			case CloudPackage.MACHINE_GCE__JSON_FILE:
				return JSON_FILE_EDEFAULT == null ? json_file != null : !JSON_FILE_EDEFAULT.equals(json_file);
			case CloudPackage.MACHINE_GCE__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
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
		result.append(", region: ");
		result.append(region);
		result.append(", machine_type: ");
		result.append(machine_type);
		result.append(", machine_url: ");
		result.append(machine_url);
		result.append(", firewall_tag: ");
		result.append(firewall_tag);
		result.append(", startup_script: ");
		result.append(startup_script);
		result.append(", json_file: ");
		result.append(json_file);
		result.append(", provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}

} //Machine_GCEImpl
