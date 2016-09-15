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
 * A representation of the model object '<em><b>Hostfirewallruleset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getKey <em>Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getLabel <em>Label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isRequired <em>Required</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Hostfirewallruleset extends Resource {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset_Enabled()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether the ruleset is enabled. If the ruleset is enabled, all ports specified in the ruleset are opened by the firewall. '"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset_Key()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Brief identifier for the ruleset. '"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset_Label()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Display label for the ruleset. '"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset_Required()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Flag indicating whether the ruleset is required and cannot be disabled. '"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallruleset_Service()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Managed service (if any) that uses this ruleset. Must be one of the services listed in HostService. '"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Blocks the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of \'auto\' and all other rulesets used by the service are blocked, stops the service.'"
	 * @generated
	 */
	void disableRuleset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Opens the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of \'auto\' that is not running, starts the service.'"
	 * @generated
	 */
	void enableRuleset();

} // Hostfirewallruleset
