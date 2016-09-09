// Generated at Fri Sep 09 11:14:21 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'vmware'
//
// ======================================================================

module vmware

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core
open infrastructure

// ======================================================================
//
// OCCI extension 'vmware'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "vmware"
    scheme = "http://occiware.org/occi/vmware#"
    import = core/extension + infrastructure/extension
    kinds = datastore + cluster + datacenter + hostsystem + vm + folderlink + resourcepoollink + clusterlink + resourcepool + datacenterlink + hostsystemlink + datastorelink + virtualdisk + vswitch + portgroup + virtualnetworkadapter + virtualdisknetwork + virtualdisknetworklink + hostnetworkadapter + dvswitch + snapshot + snapshotlink + folder + hostfolder + vcentercapability + hostfirewallsystem + hostfirewallruleset + hostfirewallrule + hoststorage + hoststoragelink + vmfolder + serviceconsolenic + portgrouplink + hostnatrule + hostnatportforwardlink + distributedportgroup + virtualcdrom + virtualfloppy + virtualdisklink
    mixins = linux + windows + macosx + small + medium + large + xlarge + ssh_authentication + bootoptions + cpuaffinity + shares + dvsfeaturecapability + consolepreference + defaultpoweroptions + vmflags + networkshaper + npivconfig + cpufeaturemask + extraconfig + vmfileconfig + guestconfig + toolsconfig + hostserviceticket + sharesconfig + vmcapability + resourcepoolallocation + resourcepoolquickstats + hosthardwareinfo + hostaboutinfo + hosthealth + hostconfig + activediagnosticpartition + defaultautostartconfigvm + hostnetworkcapability + autostartpowerinfo + hostmemoryreservation + hostdatastorecapability + hostdatetimeinfo + hostntpconfig + hosttimezone + hostflaginfo + hosthyperthreadscheduler + hostsystemvolumemounted + hostfilesystemvolumeinfo + hostpcidevices + clusteractionhistory + clusterdrsrecommandations + clusterresourcesinfo + clusterdasconfig + clusterdefaultdasvmconfig + dasvmsettings + clusterhostdpmconfig + clusterdrsconfig + hostdpmconfig + drsVmConfig + clusterrule + hostconnectconfig + clusterdrsmigrationhistory + clusterrecommandations + datastorecapability + datastorehostmountinfo + datastoreinfo + datastoresummary + datastorehostnasvolumeconfig + datastoreuserprincipalauth + datastorehostvmfsvolumeconfig + datastorehostlocalvolumeconfig + vmconfig + networkpolicy + nicfailurecriteria + nicorderpolicy + nicteamingpolicy + offloadpolicy + networksecuritypolicy + trafficshapingpolicy + portgroupports + micro + vswitchautobridge + vswitchsimplebridge + vswitchbondbridge + hostdnsconfig + hostnetworkconfig + hostiprouteconfig + hostconsoleiprouteconfig + hostnatservicenameconfig + hostnetoffloadcapabilities + validlinkspecification + currentlinkstate + physicallinkconfig + vmforkconfig + faulttoleranceconfig + latencysensitivity + failoverhost + clusterdasadmissionctrlpolicy + failoverlevel + failoverresources + clusterdasvmtoolsmonitoringsettings + dasvmtoolsmonitoringsettings + datastoreconfig + datastorehostvvolvolumeconfig + virtualdiskgeometry + virtualdeviceconnectinfo + hoststoragecapability + hostnetworkcapabilityextent + hostvmotioncapability + hostsnapshotcapability + hostcapabilityhardware + hostsystemcapability + hostvmcapability + hostothercapability
    types = LongNumber_DataType + SharesLevel_DataType + DvsNicTeamingPolicy_DataType + Bootdevice_DataType + ResourceAllocationType_DataType + ResourcePoolState_DataType + Datetype_DataType + PowerOffType_DataType + GuestFirmwareType_DataType + VmHtSharing_DataType + VmMonitorType_DataType + VmPowerOffBehavior_DataType + VmExecUsage_DataType + VmMMUusage_DataType + ShortNumber_DataType + NpivWwnType_DataType + VmSwapPlacementType_DataType + GuestOsIdentifiers_DataType + ToolsUpgradePolicy_DataType + OverallStatus_DataType + HostConnectionState_DataType + DiagnosticPartitionType_DataType + AutoStartWaitHeartbeatSetting_DataType + HostFirewallRuleDirection_DataType + HostNetworkProtocol_DataType + ByteType_DataType + ClusterDASVmSettingsRestartPriority_DataType + ClusterDASVmSettingsIsolationResponse_DataType + DrsBehavior_DataType + DpmBehavior_DataType + DatastoreHostMountMode_DataType + NicPolicyTeamingValue_DataType + PortGroupConnecteeType_DataType + NetworkChangeOperation_DataType + NetworkBootProtocolType_DataType + VmForkConfigInfoChildType_DataType + VmFaultToleranceType_DataType + LatencySensitivityLevel_DataType + ClusterDasConfigInfoHBDatastoreCandidate_DataType + ClusterDasConfigInfoVmMonitoringState_DataType + ClusterDasConfigInfoServiceState_DataType + HostFileSystemVolumeFileType_DataType + DatastoreMaintenanceModeState_DataType + HostNasVolumeSecurityType_DataType + VirtualDeviceConnectStatus_DataType + HostCapabilityFtUnsupportedReason_DataType
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datastore'
//
// ======================================================================

one sig datastore extends Kind {} {
    term = "datastore"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Datastores are logical containers, analogous to file systems, that hide specifics of each storage device and provide a uniform model for storing virtual machine files. Datastores can also be used for storing ISO images, virtual machine templates, and floppy images."
    parent = core/resource
    attributes = datastore_name
    actions = datastore_enterMaintenanceMode
    entities in Datastore
}

//
// OCCI attribute 'name'
//
one sig datastore_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the datastore, if changed and occiUpdate call, rename datastore must be called."
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/datastore/action#enterMaintenanceMode'
//
one sig datastore_enterMaintenanceMode extends Action {} {
    term = "enterMaintenanceMode"
    scheme = "http://occiware.org/occi/vmware/datastore/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Datastore
// ======================================================================

sig Datastore extends core/Resource {
    name : one String,
} {
    hasKind[datastore]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#cluster'
//
// ======================================================================

one sig cluster extends Kind {} {
    term = "cluster"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Represents a cluster of HostSystem objects as a unified compute resource for virtual machines."
    parent = folder
    no attributes
    actions = cluster_addAllHostSystem + cluster_applyRecommendation + cluster_enterMaintenanceMode
    entities in Cluster
}

//
// OCCI action 'http://occiware.org/occi/vmware/cluster/action#addAllHostSystem'
//
one sig cluster_addAllHostSystem extends Action {} {
    term = "addAllHostSystem"
    scheme = "http://occiware.org/occi/vmware/cluster/action#"
    title = "Add all hostsystem linked to this cluster and not already added on this cluster, if hostsystem are not connectable, the host will not be added"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/cluster/action#applyRecommendation'
//
one sig cluster_applyRecommendation extends Action {} {
    term = "applyRecommendation"
    scheme = "http://occiware.org/occi/vmware/cluster/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/cluster/action#enterMaintenanceMode'
//
one sig cluster_enterMaintenanceMode extends Action {} {
    term = "enterMaintenanceMode"
    scheme = "http://occiware.org/occi/vmware/cluster/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Cluster
// ======================================================================

sig Cluster extends Folder {
} {
    hasKind[cluster]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datacenter'
//
// ======================================================================

one sig datacenter extends Kind {} {
    term = "datacenter"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The interface to the common container object for hosts and virtual machines. Every host and virtual machine must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters."
    parent = folder
    attributes = datacenter_defaultHardwareVersionKey
    actions = datacenter_powerOnMultiVMs + datacenter_discoverAll
    entities in Datacenter
}

//
// OCCI attribute 'defaultHardwareVersionKey'
//
one sig datacenter_defaultHardwareVersionKey extends Attribute {} {
    name = "defaultHardwareVersionKey"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Key for Default Hardware Version to be used on this datacenter in the format of key. Setting this field affects defaultConfigOption returned by environmentBrowser of all its children with this field unset. See ReconfigureDatacenter_Task"
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/datacenter/action#powerOnMultiVMs'
//
one sig datacenter_powerOnMultiVMs extends Action {} {
    term = "powerOnMultiVMs"
    scheme = "http://occiware.org/occi/vmware/datacenter/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/datacenter/action#discoverAll'
//
one sig datacenter_discoverAll extends Action {} {
    term = "discoverAll"
    scheme = "http://occiware.org/occi/vmware/datacenter/action#"
    title = "This action create or synchronize all the infrastructure elements detected on VMware in Cloud designer diagram, but does nothing on VMware. This make take some times to synchronize if there is a lot of elements"
    no attributes
}


// ======================================================================
// Signature for Datacenter
// ======================================================================

sig Datacenter extends Folder {
    defaultHardwareVersionKey : lone String,
} {
    hasKind[datacenter]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostsystem'
//
// ======================================================================

one sig hostsystem extends Kind {} {
    term = "hostsystem"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = infrastructure/compute
    attributes = hostsystem_name + hostsystem_clusterSupported + hostsystem_inDasCluster + hostsystem_serverip + hostsystem_vimAccountNameRequired + hostsystem_agentVmDatastoreName + hostsystem_agentVmNetworkName + hostsystem_port + hostsystem_faultToleranceEnabled + hostsystem_hostFeatureVersionKeys + hostsystem_hostFeatureVersionValues + hostsystem_vmotionEnabled + hostsystem_currentEVCModeKey + hostsystem_customValues + hostsystem_managementServerip + hostsystem_maxEVCKey + hostsystem_overallStatus + hostsystem_distributedCPUFairness + hostsystem_distributedMemoryFairness + hostsystem_overallCPUUsage + hostsystem_overallMemoryUsage + hostsystem_rebootRequired + hostsystem_bootTime + hostsystem_connectionState + hostsystem_inMaintenanceMode
    actions = hostsystem_disconnectHost + hostsystem_enterlLockDownMode + hostsystem_enterMaintenanceMode + hostsystem_exitLockDownMode + hostsystem_exitMaintenanceMode + hostsystem_reconfigureHostForDAS + hostsystem_reconnectHost
    entities in Hostsystem
}

//
// OCCI attribute 'name'
//
one sig hostsystem_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'clusterSupported'
//
one sig hostsystem_clusterSupported extends Attribute {} {
    name = "clusterSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Whether or not the host supports clustering capabilities such as HA or DRS and therefore can be added to a cluster. If false, the host must be added as a standalone host.
    See HostConnectInfo"
    multiple_values = False
}

//
// OCCI attribute 'inDasCluster'
//
one sig hostsystem_inDasCluster extends Attribute {} {
    name = "inDasCluster"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "If the host is already being managed by a vCenter Server, this property reports true if the host is also part of a vSphere HA enabled cluster. If this is the case, remove or disconnect the host from this cluster before adding it to another vCenter Server."
    multiple_values = False
}

//
// OCCI attribute 'serverip'
//
one sig hostsystem_serverip extends Attribute {} {
    name = "serverip"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The IP address of the VirtualCenter already managing this host, if any."
    multiple_values = False
}

//
// OCCI attribute 'vimAccountNameRequired'
//
one sig hostsystem_vimAccountNameRequired extends Attribute {} {
    name = "vimAccountNameRequired"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Whether or not the host requires a vimAccountName and password to be set in the ConnectSpec. This is normally only required for VMware Server hosts. "
    multiple_values = False
}

//
// OCCI attribute 'agentVmDatastoreName'
//
one sig hostsystem_agentVmDatastoreName extends Attribute {} {
    name = "agentVmDatastoreName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Datastore used to deploy Agent VMs on for this host."
    multiple_values = False
}

//
// OCCI attribute 'agentVmNetworkName'
//
one sig hostsystem_agentVmNetworkName extends Attribute {} {
    name = "agentVmNetworkName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Management network for Agent VMs."
    multiple_values = False
}

//
// OCCI attribute 'port'
//
one sig hostsystem_port extends Attribute {} {
    name = "port"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The port number. "
    multiple_values = False
}

//
// OCCI attribute 'faultToleranceEnabled'
//
one sig hostsystem_faultToleranceEnabled extends Attribute {} {
    name = "faultToleranceEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not Fault Tolerance logging is enabled on this host."
    multiple_values = False
}

//
// OCCI attribute 'hostFeatureVersionKeys'
//
one sig hostsystem_hostFeatureVersionKeys extends Attribute {} {
    name = "hostFeatureVersionKeys"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = True
}

//
// OCCI attribute 'hostFeatureVersionValues'
//
one sig hostsystem_hostFeatureVersionValues extends Attribute {} {
    name = "hostFeatureVersionValues"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = True
}

//
// OCCI attribute 'vmotionEnabled'
//
one sig hostsystem_vmotionEnabled extends Attribute {} {
    name = "vmotionEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not VMotion is enabled on this host. "
    multiple_values = False
}

//
// OCCI attribute 'currentEVCModeKey'
//
one sig hostsystem_currentEVCModeKey extends Attribute {} {
    name = "currentEVCModeKey"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The Enhanced VMotion Compatibility mode that is currently in effect for this host. If the host is in a cluster where EVC is active, this will match the cluster's EVC mode; otherwise this will be unset."
    multiple_values = False
}

//
// OCCI attribute 'customValues'
//
one sig hostsystem_customValues extends Attribute {} {
    name = "customValues"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The customized field values. "
    multiple_values = True
}

//
// OCCI attribute 'managementServerip'
//
one sig hostsystem_managementServerip extends Attribute {} {
    name = "managementServerip"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "IP address of the VirtualCenter server managing this host, if any."
    multiple_values = False
}

//
// OCCI attribute 'maxEVCKey'
//
one sig hostsystem_maxEVCKey extends Attribute {} {
    name = "maxEVCKey"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The most capable Enhanced VMotion Compatibility mode supported by the host hardware and software; unset if this host cannot participate in any EVC mode.
    See supportedEVCMode"
    multiple_values = False
}

//
// OCCI attribute 'overallStatus'
//
one sig hostsystem_overallStatus extends Attribute {} {
    name = "overallStatus"
    type = OverallStatus_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'distributedCPUFairness'
//
one sig hostsystem_distributedCPUFairness extends Attribute {} {
    name = "distributedCPUFairness"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The fairness of distributed CPU resource allocation on the host. "
    multiple_values = False
}

//
// OCCI attribute 'distributedMemoryFairness'
//
one sig hostsystem_distributedMemoryFairness extends Attribute {} {
    name = "distributedMemoryFairness"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The fairness of distributed memory resource allocation on the host. "
    multiple_values = False
}

//
// OCCI attribute 'overallCPUUsage'
//
one sig hostsystem_overallCPUUsage extends Attribute {} {
    name = "overallCPUUsage"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Aggregated CPU usage across all cores on the host in MHz. This is only available if the host is connected. "
    multiple_values = False
}

//
// OCCI attribute 'overallMemoryUsage'
//
one sig hostsystem_overallMemoryUsage extends Attribute {} {
    name = "overallMemoryUsage"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Physical memory usage on the host in MB. This is only available if the host is connected. "
    multiple_values = False
}

//
// OCCI attribute 'rebootRequired'
//
one sig hostsystem_rebootRequired extends Attribute {} {
    name = "rebootRequired"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not the host requires a reboot due to a configuration change."
    multiple_values = False
}

//
// OCCI attribute 'bootTime'
//
one sig hostsystem_bootTime extends Attribute {} {
    name = "bootTime"
    type = Datetype_DataType
    mutable = True
    required = False
    no default
    description = "The time when the host was booted. "
    multiple_values = False
}

//
// OCCI attribute 'connectionState'
//
one sig hostsystem_connectionState extends Attribute {} {
    name = "connectionState"
    type = HostConnectionState_DataType
    mutable = False
    required = False
    no default
    description = "The host connection state. See the decription in the enums for the ConnectionState data object type. "
    multiple_values = False
}

//
// OCCI attribute 'inMaintenanceMode'
//
one sig hostsystem_inMaintenanceMode extends Attribute {} {
    name = "inMaintenanceMode"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not the host is in maintenance mode. This flag is set when the host has entered the maintenance mode. It is not set during the entering phase of maintenance mode.
    See EnterMaintenanceMode_Task
    See ExitMaintenanceMode_Task"
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#disconnectHost'
//
one sig hostsystem_disconnectHost extends Action {} {
    term = "disconnectHost"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "Disconnects from a host and instructs the server to stop sending heartbeats."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#enterlLockDownMode'
//
one sig hostsystem_enterlLockDownMode extends Action {} {
    term = "enterlLockDownMode"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "Modifies the permissions on the host, so that it will only be accessible through local console or an authorized centralized management application. Any user defined permissions found on the host are lost.Access via a VI client connected to the host is blocked. Access though other services running on the host is also blocked.If the operation is successful, adminDisabled will be set to true. This API is not supported on the host, If invoked directly on a host, a NotSupported fault will be thrown."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#enterMaintenanceMode'
//
one sig hostsystem_enterMaintenanceMode extends Action {} {
    term = "enterMaintenanceMode"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "Puts the host in maintenance mode. While this task is running and when the host is in maintenance mode, no virtual machines can be powered on and no provisioning operations can be performed on the host. Once the call completes, it is safe to turn off a host without disrupting any virtual machines"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#exitLockDownMode'
//
one sig hostsystem_exitLockDownMode extends Action {} {
    term = "exitLockDownMode"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "Restores Administrator permission for the local administrative account for the host that was removed by prior call to EnterLockdownMode. If the operation is successful, adminDisabled will be set to false. This API is not supported on the host. If invoked directly on a host, a NotSupported fault will be thrown."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#exitMaintenanceMode'
//
one sig hostsystem_exitMaintenanceMode extends Action {} {
    term = "exitMaintenanceMode"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "Takes the host out of maintenance mode. This blocks if any concurrent running maintenance-only host configurations operations are being performed. For example, if VMFS volumes are being upgraded."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#reconfigureHostForDAS'
//
one sig hostsystem_reconfigureHostForDAS extends Action {} {
    term = "reconfigureHostForDAS"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "reconfigures the host for the VMware High Availability (HA) cluster. If the host is part of an HA cluster, this operation reconfigures the host for HA. For example, this operation may be used if a host is added to an HA-enabled cluster and the automatic HA configuration system task fails. Automatic HA configuration may fail for a variety of rea- sons. For example, the host may be configured incorrectly"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostsystem/action#reconnectHost'
//
one sig hostsystem_reconnectHost extends Action {} {
    term = "reconnectHost"
    scheme = "http://occiware.org/occi/vmware/hostsystem/action#"
    title = "reconnects to a host. This method is supported only in VirtualCenter"
    no attributes
}


// ======================================================================
// Signature for Hostsystem
// ======================================================================

sig Hostsystem extends infrastructure/Compute {
    name : lone String,
    clusterSupported : lone core/Boolean,
    inDasCluster : lone core/Boolean,
    serverip : lone String,
    vimAccountNameRequired : lone core/Boolean,
    agentVmDatastoreName : lone String,
    agentVmNetworkName : lone String,
    port : lone String,
    faultToleranceEnabled : lone core/Boolean,
    hostFeatureVersionKeys : lone String,
    hostFeatureVersionValues : lone String,
    vmotionEnabled : lone core/Boolean,
    currentEVCModeKey : lone String,
    customValues : lone core/Number,
    managementServerip : lone String,
    maxEVCKey : lone String,
    overallStatus : lone OverallStatus,
    distributedCPUFairness : lone core/Number,
    distributedMemoryFairness : lone core/Number,
    overallCPUUsage : lone core/Number,
    overallMemoryUsage : lone core/Number,
    rebootRequired : lone core/Boolean,
    bootTime : lone Datetype,
    connectionState : lone HostConnectionState,
    inMaintenanceMode : lone core/Boolean,
} {
    hasKind[hostsystem]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vm'
//
// ======================================================================

one sig vm extends Kind {} {
    term = "vm"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Virtual machine compute on a host system"
    parent = infrastructure/compute
    attributes = vm_name + vm_instanceUUID + vm_template + vm_vcpus + vm_coresPerSocket + vm_guestState + vm_vmwareToolsInstalled + vm_vmwareToolsRunning + vm_guestFullName + vm_cpuhotAddEnabled + vm_cpuHotRemoveEnabled + vm_annotation + vm_vmwarePowerState + vm_overallStatus
    actions = vm_cloneVM + vm_mountVmwareToolsdisk + vm_markAsTemplate + vm_markAsVirtualMachine + vm_registerVM + vm_unregisterVM + vm_defragmentAllDisks + vm_resetLocationId
    entities in Vm
}

//
// OCCI attribute 'name'
//
one sig vm_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Display name of the virtual machine. Any % (percent) character used in this name parameter must be escaped, unless it is used to start an escape sequence.
    Clients may also escape any other characters in this name parameter. 
    Snapshots of virtual machines that have spaces in their names and are associated with ESX 2.x servers are not supported. Therefore, if you want the option to take snapshots of this virtual machine and you are associating it with an ESX 2.x server, do not use spaces in the name.
    Reconfigure privilege: VirtualMachine.Config.Rename"
    multiple_values = False
}

//
// OCCI attribute 'instanceUUID'
//
one sig vm_instanceUUID extends Attribute {} {
    name = "instanceUUID"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "VirtualCenter-specific 128-bit UUID of a virtual machine, represented as a hexademical string. This identifier is used by VirtualCenter to uniquely identify all virtual machine instances, including those that may share the same SMBIOS UUID."
    multiple_values = False
}

//
// OCCI attribute 'template'
//
one sig vm_template extends Attribute {} {
    name = "template"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "If true, this virtual machine is set as a template machine and may be used as an image"
    multiple_values = False
}

//
// OCCI attribute 'vcpus'
//
one sig vm_vcpus extends Attribute {} {
    name = "vcpus"
    type = core/Number_DataType
    mutable = True
    required = True
    default = "1"
    description = "Number of virtual cpus
    Reconfigure privilege: VirtualMachine.Config.CpuCount "
    multiple_values = False
}

//
// OCCI attribute 'coresPerSocket'
//
one sig vm_coresPerSocket extends Attribute {} {
    name = "coresPerSocket"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "1"
    description = "Number of cores per socket"
    multiple_values = False
}

//
// OCCI attribute 'guestState'
//
one sig vm_guestState extends Attribute {} {
    name = "guestState"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "if vmware tools is installed this value show the state of the operating system"
    multiple_values = False
}

//
// OCCI attribute 'vmwareToolsInstalled'
//
one sig vm_vmwareToolsInstalled extends Attribute {} {
    name = "vmwareToolsInstalled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "Is vmware tools installed on this virtual machine"
    multiple_values = False
}

//
// OCCI attribute 'vmwareToolsRunning'
//
one sig vm_vmwareToolsRunning extends Attribute {} {
    name = "vmwareToolsRunning"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "is vmware tools running on this virtual machine"
    multiple_values = False
}

//
// OCCI attribute 'guestFullName'
//
one sig vm_guestFullName extends Attribute {} {
    name = "guestFullName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "This is the full name of the guest operating system for the virtual machine. For example: Windows 2000 Professional."
    multiple_values = False
}

//
// OCCI attribute 'cpuhotAddEnabled'
//
one sig vm_cpuhotAddEnabled extends Attribute {} {
    name = "cpuhotAddEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "true"
    description = "Whether virtual processors can be added while this virtual machine is running.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'cpuHotRemoveEnabled'
//
one sig vm_cpuHotRemoveEnabled extends Attribute {} {
    name = "cpuHotRemoveEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "true"
    description = "Whether virtual processors can be removed while this virtual machine is running.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'annotation'
//
one sig vm_annotation extends Attribute {} {
    name = "annotation"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "User-provided description of the virtual machine. Because this property is optional in the virtual machine configuration, it is necessary to pass an explicit empty string in a ConfigSpec object to remove an annotation that is already present in the VirtualMachineConfigInfo for a virtual machine.
    Reconfigure privilege: VirtualMachine.Config.Rename "
    multiple_values = False
}

//
// OCCI attribute 'vmwarePowerState'
//
one sig vm_vmwarePowerState extends Attribute {} {
    name = "vmwarePowerState"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'overallStatus'
//
one sig vm_overallStatus extends Attribute {} {
    name = "overallStatus"
    type = OverallStatus_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#cloneVM'
//
one sig vm_cloneVM extends Action {} {
    term = "cloneVM"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Clone a virtual machine"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#mountVmwareToolsdisk'
//
one sig vm_mountVmwareToolsdisk extends Action {} {
    term = "mountVmwareToolsdisk"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Mount vmware tools iso"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#markAsTemplate'
//
one sig vm_markAsTemplate extends Action {} {
    term = "markAsTemplate"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Mark this virtual machine as a template image"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#markAsVirtualMachine'
//
one sig vm_markAsVirtualMachine extends Action {} {
    term = "markAsVirtualMachine"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Mark this template image as a virtual machine"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#registerVM'
//
one sig vm_registerVM extends Action {} {
    term = "registerVM"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Register this virtual machine on vcenter"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#unregisterVM'
//
one sig vm_unregisterVM extends Action {} {
    term = "unregisterVM"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Unregister this virtual machine from vcenter"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#defragmentAllDisks'
//
one sig vm_defragmentAllDisks extends Action {} {
    term = "defragmentAllDisks"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "Defragment all virtual disk on this virtual machine"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/vm/action#resetLocationId'
//
one sig vm_resetLocationId extends Action {} {
    term = "resetLocationId"
    scheme = "http://occiware.org/occi/vmware/vm/action#"
    title = "128-bit hash based on the virtual machine's configuration file location and the UUID of the host assigned to run the virtual machine.Normally, this property is not set by a client, allowing the Virtual Infrastructure environment to assign a location ID when the virtual machine is created. However, if the virtual machine's configuration file has been manually moved, it may be desirable to clear this property, setting it to an empty string, so the property is regenerated.Reconfigure privilege: VirtualMachine.Config.Settings"
    no attributes
}


// ======================================================================
// Signature for Vm
// ======================================================================

sig Vm extends infrastructure/Compute {
    name : one String,
    instanceUUID : lone String,
    template : lone core/Boolean,
    vcpus : one core/Number,
    coresPerSocket : lone core/Number,
    guestState : lone String,
    vmwareToolsInstalled : lone core/Boolean,
    vmwareToolsRunning : lone core/Boolean,
    guestFullName : lone String,
    cpuhotAddEnabled : lone core/Boolean,
    cpuHotRemoveEnabled : lone core/Boolean,
    annotation : lone String,
    vmwarePowerState : lone String,
    overallStatus : lone OverallStatus,
} {
    hasKind[vm]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#folderlink'
//
// ======================================================================

one sig folderlink extends Kind {} {
    term = "folderlink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a link hierarchy folder between datacenter and cluster or between datacenter and virtual machines (vmFolder) or between datacenter and hostsystems"
    parent = core/link
    no attributes
    no actions
    entities in Folderlink
}

// ======================================================================
// Signature for Folderlink
// ======================================================================

sig Folderlink extends core/Link {
} {
    hasKind[folderlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#resourcepoollink'
//
// ======================================================================

one sig resourcepoollink extends Kind {} {
    term = "resourcepoollink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a link between cluster (or host) and virtual machine with resource pool definition, this link may link other resource pools between them to define child dependencies, it may be used too for resourcepoolquickstats informations"
    parent = core/link
    no attributes
    no actions
    entities in Resourcepoollink
}

// ======================================================================
// Signature for Resourcepoollink
// ======================================================================

sig Resourcepoollink extends core/Link {
} {
    hasKind[resourcepoollink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#clusterlink'
//
// ======================================================================

one sig clusterlink extends Kind {} {
    term = "clusterlink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Link between cluster and hostsystem"
    parent = folderlink
    no attributes
    no actions
    entities in Clusterlink
}

// ======================================================================
// Signature for Clusterlink
// ======================================================================

sig Clusterlink extends Folderlink {
} {
    hasKind[clusterlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#resourcepool'
//
// ======================================================================

one sig resourcepool extends Kind {} {
    term = "resourcepool"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A resource pool linked between a compute host (or a cluster) and a virtual machine, usage attributes part are for runtime information only"
    parent = core/resource
    attributes = resourcepool_name + resourcepool_expandablereservation + resourcepool_limit + resourcepool_reservation + resourcepool_state
    no actions
    entities in Resourcepool
}

//
// OCCI attribute 'name'
//
one sig resourcepool_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'expandablereservation'
//
one sig resourcepool_expandablereservation extends Attribute {} {
    name = "expandablereservation"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "In a resource pool with an expandable reservation, the reservation on a resource pool can grow beyond the specified value, if the parent resource pool has unreserved resources. A non-expandable reservation is called a fixed reservation. This property is ignored for virtual machines. "
    multiple_values = False
}

//
// OCCI attribute 'limit'
//
one sig resourcepool_limit extends Attribute {} {
    name = "limit"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The utilization of a virtual machine/resource pool will not exceed this limit, even if there are available resources. This is typically used to ensure a consistent performance of virtual machines / resource pools independent of available resources. If set to -1, then there is no fixed limit on resource usage (only bounded by available resources and shares). Units are MB for memory, MHz for CPU. "
    multiple_values = False
}

//
// OCCI attribute 'reservation'
//
one sig resourcepool_reservation extends Attribute {} {
    name = "reservation"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Amount of resource that is guaranteed available to the virtual machine or resource pool. Reserved resources are not wasted if they are not used. If the utilization is less than the reservation, the resources can be utilized by other running virtual machines. Units are MB for memory, MHz for CPU."
    multiple_values = False
}

//
// OCCI attribute 'state'
//
one sig resourcepool_state extends Attribute {} {
    name = "state"
    type = ResourcePoolState_DataType
    mutable = True
    required = False
    default = "unknown"
    description = "unknown: The status is unknown. 
    undercommitted: resource pool is in a good state. 
    inconsistent: One or more nodes in the tree has children whose reservations are greater than the node is configured to support. For example, i) a resource pool with a fixed reservation has a running virtual machine with a reservation that is higher than the reservation on resource pool itself., or ii) the child reservations are greater than the limit.
    In this state, the DRS algorithm is disabled until the resource pool tree's configuration has been brought back into a consistent state. We also restrict the resources that such invalid nodes request from their parents to the configured reservation/limit, in an attempt to isolate the problem to a small subtree. For the rest of the tree, we determine whether the cluster is undercommitted or overcommitted according to the existing rules and perform admission control accordingly.
    
    Note that since all changes to the resource settings are validated on the VirtualCenter server, the system cannot be brought into this state by simply manipulating a cluster resource pool tree through VirtualCenter. It can only happen if a virtual machine gets powered on directly on a host that is part of a DRS cluster.
    overcommitted: In this state, the tree is consistent internally, but the root resource pool does not have the capacity at to meet the reservation of its children. We can only go from GREEN -> YELLOW if we lose resources at the root. For example, hosts becomes unavailable or is put into maintenance mode. Note that we will always have enough capacity at the root to run all currently powered on VMs. However, we may not be able to satisfy all resource pool reservations in the tree. In this state, the reservation configured for a resource pool is no longer guaranteed, but the limits are still enforced. This provides additional flexibility for bringing the tree back into a consistent state, without risking bringing the tree into a RED state. In more detail:
    Resource Pool The root is considered to have unlimited capacity. You can reserve resources without any check except the requirement that the tree remains consistent. This means that nodes whose parents are all configured with expandable reservations and no limit will have unlimited available resources. However, if there is an ancestor with a fixed reservation or an expandable reservation with a limit somewhere, then the node will be limited by the reservation/limit of the ancestor.
    Virtual Machine Virtual machines are limited by ancestors with a fixed reservation and the capacity at the root. 
    yellow: The entity might have a problem."
    multiple_values = False
}

// ======================================================================
// Signature for Resourcepool
// ======================================================================

sig Resourcepool extends core/Resource {
    name : lone String,
    expandablereservation : lone core/Boolean,
    limit : lone LongNumber,
    reservation : lone LongNumber,
    state : lone ResourcePoolState,
} {
    hasKind[resourcepool]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datacenterlink'
//
// ======================================================================

one sig datacenterlink extends Kind {} {
    term = "datacenterlink"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = folderlink
    no attributes
    no actions
    entities in Datacenterlink
}

// ======================================================================
// Signature for Datacenterlink
// ======================================================================

sig Datacenterlink extends Folderlink {
} {
    hasKind[datacenterlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostsystemlink'
//
// ======================================================================

one sig hostsystemlink extends Kind {} {
    term = "hostsystemlink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a link between a hostsystem and a virtual machine"
    parent = folderlink
    no attributes
    no actions
    entities in Hostsystemlink
}

// ======================================================================
// Signature for Hostsystemlink
// ======================================================================

sig Hostsystemlink extends Folderlink {
} {
    hasKind[hostsystemlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datastorelink'
//
// ======================================================================

one sig datastorelink extends Kind {} {
    term = "datastorelink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a link between a datacenter and a datastore"
    parent = core/link
    no attributes
    no actions
    entities in Datastorelink
}

// ======================================================================
// Signature for Datastorelink
// ======================================================================

sig Datastorelink extends core/Link {
} {
    hasKind[datastorelink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisk'
//
// ======================================================================

one sig virtualdisk extends Kind {} {
    term = "virtualdisk"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A virtual disk"
    parent = infrastructure/storage
    attributes = virtualdisk_volumeName
    actions = virtualdisk_zeroFill + virtualdisk_shrink
    entities in Virtualdisk
}

//
// OCCI attribute 'volumeName'
//
one sig virtualdisk_volumeName extends Attribute {} {
    name = "volumeName"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/virtualdisk/action#zeroFill'
//
one sig virtualdisk_zeroFill extends Action {} {
    term = "zeroFill"
    scheme = "http://occiware.org/occi/vmware/virtualdisk/action#"
    title = "Overwrite all blocks of the virtual disk with zeros. All data will be lost.
    The datacenter parameter may be omitted if a URL is used to name the disk.
    
    Requires Datastore.FileManagement privilege on the datastore where the virtual disk resides."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/virtualdisk/action#shrink'
//
one sig virtualdisk_shrink extends Action {} {
    term = "shrink"
    scheme = "http://occiware.org/occi/vmware/virtualdisk/action#"
    title = "Shrink a sparse virtual disk.
    The datacenter parameter may be omitted if a URL is used to name the disk.
    
    The optional parameter copy specifies whether to shrink the disk in copy-shrink mode or in-place mode. In copy-shrink mode, additional space is required, but will result in a shrunk disk that is also defragmented. In-place shrink does not require additional space, but will increase fragmentation. The default behavior is to perform copy-shrink if the parameter is not specified.
    
    Requires Datastore.FileManagement privilege on the datastore where the virtual disk resides."
    no attributes
}


// ======================================================================
// Signature for Virtualdisk
// ======================================================================

sig Virtualdisk extends infrastructure/Storage {
    volumeName : one String,
} {
    hasKind[virtualdisk]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vswitch'
//
// ======================================================================

one sig vswitch extends Kind {} {
    term = "vswitch"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a virtual switch for linking virtual network adapter to a hostsystem network"
    parent = infrastructure/network
    attributes = vswitch_name + vswitch_nbport + vswitch_beaconInterval + vswitch_mtu + vswitch_changeOperation
    no actions
    entities in Vswitch
}

//
// OCCI attribute 'name'
//
one sig vswitch_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard virtual switch name, note that the name must be unique on current host"
    multiple_values = False
}

//
// OCCI attribute 'nbport'
//
one sig vswitch_nbport extends Attribute {} {
    name = "nbport"
    type = core/Number_DataType
    mutable = True
    required = True
    default = "8"
    description = "The number of ports that this virtual switch is configured to use. Changing this setting does not take effect until the next reboot. The maximum value is 1024, although other constraints, such as memory limits, may establish a lower effective limit"
    multiple_values = False
}

//
// OCCI attribute 'beaconInterval'
//
one sig vswitch_beaconInterval extends Attribute {} {
    name = "beaconInterval"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Determines how often, in seconds, a beacon should be sent. See HostVirtualSwitchBeaconConfig and nicfailurecriteria.checkBeacon, for use with bond bridge"
    multiple_values = False
}

//
// OCCI attribute 'mtu'
//
one sig vswitch_mtu extends Attribute {} {
    name = "mtu"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The maximum transmission unit (MTU) of the virtual switch in bytes"
    multiple_values = False
}

//
// OCCI attribute 'changeOperation'
//
one sig vswitch_changeOperation extends Attribute {} {
    name = "changeOperation"
    type = NetworkChangeOperation_DataType
    mutable = True
    required = False
    no default
    description = "This property indicates the change operation to apply on this configuration
    add: Indicates the addition of a network entity to the configuration.
    edit: Indicates changes on the network entity. The entity must exist or a NotFound error will be thrown
    remove: Indicates the removal of a network entity from the configuration"
    multiple_values = False
}

// ======================================================================
// Signature for Vswitch
// ======================================================================

sig Vswitch extends infrastructure/Network {
    name : one String,
    nbport : one core/Number,
    beaconInterval : lone core/Number,
    mtu : lone core/Number,
    changeOperation : lone NetworkChangeOperation,
} {
    hasKind[vswitch]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#portgroup'
//
// ======================================================================

one sig portgroup extends Kind {} {
    term = "portgroup"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A port group aggregates multiple ports under a common configuration and provides a stable anchor point for virtual machines connecting to the labeled networks. It is identified by a label, which must be unique to the current host. The optional VLAN ID restricts port group traffic to a logical Ethernet segment within the network"
    parent = core/resource
    attributes = portgroup_name + portgroup_vlanId + portgroup_key
    no actions
    entities in Portgroup
}

//
// OCCI attribute 'name'
//
one sig portgroup_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'vlanId'
//
one sig portgroup_vlanId extends Attribute {} {
    name = "vlanId"
    type = core/Number_DataType
    mutable = True
    required = True
    default = "0"
    description = "The VLAN ID for ports using this port group. Possible values:
    A value of 0 specifies that you do not want the port group associated with a VLAN.
    A value from 1 to 4094 specifies a VLAN ID for the port group.
    A value of 4095 specifies that the port group should use trunk mode, which allows the guest operating system to manage its own VLAN tags"
    multiple_values = False
}

//
// OCCI attribute 'key'
//
one sig portgroup_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The linkable identifier"
    multiple_values = False
}

// ======================================================================
// Signature for Portgroup
// ======================================================================

sig Portgroup extends core/Resource {
    name : one String,
    vlanId : one core/Number,
    key : lone String,
} {
    hasKind[portgroup]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualnetworkadapter'
//
// ======================================================================

one sig virtualnetworkadapter extends Kind {} {
    term = "virtualnetworkadapter"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a network adapter for a virtual machine (virtual nic), describes a virtual network adapter representing an adapter that connects to a virtual switch. A VirtualNic differs from a PhysicalNic in that the latter corresponds to a physical device that is connected to the physical network. The former is a virtual device that is connected to a virtual switch. A VirtualNic accesses the external network through a virtual switch that is bridged through a PhysicalNic to a physical network"
    parent = infrastructure/networkinterface
    attributes = virtualnetworkadapter_name + virtualnetworkadapter_key + virtualnetworkadapter_subnetMask + virtualnetworkadapter_port + virtualnetworkadapter_deviceDriver
    actions = virtualnetworkadapter_connectAdaptater + virtualnetworkadapter_disconnectAdaptater
    entities in Virtualnetworkadapter
}

//
// OCCI attribute 'name'
//
one sig virtualnetworkadapter_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Device name"
    multiple_values = False
}

//
// OCCI attribute 'key'
//
one sig virtualnetworkadapter_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The linkable identifier. "
    multiple_values = False
}

//
// OCCI attribute 'subnetMask'
//
one sig virtualnetworkadapter_subnetMask extends Attribute {} {
    name = "subnetMask"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The subnet mask.
    Note: When DHCP is not enabled, this property can be set explicitly. When DHCP is enabled, this property reflects the current IP configuration and cannot be set. "
    multiple_values = False
}

//
// OCCI attribute 'port'
//
one sig virtualnetworkadapter_port extends Attribute {} {
    name = "port"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The port on the port group that the virtual network adapter is using when it is enabled. "
    multiple_values = False
}

//
// OCCI attribute 'deviceDriver'
//
one sig virtualnetworkadapter_deviceDriver extends Attribute {} {
    name = "deviceDriver"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "like vmxnet etc."
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/virtualnetworkadapter/action#connectAdaptater'
//
one sig virtualnetworkadapter_connectAdaptater extends Action {} {
    term = "connectAdaptater"
    scheme = "http://occiware.org/occi/vmware/virtualnetworkadapter/action#"
    title = "Connect virtual machine to vswitch"
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/virtualnetworkadapter/action#disconnectAdaptater'
//
one sig virtualnetworkadapter_disconnectAdaptater extends Action {} {
    term = "disconnectAdaptater"
    scheme = "http://occiware.org/occi/vmware/virtualnetworkadapter/action#"
    title = "Disconnect virtual machine and vswitch"
    no attributes
}


// ======================================================================
// Signature for Virtualnetworkadapter
// ======================================================================

sig Virtualnetworkadapter extends infrastructure/Networkinterface {
    name : one String,
    key : one String,
    subnetMask : lone String,
    port : lone String,
    deviceDriver : lone String,
} {
    hasKind[virtualnetworkadapter]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisknetwork'
//
// ======================================================================

one sig virtualdisknetwork extends Kind {} {
    term = "virtualdisknetwork"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a storage disk network for usage with a network vswitch and portgroup, vswitch and portgroup may be multiples"
    parent = virtualdisk
    no attributes
    no actions
    entities in Virtualdisknetwork
}

// ======================================================================
// Signature for Virtualdisknetwork
// ======================================================================

sig Virtualdisknetwork extends Virtualdisk {
} {
    hasKind[virtualdisknetwork]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisknetworklink'
//
// ======================================================================

one sig virtualdisknetworklink extends Kind {} {
    term = "virtualdisknetworklink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "a link between a virtualdisknetwork and a vswitch"
    parent = infrastructure/storagelink
    no attributes
    no actions
    entities in Virtualdisknetworklink
}

// ======================================================================
// Signature for Virtualdisknetworklink
// ======================================================================

sig Virtualdisknetworklink extends infrastructure/Storagelink {
} {
    hasKind[virtualdisknetworklink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnetworkadapter'
//
// ======================================================================

one sig hostnetworkadapter extends Kind {} {
    term = "hostnetworkadapter"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Physical Network adaptater on a hostsystem, describes the physical network adapter as seen by the primary operating system"
    parent = infrastructure/networkinterface
    attributes = hostnetworkadapter_name + hostnetworkadapter_driver + hostnetworkadapter_key + hostnetworkadapter_pci + hostnetworkadapter_subnetMask + hostnetworkadapter_wakeOnLanSupported
    actions = hostnetworkadapter_connect + hostnetworkadapter_disconnect
    entities in Hostnetworkadapter
}

//
// OCCI attribute 'name'
//
one sig hostnetworkadapter_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The device name of the physical network adapter"
    multiple_values = False
}

//
// OCCI attribute 'driver'
//
one sig hostnetworkadapter_driver extends Attribute {} {
    name = "driver"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The name of the driver"
    multiple_values = False
}

//
// OCCI attribute 'key'
//
one sig hostnetworkadapter_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The linkable identifier"
    multiple_values = False
}

//
// OCCI attribute 'pci'
//
one sig hostnetworkadapter_pci extends Attribute {} {
    name = "pci"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Device hash of the PCI device corresponding to this physical network adapter."
    multiple_values = False
}

//
// OCCI attribute 'subnetMask'
//
one sig hostnetworkadapter_subnetMask extends Attribute {} {
    name = "subnetMask"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The subnet mask.
    Note: When DHCP is not enabled, this property can be set explicitly. When DHCP is enabled, this property reflects the current IP configuration and cannot be set. "
    multiple_values = False
}

//
// OCCI attribute 'wakeOnLanSupported'
//
one sig hostnetworkadapter_wakeOnLanSupported extends Attribute {} {
    name = "wakeOnLanSupported"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Flag indicating whether the NIC is wake-on-LAN capable"
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostnetworkadapter/action#connect'
//
one sig hostnetworkadapter_connect extends Action {} {
    term = "connect"
    scheme = "http://occiware.org/occi/vmware/hostnetworkadapter/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostnetworkadapter/action#disconnect'
//
one sig hostnetworkadapter_disconnect extends Action {} {
    term = "disconnect"
    scheme = "http://occiware.org/occi/vmware/hostnetworkadapter/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Hostnetworkadapter
// ======================================================================

sig Hostnetworkadapter extends infrastructure/Networkinterface {
    name : one String,
    driver : lone String,
    key : lone String,
    pci : lone String,
    subnetMask : lone String,
    wakeOnLanSupported : one core/Boolean,
} {
    hasKind[hostnetworkadapter]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#dvswitch'
//
// ======================================================================

one sig dvswitch extends Kind {} {
    term = "dvswitch"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Distributed virtual switch"
    parent = vswitch
    no attributes
    no actions
    entities in Dvswitch
}

// ======================================================================
// Signature for Dvswitch
// ======================================================================

sig Dvswitch extends Vswitch {
} {
    hasKind[dvswitch]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#snapshot'
//
// ======================================================================

one sig snapshot extends Kind {} {
    term = "snapshot"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = core/resource
    no attributes
    actions = snapshot_restore
    entities in Snapshot
}

//
// OCCI action 'http://occiware.org/occi/vmware/snapshot/action#restore'
//
one sig snapshot_restore extends Action {} {
    term = "restore"
    scheme = "http://occiware.org/occi/vmware/snapshot/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Snapshot
// ======================================================================

sig Snapshot extends core/Resource {
} {
    hasKind[snapshot]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#snapshotlink'
//
// ======================================================================

one sig snapshotlink extends Kind {} {
    term = "snapshotlink"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = core/link
    no attributes
    no actions
    entities in Snapshotlink
}

// ======================================================================
// Signature for Snapshotlink
// ======================================================================

sig Snapshotlink extends core/Link {
} {
    hasKind[snapshotlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#folder'
//
// ======================================================================

one sig folder extends Kind {} {
    term = "folder"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = core/resource
    attributes = folder_name
    no actions
    entities in Folder
}

//
// OCCI attribute 'name'
//
one sig folder_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Folder
// ======================================================================

sig Folder extends core/Resource {
    name : one String,
} {
    hasKind[folder]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfolder'
//
// ======================================================================

one sig hostfolder extends Kind {} {
    term = "hostfolder"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = folder
    no attributes
    no actions
    entities in Hostfolder
}

// ======================================================================
// Signature for Hostfolder
// ======================================================================

sig Hostfolder extends Folder {
} {
    hasKind[hostfolder]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vcentercapability'
//
// ======================================================================

one sig vcentercapability extends Kind {} {
    term = "vcentercapability"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Global data object to determine if the global service instance support or not a feature, see ServiceInstance"
    parent = core/resource
    attributes = vcentercapability_multiHostSupported + vcentercapability_provisioningSupported + vcentercapability_userShellAccessSupported + vcentercapability_EVCModeVendor + vcentercapability_EVCModeVendorTier
    no actions
    entities in Vcentercapability
}

//
// OCCI attribute 'multiHostSupported'
//
one sig vcentercapability_multiHostSupported extends Attribute {} {
    name = "multiHostSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not the service instance supports multiple hosts. "
    multiple_values = False
}

//
// OCCI attribute 'provisioningSupported'
//
one sig vcentercapability_provisioningSupported extends Attribute {} {
    name = "provisioningSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not the service instance supports provisioning. For example, the CloneVM operation"
    multiple_values = False
}

//
// OCCI attribute 'userShellAccessSupported'
//
one sig vcentercapability_userShellAccessSupported extends Attribute {} {
    name = "userShellAccessSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether host user accounts should have the option to be granted shell access"
    multiple_values = False
}

//
// OCCI attribute 'EVCModeVendor'
//
one sig vcentercapability_EVCModeVendor extends Attribute {} {
    name = "EVCModeVendor"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "All supported Enhanced VMotion Compatibility modes. CPU hardware vendor required for this mode. "
    multiple_values = False
}

//
// OCCI attribute 'EVCModeVendorTier'
//
one sig vcentercapability_EVCModeVendorTier extends Attribute {} {
    name = "EVCModeVendorTier"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "All supported Enhanced VMotion Compatibility modes.Index for ordering the set of modes that apply to a given CPU vendor. Use this property to compare vendor tier values from two modes. Do not use this property to determine the presence or absence of specific features. "
    multiple_values = False
}

// ======================================================================
// Signature for Vcentercapability
// ======================================================================

sig Vcentercapability extends core/Resource {
    multiHostSupported : lone core/Boolean,
    provisioningSupported : lone core/Boolean,
    userShellAccessSupported : lone core/Boolean,
    EVCModeVendor : lone String,
    EVCModeVendorTier : lone core/Number,
} {
    hasKind[vcentercapability]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallsystem'
//
// ======================================================================

one sig hostfirewallsystem extends Kind {} {
    term = "hostfirewallsystem"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A host can have only have one firewall, this described a firewall for a host and a set of rules"
    parent = core/resource
    attributes = hostfirewallsystem_defaultIncomingBlocked + hostfirewallsystem_defaultOutgoingBlocked
    no actions
    entities in Hostfirewallsystem
}

//
// OCCI attribute 'defaultIncomingBlocked'
//
one sig hostfirewallsystem_defaultIncomingBlocked extends Attribute {} {
    name = "defaultIncomingBlocked"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether incoming traffic should be blocked by default."
    multiple_values = False
}

//
// OCCI attribute 'defaultOutgoingBlocked'
//
one sig hostfirewallsystem_defaultOutgoingBlocked extends Attribute {} {
    name = "defaultOutgoingBlocked"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether outgoing traffic should be blocked by default. "
    multiple_values = False
}

// ======================================================================
// Signature for Hostfirewallsystem
// ======================================================================

sig Hostfirewallsystem extends core/Resource {
    defaultIncomingBlocked : lone core/Boolean,
    defaultOutgoingBlocked : lone core/Boolean,
} {
    hasKind[hostfirewallsystem]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallruleset'
//
// ======================================================================

one sig hostfirewallruleset extends Kind {} {
    term = "hostfirewallruleset"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = core/resource
    attributes = hostfirewallruleset_enabled + hostfirewallruleset_key + hostfirewallruleset_label + hostfirewallruleset_required + hostfirewallruleset_service
    actions = hostfirewallruleset_disableRuleset + hostfirewallruleset_enableRuleset
    entities in Hostfirewallruleset
}

//
// OCCI attribute 'enabled'
//
one sig hostfirewallruleset_enabled extends Attribute {} {
    name = "enabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether the ruleset is enabled. If the ruleset is enabled, all ports specified in the ruleset are opened by the firewall. "
    multiple_values = False
}

//
// OCCI attribute 'key'
//
one sig hostfirewallruleset_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Brief identifier for the ruleset. "
    multiple_values = False
}

//
// OCCI attribute 'label'
//
one sig hostfirewallruleset_label extends Attribute {} {
    name = "label"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Display label for the ruleset. "
    multiple_values = False
}

//
// OCCI attribute 'required'
//
one sig hostfirewallruleset_required extends Attribute {} {
    name = "required"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether the ruleset is required and cannot be disabled. "
    multiple_values = False
}

//
// OCCI attribute 'service'
//
one sig hostfirewallruleset_service extends Attribute {} {
    name = "service"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Managed service (if any) that uses this ruleset. Must be one of the services listed in HostService. "
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostfirewallruleset/action#disableRuleset'
//
one sig hostfirewallruleset_disableRuleset extends Action {} {
    term = "disableRuleset"
    scheme = "http://occiware.org/occi/vmware/hostfirewallruleset/action#"
    title = "Blocks the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of 'auto' and all other rulesets used by the service are blocked, stops the service."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostfirewallruleset/action#enableRuleset'
//
one sig hostfirewallruleset_enableRuleset extends Action {} {
    term = "enableRuleset"
    scheme = "http://occiware.org/occi/vmware/hostfirewallruleset/action#"
    title = "Opens the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of 'auto' that is not running, starts the service."
    no attributes
}


// ======================================================================
// Signature for Hostfirewallruleset
// ======================================================================

sig Hostfirewallruleset extends core/Resource {
    enabled : lone core/Boolean,
    key : lone String,
    label : lone String,
    required : lone core/Boolean,
    service : lone String,
} {
    hasKind[hostfirewallruleset]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallrule'
//
// ======================================================================

one sig hostfirewallrule extends Kind {} {
    term = "hostfirewallrule"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A rule link between hostfirewallsystem and a hostfirewallruleset"
    parent = core/link
    attributes = hostfirewallrule_direction + hostfirewallrule_port + hostfirewallrule_endPort + hostfirewallrule_protocol
    no actions
    entities in Hostfirewallrule
}

//
// OCCI attribute 'direction'
//
one sig hostfirewallrule_direction extends Attribute {} {
    name = "direction"
    type = HostFirewallRuleDirection_DataType
    mutable = True
    required = False
    no default
    description = "The port direction."
    multiple_values = False
}

//
// OCCI attribute 'port'
//
one sig hostfirewallrule_port extends Attribute {} {
    name = "port"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The port number"
    multiple_values = False
}

//
// OCCI attribute 'endPort'
//
one sig hostfirewallrule_endPort extends Attribute {} {
    name = "endPort"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "For a port range, the ending port number. "
    multiple_values = False
}

//
// OCCI attribute 'protocol'
//
one sig hostfirewallrule_protocol extends Attribute {} {
    name = "protocol"
    type = HostNetworkProtocol_DataType
    mutable = True
    required = False
    no default
    description = "The port protocol"
    multiple_values = False
}

// ======================================================================
// Signature for Hostfirewallrule
// ======================================================================

sig Hostfirewallrule extends core/Link {
    direction : lone HostFirewallRuleDirection,
    port : lone core/Number,
    endPort : lone core/Number,
    protocol : lone HostNetworkProtocol,
} {
    hasKind[hostfirewallrule]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hoststorage'
//
// ======================================================================

one sig hoststorage extends Kind {} {
    term = "hoststorage"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Represente a physical storage on a hostsystem, see HostStorageSystem, linked to a hostsystem via a hoststoragelink"
    parent = infrastructure/storage
    attributes = hoststorage_hostVolumeName
    no actions
    entities in Hoststorage
}

//
// OCCI attribute 'hostVolumeName'
//
one sig hoststorage_hostVolumeName extends Attribute {} {
    name = "hostVolumeName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Name of the file system volume. "
    multiple_values = False
}

// ======================================================================
// Signature for Hoststorage
// ======================================================================

sig Hoststorage extends infrastructure/Storage {
    hostVolumeName : lone String,
} {
    hasKind[hoststorage]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hoststoragelink'
//
// ======================================================================

one sig hoststoragelink extends Kind {} {
    term = "hoststoragelink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "hoststorage as it is view by the host os"
    parent = infrastructure/storagelink
    no attributes
    no actions
    entities in Hoststoragelink
}

// ======================================================================
// Signature for Hoststoragelink
// ======================================================================

sig Hoststoragelink extends infrastructure/Storagelink {
} {
    hasKind[hoststoragelink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vmfolder'
//
// ======================================================================

one sig vmfolder extends Kind {} {
    term = "vmfolder"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = folder
    no attributes
    no actions
    entities in Vmfolder
}

// ======================================================================
// Signature for Vmfolder
// ======================================================================

sig Vmfolder extends Folder {
} {
    hasKind[vmfolder]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#serviceconsolenic'
//
// ======================================================================

one sig serviceconsolenic extends Kind {} {
    term = "serviceconsolenic"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Virtual network adapters configured for use by the Service Console"
    parent = virtualnetworkadapter
    no attributes
    no actions
    entities in Serviceconsolenic
}

// ======================================================================
// Signature for Serviceconsolenic
// ======================================================================

sig Serviceconsolenic extends Virtualnetworkadapter {
} {
    hasKind[serviceconsolenic]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#portgrouplink'
//
// ======================================================================

one sig portgrouplink extends Kind {} {
    term = "portgrouplink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "link between portgroup and vswitch"
    parent = core/link
    no attributes
    no actions
    entities in Portgrouplink
}

// ======================================================================
// Signature for Portgrouplink
// ======================================================================

sig Portgrouplink extends core/Link {
} {
    hasKind[portgrouplink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnatrule'
//
// ======================================================================

one sig hostnatrule extends Kind {} {
    term = "hostnatrule"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Ruleset for nat service linked to virtual switch via hostnatportforwardlink, this may be multiple for a vswitch"
    parent = core/resource
    attributes = hostnatrule_activeFtp + hostnatrule_allowAnyOui + hostnatrule_configPort + hostnatrule_natKey + hostnatrule_natChangeOperation + hostnatrule_ipGatewayAddress + hostnatrule_udpTimeOut
    no actions
    entities in Hostnatrule
}

//
// OCCI attribute 'activeFtp'
//
one sig hostnatrule_activeFtp extends Attribute {} {
    name = "activeFtp"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "The flag to indicate whether or not non-passive mode FTP connections should be allowed"
    multiple_values = False
}

//
// OCCI attribute 'allowAnyOui'
//
one sig hostnatrule_allowAnyOui extends Attribute {} {
    name = "allowAnyOui"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "The flag to indicate whether or not the NAT Service allows media access control traffic from any Organizational Unique Identifier (OUI)? By default, it does not allow traffic that originated from the host to avoid packet loops."
    multiple_values = False
}

//
// OCCI attribute 'configPort'
//
one sig hostnatrule_configPort extends Attribute {} {
    name = "configPort"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "The flag to indicate whether or not the NAT Service should open a configuration port."
    multiple_values = False
}

//
// OCCI attribute 'natKey'
//
one sig hostnatrule_natKey extends Attribute {} {
    name = "natKey"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The instance ID of the NAT service"
    multiple_values = False
}

//
// OCCI attribute 'natChangeOperation'
//
one sig hostnatrule_natChangeOperation extends Attribute {} {
    name = "natChangeOperation"
    type = NetworkChangeOperation_DataType
    mutable = True
    required = False
    no default
    description = "Indicates the change operation to apply on this configuration specification"
    multiple_values = False
}

//
// OCCI attribute 'ipGatewayAddress'
//
one sig hostnatrule_ipGatewayAddress extends Attribute {} {
    name = "ipGatewayAddress"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The IP address that the NAT Service should use on the virtual network."
    multiple_values = False
}

//
// OCCI attribute 'udpTimeOut'
//
one sig hostnatrule_udpTimeOut extends Attribute {} {
    name = "udpTimeOut"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The time alloted for UDP packets"
    multiple_values = False
}

// ======================================================================
// Signature for Hostnatrule
// ======================================================================

sig Hostnatrule extends core/Resource {
    activeFtp : one core/Boolean,
    allowAnyOui : one core/Boolean,
    configPort : one core/Boolean,
    natKey : one String,
    natChangeOperation : lone NetworkChangeOperation,
    ipGatewayAddress : one String,
    udpTimeOut : one core/Number,
} {
    hasKind[hostnatrule]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnatportforwardlink'
//
// ======================================================================

one sig hostnatportforwardlink extends Kind {} {
    term = "hostnatportforwardlink"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Define the port forward to hostnatrule, it may be multiple links to a single hostnatrule, this define the port forwarding specifications to allow network connections to be initiated from outside the firewall. "
    parent = core/link
    attributes = hostnatportforwardlink_guestIpAddress + hostnatportforwardlink_guestPort + hostnatportforwardlink_hostPort + hostnatportforwardlink_name + hostnatportforwardlink_type
    no actions
    entities in Hostnatportforwardlink
}

//
// OCCI attribute 'guestIpAddress'
//
one sig hostnatportforwardlink_guestIpAddress extends Attribute {} {
    name = "guestIpAddress"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The IP address for the guest. Network traffic from the host is forwarded to this IP address"
    multiple_values = False
}

//
// OCCI attribute 'guestPort'
//
one sig hostnatportforwardlink_guestPort extends Attribute {} {
    name = "guestPort"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The port number for the guest. Network traffic from the host is forwarded to this port. "
    multiple_values = False
}

//
// OCCI attribute 'hostPort'
//
one sig hostnatportforwardlink_hostPort extends Attribute {} {
    name = "hostPort"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The port number on the host. Network traffic sent to the host on this TCP/UDP port is forwarded to the guest at the specified IP address and port."
    multiple_values = False
}

//
// OCCI attribute 'name'
//
one sig hostnatportforwardlink_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The user-defined name to identify the service being forwarded. No white spaces are allowed in the string"
    multiple_values = False
}

//
// OCCI attribute 'type'
//
one sig hostnatportforwardlink_type extends Attribute {} {
    name = "type"
    type = HostNetworkProtocol_DataType
    mutable = True
    required = False
    no default
    description = "Either "tcp" or "udp"."
    multiple_values = False
}

// ======================================================================
// Signature for Hostnatportforwardlink
// ======================================================================

sig Hostnatportforwardlink extends core/Link {
    guestIpAddress : lone String,
    guestPort : lone core/Number,
    hostPort : lone core/Number,
    name : lone String,
    type : lone HostNetworkProtocol,
} {
    hasKind[hostnatportforwardlink]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#distributedportgroup'
//
// ======================================================================

one sig distributedportgroup extends Kind {} {
    term = "distributedportgroup"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = portgroup
    no attributes
    no actions
    entities in Distributedportgroup
}

// ======================================================================
// Signature for Distributedportgroup
// ======================================================================

sig Distributedportgroup extends Portgroup {
} {
    hasKind[distributedportgroup]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualcdrom'
//
// ======================================================================

one sig virtualcdrom extends Kind {} {
    term = "virtualcdrom"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A virtual cdrom disk"
    parent = virtualdisk
    attributes = virtualcdrom_isoFilename
    no actions
    entities in Virtualcdrom
}

//
// OCCI attribute 'isoFilename'
//
one sig virtualcdrom_isoFilename extends Attribute {} {
    name = "isoFilename"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The filename of the ISO."
    multiple_values = False
}

// ======================================================================
// Signature for Virtualcdrom
// ======================================================================

sig Virtualcdrom extends Virtualdisk {
    isoFilename : one String,
} {
    hasKind[virtualcdrom]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualfloppy'
//
// ======================================================================

one sig virtualfloppy extends Kind {} {
    term = "virtualfloppy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A virtual floppy disk"
    parent = virtualdisk
    no attributes
    no actions
    entities in Virtualfloppy
}

// ======================================================================
// Signature for Virtualfloppy
// ======================================================================

sig Virtualfloppy extends Virtualdisk {
} {
    hasKind[virtualfloppy]
}

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisklink'
//
// ======================================================================

one sig virtualdisklink extends Kind {} {
    term = "virtualdisklink"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    parent = infrastructure/storagelink
    attributes = virtualdisklink_vmdkFilePathOnDatastore
    no actions
    entities in Virtualdisklink
}

//
// OCCI attribute 'vmdkFilePathOnDatastore'
//
one sig virtualdisklink_vmdkFilePathOnDatastore extends Attribute {} {
    name = "vmdkFilePathOnDatastore"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Represents the vmdk file path."
    multiple_values = False
}

// ======================================================================
// Signature for Virtualdisklink
// ======================================================================

sig Virtualdisklink extends infrastructure/Storagelink {
    vmdkFilePathOnDatastore : lone String,
} {
    hasKind[virtualdisklink]
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#linux'
//
// ======================================================================

one sig linux extends Mixin {} {
    term = "linux"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = os_tpl
    no applies
    attributes = linux_guestid + linux_datastoreisopath
    no actions
    entities in Linux
}

//
// OCCI attribute 'guestid'
//
one sig linux_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig linux_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Linux
// ======================================================================

sig Linux in core/Entity {
    guestid : lone GuestOsIdentifiers,
    datastoreisopath : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#windows'
//
// ======================================================================

one sig windows extends Mixin {} {
    term = "windows"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = os_tpl
    no applies
    attributes = windows_guestid + windows_datastoreisopath
    no actions
    entities in Windows
}

//
// OCCI attribute 'guestid'
//
one sig windows_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig windows_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Windows
// ======================================================================

sig Windows in core/Entity {
    guestid : lone GuestOsIdentifiers,
    datastoreisopath : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#macosx'
//
// ======================================================================

one sig macosx extends Mixin {} {
    term = "macosx"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = os_tpl
    no applies
    attributes = macosx_guestid + macosx_datastoreisopath
    no actions
    entities in Macosx
}

//
// OCCI attribute 'guestid'
//
one sig macosx_guestid extends Attribute {} {
    name = "guestid"
    type = GuestOsIdentifiers_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'datastoreisopath'
//
one sig macosx_datastoreisopath extends Attribute {} {
    name = "datastoreisopath"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Macosx
// ======================================================================

sig Macosx in core/Entity {
    guestid : lone GuestOsIdentifiers,
    datastoreisopath : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#small'
//
// ======================================================================

one sig small extends Mixin {} {
    term = "small"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = resource_tpl
    no applies
    no attributes
    no actions
    entities in Small
}

// ======================================================================
// Signature for Small
// ======================================================================

sig Small in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#medium'
//
// ======================================================================

one sig medium extends Mixin {} {
    term = "medium"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = resource_tpl
    no applies
    no attributes
    no actions
    entities in Medium
}

// ======================================================================
// Signature for Medium
// ======================================================================

sig Medium in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#large'
//
// ======================================================================

one sig large extends Mixin {} {
    term = "large"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = resource_tpl
    no applies
    no attributes
    no actions
    entities in Large
}

// ======================================================================
// Signature for Large
// ======================================================================

sig Large in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#xlarge'
//
// ======================================================================

one sig xlarge extends Mixin {} {
    term = "xlarge"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = resource_tpl
    no applies
    no attributes
    no actions
    entities in Xlarge
}

// ======================================================================
// Signature for Xlarge
// ======================================================================

sig Xlarge in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#ssh_authentication'
//
// ======================================================================

one sig ssh_authentication extends Mixin {} {
    term = "ssh_authentication"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = ssh_key
    no applies
    attributes = ssh_authentication_sshLogin + ssh_authentication_sshPassword + ssh_authentication_sshAddress + ssh_authentication_sshPort
    no actions
    entities in Ssh_authentication
}

//
// OCCI attribute 'sshLogin'
//
one sig ssh_authentication_sshLogin extends Attribute {} {
    name = "sshLogin"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'sshPassword'
//
one sig ssh_authentication_sshPassword extends Attribute {} {
    name = "sshPassword"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'sshAddress'
//
one sig ssh_authentication_sshAddress extends Attribute {} {
    name = "sshAddress"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'sshPort'
//
one sig ssh_authentication_sshPort extends Attribute {} {
    name = "sshPort"
    type = core/Number_DataType
    mutable = True
    required = True
    default = "22"
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Ssh_authentication
// ======================================================================

sig Ssh_authentication in core/Entity {
    sshLogin : lone String,
    sshPassword : lone String,
    sshAddress : one String,
    sshPort : one core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#bootoptions'
//
// ======================================================================

one sig bootoptions extends Mixin {} {
    term = "bootoptions"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Settings that control the boot behavior of the virtual machine.These settings take effect during the next power-on of the virtual machine.Reconfigure privilege: VirtualMachine.Config.Settings"
    no depends
    applies = vm
    attributes = bootoptions_bootDelay + bootoptions_bootDeviceOrder + bootoptions_bootRetryDelay + bootoptions_bootRetryEnabled + bootoptions_enterBiosSetup + bootoptions_deviceKeys + bootoptions_networkBootProtocol
    no actions
    entities in Bootoptions
}

//
// OCCI attribute 'bootDelay'
//
one sig bootoptions_bootDelay extends Attribute {} {
    name = "bootDelay"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Delay in milliseconds before starting the boot sequence. The boot delay specifies a time interval between virtual machine power on or restart and the beginning of the boot sequence"
    multiple_values = False
}

//
// OCCI attribute 'bootDeviceOrder'
//
one sig bootoptions_bootDeviceOrder extends Attribute {} {
    name = "bootDeviceOrder"
    type = Bootdevice_DataType
    mutable = True
    required = False
    no default
    description = "Boot order. Listed devices are used for booting. After list is exhausted, default BIOS boot device algorithm is used for booting. Note that order of the entries in the list is important: device listed first is used for boot first, if that one fails second entry is used, and so on. Platform may have some internal limit on the number of devices it supports. If bootable device is not reached before platform's limit is hit, boot will fail. At least single entry is supported by all products supporting boot order settings."
    multiple_values = True
}

//
// OCCI attribute 'bootRetryDelay'
//
one sig bootoptions_bootRetryDelay extends Attribute {} {
    name = "bootRetryDelay"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'bootRetryEnabled'
//
one sig bootoptions_bootRetryEnabled extends Attribute {} {
    name = "bootRetryEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "If set to true, a virtual machine that fails to boot will try again after the bootRetryDelay time period has expired. When false, the virtual machine waits indefinitely for you to initiate boot retry."
    multiple_values = False
}

//
// OCCI attribute 'enterBiosSetup'
//
one sig bootoptions_enterBiosSetup extends Attribute {} {
    name = "enterBiosSetup"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "If set to true, the virtual machine automatically enters BIOS setup the next time it boots. The virtual machine resets this flag to false so that subsequent boots proceed normally."
    multiple_values = False
}

//
// OCCI attribute 'deviceKeys'
//
one sig bootoptions_deviceKeys extends Attribute {} {
    name = "deviceKeys"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "device key value for bootdevice, must be set in the same order as the bootdevice array."
    multiple_values = True
}

//
// OCCI attribute 'networkBootProtocol'
//
one sig bootoptions_networkBootProtocol extends Attribute {} {
    name = "networkBootProtocol"
    type = NetworkBootProtocolType_DataType
    mutable = True
    required = False
    no default
    description = "Protocol to attempt during PXE network boot or NetBoot.
    ipv4: PXE (or Apple NetBoot) over IPv4. The default. 
    ipv6: PXE over IPv6. Only meaningful for EFI virtual machines. "
    multiple_values = False
}

// ======================================================================
// Signature for Bootoptions
// ======================================================================

sig Bootoptions in Vm {
    bootDelay : lone LongNumber,
    bootDeviceOrder : lone Bootdevice,
    bootRetryDelay : lone LongNumber,
    bootRetryEnabled : lone core/Boolean,
    enterBiosSetup : lone core/Boolean,
    deviceKeys : lone core/Number,
    networkBootProtocol : lone NetworkBootProtocolType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#cpuaffinity'
//
// ======================================================================

one sig cpuaffinity extends Mixin {} {
    term = "cpuaffinity"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = cpuaffinity_affinitySet
    no actions
    entities in Cpuaffinity
}

//
// OCCI attribute 'affinitySet'
//
one sig cpuaffinity_affinitySet extends Attribute {} {
    name = "affinitySet"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "List of nodes (processors for CPU, NUMA nodes for memory) that may be used by the virtual machine. If the array is empty when modifying the affinity setting, then any existing affinity is removed. "
    multiple_values = True
}

// ======================================================================
// Signature for Cpuaffinity
// ======================================================================

sig Cpuaffinity in Vm {
    affinitySet : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#shares'
//
// ======================================================================

one sig shares extends Mixin {} {
    term = "shares"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = sharesconfig
    no applies
    attributes = shares_level + shares_shares
    no actions
    entities in Shares
}

//
// OCCI attribute 'level'
//
one sig shares_level extends Attribute {} {
    name = "level"
    type = SharesLevel_DataType
    mutable = True
    required = False
    no default
    description = "custom: If you specify custom for the level property, when there is resource contention the Server uses the shares value to determine resource allocation. 
    high: For CPU: Shares = 2000 * nmumber of virtual CPUs
    For Memory: Shares = 20 * virtual machine memory size in megabytes
    For Disk: Shares = 2000
    For Network: Shares = networkResourcePoolHighShareValue 
    low: For CPU: Shares = 500 * number of virtual CPUs
    For Memory: Shares = 5 * virtual machine memory size in megabytes
    For Disk: Shares = 500
    For Network: Shares = 0.25 * networkResourcePoolHighShareValue 
    normal: For CPU: Shares = 1000 * number of virtual CPUs
    For Memory: Shares = 10 * virtual machine memory size in megabytes
    For Disk: Shares = 1000
    For Network: Shares = 0.5 * networkResourcePoolHighShareValue "
    multiple_values = False
}

//
// OCCI attribute 'shares'
//
one sig shares_shares extends Attribute {} {
    name = "shares"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The number of shares allocated. Used to determine resource allocation in case of resource contention. This value is only set if level is set to custom. If level is not set to custom, this value is ignored. Therefore, only shares with custom values can be compared.
    There is no unit for this value. It is a relative measure based on the settings for other resource pools. "
    multiple_values = False
}

// ======================================================================
// Signature for Shares
// ======================================================================

sig Shares in core/Entity {
    level : lone SharesLevel,
    shares : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dvsfeaturecapability'
//
// ======================================================================

one sig dvsfeaturecapability extends Mixin {} {
    term = "dvsfeaturecapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = shares
    no applies
    attributes = dvsfeaturecapability_networkResourceManagementSupported + dvsfeaturecapability_networkResourcePoolHighShareValue + dvsfeaturecapability_qosSupported + dvsfeaturecapability_userDefinedNetworkResourcePoolsSupported + dvsfeaturecapability_nicTeamingPolicy + dvsfeaturecapability_vmDirectPathGen2Supported
    no actions
    entities in Dvsfeaturecapability
}

//
// OCCI attribute 'networkResourceManagementSupported'
//
one sig dvsfeaturecapability_networkResourceManagementSupported extends Attribute {} {
    name = "networkResourceManagementSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether network I/O control is supported on the vSphere Distributed Switch. Network I/O control is supported in vSphere Distributed Switch Version 4.1 or later. "
    multiple_values = False
}

//
// OCCI attribute 'networkResourcePoolHighShareValue'
//
one sig dvsfeaturecapability_networkResourcePoolHighShareValue extends Attribute {} {
    name = "networkResourcePoolHighShareValue"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "This is the value for high in shares. This implicitly defines the legal range of share values to be between 1 and this. This also defines values for other level types, such as normal being one half of this value and low being one fourth of this value. This feature is supported in vSphere Distributed Switch Version 4.1 or later. "
    multiple_values = False
}

//
// OCCI attribute 'qosSupported'
//
one sig dvsfeaturecapability_qosSupported extends Attribute {} {
    name = "qosSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether Qos Tag(802.1p priority tag)is supported on the vSphere Distributed Switch. Qos Tag is supported in vSphere Distributed Switch Version 5.0 or later."
    multiple_values = False
}

//
// OCCI attribute 'userDefinedNetworkResourcePoolsSupported'
//
one sig dvsfeaturecapability_userDefinedNetworkResourcePoolsSupported extends Attribute {} {
    name = "userDefinedNetworkResourcePoolsSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether the switch supports creating user defined resource pools. This feature is supported in vSphere Distributed Switch Version 5.0 or later. "
    multiple_values = False
}

//
// OCCI attribute 'nicTeamingPolicy'
//
one sig dvsfeaturecapability_nicTeamingPolicy extends Attribute {} {
    name = "nicTeamingPolicy"
    type = DvsNicTeamingPolicy_DataType
    mutable = True
    required = False
    no default
    description = "The available teaming modes for the vSphere Distributed Switch. The value can be one or more of DistributedVirtualSwitchNicTeamingPolicyMode. 
    failover_explicit: Use explicit failover order 
    loadbalance_ip: Routing based on IP hash 
    loadbalance_loadbased: Routing based by dynamically balancing traffic through the NICs in a team. This is the recommended teaming policy when the network I/O control feature is enabled for the vNetwork Distributed Switch. 
    loadbalance_srcid: Route based on the source of the port ID 
    loadbalance_srcmac: Route based on source MAC hash  "
    multiple_values = True
}

//
// OCCI attribute 'vmDirectPathGen2Supported'
//
one sig dvsfeaturecapability_vmDirectPathGen2Supported extends Attribute {} {
    name = "vmDirectPathGen2Supported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether VMDirectPath Gen 2 is supported on the vSphere Distributed Switch. VMDirectPath Gen 2 is supported in vSphere Distributed Switch Version 4.1 or later."
    multiple_values = False
}

// ======================================================================
// Signature for Dvsfeaturecapability
// ======================================================================

sig Dvsfeaturecapability in core/Entity {
    networkResourceManagementSupported : lone core/Boolean,
    networkResourcePoolHighShareValue : lone core/Number,
    qosSupported : lone core/Boolean,
    userDefinedNetworkResourcePoolsSupported : lone core/Boolean,
    nicTeamingPolicy : lone DvsNicTeamingPolicy,
    vmDirectPathGen2Supported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#consolepreference'
//
// ======================================================================

one sig consolepreference extends Mixin {} {
    term = "consolepreference"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = consolepreference_closeOnPowerOffOrSuspend + consolepreference_enterFullscreenOnPowerOn + consolepreference_powerOnWhenOpened
    no actions
    entities in Consolepreference
}

//
// OCCI attribute 'closeOnPowerOffOrSuspend'
//
one sig consolepreference_closeOnPowerOffOrSuspend extends Attribute {} {
    name = "closeOnPowerOffOrSuspend"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Close the console application when the virtual machine is powered off or suspended. "
    multiple_values = False
}

//
// OCCI attribute 'enterFullscreenOnPowerOn'
//
one sig consolepreference_enterFullscreenOnPowerOn extends Attribute {} {
    name = "enterFullscreenOnPowerOn"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Enter full screen mode when this virtual machine is powered on. "
    multiple_values = False
}

//
// OCCI attribute 'powerOnWhenOpened'
//
one sig consolepreference_powerOnWhenOpened extends Attribute {} {
    name = "powerOnWhenOpened"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Power on the virtual machine when it is opened in the console. "
    multiple_values = False
}

// ======================================================================
// Signature for Consolepreference
// ======================================================================

sig Consolepreference in Vm {
    closeOnPowerOffOrSuspend : lone core/Boolean,
    enterFullscreenOnPowerOn : lone core/Boolean,
    powerOnWhenOpened : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#defaultpoweroptions'
//
// ======================================================================

one sig defaultpoweroptions extends Mixin {} {
    term = "defaultpoweroptions"
    scheme = "http://occiware.org/occi/vmware#"
    title = "holds the configured defaults for the power operations on a virtual machine. The properties indicated whether to do a "soft" or guest initiated operation, or a "hard" operation."
    no depends
    applies = vm
    attributes = defaultpoweroptions_defaultPowerOffType + defaultpoweroptions_defaultResetType + defaultpoweroptions_defaultSuspendType + defaultpoweroptions_powerOffType + defaultpoweroptions_resetType + defaultpoweroptions_standbyAction + defaultpoweroptions_suspendType
    no actions
    entities in Defaultpoweroptions
}

//
// OCCI attribute 'defaultPowerOffType'
//
one sig defaultpoweroptions_defaultPowerOffType extends Attribute {} {
    name = "defaultPowerOffType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Default operation for power off: soft or hard "
    multiple_values = False
}

//
// OCCI attribute 'defaultResetType'
//
one sig defaultpoweroptions_defaultResetType extends Attribute {} {
    name = "defaultResetType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Default operation for reset: soft or hard "
    multiple_values = False
}

//
// OCCI attribute 'defaultSuspendType'
//
one sig defaultpoweroptions_defaultSuspendType extends Attribute {} {
    name = "defaultSuspendType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Default operation for suspend: soft or hard "
    multiple_values = False
}

//
// OCCI attribute 'powerOffType'
//
one sig defaultpoweroptions_powerOffType extends Attribute {} {
    name = "powerOffType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Describes the default power off type for this virtual machine. The possible values are specified by the PowerOpType.
    hard - Perform power off by using the PowerOff method.
    soft - Perform power off by using the ShutdownGuest method.
    preset - The preset value is specified in the defaultPowerOffType section.
    This setting is advisory and clients can choose to ignore it. "
    multiple_values = False
}

//
// OCCI attribute 'resetType'
//
one sig defaultpoweroptions_resetType extends Attribute {} {
    name = "resetType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Describes the default reset type for this virtual machine. The possible values are specified by the PowerOpType.
    hard - Perform reset by using the Reset method.
    soft - Perform reset by using the RebootGuest method.
    preset - The preset value is specified in the defaultResetType section.
    This setting is advisory and clients can choose to ignore it. "
    multiple_values = False
}

//
// OCCI attribute 'standbyAction'
//
one sig defaultpoweroptions_standbyAction extends Attribute {} {
    name = "standbyAction"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Behavior of virtual machine when it receives the S1 ACPI call. "
    multiple_values = False
}

//
// OCCI attribute 'suspendType'
//
one sig defaultpoweroptions_suspendType extends Attribute {} {
    name = "suspendType"
    type = PowerOffType_DataType
    mutable = True
    required = False
    no default
    description = "Describes the default suspend type for this virtual machine. The possible values are specified by the PowerOpType.
    hard - Perform suspend by using the Suspend method.
    soft - Perform suspend by using the StandbyGuest method.
    preset - The preset value is specified in the defaultSuspendType section.
    This setting is advisory and clients can choose to ignore it. "
    multiple_values = False
}

// ======================================================================
// Signature for Defaultpoweroptions
// ======================================================================

sig Defaultpoweroptions in Vm {
    defaultPowerOffType : lone PowerOffType,
    defaultResetType : lone PowerOffType,
    defaultSuspendType : lone PowerOffType,
    powerOffType : lone PowerOffType,
    resetType : lone PowerOffType,
    standbyAction : lone String,
    suspendType : lone PowerOffType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmflags'
//
// ======================================================================

one sig vmflags extends Mixin {} {
    term = "vmflags"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = vmflags_disableAcceleration + vmflags_diskUUIDEnabled + vmflags_enableLogging + vmflags_htSharing + vmflags_monitorType + vmflags_recordReplayEnabled + vmflags_snapshotLocked + vmflags_snapshotPowerOffBehavior + vmflags_useToe + vmflags_virtualExecUsage + vmflags_virtualMMUUsage + vmflags_faultToleranceType
    no actions
    entities in Vmflags
}

//
// OCCI attribute 'disableAcceleration'
//
one sig vmflags_disableAcceleration extends Attribute {} {
    name = "disableAcceleration"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to turn off video acceleration for a virtual machine console window. "
    multiple_values = False
}

//
// OCCI attribute 'diskUUIDEnabled'
//
one sig vmflags_diskUUIDEnabled extends Attribute {} {
    name = "diskUUIDEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "false"
    description = "Indicates whether disk UUIDs are being used by this virtual machine. If this flag is set to false, disk UUIDs are not exposed to the guest.
    Since products before ESX 3.1 do not support disk UUIDs, moving virtual machines from a platform that supports UUID to a platform that does not support UUIDs could result in unspecified guest behavior. For virtual machines where the ability to move to older platforms is important, this flag should be set to false. If the value is unset, the behavior 'false' will be used."
    multiple_values = False
}

//
// OCCI attribute 'enableLogging'
//
one sig vmflags_enableLogging extends Attribute {} {
    name = "enableLogging"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to enable logging for a virtual machine."
    multiple_values = False
}

//
// OCCI attribute 'htSharing'
//
one sig vmflags_htSharing extends Attribute {} {
    name = "htSharing"
    type = VmHtSharing_DataType
    mutable = True
    required = False
    no default
    description = "Specifies how the VCPUs of a virtual machine are allowed to share physical cores on a hyperthreaded system. Two VCPUs are "sharing" a core if they are both running on logical CPUs of the core at the same time.
    See VirtualMachineHtSharing
    possible values : 
    any : VCPUs may freely share cores at any time with any other VCPUs (default for all virtual machines on a hyperthreaded system).
    internal : Similar to "none", in that VCPUs from this virtual machine will not be allowed to share cores with VCPUs from other virtual machines. However, other VCPUs from the same virtual machine will be allowed to share cores together. This configuration option is only permitted for SMP virtual machines. If applied to a uniprocessor virtual machine, it will be converted to the "none" sharing option. 
    none : VCPUs should not share cores with each other or with VCPUs from other virtual machines. That is, each VCPU from this virtual machine should always get a whole core to itself, with the other logical CPU on that core being placed into the "halted" state. "
    multiple_values = False
}

//
// OCCI attribute 'monitorType'
//
one sig vmflags_monitorType extends Attribute {} {
    name = "monitorType"
    type = VmMonitorType_DataType
    mutable = True
    required = False
    no default
    description = "vmx process type. See VirtualMachineFlagInfoMonitorType for possible values for this property.
    debug: Run vmx in debug mode
    release: Run vmx in default mode, matching the build type of vmkernel. 
    stats: Run vmx in stats mode."
    multiple_values = False
}

//
// OCCI attribute 'recordReplayEnabled'
//
one sig vmflags_recordReplayEnabled extends Attribute {} {
    name = "recordReplayEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether record and replay operations are allowed for this virtual machine. If this flag is set to 'true', instruction virtualization will use hardware virtualization (HV) support. I.e., virtualExecUsage will be set to 'hvOn'. If this flag is set to 'false' for a virtual machine that already has a recording, replay will be disallowed, though the recording will be preserved. If the value is unset, the behavior 'false' will be used."
    multiple_values = False
}

//
// OCCI attribute 'snapshotLocked'
//
one sig vmflags_snapshotLocked extends Attribute {} {
    name = "snapshotLocked"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether the snapshot tree is locked for this virtual machine."
    multiple_values = False
}

//
// OCCI attribute 'snapshotPowerOffBehavior'
//
one sig vmflags_snapshotPowerOffBehavior extends Attribute {} {
    name = "snapshotPowerOffBehavior"
    type = VmPowerOffBehavior_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the power-off behavior for a virtual machine that has a snapshot.
    If the value is unset, the behavior 'powerOff' will be used.
    powerOff: Just power off the virtual machine
    prompt: Prompt the user for instruction at power-off time.
    revert: Revert to the snapshot."
    multiple_values = False
}

//
// OCCI attribute 'useToe'
//
one sig vmflags_useToe extends Attribute {} {
    name = "useToe"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not to use TOE (TCP/IP Offloading). "
    multiple_values = False
}

//
// OCCI attribute 'virtualExecUsage'
//
one sig vmflags_virtualExecUsage extends Attribute {} {
    name = "virtualExecUsage"
    type = VmExecUsage_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether or not the system will try to use Hardware Virtualization (HV) support for instruction virtualization, if available.
    By default, VMware software will determine whether or not to use hardware virtualization support based on various factors such as the guest operating system type and the physical hardware. Certain workloads can benefit from explicitly turning hardware virtualization support on or off. If the value is unset, the value will default to hvAuto.
    VirtualMachineFlagInfoVirtualExecUsage represents the set of possible values.
    New processors can enable two hardware acceleration technologies for virtualization, one for instruction virtualization and the other for MMU virtualization. Intel names its hardware-assisted instruction virtualization as VT, and its hardware-assisted MMU virtualization as EPT. AMD calls them as AMD-V and RVI, respectively. For details on these technologies, please refer to documents from the processor vendors.
    virtualExecUsage controls instruction virtualization; while virtualMmuUsage controls MMU virtualization. "On" allows hardware acceleration, while "off" only allows software solution.
    There are four meaningful combinations.
    (hvAuto, automatic) - The host chooses which feature to use. (hvOn, on) - Use both VT/AMD-V and EPT/RVI. (hvOn, off) - Use VT/AMD-V but do not use EPT/RVI. (hvOff, off) - Do not use any of these hardware acceleration technologies.
    hvAuto: Determine automatically whether to use hardware virtualization (HV) support. 
    hvOff: Do not use hardware virtualization (HV) support. 
    hvOn: Use hardware virtualization (HV) support if the physical hardware supports it. 
    "
    multiple_values = False
}

//
// OCCI attribute 'virtualMMUUsage'
//
one sig vmflags_virtualMMUUsage extends Attribute {} {
    name = "virtualMMUUsage"
    type = VmMMUusage_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether or not the system will try to use nested page table hardware support, if available.
    By default, VMware software will determine whether or not to use nested page table hardware support based on various factors such as the guest operating system type and the physical hardware. Certain workloads can benefit from explicitly turning nested page table hardware support on or off; this can be set using nptUsage flag. If the value is unset, the value will default to automatic.
    VirtualMachineFlagInfoVirtualMmuUsage represents the set of possible values.
    automatic: Determine automatically whether to use nested page table hardware support.
    off: Do not use nested page table hardware support.
    on: Use nested paging hardware support if the physical hardware supports it."
    multiple_values = False
}

//
// OCCI attribute 'faultToleranceType'
//
one sig vmflags_faultToleranceType extends Attribute {} {
    name = "faultToleranceType"
    type = VmFaultToleranceType_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Vmflags
// ======================================================================

sig Vmflags in Vm {
    disableAcceleration : lone core/Boolean,
    diskUUIDEnabled : lone core/Boolean,
    enableLogging : lone core/Boolean,
    htSharing : lone VmHtSharing,
    monitorType : lone VmMonitorType,
    recordReplayEnabled : lone core/Boolean,
    snapshotLocked : lone core/Boolean,
    snapshotPowerOffBehavior : lone VmPowerOffBehavior,
    useToe : lone core/Boolean,
    virtualExecUsage : lone VmExecUsage,
    virtualMMUUsage : lone VmMMUusage,
    faultToleranceType : lone VmFaultToleranceType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networkshaper'
//
// ======================================================================

one sig networkshaper extends Mixin {} {
    term = "networkshaper"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Traffic shaping is used to configure the network utilization characteristics of a virtual machine."
    no depends
    applies = vm
    attributes = networkshaper_averageBPS + networkshaper_burstSize + networkshaper_enabled + networkshaper_peakBPS
    no actions
    entities in Networkshaper
}

//
// OCCI attribute 'averageBPS'
//
one sig networkshaper_averageBPS extends Attribute {} {
    name = "averageBPS"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Average bandwidth, in bits per second."
    multiple_values = False
}

//
// OCCI attribute 'burstSize'
//
one sig networkshaper_burstSize extends Attribute {} {
    name = "burstSize"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Burst size, in bytes."
    multiple_values = False
}

//
// OCCI attribute 'enabled'
//
one sig networkshaper_enabled extends Attribute {} {
    name = "enabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Is the shaper enabled? "
    multiple_values = False
}

//
// OCCI attribute 'peakBPS'
//
one sig networkshaper_peakBPS extends Attribute {} {
    name = "peakBPS"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Peak bandwidth, in bits per second."
    multiple_values = False
}

// ======================================================================
// Signature for Networkshaper
// ======================================================================

sig Networkshaper in Vm {
    averageBPS : lone LongNumber,
    burstSize : lone LongNumber,
    enabled : lone core/Boolean,
    peakBPS : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#npivconfig'
//
// ======================================================================

one sig npivconfig extends Mixin {} {
    term = "npivconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = npivconfig_npivDesiredNodeWwns + npivconfig_npivDesiredPortWwns + npivconfig_npivNodeWorldWideName + npivconfig_npivOnNonRdmDisks + npivconfig_npivPortWorldWideName + npivconfig_npivTemporaryDisabled + npivconfig_npivWorldWideNameType + npivconfig_npivWorldWideNameOp
    no actions
    entities in Npivconfig
}

//
// OCCI attribute 'npivDesiredNodeWwns'
//
one sig npivconfig_npivDesiredNodeWwns extends Attribute {} {
    name = "npivDesiredNodeWwns"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The NPIV node WWNs to be extended from the original list of WWN nummbers. This property should be set to desired number which is an aggregate of existing plus new numbers. Desired Node WWNs should always be greater than the existing number of node WWNs"
    multiple_values = False
}

//
// OCCI attribute 'npivDesiredPortWwns'
//
one sig npivconfig_npivDesiredPortWwns extends Attribute {} {
    name = "npivDesiredPortWwns"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The NPIV port WWNs to be extended from the original list of WWN nummbers. This property should be set to desired number which is an aggregate of existing plus new numbers. Desired Node WWNs should always be greater than the existing number of port WWNs"
    multiple_values = False
}

//
// OCCI attribute 'npivNodeWorldWideName'
//
one sig npivconfig_npivNodeWorldWideName extends Attribute {} {
    name = "npivNodeWorldWideName"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "A 64-bit node WWN (World Wide Name). These WWNs are paired with the npivPortWorldWideName to be used by the NPIV VPORTs instantiated for the virtual machine on the physical HBAs of the host. A pair of node and port WWNs serves as a unique identifier in accessing a LUN, so that it can be monitored or controlled by the storage administrator.
    If this property contains a single node WWN, the same node WWN is used to pair with all port WWNs listed in npivPortWorldWideName. If this property or npivPortWorldWideName is empty or unset, NPIV WWN is disabled for the virtual machine."
    multiple_values = True
}

//
// OCCI attribute 'npivOnNonRdmDisks'
//
one sig npivconfig_npivOnNonRdmDisks extends Attribute {} {
    name = "npivOnNonRdmDisks"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "This property is used to check whether the NPIV can be enabled on the Virtual machine with non-rdm disks in the configuration, so this is potentially not enabling npiv on vmfs disks. Also this property is used to check whether RDM is required to generate WWNs for a virtual machine."
    multiple_values = False
}

//
// OCCI attribute 'npivPortWorldWideName'
//
one sig npivconfig_npivPortWorldWideName extends Attribute {} {
    name = "npivPortWorldWideName"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "A 64-bit port WWN (World Wide Name). For detail description on WWN, see npivNodeWorldWideName."
    multiple_values = True
}

//
// OCCI attribute 'npivTemporaryDisabled'
//
one sig npivconfig_npivTemporaryDisabled extends Attribute {} {
    name = "npivTemporaryDisabled"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "This property is used to enable or disable the NPIV capability on a desired virtual machine on a temporary basis. When this property is set NPIV Vport will not be instantiated by the VMX process of the Virtual Machine. When this property is set port WWNs and node WWNs in the VM configuration are preserved."
    multiple_values = False
}

//
// OCCI attribute 'npivWorldWideNameType'
//
one sig npivconfig_npivWorldWideNameType extends Attribute {} {
    name = "npivWorldWideNameType"
    type = NpivWwnType_DataType
    mutable = False
    required = False
    no default
    description = "The source that provides/generates the assigned WWNs.
    external: This set of WWNs is provided by the client. 
    host: This set of WWNs is generated by Host Agent. 
    vc: This set of WWNs is generated by VC server. 
    It is only set by vcenter"
    multiple_values = False
}

//
// OCCI attribute 'npivWorldWideNameOp'
//
one sig npivconfig_npivWorldWideNameOp extends Attribute {} {
    name = "npivWorldWideNameOp"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate what type of NPIV WWN operation is going to be performed on the virtual machine. If unset, it indicates no change to existing NPIV WWN assignment (or not assigned) in the virtual machine.
    Reconfigure privilege: VirtualMachine.Config.Settings."
    multiple_values = False
}

// ======================================================================
// Signature for Npivconfig
// ======================================================================

sig Npivconfig in Vm {
    npivDesiredNodeWwns : lone ShortNumber,
    npivDesiredPortWwns : lone ShortNumber,
    npivNodeWorldWideName : lone LongNumber,
    npivOnNonRdmDisks : lone core/Boolean,
    npivPortWorldWideName : lone LongNumber,
    npivTemporaryDisabled : lone String,
    npivWorldWideNameType : lone NpivWwnType,
    npivWorldWideNameOp : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#cpufeaturemask'
//
// ======================================================================

one sig cpufeaturemask extends Mixin {} {
    term = "cpufeaturemask"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Specifies the CPU feature compatibility masks.Reconfigure privilege: VirtualMachine.Config.Settings"
    no depends
    applies = vm
    attributes = cpufeaturemask_eax + cpufeaturemask_ebx + cpufeaturemask_ecx + cpufeaturemask_edx + cpufeaturemask_level + cpufeaturemask_vendor
    no actions
    entities in Cpufeaturemask
}

//
// OCCI attribute 'eax'
//
one sig cpufeaturemask_eax extends Attribute {} {
    name = "eax"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "String representing the required EAX bits. "
    multiple_values = False
}

//
// OCCI attribute 'ebx'
//
one sig cpufeaturemask_ebx extends Attribute {} {
    name = "ebx"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "String representing the required EBX bits. "
    multiple_values = False
}

//
// OCCI attribute 'ecx'
//
one sig cpufeaturemask_ecx extends Attribute {} {
    name = "ecx"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "String representing the required ECX bits. "
    multiple_values = False
}

//
// OCCI attribute 'edx'
//
one sig cpufeaturemask_edx extends Attribute {} {
    name = "edx"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "String representing the required EDX bits. "
    multiple_values = False
}

//
// OCCI attribute 'level'
//
one sig cpufeaturemask_level extends Attribute {} {
    name = "level"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Level (EAX input to CPUID)."
    multiple_values = False
}

//
// OCCI attribute 'vendor'
//
one sig cpufeaturemask_vendor extends Attribute {} {
    name = "vendor"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Used if this mask is for a particular vendor. "
    multiple_values = False
}

// ======================================================================
// Signature for Cpufeaturemask
// ======================================================================

sig Cpufeaturemask in Vm {
    eax : lone String,
    ebx : lone String,
    ecx : lone String,
    edx : lone String,
    level : lone core/Number,
    vendor : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#extraconfig'
//
// ======================================================================

one sig extraconfig extends Mixin {} {
    term = "extraconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Additional configuration information for the virtual machine.This describes a set of modifications to the additional options. An option is removed if the key is present but the value is not set or the value is an empty string. Otherwise, the key is set to the new value.Configuration keys that would conflict with parameters that are explicitly configurable through other fields in the ConfigSpec object are silently ignored.Reconfigure privilege: VirtualMachine.Config.AdvancedConfig (also required when setting this property while creating a virtual machine) "
    depends = vmconfig
    no applies
    attributes = extraconfig_key + extraconfig_value
    no actions
    entities in Extraconfig
}

//
// OCCI attribute 'key'
//
one sig extraconfig_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The name of the option using dot notation to reflect the option's position in a hierarchy. For example, you might have an option called "Ethernet" and another option that is a child of that called "Connection". In this case, the key for the latter could be defined as "Ethernet.Connection""
    multiple_values = True
}

//
// OCCI attribute 'value'
//
one sig extraconfig_value extends Attribute {} {
    name = "value"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The value of the option. The Any data object type enables you to define any value for the option. Typically, however, the value of an option is of type String or Integer. "
    multiple_values = True
}

// ======================================================================
// Signature for Extraconfig
// ======================================================================

sig Extraconfig in core/Entity {
    key : lone String,
    value : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmfileconfig'
//
// ======================================================================

one sig vmfileconfig extends Mixin {} {
    term = "vmfileconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = vmfileconfig_snapshotDirectory + vmfileconfig_vmPathName + vmfileconfig_suspendDirectory + vmfileconfig_logDirectory + vmfileconfig_ftMetadataDirectory
    no actions
    entities in Vmfileconfig
}

//
// OCCI attribute 'snapshotDirectory'
//
one sig vmfileconfig_snapshotDirectory extends Attribute {} {
    name = "snapshotDirectory"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Path name of the directory that holds suspend and snapshot files belonging to the virtual machine. Prior to vSphere 5.0, this directory also holds snapshot redo files. Starting with vSphere 5.0, the redo files will stay in the same directory as the snapshotted disk, thus this directory will no longer hold the snapshot redo files.
    This path name defaults to the same directory as the configuration file.
    ESX Server requires this to indicate a VMFS volume or NAS volume (for ESX Server 3). In case the configuration file is not stored on VMFS or NAS, this property must be set explicitly.
    See VirtualMachineFileInfo"
    multiple_values = False
}

//
// OCCI attribute 'vmPathName'
//
one sig vmfileconfig_vmPathName extends Attribute {} {
    name = "vmPathName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Path name to the configuration file for the virtual machine, e.g., the .vmx file. 
    This also implicitly defines the configuration directory.
    See VirtualMachineFileInfo"
    multiple_values = False
}

//
// OCCI attribute 'suspendDirectory'
//
one sig vmfileconfig_suspendDirectory extends Attribute {} {
    name = "suspendDirectory"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Some products allow the suspend directory to be different than the snapshot directory. 
    On products where this is not possible, setting of this property is ignored. 
    See VirtualMachineFileInfo"
    multiple_values = False
}

//
// OCCI attribute 'logDirectory'
//
one sig vmfileconfig_logDirectory extends Attribute {} {
    name = "logDirectory"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Directory to store the log files for the virtual machine. If not specified, this defaults to the same directory as the configuration file
    See VirtualMachineFileInfo"
    multiple_values = False
}

//
// OCCI attribute 'ftMetadataDirectory'
//
one sig vmfileconfig_ftMetadataDirectory extends Attribute {} {
    name = "ftMetadataDirectory"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Directory to store the fault tolerance meta data files for the virtual machine."
    multiple_values = False
}

// ======================================================================
// Signature for Vmfileconfig
// ======================================================================

sig Vmfileconfig in Vm {
    snapshotDirectory : lone String,
    vmPathName : lone String,
    suspendDirectory : lone String,
    logDirectory : lone String,
    ftMetadataDirectory : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#guestconfig'
//
// ======================================================================

one sig guestconfig extends Mixin {} {
    term = "guestconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = guestconfig_alternateGuestName + guestconfig_smbiosUUID + guestconfig_firmware + guestconfig_guestAutoLockEnabled
    no actions
    entities in Guestconfig
}

//
// OCCI attribute 'alternateGuestName'
//
one sig guestconfig_alternateGuestName extends Attribute {} {
    name = "alternateGuestName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Used as display name for the operating system if guestId is other or other-64."
    multiple_values = False
}

//
// OCCI attribute 'smbiosUUID'
//
one sig guestconfig_smbiosUUID extends Attribute {} {
    name = "smbiosUUID"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "128-bit SMBIOS UUID of a virtual machine represented as a hexadecimal string in "12345678-abcd-1234-cdef-123456789abc" format"
    multiple_values = False
}

//
// OCCI attribute 'firmware'
//
one sig guestconfig_firmware extends Attribute {} {
    name = "firmware"
    type = GuestFirmwareType_DataType
    mutable = True
    required = False
    no default
    description = "Information about firmware type for this Virtual Machine. Possible values are described in GuestOsDescriptorFirmwareType
    Since vSphere API 5.0"
    multiple_values = False
}

//
// OCCI attribute 'guestAutoLockEnabled'
//
one sig guestconfig_guestAutoLockEnabled extends Attribute {} {
    name = "guestAutoLockEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether the guest operating system will logout any active sessions whenever there are no remote display connections open to the virtual machine."
    multiple_values = False
}

// ======================================================================
// Signature for Guestconfig
// ======================================================================

sig Guestconfig in Vm {
    alternateGuestName : lone String,
    smbiosUUID : lone String,
    firmware : lone GuestFirmwareType,
    guestAutoLockEnabled : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#toolsconfig'
//
// ======================================================================

one sig toolsconfig extends Mixin {} {
    term = "toolsconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = toolsconfig_afterPowerOn + toolsconfig_afterResume + toolsconfig_beforeGuestReboot + toolsconfig_beforeGuestShutdown + toolsconfig_beforeGuestStandby + toolsconfig_pendingCustomization + toolsconfig_synctimeWithHost + toolsconfig_toolsUpgradePolicy + toolsconfig_toolsVersion
    no actions
    entities in Toolsconfig
}

//
// OCCI attribute 'afterPowerOn'
//
one sig toolsconfig_afterPowerOn extends Attribute {} {
    name = "afterPowerOn"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not scripts should run after the virtual machine powers on."
    multiple_values = False
}

//
// OCCI attribute 'afterResume'
//
one sig toolsconfig_afterResume extends Attribute {} {
    name = "afterResume"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not scripts should run after the virtual machine resumes. "
    multiple_values = False
}

//
// OCCI attribute 'beforeGuestReboot'
//
one sig toolsconfig_beforeGuestReboot extends Attribute {} {
    name = "beforeGuestReboot"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not scripts should run before the virtual machine reboots. "
    multiple_values = False
}

//
// OCCI attribute 'beforeGuestShutdown'
//
one sig toolsconfig_beforeGuestShutdown extends Attribute {} {
    name = "beforeGuestShutdown"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not scripts should run before the virtual machine powers off. "
    multiple_values = False
}

//
// OCCI attribute 'beforeGuestStandby'
//
one sig toolsconfig_beforeGuestStandby extends Attribute {} {
    name = "beforeGuestStandby"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not scripts should run before the virtual machine suspends."
    multiple_values = False
}

//
// OCCI attribute 'pendingCustomization'
//
one sig toolsconfig_pendingCustomization extends Attribute {} {
    name = "pendingCustomization"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "When set, this indicates that a customization operation is pending on the VM. The value represents the filename of the customization package on the host."
    multiple_values = False
}

//
// OCCI attribute 'synctimeWithHost'
//
one sig toolsconfig_synctimeWithHost extends Attribute {} {
    name = "synctimeWithHost"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether or not the tools program will sync time with the host time"
    multiple_values = False
}

//
// OCCI attribute 'toolsUpgradePolicy'
//
one sig toolsconfig_toolsUpgradePolicy extends Attribute {} {
    name = "toolsUpgradePolicy"
    type = ToolsUpgradePolicy_DataType
    mutable = True
    required = False
    no default
    description = "Tools upgrade policy setting for the virtual machine.
    manual: No auto-upgrades for tools will be performed for this virtual machine. Users must manually invoke the UpgradeTools operation to update the tools.
    upgradeAtPowerCycle: When the virtual machine is power-cycled, the system checks for a newer version of tools when the VM comes back up. If it is available, a tools upgrade is automatically performed on the virtual machine and it is rebooted if necessary."
    multiple_values = False
}

//
// OCCI attribute 'toolsVersion'
//
one sig toolsconfig_toolsVersion extends Attribute {} {
    name = "toolsVersion"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Version of VMware Tools installed on the guest operating system. "
    multiple_values = False
}

// ======================================================================
// Signature for Toolsconfig
// ======================================================================

sig Toolsconfig in Vm {
    afterPowerOn : lone core/Boolean,
    afterResume : lone core/Boolean,
    beforeGuestReboot : lone core/Boolean,
    beforeGuestShutdown : lone core/Boolean,
    beforeGuestStandby : lone core/Boolean,
    pendingCustomization : lone String,
    synctimeWithHost : lone core/Boolean,
    toolsUpgradePolicy : lone ToolsUpgradePolicy,
    toolsVersion : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostserviceticket'
//
// ======================================================================

one sig hostserviceticket extends Mixin {} {
    term = "hostserviceticket"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostserviceticket_name + hostserviceticket_sessionid + hostserviceticket_port + hostserviceticket_service + hostserviceticket_serviceVersion + hostserviceticket_sslThumbPrint
    actions = hostserviceticket_acquirecimservicesticket
    entities in Hostserviceticket
}

//
// OCCI attribute 'name'
//
one sig hostserviceticket_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The name of the host providing the service for which the ticket applies. If omitted, then the client uses the host name for the server that issued the ticket. "
    multiple_values = False
}

//
// OCCI attribute 'sessionid'
//
one sig hostserviceticket_sessionid extends Attribute {} {
    name = "sessionid"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "An identifying string for the session created for the ticketed connection. This is used by the host service to identify the operations permitted within the session. "
    multiple_values = False
}

//
// OCCI attribute 'port'
//
one sig hostserviceticket_port extends Attribute {} {
    name = "port"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Access to some services is made possible by connecting to a port on a server. If the service for which a ticket is issued is available on a particular port, that port number is specified with this property. If omitted, except in the case of connecting to CIM interfaces, the port number for the service that issued the ticket is used. In the case of connecting to a CIM interface the standard well known port for the particular service will be used for the connection. "
    multiple_values = False
}

//
// OCCI attribute 'service'
//
one sig hostserviceticket_service extends Attribute {} {
    name = "service"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The name of the service to which to connect. "
    multiple_values = False
}

//
// OCCI attribute 'serviceVersion'
//
one sig hostserviceticket_serviceVersion extends Attribute {} {
    name = "serviceVersion"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "A dot-separated string identifying the service protocol version. For example, 1.0 is used for NFC hosted by vpxa on ESX 2.5, and 1.1 is used for NFC hosted by hostd on ESX 3.0. "
    multiple_values = False
}

//
// OCCI attribute 'sslThumbPrint'
//
one sig hostserviceticket_sslThumbPrint extends Attribute {} {
    name = "sslThumbPrint"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The expected thumbprint of the SSL cert of the host to which we are connecting."
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostserviceticket/action#acquirecimservicesticket'
//
one sig hostserviceticket_acquirecimservicesticket extends Action {} {
    term = "acquirecimservicesticket"
    scheme = "http://occiware.org/occi/vmware/hostserviceticket/action#"
    title = "Creates and returns a one-time credential used to establish a remote connection to a CIM interface. The port to connect to is the standard well known port for the service."
    no attributes
}


// ======================================================================
// Signature for Hostserviceticket
// ======================================================================

sig Hostserviceticket in Hostsystem {
    name : lone String,
    sessionid : lone String,
    port : lone core/Number,
    service : lone String,
    serviceVersion : lone String,
    sslThumbPrint : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#sharesconfig'
//
// ======================================================================

one sig sharesconfig extends Mixin {} {
    term = "sharesconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = resourcepool
    attributes = sharesconfig_type + sharesconfig_name
    no actions
    entities in Sharesconfig
}

//
// OCCI attribute 'type'
//
one sig sharesconfig_type extends Attribute {} {
    name = "type"
    type = ResourceAllocationType_DataType
    mutable = True
    required = True
    no default
    description = "Resource allocation type to define (cpu, memory or network)"
    multiple_values = False
}

//
// OCCI attribute 'name'
//
one sig sharesconfig_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Sharesconfig
// ======================================================================

sig Sharesconfig in Resourcepool {
    type : one ResourceAllocationType,
    name : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmcapability'
//
// ======================================================================

one sig vmcapability extends Mixin {} {
    term = "vmcapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = vmcapability_cpuFeatureMaskSupported + vmcapability_s1acpiManagementSupported + vmcapability_toolsAutoUpdateSupported + vmcapability_multipleSnapshotSupported + vmcapability_snapshotOperationsSupported + vmcapability_snapshotConfigSupported + vmcapability_quiescedSnapshotsSupported + vmcapability_poweredOffSnapshotsSupported + vmcapability_settingScreenResolutionSupported + vmcapability_consolePreferenceSupported + vmcapability_revertToSnapshotSupported + vmcapability_memorySnapshotsSupported
    no actions
    entities in Vmcapability
}

//
// OCCI attribute 'cpuFeatureMaskSupported'
//
one sig vmcapability_cpuFeatureMaskSupported extends Attribute {} {
    name = "cpuFeatureMaskSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 's1acpiManagementSupported'
//
one sig vmcapability_s1acpiManagementSupported extends Attribute {} {
    name = "s1acpiManagementSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'toolsAutoUpdateSupported'
//
one sig vmcapability_toolsAutoUpdateSupported extends Attribute {} {
    name = "toolsAutoUpdateSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'multipleSnapshotSupported'
//
one sig vmcapability_multipleSnapshotSupported extends Attribute {} {
    name = "multipleSnapshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'snapshotOperationsSupported'
//
one sig vmcapability_snapshotOperationsSupported extends Attribute {} {
    name = "snapshotOperationsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'snapshotConfigSupported'
//
one sig vmcapability_snapshotConfigSupported extends Attribute {} {
    name = "snapshotConfigSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'quiescedSnapshotsSupported'
//
one sig vmcapability_quiescedSnapshotsSupported extends Attribute {} {
    name = "quiescedSnapshotsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'poweredOffSnapshotsSupported'
//
one sig vmcapability_poweredOffSnapshotsSupported extends Attribute {} {
    name = "poweredOffSnapshotsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'settingScreenResolutionSupported'
//
one sig vmcapability_settingScreenResolutionSupported extends Attribute {} {
    name = "settingScreenResolutionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'consolePreferenceSupported'
//
one sig vmcapability_consolePreferenceSupported extends Attribute {} {
    name = "consolePreferenceSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'revertToSnapshotSupported'
//
one sig vmcapability_revertToSnapshotSupported extends Attribute {} {
    name = "revertToSnapshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'memorySnapshotsSupported'
//
one sig vmcapability_memorySnapshotsSupported extends Attribute {} {
    name = "memorySnapshotsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Vmcapability
// ======================================================================

sig Vmcapability in Vm {
    cpuFeatureMaskSupported : lone core/Boolean,
    s1acpiManagementSupported : lone core/Boolean,
    toolsAutoUpdateSupported : lone core/Boolean,
    multipleSnapshotSupported : lone core/Boolean,
    snapshotOperationsSupported : lone core/Boolean,
    snapshotConfigSupported : lone core/Boolean,
    quiescedSnapshotsSupported : lone core/Boolean,
    poweredOffSnapshotsSupported : lone core/Boolean,
    settingScreenResolutionSupported : lone core/Boolean,
    consolePreferenceSupported : lone core/Boolean,
    revertToSnapshotSupported : lone core/Boolean,
    memorySnapshotsSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#resourcepoolallocation'
//
// ======================================================================

one sig resourcepoolallocation extends Mixin {} {
    term = "resourcepoolallocation"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = resourcepool
    attributes = resourcepoolallocation_cpuReservationUsed + resourcepoolallocation_cpuUnreservedForVm + resourcepoolallocation_memReservationUsed + resourcepoolallocation_cpuOverallUsage + resourcepoolallocation_memUnreservedForVm + resourcepoolallocation_memReservationUsedforVm + resourcepoolallocation_memOverallUsage + resourcepoolallocation_cpuMaxUsage + resourcepoolallocation_memMaxUsage + resourcepoolallocation_cpuUnereservedForPool + resourcepoolallocation_cpuReservationUsedForVm + resourcepoolallocation_memUnereservedForPool
    no actions
    entities in Resourcepoolallocation
}

//
// OCCI attribute 'cpuReservationUsed'
//
one sig resourcepoolallocation_cpuReservationUsed extends Attribute {} {
    name = "cpuReservationUsed"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources that have been used to satisfy the reservation requirements of all descendants of this resource pool (includes both resource pools and virtual machines). "
    multiple_values = False
}

//
// OCCI attribute 'cpuUnreservedForVm'
//
one sig resourcepoolallocation_cpuUnreservedForVm extends Attribute {} {
    name = "cpuUnreservedForVm"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources available to satisfy a reservation for a child virtual machine. In general, this should be the same as unreservedForPool. However, in the overcommitted case, this is limited by the remaining available resources at the root node"
    multiple_values = False
}

//
// OCCI attribute 'memReservationUsed'
//
one sig resourcepoolallocation_memReservationUsed extends Attribute {} {
    name = "memReservationUsed"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources that have been used to satisfy the reservation requirements of all descendants of this resource pool (includes both resource pools and virtual machines). "
    multiple_values = False
}

//
// OCCI attribute 'cpuOverallUsage'
//
one sig resourcepoolallocation_cpuOverallUsage extends Attribute {} {
    name = "cpuOverallUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'memUnreservedForVm'
//
one sig resourcepoolallocation_memUnreservedForVm extends Attribute {} {
    name = "memUnreservedForVm"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources available to satisfy a reservation for a child virtual machine. In general, this should be the same as unreservedForPool. However, in the overcommitted case, this is limited by the remaining available resources at the root node"
    multiple_values = False
}

//
// OCCI attribute 'memReservationUsedforVm'
//
one sig resourcepoolallocation_memReservationUsedforVm extends Attribute {} {
    name = "memReservationUsedforVm"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources that have been used to satisfy the reservation requirements of running virtual machines in this resource pool or any of its child resource pools. "
    multiple_values = False
}

//
// OCCI attribute 'memOverallUsage'
//
one sig resourcepoolallocation_memOverallUsage extends Attribute {} {
    name = "memOverallUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'cpuMaxUsage'
//
one sig resourcepoolallocation_cpuMaxUsage extends Attribute {} {
    name = "cpuMaxUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Current upper-bound on usage. The upper-bound is based on the limit configured on this resource pool, as well as limits configured on any parent resource pool"
    multiple_values = False
}

//
// OCCI attribute 'memMaxUsage'
//
one sig resourcepoolallocation_memMaxUsage extends Attribute {} {
    name = "memMaxUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Current upper-bound on usage. The upper-bound is based on the limit configured on this resource pool, as well as limits configured on any parent resource pool"
    multiple_values = False
}

//
// OCCI attribute 'cpuUnereservedForPool'
//
one sig resourcepoolallocation_cpuUnereservedForPool extends Attribute {} {
    name = "cpuUnereservedForPool"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'cpuReservationUsedForVm'
//
one sig resourcepoolallocation_cpuReservationUsedForVm extends Attribute {} {
    name = "cpuReservationUsedForVm"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Total amount of resources that have been used to satisfy the reservation requirements of running virtual machines in this resource pool or any of its child resource pools. "
    multiple_values = False
}

//
// OCCI attribute 'memUnereservedForPool'
//
one sig resourcepoolallocation_memUnereservedForPool extends Attribute {} {
    name = "memUnereservedForPool"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Resourcepoolallocation
// ======================================================================

sig Resourcepoolallocation in Resourcepool {
    cpuReservationUsed : lone LongNumber,
    cpuUnreservedForVm : lone LongNumber,
    memReservationUsed : lone LongNumber,
    cpuOverallUsage : lone LongNumber,
    memUnreservedForVm : lone LongNumber,
    memReservationUsedforVm : lone LongNumber,
    memOverallUsage : lone LongNumber,
    cpuMaxUsage : lone LongNumber,
    memMaxUsage : lone LongNumber,
    cpuUnereservedForPool : lone LongNumber,
    cpuReservationUsedForVm : lone LongNumber,
    memUnereservedForPool : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#resourcepoolquickstats'
//
// ======================================================================

one sig resourcepoolquickstats extends Mixin {} {
    term = "resourcepoolquickstats"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = resourcepool
    attributes = resourcepoolquickstats_staticMemoryEntitlement + resourcepoolquickstats_overallCPUDemand + resourcepoolquickstats_compressedMemory + resourcepoolquickstats_staticCPUEntitlement + resourcepoolquickstats_guestMemoryUsage + resourcepoolquickstats_sharedMemory + resourcepoolquickstats_consumedOverheadMemory + resourcepoolquickstats_balloonedMemory + resourcepoolquickstats_overallCPUUsage + resourcepoolquickstats_swappedMemory + resourcepoolquickstats_configuredMemoryMB + resourcepoolquickstats_overheadMemory + resourcepoolquickstats_privateMemory + resourcepoolquickstats_distributedCPUEntitlement + resourcepoolquickstats_hostMemoryUsage
    no actions
    entities in Resourcepoolquickstats
}

//
// OCCI attribute 'staticMemoryEntitlement'
//
one sig resourcepoolquickstats_staticMemoryEntitlement extends Attribute {} {
    name = "staticMemoryEntitlement"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The static memory resource entitlement for a virtual machine. This value is calculated based on this virtual machine's resource reservations, shares and limit, and doesn't take into account current usage. This is the worst case memory allocation for this virtual machine, that is, the amount of memory this virtual machine would receive if all virtual machines running in the cluster went to maximum consumption. Units are MB. "
    multiple_values = False
}

//
// OCCI attribute 'overallCPUDemand'
//
one sig resourcepoolquickstats_overallCPUDemand extends Attribute {} {
    name = "overallCPUDemand"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Basic CPU performance statistics, in MHz. "
    multiple_values = False
}

//
// OCCI attribute 'compressedMemory'
//
one sig resourcepoolquickstats_compressedMemory extends Attribute {} {
    name = "compressedMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The amount of compressed memory currently consumed by VM, in KB."
    multiple_values = False
}

//
// OCCI attribute 'staticCPUEntitlement'
//
one sig resourcepoolquickstats_staticCPUEntitlement extends Attribute {} {
    name = "staticCPUEntitlement"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The static CPU resource entitlement for a virtual machine. This value is calculated based on this virtual machine's resource reservations, shares and limit, and doesn't take into account current usage. This is the worst case CPU allocation for this virtual machine, that is, the amount of CPU resource this virtual machine would receive if all virtual machines running in the cluster went to maximum consumption. Units are MHz. "
    multiple_values = False
}

//
// OCCI attribute 'guestMemoryUsage'
//
one sig resourcepoolquickstats_guestMemoryUsage extends Attribute {} {
    name = "guestMemoryUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Guest memory utilization statistics, in MB. This is also known as active guest memory. The number can be between 0 and the configured memory size of a virtual machine. "
    multiple_values = False
}

//
// OCCI attribute 'sharedMemory'
//
one sig resourcepoolquickstats_sharedMemory extends Attribute {} {
    name = "sharedMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The portion of memory, in MB, that is granted to a virtual machine from host memory that is shared between VMs. "
    multiple_values = False
}

//
// OCCI attribute 'consumedOverheadMemory'
//
one sig resourcepoolquickstats_consumedOverheadMemory extends Attribute {} {
    name = "consumedOverheadMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The amount of overhead memory, in MB, currently being consumed to run a VM. This value is limited by the overhead memory reservation for a VM, stored in overheadMemory. "
    multiple_values = False
}

//
// OCCI attribute 'balloonedMemory'
//
one sig resourcepoolquickstats_balloonedMemory extends Attribute {} {
    name = "balloonedMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The size of the balloon driver in a virtual machine, in MB. The host will inflate the balloon driver to reclaim physical memory from a virtual machine. This is a sign that there is memory pressure on the host. "
    multiple_values = False
}

//
// OCCI attribute 'overallCPUUsage'
//
one sig resourcepoolquickstats_overallCPUUsage extends Attribute {} {
    name = "overallCPUUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Basic CPU performance statistics, in MHz. "
    multiple_values = False
}

//
// OCCI attribute 'swappedMemory'
//
one sig resourcepoolquickstats_swappedMemory extends Attribute {} {
    name = "swappedMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The portion of memory, in MB, that is granted to a virtual machine from the host's swap space. This is a sign that there is memory pressure on the host. "
    multiple_values = False
}

//
// OCCI attribute 'configuredMemoryMB'
//
one sig resourcepoolquickstats_configuredMemoryMB extends Attribute {} {
    name = "configuredMemoryMB"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Total configured memory of all virtual machines in the resource pool, in MB
    See ResourcePoolSummary"
    multiple_values = False
}

//
// OCCI attribute 'overheadMemory'
//
one sig resourcepoolquickstats_overheadMemory extends Attribute {} {
    name = "overheadMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The amount of memory resource (in MB) that will be used by a virtual machine above its guest memory requirements. This value is set if and only if a virtual machine is registered on a host that supports memory resource allocation features. For powered off VMs, this is the minimum overhead required to power on the VM on the registered host. For powered on VMs, this is the current overhead reservation, a value which is almost always larger than the minimum overhead, and which grows with time.
    See QueryMemoryOverheadEx"
    multiple_values = False
}

//
// OCCI attribute 'privateMemory'
//
one sig resourcepoolquickstats_privateMemory extends Attribute {} {
    name = "privateMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The portion of memory, in MB, that is granted to a virtual machine from non-shared host memory."
    multiple_values = False
}

//
// OCCI attribute 'distributedCPUEntitlement'
//
one sig resourcepoolquickstats_distributedCPUEntitlement extends Attribute {} {
    name = "distributedCPUEntitlement"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "This is the amount of memory, in MB, that this VM is entitled to, as calculated by DRS. Valid only for a VM managed by DRS"
    multiple_values = False
}

//
// OCCI attribute 'hostMemoryUsage'
//
one sig resourcepoolquickstats_hostMemoryUsage extends Attribute {} {
    name = "hostMemoryUsage"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Host memory utilization statistics, in MB. This is also known as consummed host memory. This is between 0 and the configured resource limit. Valid while a virtual machine is running. This includes the overhead memory of a virtual machine. "
    multiple_values = False
}

// ======================================================================
// Signature for Resourcepoolquickstats
// ======================================================================

sig Resourcepoolquickstats in Resourcepool {
    staticMemoryEntitlement : lone core/Number,
    overallCPUDemand : lone LongNumber,
    compressedMemory : lone LongNumber,
    staticCPUEntitlement : lone core/Number,
    guestMemoryUsage : lone LongNumber,
    sharedMemory : lone LongNumber,
    consumedOverheadMemory : lone LongNumber,
    balloonedMemory : lone LongNumber,
    overallCPUUsage : lone LongNumber,
    swappedMemory : lone LongNumber,
    configuredMemoryMB : lone core/Number,
    overheadMemory : lone LongNumber,
    privateMemory : lone LongNumber,
    distributedCPUEntitlement : lone LongNumber,
    hostMemoryUsage : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthardwareinfo'
//
// ======================================================================

one sig hosthardwareinfo extends Mixin {} {
    term = "hosthardwareinfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hosthardwareinfo_otherIdentifierType + hosthardwareinfo_otherIdentifierValues + hosthardwareinfo_cpuThreads + hosthardwareinfo_cpuModel + hosthardwareinfo_nics + hosthardwareinfo_cpus + hosthardwareinfo_vendor + hosthardwareinfo_model + hosthardwareinfo_hbas + hosthardwareinfo_biosUUID + hosthardwareinfo_biosVersion + hosthardwareinfo_biosReleaseDate
    no actions
    entities in Hosthardwareinfo
}

//
// OCCI attribute 'otherIdentifierType'
//
one sig hosthardwareinfo_otherIdentifierType extends Attribute {} {
    name = "otherIdentifierType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Other identification information. This information may be vendor specific."
    multiple_values = True
}

//
// OCCI attribute 'otherIdentifierValues'
//
one sig hosthardwareinfo_otherIdentifierValues extends Attribute {} {
    name = "otherIdentifierValues"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Other identification information. This information may be vendor specific."
    multiple_values = True
}

//
// OCCI attribute 'cpuThreads'
//
one sig hosthardwareinfo_cpuThreads extends Attribute {} {
    name = "cpuThreads"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "Number of physical CPU threads on the host"
    multiple_values = False
}

//
// OCCI attribute 'cpuModel'
//
one sig hosthardwareinfo_cpuModel extends Attribute {} {
    name = "cpuModel"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The CPU model. "
    multiple_values = False
}

//
// OCCI attribute 'nics'
//
one sig hosthardwareinfo_nics extends Attribute {} {
    name = "nics"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'cpus'
//
one sig hosthardwareinfo_cpus extends Attribute {} {
    name = "cpus"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "Number of physical CPU packages on the host. Physical CPU packages are chips that contain one or more processors. Processors contained by a package are also known as CPU cores. For example, one dual-core package is comprised of one chip that contains two CPU cores. "
    multiple_values = False
}

//
// OCCI attribute 'vendor'
//
one sig hosthardwareinfo_vendor extends Attribute {} {
    name = "vendor"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The hardware vendor identification"
    multiple_values = False
}

//
// OCCI attribute 'model'
//
one sig hosthardwareinfo_model extends Attribute {} {
    name = "model"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The system model identification. "
    multiple_values = False
}

//
// OCCI attribute 'hbas'
//
one sig hosthardwareinfo_hbas extends Attribute {} {
    name = "hbas"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The number of host bus adapters (HBAs). "
    multiple_values = False
}

//
// OCCI attribute 'biosUUID'
//
one sig hosthardwareinfo_biosUUID extends Attribute {} {
    name = "biosUUID"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The hardware BIOS identification"
    multiple_values = False
}

//
// OCCI attribute 'biosVersion'
//
one sig hosthardwareinfo_biosVersion extends Attribute {} {
    name = "biosVersion"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The current BIOS version of the physical chassis"
    multiple_values = False
}

//
// OCCI attribute 'biosReleaseDate'
//
one sig hosthardwareinfo_biosReleaseDate extends Attribute {} {
    name = "biosReleaseDate"
    type = Datetype_DataType
    mutable = False
    required = False
    no default
    description = "The release date for the BIOS"
    multiple_values = False
}

// ======================================================================
// Signature for Hosthardwareinfo
// ======================================================================

sig Hosthardwareinfo in Hostsystem {
    otherIdentifierType : lone String,
    otherIdentifierValues : lone String,
    cpuThreads : lone ShortNumber,
    cpuModel : lone String,
    nics : lone core/Number,
    cpus : lone ShortNumber,
    vendor : lone String,
    model : lone String,
    hbas : lone core/Number,
    biosUUID : lone String,
    biosVersion : lone String,
    biosReleaseDate : lone Datetype,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostaboutinfo'
//
// ======================================================================

one sig hostaboutinfo extends Mixin {} {
    term = "hostaboutinfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostaboutinfo_apiType + hostaboutinfo_apiVersion + hostaboutinfo_build + hostaboutinfo_fullname + hostaboutinfo_localeBuild + hostaboutinfo_localeVersion + hostaboutinfo_shortname + hostaboutinfo_osType + hostaboutinfo_productLineId + hostaboutinfo_vendorName + hostaboutinfo_productVersion
    no actions
    entities in Hostaboutinfo
}

//
// OCCI attribute 'apiType'
//
one sig hostaboutinfo_apiType extends Attribute {} {
    name = "apiType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not the service instance represents a standalone host. If the service instance represents a standalone host, then the physical inventory for that service instance is fixed to that single host. VirtualCenter server provides additional features over single hosts. For example, VirtualCenter offers multi-host management.
    Examples of values are:
    "VirtualCenter" - For a VirtualCenter instance.
    "HostAgent" - For host agent on an ESX Server or VMware Server host."
    multiple_values = False
}

//
// OCCI attribute 'apiVersion'
//
one sig hostaboutinfo_apiVersion extends Attribute {} {
    name = "apiVersion"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The version of the API as a dot-separated string. For example, "1.0.0". "
    multiple_values = False
}

//
// OCCI attribute 'build'
//
one sig hostaboutinfo_build extends Attribute {} {
    name = "build"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Build string for the server on which this call is made. For example, x.y.z-num. This string does not apply to the API. "
    multiple_values = False
}

//
// OCCI attribute 'fullname'
//
one sig hostaboutinfo_fullname extends Attribute {} {
    name = "fullname"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The complete product name, including the version information. "
    multiple_values = False
}

//
// OCCI attribute 'localeBuild'
//
one sig hostaboutinfo_localeBuild extends Attribute {} {
    name = "localeBuild"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Build number for the current session's locale. Typically, this is a small number reflecting a localization change from the normal product build. "
    multiple_values = False
}

//
// OCCI attribute 'localeVersion'
//
one sig hostaboutinfo_localeVersion extends Attribute {} {
    name = "localeVersion"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Version of the message catalog for the current session's locale. "
    multiple_values = False
}

//
// OCCI attribute 'shortname'
//
one sig hostaboutinfo_shortname extends Attribute {} {
    name = "shortname"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Short form of the product name. "
    multiple_values = False
}

//
// OCCI attribute 'osType'
//
one sig hostaboutinfo_osType extends Attribute {} {
    name = "osType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Operating system type and architecture.
    Examples of values are:
    "win32-x86" - For x86-based Windows systems.
    "linux-x86" - For x86-based Linux systems.
    "vmnix-x86" - For the x86 ESX Server microkernel."
    multiple_values = False
}

//
// OCCI attribute 'productLineId'
//
one sig hostaboutinfo_productLineId extends Attribute {} {
    name = "productLineId"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The product ID is a unique identifier for a product line.
    Examples of values are:
    "gsx" - For the VMware Server product or the GSX Server product.
    "esx" - For the ESX Server product.
    "vpx" - For the VirtualCenter product."
    multiple_values = False
}

//
// OCCI attribute 'vendorName'
//
one sig hostaboutinfo_vendorName extends Attribute {} {
    name = "vendorName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Name of the vendor of this product. "
    multiple_values = False
}

//
// OCCI attribute 'productVersion'
//
one sig hostaboutinfo_productVersion extends Attribute {} {
    name = "productVersion"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Dot-separated version string. For example, "1.2"."
    multiple_values = False
}

// ======================================================================
// Signature for Hostaboutinfo
// ======================================================================

sig Hostaboutinfo in Hostsystem {
    apiType : lone String,
    apiVersion : lone String,
    build : lone String,
    fullname : lone String,
    localeBuild : lone String,
    localeVersion : lone String,
    shortname : lone String,
    osType : lone String,
    productLineId : lone String,
    vendorName : lone String,
    productVersion : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthealth'
//
// ======================================================================

one sig hosthealth extends Mixin {} {
    term = "hosthealth"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    no attributes
    no actions
    entities in Hosthealth
}

// ======================================================================
// Signature for Hosthealth
// ======================================================================

sig Hosthealth in Hostsystem {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconfig'
//
// ======================================================================

one sig hostconfig extends Mixin {} {
    term = "hostconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostconfig_adminDisabled + hostconfig_datastorePrincipal + hostconfig_localeSwapDatastoreName
    actions = hostconfig_enableAdmin + hostconfig_disableAdmin
    entities in Hostconfig
}

//
// OCCI attribute 'adminDisabled'
//
one sig hostconfig_adminDisabled extends Attribute {} {
    name = "adminDisabled"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "If the flag is true, the permission on the host has been modified such that only the user account used for VirtualCenter operation have Administrator permission. This flag is result of the operations of DisableAdmin and EnableAdmin.
    This flag is supported in VirtualCenter only. The value returned from host should be ignored.
    See DisableAdmin
    See EnableAdmin"
    multiple_values = False
}

//
// OCCI attribute 'datastorePrincipal'
//
one sig hostconfig_datastorePrincipal extends Attribute {} {
    name = "datastorePrincipal"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Datastore principal user "
    multiple_values = False
}

//
// OCCI attribute 'localeSwapDatastoreName'
//
one sig hostconfig_localeSwapDatastoreName extends Attribute {} {
    name = "localeSwapDatastoreName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Datastore visible to this host that may be used to store virtual machine swapfiles, for virtual machines executing on this host. The value of this property is set or unset by invoking UpdateLocalSwapDatastore. The policy for using this datastore is determined by the compute resource configuration's vmSwapPlacement property in concert with each individual virtual machine configuration's swapPlacement property.
    Note: Using a host-specific swap location may degrade VMotion performance."
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostconfig/action#enableAdmin'
//
one sig hostconfig_enableAdmin extends Action {} {
    term = "enableAdmin"
    scheme = "http://occiware.org/occi/vmware/hostconfig/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostconfig/action#disableAdmin'
//
one sig hostconfig_disableAdmin extends Action {} {
    term = "disableAdmin"
    scheme = "http://occiware.org/occi/vmware/hostconfig/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Hostconfig
// ======================================================================

sig Hostconfig in Hostsystem {
    adminDisabled : lone core/Boolean,
    datastorePrincipal : lone String,
    localeSwapDatastoreName : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#activediagnosticpartition'
//
// ======================================================================

one sig activediagnosticpartition extends Mixin {} {
    term = "activediagnosticpartition"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hostconfig
    no applies
    attributes = activediagnosticpartition_diagnosticType + activediagnosticpartition_diskNameVMFS + activediagnosticpartition_partition + activediagnosticpartition_slots + activediagnosticpartition_storageType
    no actions
    entities in Activediagnosticpartition
}

//
// OCCI attribute 'diagnosticType'
//
one sig activediagnosticpartition_diagnosticType extends Attribute {} {
    name = "diagnosticType"
    type = DiagnosticPartitionType_DataType
    mutable = False
    required = False
    no default
    description = "Indicates the type of the diagnostic partition"
    multiple_values = False
}

//
// OCCI attribute 'diskNameVMFS'
//
one sig activediagnosticpartition_diskNameVMFS extends Attribute {} {
    name = "diskNameVMFS"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The SCSI disk device on which a VMware File System (VMFS) extent resides.
    See HostScsiDisk
    See canonicalName"
    multiple_values = False
}

//
// OCCI attribute 'partition'
//
one sig activediagnosticpartition_partition extends Attribute {} {
    name = "partition"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The partition number of the partition on the ScsiDisk."
    multiple_values = False
}

//
// OCCI attribute 'slots'
//
one sig activediagnosticpartition_slots extends Attribute {} {
    name = "slots"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The number of slots in the diagnostic partition. "
    multiple_values = False
}

//
// OCCI attribute 'storageType'
//
one sig activediagnosticpartition_storageType extends Attribute {} {
    name = "storageType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Indicates the storage type of the diagnostic partition.See DiagnosticPartitionStorageType"
    multiple_values = False
}

// ======================================================================
// Signature for Activediagnosticpartition
// ======================================================================

sig Activediagnosticpartition in core/Entity {
    diagnosticType : lone DiagnosticPartitionType,
    diskNameVMFS : lone String,
    partition : lone core/Number,
    slots : lone core/Number,
    storageType : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#defaultautostartconfigvm'
//
// ======================================================================

one sig defaultautostartconfigvm extends Mixin {} {
    term = "defaultautostartconfigvm"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Defines the system default auto-start/auto-stop values."
    depends = hostconfig
    no applies
    attributes = defaultautostartconfigvm_autostartManagerEnabled + defaultautostartconfigvm_startDelay + defaultautostartconfigvm_stopAction + defaultautostartconfigvm_stopDelay + defaultautostartconfigvm_waitForHeartbeat
    no actions
    entities in Defaultautostartconfigvm
}

//
// OCCI attribute 'autostartManagerEnabled'
//
one sig defaultautostartconfigvm_autostartManagerEnabled extends Attribute {} {
    name = "autostartManagerEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether or not auto-start manager is enabled."
    multiple_values = False
}

//
// OCCI attribute 'startDelay'
//
one sig defaultautostartconfigvm_startDelay extends Attribute {} {
    name = "startDelay"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "System-default autoStart delay in seconds. The default is 120 seconds."
    multiple_values = False
}

//
// OCCI attribute 'stopAction'
//
one sig defaultautostartconfigvm_stopAction extends Attribute {} {
    name = "stopAction"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "System-default power-off action. Used if the stopAction string in the AutoPowerInfo object for a particular machine is set to systemDefault. If stopAction and startAction for a virtual machine are both set to none, that virtual machine is removed from the AutoStart sequence."
    multiple_values = False
}

//
// OCCI attribute 'stopDelay'
//
one sig defaultautostartconfigvm_stopDelay extends Attribute {} {
    name = "stopDelay"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "System-default autoStop delay in seconds. The default is 120 seconds. "
    multiple_values = False
}

//
// OCCI attribute 'waitForHeartbeat'
//
one sig defaultautostartconfigvm_waitForHeartbeat extends Attribute {} {
    name = "waitForHeartbeat"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "System-default waitForHeartbeat setting. "
    multiple_values = False
}

// ======================================================================
// Signature for Defaultautostartconfigvm
// ======================================================================

sig Defaultautostartconfigvm in core/Entity {
    autostartManagerEnabled : lone core/Boolean,
    startDelay : lone core/Number,
    stopAction : lone String,
    stopDelay : lone core/Number,
    waitForHeartbeat : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkcapability'
//
// ======================================================================

one sig hostnetworkcapability extends Mixin {} {
    term = "hostnetworkcapability"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Capability vector indicating the available network product features."
    depends = hostnetworkconfig
    no applies
    attributes = hostnetworkcapability_canSetPhysicalNicLinkSpeed + hostnetworkcapability_dhcpOnVnicSupported + hostnetworkcapability_dnsConfigSupported + hostnetworkcapability_ipRouteConfigSupported + hostnetworkcapability_maxPortGroupsPerVswitch + hostnetworkcapability_nicTeamingPolicy + hostnetworkcapability_supportsNetworkHints + hostnetworkcapability_supportsNicTeaming + hostnetworkcapability_supportsVlan + hostnetworkcapability_usesServiceConsoleNic + hostnetworkcapability_vnicConfigSupported + hostnetworkcapability_vswitchConfigSupported
    no actions
    entities in Hostnetworkcapability
}

//
// OCCI attribute 'canSetPhysicalNicLinkSpeed'
//
one sig hostnetworkcapability_canSetPhysicalNicLinkSpeed extends Attribute {} {
    name = "canSetPhysicalNicLinkSpeed"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not a physical network adapter's link speed and duplex settings can be changed through this API. For a hosted product, the host uses its physical network adapters for network connectivity. Configuration of link speed is done through regular host operations. In ESX Server, the configuration can be changed through this API"
    multiple_values = False
}

//
// OCCI attribute 'dhcpOnVnicSupported'
//
one sig hostnetworkcapability_dhcpOnVnicSupported extends Attribute {} {
    name = "dhcpOnVnicSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "This flag indicates whether or not the host is able to support dhcp configuration for vnics."
    multiple_values = False
}

//
// OCCI attribute 'dnsConfigSupported'
//
one sig hostnetworkcapability_dnsConfigSupported extends Attribute {} {
    name = "dnsConfigSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether DNS configuration for the host is supported."
    multiple_values = False
}

//
// OCCI attribute 'ipRouteConfigSupported'
//
one sig hostnetworkcapability_ipRouteConfigSupported extends Attribute {} {
    name = "ipRouteConfigSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether ip route configuration for the host is supported."
    multiple_values = False
}

//
// OCCI attribute 'maxPortGroupsPerVswitch'
//
one sig hostnetworkcapability_maxPortGroupsPerVswitch extends Attribute {} {
    name = "maxPortGroupsPerVswitch"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of port groups supported per virtual switch. This property will not be set if this value is unlimited."
    multiple_values = False
}

//
// OCCI attribute 'nicTeamingPolicy'
//
one sig hostnetworkcapability_nicTeamingPolicy extends Attribute {} {
    name = "nicTeamingPolicy"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The available teaming policies if the platform supports network adapter teaming. "
    multiple_values = True
}

//
// OCCI attribute 'supportsNetworkHints'
//
one sig hostnetworkcapability_supportsNetworkHints extends Attribute {} {
    name = "supportsNetworkHints"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not the host is able to support the querying of network hints. "
    multiple_values = False
}

//
// OCCI attribute 'supportsNicTeaming'
//
one sig hostnetworkcapability_supportsNicTeaming extends Attribute {} {
    name = "supportsNicTeaming"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not network adapter teaming is available. Multiple network adapters can be bridged to a virtual switch through a BondBridge. Also, network adapter teaming policies such as failover order and detection are enabled. "
    multiple_values = False
}

//
// OCCI attribute 'supportsVlan'
//
one sig hostnetworkcapability_supportsVlan extends Attribute {} {
    name = "supportsVlan"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not VLANs can be configured on PortGroups attached to VirtualSwitch objects. This allows VLANs for virtual machines without requiring special VLAN capable hardware switches. "
    multiple_values = False
}

//
// OCCI attribute 'usesServiceConsoleNic'
//
one sig hostnetworkcapability_usesServiceConsoleNic extends Attribute {} {
    name = "usesServiceConsoleNic"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not a service console network adapter is used or required. This means that the system software has two TCP/IP stacks. As a result, at least two types of VirtualNics may be created -- the normal VirtualNic and the service console VirtualNic. If this is not set, then only the VirtualNic type is supported. "
    multiple_values = False
}

//
// OCCI attribute 'vnicConfigSupported'
//
one sig hostnetworkcapability_vnicConfigSupported extends Attribute {} {
    name = "vnicConfigSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether vnic configuration is supported. This means that operations to add, remove, update virtualNic are supported."
    multiple_values = False
}

//
// OCCI attribute 'vswitchConfigSupported'
//
one sig hostnetworkcapability_vswitchConfigSupported extends Attribute {} {
    name = "vswitchConfigSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether virtual switch configuration is supported. This means that operations to add, remove, update virtual switches are supported."
    multiple_values = False
}

// ======================================================================
// Signature for Hostnetworkcapability
// ======================================================================

sig Hostnetworkcapability in core/Entity {
    canSetPhysicalNicLinkSpeed : lone core/Boolean,
    dhcpOnVnicSupported : lone core/Boolean,
    dnsConfigSupported : lone core/Boolean,
    ipRouteConfigSupported : lone core/Boolean,
    maxPortGroupsPerVswitch : lone core/Number,
    nicTeamingPolicy : lone String,
    supportsNetworkHints : lone core/Boolean,
    supportsNicTeaming : lone core/Boolean,
    supportsVlan : lone core/Boolean,
    usesServiceConsoleNic : lone core/Boolean,
    vnicConfigSupported : lone core/Boolean,
    vswitchConfigSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#autostartpowerinfo'
//
// ======================================================================

one sig autostartpowerinfo extends Mixin {} {
    term = "autostartpowerinfo"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Autostart configuration, these values are found via HostSystem.HostConfigInfo object and autoStart property"
    no depends
    applies = vm
    attributes = autostartpowerinfo_stopDelay + autostartpowerinfo_stopAction + autostartpowerinfo_waitForHeartbeat + autostartpowerinfo_startDelay + autostartpowerinfo_startAction + autostartpowerinfo_startOrder
    no actions
    entities in Autostartpowerinfo
}

//
// OCCI attribute 'stopDelay'
//
one sig autostartpowerinfo_stopDelay extends Attribute {} {
    name = "stopDelay"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Delay in seconds before continuing with the next virtual machine in the order sequence. If the delay is -1, then the hostsystem default is used. "
    multiple_values = False
}

//
// OCCI attribute 'stopAction'
//
one sig autostartpowerinfo_stopAction extends Attribute {} {
    name = "stopAction"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Defines the stop action for the virtual machine. Can be set to none, systemDefault, powerOff, or suspend. If set to none, then the virtual machine does not participate in auto-stop. "
    multiple_values = False
}

//
// OCCI attribute 'waitForHeartbeat'
//
one sig autostartpowerinfo_waitForHeartbeat extends Attribute {} {
    name = "waitForHeartbeat"
    type = AutoStartWaitHeartbeatSetting_DataType
    mutable = True
    required = False
    no default
    description = "System-default waitForHeartbeat setting. "
    multiple_values = False
}

//
// OCCI attribute 'startDelay'
//
one sig autostartpowerinfo_startDelay extends Attribute {} {
    name = "startDelay"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Delay in seconds before continuing with the next virtual machine in the order of machines to be started. If the delay is specified as -1, then the system default is used."
    multiple_values = False
}

//
// OCCI attribute 'startAction'
//
one sig autostartpowerinfo_startAction extends Attribute {} {
    name = "startAction"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "How to start the virtual machine. Valid settings are none or powerOn. If set to none, then the virtual machine does not participate in auto-start. "
    multiple_values = False
}

//
// OCCI attribute 'startOrder'
//
one sig autostartpowerinfo_startOrder extends Attribute {} {
    name = "startOrder"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The autostart priority of this virtual machine. Virtual machines with a lower number are powered on first. On host shutdown, the virtual machines are shut down in reverse order, meaning those with a higher number are powered off first.
    Positive values indicate a start order and -1 indicates the machine can be powered on at any time. Machines with a -1 value are typically powered on and off after all virtual machines with positive startOrder values. Failure to meet the following requirements results in an InvalidArgument exception:
    
    startOrder must be set to -1 if startAction is set to none
    startOrder must be -1 or positive integers. Values such as 0 or -2 are not valid.
    startOrder is relative to other virtual machines in the autostart sequence. Hence specifying a startOrder of 4 when there are only 3 virtual machines in the Autostart sequence is not valid.
    If a newly established or changed startOrder value for a virtual machine matches an existing startOrder value, the newly applied value takes precedence, and the existing value is incremented by one. The incremented startOrder value is checked for collisions, and the same rule is applied if one is found. This simple system ensures no two virtual machines ever have the same order number.
    
    For example, consider the case where there are three virtual machines with different startOrder values. Virtual machine A has not yet established a startOrder, virtual machine B has a startOrder value of 1 and Virtual Machine C has a startOrder value of 2. If virtual machine A's startOrder is set to 1, then virtual machine B's startOrder is incremented to 2. This creates a conflict with virtual machine C's startOrder value, which is also incremented, this time to 3. "
    multiple_values = False
}

// ======================================================================
// Signature for Autostartpowerinfo
// ======================================================================

sig Autostartpowerinfo in Vm {
    stopDelay : lone core/Number,
    stopAction : lone String,
    waitForHeartbeat : lone AutoStartWaitHeartbeatSetting,
    startDelay : lone core/Number,
    startAction : lone String,
    startOrder : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostmemoryreservation'
//
// ======================================================================

one sig hostmemoryreservation extends Mixin {} {
    term = "hostmemoryreservation"
    scheme = "http://occiware.org/occi/vmware#"
    title = "This mixin describes the amount of memory that is being reserved by the service console. Memory reserved for use by the service console is a hard reservation that cannot be changed except across hardware restarts"
    depends = hostconfig
    no applies
    attributes = hostmemoryreservation_serviceConsoleReserved + hostmemoryreservation_serviceConsoleReservedCfg + hostmemoryreservation_unreserved + hostmemoryreservation_allocationPolicy + hostmemoryreservation_virtualMachineMax + hostmemoryreservation_virtualMachineMin + hostmemoryreservation_virtualMachineReserved
    actions = hostmemoryreservation_reconfigureServiceConsoleReservation + hostmemoryreservation_reconfigureVirtualMachineReservation
    entities in Hostmemoryreservation
}

//
// OCCI attribute 'serviceConsoleReserved'
//
one sig hostmemoryreservation_serviceConsoleReserved extends Attribute {} {
    name = "serviceConsoleReserved"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The amount of memory that is currently reserved for the service console. "
    multiple_values = False
}

//
// OCCI attribute 'serviceConsoleReservedCfg'
//
one sig hostmemoryreservation_serviceConsoleReservedCfg extends Attribute {} {
    name = "serviceConsoleReservedCfg"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The amount of memory that should be reserved for the service console on the next boot. "
    multiple_values = False
}

//
// OCCI attribute 'unreserved'
//
one sig hostmemoryreservation_unreserved extends Attribute {} {
    name = "unreserved"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The amount of memory that is not reserved for use by the service console"
    multiple_values = False
}

//
// OCCI attribute 'allocationPolicy'
//
one sig hostmemoryreservation_allocationPolicy extends Attribute {} {
    name = "allocationPolicy"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Policy for allocating additional memory for virtual machines.
    See AllocationPolicy"
    multiple_values = False
}

//
// OCCI attribute 'virtualMachineMax'
//
one sig hostmemoryreservation_virtualMachineMax extends Attribute {} {
    name = "virtualMachineMax"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The maximum amount of memory reserved for all running virtual machines, in bytes."
    multiple_values = False
}

//
// OCCI attribute 'virtualMachineMin'
//
one sig hostmemoryreservation_virtualMachineMin extends Attribute {} {
    name = "virtualMachineMin"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The minimum amount of memory reserved for all running virtual machines, in bytes"
    multiple_values = False
}

//
// OCCI attribute 'virtualMachineReserved'
//
one sig hostmemoryreservation_virtualMachineReserved extends Attribute {} {
    name = "virtualMachineReserved"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The amount of memory reserved for all running virtual machines, in bytes. "
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hostmemoryreservation/action#reconfigureServiceConsoleReservation'
//
one sig hostmemoryreservation_reconfigureServiceConsoleReservation extends Action {} {
    term = "reconfigureServiceConsoleReservation"
    scheme = "http://occiware.org/occi/vmware/hostmemoryreservation/action#"
    title = "Sets the configured service console memory reservation. This change affects only the serviceConsoleReservedCfg property. The configuration change propagates to the other properties after the next boot."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hostmemoryreservation/action#reconfigureVirtualMachineReservation'
//
one sig hostmemoryreservation_reconfigureVirtualMachineReservation extends Action {} {
    term = "reconfigureVirtualMachineReservation"
    scheme = "http://occiware.org/occi/vmware/hostmemoryreservation/action#"
    title = "Updates the virtual machine reservation information."
    no attributes
}


// ======================================================================
// Signature for Hostmemoryreservation
// ======================================================================

sig Hostmemoryreservation in core/Entity {
    serviceConsoleReserved : lone LongNumber,
    serviceConsoleReservedCfg : lone LongNumber,
    unreserved : lone LongNumber,
    allocationPolicy : lone String,
    virtualMachineMax : lone LongNumber,
    virtualMachineMin : lone LongNumber,
    virtualMachineReserved : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdatastorecapability'
//
// ======================================================================

one sig hostdatastorecapability extends Mixin {} {
    term = "hostdatastorecapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hostconfig
    no applies
    attributes = hostdatastorecapability_localDatastoreSupported + hostdatastorecapability_nfsMountCreationRequired + hostdatastorecapability_nfsMountCreationSupported
    no actions
    entities in Hostdatastorecapability
}

//
// OCCI attribute 'localDatastoreSupported'
//
one sig hostdatastorecapability_localDatastoreSupported extends Attribute {} {
    name = "localDatastoreSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether local datastores are supported."
    multiple_values = False
}

//
// OCCI attribute 'nfsMountCreationRequired'
//
one sig hostdatastorecapability_nfsMountCreationRequired extends Attribute {} {
    name = "nfsMountCreationRequired"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether mounting the NFS volume is required to be done as part of NAS datastore creation. If this is set to true, then NAS datastores cannot be created for currently mounted NFS volumes. "
    multiple_values = False
}

//
// OCCI attribute 'nfsMountCreationSupported'
//
one sig hostdatastorecapability_nfsMountCreationSupported extends Attribute {} {
    name = "nfsMountCreationSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether mounting an NFS volume is supported when a NAS datastore is created. If this option is false, then NAS datastores corresponding to NFS volumes can be created only for already mounted NFS volumes. "
    multiple_values = False
}

// ======================================================================
// Signature for Hostdatastorecapability
// ======================================================================

sig Hostdatastorecapability in core/Entity {
    localDatastoreSupported : lone core/Boolean,
    nfsMountCreationRequired : lone core/Boolean,
    nfsMountCreationSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdatetimeinfo'
//
// ======================================================================

one sig hostdatetimeinfo extends Mixin {} {
    term = "hostdatetimeinfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hostconfig
    no applies
    no attributes
    no actions
    entities in Hostdatetimeinfo
}

// ======================================================================
// Signature for Hostdatetimeinfo
// ======================================================================

sig Hostdatetimeinfo in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostntpconfig'
//
// ======================================================================

one sig hostntpconfig extends Mixin {} {
    term = "hostntpconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Configuration information for the NTP (Network Time Protocol) service."
    depends = hostdatetimeinfo
    no applies
    attributes = hostntpconfig_hostNTPServers
    no actions
    entities in Hostntpconfig
}

//
// OCCI attribute 'hostNTPServers'
//
one sig hostntpconfig_hostNTPServers extends Attribute {} {
    name = "hostNTPServers"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "List of time servers, specified as either IP addresses or fully qualified domain names (FQDNs)."
    multiple_values = True
}

// ======================================================================
// Signature for Hostntpconfig
// ======================================================================

sig Hostntpconfig in core/Entity {
    hostNTPServers : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosttimezone'
//
// ======================================================================

one sig hosttimezone extends Mixin {} {
    term = "hosttimezone"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hostdatetimeinfo
    no applies
    attributes = hosttimezone_timeZoneDescription + hosttimezone_timeZoneGMTOffset + hosttimezone_timeZoneKey + hosttimezone_timeZoneName
    no actions
    entities in Hosttimezone
}

//
// OCCI attribute 'timeZoneDescription'
//
one sig hosttimezone_timeZoneDescription extends Attribute {} {
    name = "timeZoneDescription"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'timeZoneGMTOffset'
//
one sig hosttimezone_timeZoneGMTOffset extends Attribute {} {
    name = "timeZoneGMTOffset"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'timeZoneKey'
//
one sig hosttimezone_timeZoneKey extends Attribute {} {
    name = "timeZoneKey"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'timeZoneName'
//
one sig hosttimezone_timeZoneName extends Attribute {} {
    name = "timeZoneName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Hosttimezone
// ======================================================================

sig Hosttimezone in core/Entity {
    timeZoneDescription : lone String,
    timeZoneGMTOffset : lone String,
    timeZoneKey : lone String,
    timeZoneName : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostflaginfo'
//
// ======================================================================

one sig hostflaginfo extends Mixin {} {
    term = "hostflaginfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hostconfig
    no applies
    attributes = hostflaginfo_backgroundSnapshotsEnabled
    no actions
    entities in Hostflaginfo
}

//
// OCCI attribute 'backgroundSnapshotsEnabled'
//
one sig hostflaginfo_backgroundSnapshotsEnabled extends Attribute {} {
    name = "backgroundSnapshotsEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether background snapshots are enabled. "
    multiple_values = False
}

// ======================================================================
// Signature for Hostflaginfo
// ======================================================================

sig Hostflaginfo in core/Entity {
    backgroundSnapshotsEnabled : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthyperthreadscheduler'
//
// ======================================================================

one sig hosthyperthreadscheduler extends Mixin {} {
    term = "hosthyperthreadscheduler"
    scheme = "http://occiware.org/occi/vmware#"
    title = "provides an interface through which you can gather and configure the host CPU scheduler policies that affect the performance of running virtual machines"
    depends = hosthardwareinfo
    no applies
    attributes = hosthyperthreadscheduler_hyperThreadActive + hosthyperthreadscheduler_hyperThreadAvailable + hosthyperthreadscheduler_hyperThreadConfig
    actions = hosthyperthreadscheduler_enableHyperThreading + hosthyperthreadscheduler_disableHyperThreading
    entities in Hosthyperthreadscheduler
}

//
// OCCI attribute 'hyperThreadActive'
//
one sig hosthyperthreadscheduler_hyperThreadActive extends Attribute {} {
    name = "hyperThreadActive"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not the CPU scheduler is currently treating hyperthreads as schedulable resources. Setting this property involves a successful invocation of either the enableHyperThreading() method (true) or the disableHyperthreading() method (false). The property is set once the system is rebooted. "
    multiple_values = False
}

//
// OCCI attribute 'hyperThreadAvailable'
//
one sig hosthyperthreadscheduler_hyperThreadAvailable extends Attribute {} {
    name = "hyperThreadAvailable"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not hyperthreading optimization is available on the system. This property is set by VMware prior to installation. "
    multiple_values = False
}

//
// OCCI attribute 'hyperThreadConfig'
//
one sig hosthyperthreadscheduler_hyperThreadConfig extends Attribute {} {
    name = "hyperThreadConfig"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The flag to indicate whether or not the CPU scheduler should treat hyperthreads as schedulable resources the next time the CPU scheduler starts.
    This property is set to "true" by successfully invoking the enableHyperThreading() method.
    This property is set to "false" by successfully invoking the disableHyperthreading() method. "
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#enableHyperThreading'
//
one sig hosthyperthreadscheduler_enableHyperThreading extends Action {} {
    term = "enableHyperThreading"
    scheme = "http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#"
    no title
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#disableHyperThreading'
//
one sig hosthyperthreadscheduler_disableHyperThreading extends Action {} {
    term = "disableHyperThreading"
    scheme = "http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Hosthyperthreadscheduler
// ======================================================================

sig Hosthyperthreadscheduler in core/Entity {
    hyperThreadActive : lone core/Boolean,
    hyperThreadAvailable : lone core/Boolean,
    hyperThreadConfig : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsystemvolumemounted'
//
// ======================================================================

one sig hostsystemvolumemounted extends Mixin {} {
    term = "hostsystemvolumemounted"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Volumes mounted on host"
    depends = hostfilesystemvolumeinfo
    no applies
    attributes = hostsystemvolumemounted_accessible + hostsystemvolumemounted_accessMode + hostsystemvolumemounted_hostVolumeType
    no actions
    entities in Hostsystemvolumemounted
}

//
// OCCI attribute 'accessible'
//
one sig hostsystemvolumemounted_accessible extends Attribute {} {
    name = "accessible"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag that indicates if the datastore is currently accessible from the host.
    For the case of standalone host agent, this property has the same value as Datastore.Summary.accessible and hence the latter can be used equivalently if this one is not set. VirtualCenter Server will always make sure it is set correctly."
    multiple_values = False
}

//
// OCCI attribute 'accessMode'
//
one sig hostsystemvolumemounted_accessMode extends Attribute {} {
    name = "accessMode"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Access mode to the underlying file system this host has."
    multiple_values = False
}

//
// OCCI attribute 'hostVolumeType'
//
one sig hostsystemvolumemounted_hostVolumeType extends Attribute {} {
    name = "hostVolumeType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Type of file system volume.The following values are defined:
    vmfs: VMware File System (ESX Server only). If this is set, the type of the file system volume is VMFS.
    nfs: Network file system (Linux only and ESX Server only). If this is set, the type of the file system volume is NetworkFileSystem.
    cifs: Common Internet file system (Windows only). If this is set, the type of the file system volume is CIFS."
    multiple_values = False
}

// ======================================================================
// Signature for Hostsystemvolumemounted
// ======================================================================

sig Hostsystemvolumemounted in core/Entity {
    accessible : lone core/Boolean,
    accessMode : lone String,
    hostVolumeType : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostfilesystemvolumeinfo'
//
// ======================================================================

one sig hostfilesystemvolumeinfo extends Mixin {} {
    term = "hostfilesystemvolumeinfo"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Host Volume filesystem informations"
    no depends
    applies = hoststoragelink
    attributes = hostfilesystemvolumeinfo_volumeTypeList
    no actions
    entities in Hostfilesystemvolumeinfo
}

//
// OCCI attribute 'volumeTypeList'
//
one sig hostfilesystemvolumeinfo_volumeTypeList extends Attribute {} {
    name = "volumeTypeList"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The list of supported file system volume types. "
    multiple_values = True
}

// ======================================================================
// Signature for Hostfilesystemvolumeinfo
// ======================================================================

sig Hostfilesystemvolumeinfo in Hoststoragelink {
    volumeTypeList : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostpcidevices'
//
// ======================================================================

one sig hostpcidevices extends Mixin {} {
    term = "hostpcidevices"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = hosthardwareinfo
    no applies
    attributes = hostpcidevices_pciBus + hostpcidevices_pciClassId + hostpcidevices_pciDeviceId + hostpcidevices_pciDeviceName + hostpcidevices_pciFunction + hostpcidevices_pciId + hostpcidevices_pciSlot + hostpcidevices_pciSubDeviceId + hostpcidevices_pciSubVendorId + hostpcidevices_pciVendorId + hostpcidevices_pciVendorName
    no actions
    entities in Hostpcidevices
}

//
// OCCI attribute 'pciBus'
//
one sig hostpcidevices_pciBus extends Attribute {} {
    name = "pciBus"
    type = ByteType_DataType
    mutable = False
    required = False
    no default
    description = "The bus ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciClassId'
//
one sig hostpcidevices_pciClassId extends Attribute {} {
    name = "pciClassId"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The class of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciDeviceId'
//
one sig hostpcidevices_pciDeviceId extends Attribute {} {
    name = "pciDeviceId"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The device ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciDeviceName'
//
one sig hostpcidevices_pciDeviceName extends Attribute {} {
    name = "pciDeviceName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The device name of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciFunction'
//
one sig hostpcidevices_pciFunction extends Attribute {} {
    name = "pciFunction"
    type = ByteType_DataType
    mutable = False
    required = False
    no default
    description = "The function ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciId'
//
one sig hostpcidevices_pciId extends Attribute {} {
    name = "pciId"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The name ID of this PCI, composed of "bus:slot.function""
    multiple_values = True
}

//
// OCCI attribute 'pciSlot'
//
one sig hostpcidevices_pciSlot extends Attribute {} {
    name = "pciSlot"
    type = ByteType_DataType
    mutable = False
    required = False
    no default
    description = "The slot ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciSubDeviceId'
//
one sig hostpcidevices_pciSubDeviceId extends Attribute {} {
    name = "pciSubDeviceId"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The subdevice ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciSubVendorId'
//
one sig hostpcidevices_pciSubVendorId extends Attribute {} {
    name = "pciSubVendorId"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The subvendor ID of this PCI"
    multiple_values = True
}

//
// OCCI attribute 'pciVendorId'
//
one sig hostpcidevices_pciVendorId extends Attribute {} {
    name = "pciVendorId"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "The vendor ID of this PCI."
    multiple_values = True
}

//
// OCCI attribute 'pciVendorName'
//
one sig hostpcidevices_pciVendorName extends Attribute {} {
    name = "pciVendorName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The vendor name of this PCI"
    multiple_values = True
}

// ======================================================================
// Signature for Hostpcidevices
// ======================================================================

sig Hostpcidevices in core/Entity {
    pciBus : lone ByteType,
    pciClassId : lone ShortNumber,
    pciDeviceId : lone ShortNumber,
    pciDeviceName : lone String,
    pciFunction : lone ByteType,
    pciId : lone String,
    pciSlot : lone ByteType,
    pciSubDeviceId : lone ShortNumber,
    pciSubVendorId : lone ShortNumber,
    pciVendorId : lone ShortNumber,
    pciVendorName : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusteractionhistory'
//
// ======================================================================

one sig clusteractionhistory extends Mixin {} {
    term = "clusteractionhistory"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = cluster
    attributes = clusteractionhistory_actionType + clusteractionhistory_actionTime
    no actions
    entities in Clusteractionhistory
}

//
// OCCI attribute 'actionType'
//
one sig clusteractionhistory_actionType extends Attribute {} {
    name = "actionType"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The action that was executed recently"
    multiple_values = True
}

//
// OCCI attribute 'actionTime'
//
one sig clusteractionhistory_actionTime extends Attribute {} {
    name = "actionTime"
    type = Datetype_DataType
    mutable = False
    required = False
    no default
    description = "The time when the action was executed."
    multiple_values = True
}

// ======================================================================
// Signature for Clusteractionhistory
// ======================================================================

sig Clusteractionhistory in Cluster {
    actionType : lone String,
    actionTime : lone Datetype,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsrecommandations'
//
// ======================================================================

one sig clusterdrsrecommandations extends Mixin {} {
    term = "clusterdrsrecommandations"
    scheme = "http://occiware.org/occi/vmware#"
    title = "list of recommended actions for the cluster. It is possible that the current set of recommendations may be empty, either due to not having any running dynamic recommendation generation module, or since there may be no recommended actions at this time"
    no depends
    applies = cluster
    no attributes
    actions = clusterdrsrecommandations_queryClusterDrsRecommandations
    entities in Clusterdrsrecommandations
}

//
// OCCI action 'http://occiware.org/occi/vmware/clusterdrsrecommandations/action#queryClusterDrsRecommandations'
//
one sig clusterdrsrecommandations_queryClusterDrsRecommandations extends Action {} {
    term = "queryClusterDrsRecommandations"
    scheme = "http://occiware.org/occi/vmware/clusterdrsrecommandations/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Clusterdrsrecommandations
// ======================================================================

sig Clusterdrsrecommandations in Cluster {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterresourcesinfo'
//
// ======================================================================

one sig clusterresourcesinfo extends Mixin {} {
    term = "clusterresourcesinfo"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Summary resources informations (aggregate from hosts)"
    no depends
    applies = cluster
    attributes = clusterresourcesinfo_effectiveCpu + clusterresourcesinfo_effectiveMemory + clusterresourcesinfo_numCpuCores + clusterresourcesinfo_numCpuThreads + clusterresourcesinfo_numEffectiveHosts + clusterresourcesinfo_numHosts + clusterresourcesinfo_overallStatus + clusterresourcesinfo_totalCpu + clusterresourcesinfo_totalMemory
    no actions
    entities in Clusterresourcesinfo
}

//
// OCCI attribute 'effectiveCpu'
//
one sig clusterresourcesinfo_effectiveCpu extends Attribute {} {
    name = "effectiveCpu"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Effective CPU resources (in MHz) available to run virtual machines. 
    This is the aggregated effective resource level from all running hosts. 
    Hosts that are in maintenance mode or are unresponsive are not counted. 
    Resources used by the VMware Service Console are not included in the aggregate. 
    This value represents the amount of resources available for the root resource pool for running virtual machines. "
    multiple_values = False
}

//
// OCCI attribute 'effectiveMemory'
//
one sig clusterresourcesinfo_effectiveMemory extends Attribute {} {
    name = "effectiveMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Effective memory resources (in MB) available to run virtual machines. This is the aggregated effective resource level from all running hosts. Hosts that are in maintenance mode or are unresponsive are not counted. Resources used by the VMware Service Console are not included in the aggregate. This value represents the amount of resources available for the root resource pool for running virtual machines. "
    multiple_values = False
}

//
// OCCI attribute 'numCpuCores'
//
one sig clusterresourcesinfo_numCpuCores extends Attribute {} {
    name = "numCpuCores"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "Number of physical CPU cores. Physical CPU cores are the processors contained by a CPU package. "
    multiple_values = False
}

//
// OCCI attribute 'numCpuThreads'
//
one sig clusterresourcesinfo_numCpuThreads extends Attribute {} {
    name = "numCpuThreads"
    type = ShortNumber_DataType
    mutable = False
    required = False
    no default
    description = "Aggregated number of CPU threads. "
    multiple_values = False
}

//
// OCCI attribute 'numEffectiveHosts'
//
one sig clusterresourcesinfo_numEffectiveHosts extends Attribute {} {
    name = "numEffectiveHosts"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Total number of effective hosts."
    multiple_values = False
}

//
// OCCI attribute 'numHosts'
//
one sig clusterresourcesinfo_numHosts extends Attribute {} {
    name = "numHosts"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Total number of hosts. "
    multiple_values = False
}

//
// OCCI attribute 'overallStatus'
//
one sig clusterresourcesinfo_overallStatus extends Attribute {} {
    name = "overallStatus"
    type = OverallStatus_DataType
    mutable = False
    required = False
    no default
    description = "Overall alarm status. "
    multiple_values = False
}

//
// OCCI attribute 'totalCpu'
//
one sig clusterresourcesinfo_totalCpu extends Attribute {} {
    name = "totalCpu"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Aggregated CPU resources of all hosts, in MHz."
    multiple_values = False
}

//
// OCCI attribute 'totalMemory'
//
one sig clusterresourcesinfo_totalMemory extends Attribute {} {
    name = "totalMemory"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Aggregated memory resources of all hosts, in bytes."
    multiple_values = False
}

// ======================================================================
// Signature for Clusterresourcesinfo
// ======================================================================

sig Clusterresourcesinfo in Cluster {
    effectiveCpu : lone core/Number,
    effectiveMemory : lone LongNumber,
    numCpuCores : lone ShortNumber,
    numCpuThreads : lone ShortNumber,
    numEffectiveHosts : lone core/Number,
    numHosts : lone core/Number,
    overallStatus : lone OverallStatus,
    totalCpu : lone core/Number,
    totalMemory : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasconfig'
//
// ======================================================================

one sig clusterdasconfig extends Mixin {} {
    term = "clusterdasconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Cluster-wide configuration of the VMware HA service. (HA = high availability)"
    no depends
    applies = cluster
    attributes = clusterdasconfig_admissionControlEnabled + clusterdasconfig_HAEnabled + clusterdasconfig_dasOptionKeys + clusterdasconfig_dasOptionValues + clusterdasconfig_hBDatastoreCandidatePolicy + clusterdasconfig_heartbeatDatastoreNames + clusterdasconfig_hostMonitoring + clusterdasconfig_vmComponentProtecting + clusterdasconfig_vmMonitoring
    no actions
    entities in Clusterdasconfig
}

//
// OCCI attribute 'admissionControlEnabled'
//
one sig clusterdasconfig_admissionControlEnabled extends Attribute {} {
    name = "admissionControlEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag that determines whether strict admission control is enabled. When you use admission control, the following operations are prevented, if doing so would violate the admissionControlPolicy.
    Powering on a virtual machine in the cluster.
    Migrating a virtual machine into the cluster.
    Increasing the CPU or memory reservation of powered-on virtual machines in the cluster.
    With admission control disabled, there is no assurance that all virtual machines in the HA cluster can be restarted after a host failure. VMware recommends that you do not disable admission control, but you might need to do so temporarily, for the following reasons:
    
    If you need to violate the failover constraints when there are not enough resources to support them (for example, if you are placing hosts in standby mode to test them for use with DPM).
    If an automated process needs to take actions that might temporarily violate the failover constraints (for example, as part of an upgrade directed by VMware Update Manager).
    If you need to perform testing or maintenance operations."
    multiple_values = False
}

//
// OCCI attribute 'HAEnabled'
//
one sig clusterdasconfig_HAEnabled extends Attribute {} {
    name = "HAEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether or not VMware HA is enabled. "
    multiple_values = False
}

//
// OCCI attribute 'dasOptionKeys'
//
one sig clusterdasconfig_dasOptionKeys extends Attribute {} {
    name = "dasOptionKeys"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The name of the option using dot notation to reflect the option's position in a hierarchy. For example, you might have an option called "Ethernet" and another option that is a child of that called "Connection". In this case, the key for the latter could be defined as "Ethernet.Connection" "
    multiple_values = True
}

//
// OCCI attribute 'dasOptionValues'
//
one sig clusterdasconfig_dasOptionValues extends Attribute {} {
    name = "dasOptionValues"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The value of the option. The Any data object type enables you to define any value for the option. Typically, however, the value of an option is of type String or Integer. "
    multiple_values = True
}

//
// OCCI attribute 'hBDatastoreCandidatePolicy'
//
one sig clusterdasconfig_hBDatastoreCandidatePolicy extends Attribute {} {
    name = "hBDatastoreCandidatePolicy"
    type = ClusterDasConfigInfoHBDatastoreCandidate_DataType
    mutable = True
    required = False
    no default
    description = "The policy on what datastores will be used by vCenter Server to choose heartbeat datastores. See ClusterDasConfigInfoHBDatastoreCandidate for all options. The default value is allFeasibleDsWithUserPreference"
    multiple_values = False
}

//
// OCCI attribute 'heartbeatDatastoreNames'
//
one sig clusterdasconfig_heartbeatDatastoreNames extends Attribute {} {
    name = "heartbeatDatastoreNames"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The list of preferred datastores to use for storage heartbeating. Each of the specified datastores should be active and mounted by more than one host. There is no limit on the number of specified datastores and no priority among them. The specified datastores will replace those previously specified and an empty list will delete all such earlier specified ones.
    vCenter Server chooses the heartbeat datastores for a host from the set specified by hBDatastoreCandidatePolicy. The choice is made based on datastore connectivity and storage array redundancy (in case of VMFS).
    
    The final set of selected heartbeat datastores is reported via heartbeatDatastoreInfo."
    multiple_values = True
}

//
// OCCI attribute 'hostMonitoring'
//
one sig clusterdasconfig_hostMonitoring extends Attribute {} {
    name = "hostMonitoring"
    type = ClusterDasConfigInfoServiceState_DataType
    mutable = True
    required = False
    no default
    description = "Determines whether HA restarts virtual machines after a host fails. The default value is ClusterDasConfigInfoServiceState.enabled. This property is meaningful only when ClusterDasConfigInfo.enabled is true.
    When hostMonitoring is enabled, HA restarts virtual machines after a host fails.
    
    When hostMonitoring is disabled, HA does not restart virtual machines after a host fails. The status of Host Monitoring does not affect other services such as virtual machine Health Monitoring or Fault Tolerance. The rest of the cluster operations follow normal processing. No configuration information is lost and re-enabling the service is a quick operation."
    multiple_values = False
}

//
// OCCI attribute 'vmComponentProtecting'
//
one sig clusterdasconfig_vmComponentProtecting extends Attribute {} {
    name = "vmComponentProtecting"
    type = core/String_DataType
    mutable = True
    required = False
    default = "disabled"
    description = "This property indicates if vSphere HA VM Component Protection service is enabled. The default value is disabled.
    When vmComponentProtecting is set to disabled, reaction to all types of VM component failures is disabled.
    
    When vmComponentProtecting is set to enabled, VM Component Protection service will detect and react to component failures. The actual reaction is determined by ClusterVmComponentProtectionSettings which is referenced by both cluster level configuration (defaultVmSettings) and per-VM override dasVmConfig."
    multiple_values = False
}

//
// OCCI attribute 'vmMonitoring'
//
one sig clusterdasconfig_vmMonitoring extends Attribute {} {
    name = "vmMonitoring"
    type = ClusterDasConfigInfoVmMonitoringState_DataType
    mutable = True
    required = False
    no default
    description = "Level of HA Virtual Machine Health Monitoring Service. You can monitor both guest and application heartbeats, guest heartbeats only, or you can disable the service. See ClusterDasConfigInfoVmMonitoringState. The default value is vmMonitoringDisabled.
    The Service level specified for the cluster determines the possible monitoring settings that you can use for individual virtual machines. See ClusterVmToolsMonitoringSettings.vmMonitoring."
    multiple_values = False
}

// ======================================================================
// Signature for Clusterdasconfig
// ======================================================================

sig Clusterdasconfig in Cluster {
    admissionControlEnabled : lone core/Boolean,
    HAEnabled : lone core/Boolean,
    dasOptionKeys : lone String,
    dasOptionValues : lone String,
    hBDatastoreCandidatePolicy : lone ClusterDasConfigInfoHBDatastoreCandidate,
    heartbeatDatastoreNames : lone String,
    hostMonitoring : lone ClusterDasConfigInfoServiceState,
    vmComponentProtecting : lone String,
    vmMonitoring : lone ClusterDasConfigInfoVmMonitoringState,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdefaultdasvmconfig'
//
// ======================================================================

one sig clusterdefaultdasvmconfig extends Mixin {} {
    term = "clusterdefaultdasvmconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Cluster-wide defaults for per-VM VMware HA settings. In the case where no settings are specified for a specific VM in ClusterDasVmConfigInfo then the values here will be used as the defaults."
    depends = clusterdasconfig
    no applies
    attributes = clusterdefaultdasvmconfig_isolationResponse + clusterdefaultdasvmconfig_restartPriority + clusterdefaultdasvmconfig_enableAPDTimeoutForHosts + clusterdefaultdasvmconfig_vmReactionOnAPDCleared + clusterdefaultdasvmconfig_vmStorageProtectionForAPD + clusterdefaultdasvmconfig_vmStorageProtectionForPDL + clusterdefaultdasvmconfig_vmTerminateDelayForAPDSec
    no actions
    entities in Clusterdefaultdasvmconfig
}

//
// OCCI attribute 'isolationResponse'
//
one sig clusterdefaultdasvmconfig_isolationResponse extends Attribute {} {
    name = "isolationResponse"
    type = ClusterDASVmSettingsIsolationResponse_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'restartPriority'
//
one sig clusterdefaultdasvmconfig_restartPriority extends Attribute {} {
    name = "restartPriority"
    type = ClusterDASVmSettingsRestartPriority_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'enableAPDTimeoutForHosts'
//
one sig clusterdefaultdasvmconfig_enableAPDTimeoutForHosts extends Attribute {} {
    name = "enableAPDTimeoutForHosts"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "This property indicates if APD timeout will be enabled for all the hosts in the cluster when vSphere HA is configured. The details of APD timeout are described in HostMountInfoInaccessibleReason.
    If vmComponentProtecting is disabled, the property will be ignored. Otherwise, for each host in the cluster, APD timeout will be enabled. Note that no change will be made for a host if it already had APD timeout enabled.
    
    This property is meaningful only for cluster setting. It is ignored if specified at VM level. The default value is false if not specified.
    
    Note that this property is not persisted by vSphere backend. It does not impact any cluster reconfiguration or host operation (such as adding a host to a cluster) that might happen later. "
    multiple_values = False
}

//
// OCCI attribute 'vmReactionOnAPDCleared'
//
one sig clusterdefaultdasvmconfig_vmReactionOnAPDCleared extends Attribute {} {
    name = "vmReactionOnAPDCleared"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Action taken by VM Component Protection service for a powered on VM when APD condition clears after APD timeout.
    This property is meaningful only when vSphere HA is turned on. Valid values are specified by VmReactionOnAPDCleared. The default value is VmReactionOnAPDCleared#none for cluster setting and VmReactionOnAPDCleared#useClusterDefault for per-VM setting. "
    multiple_values = False
}

//
// OCCI attribute 'vmStorageProtectionForAPD'
//
one sig clusterdefaultdasvmconfig_vmStorageProtectionForAPD extends Attribute {} {
    name = "vmStorageProtectionForAPD"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "VM storage protection setting for storage failures categorized as All Paths Down (APD). APD is a condition where a storage has become inaccessible for unknown reasons. It only indicates loss of connectivity and does not indicate storage device failure or LUN removal (Permenant Device Loss or PDL). The details of APD and PDL are described in HostMountInfoInaccessibleReason.
    This property is meaningful only when vSphere HA is turned on. Valid values are specified by StorageVmReaction. The default value is StorageVmReaction#disabled for cluster setting and StorageVmReaction#clusterDefault for per-VM setting.
    
    When an APD condition happens and the host begins timing out I/Os (@link vim.host.MountInfo.InaccessibleReason#AllPathsDown_Timeout}, VM Component Protection service will react based on the specific value of this property:
    
    StorageVmReaction#disabled, no reaction, i.e., no VM failover and no event reporting for the failures.
    StorageVmReaction#warning, service will issue events, alarms and/or config issues for component failures.
    StorageVmReaction#restartConservative, service will terminate the impacted VMs after a preconfigured time interval (vmTerminateDelayForAPDSec) if they are to be restarted.
    StorageVmReaction#restartAggressive, service might terminate the impacted VMs after a preconfigured time interval (vmTerminateDelayForAPDSec). In some cases, a VM is terminated even if it may not able to be restarted or lose Fault Tolerance redundancy.
    StorageVmReaction#clusterDefault, service will implement cluster default."
    multiple_values = False
}

//
// OCCI attribute 'vmStorageProtectionForPDL'
//
one sig clusterdefaultdasvmconfig_vmStorageProtectionForPDL extends Attribute {} {
    name = "vmStorageProtectionForPDL"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "VM storage protection setting for storage failures categorized as Permenant Device Loss (PDL). PDL indicates storage device failure or LUN removal. In case of PDL, the failed datastore or device is unlikely to recover. The details of PDL are described in HostMountInfoInaccessibleReason.
    This property is meaningful only when vSphere HA is turned on. Valid values are StorageVmReaction#disabled, StorageVmReaction#warning, StorageVmReaction#restartAggressive and StorageVmReaction#clusterDefault. The default value is StorageVmReaction#disabled for cluster setting and StorageVmReaction#clusterDefault for per-VM setting.
    
    When set to StorageVmReaction#restartAggressive, VM Component Protection service will immediately terminate the VMs impacted by PDL and will attempt to restart the VMs with best effort. When set to the other values, the behavior is the same as described for vmStorageProtectionForAPD."
    multiple_values = False
}

//
// OCCI attribute 'vmTerminateDelayForAPDSec'
//
one sig clusterdefaultdasvmconfig_vmTerminateDelayForAPDSec extends Attribute {} {
    name = "vmTerminateDelayForAPDSec"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The time interval after an APD timeout has been declared and before VM Component Protection service will terminate the VM. The value only applies if vmStorageProtectionForAPD is set to StorageVmReaction#restartConservative or StorageVmReaction#restartAggressive.
    The default value is 180 seconds if not specified. To use cluster setting for a VM override, set to -1 in per-VM setting. "
    multiple_values = False
}

// ======================================================================
// Signature for Clusterdefaultdasvmconfig
// ======================================================================

sig Clusterdefaultdasvmconfig in core/Entity {
    isolationResponse : lone ClusterDASVmSettingsIsolationResponse,
    restartPriority : lone ClusterDASVmSettingsRestartPriority,
    enableAPDTimeoutForHosts : lone core/Boolean,
    vmReactionOnAPDCleared : lone String,
    vmStorageProtectionForAPD : lone String,
    vmStorageProtectionForPDL : lone String,
    vmTerminateDelayForAPDSec : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dasvmsettings'
//
// ======================================================================

one sig dasvmsettings extends Mixin {} {
    term = "dasvmsettings"
    scheme = "http://occiware.org/occi/vmware#"
    title = "VMware HA configuration for a single virtual machine, all fields are defined as optional. In case of a reconfiguration, fields left unset are not changed"
    no depends
    applies = vm
    attributes = dasvmsettings_isolationResponse + dasvmsettings_restartPriority + dasvmsettings_vmStorageProtectionForPDL + dasvmsettings_enableAPDTimeoutForHosts + dasvmsettings_vmTerminateDelayForAPDSec + dasvmsettings_vmReactionOnAPDCleared + dasvmsettings_vmStorageProtectionForAPD
    no actions
    entities in Dasvmsettings
}

//
// OCCI attribute 'isolationResponse'
//
one sig dasvmsettings_isolationResponse extends Attribute {} {
    name = "isolationResponse"
    type = ClusterDASVmSettingsIsolationResponse_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'restartPriority'
//
one sig dasvmsettings_restartPriority extends Attribute {} {
    name = "restartPriority"
    type = ClusterDASVmSettingsRestartPriority_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'vmStorageProtectionForPDL'
//
one sig dasvmsettings_vmStorageProtectionForPDL extends Attribute {} {
    name = "vmStorageProtectionForPDL"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "VM storage protection setting for storage failures categorized as Permenant Device Loss (PDL). PDL indicates storage device failure or LUN removal. In case of PDL, the failed datastore or device is unlikely to recover. The details of PDL are described in HostMountInfoInaccessibleReason.
    This property is meaningful only when vSphere HA is turned on. Valid values are StorageVmReaction#disabled, StorageVmReaction#warning, StorageVmReaction#restartAggressive and StorageVmReaction#clusterDefault. The default value is StorageVmReaction#disabled for cluster setting and StorageVmReaction#clusterDefault for per-VM setting.
    
    When set to StorageVmReaction#restartAggressive, VM Component Protection service will immediately terminate the VMs impacted by PDL and will attempt to restart the VMs with best effort. When set to the other values, the behavior is the same as described for vmStorageProtectionForAPD."
    multiple_values = False
}

//
// OCCI attribute 'enableAPDTimeoutForHosts'
//
one sig dasvmsettings_enableAPDTimeoutForHosts extends Attribute {} {
    name = "enableAPDTimeoutForHosts"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "This property indicates if APD timeout will be enabled for all the hosts in the cluster when vSphere HA is configured. The details of APD timeout are described in HostMountInfoInaccessibleReason.
    If vmComponentProtecting is disabled, the property will be ignored. Otherwise, for each host in the cluster, APD timeout will be enabled. Note that no change will be made for a host if it already had APD timeout enabled.
    
    This property is meaningful only for cluster setting. It is ignored if specified at VM level. The default value is false if not specified.
    
    Note that this property is not persisted by vSphere backend. It does not impact any cluster reconfiguration or host operation (such as adding a host to a cluster) that might happen later. "
    multiple_values = False
}

//
// OCCI attribute 'vmTerminateDelayForAPDSec'
//
one sig dasvmsettings_vmTerminateDelayForAPDSec extends Attribute {} {
    name = "vmTerminateDelayForAPDSec"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The time interval after an APD timeout has been declared and before VM Component Protection service will terminate the VM. The value only applies if vmStorageProtectionForAPD is set to StorageVmReaction#restartConservative or StorageVmReaction#restartAggressive.
    The default value is 180 seconds if not specified. To use cluster setting for a VM override, set to -1 in per-VM setting. "
    multiple_values = False
}

//
// OCCI attribute 'vmReactionOnAPDCleared'
//
one sig dasvmsettings_vmReactionOnAPDCleared extends Attribute {} {
    name = "vmReactionOnAPDCleared"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Action taken by VM Component Protection service for a powered on VM when APD condition clears after APD timeout.
    This property is meaningful only when vSphere HA is turned on. Valid values are specified by VmReactionOnAPDCleared. The default value is VmReactionOnAPDCleared#none for cluster setting and VmReactionOnAPDCleared#useClusterDefault for per-VM setting. "
    multiple_values = False
}

//
// OCCI attribute 'vmStorageProtectionForAPD'
//
one sig dasvmsettings_vmStorageProtectionForAPD extends Attribute {} {
    name = "vmStorageProtectionForAPD"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "VM storage protection setting for storage failures categorized as All Paths Down (APD). APD is a condition where a storage has become inaccessible for unknown reasons. It only indicates loss of connectivity and does not indicate storage device failure or LUN removal (Permenant Device Loss or PDL). The details of APD and PDL are described in HostMountInfoInaccessibleReason.
    This property is meaningful only when vSphere HA is turned on. Valid values are specified by StorageVmReaction. The default value is StorageVmReaction#disabled for cluster setting and StorageVmReaction#clusterDefault for per-VM setting.
    
    When an APD condition happens and the host begins timing out I/Os (@link vim.host.MountInfo.InaccessibleReason#AllPathsDown_Timeout}, VM Component Protection service will react based on the specific value of this property:
    
    StorageVmReaction#disabled, no reaction, i.e., no VM failover and no event reporting for the failures.
    StorageVmReaction#warning, service will issue events, alarms and/or config issues for component failures.
    StorageVmReaction#restartConservative, service will terminate the impacted VMs after a preconfigured time interval (vmTerminateDelayForAPDSec) if they are to be restarted.
    StorageVmReaction#restartAggressive, service might terminate the impacted VMs after a preconfigured time interval (vmTerminateDelayForAPDSec). In some cases, a VM is terminated even if it may not able to be restarted or lose Fault Tolerance redundancy.
    StorageVmReaction#clusterDefault, service will implement cluster default."
    multiple_values = False
}

// ======================================================================
// Signature for Dasvmsettings
// ======================================================================

sig Dasvmsettings in Vm {
    isolationResponse : lone ClusterDASVmSettingsIsolationResponse,
    restartPriority : lone ClusterDASVmSettingsRestartPriority,
    vmStorageProtectionForPDL : lone String,
    enableAPDTimeoutForHosts : lone core/Boolean,
    vmTerminateDelayForAPDSec : lone core/Number,
    vmReactionOnAPDCleared : lone String,
    vmStorageProtectionForAPD : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterhostdpmconfig'
//
// ======================================================================

one sig clusterhostdpmconfig extends Mixin {} {
    term = "clusterhostdpmconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Cluster-wide configuration of the VMware DPM service"
    no depends
    applies = cluster
    attributes = clusterhostdpmconfig_defaultDPMBehavior + clusterhostdpmconfig_dpmEnabled + clusterhostdpmconfig_dpmOptionKeys + clusterhostdpmconfig_dpmOptionValues
    no actions
    entities in Clusterhostdpmconfig
}

//
// OCCI attribute 'defaultDPMBehavior'
//
one sig clusterhostdpmconfig_defaultDPMBehavior extends Attribute {} {
    name = "defaultDPMBehavior"
    type = DpmBehavior_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the default VMware DPM behavior for hosts. This default behavior can be overridden on a per host basis using the ClusterDpmHostConfigInfo object. "
    multiple_values = False
}

//
// OCCI attribute 'dpmEnabled'
//
one sig clusterhostdpmconfig_dpmEnabled extends Attribute {} {
    name = "dpmEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether or not the service is enabled. This service can not be enabled, unless DRS is enabled as well"
    multiple_values = False
}

//
// OCCI attribute 'dpmOptionKeys'
//
one sig clusterhostdpmconfig_dpmOptionKeys extends Attribute {} {
    name = "dpmOptionKeys"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The name of the option using dot notation to reflect the option's position in a hierarchy. For example, you might have an option called "Ethernet" and another option that is a child of that called "Connection". In this case, the key for the latter could be defined as "Ethernet.Connection" "
    multiple_values = True
}

//
// OCCI attribute 'dpmOptionValues'
//
one sig clusterhostdpmconfig_dpmOptionValues extends Attribute {} {
    name = "dpmOptionValues"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The value of the option. The Any data object type enables you to define any value for the option. Typically, however, the value of an option is of type String or Integer. "
    multiple_values = True
}

// ======================================================================
// Signature for Clusterhostdpmconfig
// ======================================================================

sig Clusterhostdpmconfig in Cluster {
    defaultDPMBehavior : lone DpmBehavior,
    dpmEnabled : lone core/Boolean,
    dpmOptionKeys : lone String,
    dpmOptionValues : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsconfig'
//
// ======================================================================

one sig clusterdrsconfig extends Mixin {} {
    term = "clusterdrsconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Cluster-wide configuration of the VMware DRS service. "
    no depends
    applies = cluster
    attributes = clusterdrsconfig_defaultVmDRSBehavior + clusterdrsconfig_drsEnabled + clusterdrsconfig_drsOptionValues + clusterdrsconfig_drsOptionKeys + clusterdrsconfig_vmotionRate + clusterdrsconfig_drsEnableVmBehaviorOverrides
    no actions
    entities in Clusterdrsconfig
}

//
// OCCI attribute 'defaultVmDRSBehavior'
//
one sig clusterdrsconfig_defaultVmDRSBehavior extends Attribute {} {
    name = "defaultVmDRSBehavior"
    type = DrsBehavior_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the default VMware DRS behavior for virtual machines. This default behavior can be overridden on a per virtual machine basis using the ClusterDrsVmConfigInfo object. "
    multiple_values = False
}

//
// OCCI attribute 'drsEnabled'
//
one sig clusterdrsconfig_drsEnabled extends Attribute {} {
    name = "drsEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag indicating whether or not the service is enabled. "
    multiple_values = False
}

//
// OCCI attribute 'drsOptionValues'
//
one sig clusterdrsconfig_drsOptionValues extends Attribute {} {
    name = "drsOptionValues"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The value of the option. The Any data object type enables you to define any value for the option. Typically, however, the value of an option is of type String or Integer. "
    multiple_values = True
}

//
// OCCI attribute 'drsOptionKeys'
//
one sig clusterdrsconfig_drsOptionKeys extends Attribute {} {
    name = "drsOptionKeys"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The name of the option using dot notation to reflect the option's position in a hierarchy. For example, you might have an option called "Ethernet" and another option that is a child of that called "Connection". In this case, the key for the latter could be defined as "Ethernet.Connection" "
    multiple_values = True
}

//
// OCCI attribute 'vmotionRate'
//
one sig clusterdrsconfig_vmotionRate extends Attribute {} {
    name = "vmotionRate"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Threshold for generated ClusterRecommendations. DRS generates only those recommendations that are above the specified vmotionRate. Ratings vary from 1 to 5. This setting applies to manual, partiallyAutomated, and fullyAutomated DRS clusters. See DrsBehavior. "
    multiple_values = False
}

//
// OCCI attribute 'drsEnableVmBehaviorOverrides'
//
one sig clusterdrsconfig_drsEnableVmBehaviorOverrides extends Attribute {} {
    name = "drsEnableVmBehaviorOverrides"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "true"
    description = "Flag that dictates whether DRS Behavior overrides for individual virtual machines (ClusterDrsVmConfigInfo) are enabled. The default value is true.
    When this flag is true, the ClusterConfigSpecEx.drsVmConfigSpec values override the defaultVmBehavior.
    
    When this flag is false, the defaultVmBehavior value applies to all virtual machines, with the following exception: in a cluster that has EVC disabled, you cannot override the virtual machine setting (drsVmConfigSpec) for Fault Tolerance virtual machines."
    multiple_values = False
}

// ======================================================================
// Signature for Clusterdrsconfig
// ======================================================================

sig Clusterdrsconfig in Cluster {
    defaultVmDRSBehavior : lone DrsBehavior,
    drsEnabled : lone core/Boolean,
    drsOptionValues : lone String,
    drsOptionKeys : lone String,
    vmotionRate : lone core/Number,
    drsEnableVmBehaviorOverrides : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdpmconfig'
//
// ======================================================================

one sig hostdpmconfig extends Mixin {} {
    term = "hostdpmconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "DPM configuration for a single host. This makes it possible to override the default behavior for an individual host."
    no depends
    applies = hostsystem
    attributes = hostdpmconfig_dpmEnabled + hostdpmconfig_dpmBehavior
    no actions
    entities in Hostdpmconfig
}

//
// OCCI attribute 'dpmEnabled'
//
one sig hostdpmconfig_dpmEnabled extends Attribute {} {
    name = "dpmEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether or not VirtualCenter is allowed to perform any power related operations or recommendations for this host. If this flag is false, the host is effectively excluded from DPM service.
    If no individual DPM specification exists for a host, this property defaults to true."
    multiple_values = False
}

//
// OCCI attribute 'dpmBehavior'
//
one sig hostdpmconfig_dpmBehavior extends Attribute {} {
    name = "dpmBehavior"
    type = DpmBehavior_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the particular DPM behavior for this host.
    See ClusterDpmConfigInfo"
    multiple_values = False
}

// ======================================================================
// Signature for Hostdpmconfig
// ======================================================================

sig Hostdpmconfig in Hostsystem {
    dpmEnabled : lone core/Boolean,
    dpmBehavior : lone DpmBehavior,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#drsVmConfig'
//
// ======================================================================

one sig drsVmConfig extends Mixin {} {
    term = "drsVmConfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "DRS configuration for a single virtual machine. This makes it possible to override the default behavior for an individual virtual machine"
    no depends
    applies = vm
    attributes = drsVmConfig_drsEnabled + drsVmConfig_drsBehavior
    no actions
    entities in DrsVmConfig
}

//
// OCCI attribute 'drsEnabled'
//
one sig drsVmConfig_drsEnabled extends Attribute {} {
    name = "drsEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether or not VirtualCenter is allowed to perform any DRS migration or initial placement recommendations for this virtual machine. If this flag is false, the virtual machine is effectively excluded from DRS.
    If no individual DRS specification exists for a virtual machine, this property defaults to true. "
    multiple_values = False
}

//
// OCCI attribute 'drsBehavior'
//
one sig drsVmConfig_drsBehavior extends Attribute {} {
    name = "drsBehavior"
    type = DrsBehavior_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the particular DRS behavior for this virtual machine.
    See ClusterDrsConfigInfo"
    multiple_values = False
}

// ======================================================================
// Signature for DrsVmConfig
// ======================================================================

sig DrsVmConfig in Vm {
    drsEnabled : lone core/Boolean,
    drsBehavior : lone DrsBehavior,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterrule'
//
// ======================================================================

one sig clusterrule extends Mixin {} {
    term = "clusterrule"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = cluster
    attributes = clusterrule_status + clusterrule_key + clusterrule_enabled + clusterrule_name
    no actions
    entities in Clusterrule
}

//
// OCCI attribute 'status'
//
one sig clusterrule_status extends Attribute {} {
    name = "status"
    type = OverallStatus_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether or not the rule is currently satisfied."
    multiple_values = True
}

//
// OCCI attribute 'key'
//
one sig clusterrule_key extends Attribute {} {
    name = "key"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Unique ID for rules. When adding a new rule, a key should not be provided. That will be assigned by the server."
    multiple_values = True
}

//
// OCCI attribute 'enabled'
//
one sig clusterrule_enabled extends Attribute {} {
    name = "enabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to indicate whether or not the rule is enabled. "
    multiple_values = True
}

//
// OCCI attribute 'name'
//
one sig clusterrule_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Name of the rule. "
    multiple_values = True
}

// ======================================================================
// Signature for Clusterrule
// ======================================================================

sig Clusterrule in Cluster {
    status : lone OverallStatus,
    key : lone String,
    enabled : lone core/Boolean,
    name : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconnectconfig'
//
// ======================================================================

one sig hostconnectconfig extends Mixin {} {
    term = "hostconnectconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Specifies the parameters needed to add a single host. This includes a small set of optional information about the host configuration. This allows the network and datastore configuration of the host to be synchronized with the naming conventions of the datacenter, as well as the configuration of a vim account (the username/password for the virtual machine files that is created on disk)."
    no depends
    applies = hostsystem
    attributes = hostconnectconfig_connectForce + hostconnectconfig_connectPassword + hostconnectconfig_connectPort + hostconnectconfig_connectSslThumbPrint + hostconnectconfig_connectUserName + hostconnectconfig_connectVimAccountName + hostconnectconfig_connectVimAccountPassword + hostconnectconfig_hostConnectAfterAdded
    no actions
    entities in Hostconnectconfig
}

//
// OCCI attribute 'connectForce'
//
one sig hostconnectconfig_connectForce extends Attribute {} {
    name = "connectForce"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "If this flag is set to "true", then the connection succeeds even if the host is already being managed by another VirtualCenter server. The original VirtualCenter server loses connection to the host."
    multiple_values = False
}

//
// OCCI attribute 'connectPassword'
//
one sig hostconnectconfig_connectPassword extends Attribute {} {
    name = "connectPassword"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The password for the administration account. (Required for adding a host.) "
    multiple_values = False
}

//
// OCCI attribute 'connectPort'
//
one sig hostconnectconfig_connectPort extends Attribute {} {
    name = "connectPort"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The port number for the connection. If this is not specified, the default port number is used. For ESX 2.x hosts this is the authd port (902 by default). For ESX 3.x and above and VMware Server hosts this is the https port (443 by default). If this is a reconnect, the port number is unchanged. "
    multiple_values = False
}

//
// OCCI attribute 'connectSslThumbPrint'
//
one sig hostconnectconfig_connectSslThumbPrint extends Attribute {} {
    name = "connectSslThumbPrint"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The thumbprint of the SSL certificate, which the host is expected to have. If this value is set and matches the certificate thumbprint presented by the host, then the host is authenticated. If this value is not set or does not match the certificate thumbprint presented by the host, then the host's certificate is verified by checking whether it was signed by a recognized CA.
    The thumbprint is always computed using the SHA1 hash and is the string representation of that hash in the format: xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx:xx where, 'x' represents a hexadecimal digit"
    multiple_values = False
}

//
// OCCI attribute 'connectUserName'
//
one sig hostconnectconfig_connectUserName extends Attribute {} {
    name = "connectUserName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The administration account on the host. (Required for adding a host.) "
    multiple_values = False
}

//
// OCCI attribute 'connectVimAccountName'
//
one sig hostconnectconfig_connectVimAccountName extends Attribute {} {
    name = "connectVimAccountName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The username to be used for accessing the virtual machine files on the disk. "
    multiple_values = False
}

//
// OCCI attribute 'connectVimAccountPassword'
//
one sig hostconnectconfig_connectVimAccountPassword extends Attribute {} {
    name = "connectVimAccountPassword"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The password to be used with the vimAccountName property for accessing the virtual machine files on the disk"
    multiple_values = False
}

//
// OCCI attribute 'hostConnectAfterAdded'
//
one sig hostconnectconfig_hostConnectAfterAdded extends Attribute {} {
    name = "hostConnectAfterAdded"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not the host should be connected immediately after it is added. If the host is to be connected immediately after it is added, but the the connection fails, then an exception is thrown. 
    See field asConnected on addHost_Task cluster compute resource method."
    multiple_values = False
}

// ======================================================================
// Signature for Hostconnectconfig
// ======================================================================

sig Hostconnectconfig in Hostsystem {
    connectForce : lone core/Boolean,
    connectPassword : lone String,
    connectPort : lone core/Number,
    connectSslThumbPrint : lone String,
    connectUserName : lone String,
    connectVimAccountName : lone String,
    connectVimAccountPassword : lone String,
    hostConnectAfterAdded : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsmigrationhistory'
//
// ======================================================================

one sig clusterdrsmigrationhistory extends Mixin {} {
    term = "clusterdrsmigrationhistory"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = cluster
    no attributes
    actions = clusterdrsmigrationhistory_queryClusterMigrationHistory
    entities in Clusterdrsmigrationhistory
}

//
// OCCI action 'http://occiware.org/occi/vmware/clusterdrsmigrationhistory/action#queryClusterMigrationHistory'
//
one sig clusterdrsmigrationhistory_queryClusterMigrationHistory extends Action {} {
    term = "queryClusterMigrationHistory"
    scheme = "http://occiware.org/occi/vmware/clusterdrsmigrationhistory/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Clusterdrsmigrationhistory
// ======================================================================

sig Clusterdrsmigrationhistory in Cluster {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterrecommandations'
//
// ======================================================================

one sig clusterrecommandations extends Mixin {} {
    term = "clusterrecommandations"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = cluster
    no attributes
    actions = clusterrecommandations_queryClusterRecommandations
    entities in Clusterrecommandations
}

//
// OCCI action 'http://occiware.org/occi/vmware/clusterrecommandations/action#queryClusterRecommandations'
//
one sig clusterrecommandations_queryClusterRecommandations extends Action {} {
    term = "queryClusterRecommandations"
    scheme = "http://occiware.org/occi/vmware/clusterrecommandations/action#"
    no title
    no attributes
}


// ======================================================================
// Signature for Clusterrecommandations
// ======================================================================

sig Clusterrecommandations in Cluster {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorecapability'
//
// ======================================================================

one sig datastorecapability extends Mixin {} {
    term = "datastorecapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = datastore
    attributes = datastorecapability_directoryHierarchySupported + datastorecapability_perFileThinProvisioningSupported + datastorecapability_rawDiskMappingsSupported + datastorecapability_nativeSnapshotSupported + datastorecapability_seSparseSupported + datastorecapability_storageIORMSupported + datastorecapability_topLevelDirectoryCreateSupported
    no actions
    entities in Datastorecapability
}

//
// OCCI attribute 'directoryHierarchySupported'
//
one sig datastorecapability_directoryHierarchySupported extends Attribute {} {
    name = "directoryHierarchySupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not directories can be created on this datastore"
    multiple_values = False
}

//
// OCCI attribute 'perFileThinProvisioningSupported'
//
one sig datastorecapability_perFileThinProvisioningSupported extends Attribute {} {
    name = "perFileThinProvisioningSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not the datastore supports thin provisioning on a per file basis. When thin provisioning is used, backing storage is lazily allocated.
    This is supported by VMFS3. VMFS2 always allocates storage eagerly. Thus, this value is false for VMFS2. Most NAS systems always use thin provisioning. They do not support configuring this on a per file basis, so for NAS systems this value is also false"
    multiple_values = False
}

//
// OCCI attribute 'rawDiskMappingsSupported'
//
one sig datastorecapability_rawDiskMappingsSupported extends Attribute {} {
    name = "rawDiskMappingsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not raw disk mappings can be created on this datastore"
    multiple_values = False
}

//
// OCCI attribute 'nativeSnapshotSupported'
//
one sig datastorecapability_nativeSnapshotSupported extends Attribute {} {
    name = "nativeSnapshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the datastore supports native snapshot feature which is based on Copy-On-Write.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'seSparseSupported'
//
one sig datastorecapability_seSparseSupported extends Attribute {} {
    name = "seSparseSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the datastore supports the Flex-SE(SeSparse) feature.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'storageIORMSupported'
//
one sig datastorecapability_storageIORMSupported extends Attribute {} {
    name = "storageIORMSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the datastore supports Storage I/O Resource Management.
    Since vSphere API 4.1"
    multiple_values = False
}

//
// OCCI attribute 'topLevelDirectoryCreateSupported'
//
one sig datastorecapability_topLevelDirectoryCreateSupported extends Attribute {} {
    name = "topLevelDirectoryCreateSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the datastore supports traditional top-level directory creation.
    See DatastoreNamespaceManager
    Since vSphere API 5.5"
    multiple_values = False
}

// ======================================================================
// Signature for Datastorecapability
// ======================================================================

sig Datastorecapability in Datastore {
    directoryHierarchySupported : lone core/Boolean,
    perFileThinProvisioningSupported : lone core/Boolean,
    rawDiskMappingsSupported : lone core/Boolean,
    nativeSnapshotSupported : lone core/Boolean,
    seSparseSupported : lone core/Boolean,
    storageIORMSupported : lone core/Boolean,
    topLevelDirectoryCreateSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostmountinfo'
//
// ======================================================================

one sig datastorehostmountinfo extends Mixin {} {
    term = "datastorehostmountinfo"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Host-specifics datastore informations"
    no depends
    applies = datastore
    attributes = datastorehostmountinfo_accessibles + datastorehostmountinfo_accessModes + datastorehostmountinfo_hostsystemPaths + datastorehostmountinfo_hostsystemNames + datastorehostmountinfo_inaccessibleReasons + datastorehostmountinfo_mounted + datastorehostmountinfo_paths + datastorehostmountinfo_hostnames
    no actions
    entities in Datastorehostmountinfo
}

//
// OCCI attribute 'accessibles'
//
one sig datastorehostmountinfo_accessibles extends Attribute {} {
    name = "accessibles"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag that indicates if the datastore is currently accessible from the host.
    For the case of standalone host agent, this property has the same value as Datastore.Summary.accessible and hence the latter can be used equivalently if this one is not set. VirtualCenter Server will always make sure it is set correctly"
    multiple_values = True
}

//
// OCCI attribute 'accessModes'
//
one sig datastorehostmountinfo_accessModes extends Attribute {} {
    name = "accessModes"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = True
}

//
// OCCI attribute 'hostsystemPaths'
//
one sig datastorehostmountinfo_hostsystemPaths extends Attribute {} {
    name = "hostsystemPaths"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Local file path where file system volume is mounted, if applicable. This path identifies the file system volume from the point of view of the host"
    multiple_values = True
}

//
// OCCI attribute 'hostsystemNames'
//
one sig datastorehostmountinfo_hostsystemNames extends Attribute {} {
    name = "hostsystemNames"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The name of the host associated with this datastore"
    multiple_values = True
}

//
// OCCI attribute 'inaccessibleReasons'
//
one sig datastorehostmountinfo_inaccessibleReasons extends Attribute {} {
    name = "inaccessibleReasons"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "This optional property for inaccessible reason is reported only if a datastore becomes inaccessible as reported by accessible and DatastoreSummary.accessible. The values for inaccessible reason are defined in the enum InaccessibleReason This helps to determine host specific reason for datastore inaccessibility. If the datastore becomes accessible following an inaccessible condition, the property inaccessibleReason will be unset.
    Since vSphere API 5.1"
    multiple_values = True
}

//
// OCCI attribute 'mounted'
//
one sig datastorehostmountinfo_mounted extends Attribute {} {
    name = "mounted"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The mount state of this mount point. For a discovered volume, which is mounted, this is true. When this value is unset, the default value is true.
    Since vSphere API 5.0"
    multiple_values = True
}

//
// OCCI attribute 'paths'
//
one sig datastorehostmountinfo_paths extends Attribute {} {
    name = "paths"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Local file path where file system volume is mounted, if applicable. This path identifies the file system volume from the point of view of the host. "
    multiple_values = True
}

//
// OCCI attribute 'hostnames'
//
one sig datastorehostmountinfo_hostnames extends Attribute {} {
    name = "hostnames"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = True
}

// ======================================================================
// Signature for Datastorehostmountinfo
// ======================================================================

sig Datastorehostmountinfo in Datastore {
    accessibles : lone core/Boolean,
    accessModes : lone String,
    hostsystemPaths : lone String,
    hostsystemNames : lone String,
    inaccessibleReasons : lone String,
    mounted : lone String,
    paths : lone String,
    hostnames : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreinfo'
//
// ======================================================================

one sig datastoreinfo extends Mixin {} {
    term = "datastoreinfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = datastore
    attributes = datastoreinfo_maxFileSize
    no actions
    entities in Datastoreinfo
}

//
// OCCI attribute 'maxFileSize'
//
one sig datastoreinfo_maxFileSize extends Attribute {} {
    name = "maxFileSize"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The maximum size of a file that can reside on this file system volume"
    multiple_values = False
}

// ======================================================================
// Signature for Datastoreinfo
// ======================================================================

sig Datastoreinfo in Datastore {
    maxFileSize : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoresummary'
//
// ======================================================================

one sig datastoresummary extends Mixin {} {
    term = "datastoresummary"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Summary information about the datastore. The status fields and managed object reference is not set when an object of this type is created. These fields and references are typically set later when these objects are associated with a host"
    no depends
    applies = datastore
    attributes = datastoresummary_url + datastoresummary_freespace + datastoresummary_accessible + datastoresummary_capacity + datastoresummary_multipleHostAccess + datastoresummary_type + datastoresummary_volumeName + datastoresummary_maintenanceMode + datastoresummary_uncommitted
    no actions
    entities in Datastoresummary
}

//
// OCCI attribute 'url'
//
one sig datastoresummary_url extends Attribute {} {
    name = "url"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The unique locator for the datastore. This property is guaranteed to be valid only if accessible is true."
    multiple_values = False
}

//
// OCCI attribute 'freespace'
//
one sig datastoresummary_freespace extends Attribute {} {
    name = "freespace"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Available space of this datastore, in bytes. The server periodically updates this value. It can be explicitly refreshed with the Refresh operation. This property is guaranteed to be valid only if accessible is true."
    multiple_values = False
}

//
// OCCI attribute 'accessible'
//
one sig datastoresummary_accessible extends Attribute {} {
    name = "accessible"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "The connectivity status of this datastore. If this is set to false, meaning the datastore is not accessible, this datastore's capacity and freespace properties cannot be validated. 
    Furthermore, if this property is set to false, some of the properties in this summary and in DatastoreInfo should not be used. Refer to the documentation for the property of your interest. 
    For datastores accessed from multiple hosts, vCenter Server reports accessible as an aggregated value of the properties reported in MountInfo. 
    For instance, if a datastore is accessible through a subset of hosts, then the value of accessible will be reported as true by vCenter Server. And the reason for a datastore being inaccessible from a host will be reported in inaccessibleReason "
    multiple_values = False
}

//
// OCCI attribute 'capacity'
//
one sig datastoresummary_capacity extends Attribute {} {
    name = "capacity"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Maximum capacity of this datastore, in bytes. This value is updated periodically by the server. It can be explicitly refreshed with the Refresh operation. This property is guaranteed to be valid only if accessible is true"
    multiple_values = False
}

//
// OCCI attribute 'multipleHostAccess'
//
one sig datastoresummary_multipleHostAccess extends Attribute {} {
    name = "multipleHostAccess"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "More than one host in the datacenter has been configured with access to the datastore. This is only provided by VirtualCenter"
    multiple_values = False
}

//
// OCCI attribute 'type'
//
one sig datastoresummary_type extends Attribute {} {
    name = "type"
    type = HostFileSystemVolumeFileType_DataType
    mutable = False
    required = False
    no default
    description = "Type of file system volume, such as VMFS or NFS.
    The following values are defined:
    VMFS: VMware File System (ESX Server only). If this is set, the type of the file system volume is VMFS.
    NFS: Network file system v3 linux & esx servers only. If this is set, the type of the file system volume is NFS v3
    NFS41: Network file system v4.1 linux & esx servers only. If this is set, the type of the file system volume is NFS v4.1 or later.(Since vSphere API 6.0)
    CIFS: Common Internet File System. If this is set, the type of the file system volume is Common Internet File System. 
    VFFS: vFlash File System (ESX Server only). If this is set, the type of the file system volume is VFFS. (Since vSphere API 6.0)
    vsan: VSAN File System (ESX Server only).(Since vSphere API 6.0)
    OTHER: Used if the file system is not one of the specified file systems. Used mostly for reporting purposes. The other types are described by the otherType property. 
    VVOL: vvol File System (ESX Server only).(Since vSphere API 6.0)"
    multiple_values = False
}

//
// OCCI attribute 'volumeName'
//
one sig datastoresummary_volumeName extends Attribute {} {
    name = "volumeName"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Name of the file system volume"
    multiple_values = False
}

//
// OCCI attribute 'maintenanceMode'
//
one sig datastoresummary_maintenanceMode extends Attribute {} {
    name = "maintenanceMode"
    type = DatastoreMaintenanceModeState_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'uncommitted'
//
one sig datastoresummary_uncommitted extends Attribute {} {
    name = "uncommitted"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Total additional storage space, in bytes, potentially used by all virtual machines on this datastore. The server periodically updates this value. It can be explicitly refreshed with the RefreshDatastoreStorageInfo operation. This property is valid only if accessible is true."
    multiple_values = False
}

// ======================================================================
// Signature for Datastoresummary
// ======================================================================

sig Datastoresummary in Datastore {
    url : lone String,
    freespace : lone LongNumber,
    accessible : lone core/Boolean,
    capacity : lone LongNumber,
    multipleHostAccess : lone core/Boolean,
    type : lone HostFileSystemVolumeFileType,
    volumeName : lone String,
    maintenanceMode : lone DatastoreMaintenanceModeState,
    uncommitted : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostnasvolumeconfig'
//
// ======================================================================

one sig datastorehostnasvolumeconfig extends Mixin {} {
    term = "datastorehostnasvolumeconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "To create NAS (using cifs or default nfs) datastore on a hostsystem via HostDatastoreSystem object and HostNasVolumeSpec"
    depends = datastoreconfig
    no applies
    attributes = datastorehostnasvolumeconfig_accessMode + datastorehostnasvolumeconfig_localPath + datastorehostnasvolumeconfig_userName + datastorehostnasvolumeconfig_password + datastorehostnasvolumeconfig_remoteHost + datastorehostnasvolumeconfig_remotePath + datastorehostnasvolumeconfig_volumeType + datastorehostnasvolumeconfig_remoteHostnames + datastorehostnasvolumeconfig_securityType
    no actions
    entities in Datastorehostnasvolumeconfig
}

//
// OCCI attribute 'accessMode'
//
one sig datastorehostnasvolumeconfig_accessMode extends Attribute {} {
    name = "accessMode"
    type = DatastoreHostMountMode_DataType
    mutable = True
    required = False
    no default
    description = "Access mode for the mount point.
    Mounting in read-write mode would be successful irregardless on how the mount point is exported or access permissions. For example, mounting a volume that is exported as read-only as readWrite will succeed. Hence, that a readWrite mount succeeds should not be taken as an indication that all files on a mount is writable.
    
    If a file system is mounted readOnly, the system cannot create or modify any files on the file system. This is mostly useful for storing ISO images and templates, since a virtual machine cannot be powered on from a readOnly volume.
    
    The access mode of a mounted NFS volume can be obtained at accessModes via datastorehostmountinfo mixin."
    multiple_values = False
}

//
// OCCI attribute 'localPath'
//
one sig datastorehostnasvolumeconfig_localPath extends Attribute {} {
    name = "localPath"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The localPath refers to the name of the NAS datastore to be created using this specification.
    In the case of ESX Server, the datastore name is a component in the file system path at which the NAS volume can be found. For example, if localPath is set to "nas_volume" the created NAS datastore will be named "nas_volume" and it can be accessed via the file system path "/vmfs/volumes/nas_volume".
    
    In the case of VMware Server, the localPath will also be used as the datastore name, but the datastore name may not necessarily be reflected in the file system path where the NAS volume may be accessed"
    multiple_values = False
}

//
// OCCI attribute 'userName'
//
one sig datastorehostnasvolumeconfig_userName extends Attribute {} {
    name = "userName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "If type is CIFS, the user name to use when connecting to the CIFS server. If type is NFS, this field will be ignored"
    multiple_values = False
}

//
// OCCI attribute 'password'
//
one sig datastorehostnasvolumeconfig_password extends Attribute {} {
    name = "password"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "If type is CIFS, the password to use when connecting to the CIFS server. If type is NFS, this field will be ignored."
    multiple_values = False
}

//
// OCCI attribute 'remoteHost'
//
one sig datastorehostnasvolumeconfig_remoteHost extends Attribute {} {
    name = "remoteHost"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The host that runs the NFS v3 or CIFS server. For NFS v4.1 and beyond use remoteHostNames defined later. The field remotehost may be deprecated in future for NFS, so clients should plan to use the property remoteHostNames to send in the host name(s) for both NFS v3 and v4.1 "
    multiple_values = False
}

//
// OCCI attribute 'remotePath'
//
one sig datastorehostnasvolumeconfig_remotePath extends Attribute {} {
    name = "remotePath"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The remote path of the NFS mount point. "
    multiple_values = False
}

//
// OCCI attribute 'volumeType'
//
one sig datastorehostnasvolumeconfig_volumeType extends Attribute {} {
    name = "volumeType"
    type = core/String_DataType
    mutable = True
    required = True
    default = "NFS"
    description = "Specifies the type of the the NAS volume. Supported types are CIFS, NFS, NFS41 If not specified, defaults to NFS"
    multiple_values = False
}

//
// OCCI attribute 'remoteHostnames'
//
one sig datastorehostnasvolumeconfig_remoteHostnames extends Attribute {} {
    name = "remoteHostnames"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Hostnames or IP addresses of remote NFS server. In case of NFS v4.1 this may have multiple entries. For NFS v3 the input should be same in both remoteHost and remoteHostNames.
    Since vSphere API 6.0"
    multiple_values = True
}

//
// OCCI attribute 'securityType'
//
one sig datastorehostnasvolumeconfig_securityType extends Attribute {} {
    name = "securityType"
    type = HostNasVolumeSecurityType_DataType
    mutable = False
    required = False
    no default
    description = "Provided during mount indicating what security type, if any, to use See HostNasVolumeSecurityType
    Since vSphere API 6.0
    AUTH_SYS: Authentication based on traditional UNIX identifiers (UID and GID). Server trusts the IDs sent by the client for each request and uses them to perform access control. Current implementation only supports AUTH_SYS with root user. 
    SEC_KRB5: Ensures RPC header authentication using Kerberos session keys. When this option is enabled, the client uses the information specified in UserInfo to establish shared keys with the server using Kerberos. These shared keys are used to generate and verify message authentication codes for RPC header of NFS requests and responses, respectively. This method does not secure NFS file data "
    multiple_values = False
}

// ======================================================================
// Signature for Datastorehostnasvolumeconfig
// ======================================================================

sig Datastorehostnasvolumeconfig in core/Entity {
    accessMode : lone DatastoreHostMountMode,
    localPath : one String,
    userName : lone String,
    password : lone String,
    remoteHost : one String,
    remotePath : one String,
    volumeType : one String,
    remoteHostnames : lone String,
    securityType : lone HostNasVolumeSecurityType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreuserprincipalauth'
//
// ======================================================================

one sig datastoreuserprincipalauth extends Mixin {} {
    term = "datastoreuserprincipalauth"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Use for configuration user and password for this datastore, be warn that changing the user and password operation must be performed while in maintenance mode and requires host reboot"
    no depends
    applies = datastore
    attributes = datastoreuserprincipalauth_userName + datastoreuserprincipalauth_password
    actions = datastoreuserprincipalauth_changeDatastoreUserPassword
    entities in Datastoreuserprincipalauth
}

//
// OCCI attribute 'userName'
//
one sig datastoreuserprincipalauth_userName extends Attribute {} {
    name = "userName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Datastore principal user name"
    multiple_values = False
}

//
// OCCI attribute 'password'
//
one sig datastoreuserprincipalauth_password extends Attribute {} {
    name = "password"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Optional password for systems that require password for user impersonation"
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/datastoreuserprincipalauth/action#changeDatastoreUserPassword'
//
one sig datastoreuserprincipalauth_changeDatastoreUserPassword extends Action {} {
    term = "changeDatastoreUserPassword"
    scheme = "http://occiware.org/occi/vmware/datastoreuserprincipalauth/action#"
    title = "All virtual machine-related file I/O is performed under this user. Configuring datastore principal user will result in all virtual machine files (configuration, disk, and so on) being checked for proper access. If necessary, ownership and permissions are modified. Note that in some environments, file ownership and permissions modification may not be possible. For example, virtual machine files stored on NFS cannot be modified for ownership and permissions if root squashing is enabled. Ownership and permissions for these files must be manually changed by a system administrator. In general, if server process does not have rights to change ownership and file permissions of virtual machine files, they must be modified manually. If a virtual machine files are not read/writeable by this user, virtual machine related operations such as power on/off, configuration, and so on will fail. This operation must be performed while in maintenance mode and requires host reboot. See ConfigureDatastorePrincipal method on HostDatastoreSystem object"
    no attributes
}


// ======================================================================
// Signature for Datastoreuserprincipalauth
// ======================================================================

sig Datastoreuserprincipalauth in Datastore {
    userName : lone String,
    password : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostvmfsvolumeconfig'
//
// ======================================================================

one sig datastorehostvmfsvolumeconfig extends Mixin {} {
    term = "datastorehostvmfsvolumeconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "To create VMFS datastore on a hostsystem via HostDatastoreSystem object and VmfsDatastoreCreateSpec use queries method for partitionning options and extent capabilities"
    depends = datastoreconfig
    no applies
    attributes = datastorehostvmfsvolumeconfig_diskUUID + datastorehostvmfsvolumeconfig_blockSizeMb + datastorehostvmfsvolumeconfig_vmfsVolumeName + datastorehostvmfsvolumeconfig_vmfsMajorVersion + datastorehostvmfsvolumeconfig_extentDiskName + datastorehostvmfsvolumeconfig_extentPartition
    actions = datastorehostvmfsvolumeconfig_extendVMFS + datastorehostvmfsvolumeconfig_formatVMFS
    entities in Datastorehostvmfsvolumeconfig
}

//
// OCCI attribute 'diskUUID'
//
one sig datastorehostvmfsvolumeconfig_diskUUID extends Attribute {} {
    name = "diskUUID"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The UUID of the SCSI disk on which the VMFS datastore is located"
    multiple_values = False
}

//
// OCCI attribute 'blockSizeMb'
//
one sig datastorehostvmfsvolumeconfig_blockSizeMb extends Attribute {} {
    name = "blockSizeMb"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "1"
    description = "The block size of VMFS in megabytes (MB). Determines the maximum file size. If this optional property is not set, the maximum file size defaults to the maximum file size for the platform.
    In VMFS2, the valid block sizes 1MB, 2MB, 4MB, 8MB, 16MB, 32MB, 64MB, 128MB, and 256MB. In VMFS3, the valid block sizes are 1MB, 2MB, 4MB, and 8MB. In VMFS5, the only valid block size is 1MB."
    multiple_values = False
}

//
// OCCI attribute 'vmfsVolumeName'
//
one sig datastorehostvmfsvolumeconfig_vmfsVolumeName extends Attribute {} {
    name = "vmfsVolumeName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Volume name of VMFS"
    multiple_values = False
}

//
// OCCI attribute 'vmfsMajorVersion'
//
one sig datastorehostvmfsvolumeconfig_vmfsMajorVersion extends Attribute {} {
    name = "vmfsMajorVersion"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Major version number of VMFS. This can be changed if the VMFS is upgraded, but this is an irreversible change. "
    multiple_values = False
}

//
// OCCI attribute 'extentDiskName'
//
one sig datastorehostvmfsvolumeconfig_extentDiskName extends Attribute {} {
    name = "extentDiskName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The SCSI disk device on which a VMware File System (VMFS) extent resides.
    See HostScsiDisk
    See canonicalName"
    multiple_values = False
}

//
// OCCI attribute 'extentPartition'
//
one sig datastorehostvmfsvolumeconfig_extentPartition extends Attribute {} {
    name = "extentPartition"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The partition number of the partition on the ScsiDisk."
    multiple_values = False
}

//
// OCCI action 'http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#extendVMFS'
//
one sig datastorehostvmfsvolumeconfig_extendVMFS extends Action {} {
    term = "extendVMFS"
    scheme = "http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#"
    title = "Extends an existing VMFS datastore."
    no attributes
}


//
// OCCI action 'http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#formatVMFS'
//
one sig datastorehostvmfsvolumeconfig_formatVMFS extends Action {} {
    term = "formatVMFS"
    scheme = "http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#"
    title = "Formats a new VMFS on a disk partition, use carefully"
    no attributes
}


// ======================================================================
// Signature for Datastorehostvmfsvolumeconfig
// ======================================================================

sig Datastorehostvmfsvolumeconfig in core/Entity {
    diskUUID : lone String,
    blockSizeMb : lone core/Number,
    vmfsVolumeName : lone String,
    vmfsMajorVersion : lone core/Number,
    extentDiskName : lone String,
    extentPartition : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostlocalvolumeconfig'
//
// ======================================================================

one sig datastorehostlocalvolumeconfig extends Mixin {} {
    term = "datastorehostlocalvolumeconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "To create a local datastore on a hostsystem"
    depends = datastoreconfig
    no applies
    attributes = datastorehostlocalvolumeconfig_filepathdir
    no actions
    entities in Datastorehostlocalvolumeconfig
}

//
// OCCI attribute 'filepathdir'
//
one sig datastorehostlocalvolumeconfig_filepathdir extends Attribute {} {
    name = "filepathdir"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The file path for a directory in which the virtual machine data will be stored"
    multiple_values = False
}

// ======================================================================
// Signature for Datastorehostlocalvolumeconfig
// ======================================================================

sig Datastorehostlocalvolumeconfig in core/Entity {
    filepathdir : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmconfig'
//
// ======================================================================

one sig vmconfig extends Mixin {} {
    term = "vmconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = vmconfig_vmFileFolder + vmconfig_changeVersion + vmconfig_memoryReservationLockedToMax + vmconfig_memoryHotAddEnabled + vmconfig_hotPlugMemoryiIcrementSize + vmconfig_changeTrackingEnabled + vmconfig_initialMemoryReservation + vmconfig_managedByExtensionKey + vmconfig_managedByType + vmconfig_swapPlacement + vmconfig_version + vmconfig_locationId + vmconfig_lastModified + vmconfig_vAssertsEnabled + vmconfig_hotPlugMemoryLimit + vmconfig_initialSwapReservation + vmconfig_maxMKSConnections + vmconfig_virtualICH7mpresent + vmconfig_virtualSMCPresent + vmconfig_messageBusTunnelEnabled + vmconfig_netstedHVEnabled + vmconfig_swapStorageObjectId + vmconfig_vFlashCacheReservation + vmconfig_vmxConfigChecksum + vmconfig_vPMCEnabled
    no actions
    entities in Vmconfig
}

//
// OCCI attribute 'vmFileFolder'
//
one sig vmconfig_vmFileFolder extends Attribute {} {
    name = "vmFileFolder"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Folder where the vm configuration file is set on the datastore"
    multiple_values = False
}

//
// OCCI attribute 'changeVersion'
//
one sig vmconfig_changeVersion extends Attribute {} {
    name = "changeVersion"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The changeVersion is a unique identifier for a given version of the configuration. Each change to the configuration updates this value. This is typically implemented as an ever increasing count or a time-stamp. However, a client should always treat this as an opaque string. "
    multiple_values = False
}

//
// OCCI attribute 'memoryReservationLockedToMax'
//
one sig vmconfig_memoryReservationLockedToMax extends Attribute {} {
    name = "memoryReservationLockedToMax"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "If set true, memory resource reservation for this virtual machine will always be equal to the virtual machine's memory size; increases in memory size will be rejected when a corresponding reservation increase is not possible."
    multiple_values = False
}

//
// OCCI attribute 'memoryHotAddEnabled'
//
one sig vmconfig_memoryHotAddEnabled extends Attribute {} {
    name = "memoryHotAddEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Whether memory can be added while this virtual machine is running."
    multiple_values = False
}

//
// OCCI attribute 'hotPlugMemoryiIcrementSize'
//
one sig vmconfig_hotPlugMemoryiIcrementSize extends Attribute {} {
    name = "hotPlugMemoryiIcrementSize"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "Memory, in MB that can be added to a running virtual machine must be in increments of this value and needs be a multiple of this value. This value is determined by the virtual machine and is specified only if memoryHotAddEnabled has been set to true."
    multiple_values = False
}

//
// OCCI attribute 'changeTrackingEnabled'
//
one sig vmconfig_changeTrackingEnabled extends Attribute {} {
    name = "changeTrackingEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether changed block tracking for this VM's disks is active"
    multiple_values = False
}

//
// OCCI attribute 'initialMemoryReservation'
//
one sig vmconfig_initialMemoryReservation extends Attribute {} {
    name = "initialMemoryReservation"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Memory overhead required for virtual machine to be powered on (in bytes). See VirtualMachineConfigInfoOverheadInfo"
    multiple_values = False
}

//
// OCCI attribute 'managedByExtensionKey'
//
one sig vmconfig_managedByExtensionKey extends Attribute {} {
    name = "managedByExtensionKey"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Specifies that this VM is managed by a VC Extension. See the managedBy property in the ConfigSpec for more details
    Key of the extension managing the entity."
    multiple_values = False
}

//
// OCCI attribute 'managedByType'
//
one sig vmconfig_managedByType extends Attribute {} {
    name = "managedByType"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Specifies that this VM is managed by a VC Extension. See the managedBy property in the ConfigSpec for more details
    Managed entity type, as defined by the extension managing the entity. An extension can manage different types of entities - different kinds of virtual machines, vApps, etc. - and this property is used to find the corresponding managedEntityInfo entry from the extension. "
    multiple_values = False
}

//
// OCCI attribute 'swapPlacement'
//
one sig vmconfig_swapPlacement extends Attribute {} {
    name = "swapPlacement"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Virtual machine swapfile placement policy. This will be unset if the virtual machine's swapPlacementSupported capability is false. If swapPlacementSupported is true, the default policy is "inherit"
    Available choices for virtual machine swapfile placement policy. This is the set of legal values for the virtual machine configuration's swapPlacement property. All values except for "inherit" and "vmConfigured" are also valid values for a compute resource configuration's vmSwapPlacement property
    hostLocal: Store the swapfile in the datastore specified by the localSwapDatastore property of the virtual machine's host, if that property is set and indicates a datastore with sufficient free space. Otherwise store the swapfile in the same directory as the virtual machine.
    Note: This setting may degrade VMotion performance. 
    inherit: Honor the virtual machine swapfile placement policy of the compute resource that contains this virtual machine.
    vmDirectory: Store the swapfile in the same directory as the virtual machine. "
    multiple_values = False
}

//
// OCCI attribute 'version'
//
one sig vmconfig_version extends Attribute {} {
    name = "version"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The version string for this virtual machine. This is used only while creating a new virtual machine, and can be updated by invoking UpgradeVM_Task for this virtual machine. "
    multiple_values = False
}

//
// OCCI attribute 'locationId'
//
one sig vmconfig_locationId extends Attribute {} {
    name = "locationId"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "Hash incorporating the virtual machine's config file location and the UUID of the host assigned to run the virtual machine. "
    multiple_values = False
}

//
// OCCI attribute 'lastModified'
//
one sig vmconfig_lastModified extends Attribute {} {
    name = "lastModified"
    type = Datetype_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'vAssertsEnabled'
//
one sig vmconfig_vAssertsEnabled extends Attribute {} {
    name = "vAssertsEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether user-configured virtual asserts will be triggered during virtual machine replay."
    multiple_values = False
}

//
// OCCI attribute 'hotPlugMemoryLimit'
//
one sig vmconfig_hotPlugMemoryLimit extends Attribute {} {
    name = "hotPlugMemoryLimit"
    type = LongNumber_DataType
    mutable = False
    required = False
    no default
    description = "The maximum amount of memory, in MB, than can be added to a running virtual machine. This value is determined by the virtual machine and is specified only if memoryHotAddEnabled is set to true."
    multiple_values = False
}

//
// OCCI attribute 'initialSwapReservation'
//
one sig vmconfig_initialSwapReservation extends Attribute {} {
    name = "initialSwapReservation"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "Disk space required for virtual machine to be powered on (in bytes). This space is used by virtualization infrastructure to swap out virtual machine process memory. Location of the file is specified by sched.swap.vmxSwapDir virtual machinge advanced config option or in case it is not specified - current virtual machine home directory is being used. See VirtualMachineConfigInfoOverheadInfo"
    multiple_values = False
}

//
// OCCI attribute 'maxMKSConnections'
//
one sig vmconfig_maxMKSConnections extends Attribute {} {
    name = "maxMKSConnections"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Indicates the maximum number of active remote display connections that the virtual machine will support."
    multiple_values = False
}

//
// OCCI attribute 'virtualICH7mpresent'
//
one sig vmconfig_virtualICH7mpresent extends Attribute {} {
    name = "virtualICH7mpresent"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Does this virtual machine have Virtual Intel I/O Controller Hub 7"
    multiple_values = False
}

//
// OCCI attribute 'virtualSMCPresent'
//
one sig vmconfig_virtualSMCPresent extends Attribute {} {
    name = "virtualSMCPresent"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Does this virtual machine have System Management Controller"
    multiple_values = False
}

//
// OCCI attribute 'messageBusTunnelEnabled'
//
one sig vmconfig_messageBusTunnelEnabled extends Attribute {} {
    name = "messageBusTunnelEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Whether to allow tunneling of clients from the guest VM into the common message bus on the host network."
    multiple_values = False
}

//
// OCCI attribute 'netstedHVEnabled'
//
one sig vmconfig_netstedHVEnabled extends Attribute {} {
    name = "netstedHVEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether this VM is configured to use nested hardware-assisted virtualization."
    multiple_values = False
}

//
// OCCI attribute 'swapStorageObjectId'
//
one sig vmconfig_swapStorageObjectId extends Attribute {} {
    name = "swapStorageObjectId"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Virtual Machine Swap Object Identifier. With Object-based Storage systems, VM's Swap is backed by an object. This identifier will be set only if VM swap resided on object-based storage systems."
    multiple_values = False
}

//
// OCCI attribute 'vFlashCacheReservation'
//
one sig vmconfig_vFlashCacheReservation extends Attribute {} {
    name = "vFlashCacheReservation"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Specifies the total vFlash resource reservation for the vFlash caches associated with this VM's virtual disks, in bytes. This reservation must be allocated to power on the VM. See vFlashCacheAllocation for allocated reservation when VM is powered on."
    multiple_values = False
}

//
// OCCI attribute 'vmxConfigChecksum'
//
one sig vmconfig_vmxConfigChecksum extends Attribute {} {
    name = "vmxConfigChecksum"
    type = ByteType_DataType
    mutable = True
    required = False
    no default
    description = "A checksum of vmx config file"
    multiple_values = True
}

//
// OCCI attribute 'vPMCEnabled'
//
one sig vmconfig_vPMCEnabled extends Attribute {} {
    name = "vPMCEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether this VM have virtual CPU performance counters enabled."
    multiple_values = False
}

// ======================================================================
// Signature for Vmconfig
// ======================================================================

sig Vmconfig in Vm {
    vmFileFolder : lone String,
    changeVersion : lone String,
    memoryReservationLockedToMax : lone core/Boolean,
    memoryHotAddEnabled : lone core/Boolean,
    hotPlugMemoryiIcrementSize : lone LongNumber,
    changeTrackingEnabled : lone core/Boolean,
    initialMemoryReservation : lone LongNumber,
    managedByExtensionKey : lone String,
    managedByType : lone String,
    swapPlacement : lone String,
    version : lone String,
    locationId : lone String,
    lastModified : lone Datetype,
    vAssertsEnabled : lone core/Boolean,
    hotPlugMemoryLimit : lone LongNumber,
    initialSwapReservation : lone LongNumber,
    maxMKSConnections : lone core/Number,
    virtualICH7mpresent : lone core/Boolean,
    virtualSMCPresent : lone core/Boolean,
    messageBusTunnelEnabled : lone core/Boolean,
    netstedHVEnabled : lone core/Boolean,
    swapStorageObjectId : lone String,
    vFlashCacheReservation : lone String,
    vmxConfigChecksum : lone ByteType,
    vPMCEnabled : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networkpolicy'
//
// ======================================================================

one sig networkpolicy extends Mixin {} {
    term = "networkpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Policies on the port group take precedence over the ones specified on the virtual switch. "
    no depends
    applies = portgroup + vswitch
    no attributes
    no actions
    entities in Networkpolicy
}

// ======================================================================
// Signature for Networkpolicy
// ======================================================================

sig Networkpolicy in Portgroup + Vswitch {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicfailurecriteria'
//
// ======================================================================

one sig nicfailurecriteria extends Mixin {} {
    term = "nicfailurecriteria"
    scheme = "http://occiware.org/occi/vmware#"
    title = "describes the network adapter failover detection algorithm for a network adapter team. The bridge must be BondBridge for this property to be valid"
    depends = nicteamingpolicy
    no applies
    attributes = nicfailurecriteria_checkBeacon + nicfailurecriteria_checkDuplex + nicfailurecriteria_checkErrorPercent + nicfailurecriteria_checkSpeed + nicfailurecriteria_fullDuplex + nicfailurecriteria_percentage + nicfailurecriteria_speed
    no actions
    entities in Nicfailurecriteria
}

//
// OCCI attribute 'checkBeacon'
//
one sig nicfailurecriteria_checkBeacon extends Attribute {} {
    name = "checkBeacon"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not to enable this property to enable beacon probing as a method to validate the link status of a physical network adapter.
    checkBeacon can be enabled only if the VirtualSwitch has been configured to use the beacon. Attempting to set checkBeacon on a PortGroup or VirtualSwitch that does not have beacon probing configured for the applicable VirtualSwitch results in an error.
    See beacon
    See HostVirtualSwitchBeaconConfig"
    multiple_values = False
}

//
// OCCI attribute 'checkDuplex'
//
one sig nicfailurecriteria_checkDuplex extends Attribute {} {
    name = "checkDuplex"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not to use the link duplex reported by the driver as link selection criteria.
    If checkDuplex is true, then fullDuplex is the configured duplex mode. The link is considered bad if the link duplex reported by driver is not the same as fullDuplex.
    
    If checkDuplex is false, then fullDuplex is unused, and link duplexity is not used as a detection method."
    multiple_values = False
}

//
// OCCI attribute 'checkErrorPercent'
//
one sig nicfailurecriteria_checkErrorPercent extends Attribute {} {
    name = "checkErrorPercent"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not to use link error percentage to detect failure.
    If checkErrorPercent is true, then percentage is the configured error percentage that is tolerated. The link is considered bad if error rate exceeds percentage.
    
    If checkErrorPercent is false, percentage is unused, and error percentage is not used as a detection method. "
    multiple_values = False
}

//
// OCCI attribute 'checkSpeed'
//
one sig nicfailurecriteria_checkSpeed extends Attribute {} {
    name = "checkSpeed"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "To use link speed as the criteria, checkSpeed must be one of the following values:
    exact: Use exact speed to detect link failure. speed is the configured exact speed in megabits per second.
    minimum: Use minimum speed to detect failure. speed is the configured minimum speed in megabits per second.
    empty string: Do not use link speed to detect failure. speed is unused in this case."
    multiple_values = False
}

//
// OCCI attribute 'fullDuplex'
//
one sig nicfailurecriteria_fullDuplex extends Attribute {} {
    name = "fullDuplex"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "See checkDuplex"
    multiple_values = False
}

//
// OCCI attribute 'percentage'
//
one sig nicfailurecriteria_percentage extends Attribute {} {
    name = "percentage"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "See checkErrorPercent"
    multiple_values = False
}

//
// OCCI attribute 'speed'
//
one sig nicfailurecriteria_speed extends Attribute {} {
    name = "speed"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "See checkSpeed"
    multiple_values = False
}

// ======================================================================
// Signature for Nicfailurecriteria
// ======================================================================

sig Nicfailurecriteria in core/Entity {
    checkBeacon : lone core/Boolean,
    checkDuplex : lone core/Boolean,
    checkErrorPercent : lone core/Boolean,
    checkSpeed : lone String,
    fullDuplex : lone core/Boolean,
    percentage : lone core/Number,
    speed : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicorderpolicy'
//
// ======================================================================

one sig nicorderpolicy extends Mixin {} {
    term = "nicorderpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "describes network adapter ordering policy for a network adapter team. A physical network adapter can be in the active list, the standby list, or neither. It cannot be in both lists. For a virtual switch, the NicOrderPolicy property is never null when retrieved from the server. When creating a new virtual switch or updating an existing virtual switch, the NicOrderPolicy can be null, in which case the default NicOrderPolicy from the server will be used. For a portgroup, a null NicOrderPolicy property means the portgroup inherits the policy from its parent. Otherwise, the NicOrderPolicy property defined in the portgroup takes precedence. In all cases where the NicOrderPolicy property is set, an empty activeNic array means there are no active Ethernet adapters in the team. An empty standbyNic array means there are no standby Ethernet adapters.The bridge must be BondBridge for this property to be valid."
    depends = nicteamingpolicy
    no applies
    attributes = nicorderpolicy_activeNic + nicorderpolicy_standbyNic
    no actions
    entities in Nicorderpolicy
}

//
// OCCI attribute 'activeNic'
//
one sig nicorderpolicy_activeNic extends Attribute {} {
    name = "activeNic"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "List of active network adapters used for load balancing"
    multiple_values = True
}

//
// OCCI attribute 'standbyNic'
//
one sig nicorderpolicy_standbyNic extends Attribute {} {
    name = "standbyNic"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Standby network adapters used for failover"
    multiple_values = True
}

// ======================================================================
// Signature for Nicorderpolicy
// ======================================================================

sig Nicorderpolicy in core/Entity {
    activeNic : lone String,
    standbyNic : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicteamingpolicy'
//
// ======================================================================

one sig nicteamingpolicy extends Mixin {} {
    term = "nicteamingpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = networkpolicy
    no applies
    attributes = nicteamingpolicy_policy + nicteamingpolicy_reversePolicy + nicteamingpolicy_notifySwitches + nicteamingpolicy_rollingOrder
    no actions
    entities in Nicteamingpolicy
}

//
// OCCI attribute 'policy'
//
one sig nicteamingpolicy_policy extends Attribute {} {
    name = "policy"
    type = NicPolicyTeamingValue_DataType
    mutable = True
    required = False
    no default
    description = "Network adapter teaming policy includes failover and load balancing, It can be one of the following:
    loadbalance_ip: route based on ip hash.
    loadbalance_srcmac: route based on source MAC hash.
    loadbalance_srcid: route based on the source of the port ID.
    failover_explicit: use explicity failover order.
    
    See nicTeamingPolicy"
    multiple_values = False
}

//
// OCCI attribute 'reversePolicy'
//
one sig nicteamingpolicy_reversePolicy extends Attribute {} {
    name = "reversePolicy"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not the teaming policy is applied to inbound frames as well. For example, if the policy is explicit failover, a broadcast request goes through uplink1 and comes back through uplink2. Then if the reverse policy is set, the frame is dropped when it is received from uplink2. This reverse policy is useful to prevent the virtual machine from getting reflections."
    multiple_values = False
}

//
// OCCI attribute 'notifySwitches'
//
one sig nicteamingpolicy_notifySwitches extends Attribute {} {
    name = "notifySwitches"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Flag to specify whether or not to notify the physical switch if a link fails. If this property is true, ESX Server will respond to the failure by sending a RARP packet from a different physical adapter, causing the switch to update its cache"
    multiple_values = False
}

//
// OCCI attribute 'rollingOrder'
//
one sig nicteamingpolicy_rollingOrder extends Attribute {} {
    name = "rollingOrder"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not to use a rolling policy when restoring links. For example, assume the explicit link order is (vmnic9, vmnic0), therefore vmnic9 goes down, vmnic0 comes up. However, when vmnic9 comes backup, if rollingOrder is set to be true, vmnic0 continues to be used, otherwise, vmnic9 is restored as specified in the explicitly order. "
    multiple_values = False
}

// ======================================================================
// Signature for Nicteamingpolicy
// ======================================================================

sig Nicteamingpolicy in core/Entity {
    policy : lone NicPolicyTeamingValue,
    reversePolicy : lone core/Boolean,
    notifySwitches : lone core/Boolean,
    rollingOrder : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#offloadpolicy'
//
// ======================================================================

one sig offloadpolicy extends Mixin {} {
    term = "offloadpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Offload capabilities are used to optimize virtual machine network performance. When a virtual machine is transmitting on a network, some operations can be offloaded to either the host or the physical hardware. This policy indicates what networking related operations should be offloaded.All virtual machines using this PortGroup are subject to this policy. There is no setting for an individual virtual machine to determine if an operation should be offloaded."
    depends = networkpolicy
    no applies
    attributes = offloadpolicy_csumOffload + offloadpolicy_tcpSegmentation + offloadpolicy_zeroCopyXmit
    no actions
    entities in Offloadpolicy
}

//
// OCCI attribute 'csumOffload'
//
one sig offloadpolicy_csumOffload extends Attribute {} {
    name = "csumOffload"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Optional) The flag to indicate whether or not checksum offloading is supported"
    multiple_values = False
}

//
// OCCI attribute 'tcpSegmentation'
//
one sig offloadpolicy_tcpSegmentation extends Attribute {} {
    name = "tcpSegmentation"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Optional) The flag to indicate whether or not TCP segmentation offloading (TSO) is supported."
    multiple_values = False
}

//
// OCCI attribute 'zeroCopyXmit'
//
one sig offloadpolicy_zeroCopyXmit extends Attribute {} {
    name = "zeroCopyXmit"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "(Optional) The flag to indicate whether or not zero copy transmits are supported."
    multiple_values = False
}

// ======================================================================
// Signature for Offloadpolicy
// ======================================================================

sig Offloadpolicy in core/Entity {
    csumOffload : lone core/Boolean,
    tcpSegmentation : lone core/Boolean,
    zeroCopyXmit : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networksecuritypolicy'
//
// ======================================================================

one sig networksecuritypolicy extends Mixin {} {
    term = "networksecuritypolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The security policy governing ports on this virtual switch."
    depends = networkpolicy
    no applies
    attributes = networksecuritypolicy_allowPromiscuous + networksecuritypolicy_forgedTransmits + networksecuritypolicy_macChanges
    no actions
    entities in Networksecuritypolicy
}

//
// OCCI attribute 'allowPromiscuous'
//
one sig networksecuritypolicy_allowPromiscuous extends Attribute {} {
    name = "allowPromiscuous"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not all traffic is seen on the port. "
    multiple_values = False
}

//
// OCCI attribute 'forgedTransmits'
//
one sig networksecuritypolicy_forgedTransmits extends Attribute {} {
    name = "forgedTransmits"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not the virtual network adapter should be allowed to send network traffic with a different MAC address than that of the virtual network adapter. "
    multiple_values = False
}

//
// OCCI attribute 'macChanges'
//
one sig networksecuritypolicy_macChanges extends Attribute {} {
    name = "macChanges"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not the Media Access Control (MAC) address can be changed"
    multiple_values = False
}

// ======================================================================
// Signature for Networksecuritypolicy
// ======================================================================

sig Networksecuritypolicy in core/Entity {
    allowPromiscuous : lone core/Boolean,
    forgedTransmits : lone core/Boolean,
    macChanges : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#trafficshapingpolicy'
//
// ======================================================================

one sig trafficshapingpolicy extends Mixin {} {
    term = "trafficshapingpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "describes traffic shaping policy"
    depends = networkpolicy
    no applies
    attributes = trafficshapingpolicy_averageBandwidth + trafficshapingpolicy_burstSize + trafficshapingpolicy_enabled + trafficshapingpolicy_peakBandwidth
    no actions
    entities in Trafficshapingpolicy
}

//
// OCCI attribute 'averageBandwidth'
//
one sig trafficshapingpolicy_averageBandwidth extends Attribute {} {
    name = "averageBandwidth"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The average bandwidth in bits per second if shaping is enabled on the port"
    multiple_values = False
}

//
// OCCI attribute 'burstSize'
//
one sig trafficshapingpolicy_burstSize extends Attribute {} {
    name = "burstSize"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The maximum burst size allowed in bytes if shaping is enabled on the port"
    multiple_values = False
}

//
// OCCI attribute 'enabled'
//
one sig trafficshapingpolicy_enabled extends Attribute {} {
    name = "enabled"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not traffic shaper is enabled on the port"
    multiple_values = False
}

//
// OCCI attribute 'peakBandwidth'
//
one sig trafficshapingpolicy_peakBandwidth extends Attribute {} {
    name = "peakBandwidth"
    type = LongNumber_DataType
    mutable = True
    required = False
    no default
    description = "The peak bandwidth during bursts in bits per second if traffic shaping is enabled on the port"
    multiple_values = False
}

// ======================================================================
// Signature for Trafficshapingpolicy
// ======================================================================

sig Trafficshapingpolicy in core/Entity {
    averageBandwidth : lone LongNumber,
    burstSize : lone LongNumber,
    enabled : lone core/Boolean,
    peakBandwidth : lone LongNumber,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#portgroupports'
//
// ======================================================================

one sig portgroupports extends Mixin {} {
    term = "portgroupports"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A Port data object type is a runtime representation of network connectivity between a network service or virtual machine and a virtual switch. This is different from a port group in that the port group represents the configuration aspects of the network connection. The Port object provides runtime statistics."
    no depends
    applies = portgroup
    attributes = portgroupports_portkeys + portgroupports_portmacs + portgroupports_connecteeType
    no actions
    entities in Portgroupports
}

//
// OCCI attribute 'portkeys'
//
one sig portgroupports_portkeys extends Attribute {} {
    name = "portkeys"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The linkable identifiers"
    multiple_values = True
}

//
// OCCI attribute 'portmacs'
//
one sig portgroupports_portmacs extends Attribute {} {
    name = "portmacs"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The Media Access Control (MAC) address of network service of the virtual machine connected on this port
    Separated by semicolon."
    multiple_values = True
}

//
// OCCI attribute 'connecteeType'
//
one sig portgroupports_connecteeType extends Attribute {} {
    name = "connecteeType"
    type = PortGroupConnecteeType_DataType
    mutable = False
    required = False
    no default
    description = "The type of component connected on this port. Must be one of the values of :
    host: The VMkernel is connected to this port group
    systemManagement: A system management entity (service console) is connected to this port group.
    unknown: This port group serves an entity of unspecified kind.
    virtualMachine: A virtual machine is connected to this port group."
    multiple_values = True
}

// ======================================================================
// Signature for Portgroupports
// ======================================================================

sig Portgroupports in Portgroup {
    portkeys : lone String,
    portmacs : lone String,
    connecteeType : lone PortGroupConnecteeType,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#micro'
//
// ======================================================================

one sig micro extends Mixin {} {
    term = "micro"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = resource_tpl
    no applies
    no attributes
    no actions
    entities in Micro
}

// ======================================================================
// Signature for Micro
// ======================================================================

sig Micro in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchautobridge'
//
// ======================================================================

one sig vswitchautobridge extends Mixin {} {
    term = "vswitchautobridge"
    scheme = "http://occiware.org/occi/vmware#"
    title = "describes a bridge that automatically selects a particular physical network adapter on the host according to some predetermined policy. Used primarily to support mobility scenarios"
    no depends
    applies = vswitch
    attributes = vswitchautobridge_excludeNicDeviceKeys
    no actions
    entities in Vswitchautobridge
}

//
// OCCI attribute 'excludeNicDeviceKeys'
//
one sig vswitchautobridge_excludeNicDeviceKeys extends Attribute {} {
    name = "excludeNicDeviceKeys"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "List of physical network adapters that have been excluded from participating in the AutoBridge"
    multiple_values = False
}

// ======================================================================
// Signature for Vswitchautobridge
// ======================================================================

sig Vswitchautobridge in Vswitch {
    excludeNicDeviceKeys : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchsimplebridge'
//
// ======================================================================

one sig vswitchsimplebridge extends Mixin {} {
    term = "vswitchsimplebridge"
    scheme = "http://occiware.org/occi/vmware#"
    title = "A bridge that is statically bound to a single physical network adapter"
    no depends
    applies = vswitch
    attributes = vswitchsimplebridge_nicDeviceKey
    no actions
    entities in Vswitchsimplebridge
}

//
// OCCI attribute 'nicDeviceKey'
//
one sig vswitchsimplebridge_nicDeviceKey extends Attribute {} {
    name = "nicDeviceKey"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The key of the physical network adapter to be bridged"
    multiple_values = False
}

// ======================================================================
// Signature for Vswitchsimplebridge
// ======================================================================

sig Vswitchsimplebridge in Vswitch {
    nicDeviceKey : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchbondbridge'
//
// ======================================================================

one sig vswitchbondbridge extends Mixin {} {
    term = "vswitchbondbridge"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vswitch
    attributes = vswitchbondbridge_nicDeviceKeys
    no actions
    entities in Vswitchbondbridge
}

//
// OCCI attribute 'nicDeviceKeys'
//
one sig vswitchbondbridge_nicDeviceKeys extends Attribute {} {
    name = "nicDeviceKeys"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The list of keys of the physical network adapters to be bridged.  The keys may be for example : vmnic0 or vmnic1 etc."
    multiple_values = False
}

// ======================================================================
// Signature for Vswitchbondbridge
// ======================================================================

sig Vswitchbondbridge in Vswitch {
    nicDeviceKeys : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdnsconfig'
//
// ======================================================================

one sig hostdnsconfig extends Mixin {} {
    term = "hostdnsconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Client-side DNS configuration for the host. The DNS configuration is global to the entire host. This is set only if DNS can be configured for the host. "
    depends = hostnetworkconfig
    no applies
    attributes = hostdnsconfig_dnsAddress + hostdnsconfig_dnsDhcp + hostdnsconfig_dnsDomainName + hostdnsconfig_dnsHostname + hostdnsconfig_searchDomain + hostdnsconfig_virtualNicDevice
    no actions
    entities in Hostdnsconfig
}

//
// OCCI attribute 'dnsAddress'
//
one sig hostdnsconfig_dnsAddress extends Attribute {} {
    name = "dnsAddress"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The IP addresses of the DNS servers, placed in order of preference.
    Note: When DHCP is not enabled, the property can be set explicitly. When DHCP is enabled, the property reflects the current DNS configuration, but cannot be set."
    multiple_values = True
}

//
// OCCI attribute 'dnsDhcp'
//
one sig hostdnsconfig_dnsDhcp extends Attribute {} {
    name = "dnsDhcp"
    type = core/Boolean_DataType
    mutable = True
    required = True
    default = "false"
    description = "The flag to indicate whether or not DHCP (dynamic host control protocol) is used to determine DNS configuration automatically."
    multiple_values = False
}

//
// OCCI attribute 'dnsDomainName'
//
one sig hostdnsconfig_dnsDomainName extends Attribute {} {
    name = "dnsDomainName"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The domain name portion of the DNS name. For example, "vmware.com".
    Note: When DHCP is not enabled, the property can be set explicitly. When DHCP is enabled, the property reflects the current DNS configuration, but cannot be set. "
    multiple_values = False
}

//
// OCCI attribute 'dnsHostname'
//
one sig hostdnsconfig_dnsHostname extends Attribute {} {
    name = "dnsHostname"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The host name portion of DNS name. For example, "esx01".
    Note: When DHCP is not enabled, the property can be set explicitly. When DHCP is enabled, the property reflects the current DNS configuration, but cannot be set."
    multiple_values = False
}

//
// OCCI attribute 'searchDomain'
//
one sig hostdnsconfig_searchDomain extends Attribute {} {
    name = "searchDomain"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The domain in which to search for hosts, placed in order of preference.
    Note: When DHCP is not enabled, the property can be set explicitly. When DHCP is enabled, the property reflects the current DNS configuration, but cannot be set."
    multiple_values = True
}

//
// OCCI attribute 'virtualNicDevice'
//
one sig hostdnsconfig_virtualNicDevice extends Attribute {} {
    name = "virtualNicDevice"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "If DHCP is enabled, the DHCP DNS of the service console network adapter will override the system DNS. This field is ignored if DHCP is disabled by the dhcp property."
    multiple_values = False
}

// ======================================================================
// Signature for Hostdnsconfig
// ======================================================================

sig Hostdnsconfig in core/Entity {
    dnsAddress : lone String,
    dnsDhcp : one core/Boolean,
    dnsDomainName : lone String,
    dnsHostname : lone String,
    searchDomain : lone String,
    virtualNicDevice : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkconfig'
//
// ======================================================================

one sig hostnetworkconfig extends Mixin {} {
    term = "hostnetworkconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    no attributes
    no actions
    entities in Hostnetworkconfig
}

// ======================================================================
// Signature for Hostnetworkconfig
// ======================================================================

sig Hostnetworkconfig in Hostsystem {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostiprouteconfig'
//
// ======================================================================

one sig hostiprouteconfig extends Mixin {} {
    term = "hostiprouteconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The IP route configuration for the host. The IP route configuration is global to the entire host. This property is set only if IP routing can be configured for the host. All IP addresses, subnet addresses, and netmasks are specified using IPv4 dot notation. For example, 192.168.0.1"
    depends = hostnetworkconfig
    no applies
    attributes = hostiprouteconfig_defaultGateway + hostiprouteconfig_gatewayDevice
    no actions
    entities in Hostiprouteconfig
}

//
// OCCI attribute 'defaultGateway'
//
one sig hostiprouteconfig_defaultGateway extends Attribute {} {
    name = "defaultGateway"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The default gateway address"
    multiple_values = False
}

//
// OCCI attribute 'gatewayDevice'
//
one sig hostiprouteconfig_gatewayDevice extends Attribute {} {
    name = "gatewayDevice"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The gateway device. This applies to service console gateway only, it is ignored otherwise"
    multiple_values = False
}

// ======================================================================
// Signature for Hostiprouteconfig
// ======================================================================

sig Hostiprouteconfig in core/Entity {
    defaultGateway : lone String,
    gatewayDevice : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconsoleiprouteconfig'
//
// ======================================================================

one sig hostconsoleiprouteconfig extends Mixin {} {
    term = "hostconsoleiprouteconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "IP route configuration for the service console. The IP route configuration is global to the entire host. This property is set only if IP routing can be configured for the service console"
    depends = hostnetworkconfig
    no applies
    attributes = hostconsoleiprouteconfig_consoleDefaultGateway + hostconsoleiprouteconfig_consoleGatewayDevice
    no actions
    entities in Hostconsoleiprouteconfig
}

//
// OCCI attribute 'consoleDefaultGateway'
//
one sig hostconsoleiprouteconfig_consoleDefaultGateway extends Attribute {} {
    name = "consoleDefaultGateway"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The default gateway address"
    multiple_values = False
}

//
// OCCI attribute 'consoleGatewayDevice'
//
one sig hostconsoleiprouteconfig_consoleGatewayDevice extends Attribute {} {
    name = "consoleGatewayDevice"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The gateway device. This applies to service console gateway only, it is ignored otherwise"
    multiple_values = False
}

// ======================================================================
// Signature for Hostconsoleiprouteconfig
// ======================================================================

sig Hostconsoleiprouteconfig in core/Entity {
    consoleDefaultGateway : lone String,
    consoleGatewayDevice : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnatservicenameconfig'
//
// ======================================================================

one sig hostnatservicenameconfig extends Mixin {} {
    term = "hostnatservicenameconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The configuration of naming services. These parameters are specific to Windows system"
    no depends
    applies = hostnatrule
    attributes = hostnatservicenameconfig_dnsAutoDetect + hostnatservicenameconfig_dnsNameServer + hostnatservicenameconfig_dnsPolicy + hostnatservicenameconfig_dnsRetries + hostnatservicenameconfig_dnsTimeOut + hostnatservicenameconfig_nbdsTimeOut + hostnatservicenameconfig_nbnsRetries + hostnatservicenameconfig_nbnsTimeOut
    no actions
    entities in Hostnatservicenameconfig
}

//
// OCCI attribute 'dnsAutoDetect'
//
one sig hostnatservicenameconfig_dnsAutoDetect extends Attribute {} {
    name = "dnsAutoDetect"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "The flag to indicate whether or not the DNS server should be automatically detected or specified explicitly"
    multiple_values = False
}

//
// OCCI attribute 'dnsNameServer'
//
one sig hostnatservicenameconfig_dnsNameServer extends Attribute {} {
    name = "dnsNameServer"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The list of DNS servers"
    multiple_values = True
}

//
// OCCI attribute 'dnsPolicy'
//
one sig hostnatservicenameconfig_dnsPolicy extends Attribute {} {
    name = "dnsPolicy"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The policy to use when multiple DNS addresses are available on the host"
    multiple_values = False
}

//
// OCCI attribute 'dnsRetries'
//
one sig hostnatservicenameconfig_dnsRetries extends Attribute {} {
    name = "dnsRetries"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The number of retries before giving up on a DNS request from a virtual network"
    multiple_values = False
}

//
// OCCI attribute 'dnsTimeOut'
//
one sig hostnatservicenameconfig_dnsTimeOut extends Attribute {} {
    name = "dnsTimeOut"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The time (in seconds) before retrying a DNS request to an external network"
    multiple_values = False
}

//
// OCCI attribute 'nbdsTimeOut'
//
one sig hostnatservicenameconfig_nbdsTimeOut extends Attribute {} {
    name = "nbdsTimeOut"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The time (in seconds) alloted for queries to the NetBIOS Datagram Server (NBDS)"
    multiple_values = False
}

//
// OCCI attribute 'nbnsRetries'
//
one sig hostnatservicenameconfig_nbnsRetries extends Attribute {} {
    name = "nbnsRetries"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "Number of retries for each query to the NBNS. "
    multiple_values = False
}

//
// OCCI attribute 'nbnsTimeOut'
//
one sig hostnatservicenameconfig_nbnsTimeOut extends Attribute {} {
    name = "nbnsTimeOut"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The time (in seconds) alloted for queries to the NBNS"
    multiple_values = False
}

// ======================================================================
// Signature for Hostnatservicenameconfig
// ======================================================================

sig Hostnatservicenameconfig in Hostnatrule {
    dnsAutoDetect : one core/Boolean,
    dnsNameServer : lone String,
    dnsPolicy : one String,
    dnsRetries : one core/Number,
    dnsTimeOut : one core/Number,
    nbdsTimeOut : one core/Number,
    nbnsRetries : one core/Number,
    nbnsTimeOut : one core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetoffloadcapabilities'
//
// ======================================================================

one sig hostnetoffloadcapabilities extends Mixin {} {
    term = "hostnetoffloadcapabilities"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Offload capabilities are used to optimize virtual machine network performance. When a virtual machine is transmitting on a network, some operations can be offloaded either to the host or to physical hardware. This data object type defines the set of offload capabilities that may be available on a host.This is used both to publish the list of offload capabilities and to contain offload capability policy settings. The network policy logic is built on a two-level inheritance scheme which requires that all settings be optional. As a result, all properties on the NetOffloadCapabilities object must be optional."
    depends = hostnetworkconfig
    no applies
    attributes = hostnetoffloadcapabilities_csumOffload + hostnetoffloadcapabilities_tcpSegmentation + hostnetoffloadcapabilities_zeroCopyXmit
    no actions
    entities in Hostnetoffloadcapabilities
}

//
// OCCI attribute 'csumOffload'
//
one sig hostnetoffloadcapabilities_csumOffload extends Attribute {} {
    name = "csumOffload"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "(Optional) The flag to indicate whether or not checksum offloading is supported."
    multiple_values = False
}

//
// OCCI attribute 'tcpSegmentation'
//
one sig hostnetoffloadcapabilities_tcpSegmentation extends Attribute {} {
    name = "tcpSegmentation"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "(Optional) The flag to indicate whether or not TCP segmentation offloading (TSO) is supported."
    multiple_values = False
}

//
// OCCI attribute 'zeroCopyXmit'
//
one sig hostnetoffloadcapabilities_zeroCopyXmit extends Attribute {} {
    name = "zeroCopyXmit"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "(Optional) The flag to indicate whether or not zero copy transmits are supported."
    multiple_values = False
}

// ======================================================================
// Signature for Hostnetoffloadcapabilities
// ======================================================================

sig Hostnetoffloadcapabilities in core/Entity {
    csumOffload : lone core/Boolean,
    tcpSegmentation : lone core/Boolean,
    zeroCopyXmit : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#validlinkspecification'
//
// ======================================================================

one sig validlinkspecification extends Mixin {} {
    term = "validlinkspecification"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The valid combinations of speed and duplexity for this physical network adapter. The speed and the duplex settings usually must be configured as a pair. This array lists all the valid combinations available for a physical network adapter.Autonegotiate is always implicitly available as a configuration option regardless of how many entries appear in the array of valid specifications. "
    no depends
    applies = hostnetworkadapter
    attributes = validlinkspecification_validLinkSpeedMB + validlinkspecification_validLinkDuplex
    no actions
    entities in Validlinkspecification
}

//
// OCCI attribute 'validLinkSpeedMB'
//
one sig validlinkspecification_validLinkSpeedMB extends Attribute {} {
    name = "validLinkSpeedMB"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The bit rate on the link. "
    multiple_values = True
}

//
// OCCI attribute 'validLinkDuplex'
//
one sig validlinkspecification_validLinkDuplex extends Attribute {} {
    name = "validLinkDuplex"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not the link is capable of full-duplex ("true") or only half-duplex ("false")."
    multiple_values = True
}

// ======================================================================
// Signature for Validlinkspecification
// ======================================================================

sig Validlinkspecification in Hostnetworkadapter {
    validLinkSpeedMB : lone core/Number,
    validLinkDuplex : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#currentlinkstate'
//
// ======================================================================

one sig currentlinkstate extends Mixin {} {
    term = "currentlinkstate"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The current link state of the physical network adapter. If this object is not set, then the link is down."
    no depends
    applies = hostnetworkadapter
    attributes = currentlinkstate_currentLinkDuplex + currentlinkstate_currentLinkSpeedMB
    no actions
    entities in Currentlinkstate
}

//
// OCCI attribute 'currentLinkDuplex'
//
one sig currentlinkstate_currentLinkDuplex extends Attribute {} {
    name = "currentLinkDuplex"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate whether or not the link is capable of full-duplex ("true") or only half-duplex ("false")."
    multiple_values = False
}

//
// OCCI attribute 'currentLinkSpeedMB'
//
one sig currentlinkstate_currentLinkSpeedMB extends Attribute {} {
    name = "currentLinkSpeedMB"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The bit rate on the link. "
    multiple_values = False
}

// ======================================================================
// Signature for Currentlinkstate
// ======================================================================

sig Currentlinkstate in Hostnetworkadapter {
    currentLinkDuplex : lone core/Boolean,
    currentLinkSpeedMB : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#physicallinkconfig'
//
// ======================================================================

one sig physicallinkconfig extends Mixin {} {
    term = "physicallinkconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostnetworkadapter
    attributes = physicallinkconfig_linkSpeedMB + physicallinkconfig_linkDuplex
    no actions
    entities in Physicallinkconfig
}

//
// OCCI attribute 'linkSpeedMB'
//
one sig physicallinkconfig_linkSpeedMB extends Attribute {} {
    name = "linkSpeedMB"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The bit rate on the link. "
    multiple_values = False
}

//
// OCCI attribute 'linkDuplex'
//
one sig physicallinkconfig_linkDuplex extends Attribute {} {
    name = "linkDuplex"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "The flag to indicate whether or not the link is capable of full-duplex ("true") or only half-duplex ("false")."
    multiple_values = False
}

// ======================================================================
// Signature for Physicallinkconfig
// ======================================================================

sig Physicallinkconfig in Hostnetworkadapter {
    linkSpeedMB : one core/Number,
    linkDuplex : one core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmforkconfig'
//
// ======================================================================

one sig vmforkconfig extends Mixin {} {
    term = "vmforkconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "describes the fork configuration of this virtual machine."
    no depends
    applies = vm
    attributes = vmforkconfig_childForkGroupId + vmforkconfig_childType + vmforkconfig_parentEnabled
    no actions
    entities in Vmforkconfig
}

//
// OCCI attribute 'childForkGroupId'
//
one sig vmforkconfig_childForkGroupId extends Attribute {} {
    name = "childForkGroupId"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The fork group ID which uniquely identifies which child fork group this child virtual machine belongs to. "
    multiple_values = False
}

//
// OCCI attribute 'childType'
//
one sig vmforkconfig_childType extends Attribute {} {
    name = "childType"
    type = VmForkConfigInfoChildType_DataType
    mutable = True
    required = False
    no default
    description = "The flag to indicate the fork child type. For a persistent child virtual machine, once it is powered on, it will become a linked clone of its parent and this flag will be set to 'none'."
    multiple_values = False
}

//
// OCCI attribute 'parentEnabled'
//
one sig vmforkconfig_parentEnabled extends Attribute {} {
    name = "parentEnabled"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag to indicate whether this virtual machine is a parent enabled virtual machine. If this vm is not a parent enabled vm this property will be unset. When set into the vim.vm.ConfigSpec this flag will be ignored."
    multiple_values = False
}

// ======================================================================
// Signature for Vmforkconfig
// ======================================================================

sig Vmforkconfig in Vm {
    childForkGroupId : lone String,
    childType : lone VmForkConfigInfoChildType,
    parentEnabled : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#faulttoleranceconfig'
//
// ======================================================================

one sig faulttoleranceconfig extends Mixin {} {
    term = "faulttoleranceconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Fault Tolerance settings for this virtual machine."
    no depends
    applies = vm
    attributes = faulttoleranceconfig_faultToleranceConfigPaths + faulttoleranceconfig_instanceUuids + faulttoleranceconfig_orphaned + faulttoleranceconfig_role
    no actions
    entities in Faulttoleranceconfig
}

//
// OCCI attribute 'faultToleranceConfigPaths'
//
one sig faulttoleranceconfig_faultToleranceConfigPaths extends Attribute {} {
    name = "faultToleranceConfigPaths"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The configuration file path for all the VMs in this fault tolerance group"
    multiple_values = True
}

//
// OCCI attribute 'instanceUuids'
//
one sig faulttoleranceconfig_instanceUuids extends Attribute {} {
    name = "instanceUuids"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The instanceUuid of all the VMs in this fault tolerance group. The first element is the instanceUuid of the primary VM. "
    multiple_values = True
}

//
// OCCI attribute 'orphaned'
//
one sig faulttoleranceconfig_orphaned extends Attribute {} {
    name = "orphaned"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Indicates whether a secondary VM is orphaned (no longer associated with the primary VM)."
    multiple_values = False
}

//
// OCCI attribute 'role'
//
one sig faulttoleranceconfig_role extends Attribute {} {
    name = "role"
    type = core/Number_DataType
    mutable = True
    required = True
    no default
    description = "The index of the current VM in instanceUuids array starting from 1, so 1 means that it is the primary VM. "
    multiple_values = False
}

// ======================================================================
// Signature for Faulttoleranceconfig
// ======================================================================

sig Faulttoleranceconfig in Vm {
    faultToleranceConfigPaths : one String,
    instanceUuids : one String,
    orphaned : one core/Boolean,
    role : one core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#latencysensitivity'
//
// ======================================================================

one sig latencysensitivity extends Mixin {} {
    term = "latencysensitivity"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = vm
    attributes = latencysensitivity_latencySensitivityLevel
    no actions
    entities in Latencysensitivity
}

//
// OCCI attribute 'latencySensitivityLevel'
//
one sig latencysensitivity_latencySensitivityLevel extends Attribute {} {
    name = "latencySensitivityLevel"
    type = LatencySensitivityLevel_DataType
    mutable = True
    required = False
    no default
    description = "The nominal latency-sensitive level of the application."
    multiple_values = False
}

// ======================================================================
// Signature for Latencysensitivity
// ======================================================================

sig Latencysensitivity in Vm {
    latencySensitivityLevel : lone LatencySensitivityLevel,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverhost'
//
// ======================================================================

one sig failoverhost extends Mixin {} {
    term = "failoverhost"
    scheme = "http://occiware.org/occi/vmware#"
    title = "The ClusterFailoverHostAdmissionControlPolicy dedicates one or more hosts for use during failover. When a host fails with this policy in place, vSphere HA attempts to restart its virtual machines on a dedicated failover host. If this is not possible, for example the failover host itself has failed or it has insufficient resources, HA attempts to restart those virtual machines on another host in the cluster.
    To support the availabilty of a failover host, the vCenter Server will prevent users from powering on virtual machines on that host, or from using vMotion to migrate virtual machines to the host. Also, DRS does not use the failover host for load balancing."
    depends = clusterdasadmissionctrlpolicy
    no applies
    attributes = failoverhost_failoverhostnames
    no actions
    entities in Failoverhost
}

//
// OCCI attribute 'failoverhostnames'
//
one sig failoverhost_failoverhostnames extends Attribute {} {
    name = "failoverhostnames"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The ClusterFailoverHostAdmissionControlPolicy dedicates one or more hosts for use during failover. When a host fails with this policy in place, vSphere HA attempts to restart its virtual machines on a dedicated failover host. If this is not possible, for example the failover host itself has failed or it has insufficient resources, HA attempts to restart those virtual machines on another host in the cluster.
    To support the availabilty of a failover host, the vCenter Server will prevent users from powering on virtual machines on that host, or from using vMotion to migrate virtual machines to the host. Also, DRS does not use the failover host for load balancing."
    multiple_values = True
}

// ======================================================================
// Signature for Failoverhost
// ======================================================================

sig Failoverhost in core/Entity {
    failoverhostnames : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasadmissionctrlpolicy'
//
// ======================================================================

one sig clusterdasadmissionctrlpolicy extends Mixin {} {
    term = "clusterdasadmissionctrlpolicy"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Virtual machine admission control policy for vSphere HA. The policies specify resource availability for failover support.
    Failover host admission policy ClusterFailoverHostAdmissionControlPolicy - currently you can specify only one failover host.
    Failover level policy ClusterFailoverLevelAdmissionControlPolicy - the limit of host failures for which resources are reserved. When you use the failover level policy, HA partitions resources into slots. A slot represents the minimum CPU and memory resources that are required to support any powered on virtual machine in the cluster. To retrieve information about partitioned resources, use the RetrieveDasAdvancedRuntimeInfo method.
    Resources admission policy ClusterFailoverResourcesAdmissionControlPolicy - CPU and memory resources reserved for failover support. When you use the resources policy, you can reserve a percentage of the aggregate cluster resource for failover."
    depends = clusterdasconfig
    no applies
    no attributes
    no actions
    entities in Clusterdasadmissionctrlpolicy
}

// ======================================================================
// Signature for Clusterdasadmissionctrlpolicy
// ======================================================================

sig Clusterdasadmissionctrlpolicy in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverlevel'
//
// ======================================================================

one sig failoverlevel extends Mixin {} {
    term = "failoverlevel"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = clusterdasadmissionctrlpolicy
    no applies
    attributes = failoverlevel_failoverLevel + failoverlevel_fixedSlotSizeCPU + failoverlevel_fixedSlotSizeMemory
    no actions
    entities in Failoverlevel
}

//
// OCCI attribute 'failoverLevel'
//
one sig failoverlevel_failoverLevel extends Attribute {} {
    name = "failoverLevel"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Number of host failures that should be tolerated, still guaranteeing sufficient resources to restart virtual machines on available hosts. 
    The ClusterFailoverLevelAdmissionControlPolicy defines the number of host failures that should be tolerated and still guarantee enough unfragmented resources to failover all powered on virtual machines on those failed hosts.
    When you use the failover level policy, vSphere HA partitions resources into slots. A slot represents the minimum CPU and memory resources that are required to support any powered-on virtual machine in the cluster.
    
    With the failover level policy in place, HA uses the following slot calculations to control virtual machine migration within the cluster:
    
    Calculate the slot size from CPU and memory reservations. The CPU value is the largest CPU reservation for all powered-on virtual machines in the cluster. The memory value is the largest memory reservation (plus memory overhead).
    If your cluster contains any virtual machines that have much larger reservations than the others, they will distort slot size calculation. To avoid this, you can specify an upper bound for slot sizes; use the configuration editor in the vSphere Client to set the das.slotCpuInMHz and das.slotMemInMB attributes. When you use these attributes, there is a risk that resource fragmentation will cause virtual machines with resource requirements larger than the slot size to be assigned multiple slots. In a cluster that is close to capacity, there might be enough slots in aggregate for HA to successfully failover a virtual machine. However, if those slots are located on multiple hosts, a virtual machine assigned multiple slots cannot use them because a virtual machine can run on only a single host at a time.
    
    Determine how many slots each host in the cluster can hold. HA uses the CPU and memory resources in a host's root resource pool to determine host slot capacity, not the total physical resources of the host. Resources used for virtualization purposes are not included. HA uses connected hosts that are not in maintenance mode and that do not have any HA errors.
    The CPU slot resource is the host CPU resource amount divided by the CPU component of the slot size; the result is rounded down. HA makes the same calculation for host memory resource amount. HA compares the results; the lower of the two numbers is the host slot capacity.
    
    Determine the current failover capacity of the cluster. This is the number of hosts (starting from the largest) that can fail and still leave enough slots to satisfy all of the powered-on virtual machines.
    Compare the current failover capacity to the configured failoverLevel. If the current failover capacity is less than the configured failover level, HA disallows the operation."
    multiple_values = False
}

//
// OCCI attribute 'fixedSlotSizeCPU'
//
one sig failoverlevel_fixedSlotSizeCPU extends Attribute {} {
    name = "fixedSlotSizeCPU"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "The cpu component of the slot size (in MHz)"
    multiple_values = False
}

//
// OCCI attribute 'fixedSlotSizeMemory'
//
one sig failoverlevel_fixedSlotSizeMemory extends Attribute {} {
    name = "fixedSlotSizeMemory"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The memory component of the slot size (in megabytes) "
    multiple_values = False
}

// ======================================================================
// Signature for Failoverlevel
// ======================================================================

sig Failoverlevel in core/Entity {
    failoverLevel : lone core/Number,
    fixedSlotSizeCPU : lone core/Number,
    fixedSlotSizeMemory : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverresources'
//
// ======================================================================

one sig failoverresources extends Mixin {} {
    term = "failoverresources"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = clusterdasadmissionctrlpolicy
    no applies
    attributes = failoverresources_cpuFailoverResourcesPercent + failoverresources_memoryFailoverResourcesPercent
    no actions
    entities in Failoverresources
}

//
// OCCI attribute 'cpuFailoverResourcesPercent'
//
one sig failoverresources_cpuFailoverResourcesPercent extends Attribute {} {
    name = "cpuFailoverResourcesPercent"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Percentage of CPU resources in the cluster to reserve for failover. You can specify up to 100% of CPU resources for failover. 
    The ClusterFailoverResourcesAdmissionControlPolicy reserves a specified percentage of aggregate cluster resources for failover. With the resources failover policy in place, vSphere HA uses the following calculations to control virtual machine migration in the cluster.
    Calculate the total resource requirements for all powered-on virtual machines in the cluster.
    Calculate the total host resources available for virtual machines.
    Calculate the Current CPU failover capacity and current memory failover capacity for the cluster.
    Compare the current CPU failover capacity and current memory failover capacity with the configured resource percentages (cpuFailoverResourcesPercent and memoryFailoverResourcesPercent). If either current capacity is less than the corresponding configured capacity, HA does not allow the operation.
    HA uses the actual reservations of the virtual machines. If a virtual machine does not have reservations, meaning that the reservation is 0, a default of 0MB memory and 256MHz CPU is applied. This is controlled by the same HA advanced options used for the failover level policy (ClusterFailoverLevelAdmissionControlPolicy)."
    multiple_values = False
}

//
// OCCI attribute 'memoryFailoverResourcesPercent'
//
one sig failoverresources_memoryFailoverResourcesPercent extends Attribute {} {
    name = "memoryFailoverResourcesPercent"
    type = core/Number_DataType
    mutable = True
    required = False
    no default
    description = "Percentage of memory resources in the cluster to reserve for failover. You can specify up to 100% of memory resources for failover. "
    multiple_values = False
}

// ======================================================================
// Signature for Failoverresources
// ======================================================================

sig Failoverresources in core/Entity {
    cpuFailoverResourcesPercent : lone core/Number,
    memoryFailoverResourcesPercent : lone core/Number,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasvmtoolsmonitoringsettings'
//
// ======================================================================

one sig clusterdasvmtoolsmonitoringsettings extends Mixin {} {
    term = "clusterdasvmtoolsmonitoringsettings"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = clusterdefaultdasvmconfig
    no applies
    attributes = clusterdasvmtoolsmonitoringsettings_clusterSettings + clusterdasvmtoolsmonitoringsettings_failureInterval + clusterdasvmtoolsmonitoringsettings_maxFailures + clusterdasvmtoolsmonitoringsettings_maxFailureWindow + clusterdasvmtoolsmonitoringsettings_minUpTime + clusterdasvmtoolsmonitoringsettings_defaultVmMonitoring
    no actions
    entities in Clusterdasvmtoolsmonitoringsettings
}

//
// OCCI attribute 'clusterSettings'
//
one sig clusterdasvmtoolsmonitoringsettings_clusterSettings extends Attribute {} {
    name = "clusterSettings"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "true"
    description = "Flag indicating whether to use the cluster settings or the per VM settings.
    The default value is true. "
    multiple_values = False
}

//
// OCCI attribute 'failureInterval'
//
one sig clusterdasvmtoolsmonitoringsettings_failureInterval extends Attribute {} {
    name = "failureInterval"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "30"
    description = "If no heartbeat has been received for at least the specified number of seconds, the virtual machine is declared as failed.
    The default value is 30. "
    multiple_values = False
}

//
// OCCI attribute 'maxFailures'
//
one sig clusterdasvmtoolsmonitoringsettings_maxFailures extends Attribute {} {
    name = "maxFailures"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "3"
    description = "Maximum number of failures and automated resets allowed during the time that maxFailureWindow specifies. If maxFailureWindow is -1 (no window), this represents the absolute number of failures after which automated response is stopped.
    If a virtual machine exceeds this threshold, in-depth problem analysis is usually needed.
    
    The default value is 3. "
    multiple_values = False
}

//
// OCCI attribute 'maxFailureWindow'
//
one sig clusterdasvmtoolsmonitoringsettings_maxFailureWindow extends Attribute {} {
    name = "maxFailureWindow"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "-1"
    description = "The number of seconds for the window during which up to maxFailures resets can occur before automated responses stop.
    If set to -1, no failure window is specified.
    
    The default value is -1. "
    multiple_values = False
}

//
// OCCI attribute 'minUpTime'
//
one sig clusterdasvmtoolsmonitoringsettings_minUpTime extends Attribute {} {
    name = "minUpTime"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "120"
    description = "The number of seconds for the virtual machine's heartbeats to stabilize after the virtual machine has been powered on. This time should include the guest operating system boot-up time. The virtual machine monitoring will begin only after this period.
    The default value is 120. "
    multiple_values = False
}

//
// OCCI attribute 'defaultVmMonitoring'
//
one sig clusterdasvmtoolsmonitoringsettings_defaultVmMonitoring extends Attribute {} {
    name = "defaultVmMonitoring"
    type = ClusterDasConfigInfoVmMonitoringState_DataType
    mutable = True
    required = False
    no default
    description = "Indicates the type of virtual machine monitoring. Specify a string value corresponding to one of the following ClusterDasConfigInfoVmMonitoringState values:
    vmMonitoringDisabled (the default value)
    vmMonitoringOnly
    vmAndAppMonitoring
    The individual VMware Tools setting for virtual machine monitoring depends on the HA Virtual Machine Health Monitoring Service level that is defined for the cluster (ClusterDasConfigInfo.vmMonitoring). The following list indicates the supported VMware Tools vmMonitoring values according to the cluster configuration.
    
    If the cluster configuration specifies vmMonitoringDisabled, the Service is disabled and the HA Service ignores the VMware Tools monitoring setting.
    If the cluster configuration specifies vmMonitoringOnly, the Service supports vmMonitoringOnly or vmMonitoringDisabled only.
    If the cluster configuration specifies vmAndAppMonitoring, you can use any of the ClusterDasConfigInfoVmMonitoringState values.
    The clusterSettings value has no effect on the constraint imposed by the HA Virtual Machine Health Monitoring Service level that is defined for the cluster (ClusterDasConfigInfo.vmMonitoring).
    
    Application monitoring events are generated regardless of the currently configured type of virtual machine monitoring. You can use these events even if monitoring is being disabled or set to vmMonitoringOnly."
    multiple_values = False
}

// ======================================================================
// Signature for Clusterdasvmtoolsmonitoringsettings
// ======================================================================

sig Clusterdasvmtoolsmonitoringsettings in core/Entity {
    clusterSettings : lone core/Boolean,
    failureInterval : lone core/Number,
    maxFailures : lone core/Number,
    maxFailureWindow : lone core/Number,
    minUpTime : lone core/Number,
    defaultVmMonitoring : lone ClusterDasConfigInfoVmMonitoringState,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dasvmtoolsmonitoringsettings'
//
// ======================================================================

one sig dasvmtoolsmonitoringsettings extends Mixin {} {
    term = "dasvmtoolsmonitoringsettings"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = dasvmsettings
    no applies
    attributes = dasvmtoolsmonitoringsettings_clusterSettings + dasvmtoolsmonitoringsettings_failureInterval + dasvmtoolsmonitoringsettings_maxFailures + dasvmtoolsmonitoringsettings_maxFailureWindow + dasvmtoolsmonitoringsettings_minUpTime + dasvmtoolsmonitoringsettings_defaultVmMonitoring
    no actions
    entities in Dasvmtoolsmonitoringsettings
}

//
// OCCI attribute 'clusterSettings'
//
one sig dasvmtoolsmonitoringsettings_clusterSettings extends Attribute {} {
    name = "clusterSettings"
    type = core/Boolean_DataType
    mutable = True
    required = False
    default = "true"
    description = "Flag indicating whether to use the cluster settings or the per VM settings.
    The default value is true. "
    multiple_values = False
}

//
// OCCI attribute 'failureInterval'
//
one sig dasvmtoolsmonitoringsettings_failureInterval extends Attribute {} {
    name = "failureInterval"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "30"
    description = "If no heartbeat has been received for at least the specified number of seconds, the virtual machine is declared as failed.
    The default value is 30. "
    multiple_values = False
}

//
// OCCI attribute 'maxFailures'
//
one sig dasvmtoolsmonitoringsettings_maxFailures extends Attribute {} {
    name = "maxFailures"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "3"
    description = "Maximum number of failures and automated resets allowed during the time that maxFailureWindow specifies. If maxFailureWindow is -1 (no window), this represents the absolute number of failures after which automated response is stopped.
    If a virtual machine exceeds this threshold, in-depth problem analysis is usually needed.
    
    The default value is 3. "
    multiple_values = False
}

//
// OCCI attribute 'maxFailureWindow'
//
one sig dasvmtoolsmonitoringsettings_maxFailureWindow extends Attribute {} {
    name = "maxFailureWindow"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "-1"
    description = "The number of seconds for the window during which up to maxFailures resets can occur before automated responses stop.
    If set to -1, no failure window is specified.
    
    The default value is -1. "
    multiple_values = False
}

//
// OCCI attribute 'minUpTime'
//
one sig dasvmtoolsmonitoringsettings_minUpTime extends Attribute {} {
    name = "minUpTime"
    type = core/Number_DataType
    mutable = True
    required = False
    default = "120"
    description = "The number of seconds for the virtual machine's heartbeats to stabilize after the virtual machine has been powered on. This time should include the guest operating system boot-up time. The virtual machine monitoring will begin only after this period.
    The default value is 120. "
    multiple_values = False
}

//
// OCCI attribute 'defaultVmMonitoring'
//
one sig dasvmtoolsmonitoringsettings_defaultVmMonitoring extends Attribute {} {
    name = "defaultVmMonitoring"
    type = ClusterDasConfigInfoVmMonitoringState_DataType
    mutable = True
    required = False
    no default
    description = "Indicates the type of virtual machine monitoring. Specify a string value corresponding to one of the following ClusterDasConfigInfoVmMonitoringState values:
    vmMonitoringDisabled (the default value)
    vmMonitoringOnly
    vmAndAppMonitoring
    The individual VMware Tools setting for virtual machine monitoring depends on the HA Virtual Machine Health Monitoring Service level that is defined for the cluster (ClusterDasConfigInfo.vmMonitoring). The following list indicates the supported VMware Tools vmMonitoring values according to the cluster configuration.
    
    If the cluster configuration specifies vmMonitoringDisabled, the Service is disabled and the HA Service ignores the VMware Tools monitoring setting.
    If the cluster configuration specifies vmMonitoringOnly, the Service supports vmMonitoringOnly or vmMonitoringDisabled only.
    If the cluster configuration specifies vmAndAppMonitoring, you can use any of the ClusterDasConfigInfoVmMonitoringState values.
    The clusterSettings value has no effect on the constraint imposed by the HA Virtual Machine Health Monitoring Service level that is defined for the cluster (ClusterDasConfigInfo.vmMonitoring).
    
    Application monitoring events are generated regardless of the currently configured type of virtual machine monitoring. You can use these events even if monitoring is being disabled or set to vmMonitoringOnly."
    multiple_values = False
}

// ======================================================================
// Signature for Dasvmtoolsmonitoringsettings
// ======================================================================

sig Dasvmtoolsmonitoringsettings in core/Entity {
    clusterSettings : lone core/Boolean,
    failureInterval : lone core/Number,
    maxFailures : lone core/Number,
    maxFailureWindow : lone core/Number,
    minUpTime : lone core/Number,
    defaultVmMonitoring : lone ClusterDasConfigInfoVmMonitoringState,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreconfig'
//
// ======================================================================

one sig datastoreconfig extends Mixin {} {
    term = "datastoreconfig"
    scheme = "http://occiware.org/occi/vmware#"
    title = "Detailed information about a datastore"
    no depends
    applies = datastore
    attributes = datastoreconfig_containerId + datastoreconfig_maxFileSize + datastoreconfig_maxMemoryFileSize + datastoreconfig_maxVirtualDiskCapacity + datastoreconfig_timestamp + datastoreconfig_datastoreUrl
    no actions
    entities in Datastoreconfig
}

//
// OCCI attribute 'containerId'
//
one sig datastoreconfig_containerId extends Attribute {} {
    name = "containerId"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "The unique container ID of the datastore, if applicable.
    It must be set for datastore creation with vvol filesystem.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'maxFileSize'
//
one sig datastoreconfig_maxFileSize extends Attribute {} {
    name = "maxFileSize"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The maximum size of a file that can reside on this file system volume. "
    multiple_values = False
}

//
// OCCI attribute 'maxMemoryFileSize'
//
one sig datastoreconfig_maxMemoryFileSize extends Attribute {} {
    name = "maxMemoryFileSize"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The maximum size of a snapshot or a swap file that can reside on this file system volume.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'maxVirtualDiskCapacity'
//
one sig datastoreconfig_maxVirtualDiskCapacity extends Attribute {} {
    name = "maxVirtualDiskCapacity"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The maximum capacity of a virtual disk which can be created on this volume.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'timestamp'
//
one sig datastoreconfig_timestamp extends Attribute {} {
    name = "timestamp"
    type = Datetype_DataType
    mutable = False
    required = False
    no default
    description = "Time when the free-space and capacity values in DatastoreInfo and DatastoreSummary were updated.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'datastoreUrl'
//
one sig datastoreconfig_datastoreUrl extends Attribute {} {
    name = "datastoreUrl"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Datastoreconfig
// ======================================================================

sig Datastoreconfig in Datastore {
    containerId : lone String,
    maxFileSize : lone String,
    maxMemoryFileSize : lone String,
    maxVirtualDiskCapacity : lone String,
    timestamp : lone Datetype,
    datastoreUrl : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostvvolvolumeconfig'
//
// ======================================================================

one sig datastorehostvvolvolumeconfig extends Mixin {} {
    term = "datastorehostvvolvolumeconfig"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    depends = datastoreconfig
    no applies
    no attributes
    no actions
    entities in Datastorehostvvolvolumeconfig
}

// ======================================================================
// Signature for Datastorehostvvolvolumeconfig
// ======================================================================

sig Datastorehostvvolvolumeconfig in core/Entity {
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#virtualdiskgeometry'
//
// ======================================================================

one sig virtualdiskgeometry extends Mixin {} {
    term = "virtualdiskgeometry"
    scheme = "http://occiware.org/occi/vmware#"
    title = "geometry information for the virtual disk, see HostDiskDimensionsChs and QueryVirtualDiskGeometry"
    no depends
    applies = virtualdisk + hoststorage
    attributes = virtualdiskgeometry_cylinder + virtualdiskgeometry_head + virtualdiskgeometry_sector
    no actions
    entities in Virtualdiskgeometry
}

//
// OCCI attribute 'cylinder'
//
one sig virtualdiskgeometry_cylinder extends Attribute {} {
    name = "cylinder"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The number of cylinders"
    multiple_values = False
}

//
// OCCI attribute 'head'
//
one sig virtualdiskgeometry_head extends Attribute {} {
    name = "head"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The number of heads per cylinders"
    multiple_values = False
}

//
// OCCI attribute 'sector'
//
one sig virtualdiskgeometry_sector extends Attribute {} {
    name = "sector"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "The number of sectors per head"
    multiple_values = False
}

// ======================================================================
// Signature for Virtualdiskgeometry
// ======================================================================

sig Virtualdiskgeometry in Virtualdisk + Hoststorage {
    cylinder : lone String,
    head : lone String,
    sector : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#virtualdeviceconnectinfo'
//
// ======================================================================

one sig virtualdeviceconnectinfo extends Mixin {} {
    term = "virtualdeviceconnectinfo"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = virtualdisklink + virtualnetworkadapter
    attributes = virtualdeviceconnectinfo_allowGuestControl + virtualdeviceconnectinfo_connected + virtualdeviceconnectinfo_startConnected + virtualdeviceconnectinfo_connectionStatus
    no actions
    entities in Virtualdeviceconnectinfo
}

//
// OCCI attribute 'allowGuestControl'
//
one sig virtualdeviceconnectinfo_allowGuestControl extends Attribute {} {
    name = "allowGuestControl"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'connected'
//
one sig virtualdeviceconnectinfo_connected extends Attribute {} {
    name = "connected"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'startConnected'
//
one sig virtualdeviceconnectinfo_startConnected extends Attribute {} {
    name = "startConnected"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'connectionStatus'
//
one sig virtualdeviceconnectinfo_connectionStatus extends Attribute {} {
    name = "connectionStatus"
    type = VirtualDeviceConnectStatus_DataType
    mutable = True
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Virtualdeviceconnectinfo
// ======================================================================

sig Virtualdeviceconnectinfo in Virtualdisklink + Virtualnetworkadapter {
    allowGuestControl : lone String,
    connected : lone String,
    startConnected : lone String,
    connectionStatus : lone VirtualDeviceConnectStatus,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hoststoragecapability'
//
// ======================================================================

one sig hoststoragecapability extends Mixin {} {
    term = "hoststoragecapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hoststoragecapability_datastorePrincipalSupported + hoststoragecapability_localSwapDatastoreSupported + hoststoragecapability_nfsSupported + hoststoragecapability_sanSupported + hoststoragecapability_deltaDiskBackingsSupported + hoststoragecapability_eightPlusHostVmfsSharedAccessSupported + hoststoragecapability_markAsSsdSupported + hoststoragecapability_markAsLocalSupported + hoststoragecapability_nfs41Supported + hoststoragecapability_storageIORMSupported + hoststoragecapability_storagePolicySupported + hoststoragecapability_supportedVmfsMajorVersion + hoststoragecapability_turnDiskLocatorLedSupported + hoststoragecapability_virtualVolumeDatastoreSupported + hoststoragecapability_vmfsDatastoreMountCapable + hoststoragecapability_vsanSupported
    no actions
    entities in Hoststoragecapability
}

//
// OCCI attribute 'datastorePrincipalSupported'
//
one sig hoststoragecapability_datastorePrincipalSupported extends Attribute {} {
    name = "datastorePrincipalSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether datastore principal user is supported on the host. "
    multiple_values = False
}

//
// OCCI attribute 'localSwapDatastoreSupported'
//
one sig hoststoragecapability_localSwapDatastoreSupported extends Attribute {} {
    name = "localSwapDatastoreSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether the host supports selecting a datastore that that may be used to store virtual machine swapfiles."
    multiple_values = False
}

//
// OCCI attribute 'nfsSupported'
//
one sig hoststoragecapability_nfsSupported extends Attribute {} {
    name = "nfsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is access to NFS devices supported. "
    multiple_values = False
}

//
// OCCI attribute 'sanSupported'
//
one sig hoststoragecapability_sanSupported extends Attribute {} {
    name = "sanSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether access to SAN devices is supported. "
    multiple_values = False
}

//
// OCCI attribute 'deltaDiskBackingsSupported'
//
one sig hoststoragecapability_deltaDiskBackingsSupported extends Attribute {} {
    name = "deltaDiskBackingsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether explicitly creating arbirary configurations of delta disk backings is supported.
    A delta disk backing is a way to preserve a virtual disk backing at some point in time. A delta disk backing is a file backing which in turn points to the original virtual disk backing (the parent). After a delta disk backing is added, all writes go to the delta disk backing. All reads first try the delta disk backing and then try the parent backing if needed.
    
    If this property is false, then delta disk backings can only be implicitly created through using snapshot operations and two virtual machines cannot safely share a parent disk backing.
    
    If this property is true, then delta disk backings can be explicitly created and managed, and two virtual machines may safely share a parent disk backing.
    
    In the context above, "safely" means that performing operations on one of the virtual machines will not affect the operation of the other virtual machine.
    
    
    See parent
    See parent
    See parent
    See parent
    See parent
    See PromoteDisks_Task
    See diskMoveType
    See diskMoveType
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'eightPlusHostVmfsSharedAccessSupported'
//
one sig hoststoragecapability_eightPlusHostVmfsSharedAccessSupported extends Attribute {} {
    name = "eightPlusHostVmfsSharedAccessSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host is capable of accessing a VMFS disk when there are eight or more hosts accessing the disk already."
    multiple_values = False
}

//
// OCCI attribute 'markAsSsdSupported'
//
one sig hoststoragecapability_markAsSsdSupported extends Attribute {} {
    name = "markAsSsdSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether mark disk as SSD or Non-SSD is supported on the host.
    See MarkAsSsd_Task
    See MarkAsNonSsd_Task
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'markAsLocalSupported'
//
one sig hoststoragecapability_markAsLocalSupported extends Attribute {} {
    name = "markAsLocalSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether mark disk as local or remote is supported on the host.
    See MarkAsLocal_Task
    See MarkAsNonLocal_Task
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'nfs41Supported'
//
one sig hoststoragecapability_nfs41Supported extends Attribute {} {
    name = "nfs41Supported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Whether this host support NFS41 file system.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'storageIORMSupported'
//
one sig hoststoragecapability_storageIORMSupported extends Attribute {} {
    name = "storageIORMSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports storage I/O resource management.
    Since vSphere API 4.1"
    multiple_values = False
}

//
// OCCI attribute 'storagePolicySupported'
//
one sig hoststoragecapability_storagePolicySupported extends Attribute {} {
    name = "storagePolicySupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates that host supports Object-based Storage System and Storage-Profile based disk provisioning.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'supportedVmfsMajorVersion'
//
one sig hoststoragecapability_supportedVmfsMajorVersion extends Attribute {} {
    name = "supportedVmfsMajorVersion"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "List of VMFS major versions supported by the host.
    Since vSphere API 5.0"
    multiple_values = True
}

//
// OCCI attribute 'turnDiskLocatorLedSupported'
//
one sig hoststoragecapability_turnDiskLocatorLedSupported extends Attribute {} {
    name = "turnDiskLocatorLedSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether turning on/off local disk LED is supported on the host.
    See TurnDiskLocatorLedOn_Task
    See TurnDiskLocatorLedOff_Task
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'virtualVolumeDatastoreSupported'
//
one sig hoststoragecapability_virtualVolumeDatastoreSupported extends Attribute {} {
    name = "virtualVolumeDatastoreSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports VirtualVolume based Datastore.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'vmfsDatastoreMountCapable'
//
one sig hoststoragecapability_vmfsDatastoreMountCapable extends Attribute {} {
    name = "vmfsDatastoreMountCapable"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host is capable of mounting/unmounting VMFS datastores.
    Since vSphere API 5.0"
    multiple_values = False
}

//
// OCCI attribute 'vsanSupported'
//
one sig hoststoragecapability_vsanSupported extends Attribute {} {
    name = "vsanSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether the host supports VSAN functionality.
    See HostVsanSystem
    Since vSphere API 5.5"
    multiple_values = False
}

// ======================================================================
// Signature for Hoststoragecapability
// ======================================================================

sig Hoststoragecapability in Hostsystem {
    datastorePrincipalSupported : lone core/Boolean,
    localSwapDatastoreSupported : lone core/Boolean,
    nfsSupported : lone core/Boolean,
    sanSupported : lone core/Boolean,
    deltaDiskBackingsSupported : lone core/Boolean,
    eightPlusHostVmfsSharedAccessSupported : lone core/Boolean,
    markAsSsdSupported : lone core/Boolean,
    markAsLocalSupported : lone core/Boolean,
    nfs41Supported : lone core/Boolean,
    storageIORMSupported : lone core/Boolean,
    storagePolicySupported : lone core/Boolean,
    supportedVmfsMajorVersion : lone core/Number,
    turnDiskLocatorLedSupported : lone core/Boolean,
    virtualVolumeDatastoreSupported : lone core/Boolean,
    vmfsDatastoreMountCapable : lone core/Boolean,
    vsanSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkcapabilityextent'
//
// ======================================================================

one sig hostnetworkcapabilityextent extends Mixin {} {
    term = "hostnetworkcapabilityextent"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostnetworkcapabilityextent_nicTeamingSupported + hostnetworkcapabilityextent_vlanTaggingSupported + hostnetworkcapabilityextent_firewallIpRulesSupported + hostnetworkcapabilityextent_hbrNicSelectionSupported + hostnetworkcapabilityextent_multipleNetworkStackInstanceSupported + hostnetworkcapabilityextent_provisioningNicSelectionSupported + hostnetworkcapabilityextent_vmDirectPathGen2UnsupportedReason + hostnetworkcapabilityextent_vmDirectPathGen2Supported + hostnetworkcapabilityextent_vmDirectPathGen2UnsupportedReasonExtended + hostnetworkcapabilityextent_vrNfcNicSelectionSupported
    no actions
    entities in Hostnetworkcapabilityextent
}

//
// OCCI attribute 'nicTeamingSupported'
//
one sig hostnetworkcapabilityextent_nicTeamingSupported extends Attribute {} {
    name = "nicTeamingSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is NIC teaming supported. "
    multiple_values = False
}

//
// OCCI attribute 'vlanTaggingSupported'
//
one sig hostnetworkcapabilityextent_vlanTaggingSupported extends Attribute {} {
    name = "vlanTaggingSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is VLAN Tagging supported."
    multiple_values = False
}

//
// OCCI attribute 'firewallIpRulesSupported'
//
one sig hostnetworkcapabilityextent_firewallIpRulesSupported extends Attribute {} {
    name = "firewallIpRulesSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'hbrNicSelectionSupported'
//
one sig hostnetworkcapabilityextent_hbrNicSelectionSupported extends Attribute {} {
    name = "hbrNicSelectionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether a dedicated nic can be selected for vSphere Replication LWD traffic, i.e., from the primary host to the VR server.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'multipleNetworkStackInstanceSupported'
//
one sig hostnetworkcapabilityextent_multipleNetworkStackInstanceSupported extends Attribute {} {
    name = "multipleNetworkStackInstanceSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports Multiple Instance TCP/IP stack
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'provisioningNicSelectionSupported'
//
one sig hostnetworkcapabilityextent_provisioningNicSelectionSupported extends Attribute {} {
    name = "provisioningNicSelectionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether a dedicated nic can be selected for vSphere Provisioning NFC traffic.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'vmDirectPathGen2UnsupportedReason'
//
one sig hostnetworkcapabilityextent_vmDirectPathGen2UnsupportedReason extends Attribute {} {
    name = "vmDirectPathGen2UnsupportedReason"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "If vmDirectPathGen2Supported is false, this array will be populated with reasons for the lack of support (chosen from VmDirectPathGen2UnsupportedReason). If there is a reason for the lack of support that cannot be described by the available constants, vmDirectPathGen2UnsupportedReasonExtended will be populated with an additional explanation provided by the platform.
    Note that this list of reasons is not guaranteed to be exhaustive.
    
    If the reason "hostNptIncompatibleProduct" is provided, then that will be the only provided reason, as the host software is incapable of providing additional information.
    
    Since vSphere API 4.1"
    multiple_values = True
}

//
// OCCI attribute 'vmDirectPathGen2Supported'
//
one sig hostnetworkcapabilityextent_vmDirectPathGen2Supported extends Attribute {} {
    name = "vmDirectPathGen2Supported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports network passthrough using VMDirectPath Gen 2. Note that this is a general capability for the host and is independent of support by a given physical NIC. If false, the reason(s) for lack of support will be provided in vmDirectPathGen2UnsupportedReason and/or in vmDirectPathGen2UnsupportedReasonExtended.
    See vmDirectPathGen2Supported
    Since vSphere API 4.1"
    multiple_values = False
}

//
// OCCI attribute 'vmDirectPathGen2UnsupportedReasonExtended'
//
one sig hostnetworkcapabilityextent_vmDirectPathGen2UnsupportedReasonExtended extends Attribute {} {
    name = "vmDirectPathGen2UnsupportedReasonExtended"
    type = core/String_DataType
    mutable = False
    required = False
    no default
    description = "If vmDirectPathGen2Supported is false, this property may contain an explanation provided by the platform, beyond the reasons (if any) enumerated in vmDirectPathGen2UnsupportedReason.
    Since vSphere API 4.1"
    multiple_values = False
}

//
// OCCI attribute 'vrNfcNicSelectionSupported'
//
one sig hostnetworkcapabilityextent_vrNfcNicSelectionSupported extends Attribute {} {
    name = "vrNfcNicSelectionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

// ======================================================================
// Signature for Hostnetworkcapabilityextent
// ======================================================================

sig Hostnetworkcapabilityextent in Hostsystem {
    nicTeamingSupported : lone core/Boolean,
    vlanTaggingSupported : lone core/Boolean,
    firewallIpRulesSupported : lone core/Boolean,
    hbrNicSelectionSupported : lone core/Boolean,
    multipleNetworkStackInstanceSupported : lone core/Boolean,
    provisioningNicSelectionSupported : lone core/Boolean,
    vmDirectPathGen2UnsupportedReason : lone String,
    vmDirectPathGen2Supported : lone core/Boolean,
    vmDirectPathGen2UnsupportedReasonExtended : lone String,
    vrNfcNicSelectionSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostvmotioncapability'
//
// ======================================================================

one sig hostvmotioncapability extends Mixin {} {
    term = "hostvmotioncapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostvmotioncapability_unsharedSwapVMotionSupported + hostvmotioncapability_vmotionSupported + hostvmotioncapability_maxNumDisksSVMotion + hostvmotioncapability_storageVMotionSupported + hostvmotioncapability_vmotionWithStorageVMotionSupported + hostvmotioncapability_vmotionAcrossNetworkSupported
    no actions
    entities in Hostvmotioncapability
}

//
// OCCI attribute 'unsharedSwapVMotionSupported'
//
one sig hostvmotioncapability_unsharedSwapVMotionSupported extends Attribute {} {
    name = "unsharedSwapVMotionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether the host supports participating in a VMotion where the virtual machine swapfile is not visible to the destination."
    multiple_values = False
}

//
// OCCI attribute 'vmotionSupported'
//
one sig hostvmotioncapability_vmotionSupported extends Attribute {} {
    name = "vmotionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether you can perform VMotion. "
    multiple_values = False
}

//
// OCCI attribute 'maxNumDisksSVMotion'
//
one sig hostvmotioncapability_maxNumDisksSVMotion extends Attribute {} {
    name = "maxNumDisksSVMotion"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "Maximum number of migrating disks allowed of a migrating VM during SVMotion. If this capability is not set, then the maximum is considered to be 64.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'storageVMotionSupported'
//
one sig hostvmotioncapability_storageVMotionSupported extends Attribute {} {
    name = "storageVMotionSupported"
    type = core/Boolean_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether the storage of a powered-on virtual machine may be relocated.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'vmotionWithStorageVMotionSupported'
//
one sig hostvmotioncapability_vmotionWithStorageVMotionSupported extends Attribute {} {
    name = "vmotionWithStorageVMotionSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the storage of a powered-on virtual machine may be relocated while simultaneously changing the execution host of the virtual machine.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'vmotionAcrossNetworkSupported'
//
one sig hostvmotioncapability_vmotionAcrossNetworkSupported extends Attribute {} {
    name = "vmotionAcrossNetworkSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the network of a powered-on virtual machine can be changed while simultaneously changing the execution host of the virtual machine.
    Since vSphere API 5.5"
    multiple_values = False
}

// ======================================================================
// Signature for Hostvmotioncapability
// ======================================================================

sig Hostvmotioncapability in Hostsystem {
    unsharedSwapVMotionSupported : lone core/Boolean,
    vmotionSupported : lone core/Boolean,
    maxNumDisksSVMotion : lone core/Number,
    storageVMotionSupported : lone core/Boolean,
    vmotionWithStorageVMotionSupported : lone core/Boolean,
    vmotionAcrossNetworkSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsnapshotcapability'
//
// ======================================================================

one sig hostsnapshotcapability extends Mixin {} {
    term = "hostsnapshotcapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostsnapshotcapability_backgroundSnapshotsSupported + hostsnapshotcapability_restrictedSnapshotRelocateSupported + hostsnapshotcapability_cloneFromSnapshotSupported + hostsnapshotcapability_snapshotRelayoutSupported
    no actions
    entities in Hostsnapshotcapability
}

//
// OCCI attribute 'backgroundSnapshotsSupported'
//
one sig hostsnapshotcapability_backgroundSnapshotsSupported extends Attribute {} {
    name = "backgroundSnapshotsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether background snapshots are supported on this host."
    multiple_values = False
}

//
// OCCI attribute 'restrictedSnapshotRelocateSupported'
//
one sig hostsnapshotcapability_restrictedSnapshotRelocateSupported extends Attribute {} {
    name = "restrictedSnapshotRelocateSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports relocation of virtual machines with snapshots. Must be true on the source and destination hosts for the relocation to work. Even if this is true, the following conditions must hold: 1) All the the vm's files are in one directory prior to the relocate. 2) All of the vm's files will be in one directory after the relocate. 3) The source and destination hosts are the same product version."
    multiple_values = False
}

//
// OCCI attribute 'cloneFromSnapshotSupported'
//
one sig hostsnapshotcapability_cloneFromSnapshotSupported extends Attribute {} {
    name = "cloneFromSnapshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether or not cloning a virtual machine from a snapshot point is allowed.
    This property must be true on the host where the virtual machine is currently residing. This property need not be true on the destination host for the clone.
    See snapshot
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'snapshotRelayoutSupported'
//
one sig hostsnapshotcapability_snapshotRelayoutSupported extends Attribute {} {
    name = "snapshotRelayoutSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports unrestricted relocation of virtual machines with snapshots. Only needs to be true on the destination host for the unrestricted relocation to work. The full snapshot relocation does not restrict the layout of snapshot files or disks of the virtual machine, nor its power state. If the virtual machine is powered on, a storage vmotion will be performed to relocate its snapshots and disks.
    Since vSphere API 5.0"
    multiple_values = False
}

// ======================================================================
// Signature for Hostsnapshotcapability
// ======================================================================

sig Hostsnapshotcapability in Hostsystem {
    backgroundSnapshotsSupported : lone core/Boolean,
    restrictedSnapshotRelocateSupported : lone core/Boolean,
    cloneFromSnapshotSupported : lone core/Boolean,
    snapshotRelayoutSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostcapabilityhardware'
//
// ======================================================================

one sig hostcapabilityhardware extends Mixin {} {
    term = "hostcapabilityhardware"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostcapabilityhardware_cpuMemoryResourceConfigurationSupported + hostcapabilityhardware_iscsiSupported + hostcapabilityhardware_maintenanceModeSupported + hostcapabilityhardware_preAssignedPCIUnitNumbersSupported + hostcapabilityhardware_nestedHVSupported + hostcapabilityhardware_scheduledHardwareUpgradeSupported + hostcapabilityhardware_smartCardAuthenticationSupported + hostcapabilityhardware_tpmSupported + hostcapabilityhardware_vFlashSupported + hostcapabilityhardware_vStorageCapable
    no actions
    entities in Hostcapabilityhardware
}

//
// OCCI attribute 'cpuMemoryResourceConfigurationSupported'
//
one sig hostcapabilityhardware_cpuMemoryResourceConfigurationSupported extends Attribute {} {
    name = "cpuMemoryResourceConfigurationSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether cpu and memory resource configuration is supported. If this is set to false, UpdateConfig, UpdateChildResourceConfiguration cannot be used for changing the cpu/memory resource configurations."
    multiple_values = False
}

//
// OCCI attribute 'iscsiSupported'
//
one sig hostcapabilityhardware_iscsiSupported extends Attribute {} {
    name = "iscsiSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is access to iSCSI devices supported."
    multiple_values = False
}

//
// OCCI attribute 'maintenanceModeSupported'
//
one sig hostcapabilityhardware_maintenanceModeSupported extends Attribute {} {
    name = "maintenanceModeSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is maintenance mode supported "
    multiple_values = False
}

//
// OCCI attribute 'preAssignedPCIUnitNumbersSupported'
//
one sig hostcapabilityhardware_preAssignedPCIUnitNumbersSupported extends Attribute {} {
    name = "preAssignedPCIUnitNumbersSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag to indicate whether the server returns unit numbers in a pre-assigned range for devices on the PCI bus. When the server supports this flag, the device unit number namespace is partitioned by device type. Different types of devices will sit in a specific range of unit numbers that may not correspond to physical slots in the pci bus but present a relative ordering of the devices with respect to other devices of the same type. Note that this does not mean that the user can set the relative ordering between device types, but only allows stable orderings between devices of the same type. The unit number will now clearly represent an ordering between devices of the same type. unitNumber This property is only available for devices on the pci controller."
    multiple_values = False
}

//
// OCCI attribute 'nestedHVSupported'
//
one sig hostcapabilityhardware_nestedHVSupported extends Attribute {} {
    name = "nestedHVSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports nested hardware-assisted virtualization.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'scheduledHardwareUpgradeSupported'
//
one sig hostcapabilityhardware_scheduledHardwareUpgradeSupported extends Attribute {} {
    name = "scheduledHardwareUpgradeSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports scheduled hardware upgrades.
    See scheduledHardwareUpgradeInfo
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'smartCardAuthenticationSupported'
//
one sig hostcapabilityhardware_smartCardAuthenticationSupported extends Attribute {} {
    name = "smartCardAuthenticationSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports local two-factor user authentication using smart cards.
    See EnableSmartCardAuthentication
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'tpmSupported'
//
one sig hostcapabilityhardware_tpmSupported extends Attribute {} {
    name = "tpmSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether this host supports the integrity measurement using a TPM device.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'vFlashSupported'
//
one sig hostcapabilityhardware_vFlashSupported extends Attribute {} {
    name = "vFlashSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports vFlash.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'vStorageCapable'
//
one sig hostcapabilityhardware_vStorageCapable extends Attribute {} {
    name = "vStorageCapable"
    type = core/String_DataType
    mutable = True
    required = False
    no default
    description = "Indicates whether the host supports vStorage Hardware acceleration.
    Since vSphere API 4.1"
    multiple_values = False
}

// ======================================================================
// Signature for Hostcapabilityhardware
// ======================================================================

sig Hostcapabilityhardware in Hostsystem {
    cpuMemoryResourceConfigurationSupported : lone core/Boolean,
    iscsiSupported : lone core/Boolean,
    maintenanceModeSupported : lone core/Boolean,
    preAssignedPCIUnitNumbersSupported : lone core/Boolean,
    nestedHVSupported : lone core/Boolean,
    scheduledHardwareUpgradeSupported : lone core/Boolean,
    smartCardAuthenticationSupported : lone core/Boolean,
    tpmSupported : lone core/Boolean,
    vFlashSupported : lone core/Boolean,
    vStorageCapable : lone String,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsystemcapability'
//
// ======================================================================

one sig hostsystemcapability extends Mixin {} {
    term = "hostsystemcapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostsystemcapability_highGuestMemSupported + hostsystemcapability_rebootSupported + hostsystemcapability_scaledScreenshotSupported + hostsystemcapability_shutdownSupported + hostsystemcapability_screenshotSupported + hostsystemcapability_standbySupported + hostsystemcapability_accel3dSupported
    no actions
    entities in Hostsystemcapability
}

//
// OCCI attribute 'highGuestMemSupported'
//
one sig hostsystemcapability_highGuestMemSupported extends Attribute {} {
    name = "highGuestMemSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Is high guest memory supported. "
    multiple_values = False
}

//
// OCCI attribute 'rebootSupported'
//
one sig hostsystemcapability_rebootSupported extends Attribute {} {
    name = "rebootSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether rebooting the host is supported. "
    multiple_values = False
}

//
// OCCI attribute 'scaledScreenshotSupported'
//
one sig hostsystemcapability_scaledScreenshotSupported extends Attribute {} {
    name = "scaledScreenshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether scaling is supported for screenshots retrieved over https. If true, screenshot retrieval supports the additional optional parameters 'width' and 'height'. After cropping, the returned image will be scaled to these dimensions. If only one of these parameters is specified, default behavior is to return an image roughly proportional to the source image."
    multiple_values = False
}

//
// OCCI attribute 'shutdownSupported'
//
one sig hostsystemcapability_shutdownSupported extends Attribute {} {
    name = "shutdownSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether the host can be powered off "
    multiple_values = False
}

//
// OCCI attribute 'screenshotSupported'
//
one sig hostsystemcapability_screenshotSupported extends Attribute {} {
    name = "screenshotSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the screenshot retrival over https is supported for this host's virtual machines. If true, a screenshot can be retrieved at the HTTPS relative path /screen?id=<managed object ID of virtual machine or snapshot>. If any of the optional parameters 'top', 'left', 'bottom', and 'right' is specified, the returned image will be cropped from the rectangle with upper left corner (left, top) and bottom right corner (right - 1, bottom - 1). These values default to the top, left, bottom and right edges of the image. The client must use an authenticated session with privilege VirtualMachine.Interact.ConsoleInteract on the requested virtual machine or, in the case of a snapshot, the virtual machine associated with that snapshot."
    multiple_values = False
}

//
// OCCI attribute 'standbySupported'
//
one sig hostsystemcapability_standbySupported extends Attribute {} {
    name = "standbySupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether you can put the host in a power down state, from which it can be powered up automatically."
    multiple_values = False
}

//
// OCCI attribute 'accel3dSupported'
//
one sig hostsystemcapability_accel3dSupported extends Attribute {} {
    name = "accel3dSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates if 3D hardware acceleration for virtual machines is supported.
    Since vSphere API 5.1"
    multiple_values = False
}

// ======================================================================
// Signature for Hostsystemcapability
// ======================================================================

sig Hostsystemcapability in Hostsystem {
    highGuestMemSupported : lone core/Boolean,
    rebootSupported : lone core/Boolean,
    scaledScreenshotSupported : lone core/Boolean,
    shutdownSupported : lone core/Boolean,
    screenshotSupported : lone core/Boolean,
    standbySupported : lone core/Boolean,
    accel3dSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostvmcapability'
//
// ======================================================================

one sig hostvmcapability extends Mixin {} {
    term = "hostvmcapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostvmcapability_maxRunningVMs + hostvmcapability_maxSupportedVcpus + hostvmcapability_maxSupportedVMs + hostvmcapability_perVmSwapFiles + hostvmcapability_suspendedRelocateSupported + hostvmcapability_interVMCommunicationThroughVMCISupported + hostvmcapability_latencySensitivitySupported + hostvmcapability_maxHostRunningVms + hostvmcapability_maxHostSupportedVcpus + hostvmcapability_maxRegisteredVMs + hostvmcapability_maxVcpusPerFtVm + hostvmcapability_perVMNetworkTrafficShapingSupported + hostvmcapability_reliableMemoryAware + hostvmcapability_virtualExecUsageSupported + hostvmcapability_vPMCSupported
    no actions
    entities in Hostvmcapability
}

//
// OCCI attribute 'maxRunningVMs'
//
one sig hostvmcapability_maxRunningVMs extends Attribute {} {
    name = "maxRunningVMs"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of virtual machines that can be running simultaneously on this host. If this capability is not set, the number of virtual machines running simultaneously is unlimited."
    multiple_values = False
}

//
// OCCI attribute 'maxSupportedVcpus'
//
one sig hostvmcapability_maxSupportedVcpus extends Attribute {} {
    name = "maxSupportedVcpus"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of virtual CPUs supported per virtual machine. If this capability is not set, the number is unlimited. "
    multiple_values = False
}

//
// OCCI attribute 'maxSupportedVMs'
//
one sig hostvmcapability_maxSupportedVMs extends Attribute {} {
    name = "maxSupportedVMs"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of virtual machines that can exist on this host. If this capability is not set, the number of virtual machines is unlimited. "
    multiple_values = False
}

//
// OCCI attribute 'perVmSwapFiles'
//
one sig hostvmcapability_perVmSwapFiles extends Attribute {} {
    name = "perVmSwapFiles"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether virtual machine execution on this host involves a swapfile for each virtual machine. If true, the swapfile placement for a powered-on virtual machine is advertised in its FileLayout by the swapFile property."
    multiple_values = False
}

//
// OCCI attribute 'suspendedRelocateSupported'
//
one sig hostvmcapability_suspendedRelocateSupported extends Attribute {} {
    name = "suspendedRelocateSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports relocation of suspended virtual machines. Must be true on the source and destination hosts for the relocation to work. "
    multiple_values = False
}

//
// OCCI attribute 'interVMCommunicationThroughVMCISupported'
//
one sig hostvmcapability_interVMCommunicationThroughVMCISupported extends Attribute {} {
    name = "interVMCommunicationThroughVMCISupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports VMCI for communication between virtual machines.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'latencySensitivitySupported'
//
one sig hostvmcapability_latencySensitivitySupported extends Attribute {} {
    name = "latencySensitivitySupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports latency sensitivity for the virtual machines.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'maxHostRunningVms'
//
one sig hostvmcapability_maxHostRunningVms extends Attribute {} {
    name = "maxHostRunningVms"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of virtual machines that can be run on the host. An unset value indicates that the value could not be obtained. In contrast to maxRunningVMs, this value is the minimum of (i) the maximum number supported by the hardware and (ii) the maximum number permitted by the host license.
    Since vSphere API 5.0"
    multiple_values = False
}

//
// OCCI attribute 'maxHostSupportedVcpus'
//
one sig hostvmcapability_maxHostSupportedVcpus extends Attribute {} {
    name = "maxHostSupportedVcpus"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of virtual CPUs that can be run on the host. An unset value indicates that the value could not be obtained. In contrast to maxSupportedVcpus, this value is the minimum of (i) the maximum number supported by the hardware and (ii) the maximum number permitted by the host license.
    Since vSphere API 5.0"
    multiple_values = False
}

//
// OCCI attribute 'maxRegisteredVMs'
//
one sig hostvmcapability_maxRegisteredVMs extends Attribute {} {
    name = "maxRegisteredVMs"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of registered virtual machines supported by the host. If this limit is exceeded, the management agent will be at risk of running out of system resources. configIssue will be posted on HostSystem in this case.
    If this capability is not set, the number is unknown."
    multiple_values = False
}

//
// OCCI attribute 'maxVcpusPerFtVm'
//
one sig hostvmcapability_maxVcpusPerFtVm extends Attribute {} {
    name = "maxVcpusPerFtVm"
    type = core/Number_DataType
    mutable = False
    required = False
    no default
    description = "The maximum number of vCPUs allowed for a fault-tolerant virtual machine.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'perVMNetworkTrafficShapingSupported'
//
one sig hostvmcapability_perVMNetworkTrafficShapingSupported extends Attribute {} {
    name = "perVMNetworkTrafficShapingSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether network traffic shaping on a per virtual machine basis is supported.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'reliableMemoryAware'
//
one sig hostvmcapability_reliableMemoryAware extends Attribute {} {
    name = "reliableMemoryAware"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates that this host uses a reliable memory aware allocation policy.
    Since vSphere API 5.5"
    multiple_values = False
}

//
// OCCI attribute 'virtualExecUsageSupported'
//
one sig hostvmcapability_virtualExecUsageSupported extends Attribute {} {
    name = "virtualExecUsageSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports configuring hardware virtualization (HV) support for virtual machines.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'vPMCSupported'
//
one sig hostvmcapability_vPMCSupported extends Attribute {} {
    name = "vPMCSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the host supports virtual CPU performance counters.
    Since vSphere API 5.1"
    multiple_values = False
}

// ======================================================================
// Signature for Hostvmcapability
// ======================================================================

sig Hostvmcapability in Hostsystem {
    maxRunningVMs : lone core/Number,
    maxSupportedVcpus : lone core/Number,
    maxSupportedVMs : lone core/Number,
    perVmSwapFiles : lone core/Boolean,
    suspendedRelocateSupported : lone core/Boolean,
    interVMCommunicationThroughVMCISupported : lone core/Boolean,
    latencySensitivitySupported : lone core/Boolean,
    maxHostRunningVms : lone core/Number,
    maxHostSupportedVcpus : lone core/Number,
    maxRegisteredVMs : lone core/Number,
    maxVcpusPerFtVm : lone core/Number,
    perVMNetworkTrafficShapingSupported : lone core/Boolean,
    reliableMemoryAware : lone core/Boolean,
    virtualExecUsageSupported : lone core/Boolean,
    vPMCSupported : lone core/Boolean,
}

// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostothercapability'
//
// ======================================================================

one sig hostothercapability extends Mixin {} {
    term = "hostothercapability"
    scheme = "http://occiware.org/occi/vmware#"
    no title
    no depends
    applies = hostsystem
    attributes = hostothercapability_loginBySSLThumbprintSupported + hostothercapability_ipmiSupported + hostothercapability_featureCapabilitiesSupported + hostothercapability_recursiveResourcePoolsSupported + hostothercapability_hostAccessManagerSupported + hostothercapability_servicePackageInfoSupported + hostothercapability_messageBusProxySupported + hostothercapability_smpFtCompatibilityIssues + hostothercapability_smpFtSupported
    no actions
    entities in Hostothercapability
}

//
// OCCI attribute 'loginBySSLThumbprintSupported'
//
one sig hostothercapability_loginBySSLThumbprintSupported extends Attribute {} {
    name = "loginBySSLThumbprintSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether this host supports SSL thumbprint authentication
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'ipmiSupported'
//
one sig hostothercapability_ipmiSupported extends Attribute {} {
    name = "ipmiSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Flag indicating whether the host supports IPMI (Intelligent Platform Management Interface). XXX - Make ipmiSupported optional until there is a compatible hostagent.
    Since vSphere API 4.0"
    multiple_values = False
}

//
// OCCI attribute 'featureCapabilitiesSupported'
//
one sig hostothercapability_featureCapabilitiesSupported extends Attribute {} {
    name = "featureCapabilitiesSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicated whether the host supports feature capabilities for EVC mode.
    Since vSphere API 5.1"
    multiple_values = False
}

//
// OCCI attribute 'recursiveResourcePoolsSupported'
//
one sig hostothercapability_recursiveResourcePoolsSupported extends Attribute {} {
    name = "recursiveResourcePoolsSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    no description
    multiple_values = False
}

//
// OCCI attribute 'hostAccessManagerSupported'
//
one sig hostothercapability_hostAccessManagerSupported extends Attribute {} {
    name = "hostAccessManagerSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Whether this host supports HostAccessManager for controlling direct access to the host and for better lockdown mode management.
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'servicePackageInfoSupported'
//
one sig hostothercapability_servicePackageInfoSupported extends Attribute {} {
    name = "servicePackageInfoSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports package information in service configuration.
    Since vSphere API 5.0"
    multiple_values = False
}

//
// OCCI attribute 'messageBusProxySupported'
//
one sig hostothercapability_messageBusProxySupported extends Attribute {} {
    name = "messageBusProxySupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether the message bus proxy is supported
    Since vSphere API 6.0"
    multiple_values = False
}

//
// OCCI attribute 'smpFtCompatibilityIssues'
//
one sig hostothercapability_smpFtCompatibilityIssues extends Attribute {} {
    name = "smpFtCompatibilityIssues"
    type = HostCapabilityFtUnsupportedReason_DataType
    mutable = False
    required = False
    no default
    description = "For a host which doesn't support smp fault tolerance, indicates all the reasons for the incompatibility. HostCapabilityFtUnsupportedReason lists the set of possible values"
    multiple_values = True
}

//
// OCCI attribute 'smpFtSupported'
//
one sig hostothercapability_smpFtSupported extends Attribute {} {
    name = "smpFtSupported"
    type = core/Boolean_DataType
    mutable = False
    required = False
    no default
    description = "Indicates whether this host supports smp fault tolerance
    Since vSphere API 6.0"
    multiple_values = False
}

// ======================================================================
// Signature for Hostothercapability
// ======================================================================

sig Hostothercapability in Hostsystem {
    loginBySSLThumbprintSupported : lone core/Boolean,
    ipmiSupported : lone core/Boolean,
    featureCapabilitiesSupported : lone core/Boolean,
    recursiveResourcePoolsSupported : lone core/Boolean,
    hostAccessManagerSupported : lone core/Boolean,
    servicePackageInfoSupported : lone core/Boolean,
    messageBusProxySupported : lone core/Boolean,
    smpFtCompatibilityIssues : lone HostCapabilityFtUnsupportedReason,
    smpFtSupported : lone core/Boolean,
}

//
// OCCI data type LongNumber
//
one sig LongNumber_DataType extends DataType {} {
    name = "LongNumber"
}

let LongNumber=String

//
// OCCI data type SharesLevel
//
one sig SharesLevel_DataType extends DataType {} {
    name = "SharesLevel"
}

abstract sig SharesLevel extends EnumBase {}
one sig SharesLevel_custom, SharesLevel_high, SharesLevel_low, SharesLevel_normal extends SharesLevel {}

//
// OCCI data type DvsNicTeamingPolicy
//
one sig DvsNicTeamingPolicy_DataType extends DataType {} {
    name = "DvsNicTeamingPolicy"
}

abstract sig DvsNicTeamingPolicy extends EnumBase {}
one sig DvsNicTeamingPolicy_failoverexplicit, DvsNicTeamingPolicy_loadbalanceip, DvsNicTeamingPolicy_loadbalanceloadbased, DvsNicTeamingPolicy_loadbalancesrcid, DvsNicTeamingPolicy_loadbalancesrcmac extends DvsNicTeamingPolicy {}

//
// OCCI data type Bootdevice
//
one sig Bootdevice_DataType extends DataType {} {
    name = "Bootdevice"
}

abstract sig Bootdevice extends EnumBase {}
one sig Bootdevice_cdrom, Bootdevice_harddisk, Bootdevice_network, Bootdevice_floppy extends Bootdevice {}

//
// OCCI data type ResourceAllocationType
//
one sig ResourceAllocationType_DataType extends DataType {} {
    name = "ResourceAllocationType"
}

abstract sig ResourceAllocationType extends EnumBase {}
one sig ResourceAllocationType_cpu, ResourceAllocationType_memory, ResourceAllocationType_network extends ResourceAllocationType {}

//
// OCCI data type ResourcePoolState
//
one sig ResourcePoolState_DataType extends DataType {} {
    name = "ResourcePoolState"
}

abstract sig ResourcePoolState extends EnumBase {}
one sig ResourcePoolState_undercommitted, ResourcePoolState_unknown, ResourcePoolState_inconsistent, ResourcePoolState_overcommitted extends ResourcePoolState {}

//
// OCCI data type Datetype
//
one sig Datetype_DataType extends DataType {} {
    name = "Datetype"
}

let Datetype=String

//
// OCCI data type PowerOffType
//
one sig PowerOffType_DataType extends DataType {} {
    name = "PowerOffType"
}

abstract sig PowerOffType extends EnumBase {}
one sig PowerOffType_soft, PowerOffType_hard, PowerOffType_preset extends PowerOffType {}

//
// OCCI data type GuestFirmwareType
//
one sig GuestFirmwareType_DataType extends DataType {} {
    name = "GuestFirmwareType"
}

abstract sig GuestFirmwareType extends EnumBase {}
one sig GuestFirmwareType_bios, GuestFirmwareType_efi extends GuestFirmwareType {}

//
// OCCI data type VmHtSharing
//
one sig VmHtSharing_DataType extends DataType {} {
    name = "VmHtSharing"
}

abstract sig VmHtSharing extends EnumBase {}
one sig VmHtSharing_any, VmHtSharing_internal, VmHtSharing_none extends VmHtSharing {}

//
// OCCI data type VmMonitorType
//
one sig VmMonitorType_DataType extends DataType {} {
    name = "VmMonitorType"
}

abstract sig VmMonitorType extends EnumBase {}
one sig VmMonitorType_debug, VmMonitorType_release, VmMonitorType_stats extends VmMonitorType {}

//
// OCCI data type VmPowerOffBehavior
//
one sig VmPowerOffBehavior_DataType extends DataType {} {
    name = "VmPowerOffBehavior"
}

abstract sig VmPowerOffBehavior extends EnumBase {}
one sig VmPowerOffBehavior_powerOff, VmPowerOffBehavior_prompt, VmPowerOffBehavior_revert extends VmPowerOffBehavior {}

//
// OCCI data type VmExecUsage
//
one sig VmExecUsage_DataType extends DataType {} {
    name = "VmExecUsage"
}

abstract sig VmExecUsage extends EnumBase {}
one sig VmExecUsage_hvAuto, VmExecUsage_hvOff, VmExecUsage_hvOn extends VmExecUsage {}

//
// OCCI data type VmMMUusage
//
one sig VmMMUusage_DataType extends DataType {} {
    name = "VmMMUusage"
}

abstract sig VmMMUusage extends EnumBase {}
one sig VmMMUusage_automatic, VmMMUusage_off, VmMMUusage_on extends VmMMUusage {}

//
// OCCI data type ShortNumber
//
one sig ShortNumber_DataType extends DataType {} {
    name = "ShortNumber"
}

let ShortNumber=String

//
// OCCI data type NpivWwnType
//
one sig NpivWwnType_DataType extends DataType {} {
    name = "NpivWwnType"
}

abstract sig NpivWwnType extends EnumBase {}
one sig NpivWwnType_external, NpivWwnType_host, NpivWwnType_vc extends NpivWwnType {}

//
// OCCI data type VmSwapPlacementType
//
one sig VmSwapPlacementType_DataType extends DataType {} {
    name = "VmSwapPlacementType"
}

abstract sig VmSwapPlacementType extends EnumBase {}
one sig VmSwapPlacementType_hostlocal, VmSwapPlacementType_inherit, VmSwapPlacementType_vmDirectory extends VmSwapPlacementType {}

//
// OCCI data type GuestOsIdentifiers
//
one sig GuestOsIdentifiers_DataType extends DataType {} {
    name = "GuestOsIdentifiers"
}

abstract sig GuestOsIdentifiers extends EnumBase {}
one sig GuestOsIdentifiers_dosGuest, GuestOsIdentifiers_win31Guest, GuestOsIdentifiers_win95Guest, GuestOsIdentifiers_win98Guest, GuestOsIdentifiers_winMeGuest, GuestOsIdentifiers_winNTGuest, GuestOsIdentifiers_win2000ProGuest, GuestOsIdentifiers_win2000ServGuest, GuestOsIdentifiers_win2000AdvServGuest, GuestOsIdentifiers_winXPHomeGuest, GuestOsIdentifiers_winXPProGuest, GuestOsIdentifiers_winXPPro64Guest, GuestOsIdentifiers_winNetWebGuest, GuestOsIdentifiers_winNetStandardGuest, GuestOsIdentifiers_winNetEnterpriseGuest, GuestOsIdentifiers_winNetDatacenterGuest, GuestOsIdentifiers_winNetBusinessGuest, GuestOsIdentifiers_winNetStandard64Guest, GuestOsIdentifiers_winNetEnterprise64Guest, GuestOsIdentifiers_winLonghornGuest, GuestOsIdentifiers_winLonghorn64Guest, GuestOsIdentifiers_winNetDatacenter64Guest, GuestOsIdentifiers_winVistaGuest, GuestOsIdentifiers_winVista64Guest, GuestOsIdentifiers_windows7Guest, GuestOsIdentifiers_windows7_64Guest, GuestOsIdentifiers_windows7Server64Guest, GuestOsIdentifiers_windows8Guest, GuestOsIdentifiers_windows8_64Guest, GuestOsIdentifiers_windows8Server64Guest, GuestOsIdentifiers_windows9Guest, GuestOsIdentifiers_windows9_64Guest, GuestOsIdentifiers_windows9Server64Guest, GuestOsIdentifiers_windowsHyperVGuest, GuestOsIdentifiers_freebsdGuest, GuestOsIdentifiers_freebsd64Guest, GuestOsIdentifiers_redhatGuest, GuestOsIdentifiers_rhel2Guest, GuestOsIdentifiers_rhel3Guest, GuestOsIdentifiers_rhel3_64Guest, GuestOsIdentifiers_rhel4Guest, GuestOsIdentifiers_rhel4_64Guest, GuestOsIdentifiers_rhel5Guest, GuestOsIdentifiers_rhel5_64Guest, GuestOsIdentifiers_rhel6Guest, GuestOsIdentifiers_rhel6_64Guest, GuestOsIdentifiers_rhel7Guest, GuestOsIdentifiers_rhel7_64Guest, GuestOsIdentifiers_centosGuest, GuestOsIdentifiers_centos64Guest, GuestOsIdentifiers_oracleLinuxGuest, GuestOsIdentifiers_oracleLinux64Guest, GuestOsIdentifiers_suseGuest, GuestOsIdentifiers_suse64Guest, GuestOsIdentifiers_slesGuest, GuestOsIdentifiers_sles64Guest, GuestOsIdentifiers_sles10Guest, GuestOsIdentifiers_sles10_64Guest, GuestOsIdentifiers_sles11Guest, GuestOsIdentifiers_sles11_64Guest, GuestOsIdentifiers_sles12Guest, GuestOsIdentifiers_sles12_64Guest, GuestOsIdentifiers_nld9Guest, GuestOsIdentifiers_oesGuest, GuestOsIdentifiers_sjdsGuest, GuestOsIdentifiers_mandrakeGuest, GuestOsIdentifiers_mandrivaGuest, GuestOsIdentifiers_mandriva64Guest, GuestOsIdentifiers_turboLinuxGuest, GuestOsIdentifiers_turboLinux64Guest, GuestOsIdentifiers_ubuntuGuest, GuestOsIdentifiers_ubuntu64Guest, GuestOsIdentifiers_debian4Guest, GuestOsIdentifiers_debian4_64Guest, GuestOsIdentifiers_debian5Guest, GuestOsIdentifiers_debian5_64Guest, GuestOsIdentifiers_debian6Guest, GuestOsIdentifiers_debian6_64Guest, GuestOsIdentifiers_debian7Guest, GuestOsIdentifiers_debian7_64Guest, GuestOsIdentifiers_debian8Guest, GuestOsIdentifiers_debian8_64Guest, GuestOsIdentifiers_asianux3Guest, GuestOsIdentifiers_asianux3_64Guest, GuestOsIdentifiers_asianux4Guest, GuestOsIdentifiers_asianux4_64Guest, GuestOsIdentifiers_asianux5_64Guest, GuestOsIdentifiers_opensuseGuest, GuestOsIdentifiers_opensuse64Guest, GuestOsIdentifiers_fedoraGuest, GuestOsIdentifiers_fedora64Guest, GuestOsIdentifiers_coreos64Guest, GuestOsIdentifiers_other24xLinuxGuest, GuestOsIdentifiers_other26xLinuxGuest, GuestOsIdentifiers_otherLinuxGuest, GuestOsIdentifiers_other3xLinuxGuest, GuestOsIdentifiers_genericLinuxGuest, GuestOsIdentifiers_other24xLinux64Guest, GuestOsIdentifiers_other26xLinux64Guest, GuestOsIdentifiers_other3xLinux64Guest, GuestOsIdentifiers_otherLinux64Guest, GuestOsIdentifiers_solaris6Guest, GuestOsIdentifiers_solaris7Guest, GuestOsIdentifiers_solaris8Guest, GuestOsIdentifiers_solaris9Guest, GuestOsIdentifiers_solaris10Guest, GuestOsIdentifiers_solaris10_64Guest, GuestOsIdentifiers_solaris11_64Guest, GuestOsIdentifiers_os2Guest, GuestOsIdentifiers_eComStationGuest, GuestOsIdentifiers_eComStation2Guest, GuestOsIdentifiers_netware4Guest, GuestOsIdentifiers_netware5Guest, GuestOsIdentifiers_netware6Guest, GuestOsIdentifiers_openServer5Guest, GuestOsIdentifiers_openServer6Guest, GuestOsIdentifiers_unixWare7Guest, GuestOsIdentifiers_darwinGuest, GuestOsIdentifiers_darwin64Guest, GuestOsIdentifiers_darwin10Guest, GuestOsIdentifiers_darwin10_64Guest, GuestOsIdentifiers_darwin11Guest, GuestOsIdentifiers_darwin11_64Guest, GuestOsIdentifiers_darwin12_64Guest, GuestOsIdentifiers_darwin13_64Guest, GuestOsIdentifiers_darwin14_64Guest, GuestOsIdentifiers_vmkernelGuest, GuestOsIdentifiers_vmkernel5Guest, GuestOsIdentifiers_vmkernel6Guest, GuestOsIdentifiers_otherGuest, GuestOsIdentifiers_otherGuest64 extends GuestOsIdentifiers {}

//
// OCCI data type ToolsUpgradePolicy
//
one sig ToolsUpgradePolicy_DataType extends DataType {} {
    name = "ToolsUpgradePolicy"
}

abstract sig ToolsUpgradePolicy extends EnumBase {}
one sig ToolsUpgradePolicy_manual, ToolsUpgradePolicy_upgradeAtPowerCycle extends ToolsUpgradePolicy {}

//
// OCCI data type OverallStatus
//
one sig OverallStatus_DataType extends DataType {} {
    name = "OverallStatus"
}

abstract sig OverallStatus extends EnumBase {}
one sig OverallStatus_gray, OverallStatus_green, OverallStatus_red, OverallStatus_yellow extends OverallStatus {}

//
// OCCI data type HostConnectionState
//
one sig HostConnectionState_DataType extends DataType {} {
    name = "HostConnectionState"
}

abstract sig HostConnectionState extends EnumBase {}
one sig HostConnectionState_connected, HostConnectionState_disconnected, HostConnectionState_notResponding extends HostConnectionState {}

//
// OCCI data type DiagnosticPartitionType
//
one sig DiagnosticPartitionType_DataType extends DataType {} {
    name = "DiagnosticPartitionType"
}

abstract sig DiagnosticPartitionType extends EnumBase {}
one sig DiagnosticPartitionType_multiHost, DiagnosticPartitionType_singleHost extends DiagnosticPartitionType {}

//
// OCCI data type AutoStartWaitHeartbeatSetting
//
one sig AutoStartWaitHeartbeatSetting_DataType extends DataType {} {
    name = "AutoStartWaitHeartbeatSetting"
}

abstract sig AutoStartWaitHeartbeatSetting extends EnumBase {}
one sig AutoStartWaitHeartbeatSetting_yes, AutoStartWaitHeartbeatSetting_no, AutoStartWaitHeartbeatSetting_systemdefault extends AutoStartWaitHeartbeatSetting {}

//
// OCCI data type HostFirewallRuleDirection
//
one sig HostFirewallRuleDirection_DataType extends DataType {} {
    name = "HostFirewallRuleDirection"
}

abstract sig HostFirewallRuleDirection extends EnumBase {}
one sig HostFirewallRuleDirection_inbound, HostFirewallRuleDirection_outbound extends HostFirewallRuleDirection {}

//
// OCCI data type HostNetworkProtocol
//
one sig HostNetworkProtocol_DataType extends DataType {} {
    name = "HostNetworkProtocol"
}

abstract sig HostNetworkProtocol extends EnumBase {}
one sig HostNetworkProtocol_tcp, HostNetworkProtocol_udp extends HostNetworkProtocol {}

//
// OCCI data type ByteType
//
one sig ByteType_DataType extends DataType {} {
    name = "ByteType"
}

let ByteType=String

//
// OCCI data type ClusterDASVmSettingsRestartPriority
//
one sig ClusterDASVmSettingsRestartPriority_DataType extends DataType {} {
    name = "ClusterDASVmSettingsRestartPriority"
}

abstract sig ClusterDASVmSettingsRestartPriority extends EnumBase {}
one sig ClusterDASVmSettingsRestartPriority_clusterRestartPriority, ClusterDASVmSettingsRestartPriority_disabled, ClusterDASVmSettingsRestartPriority_high, ClusterDASVmSettingsRestartPriority_low, ClusterDASVmSettingsRestartPriority_medium extends ClusterDASVmSettingsRestartPriority {}

//
// OCCI data type ClusterDASVmSettingsIsolationResponse
//
one sig ClusterDASVmSettingsIsolationResponse_DataType extends DataType {} {
    name = "ClusterDASVmSettingsIsolationResponse"
}

abstract sig ClusterDASVmSettingsIsolationResponse extends EnumBase {}
one sig ClusterDASVmSettingsIsolationResponse_clusterIsolationResponse, ClusterDASVmSettingsIsolationResponse_none, ClusterDASVmSettingsIsolationResponse_powerOff extends ClusterDASVmSettingsIsolationResponse {}

//
// OCCI data type DrsBehavior
//
one sig DrsBehavior_DataType extends DataType {} {
    name = "DrsBehavior"
}

abstract sig DrsBehavior extends EnumBase {}
one sig DrsBehavior_fullyAutomated, DrsBehavior_manual, DrsBehavior_partiallyAutomated extends DrsBehavior {}

//
// OCCI data type DpmBehavior
//
one sig DpmBehavior_DataType extends DataType {} {
    name = "DpmBehavior"
}

abstract sig DpmBehavior extends EnumBase {}
one sig DpmBehavior_automated, DpmBehavior_manual extends DpmBehavior {}

//
// OCCI data type DatastoreHostMountMode
//
one sig DatastoreHostMountMode_DataType extends DataType {} {
    name = "DatastoreHostMountMode"
}

abstract sig DatastoreHostMountMode extends EnumBase {}
one sig DatastoreHostMountMode_readOnly, DatastoreHostMountMode_readWrite extends DatastoreHostMountMode {}

//
// OCCI data type NicPolicyTeamingValue
//
one sig NicPolicyTeamingValue_DataType extends DataType {} {
    name = "NicPolicyTeamingValue"
}

abstract sig NicPolicyTeamingValue extends EnumBase {}
one sig NicPolicyTeamingValue_loadbalance_ip, NicPolicyTeamingValue_loadbalance_srcmac, NicPolicyTeamingValue_loadbalance_srcid, NicPolicyTeamingValue_failover_explicit extends NicPolicyTeamingValue {}

//
// OCCI data type PortGroupConnecteeType
//
one sig PortGroupConnecteeType_DataType extends DataType {} {
    name = "PortGroupConnecteeType"
}

abstract sig PortGroupConnecteeType extends EnumBase {}
one sig PortGroupConnecteeType_host, PortGroupConnecteeType_systemManagement, PortGroupConnecteeType_unknown, PortGroupConnecteeType_virtualMachine extends PortGroupConnecteeType {}

//
// OCCI data type NetworkChangeOperation
//
one sig NetworkChangeOperation_DataType extends DataType {} {
    name = "NetworkChangeOperation"
}

abstract sig NetworkChangeOperation extends EnumBase {}
one sig NetworkChangeOperation_add, NetworkChangeOperation_edit, NetworkChangeOperation_remove extends NetworkChangeOperation {}

//
// OCCI data type NetworkBootProtocolType
//
one sig NetworkBootProtocolType_DataType extends DataType {} {
    name = "NetworkBootProtocolType"
}

abstract sig NetworkBootProtocolType extends EnumBase {}
one sig NetworkBootProtocolType_ipv4, NetworkBootProtocolType_ipv6 extends NetworkBootProtocolType {}

//
// OCCI data type VmForkConfigInfoChildType
//
one sig VmForkConfigInfoChildType_DataType extends DataType {} {
    name = "VmForkConfigInfoChildType"
}

abstract sig VmForkConfigInfoChildType extends EnumBase {}
one sig VmForkConfigInfoChildType_none, VmForkConfigInfoChildType_nonpersistent, VmForkConfigInfoChildType_persistent extends VmForkConfigInfoChildType {}

//
// OCCI data type VmFaultToleranceType
//
one sig VmFaultToleranceType_DataType extends DataType {} {
    name = "VmFaultToleranceType"
}

abstract sig VmFaultToleranceType extends EnumBase {}
one sig VmFaultToleranceType_checkpointing, VmFaultToleranceType_recordReplay, VmFaultToleranceType_unset extends VmFaultToleranceType {}

//
// OCCI data type LatencySensitivityLevel
//
one sig LatencySensitivityLevel_DataType extends DataType {} {
    name = "LatencySensitivityLevel"
}

abstract sig LatencySensitivityLevel extends EnumBase {}
one sig LatencySensitivityLevel_normal, LatencySensitivityLevel_low, LatencySensitivityLevel_medium, LatencySensitivityLevel_high extends LatencySensitivityLevel {}

//
// OCCI data type ClusterDasConfigInfoHBDatastoreCandidate
//
one sig ClusterDasConfigInfoHBDatastoreCandidate_DataType extends DataType {} {
    name = "ClusterDasConfigInfoHBDatastoreCandidate"
}

abstract sig ClusterDasConfigInfoHBDatastoreCandidate extends EnumBase {}
one sig ClusterDasConfigInfoHBDatastoreCandidate_allFeasibleDsWithUserPreference, ClusterDasConfigInfoHBDatastoreCandidate_allFeasibleDs, ClusterDasConfigInfoHBDatastoreCandidate_userSelectedDs extends ClusterDasConfigInfoHBDatastoreCandidate {}

//
// OCCI data type ClusterDasConfigInfoVmMonitoringState
//
one sig ClusterDasConfigInfoVmMonitoringState_DataType extends DataType {} {
    name = "ClusterDasConfigInfoVmMonitoringState"
}

abstract sig ClusterDasConfigInfoVmMonitoringState extends EnumBase {}
one sig ClusterDasConfigInfoVmMonitoringState_vmAndAppMonitoring, ClusterDasConfigInfoVmMonitoringState_vmMonitoringDisabled, ClusterDasConfigInfoVmMonitoringState_vmMonitoringOnly extends ClusterDasConfigInfoVmMonitoringState {}

//
// OCCI data type ClusterDasConfigInfoServiceState
//
one sig ClusterDasConfigInfoServiceState_DataType extends DataType {} {
    name = "ClusterDasConfigInfoServiceState"
}

abstract sig ClusterDasConfigInfoServiceState extends EnumBase {}
one sig ClusterDasConfigInfoServiceState_enabled, ClusterDasConfigInfoServiceState_disabled extends ClusterDasConfigInfoServiceState {}

//
// OCCI data type HostFileSystemVolumeFileType
//
one sig HostFileSystemVolumeFileType_DataType extends DataType {} {
    name = "HostFileSystemVolumeFileType"
}

abstract sig HostFileSystemVolumeFileType extends EnumBase {}
one sig HostFileSystemVolumeFileType_CIFS, HostFileSystemVolumeFileType_NFS, HostFileSystemVolumeFileType_NFS41, HostFileSystemVolumeFileType_OTHER, HostFileSystemVolumeFileType_VFFS, HostFileSystemVolumeFileType_VMFS, HostFileSystemVolumeFileType_vsan, HostFileSystemVolumeFileType_VVOL extends HostFileSystemVolumeFileType {}

//
// OCCI data type DatastoreMaintenanceModeState
//
one sig DatastoreMaintenanceModeState_DataType extends DataType {} {
    name = "DatastoreMaintenanceModeState"
}

abstract sig DatastoreMaintenanceModeState extends EnumBase {}
one sig DatastoreMaintenanceModeState_enteringMaintenance, DatastoreMaintenanceModeState_inMaintenance, DatastoreMaintenanceModeState_normal extends DatastoreMaintenanceModeState {}

//
// OCCI data type HostNasVolumeSecurityType
//
one sig HostNasVolumeSecurityType_DataType extends DataType {} {
    name = "HostNasVolumeSecurityType"
}

abstract sig HostNasVolumeSecurityType extends EnumBase {}
one sig HostNasVolumeSecurityType_AUTH_SYS, HostNasVolumeSecurityType_SEC_KRB5 extends HostNasVolumeSecurityType {}

//
// OCCI data type VirtualDeviceConnectStatus
//
one sig VirtualDeviceConnectStatus_DataType extends DataType {} {
    name = "VirtualDeviceConnectStatus"
}

abstract sig VirtualDeviceConnectStatus extends EnumBase {}
one sig VirtualDeviceConnectStatus_ok, VirtualDeviceConnectStatus_recoverableError, VirtualDeviceConnectStatus_unrecoverrableError, VirtualDeviceConnectStatus_untried extends VirtualDeviceConnectStatus {}

//
// OCCI data type HostCapabilityFtUnsupportedReason
//
one sig HostCapabilityFtUnsupportedReason_DataType extends DataType {} {
    name = "HostCapabilityFtUnsupportedReason"
}

abstract sig HostCapabilityFtUnsupportedReason extends EnumBase {}
one sig HostCapabilityFtUnsupportedReason_cpuHvDisabled, HostCapabilityFtUnsupportedReason_cpuHvUnsupported, HostCapabilityFtUnsupportedReason_cpuHwmmuUnsupported, HostCapabilityFtUnsupportedReason_ftNotLicensed, HostCapabilityFtUnsupportedReason_haAgentIssue, HostCapabilityFtUnsupportedReason_missingFTLoggingNic, HostCapabilityFtUnsupportedReason_missingVMotionNic, HostCapabilityFtUnsupportedReason_unsupportedProduct, HostCapabilityFtUnsupportedReason_vMotionNotLicensed extends HostCapabilityFtUnsupportedReason {}

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

