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
 * A representation of the literals of the enumeration '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getClusterDASVmSettingsIsolationResponse()
 * @model
 * @generated
 */
public enum ClusterDASVmSettingsIsolationResponse implements Enumerator {
	/**
	 * The '<em><b>Cluster Isolation Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ISOLATION_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_ISOLATION_RESPONSE(0, "clusterIsolationResponse", "clusterIsolationResponse"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "none", "none"),

	/**
	 * The '<em><b>Power Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_OFF(2, "powerOff", "powerOff");

	/**
	 * The '<em><b>Cluster Isolation Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cluster Isolation Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ISOLATION_RESPONSE
	 * @model name="clusterIsolationResponse"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_ISOLATION_RESPONSE_VALUE = 0;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>Power Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_OFF
	 * @model name="powerOff"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_OFF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusterDASVmSettingsIsolationResponse[] VALUES_ARRAY =
		new ClusterDASVmSettingsIsolationResponse[] {
			CLUSTER_ISOLATION_RESPONSE,
			NONE,
			POWER_OFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClusterDASVmSettingsIsolationResponse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDASVmSettingsIsolationResponse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDASVmSettingsIsolationResponse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDASVmSettingsIsolationResponse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDASVmSettingsIsolationResponse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster DAS Vm Settings Isolation Response</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDASVmSettingsIsolationResponse get(int value) {
		switch (value) {
			case CLUSTER_ISOLATION_RESPONSE_VALUE: return CLUSTER_ISOLATION_RESPONSE;
			case NONE_VALUE: return NONE;
			case POWER_OFF_VALUE: return POWER_OFF;
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
	private ClusterDASVmSettingsIsolationResponse(int value, String name, String literal) {
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
	
} //ClusterDASVmSettingsIsolationResponse
