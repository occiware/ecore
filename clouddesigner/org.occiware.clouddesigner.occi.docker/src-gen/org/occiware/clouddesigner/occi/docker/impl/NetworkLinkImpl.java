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

import org.eclipse.emf.ecore.EClass;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.NetworkLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NetworkLinkImpl extends LinkImpl implements NetworkLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.NETWORK_LINK;
	}

} //NetworkLinkImpl
