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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.ResourceImpl;

import org.occiware.clouddesigner.occi.linkeddata.Ldnode;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ldnode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl#getMongoHosts <em>Mongo Hosts</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl#getMainProject <em>Main Project</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl#getAnalyticsReadPreference <em>Analytics Read Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LdnodeImpl extends ResourceImpl implements Ldnode {
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
	 * The default value of the '{@link #getMongoHosts() <em>Mongo Hosts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongoHosts()
	 * @generated
	 * @ordered
	 */
	protected static final String MONGO_HOSTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMongoHosts() <em>Mongo Hosts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongoHosts()
	 * @generated
	 * @ordered
	 */
	protected String mongoHosts = MONGO_HOSTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainProject() <em>Main Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainProject()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainProject() <em>Main Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainProject()
	 * @generated
	 * @ordered
	 */
	protected String mainProject = MAIN_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalyticsReadPreference() <em>Analytics Read Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyticsReadPreference()
	 * @generated
	 * @ordered
	 */
	protected static final String ANALYTICS_READ_PREFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalyticsReadPreference() <em>Analytics Read Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyticsReadPreference()
	 * @generated
	 * @ordered
	 */
	protected String analyticsReadPreference = ANALYTICS_READ_PREFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LdnodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkeddataPackage.Literals.LDNODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDNODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMongoHosts() {
		return mongoHosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMongoHosts(String newMongoHosts) {
		String oldMongoHosts = mongoHosts;
		mongoHosts = newMongoHosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDNODE__MONGO_HOSTS, oldMongoHosts, mongoHosts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainProject() {
		return mainProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainProject(String newMainProject) {
		String oldMainProject = mainProject;
		mainProject = newMainProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDNODE__MAIN_PROJECT, oldMainProject, mainProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnalyticsReadPreference() {
		return analyticsReadPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyticsReadPreference(String newAnalyticsReadPreference) {
		String oldAnalyticsReadPreference = analyticsReadPreference;
		analyticsReadPreference = newAnalyticsReadPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDNODE__ANALYTICS_READ_PREFERENCE, oldAnalyticsReadPreference, analyticsReadPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkeddataPackage.LDNODE__NAME:
				return getName();
			case LinkeddataPackage.LDNODE__MONGO_HOSTS:
				return getMongoHosts();
			case LinkeddataPackage.LDNODE__MAIN_PROJECT:
				return getMainProject();
			case LinkeddataPackage.LDNODE__ANALYTICS_READ_PREFERENCE:
				return getAnalyticsReadPreference();
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
			case LinkeddataPackage.LDNODE__NAME:
				setName((String)newValue);
				return;
			case LinkeddataPackage.LDNODE__MONGO_HOSTS:
				setMongoHosts((String)newValue);
				return;
			case LinkeddataPackage.LDNODE__MAIN_PROJECT:
				setMainProject((String)newValue);
				return;
			case LinkeddataPackage.LDNODE__ANALYTICS_READ_PREFERENCE:
				setAnalyticsReadPreference((String)newValue);
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
			case LinkeddataPackage.LDNODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LinkeddataPackage.LDNODE__MONGO_HOSTS:
				setMongoHosts(MONGO_HOSTS_EDEFAULT);
				return;
			case LinkeddataPackage.LDNODE__MAIN_PROJECT:
				setMainProject(MAIN_PROJECT_EDEFAULT);
				return;
			case LinkeddataPackage.LDNODE__ANALYTICS_READ_PREFERENCE:
				setAnalyticsReadPreference(ANALYTICS_READ_PREFERENCE_EDEFAULT);
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
			case LinkeddataPackage.LDNODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LinkeddataPackage.LDNODE__MONGO_HOSTS:
				return MONGO_HOSTS_EDEFAULT == null ? mongoHosts != null : !MONGO_HOSTS_EDEFAULT.equals(mongoHosts);
			case LinkeddataPackage.LDNODE__MAIN_PROJECT:
				return MAIN_PROJECT_EDEFAULT == null ? mainProject != null : !MAIN_PROJECT_EDEFAULT.equals(mainProject);
			case LinkeddataPackage.LDNODE__ANALYTICS_READ_PREFERENCE:
				return ANALYTICS_READ_PREFERENCE_EDEFAULT == null ? analyticsReadPreference != null : !ANALYTICS_READ_PREFERENCE_EDEFAULT.equals(analyticsReadPreference);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mongoHosts: ");
		result.append(mongoHosts);
		result.append(", mainProject: ");
		result.append(mainProject);
		result.append(", analyticsReadPreference: ");
		result.append(analyticsReadPreference);
		result.append(')');
		return result.toString();
	}

} //LdnodeImpl
