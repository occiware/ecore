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
 * A representation of the literals of the enumeration '<em><b>Virtual Device Connect Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVirtualDeviceConnectStatus()
 * @model
 * @generated
 */
public enum VirtualDeviceConnectStatus implements Enumerator {
	/**
	 * The '<em><b>Ok</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "ok", "ok"),

	/**
	 * The '<em><b>Recoverable Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOVERABLE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	RECOVERABLE_ERROR(1, "recoverableError", "recoverableError"),

	/**
	 * The '<em><b>Unrecoverrable Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRECOVERRABLE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	UNRECOVERRABLE_ERROR(2, "unrecoverrableError", "unrecoverrableError"),

	/**
	 * The '<em><b>Untried</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTRIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNTRIED(3, "untried", "untried");

	/**
	 * The '<em><b>Ok</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ok</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model name="ok"
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>Recoverable Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recoverable Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOVERABLE_ERROR
	 * @model name="recoverableError"
	 * @generated
	 * @ordered
	 */
	public static final int RECOVERABLE_ERROR_VALUE = 1;

	/**
	 * The '<em><b>Unrecoverrable Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unrecoverrable Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNRECOVERRABLE_ERROR
	 * @model name="unrecoverrableError"
	 * @generated
	 * @ordered
	 */
	public static final int UNRECOVERRABLE_ERROR_VALUE = 2;

	/**
	 * The '<em><b>Untried</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Untried</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTRIED
	 * @model name="untried"
	 * @generated
	 * @ordered
	 */
	public static final int UNTRIED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Virtual Device Connect Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VirtualDeviceConnectStatus[] VALUES_ARRAY =
		new VirtualDeviceConnectStatus[] {
			OK,
			RECOVERABLE_ERROR,
			UNRECOVERRABLE_ERROR,
			UNTRIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Virtual Device Connect Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VirtualDeviceConnectStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Virtual Device Connect Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VirtualDeviceConnectStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VirtualDeviceConnectStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Virtual Device Connect Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VirtualDeviceConnectStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VirtualDeviceConnectStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Virtual Device Connect Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VirtualDeviceConnectStatus get(int value) {
		switch (value) {
			case OK_VALUE: return OK;
			case RECOVERABLE_ERROR_VALUE: return RECOVERABLE_ERROR;
			case UNRECOVERRABLE_ERROR_VALUE: return UNRECOVERRABLE_ERROR;
			case UNTRIED_VALUE: return UNTRIED;
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
	private VirtualDeviceConnectStatus(int value, String name, String literal) {
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
	
} //VirtualDeviceConnectStatus
