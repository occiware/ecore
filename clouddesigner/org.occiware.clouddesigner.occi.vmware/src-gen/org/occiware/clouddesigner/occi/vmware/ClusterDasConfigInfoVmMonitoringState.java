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
 * A representation of the literals of the enumeration '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getClusterDasConfigInfoVmMonitoringState()
 * @model
 * @generated
 */
public enum ClusterDasConfigInfoVmMonitoringState implements Enumerator {
	/**
	 * The '<em><b>Vm And App Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_AND_APP_MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	VM_AND_APP_MONITORING(0, "vmAndAppMonitoring", "vmAndAppMonitoring"),

	/**
	 * The '<em><b>Vm Monitoring Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_MONITORING_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	VM_MONITORING_DISABLED(1, "vmMonitoringDisabled", "vmMonitoringDisabled"),

	/**
	 * The '<em><b>Vm Monitoring Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_MONITORING_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	VM_MONITORING_ONLY(2, "vmMonitoringOnly", "vmMonitoringOnly");

	/**
	 * The '<em><b>Vm And App Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vm And App Monitoring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM_AND_APP_MONITORING
	 * @model name="vmAndAppMonitoring"
	 * @generated
	 * @ordered
	 */
	public static final int VM_AND_APP_MONITORING_VALUE = 0;

	/**
	 * The '<em><b>Vm Monitoring Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vm Monitoring Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM_MONITORING_DISABLED
	 * @model name="vmMonitoringDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int VM_MONITORING_DISABLED_VALUE = 1;

	/**
	 * The '<em><b>Vm Monitoring Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vm Monitoring Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM_MONITORING_ONLY
	 * @model name="vmMonitoringOnly"
	 * @generated
	 * @ordered
	 */
	public static final int VM_MONITORING_ONLY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusterDasConfigInfoVmMonitoringState[] VALUES_ARRAY =
		new ClusterDasConfigInfoVmMonitoringState[] {
			VM_AND_APP_MONITORING,
			VM_MONITORING_DISABLED,
			VM_MONITORING_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClusterDasConfigInfoVmMonitoringState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoVmMonitoringState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDasConfigInfoVmMonitoringState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoVmMonitoringState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusterDasConfigInfoVmMonitoringState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cluster Das Config Info Vm Monitoring State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusterDasConfigInfoVmMonitoringState get(int value) {
		switch (value) {
			case VM_AND_APP_MONITORING_VALUE: return VM_AND_APP_MONITORING;
			case VM_MONITORING_DISABLED_VALUE: return VM_MONITORING_DISABLED;
			case VM_MONITORING_ONLY_VALUE: return VM_MONITORING_ONLY;
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
	private ClusterDasConfigInfoVmMonitoringState(int value, String name, String literal) {
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
	
} //ClusterDasConfigInfoVmMonitoringState
