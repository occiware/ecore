/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine VMware vCloud Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalogitem <em>Catalogitem</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getComputeid <em>Computeid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getDocker_port <em>Docker port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getEdgegateway <em>Edgegateway</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVapp_name <em>Vapp name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getOrgvdcnetwork <em>Orgvdcnetwork</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#isProvision <em>Provision</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPublicip <em>Publicip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getSsh_port <em>Ssh port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVdcid <em>Vdcid</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air()
 * @model
 * @generated
 */
public interface Machine_VMware_vCloud_Air extends Machine {

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Username()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!username'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getUsername <em>Username</em>}' attribute.
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Password()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * The default value is <code>"Public Catalog"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Catalog()
	 * @model default="Public Catalog" dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Catalogitem</b></em>' attribute.
	 * The default value is <code>"Ubuntu Server 12.04 LTS (amd64 20140927)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogitem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogitem</em>' attribute.
	 * @see #setCatalogitem(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Catalogitem()
	 * @model default="Ubuntu Server 12.04 LTS (amd64 20140927)" dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!catalogitem'"
	 * @generated
	 */
	String getCatalogitem();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalogitem <em>Catalogitem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogitem</em>' attribute.
	 * @see #getCatalogitem()
	 * @generated
	 */
	void setCatalogitem(String value);

	/**
	 * Returns the value of the '<em><b>Computeid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computeid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computeid</em>' attribute.
	 * @see #setComputeid(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Computeid()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!computeid'"
	 * @generated
	 */
	String getComputeid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getComputeid <em>Computeid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computeid</em>' attribute.
	 * @see #getComputeid()
	 * @generated
	 */
	void setComputeid(String value);

	/**
	 * Returns the value of the '<em><b>Cpu count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu count</em>' attribute.
	 * @see #setCpu_count(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Cpu_count()
	 * @model default="1" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!cpu_count'"
	 * @generated
	 */
	int getCpu_count();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCpu_count <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu count</em>' attribute.
	 * @see #getCpu_count()
	 * @generated
	 */
	void setCpu_count(int value);

	/**
	 * Returns the value of the '<em><b>Docker port</b></em>' attribute.
	 * The default value is <code>"2376"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker port</em>' attribute.
	 * @see #setDocker_port(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Docker_port()
	 * @model default="2376" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!docker_port'"
	 * @generated
	 */
	int getDocker_port();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getDocker_port <em>Docker port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker port</em>' attribute.
	 * @see #getDocker_port()
	 * @generated
	 */
	void setDocker_port(int value);

	/**
	 * Returns the value of the '<em><b>Edgegateway</b></em>' attribute.
	 * The default value is <code>"<vdcid>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edgegateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edgegateway</em>' attribute.
	 * @see #setEdgegateway(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Edgegateway()
	 * @model default="<vdcid>" dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!edgegateway'"
	 * @generated
	 */
	String getEdgegateway();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getEdgegateway <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edgegateway</em>' attribute.
	 * @see #getEdgegateway()
	 * @generated
	 */
	void setEdgegateway(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Memory_size()
	 * @model default="2048" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!memory_size'"
	 * @generated
	 */
	int getMemory_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getMemory_size <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory size</em>' attribute.
	 * @see #getMemory_size()
	 * @generated
	 */
	void setMemory_size(int value);

	/**
	 * Returns the value of the '<em><b>Vapp name</b></em>' attribute.
	 * The default value is <code>"<autogenerated>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapp name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapp name</em>' attribute.
	 * @see #setVapp_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Vapp_name()
	 * @model default="<autogenerated>" dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!vapp_name'"
	 * @generated
	 */
	String getVapp_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVapp_name <em>Vapp name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapp name</em>' attribute.
	 * @see #getVapp_name()
	 * @generated
	 */
	void setVapp_name(String value);

	/**
	 * Returns the value of the '<em><b>Orgvdcnetwork</b></em>' attribute.
	 * The default value is <code>"<vdcid>-default-routed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orgvdcnetwork</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orgvdcnetwork</em>' attribute.
	 * @see #setOrgvdcnetwork(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Orgvdcnetwork()
	 * @model default="<vdcid>-default-routed" dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!orgvdcnetwork'"
	 * @generated
	 */
	String getOrgvdcnetwork();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getOrgvdcnetwork <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orgvdcnetwork</em>' attribute.
	 * @see #getOrgvdcnetwork()
	 * @generated
	 */
	void setOrgvdcnetwork(String value);

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provision</em>' attribute.
	 * @see #setProvision(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Provision()
	 * @model default="true" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!provision'"
	 * @generated
	 */
	boolean isProvision();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#isProvision <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provision</em>' attribute.
	 * @see #isProvision()
	 * @generated
	 */
	void setProvision(boolean value);

	/**
	 * Returns the value of the '<em><b>Publicip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicip</em>' attribute.
	 * @see #setPublicip(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Publicip()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!publicip'"
	 * @generated
	 */
	String getPublicip();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPublicip <em>Publicip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicip</em>' attribute.
	 * @see #getPublicip()
	 * @generated
	 */
	void setPublicip(String value);

	/**
	 * Returns the value of the '<em><b>Ssh port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh port</em>' attribute.
	 * @see #setSsh_port(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Ssh_port()
	 * @model default="22" dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!ssh_port'"
	 * @generated
	 */
	int getSsh_port();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getSsh_port <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh port</em>' attribute.
	 * @see #getSsh_port()
	 * @generated
	 */
	void setSsh_port(int value);

	/**
	 * Returns the value of the '<em><b>Vdcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vdcid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vdcid</em>' attribute.
	 * @see #setVdcid(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VMware_vCloud_Air_Vdcid()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VMware_vCloud_Air!vdcid'"
	 * @generated
	 */
	String getVdcid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVdcid <em>Vdcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdcid</em>' attribute.
	 * @see #getVdcid()
	 * @generated
	 */
	void setVdcid(String value);
} // Machine_VMware_vCloud_Air
