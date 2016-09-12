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

import org.occiware.clouddesigner.occi.infrastructure.Storage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtualfloppy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualfloppy#getVolumeName <em>Volume Name</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualfloppy()
 * @model annotation="OCCIE2Ecore title='A virtual floppy disk'"
 * @generated
 */
public interface Virtualfloppy extends Storage {

	/**
	 * Returns the value of the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Name</em>' attribute.
	 * @see #setVolumeName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualfloppy_VolumeName()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getVolumeName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualfloppy#getVolumeName <em>Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Name</em>' attribute.
	 * @see #getVolumeName()
	 * @generated
	 */
	void setVolumeName(String value);
} // Virtualfloppy
