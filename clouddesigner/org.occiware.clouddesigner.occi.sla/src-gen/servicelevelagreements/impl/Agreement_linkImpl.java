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
package servicelevelagreements.impl;

import org.eclipse.emf.ecore.EClass;

import org.occiware.clouddesigner.occi.impl.LinkImpl;

import servicelevelagreements.Agreement_link;
import servicelevelagreements.ServicelevelagreementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement link</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Agreement_linkImpl extends LinkImpl implements Agreement_link {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Agreement_linkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelagreementsPackage.Literals.AGREEMENT_LINK;
	}

} //Agreement_linkImpl
