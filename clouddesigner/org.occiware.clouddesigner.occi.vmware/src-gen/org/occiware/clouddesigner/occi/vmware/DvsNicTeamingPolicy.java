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
 * A representation of the literals of the enumeration '<em><b>Dvs Nic Teaming Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getDvsNicTeamingPolicy()
 * @model
 * @generated
 */
public enum DvsNicTeamingPolicy implements Enumerator {
	/**
	 * The '<em><b>Failoverexplicit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILOVEREXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	FAILOVEREXPLICIT(0, "failoverexplicit", "failoverexplicit"),

	/**
	 * The '<em><b>Loadbalanceip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCEIP_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCEIP(1, "loadbalanceip", "loadbalanceip"),

	/**
	 * The '<em><b>Loadbalanceloadbased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCELOADBASED_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCELOADBASED(2, "loadbalanceloadbased", "loadbalanceloadbased"),

	/**
	 * The '<em><b>Loadbalancesrcid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCESRCID_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCESRCID(3, "loadbalancesrcid", "loadbalancesrcid"),

	/**
	 * The '<em><b>Loadbalancesrcmac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCESRCMAC_VALUE
	 * @generated
	 * @ordered
	 */
	LOADBALANCESRCMAC(4, "loadbalancesrcmac", "loadbalancesrcmac");

	/**
	 * The '<em><b>Failoverexplicit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Failoverexplicit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILOVEREXPLICIT
	 * @model name="failoverexplicit"
	 * @generated
	 * @ordered
	 */
	public static final int FAILOVEREXPLICIT_VALUE = 0;

	/**
	 * The '<em><b>Loadbalanceip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalanceip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCEIP
	 * @model name="loadbalanceip"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCEIP_VALUE = 1;

	/**
	 * The '<em><b>Loadbalanceloadbased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalanceloadbased</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCELOADBASED
	 * @model name="loadbalanceloadbased"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCELOADBASED_VALUE = 2;

	/**
	 * The '<em><b>Loadbalancesrcid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalancesrcid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCESRCID
	 * @model name="loadbalancesrcid"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCESRCID_VALUE = 3;

	/**
	 * The '<em><b>Loadbalancesrcmac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loadbalancesrcmac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOADBALANCESRCMAC
	 * @model name="loadbalancesrcmac"
	 * @generated
	 * @ordered
	 */
	public static final int LOADBALANCESRCMAC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dvs Nic Teaming Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DvsNicTeamingPolicy[] VALUES_ARRAY =
		new DvsNicTeamingPolicy[] {
			FAILOVEREXPLICIT,
			LOADBALANCEIP,
			LOADBALANCELOADBASED,
			LOADBALANCESRCID,
			LOADBALANCESRCMAC,
		};

	/**
	 * A public read-only list of all the '<em><b>Dvs Nic Teaming Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DvsNicTeamingPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dvs Nic Teaming Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DvsNicTeamingPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DvsNicTeamingPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dvs Nic Teaming Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DvsNicTeamingPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DvsNicTeamingPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dvs Nic Teaming Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DvsNicTeamingPolicy get(int value) {
		switch (value) {
			case FAILOVEREXPLICIT_VALUE: return FAILOVEREXPLICIT;
			case LOADBALANCEIP_VALUE: return LOADBALANCEIP;
			case LOADBALANCELOADBASED_VALUE: return LOADBALANCELOADBASED;
			case LOADBALANCESRCID_VALUE: return LOADBALANCESRCID;
			case LOADBALANCESRCMAC_VALUE: return LOADBALANCESRCMAC;
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
	private DvsNicTeamingPolicy(int value, String name, String literal) {
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
	
} //DvsNicTeamingPolicy
