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
 * A representation of the literals of the enumeration '<em><b>Host Capability Ft Unsupported Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostCapabilityFtUnsupportedReason()
 * @model
 * @generated
 */
public enum HostCapabilityFtUnsupportedReason implements Enumerator {
	/**
	 * The '<em><b>Cpu Hv Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_HV_DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_HV_DISABLED(0, "cpuHvDisabled", "cpuHvDisabled"),

	/**
	 * The '<em><b>Cpu Hv Unsupported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_HV_UNSUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_HV_UNSUPPORTED(1, "cpuHvUnsupported", "cpuHvUnsupported"),

	/**
	 * The '<em><b>Cpu Hwmmu Unsupported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_HWMMU_UNSUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_HWMMU_UNSUPPORTED(2, "cpuHwmmuUnsupported", "cpuHwmmuUnsupported"),

	/**
	 * The '<em><b>Ft Not Licensed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FT_NOT_LICENSED_VALUE
	 * @generated
	 * @ordered
	 */
	FT_NOT_LICENSED(3, "ftNotLicensed", "ftNotLicensed"),

	/**
	 * The '<em><b>Ha Agent Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HA_AGENT_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	HA_AGENT_ISSUE(4, "haAgentIssue", "haAgentIssue"),

	/**
	 * The '<em><b>Missing FT Logging Nic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_FT_LOGGING_NIC_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING_FT_LOGGING_NIC(5, "missingFTLoggingNic", "missingFTLoggingNic"),

	/**
	 * The '<em><b>Missing VMotion Nic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_VMOTION_NIC_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING_VMOTION_NIC(6, "missingVMotionNic", "missingVMotionNic"),

	/**
	 * The '<em><b>Unsupported Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED_PRODUCT(7, "unsupportedProduct", "unsupportedProduct"),

	/**
	 * The '<em><b>VMotion Not Licensed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMOTION_NOT_LICENSED_VALUE
	 * @generated
	 * @ordered
	 */
	VMOTION_NOT_LICENSED(8, "vMotionNotLicensed", "vMotionNotLicensed");

	/**
	 * The '<em><b>Cpu Hv Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cpu Hv Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_HV_DISABLED
	 * @model name="cpuHvDisabled"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_HV_DISABLED_VALUE = 0;

	/**
	 * The '<em><b>Cpu Hv Unsupported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cpu Hv Unsupported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_HV_UNSUPPORTED
	 * @model name="cpuHvUnsupported"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_HV_UNSUPPORTED_VALUE = 1;

	/**
	 * The '<em><b>Cpu Hwmmu Unsupported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cpu Hwmmu Unsupported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_HWMMU_UNSUPPORTED
	 * @model name="cpuHwmmuUnsupported"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_HWMMU_UNSUPPORTED_VALUE = 2;

	/**
	 * The '<em><b>Ft Not Licensed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ft Not Licensed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FT_NOT_LICENSED
	 * @model name="ftNotLicensed"
	 * @generated
	 * @ordered
	 */
	public static final int FT_NOT_LICENSED_VALUE = 3;

	/**
	 * The '<em><b>Ha Agent Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ha Agent Issue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HA_AGENT_ISSUE
	 * @model name="haAgentIssue"
	 * @generated
	 * @ordered
	 */
	public static final int HA_AGENT_ISSUE_VALUE = 4;

	/**
	 * The '<em><b>Missing FT Logging Nic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Missing FT Logging Nic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISSING_FT_LOGGING_NIC
	 * @model name="missingFTLoggingNic"
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_FT_LOGGING_NIC_VALUE = 5;

	/**
	 * The '<em><b>Missing VMotion Nic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Missing VMotion Nic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISSING_VMOTION_NIC
	 * @model name="missingVMotionNic"
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VMOTION_NIC_VALUE = 6;

	/**
	 * The '<em><b>Unsupported Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsupported Product</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_PRODUCT
	 * @model name="unsupportedProduct"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_PRODUCT_VALUE = 7;

	/**
	 * The '<em><b>VMotion Not Licensed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VMotion Not Licensed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMOTION_NOT_LICENSED
	 * @model name="vMotionNotLicensed"
	 * @generated
	 * @ordered
	 */
	public static final int VMOTION_NOT_LICENSED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Host Capability Ft Unsupported Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HostCapabilityFtUnsupportedReason[] VALUES_ARRAY =
		new HostCapabilityFtUnsupportedReason[] {
			CPU_HV_DISABLED,
			CPU_HV_UNSUPPORTED,
			CPU_HWMMU_UNSUPPORTED,
			FT_NOT_LICENSED,
			HA_AGENT_ISSUE,
			MISSING_FT_LOGGING_NIC,
			MISSING_VMOTION_NIC,
			UNSUPPORTED_PRODUCT,
			VMOTION_NOT_LICENSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Host Capability Ft Unsupported Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HostCapabilityFtUnsupportedReason> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Host Capability Ft Unsupported Reason</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostCapabilityFtUnsupportedReason get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostCapabilityFtUnsupportedReason result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host Capability Ft Unsupported Reason</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostCapabilityFtUnsupportedReason getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostCapabilityFtUnsupportedReason result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host Capability Ft Unsupported Reason</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostCapabilityFtUnsupportedReason get(int value) {
		switch (value) {
			case CPU_HV_DISABLED_VALUE: return CPU_HV_DISABLED;
			case CPU_HV_UNSUPPORTED_VALUE: return CPU_HV_UNSUPPORTED;
			case CPU_HWMMU_UNSUPPORTED_VALUE: return CPU_HWMMU_UNSUPPORTED;
			case FT_NOT_LICENSED_VALUE: return FT_NOT_LICENSED;
			case HA_AGENT_ISSUE_VALUE: return HA_AGENT_ISSUE;
			case MISSING_FT_LOGGING_NIC_VALUE: return MISSING_FT_LOGGING_NIC;
			case MISSING_VMOTION_NIC_VALUE: return MISSING_VMOTION_NIC;
			case UNSUPPORTED_PRODUCT_VALUE: return UNSUPPORTED_PRODUCT;
			case VMOTION_NOT_LICENSED_VALUE: return VMOTION_NOT_LICENSED;
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
	private HostCapabilityFtUnsupportedReason(int value, String name, String literal) {
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
	
} //HostCapabilityFtUnsupportedReason
