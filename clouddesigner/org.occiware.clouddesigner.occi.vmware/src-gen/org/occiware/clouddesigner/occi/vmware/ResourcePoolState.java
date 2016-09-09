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
 * A representation of the literals of the enumeration '<em><b>Resource Pool State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcePoolState()
 * @model
 * @generated
 */
public enum ResourcePoolState implements Enumerator {
	/**
	 * The '<em><b>Undercommitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERCOMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERCOMMITTED(0, "undercommitted", "undercommitted"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(1, "unknown", "unknown"),

	/**
	 * The '<em><b>Inconsistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	INCONSISTENT(2, "inconsistent", "inconsistent"),

	/**
	 * The '<em><b>Overcommitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERCOMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	OVERCOMMITTED(3, "overcommitted", "overcommitted");

	/**
	 * The '<em><b>Undercommitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undercommitted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERCOMMITTED
	 * @model name="undercommitted"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERCOMMITTED_VALUE = 0;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 1;

	/**
	 * The '<em><b>Inconsistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inconsistent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCONSISTENT
	 * @model name="inconsistent"
	 * @generated
	 * @ordered
	 */
	public static final int INCONSISTENT_VALUE = 2;

	/**
	 * The '<em><b>Overcommitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overcommitted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERCOMMITTED
	 * @model name="overcommitted"
	 * @generated
	 * @ordered
	 */
	public static final int OVERCOMMITTED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Resource Pool State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourcePoolState[] VALUES_ARRAY =
		new ResourcePoolState[] {
			UNDERCOMMITTED,
			UNKNOWN,
			INCONSISTENT,
			OVERCOMMITTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Pool State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourcePoolState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Pool State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePoolState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourcePoolState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Pool State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePoolState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourcePoolState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Pool State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourcePoolState get(int value) {
		switch (value) {
			case UNDERCOMMITTED_VALUE: return UNDERCOMMITTED;
			case UNKNOWN_VALUE: return UNKNOWN;
			case INCONSISTENT_VALUE: return INCONSISTENT;
			case OVERCOMMITTED_VALUE: return OVERCOMMITTED;
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
	private ResourcePoolState(int value, String name, String literal) {
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
	
} //ResourcePoolState
