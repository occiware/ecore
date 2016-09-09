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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nic Policy Teaming Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getNicPolicyTeamingValue()
 * @model
 * @generated
 */
public enum NicPolicyTeamingValue implements Enumerator {
	/**
	 * The '<em><b>Loadbalance ip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_IP_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCE_IP(0, "loadbalance_ip", "loadbalance_ip"),

	/**
	 * The '<em><b>Loadbalance srcmac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_SRCMAC_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCE_SRCMAC(1, "loadbalance_srcmac", "loadbalance_srcmac"),

	/**
	 * The '<em><b>Loadbalance srcid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_SRCID_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCE_SRCID(2, "loadbalance_srcid", "loadbalance_srcid"),

	/**
	 * The '<em><b>Failover explicit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILOVER_EXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	FAILOVER_EXPLICIT(3, "failover_explicit", "failover_explicit");

	/**
	 * The '<em><b>Loadbalance ip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalance ip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_IP
	 * @model name="loadbalance_ip"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCE_IP_VALUE = 0;

	/**
	 * The '<em><b>Loadbalance srcmac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalance srcmac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_SRCMAC
	 * @model name="loadbalance_srcmac"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCE_SRCMAC_VALUE = 1;

	/**
	 * The '<em><b>Loadbalance srcid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalance srcid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCE_SRCID
	 * @model name="loadbalance_srcid"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCE_SRCID_VALUE = 2;

	/**
	 * The '<em><b>Failover explicit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failover explicit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILOVER_EXPLICIT
	 * @model name="failover_explicit"
	 * @generated
	 * @ordered
	 */
	public static final int FAILOVER_EXPLICIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Nic Policy Teaming Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NicPolicyTeamingValue[] VALUES_ARRAY =
		new NicPolicyTeamingValue[] {
			LOADBALANCE_IP,
			LOADBALANCE_SRCMAC,
			LOADBALANCE_SRCID,
			FAILOVER_EXPLICIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Nic Policy Teaming Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NicPolicyTeamingValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nic Policy Teaming Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NicPolicyTeamingValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NicPolicyTeamingValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nic Policy Teaming Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NicPolicyTeamingValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NicPolicyTeamingValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nic Policy Teaming Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NicPolicyTeamingValue get(int value) {
		switch (value) {
			case LOADBALANCE_IP_VALUE: return LOADBALANCE_IP;
			case LOADBALANCE_SRCMAC_VALUE: return LOADBALANCE_SRCMAC;
			case LOADBALANCE_SRCID_VALUE: return LOADBALANCE_SRCID;
			case FAILOVER_EXPLICIT_VALUE: return FAILOVER_EXPLICIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NicPolicyTeamingValue(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NicPolicyTeamingValue
