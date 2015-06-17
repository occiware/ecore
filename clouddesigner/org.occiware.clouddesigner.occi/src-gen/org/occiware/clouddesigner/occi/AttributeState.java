/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.AttributeState#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.AttributeState#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getAttributeState()
 * @model
 * @generated
 */
public interface AttributeState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getAttributeState_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!AttributeState!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.AttributeState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getAttributeState_Value()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!AttributeState!value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.AttributeState#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeState
