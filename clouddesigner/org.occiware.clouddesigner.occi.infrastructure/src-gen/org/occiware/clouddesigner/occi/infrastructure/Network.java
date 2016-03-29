/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.occi.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getVlan <em>Vlan</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getLabel <em>Label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Network#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork()
 * @model annotation="OCCIE2Ecore title='Network Resource'"
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
	 *        annotation="OCCIE2Ecore description='802.1q VLAN Identifier (e.g. 343)'"
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
	 *        annotation="OCCIE2Ecore description='Tag based VLANs (e.g. external-dmz)'"
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
	 * The default value is <code>"inactive"</code>.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.NetworkStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkStatus
	 * @see #setState(NetworkStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetwork_State()
	 * @model default="inactive" required="true"
	 *        annotation="OCCIE2Ecore description='Current state of the instance'"
	 * @generated
	 */
	NetworkStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Network#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(NetworkStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void down();

} // Network
