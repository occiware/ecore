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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage
 * @generated
 */
public class VmwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareSwitch() {
		if (modelPackage == null) {
			modelPackage = VmwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VmwarePackage.DATASTORE: {
				Datastore datastore = (Datastore)theEObject;
				T result = caseDatastore(datastore);
				if (result == null) result = caseResource(datastore);
				if (result == null) result = caseEntity(datastore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = caseResource(cluster);
				if (result == null) result = caseEntity(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.DATACENTER: {
				Datacenter datacenter = (Datacenter)theEObject;
				T result = caseDatacenter(datacenter);
				if (result == null) result = caseResource(datacenter);
				if (result == null) result = caseEntity(datacenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTSYSTEM: {
				Hostsystem hostsystem = (Hostsystem)theEObject;
				T result = caseHostsystem(hostsystem);
				if (result == null) result = caseCompute(hostsystem);
				if (result == null) result = caseResource(hostsystem);
				if (result == null) result = caseEntity(hostsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VM: {
				Vm vm = (Vm)theEObject;
				T result = caseVm(vm);
				if (result == null) result = caseCompute(vm);
				if (result == null) result = caseResource(vm);
				if (result == null) result = caseEntity(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.FOLDERLINK: {
				Folderlink folderlink = (Folderlink)theEObject;
				T result = caseFolderlink(folderlink);
				if (result == null) result = caseLink(folderlink);
				if (result == null) result = caseEntity(folderlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.RESOURCEPOOLLINK: {
				Resourcepoollink resourcepoollink = (Resourcepoollink)theEObject;
				T result = caseResourcepoollink(resourcepoollink);
				if (result == null) result = caseLink(resourcepoollink);
				if (result == null) result = caseEntity(resourcepoollink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.CLUSTERLINK: {
				Clusterlink clusterlink = (Clusterlink)theEObject;
				T result = caseClusterlink(clusterlink);
				if (result == null) result = caseLink(clusterlink);
				if (result == null) result = caseEntity(clusterlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.RESOURCEPOOL: {
				Resourcepool resourcepool = (Resourcepool)theEObject;
				T result = caseResourcepool(resourcepool);
				if (result == null) result = caseResource(resourcepool);
				if (result == null) result = caseEntity(resourcepool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.DATACENTERLINK: {
				Datacenterlink datacenterlink = (Datacenterlink)theEObject;
				T result = caseDatacenterlink(datacenterlink);
				if (result == null) result = caseLink(datacenterlink);
				if (result == null) result = caseEntity(datacenterlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTSYSTEMLINK: {
				Hostsystemlink hostsystemlink = (Hostsystemlink)theEObject;
				T result = caseHostsystemlink(hostsystemlink);
				if (result == null) result = caseLink(hostsystemlink);
				if (result == null) result = caseEntity(hostsystemlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.DATASTORELINK: {
				Datastorelink datastorelink = (Datastorelink)theEObject;
				T result = caseDatastorelink(datastorelink);
				if (result == null) result = caseLink(datastorelink);
				if (result == null) result = caseEntity(datastorelink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALDISK: {
				Virtualdisk virtualdisk = (Virtualdisk)theEObject;
				T result = caseVirtualdisk(virtualdisk);
				if (result == null) result = caseStorage(virtualdisk);
				if (result == null) result = caseResource(virtualdisk);
				if (result == null) result = caseEntity(virtualdisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VSWITCH: {
				Vswitch vswitch = (Vswitch)theEObject;
				T result = caseVswitch(vswitch);
				if (result == null) result = caseNetwork(vswitch);
				if (result == null) result = caseResource(vswitch);
				if (result == null) result = caseEntity(vswitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.PORTGROUP: {
				Portgroup portgroup = (Portgroup)theEObject;
				T result = casePortgroup(portgroup);
				if (result == null) result = caseResource(portgroup);
				if (result == null) result = caseEntity(portgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALNETWORKADAPTER: {
				Virtualnetworkadapter virtualnetworkadapter = (Virtualnetworkadapter)theEObject;
				T result = caseVirtualnetworkadapter(virtualnetworkadapter);
				if (result == null) result = caseNetworkinterface(virtualnetworkadapter);
				if (result == null) result = caseLink(virtualnetworkadapter);
				if (result == null) result = caseEntity(virtualnetworkadapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALDISKNETWORK: {
				Virtualdisknetwork virtualdisknetwork = (Virtualdisknetwork)theEObject;
				T result = caseVirtualdisknetwork(virtualdisknetwork);
				if (result == null) result = caseStorage(virtualdisknetwork);
				if (result == null) result = caseResource(virtualdisknetwork);
				if (result == null) result = caseEntity(virtualdisknetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALDISKNETWORKLINK: {
				Virtualdisknetworklink virtualdisknetworklink = (Virtualdisknetworklink)theEObject;
				T result = caseVirtualdisknetworklink(virtualdisknetworklink);
				if (result == null) result = caseStoragelink(virtualdisknetworklink);
				if (result == null) result = caseLink(virtualdisknetworklink);
				if (result == null) result = caseEntity(virtualdisknetworklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTNETWORKADAPTER: {
				Hostnetworkadapter hostnetworkadapter = (Hostnetworkadapter)theEObject;
				T result = caseHostnetworkadapter(hostnetworkadapter);
				if (result == null) result = caseNetworkinterface(hostnetworkadapter);
				if (result == null) result = caseLink(hostnetworkadapter);
				if (result == null) result = caseEntity(hostnetworkadapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.DVSWITCH: {
				Dvswitch dvswitch = (Dvswitch)theEObject;
				T result = caseDvswitch(dvswitch);
				if (result == null) result = caseVswitch(dvswitch);
				if (result == null) result = caseNetwork(dvswitch);
				if (result == null) result = caseResource(dvswitch);
				if (result == null) result = caseEntity(dvswitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.SNAPSHOT: {
				Snapshot snapshot = (Snapshot)theEObject;
				T result = caseSnapshot(snapshot);
				if (result == null) result = caseResource(snapshot);
				if (result == null) result = caseEntity(snapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.SNAPSHOTLINK: {
				Snapshotlink snapshotlink = (Snapshotlink)theEObject;
				T result = caseSnapshotlink(snapshotlink);
				if (result == null) result = caseLink(snapshotlink);
				if (result == null) result = caseEntity(snapshotlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseResource(folder);
				if (result == null) result = caseEntity(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTFOLDER: {
				Hostfolder hostfolder = (Hostfolder)theEObject;
				T result = caseHostfolder(hostfolder);
				if (result == null) result = caseResource(hostfolder);
				if (result == null) result = caseEntity(hostfolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VCENTERCAPABILITY: {
				Vcentercapability vcentercapability = (Vcentercapability)theEObject;
				T result = caseVcentercapability(vcentercapability);
				if (result == null) result = caseResource(vcentercapability);
				if (result == null) result = caseEntity(vcentercapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTFIREWALLSYSTEM: {
				Hostfirewallsystem hostfirewallsystem = (Hostfirewallsystem)theEObject;
				T result = caseHostfirewallsystem(hostfirewallsystem);
				if (result == null) result = caseResource(hostfirewallsystem);
				if (result == null) result = caseEntity(hostfirewallsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTFIREWALLRULESET: {
				Hostfirewallruleset hostfirewallruleset = (Hostfirewallruleset)theEObject;
				T result = caseHostfirewallruleset(hostfirewallruleset);
				if (result == null) result = caseResource(hostfirewallruleset);
				if (result == null) result = caseEntity(hostfirewallruleset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTFIREWALLRULE: {
				Hostfirewallrule hostfirewallrule = (Hostfirewallrule)theEObject;
				T result = caseHostfirewallrule(hostfirewallrule);
				if (result == null) result = caseLink(hostfirewallrule);
				if (result == null) result = caseEntity(hostfirewallrule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTSTORAGE: {
				Hoststorage hoststorage = (Hoststorage)theEObject;
				T result = caseHoststorage(hoststorage);
				if (result == null) result = caseStorage(hoststorage);
				if (result == null) result = caseResource(hoststorage);
				if (result == null) result = caseEntity(hoststorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTSTORAGELINK: {
				Hoststoragelink hoststoragelink = (Hoststoragelink)theEObject;
				T result = caseHoststoragelink(hoststoragelink);
				if (result == null) result = caseStoragelink(hoststoragelink);
				if (result == null) result = caseLink(hoststoragelink);
				if (result == null) result = caseEntity(hoststoragelink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VMFOLDER: {
				Vmfolder vmfolder = (Vmfolder)theEObject;
				T result = caseVmfolder(vmfolder);
				if (result == null) result = caseResource(vmfolder);
				if (result == null) result = caseEntity(vmfolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.SERVICECONSOLENIC: {
				Serviceconsolenic serviceconsolenic = (Serviceconsolenic)theEObject;
				T result = caseServiceconsolenic(serviceconsolenic);
				if (result == null) result = caseVirtualnetworkadapter(serviceconsolenic);
				if (result == null) result = caseNetworkinterface(serviceconsolenic);
				if (result == null) result = caseLink(serviceconsolenic);
				if (result == null) result = caseEntity(serviceconsolenic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.PORTGROUPLINK: {
				Portgrouplink portgrouplink = (Portgrouplink)theEObject;
				T result = casePortgrouplink(portgrouplink);
				if (result == null) result = caseLink(portgrouplink);
				if (result == null) result = caseEntity(portgrouplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTNATRULE: {
				Hostnatrule hostnatrule = (Hostnatrule)theEObject;
				T result = caseHostnatrule(hostnatrule);
				if (result == null) result = caseResource(hostnatrule);
				if (result == null) result = caseEntity(hostnatrule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.HOSTNATPORTFORWARDLINK: {
				Hostnatportforwardlink hostnatportforwardlink = (Hostnatportforwardlink)theEObject;
				T result = caseHostnatportforwardlink(hostnatportforwardlink);
				if (result == null) result = caseLink(hostnatportforwardlink);
				if (result == null) result = caseEntity(hostnatportforwardlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.DISTRIBUTEDPORTGROUP: {
				Distributedportgroup distributedportgroup = (Distributedportgroup)theEObject;
				T result = caseDistributedportgroup(distributedportgroup);
				if (result == null) result = casePortgroup(distributedportgroup);
				if (result == null) result = caseResource(distributedportgroup);
				if (result == null) result = caseEntity(distributedportgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALCDROM: {
				Virtualcdrom virtualcdrom = (Virtualcdrom)theEObject;
				T result = caseVirtualcdrom(virtualcdrom);
				if (result == null) result = caseStorage(virtualcdrom);
				if (result == null) result = caseResource(virtualcdrom);
				if (result == null) result = caseEntity(virtualcdrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALFLOPPY: {
				Virtualfloppy virtualfloppy = (Virtualfloppy)theEObject;
				T result = caseVirtualfloppy(virtualfloppy);
				if (result == null) result = caseStorage(virtualfloppy);
				if (result == null) result = caseResource(virtualfloppy);
				if (result == null) result = caseEntity(virtualfloppy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VIRTUALDISKLINK: {
				Virtualdisklink virtualdisklink = (Virtualdisklink)theEObject;
				T result = caseVirtualdisklink(virtualdisklink);
				if (result == null) result = caseStoragelink(virtualdisklink);
				if (result == null) result = caseLink(virtualdisklink);
				if (result == null) result = caseEntity(virtualdisklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datastore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datastore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatastore(Datastore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatacenter(Datacenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostsystem(Hostsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVm(Vm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folderlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folderlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderlink(Folderlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourcepoollink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourcepoollink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcepoollink(Resourcepoollink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clusterlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clusterlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterlink(Clusterlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourcepool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourcepool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcepool(Resourcepool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datacenterlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datacenterlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatacenterlink(Datacenterlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostsystemlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostsystemlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostsystemlink(Hostsystemlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datastorelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datastorelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatastorelink(Datastorelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualdisk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualdisk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualdisk(Virtualdisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vswitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vswitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVswitch(Vswitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortgroup(Portgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualnetworkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualnetworkadapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualnetworkadapter(Virtualnetworkadapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualdisknetwork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualdisknetwork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualdisknetwork(Virtualdisknetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualdisknetworklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualdisknetworklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualdisknetworklink(Virtualdisknetworklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostnetworkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostnetworkadapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostnetworkadapter(Hostnetworkadapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dvswitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dvswitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDvswitch(Dvswitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshot(Snapshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshotlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshotlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshotlink(Snapshotlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostfolder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostfolder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostfolder(Hostfolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vcentercapability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vcentercapability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVcentercapability(Vcentercapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostfirewallsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostfirewallsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostfirewallsystem(Hostfirewallsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostfirewallruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostfirewallruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostfirewallruleset(Hostfirewallruleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostfirewallrule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostfirewallrule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostfirewallrule(Hostfirewallrule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoststorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoststorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoststorage(Hoststorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoststoragelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoststoragelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoststoragelink(Hoststoragelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmfolder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmfolder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmfolder(Vmfolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serviceconsolenic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serviceconsolenic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceconsolenic(Serviceconsolenic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portgrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portgrouplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortgrouplink(Portgrouplink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostnatrule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostnatrule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostnatrule(Hostnatrule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hostnatportforwardlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hostnatportforwardlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostnatportforwardlink(Hostnatportforwardlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distributedportgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distributedportgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributedportgroup(Distributedportgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualcdrom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualcdrom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualcdrom(Virtualcdrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualfloppy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualfloppy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualfloppy(Virtualfloppy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtualdisklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtualdisklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualdisklink(Virtualdisklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkinterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkinterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkinterface(Networkinterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storagelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storagelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragelink(Storagelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VmwareSwitch
