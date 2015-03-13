/**
 */
package org.occiware.clouddesigner.occi.docker;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getContainerid <em>Containerid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getBuild <em>Build</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCommand <em>Command</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getExpose <em>Expose</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getEnv_file <em>Env file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getNet <em>Net</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getDns <em>Dns</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getDns_search <em>Dns search</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCap_add <em>Cap add</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCap_drop <em>Cap drop</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getWorking_dir <em>Working dir</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getUser <em>User</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getDomainname <em>Domainname</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getMem_limit <em>Mem limit</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isPrivileged <em>Privileged</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isStdin_open <em>Stdin open</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isTty <em>Tty</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_shares <em>Cpu shares</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getPid <em>Pid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getIpc <em>Ipc</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getAdd_host <em>Add host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isRm <em>Rm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getSecurity_opt <em>Security opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getDevice <em>Device</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getLxc_conf <em>Lxc conf</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCpuset <em>Cpuset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Compute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Name()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Containerid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containerid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containerid</em>' attribute.
	 * @see #setContainerid(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Containerid()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getContainerid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getContainerid <em>Containerid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containerid</em>' attribute.
	 * @see #getContainerid()
	 * @generated
	 */
	void setContainerid(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Image()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' attribute.
	 * @see #setBuild(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Build()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getBuild();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getBuild <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' attribute.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Command()
	 * @model default="" dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute.
	 * @see #setPorts(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Ports()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getPorts();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getPorts <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' attribute.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(String value);

	/**
	 * Returns the value of the '<em><b>Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose</em>' attribute.
	 * @see #setExpose(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Expose()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getExpose();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getExpose <em>Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expose</em>' attribute.
	 * @see #getExpose()
	 * @generated
	 */
	void setExpose(String value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' attribute.
	 * @see #setVolumes(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Volumes()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getVolumes();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getVolumes <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' attribute.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Environment()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Env file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env file</em>' attribute.
	 * @see #setEnv_file(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Env_file()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getEnv_file();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getEnv_file <em>Env file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env file</em>' attribute.
	 * @see #getEnv_file()
	 * @generated
	 */
	void setEnv_file(String value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' attribute.
	 * @see #setNet(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Net()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getNet();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getNet <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' attribute.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(String value);

	/**
	 * Returns the value of the '<em><b>Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns</em>' attribute.
	 * @see #setDns(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Dns()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getDns();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getDns <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns</em>' attribute.
	 * @see #getDns()
	 * @generated
	 */
	void setDns(String value);

	/**
	 * Returns the value of the '<em><b>Dns search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns search</em>' attribute.
	 * @see #setDns_search(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Dns_search()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getDns_search();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getDns_search <em>Dns search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns search</em>' attribute.
	 * @see #getDns_search()
	 * @generated
	 */
	void setDns_search(String value);

	/**
	 * Returns the value of the '<em><b>Cap add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap add</em>' attribute.
	 * @see #setCap_add(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cap_add()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getCap_add();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCap_add <em>Cap add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap add</em>' attribute.
	 * @see #getCap_add()
	 * @generated
	 */
	void setCap_add(String value);

	/**
	 * Returns the value of the '<em><b>Cap drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap drop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap drop</em>' attribute.
	 * @see #setCap_drop(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cap_drop()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getCap_drop();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCap_drop <em>Cap drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap drop</em>' attribute.
	 * @see #getCap_drop()
	 * @generated
	 */
	void setCap_drop(String value);

	/**
	 * Returns the value of the '<em><b>Working dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working dir</em>' attribute.
	 * @see #setWorking_dir(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Working_dir()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getWorking_dir();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getWorking_dir <em>Working dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working dir</em>' attribute.
	 * @see #getWorking_dir()
	 * @generated
	 */
	void setWorking_dir(String value);

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrypoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute.
	 * @see #setEntrypoint(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Entrypoint()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getEntrypoint();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getEntrypoint <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' attribute.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_User()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Domainname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domainname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainname</em>' attribute.
	 * @see #setDomainname(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Domainname()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getDomainname();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getDomainname <em>Domainname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainname</em>' attribute.
	 * @see #getDomainname()
	 * @generated
	 */
	void setDomainname(String value);

	/**
	 * Returns the value of the '<em><b>Mem limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem limit</em>' attribute.
	 * @see #setMem_limit(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Mem_limit()
	 * @model dataType="org.occiware.clouddesigner.OCCI.Number"
	 * @generated
	 */
	int getMem_limit();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getMem_limit <em>Mem limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem limit</em>' attribute.
	 * @see #getMem_limit()
	 * @generated
	 */
	void setMem_limit(int value);

	/**
	 * Returns the value of the '<em><b>Privileged</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privileged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileged</em>' attribute.
	 * @see #setPrivileged(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Privileged()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 * @generated
	 */
	boolean isPrivileged();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isPrivileged <em>Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privileged</em>' attribute.
	 * @see #isPrivileged()
	 * @generated
	 */
	void setPrivileged(boolean value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Restart()
	 * @model default="" dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getRestart();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #getRestart()
	 * @generated
	 */
	void setRestart(String value);

	/**
	 * Returns the value of the '<em><b>Stdin open</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdin open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdin open</em>' attribute.
	 * @see #setStdin_open(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Stdin_open()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 * @generated
	 */
	boolean isStdin_open();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isStdin_open <em>Stdin open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdin open</em>' attribute.
	 * @see #isStdin_open()
	 * @generated
	 */
	void setStdin_open(boolean value);

	/**
	 * Returns the value of the '<em><b>Interactive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive</em>' attribute.
	 * @see #setInteractive(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Interactive()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 * @generated
	 */
	boolean isInteractive();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isInteractive <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive</em>' attribute.
	 * @see #isInteractive()
	 * @generated
	 */
	void setInteractive(boolean value);

	/**
	 * Returns the value of the '<em><b>Tty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tty</em>' attribute.
	 * @see #setTty(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Tty()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 * @generated
	 */
	boolean isTty();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isTty <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tty</em>' attribute.
	 * @see #isTty()
	 * @generated
	 */
	void setTty(boolean value);

	/**
	 * Returns the value of the '<em><b>Cpu shares</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu shares</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu shares</em>' attribute.
	 * @see #setCpu_shares(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cpu_shares()
	 * @model default="0" dataType="org.occiware.clouddesigner.OCCI.Number"
	 * @generated
	 */
	int getCpu_shares();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_shares <em>Cpu shares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu shares</em>' attribute.
	 * @see #getCpu_shares()
	 * @generated
	 */
	void setCpu_shares(int value);

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Pid()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);

	/**
	 * Returns the value of the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipc</em>' attribute.
	 * @see #setIpc(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Ipc()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getIpc();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getIpc <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipc</em>' attribute.
	 * @see #getIpc()
	 * @generated
	 */
	void setIpc(String value);

	/**
	 * Returns the value of the '<em><b>Add host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add host</em>' attribute.
	 * @see #setAdd_host(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Add_host()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getAdd_host();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getAdd_host <em>Add host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add host</em>' attribute.
	 * @see #getAdd_host()
	 * @generated
	 */
	void setAdd_host(String value);

	/**
	 * Returns the value of the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac address</em>' attribute.
	 * @see #setMac_address(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Mac_address()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getMac_address();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getMac_address <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac address</em>' attribute.
	 * @see #getMac_address()
	 * @generated
	 */
	void setMac_address(String value);

	/**
	 * Returns the value of the '<em><b>Rm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm</em>' attribute.
	 * @see #setRm(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Rm()
	 * @model dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 * @generated
	 */
	boolean isRm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isRm <em>Rm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm</em>' attribute.
	 * @see #isRm()
	 * @generated
	 */
	void setRm(boolean value);

	/**
	 * Returns the value of the '<em><b>Security opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security opt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security opt</em>' attribute.
	 * @see #setSecurity_opt(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Security_opt()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getSecurity_opt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getSecurity_opt <em>Security opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security opt</em>' attribute.
	 * @see #getSecurity_opt()
	 * @generated
	 */
	void setSecurity_opt(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Device()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Lxc conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lxc conf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lxc conf</em>' attribute.
	 * @see #setLxc_conf(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Lxc_conf()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getLxc_conf();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getLxc_conf <em>Lxc conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lxc conf</em>' attribute.
	 * @see #getLxc_conf()
	 * @generated
	 */
	void setLxc_conf(String value);

	/**
	 * Returns the value of the '<em><b>Cpuset</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpuset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpuset</em>' attribute.
	 * @see #setCpuset(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cpuset()
	 * @model default="" dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getCpuset();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCpuset <em>Cpuset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpuset</em>' attribute.
	 * @see #getCpuset()
	 * @generated
	 */
	void setCpuset(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unpause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signalDataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	void kill(String signal);

} // Container
