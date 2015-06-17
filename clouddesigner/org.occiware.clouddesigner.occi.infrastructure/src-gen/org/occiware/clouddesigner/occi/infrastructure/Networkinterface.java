/**
 */
package org.occiware.clouddesigner.occi.infrastructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networkinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac <em>Mac</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface()
 * @model
 * @generated
 */
public interface Networkinterface extends org.occiware.clouddesigner.occi.Link {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_Interface()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Networkinterface!interface'"
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_Mac()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Networkinterface!mac'"
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @see #setState(NetworkInterfaceStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getNetworkinterface_State()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Networkinterface!state'"
	 * @generated
	 */
	NetworkInterfaceStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(NetworkInterfaceStatus value);

} // Networkinterface
