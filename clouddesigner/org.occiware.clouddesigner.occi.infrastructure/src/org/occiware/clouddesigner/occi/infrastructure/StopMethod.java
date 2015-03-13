/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stop Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStopMethod()
 * @model
 * @generated
 */
public enum StopMethod implements Enumerator {
	/**
	 * The '<em><b>Graceful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRACEFUL_VALUE
	 * @generated
	 * @ordered
	 */
	GRACEFUL(0, "graceful", "graceful"),

	/**
	 * The '<em><b>Acpioff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACPIOFF_VALUE
	 * @generated
	 * @ordered
	 */
	ACPIOFF(1, "acpioff", "acpioff"),

	/**
	 * The '<em><b>Poweroff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWEROFF_VALUE
	 * @generated
	 * @ordered
	 */
	POWEROFF(2, "poweroff", "poweroff");

	/**
	 * The '<em><b>Graceful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graceful</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRACEFUL
	 * @model name="graceful"
	 * @generated
	 * @ordered
	 */
	public static final int GRACEFUL_VALUE = 0;

	/**
	 * The '<em><b>Acpioff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acpioff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACPIOFF
	 * @model name="acpioff"
	 * @generated
	 * @ordered
	 */
	public static final int ACPIOFF_VALUE = 1;

	/**
	 * The '<em><b>Poweroff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poweroff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWEROFF
	 * @model name="poweroff"
	 * @generated
	 * @ordered
	 */
	public static final int POWEROFF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Stop Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StopMethod[] VALUES_ARRAY =
		new StopMethod[] {
			GRACEFUL,
			ACPIOFF,
			POWEROFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Stop Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StopMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stop Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopMethod get(int value) {
		switch (value) {
			case GRACEFUL_VALUE: return GRACEFUL;
			case ACPIOFF_VALUE: return ACPIOFF;
			case POWEROFF_VALUE: return POWEROFF;
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
	private StopMethod(int value, String name, String literal) {
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
	
} //StopMethod
