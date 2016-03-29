/**
 */
package org.occiware.clouddesigner.occi.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Amazon EC2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getKey_pair <em>Key pair</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2()
 * @model annotation="OCCIE2Ecore title='Machine on Amazon EC2'"
 * @generated
 */
public interface Machine_Amazon_EC2 extends Machine {
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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Provider()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access key</em>' attribute.
	 * @see #setAccess_key(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Access_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getAccess_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access key</em>' attribute.
	 * @see #getAccess_key()
	 * @generated
	 */
	void setAccess_key(String value);

	/**
	 * Returns the value of the '<em><b>Secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret key</em>' attribute.
	 * @see #setSecret_key(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Secret_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSecret_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret key</em>' attribute.
	 * @see #getSecret_key()
	 * @generated
	 */
	void setSecret_key(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Image()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security group</em>' attribute.
	 * @see #setSecurity_group(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Security_group()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSecurity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group</em>' attribute.
	 * @see #getSecurity_group()
	 * @generated
	 */
	void setSecurity_group(String value);

	/**
	 * Returns the value of the '<em><b>Key pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key pair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key pair</em>' attribute.
	 * @see #setKey_pair(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Amazon_EC2_Key_pair()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getKey_pair();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2#getKey_pair <em>Key pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key pair</em>' attribute.
	 * @see #getKey_pair()
	 * @generated
	 */
	void setKey_pair(String value);

} // Machine_Amazon_EC2
