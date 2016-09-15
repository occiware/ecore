/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
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
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_used <em>Cpu used</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_used <em>Memory used</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer()
 * @model annotation="OCCIE2Ecore title='Container Resource'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The name of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The ID of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The image of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The build directory of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Override the default command in Dockerfile'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The ports of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The exposed ports of this Container instance'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The list of volumes'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Environment variables'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='\'bridge\',  \'none\', \'container:[name or id]\', or \'host\''"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Custom DNS servers'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Custom DNS search domains'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Add container capabilities'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Drop container capabilities'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Working directory'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Entry point'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Memory swap limit'"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description=''"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='CPU shares for this Docker container'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='\'\' or \'host\''"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='\'\', \'host\' or \'container:[name:id]\''"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
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
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description=''"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Publish all exposed ports to random ports on the host interfaces'"
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
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Mount the container\'s root filesystem as read only'"
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
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Monitored()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='This attribut allow us to monitor the container'"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#isMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #isMonitored()
	 * @generated
	 */
	void setMonitored(boolean value);

	/**
	 * Returns the value of the '<em><b>Cpu used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu used</em>' attribute.
	 * @see #setCpu_used(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Cpu_used()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='CPU consumed by the conatiner'"
	 * @generated
	 */
	int getCpu_used();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_used <em>Cpu used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu used</em>' attribute.
	 * @see #getCpu_used()
	 * @generated
	 */
	void setCpu_used(int value);

	/**
	 * Returns the value of the '<em><b>Memory used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory used</em>' attribute.
	 * @see #setMemory_used(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getContainer_Memory_used()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Memory consumed by the container'"
	 * @generated
	 */
	int getMemory_used();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_used <em>Memory used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory used</em>' attribute.
	 * @see #getMemory_used()
	 * @generated
	 */
	void setMemory_used(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void create();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title=''"
	 * @generated
	 */
	void unpause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signalDataType="org.occiware.clouddesigner.occi.String" signalRequired="true"
	 *        signalAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void kill(String signal);

} // Container
