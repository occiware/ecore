/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Microsoft Hyper V</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_location <em>Boot2docker location</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch <em>Virtual switch</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V()
 * @model
 * @generated
 */
public interface Machine_Microsoft_Hyper_V extends Machine {

	/**
	 * Returns the value of the '<em><b>Boot2docker location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker location</em>' attribute.
	 * @see #setBoot2docker_location(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Boot2docker_location()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Hyper_V!boot2docker_location'"
	 * @generated
	 */
	String getBoot2docker_location();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_location <em>Boot2docker location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker location</em>' attribute.
	 * @see #getBoot2docker_location()
	 * @generated
	 */
	void setBoot2docker_location(String value);

	/**
	 * Returns the value of the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker url</em>' attribute.
	 * @see #setBoot2docker_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Boot2docker_url()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Hyper_V!boot2docker_url'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Hyper_V!disk_size'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Virtual switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual switch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual switch</em>' attribute.
	 * @see #setVirtual_switch(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Hyper_V_Virtual_switch()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Hyper_V!virtual_switch'"
	 * @generated
	 */
	String getVirtual_switch();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch <em>Virtual switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual switch</em>' attribute.
	 * @see #getVirtual_switch()
	 * @generated
	 */
	void setVirtual_switch(String value);
} // Machine_Microsoft_Hyper_V
