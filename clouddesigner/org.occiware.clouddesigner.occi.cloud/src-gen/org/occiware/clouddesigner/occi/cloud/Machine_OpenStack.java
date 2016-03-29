/**
 */
package org.occiware.clouddesigner.occi.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_name <em>Flavor name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_name <em>Network name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFloating_ip_pool <em>Floating ip pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_name <em>Image name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getKeypair <em>Keypair</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack()
 * @model annotation="OCCIE2Ecore title='Machine on OpenStack'"
 * @generated
 */
public interface Machine_OpenStack extends Machine {
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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Provider()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getProvider <em>Provider</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Tenant()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Username()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Password()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Endpoint()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Image_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_id <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image id</em>' attribute.
	 * @see #getImage_id()
	 * @generated
	 */
	void setImage_id(String value);

	/**
	 * Returns the value of the '<em><b>Flavor name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor name</em>' attribute.
	 * @see #setFlavor_name(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Flavor_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getFlavor_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_name <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor name</em>' attribute.
	 * @see #getFlavor_name()
	 * @generated
	 */
	void setFlavor_name(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Flavor_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getFlavor_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor id</em>' attribute.
	 * @see #getFlavor_id()
	 * @generated
	 */
	void setFlavor_id(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Security_group()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSecurity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getSecurity_group <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group</em>' attribute.
	 * @see #getSecurity_group()
	 * @generated
	 */
	void setSecurity_group(String value);

	/**
	 * Returns the value of the '<em><b>Network name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network name</em>' attribute.
	 * @see #setNetwork_name(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Network_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getNetwork_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_name <em>Network name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network name</em>' attribute.
	 * @see #getNetwork_name()
	 * @generated
	 */
	void setNetwork_name(String value);

	/**
	 * Returns the value of the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network id</em>' attribute.
	 * @see #setNetwork_id(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Network_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

	/**
	 * Returns the value of the '<em><b>Floating ip pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating ip pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating ip pool</em>' attribute.
	 * @see #setFloating_ip_pool(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Floating_ip_pool()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getFloating_ip_pool();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getFloating_ip_pool <em>Floating ip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating ip pool</em>' attribute.
	 * @see #getFloating_ip_pool()
	 * @generated
	 */
	void setFloating_ip_pool(String value);

	/**
	 * Returns the value of the '<em><b>Image name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image name</em>' attribute.
	 * @see #setImage_name(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Image_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImage_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getImage_name <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image name</em>' attribute.
	 * @see #getImage_name()
	 * @generated
	 */
	void setImage_name(String value);

	/**
	 * Returns the value of the '<em><b>Keypair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keypair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keypair</em>' attribute.
	 * @see #setKeypair(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Keypair()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getKeypair();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getKeypair <em>Keypair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keypair</em>' attribute.
	 * @see #getKeypair()
	 * @generated
	 */
	void setKeypair(String value);

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_OpenStack_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

} // Machine_OpenStack
