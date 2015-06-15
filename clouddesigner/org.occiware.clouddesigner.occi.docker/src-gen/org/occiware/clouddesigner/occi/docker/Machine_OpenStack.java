/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url <em>Auth url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name <em>Tenant name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type <em>Endpoint type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id <em>Net id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups <em>Sec groups</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool <em>Floatingip pool</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack()
 * @model
 * @generated
 */
public interface Machine_OpenStack extends Machine {
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Flavor_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!flavor_id'"
	 * @generated
	 */
	String getFlavor_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor id</em>' attribute.
	 * @see #getFlavor_id()
	 * @generated
	 */
	void setFlavor_id(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Image_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!image_id'"
	 * @generated
	 */
	String getImage_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image id</em>' attribute.
	 * @see #getImage_id()
	 * @generated
	 */
	void setImage_id(String value);

	/**
	 * Returns the value of the '<em><b>Auth url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth url</em>' attribute.
	 * @see #setAuth_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Auth_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!auth_url'"
	 * @generated
	 */
	String getAuth_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth url</em>' attribute.
	 * @see #getAuth_url()
	 * @generated
	 */
	void setAuth_url(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Username()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername <em>Username</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Password()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Tenant name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant name</em>' attribute.
	 * @see #setTenant_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Tenant_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!tenant_name'"
	 * @generated
	 */
	String getTenant_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant name</em>' attribute.
	 * @see #getTenant_name()
	 * @generated
	 */
	void setTenant_name(String value);

	/**
	 * Returns the value of the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant id</em>' attribute.
	 * @see #setTenant_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Tenant_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!tenant_id'"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint type</em>' attribute.
	 * @see #setEndpoint_type(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Endpoint_type()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!endpoint_type'"
	 * @generated
	 */
	String getEndpoint_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint type</em>' attribute.
	 * @see #getEndpoint_type()
	 * @generated
	 */
	void setEndpoint_type(String value);

	/**
	 * Returns the value of the '<em><b>Net id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net id</em>' attribute.
	 * @see #setNet_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Net_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!net_id'"
	 * @generated
	 */
	String getNet_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net id</em>' attribute.
	 * @see #getNet_id()
	 * @generated
	 */
	void setNet_id(String value);

	/**
	 * Returns the value of the '<em><b>Sec groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec groups</em>' attribute.
	 * @see #setSec_groups(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Sec_groups()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!sec_groups'"
	 * @generated
	 */
	String getSec_groups();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec groups</em>' attribute.
	 * @see #getSec_groups()
	 * @generated
	 */
	void setSec_groups(String value);

	/**
	 * Returns the value of the '<em><b>Floatingip pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatingip pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatingip pool</em>' attribute.
	 * @see #setFloatingip_pool(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Floatingip_pool()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_OpenStack!floatingip_pool'"
	 * @generated
	 */
	String getFloatingip_pool();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floatingip pool</em>' attribute.
	 * @see #getFloatingip_pool()
	 * @generated
	 */
	void setFloatingip_pool(String value);

} // Machine_OpenStack
