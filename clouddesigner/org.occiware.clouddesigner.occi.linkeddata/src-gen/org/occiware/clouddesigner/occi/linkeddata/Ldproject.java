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

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ldproject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getRobustness <em>Robustness</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdproject()
 * @model annotation="OCCIE2Ecore title='LDProject'"
 * @generated
 */
public interface Ldproject extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdproject_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.linkeddata.Lifecycle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lifecycle
	 * @see #setLifecycle(Lifecycle)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdproject_Lifecycle()
	 * @model annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	Lifecycle getLifecycle();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getLifecycle <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Lifecycle
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Lifecycle value);

	/**
	 * Returns the value of the '<em><b>Robustness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.linkeddata.Robustness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robustness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robustness</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Robustness
	 * @see #setRobustness(Robustness)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdproject_Robustness()
	 * @model annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	Robustness getRobustness();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldproject#getRobustness <em>Robustness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robustness</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.linkeddata.Robustness
	 * @see #getRobustness()
	 * @generated
	 */
	void setRobustness(Robustness value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void publish();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void unpublish();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void update();

} // Ldproject
