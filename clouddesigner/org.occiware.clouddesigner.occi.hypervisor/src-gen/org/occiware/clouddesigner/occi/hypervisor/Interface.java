/**
 */
package org.occiware.clouddesigner.occi.hypervisor;

import org.occiware.clouddesigner.occi.infrastructure.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getType <em>Type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getModel <em>Model</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getMac_addresss <em>Mac addresss</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Network {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"interface"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface_Name()
	 * @model default="interface" dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface_Type()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface_Model()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Mac addresss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac addresss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac addresss</em>' attribute.
	 * @see #setMac_addresss(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface_Mac_addresss()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getMac_addresss();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getMac_addresss <em>Mac addresss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac addresss</em>' attribute.
	 * @see #getMac_addresss()
	 * @generated
	 */
	void setMac_addresss(String value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getInterface_Route()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getRoute();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Interface#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(String value);

} // Interface
