/**
 */
package org.occiware.clouddesigner.occi.hypervisor;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getTarget_dev <em>Target dev</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getScript_path <em>Script path</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getEthernet()
 * @model
 * @generated
 */
public interface Ethernet extends Resource {
	/**
	 * Returns the value of the '<em><b>Target dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target dev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target dev</em>' attribute.
	 * @see #setTarget_dev(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getEthernet_Target_dev()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getTarget_dev();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getTarget_dev <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target dev</em>' attribute.
	 * @see #getTarget_dev()
	 * @generated
	 */
	void setTarget_dev(String value);

	/**
	 * Returns the value of the '<em><b>Script path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script path</em>' attribute.
	 * @see #setScript_path(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getEthernet_Script_path()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getScript_path();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Ethernet#getScript_path <em>Script path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script path</em>' attribute.
	 * @see #getScript_path()
	 * @generated
	 */
	void setScript_path(String value);

} // Ethernet
