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
package org.occiware.clouddesigner.occi.docker;

import org.occiware.clouddesigner.occi.Link;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getNetworkId <em>Network Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getAux_address <em>Aux address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#isInternal <em>Internal</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getIp_range <em>Ip range</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_driver <em>Ipam driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_opt <em>Ipam opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#isIpv6 <em>Ipv6</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getOpt <em>Opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Network#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Network extends org.occiware.clouddesigner.occi.infrastructure.Network {
	/**
	 * Returns the value of the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Id</em>' attribute.
	 * @see #setNetworkId(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_NetworkId()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The network ID retreived when the creation is done'"
	 * @generated
	 */
	String getNetworkId();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getNetworkId <em>Network Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Id</em>' attribute.
	 * @see #getNetworkId()
	 * @generated
	 */
	void setNetworkId(String value);

	/**
	 * Returns the value of the '<em><b>Aux address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux address</em>' attribute.
	 * @see #setAux_address(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Aux_address()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Auxiliary IPv4 or IPv6 addresses used by Network driver (default map[])'"
	 * @generated
	 */
	String getAux_address();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getAux_address <em>Aux address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux address</em>' attribute.
	 * @see #getAux_address()
	 * @generated
	 */
	void setAux_address(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Driver()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Driver to manage the Network (default \"bridge\")'"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Gateway()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='IPv4 or IPv6 Gateway for the master subnet (default [])'"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Internal()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Restrict external access to the network'"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Ip range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip range</em>' attribute.
	 * @see #setIp_range(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Ip_range()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Allocate container ip from a sub-range (default [])'"
	 * @generated
	 */
	String getIp_range();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getIp_range <em>Ip range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip range</em>' attribute.
	 * @see #getIp_range()
	 * @generated
	 */
	void setIp_range(String value);

	/**
	 * Returns the value of the '<em><b>Ipam driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipam driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipam driver</em>' attribute.
	 * @see #setIpam_driver(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Ipam_driver()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='IP Address Management Driver (default \"default\")'"
	 * @generated
	 */
	String getIpam_driver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_driver <em>Ipam driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipam driver</em>' attribute.
	 * @see #getIpam_driver()
	 * @generated
	 */
	void setIpam_driver(String value);

	/**
	 * Returns the value of the '<em><b>Ipam opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipam opt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipam opt</em>' attribute.
	 * @see #setIpam_opt(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Ipam_opt()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Set IPAM driver specific options (default map[])'"
	 * @generated
	 */
	String getIpam_opt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_opt <em>Ipam opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipam opt</em>' attribute.
	 * @see #getIpam_opt()
	 * @generated
	 */
	void setIpam_opt(String value);

	/**
	 * Returns the value of the '<em><b>Ipv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipv6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipv6</em>' attribute.
	 * @see #setIpv6(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Ipv6()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Enable IPv6 networking'"
	 * @generated
	 */
	boolean isIpv6();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#isIpv6 <em>Ipv6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv6</em>' attribute.
	 * @see #isIpv6()
	 * @generated
	 */
	void setIpv6(boolean value);

	/**
	 * Returns the value of the '<em><b>Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt</em>' attribute.
	 * @see #setOpt(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Opt()
	 * @model annotation="OCCIE2Ecore description='Set driver specific options (default map[])'"
	 * @generated
	 */
	String getOpt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getOpt <em>Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt</em>' attribute.
	 * @see #getOpt()
	 * @generated
	 */
	void setOpt(String value);

	/**
	 * Returns the value of the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet</em>' attribute.
	 * @see #setSubnet(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Subnet()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Subnet in CIDR format that represents a network segment (default [])'"
	 * @generated
	 */
	String getSubnet();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getSubnet <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet</em>' attribute.
	 * @see #getSubnet()
	 * @generated
	 */
	void setSubnet(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getNetwork_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Network
