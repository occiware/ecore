/**
 */
package org.occiware.clouddesigner.occi.hypervisor;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getSource <em>Source</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getParallel()
 * @model annotation="OCCIE2Ecore title='Parallel resource'"
 * @generated
 */
public interface Parallel extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"parallel"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getParallel_Name()
	 * @model default="parallel" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The parallel resource name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getParallel_Source()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getParallel_Target()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Parallel#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // Parallel
