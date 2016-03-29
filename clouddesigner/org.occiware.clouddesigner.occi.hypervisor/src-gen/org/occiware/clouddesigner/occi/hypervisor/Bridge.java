/**
 */
package org.occiware.clouddesigner.occi.hypervisor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Bridge#getSource_bridge <em>Source bridge</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getBridge()
 * @model annotation="OCCIE2Ecore title='Bridge interface'"
 * @generated
 */
public interface Bridge extends Interface {
	/**
	 * Returns the value of the '<em><b>Source bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source bridge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source bridge</em>' attribute.
	 * @see #setSource_bridge(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getBridge_Source_bridge()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSource_bridge();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Bridge#getSource_bridge <em>Source bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source bridge</em>' attribute.
	 * @see #getSource_bridge()
	 * @generated
	 */
	void setSource_bridge(String value);

} // Bridge
