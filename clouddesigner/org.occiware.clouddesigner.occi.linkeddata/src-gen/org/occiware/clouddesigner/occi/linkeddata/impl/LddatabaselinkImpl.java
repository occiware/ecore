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

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.impl.LinkImpl;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lddatabaselink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.impl.LddatabaselinkImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LddatabaselinkImpl extends LinkImpl implements Lddatabaselink {
	@Override
	public void setTarget(Resource newTarget) {
		super.setTarget(newTarget);
		/*if (newTarget instanceof Compute) {
			URI oldUri = null;
			try {
				oldUri = new URI(this.getUri());
			} catch (NullPointerException e) {
				// none yet
			} catch (URISyntaxException e) {
				///TODO LOGGER.error("Not an LD DB URI", e);
				e.printStackTrace();
			}
			URI newUri = new URI(oldUri.getScheme(), null, ((Compute) newTarget).getHostname(),
					oldUri.getPort(), oldUri.getPath(), null, null);
			this.setUri(newUri.toASCIIString());
		} // else TODO explode ?*/
	}

	/**
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_EDEFAULT = "datacore";
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected String database = DATABASE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 27017;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LddatabaselinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkeddataPackage.Literals.LDDATABASELINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(String newDatabase) {
		String oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDDATABASELINK__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkeddataPackage.LDDATABASELINK__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkeddataPackage.LDDATABASELINK__DATABASE:
				return getDatabase();
			case LinkeddataPackage.LDDATABASELINK__PORT:
				return getPort();
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
			case LinkeddataPackage.LDDATABASELINK__DATABASE:
				setDatabase((String)newValue);
				return;
			case LinkeddataPackage.LDDATABASELINK__PORT:
				setPort((Integer)newValue);
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
			case LinkeddataPackage.LDDATABASELINK__DATABASE:
				setDatabase(DATABASE_EDEFAULT);
				return;
			case LinkeddataPackage.LDDATABASELINK__PORT:
				setPort(PORT_EDEFAULT);
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
			case LinkeddataPackage.LDDATABASELINK__DATABASE:
				return DATABASE_EDEFAULT == null ? database != null : !DATABASE_EDEFAULT.equals(database);
			case LinkeddataPackage.LDDATABASELINK__PORT:
				return port != PORT_EDEFAULT;
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
		result.append(" (database: ");
		result.append(database);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //LddatabaselinkImpl
