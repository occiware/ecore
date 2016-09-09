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
 * A representation of the model object '<em><b>Hostfirewallsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultIncomingBlocked <em>Default Incoming Blocked</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultOutgoingBlocked <em>Default Outgoing Blocked</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallsystem()
 * @model annotation="OCCIE2Ecore title='A host can have only have one firewall, this described a firewall for a host and a set of rules'"
 * @generated
 */
public interface Hostfirewallsystem extends Resource {
	/**
	 * Returns the value of the '<em><b>Default Incoming Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Incoming Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Incoming Blocked</em>' attribute.
	 * @see #setDefaultIncomingBlocked(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallsystem_DefaultIncomingBlocked()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether incoming traffic should be blocked by default.'"
	 * @generated
	 */
	boolean isDefaultIncomingBlocked();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultIncomingBlocked <em>Default Incoming Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Incoming Blocked</em>' attribute.
	 * @see #isDefaultIncomingBlocked()
	 * @generated
	 */
	void setDefaultIncomingBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Outgoing Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Outgoing Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Outgoing Blocked</em>' attribute.
	 * @see #setDefaultOutgoingBlocked(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallsystem_DefaultOutgoingBlocked()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether outgoing traffic should be blocked by default. '"
	 * @generated
	 */
	boolean isDefaultOutgoingBlocked();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem#isDefaultOutgoingBlocked <em>Default Outgoing Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Outgoing Blocked</em>' attribute.
	 * @see #isDefaultOutgoingBlocked()
	 * @generated
	 */
	void setDefaultOutgoingBlocked(boolean value);

} // Hostfirewallsystem
