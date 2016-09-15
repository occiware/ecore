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

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.vmware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwareFactoryImpl extends EFactoryImpl implements VmwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmwareFactory init() {
		try {
			VmwareFactory theVmwareFactory = (VmwareFactory)EPackage.Registry.INSTANCE.getEFactory(VmwarePackage.eNS_URI);
			if (theVmwareFactory != null) {
				return theVmwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VmwarePackage.DATASTORE: return createDatastore();
			case VmwarePackage.CLUSTER: return createCluster();
			case VmwarePackage.DATACENTER: return createDatacenter();
			case VmwarePackage.HOSTSYSTEM: return createHostsystem();
			case VmwarePackage.VM: return createVm();
			case VmwarePackage.FOLDERLINK: return createFolderlink();
			case VmwarePackage.RESOURCEPOOLLINK: return createResourcepoollink();
			case VmwarePackage.CLUSTERLINK: return createClusterlink();
			case VmwarePackage.RESOURCEPOOL: return createResourcepool();
			case VmwarePackage.DATACENTERLINK: return createDatacenterlink();
			case VmwarePackage.HOSTSYSTEMLINK: return createHostsystemlink();
			case VmwarePackage.DATASTORELINK: return createDatastorelink();
			case VmwarePackage.VIRTUALDISK: return createVirtualdisk();
			case VmwarePackage.VSWITCH: return createVswitch();
			case VmwarePackage.PORTGROUP: return createPortgroup();
			case VmwarePackage.VIRTUALNETWORKADAPTER: return createVirtualnetworkadapter();
			case VmwarePackage.VIRTUALDISKNETWORK: return createVirtualdisknetwork();
			case VmwarePackage.VIRTUALDISKNETWORKLINK: return createVirtualdisknetworklink();
			case VmwarePackage.HOSTNETWORKADAPTER: return createHostnetworkadapter();
			case VmwarePackage.DVSWITCH: return createDvswitch();
			case VmwarePackage.SNAPSHOT: return createSnapshot();
			case VmwarePackage.SNAPSHOTLINK: return createSnapshotlink();
			case VmwarePackage.FOLDER: return createFolder();
			case VmwarePackage.HOSTFOLDER: return createHostfolder();
			case VmwarePackage.VCENTERCAPABILITY: return createVcentercapability();
			case VmwarePackage.HOSTFIREWALLSYSTEM: return createHostfirewallsystem();
			case VmwarePackage.HOSTFIREWALLRULESET: return createHostfirewallruleset();
			case VmwarePackage.HOSTFIREWALLRULE: return createHostfirewallrule();
			case VmwarePackage.HOSTSTORAGE: return createHoststorage();
			case VmwarePackage.HOSTSTORAGELINK: return createHoststoragelink();
			case VmwarePackage.VMFOLDER: return createVmfolder();
			case VmwarePackage.SERVICECONSOLENIC: return createServiceconsolenic();
			case VmwarePackage.PORTGROUPLINK: return createPortgrouplink();
			case VmwarePackage.HOSTNATRULE: return createHostnatrule();
			case VmwarePackage.HOSTNATPORTFORWARDLINK: return createHostnatportforwardlink();
			case VmwarePackage.DISTRIBUTEDPORTGROUP: return createDistributedportgroup();
			case VmwarePackage.VIRTUALCDROM: return createVirtualcdrom();
			case VmwarePackage.VIRTUALFLOPPY: return createVirtualfloppy();
			case VmwarePackage.VIRTUALDISKLINK: return createVirtualdisklink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VmwarePackage.SHARES_LEVEL:
				return createSharesLevelFromString(eDataType, initialValue);
			case VmwarePackage.DVS_NIC_TEAMING_POLICY:
				return createDvsNicTeamingPolicyFromString(eDataType, initialValue);
			case VmwarePackage.BOOTDEVICE:
				return createBootdeviceFromString(eDataType, initialValue);
			case VmwarePackage.RESOURCE_ALLOCATION_TYPE:
				return createResourceAllocationTypeFromString(eDataType, initialValue);
			case VmwarePackage.RESOURCE_POOL_STATE:
				return createResourcePoolStateFromString(eDataType, initialValue);
			case VmwarePackage.POWER_OFF_TYPE:
				return createPowerOffTypeFromString(eDataType, initialValue);
			case VmwarePackage.GUEST_FIRMWARE_TYPE:
				return createGuestFirmwareTypeFromString(eDataType, initialValue);
			case VmwarePackage.VM_HT_SHARING:
				return createVmHtSharingFromString(eDataType, initialValue);
			case VmwarePackage.VM_MONITOR_TYPE:
				return createVmMonitorTypeFromString(eDataType, initialValue);
			case VmwarePackage.VM_POWER_OFF_BEHAVIOR:
				return createVmPowerOffBehaviorFromString(eDataType, initialValue);
			case VmwarePackage.VM_EXEC_USAGE:
				return createVmExecUsageFromString(eDataType, initialValue);
			case VmwarePackage.VM_MM_UUSAGE:
				return createVmMMUusageFromString(eDataType, initialValue);
			case VmwarePackage.NPIV_WWN_TYPE:
				return createNpivWwnTypeFromString(eDataType, initialValue);
			case VmwarePackage.VM_SWAP_PLACEMENT_TYPE:
				return createVmSwapPlacementTypeFromString(eDataType, initialValue);
			case VmwarePackage.GUEST_OS_IDENTIFIERS:
				return createGuestOsIdentifiersFromString(eDataType, initialValue);
			case VmwarePackage.TOOLS_UPGRADE_POLICY:
				return createToolsUpgradePolicyFromString(eDataType, initialValue);
			case VmwarePackage.OVERALL_STATUS:
				return createOverallStatusFromString(eDataType, initialValue);
			case VmwarePackage.HOST_CONNECTION_STATE:
				return createHostConnectionStateFromString(eDataType, initialValue);
			case VmwarePackage.DIAGNOSTIC_PARTITION_TYPE:
				return createDiagnosticPartitionTypeFromString(eDataType, initialValue);
			case VmwarePackage.AUTO_START_WAIT_HEARTBEAT_SETTING:
				return createAutoStartWaitHeartbeatSettingFromString(eDataType, initialValue);
			case VmwarePackage.HOST_FIREWALL_RULE_DIRECTION:
				return createHostFirewallRuleDirectionFromString(eDataType, initialValue);
			case VmwarePackage.HOST_NETWORK_PROTOCOL:
				return createHostNetworkProtocolFromString(eDataType, initialValue);
			case VmwarePackage.CLUSTER_DAS_VM_SETTINGS_RESTART_PRIORITY:
				return createClusterDASVmSettingsRestartPriorityFromString(eDataType, initialValue);
			case VmwarePackage.CLUSTER_DAS_VM_SETTINGS_ISOLATION_RESPONSE:
				return createClusterDASVmSettingsIsolationResponseFromString(eDataType, initialValue);
			case VmwarePackage.DRS_BEHAVIOR:
				return createDrsBehaviorFromString(eDataType, initialValue);
			case VmwarePackage.DPM_BEHAVIOR:
				return createDpmBehaviorFromString(eDataType, initialValue);
			case VmwarePackage.DATASTORE_HOST_MOUNT_MODE:
				return createDatastoreHostMountModeFromString(eDataType, initialValue);
			case VmwarePackage.NIC_POLICY_TEAMING_VALUE:
				return createNicPolicyTeamingValueFromString(eDataType, initialValue);
			case VmwarePackage.PORT_GROUP_CONNECTEE_TYPE:
				return createPortGroupConnecteeTypeFromString(eDataType, initialValue);
			case VmwarePackage.NETWORK_CHANGE_OPERATION:
				return createNetworkChangeOperationFromString(eDataType, initialValue);
			case VmwarePackage.NETWORK_BOOT_PROTOCOL_TYPE:
				return createNetworkBootProtocolTypeFromString(eDataType, initialValue);
			case VmwarePackage.VM_FORK_CONFIG_INFO_CHILD_TYPE:
				return createVmForkConfigInfoChildTypeFromString(eDataType, initialValue);
			case VmwarePackage.VM_FAULT_TOLERANCE_TYPE:
				return createVmFaultToleranceTypeFromString(eDataType, initialValue);
			case VmwarePackage.LATENCY_SENSITIVITY_LEVEL:
				return createLatencySensitivityLevelFromString(eDataType, initialValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_HB_DATASTORE_CANDIDATE:
				return createClusterDasConfigInfoHBDatastoreCandidateFromString(eDataType, initialValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_VM_MONITORING_STATE:
				return createClusterDasConfigInfoVmMonitoringStateFromString(eDataType, initialValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_SERVICE_STATE:
				return createClusterDasConfigInfoServiceStateFromString(eDataType, initialValue);
			case VmwarePackage.HOST_FILE_SYSTEM_VOLUME_FILE_TYPE:
				return createHostFileSystemVolumeFileTypeFromString(eDataType, initialValue);
			case VmwarePackage.DATASTORE_MAINTENANCE_MODE_STATE:
				return createDatastoreMaintenanceModeStateFromString(eDataType, initialValue);
			case VmwarePackage.HOST_NAS_VOLUME_SECURITY_TYPE:
				return createHostNasVolumeSecurityTypeFromString(eDataType, initialValue);
			case VmwarePackage.VIRTUAL_DEVICE_CONNECT_STATUS:
				return createVirtualDeviceConnectStatusFromString(eDataType, initialValue);
			case VmwarePackage.HOST_CAPABILITY_FT_UNSUPPORTED_REASON:
				return createHostCapabilityFtUnsupportedReasonFromString(eDataType, initialValue);
			case VmwarePackage.LONG_NUMBER:
				return createLongNumberFromString(eDataType, initialValue);
			case VmwarePackage.DATETYPE:
				return createDatetypeFromString(eDataType, initialValue);
			case VmwarePackage.SHORT_NUMBER:
				return createShortNumberFromString(eDataType, initialValue);
			case VmwarePackage.BYTE_TYPE:
				return createByteTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VmwarePackage.SHARES_LEVEL:
				return convertSharesLevelToString(eDataType, instanceValue);
			case VmwarePackage.DVS_NIC_TEAMING_POLICY:
				return convertDvsNicTeamingPolicyToString(eDataType, instanceValue);
			case VmwarePackage.BOOTDEVICE:
				return convertBootdeviceToString(eDataType, instanceValue);
			case VmwarePackage.RESOURCE_ALLOCATION_TYPE:
				return convertResourceAllocationTypeToString(eDataType, instanceValue);
			case VmwarePackage.RESOURCE_POOL_STATE:
				return convertResourcePoolStateToString(eDataType, instanceValue);
			case VmwarePackage.POWER_OFF_TYPE:
				return convertPowerOffTypeToString(eDataType, instanceValue);
			case VmwarePackage.GUEST_FIRMWARE_TYPE:
				return convertGuestFirmwareTypeToString(eDataType, instanceValue);
			case VmwarePackage.VM_HT_SHARING:
				return convertVmHtSharingToString(eDataType, instanceValue);
			case VmwarePackage.VM_MONITOR_TYPE:
				return convertVmMonitorTypeToString(eDataType, instanceValue);
			case VmwarePackage.VM_POWER_OFF_BEHAVIOR:
				return convertVmPowerOffBehaviorToString(eDataType, instanceValue);
			case VmwarePackage.VM_EXEC_USAGE:
				return convertVmExecUsageToString(eDataType, instanceValue);
			case VmwarePackage.VM_MM_UUSAGE:
				return convertVmMMUusageToString(eDataType, instanceValue);
			case VmwarePackage.NPIV_WWN_TYPE:
				return convertNpivWwnTypeToString(eDataType, instanceValue);
			case VmwarePackage.VM_SWAP_PLACEMENT_TYPE:
				return convertVmSwapPlacementTypeToString(eDataType, instanceValue);
			case VmwarePackage.GUEST_OS_IDENTIFIERS:
				return convertGuestOsIdentifiersToString(eDataType, instanceValue);
			case VmwarePackage.TOOLS_UPGRADE_POLICY:
				return convertToolsUpgradePolicyToString(eDataType, instanceValue);
			case VmwarePackage.OVERALL_STATUS:
				return convertOverallStatusToString(eDataType, instanceValue);
			case VmwarePackage.HOST_CONNECTION_STATE:
				return convertHostConnectionStateToString(eDataType, instanceValue);
			case VmwarePackage.DIAGNOSTIC_PARTITION_TYPE:
				return convertDiagnosticPartitionTypeToString(eDataType, instanceValue);
			case VmwarePackage.AUTO_START_WAIT_HEARTBEAT_SETTING:
				return convertAutoStartWaitHeartbeatSettingToString(eDataType, instanceValue);
			case VmwarePackage.HOST_FIREWALL_RULE_DIRECTION:
				return convertHostFirewallRuleDirectionToString(eDataType, instanceValue);
			case VmwarePackage.HOST_NETWORK_PROTOCOL:
				return convertHostNetworkProtocolToString(eDataType, instanceValue);
			case VmwarePackage.CLUSTER_DAS_VM_SETTINGS_RESTART_PRIORITY:
				return convertClusterDASVmSettingsRestartPriorityToString(eDataType, instanceValue);
			case VmwarePackage.CLUSTER_DAS_VM_SETTINGS_ISOLATION_RESPONSE:
				return convertClusterDASVmSettingsIsolationResponseToString(eDataType, instanceValue);
			case VmwarePackage.DRS_BEHAVIOR:
				return convertDrsBehaviorToString(eDataType, instanceValue);
			case VmwarePackage.DPM_BEHAVIOR:
				return convertDpmBehaviorToString(eDataType, instanceValue);
			case VmwarePackage.DATASTORE_HOST_MOUNT_MODE:
				return convertDatastoreHostMountModeToString(eDataType, instanceValue);
			case VmwarePackage.NIC_POLICY_TEAMING_VALUE:
				return convertNicPolicyTeamingValueToString(eDataType, instanceValue);
			case VmwarePackage.PORT_GROUP_CONNECTEE_TYPE:
				return convertPortGroupConnecteeTypeToString(eDataType, instanceValue);
			case VmwarePackage.NETWORK_CHANGE_OPERATION:
				return convertNetworkChangeOperationToString(eDataType, instanceValue);
			case VmwarePackage.NETWORK_BOOT_PROTOCOL_TYPE:
				return convertNetworkBootProtocolTypeToString(eDataType, instanceValue);
			case VmwarePackage.VM_FORK_CONFIG_INFO_CHILD_TYPE:
				return convertVmForkConfigInfoChildTypeToString(eDataType, instanceValue);
			case VmwarePackage.VM_FAULT_TOLERANCE_TYPE:
				return convertVmFaultToleranceTypeToString(eDataType, instanceValue);
			case VmwarePackage.LATENCY_SENSITIVITY_LEVEL:
				return convertLatencySensitivityLevelToString(eDataType, instanceValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_HB_DATASTORE_CANDIDATE:
				return convertClusterDasConfigInfoHBDatastoreCandidateToString(eDataType, instanceValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_VM_MONITORING_STATE:
				return convertClusterDasConfigInfoVmMonitoringStateToString(eDataType, instanceValue);
			case VmwarePackage.CLUSTER_DAS_CONFIG_INFO_SERVICE_STATE:
				return convertClusterDasConfigInfoServiceStateToString(eDataType, instanceValue);
			case VmwarePackage.HOST_FILE_SYSTEM_VOLUME_FILE_TYPE:
				return convertHostFileSystemVolumeFileTypeToString(eDataType, instanceValue);
			case VmwarePackage.DATASTORE_MAINTENANCE_MODE_STATE:
				return convertDatastoreMaintenanceModeStateToString(eDataType, instanceValue);
			case VmwarePackage.HOST_NAS_VOLUME_SECURITY_TYPE:
				return convertHostNasVolumeSecurityTypeToString(eDataType, instanceValue);
			case VmwarePackage.VIRTUAL_DEVICE_CONNECT_STATUS:
				return convertVirtualDeviceConnectStatusToString(eDataType, instanceValue);
			case VmwarePackage.HOST_CAPABILITY_FT_UNSUPPORTED_REASON:
				return convertHostCapabilityFtUnsupportedReasonToString(eDataType, instanceValue);
			case VmwarePackage.LONG_NUMBER:
				return convertLongNumberToString(eDataType, instanceValue);
			case VmwarePackage.DATETYPE:
				return convertDatetypeToString(eDataType, instanceValue);
			case VmwarePackage.SHORT_NUMBER:
				return convertShortNumberToString(eDataType, instanceValue);
			case VmwarePackage.BYTE_TYPE:
				return convertByteTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datastore createDatastore() {
		DatastoreImpl datastore = new DatastoreImpl();
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenter createDatacenter() {
		DatacenterImpl datacenter = new DatacenterImpl();
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostsystem createHostsystem() {
		HostsystemImpl hostsystem = new HostsystemImpl();
		return hostsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vm createVm() {
		VmImpl vm = new VmImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folderlink createFolderlink() {
		FolderlinkImpl folderlink = new FolderlinkImpl();
		return folderlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcepoollink createResourcepoollink() {
		ResourcepoollinkImpl resourcepoollink = new ResourcepoollinkImpl();
		return resourcepoollink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clusterlink createClusterlink() {
		ClusterlinkImpl clusterlink = new ClusterlinkImpl();
		return clusterlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcepool createResourcepool() {
		ResourcepoolImpl resourcepool = new ResourcepoolImpl();
		return resourcepool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenterlink createDatacenterlink() {
		DatacenterlinkImpl datacenterlink = new DatacenterlinkImpl();
		return datacenterlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostsystemlink createHostsystemlink() {
		HostsystemlinkImpl hostsystemlink = new HostsystemlinkImpl();
		return hostsystemlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datastorelink createDatastorelink() {
		DatastorelinkImpl datastorelink = new DatastorelinkImpl();
		return datastorelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualdisk createVirtualdisk() {
		VirtualdiskImpl virtualdisk = new VirtualdiskImpl();
		return virtualdisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vswitch createVswitch() {
		VswitchImpl vswitch = new VswitchImpl();
		return vswitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Portgroup createPortgroup() {
		PortgroupImpl portgroup = new PortgroupImpl();
		return portgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualnetworkadapter createVirtualnetworkadapter() {
		VirtualnetworkadapterImpl virtualnetworkadapter = new VirtualnetworkadapterImpl();
		return virtualnetworkadapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualdisknetwork createVirtualdisknetwork() {
		VirtualdisknetworkImpl virtualdisknetwork = new VirtualdisknetworkImpl();
		return virtualdisknetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualdisknetworklink createVirtualdisknetworklink() {
		VirtualdisknetworklinkImpl virtualdisknetworklink = new VirtualdisknetworklinkImpl();
		return virtualdisknetworklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostnetworkadapter createHostnetworkadapter() {
		HostnetworkadapterImpl hostnetworkadapter = new HostnetworkadapterImpl();
		return hostnetworkadapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dvswitch createDvswitch() {
		DvswitchImpl dvswitch = new DvswitchImpl();
		return dvswitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Snapshot createSnapshot() {
		SnapshotImpl snapshot = new SnapshotImpl();
		return snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Snapshotlink createSnapshotlink() {
		SnapshotlinkImpl snapshotlink = new SnapshotlinkImpl();
		return snapshotlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostfolder createHostfolder() {
		HostfolderImpl hostfolder = new HostfolderImpl();
		return hostfolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vcentercapability createVcentercapability() {
		VcentercapabilityImpl vcentercapability = new VcentercapabilityImpl();
		return vcentercapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostfirewallsystem createHostfirewallsystem() {
		HostfirewallsystemImpl hostfirewallsystem = new HostfirewallsystemImpl();
		return hostfirewallsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostfirewallruleset createHostfirewallruleset() {
		HostfirewallrulesetImpl hostfirewallruleset = new HostfirewallrulesetImpl();
		return hostfirewallruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostfirewallrule createHostfirewallrule() {
		HostfirewallruleImpl hostfirewallrule = new HostfirewallruleImpl();
		return hostfirewallrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hoststorage createHoststorage() {
		HoststorageImpl hoststorage = new HoststorageImpl();
		return hoststorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hoststoragelink createHoststoragelink() {
		HoststoragelinkImpl hoststoragelink = new HoststoragelinkImpl();
		return hoststoragelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vmfolder createVmfolder() {
		VmfolderImpl vmfolder = new VmfolderImpl();
		return vmfolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serviceconsolenic createServiceconsolenic() {
		ServiceconsolenicImpl serviceconsolenic = new ServiceconsolenicImpl();
		return serviceconsolenic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Portgrouplink createPortgrouplink() {
		PortgrouplinkImpl portgrouplink = new PortgrouplinkImpl();
		return portgrouplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostnatrule createHostnatrule() {
		HostnatruleImpl hostnatrule = new HostnatruleImpl();
		return hostnatrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostnatportforwardlink createHostnatportforwardlink() {
		HostnatportforwardlinkImpl hostnatportforwardlink = new HostnatportforwardlinkImpl();
		return hostnatportforwardlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distributedportgroup createDistributedportgroup() {
		DistributedportgroupImpl distributedportgroup = new DistributedportgroupImpl();
		return distributedportgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualcdrom createVirtualcdrom() {
		VirtualcdromImpl virtualcdrom = new VirtualcdromImpl();
		return virtualcdrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualfloppy createVirtualfloppy() {
		VirtualfloppyImpl virtualfloppy = new VirtualfloppyImpl();
		return virtualfloppy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Virtualdisklink createVirtualdisklink() {
		VirtualdisklinkImpl virtualdisklink = new VirtualdisklinkImpl();
		return virtualdisklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharesLevel createSharesLevelFromString(EDataType eDataType, String initialValue) {
		SharesLevel result = SharesLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSharesLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DvsNicTeamingPolicy createDvsNicTeamingPolicyFromString(EDataType eDataType, String initialValue) {
		DvsNicTeamingPolicy result = DvsNicTeamingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDvsNicTeamingPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bootdevice createBootdeviceFromString(EDataType eDataType, String initialValue) {
		Bootdevice result = Bootdevice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBootdeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAllocationType createResourceAllocationTypeFromString(EDataType eDataType, String initialValue) {
		ResourceAllocationType result = ResourceAllocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceAllocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePoolState createResourcePoolStateFromString(EDataType eDataType, String initialValue) {
		ResourcePoolState result = ResourcePoolState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePoolStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerOffType createPowerOffTypeFromString(EDataType eDataType, String initialValue) {
		PowerOffType result = PowerOffType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerOffTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestFirmwareType createGuestFirmwareTypeFromString(EDataType eDataType, String initialValue) {
		GuestFirmwareType result = GuestFirmwareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuestFirmwareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmHtSharing createVmHtSharingFromString(EDataType eDataType, String initialValue) {
		VmHtSharing result = VmHtSharing.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmHtSharingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmMonitorType createVmMonitorTypeFromString(EDataType eDataType, String initialValue) {
		VmMonitorType result = VmMonitorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmMonitorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPowerOffBehavior createVmPowerOffBehaviorFromString(EDataType eDataType, String initialValue) {
		VmPowerOffBehavior result = VmPowerOffBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmPowerOffBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmExecUsage createVmExecUsageFromString(EDataType eDataType, String initialValue) {
		VmExecUsage result = VmExecUsage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmExecUsageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmMMUusage createVmMMUusageFromString(EDataType eDataType, String initialValue) {
		VmMMUusage result = VmMMUusage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmMMUusageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NpivWwnType createNpivWwnTypeFromString(EDataType eDataType, String initialValue) {
		NpivWwnType result = NpivWwnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNpivWwnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmSwapPlacementType createVmSwapPlacementTypeFromString(EDataType eDataType, String initialValue) {
		VmSwapPlacementType result = VmSwapPlacementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmSwapPlacementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestOsIdentifiers createGuestOsIdentifiersFromString(EDataType eDataType, String initialValue) {
		GuestOsIdentifiers result = GuestOsIdentifiers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuestOsIdentifiersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolsUpgradePolicy createToolsUpgradePolicyFromString(EDataType eDataType, String initialValue) {
		ToolsUpgradePolicy result = ToolsUpgradePolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToolsUpgradePolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallStatus createOverallStatusFromString(EDataType eDataType, String initialValue) {
		OverallStatus result = OverallStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverallStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostConnectionState createHostConnectionStateFromString(EDataType eDataType, String initialValue) {
		HostConnectionState result = HostConnectionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostConnectionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticPartitionType createDiagnosticPartitionTypeFromString(EDataType eDataType, String initialValue) {
		DiagnosticPartitionType result = DiagnosticPartitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticPartitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoStartWaitHeartbeatSetting createAutoStartWaitHeartbeatSettingFromString(EDataType eDataType, String initialValue) {
		AutoStartWaitHeartbeatSetting result = AutoStartWaitHeartbeatSetting.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoStartWaitHeartbeatSettingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostFirewallRuleDirection createHostFirewallRuleDirectionFromString(EDataType eDataType, String initialValue) {
		HostFirewallRuleDirection result = HostFirewallRuleDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostFirewallRuleDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNetworkProtocol createHostNetworkProtocolFromString(EDataType eDataType, String initialValue) {
		HostNetworkProtocol result = HostNetworkProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostNetworkProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterDASVmSettingsRestartPriority createClusterDASVmSettingsRestartPriorityFromString(EDataType eDataType, String initialValue) {
		ClusterDASVmSettingsRestartPriority result = ClusterDASVmSettingsRestartPriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterDASVmSettingsRestartPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterDASVmSettingsIsolationResponse createClusterDASVmSettingsIsolationResponseFromString(EDataType eDataType, String initialValue) {
		ClusterDASVmSettingsIsolationResponse result = ClusterDASVmSettingsIsolationResponse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterDASVmSettingsIsolationResponseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrsBehavior createDrsBehaviorFromString(EDataType eDataType, String initialValue) {
		DrsBehavior result = DrsBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrsBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpmBehavior createDpmBehaviorFromString(EDataType eDataType, String initialValue) {
		DpmBehavior result = DpmBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDpmBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastoreHostMountMode createDatastoreHostMountModeFromString(EDataType eDataType, String initialValue) {
		DatastoreHostMountMode result = DatastoreHostMountMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatastoreHostMountModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NicPolicyTeamingValue createNicPolicyTeamingValueFromString(EDataType eDataType, String initialValue) {
		NicPolicyTeamingValue result = NicPolicyTeamingValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNicPolicyTeamingValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortGroupConnecteeType createPortGroupConnecteeTypeFromString(EDataType eDataType, String initialValue) {
		PortGroupConnecteeType result = PortGroupConnecteeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortGroupConnecteeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkChangeOperation createNetworkChangeOperationFromString(EDataType eDataType, String initialValue) {
		NetworkChangeOperation result = NetworkChangeOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkChangeOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkBootProtocolType createNetworkBootProtocolTypeFromString(EDataType eDataType, String initialValue) {
		NetworkBootProtocolType result = NetworkBootProtocolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkBootProtocolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmForkConfigInfoChildType createVmForkConfigInfoChildTypeFromString(EDataType eDataType, String initialValue) {
		VmForkConfigInfoChildType result = VmForkConfigInfoChildType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmForkConfigInfoChildTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFaultToleranceType createVmFaultToleranceTypeFromString(EDataType eDataType, String initialValue) {
		VmFaultToleranceType result = VmFaultToleranceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmFaultToleranceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencySensitivityLevel createLatencySensitivityLevelFromString(EDataType eDataType, String initialValue) {
		LatencySensitivityLevel result = LatencySensitivityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatencySensitivityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterDasConfigInfoHBDatastoreCandidate createClusterDasConfigInfoHBDatastoreCandidateFromString(EDataType eDataType, String initialValue) {
		ClusterDasConfigInfoHBDatastoreCandidate result = ClusterDasConfigInfoHBDatastoreCandidate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterDasConfigInfoHBDatastoreCandidateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterDasConfigInfoVmMonitoringState createClusterDasConfigInfoVmMonitoringStateFromString(EDataType eDataType, String initialValue) {
		ClusterDasConfigInfoVmMonitoringState result = ClusterDasConfigInfoVmMonitoringState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterDasConfigInfoVmMonitoringStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterDasConfigInfoServiceState createClusterDasConfigInfoServiceStateFromString(EDataType eDataType, String initialValue) {
		ClusterDasConfigInfoServiceState result = ClusterDasConfigInfoServiceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterDasConfigInfoServiceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostFileSystemVolumeFileType createHostFileSystemVolumeFileTypeFromString(EDataType eDataType, String initialValue) {
		HostFileSystemVolumeFileType result = HostFileSystemVolumeFileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostFileSystemVolumeFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastoreMaintenanceModeState createDatastoreMaintenanceModeStateFromString(EDataType eDataType, String initialValue) {
		DatastoreMaintenanceModeState result = DatastoreMaintenanceModeState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatastoreMaintenanceModeStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostNasVolumeSecurityType createHostNasVolumeSecurityTypeFromString(EDataType eDataType, String initialValue) {
		HostNasVolumeSecurityType result = HostNasVolumeSecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostNasVolumeSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualDeviceConnectStatus createVirtualDeviceConnectStatusFromString(EDataType eDataType, String initialValue) {
		VirtualDeviceConnectStatus result = VirtualDeviceConnectStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualDeviceConnectStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostCapabilityFtUnsupportedReason createHostCapabilityFtUnsupportedReasonFromString(EDataType eDataType, String initialValue) {
		HostCapabilityFtUnsupportedReason result = HostCapabilityFtUnsupportedReason.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostCapabilityFtUnsupportedReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLongNumberFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDatetypeFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createShortNumberFromString(EDataType eDataType, String initialValue) {
		return (Short)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createByteTypeFromString(EDataType eDataType, String initialValue) {
		return (Byte)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwarePackage getVmwarePackage() {
		return (VmwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmwarePackage getPackage() {
		return VmwarePackage.eINSTANCE;
	}

} //VmwareFactoryImpl
