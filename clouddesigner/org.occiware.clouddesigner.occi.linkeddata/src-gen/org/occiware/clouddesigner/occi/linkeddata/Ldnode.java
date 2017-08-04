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
 * A representation of the model object '<em><b>Ldnode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMongoHosts <em>Mongo Hosts</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMainProject <em>Main Project</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getAnalyticsReadPreference <em>Analytics Read Preference</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdnode()
 * @model annotation="OCCIE2Ecore title='LDNode'"
 * @generated
 */
public interface Ldnode extends Resource {
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
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdnode_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mongo Hosts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mongo Hosts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mongo Hosts</em>' attribute.
	 * @see #setMongoHosts(String)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdnode_MongoHosts()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getMongoHosts();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMongoHosts <em>Mongo Hosts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mongo Hosts</em>' attribute.
	 * @see #getMongoHosts()
	 * @generated
	 */
	void setMongoHosts(String value);

	/**
	 * Returns the value of the '<em><b>Main Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Project</em>' attribute.
	 * @see #setMainProject(String)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdnode_MainProject()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getMainProject();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getMainProject <em>Main Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Project</em>' attribute.
	 * @see #getMainProject()
	 * @generated
	 */
	void setMainProject(String value);

	/**
	 * Returns the value of the '<em><b>Analytics Read Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analytics Read Preference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analytics Read Preference</em>' attribute.
	 * @see #setAnalyticsReadPreference(String)
	 * @see org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage#getLdnode_AnalyticsReadPreference()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getAnalyticsReadPreference();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.linkeddata.Ldnode#getAnalyticsReadPreference <em>Analytics Read Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analytics Read Preference</em>' attribute.
	 * @see #getAnalyticsReadPreference()
	 * @generated
	 */
	void setAnalyticsReadPreference(String value);

} // Ldnode
