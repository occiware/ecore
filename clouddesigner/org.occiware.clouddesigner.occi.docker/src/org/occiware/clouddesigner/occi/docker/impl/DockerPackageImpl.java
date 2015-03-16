/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.OCCI.OCCIPackage;

import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerLink;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.Mode;
import org.occiware.clouddesigner.occi.docker.Volumesfrom;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerPackageImpl extends EPackageImpl implements DockerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumesfromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Amazon_EC2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Digital_OceanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Google_Compute_EngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_IBM_SoftLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Microsoft_AzureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Microsoft_Hyper_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_OpenStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_RackspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VirtualBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_FusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_vCloud_AirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_vSphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerPackageImpl() {
		super(eNS_URI, DockerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DockerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerPackage init() {
		if (isInited) return (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Obtain or create and register package
		DockerPackageImpl theDockerPackage = (DockerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockerPackage.createPackageContents();

		// Initialize created meta-data
		theDockerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerPackage.eNS_URI, theDockerPackage);
		return theDockerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Containerid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Image() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Build() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Command() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ports() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Expose() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Volumes() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Environment() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Env_file() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Net() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Dns() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Dns_search() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cap_add() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cap_drop() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Working_dir() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Entrypoint() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_User() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Domainname() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Mem_limit() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Memory_swap() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Privileged() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Restart() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Stdin_open() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Interactive() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Tty() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpu_shares() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Pid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ipc() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Add_host() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Mac_address() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Rm() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Security_opt() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Device() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Lxc_conf() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpuset() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Publish_all() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Read_only() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Create() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Run() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Pause() {
		return containerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Unpause() {
		return containerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Kill__String() {
		return containerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerLink() {
		return dockerLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerLink_Alias() {
		return (EAttribute)dockerLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumesfrom() {
		return volumesfromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumesfrom_Mode() {
		return (EAttribute)volumesfromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Name() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Amazon_EC2() {
		return machine_Amazon_EC2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Digital_Ocean() {
		return machine_Digital_OceanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Google_Compute_Engine() {
		return machine_Google_Compute_EngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_IBM_SoftLayer() {
		return machine_IBM_SoftLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Microsoft_Azure() {
		return machine_Microsoft_AzureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Microsoft_Hyper_V() {
		return machine_Microsoft_Hyper_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_OpenStack() {
		return machine_OpenStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Rackspace() {
		return machine_RackspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VirtualBox() {
		return machine_VirtualBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Boot2docker_url() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Disk_size() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_Fusion() {
		return machine_VMware_FusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_vCloud_Air() {
		return machine_VMware_vCloud_AirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_vSphere() {
		return machine_VMware_vSphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactory getDockerFactory() {
		return (DockerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEAttribute(containerEClass, CONTAINER__CONTAINERID);
		createEAttribute(containerEClass, CONTAINER__IMAGE);
		createEAttribute(containerEClass, CONTAINER__BUILD);
		createEAttribute(containerEClass, CONTAINER__COMMAND);
		createEAttribute(containerEClass, CONTAINER__PORTS);
		createEAttribute(containerEClass, CONTAINER__EXPOSE);
		createEAttribute(containerEClass, CONTAINER__VOLUMES);
		createEAttribute(containerEClass, CONTAINER__ENVIRONMENT);
		createEAttribute(containerEClass, CONTAINER__ENV_FILE);
		createEAttribute(containerEClass, CONTAINER__NET);
		createEAttribute(containerEClass, CONTAINER__DNS);
		createEAttribute(containerEClass, CONTAINER__DNS_SEARCH);
		createEAttribute(containerEClass, CONTAINER__CAP_ADD);
		createEAttribute(containerEClass, CONTAINER__CAP_DROP);
		createEAttribute(containerEClass, CONTAINER__WORKING_DIR);
		createEAttribute(containerEClass, CONTAINER__ENTRYPOINT);
		createEAttribute(containerEClass, CONTAINER__USER);
		createEAttribute(containerEClass, CONTAINER__DOMAINNAME);
		createEAttribute(containerEClass, CONTAINER__MEM_LIMIT);
		createEAttribute(containerEClass, CONTAINER__MEMORY_SWAP);
		createEAttribute(containerEClass, CONTAINER__PRIVILEGED);
		createEAttribute(containerEClass, CONTAINER__RESTART);
		createEAttribute(containerEClass, CONTAINER__STDIN_OPEN);
		createEAttribute(containerEClass, CONTAINER__INTERACTIVE);
		createEAttribute(containerEClass, CONTAINER__TTY);
		createEAttribute(containerEClass, CONTAINER__CPU_SHARES);
		createEAttribute(containerEClass, CONTAINER__PID);
		createEAttribute(containerEClass, CONTAINER__IPC);
		createEAttribute(containerEClass, CONTAINER__ADD_HOST);
		createEAttribute(containerEClass, CONTAINER__MAC_ADDRESS);
		createEAttribute(containerEClass, CONTAINER__RM);
		createEAttribute(containerEClass, CONTAINER__SECURITY_OPT);
		createEAttribute(containerEClass, CONTAINER__DEVICE);
		createEAttribute(containerEClass, CONTAINER__LXC_CONF);
		createEAttribute(containerEClass, CONTAINER__CPUSET);
		createEAttribute(containerEClass, CONTAINER__PUBLISH_ALL);
		createEAttribute(containerEClass, CONTAINER__READ_ONLY);
		createEOperation(containerEClass, CONTAINER___CREATE);
		createEOperation(containerEClass, CONTAINER___RUN);
		createEOperation(containerEClass, CONTAINER___PAUSE);
		createEOperation(containerEClass, CONTAINER___UNPAUSE);
		createEOperation(containerEClass, CONTAINER___KILL__STRING);

		dockerLinkEClass = createEClass(DOCKER_LINK);
		createEAttribute(dockerLinkEClass, DOCKER_LINK__ALIAS);

		volumesfromEClass = createEClass(VOLUMESFROM);
		createEAttribute(volumesfromEClass, VOLUMESFROM__MODE);

		containsEClass = createEClass(CONTAINS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);

		machine_Amazon_EC2EClass = createEClass(MACHINE_AMAZON_EC2);

		machine_Digital_OceanEClass = createEClass(MACHINE_DIGITAL_OCEAN);

		machine_Google_Compute_EngineEClass = createEClass(MACHINE_GOOGLE_COMPUTE_ENGINE);

		machine_IBM_SoftLayerEClass = createEClass(MACHINE_IBM_SOFT_LAYER);

		machine_Microsoft_AzureEClass = createEClass(MACHINE_MICROSOFT_AZURE);

		machine_Microsoft_Hyper_VEClass = createEClass(MACHINE_MICROSOFT_HYPER_V);

		machine_OpenStackEClass = createEClass(MACHINE_OPEN_STACK);

		machine_RackspaceEClass = createEClass(MACHINE_RACKSPACE);

		machine_VirtualBoxEClass = createEClass(MACHINE_VIRTUAL_BOX);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__DISK_SIZE);

		machine_VMware_FusionEClass = createEClass(MACHINE_VMWARE_FUSION);

		machine_VMware_vCloud_AirEClass = createEClass(MACHINE_VMWARE_VCLOUD_AIR);

		machine_VMware_vSphereEClass = createEClass(MACHINE_VMWARE_VSPHERE);

		// Create enums
		modeEEnum = createEEnum(MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		dockerLinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		volumesfromEClass.getESuperTypes().add(theOCCIPackage.getLink());
		containsEClass.getESuperTypes().add(theOCCIPackage.getLink());
		machineEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		machine_Amazon_EC2EClass.getESuperTypes().add(this.getMachine());
		machine_Digital_OceanEClass.getESuperTypes().add(this.getMachine());
		machine_Google_Compute_EngineEClass.getESuperTypes().add(this.getMachine());
		machine_IBM_SoftLayerEClass.getESuperTypes().add(this.getMachine());
		machine_Microsoft_AzureEClass.getESuperTypes().add(this.getMachine());
		machine_Microsoft_Hyper_VEClass.getESuperTypes().add(this.getMachine());
		machine_OpenStackEClass.getESuperTypes().add(this.getMachine());
		machine_RackspaceEClass.getESuperTypes().add(this.getMachine());
		machine_VirtualBoxEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_FusionEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_vCloud_AirEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_vSphereEClass.getESuperTypes().add(this.getMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, org.occiware.clouddesigner.occi.docker.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), theOCCIPackage.getString(), "name", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Containerid(), theOCCIPackage.getString(), "containerid", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Image(), theOCCIPackage.getString(), "image", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Build(), theOCCIPackage.getString(), "build", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), theOCCIPackage.getString(), "command", "", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ports(), theOCCIPackage.getString(), "ports", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Expose(), theOCCIPackage.getString(), "expose", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Volumes(), theOCCIPackage.getString(), "volumes", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Environment(), theOCCIPackage.getString(), "environment", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Env_file(), theOCCIPackage.getString(), "env_file", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Net(), theOCCIPackage.getString(), "net", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Dns(), theOCCIPackage.getString(), "dns", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Dns_search(), theOCCIPackage.getString(), "dns_search", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cap_add(), theOCCIPackage.getString(), "cap_add", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cap_drop(), theOCCIPackage.getString(), "cap_drop", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Working_dir(), theOCCIPackage.getString(), "working_dir", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Entrypoint(), theOCCIPackage.getString(), "entrypoint", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_User(), theOCCIPackage.getString(), "user", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Domainname(), theOCCIPackage.getString(), "domainname", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Mem_limit(), theOCCIPackage.getNumber(), "mem_limit", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Memory_swap(), theOCCIPackage.getNumber(), "memory_swap", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Privileged(), theOCCIPackage.getBoolean(), "privileged", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Restart(), theOCCIPackage.getString(), "restart", "", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Stdin_open(), theOCCIPackage.getBoolean(), "stdin_open", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Interactive(), theOCCIPackage.getBoolean(), "interactive", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Tty(), theOCCIPackage.getBoolean(), "tty", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpu_shares(), theOCCIPackage.getNumber(), "cpu_shares", "0", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Pid(), theOCCIPackage.getString(), "pid", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ipc(), theOCCIPackage.getString(), "ipc", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Add_host(), theOCCIPackage.getString(), "add_host", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Mac_address(), theOCCIPackage.getString(), "mac_address", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Rm(), theOCCIPackage.getBoolean(), "rm", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Security_opt(), theOCCIPackage.getString(), "security_opt", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Device(), theOCCIPackage.getString(), "device", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Lxc_conf(), theOCCIPackage.getString(), "lxc_conf", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpuset(), theOCCIPackage.getString(), "cpuset", "", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Publish_all(), theOCCIPackage.getBoolean(), "publish_all", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Read_only(), theOCCIPackage.getBoolean(), "read_only", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Pause(), null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Unpause(), null, "unpause", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getContainer__Kill__String(), null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "signal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dockerLinkEClass, DockerLink.class, "DockerLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerLink_Alias(), theOCCIPackage.getString(), "alias", null, 0, 1, DockerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumesfromEClass, Volumesfrom.class, "Volumesfrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumesfrom_Mode(), this.getMode(), "mode", "read_write", 0, 1, Volumesfrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Amazon_EC2EClass, Machine_Amazon_EC2.class, "Machine_Amazon_EC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_Digital_OceanEClass, Machine_Digital_Ocean.class, "Machine_Digital_Ocean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_Google_Compute_EngineEClass, Machine_Google_Compute_Engine.class, "Machine_Google_Compute_Engine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_IBM_SoftLayerEClass, Machine_IBM_SoftLayer.class, "Machine_IBM_SoftLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_Microsoft_AzureEClass, Machine_Microsoft_Azure.class, "Machine_Microsoft_Azure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_Microsoft_Hyper_VEClass, Machine_Microsoft_Hyper_V.class, "Machine_Microsoft_Hyper_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_OpenStackEClass, Machine_OpenStack.class, "Machine_OpenStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_RackspaceEClass, Machine_Rackspace.class, "Machine_Rackspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_VirtualBoxEClass, Machine_VirtualBox.class, "Machine_VirtualBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VirtualBox_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_FusionEClass, Machine_VMware_Fusion.class, "Machine_VMware_Fusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_VMware_vCloud_AirEClass, Machine_VMware_vCloud_Air.class, "Machine_VMware_vCloud_Air", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machine_VMware_vSphereEClass, Machine_VMware_vSphere.class, "Machine_VMware_vSphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.READ_WRITE);
		addEEnumLiteral(modeEEnum, Mode.READ_ONLY);

		// Create resource
		createResource(eNS_URI);
	}

} //DockerPackageImpl
