/**
 */
package org.occiware.clouddesigner.occi.docker;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
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
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_swap <em>Memory swap</em>}</li>
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
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isPublish_all <em>Publish all</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isRead_only <em>Read only</em>}</li>
 * </ul>
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
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!name'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!containerid'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!image'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!build'"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Command()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!command'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!ports'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!expose'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!volumes'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!environment'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!env_file'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!net'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!dns'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!dns_search'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!cap_add'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!cap_drop'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!working_dir'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!entrypoint'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!user'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!domainname'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!mem_limit'"
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
	 * Returns the value of the '<em><b>Memory swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory swap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory swap</em>' attribute.
	 * @see #setMemory_swap(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Memory_swap()
	 * @model dataType="org.occiware.clouddesigner.OCCI.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!memory_swap'"
	 * @generated
	 */
	int getMemory_swap();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_swap <em>Memory swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory swap</em>' attribute.
	 * @see #getMemory_swap()
	 * @generated
	 */
	void setMemory_swap(int value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!privileged'"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Restart()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!restart'"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdin open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdin open</em>' attribute.
	 * @see #setStdin_open(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Stdin_open()
	 * @model dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!stdin_open'"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!interactive'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!tty'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!cpu_shares'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!pid'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!ipc'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!add_host'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!mac_address'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!rm'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!security_opt'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!device'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!lxc_conf'"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpuset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpuset</em>' attribute.
	 * @see #setCpuset(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cpuset()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!cpuset'"
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
	 * Returns the value of the '<em><b>Publish all</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish all</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish all</em>' attribute.
	 * @see #setPublish_all(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Publish_all()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!publish_all'"
	 * @generated
	 */
	boolean isPublish_all();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isPublish_all <em>Publish all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish all</em>' attribute.
	 * @see #isPublish_all()
	 * @generated
	 */
	void setPublish_all(boolean value);

	/**
	 * Returns the value of the '<em><b>Read only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read only</em>' attribute.
	 * @see #setRead_only(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Read_only()
	 * @model default="false" dataType="org.occiware.clouddesigner.OCCI.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!read_only'"
	 * @generated
	 */
	boolean isRead_only();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isRead_only <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read only</em>' attribute.
	 * @see #isRead_only()
	 * @generated
	 */
	void setRead_only(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!create()'"
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!run()'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!pause()'"
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!unpause()'"
	 * @generated
	 */
	void unpause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signalDataType="org.occiware.clouddesigner.OCCI.String" signalRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Container!kill(String)'"
	 * @generated
	 */
	void kill(String signal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv ContainerLinkAliasUnique: \n * \t\t\tlinks->select(oclIsKindOf(Link))->isUnique(oclAsType(docker::Link).alias)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Link%>> links = this.getLinks();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, links);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createOrderedSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_links.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> select;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            select = accumulator;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1.next();\n        /**\n         * oclIsKindOf(Link)\n         \052/\n        final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Link_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Link_0, null);\n        final /*@Thrown\052/ boolean oclIsKindOf = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1, TYP_docker_c_c_Link_0).booleanValue());\n        //\n        if (oclIsKindOf == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            accumulator.add(_1);\n        }\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = select.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1_0.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1_0 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1_0.next();\n        /**\n         * oclAsType(Link).alias\n         \052/\n        final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Link_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Link_0, null);\n        final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.docker.Link%> oclAsType = (<%org.occiware.clouddesigner.occi.docker.Link%>)<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(evaluator, _1_0, TYP_docker_c_c_Link_1);\n        if (oclAsType == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'docker::Link::alias\\\'\");\n        }\n        final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.String%> alias = oclAsType.getAlias();\n        //\n        if (accumulator_0.includes(alias) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator_0.add(alias);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Container\", \"ContainerLinkAliasUnique\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.CONTAINER__CONTAINER_LINK_ALIAS_UNIQUE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean ContainerLinkAliasUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv ContainerNoCycleBetweenContainers: \n * \t\t\tlinks->closure(links->select(oclIsKindOf(Link) or oclIsKindOf(Volumesfrom)).target.links->select(oclIsKindOf(Link) or oclIsKindOf(Volumesfrom))).target->excludes(self)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_excludes;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Link%>> links = this.getLinks();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, links);\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_links);\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.examples.domain.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Operations._OrderedSet__closure);\n    final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Link);\n    /**\n     * Implementation of the iterator body.\n     \052/\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%>()\n    {\n        /**\n         * \n         * links->select(oclIsKindOf(Link) or oclIsKindOf(Volumesfrom))\n         * .target.links->select(\n         *   oclIsKindOf(Link) or\n         *   oclIsKindOf(Volumesfrom))\n         \052/\n        @Override\n        public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.ids.TypeId%> typeId, final /*@Nullable\052/ Object BOXED_links, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1_3) {\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createOrderedSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link);\n            /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_links.iterator();\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> select_0;\n            while (true) {\n                if (!ITERATOR__1.hasNext()) {\n                    select_0 = accumulator;\n                    break;\n                }\n                /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1.next();\n                /**\n                 * oclIsKindOf(Link) or oclIsKindOf(Volumesfrom)\n                 \052/\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf;\n                try {\n                    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Link_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Link_0, null);\n                    final /*@Thrown\052/ boolean oclIsKindOf = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1, TYP_docker_c_c_Link_0).booleanValue());\n                    CAUGHT_oclIsKindOf = oclIsKindOf;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_oclIsKindOf = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf_0;\n                try {\n                    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Volumesfrom_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Volumesfrom, null);\n                    final /*@Thrown\052/ boolean oclIsKindOf_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1, TYP_docker_c_c_Volumesfrom_0).booleanValue());\n                    CAUGHT_oclIsKindOf_0 = oclIsKindOf_0;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_oclIsKindOf_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> or = <%org.eclipse.ocl.examples.library.logical.BooleanOrOperation%>.INSTANCE.evaluate(CAUGHT_oclIsKindOf, CAUGHT_oclIsKindOf_0);\n                if (or == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null body for \\\'OrderedSet(T).select(T[?] | Lambda T() : Boolean) : OrderedSet(T)\\\'\");\n                }\n                //\n                if (or == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n                    accumulator.add(_1);\n                }\n            }\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Resource);\n            /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = select_0.iterator();\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_1;\n            while (true) {\n                if (!ITERATOR__1_0.hasNext()) {\n                    collect_1 = accumulator_0;\n                    break;\n                }\n                /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1_0 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1_0.next();\n                /**\n                 * target\n                 \052/\n                if (_1_0 == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Link::target\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Resource%> target = _1_0.getTarget();\n                //\n                accumulator_0.add(target);\n            }\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Link);\n            /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_1 = collect_1.iterator();\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_0;\n            while (true) {\n                if (!ITERATOR__1_1.hasNext()) {\n                    collect_0 = accumulator_1;\n                    break;\n                }\n                /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Resource%> _1_1 = (<%org.occiware.clouddesigner.OCCI.Resource%>)ITERATOR__1_1.next();\n                /**\n                 * links\n                 \052/\n                if (_1_1 == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Resource::links\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Link%>> links_1 = _1_1.getLinks();\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_links_1 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, links_1);\n                //\n                for (Object value : BOXED_links_1.flatten().getElements()) {\n                    accumulator_1.add(value);\n                }\n            }\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_2 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Link);\n            /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_2 = collect_0.iterator();\n            /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> select;\n            while (true) {\n                if (!ITERATOR__1_2.hasNext()) {\n                    select = accumulator_2;\n                    break;\n                }\n                /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1_2 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1_2.next();\n                /**\n                 * oclIsKindOf(Link) or oclIsKindOf(Volumesfrom)\n                 \052/\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf_1;\n                try {\n                    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Link_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Link_0, null);\n                    final /*@Thrown\052/ boolean oclIsKindOf_1 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1_2, TYP_docker_c_c_Link_1).booleanValue());\n                    CAUGHT_oclIsKindOf_1 = oclIsKindOf_1;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_oclIsKindOf_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf_2;\n                try {\n                    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Volumesfrom_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Volumesfrom, null);\n                    final /*@Thrown\052/ boolean oclIsKindOf_2 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1_2, TYP_docker_c_c_Volumesfrom_1).booleanValue());\n                    CAUGHT_oclIsKindOf_2 = oclIsKindOf_2;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_oclIsKindOf_2 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> or_0 = <%org.eclipse.ocl.examples.library.logical.BooleanOrOperation%>.INSTANCE.evaluate(CAUGHT_oclIsKindOf_1, CAUGHT_oclIsKindOf_2);\n                if (or_0 == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null body for \\\'Sequence(T).select(T[?] | Lambda T() : Boolean) : Sequence(T)\\\'\");\n                }\n                //\n                if (or_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n                    accumulator_2.add(_1_2);\n                }\n            }\n            return select;\n        }\n    };\n    final /*@NonNull\052/  <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, BODY_closure_0, BOXED_links, ACC_closure_0);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> closure = (<%org.eclipse.ocl.examples.domain.values.OrderedSetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_3 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Resource);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_4 = closure.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect;\n    while (true) {\n        if (!ITERATOR__1_4.hasNext()) {\n            collect = accumulator_3;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1_4 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1_4.next();\n        /**\n         * target\n         \052/\n        if (_1_4 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Link::target\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Resource%> target_0 = _1_4.getTarget();\n        //\n        accumulator_3.add(target_0);\n    }\n    final /*@Thrown\052/ boolean excludes = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation%>.INSTANCE.evaluate(collect, this).booleanValue());\n    CAUGHT_excludes = excludes;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_excludes = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_excludes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Container\", \"ContainerNoCycleBetweenContainers\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.CONTAINER__CONTAINER_NO_CYCLE_BETWEEN_CONTAINERS, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean ContainerNoCycleBetweenContainers(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Container
