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
package org.occiware.clouddesigner.occi.linkeddata;

import org.occiware.clouddesigner.occi.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lddatabaselink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLddatabaselink()
 * @model annotation="OCCIE2Ecore title='LDDatabaseLink'"
 * @generated
 */
public interface Lddatabaselink extends Link {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * The default value is <code>"datacore"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLddatabaselink_Database()
	 * @model default="datacore" dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"27017"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLddatabaselink_Port()
	 * @model default="27017" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Lddatabaselink#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Lddatabaselink
