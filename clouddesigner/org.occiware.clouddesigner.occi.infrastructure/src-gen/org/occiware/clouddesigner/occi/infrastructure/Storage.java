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
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getSize <em>Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getState <em>State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage()
 * @model annotation="OCCIE2Ecore title='Storage Resource'"
 * @generated
 */
public interface Storage extends Resource {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage_Size()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GiB" required="true"
	 *        annotation="OCCIE2Ecore description='Storage size of the instance in gigabytes'"
	 * @generated
	 */
	float getSize();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(float value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.StorageStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @see #setState(StorageStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage_State()
	 * @model required="true"
	 *        annotation="OCCIE2Ecore description='Current status of the instance'"
	 * @generated
	 */
	StorageStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(StorageStatus value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage_Message()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Human-readable explanation of the current instance state'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Set storage online'"
	 * @generated
	 */
	void online();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Set storage offline'"
	 * @generated
	 */
	void offline();

} // Storage
