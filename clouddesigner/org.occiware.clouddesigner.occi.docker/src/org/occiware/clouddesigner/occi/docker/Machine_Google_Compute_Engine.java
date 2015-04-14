/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Google Compute Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type <em>Machine type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name <em>Instance name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine()
 * @model
 * @generated
 */
public interface Machine_Google_Compute_Engine extends Machine {

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>"us-central1-a"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Zone()
	 * @model default="us-central1-a"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Google_Compute_Engine!zone'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Machine type</b></em>' attribute.
	 * The default value is <code>"f1-micro"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine type</em>' attribute.
	 * @see #setMachine_type(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Machine_type()
	 * @model default="f1-micro"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Google_Compute_Engine!machine_type'"
	 * @generated
	 */
	String getMachine_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine type</em>' attribute.
	 * @see #getMachine_type()
	 * @generated
	 */
	void setMachine_type(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"docker-user"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Username()
	 * @model default="docker-user"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Google_Compute_Engine!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Instance name</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance name</em>' attribute.
	 * @see #setInstance_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Instance_name()
	 * @model default="docker-machine"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Google_Compute_Engine!instance_name'"
	 * @generated
	 */
	String getInstance_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name <em>Instance name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance name</em>' attribute.
	 * @see #getInstance_name()
	 * @generated
	 */
	void setInstance_name(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Google_Compute_Engine_Project()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Google_Compute_Engine!project'"
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);
} // Machine_Google_Compute_Engine
