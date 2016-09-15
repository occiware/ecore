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
 * A representation of the model object '<em><b>Hoststorage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hoststorage#getHostVolumeName <em>Host Volume Name</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHoststorage()
 * @model annotation="OCCIE2Ecore title='Represente a physical storage on a hostsystem, see HostStorageSystem, linked to a hostsystem via a hoststoragelink'"
 * @generated
 */
public interface Hoststorage extends Storage {
	/**
	 * Returns the value of the '<em><b>Host Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Volume Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Volume Name</em>' attribute.
	 * @see #setHostVolumeName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHoststorage_HostVolumeName()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Name of the file system volume. '"
	 * @generated
	 */
	String getHostVolumeName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hoststorage#getHostVolumeName <em>Host Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Volume Name</em>' attribute.
	 * @see #getHostVolumeName()
	 * @generated
	 */
	void setHostVolumeName(String value);

} // Hoststorage
