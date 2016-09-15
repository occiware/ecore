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
package org.occiware.clouddesigner.occi.vmware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage
 * @generated
 */
public interface VmwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmwareFactory eINSTANCE = org.occiware.clouddesigner.occi.vmware.impl.VmwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Datastore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datastore</em>'.
	 * @generated
	 */
	Datastore createDatastore();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenter</em>'.
	 * @generated
	 */
	Datacenter createDatacenter();

	/**
	 * Returns a new object of class '<em>Hostsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostsystem</em>'.
	 * @generated
	 */
	Hostsystem createHostsystem();

	/**
	 * Returns a new object of class '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm</em>'.
	 * @generated
	 */
	Vm createVm();

	/**
	 * Returns a new object of class '<em>Folderlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folderlink</em>'.
	 * @generated
	 */
	Folderlink createFolderlink();

	/**
	 * Returns a new object of class '<em>Resourcepoollink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourcepoollink</em>'.
	 * @generated
	 */
	Resourcepoollink createResourcepoollink();

	/**
	 * Returns a new object of class '<em>Clusterlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clusterlink</em>'.
	 * @generated
	 */
	Clusterlink createClusterlink();

	/**
	 * Returns a new object of class '<em>Resourcepool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourcepool</em>'.
	 * @generated
	 */
	Resourcepool createResourcepool();

	/**
	 * Returns a new object of class '<em>Datacenterlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenterlink</em>'.
	 * @generated
	 */
	Datacenterlink createDatacenterlink();

	/**
	 * Returns a new object of class '<em>Hostsystemlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostsystemlink</em>'.
	 * @generated
	 */
	Hostsystemlink createHostsystemlink();

	/**
	 * Returns a new object of class '<em>Datastorelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datastorelink</em>'.
	 * @generated
	 */
	Datastorelink createDatastorelink();

	/**
	 * Returns a new object of class '<em>Virtualdisk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualdisk</em>'.
	 * @generated
	 */
	Virtualdisk createVirtualdisk();

	/**
	 * Returns a new object of class '<em>Vswitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vswitch</em>'.
	 * @generated
	 */
	Vswitch createVswitch();

	/**
	 * Returns a new object of class '<em>Portgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portgroup</em>'.
	 * @generated
	 */
	Portgroup createPortgroup();

	/**
	 * Returns a new object of class '<em>Virtualnetworkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualnetworkadapter</em>'.
	 * @generated
	 */
	Virtualnetworkadapter createVirtualnetworkadapter();

	/**
	 * Returns a new object of class '<em>Virtualdisknetwork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualdisknetwork</em>'.
	 * @generated
	 */
	Virtualdisknetwork createVirtualdisknetwork();

	/**
	 * Returns a new object of class '<em>Virtualdisknetworklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualdisknetworklink</em>'.
	 * @generated
	 */
	Virtualdisknetworklink createVirtualdisknetworklink();

	/**
	 * Returns a new object of class '<em>Hostnetworkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostnetworkadapter</em>'.
	 * @generated
	 */
	Hostnetworkadapter createHostnetworkadapter();

	/**
	 * Returns a new object of class '<em>Dvswitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dvswitch</em>'.
	 * @generated
	 */
	Dvswitch createDvswitch();

	/**
	 * Returns a new object of class '<em>Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snapshot</em>'.
	 * @generated
	 */
	Snapshot createSnapshot();

	/**
	 * Returns a new object of class '<em>Snapshotlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snapshotlink</em>'.
	 * @generated
	 */
	Snapshotlink createSnapshotlink();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>Hostfolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostfolder</em>'.
	 * @generated
	 */
	Hostfolder createHostfolder();

	/**
	 * Returns a new object of class '<em>Vcentercapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vcentercapability</em>'.
	 * @generated
	 */
	Vcentercapability createVcentercapability();

	/**
	 * Returns a new object of class '<em>Hostfirewallsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostfirewallsystem</em>'.
	 * @generated
	 */
	Hostfirewallsystem createHostfirewallsystem();

	/**
	 * Returns a new object of class '<em>Hostfirewallruleset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostfirewallruleset</em>'.
	 * @generated
	 */
	Hostfirewallruleset createHostfirewallruleset();

	/**
	 * Returns a new object of class '<em>Hostfirewallrule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostfirewallrule</em>'.
	 * @generated
	 */
	Hostfirewallrule createHostfirewallrule();

	/**
	 * Returns a new object of class '<em>Hoststorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hoststorage</em>'.
	 * @generated
	 */
	Hoststorage createHoststorage();

	/**
	 * Returns a new object of class '<em>Hoststoragelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hoststoragelink</em>'.
	 * @generated
	 */
	Hoststoragelink createHoststoragelink();

	/**
	 * Returns a new object of class '<em>Vmfolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vmfolder</em>'.
	 * @generated
	 */
	Vmfolder createVmfolder();

	/**
	 * Returns a new object of class '<em>Serviceconsolenic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serviceconsolenic</em>'.
	 * @generated
	 */
	Serviceconsolenic createServiceconsolenic();

	/**
	 * Returns a new object of class '<em>Portgrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portgrouplink</em>'.
	 * @generated
	 */
	Portgrouplink createPortgrouplink();

	/**
	 * Returns a new object of class '<em>Hostnatrule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostnatrule</em>'.
	 * @generated
	 */
	Hostnatrule createHostnatrule();

	/**
	 * Returns a new object of class '<em>Hostnatportforwardlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostnatportforwardlink</em>'.
	 * @generated
	 */
	Hostnatportforwardlink createHostnatportforwardlink();

	/**
	 * Returns a new object of class '<em>Distributedportgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distributedportgroup</em>'.
	 * @generated
	 */
	Distributedportgroup createDistributedportgroup();

	/**
	 * Returns a new object of class '<em>Virtualcdrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualcdrom</em>'.
	 * @generated
	 */
	Virtualcdrom createVirtualcdrom();

	/**
	 * Returns a new object of class '<em>Virtualfloppy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualfloppy</em>'.
	 * @generated
	 */
	Virtualfloppy createVirtualfloppy();

	/**
	 * Returns a new object of class '<em>Virtualdisklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtualdisklink</em>'.
	 * @generated
	 */
	Virtualdisklink createVirtualdisklink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmwarePackage getVmwarePackage();

} //VmwareFactory
