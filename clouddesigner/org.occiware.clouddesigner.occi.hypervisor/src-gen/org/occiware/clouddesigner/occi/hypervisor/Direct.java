/**
 */
package org.occiware.clouddesigner.occi.hypervisor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_dev <em>Source dev</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_mode <em>Source mode</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDirect()
 * @model annotation="OCCIE2Ecore title='Direct Interface'"
 * @generated
 */
public interface Direct extends Interface {
	/**
	 * Returns the value of the '<em><b>Source dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source dev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source dev</em>' attribute.
	 * @see #setSource_dev(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDirect_Source_dev()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSource_dev();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_dev <em>Source dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source dev</em>' attribute.
	 * @see #getSource_dev()
	 * @generated
	 */
	void setSource_dev(String value);

	/**
	 * Returns the value of the '<em><b>Source mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source mode</em>' attribute.
	 * @see #setSource_mode(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDirect_Source_mode()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSource_mode();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Direct#getSource_mode <em>Source mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source mode</em>' attribute.
	 * @see #getSource_mode()
	 * @generated
	 */
	void setSource_mode(String value);

} // Direct
