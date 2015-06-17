/**
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.docker.DockerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import OCCI='../../org.occiware.clouddesigner.occi/model/OCCI.ecore#/' infrastructure='../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#/'"
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
	String eNS_URI = "http://occiware.org/docker";

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
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 38;

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
	 * The operation id for the '<em>Container Link Alias Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CONTAINER_LINK_ALIAS_UNIQUE__DIAGNOSTICCHAIN_MAP = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Container No Cycle Between Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CONTAINER_NO_CYCLE_BETWEEN_CONTAINERS__DIAGNOSTICCHAIN_MAP = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 6;

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
	 * The operation id for the '<em>Link Target As Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Link Source As Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Link Can Only Connect Colocalized Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 3;

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
	 * The operation id for the '<em>Volumes From Source As Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___VOLUMES_FROM_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Volumes From Target As Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___VOLUMES_FROM_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Volumes From Can Only Connect Colocalized Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM___VOLUMES_FROM_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Volumesfrom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMESFROM_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 3;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 1;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_AMAZON_EC2___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_DIGITAL_OCEAN___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_GOOGLE_COMPUTE_ENGINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IBM_SOFT_LAYER___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_AZURE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_MICROSOFT_HYPER_V___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPEN_STACK___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RACKSPACE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Containers Used Too Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX___CONTAINERS_USED_TOO_MEMORY__DIAGNOSTICCHAIN_MAP = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine Virtual Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VIRTUAL_BOX_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 1;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_FUSION___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VCLOUD_AIR___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * The operation id for the '<em>Machine Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_VMWARE_VSPHERE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#ContainerLinkAliasUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container Link Alias Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Link Alias Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#ContainerLinkAliasUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContainer__ContainerLinkAliasUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Container#ContainerNoCycleBetweenContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container No Cycle Between Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container No Cycle Between Containers</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Container#ContainerNoCycleBetweenContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContainer__ContainerNoCycleBetweenContainers__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Link#LinkTargetAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Target As Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Target As Container</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Link#LinkTargetAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLink__LinkTargetAsContainer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Link#LinkSourceAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Source As Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Source As Container</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Link#LinkSourceAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLink__LinkSourceAsContainer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Link#LinkCanOnlyConnectColocalizedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Can Only Connect Colocalized Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Can Only Connect Colocalized Containers</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Link#LinkCanOnlyConnectColocalizedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLink__LinkCanOnlyConnectColocalizedContainers__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromSourceAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Volumes From Source As Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volumes From Source As Container</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromSourceAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVolumesfrom__VolumesFromSourceAsContainer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromTargetAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Volumes From Target As Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volumes From Target As Container</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromTargetAsContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVolumesfrom__VolumesFromTargetAsContainer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromCanOnlyConnectColocalizedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Volumes From Can Only Connect Colocalized Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Volumes From Can Only Connect Colocalized Containers</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom#VolumesFromCanOnlyConnectColocalizedContainers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVolumesfrom__VolumesFromCanOnlyConnectColocalizedContainers__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Machine#MachineNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machine Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machine Name Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Machine#MachineNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMachine__MachineNameUnique__DiagnosticChain_Map();

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
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#ContainersUsedTooMemory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Containers Used Too Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containers Used Too Memory</em>' operation.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#ContainersUsedTooMemory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMachine_VirtualBox__ContainersUsedTooMemory__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Container Link Alias Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CONTAINER_LINK_ALIAS_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContainer__ContainerLinkAliasUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Container No Cycle Between Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CONTAINER_NO_CYCLE_BETWEEN_CONTAINERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContainer__ContainerNoCycleBetweenContainers__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Link Target As Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___LINK_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLink__LinkTargetAsContainer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Link Source As Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___LINK_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLink__LinkSourceAsContainer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Link Can Only Connect Colocalized Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLink__LinkCanOnlyConnectColocalizedContainers__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Volumes From Source As Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOLUMESFROM___VOLUMES_FROM_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVolumesfrom__VolumesFromSourceAsContainer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Volumes From Target As Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOLUMESFROM___VOLUMES_FROM_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVolumesfrom__VolumesFromTargetAsContainer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Volumes From Can Only Connect Colocalized Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOLUMESFROM___VOLUMES_FROM_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVolumesfrom__VolumesFromCanOnlyConnectColocalizedContainers__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Machine Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMachine__MachineNameUnique__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Containers Used Too Memory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACHINE_VIRTUAL_BOX___CONTAINERS_USED_TOO_MEMORY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMachine_VirtualBox__ContainersUsedTooMemory__DiagnosticChain_Map();

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
