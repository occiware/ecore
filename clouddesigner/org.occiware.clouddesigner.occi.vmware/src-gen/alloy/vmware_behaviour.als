// Generated at Fri Sep 09 11:14:21 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'vmware'
//
// ======================================================================

module vmware_behaviour

open util/boolean
open OCCI
open vmware

//
// Imported extensions
//
open core
open infrastructure

// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datastore'
//
// ======================================================================

//
// Equivalence predicate between two Datastore atoms.
//
pred isoDatastore[d1, d2: Datastore]
{
    // Comment following lines when this is not the expected behaviour.
    isoDatastore[d1, d2] // same resource
}


//
// OCCI Action 'http://occiware.org/occi/vmware/datastore/action#enterMaintenanceMode'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#cluster'
//
// ======================================================================

//
// Equivalence predicate between two Cluster atoms.
//
pred isoCluster[c1, c2: Cluster]
{
    // Comment following lines when this is not the expected behaviour.
    isoCluster[c1, c2] // same folder
}


//
// OCCI Action 'http://occiware.org/occi/vmware/cluster/action#addAllHostSystem'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/cluster/action#applyRecommendation'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/cluster/action#enterMaintenanceMode'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datacenter'
//
// ======================================================================

//
// Equivalence predicate between two Datacenter atoms.
//
pred isoDatacenter[d1, d2: Datacenter]
{
    // Comment following lines when this is not the expected behaviour.
    isoDatacenter[d1, d2] // same folder
}


//
// OCCI Action 'http://occiware.org/occi/vmware/datacenter/action#powerOnMultiVMs'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/datacenter/action#discoverAll'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostsystem'
//
// ======================================================================

//
// Equivalence predicate between two Hostsystem atoms.
//
pred isoHostsystem[h1, h2: Hostsystem]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostsystem[h1, h2] // same compute
}


//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#disconnectHost'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#enterlLockDownMode'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#enterMaintenanceMode'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#exitLockDownMode'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#exitMaintenanceMode'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#reconfigureHostForDAS'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostsystem/action#reconnectHost'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vm'
//
// ======================================================================

//
// Equivalence predicate between two Vm atoms.
//
pred isoVm[v1, v2: Vm]
{
    // Comment following lines when this is not the expected behaviour.
    isoVm[v1, v2] // same compute
}


//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#cloneVM'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#mountVmwareToolsdisk'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#markAsTemplate'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#markAsVirtualMachine'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#registerVM'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#unregisterVM'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#defragmentAllDisks'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/vm/action#resetLocationId'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#folderlink'
//
// ======================================================================

