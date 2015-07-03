/**
 */
package org.occiware.clouddesigner.occi.hypervisor;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getBoot <em>Boot</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOs_type <em>Os type</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Compute {
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
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Boot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot</em>' attribute.
	 * @see #setBoot(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine_Boot()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getBoot();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getBoot <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot</em>' attribute.
	 * @see #getBoot()
	 * @generated
	 */
	void setBoot(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine_Uuid()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"localtime"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine_Offset()
	 * @model default="localtime" dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Os type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os type</em>' attribute.
	 * @see #setOs_type(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getMachine_Os_type()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getOs_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Machine#getOs_type <em>Os type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os type</em>' attribute.
	 * @see #getOs_type()
	 * @generated
	 */
	void setOs_type(String value);

} // Machine
