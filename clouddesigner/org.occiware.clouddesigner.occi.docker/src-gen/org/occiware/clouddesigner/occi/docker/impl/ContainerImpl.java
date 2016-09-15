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
package org.occiware.clouddesigner.occi.docker.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;

import org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getContainerid <em>Containerid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getEnv_file <em>Env file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDns_search <em>Dns search</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCap_add <em>Cap add</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCap_drop <em>Cap drop</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getWorking_dir <em>Working dir</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDomainname <em>Domainname</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMem_limit <em>Mem limit</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMemory_swap <em>Memory swap</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isPrivileged <em>Privileged</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isStdin_open <em>Stdin open</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isTty <em>Tty</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCpu_shares <em>Cpu shares</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getIpc <em>Ipc</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getAdd_host <em>Add host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isRm <em>Rm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getSecurity_opt <em>Security opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getLxc_conf <em>Lxc conf</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCpuset <em>Cpuset</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isPublish_all <em>Publish all</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isRead_only <em>Read only</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCpu_used <em>Cpu used</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMemory_used <em>Memory used</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCpu_percent <em>Cpu percent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMemory_percent <em>Memory percent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDisk_used <em>Disk used</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getDisk_percent <em>Disk percent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getBandwidth_used <em>Bandwidth used</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getBandwidth_percent <em>Bandwidth percent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMonitoring_interval <em>Monitoring interval</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getCpu_max_value <em>Cpu max value</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl#getMemory_max_value <em>Memory max value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ComputeImpl implements org.occiware.clouddesigner.occi.docker.Container {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerid() <em>Containerid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerid()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerid() <em>Containerid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerid()
	 * @generated
	 * @ordered
	 */
	protected String containerid = CONTAINERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected String build = BUILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected String ports = PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpose() <em>Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected String expose = EXPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected String volumes = VOLUMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnv_file() <em>Env file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv_file()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnv_file() <em>Env file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv_file()
	 * @generated
	 * @ordered
	 */
	protected String env_file = ENV_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected String net = NET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected String dns = DNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDns_search() <em>Dns search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns_search()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_SEARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDns_search() <em>Dns search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns_search()
	 * @generated
	 * @ordered
	 */
	protected String dns_search = DNS_SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCap_add() <em>Cap add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_add()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_ADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCap_add() <em>Cap add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_add()
	 * @generated
	 * @ordered
	 */
	protected String cap_add = CAP_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCap_drop() <em>Cap drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_drop()
	 * @generated
	 * @ordered
	 */
	protected static final String CAP_DROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCap_drop() <em>Cap drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap_drop()
	 * @generated
	 * @ordered
	 */
	protected String cap_drop = CAP_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorking_dir() <em>Working dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorking_dir() <em>Working dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_dir()
	 * @generated
	 * @ordered
	 */
	protected String working_dir = WORKING_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected String entrypoint = ENTRYPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainname() <em>Domainname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainname()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAINNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainname() <em>Domainname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainname()
	 * @generated
	 * @ordered
	 */
	protected String domainname = DOMAINNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMem_limit() <em>Mem limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_limit()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMem_limit() <em>Mem limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_limit()
	 * @generated
	 * @ordered
	 */
	protected int mem_limit = MEM_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_swap() <em>Memory swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_swap()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SWAP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_swap() <em>Memory swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_swap()
	 * @generated
	 * @ordered
	 */
	protected int memory_swap = MEMORY_SWAP_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVILEGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivileged() <em>Privileged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivileged()
	 * @generated
	 * @ordered
	 */
	protected boolean privileged = PRIVILEGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected String restart = RESTART_EDEFAULT;

	/**
	 * The default value of the '{@link #isStdin_open() <em>Stdin open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdin_open()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STDIN_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStdin_open() <em>Stdin open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdin_open()
	 * @generated
	 * @ordered
	 */
	protected boolean stdin_open = STDIN_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInteractive() <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean interactive = INTERACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTty()
	 * @generated
	 * @ordered
	 */
	protected boolean tty = TTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_shares() <em>Cpu shares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_shares()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_SHARES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_shares() <em>Cpu shares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_shares()
	 * @generated
	 * @ordered
	 */
	protected int cpu_shares = CPU_SHARES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected static final String IPC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpc() <em>Ipc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpc()
	 * @generated
	 * @ordered
	 */
	protected String ipc = IPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdd_host() <em>Add host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd_host()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdd_host() <em>Add host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd_host()
	 * @generated
	 * @ordered
	 */
	protected String add_host = ADD_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected String mac_address = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRm() <em>Rm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRm() <em>Rm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRm()
	 * @generated
	 * @ordered
	 */
	protected boolean rm = RM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity_opt() <em>Security opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_opt()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity_opt() <em>Security opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_opt()
	 * @generated
	 * @ordered
	 */
	protected String security_opt = SECURITY_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLxc_conf() <em>Lxc conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLxc_conf()
	 * @generated
	 * @ordered
	 */
	protected static final String LXC_CONF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLxc_conf() <em>Lxc conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLxc_conf()
	 * @generated
	 * @ordered
	 */
	protected String lxc_conf = LXC_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuset() <em>Cpuset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuset()
	 * @generated
	 * @ordered
	 */
	protected static final String CPUSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuset() <em>Cpuset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuset()
	 * @generated
	 * @ordered
	 */
	protected String cpuset = CPUSET_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublish_all() <em>Publish all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish_all()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISH_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublish_all() <em>Publish all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublish_all()
	 * @generated
	 * @ordered
	 */
	protected boolean publish_all = PUBLISH_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead_only() <em>Read only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead_only()
	 * @generated
	 * @ordered
	 */
	protected boolean read_only = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitored() <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitored()
	 * @generated
	 * @ordered
	 */
	protected boolean monitored = MONITORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_used() <em>Cpu used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_used()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_used() <em>Cpu used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_used()
	 * @generated
	 * @ordered
	 */
	protected int cpu_used = CPU_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_used() <em>Memory used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_used()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_used() <em>Memory used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_used()
	 * @generated
	 * @ordered
	 */
	protected int memory_used = MEMORY_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_percent() <em>Cpu percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_percent()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_PERCENT_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getCpu_percent() <em>Cpu percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_percent()
	 * @generated
	 * @ordered
	 */
	protected String cpu_percent = CPU_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_percent() <em>Memory percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_percent()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_percent() <em>Memory percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_percent()
	 * @generated
	 * @ordered
	 */
	protected String memory_percent = MEMORY_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_used() <em>Disk used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_used()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDisk_used() <em>Disk used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_used()
	 * @generated
	 * @ordered
	 */
	protected int disk_used = DISK_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_percent() <em>Disk percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_percent()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_percent() <em>Disk percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_percent()
	 * @generated
	 * @ordered
	 */
	protected String disk_percent = DISK_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth_used() <em>Bandwidth used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth_used()
	 * @generated
	 * @ordered
	 */
	protected static final int BANDWIDTH_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBandwidth_used() <em>Bandwidth used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth_used()
	 * @generated
	 * @ordered
	 */
	protected int bandwidth_used = BANDWIDTH_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth_percent() <em>Bandwidth percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth_percent()
	 * @generated
	 * @ordered
	 */
	protected static final String BANDWIDTH_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBandwidth_percent() <em>Bandwidth percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth_percent()
	 * @generated
	 * @ordered
	 */
	protected String bandwidth_percent = BANDWIDTH_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoring_interval() <em>Monitoring interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring_interval()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITORING_INTERVAL_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMonitoring_interval() <em>Monitoring interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring_interval()
	 * @generated
	 * @ordered
	 */
	protected int monitoring_interval = MONITORING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_max_value() <em>Cpu max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_max_value()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu_max_value() <em>Cpu max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_max_value()
	 * @generated
	 * @ordered
	 */
	protected int cpu_max_value = CPU_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_max_value() <em>Memory max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_max_value()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory_max_value() <em>Memory max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_max_value()
	 * @generated
	 * @ordered
	 */
	protected int memory_max_value = MEMORY_MAX_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerid() {
		return containerid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerid(String newContainerid) {
		String oldContainerid = containerid;
		containerid = newContainerid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CONTAINERID, oldContainerid, containerid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuild(String newBuild) {
		String oldBuild = build;
		build = newBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BUILD, oldBuild, build));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(String newPorts) {
		String oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpose() {
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpose(String newExpose) {
		String oldExpose = expose;
		expose = newExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__EXPOSE, oldExpose, expose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(String newVolumes) {
		String oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__VOLUMES, oldVolumes, volumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnv_file() {
		return env_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv_file(String newEnv_file) {
		String oldEnv_file = env_file;
		env_file = newEnv_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENV_FILE, oldEnv_file, env_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(String newNet) {
		String oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDns() {
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDns(String newDns) {
		String oldDns = dns;
		dns = newDns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DNS, oldDns, dns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDns_search() {
		return dns_search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDns_search(String newDns_search) {
		String oldDns_search = dns_search;
		dns_search = newDns_search;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DNS_SEARCH, oldDns_search, dns_search));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCap_add() {
		return cap_add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap_add(String newCap_add) {
		String oldCap_add = cap_add;
		cap_add = newCap_add;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CAP_ADD, oldCap_add, cap_add));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCap_drop() {
		return cap_drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap_drop(String newCap_drop) {
		String oldCap_drop = cap_drop;
		cap_drop = newCap_drop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CAP_DROP, oldCap_drop, cap_drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorking_dir() {
		return working_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorking_dir(String newWorking_dir) {
		String oldWorking_dir = working_dir;
		working_dir = newWorking_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__WORKING_DIR, oldWorking_dir, working_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntrypoint(String newEntrypoint) {
		String oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ENTRYPOINT, oldEntrypoint, entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainname() {
		return domainname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainname(String newDomainname) {
		String oldDomainname = domainname;
		domainname = newDomainname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DOMAINNAME, oldDomainname, domainname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMem_limit() {
		return mem_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMem_limit(int newMem_limit) {
		int oldMem_limit = mem_limit;
		mem_limit = newMem_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEM_LIMIT, oldMem_limit, mem_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_swap() {
		return memory_swap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_swap(int newMemory_swap) {
		int oldMemory_swap = memory_swap;
		memory_swap = newMemory_swap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_SWAP, oldMemory_swap, memory_swap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivileged() {
		return privileged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivileged(boolean newPrivileged) {
		boolean oldPrivileged = privileged;
		privileged = newPrivileged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PRIVILEGED, oldPrivileged, privileged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestart(String newRestart) {
		String oldRestart = restart;
		restart = newRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__RESTART, oldRestart, restart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStdin_open() {
		return stdin_open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStdin_open(boolean newStdin_open) {
		boolean oldStdin_open = stdin_open;
		stdin_open = newStdin_open;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__STDIN_OPEN, oldStdin_open, stdin_open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInteractive() {
		return interactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractive(boolean newInteractive) {
		boolean oldInteractive = interactive;
		interactive = newInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__INTERACTIVE, oldInteractive, interactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTty() {
		return tty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTty(boolean newTty) {
		boolean oldTty = tty;
		tty = newTty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__TTY, oldTty, tty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu_shares() {
		return cpu_shares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_shares(int newCpu_shares) {
		int oldCpu_shares = cpu_shares;
		cpu_shares = newCpu_shares;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_SHARES, oldCpu_shares, cpu_shares));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpc() {
		return ipc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpc(String newIpc) {
		String oldIpc = ipc;
		ipc = newIpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__IPC, oldIpc, ipc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdd_host() {
		return add_host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd_host(String newAdd_host) {
		String oldAdd_host = add_host;
		add_host = newAdd_host;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__ADD_HOST, oldAdd_host, add_host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMac_address() {
		return mac_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_address(String newMac_address) {
		String oldMac_address = mac_address;
		mac_address = newMac_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MAC_ADDRESS, oldMac_address, mac_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRm() {
		return rm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm(boolean newRm) {
		boolean oldRm = rm;
		rm = newRm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__RM, oldRm, rm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity_opt() {
		return security_opt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity_opt(String newSecurity_opt) {
		String oldSecurity_opt = security_opt;
		security_opt = newSecurity_opt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__SECURITY_OPT, oldSecurity_opt, security_opt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLxc_conf() {
		return lxc_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLxc_conf(String newLxc_conf) {
		String oldLxc_conf = lxc_conf;
		lxc_conf = newLxc_conf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__LXC_CONF, oldLxc_conf, lxc_conf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuset() {
		return cpuset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuset(String newCpuset) {
		String oldCpuset = cpuset;
		cpuset = newCpuset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPUSET, oldCpuset, cpuset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublish_all() {
		return publish_all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublish_all(boolean newPublish_all) {
		boolean oldPublish_all = publish_all;
		publish_all = newPublish_all;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__PUBLISH_ALL, oldPublish_all, publish_all));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRead_only() {
		return read_only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead_only(boolean newRead_only) {
		boolean oldRead_only = read_only;
		read_only = newRead_only;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__READ_ONLY, oldRead_only, read_only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return monitored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitored(boolean newMonitored) {
		boolean oldMonitored = monitored;
		monitored = newMonitored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MONITORED, oldMonitored, monitored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu_used() {
		return cpu_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_used(int newCpu_used) {
		int oldCpu_used = cpu_used;
		cpu_used = newCpu_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_USED, oldCpu_used, cpu_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_used() {
		return memory_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_used(int newMemory_used) {
		int oldMemory_used = memory_used;
		memory_used = newMemory_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_USED, oldMemory_used, memory_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpu_percent() {
		return cpu_percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_percent(String newCpu_percent) {
		String oldCpu_percent = cpu_percent;
		cpu_percent = newCpu_percent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_PERCENT, oldCpu_percent, cpu_percent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemory_percent() {
		return memory_percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_percent(String newMemory_percent) {
		String oldMemory_percent = memory_percent;
		memory_percent = newMemory_percent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_PERCENT, oldMemory_percent, memory_percent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisk_used() {
		return disk_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_used(int newDisk_used) {
		int oldDisk_used = disk_used;
		disk_used = newDisk_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DISK_USED, oldDisk_used, disk_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisk_percent() {
		return disk_percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_percent(String newDisk_percent) {
		String oldDisk_percent = disk_percent;
		disk_percent = newDisk_percent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__DISK_PERCENT, oldDisk_percent, disk_percent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBandwidth_used() {
		return bandwidth_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth_used(int newBandwidth_used) {
		int oldBandwidth_used = bandwidth_used;
		bandwidth_used = newBandwidth_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BANDWIDTH_USED, oldBandwidth_used, bandwidth_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBandwidth_percent() {
		return bandwidth_percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth_percent(String newBandwidth_percent) {
		String oldBandwidth_percent = bandwidth_percent;
		bandwidth_percent = newBandwidth_percent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__BANDWIDTH_PERCENT, oldBandwidth_percent, bandwidth_percent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonitoring_interval() {
		return monitoring_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoring_interval(int newMonitoring_interval) {
		int oldMonitoring_interval = monitoring_interval;
		monitoring_interval = newMonitoring_interval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MONITORING_INTERVAL, oldMonitoring_interval, monitoring_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu_max_value() {
		return cpu_max_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_max_value(int newCpu_max_value) {
		int oldCpu_max_value = cpu_max_value;
		cpu_max_value = newCpu_max_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__CPU_MAX_VALUE, oldCpu_max_value, cpu_max_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_max_value() {
		return memory_max_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_max_value(int newMemory_max_value) {
		int oldMemory_max_value = memory_max_value;
		memory_max_value = newMemory_max_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER__MEMORY_MAX_VALUE, oldMemory_max_value, memory_max_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pause() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unpause() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void kill(String signal) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER__NAME:
				return getName();
			case DockerPackage.CONTAINER__CONTAINERID:
				return getContainerid();
			case DockerPackage.CONTAINER__IMAGE:
				return getImage();
			case DockerPackage.CONTAINER__BUILD:
				return getBuild();
			case DockerPackage.CONTAINER__COMMAND:
				return getCommand();
			case DockerPackage.CONTAINER__PORTS:
				return getPorts();
			case DockerPackage.CONTAINER__EXPOSE:
				return getExpose();
			case DockerPackage.CONTAINER__VOLUMES:
				return getVolumes();
			case DockerPackage.CONTAINER__ENVIRONMENT:
				return getEnvironment();
			case DockerPackage.CONTAINER__ENV_FILE:
				return getEnv_file();
			case DockerPackage.CONTAINER__NET:
				return getNet();
			case DockerPackage.CONTAINER__DNS:
				return getDns();
			case DockerPackage.CONTAINER__DNS_SEARCH:
				return getDns_search();
			case DockerPackage.CONTAINER__CAP_ADD:
				return getCap_add();
			case DockerPackage.CONTAINER__CAP_DROP:
				return getCap_drop();
			case DockerPackage.CONTAINER__WORKING_DIR:
				return getWorking_dir();
			case DockerPackage.CONTAINER__ENTRYPOINT:
				return getEntrypoint();
			case DockerPackage.CONTAINER__USER:
				return getUser();
			case DockerPackage.CONTAINER__DOMAINNAME:
				return getDomainname();
			case DockerPackage.CONTAINER__MEM_LIMIT:
				return getMem_limit();
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				return getMemory_swap();
			case DockerPackage.CONTAINER__PRIVILEGED:
				return isPrivileged();
			case DockerPackage.CONTAINER__RESTART:
				return getRestart();
			case DockerPackage.CONTAINER__STDIN_OPEN:
				return isStdin_open();
			case DockerPackage.CONTAINER__INTERACTIVE:
				return isInteractive();
			case DockerPackage.CONTAINER__TTY:
				return isTty();
			case DockerPackage.CONTAINER__CPU_SHARES:
				return getCpu_shares();
			case DockerPackage.CONTAINER__PID:
				return getPid();
			case DockerPackage.CONTAINER__IPC:
				return getIpc();
			case DockerPackage.CONTAINER__ADD_HOST:
				return getAdd_host();
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				return getMac_address();
			case DockerPackage.CONTAINER__RM:
				return isRm();
			case DockerPackage.CONTAINER__SECURITY_OPT:
				return getSecurity_opt();
			case DockerPackage.CONTAINER__DEVICE:
				return getDevice();
			case DockerPackage.CONTAINER__LXC_CONF:
				return getLxc_conf();
			case DockerPackage.CONTAINER__CPUSET:
				return getCpuset();
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				return isPublish_all();
			case DockerPackage.CONTAINER__READ_ONLY:
				return isRead_only();
			case DockerPackage.CONTAINER__MONITORED:
				return isMonitored();
			case DockerPackage.CONTAINER__CPU_USED:
				return getCpu_used();
			case DockerPackage.CONTAINER__MEMORY_USED:
				return getMemory_used();
			case DockerPackage.CONTAINER__CPU_PERCENT:
				return getCpu_percent();
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				return getMemory_percent();
			case DockerPackage.CONTAINER__DISK_USED:
				return getDisk_used();
			case DockerPackage.CONTAINER__DISK_PERCENT:
				return getDisk_percent();
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				return getBandwidth_used();
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				return getBandwidth_percent();
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				return getMonitoring_interval();
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				return getCpu_max_value();
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				return getMemory_max_value();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case DockerPackage.CONTAINER__CONTAINERID:
				setContainerid((String)newValue);
				return;
			case DockerPackage.CONTAINER__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.CONTAINER__BUILD:
				setBuild((String)newValue);
				return;
			case DockerPackage.CONTAINER__COMMAND:
				setCommand((String)newValue);
				return;
			case DockerPackage.CONTAINER__PORTS:
				setPorts((String)newValue);
				return;
			case DockerPackage.CONTAINER__EXPOSE:
				setExpose((String)newValue);
				return;
			case DockerPackage.CONTAINER__VOLUMES:
				setVolumes((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENV_FILE:
				setEnv_file((String)newValue);
				return;
			case DockerPackage.CONTAINER__NET:
				setNet((String)newValue);
				return;
			case DockerPackage.CONTAINER__DNS:
				setDns((String)newValue);
				return;
			case DockerPackage.CONTAINER__DNS_SEARCH:
				setDns_search((String)newValue);
				return;
			case DockerPackage.CONTAINER__CAP_ADD:
				setCap_add((String)newValue);
				return;
			case DockerPackage.CONTAINER__CAP_DROP:
				setCap_drop((String)newValue);
				return;
			case DockerPackage.CONTAINER__WORKING_DIR:
				setWorking_dir((String)newValue);
				return;
			case DockerPackage.CONTAINER__ENTRYPOINT:
				setEntrypoint((String)newValue);
				return;
			case DockerPackage.CONTAINER__USER:
				setUser((String)newValue);
				return;
			case DockerPackage.CONTAINER__DOMAINNAME:
				setDomainname((String)newValue);
				return;
			case DockerPackage.CONTAINER__MEM_LIMIT:
				setMem_limit((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				setMemory_swap((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__PRIVILEGED:
				setPrivileged((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__RESTART:
				setRestart((String)newValue);
				return;
			case DockerPackage.CONTAINER__STDIN_OPEN:
				setStdin_open((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__INTERACTIVE:
				setInteractive((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__TTY:
				setTty((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_SHARES:
				setCpu_shares((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__PID:
				setPid((String)newValue);
				return;
			case DockerPackage.CONTAINER__IPC:
				setIpc((String)newValue);
				return;
			case DockerPackage.CONTAINER__ADD_HOST:
				setAdd_host((String)newValue);
				return;
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				setMac_address((String)newValue);
				return;
			case DockerPackage.CONTAINER__RM:
				setRm((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				setSecurity_opt((String)newValue);
				return;
			case DockerPackage.CONTAINER__DEVICE:
				setDevice((String)newValue);
				return;
			case DockerPackage.CONTAINER__LXC_CONF:
				setLxc_conf((String)newValue);
				return;
			case DockerPackage.CONTAINER__CPUSET:
				setCpuset((String)newValue);
				return;
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				setPublish_all((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__READ_ONLY:
				setRead_only((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__MONITORED:
				setMonitored((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_USED:
				setCpu_used((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_USED:
				setMemory_used((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_PERCENT:
				setCpu_percent((String)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				setMemory_percent((String)newValue);
				return;
			case DockerPackage.CONTAINER__DISK_USED:
				setDisk_used((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__DISK_PERCENT:
				setDisk_percent((String)newValue);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				setBandwidth_used((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				setBandwidth_percent((String)newValue);
				return;
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				setMonitoring_interval((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				setCpu_max_value((Integer)newValue);
				return;
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				setMemory_max_value((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CONTAINERID:
				setContainerid(CONTAINERID_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BUILD:
				setBuild(BUILD_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__EXPOSE:
				setExpose(EXPOSE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__VOLUMES:
				setVolumes(VOLUMES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENV_FILE:
				setEnv_file(ENV_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__NET:
				setNet(NET_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DNS:
				setDns(DNS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DNS_SEARCH:
				setDns_search(DNS_SEARCH_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CAP_ADD:
				setCap_add(CAP_ADD_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CAP_DROP:
				setCap_drop(CAP_DROP_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__WORKING_DIR:
				setWorking_dir(WORKING_DIR_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ENTRYPOINT:
				setEntrypoint(ENTRYPOINT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__USER:
				setUser(USER_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DOMAINNAME:
				setDomainname(DOMAINNAME_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEM_LIMIT:
				setMem_limit(MEM_LIMIT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				setMemory_swap(MEMORY_SWAP_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PRIVILEGED:
				setPrivileged(PRIVILEGED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__RESTART:
				setRestart(RESTART_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__STDIN_OPEN:
				setStdin_open(STDIN_OPEN_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__INTERACTIVE:
				setInteractive(INTERACTIVE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__TTY:
				setTty(TTY_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_SHARES:
				setCpu_shares(CPU_SHARES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PID:
				setPid(PID_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__IPC:
				setIpc(IPC_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__ADD_HOST:
				setAdd_host(ADD_HOST_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				setMac_address(MAC_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__RM:
				setRm(RM_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				setSecurity_opt(SECURITY_OPT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__LXC_CONF:
				setLxc_conf(LXC_CONF_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPUSET:
				setCpuset(CPUSET_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				setPublish_all(PUBLISH_ALL_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__READ_ONLY:
				setRead_only(READ_ONLY_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MONITORED:
				setMonitored(MONITORED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_USED:
				setCpu_used(CPU_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_USED:
				setMemory_used(MEMORY_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_PERCENT:
				setCpu_percent(CPU_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				setMemory_percent(MEMORY_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DISK_USED:
				setDisk_used(DISK_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__DISK_PERCENT:
				setDisk_percent(DISK_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				setBandwidth_used(BANDWIDTH_USED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				setBandwidth_percent(BANDWIDTH_PERCENT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				setMonitoring_interval(MONITORING_INTERVAL_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				setCpu_max_value(CPU_MAX_VALUE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				setMemory_max_value(MEMORY_MAX_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockerPackage.CONTAINER__CONTAINERID:
				return CONTAINERID_EDEFAULT == null ? containerid != null : !CONTAINERID_EDEFAULT.equals(containerid);
			case DockerPackage.CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.CONTAINER__BUILD:
				return BUILD_EDEFAULT == null ? build != null : !BUILD_EDEFAULT.equals(build);
			case DockerPackage.CONTAINER__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case DockerPackage.CONTAINER__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case DockerPackage.CONTAINER__EXPOSE:
				return EXPOSE_EDEFAULT == null ? expose != null : !EXPOSE_EDEFAULT.equals(expose);
			case DockerPackage.CONTAINER__VOLUMES:
				return VOLUMES_EDEFAULT == null ? volumes != null : !VOLUMES_EDEFAULT.equals(volumes);
			case DockerPackage.CONTAINER__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case DockerPackage.CONTAINER__ENV_FILE:
				return ENV_FILE_EDEFAULT == null ? env_file != null : !ENV_FILE_EDEFAULT.equals(env_file);
			case DockerPackage.CONTAINER__NET:
				return NET_EDEFAULT == null ? net != null : !NET_EDEFAULT.equals(net);
			case DockerPackage.CONTAINER__DNS:
				return DNS_EDEFAULT == null ? dns != null : !DNS_EDEFAULT.equals(dns);
			case DockerPackage.CONTAINER__DNS_SEARCH:
				return DNS_SEARCH_EDEFAULT == null ? dns_search != null : !DNS_SEARCH_EDEFAULT.equals(dns_search);
			case DockerPackage.CONTAINER__CAP_ADD:
				return CAP_ADD_EDEFAULT == null ? cap_add != null : !CAP_ADD_EDEFAULT.equals(cap_add);
			case DockerPackage.CONTAINER__CAP_DROP:
				return CAP_DROP_EDEFAULT == null ? cap_drop != null : !CAP_DROP_EDEFAULT.equals(cap_drop);
			case DockerPackage.CONTAINER__WORKING_DIR:
				return WORKING_DIR_EDEFAULT == null ? working_dir != null : !WORKING_DIR_EDEFAULT.equals(working_dir);
			case DockerPackage.CONTAINER__ENTRYPOINT:
				return ENTRYPOINT_EDEFAULT == null ? entrypoint != null : !ENTRYPOINT_EDEFAULT.equals(entrypoint);
			case DockerPackage.CONTAINER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DockerPackage.CONTAINER__DOMAINNAME:
				return DOMAINNAME_EDEFAULT == null ? domainname != null : !DOMAINNAME_EDEFAULT.equals(domainname);
			case DockerPackage.CONTAINER__MEM_LIMIT:
				return mem_limit != MEM_LIMIT_EDEFAULT;
			case DockerPackage.CONTAINER__MEMORY_SWAP:
				return memory_swap != MEMORY_SWAP_EDEFAULT;
			case DockerPackage.CONTAINER__PRIVILEGED:
				return privileged != PRIVILEGED_EDEFAULT;
			case DockerPackage.CONTAINER__RESTART:
				return RESTART_EDEFAULT == null ? restart != null : !RESTART_EDEFAULT.equals(restart);
			case DockerPackage.CONTAINER__STDIN_OPEN:
				return stdin_open != STDIN_OPEN_EDEFAULT;
			case DockerPackage.CONTAINER__INTERACTIVE:
				return interactive != INTERACTIVE_EDEFAULT;
			case DockerPackage.CONTAINER__TTY:
				return tty != TTY_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_SHARES:
				return cpu_shares != CPU_SHARES_EDEFAULT;
			case DockerPackage.CONTAINER__PID:
				return PID_EDEFAULT == null ? pid != null : !PID_EDEFAULT.equals(pid);
			case DockerPackage.CONTAINER__IPC:
				return IPC_EDEFAULT == null ? ipc != null : !IPC_EDEFAULT.equals(ipc);
			case DockerPackage.CONTAINER__ADD_HOST:
				return ADD_HOST_EDEFAULT == null ? add_host != null : !ADD_HOST_EDEFAULT.equals(add_host);
			case DockerPackage.CONTAINER__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? mac_address != null : !MAC_ADDRESS_EDEFAULT.equals(mac_address);
			case DockerPackage.CONTAINER__RM:
				return rm != RM_EDEFAULT;
			case DockerPackage.CONTAINER__SECURITY_OPT:
				return SECURITY_OPT_EDEFAULT == null ? security_opt != null : !SECURITY_OPT_EDEFAULT.equals(security_opt);
			case DockerPackage.CONTAINER__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case DockerPackage.CONTAINER__LXC_CONF:
				return LXC_CONF_EDEFAULT == null ? lxc_conf != null : !LXC_CONF_EDEFAULT.equals(lxc_conf);
			case DockerPackage.CONTAINER__CPUSET:
				return CPUSET_EDEFAULT == null ? cpuset != null : !CPUSET_EDEFAULT.equals(cpuset);
			case DockerPackage.CONTAINER__PUBLISH_ALL:
				return publish_all != PUBLISH_ALL_EDEFAULT;
			case DockerPackage.CONTAINER__READ_ONLY:
				return read_only != READ_ONLY_EDEFAULT;
			case DockerPackage.CONTAINER__MONITORED:
				return monitored != MONITORED_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_USED:
				return cpu_used != CPU_USED_EDEFAULT;
			case DockerPackage.CONTAINER__MEMORY_USED:
				return memory_used != MEMORY_USED_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_PERCENT:
				return CPU_PERCENT_EDEFAULT == null ? cpu_percent != null : !CPU_PERCENT_EDEFAULT.equals(cpu_percent);
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
				return MEMORY_PERCENT_EDEFAULT == null ? memory_percent != null : !MEMORY_PERCENT_EDEFAULT.equals(memory_percent);
			case DockerPackage.CONTAINER__DISK_USED:
				return disk_used != DISK_USED_EDEFAULT;
			case DockerPackage.CONTAINER__DISK_PERCENT:
				return DISK_PERCENT_EDEFAULT == null ? disk_percent != null : !DISK_PERCENT_EDEFAULT.equals(disk_percent);
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
				return bandwidth_used != BANDWIDTH_USED_EDEFAULT;
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
				return BANDWIDTH_PERCENT_EDEFAULT == null ? bandwidth_percent != null : !BANDWIDTH_PERCENT_EDEFAULT.equals(bandwidth_percent);
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
				return monitoring_interval != MONITORING_INTERVAL_EDEFAULT;
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
				return cpu_max_value != CPU_MAX_VALUE_EDEFAULT;
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
				return memory_max_value != MEMORY_MAX_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DockerPackage.CONTAINER___CREATE:
				create();
				return null;
			case DockerPackage.CONTAINER___STOP:
				stop();
				return null;
			case DockerPackage.CONTAINER___RUN:
				run();
				return null;
			case DockerPackage.CONTAINER___PAUSE:
				pause();
				return null;
			case DockerPackage.CONTAINER___UNPAUSE:
				unpause();
				return null;
			case DockerPackage.CONTAINER___KILL__STRING:
				kill((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", containerid: ");
		result.append(containerid);
		result.append(", image: ");
		result.append(image);
		result.append(", build: ");
		result.append(build);
		result.append(", command: ");
		result.append(command);
		result.append(", ports: ");
		result.append(ports);
		result.append(", expose: ");
		result.append(expose);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", environment: ");
		result.append(environment);
		result.append(", env_file: ");
		result.append(env_file);
		result.append(", net: ");
		result.append(net);
		result.append(", dns: ");
		result.append(dns);
		result.append(", dns_search: ");
		result.append(dns_search);
		result.append(", cap_add: ");
		result.append(cap_add);
		result.append(", cap_drop: ");
		result.append(cap_drop);
		result.append(", working_dir: ");
		result.append(working_dir);
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", user: ");
		result.append(user);
		result.append(", domainname: ");
		result.append(domainname);
		result.append(", mem_limit: ");
		result.append(mem_limit);
		result.append(", memory_swap: ");
		result.append(memory_swap);
		result.append(", privileged: ");
		result.append(privileged);
		result.append(", restart: ");
		result.append(restart);
		result.append(", stdin_open: ");
		result.append(stdin_open);
		result.append(", interactive: ");
		result.append(interactive);
		result.append(", tty: ");
		result.append(tty);
		result.append(", cpu_shares: ");
		result.append(cpu_shares);
		result.append(", pid: ");
		result.append(pid);
		result.append(", ipc: ");
		result.append(ipc);
		result.append(", add_host: ");
		result.append(add_host);
		result.append(", mac_address: ");
		result.append(mac_address);
		result.append(", rm: ");
		result.append(rm);
		result.append(", security_opt: ");
		result.append(security_opt);
		result.append(", device: ");
		result.append(device);
		result.append(", lxc_conf: ");
		result.append(lxc_conf);
		result.append(", cpuset: ");
		result.append(cpuset);
		result.append(", publish_all: ");
		result.append(publish_all);
		result.append(", read_only: ");
		result.append(read_only);
		result.append(", monitored: ");
		result.append(monitored);
		result.append(", cpu_used: ");
		result.append(cpu_used);
		result.append(", memory_used: ");
		result.append(memory_used);
		result.append(", cpu_percent: ");
		result.append(cpu_percent);
		result.append(", memory_percent: ");
		result.append(memory_percent);
		result.append(", disk_used: ");
		result.append(disk_used);
		result.append(", disk_percent: ");
		result.append(disk_percent);
		result.append(", bandwidth_used: ");
		result.append(bandwidth_used);
		result.append(", bandwidth_percent: ");
		result.append(bandwidth_percent);
		result.append(", monitoring_interval: ");
		result.append(monitoring_interval);
		result.append(", cpu_max_value: ");
		result.append(cpu_max_value);
		result.append(", memory_max_value: ");
		result.append(memory_max_value);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
