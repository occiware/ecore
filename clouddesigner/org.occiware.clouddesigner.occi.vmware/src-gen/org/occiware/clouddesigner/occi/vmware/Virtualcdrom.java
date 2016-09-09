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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtualcdrom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getIsoFilename <em>Iso Filename</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualcdrom()
 * @model annotation="OCCIE2Ecore title='A virtual cdrom disk'"
 * @generated
 */
public interface Virtualcdrom extends Virtualdisk {
	/**
	 * Returns the value of the '<em><b>Iso Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso Filename</em>' attribute.
	 * @see #setIsoFilename(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualcdrom_IsoFilename()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The filename of the ISO.'"
	 * @generated
	 */
	String getIsoFilename();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom#getIsoFilename <em>Iso Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Filename</em>' attribute.
	 * @see #getIsoFilename()
	 * @generated
	 */
	void setIsoFilename(String value);

} // Virtualcdrom
