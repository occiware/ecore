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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.linkeddata.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkeddataFactoryImpl extends EFactoryImpl implements LinkeddataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinkeddataFactory init() {
		try {
			LinkeddataFactory theLinkeddataFactory = (LinkeddataFactory)EPackage.Registry.INSTANCE.getEFactory(LinkeddataPackage.eNS_URI);
			if (theLinkeddataFactory != null) {
				return theLinkeddataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinkeddataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkeddataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LinkeddataPackage.LDPROJECT: return createLdproject();
			case LinkeddataPackage.LDDATABASELINK: return createLddatabaselink();
			case LinkeddataPackage.LDPROJECTLINK: return createLdprojectlink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ldproject createLdproject() {
		LdprojectImpl ldproject = new LdprojectImpl();
		return ldproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lddatabaselink createLddatabaselink() {
		LddatabaselinkImpl lddatabaselink = new LddatabaselinkImpl();
		return lddatabaselink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ldprojectlink createLdprojectlink() {
		LdprojectlinkImpl ldprojectlink = new LdprojectlinkImpl();
		return ldprojectlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkeddataPackage getLinkeddataPackage() {
		return (LinkeddataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinkeddataPackage getPackage() {
		return LinkeddataPackage.eINSTANCE;
	}

} //LinkeddataFactoryImpl
