/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.vmware.impl;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

import org.occiware.clouddesigner.occi.vmware.AutoStartWaitHeartbeatSetting;
import org.occiware.clouddesigner.occi.vmware.Bootdevice;
import org.occiware.clouddesigner.occi.vmware.Cluster;
import org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsIsolationResponse;
import org.occiware.clouddesigner.occi.vmware.ClusterDASVmSettingsRestartPriority;
import org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoHBDatastoreCandidate;
import org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoServiceState;
import org.occiware.clouddesigner.occi.vmware.ClusterDasConfigInfoVmMonitoringState;
import org.occiware.clouddesigner.occi.vmware.Clusterlink;
import org.occiware.clouddesigner.occi.vmware.Datacenter;
import org.occiware.clouddesigner.occi.vmware.Datacenterlink;
import org.occiware.clouddesigner.occi.vmware.Datastore;
import org.occiware.clouddesigner.occi.vmware.DatastoreHostMountMode;
import org.occiware.clouddesigner.occi.vmware.DatastoreMaintenanceModeState;
import org.occiware.clouddesigner.occi.vmware.Datastorelink;
import org.occiware.clouddesigner.occi.vmware.DiagnosticPartitionType;
import org.occiware.clouddesigner.occi.vmware.Distributedportgroup;
import org.occiware.clouddesigner.occi.vmware.DpmBehavior;
import org.occiware.clouddesigner.occi.vmware.DrsBehavior;
import org.occiware.clouddesigner.occi.vmware.DvsNicTeamingPolicy;
import org.occiware.clouddesigner.occi.vmware.Dvswitch;
import org.occiware.clouddesigner.occi.vmware.Folder;
import org.occiware.clouddesigner.occi.vmware.Folderlink;
import org.occiware.clouddesigner.occi.vmware.GuestFirmwareType;
import org.occiware.clouddesigner.occi.vmware.GuestOsIdentifiers;
import org.occiware.clouddesigner.occi.vmware.HostCapabilityFtUnsupportedReason;
import org.occiware.clouddesigner.occi.vmware.HostConnectionState;
import org.occiware.clouddesigner.occi.vmware.HostFileSystemVolumeFileType;
import org.occiware.clouddesigner.occi.vmware.HostFirewallRuleDirection;
import org.occiware.clouddesigner.occi.vmware.HostNasVolumeSecurityType;
import org.occiware.clouddesigner.occi.vmware.HostNetworkProtocol;
import org.occiware.clouddesigner.occi.vmware.Hostfirewallrule;
import org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset;
import org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem;
import org.occiware.clouddesigner.occi.vmware.Hostfolder;
import org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink;
import org.occiware.clouddesigner.occi.vmware.Hostnatrule;
import org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter;
import org.occiware.clouddesigner.occi.vmware.Hoststorage;
import org.occiware.clouddesigner.occi.vmware.Hoststoragelink;
import org.occiware.clouddesigner.occi.vmware.Hostsystem;
import org.occiware.clouddesigner.occi.vmware.Hostsystemlink;
import org.occiware.clouddesigner.occi.vmware.LatencySensitivityLevel;
import org.occiware.clouddesigner.occi.vmware.NetworkBootProtocolType;
import org.occiware.clouddesigner.occi.vmware.NetworkChangeOperation;
import org.occiware.clouddesigner.occi.vmware.NicPolicyTeamingValue;
import org.occiware.clouddesigner.occi.vmware.NpivWwnType;
import org.occiware.clouddesigner.occi.vmware.OverallStatus;
import org.occiware.clouddesigner.occi.vmware.PortGroupConnecteeType;
import org.occiware.clouddesigner.occi.vmware.Portgroup;
import org.occiware.clouddesigner.occi.vmware.Portgrouplink;
import org.occiware.clouddesigner.occi.vmware.PowerOffType;
import org.occiware.clouddesigner.occi.vmware.ResourceAllocationType;
import org.occiware.clouddesigner.occi.vmware.ResourcePoolState;
import org.occiware.clouddesigner.occi.vmware.Resourcepool;
import org.occiware.clouddesigner.occi.vmware.Resourcepoollink;
import org.occiware.clouddesigner.occi.vmware.Serviceconsolenic;
import org.occiware.clouddesigner.occi.vmware.SharesLevel;
import org.occiware.clouddesigner.occi.vmware.Snapshot;
import org.occiware.clouddesigner.occi.vmware.Snapshotlink;
import org.occiware.clouddesigner.occi.vmware.ToolsUpgradePolicy;
import org.occiware.clouddesigner.occi.vmware.Vcentercapability;
import org.occiware.clouddesigner.occi.vmware.VirtualDeviceConnectStatus;
import org.occiware.clouddesigner.occi.vmware.Virtualcdrom;
import org.occiware.clouddesigner.occi.vmware.Virtualdisk;
import org.occiware.clouddesigner.occi.vmware.Virtualdisklink;
import org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork;
import org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink;
import org.occiware.clouddesigner.occi.vmware.Virtualfloppy;
import org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter;
import org.occiware.clouddesigner.occi.vmware.VmExecUsage;
import org.occiware.clouddesigner.occi.vmware.VmFaultToleranceType;
import org.occiware.clouddesigner.occi.vmware.VmForkConfigInfoChildType;
import org.occiware.clouddesigner.occi.vmware.VmHtSharing;
import org.occiware.clouddesigner.occi.vmware.VmMMUusage;
import org.occiware.clouddesigner.occi.vmware.VmMonitorType;
import org.occiware.clouddesigner.occi.vmware.VmPowerOffBehavior;
import org.occiware.clouddesigner.occi.vmware.VmSwapPlacementType;
import org.occiware.clouddesigner.occi.vmware.Vmfolder;
import org.occiware.clouddesigner.occi.vmware.VmwareFactory;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;
import org.occiware.clouddesigner.occi.vmware.Vswitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwarePackageImpl extends EPackageImpl implements VmwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "vmware.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datastoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datacenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcepoollinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcepoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datacenterlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostsystemlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datastorelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualdiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vswitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualnetworkadapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualdisknetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualdisknetworklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostnetworkadapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dvswitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapshotlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostfolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcentercapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostfirewallsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostfirewallrulesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostfirewallruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoststorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoststoragelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmfolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceconsolenicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portgrouplinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostnatruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostnatportforwardlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributedportgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualcdromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualfloppyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualdisklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sharesLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dvsNicTeamingPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bootdeviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceAllocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourcePoolStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerOffTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestFirmwareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmHtSharingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmMonitorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmPowerOffBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmExecUsageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmMMUusageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum npivWwnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmSwapPlacementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestOsIdentifiersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toolsUpgradePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overallStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostConnectionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticPartitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoStartWaitHeartbeatSettingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostFirewallRuleDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostNetworkProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterDASVmSettingsRestartPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterDASVmSettingsIsolationResponseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drsBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dpmBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datastoreHostMountModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nicPolicyTeamingValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portGroupConnecteeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkChangeOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkBootProtocolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmForkConfigInfoChildTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmFaultToleranceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum latencySensitivityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterDasConfigInfoHBDatastoreCandidateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterDasConfigInfoVmMonitoringStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterDasConfigInfoServiceStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostFileSystemVolumeFileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datastoreMaintenanceModeStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostNasVolumeSecurityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum virtualDeviceConnectStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostCapabilityFtUnsupportedReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datetypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteTypeEDataType = null;

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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmwarePackageImpl() {
		super(eNS_URI, VmwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VmwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static VmwarePackage init() {
		if (isInited) return (VmwarePackage)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI);

		// Obtain or create and register package
		VmwarePackageImpl theVmwarePackage = (VmwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Load packages
		theVmwarePackage.loadPackage();

		// Fix loaded packages
		theVmwarePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmwarePackage.eNS_URI, theVmwarePackage);
		return theVmwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatastore() {
		if (datastoreEClass == null) {
			datastoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(46);
		}
		return datastoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatastore_Name() {
        return (EAttribute)getDatastore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatastore__EnterMaintenanceMode() {
        return getDatastore().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		if (clusterEClass == null) {
			clusterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(47);
		}
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Name() {
        return (EAttribute)getCluster().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__AddAllHostSystem() {
        return getCluster().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__ApplyRecommendation() {
        return getCluster().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCluster__EnterMaintenanceMode() {
        return getCluster().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatacenter() {
		if (datacenterEClass == null) {
			datacenterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(48);
		}
		return datacenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DefaultHardwareVersionKey() {
        return (EAttribute)getDatacenter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Name() {
        return (EAttribute)getDatacenter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatacenter__PowerOnMultiVMs() {
        return getDatacenter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatacenter__DiscoverAll() {
        return getDatacenter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostsystem() {
		if (hostsystemEClass == null) {
			hostsystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(49);
		}
		return hostsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_Name() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_ClusterSupported() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_InDasCluster() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_Serverip() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_VimAccountNameRequired() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_AgentVmDatastoreName() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_AgentVmNetworkName() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_Port() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_FaultToleranceEnabled() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_HostFeatureVersionKeys() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_HostFeatureVersionValues() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_VmotionEnabled() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_CurrentEVCModeKey() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_CustomValues() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_ManagementServerip() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_MaxEVCKey() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_OverallStatus() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_DistributedCPUFairness() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_DistributedMemoryFairness() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_OverallCPUUsage() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_OverallMemoryUsage() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_RebootRequired() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_BootTime() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_ConnectionState() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostsystem_InMaintenanceMode() {
        return (EAttribute)getHostsystem().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__DisconnectHost() {
        return getHostsystem().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__EnterlLockDownMode() {
        return getHostsystem().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__EnterMaintenanceMode() {
        return getHostsystem().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__ExitLockDownMode() {
        return getHostsystem().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__ExitMaintenanceMode() {
        return getHostsystem().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__ReconfigureHostForDAS() {
        return getHostsystem().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostsystem__ReconnectHost() {
        return getHostsystem().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVm() {
		if (vmEClass == null) {
			vmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(50);
		}
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Name() {
        return (EAttribute)getVm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_InstanceUUID() {
        return (EAttribute)getVm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Template() {
        return (EAttribute)getVm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Vcpus() {
        return (EAttribute)getVm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_CoresPerSocket() {
        return (EAttribute)getVm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_GuestState() {
        return (EAttribute)getVm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmwareToolsInstalled() {
        return (EAttribute)getVm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmwareToolsRunning() {
        return (EAttribute)getVm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_GuestFullName() {
        return (EAttribute)getVm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_CpuhotAddEnabled() {
        return (EAttribute)getVm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_CpuHotRemoveEnabled() {
        return (EAttribute)getVm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Annotation() {
        return (EAttribute)getVm().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmwarePowerState() {
        return (EAttribute)getVm().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_OverallStatus() {
        return (EAttribute)getVm().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__CloneVM() {
        return getVm().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__MountVmwareToolsdisk() {
        return getVm().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__MarkAsTemplate() {
        return getVm().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__MarkAsVirtualMachine() {
        return getVm().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__RegisterVM() {
        return getVm().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__UnregisterVM() {
        return getVm().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__DefragmentAllDisks() {
        return getVm().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__ResetLocationId() {
        return getVm().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderlink() {
		if (folderlinkEClass == null) {
			folderlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(51);
		}
		return folderlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcepoollink() {
		if (resourcepoollinkEClass == null) {
			resourcepoollinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(52);
		}
		return resourcepoollinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterlink() {
		if (clusterlinkEClass == null) {
			clusterlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(53);
		}
		return clusterlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcepool() {
		if (resourcepoolEClass == null) {
			resourcepoolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(54);
		}
		return resourcepoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcepool_Name() {
        return (EAttribute)getResourcepool().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcepool_Expandablereservation() {
        return (EAttribute)getResourcepool().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcepool_Limit() {
        return (EAttribute)getResourcepool().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcepool_Reservation() {
        return (EAttribute)getResourcepool().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcepool_State() {
        return (EAttribute)getResourcepool().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatacenterlink() {
		if (datacenterlinkEClass == null) {
			datacenterlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(55);
		}
		return datacenterlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostsystemlink() {
		if (hostsystemlinkEClass == null) {
			hostsystemlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(56);
		}
		return hostsystemlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatastorelink() {
		if (datastorelinkEClass == null) {
			datastorelinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(57);
		}
		return datastorelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualdisk() {
		if (virtualdiskEClass == null) {
			virtualdiskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(58);
		}
		return virtualdiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualdisk_VolumeName() {
        return (EAttribute)getVirtualdisk().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualdisk__ZeroFill() {
        return getVirtualdisk().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualdisk__Shrink() {
        return getVirtualdisk().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVswitch() {
		if (vswitchEClass == null) {
			vswitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(59);
		}
		return vswitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_Name() {
        return (EAttribute)getVswitch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_Nbport() {
        return (EAttribute)getVswitch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_BeaconInterval() {
        return (EAttribute)getVswitch().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_Mtu() {
        return (EAttribute)getVswitch().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVswitch_ChangeOperation() {
        return (EAttribute)getVswitch().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortgroup() {
		if (portgroupEClass == null) {
			portgroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(60);
		}
		return portgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortgroup_Name() {
        return (EAttribute)getPortgroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortgroup_VlanId() {
        return (EAttribute)getPortgroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortgroup_Key() {
        return (EAttribute)getPortgroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualnetworkadapter() {
		if (virtualnetworkadapterEClass == null) {
			virtualnetworkadapterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(61);
		}
		return virtualnetworkadapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualnetworkadapter_Name() {
        return (EAttribute)getVirtualnetworkadapter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualnetworkadapter_Key() {
        return (EAttribute)getVirtualnetworkadapter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualnetworkadapter_SubnetMask() {
        return (EAttribute)getVirtualnetworkadapter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualnetworkadapter_Port() {
        return (EAttribute)getVirtualnetworkadapter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualnetworkadapter_DeviceDriver() {
        return (EAttribute)getVirtualnetworkadapter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualnetworkadapter__ConnectAdaptater() {
        return getVirtualnetworkadapter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualnetworkadapter__DisconnectAdaptater() {
        return getVirtualnetworkadapter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualdisknetwork() {
		if (virtualdisknetworkEClass == null) {
			virtualdisknetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(62);
		}
		return virtualdisknetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualdisknetwork_VolumeName() {
        return (EAttribute)getVirtualdisknetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualdisknetworklink() {
		if (virtualdisknetworklinkEClass == null) {
			virtualdisknetworklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(63);
		}
		return virtualdisknetworklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostnetworkadapter() {
		if (hostnetworkadapterEClass == null) {
			hostnetworkadapterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(64);
		}
		return hostnetworkadapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_Name() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_Driver() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_Key() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_Pci() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_SubnetMask() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnetworkadapter_WakeOnLanSupported() {
        return (EAttribute)getHostnetworkadapter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostnetworkadapter__Connect() {
        return getHostnetworkadapter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostnetworkadapter__Disconnect() {
        return getHostnetworkadapter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDvswitch() {
		if (dvswitchEClass == null) {
			dvswitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(65);
		}
		return dvswitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnapshot() {
		if (snapshotEClass == null) {
			snapshotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(66);
		}
		return snapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSnapshot__Restore() {
        return getSnapshot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnapshotlink() {
		if (snapshotlinkEClass == null) {
			snapshotlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(67);
		}
		return snapshotlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		if (folderEClass == null) {
			folderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(68);
		}
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Name() {
        return (EAttribute)getFolder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostfolder() {
		if (hostfolderEClass == null) {
			hostfolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(69);
		}
		return hostfolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfolder_Name() {
        return (EAttribute)getHostfolder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVcentercapability() {
		if (vcentercapabilityEClass == null) {
			vcentercapabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(70);
		}
		return vcentercapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcentercapability_MultiHostSupported() {
        return (EAttribute)getVcentercapability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcentercapability_ProvisioningSupported() {
        return (EAttribute)getVcentercapability().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcentercapability_UserShellAccessSupported() {
        return (EAttribute)getVcentercapability().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcentercapability_EVCModeVendor() {
        return (EAttribute)getVcentercapability().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVcentercapability_EVCModeVendorTier() {
        return (EAttribute)getVcentercapability().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostfirewallsystem() {
		if (hostfirewallsystemEClass == null) {
			hostfirewallsystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(71);
		}
		return hostfirewallsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallsystem_DefaultIncomingBlocked() {
        return (EAttribute)getHostfirewallsystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallsystem_DefaultOutgoingBlocked() {
        return (EAttribute)getHostfirewallsystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostfirewallruleset() {
		if (hostfirewallrulesetEClass == null) {
			hostfirewallrulesetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(72);
		}
		return hostfirewallrulesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallruleset_Enabled() {
        return (EAttribute)getHostfirewallruleset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallruleset_Key() {
        return (EAttribute)getHostfirewallruleset().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallruleset_Label() {
        return (EAttribute)getHostfirewallruleset().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallruleset_Required() {
        return (EAttribute)getHostfirewallruleset().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallruleset_Service() {
        return (EAttribute)getHostfirewallruleset().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostfirewallruleset__DisableRuleset() {
        return getHostfirewallruleset().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHostfirewallruleset__EnableRuleset() {
        return getHostfirewallruleset().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostfirewallrule() {
		if (hostfirewallruleEClass == null) {
			hostfirewallruleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(73);
		}
		return hostfirewallruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallrule_Direction() {
        return (EAttribute)getHostfirewallrule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallrule_Port() {
        return (EAttribute)getHostfirewallrule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallrule_EndPort() {
        return (EAttribute)getHostfirewallrule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostfirewallrule_Protocol() {
        return (EAttribute)getHostfirewallrule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoststorage() {
		if (hoststorageEClass == null) {
			hoststorageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(74);
		}
		return hoststorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHoststorage_HostVolumeName() {
        return (EAttribute)getHoststorage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoststoragelink() {
		if (hoststoragelinkEClass == null) {
			hoststoragelinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(75);
		}
		return hoststoragelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmfolder() {
		if (vmfolderEClass == null) {
			vmfolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(76);
		}
		return vmfolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmfolder_Name() {
        return (EAttribute)getVmfolder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceconsolenic() {
		if (serviceconsolenicEClass == null) {
			serviceconsolenicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(77);
		}
		return serviceconsolenicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortgrouplink() {
		if (portgrouplinkEClass == null) {
			portgrouplinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(78);
		}
		return portgrouplinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostnatrule() {
		if (hostnatruleEClass == null) {
			hostnatruleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(79);
		}
		return hostnatruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_ActiveFtp() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_AllowAnyOui() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_ConfigPort() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_NatKey() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_NatChangeOperation() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_IpGatewayAddress() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatrule_UdpTimeOut() {
        return (EAttribute)getHostnatrule().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostnatportforwardlink() {
		if (hostnatportforwardlinkEClass == null) {
			hostnatportforwardlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(80);
		}
		return hostnatportforwardlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatportforwardlink_GuestIpAddress() {
        return (EAttribute)getHostnatportforwardlink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatportforwardlink_GuestPort() {
        return (EAttribute)getHostnatportforwardlink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatportforwardlink_HostPort() {
        return (EAttribute)getHostnatportforwardlink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatportforwardlink_Name() {
        return (EAttribute)getHostnatportforwardlink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostnatportforwardlink_Type() {
        return (EAttribute)getHostnatportforwardlink().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributedportgroup() {
		if (distributedportgroupEClass == null) {
			distributedportgroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(81);
		}
		return distributedportgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualcdrom() {
		if (virtualcdromEClass == null) {
			virtualcdromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(82);
		}
		return virtualcdromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualcdrom_IsoFilename() {
        return (EAttribute)getVirtualcdrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualcdrom_VolumeName() {
        return (EAttribute)getVirtualcdrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualfloppy() {
		if (virtualfloppyEClass == null) {
			virtualfloppyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(83);
		}
		return virtualfloppyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualfloppy_VolumeName() {
        return (EAttribute)getVirtualfloppy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualdisklink() {
		if (virtualdisklinkEClass == null) {
			virtualdisklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(84);
		}
		return virtualdisklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualdisklink_VmdkFilePathOnDatastore() {
        return (EAttribute)getVirtualdisklink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSharesLevel() {
		if (sharesLevelEEnum == null) {
			sharesLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(1);
		}
		return sharesLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDvsNicTeamingPolicy() {
		if (dvsNicTeamingPolicyEEnum == null) {
			dvsNicTeamingPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(2);
		}
		return dvsNicTeamingPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBootdevice() {
		if (bootdeviceEEnum == null) {
			bootdeviceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(3);
		}
		return bootdeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceAllocationType() {
		if (resourceAllocationTypeEEnum == null) {
			resourceAllocationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(4);
		}
		return resourceAllocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourcePoolState() {
		if (resourcePoolStateEEnum == null) {
			resourcePoolStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(5);
		}
		return resourcePoolStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPowerOffType() {
		if (powerOffTypeEEnum == null) {
			powerOffTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(7);
		}
		return powerOffTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestFirmwareType() {
		if (guestFirmwareTypeEEnum == null) {
			guestFirmwareTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(8);
		}
		return guestFirmwareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmHtSharing() {
		if (vmHtSharingEEnum == null) {
			vmHtSharingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(9);
		}
		return vmHtSharingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmMonitorType() {
		if (vmMonitorTypeEEnum == null) {
			vmMonitorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(10);
		}
		return vmMonitorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmPowerOffBehavior() {
		if (vmPowerOffBehaviorEEnum == null) {
			vmPowerOffBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(11);
		}
		return vmPowerOffBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmExecUsage() {
		if (vmExecUsageEEnum == null) {
			vmExecUsageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(12);
		}
		return vmExecUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmMMUusage() {
		if (vmMMUusageEEnum == null) {
			vmMMUusageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(13);
		}
		return vmMMUusageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNpivWwnType() {
		if (npivWwnTypeEEnum == null) {
			npivWwnTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(15);
		}
		return npivWwnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmSwapPlacementType() {
		if (vmSwapPlacementTypeEEnum == null) {
			vmSwapPlacementTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(16);
		}
		return vmSwapPlacementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestOsIdentifiers() {
		if (guestOsIdentifiersEEnum == null) {
			guestOsIdentifiersEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(17);
		}
		return guestOsIdentifiersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToolsUpgradePolicy() {
		if (toolsUpgradePolicyEEnum == null) {
			toolsUpgradePolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(18);
		}
		return toolsUpgradePolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverallStatus() {
		if (overallStatusEEnum == null) {
			overallStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(19);
		}
		return overallStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostConnectionState() {
		if (hostConnectionStateEEnum == null) {
			hostConnectionStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(20);
		}
		return hostConnectionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticPartitionType() {
		if (diagnosticPartitionTypeEEnum == null) {
			diagnosticPartitionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(21);
		}
		return diagnosticPartitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutoStartWaitHeartbeatSetting() {
		if (autoStartWaitHeartbeatSettingEEnum == null) {
			autoStartWaitHeartbeatSettingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(22);
		}
		return autoStartWaitHeartbeatSettingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostFirewallRuleDirection() {
		if (hostFirewallRuleDirectionEEnum == null) {
			hostFirewallRuleDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(23);
		}
		return hostFirewallRuleDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostNetworkProtocol() {
		if (hostNetworkProtocolEEnum == null) {
			hostNetworkProtocolEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(24);
		}
		return hostNetworkProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterDASVmSettingsRestartPriority() {
		if (clusterDASVmSettingsRestartPriorityEEnum == null) {
			clusterDASVmSettingsRestartPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(26);
		}
		return clusterDASVmSettingsRestartPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterDASVmSettingsIsolationResponse() {
		if (clusterDASVmSettingsIsolationResponseEEnum == null) {
			clusterDASVmSettingsIsolationResponseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(27);
		}
		return clusterDASVmSettingsIsolationResponseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrsBehavior() {
		if (drsBehaviorEEnum == null) {
			drsBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(28);
		}
		return drsBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDpmBehavior() {
		if (dpmBehaviorEEnum == null) {
			dpmBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(29);
		}
		return dpmBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatastoreHostMountMode() {
		if (datastoreHostMountModeEEnum == null) {
			datastoreHostMountModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(30);
		}
		return datastoreHostMountModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNicPolicyTeamingValue() {
		if (nicPolicyTeamingValueEEnum == null) {
			nicPolicyTeamingValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(31);
		}
		return nicPolicyTeamingValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortGroupConnecteeType() {
		if (portGroupConnecteeTypeEEnum == null) {
			portGroupConnecteeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(32);
		}
		return portGroupConnecteeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkChangeOperation() {
		if (networkChangeOperationEEnum == null) {
			networkChangeOperationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(33);
		}
		return networkChangeOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkBootProtocolType() {
		if (networkBootProtocolTypeEEnum == null) {
			networkBootProtocolTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(34);
		}
		return networkBootProtocolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmForkConfigInfoChildType() {
		if (vmForkConfigInfoChildTypeEEnum == null) {
			vmForkConfigInfoChildTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(35);
		}
		return vmForkConfigInfoChildTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmFaultToleranceType() {
		if (vmFaultToleranceTypeEEnum == null) {
			vmFaultToleranceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(36);
		}
		return vmFaultToleranceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLatencySensitivityLevel() {
		if (latencySensitivityLevelEEnum == null) {
			latencySensitivityLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(37);
		}
		return latencySensitivityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterDasConfigInfoHBDatastoreCandidate() {
		if (clusterDasConfigInfoHBDatastoreCandidateEEnum == null) {
			clusterDasConfigInfoHBDatastoreCandidateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(38);
		}
		return clusterDasConfigInfoHBDatastoreCandidateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterDasConfigInfoVmMonitoringState() {
		if (clusterDasConfigInfoVmMonitoringStateEEnum == null) {
			clusterDasConfigInfoVmMonitoringStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(39);
		}
		return clusterDasConfigInfoVmMonitoringStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterDasConfigInfoServiceState() {
		if (clusterDasConfigInfoServiceStateEEnum == null) {
			clusterDasConfigInfoServiceStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(40);
		}
		return clusterDasConfigInfoServiceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostFileSystemVolumeFileType() {
		if (hostFileSystemVolumeFileTypeEEnum == null) {
			hostFileSystemVolumeFileTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(41);
		}
		return hostFileSystemVolumeFileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatastoreMaintenanceModeState() {
		if (datastoreMaintenanceModeStateEEnum == null) {
			datastoreMaintenanceModeStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(42);
		}
		return datastoreMaintenanceModeStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostNasVolumeSecurityType() {
		if (hostNasVolumeSecurityTypeEEnum == null) {
			hostNasVolumeSecurityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(43);
		}
		return hostNasVolumeSecurityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualDeviceConnectStatus() {
		if (virtualDeviceConnectStatusEEnum == null) {
			virtualDeviceConnectStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(44);
		}
		return virtualDeviceConnectStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHostCapabilityFtUnsupportedReason() {
		if (hostCapabilityFtUnsupportedReasonEEnum == null) {
			hostCapabilityFtUnsupportedReasonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(45);
		}
		return hostCapabilityFtUnsupportedReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongNumber() {
		if (longNumberEDataType == null) {
			longNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(0);
		}
		return longNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatetype() {
		if (datetypeEDataType == null) {
			datetypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(6);
		}
		return datetypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShortNumber() {
		if (shortNumberEDataType == null) {
			shortNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(14);
		}
		return shortNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getByteType() {
		if (byteTypeEDataType == null) {
			byteTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(VmwarePackage.eNS_URI).getEClassifiers().get(25);
		}
		return byteTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareFactory getVmwareFactory() {
		return (VmwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.occiware.clouddesigner.occi.vmware." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //VmwarePackageImpl
