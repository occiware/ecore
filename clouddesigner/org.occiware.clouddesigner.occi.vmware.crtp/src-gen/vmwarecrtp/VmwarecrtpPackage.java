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
package vmwarecrtp;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vmwarecrtp.VmwarecrtpFactory
 * @model kind="package"
 * @generated
 */
public interface VmwarecrtpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmwarecrtp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/vmwarecrtp/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vmwarecrtp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmwarecrtpPackage eINSTANCE = vmwarecrtp.impl.VmwarecrtpPackageImpl.init();

	/**
	 * The meta object id for the '{@link vmwarecrtp.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vmwarecrtp.GuestOsIdentifiers
	 * @see vmwarecrtp.impl.VmwarecrtpPackageImpl#getGuestOsIdentifiers()
	 * @generated
	 */
	int GUEST_OS_IDENTIFIERS = 0;


	/**
	 * Returns the meta object for enum '{@link vmwarecrtp.GuestOsIdentifiers <em>Guest Os Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guest Os Identifiers</em>'.
	 * @see vmwarecrtp.GuestOsIdentifiers
	 * @generated
	 */
	EEnum getGuestOsIdentifiers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmwarecrtpFactory getVmwarecrtpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vmwarecrtp.GuestOsIdentifiers <em>Guest Os Identifiers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vmwarecrtp.GuestOsIdentifiers
		 * @see vmwarecrtp.impl.VmwarecrtpPackageImpl#getGuestOsIdentifiers()
		 * @generated
		 */
		EEnum GUEST_OS_IDENTIFIERS = eINSTANCE.getGuestOsIdentifiers();

	}

} //VmwarecrtpPackage