//
// Equivalence predicate between two Folderlink atoms.
//
pred isoFolderlink[f1, f2: Folderlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoFolderlink[f1, f2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#resourcepoollink'
//
// ======================================================================

//
// Equivalence predicate between two Resourcepoollink atoms.
//
pred isoResourcepoollink[r1, r2: Resourcepoollink]
{
    // Comment following lines when this is not the expected behaviour.
    isoResourcepoollink[r1, r2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#clusterlink'
//
// ======================================================================

//
// Equivalence predicate between two Clusterlink atoms.
//
pred isoClusterlink[c1, c2: Clusterlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoClusterlink[c1, c2] // same folderlink
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#resourcepool'
//
// ======================================================================

//
// Equivalence predicate between two Resourcepool atoms.
//
pred isoResourcepool[r1, r2: Resourcepool]
{
    // Comment following lines when this is not the expected behaviour.
    isoResourcepool[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datacenterlink'
//
// ======================================================================

//
// Equivalence predicate between two Datacenterlink atoms.
//
pred isoDatacenterlink[d1, d2: Datacenterlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoDatacenterlink[d1, d2] // same folderlink
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostsystemlink'
//
// ======================================================================

//
// Equivalence predicate between two Hostsystemlink atoms.
//
pred isoHostsystemlink[h1, h2: Hostsystemlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostsystemlink[h1, h2] // same folderlink
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#datastorelink'
//
// ======================================================================

//
// Equivalence predicate between two Datastorelink atoms.
//
pred isoDatastorelink[d1, d2: Datastorelink]
{
    // Comment following lines when this is not the expected behaviour.
    isoDatastorelink[d1, d2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisk'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdisk atoms.
//
pred isoVirtualdisk[v1, v2: Virtualdisk]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualdisk[v1, v2] // same storage
}


//
// OCCI Action 'http://occiware.org/occi/vmware/virtualdisk/action#zeroFill'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/virtualdisk/action#shrink'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vswitch'
//
// ======================================================================

//
// Equivalence predicate between two Vswitch atoms.
//
pred isoVswitch[v1, v2: Vswitch]
{
    // Comment following lines when this is not the expected behaviour.
    isoVswitch[v1, v2] // same network
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#portgroup'
//
// ======================================================================

//
// Equivalence predicate between two Portgroup atoms.
//
pred isoPortgroup[p1, p2: Portgroup]
{
    // Comment following lines when this is not the expected behaviour.
    isoPortgroup[p1, p2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualnetworkadapter'
//
// ======================================================================

//
// Equivalence predicate between two Virtualnetworkadapter atoms.
//
pred isoVirtualnetworkadapter[v1, v2: Virtualnetworkadapter]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualnetworkadapter[v1, v2] // same networkinterface
}


//
// OCCI Action 'http://occiware.org/occi/vmware/virtualnetworkadapter/action#connectAdaptater'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/virtualnetworkadapter/action#disconnectAdaptater'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisknetwork'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdisknetwork atoms.
//
pred isoVirtualdisknetwork[v1, v2: Virtualdisknetwork]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualdisknetwork[v1, v2] // same virtualdisk
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisknetworklink'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdisknetworklink atoms.
//
pred isoVirtualdisknetworklink[v1, v2: Virtualdisknetworklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualdisknetworklink[v1, v2] // same storagelink
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnetworkadapter'
//
// ======================================================================

//
// Equivalence predicate between two Hostnetworkadapter atoms.
//
pred isoHostnetworkadapter[h1, h2: Hostnetworkadapter]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostnetworkadapter[h1, h2] // same networkinterface
}


//
// OCCI Action 'http://occiware.org/occi/vmware/hostnetworkadapter/action#connect'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostnetworkadapter/action#disconnect'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#dvswitch'
//
// ======================================================================

//
// Equivalence predicate between two Dvswitch atoms.
//
pred isoDvswitch[d1, d2: Dvswitch]
{
    // Comment following lines when this is not the expected behaviour.
    isoDvswitch[d1, d2] // same vswitch
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#snapshot'
//
// ======================================================================

//
// Equivalence predicate between two Snapshot atoms.
//
pred isoSnapshot[s1, s2: Snapshot]
{
    // Comment following lines when this is not the expected behaviour.
    isoSnapshot[s1, s2] // same resource
}


//
// OCCI Action 'http://occiware.org/occi/vmware/snapshot/action#restore'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#snapshotlink'
//
// ======================================================================

//
// Equivalence predicate between two Snapshotlink atoms.
//
pred isoSnapshotlink[s1, s2: Snapshotlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoSnapshotlink[s1, s2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#folder'
//
// ======================================================================

//
// Equivalence predicate between two Folder atoms.
//
pred isoFolder[f1, f2: Folder]
{
    // Comment following lines when this is not the expected behaviour.
    isoFolder[f1, f2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfolder'
//
// ======================================================================

//
// Equivalence predicate between two Hostfolder atoms.
//
pred isoHostfolder[h1, h2: Hostfolder]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostfolder[h1, h2] // same folder
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vcentercapability'
//
// ======================================================================

//
// Equivalence predicate between two Vcentercapability atoms.
//
pred isoVcentercapability[v1, v2: Vcentercapability]
{
    // Comment following lines when this is not the expected behaviour.
    isoVcentercapability[v1, v2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallsystem'
//
// ======================================================================

//
// Equivalence predicate between two Hostfirewallsystem atoms.
//
pred isoHostfirewallsystem[h1, h2: Hostfirewallsystem]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostfirewallsystem[h1, h2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallruleset'
//
// ======================================================================

//
// Equivalence predicate between two Hostfirewallruleset atoms.
//
pred isoHostfirewallruleset[h1, h2: Hostfirewallruleset]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostfirewallruleset[h1, h2] // same resource
}


//
// OCCI Action 'http://occiware.org/occi/vmware/hostfirewallruleset/action#disableRuleset'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostfirewallruleset/action#enableRuleset'
//




// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostfirewallrule'
//
// ======================================================================

//
// Equivalence predicate between two Hostfirewallrule atoms.
//
pred isoHostfirewallrule[h1, h2: Hostfirewallrule]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostfirewallrule[h1, h2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hoststorage'
//
// ======================================================================

//
// Equivalence predicate between two Hoststorage atoms.
//
pred isoHoststorage[h1, h2: Hoststorage]
{
    // Comment following lines when this is not the expected behaviour.
    isoHoststorage[h1, h2] // same storage
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hoststoragelink'
//
// ======================================================================

//
// Equivalence predicate between two Hoststoragelink atoms.
//
pred isoHoststoragelink[h1, h2: Hoststoragelink]
{
    // Comment following lines when this is not the expected behaviour.
    isoHoststoragelink[h1, h2] // same storagelink
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#vmfolder'
//
// ======================================================================

//
// Equivalence predicate between two Vmfolder atoms.
//
pred isoVmfolder[v1, v2: Vmfolder]
{
    // Comment following lines when this is not the expected behaviour.
    isoVmfolder[v1, v2] // same folder
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#serviceconsolenic'
//
// ======================================================================

//
// Equivalence predicate between two Serviceconsolenic atoms.
//
pred isoServiceconsolenic[s1, s2: Serviceconsolenic]
{
    // Comment following lines when this is not the expected behaviour.
    isoServiceconsolenic[s1, s2] // same virtualnetworkadapter
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#portgrouplink'
//
// ======================================================================

//
// Equivalence predicate between two Portgrouplink atoms.
//
pred isoPortgrouplink[p1, p2: Portgrouplink]
{
    // Comment following lines when this is not the expected behaviour.
    isoPortgrouplink[p1, p2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnatrule'
//
// ======================================================================

//
// Equivalence predicate between two Hostnatrule atoms.
//
pred isoHostnatrule[h1, h2: Hostnatrule]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostnatrule[h1, h2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#hostnatportforwardlink'
//
// ======================================================================

//
// Equivalence predicate between two Hostnatportforwardlink atoms.
//
pred isoHostnatportforwardlink[h1, h2: Hostnatportforwardlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoHostnatportforwardlink[h1, h2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#distributedportgroup'
//
// ======================================================================

//
// Equivalence predicate between two Distributedportgroup atoms.
//
pred isoDistributedportgroup[d1, d2: Distributedportgroup]
{
    // Comment following lines when this is not the expected behaviour.
    isoDistributedportgroup[d1, d2] // same portgroup
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualcdrom'
//
// ======================================================================

//
// Equivalence predicate between two Virtualcdrom atoms.
//
pred isoVirtualcdrom[v1, v2: Virtualcdrom]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualcdrom[v1, v2] // same virtualdisk
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualfloppy'
//
// ======================================================================

//
// Equivalence predicate between two Virtualfloppy atoms.
//
pred isoVirtualfloppy[v1, v2: Virtualfloppy]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualfloppy[v1, v2] // same virtualdisk
}



// ======================================================================
//
// OCCI kind 'http://occiware.org/occi/vmware#virtualdisklink'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdisklink atoms.
//
pred isoVirtualdisklink[v1, v2: Virtualdisklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoVirtualdisklink[v1, v2] // same storagelink
}



// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#linux'
//
// ======================================================================

//
// Equivalence predicate between two Linux atoms.
//
pred isoLinux[l1, l2: Linux]
{
    // Comment following lines when this is not the expected behaviour.
    l1.guestid = l2.guestid // same guestid
    l1.datastoreisopath = l2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#windows'
//
// ======================================================================

//
// Equivalence predicate between two Windows atoms.
//
pred isoWindows[w1, w2: Windows]
{
    // Comment following lines when this is not the expected behaviour.
    w1.guestid = w2.guestid // same guestid
    w1.datastoreisopath = w2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#macosx'
//
// ======================================================================

//
// Equivalence predicate between two Macosx atoms.
//
pred isoMacosx[m1, m2: Macosx]
{
    // Comment following lines when this is not the expected behaviour.
    m1.guestid = m2.guestid // same guestid
    m1.datastoreisopath = m2.datastoreisopath // same datastoreisopath
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#small'
//
// ======================================================================

//
// Equivalence predicate between two Small atoms.
//
pred isoSmall[s1, s2: Small]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#medium'
//
// ======================================================================

//
// Equivalence predicate between two Medium atoms.
//
pred isoMedium[m1, m2: Medium]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#large'
//
// ======================================================================

//
// Equivalence predicate between two Large atoms.
//
pred isoLarge[l1, l2: Large]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#xlarge'
//
// ======================================================================

//
// Equivalence predicate between two Xlarge atoms.
//
pred isoXlarge[x1, x2: Xlarge]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#ssh_authentication'
//
// ======================================================================

//
// Equivalence predicate between two Ssh_authentication atoms.
//
pred isoSsh_authentication[s1, s2: Ssh_authentication]
{
    // Comment following lines when this is not the expected behaviour.
    s1.sshLogin = s2.sshLogin // same sshLogin
    s1.sshPassword = s2.sshPassword // same sshPassword
    s1.sshAddress = s2.sshAddress // same sshAddress
    s1.sshPort = s2.sshPort // same sshPort
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#bootoptions'
//
// ======================================================================

//
// Equivalence predicate between two Bootoptions atoms.
//
pred isoBootoptions[b1, b2: Bootoptions]
{
    // Comment following lines when this is not the expected behaviour.
    b1.bootDelay = b2.bootDelay // same bootDelay
    b1.bootDeviceOrder = b2.bootDeviceOrder // same bootDeviceOrder
    b1.bootRetryDelay = b2.bootRetryDelay // same bootRetryDelay
    b1.bootRetryEnabled = b2.bootRetryEnabled // same bootRetryEnabled
    b1.enterBiosSetup = b2.enterBiosSetup // same enterBiosSetup
    b1.deviceKeys = b2.deviceKeys // same deviceKeys
    b1.networkBootProtocol = b2.networkBootProtocol // same networkBootProtocol
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#cpuaffinity'
//
// ======================================================================

//
// Equivalence predicate between two Cpuaffinity atoms.
//
pred isoCpuaffinity[c1, c2: Cpuaffinity]
{
    // Comment following lines when this is not the expected behaviour.
    c1.affinitySet = c2.affinitySet // same affinitySet
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#shares'
//
// ======================================================================

//
// Equivalence predicate between two Shares atoms.
//
pred isoShares[s1, s2: Shares]
{
    // Comment following lines when this is not the expected behaviour.
    s1.level = s2.level // same level
    s1.shares = s2.shares // same shares
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dvsfeaturecapability'
//
// ======================================================================

//
// Equivalence predicate between two Dvsfeaturecapability atoms.
//
pred isoDvsfeaturecapability[d1, d2: Dvsfeaturecapability]
{
    // Comment following lines when this is not the expected behaviour.
    d1.networkResourceManagementSupported = d2.networkResourceManagementSupported // same networkResourceManagementSupported
    d1.networkResourcePoolHighShareValue = d2.networkResourcePoolHighShareValue // same networkResourcePoolHighShareValue
    d1.qosSupported = d2.qosSupported // same qosSupported
    d1.userDefinedNetworkResourcePoolsSupported = d2.userDefinedNetworkResourcePoolsSupported // same userDefinedNetworkResourcePoolsSupported
    d1.nicTeamingPolicy = d2.nicTeamingPolicy // same nicTeamingPolicy
    d1.vmDirectPathGen2Supported = d2.vmDirectPathGen2Supported // same vmDirectPathGen2Supported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#consolepreference'
//
// ======================================================================

//
// Equivalence predicate between two Consolepreference atoms.
//
pred isoConsolepreference[c1, c2: Consolepreference]
{
    // Comment following lines when this is not the expected behaviour.
    c1.closeOnPowerOffOrSuspend = c2.closeOnPowerOffOrSuspend // same closeOnPowerOffOrSuspend
    c1.enterFullscreenOnPowerOn = c2.enterFullscreenOnPowerOn // same enterFullscreenOnPowerOn
    c1.powerOnWhenOpened = c2.powerOnWhenOpened // same powerOnWhenOpened
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#defaultpoweroptions'
//
// ======================================================================

//
// Equivalence predicate between two Defaultpoweroptions atoms.
//
pred isoDefaultpoweroptions[d1, d2: Defaultpoweroptions]
{
    // Comment following lines when this is not the expected behaviour.
    d1.defaultPowerOffType = d2.defaultPowerOffType // same defaultPowerOffType
    d1.defaultResetType = d2.defaultResetType // same defaultResetType
    d1.defaultSuspendType = d2.defaultSuspendType // same defaultSuspendType
    d1.powerOffType = d2.powerOffType // same powerOffType
    d1.resetType = d2.resetType // same resetType
    d1.standbyAction = d2.standbyAction // same standbyAction
    d1.suspendType = d2.suspendType // same suspendType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmflags'
//
// ======================================================================

//
// Equivalence predicate between two Vmflags atoms.
//
pred isoVmflags[v1, v2: Vmflags]
{
    // Comment following lines when this is not the expected behaviour.
    v1.disableAcceleration = v2.disableAcceleration // same disableAcceleration
    v1.diskUUIDEnabled = v2.diskUUIDEnabled // same diskUUIDEnabled
    v1.enableLogging = v2.enableLogging // same enableLogging
    v1.htSharing = v2.htSharing // same htSharing
    v1.monitorType = v2.monitorType // same monitorType
    v1.recordReplayEnabled = v2.recordReplayEnabled // same recordReplayEnabled
    v1.snapshotLocked = v2.snapshotLocked // same snapshotLocked
    v1.snapshotPowerOffBehavior = v2.snapshotPowerOffBehavior // same snapshotPowerOffBehavior
    v1.useToe = v2.useToe // same useToe
    v1.virtualExecUsage = v2.virtualExecUsage // same virtualExecUsage
    v1.virtualMMUUsage = v2.virtualMMUUsage // same virtualMMUUsage
    v1.faultToleranceType = v2.faultToleranceType // same faultToleranceType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networkshaper'
//
// ======================================================================

//
// Equivalence predicate between two Networkshaper atoms.
//
pred isoNetworkshaper[n1, n2: Networkshaper]
{
    // Comment following lines when this is not the expected behaviour.
    n1.averageBPS = n2.averageBPS // same averageBPS
    n1.burstSize = n2.burstSize // same burstSize
    n1.enabled = n2.enabled // same enabled
    n1.peakBPS = n2.peakBPS // same peakBPS
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#npivconfig'
//
// ======================================================================

//
// Equivalence predicate between two Npivconfig atoms.
//
pred isoNpivconfig[n1, n2: Npivconfig]
{
    // Comment following lines when this is not the expected behaviour.
    n1.npivDesiredNodeWwns = n2.npivDesiredNodeWwns // same npivDesiredNodeWwns
    n1.npivDesiredPortWwns = n2.npivDesiredPortWwns // same npivDesiredPortWwns
    n1.npivNodeWorldWideName = n2.npivNodeWorldWideName // same npivNodeWorldWideName
    n1.npivOnNonRdmDisks = n2.npivOnNonRdmDisks // same npivOnNonRdmDisks
    n1.npivPortWorldWideName = n2.npivPortWorldWideName // same npivPortWorldWideName
    n1.npivTemporaryDisabled = n2.npivTemporaryDisabled // same npivTemporaryDisabled
    n1.npivWorldWideNameType = n2.npivWorldWideNameType // same npivWorldWideNameType
    n1.npivWorldWideNameOp = n2.npivWorldWideNameOp // same npivWorldWideNameOp
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#cpufeaturemask'
//
// ======================================================================

//
// Equivalence predicate between two Cpufeaturemask atoms.
//
pred isoCpufeaturemask[c1, c2: Cpufeaturemask]
{
    // Comment following lines when this is not the expected behaviour.
    c1.eax = c2.eax // same eax
    c1.ebx = c2.ebx // same ebx
    c1.ecx = c2.ecx // same ecx
    c1.edx = c2.edx // same edx
    c1.level = c2.level // same level
    c1.vendor = c2.vendor // same vendor
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#extraconfig'
//
// ======================================================================

//
// Equivalence predicate between two Extraconfig atoms.
//
pred isoExtraconfig[e1, e2: Extraconfig]
{
    // Comment following lines when this is not the expected behaviour.
    e1.key = e2.key // same key
    e1.value = e2.value // same value
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmfileconfig'
//
// ======================================================================

//
// Equivalence predicate between two Vmfileconfig atoms.
//
pred isoVmfileconfig[v1, v2: Vmfileconfig]
{
    // Comment following lines when this is not the expected behaviour.
    v1.snapshotDirectory = v2.snapshotDirectory // same snapshotDirectory
    v1.vmPathName = v2.vmPathName // same vmPathName
    v1.suspendDirectory = v2.suspendDirectory // same suspendDirectory
    v1.logDirectory = v2.logDirectory // same logDirectory
    v1.ftMetadataDirectory = v2.ftMetadataDirectory // same ftMetadataDirectory
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#guestconfig'
//
// ======================================================================

//
// Equivalence predicate between two Guestconfig atoms.
//
pred isoGuestconfig[g1, g2: Guestconfig]
{
    // Comment following lines when this is not the expected behaviour.
    g1.alternateGuestName = g2.alternateGuestName // same alternateGuestName
    g1.smbiosUUID = g2.smbiosUUID // same smbiosUUID
    g1.firmware = g2.firmware // same firmware
    g1.guestAutoLockEnabled = g2.guestAutoLockEnabled // same guestAutoLockEnabled
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#toolsconfig'
//
// ======================================================================

//
// Equivalence predicate between two Toolsconfig atoms.
//
pred isoToolsconfig[t1, t2: Toolsconfig]
{
    // Comment following lines when this is not the expected behaviour.
    t1.afterPowerOn = t2.afterPowerOn // same afterPowerOn
    t1.afterResume = t2.afterResume // same afterResume
    t1.beforeGuestReboot = t2.beforeGuestReboot // same beforeGuestReboot
    t1.beforeGuestShutdown = t2.beforeGuestShutdown // same beforeGuestShutdown
    t1.beforeGuestStandby = t2.beforeGuestStandby // same beforeGuestStandby
    t1.pendingCustomization = t2.pendingCustomization // same pendingCustomization
    t1.synctimeWithHost = t2.synctimeWithHost // same synctimeWithHost
    t1.toolsUpgradePolicy = t2.toolsUpgradePolicy // same toolsUpgradePolicy
    t1.toolsVersion = t2.toolsVersion // same toolsVersion
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostserviceticket'
//
// ======================================================================

//
// Equivalence predicate between two Hostserviceticket atoms.
//
pred isoHostserviceticket[h1, h2: Hostserviceticket]
{
    // Comment following lines when this is not the expected behaviour.
    h1.name = h2.name // same name
    h1.sessionid = h2.sessionid // same sessionid
    h1.port = h2.port // same port
    h1.service = h2.service // same service
    h1.serviceVersion = h2.serviceVersion // same serviceVersion
    h1.sslThumbPrint = h2.sslThumbPrint // same sslThumbPrint
}

//
// OCCI Action 'http://occiware.org/occi/vmware/hostserviceticket/action#acquirecimservicesticket'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#sharesconfig'
//
// ======================================================================

//
// Equivalence predicate between two Sharesconfig atoms.
//
pred isoSharesconfig[s1, s2: Sharesconfig]
{
    // Comment following lines when this is not the expected behaviour.
    s1.type = s2.type // same type
    s1.name = s2.name // same name
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmcapability'
//
// ======================================================================

//
// Equivalence predicate between two Vmcapability atoms.
//
pred isoVmcapability[v1, v2: Vmcapability]
{
    // Comment following lines when this is not the expected behaviour.
    v1.cpuFeatureMaskSupported = v2.cpuFeatureMaskSupported // same cpuFeatureMaskSupported
    v1.s1acpiManagementSupported = v2.s1acpiManagementSupported // same s1acpiManagementSupported
    v1.toolsAutoUpdateSupported = v2.toolsAutoUpdateSupported // same toolsAutoUpdateSupported
    v1.multipleSnapshotSupported = v2.multipleSnapshotSupported // same multipleSnapshotSupported
    v1.snapshotOperationsSupported = v2.snapshotOperationsSupported // same snapshotOperationsSupported
    v1.snapshotConfigSupported = v2.snapshotConfigSupported // same snapshotConfigSupported
    v1.quiescedSnapshotsSupported = v2.quiescedSnapshotsSupported // same quiescedSnapshotsSupported
    v1.poweredOffSnapshotsSupported = v2.poweredOffSnapshotsSupported // same poweredOffSnapshotsSupported
    v1.settingScreenResolutionSupported = v2.settingScreenResolutionSupported // same settingScreenResolutionSupported
    v1.consolePreferenceSupported = v2.consolePreferenceSupported // same consolePreferenceSupported
    v1.revertToSnapshotSupported = v2.revertToSnapshotSupported // same revertToSnapshotSupported
    v1.memorySnapshotsSupported = v2.memorySnapshotsSupported // same memorySnapshotsSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#resourcepoolallocation'
//
// ======================================================================

//
// Equivalence predicate between two Resourcepoolallocation atoms.
//
pred isoResourcepoolallocation[r1, r2: Resourcepoolallocation]
{
    // Comment following lines when this is not the expected behaviour.
    r1.cpuReservationUsed = r2.cpuReservationUsed // same cpuReservationUsed
    r1.cpuUnreservedForVm = r2.cpuUnreservedForVm // same cpuUnreservedForVm
    r1.memReservationUsed = r2.memReservationUsed // same memReservationUsed
    r1.cpuOverallUsage = r2.cpuOverallUsage // same cpuOverallUsage
    r1.memUnreservedForVm = r2.memUnreservedForVm // same memUnreservedForVm
    r1.memReservationUsedforVm = r2.memReservationUsedforVm // same memReservationUsedforVm
    r1.memOverallUsage = r2.memOverallUsage // same memOverallUsage
    r1.cpuMaxUsage = r2.cpuMaxUsage // same cpuMaxUsage
    r1.memMaxUsage = r2.memMaxUsage // same memMaxUsage
    r1.cpuUnereservedForPool = r2.cpuUnereservedForPool // same cpuUnereservedForPool
    r1.cpuReservationUsedForVm = r2.cpuReservationUsedForVm // same cpuReservationUsedForVm
    r1.memUnereservedForPool = r2.memUnereservedForPool // same memUnereservedForPool
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#resourcepoolquickstats'
//
// ======================================================================

//
// Equivalence predicate between two Resourcepoolquickstats atoms.
//
pred isoResourcepoolquickstats[r1, r2: Resourcepoolquickstats]
{
    // Comment following lines when this is not the expected behaviour.
    r1.staticMemoryEntitlement = r2.staticMemoryEntitlement // same staticMemoryEntitlement
    r1.overallCPUDemand = r2.overallCPUDemand // same overallCPUDemand
    r1.compressedMemory = r2.compressedMemory // same compressedMemory
    r1.staticCPUEntitlement = r2.staticCPUEntitlement // same staticCPUEntitlement
    r1.guestMemoryUsage = r2.guestMemoryUsage // same guestMemoryUsage
    r1.sharedMemory = r2.sharedMemory // same sharedMemory
    r1.consumedOverheadMemory = r2.consumedOverheadMemory // same consumedOverheadMemory
    r1.balloonedMemory = r2.balloonedMemory // same balloonedMemory
    r1.overallCPUUsage = r2.overallCPUUsage // same overallCPUUsage
    r1.swappedMemory = r2.swappedMemory // same swappedMemory
    r1.configuredMemoryMB = r2.configuredMemoryMB // same configuredMemoryMB
    r1.overheadMemory = r2.overheadMemory // same overheadMemory
    r1.privateMemory = r2.privateMemory // same privateMemory
    r1.distributedCPUEntitlement = r2.distributedCPUEntitlement // same distributedCPUEntitlement
    r1.hostMemoryUsage = r2.hostMemoryUsage // same hostMemoryUsage
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthardwareinfo'
//
// ======================================================================

//
// Equivalence predicate between two Hosthardwareinfo atoms.
//
pred isoHosthardwareinfo[h1, h2: Hosthardwareinfo]
{
    // Comment following lines when this is not the expected behaviour.
    h1.otherIdentifierType = h2.otherIdentifierType // same otherIdentifierType
    h1.otherIdentifierValues = h2.otherIdentifierValues // same otherIdentifierValues
    h1.cpuThreads = h2.cpuThreads // same cpuThreads
    h1.cpuModel = h2.cpuModel // same cpuModel
    h1.nics = h2.nics // same nics
    h1.cpus = h2.cpus // same cpus
    h1.vendor = h2.vendor // same vendor
    h1.model = h2.model // same model
    h1.hbas = h2.hbas // same hbas
    h1.biosUUID = h2.biosUUID // same biosUUID
    h1.biosVersion = h2.biosVersion // same biosVersion
    h1.biosReleaseDate = h2.biosReleaseDate // same biosReleaseDate
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostaboutinfo'
//
// ======================================================================

//
// Equivalence predicate between two Hostaboutinfo atoms.
//
pred isoHostaboutinfo[h1, h2: Hostaboutinfo]
{
    // Comment following lines when this is not the expected behaviour.
    h1.apiType = h2.apiType // same apiType
    h1.apiVersion = h2.apiVersion // same apiVersion
    h1.build = h2.build // same build
    h1.fullname = h2.fullname // same fullname
    h1.localeBuild = h2.localeBuild // same localeBuild
    h1.localeVersion = h2.localeVersion // same localeVersion
    h1.shortname = h2.shortname // same shortname
    h1.osType = h2.osType // same osType
    h1.productLineId = h2.productLineId // same productLineId
    h1.vendorName = h2.vendorName // same vendorName
    h1.productVersion = h2.productVersion // same productVersion
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthealth'
//
// ======================================================================

//
// Equivalence predicate between two Hosthealth atoms.
//
pred isoHosthealth[h1, h2: Hosthealth]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostconfig atoms.
//
pred isoHostconfig[h1, h2: Hostconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.adminDisabled = h2.adminDisabled // same adminDisabled
    h1.datastorePrincipal = h2.datastorePrincipal // same datastorePrincipal
    h1.localeSwapDatastoreName = h2.localeSwapDatastoreName // same localeSwapDatastoreName
}

//
// OCCI Action 'http://occiware.org/occi/vmware/hostconfig/action#enableAdmin'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostconfig/action#disableAdmin'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#activediagnosticpartition'
//
// ======================================================================

//
// Equivalence predicate between two Activediagnosticpartition atoms.
//
pred isoActivediagnosticpartition[a1, a2: Activediagnosticpartition]
{
    // Comment following lines when this is not the expected behaviour.
    a1.diagnosticType = a2.diagnosticType // same diagnosticType
    a1.diskNameVMFS = a2.diskNameVMFS // same diskNameVMFS
    a1.partition = a2.partition // same partition
    a1.slots = a2.slots // same slots
    a1.storageType = a2.storageType // same storageType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#defaultautostartconfigvm'
//
// ======================================================================

//
// Equivalence predicate between two Defaultautostartconfigvm atoms.
//
pred isoDefaultautostartconfigvm[d1, d2: Defaultautostartconfigvm]
{
    // Comment following lines when this is not the expected behaviour.
    d1.autostartManagerEnabled = d2.autostartManagerEnabled // same autostartManagerEnabled
    d1.startDelay = d2.startDelay // same startDelay
    d1.stopAction = d2.stopAction // same stopAction
    d1.stopDelay = d2.stopDelay // same stopDelay
    d1.waitForHeartbeat = d2.waitForHeartbeat // same waitForHeartbeat
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkcapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostnetworkcapability atoms.
//
pred isoHostnetworkcapability[h1, h2: Hostnetworkcapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.canSetPhysicalNicLinkSpeed = h2.canSetPhysicalNicLinkSpeed // same canSetPhysicalNicLinkSpeed
    h1.dhcpOnVnicSupported = h2.dhcpOnVnicSupported // same dhcpOnVnicSupported
    h1.dnsConfigSupported = h2.dnsConfigSupported // same dnsConfigSupported
    h1.ipRouteConfigSupported = h2.ipRouteConfigSupported // same ipRouteConfigSupported
    h1.maxPortGroupsPerVswitch = h2.maxPortGroupsPerVswitch // same maxPortGroupsPerVswitch
    h1.nicTeamingPolicy = h2.nicTeamingPolicy // same nicTeamingPolicy
    h1.supportsNetworkHints = h2.supportsNetworkHints // same supportsNetworkHints
    h1.supportsNicTeaming = h2.supportsNicTeaming // same supportsNicTeaming
    h1.supportsVlan = h2.supportsVlan // same supportsVlan
    h1.usesServiceConsoleNic = h2.usesServiceConsoleNic // same usesServiceConsoleNic
    h1.vnicConfigSupported = h2.vnicConfigSupported // same vnicConfigSupported
    h1.vswitchConfigSupported = h2.vswitchConfigSupported // same vswitchConfigSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#autostartpowerinfo'
//
// ======================================================================

//
// Equivalence predicate between two Autostartpowerinfo atoms.
//
pred isoAutostartpowerinfo[a1, a2: Autostartpowerinfo]
{
    // Comment following lines when this is not the expected behaviour.
    a1.stopDelay = a2.stopDelay // same stopDelay
    a1.stopAction = a2.stopAction // same stopAction
    a1.waitForHeartbeat = a2.waitForHeartbeat // same waitForHeartbeat
    a1.startDelay = a2.startDelay // same startDelay
    a1.startAction = a2.startAction // same startAction
    a1.startOrder = a2.startOrder // same startOrder
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostmemoryreservation'
//
// ======================================================================

//
// Equivalence predicate between two Hostmemoryreservation atoms.
//
pred isoHostmemoryreservation[h1, h2: Hostmemoryreservation]
{
    // Comment following lines when this is not the expected behaviour.
    h1.serviceConsoleReserved = h2.serviceConsoleReserved // same serviceConsoleReserved
    h1.serviceConsoleReservedCfg = h2.serviceConsoleReservedCfg // same serviceConsoleReservedCfg
    h1.unreserved = h2.unreserved // same unreserved
    h1.allocationPolicy = h2.allocationPolicy // same allocationPolicy
    h1.virtualMachineMax = h2.virtualMachineMax // same virtualMachineMax
    h1.virtualMachineMin = h2.virtualMachineMin // same virtualMachineMin
    h1.virtualMachineReserved = h2.virtualMachineReserved // same virtualMachineReserved
}

//
// OCCI Action 'http://occiware.org/occi/vmware/hostmemoryreservation/action#reconfigureServiceConsoleReservation'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hostmemoryreservation/action#reconfigureVirtualMachineReservation'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdatastorecapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostdatastorecapability atoms.
//
pred isoHostdatastorecapability[h1, h2: Hostdatastorecapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.localDatastoreSupported = h2.localDatastoreSupported // same localDatastoreSupported
    h1.nfsMountCreationRequired = h2.nfsMountCreationRequired // same nfsMountCreationRequired
    h1.nfsMountCreationSupported = h2.nfsMountCreationSupported // same nfsMountCreationSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdatetimeinfo'
//
// ======================================================================

//
// Equivalence predicate between two Hostdatetimeinfo atoms.
//
pred isoHostdatetimeinfo[h1, h2: Hostdatetimeinfo]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostntpconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostntpconfig atoms.
//
pred isoHostntpconfig[h1, h2: Hostntpconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.hostNTPServers = h2.hostNTPServers // same hostNTPServers
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosttimezone'
//
// ======================================================================

//
// Equivalence predicate between two Hosttimezone atoms.
//
pred isoHosttimezone[h1, h2: Hosttimezone]
{
    // Comment following lines when this is not the expected behaviour.
    h1.timeZoneDescription = h2.timeZoneDescription // same timeZoneDescription
    h1.timeZoneGMTOffset = h2.timeZoneGMTOffset // same timeZoneGMTOffset
    h1.timeZoneKey = h2.timeZoneKey // same timeZoneKey
    h1.timeZoneName = h2.timeZoneName // same timeZoneName
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostflaginfo'
//
// ======================================================================

//
// Equivalence predicate between two Hostflaginfo atoms.
//
pred isoHostflaginfo[h1, h2: Hostflaginfo]
{
    // Comment following lines when this is not the expected behaviour.
    h1.backgroundSnapshotsEnabled = h2.backgroundSnapshotsEnabled // same backgroundSnapshotsEnabled
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hosthyperthreadscheduler'
//
// ======================================================================

//
// Equivalence predicate between two Hosthyperthreadscheduler atoms.
//
pred isoHosthyperthreadscheduler[h1, h2: Hosthyperthreadscheduler]
{
    // Comment following lines when this is not the expected behaviour.
    h1.hyperThreadActive = h2.hyperThreadActive // same hyperThreadActive
    h1.hyperThreadAvailable = h2.hyperThreadAvailable // same hyperThreadAvailable
    h1.hyperThreadConfig = h2.hyperThreadConfig // same hyperThreadConfig
}

//
// OCCI Action 'http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#enableHyperThreading'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/hosthyperthreadscheduler/action#disableHyperThreading'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsystemvolumemounted'
//
// ======================================================================

//
// Equivalence predicate between two Hostsystemvolumemounted atoms.
//
pred isoHostsystemvolumemounted[h1, h2: Hostsystemvolumemounted]
{
    // Comment following lines when this is not the expected behaviour.
    h1.accessible = h2.accessible // same accessible
    h1.accessMode = h2.accessMode // same accessMode
    h1.hostVolumeType = h2.hostVolumeType // same hostVolumeType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostfilesystemvolumeinfo'
//
// ======================================================================

//
// Equivalence predicate between two Hostfilesystemvolumeinfo atoms.
//
pred isoHostfilesystemvolumeinfo[h1, h2: Hostfilesystemvolumeinfo]
{
    // Comment following lines when this is not the expected behaviour.
    h1.volumeTypeList = h2.volumeTypeList // same volumeTypeList
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostpcidevices'
//
// ======================================================================

//
// Equivalence predicate between two Hostpcidevices atoms.
//
pred isoHostpcidevices[h1, h2: Hostpcidevices]
{
    // Comment following lines when this is not the expected behaviour.
    h1.pciBus = h2.pciBus // same pciBus
    h1.pciClassId = h2.pciClassId // same pciClassId
    h1.pciDeviceId = h2.pciDeviceId // same pciDeviceId
    h1.pciDeviceName = h2.pciDeviceName // same pciDeviceName
    h1.pciFunction = h2.pciFunction // same pciFunction
    h1.pciId = h2.pciId // same pciId
    h1.pciSlot = h2.pciSlot // same pciSlot
    h1.pciSubDeviceId = h2.pciSubDeviceId // same pciSubDeviceId
    h1.pciSubVendorId = h2.pciSubVendorId // same pciSubVendorId
    h1.pciVendorId = h2.pciVendorId // same pciVendorId
    h1.pciVendorName = h2.pciVendorName // same pciVendorName
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusteractionhistory'
//
// ======================================================================

//
// Equivalence predicate between two Clusteractionhistory atoms.
//
pred isoClusteractionhistory[c1, c2: Clusteractionhistory]
{
    // Comment following lines when this is not the expected behaviour.
    c1.actionType = c2.actionType // same actionType
    c1.actionTime = c2.actionTime // same actionTime
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsrecommandations'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdrsrecommandations atoms.
//
pred isoClusterdrsrecommandations[c1, c2: Clusterdrsrecommandations]
{
    // Comment following lines when this is not the expected behaviour.
}

//
// OCCI Action 'http://occiware.org/occi/vmware/clusterdrsrecommandations/action#queryClusterDrsRecommandations'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterresourcesinfo'
//
// ======================================================================

//
// Equivalence predicate between two Clusterresourcesinfo atoms.
//
pred isoClusterresourcesinfo[c1, c2: Clusterresourcesinfo]
{
    // Comment following lines when this is not the expected behaviour.
    c1.effectiveCpu = c2.effectiveCpu // same effectiveCpu
    c1.effectiveMemory = c2.effectiveMemory // same effectiveMemory
    c1.numCpuCores = c2.numCpuCores // same numCpuCores
    c1.numCpuThreads = c2.numCpuThreads // same numCpuThreads
    c1.numEffectiveHosts = c2.numEffectiveHosts // same numEffectiveHosts
    c1.numHosts = c2.numHosts // same numHosts
    c1.overallStatus = c2.overallStatus // same overallStatus
    c1.totalCpu = c2.totalCpu // same totalCpu
    c1.totalMemory = c2.totalMemory // same totalMemory
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasconfig'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdasconfig atoms.
//
pred isoClusterdasconfig[c1, c2: Clusterdasconfig]
{
    // Comment following lines when this is not the expected behaviour.
    c1.admissionControlEnabled = c2.admissionControlEnabled // same admissionControlEnabled
    c1.HAEnabled = c2.HAEnabled // same HAEnabled
    c1.dasOptionKeys = c2.dasOptionKeys // same dasOptionKeys
    c1.dasOptionValues = c2.dasOptionValues // same dasOptionValues
    c1.hBDatastoreCandidatePolicy = c2.hBDatastoreCandidatePolicy // same hBDatastoreCandidatePolicy
    c1.heartbeatDatastoreNames = c2.heartbeatDatastoreNames // same heartbeatDatastoreNames
    c1.hostMonitoring = c2.hostMonitoring // same hostMonitoring
    c1.vmComponentProtecting = c2.vmComponentProtecting // same vmComponentProtecting
    c1.vmMonitoring = c2.vmMonitoring // same vmMonitoring
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdefaultdasvmconfig'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdefaultdasvmconfig atoms.
//
pred isoClusterdefaultdasvmconfig[c1, c2: Clusterdefaultdasvmconfig]
{
    // Comment following lines when this is not the expected behaviour.
    c1.isolationResponse = c2.isolationResponse // same isolationResponse
    c1.restartPriority = c2.restartPriority // same restartPriority
    c1.enableAPDTimeoutForHosts = c2.enableAPDTimeoutForHosts // same enableAPDTimeoutForHosts
    c1.vmReactionOnAPDCleared = c2.vmReactionOnAPDCleared // same vmReactionOnAPDCleared
    c1.vmStorageProtectionForAPD = c2.vmStorageProtectionForAPD // same vmStorageProtectionForAPD
    c1.vmStorageProtectionForPDL = c2.vmStorageProtectionForPDL // same vmStorageProtectionForPDL
    c1.vmTerminateDelayForAPDSec = c2.vmTerminateDelayForAPDSec // same vmTerminateDelayForAPDSec
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dasvmsettings'
//
// ======================================================================

//
// Equivalence predicate between two Dasvmsettings atoms.
//
pred isoDasvmsettings[d1, d2: Dasvmsettings]
{
    // Comment following lines when this is not the expected behaviour.
    d1.isolationResponse = d2.isolationResponse // same isolationResponse
    d1.restartPriority = d2.restartPriority // same restartPriority
    d1.vmStorageProtectionForPDL = d2.vmStorageProtectionForPDL // same vmStorageProtectionForPDL
    d1.enableAPDTimeoutForHosts = d2.enableAPDTimeoutForHosts // same enableAPDTimeoutForHosts
    d1.vmTerminateDelayForAPDSec = d2.vmTerminateDelayForAPDSec // same vmTerminateDelayForAPDSec
    d1.vmReactionOnAPDCleared = d2.vmReactionOnAPDCleared // same vmReactionOnAPDCleared
    d1.vmStorageProtectionForAPD = d2.vmStorageProtectionForAPD // same vmStorageProtectionForAPD
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterhostdpmconfig'
//
// ======================================================================

//
// Equivalence predicate between two Clusterhostdpmconfig atoms.
//
pred isoClusterhostdpmconfig[c1, c2: Clusterhostdpmconfig]
{
    // Comment following lines when this is not the expected behaviour.
    c1.defaultDPMBehavior = c2.defaultDPMBehavior // same defaultDPMBehavior
    c1.dpmEnabled = c2.dpmEnabled // same dpmEnabled
    c1.dpmOptionKeys = c2.dpmOptionKeys // same dpmOptionKeys
    c1.dpmOptionValues = c2.dpmOptionValues // same dpmOptionValues
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsconfig'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdrsconfig atoms.
//
pred isoClusterdrsconfig[c1, c2: Clusterdrsconfig]
{
    // Comment following lines when this is not the expected behaviour.
    c1.defaultVmDRSBehavior = c2.defaultVmDRSBehavior // same defaultVmDRSBehavior
    c1.drsEnabled = c2.drsEnabled // same drsEnabled
    c1.drsOptionValues = c2.drsOptionValues // same drsOptionValues
    c1.drsOptionKeys = c2.drsOptionKeys // same drsOptionKeys
    c1.vmotionRate = c2.vmotionRate // same vmotionRate
    c1.drsEnableVmBehaviorOverrides = c2.drsEnableVmBehaviorOverrides // same drsEnableVmBehaviorOverrides
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdpmconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostdpmconfig atoms.
//
pred isoHostdpmconfig[h1, h2: Hostdpmconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.dpmEnabled = h2.dpmEnabled // same dpmEnabled
    h1.dpmBehavior = h2.dpmBehavior // same dpmBehavior
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#drsVmConfig'
//
// ======================================================================

//
// Equivalence predicate between two DrsVmConfig atoms.
//
pred isoDrsVmConfig[d1, d2: DrsVmConfig]
{
    // Comment following lines when this is not the expected behaviour.
    d1.drsEnabled = d2.drsEnabled // same drsEnabled
    d1.drsBehavior = d2.drsBehavior // same drsBehavior
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterrule'
//
// ======================================================================

//
// Equivalence predicate between two Clusterrule atoms.
//
pred isoClusterrule[c1, c2: Clusterrule]
{
    // Comment following lines when this is not the expected behaviour.
    c1.status = c2.status // same status
    c1.key = c2.key // same key
    c1.enabled = c2.enabled // same enabled
    c1.name = c2.name // same name
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconnectconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostconnectconfig atoms.
//
pred isoHostconnectconfig[h1, h2: Hostconnectconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.connectForce = h2.connectForce // same connectForce
    h1.connectPassword = h2.connectPassword // same connectPassword
    h1.connectPort = h2.connectPort // same connectPort
    h1.connectSslThumbPrint = h2.connectSslThumbPrint // same connectSslThumbPrint
    h1.connectUserName = h2.connectUserName // same connectUserName
    h1.connectVimAccountName = h2.connectVimAccountName // same connectVimAccountName
    h1.connectVimAccountPassword = h2.connectVimAccountPassword // same connectVimAccountPassword
    h1.hostConnectAfterAdded = h2.hostConnectAfterAdded // same hostConnectAfterAdded
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdrsmigrationhistory'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdrsmigrationhistory atoms.
//
pred isoClusterdrsmigrationhistory[c1, c2: Clusterdrsmigrationhistory]
{
    // Comment following lines when this is not the expected behaviour.
}

//
// OCCI Action 'http://occiware.org/occi/vmware/clusterdrsmigrationhistory/action#queryClusterMigrationHistory'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterrecommandations'
//
// ======================================================================

//
// Equivalence predicate between two Clusterrecommandations atoms.
//
pred isoClusterrecommandations[c1, c2: Clusterrecommandations]
{
    // Comment following lines when this is not the expected behaviour.
}

//
// OCCI Action 'http://occiware.org/occi/vmware/clusterrecommandations/action#queryClusterRecommandations'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorecapability'
//
// ======================================================================

//
// Equivalence predicate between two Datastorecapability atoms.
//
pred isoDatastorecapability[d1, d2: Datastorecapability]
{
    // Comment following lines when this is not the expected behaviour.
    d1.directoryHierarchySupported = d2.directoryHierarchySupported // same directoryHierarchySupported
    d1.perFileThinProvisioningSupported = d2.perFileThinProvisioningSupported // same perFileThinProvisioningSupported
    d1.rawDiskMappingsSupported = d2.rawDiskMappingsSupported // same rawDiskMappingsSupported
    d1.nativeSnapshotSupported = d2.nativeSnapshotSupported // same nativeSnapshotSupported
    d1.seSparseSupported = d2.seSparseSupported // same seSparseSupported
    d1.storageIORMSupported = d2.storageIORMSupported // same storageIORMSupported
    d1.topLevelDirectoryCreateSupported = d2.topLevelDirectoryCreateSupported // same topLevelDirectoryCreateSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostmountinfo'
//
// ======================================================================

//
// Equivalence predicate between two Datastorehostmountinfo atoms.
//
pred isoDatastorehostmountinfo[d1, d2: Datastorehostmountinfo]
{
    // Comment following lines when this is not the expected behaviour.
    d1.accessibles = d2.accessibles // same accessibles
    d1.accessModes = d2.accessModes // same accessModes
    d1.hostsystemPaths = d2.hostsystemPaths // same hostsystemPaths
    d1.hostsystemNames = d2.hostsystemNames // same hostsystemNames
    d1.inaccessibleReasons = d2.inaccessibleReasons // same inaccessibleReasons
    d1.mounted = d2.mounted // same mounted
    d1.paths = d2.paths // same paths
    d1.hostnames = d2.hostnames // same hostnames
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreinfo'
//
// ======================================================================

//
// Equivalence predicate between two Datastoreinfo atoms.
//
pred isoDatastoreinfo[d1, d2: Datastoreinfo]
{
    // Comment following lines when this is not the expected behaviour.
    d1.maxFileSize = d2.maxFileSize // same maxFileSize
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoresummary'
//
// ======================================================================

//
// Equivalence predicate between two Datastoresummary atoms.
//
pred isoDatastoresummary[d1, d2: Datastoresummary]
{
    // Comment following lines when this is not the expected behaviour.
    d1.url = d2.url // same url
    d1.freespace = d2.freespace // same freespace
    d1.accessible = d2.accessible // same accessible
    d1.capacity = d2.capacity // same capacity
    d1.multipleHostAccess = d2.multipleHostAccess // same multipleHostAccess
    d1.type = d2.type // same type
    d1.volumeName = d2.volumeName // same volumeName
    d1.maintenanceMode = d2.maintenanceMode // same maintenanceMode
    d1.uncommitted = d2.uncommitted // same uncommitted
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostnasvolumeconfig'
//
// ======================================================================

//
// Equivalence predicate between two Datastorehostnasvolumeconfig atoms.
//
pred isoDatastorehostnasvolumeconfig[d1, d2: Datastorehostnasvolumeconfig]
{
    // Comment following lines when this is not the expected behaviour.
    d1.accessMode = d2.accessMode // same accessMode
    d1.localPath = d2.localPath // same localPath
    d1.userName = d2.userName // same userName
    d1.password = d2.password // same password
    d1.remoteHost = d2.remoteHost // same remoteHost
    d1.remotePath = d2.remotePath // same remotePath
    d1.volumeType = d2.volumeType // same volumeType
    d1.remoteHostnames = d2.remoteHostnames // same remoteHostnames
    d1.securityType = d2.securityType // same securityType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreuserprincipalauth'
//
// ======================================================================

//
// Equivalence predicate between two Datastoreuserprincipalauth atoms.
//
pred isoDatastoreuserprincipalauth[d1, d2: Datastoreuserprincipalauth]
{
    // Comment following lines when this is not the expected behaviour.
    d1.userName = d2.userName // same userName
    d1.password = d2.password // same password
}

//
// OCCI Action 'http://occiware.org/occi/vmware/datastoreuserprincipalauth/action#changeDatastoreUserPassword'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostvmfsvolumeconfig'
//
// ======================================================================

//
// Equivalence predicate between two Datastorehostvmfsvolumeconfig atoms.
//
pred isoDatastorehostvmfsvolumeconfig[d1, d2: Datastorehostvmfsvolumeconfig]
{
    // Comment following lines when this is not the expected behaviour.
    d1.diskUUID = d2.diskUUID // same diskUUID
    d1.blockSizeMb = d2.blockSizeMb // same blockSizeMb
    d1.vmfsVolumeName = d2.vmfsVolumeName // same vmfsVolumeName
    d1.vmfsMajorVersion = d2.vmfsMajorVersion // same vmfsMajorVersion
    d1.extentDiskName = d2.extentDiskName // same extentDiskName
    d1.extentPartition = d2.extentPartition // same extentPartition
}

//
// OCCI Action 'http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#extendVMFS'
//



//
// OCCI Action 'http://occiware.org/occi/vmware/datastorehostvmfsvolumeconfig/action#formatVMFS'
//




// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostlocalvolumeconfig'
//
// ======================================================================

//
// Equivalence predicate between two Datastorehostlocalvolumeconfig atoms.
//
pred isoDatastorehostlocalvolumeconfig[d1, d2: Datastorehostlocalvolumeconfig]
{
    // Comment following lines when this is not the expected behaviour.
    d1.filepathdir = d2.filepathdir // same filepathdir
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmconfig'
//
// ======================================================================

//
// Equivalence predicate between two Vmconfig atoms.
//
pred isoVmconfig[v1, v2: Vmconfig]
{
    // Comment following lines when this is not the expected behaviour.
    v1.vmFileFolder = v2.vmFileFolder // same vmFileFolder
    v1.changeVersion = v2.changeVersion // same changeVersion
    v1.memoryReservationLockedToMax = v2.memoryReservationLockedToMax // same memoryReservationLockedToMax
    v1.memoryHotAddEnabled = v2.memoryHotAddEnabled // same memoryHotAddEnabled
    v1.hotPlugMemoryiIcrementSize = v2.hotPlugMemoryiIcrementSize // same hotPlugMemoryiIcrementSize
    v1.changeTrackingEnabled = v2.changeTrackingEnabled // same changeTrackingEnabled
    v1.initialMemoryReservation = v2.initialMemoryReservation // same initialMemoryReservation
    v1.managedByExtensionKey = v2.managedByExtensionKey // same managedByExtensionKey
    v1.managedByType = v2.managedByType // same managedByType
    v1.swapPlacement = v2.swapPlacement // same swapPlacement
    v1.version = v2.version // same version
    v1.locationId = v2.locationId // same locationId
    v1.lastModified = v2.lastModified // same lastModified
    v1.vAssertsEnabled = v2.vAssertsEnabled // same vAssertsEnabled
    v1.hotPlugMemoryLimit = v2.hotPlugMemoryLimit // same hotPlugMemoryLimit
    v1.initialSwapReservation = v2.initialSwapReservation // same initialSwapReservation
    v1.maxMKSConnections = v2.maxMKSConnections // same maxMKSConnections
    v1.virtualICH7mpresent = v2.virtualICH7mpresent // same virtualICH7mpresent
    v1.virtualSMCPresent = v2.virtualSMCPresent // same virtualSMCPresent
    v1.messageBusTunnelEnabled = v2.messageBusTunnelEnabled // same messageBusTunnelEnabled
    v1.netstedHVEnabled = v2.netstedHVEnabled // same netstedHVEnabled
    v1.swapStorageObjectId = v2.swapStorageObjectId // same swapStorageObjectId
    v1.vFlashCacheReservation = v2.vFlashCacheReservation // same vFlashCacheReservation
    v1.vmxConfigChecksum = v2.vmxConfigChecksum // same vmxConfigChecksum
    v1.vPMCEnabled = v2.vPMCEnabled // same vPMCEnabled
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networkpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Networkpolicy atoms.
//
pred isoNetworkpolicy[n1, n2: Networkpolicy]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicfailurecriteria'
//
// ======================================================================

//
// Equivalence predicate between two Nicfailurecriteria atoms.
//
pred isoNicfailurecriteria[n1, n2: Nicfailurecriteria]
{
    // Comment following lines when this is not the expected behaviour.
    n1.checkBeacon = n2.checkBeacon // same checkBeacon
    n1.checkDuplex = n2.checkDuplex // same checkDuplex
    n1.checkErrorPercent = n2.checkErrorPercent // same checkErrorPercent
    n1.checkSpeed = n2.checkSpeed // same checkSpeed
    n1.fullDuplex = n2.fullDuplex // same fullDuplex
    n1.percentage = n2.percentage // same percentage
    n1.speed = n2.speed // same speed
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicorderpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Nicorderpolicy atoms.
//
pred isoNicorderpolicy[n1, n2: Nicorderpolicy]
{
    // Comment following lines when this is not the expected behaviour.
    n1.activeNic = n2.activeNic // same activeNic
    n1.standbyNic = n2.standbyNic // same standbyNic
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#nicteamingpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Nicteamingpolicy atoms.
//
pred isoNicteamingpolicy[n1, n2: Nicteamingpolicy]
{
    // Comment following lines when this is not the expected behaviour.
    n1.policy = n2.policy // same policy
    n1.reversePolicy = n2.reversePolicy // same reversePolicy
    n1.notifySwitches = n2.notifySwitches // same notifySwitches
    n1.rollingOrder = n2.rollingOrder // same rollingOrder
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#offloadpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Offloadpolicy atoms.
//
pred isoOffloadpolicy[o1, o2: Offloadpolicy]
{
    // Comment following lines when this is not the expected behaviour.
    o1.csumOffload = o2.csumOffload // same csumOffload
    o1.tcpSegmentation = o2.tcpSegmentation // same tcpSegmentation
    o1.zeroCopyXmit = o2.zeroCopyXmit // same zeroCopyXmit
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#networksecuritypolicy'
//
// ======================================================================

//
// Equivalence predicate between two Networksecuritypolicy atoms.
//
pred isoNetworksecuritypolicy[n1, n2: Networksecuritypolicy]
{
    // Comment following lines when this is not the expected behaviour.
    n1.allowPromiscuous = n2.allowPromiscuous // same allowPromiscuous
    n1.forgedTransmits = n2.forgedTransmits // same forgedTransmits
    n1.macChanges = n2.macChanges // same macChanges
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#trafficshapingpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Trafficshapingpolicy atoms.
//
pred isoTrafficshapingpolicy[t1, t2: Trafficshapingpolicy]
{
    // Comment following lines when this is not the expected behaviour.
    t1.averageBandwidth = t2.averageBandwidth // same averageBandwidth
    t1.burstSize = t2.burstSize // same burstSize
    t1.enabled = t2.enabled // same enabled
    t1.peakBandwidth = t2.peakBandwidth // same peakBandwidth
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#portgroupports'
//
// ======================================================================

//
// Equivalence predicate between two Portgroupports atoms.
//
pred isoPortgroupports[p1, p2: Portgroupports]
{
    // Comment following lines when this is not the expected behaviour.
    p1.portkeys = p2.portkeys // same portkeys
    p1.portmacs = p2.portmacs // same portmacs
    p1.connecteeType = p2.connecteeType // same connecteeType
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#micro'
//
// ======================================================================

//
// Equivalence predicate between two Micro atoms.
//
pred isoMicro[m1, m2: Micro]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchautobridge'
//
// ======================================================================

//
// Equivalence predicate between two Vswitchautobridge atoms.
//
pred isoVswitchautobridge[v1, v2: Vswitchautobridge]
{
    // Comment following lines when this is not the expected behaviour.
    v1.excludeNicDeviceKeys = v2.excludeNicDeviceKeys // same excludeNicDeviceKeys
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchsimplebridge'
//
// ======================================================================

//
// Equivalence predicate between two Vswitchsimplebridge atoms.
//
pred isoVswitchsimplebridge[v1, v2: Vswitchsimplebridge]
{
    // Comment following lines when this is not the expected behaviour.
    v1.nicDeviceKey = v2.nicDeviceKey // same nicDeviceKey
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vswitchbondbridge'
//
// ======================================================================

//
// Equivalence predicate between two Vswitchbondbridge atoms.
//
pred isoVswitchbondbridge[v1, v2: Vswitchbondbridge]
{
    // Comment following lines when this is not the expected behaviour.
    v1.nicDeviceKeys = v2.nicDeviceKeys // same nicDeviceKeys
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostdnsconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostdnsconfig atoms.
//
pred isoHostdnsconfig[h1, h2: Hostdnsconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.dnsAddress = h2.dnsAddress // same dnsAddress
    h1.dnsDhcp = h2.dnsDhcp // same dnsDhcp
    h1.dnsDomainName = h2.dnsDomainName // same dnsDomainName
    h1.dnsHostname = h2.dnsHostname // same dnsHostname
    h1.searchDomain = h2.searchDomain // same searchDomain
    h1.virtualNicDevice = h2.virtualNicDevice // same virtualNicDevice
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostnetworkconfig atoms.
//
pred isoHostnetworkconfig[h1, h2: Hostnetworkconfig]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostiprouteconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostiprouteconfig atoms.
//
pred isoHostiprouteconfig[h1, h2: Hostiprouteconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.defaultGateway = h2.defaultGateway // same defaultGateway
    h1.gatewayDevice = h2.gatewayDevice // same gatewayDevice
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostconsoleiprouteconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostconsoleiprouteconfig atoms.
//
pred isoHostconsoleiprouteconfig[h1, h2: Hostconsoleiprouteconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.consoleDefaultGateway = h2.consoleDefaultGateway // same consoleDefaultGateway
    h1.consoleGatewayDevice = h2.consoleGatewayDevice // same consoleGatewayDevice
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnatservicenameconfig'
//
// ======================================================================

//
// Equivalence predicate between two Hostnatservicenameconfig atoms.
//
pred isoHostnatservicenameconfig[h1, h2: Hostnatservicenameconfig]
{
    // Comment following lines when this is not the expected behaviour.
    h1.dnsAutoDetect = h2.dnsAutoDetect // same dnsAutoDetect
    h1.dnsNameServer = h2.dnsNameServer // same dnsNameServer
    h1.dnsPolicy = h2.dnsPolicy // same dnsPolicy
    h1.dnsRetries = h2.dnsRetries // same dnsRetries
    h1.dnsTimeOut = h2.dnsTimeOut // same dnsTimeOut
    h1.nbdsTimeOut = h2.nbdsTimeOut // same nbdsTimeOut
    h1.nbnsRetries = h2.nbnsRetries // same nbnsRetries
    h1.nbnsTimeOut = h2.nbnsTimeOut // same nbnsTimeOut
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetoffloadcapabilities'
//
// ======================================================================

//
// Equivalence predicate between two Hostnetoffloadcapabilities atoms.
//
pred isoHostnetoffloadcapabilities[h1, h2: Hostnetoffloadcapabilities]
{
    // Comment following lines when this is not the expected behaviour.
    h1.csumOffload = h2.csumOffload // same csumOffload
    h1.tcpSegmentation = h2.tcpSegmentation // same tcpSegmentation
    h1.zeroCopyXmit = h2.zeroCopyXmit // same zeroCopyXmit
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#validlinkspecification'
//
// ======================================================================

//
// Equivalence predicate between two Validlinkspecification atoms.
//
pred isoValidlinkspecification[v1, v2: Validlinkspecification]
{
    // Comment following lines when this is not the expected behaviour.
    v1.validLinkSpeedMB = v2.validLinkSpeedMB // same validLinkSpeedMB
    v1.validLinkDuplex = v2.validLinkDuplex // same validLinkDuplex
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#currentlinkstate'
//
// ======================================================================

//
// Equivalence predicate between two Currentlinkstate atoms.
//
pred isoCurrentlinkstate[c1, c2: Currentlinkstate]
{
    // Comment following lines when this is not the expected behaviour.
    c1.currentLinkDuplex = c2.currentLinkDuplex // same currentLinkDuplex
    c1.currentLinkSpeedMB = c2.currentLinkSpeedMB // same currentLinkSpeedMB
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#physicallinkconfig'
//
// ======================================================================

//
// Equivalence predicate between two Physicallinkconfig atoms.
//
pred isoPhysicallinkconfig[p1, p2: Physicallinkconfig]
{
    // Comment following lines when this is not the expected behaviour.
    p1.linkSpeedMB = p2.linkSpeedMB // same linkSpeedMB
    p1.linkDuplex = p2.linkDuplex // same linkDuplex
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#vmforkconfig'
//
// ======================================================================

//
// Equivalence predicate between two Vmforkconfig atoms.
//
pred isoVmforkconfig[v1, v2: Vmforkconfig]
{
    // Comment following lines when this is not the expected behaviour.
    v1.childForkGroupId = v2.childForkGroupId // same childForkGroupId
    v1.childType = v2.childType // same childType
    v1.parentEnabled = v2.parentEnabled // same parentEnabled
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#faulttoleranceconfig'
//
// ======================================================================

//
// Equivalence predicate between two Faulttoleranceconfig atoms.
//
pred isoFaulttoleranceconfig[f1, f2: Faulttoleranceconfig]
{
    // Comment following lines when this is not the expected behaviour.
    f1.faultToleranceConfigPaths = f2.faultToleranceConfigPaths // same faultToleranceConfigPaths
    f1.instanceUuids = f2.instanceUuids // same instanceUuids
    f1.orphaned = f2.orphaned // same orphaned
    f1.role = f2.role // same role
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#latencysensitivity'
//
// ======================================================================

//
// Equivalence predicate between two Latencysensitivity atoms.
//
pred isoLatencysensitivity[l1, l2: Latencysensitivity]
{
    // Comment following lines when this is not the expected behaviour.
    l1.latencySensitivityLevel = l2.latencySensitivityLevel // same latencySensitivityLevel
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverhost'
//
// ======================================================================

//
// Equivalence predicate between two Failoverhost atoms.
//
pred isoFailoverhost[f1, f2: Failoverhost]
{
    // Comment following lines when this is not the expected behaviour.
    f1.failoverhostnames = f2.failoverhostnames // same failoverhostnames
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasadmissionctrlpolicy'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdasadmissionctrlpolicy atoms.
//
pred isoClusterdasadmissionctrlpolicy[c1, c2: Clusterdasadmissionctrlpolicy]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverlevel'
//
// ======================================================================

//
// Equivalence predicate between two Failoverlevel atoms.
//
pred isoFailoverlevel[f1, f2: Failoverlevel]
{
    // Comment following lines when this is not the expected behaviour.
    f1.failoverLevel = f2.failoverLevel // same failoverLevel
    f1.fixedSlotSizeCPU = f2.fixedSlotSizeCPU // same fixedSlotSizeCPU
    f1.fixedSlotSizeMemory = f2.fixedSlotSizeMemory // same fixedSlotSizeMemory
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#failoverresources'
//
// ======================================================================

//
// Equivalence predicate between two Failoverresources atoms.
//
pred isoFailoverresources[f1, f2: Failoverresources]
{
    // Comment following lines when this is not the expected behaviour.
    f1.cpuFailoverResourcesPercent = f2.cpuFailoverResourcesPercent // same cpuFailoverResourcesPercent
    f1.memoryFailoverResourcesPercent = f2.memoryFailoverResourcesPercent // same memoryFailoverResourcesPercent
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#clusterdasvmtoolsmonitoringsettings'
//
// ======================================================================

//
// Equivalence predicate between two Clusterdasvmtoolsmonitoringsettings atoms.
//
pred isoClusterdasvmtoolsmonitoringsettings[c1, c2: Clusterdasvmtoolsmonitoringsettings]
{
    // Comment following lines when this is not the expected behaviour.
    c1.clusterSettings = c2.clusterSettings // same clusterSettings
    c1.failureInterval = c2.failureInterval // same failureInterval
    c1.maxFailures = c2.maxFailures // same maxFailures
    c1.maxFailureWindow = c2.maxFailureWindow // same maxFailureWindow
    c1.minUpTime = c2.minUpTime // same minUpTime
    c1.defaultVmMonitoring = c2.defaultVmMonitoring // same defaultVmMonitoring
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#dasvmtoolsmonitoringsettings'
//
// ======================================================================

//
// Equivalence predicate between two Dasvmtoolsmonitoringsettings atoms.
//
pred isoDasvmtoolsmonitoringsettings[d1, d2: Dasvmtoolsmonitoringsettings]
{
    // Comment following lines when this is not the expected behaviour.
    d1.clusterSettings = d2.clusterSettings // same clusterSettings
    d1.failureInterval = d2.failureInterval // same failureInterval
    d1.maxFailures = d2.maxFailures // same maxFailures
    d1.maxFailureWindow = d2.maxFailureWindow // same maxFailureWindow
    d1.minUpTime = d2.minUpTime // same minUpTime
    d1.defaultVmMonitoring = d2.defaultVmMonitoring // same defaultVmMonitoring
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastoreconfig'
//
// ======================================================================

//
// Equivalence predicate between two Datastoreconfig atoms.
//
pred isoDatastoreconfig[d1, d2: Datastoreconfig]
{
    // Comment following lines when this is not the expected behaviour.
    d1.containerId = d2.containerId // same containerId
    d1.maxFileSize = d2.maxFileSize // same maxFileSize
    d1.maxMemoryFileSize = d2.maxMemoryFileSize // same maxMemoryFileSize
    d1.maxVirtualDiskCapacity = d2.maxVirtualDiskCapacity // same maxVirtualDiskCapacity
    d1.timestamp = d2.timestamp // same timestamp
    d1.datastoreUrl = d2.datastoreUrl // same datastoreUrl
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#datastorehostvvolvolumeconfig'
//
// ======================================================================

//
// Equivalence predicate between two Datastorehostvvolvolumeconfig atoms.
//
pred isoDatastorehostvvolvolumeconfig[d1, d2: Datastorehostvvolvolumeconfig]
{
    // Comment following lines when this is not the expected behaviour.
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#virtualdiskgeometry'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdiskgeometry atoms.
//
pred isoVirtualdiskgeometry[v1, v2: Virtualdiskgeometry]
{
    // Comment following lines when this is not the expected behaviour.
    v1.cylinder = v2.cylinder // same cylinder
    v1.head = v2.head // same head
    v1.sector = v2.sector // same sector
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#virtualdeviceconnectinfo'
//
// ======================================================================

//
// Equivalence predicate between two Virtualdeviceconnectinfo atoms.
//
pred isoVirtualdeviceconnectinfo[v1, v2: Virtualdeviceconnectinfo]
{
    // Comment following lines when this is not the expected behaviour.
    v1.allowGuestControl = v2.allowGuestControl // same allowGuestControl
    v1.connected = v2.connected // same connected
    v1.startConnected = v2.startConnected // same startConnected
    v1.connectionStatus = v2.connectionStatus // same connectionStatus
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hoststoragecapability'
//
// ======================================================================

//
// Equivalence predicate between two Hoststoragecapability atoms.
//
pred isoHoststoragecapability[h1, h2: Hoststoragecapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.datastorePrincipalSupported = h2.datastorePrincipalSupported // same datastorePrincipalSupported
    h1.localSwapDatastoreSupported = h2.localSwapDatastoreSupported // same localSwapDatastoreSupported
    h1.nfsSupported = h2.nfsSupported // same nfsSupported
    h1.sanSupported = h2.sanSupported // same sanSupported
    h1.deltaDiskBackingsSupported = h2.deltaDiskBackingsSupported // same deltaDiskBackingsSupported
    h1.eightPlusHostVmfsSharedAccessSupported = h2.eightPlusHostVmfsSharedAccessSupported // same eightPlusHostVmfsSharedAccessSupported
    h1.markAsSsdSupported = h2.markAsSsdSupported // same markAsSsdSupported
    h1.markAsLocalSupported = h2.markAsLocalSupported // same markAsLocalSupported
    h1.nfs41Supported = h2.nfs41Supported // same nfs41Supported
    h1.storageIORMSupported = h2.storageIORMSupported // same storageIORMSupported
    h1.storagePolicySupported = h2.storagePolicySupported // same storagePolicySupported
    h1.supportedVmfsMajorVersion = h2.supportedVmfsMajorVersion // same supportedVmfsMajorVersion
    h1.turnDiskLocatorLedSupported = h2.turnDiskLocatorLedSupported // same turnDiskLocatorLedSupported
    h1.virtualVolumeDatastoreSupported = h2.virtualVolumeDatastoreSupported // same virtualVolumeDatastoreSupported
    h1.vmfsDatastoreMountCapable = h2.vmfsDatastoreMountCapable // same vmfsDatastoreMountCapable
    h1.vsanSupported = h2.vsanSupported // same vsanSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostnetworkcapabilityextent'
//
// ======================================================================

//
// Equivalence predicate between two Hostnetworkcapabilityextent atoms.
//
pred isoHostnetworkcapabilityextent[h1, h2: Hostnetworkcapabilityextent]
{
    // Comment following lines when this is not the expected behaviour.
    h1.nicTeamingSupported = h2.nicTeamingSupported // same nicTeamingSupported
    h1.vlanTaggingSupported = h2.vlanTaggingSupported // same vlanTaggingSupported
    h1.firewallIpRulesSupported = h2.firewallIpRulesSupported // same firewallIpRulesSupported
    h1.hbrNicSelectionSupported = h2.hbrNicSelectionSupported // same hbrNicSelectionSupported
    h1.multipleNetworkStackInstanceSupported = h2.multipleNetworkStackInstanceSupported // same multipleNetworkStackInstanceSupported
    h1.provisioningNicSelectionSupported = h2.provisioningNicSelectionSupported // same provisioningNicSelectionSupported
    h1.vmDirectPathGen2UnsupportedReason = h2.vmDirectPathGen2UnsupportedReason // same vmDirectPathGen2UnsupportedReason
    h1.vmDirectPathGen2Supported = h2.vmDirectPathGen2Supported // same vmDirectPathGen2Supported
    h1.vmDirectPathGen2UnsupportedReasonExtended = h2.vmDirectPathGen2UnsupportedReasonExtended // same vmDirectPathGen2UnsupportedReasonExtended
    h1.vrNfcNicSelectionSupported = h2.vrNfcNicSelectionSupported // same vrNfcNicSelectionSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostvmotioncapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostvmotioncapability atoms.
//
pred isoHostvmotioncapability[h1, h2: Hostvmotioncapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.unsharedSwapVMotionSupported = h2.unsharedSwapVMotionSupported // same unsharedSwapVMotionSupported
    h1.vmotionSupported = h2.vmotionSupported // same vmotionSupported
    h1.maxNumDisksSVMotion = h2.maxNumDisksSVMotion // same maxNumDisksSVMotion
    h1.storageVMotionSupported = h2.storageVMotionSupported // same storageVMotionSupported
    h1.vmotionWithStorageVMotionSupported = h2.vmotionWithStorageVMotionSupported // same vmotionWithStorageVMotionSupported
    h1.vmotionAcrossNetworkSupported = h2.vmotionAcrossNetworkSupported // same vmotionAcrossNetworkSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsnapshotcapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostsnapshotcapability atoms.
//
pred isoHostsnapshotcapability[h1, h2: Hostsnapshotcapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.backgroundSnapshotsSupported = h2.backgroundSnapshotsSupported // same backgroundSnapshotsSupported
    h1.restrictedSnapshotRelocateSupported = h2.restrictedSnapshotRelocateSupported // same restrictedSnapshotRelocateSupported
    h1.cloneFromSnapshotSupported = h2.cloneFromSnapshotSupported // same cloneFromSnapshotSupported
    h1.snapshotRelayoutSupported = h2.snapshotRelayoutSupported // same snapshotRelayoutSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostcapabilityhardware'
//
// ======================================================================

//
// Equivalence predicate between two Hostcapabilityhardware atoms.
//
pred isoHostcapabilityhardware[h1, h2: Hostcapabilityhardware]
{
    // Comment following lines when this is not the expected behaviour.
    h1.cpuMemoryResourceConfigurationSupported = h2.cpuMemoryResourceConfigurationSupported // same cpuMemoryResourceConfigurationSupported
    h1.iscsiSupported = h2.iscsiSupported // same iscsiSupported
    h1.maintenanceModeSupported = h2.maintenanceModeSupported // same maintenanceModeSupported
    h1.preAssignedPCIUnitNumbersSupported = h2.preAssignedPCIUnitNumbersSupported // same preAssignedPCIUnitNumbersSupported
    h1.nestedHVSupported = h2.nestedHVSupported // same nestedHVSupported
    h1.scheduledHardwareUpgradeSupported = h2.scheduledHardwareUpgradeSupported // same scheduledHardwareUpgradeSupported
    h1.smartCardAuthenticationSupported = h2.smartCardAuthenticationSupported // same smartCardAuthenticationSupported
    h1.tpmSupported = h2.tpmSupported // same tpmSupported
    h1.vFlashSupported = h2.vFlashSupported // same vFlashSupported
    h1.vStorageCapable = h2.vStorageCapable // same vStorageCapable
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostsystemcapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostsystemcapability atoms.
//
pred isoHostsystemcapability[h1, h2: Hostsystemcapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.highGuestMemSupported = h2.highGuestMemSupported // same highGuestMemSupported
    h1.rebootSupported = h2.rebootSupported // same rebootSupported
    h1.scaledScreenshotSupported = h2.scaledScreenshotSupported // same scaledScreenshotSupported
    h1.shutdownSupported = h2.shutdownSupported // same shutdownSupported
    h1.screenshotSupported = h2.screenshotSupported // same screenshotSupported
    h1.standbySupported = h2.standbySupported // same standbySupported
    h1.accel3dSupported = h2.accel3dSupported // same accel3dSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostvmcapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostvmcapability atoms.
//
pred isoHostvmcapability[h1, h2: Hostvmcapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.maxRunningVMs = h2.maxRunningVMs // same maxRunningVMs
    h1.maxSupportedVcpus = h2.maxSupportedVcpus // same maxSupportedVcpus
    h1.maxSupportedVMs = h2.maxSupportedVMs // same maxSupportedVMs
    h1.perVmSwapFiles = h2.perVmSwapFiles // same perVmSwapFiles
    h1.suspendedRelocateSupported = h2.suspendedRelocateSupported // same suspendedRelocateSupported
    h1.interVMCommunicationThroughVMCISupported = h2.interVMCommunicationThroughVMCISupported // same interVMCommunicationThroughVMCISupported
    h1.latencySensitivitySupported = h2.latencySensitivitySupported // same latencySensitivitySupported
    h1.maxHostRunningVms = h2.maxHostRunningVms // same maxHostRunningVms
    h1.maxHostSupportedVcpus = h2.maxHostSupportedVcpus // same maxHostSupportedVcpus
    h1.maxRegisteredVMs = h2.maxRegisteredVMs // same maxRegisteredVMs
    h1.maxVcpusPerFtVm = h2.maxVcpusPerFtVm // same maxVcpusPerFtVm
    h1.perVMNetworkTrafficShapingSupported = h2.perVMNetworkTrafficShapingSupported // same perVMNetworkTrafficShapingSupported
    h1.reliableMemoryAware = h2.reliableMemoryAware // same reliableMemoryAware
    h1.virtualExecUsageSupported = h2.virtualExecUsageSupported // same virtualExecUsageSupported
    h1.vPMCSupported = h2.vPMCSupported // same vPMCSupported
}


// ======================================================================
//
// OCCI mixin 'http://occiware.org/occi/vmware#hostothercapability'
//
// ======================================================================

//
// Equivalence predicate between two Hostothercapability atoms.
//
pred isoHostothercapability[h1, h2: Hostothercapability]
{
    // Comment following lines when this is not the expected behaviour.
    h1.loginBySSLThumbprintSupported = h2.loginBySSLThumbprintSupported // same loginBySSLThumbprintSupported
    h1.ipmiSupported = h2.ipmiSupported // same ipmiSupported
    h1.featureCapabilitiesSupported = h2.featureCapabilitiesSupported // same featureCapabilitiesSupported
    h1.recursiveResourcePoolsSupported = h2.recursiveResourcePoolsSupported // same recursiveResourcePoolsSupported
    h1.hostAccessManagerSupported = h2.hostAccessManagerSupported // same hostAccessManagerSupported
    h1.servicePackageInfoSupported = h2.servicePackageInfoSupported // same servicePackageInfoSupported
    h1.messageBusProxySupported = h2.messageBusProxySupported // same messageBusProxySupported
    h1.smpFtCompatibilityIssues = h2.smpFtCompatibilityIssues // same smpFtCompatibilityIssues
    h1.smpFtSupported = h2.smpFtSupported // same smpFtSupported
}


// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

