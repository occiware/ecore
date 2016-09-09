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
 * A representation of the literals of the enumeration '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getClusterDasConfigInfoHBDatastoreCandidate()
 * @model
 * @generated
 */
public enum ClusterDasConfigInfoHBDatastoreCandidate implements Enumerator {
	/**
	 * The '<em><b>All Feasible Ds With User Preference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_FEASIBLE_DS_WITH_USER_PREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_FEASIBLE_DS_WITH_USER_PREFERENCE(1, "allFeasibleDsWithUserPreference", "allFeasibleDsWithUserPreference"),

	/**
	 * The '<em><b>All Feasible Ds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_FEASIBLE_DS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_FEASIBLE_DS(2, "allFeasibleDs", "allFeasibleDs"),

	/**
	 * The '<em><b>User Selected Ds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED_DS_VALUE
	 * @generated
	 * @ordered
	 */
	USER_SELECTED_DS(2, "userSelectedDs", "userSelectedDs");

	/**
	 * The '<em><b>All Feasible Ds With User Preference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Feasible Ds With User Preference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_FEASIBLE_DS_WITH_USER_PREFERENCE
	 * @model name="allFeasibleDsWithUserPreference"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_FEASIBLE_DS_WITH_USER_PREFERENCE_VALUE = 1;

	/**
	 * The '<em><b>All Feasible Ds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All Feasible Ds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_FEASIBLE_DS
	 * @model name="allFeasibleDs"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_FEASIBLE_DS_VALUE = 2;

	/**
	 * The '<em><b>User Selected Ds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User Selected Ds</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED_DS
	 * @model name="userSelectedDs"
	 * @generated
	 * @ordered
	 */
	public static final int USER_SELECTED_DS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusterDasConfigInfoHBDatastoreCandidate[] VALUES_ARRAY =
		new ClusterDasConfigInfoHBDatastoreCandidate[] {
			ALL_FEASIBLE_DS_WITH_USER_PREFERENCE,
			ALL_FEASIBLE_DS,
			USER_SELECTED_DS,
		};

	/**
	 * A public read-only list of all the '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClusterDasConfigInfoHBDatastoreCandidate> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoHBDatastoreCandidate get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDasConfigInfoHBDatastoreCandidate result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoHBDatastoreCandidate getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDasConfigInfoHBDatastoreCandidate result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster Das Config Info HB Datastore Candidate</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoHBDatastoreCandidate get(int value) {
		switch (value) {
			case ALL_FEASIBLE_DS_WITH_USER_PREFERENCE_VALUE: return ALL_FEASIBLE_DS_WITH_USER_PREFERENCE;
			case ALL_FEASIBLE_DS_VALUE: return ALL_FEASIBLE_DS;
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
	private ClusterDasConfigInfoHBDatastoreCandidate(int value, String name, String literal) {
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
	
} //ClusterDasConfigInfoHBDatastoreCandidate
