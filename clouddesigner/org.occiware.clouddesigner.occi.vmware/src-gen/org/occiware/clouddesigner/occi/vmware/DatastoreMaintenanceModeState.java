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
 * A representation of the literals of the enumeration '<em><b>Datastore Maintenance Mode State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getDatastoreMaintenanceModeState()
 * @model
 * @generated
 */
public enum DatastoreMaintenanceModeState implements Enumerator {
	/**
	 * The '<em><b>Entering Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERING_MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERING_MAINTENANCE(0, "enteringMaintenance", "enteringMaintenance"),

	/**
	 * The '<em><b>In Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	IN_MAINTENANCE(1, "inMaintenance", "inMaintenance"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(2, "normal", "normal");

	/**
	 * The '<em><b>Entering Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entering Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTERING_MAINTENANCE
	 * @model name="enteringMaintenance"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERING_MAINTENANCE_VALUE = 0;

	/**
	 * The '<em><b>In Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_MAINTENANCE
	 * @model name="inMaintenance"
	 * @generated
	 * @ordered
	 */
	public static final int IN_MAINTENANCE_VALUE = 1;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Datastore Maintenance Mode State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatastoreMaintenanceModeState[] VALUES_ARRAY =
		new DatastoreMaintenanceModeState[] {
			ENTERING_MAINTENANCE,
			IN_MAINTENANCE,
			NORMAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Datastore Maintenance Mode State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatastoreMaintenanceModeState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datastore Maintenance Mode State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatastoreMaintenanceModeState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatastoreMaintenanceModeState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datastore Maintenance Mode State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatastoreMaintenanceModeState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatastoreMaintenanceModeState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datastore Maintenance Mode State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatastoreMaintenanceModeState get(int value) {
		switch (value) {
			case ENTERING_MAINTENANCE_VALUE: return ENTERING_MAINTENANCE;
			case IN_MAINTENANCE_VALUE: return IN_MAINTENANCE;
			case NORMAL_VALUE: return NORMAL;
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
	private DatastoreMaintenanceModeState(int value, String name, String literal) {
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
	
} //DatastoreMaintenanceModeState
