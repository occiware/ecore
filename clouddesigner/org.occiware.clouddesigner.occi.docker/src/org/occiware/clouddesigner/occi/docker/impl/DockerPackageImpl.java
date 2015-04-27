/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.OCCI.OCCIPackage;

import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Link;
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

import org.occiware.clouddesigner.occi.docker.util.DockerValidator;
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
	private EClass linkEClass = null;

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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDockerPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DockerValidator.INSTANCE;
				 }
			 });

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
	public EOperation getContainer__ContainerLinkAliasUnique__DiagnosticChain_Map() {
		return containerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__ContainerNoCycleBetweenContainers__DiagnosticChain_Map() {
		return containerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Alias() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__LinkTargetAsContainer__DiagnosticChain_Map() {
		return linkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__LinkSourceAsContainer__DiagnosticChain_Map() {
		return linkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__LinkCanOnlyConnectColocalizedContainers__DiagnosticChain_Map() {
		return linkEClass.getEOperations().get(2);
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
	public EOperation getVolumesfrom__VolumesFromSourceAsContainer__DiagnosticChain_Map() {
		return volumesfromEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVolumesfrom__VolumesFromTargetAsContainer__DiagnosticChain_Map() {
		return volumesfromEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVolumesfrom__VolumesFromCanOnlyConnectColocalizedContainers__DiagnosticChain_Map() {
		return volumesfromEClass.getEOperations().get(2);
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
	public EOperation getMachine__MachineNameUnique__DiagnosticChain_Map() {
		return machineEClass.getEOperations().get(0);
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
	public EAttribute getMachine_Amazon_EC2_Access_key() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Ami() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Instance_type() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Region() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Root_size() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Secret_key() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Security_group() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Session_token() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Subnet_id() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Vpc_id() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Zone() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(10);
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
	public EAttribute getMachine_Digital_Ocean_Access_token() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Image() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Region() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Size() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMachine_Google_Compute_Engine_Zone() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Machine_type() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Username() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Instance_name() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Project() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getMachine_IBM_SoftLayer_Api_endpoint() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_User() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Api_key() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Cpu() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Disk_size() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Domain() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Hourly_billing() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Image() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Local_disk() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Private_net_only() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Region() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getMachine_Microsoft_Azure_Subscription_id() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Subscription_cert() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMachine_Microsoft_Hyper_V_Boot2docker_location() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Boot2docker_url() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Disk_size() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Virtual_switch() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMachine_OpenStack_Flavor_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Image_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Auth_url() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Username() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Password() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Tenant_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Tenant_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Region() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Endpoint_type() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Net_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Sec_groups() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Floatingip_pool() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getMachine_Rackspace_Username() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Api_key() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Region() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Endpoint_type() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Image_id() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Flavor_id() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Ssh_user() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Ssh_port() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(7);
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
	public EOperation getMachine_VirtualBox__ContainersUsedTooMemory__DiagnosticChain_Map() {
		return machine_VirtualBoxEClass.getEOperations().get(0);
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
	public EAttribute getMachine_VMware_Fusion_Boot2docker_url() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_Disk_size() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_Memory_size() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMachine_VMware_vCloud_Air_Username() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Password() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Catalog() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Catalogitem() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Computeid() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Cpu_count() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Docker_port() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Edgegateway() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Memory_size() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Vapp_name() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Orgvdcnetwork() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Provision() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Publicip() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Ssh_port() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Vdcid() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getMachine_VMware_vSphere_Username() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Password() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Boot2docker_url() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Compute_ip() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Cpu_count() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Datacenter() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Datastore() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Disk_size() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Memory_size() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Network() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Pool() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Vcenter() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(11);
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
		createEOperation(containerEClass, CONTAINER___CONTAINER_LINK_ALIAS_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(containerEClass, CONTAINER___CONTAINER_NO_CYCLE_BETWEEN_CONTAINERS__DIAGNOSTICCHAIN_MAP);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__ALIAS);
		createEOperation(linkEClass, LINK___LINK_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEClass, LINK___LINK_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEClass, LINK___LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP);

		volumesfromEClass = createEClass(VOLUMESFROM);
		createEAttribute(volumesfromEClass, VOLUMESFROM__MODE);
		createEOperation(volumesfromEClass, VOLUMESFROM___VOLUMES_FROM_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP);
		createEOperation(volumesfromEClass, VOLUMESFROM___VOLUMES_FROM_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP);
		createEOperation(volumesfromEClass, VOLUMESFROM___VOLUMES_FROM_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP);

		containsEClass = createEClass(CONTAINS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEOperation(machineEClass, MACHINE___MACHINE_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP);

		machine_Amazon_EC2EClass = createEClass(MACHINE_AMAZON_EC2);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ACCESS_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__AMI);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__INSTANCE_TYPE);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__REGION);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ROOT_SIZE);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECRET_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECURITY_GROUP);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SESSION_TOKEN);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SUBNET_ID);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__VPC_ID);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ZONE);

		machine_Digital_OceanEClass = createEClass(MACHINE_DIGITAL_OCEAN);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__ACCESS_TOKEN);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__IMAGE);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__REGION);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__SIZE);

		machine_Google_Compute_EngineEClass = createEClass(MACHINE_GOOGLE_COMPUTE_ENGINE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT);

		machine_IBM_SoftLayerEClass = createEClass(MACHINE_IBM_SOFT_LAYER);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__API_ENDPOINT);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__USER);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__API_KEY);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__CPU);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__DISK_SIZE);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__DOMAIN);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__IMAGE);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__LOCAL_DISK);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__REGION);

		machine_Microsoft_AzureEClass = createEClass(MACHINE_MICROSOFT_AZURE);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT);

		machine_Microsoft_Hyper_VEClass = createEClass(MACHINE_MICROSOFT_HYPER_V);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__DISK_SIZE);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH);

		machine_OpenStackEClass = createEClass(MACHINE_OPEN_STACK);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLAVOR_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IMAGE_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__AUTH_URL);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__USERNAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__PASSWORD);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__TENANT_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__TENANT_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__REGION);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__ENDPOINT_TYPE);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__NET_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__SEC_GROUPS);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLOATINGIP_POOL);

		machine_RackspaceEClass = createEClass(MACHINE_RACKSPACE);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__USERNAME);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__API_KEY);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__REGION);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__ENDPOINT_TYPE);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__IMAGE_ID);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__FLAVOR_ID);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__SSH_USER);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__SSH_PORT);

		machine_VirtualBoxEClass = createEClass(MACHINE_VIRTUAL_BOX);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__DISK_SIZE);
		createEOperation(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX___CONTAINERS_USED_TOO_MEMORY__DIAGNOSTICCHAIN_MAP);

		machine_VMware_FusionEClass = createEClass(MACHINE_VMWARE_FUSION);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__DISK_SIZE);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__MEMORY_SIZE);

		machine_VMware_vCloud_AirEClass = createEClass(MACHINE_VMWARE_VCLOUD_AIR);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__USERNAME);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PASSWORD);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CATALOG);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PROVISION);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__VDCID);

		machine_VMware_vSphereEClass = createEClass(MACHINE_VMWARE_VSPHERE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__USERNAME);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__PASSWORD);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__COMPUTE_IP);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__CPU_COUNT);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DATACENTER);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DATASTORE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DISK_SIZE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__MEMORY_SIZE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__NETWORK);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__POOL);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__VCENTER);

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
		linkEClass.getESuperTypes().add(theOCCIPackage.getLink());
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
		initEAttribute(getContainer_Name(), theOCCIPackage.getString(), "name", null, 1, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Containerid(), theOCCIPackage.getString(), "containerid", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Image(), theOCCIPackage.getString(), "image", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Build(), theOCCIPackage.getString(), "build", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), theOCCIPackage.getString(), "command", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getContainer_Restart(), theOCCIPackage.getString(), "restart", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Stdin_open(), theOCCIPackage.getBoolean(), "stdin_open", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Interactive(), theOCCIPackage.getBoolean(), "interactive", "false", 1, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getContainer_Cpuset(), theOCCIPackage.getString(), "cpuset", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Publish_all(), theOCCIPackage.getBoolean(), "publish_all", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Read_only(), theOCCIPackage.getBoolean(), "read_only", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Pause(), null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Unpause(), null, "unpause", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getContainer__Kill__String(), null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "signal", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainer__ContainerLinkAliasUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainerLinkAliasUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContainer__ContainerNoCycleBetweenContainers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainerNoCycleBetweenContainers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Alias(), theOCCIPackage.getString(), "alias", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLink__LinkTargetAsContainer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "LinkTargetAsContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLink__LinkSourceAsContainer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "LinkSourceAsContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLink__LinkCanOnlyConnectColocalizedContainers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "LinkCanOnlyConnectColocalizedContainers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(volumesfromEClass, Volumesfrom.class, "Volumesfrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumesfrom_Mode(), this.getMode(), "mode", "read_write", 0, 1, Volumesfrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVolumesfrom__VolumesFromSourceAsContainer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "VolumesFromSourceAsContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVolumesfrom__VolumesFromTargetAsContainer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "VolumesFromTargetAsContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVolumesfrom__VolumesFromCanOnlyConnectColocalizedContainers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "VolumesFromCanOnlyConnectColocalizedContainers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMachine__MachineNameUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MachineNameUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machine_Amazon_EC2EClass, Machine_Amazon_EC2.class, "Machine_Amazon_EC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Amazon_EC2_Access_key(), theOCCIPackage.getString(), "access_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Ami(), theOCCIPackage.getString(), "ami", "ami-4ae27e22", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Instance_type(), theOCCIPackage.getString(), "instance_type", "t2.micro", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Region(), theOCCIPackage.getString(), "region", "us-east-1", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Root_size(), theOCCIPackage.getNumber(), "root_size", "16", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Secret_key(), theOCCIPackage.getString(), "secret_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Security_group(), theOCCIPackage.getString(), "security_group", "docker-machine", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Session_token(), theOCCIPackage.getString(), "session_token", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Subnet_id(), theOCCIPackage.getString(), "subnet_id", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Vpc_id(), theOCCIPackage.getString(), "vpc_id", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Zone(), theOCCIPackage.getString(), "zone", "a", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Digital_OceanEClass, Machine_Digital_Ocean.class, "Machine_Digital_Ocean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Digital_Ocean_Access_token(), theOCCIPackage.getString(), "access_token", null, 1, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Image(), theOCCIPackage.getString(), "image", "docker", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Region(), theOCCIPackage.getString(), "region", "nyc3", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Size(), theOCCIPackage.getString(), "size", "512mb", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Google_Compute_EngineEClass, Machine_Google_Compute_Engine.class, "Machine_Google_Compute_Engine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Google_Compute_Engine_Zone(), theOCCIPackage.getString(), "zone", "us-central1-a", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Machine_type(), theOCCIPackage.getString(), "machine_type", "f1-micro", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Username(), theOCCIPackage.getString(), "username", "docker-user", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Instance_name(), theOCCIPackage.getString(), "instance_name", "docker-machine", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Project(), theOCCIPackage.getString(), "project", null, 1, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_IBM_SoftLayerEClass, Machine_IBM_SoftLayer.class, "Machine_IBM_SoftLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_IBM_SoftLayer_Api_endpoint(), theOCCIPackage.getString(), "api_endpoint", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_User(), theOCCIPackage.getString(), "user", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Cpu(), theOCCIPackage.getNumber(), "cpu", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Disk_size(), theOCCIPackage.getNumber(), "disk_size", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Domain(), theOCCIPackage.getString(), "domain", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Hourly_billing(), theOCCIPackage.getBoolean(), "hourly_billing", "true", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Image(), theOCCIPackage.getString(), "image", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Local_disk(), theOCCIPackage.getBoolean(), "local_disk", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Private_net_only(), theOCCIPackage.getBoolean(), "private_net_only", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Microsoft_AzureEClass, Machine_Microsoft_Azure.class, "Machine_Microsoft_Azure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Microsoft_Azure_Subscription_id(), theOCCIPackage.getString(), "subscription_id", null, 1, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Subscription_cert(), theOCCIPackage.getString(), "subscription_cert", null, 1, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Microsoft_Hyper_VEClass, Machine_Microsoft_Hyper_V.class, "Machine_Microsoft_Hyper_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Microsoft_Hyper_V_Boot2docker_location(), theOCCIPackage.getString(), "boot2docker_location", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Virtual_switch(), theOCCIPackage.getString(), "virtual_switch", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_OpenStackEClass, Machine_OpenStack.class, "Machine_OpenStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_OpenStack_Flavor_id(), theOCCIPackage.getString(), "flavor_id", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Image_id(), theOCCIPackage.getString(), "image_id", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Auth_url(), theOCCIPackage.getString(), "auth_url", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Tenant_name(), theOCCIPackage.getString(), "tenant_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Tenant_id(), theOCCIPackage.getString(), "tenant_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Endpoint_type(), theOCCIPackage.getString(), "endpoint_type", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Net_id(), theOCCIPackage.getString(), "net_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Sec_groups(), theOCCIPackage.getString(), "sec_groups", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Floatingip_pool(), theOCCIPackage.getString(), "floatingip_pool", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_RackspaceEClass, Machine_Rackspace.class, "Machine_Rackspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Rackspace_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Region(), theOCCIPackage.getString(), "region", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Endpoint_type(), theOCCIPackage.getString(), "endpoint_type", "publicURL", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Image_id(), theOCCIPackage.getString(), "image_id", "Ubuntu 14.10 (Utopic Unicorn) (PVHVM)", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Flavor_id(), theOCCIPackage.getString(), "flavor_id", "General Purpose 1GB", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Ssh_user(), theOCCIPackage.getString(), "ssh_user", "root", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", "22", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VirtualBoxEClass, Machine_VirtualBox.class, "Machine_VirtualBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VirtualBox_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMachine_VirtualBox__ContainersUsedTooMemory__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ContainersUsedTooMemory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machine_VMware_FusionEClass, Machine_VMware_Fusion.class, "Machine_VMware_Fusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_Fusion_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_Fusion_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_Fusion_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "1024", 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_vCloud_AirEClass, Machine_VMware_vCloud_Air.class, "Machine_VMware_vCloud_Air", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_vCloud_Air_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Catalog(), theOCCIPackage.getString(), "catalog", "Public Catalog", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Catalogitem(), theOCCIPackage.getString(), "catalogitem", "Ubuntu Server 12.04 LTS (amd64 20140927)", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Computeid(), theOCCIPackage.getString(), "computeid", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Cpu_count(), theOCCIPackage.getNumber(), "cpu_count", "1", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Docker_port(), theOCCIPackage.getNumber(), "docker_port", "2376", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Edgegateway(), theOCCIPackage.getString(), "edgegateway", "<vdcid>", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "2048", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Vapp_name(), theOCCIPackage.getString(), "vapp_name", "<autogenerated>", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Orgvdcnetwork(), theOCCIPackage.getString(), "orgvdcnetwork", "<vdcid>-default-routed", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Provision(), theOCCIPackage.getBoolean(), "provision", "true", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Publicip(), theOCCIPackage.getString(), "publicip", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", "22", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Vdcid(), theOCCIPackage.getString(), "vdcid", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_vSphereEClass, Machine_VMware_vSphere.class, "Machine_VMware_vSphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_vSphere_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Compute_ip(), theOCCIPackage.getString(), "compute_ip", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Cpu_count(), theOCCIPackage.getNumber(), "cpu_count", "2", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Datacenter(), theOCCIPackage.getString(), "datacenter", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Datastore(), theOCCIPackage.getString(), "datastore", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "2048", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Network(), theOCCIPackage.getString(), "network", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Pool(), theOCCIPackage.getString(), "pool", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Vcenter(), theOCCIPackage.getString(), "vcenter", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.READ_WRITE);
		addEEnumLiteral(modeEEnum, Mode.READ_ONLY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "OCCI", "../../org.occiware.clouddesigner.occi/model/OCCI.ecore#/",
			 "infrastructure", "../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (containerEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (volumesfromEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (machine_VirtualBoxEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DockerPackageImpl
