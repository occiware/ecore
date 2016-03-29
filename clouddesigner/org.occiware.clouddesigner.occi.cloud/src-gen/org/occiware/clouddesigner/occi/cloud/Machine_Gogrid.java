/**
 */
package org.occiware.clouddesigner.occi.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Gogrid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getKey <em>Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getShared_secret <em>Shared secret</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getImage_id <em>Image id</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Gogrid()
 * @model annotation="OCCIE2Ecore title='Machine on Gogrid'"
 * @generated
 */
public interface Machine_Gogrid extends Machine {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Gogrid_Provider()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Gogrid_Key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Shared secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared secret</em>' attribute.
	 * @see #setShared_secret(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Gogrid_Shared_secret()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getShared_secret();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getShared_secret <em>Shared secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared secret</em>' attribute.
	 * @see #getShared_secret()
	 * @generated
	 */
	void setShared_secret(String value);

	/**
	 * Returns the value of the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image id</em>' attribute.
	 * @see #setImage_id(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Gogrid_Image_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Gogrid#getImage_id <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image id</em>' attribute.
	 * @see #getImage_id()
	 * @generated
	 */
	void setImage_id(String value);

} // Machine_Gogrid
