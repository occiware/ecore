/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine VMware vSphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCompute_ip <em>Compute ip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatacenter <em>Datacenter</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPool <em>Pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getVcenter <em>Vcenter</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere()
 * @model
 * @generated
 */
public interface Machine_VMware_vSphere extends Machine {

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Username()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getUsername <em>Username</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Password()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!boot2docker_url'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Compute ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compute ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compute ip</em>' attribute.
	 * @see #setCompute_ip(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Compute_ip()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!compute_ip'"
	 * @generated
	 */
	String getCompute_ip();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCompute_ip <em>Compute ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compute ip</em>' attribute.
	 * @see #getCompute_ip()
	 * @generated
	 */
	void setCompute_ip(String value);

	/**
	 * Returns the value of the '<em><b>Cpu count</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu count</em>' attribute.
	 * @see #setCpu_count(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Cpu_count()
	 * @model default="2" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!cpu_count'"
	 * @generated
	 */
	int getCpu_count();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCpu_count <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu count</em>' attribute.
	 * @see #getCpu_count()
	 * @generated
	 */
	void setCpu_count(int value);

	/**
	 * Returns the value of the '<em><b>Datacenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacenter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacenter</em>' attribute.
	 * @see #setDatacenter(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Datacenter()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!datacenter'"
	 * @generated
	 */
	String getDatacenter();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatacenter <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter</em>' attribute.
	 * @see #getDatacenter()
	 * @generated
	 */
	void setDatacenter(String value);

	/**
	 * Returns the value of the '<em><b>Datastore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastore</em>' attribute.
	 * @see #setDatastore(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Datastore()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!datastore'"
	 * @generated
	 */
	String getDatastore();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatastore <em>Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastore</em>' attribute.
	 * @see #getDatastore()
	 * @generated
	 */
	void setDatastore(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!disk_size'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Memory size</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory size</em>' attribute.
	 * @see #setMemory_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Memory_size()
	 * @model default="2048" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!memory_size'"
	 * @generated
	 */
	int getMemory_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getMemory_size <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size</em>' attribute.
	 * @see #getMemory_size()
	 * @generated
	 */
	void setMemory_size(int value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Network()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!network'"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' attribute.
	 * @see #setPool(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Pool()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!pool'"
	 * @generated
	 */
	String getPool();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPool <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' attribute.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(String value);

	/**
	 * Returns the value of the '<em><b>Vcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcenter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcenter</em>' attribute.
	 * @see #setVcenter(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vSphere_Vcenter()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vSphere!vcenter'"
	 * @generated
	 */
	String getVcenter();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getVcenter <em>Vcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcenter</em>' attribute.
	 * @see #getVcenter()
	 * @generated
	 */
	void setVcenter(String value);
} // Machine_VMware_vSphere
