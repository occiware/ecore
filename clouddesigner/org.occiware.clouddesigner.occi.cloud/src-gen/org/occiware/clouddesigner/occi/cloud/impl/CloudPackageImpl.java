/**
 */
package org.occiware.clouddesigner.occi.cloud.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma;
import org.occiware.clouddesigner.occi.cloud.Machine_GCE;
import org.occiware.clouddesigner.occi.cloud.Machine_Gogrid;
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks;
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudPackageImpl extends EPackageImpl implements CloudPackage {
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
	private EClass machine_CloudSigmaEClass = null;

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
	private EClass machine_GogridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Hp_HelionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_GCEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_RackSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_ProfitBricksEClass = null;

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
	private EClass machine_SoftLayerEClass = null;

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
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudPackageImpl() {
		super(eNS_URI, CloudFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CloudPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudPackage init() {
		if (isInited) return (CloudPackage)EPackage.Registry.INSTANCE.getEPackage(CloudPackage.eNS_URI);

		// Obtain or create and register package
		CloudPackageImpl theCloudPackage = (CloudPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CloudPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CloudPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCloudPackage.createPackageContents();

		// Initialize created meta-data
		theCloudPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudPackage.eNS_URI, theCloudPackage);
		return theCloudPackage;
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
	public EClass getMachine_CloudSigma() {
		return machine_CloudSigmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_CloudSigma_Provider() {
		return (EAttribute)machine_CloudSigmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_CloudSigma_Email() {
		return (EAttribute)machine_CloudSigmaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_CloudSigma_Password() {
		return (EAttribute)machine_CloudSigmaEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMachine_Amazon_EC2_Provider() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Access_key() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Secret_key() {
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
	public EAttribute getMachine_Amazon_EC2_Image() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Security_group() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Key_pair() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Gogrid() {
		return machine_GogridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Gogrid_Provider() {
		return (EAttribute)machine_GogridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Gogrid_Key() {
		return (EAttribute)machine_GogridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Gogrid_Shared_secret() {
		return (EAttribute)machine_GogridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Gogrid_Image_id() {
		return (EAttribute)machine_GogridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Hp_Helion() {
		return machine_Hp_HelionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Provider() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Tenant() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Access_key() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Secret_key() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Image() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Zone() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Flavor_id() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Key_pair() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Security_group() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Hp_Helion_Floating_ip() {
		return (EAttribute)machine_Hp_HelionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_GCE() {
		return machine_GCEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Zone() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Region() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Machine_type() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Machine_url() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Firewall_tag() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Startup_script() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Json_file() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_GCE_Provider() {
		return (EAttribute)machine_GCEEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_RackSpace() {
		return machine_RackSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_RackSpace_Provider() {
		return (EAttribute)machine_RackSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_RackSpace_Username() {
		return (EAttribute)machine_RackSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_RackSpace_Api_key() {
		return (EAttribute)machine_RackSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_RackSpace_Region() {
		return (EAttribute)machine_RackSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_RackSpace_Image() {
		return (EAttribute)machine_RackSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_ProfitBricks() {
		return machine_ProfitBricksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Provider() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Username() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Api_key() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Email() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Password() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_ProfitBricks_Location() {
		return (EAttribute)machine_ProfitBricksEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getMachine_OpenStack_Provider() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Tenant() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Username() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Password() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Endpoint() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Image_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Flavor_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Flavor_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Security_group() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Network_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Network_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Floating_ip_pool() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Image_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Keypair() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Region() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_SoftLayer() {
		return machine_SoftLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Provider() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Username() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Api_key() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Location_id() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Image_id() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Domain_name() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Disk_type() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Tenant() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_SoftLayer_Endpoint() {
		return (EAttribute)machine_SoftLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFactory getCloudFactory() {
		return (CloudFactory)getEFactoryInstance();
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

		machine_CloudSigmaEClass = createEClass(MACHINE_CLOUD_SIGMA);
		createEAttribute(machine_CloudSigmaEClass, MACHINE_CLOUD_SIGMA__PROVIDER);
		createEAttribute(machine_CloudSigmaEClass, MACHINE_CLOUD_SIGMA__EMAIL);
		createEAttribute(machine_CloudSigmaEClass, MACHINE_CLOUD_SIGMA__PASSWORD);

		machine_Amazon_EC2EClass = createEClass(MACHINE_AMAZON_EC2);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__PROVIDER);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ACCESS_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECRET_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__REGION);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__IMAGE);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECURITY_GROUP);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__KEY_PAIR);

		machine_GogridEClass = createEClass(MACHINE_GOGRID);
		createEAttribute(machine_GogridEClass, MACHINE_GOGRID__PROVIDER);
		createEAttribute(machine_GogridEClass, MACHINE_GOGRID__KEY);
		createEAttribute(machine_GogridEClass, MACHINE_GOGRID__SHARED_SECRET);
		createEAttribute(machine_GogridEClass, MACHINE_GOGRID__IMAGE_ID);

		machine_Hp_HelionEClass = createEClass(MACHINE_HP_HELION);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__PROVIDER);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__TENANT);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__ACCESS_KEY);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__SECRET_KEY);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__IMAGE);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__ZONE);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__FLAVOR_ID);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__KEY_PAIR);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__SECURITY_GROUP);
		createEAttribute(machine_Hp_HelionEClass, MACHINE_HP_HELION__FLOATING_IP);

		machine_GCEEClass = createEClass(MACHINE_GCE);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__ZONE);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__REGION);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__MACHINE_TYPE);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__MACHINE_URL);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__FIREWALL_TAG);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__STARTUP_SCRIPT);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__JSON_FILE);
		createEAttribute(machine_GCEEClass, MACHINE_GCE__PROVIDER);

		machine_RackSpaceEClass = createEClass(MACHINE_RACK_SPACE);
		createEAttribute(machine_RackSpaceEClass, MACHINE_RACK_SPACE__PROVIDER);
		createEAttribute(machine_RackSpaceEClass, MACHINE_RACK_SPACE__USERNAME);
		createEAttribute(machine_RackSpaceEClass, MACHINE_RACK_SPACE__API_KEY);
		createEAttribute(machine_RackSpaceEClass, MACHINE_RACK_SPACE__REGION);
		createEAttribute(machine_RackSpaceEClass, MACHINE_RACK_SPACE__IMAGE);

		machine_ProfitBricksEClass = createEClass(MACHINE_PROFIT_BRICKS);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__PROVIDER);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__USERNAME);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__API_KEY);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__EMAIL);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__PASSWORD);
		createEAttribute(machine_ProfitBricksEClass, MACHINE_PROFIT_BRICKS__LOCATION);

		machine_OpenStackEClass = createEClass(MACHINE_OPEN_STACK);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__PROVIDER);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__TENANT);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__USERNAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__PASSWORD);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__ENDPOINT);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IMAGE_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLAVOR_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLAVOR_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__SECURITY_GROUP);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__NETWORK_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__NETWORK_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLOATING_IP_POOL);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IMAGE_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__KEYPAIR);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__REGION);

		machine_SoftLayerEClass = createEClass(MACHINE_SOFT_LAYER);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__PROVIDER);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__USERNAME);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__API_KEY);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__LOCATION_ID);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__IMAGE_ID);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__DOMAIN_NAME);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__DISK_TYPE);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__TENANT);
		createEAttribute(machine_SoftLayerEClass, MACHINE_SOFT_LAYER__ENDPOINT);
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
		machine_CloudSigmaEClass.getESuperTypes().add(this.getMachine());
		machine_Amazon_EC2EClass.getESuperTypes().add(this.getMachine());
		machine_GogridEClass.getESuperTypes().add(this.getMachine());
		machine_Hp_HelionEClass.getESuperTypes().add(this.getMachine());
		machine_GCEEClass.getESuperTypes().add(this.getMachine());
		machine_RackSpaceEClass.getESuperTypes().add(this.getMachine());
		machine_ProfitBricksEClass.getESuperTypes().add(this.getMachine());
		machine_OpenStackEClass.getESuperTypes().add(this.getMachine());
		machine_SoftLayerEClass.getESuperTypes().add(this.getMachine());

		// Initialize classes and features; add operations and parameters
		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_CloudSigmaEClass, Machine_CloudSigma.class, "Machine_CloudSigma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_CloudSigma_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_CloudSigma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_CloudSigma_Email(), theOCCIPackage.getString(), "email", null, 1, 1, Machine_CloudSigma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_CloudSigma_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_CloudSigma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Amazon_EC2EClass, Machine_Amazon_EC2.class, "Machine_Amazon_EC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Amazon_EC2_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Access_key(), theOCCIPackage.getString(), "access_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Secret_key(), theOCCIPackage.getString(), "secret_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Image(), theOCCIPackage.getString(), "image", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Security_group(), theOCCIPackage.getString(), "security_group", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Key_pair(), theOCCIPackage.getString(), "key_pair", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_GogridEClass, Machine_Gogrid.class, "Machine_Gogrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Gogrid_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_Gogrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Gogrid_Key(), theOCCIPackage.getString(), "key", null, 1, 1, Machine_Gogrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Gogrid_Shared_secret(), theOCCIPackage.getString(), "shared_secret", null, 1, 1, Machine_Gogrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Gogrid_Image_id(), theOCCIPackage.getString(), "image_id", null, 0, 1, Machine_Gogrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Hp_HelionEClass, Machine_Hp_Helion.class, "Machine_Hp_Helion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Hp_Helion_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Tenant(), theOCCIPackage.getString(), "tenant", null, 1, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Access_key(), theOCCIPackage.getString(), "access_key", null, 1, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Secret_key(), theOCCIPackage.getString(), "secret_key", null, 1, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Image(), theOCCIPackage.getString(), "image", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Zone(), theOCCIPackage.getString(), "zone", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Flavor_id(), theOCCIPackage.getString(), "flavor_id", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Key_pair(), theOCCIPackage.getString(), "key_pair", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Security_group(), theOCCIPackage.getString(), "security_group", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Hp_Helion_Floating_ip(), theOCCIPackage.getString(), "floating_ip", null, 0, 1, Machine_Hp_Helion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_GCEEClass, Machine_GCE.class, "Machine_GCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_GCE_Zone(), theOCCIPackage.getString(), "zone", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Machine_type(), theOCCIPackage.getString(), "machine_type", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Machine_url(), theOCCIPackage.getString(), "machine_url", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Firewall_tag(), theOCCIPackage.getString(), "firewall_tag", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Startup_script(), theOCCIPackage.getString(), "startup_script", null, 0, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Json_file(), theOCCIPackage.getString(), "json_file", null, 1, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_GCE_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_GCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_RackSpaceEClass, Machine_RackSpace.class, "Machine_RackSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_RackSpace_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_RackSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_RackSpace_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_RackSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_RackSpace_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_RackSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_RackSpace_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_RackSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_RackSpace_Image(), theOCCIPackage.getString(), "image", null, 0, 1, Machine_RackSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_ProfitBricksEClass, Machine_ProfitBricks.class, "Machine_ProfitBricks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_ProfitBricks_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ProfitBricks_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ProfitBricks_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ProfitBricks_Email(), theOCCIPackage.getString(), "email", null, 0, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ProfitBricks_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_ProfitBricks_Location(), theOCCIPackage.getString(), "location", null, 0, 1, Machine_ProfitBricks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_OpenStackEClass, Machine_OpenStack.class, "Machine_OpenStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_OpenStack_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Tenant(), theOCCIPackage.getString(), "tenant", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Endpoint(), theOCCIPackage.getString(), "endpoint", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Image_id(), theOCCIPackage.getString(), "image_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Flavor_name(), theOCCIPackage.getString(), "flavor_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Flavor_id(), theOCCIPackage.getString(), "flavor_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Security_group(), theOCCIPackage.getString(), "security_group", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Network_name(), theOCCIPackage.getString(), "network_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Network_id(), theOCCIPackage.getString(), "network_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Floating_ip_pool(), theOCCIPackage.getString(), "floating_ip_pool", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Image_name(), theOCCIPackage.getString(), "image_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Keypair(), theOCCIPackage.getString(), "keypair", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_SoftLayerEClass, Machine_SoftLayer.class, "Machine_SoftLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_SoftLayer_Provider(), theOCCIPackage.getString(), "provider", null, 1, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Location_id(), theOCCIPackage.getString(), "location_id", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Image_id(), theOCCIPackage.getString(), "image_id", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Domain_name(), theOCCIPackage.getString(), "domain_name", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Disk_type(), theOCCIPackage.getString(), "disk_type", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Tenant(), theOCCIPackage.getString(), "tenant", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_SoftLayer_Endpoint(), theOCCIPackage.getString(), "endpoint", null, 0, 1, Machine_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "title", "Machine Resource"
		   });	
		addAnnotation
		  (getMachine_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_CloudSigmaEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on CloudSigma"
		   });	
		addAnnotation
		  (getMachine_CloudSigma_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_CloudSigma_Email(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_CloudSigma_Password(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_Amazon_EC2EClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Amazon EC2"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Access_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Secret_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Region(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Image(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Security_group(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Key_pair(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_GogridEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Gogrid"
		   });	
		addAnnotation
		  (getMachine_Gogrid_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Gogrid_Key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Gogrid_Shared_secret(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Gogrid_Image_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_Hp_HelionEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on HP Helion"
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Tenant(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Access_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Secret_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Image(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Zone(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Flavor_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Key_pair(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Security_group(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Hp_Helion_Floating_ip(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_GCEEClass, 
		   source, 
		   new String[] {
			 "title", "MAchine on Goolge Compute ENgine"
		   });	
		addAnnotation
		  (getMachine_GCE_Zone(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Region(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Machine_type(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Machine_url(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Firewall_tag(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Startup_script(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Json_file(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_GCE_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_RackSpaceEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on RackSpace"
		   });	
		addAnnotation
		  (getMachine_RackSpace_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_RackSpace_Username(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_RackSpace_Api_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_RackSpace_Region(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_RackSpace_Image(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_ProfitBricksEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on ProfitBricks"
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Username(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Api_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Email(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Password(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_ProfitBricks_Location(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_OpenStackEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on OpenStack"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Tenant(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Username(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Password(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Endpoint(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Image_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Flavor_name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Flavor_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Security_group(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Network_name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Network_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Floating_ip_pool(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Image_name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Keypair(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_OpenStack_Region(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (machine_SoftLayerEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on SoftLayer"
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Provider(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Username(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Api_key(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Location_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Image_id(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Domain_name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Disk_type(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Tenant(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_SoftLayer_Endpoint(), 
		   source, 
		   new String[] {
			 "description", null
		   });
	}

} //CloudPackageImpl
