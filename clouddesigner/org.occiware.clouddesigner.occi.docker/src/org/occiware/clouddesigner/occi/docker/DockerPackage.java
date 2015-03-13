/**
 */
package org.occiware.clouddesigner.occi.docker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.OCCI.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
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
	String eNS_URI = "http://schemas.ogf.org/occi/docker";

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
	 * The feature id for the '<em><b>Privileged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PRIVILEGED = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESTART = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Stdin open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STDIN_OPEN = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INTERACTIVE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Tty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TTY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Cpu shares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_SHARES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Ipc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IPC = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Add host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ADD_HOST = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MAC_ADDRESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Rm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Security opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SECURITY_OPT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEVICE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Lxc conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LXC_CONF = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Cpuset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPUSET = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 35;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___START = InfrastructurePackage.COMPUTE___START;

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
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CREATE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RUN = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___PAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Unpause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___UNPAUSE = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Kill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___KILL__STRING = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.DockerLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerLinkImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getDockerLink()
	 * @generated
	 */
	int DOCKER_LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK__ALIAS = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_LINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl <em>Volumesfrom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getVolumesfrom()
	 * @generated
	 */
	int VOLUMESFROM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM__ID = OCCIPackage.LINK__ID;

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
	int CONTAINS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ID = OCCIPackage.LINK__ID;

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
	int MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = InfrastructurePackage.COMPUTE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

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
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
	 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Amazon_EC2()
	 * @generated
	 */
	int MACHINE_AMAZON_EC2 = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Amazon EC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_DIGITAL_OCEAN = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Digital Ocean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_GOOGLE_COMPUTE_ENGINE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Google Compute Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_IBM_SOFT_LAYER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine IBM Soft Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_MICROSOFT_AZURE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Microsoft Azure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_MICROSOFT_HYPER_V = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Microsoft Hyper V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_OPEN_STACK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Open Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_RACKSPACE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine Rackspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_VIRTUAL_BOX = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX__NAME = MACHINE__NAME;

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
	int MACHINE_VMWARE_FUSION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine VMware Fusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_VMWARE_VCLOUD_AIR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine VMware vCloud Air</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MACHINE_VMWARE_VSPHERE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__ID = MACHINE__ID;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE__NAME = MACHINE__NAME;

	/**
	 * The number of structural features of the '<em>Machine VMware vSphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

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
	int MODE = 17;


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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#create()
	 * @generated
	 */
	EOperation getContainer__Create();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.DockerLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.DockerLink
	 * @generated
	 */
	EClass getDockerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.docker.DockerLink#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.DockerLink#getAlias()
	 * @see #getDockerLink()
	 * @generated
	 */
	EAttribute getDockerLink_Alias();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2 <em>Machine Amazon EC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Amazon EC2</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2
	 * @generated
	 */
	EClass getMachine_Amazon_EC2();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine <em>Machine Google Compute Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Google Compute Engine</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine
	 * @generated
	 */
	EClass getMachine_Google_Compute_Engine();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure <em>Machine Microsoft Azure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Microsoft Azure</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure
	 * @generated
	 */
	EClass getMachine_Microsoft_Azure();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack <em>Machine Open Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Open Stack</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack
	 * @generated
	 */
	EClass getMachine_OpenStack();

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
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air <em>Machine VMware vCloud Air</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine VMware vCloud Air</em>'.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air
	 * @generated
	 */
	EClass getMachine_VMware_vCloud_Air();

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
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CREATE = eINSTANCE.getContainer__Create();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.DockerLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerLinkImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getDockerLink()
		 * @generated
		 */
		EClass DOCKER_LINK = eINSTANCE.getDockerLink();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_LINK__ALIAS = eINSTANCE.getDockerLink_Alias();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl <em>Machine Amazon EC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Amazon_EC2()
		 * @generated
		 */
		EClass MACHINE_AMAZON_EC2 = eINSTANCE.getMachine_Amazon_EC2();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl <em>Machine Google Compute Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Google_Compute_Engine()
		 * @generated
		 */
		EClass MACHINE_GOOGLE_COMPUTE_ENGINE = eINSTANCE.getMachine_Google_Compute_Engine();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl <em>Machine Microsoft Azure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_Microsoft_Azure()
		 * @generated
		 */
		EClass MACHINE_MICROSOFT_AZURE = eINSTANCE.getMachine_Microsoft_Azure();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl <em>Machine Open Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_OpenStack()
		 * @generated
		 */
		EClass MACHINE_OPEN_STACK = eINSTANCE.getMachine_OpenStack();

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
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl <em>Machine VMware vCloud Air</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl
		 * @see org.occiware.clouddesigner.occi.docker.impl.DockerPackageImpl#getMachine_VMware_vCloud_Air()
		 * @generated
		 */
		EClass MACHINE_VMWARE_VCLOUD_AIR = eINSTANCE.getMachine_VMware_vCloud_Air();

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
