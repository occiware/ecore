/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.OCCI.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getVlan <em>Vlan</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getLabel <em>Label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Resource {
	/**
	 * Returns the value of the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vlan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vlan</em>' attribute.
	 * @see #setVlan(int)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork_Vlan()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.Integer4095"
	 * @generated
	 */
	int getVlan();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getVlan <em>Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vlan</em>' attribute.
	 * @see #getVlan()
	 * @generated
	 */
	void setVlan(int value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork_Label()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.Token"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #setState(ComputeStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork_State()
	 * @model
	 * @generated
	 */
	ComputeStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(ComputeStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void down();

} // Network
