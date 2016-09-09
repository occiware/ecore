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
package org.occiware.clouddesigner.occi.vmware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.Networkinterface;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.occiware.clouddesigner.occi.infrastructure.Storagelink;
import org.occiware.clouddesigner.occi.vmware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage
 * @generated
 */
public class VmwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VmwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmwareSwitch<Adapter> modelSwitch =
		new VmwareSwitch<Adapter>() {
			@Override
			public Adapter caseDatastore(Datastore object) {
				return createDatastoreAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseDatacenter(Datacenter object) {
				return createDatacenterAdapter();
			}
			@Override
			public Adapter caseHostsystem(Hostsystem object) {
				return createHostsystemAdapter();
			}
			@Override
			public Adapter caseVm(Vm object) {
				return createVmAdapter();
			}
			@Override
			public Adapter caseFolderlink(Folderlink object) {
				return createFolderlinkAdapter();
			}
			@Override
			public Adapter caseResourcepoollink(Resourcepoollink object) {
				return createResourcepoollinkAdapter();
			}
			@Override
			public Adapter caseClusterlink(Clusterlink object) {
				return createClusterlinkAdapter();
			}
			@Override
			public Adapter caseResourcepool(Resourcepool object) {
				return createResourcepoolAdapter();
			}
			@Override
			public Adapter caseDatacenterlink(Datacenterlink object) {
				return createDatacenterlinkAdapter();
			}
			@Override
			public Adapter caseHostsystemlink(Hostsystemlink object) {
				return createHostsystemlinkAdapter();
			}
			@Override
			public Adapter caseDatastorelink(Datastorelink object) {
				return createDatastorelinkAdapter();
			}
			@Override
			public Adapter caseVirtualdisk(Virtualdisk object) {
				return createVirtualdiskAdapter();
			}
			@Override
			public Adapter caseVswitch(Vswitch object) {
				return createVswitchAdapter();
			}
			@Override
			public Adapter casePortgroup(Portgroup object) {
				return createPortgroupAdapter();
			}
			@Override
			public Adapter caseVirtualnetworkadapter(Virtualnetworkadapter object) {
				return createVirtualnetworkadapterAdapter();
			}
			@Override
			public Adapter caseVirtualdisknetwork(Virtualdisknetwork object) {
				return createVirtualdisknetworkAdapter();
			}
			@Override
			public Adapter caseVirtualdisknetworklink(Virtualdisknetworklink object) {
				return createVirtualdisknetworklinkAdapter();
			}
			@Override
			public Adapter caseHostnetworkadapter(Hostnetworkadapter object) {
				return createHostnetworkadapterAdapter();
			}
			@Override
			public Adapter caseDvswitch(Dvswitch object) {
				return createDvswitchAdapter();
			}
			@Override
			public Adapter caseSnapshot(Snapshot object) {
				return createSnapshotAdapter();
			}
			@Override
			public Adapter caseSnapshotlink(Snapshotlink object) {
				return createSnapshotlinkAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseHostfolder(Hostfolder object) {
				return createHostfolderAdapter();
			}
			@Override
			public Adapter caseVcentercapability(Vcentercapability object) {
				return createVcentercapabilityAdapter();
			}
			@Override
			public Adapter caseHostfirewallsystem(Hostfirewallsystem object) {
				return createHostfirewallsystemAdapter();
			}
			@Override
			public Adapter caseHostfirewallruleset(Hostfirewallruleset object) {
				return createHostfirewallrulesetAdapter();
			}
			@Override
			public Adapter caseHostfirewallrule(Hostfirewallrule object) {
				return createHostfirewallruleAdapter();
			}
			@Override
			public Adapter caseHoststorage(Hoststorage object) {
				return createHoststorageAdapter();
			}
			@Override
			public Adapter caseHoststoragelink(Hoststoragelink object) {
				return createHoststoragelinkAdapter();
			}
			@Override
			public Adapter caseVmfolder(Vmfolder object) {
				return createVmfolderAdapter();
			}
			@Override
			public Adapter caseServiceconsolenic(Serviceconsolenic object) {
				return createServiceconsolenicAdapter();
			}
			@Override
			public Adapter casePortgrouplink(Portgrouplink object) {
				return createPortgrouplinkAdapter();
			}
			@Override
			public Adapter caseHostnatrule(Hostnatrule object) {
				return createHostnatruleAdapter();
			}
			@Override
			public Adapter caseHostnatportforwardlink(Hostnatportforwardlink object) {
				return createHostnatportforwardlinkAdapter();
			}
			@Override
			public Adapter caseDistributedportgroup(Distributedportgroup object) {
				return createDistributedportgroupAdapter();
			}
			@Override
			public Adapter caseVirtualcdrom(Virtualcdrom object) {
				return createVirtualcdromAdapter();
			}
			@Override
			public Adapter caseVirtualfloppy(Virtualfloppy object) {
				return createVirtualfloppyAdapter();
			}
			@Override
			public Adapter caseVirtualdisklink(Virtualdisklink object) {
				return createVirtualdisklinkAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCompute(Compute object) {
				return createComputeAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseNetworkinterface(Networkinterface object) {
				return createNetworkinterfaceAdapter();
			}
			@Override
			public Adapter caseStoragelink(Storagelink object) {
				return createStoragelinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Datastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastore
	 * @generated
	 */
	public Adapter createDatastoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenter
	 * @generated
	 */
	public Adapter createDatacenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem <em>Hostsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystem
	 * @generated
	 */
	public Adapter createHostsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Vm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Vm
	 * @generated
	 */
	public Adapter createVmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Folderlink <em>Folderlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Folderlink
	 * @generated
	 */
	public Adapter createFolderlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Resourcepoollink <em>Resourcepoollink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepoollink
	 * @generated
	 */
	public Adapter createResourcepoollinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Clusterlink <em>Clusterlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Clusterlink
	 * @generated
	 */
	public Adapter createClusterlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool <em>Resourcepool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Resourcepool
	 * @generated
	 */
	public Adapter createResourcepoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Datacenterlink <em>Datacenterlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Datacenterlink
	 * @generated
	 */
	public Adapter createDatacenterlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostsystemlink <em>Hostsystemlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostsystemlink
	 * @generated
	 */
	public Adapter createHostsystemlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Datastorelink <em>Datastorelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Datastorelink
	 * @generated
	 */
	public Adapter createDatastorelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisk <em>Virtualdisk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisk
	 * @generated
	 */
	public Adapter createVirtualdiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Vswitch <em>Vswitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Vswitch
	 * @generated
	 */
	public Adapter createVswitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Portgroup <em>Portgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgroup
	 * @generated
	 */
	public Adapter createPortgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter <em>Virtualnetworkadapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualnetworkadapter
	 * @generated
	 */
	public Adapter createVirtualnetworkadapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork <em>Virtualdisknetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisknetwork
	 * @generated
	 */
	public Adapter createVirtualdisknetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink <em>Virtualdisknetworklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisknetworklink
	 * @generated
	 */
	public Adapter createVirtualdisknetworklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter <em>Hostnetworkadapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter
	 * @generated
	 */
	public Adapter createHostnetworkadapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Dvswitch <em>Dvswitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Dvswitch
	 * @generated
	 */
	public Adapter createDvswitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Snapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Snapshot
	 * @generated
	 */
	public Adapter createSnapshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Snapshotlink <em>Snapshotlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Snapshotlink
	 * @generated
	 */
	public Adapter createSnapshotlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostfolder <em>Hostfolder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfolder
	 * @generated
	 */
	public Adapter createHostfolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Vcentercapability <em>Vcentercapability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Vcentercapability
	 * @generated
	 */
	public Adapter createVcentercapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem <em>Hostfirewallsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallsystem
	 * @generated
	 */
	public Adapter createHostfirewallsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset <em>Hostfirewallruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallruleset
	 * @generated
	 */
	public Adapter createHostfirewallrulesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostfirewallrule <em>Hostfirewallrule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostfirewallrule
	 * @generated
	 */
	public Adapter createHostfirewallruleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hoststorage <em>Hoststorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hoststorage
	 * @generated
	 */
	public Adapter createHoststorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hoststoragelink <em>Hoststoragelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hoststoragelink
	 * @generated
	 */
	public Adapter createHoststoragelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Vmfolder <em>Vmfolder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Vmfolder
	 * @generated
	 */
	public Adapter createVmfolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Serviceconsolenic <em>Serviceconsolenic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Serviceconsolenic
	 * @generated
	 */
	public Adapter createServiceconsolenicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Portgrouplink <em>Portgrouplink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Portgrouplink
	 * @generated
	 */
	public Adapter createPortgrouplinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostnatrule <em>Hostnatrule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatrule
	 * @generated
	 */
	public Adapter createHostnatruleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink <em>Hostnatportforwardlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Hostnatportforwardlink
	 * @generated
	 */
	public Adapter createHostnatportforwardlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Distributedportgroup <em>Distributedportgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Distributedportgroup
	 * @generated
	 */
	public Adapter createDistributedportgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualcdrom <em>Virtualcdrom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualcdrom
	 * @generated
	 */
	public Adapter createVirtualcdromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualfloppy <em>Virtualfloppy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualfloppy
	 * @generated
	 */
	public Adapter createVirtualfloppyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.vmware.Virtualdisklink <em>Virtualdisklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.vmware.Virtualdisklink
	 * @generated
	 */
	public Adapter createVirtualdisklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.infrastructure.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Compute
	 * @generated
	 */
	public Adapter createComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.infrastructure.Networkinterface <em>Networkinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Networkinterface
	 * @generated
	 */
	public Adapter createNetworkinterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink <em>Storagelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Storagelink
	 * @generated
	 */
	public Adapter createStoragelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VmwareAdapterFactory
