/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Fri Sep 09 14:22:40 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.vmware.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: vmware
 * - scheme: http://occiware.org/occi/vmware#
 */
public class ConnectorFactory extends org.occiware.clouddesigner.occi.vmware.impl.VmwareFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: datastore
	 * - title: Datastores are logical containers, analogous to file systems, that hide specifics of each storage device and provide a uniform model for storing virtual machine files. Datastores can also be used for storing ISO images, virtual machine templates, and floppy images.
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Datastore createDatastore() {
		return new DatastoreConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: cluster
	 * - title: Represents a cluster of HostSystem objects as a unified compute resource for virtual machines.
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Cluster createCluster() {
		return new ClusterConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: datacenter
	 * - title: The interface to the common container object for hosts and virtual machines. Every host and virtual machine must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters.
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Datacenter createDatacenter() {
		return new DatacenterConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostsystem
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostsystem createHostsystem() {
		return new HostsystemConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: vm
	 * - title: Virtual machine compute on a host system
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Vm createVm() {
		return new VmConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: folderlink
	 * - title: a link hierarchy folder between datacenter and cluster or between datacenter and virtual machines (vmFolder) or between datacenter and hostsystems
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Folderlink createFolderlink() {
		return new FolderlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: resourcepoollink
	 * - title: a link between cluster (or host) and virtual machine with resource pool definition, this link may link other resource pools between them to define child dependencies, it may be used too for resourcepoolquickstats informations
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Resourcepoollink createResourcepoollink() {
		return new ResourcepoollinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: clusterlink
	 * - title: Link between cluster and hostsystem
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Clusterlink createClusterlink() {
		return new ClusterlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: resourcepool
	 * - title: A resource pool linked between a compute host (or a cluster) and a virtual machine, usage attributes part are for runtime information only
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Resourcepool createResourcepool() {
		return new ResourcepoolConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: datacenterlink
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Datacenterlink createDatacenterlink() {
		return new DatacenterlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostsystemlink
	 * - title: a link between a hostsystem and a virtual machine
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostsystemlink createHostsystemlink() {
		return new HostsystemlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: datastorelink
	 * - title: a link between a datacenter and a datastore
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Datastorelink createDatastorelink() {
		return new DatastorelinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualdisk
	 * - title: A virtual disk
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualdisk createVirtualdisk() {
		return new VirtualdiskConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: vswitch
	 * - title: a virtual switch for linking virtual network adapter to a hostsystem network
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Vswitch createVswitch() {
		return new VswitchConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: portgroup
	 * - title: A port group aggregates multiple ports under a common configuration and provides a stable anchor point for virtual machines connecting to the labeled networks. It is identified by a label, which must be unique to the current host. The optional VLAN ID restricts port group traffic to a logical Ethernet segment within the network
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Portgroup createPortgroup() {
		return new PortgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualnetworkadapter
	 * - title: a network adapter for a virtual machine (virtual nic), describes a virtual network adapter representing an adapter that connects to a virtual switch. A VirtualNic differs from a PhysicalNic in that the latter corresponds to a physical device that is connected to the physical network. The former is a virtual device that is connected to a virtual switch. A VirtualNic accesses the external network through a virtual switch that is bridged through a PhysicalNic to a physical network
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter createVirtualnetworkadapter() {
		return new VirtualnetworkadapterConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualdisknetwork
	 * - title: a storage disk network for usage with a network vswitch and portgroup, vswitch and portgroup may be multiples
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork createVirtualdisknetwork() {
		return new VirtualdisknetworkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualdisknetworklink
	 * - title: a link between a virtualdisknetwork and a vswitch
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink createVirtualdisknetworklink() {
		return new VirtualdisknetworklinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostnetworkadapter
	 * - title: Physical Network adaptater on a hostsystem, describes the physical network adapter as seen by the primary operating system
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter createHostnetworkadapter() {
		return new HostnetworkadapterConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: dvswitch
	 * - title: Distributed virtual switch
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Dvswitch createDvswitch() {
		return new DvswitchConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: snapshot
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Snapshot createSnapshot() {
		return new SnapshotConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: snapshotlink
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Snapshotlink createSnapshotlink() {
		return new SnapshotlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: folder
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Folder createFolder() {
		return new FolderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostfolder
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostfolder createHostfolder() {
		return new HostfolderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: vcentercapability
	 * - title: Global data object to determine if the global service instance support or not a feature, see ServiceInstance
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Vcentercapability createVcentercapability() {
		return new VcentercapabilityConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostfirewallsystem
	 * - title: A host can have only have one firewall, this described a firewall for a host and a set of rules
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem createHostfirewallsystem() {
		return new HostfirewallsystemConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostfirewallruleset
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset createHostfirewallruleset() {
		return new HostfirewallrulesetConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostfirewallrule
	 * - title: A rule link between hostfirewallsystem and a hostfirewallruleset
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostfirewallrule createHostfirewallrule() {
		return new HostfirewallruleConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hoststorage
	 * - title: Represente a physical storage on a hostsystem, see HostStorageSystem, linked to a hostsystem via a hoststoragelink
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hoststorage createHoststorage() {
		return new HoststorageConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hoststoragelink
	 * - title: hoststorage as it is view by the host os
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hoststoragelink createHoststoragelink() {
		return new HoststoragelinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: vmfolder
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Vmfolder createVmfolder() {
		return new VmfolderConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: serviceconsolenic
	 * - title: Virtual network adapters configured for use by the Service Console
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Serviceconsolenic createServiceconsolenic() {
		return new ServiceconsolenicConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: portgrouplink
	 * - title: link between portgroup and vswitch
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Portgrouplink createPortgrouplink() {
		return new PortgrouplinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostnatrule
	 * - title: Ruleset for nat service linked to virtual switch via hostnatportforwardlink, this may be multiple for a vswitch
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostnatrule createHostnatrule() {
		return new HostnatruleConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: hostnatportforwardlink
	 * - title: Define the port forward to hostnatrule, it may be multiple links to a single hostnatrule, this define the port forwarding specifications to allow network connections to be initiated from outside the firewall. 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink createHostnatportforwardlink() {
		return new HostnatportforwardlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: distributedportgroup
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Distributedportgroup createDistributedportgroup() {
		return new DistributedportgroupConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualcdrom
	 * - title: A virtual cdrom disk
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualcdrom createVirtualcdrom() {
		return new VirtualcdromConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualfloppy
	 * - title: A virtual floppy disk
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualfloppy createVirtualfloppy() {
		return new VirtualfloppyConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/occi/vmware#
	 * - term: virtualdisklink
	 * - title: 
	 */
	@Override
	public org.occiware.clouddesigner.occi.vmware.Virtualdisklink createVirtualdisklink() {
		return new VirtualdisklinkConnector();
	}

}
