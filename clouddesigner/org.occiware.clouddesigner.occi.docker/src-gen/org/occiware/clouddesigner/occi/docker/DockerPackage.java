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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.docker.DockerFactory
 * @model kind="package"
 * @generated
 */
public interface DockerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/occi/docker/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerPackage eINSTANCE = org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.ContainerImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ARCHITECTURE = InfrastructurePackage.COMPUTE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CORES = InfrastructurePackage.COMPUTE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HOSTNAME = InfrastructurePackage.COMPUTE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SHARE = InfrastructurePackage.COMPUTE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SPEED = InfrastructurePackage.COMPUTE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY = InfrastructurePackage.COMPUTE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STATE = InfrastructurePackage.COMPUTE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MESSAGE = InfrastructurePackage.COMPUTE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containerid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINERID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BUILD = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMMAND = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__EXPOSE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVIRONMENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Env file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENV_FILE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Dns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DNS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dns search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DNS_SEARCH = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cap add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CAP_ADD = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cap drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CAP_DROP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Working dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WORKING_DIR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENTRYPOINT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__USER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Domainname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOMAINNAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Mem limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEM_LIMIT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Memory swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_SWAP = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Privileged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PRIVILEGED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESTART = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Stdin open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STDIN_OPEN = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTERACTIVE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Tty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TTY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Cpu shares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_SHARES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IPC = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Add host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADD_HOST = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MAC_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Rm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Security opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SECURITY_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEVICE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Lxc conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LXC_CONF = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Cpuset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPUSET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Publish all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PUBLISH_ALL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Read only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__READ_ONLY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Monitored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MONITORED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Cpu used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Memory used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Cpu percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Memory percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Disk used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISK_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Disk percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISK_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Bandwidth used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BANDWIDTH_USED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Bandwidth percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BANDWIDTH_PERCENT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Monitoring interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MONITORING_INTERVAL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Cpu max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_MAX_VALUE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Memory max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_MAX_VALUE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Core max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CORE_MAX = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 50;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 51;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CREATE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___START = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___STOP = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RUN = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___PAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Unpause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___UNPAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Kill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___KILL__STRING = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.LinkImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ALIAS = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.NetworkLinkImpl <em>Network Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.NetworkLinkImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getNetworkLink()
	 * @generated
	 */
	int NETWORK_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ID = LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TITLE = LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__KIND = LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__MIXINS = LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ATTRIBUTES = LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK__ALIAS = LINK__ALIAS;

	/**
	 * The number of structural features of the '<em>Network Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK___OCCI_CREATE = LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK___OCCI_RETRIEVE = LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK___OCCI_UPDATE = LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK___OCCI_DELETE = LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Network Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl <em>Volumesfrom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getVolumesfrom()
	 * @generated
	 */
	int VOLUMESFROM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__MODE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volumesfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Volumesfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.ContainsImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.MachineImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ARCHITECTURE = InfrastructurePackage.COMPUTE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CORES = InfrastructurePackage.COMPUTE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__HOSTNAME = InfrastructurePackage.COMPUTE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SHARE = InfrastructurePackage.COMPUTE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SPEED = InfrastructurePackage.COMPUTE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MEMORY = InfrastructurePackage.COMPUTE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STATE = InfrastructurePackage.COMPUTE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MESSAGE = InfrastructurePackage.COMPUTE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_INSTALL_URL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_INSECURE_REGISTRY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_REGISTRY_MIRROR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_LABEL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_STORAGE_DRIVER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ENGINE_ENV = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_IMAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_MASTER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_DISCOVERY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_STRATEGY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_HOST = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_ADDR = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SWARM_EXPERIMENTAL = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TLS_SAN = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 18;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.VolumeImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SIZE = InfrastructurePackage.STORAGE__SIZE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__STATE = InfrastructurePackage.STORAGE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MESSAGE = InfrastructurePackage.STORAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DRIVER = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LABELS = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__OPTIONS = InfrastructurePackage.STORAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DESTINATION = InfrastructurePackage.STORAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MODE = InfrastructurePackage.STORAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__RW = InfrastructurePackage.STORAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PROPAGATION = InfrastructurePackage.STORAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = InfrastructurePackage.STORAGE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.NetworkImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__VLAN = InfrastructurePackage.NETWORK__VLAN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LABEL = InfrastructurePackage.NETWORK__LABEL;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__STATE = InfrastructurePackage.NETWORK__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MESSAGE = InfrastructurePackage.NETWORK__MESSAGE;

	/**
	 * The feature id for the '<em><b>Network Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_ID = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = InfrastructurePackage.NETWORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__AUX_ADDRESS = InfrastructurePackage.NETWORK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DRIVER = InfrastructurePackage.NETWORK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__GATEWAY = InfrastructurePackage.NETWORK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__INTERNAL = InfrastructurePackage.NETWORK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ip range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IP_RANGE = InfrastructurePackage.NETWORK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ipam driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPAM_DRIVER = InfrastructurePackage.NETWORK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ipam opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPAM_OPT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ipv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPV6 = InfrastructurePackage.NETWORK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OPT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNET = InfrastructurePackage.NETWORK_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_CREATE = InfrastructurePackage.NETWORK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_RETRIEVE = InfrastructurePackage.NETWORK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_UPDATE = InfrastructurePackage.NETWORK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_DELETE = InfrastructurePackage.NETWORK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___UP = InfrastructurePackage.NETWORK___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___DOWN = InfrastructurePackage.NETWORK___DOWN;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = InfrastructurePackage.NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Amazon_EC2()
	 * @generated
	 */
	int MACHINE_AMAZON_EC2 = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ACCESS_KEY = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ami</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__AMI = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__INSTANCE_TYPE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__REGION = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ROOT_SIZE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SECRET_KEY = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SECURITY_GROUP = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Session token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SESSION_TOKEN = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__SUBNET_ID = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__VPC_ID = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ZONE = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Machine Amazon EC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Amazon EC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl <em>Machine Digital Ocean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Digital_Ocean()
	 * @generated
	 */
	int MACHINE_DIGITAL_OCEAN = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Access token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ACCESS_TOKEN = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__IMAGE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__REGION = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__SIZE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machine Digital Ocean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Digital Ocean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl <em>Machine Google Compute Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Google_Compute_Engine()
	 * @generated
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machine Google Compute Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Google Compute Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl <em>Machine IBM Soft Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_IBM_SoftLayer()
	 * @generated
	 */
	int MACHINE_IBM_SOFT_LAYER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Api endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__API_ENDPOINT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__USER = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__API_KEY = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__CPU = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__DISK_SIZE = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__DOMAIN = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hourly billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__IMAGE = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__LOCAL_DISK = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Private net only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__REGION = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Machine IBM Soft Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine IBM Soft Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl <em>Machine Microsoft Azure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Microsoft_Azure()
	 * @generated
	 */
	int MACHINE_MICROSOFT_AZURE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Subscription id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription cert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine Microsoft Azure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Microsoft Azure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl <em>Machine Microsoft Hyper V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Microsoft_Hyper_V()
	 * @generated
	 */
	int MACHINE_MICROSOFT_HYPER_V = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Boot2docker location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__DISK_SIZE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machine Microsoft Hyper V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Microsoft Hyper V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl <em>Machine Open Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_OpenStack()
	 * @generated
	 */
	int MACHINE_OPEN_STACK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__FLAVOR_ID = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__IMAGE_ID = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auth url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__AUTH_URL = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__USERNAME = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__PASSWORD = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__TENANT_NAME = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__TENANT_ID = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__REGION = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Endpoint type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ENDPOINT_TYPE = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Net id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NET_ID = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sec groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__SEC_GROUPS = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Floatingip pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__FLOATINGIP_POOL = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Machine Open Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Open Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl <em>Machine Rackspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Rackspace()
	 * @generated
	 */
	int MACHINE_RACKSPACE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__API_KEY = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__REGION = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ENDPOINT_TYPE = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__IMAGE_ID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__FLAVOR_ID = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ssh user</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SSH_USER = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ssh port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__SSH_PORT = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Machine Rackspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Rackspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl <em>Machine Virtual Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VirtualBox()
	 * @generated
	 */
	int MACHINE_VIRTUAL_BOX = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__DISK_SIZE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine Virtual Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine Virtual Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl <em>Machine VMware Fusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_Fusion()
	 * @generated
	 */
	int MACHINE_VMWARE_FUSION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__DISK_SIZE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Machine VMware Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine VMware Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl <em>Machine VMware vCloud Air</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	int MACHINE_VMWARE_VCLOUD_AIR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__PASSWORD = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__CATALOG = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Catalogitem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computeid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Docker port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Edgegateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vapp name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Orgvdcnetwork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Provision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__PROVISION = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Publicip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ssh port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT = MACHINE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vdcid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__VDCID = MACHINE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Machine VMware vCloud Air</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine VMware vCloud Air</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl <em>Machine VMware vSphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_vSphere()
	 * @generated
	 */
	int MACHINE_VMWARE_VSPHERE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ID = MACHINE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__TITLE = MACHINE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__KIND = MACHINE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__MIXINS = MACHINE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ATTRIBUTES = MACHINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SUMMARY = MACHINE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__LINKS = MACHINE__LINKS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ARCHITECTURE = MACHINE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__CORES = MACHINE__CORES;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__HOSTNAME = MACHINE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SHARE = MACHINE__SHARE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SPEED = MACHINE__SPEED;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__STATE = MACHINE__STATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__MESSAGE = MACHINE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_INSTALL_URL = MACHINE__ENGINE_INSTALL_URL;

	/**
	 * The feature id for the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_OPT = MACHINE__ENGINE_OPT;

	/**
	 * The feature id for the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_INSECURE_REGISTRY = MACHINE__ENGINE_INSECURE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_REGISTRY_MIRROR = MACHINE__ENGINE_REGISTRY_MIRROR;

	/**
	 * The feature id for the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_LABEL = MACHINE__ENGINE_LABEL;

	/**
	 * The feature id for the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_STORAGE_DRIVER = MACHINE__ENGINE_STORAGE_DRIVER;

	/**
	 * The feature id for the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ENGINE_ENV = MACHINE__ENGINE_ENV;

	/**
	 * The feature id for the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM = MACHINE__SWARM;

	/**
	 * The feature id for the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_IMAGE = MACHINE__SWARM_IMAGE;

	/**
	 * The feature id for the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_MASTER = MACHINE__SWARM_MASTER;

	/**
	 * The feature id for the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_DISCOVERY = MACHINE__SWARM_DISCOVERY;

	/**
	 * The feature id for the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_STRATEGY = MACHINE__SWARM_STRATEGY;

	/**
	 * The feature id for the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_OPT = MACHINE__SWARM_OPT;

	/**
	 * The feature id for the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_HOST = MACHINE__SWARM_HOST;

	/**
	 * The feature id for the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_ADDR = MACHINE__SWARM_ADDR;

	/**
	 * The feature id for the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__SWARM_EXPERIMENTAL = MACHINE__SWARM_EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__TLS_SAN = MACHINE__TLS_SAN;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__USERNAME = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__PASSWORD = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compute ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__COMPUTE_IP = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__CPU_COUNT = MACHINE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datacenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__DATACENTER = MACHINE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__DATASTORE = MACHINE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__DISK_SIZE = MACHINE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__MEMORY_SIZE = MACHINE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__NETWORK = MACHINE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__POOL = MACHINE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__VCENTER = MACHINE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Machine VMware vSphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___OCCI_CREATE = MACHINE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___OCCI_RETRIEVE = MACHINE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___OCCI_UPDATE = MACHINE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___OCCI_DELETE = MACHINE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___START = MACHINE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___STOP__STOPMETHOD = MACHINE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___RESTART__RESTARTMETHOD = MACHINE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___SUSPEND__SUSPENDMETHOD = MACHINE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___SAVE__SAVEMETHOD_STRING = MACHINE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Machine VMware vSphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.Mode
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 20;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getContainerid <em>Containerid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containerid</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getContainerid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Containerid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getBuild()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Build();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCommand()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expose</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getExpose()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Expose();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volumes</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getEnvironment()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Environment();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getEnv_file <em>Env file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env file</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getEnv_file()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Env_file();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getNet()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Net();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDns <em>Dns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDns()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Dns();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDns_search <em>Dns search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns search</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDns_search()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Dns_search();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCap_add <em>Cap add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap add</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCap_add()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cap_add();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCap_drop <em>Cap drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap drop</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCap_drop()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cap_drop();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getWorking_dir <em>Working dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working dir</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getWorking_dir()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Working_dir();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getEntrypoint()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Entrypoint();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getUser()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_User();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDomainname <em>Domainname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domainname</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDomainname()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Domainname();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMem_limit <em>Mem limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem limit</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMem_limit()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Mem_limit();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_swap <em>Memory swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory swap</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMemory_swap()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Memory_swap();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isPrivileged <em>Privileged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privileged</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isPrivileged()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Privileged();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getRestart()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Restart();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isStdin_open <em>Stdin open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdin open</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isStdin_open()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Stdin_open();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isInteractive <em>Interactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interactive</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isInteractive()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Interactive();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isTty <em>Tty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tty</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isTty()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Tty();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_shares <em>Cpu shares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu shares</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCpu_shares()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cpu_shares();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getPid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Pid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getIpc <em>Ipc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipc</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getIpc()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ipc();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getAdd_host <em>Add host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add host</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getAdd_host()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Add_host();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMac_address <em>Mac address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac address</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMac_address()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Mac_address();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isRm <em>Rm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isRm()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Rm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getSecurity_opt <em>Security opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security opt</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getSecurity_opt()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Security_opt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDevice()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Device();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getLxc_conf <em>Lxc conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lxc conf</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getLxc_conf()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Lxc_conf();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCpuset <em>Cpuset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpuset</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCpuset()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cpuset();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isPublish_all <em>Publish all</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish all</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isPublish_all()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Publish_all();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isRead_only <em>Read only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read only</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isRead_only()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Read_only();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#isMonitored <em>Monitored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#isMonitored()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Monitored();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_used <em>Cpu used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu used</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCpu_used()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cpu_used();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_used <em>Memory used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory used</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMemory_used()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Memory_used();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_percent <em>Cpu percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu percent</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCpu_percent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cpu_percent();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_percent <em>Memory percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory percent</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMemory_percent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Memory_percent();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDisk_used <em>Disk used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk used</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDisk_used()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Disk_used();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getDisk_percent <em>Disk percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk percent</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getDisk_percent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Disk_percent();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getBandwidth_used <em>Bandwidth used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth used</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getBandwidth_used()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Bandwidth_used();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getBandwidth_percent <em>Bandwidth percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth percent</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getBandwidth_percent()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Bandwidth_percent();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMonitoring_interval <em>Monitoring interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring interval</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMonitoring_interval()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Monitoring_interval();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCpu_max_value <em>Cpu max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu max value</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCpu_max_value()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Cpu_max_value();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getMemory_max_value <em>Memory max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory max value</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getMemory_max_value()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Memory_max_value();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Container#getCore_max <em>Core max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core max</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Container#getCore_max()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Core_max();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#create()
	 * @generated
	 */
	EOperation getContainer__Create();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#start()
	 * @generated
	 */
	EOperation getContainer__Start();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#stop()
	 * @generated
	 */
	EOperation getContainer__Stop();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#run()
	 * @generated
	 */
	EOperation getContainer__Run();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#pause()
	 * @generated
	 */
	EOperation getContainer__Pause();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#unpause() <em>Unpause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unpause</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#unpause()
	 * @generated
	 */
	EOperation getContainer__Unpause();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#kill(java.lang.String) <em>Kill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kill</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#kill(java.lang.String)
	 * @generated
	 */
	EOperation getContainer__Kill__String();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Link#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Link#getAlias()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Alias();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.NetworkLink
	 * @generated
	 */
	EClass getNetworkLink();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom <em>Volumesfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volumesfrom</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom
	 * @generated
	 */
	EClass getVolumesfrom();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom#getMode()
	 * @see #getVolumesfrom()
	 * @generated
	 */
	EAttribute getVolumesfrom_Mode();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_install_url <em>Engine install url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine install url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_install_url()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_install_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_opt <em>Engine opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine opt</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_opt()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_opt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_insecure_registry <em>Engine insecure registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine insecure registry</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_insecure_registry()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_insecure_registry();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_registry_mirror <em>Engine registry mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine registry mirror</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_registry_mirror()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_registry_mirror();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_label <em>Engine label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine label</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_label()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_label();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_storage_driver <em>Engine storage driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine storage driver</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_storage_driver()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_storage_driver();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_env <em>Engine env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine env</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getEngine_env()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Engine_env();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#isSwarm()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_image <em>Swarm image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm image</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_image()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm_master <em>Swarm master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm master</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#isSwarm_master()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_master();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_discovery <em>Swarm discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm discovery</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_discovery()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_discovery();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_strategy <em>Swarm strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm strategy</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_strategy()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_opt <em>Swarm opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm opt</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_opt()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_opt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_host <em>Swarm host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm host</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_host()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_host();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_addr <em>Swarm addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm addr</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_addr()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_addr();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_experimental <em>Swarm experimental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swarm experimental</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getSwarm_experimental()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Swarm_experimental();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine#getTls_san <em>Tls san</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tls san</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#getTls_san()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Tls_san();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getDriver()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getLabels()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getOptions()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Options();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getSource()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getDestination()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getMode()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getRw <em>Rw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getRw()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Rw();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getPropagation()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Propagation();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getNetworkId <em>Network Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getNetworkId()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_NetworkId();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getAux_address <em>Aux address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux address</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getAux_address()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Aux_address();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getGateway()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#isInternal()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Internal();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getIp_range <em>Ip range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip range</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getIp_range()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ip_range();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_driver <em>Ipam driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipam driver</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getIpam_driver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ipam_driver();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getIpam_opt <em>Ipam opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipam opt</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getIpam_opt()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ipam_opt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#isIpv6 <em>Ipv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipv6</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#isIpv6()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ipv6();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getOpt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getOpt()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Opt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Network#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Network#getSubnet()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Subnet();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2 <em>Machine Amazon EC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Amazon EC2</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2
	 * @generated
	 */
	EClass getMachine_Amazon_EC2();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access key</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAccess_key()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Access_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAmi <em>Ami</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ami</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAmi()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Ami();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getInstance_type <em>Instance type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance type</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getInstance_type()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Instance_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRegion()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRoot_size <em>Root size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRoot_size()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Root_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret key</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecret_key()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Secret_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security group</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecurity_group()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Security_group();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSession_token <em>Session token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session token</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSession_token()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Session_token();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSubnet_id <em>Subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSubnet_id()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Subnet_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getVpc_id <em>Vpc id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getVpc_id()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Vpc_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getZone()
	 * @see #getMachine_Amazon_EC2()
	 * @generated
	 */
	EAttribute getMachine_Amazon_EC2_Zone();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean <em>Machine Digital Ocean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Digital Ocean</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean
	 * @generated
	 */
	EClass getMachine_Digital_Ocean();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getAccess_token <em>Access token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access token</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getAccess_token()
	 * @see #getMachine_Digital_Ocean()
	 * @generated
	 */
	EAttribute getMachine_Digital_Ocean_Access_token();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getImage()
	 * @see #getMachine_Digital_Ocean()
	 * @generated
	 */
	EAttribute getMachine_Digital_Ocean_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getRegion()
	 * @see #getMachine_Digital_Ocean()
	 * @generated
	 */
	EAttribute getMachine_Digital_Ocean_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean#getSize()
	 * @see #getMachine_Digital_Ocean()
	 * @generated
	 */
	EAttribute getMachine_Digital_Ocean_Size();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine <em>Machine Google Compute Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Google Compute Engine</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine
	 * @generated
	 */
	EClass getMachine_Google_Compute_Engine();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getZone()
	 * @see #getMachine_Google_Compute_Engine()
	 * @generated
	 */
	EAttribute getMachine_Google_Compute_Engine_Zone();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type <em>Machine type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine type</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getMachine_type()
	 * @see #getMachine_Google_Compute_Engine()
	 * @generated
	 */
	EAttribute getMachine_Google_Compute_Engine_Machine_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getUsername()
	 * @see #getMachine_Google_Compute_Engine()
	 * @generated
	 */
	EAttribute getMachine_Google_Compute_Engine_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name <em>Instance name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getInstance_name()
	 * @see #getMachine_Google_Compute_Engine()
	 * @generated
	 */
	EAttribute getMachine_Google_Compute_Engine_Instance_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine#getProject()
	 * @see #getMachine_Google_Compute_Engine()
	 * @generated
	 */
	EAttribute getMachine_Google_Compute_Engine_Project();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer <em>Machine IBM Soft Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine IBM Soft Layer</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer
	 * @generated
	 */
	EClass getMachine_IBM_SoftLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_endpoint <em>Api endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api endpoint</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_endpoint()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Api_endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getUser()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_User();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_key()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getCpu()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDisk_size <em>Disk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDisk_size()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Disk_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDomain()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isHourly_billing <em>Hourly billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hourly billing</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isHourly_billing()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Hourly_billing();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getImage()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isLocal_disk <em>Local disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local disk</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isLocal_disk()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Local_disk();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isPrivate_net_only <em>Private net only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private net only</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isPrivate_net_only()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Private_net_only();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getRegion()
	 * @see #getMachine_IBM_SoftLayer()
	 * @generated
	 */
	EAttribute getMachine_IBM_SoftLayer_Region();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure <em>Machine Microsoft Azure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Microsoft Azure</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure
	 * @generated
	 */
	EClass getMachine_Microsoft_Azure();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_id <em>Subscription id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_id()
	 * @see #getMachine_Microsoft_Azure()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Azure_Subscription_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_cert <em>Subscription cert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription cert</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_cert()
	 * @see #getMachine_Microsoft_Azure()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Azure_Subscription_cert();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V <em>Machine Microsoft Hyper V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Microsoft Hyper V</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V
	 * @generated
	 */
	EClass getMachine_Microsoft_Hyper_V();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_location <em>Boot2docker location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker location</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_location()
	 * @see #getMachine_Microsoft_Hyper_V()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Hyper_V_Boot2docker_location();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url <em>Boot2docker url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getBoot2docker_url()
	 * @see #getMachine_Microsoft_Hyper_V()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Hyper_V_Boot2docker_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size <em>Disk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getDisk_size()
	 * @see #getMachine_Microsoft_Hyper_V()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Hyper_V_Disk_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch <em>Virtual switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual switch</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V#getVirtual_switch()
	 * @see #getMachine_Microsoft_Hyper_V()
	 * @generated
	 */
	EAttribute getMachine_Microsoft_Hyper_V_Virtual_switch();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack <em>Machine Open Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Open Stack</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack
	 * @generated
	 */
	EClass getMachine_OpenStack();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Flavor_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id <em>Image id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Image_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url <em>Auth url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Auth_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name <em>Tenant name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Tenant_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Tenant_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type <em>Endpoint type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint type</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Endpoint_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id <em>Net id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Net_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups <em>Sec groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec groups</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Sec_groups();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool <em>Floatingip pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floatingip pool</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool()
	 * @see #getMachine_OpenStack()
	 * @generated
	 */
	EAttribute getMachine_OpenStack_Floatingip_pool();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace <em>Machine Rackspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Rackspace</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace
	 * @generated
	 */
	EClass getMachine_Rackspace();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getUsername()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getApi_key <em>Api key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api key</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getApi_key()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Api_key();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getRegion()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getEndpoint_type <em>Endpoint type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint type</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getEndpoint_type()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Endpoint_type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getImage_id <em>Image id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getImage_id()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Image_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getFlavor_id <em>Flavor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor id</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getFlavor_id()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Flavor_id();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getSsh_user <em>Ssh user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh user</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getSsh_user()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Ssh_user();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getSsh_port <em>Ssh port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh port</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace#getSsh_port()
	 * @see #getMachine_Rackspace()
	 * @generated
	 */
	EAttribute getMachine_Rackspace_Ssh_port();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox <em>Machine Virtual Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Virtual Box</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
	 * @generated
	 */
	EClass getMachine_VirtualBox();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Boot2docker_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size()
	 * @see #getMachine_VirtualBox()
	 * @generated
	 */
	EAttribute getMachine_VirtualBox_Disk_size();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion <em>Machine VMware Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine VMware Fusion</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion
	 * @generated
	 */
	EClass getMachine_VMware_Fusion();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getBoot2docker_url <em>Boot2docker url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getBoot2docker_url()
	 * @see #getMachine_VMware_Fusion()
	 * @generated
	 */
	EAttribute getMachine_VMware_Fusion_Boot2docker_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getDisk_size <em>Disk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getDisk_size()
	 * @see #getMachine_VMware_Fusion()
	 * @generated
	 */
	EAttribute getMachine_VMware_Fusion_Disk_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getMemory_size <em>Memory size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion#getMemory_size()
	 * @see #getMachine_VMware_Fusion()
	 * @generated
	 */
	EAttribute getMachine_VMware_Fusion_Memory_size();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air <em>Machine VMware vCloud Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine VMware vCloud Air</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air
	 * @generated
	 */
	EClass getMachine_VMware_vCloud_Air();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getUsername()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPassword()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalog()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalogitem <em>Catalogitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalogitem</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCatalogitem()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Catalogitem();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getComputeid <em>Computeid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computeid</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getComputeid()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Computeid();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCpu_count <em>Cpu count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu count</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getCpu_count()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Cpu_count();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getDocker_port <em>Docker port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker port</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getDocker_port()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Docker_port();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getEdgegateway <em>Edgegateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edgegateway</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getEdgegateway()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Edgegateway();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getMemory_size <em>Memory size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getMemory_size()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Memory_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVapp_name <em>Vapp name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vapp name</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVapp_name()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Vapp_name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getOrgvdcnetwork <em>Orgvdcnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orgvdcnetwork</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getOrgvdcnetwork()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Orgvdcnetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#isProvision <em>Provision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provision</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#isProvision()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Provision();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPublicip <em>Publicip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publicip</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getPublicip()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Publicip();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getSsh_port <em>Ssh port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh port</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getSsh_port()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Ssh_port();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVdcid <em>Vdcid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdcid</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air#getVdcid()
	 * @see #getMachine_VMware_vCloud_Air()
	 * @generated
	 */
	EAttribute getMachine_VMware_vCloud_Air_Vdcid();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere <em>Machine VMware vSphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine VMware vSphere</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere
	 * @generated
	 */
	EClass getMachine_VMware_vSphere();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getUsername()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPassword()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getBoot2docker_url <em>Boot2docker url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boot2docker url</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getBoot2docker_url()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Boot2docker_url();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCompute_ip <em>Compute ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compute ip</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCompute_ip()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Compute_ip();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCpu_count <em>Cpu count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu count</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getCpu_count()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Cpu_count();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatacenter()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Datacenter();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastore</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDatastore()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Datastore();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDisk_size <em>Disk size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getDisk_size()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Disk_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getMemory_size <em>Memory size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory size</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getMemory_size()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Memory_size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getNetwork()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getPool()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Pool();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getVcenter <em>Vcenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcenter</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere#getVcenter()
	 * @see #getMachine_VMware_vSphere()
	 * @generated
	 */
	EAttribute getMachine_VMware_vSphere_Vcenter();

	/**
	 * Returns the meta object for enum '{@link org.occiware.clouddesigner.occi.docker.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerFactory getDockerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.ContainerImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Containerid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTAINERID = eINSTANCE.getContainer_Containerid();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BUILD = eINSTANCE.getContainer_Build();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__COMMAND = eINSTANCE.getContainer_Command();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PORTS = eINSTANCE.getContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__EXPOSE = eINSTANCE.getContainer_Expose();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENVIRONMENT = eINSTANCE.getContainer_Environment();

		/**
		 * The meta object literal for the '<em><b>Env file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENV_FILE = eINSTANCE.getContainer_Env_file();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NET = eINSTANCE.getContainer_Net();

		/**
		 * The meta object literal for the '<em><b>Dns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DNS = eINSTANCE.getContainer_Dns();

		/**
		 * The meta object literal for the '<em><b>Dns search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DNS_SEARCH = eINSTANCE.getContainer_Dns_search();

		/**
		 * The meta object literal for the '<em><b>Cap add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CAP_ADD = eINSTANCE.getContainer_Cap_add();

		/**
		 * The meta object literal for the '<em><b>Cap drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CAP_DROP = eINSTANCE.getContainer_Cap_drop();

		/**
		 * The meta object literal for the '<em><b>Working dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__WORKING_DIR = eINSTANCE.getContainer_Working_dir();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ENTRYPOINT = eINSTANCE.getContainer_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__USER = eINSTANCE.getContainer_User();

		/**
		 * The meta object literal for the '<em><b>Domainname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DOMAINNAME = eINSTANCE.getContainer_Domainname();

		/**
		 * The meta object literal for the '<em><b>Mem limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEM_LIMIT = eINSTANCE.getContainer_Mem_limit();

		/**
		 * The meta object literal for the '<em><b>Memory swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_SWAP = eINSTANCE.getContainer_Memory_swap();

		/**
		 * The meta object literal for the '<em><b>Privileged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PRIVILEGED = eINSTANCE.getContainer_Privileged();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RESTART = eINSTANCE.getContainer_Restart();

		/**
		 * The meta object literal for the '<em><b>Stdin open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__STDIN_OPEN = eINSTANCE.getContainer_Stdin_open();

		/**
		 * The meta object literal for the '<em><b>Interactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__INTERACTIVE = eINSTANCE.getContainer_Interactive();

		/**
		 * The meta object literal for the '<em><b>Tty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__TTY = eINSTANCE.getContainer_Tty();

		/**
		 * The meta object literal for the '<em><b>Cpu shares</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_SHARES = eINSTANCE.getContainer_Cpu_shares();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PID = eINSTANCE.getContainer_Pid();

		/**
		 * The meta object literal for the '<em><b>Ipc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IPC = eINSTANCE.getContainer_Ipc();

		/**
		 * The meta object literal for the '<em><b>Add host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ADD_HOST = eINSTANCE.getContainer_Add_host();

		/**
		 * The meta object literal for the '<em><b>Mac address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MAC_ADDRESS = eINSTANCE.getContainer_Mac_address();

		/**
		 * The meta object literal for the '<em><b>Rm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RM = eINSTANCE.getContainer_Rm();

		/**
		 * The meta object literal for the '<em><b>Security opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__SECURITY_OPT = eINSTANCE.getContainer_Security_opt();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DEVICE = eINSTANCE.getContainer_Device();

		/**
		 * The meta object literal for the '<em><b>Lxc conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__LXC_CONF = eINSTANCE.getContainer_Lxc_conf();

		/**
		 * The meta object literal for the '<em><b>Cpuset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPUSET = eINSTANCE.getContainer_Cpuset();

		/**
		 * The meta object literal for the '<em><b>Publish all</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PUBLISH_ALL = eINSTANCE.getContainer_Publish_all();

		/**
		 * The meta object literal for the '<em><b>Read only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__READ_ONLY = eINSTANCE.getContainer_Read_only();

		/**
		 * The meta object literal for the '<em><b>Monitored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MONITORED = eINSTANCE.getContainer_Monitored();

		/**
		 * The meta object literal for the '<em><b>Cpu used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_USED = eINSTANCE.getContainer_Cpu_used();

		/**
		 * The meta object literal for the '<em><b>Memory used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_USED = eINSTANCE.getContainer_Memory_used();

		/**
		 * The meta object literal for the '<em><b>Cpu percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_PERCENT = eINSTANCE.getContainer_Cpu_percent();

		/**
		 * The meta object literal for the '<em><b>Memory percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_PERCENT = eINSTANCE.getContainer_Memory_percent();

		/**
		 * The meta object literal for the '<em><b>Disk used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DISK_USED = eINSTANCE.getContainer_Disk_used();

		/**
		 * The meta object literal for the '<em><b>Disk percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DISK_PERCENT = eINSTANCE.getContainer_Disk_percent();

		/**
		 * The meta object literal for the '<em><b>Bandwidth used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BANDWIDTH_USED = eINSTANCE.getContainer_Bandwidth_used();

		/**
		 * The meta object literal for the '<em><b>Bandwidth percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__BANDWIDTH_PERCENT = eINSTANCE.getContainer_Bandwidth_percent();

		/**
		 * The meta object literal for the '<em><b>Monitoring interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MONITORING_INTERVAL = eINSTANCE.getContainer_Monitoring_interval();

		/**
		 * The meta object literal for the '<em><b>Cpu max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CPU_MAX_VALUE = eINSTANCE.getContainer_Cpu_max_value();

		/**
		 * The meta object literal for the '<em><b>Memory max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__MEMORY_MAX_VALUE = eINSTANCE.getContainer_Memory_max_value();

		/**
		 * The meta object literal for the '<em><b>Core max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CORE_MAX = eINSTANCE.getContainer_Core_max();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CREATE = eINSTANCE.getContainer__Create();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___START = eINSTANCE.getContainer__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___STOP = eINSTANCE.getContainer__Stop();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___RUN = eINSTANCE.getContainer__Run();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___PAUSE = eINSTANCE.getContainer__Pause();

		/**
		 * The meta object literal for the '<em><b>Unpause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___UNPAUSE = eINSTANCE.getContainer__Unpause();

		/**
		 * The meta object literal for the '<em><b>Kill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___KILL__STRING = eINSTANCE.getContainer__Kill__String();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.LinkImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ALIAS = eINSTANCE.getLink_Alias();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.NetworkLinkImpl <em>Network Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.NetworkLinkImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getNetworkLink()
		 * @generated
		 */
		EClass NETWORK_LINK = eINSTANCE.getNetworkLink();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl <em>Volumesfrom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getVolumesfrom()
		 * @generated
		 */
		EClass VOLUMESFROM = eINSTANCE.getVolumesfrom();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUMESFROM__MODE = eINSTANCE.getVolumesfrom_Mode();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.ContainsImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.MachineImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Engine install url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_INSTALL_URL = eINSTANCE.getMachine_Engine_install_url();

		/**
		 * The meta object literal for the '<em><b>Engine opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_OPT = eINSTANCE.getMachine_Engine_opt();

		/**
		 * The meta object literal for the '<em><b>Engine insecure registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_INSECURE_REGISTRY = eINSTANCE.getMachine_Engine_insecure_registry();

		/**
		 * The meta object literal for the '<em><b>Engine registry mirror</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_REGISTRY_MIRROR = eINSTANCE.getMachine_Engine_registry_mirror();

		/**
		 * The meta object literal for the '<em><b>Engine label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_LABEL = eINSTANCE.getMachine_Engine_label();

		/**
		 * The meta object literal for the '<em><b>Engine storage driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_STORAGE_DRIVER = eINSTANCE.getMachine_Engine_storage_driver();

		/**
		 * The meta object literal for the '<em><b>Engine env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ENGINE_ENV = eINSTANCE.getMachine_Engine_env();

		/**
		 * The meta object literal for the '<em><b>Swarm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM = eINSTANCE.getMachine_Swarm();

		/**
		 * The meta object literal for the '<em><b>Swarm image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_IMAGE = eINSTANCE.getMachine_Swarm_image();

		/**
		 * The meta object literal for the '<em><b>Swarm master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_MASTER = eINSTANCE.getMachine_Swarm_master();

		/**
		 * The meta object literal for the '<em><b>Swarm discovery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_DISCOVERY = eINSTANCE.getMachine_Swarm_discovery();

		/**
		 * The meta object literal for the '<em><b>Swarm strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_STRATEGY = eINSTANCE.getMachine_Swarm_strategy();

		/**
		 * The meta object literal for the '<em><b>Swarm opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_OPT = eINSTANCE.getMachine_Swarm_opt();

		/**
		 * The meta object literal for the '<em><b>Swarm host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_HOST = eINSTANCE.getMachine_Swarm_host();

		/**
		 * The meta object literal for the '<em><b>Swarm addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_ADDR = eINSTANCE.getMachine_Swarm_addr();

		/**
		 * The meta object literal for the '<em><b>Swarm experimental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__SWARM_EXPERIMENTAL = eINSTANCE.getMachine_Swarm_experimental();

		/**
		 * The meta object literal for the '<em><b>Tls san</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__TLS_SAN = eINSTANCE.getMachine_Tls_san();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.VolumeImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DRIVER = eINSTANCE.getVolume_Driver();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__LABELS = eINSTANCE.getVolume_Labels();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__OPTIONS = eINSTANCE.getVolume_Options();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE = eINSTANCE.getVolume_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DESTINATION = eINSTANCE.getVolume_Destination();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MODE = eINSTANCE.getVolume_Mode();

		/**
		 * The meta object literal for the '<em><b>Rw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__RW = eINSTANCE.getVolume_Rw();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__PROPAGATION = eINSTANCE.getVolume_Propagation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.NetworkImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Network Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NETWORK_ID = eINSTANCE.getNetwork_NetworkId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Aux address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__AUX_ADDRESS = eINSTANCE.getNetwork_Aux_address();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DRIVER = eINSTANCE.getNetwork_Driver();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__GATEWAY = eINSTANCE.getNetwork_Gateway();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__INTERNAL = eINSTANCE.getNetwork_Internal();

		/**
		 * The meta object literal for the '<em><b>Ip range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IP_RANGE = eINSTANCE.getNetwork_Ip_range();

		/**
		 * The meta object literal for the '<em><b>Ipam driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPAM_DRIVER = eINSTANCE.getNetwork_Ipam_driver();

		/**
		 * The meta object literal for the '<em><b>Ipam opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPAM_OPT = eINSTANCE.getNetwork_Ipam_opt();

		/**
		 * The meta object literal for the '<em><b>Ipv6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPV6 = eINSTANCE.getNetwork_Ipv6();

		/**
		 * The meta object literal for the '<em><b>Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OPT = eINSTANCE.getNetwork_Opt();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__SUBNET = eINSTANCE.getNetwork_Subnet();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Amazon_EC2()
		 * @generated
		 */
		EClass MACHINE_AMAZON_EC2 = eINSTANCE.getMachine_Amazon_EC2();

		/**
		 * The meta object literal for the '<em><b>Access key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__ACCESS_KEY = eINSTANCE.getMachine_Amazon_EC2_Access_key();

		/**
		 * The meta object literal for the '<em><b>Ami</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__AMI = eINSTANCE.getMachine_Amazon_EC2_Ami();

		/**
		 * The meta object literal for the '<em><b>Instance type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__INSTANCE_TYPE = eINSTANCE.getMachine_Amazon_EC2_Instance_type();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__REGION = eINSTANCE.getMachine_Amazon_EC2_Region();

		/**
		 * The meta object literal for the '<em><b>Root size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__ROOT_SIZE = eINSTANCE.getMachine_Amazon_EC2_Root_size();

		/**
		 * The meta object literal for the '<em><b>Secret key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SECRET_KEY = eINSTANCE.getMachine_Amazon_EC2_Secret_key();

		/**
		 * The meta object literal for the '<em><b>Security group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SECURITY_GROUP = eINSTANCE.getMachine_Amazon_EC2_Security_group();

		/**
		 * The meta object literal for the '<em><b>Session token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SESSION_TOKEN = eINSTANCE.getMachine_Amazon_EC2_Session_token();

		/**
		 * The meta object literal for the '<em><b>Subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__SUBNET_ID = eINSTANCE.getMachine_Amazon_EC2_Subnet_id();

		/**
		 * The meta object literal for the '<em><b>Vpc id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__VPC_ID = eINSTANCE.getMachine_Amazon_EC2_Vpc_id();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_AMAZON_EC2__ZONE = eINSTANCE.getMachine_Amazon_EC2_Zone();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl <em>Machine Digital Ocean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Digital_Ocean()
		 * @generated
		 */
		EClass MACHINE_DIGITAL_OCEAN = eINSTANCE.getMachine_Digital_Ocean();

		/**
		 * The meta object literal for the '<em><b>Access token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_DIGITAL_OCEAN__ACCESS_TOKEN = eINSTANCE.getMachine_Digital_Ocean_Access_token();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_DIGITAL_OCEAN__IMAGE = eINSTANCE.getMachine_Digital_Ocean_Image();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_DIGITAL_OCEAN__REGION = eINSTANCE.getMachine_Digital_Ocean_Region();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_DIGITAL_OCEAN__SIZE = eINSTANCE.getMachine_Digital_Ocean_Size();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl <em>Machine Google Compute Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Google_Compute_Engine()
		 * @generated
		 */
		EClass MACHINE_GOOGLE_COMPUTE_ENGINE = eINSTANCE.getMachine_Google_Compute_Engine();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE = eINSTANCE.getMachine_Google_Compute_Engine_Zone();

		/**
		 * The meta object literal for the '<em><b>Machine type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE = eINSTANCE.getMachine_Google_Compute_Engine_Machine_type();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME = eINSTANCE.getMachine_Google_Compute_Engine_Username();

		/**
		 * The meta object literal for the '<em><b>Instance name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME = eINSTANCE.getMachine_Google_Compute_Engine_Instance_name();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT = eINSTANCE.getMachine_Google_Compute_Engine_Project();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl <em>Machine IBM Soft Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_IBM_SoftLayer()
		 * @generated
		 */
		EClass MACHINE_IBM_SOFT_LAYER = eINSTANCE.getMachine_IBM_SoftLayer();

		/**
		 * The meta object literal for the '<em><b>Api endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__API_ENDPOINT = eINSTANCE.getMachine_IBM_SoftLayer_Api_endpoint();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__USER = eINSTANCE.getMachine_IBM_SoftLayer_User();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__API_KEY = eINSTANCE.getMachine_IBM_SoftLayer_Api_key();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__CPU = eINSTANCE.getMachine_IBM_SoftLayer_Cpu();

		/**
		 * The meta object literal for the '<em><b>Disk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__DISK_SIZE = eINSTANCE.getMachine_IBM_SoftLayer_Disk_size();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__DOMAIN = eINSTANCE.getMachine_IBM_SoftLayer_Domain();

		/**
		 * The meta object literal for the '<em><b>Hourly billing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING = eINSTANCE.getMachine_IBM_SoftLayer_Hourly_billing();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__IMAGE = eINSTANCE.getMachine_IBM_SoftLayer_Image();

		/**
		 * The meta object literal for the '<em><b>Local disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__LOCAL_DISK = eINSTANCE.getMachine_IBM_SoftLayer_Local_disk();

		/**
		 * The meta object literal for the '<em><b>Private net only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY = eINSTANCE.getMachine_IBM_SoftLayer_Private_net_only();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IBM_SOFT_LAYER__REGION = eINSTANCE.getMachine_IBM_SoftLayer_Region();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl <em>Machine Microsoft Azure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Microsoft_Azure()
		 * @generated
		 */
		EClass MACHINE_MICROSOFT_AZURE = eINSTANCE.getMachine_Microsoft_Azure();

		/**
		 * The meta object literal for the '<em><b>Subscription id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID = eINSTANCE.getMachine_Microsoft_Azure_Subscription_id();

		/**
		 * The meta object literal for the '<em><b>Subscription cert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT = eINSTANCE.getMachine_Microsoft_Azure_Subscription_cert();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl <em>Machine Microsoft Hyper V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Microsoft_Hyper_V()
		 * @generated
		 */
		EClass MACHINE_MICROSOFT_HYPER_V = eINSTANCE.getMachine_Microsoft_Hyper_V();

		/**
		 * The meta object literal for the '<em><b>Boot2docker location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION = eINSTANCE.getMachine_Microsoft_Hyper_V_Boot2docker_location();

		/**
		 * The meta object literal for the '<em><b>Boot2docker url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL = eINSTANCE.getMachine_Microsoft_Hyper_V_Boot2docker_url();

		/**
		 * The meta object literal for the '<em><b>Disk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_HYPER_V__DISK_SIZE = eINSTANCE.getMachine_Microsoft_Hyper_V_Disk_size();

		/**
		 * The meta object literal for the '<em><b>Virtual switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH = eINSTANCE.getMachine_Microsoft_Hyper_V_Virtual_switch();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl <em>Machine Open Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_OpenStack()
		 * @generated
		 */
		EClass MACHINE_OPEN_STACK = eINSTANCE.getMachine_OpenStack();

		/**
		 * The meta object literal for the '<em><b>Flavor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__FLAVOR_ID = eINSTANCE.getMachine_OpenStack_Flavor_id();

		/**
		 * The meta object literal for the '<em><b>Image id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__IMAGE_ID = eINSTANCE.getMachine_OpenStack_Image_id();

		/**
		 * The meta object literal for the '<em><b>Auth url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__AUTH_URL = eINSTANCE.getMachine_OpenStack_Auth_url();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__USERNAME = eINSTANCE.getMachine_OpenStack_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__PASSWORD = eINSTANCE.getMachine_OpenStack_Password();

		/**
		 * The meta object literal for the '<em><b>Tenant name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__TENANT_NAME = eINSTANCE.getMachine_OpenStack_Tenant_name();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__TENANT_ID = eINSTANCE.getMachine_OpenStack_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__REGION = eINSTANCE.getMachine_OpenStack_Region();

		/**
		 * The meta object literal for the '<em><b>Endpoint type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__ENDPOINT_TYPE = eINSTANCE.getMachine_OpenStack_Endpoint_type();

		/**
		 * The meta object literal for the '<em><b>Net id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__NET_ID = eINSTANCE.getMachine_OpenStack_Net_id();

		/**
		 * The meta object literal for the '<em><b>Sec groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__SEC_GROUPS = eINSTANCE.getMachine_OpenStack_Sec_groups();

		/**
		 * The meta object literal for the '<em><b>Floatingip pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_OPEN_STACK__FLOATINGIP_POOL = eINSTANCE.getMachine_OpenStack_Floatingip_pool();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl <em>Machine Rackspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Rackspace()
		 * @generated
		 */
		EClass MACHINE_RACKSPACE = eINSTANCE.getMachine_Rackspace();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__USERNAME = eINSTANCE.getMachine_Rackspace_Username();

		/**
		 * The meta object literal for the '<em><b>Api key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__API_KEY = eINSTANCE.getMachine_Rackspace_Api_key();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__REGION = eINSTANCE.getMachine_Rackspace_Region();

		/**
		 * The meta object literal for the '<em><b>Endpoint type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__ENDPOINT_TYPE = eINSTANCE.getMachine_Rackspace_Endpoint_type();

		/**
		 * The meta object literal for the '<em><b>Image id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__IMAGE_ID = eINSTANCE.getMachine_Rackspace_Image_id();

		/**
		 * The meta object literal for the '<em><b>Flavor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__FLAVOR_ID = eINSTANCE.getMachine_Rackspace_Flavor_id();

		/**
		 * The meta object literal for the '<em><b>Ssh user</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__SSH_USER = eINSTANCE.getMachine_Rackspace_Ssh_user();

		/**
		 * The meta object literal for the '<em><b>Ssh port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_RACKSPACE__SSH_PORT = eINSTANCE.getMachine_Rackspace_Ssh_port();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl <em>Machine Virtual Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VirtualBox()
		 * @generated
		 */
		EClass MACHINE_VIRTUAL_BOX = eINSTANCE.getMachine_VirtualBox();

		/**
		 * The meta object literal for the '<em><b>Boot2docker url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL = eINSTANCE.getMachine_VirtualBox_Boot2docker_url();

		/**
		 * The meta object literal for the '<em><b>Disk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VIRTUAL_BOX__DISK_SIZE = eINSTANCE.getMachine_VirtualBox_Disk_size();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl <em>Machine VMware Fusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_Fusion()
		 * @generated
		 */
		EClass MACHINE_VMWARE_FUSION = eINSTANCE.getMachine_VMware_Fusion();

		/**
		 * The meta object literal for the '<em><b>Boot2docker url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL = eINSTANCE.getMachine_VMware_Fusion_Boot2docker_url();

		/**
		 * The meta object literal for the '<em><b>Disk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_FUSION__DISK_SIZE = eINSTANCE.getMachine_VMware_Fusion_Disk_size();

		/**
		 * The meta object literal for the '<em><b>Memory size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_FUSION__MEMORY_SIZE = eINSTANCE.getMachine_VMware_Fusion_Memory_size();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl <em>Machine VMware vCloud Air</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_vCloud_Air()
		 * @generated
		 */
		EClass MACHINE_VMWARE_VCLOUD_AIR = eINSTANCE.getMachine_VMware_vCloud_Air();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__USERNAME = eINSTANCE.getMachine_VMware_vCloud_Air_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__PASSWORD = eINSTANCE.getMachine_VMware_vCloud_Air_Password();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__CATALOG = eINSTANCE.getMachine_VMware_vCloud_Air_Catalog();

		/**
		 * The meta object literal for the '<em><b>Catalogitem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM = eINSTANCE.getMachine_VMware_vCloud_Air_Catalogitem();

		/**
		 * The meta object literal for the '<em><b>Computeid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID = eINSTANCE.getMachine_VMware_vCloud_Air_Computeid();

		/**
		 * The meta object literal for the '<em><b>Cpu count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT = eINSTANCE.getMachine_VMware_vCloud_Air_Cpu_count();

		/**
		 * The meta object literal for the '<em><b>Docker port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT = eINSTANCE.getMachine_VMware_vCloud_Air_Docker_port();

		/**
		 * The meta object literal for the '<em><b>Edgegateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY = eINSTANCE.getMachine_VMware_vCloud_Air_Edgegateway();

		/**
		 * The meta object literal for the '<em><b>Memory size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE = eINSTANCE.getMachine_VMware_vCloud_Air_Memory_size();

		/**
		 * The meta object literal for the '<em><b>Vapp name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME = eINSTANCE.getMachine_VMware_vCloud_Air_Vapp_name();

		/**
		 * The meta object literal for the '<em><b>Orgvdcnetwork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK = eINSTANCE.getMachine_VMware_vCloud_Air_Orgvdcnetwork();

		/**
		 * The meta object literal for the '<em><b>Provision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__PROVISION = eINSTANCE.getMachine_VMware_vCloud_Air_Provision();

		/**
		 * The meta object literal for the '<em><b>Publicip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP = eINSTANCE.getMachine_VMware_vCloud_Air_Publicip();

		/**
		 * The meta object literal for the '<em><b>Ssh port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT = eINSTANCE.getMachine_VMware_vCloud_Air_Ssh_port();

		/**
		 * The meta object literal for the '<em><b>Vdcid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VCLOUD_AIR__VDCID = eINSTANCE.getMachine_VMware_vCloud_Air_Vdcid();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl <em>Machine VMware vSphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_vSphere()
		 * @generated
		 */
		EClass MACHINE_VMWARE_VSPHERE = eINSTANCE.getMachine_VMware_vSphere();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__USERNAME = eINSTANCE.getMachine_VMware_vSphere_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__PASSWORD = eINSTANCE.getMachine_VMware_vSphere_Password();

		/**
		 * The meta object literal for the '<em><b>Boot2docker url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL = eINSTANCE.getMachine_VMware_vSphere_Boot2docker_url();

		/**
		 * The meta object literal for the '<em><b>Compute ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__COMPUTE_IP = eINSTANCE.getMachine_VMware_vSphere_Compute_ip();

		/**
		 * The meta object literal for the '<em><b>Cpu count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__CPU_COUNT = eINSTANCE.getMachine_VMware_vSphere_Cpu_count();

		/**
		 * The meta object literal for the '<em><b>Datacenter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__DATACENTER = eINSTANCE.getMachine_VMware_vSphere_Datacenter();

		/**
		 * The meta object literal for the '<em><b>Datastore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__DATASTORE = eINSTANCE.getMachine_VMware_vSphere_Datastore();

		/**
		 * The meta object literal for the '<em><b>Disk size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__DISK_SIZE = eINSTANCE.getMachine_VMware_vSphere_Disk_size();

		/**
		 * The meta object literal for the '<em><b>Memory size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__MEMORY_SIZE = eINSTANCE.getMachine_VMware_vSphere_Memory_size();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__NETWORK = eINSTANCE.getMachine_VMware_vSphere_Network();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__POOL = eINSTANCE.getMachine_VMware_vSphere_Pool();

		/**
		 * The meta object literal for the '<em><b>Vcenter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_VMWARE_VSPHERE__VCENTER = eINSTANCE.getMachine_VMware_vSphere_Vcenter();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.Mode
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //DockerPackage
