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

import org.occiware.clouddesigner.occi.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostfirewallrule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getPort <em>Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getEndPort <em>End Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallrule()
 * @model annotation="OCCIE2Ecore title='A rule link between hostfirewallsystem and a hostfirewallruleset'"
 * @generated
 */
public interface Hostfirewallrule extends Link {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection
	 * @see #setDirection(HostFirewallRuleDirection)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallrule_Direction()
	 * @model annotation="OCCIE2Ecore description='The port direction.'"
	 * @generated
	 */
	HostFirewallRuleDirection getDirection();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(HostFirewallRuleDirection value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallrule_Port()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The port number'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>End Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Port</em>' attribute.
	 * @see #setEndPort(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallrule_EndPort()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='For a port range, the ending port number. '"
	 * @generated
	 */
	int getEndPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getEndPort <em>End Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Port</em>' attribute.
	 * @see #getEndPort()
	 * @generated
	 */
	void setEndPort(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @see #setProtocol(HostNetworkProtocol)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostfirewallrule_Protocol()
	 * @model annotation="OCCIE2Ecore description='The port protocol'"
	 * @generated
	 */
	HostNetworkProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(HostNetworkProtocol value);

} // Hostfirewallrule
