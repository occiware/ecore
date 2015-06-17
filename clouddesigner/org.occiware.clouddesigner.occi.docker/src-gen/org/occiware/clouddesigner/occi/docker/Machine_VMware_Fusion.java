/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine VMware Fusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getMemory_size <em>Memory size</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_Fusion()
 * @model
 * @generated
 */
public interface Machine_VMware_Fusion extends Machine {
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_Fusion_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_Fusion!boot2docker_url'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_Fusion_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_Fusion!disk_size'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Memory size</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory size</em>' attribute.
	 * @see #setMemory_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_Fusion_Memory_size()
	 * @model default="1024" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_Fusion!memory_size'"
	 * @generated
	 */
	int getMemory_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getMemory_size <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size</em>' attribute.
	 * @see #getMemory_size()
	 * @generated
	 */
	void setMemory_size(int value);

} // Machine_VMware_Fusion
