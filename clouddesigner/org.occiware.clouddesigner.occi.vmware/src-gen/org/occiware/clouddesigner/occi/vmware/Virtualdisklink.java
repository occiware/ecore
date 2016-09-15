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

import org.occiware.clouddesigner.occi.infrastructure.Storagelink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtualdisklink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Virtualdisklink#getVmdkFilePathOnDatastore <em>Vmdk File Path On Datastore</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualdisklink()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Virtualdisklink extends Storagelink {
	/**
	 * Returns the value of the '<em><b>Vmdk File Path On Datastore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmdk File Path On Datastore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmdk File Path On Datastore</em>' attribute.
	 * @see #setVmdkFilePathOnDatastore(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualdisklink_VmdkFilePathOnDatastore()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Represents the vmdk file path.'"
	 * @generated
	 */
	String getVmdkFilePathOnDatastore();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisklink#getVmdkFilePathOnDatastore <em>Vmdk File Path On Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmdk File Path On Datastore</em>' attribute.
	 * @see #getVmdkFilePathOnDatastore()
	 * @generated
	 */
	void setVmdkFilePathOnDatastore(String value);

} // Virtualdisklink
