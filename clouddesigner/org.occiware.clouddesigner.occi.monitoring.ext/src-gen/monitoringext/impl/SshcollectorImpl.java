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
package monitoringext.impl;

import monitoringext.MonitoringextPackage;
import monitoringext.Sshcollector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.monitoring.impl.CollectorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sshcollector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SshcollectorImpl extends CollectorImpl implements Sshcollector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SshcollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringextPackage.Literals.SSHCOLLECTOR;
	}

} //SshcollectorImpl
