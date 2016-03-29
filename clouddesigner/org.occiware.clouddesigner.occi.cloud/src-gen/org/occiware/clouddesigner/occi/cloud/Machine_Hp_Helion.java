/**
 */
package org.occiware.clouddesigner.occi.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Hp Helion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getKey_pair <em>Key pair</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFloating_ip <em>Floating ip</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion()
 * @model annotation="OCCIE2Ecore title='Machine on HP Helion'"
 * @generated
 */
public interface Machine_Hp_Helion extends Machine {
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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Provider()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Tenant()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Access_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getAccess_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getAccess_key <em>Access key</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Secret_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSecret_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecret_key <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret key</em>' attribute.
	 * @see #getSecret_key()
	 * @generated
	 */
	void setSecret_key(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Image()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Zone()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor id</em>' attribute.
	 * @see #setFlavor_id(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Flavor_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getFlavor_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFlavor_id <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor id</em>' attribute.
	 * @see #getFlavor_id()
	 * @generated
	 */
	void setFlavor_id(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Key_pair()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getKey_pair();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getKey_pair <em>Key pair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key pair</em>' attribute.
	 * @see #getKey_pair()
	 * @generated
	 */
	void setKey_pair(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Security_group()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSecurity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getSecurity_group <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group</em>' attribute.
	 * @see #getSecurity_group()
	 * @generated
	 */
	void setSecurity_group(String value);

	/**
	 * Returns the value of the '<em><b>Floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating ip</em>' attribute.
	 * @see #setFloating_ip(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_Hp_Helion_Floating_ip()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getFloating_ip();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion#getFloating_ip <em>Floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating ip</em>' attribute.
	 * @see #getFloating_ip()
	 * @generated
	 */
	void setFloating_ip(String value);

} // Machine_Hp_Helion
