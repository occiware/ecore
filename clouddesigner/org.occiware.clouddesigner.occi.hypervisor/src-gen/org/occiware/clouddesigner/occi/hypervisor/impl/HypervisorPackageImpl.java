/**
 */
package org.occiware.clouddesigner.occi.hypervisor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.hypervisor.Bridge;
import org.occiware.clouddesigner.occi.hypervisor.Contains;
import org.occiware.clouddesigner.occi.hypervisor.Direct;
import org.occiware.clouddesigner.occi.hypervisor.Disk;
import org.occiware.clouddesigner.occi.hypervisor.Ethernet;
import org.occiware.clouddesigner.occi.hypervisor.Filesystem;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;
import org.occiware.clouddesigner.occi.hypervisor.Interface;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.Parallel;
import org.occiware.clouddesigner.occi.hypervisor.Serial;
import org.occiware.clouddesigner.occi.hypervisor.User;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypervisorPackageImpl extends EPackageImpl implements HypervisorPackage {
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
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

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
	private EClass bridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethernetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clockEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featuresEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osEEnum = null;

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
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HypervisorPackageImpl() {
		super(eNS_URI, HypervisorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HypervisorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HypervisorPackage init() {
		if (isInited) return (HypervisorPackage)EPackage.Registry.INSTANCE.getEPackage(HypervisorPackage.eNS_URI);

		// Obtain or create and register package
		HypervisorPackageImpl theHypervisorPackage = (HypervisorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HypervisorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HypervisorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHypervisorPackage.createPackageContents();

		// Initialize created meta-data
		theHypervisorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHypervisorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HypervisorPackage.eNS_URI, theHypervisorPackage);
		return theHypervisorPackage;
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
	public EAttribute getMachine_Boot() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Uuid() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Offset() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Os_type() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(4);
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
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Name() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Type() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Device() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Source() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Readonly() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Target_dev() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Target_bus() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Type() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Model() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Mac_addresss() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Route() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getMachine_VirtualBox_Type() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Features() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_On_poweroff() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_On_reboot() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_On_crash() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Maximum_memory() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Current_memory() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Vcpu() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridge() {
		return bridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBridge_Source_bridge() {
		return (EAttribute)bridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallel_Name() {
		return (EAttribute)parallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallel_Source() {
		return (EAttribute)parallelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallel_Target() {
		return (EAttribute)parallelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerial() {
		return serialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerial_Name() {
		return (EAttribute)serialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerial_Source() {
		return (EAttribute)serialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerial_Target() {
		return (EAttribute)serialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirect() {
		return directEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirect_Source_dev() {
		return (EAttribute)directEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirect_Source_mode() {
		return (EAttribute)directEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEthernet() {
		return ethernetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernet_Target_dev() {
		return (EAttribute)ethernetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEthernet_Script_path() {
		return (EAttribute)ethernetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilesystem() {
		return filesystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilesystem_Name() {
		return (EAttribute)filesystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilesystem_Source() {
		return (EAttribute)filesystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilesystem_Target() {
		return (EAttribute)filesystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCLOCK() {
		return clockEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFEATURES() {
		return featuresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOS() {
		return osEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorFactory getHypervisorFactory() {
		return (HypervisorFactory)getEFactoryInstance();
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
		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEAttribute(machineEClass, MACHINE__BOOT);
		createEAttribute(machineEClass, MACHINE__UUID);
		createEAttribute(machineEClass, MACHINE__OFFSET);
		createEAttribute(machineEClass, MACHINE__OS_TYPE);

		containsEClass = createEClass(CONTAINS);

		diskEClass = createEClass(DISK);
		createEAttribute(diskEClass, DISK__NAME);
		createEAttribute(diskEClass, DISK__TYPE);
		createEAttribute(diskEClass, DISK__DEVICE);
		createEAttribute(diskEClass, DISK__SOURCE);
		createEAttribute(diskEClass, DISK__READONLY);
		createEAttribute(diskEClass, DISK__TARGET_DEV);
		createEAttribute(diskEClass, DISK__TARGET_BUS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEAttribute(interfaceEClass, INTERFACE__TYPE);
		createEAttribute(interfaceEClass, INTERFACE__MODEL);
		createEAttribute(interfaceEClass, INTERFACE__MAC_ADDRESSS);
		createEAttribute(interfaceEClass, INTERFACE__ROUTE);

		machine_VirtualBoxEClass = createEClass(MACHINE_VIRTUAL_BOX);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__TYPE);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__FEATURES);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__ON_POWEROFF);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__ON_REBOOT);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__ON_CRASH);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__CURRENT_MEMORY);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__VCPU);

		bridgeEClass = createEClass(BRIDGE);
		createEAttribute(bridgeEClass, BRIDGE__SOURCE_BRIDGE);

		userEClass = createEClass(USER);

		parallelEClass = createEClass(PARALLEL);
		createEAttribute(parallelEClass, PARALLEL__NAME);
		createEAttribute(parallelEClass, PARALLEL__SOURCE);
		createEAttribute(parallelEClass, PARALLEL__TARGET);

		serialEClass = createEClass(SERIAL);
		createEAttribute(serialEClass, SERIAL__NAME);
		createEAttribute(serialEClass, SERIAL__SOURCE);
		createEAttribute(serialEClass, SERIAL__TARGET);

		directEClass = createEClass(DIRECT);
		createEAttribute(directEClass, DIRECT__SOURCE_DEV);
		createEAttribute(directEClass, DIRECT__SOURCE_MODE);

		ethernetEClass = createEClass(ETHERNET);
		createEAttribute(ethernetEClass, ETHERNET__TARGET_DEV);
		createEAttribute(ethernetEClass, ETHERNET__SCRIPT_PATH);

		filesystemEClass = createEClass(FILESYSTEM);
		createEAttribute(filesystemEClass, FILESYSTEM__NAME);
		createEAttribute(filesystemEClass, FILESYSTEM__SOURCE);
		createEAttribute(filesystemEClass, FILESYSTEM__TARGET);

		// Create enums
		clockEEnum = createEEnum(CLOCK);
		featuresEEnum = createEEnum(FEATURES);
		osEEnum = createEEnum(OS);
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
		machineEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		containsEClass.getESuperTypes().add(theOCCIPackage.getLink());
		diskEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		interfaceEClass.getESuperTypes().add(theInfrastructurePackage.getNetwork());
		machine_VirtualBoxEClass.getESuperTypes().add(this.getMachine());
		bridgeEClass.getESuperTypes().add(this.getInterface());
		userEClass.getESuperTypes().add(this.getInterface());
		parallelEClass.getESuperTypes().add(theOCCIPackage.getResource());
		serialEClass.getESuperTypes().add(theOCCIPackage.getResource());
		directEClass.getESuperTypes().add(this.getInterface());
		ethernetEClass.getESuperTypes().add(theOCCIPackage.getResource());
		filesystemEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes and features; add operations and parameters
		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Boot(), theOCCIPackage.getString(), "boot", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Uuid(), theOCCIPackage.getString(), "uuid", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Offset(), theOCCIPackage.getString(), "offset", "localtime", 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Os_type(), theOCCIPackage.getString(), "os_type", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diskEClass, Disk.class, "Disk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisk_Name(), theOCCIPackage.getString(), "name", "Disk", 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Type(), theOCCIPackage.getString(), "type", null, 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Device(), theOCCIPackage.getString(), "device", null, 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Source(), theOCCIPackage.getString(), "source", null, 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Readonly(), theOCCIPackage.getBoolean(), "readonly", "false", 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Target_dev(), theOCCIPackage.getString(), "target_dev", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Target_bus(), theOCCIPackage.getString(), "target_bus", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), theOCCIPackage.getString(), "name", "interface", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Type(), theOCCIPackage.getString(), "type", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Model(), theOCCIPackage.getString(), "model", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Mac_addresss(), theOCCIPackage.getString(), "mac_addresss", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Route(), theOCCIPackage.getString(), "route", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VirtualBoxEClass, Machine_VirtualBox.class, "Machine_VirtualBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VirtualBox_Type(), theOCCIPackage.getString(), "type", "hvm", 1, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Features(), this.getFEATURES(), "features", "acpi", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_On_poweroff(), theOCCIPackage.getString(), "on_poweroff", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_On_reboot(), theOCCIPackage.getString(), "on_reboot", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_On_crash(), theOCCIPackage.getString(), "on_crash", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Maximum_memory(), theOCCIPackage.getNumber(), "maximum_memory", "256000", 1, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Current_memory(), theOCCIPackage.getNumber(), "current_memory", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Vcpu(), theOCCIPackage.getNumber(), "vcpu", "1", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bridgeEClass, Bridge.class, "Bridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBridge_Source_bridge(), theOCCIPackage.getString(), "source_bridge", null, 0, 1, Bridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParallel_Name(), theOCCIPackage.getString(), "name", "parallel", 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallel_Source(), theOCCIPackage.getString(), "source", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallel_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serialEClass, Serial.class, "Serial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerial_Name(), theOCCIPackage.getString(), "name", "serial", 0, 1, Serial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerial_Source(), theOCCIPackage.getString(), "source", null, 0, 1, Serial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerial_Target(), theOCCIPackage.getString(), "target", null, 0, 1, Serial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directEClass, Direct.class, "Direct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirect_Source_dev(), theOCCIPackage.getString(), "source_dev", null, 0, 1, Direct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirect_Source_mode(), theOCCIPackage.getString(), "source_mode", null, 0, 1, Direct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ethernetEClass, Ethernet.class, "Ethernet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEthernet_Target_dev(), theOCCIPackage.getString(), "target_dev", null, 0, 1, Ethernet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEthernet_Script_path(), theOCCIPackage.getString(), "script_path", null, 0, 1, Ethernet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filesystemEClass, Filesystem.class, "Filesystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilesystem_Name(), theOCCIPackage.getString(), "name", "filesystem", 0, 1, Filesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilesystem_Source(), theOCCIPackage.getString(), "source", null, 1, 1, Filesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilesystem_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Filesystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(clockEEnum, org.occiware.clouddesigner.occi.hypervisor.CLOCK.class, "CLOCK");
		addEEnumLiteral(clockEEnum, org.occiware.clouddesigner.occi.hypervisor.CLOCK.OFFSET);

		initEEnum(featuresEEnum, org.occiware.clouddesigner.occi.hypervisor.FEATURES.class, "FEATURES");
		addEEnumLiteral(featuresEEnum, org.occiware.clouddesigner.occi.hypervisor.FEATURES.ACPI);
		addEEnumLiteral(featuresEEnum, org.occiware.clouddesigner.occi.hypervisor.FEATURES.PAE);
		addEEnumLiteral(featuresEEnum, org.occiware.clouddesigner.occi.hypervisor.FEATURES.APIC);

		initEEnum(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.class, "OS");
		addEEnumLiteral(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.TYPE);
		addEEnumLiteral(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.BOOT);
		addEEnumLiteral(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.KERNEL);
		addEEnumLiteral(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.RAMDISK);
		addEEnumLiteral(osEEnum, org.occiware.clouddesigner.occi.hypervisor.OS.CMDLINE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>OCCIE2Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCCIE2EcoreAnnotations() {
		String source = "OCCIE2Ecore";	
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
			 "title", "Machine resource"
		   });	
		addAnnotation
		  (getMachine_Name(), 
		   source, 
		   new String[] {
			 "description", "Hypervisor name."
		   });	
		addAnnotation
		  (getMachine_Boot(), 
		   source, 
		   new String[] {
			 "description", "The machine boot device."
		   });	
		addAnnotation
		  (getMachine_Uuid(), 
		   source, 
		   new String[] {
			 "description", "The machine unique ID."
		   });	
		addAnnotation
		  (getMachine_Offset(), 
		   source, 
		   new String[] {
			 "description", "This will be set if the guest XML contains a request for a clock synced to localtime."
		   });	
		addAnnotation
		  (getMachine_Os_type(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (containsEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (diskEClass, 
		   source, 
		   new String[] {
			 "title", "Disk resource"
		   });	
		addAnnotation
		  (getDisk_Name(), 
		   source, 
		   new String[] {
			 "description", "The default name of the resource"
		   });	
		addAnnotation
		  (getDisk_Type(), 
		   source, 
		   new String[] {
			 "description", "The kind of disk."
		   });	
		addAnnotation
		  (getDisk_Device(), 
		   source, 
		   new String[] {
			 "description", "Specify the disk device\'s."
		   });	
		addAnnotation
		  (getDisk_Source(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getDisk_Readonly(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getDisk_Target_dev(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getDisk_Target_bus(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "title", "Interface resource"
		   });	
		addAnnotation
		  (getInterface_Name(), 
		   source, 
		   new String[] {
			 "description", "The interface resource"
		   });	
		addAnnotation
		  (getInterface_Type(), 
		   source, 
		   new String[] {
			 "description", "The interface type"
		   });	
		addAnnotation
		  (getInterface_Model(), 
		   source, 
		   new String[] {
			 "description", "The interface model"
		   });	
		addAnnotation
		  (getInterface_Mac_addresss(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getInterface_Route(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_VirtualBoxEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on VirtualBox"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Type(), 
		   source, 
		   new String[] {
			 "description", "This type is specific to Libvirt."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Features(), 
		   source, 
		   new String[] {
			 "description", "The flag specify the Advanced Configuration and Power Interface(ACPI), the Physical Address Extension (PAE) and the Advanced Programmable Interrupt Controller (APIC)."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_On_poweroff(), 
		   source, 
		   new String[] {
			 "description", "Action to do when the machine is poweroff."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_On_reboot(), 
		   source, 
		   new String[] {
			 "description", "Action to do when the machine is rebooting."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_On_crash(), 
		   source, 
		   new String[] {
			 "description", "Action to do when the machine crached."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Maximum_memory(), 
		   source, 
		   new String[] {
			 "description", "This sets the maximum memory for the guest at boot time in KB."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Current_memory(), 
		   source, 
		   new String[] {
			 "description", "This sets the lower memory for the guest at boot time in KB."
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Vcpu(), 
		   source, 
		   new String[] {
			 "description", "The number of virtual CPUs to create."
		   });	
		addAnnotation
		  (bridgeEClass, 
		   source, 
		   new String[] {
			 "title", "Bridge interface"
		   });	
		addAnnotation
		  (getBridge_Source_bridge(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (userEClass, 
		   source, 
		   new String[] {
			 "title", "User interface"
		   });	
		addAnnotation
		  (parallelEClass, 
		   source, 
		   new String[] {
			 "title", "Parallel resource"
		   });	
		addAnnotation
		  (getParallel_Name(), 
		   source, 
		   new String[] {
			 "description", "The parallel resource name"
		   });	
		addAnnotation
		  (getParallel_Source(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getParallel_Target(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (serialEClass, 
		   source, 
		   new String[] {
			 "title", "Serial resource"
		   });	
		addAnnotation
		  (getSerial_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getSerial_Source(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getSerial_Target(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (directEClass, 
		   source, 
		   new String[] {
			 "title", "Direct Interface"
		   });	
		addAnnotation
		  (getDirect_Source_dev(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getDirect_Source_mode(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (ethernetEClass, 
		   source, 
		   new String[] {
			 "title", "Ethernet resource"
		   });	
		addAnnotation
		  (getEthernet_Target_dev(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getEthernet_Script_path(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (filesystemEClass, 
		   source, 
		   new String[] {
			 "title", "Filesystem resource"
		   });	
		addAnnotation
		  (getFilesystem_Name(), 
		   source, 
		   new String[] {
			 "description", ""
		   });	
		addAnnotation
		  (getFilesystem_Source(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getFilesystem_Target(), 
		   source, 
		   new String[] {
			 "description", null
		   });
	}

} //HypervisorPackageImpl
