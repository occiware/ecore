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
package org.occiware.clouddesigner.occi.vmware;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vcentercapability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isMultiHostSupported <em>Multi Host Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isProvisioningSupported <em>Provisioning Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isUserShellAccessSupported <em>User Shell Access Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendor <em>EVC Mode Vendor</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendorTier <em>EVC Mode Vendor Tier</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability()
 * @model annotation="OCCIE2Ecore title='Global data object to determine if the global service instance support or not a feature, see ServiceInstance'"
 * @generated
 */
public interface Vcentercapability extends Resource {
	/**
	 * Returns the value of the '<em><b>Multi Host Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Host Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Host Supported</em>' attribute.
	 * @see #setMultiHostSupported(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability_MultiHostSupported()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Indicates whether or not the service instance supports multiple hosts. '"
	 * @generated
	 */
	boolean isMultiHostSupported();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isMultiHostSupported <em>Multi Host Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Host Supported</em>' attribute.
	 * @see #isMultiHostSupported()
	 * @generated
	 */
	void setMultiHostSupported(boolean value);

	/**
	 * Returns the value of the '<em><b>Provisioning Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisioning Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisioning Supported</em>' attribute.
	 * @see #setProvisioningSupported(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability_ProvisioningSupported()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Indicates whether or not the service instance supports provisioning. For example, the CloneVM operation'"
	 * @generated
	 */
	boolean isProvisioningSupported();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isProvisioningSupported <em>Provisioning Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisioning Supported</em>' attribute.
	 * @see #isProvisioningSupported()
	 * @generated
	 */
	void setProvisioningSupported(boolean value);

	/**
	 * Returns the value of the '<em><b>User Shell Access Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Shell Access Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Shell Access Supported</em>' attribute.
	 * @see #setUserShellAccessSupported(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability_UserShellAccessSupported()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether host user accounts should have the option to be granted shell access'"
	 * @generated
	 */
	boolean isUserShellAccessSupported();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#isUserShellAccessSupported <em>User Shell Access Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Shell Access Supported</em>' attribute.
	 * @see #isUserShellAccessSupported()
	 * @generated
	 */
	void setUserShellAccessSupported(boolean value);

	/**
	 * Returns the value of the '<em><b>EVC Mode Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVC Mode Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVC Mode Vendor</em>' attribute.
	 * @see #setEVCModeVendor(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability_EVCModeVendor()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='All supported Enhanced VMotion Compatibility modes. CPU hardware vendor required for this mode. '"
	 * @generated
	 */
	String getEVCModeVendor();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendor <em>EVC Mode Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EVC Mode Vendor</em>' attribute.
	 * @see #getEVCModeVendor()
	 * @generated
	 */
	void setEVCModeVendor(String value);

	/**
	 * Returns the value of the '<em><b>EVC Mode Vendor Tier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVC Mode Vendor Tier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVC Mode Vendor Tier</em>' attribute.
	 * @see #setEVCModeVendorTier(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVcentercapability_EVCModeVendorTier()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='All supported Enhanced VMotion Compatibility modes.Index for ordering the set of modes that apply to a given CPU vendor. Use this property to compare vendor tier values from two modes. Do not use this property to determine the presence or absence of specific features. '"
	 * @generated
	 */
	int getEVCModeVendorTier();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability#getEVCModeVendorTier <em>EVC Mode Vendor Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EVC Mode Vendor Tier</em>' attribute.
	 * @see #getEVCModeVendorTier()
	 * @generated
	 */
	void setEVCModeVendorTier(int value);

} // Vcentercapability
