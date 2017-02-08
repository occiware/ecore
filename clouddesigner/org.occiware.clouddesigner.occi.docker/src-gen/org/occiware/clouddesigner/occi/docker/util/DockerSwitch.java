/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Resource;

import org.occiware.clouddesigner.occi.docker.*;

import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.Storage;

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
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage
 * @generated
 */
public class DockerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerSwitch() {
		if (modelPackage == null) {
			modelPackage = DockerPackage.eINSTANCE;
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
			case DockerPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseCompute(container);
				if (result == null) result = caseResource(container);
				if (result == null) result = caseEntity(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseOCCI_Link(link);
				if (result == null) result = caseEntity(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.NETWORK_LINK: {
				NetworkLink networkLink = (NetworkLink)theEObject;
				T result = caseNetworkLink(networkLink);
				if (result == null) result = caseLink(networkLink);
				if (result == null) result = caseOCCI_Link(networkLink);
				if (result == null) result = caseEntity(networkLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.VOLUMESFROM: {
				Volumesfrom volumesfrom = (Volumesfrom)theEObject;
				T result = caseVolumesfrom(volumesfrom);
				if (result == null) result = caseOCCI_Link(volumesfrom);
				if (result == null) result = caseEntity(volumesfrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseOCCI_Link(contains);
				if (result == null) result = caseEntity(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseCompute(machine);
				if (result == null) result = caseResource(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseStorage(volume);
				if (result == null) result = caseResource(volume);
				if (result == null) result = caseEntity(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseInfrastructure_Network(network);
				if (result == null) result = caseResource(network);
				if (result == null) result = caseEntity(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_GENERIC: {
				Machine_Generic machine_Generic = (Machine_Generic)theEObject;
				T result = caseMachine_Generic(machine_Generic);
				if (result == null) result = caseMachine(machine_Generic);
				if (result == null) result = caseCompute(machine_Generic);
				if (result == null) result = caseResource(machine_Generic);
				if (result == null) result = caseEntity(machine_Generic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_AMAZON_EC2: {
				Machine_Amazon_EC2 machine_Amazon_EC2 = (Machine_Amazon_EC2)theEObject;
				T result = caseMachine_Amazon_EC2(machine_Amazon_EC2);
				if (result == null) result = caseMachine(machine_Amazon_EC2);
				if (result == null) result = caseCompute(machine_Amazon_EC2);
				if (result == null) result = caseResource(machine_Amazon_EC2);
				if (result == null) result = caseEntity(machine_Amazon_EC2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_DIGITAL_OCEAN: {
				Machine_Digital_Ocean machine_Digital_Ocean = (Machine_Digital_Ocean)theEObject;
				T result = caseMachine_Digital_Ocean(machine_Digital_Ocean);
				if (result == null) result = caseMachine(machine_Digital_Ocean);
				if (result == null) result = caseCompute(machine_Digital_Ocean);
				if (result == null) result = caseResource(machine_Digital_Ocean);
				if (result == null) result = caseEntity(machine_Digital_Ocean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE: {
				Machine_Google_Compute_Engine machine_Google_Compute_Engine = (Machine_Google_Compute_Engine)theEObject;
				T result = caseMachine_Google_Compute_Engine(machine_Google_Compute_Engine);
				if (result == null) result = caseMachine(machine_Google_Compute_Engine);
				if (result == null) result = caseCompute(machine_Google_Compute_Engine);
				if (result == null) result = caseResource(machine_Google_Compute_Engine);
				if (result == null) result = caseEntity(machine_Google_Compute_Engine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_IBM_SOFT_LAYER: {
				Machine_IBM_SoftLayer machine_IBM_SoftLayer = (Machine_IBM_SoftLayer)theEObject;
				T result = caseMachine_IBM_SoftLayer(machine_IBM_SoftLayer);
				if (result == null) result = caseMachine(machine_IBM_SoftLayer);
				if (result == null) result = caseCompute(machine_IBM_SoftLayer);
				if (result == null) result = caseResource(machine_IBM_SoftLayer);
				if (result == null) result = caseEntity(machine_IBM_SoftLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_MICROSOFT_AZURE: {
				Machine_Microsoft_Azure machine_Microsoft_Azure = (Machine_Microsoft_Azure)theEObject;
				T result = caseMachine_Microsoft_Azure(machine_Microsoft_Azure);
				if (result == null) result = caseMachine(machine_Microsoft_Azure);
				if (result == null) result = caseCompute(machine_Microsoft_Azure);
				if (result == null) result = caseResource(machine_Microsoft_Azure);
				if (result == null) result = caseEntity(machine_Microsoft_Azure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V: {
				Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V = (Machine_Microsoft_Hyper_V)theEObject;
				T result = caseMachine_Microsoft_Hyper_V(machine_Microsoft_Hyper_V);
				if (result == null) result = caseMachine(machine_Microsoft_Hyper_V);
				if (result == null) result = caseCompute(machine_Microsoft_Hyper_V);
				if (result == null) result = caseResource(machine_Microsoft_Hyper_V);
				if (result == null) result = caseEntity(machine_Microsoft_Hyper_V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_OPEN_STACK: {
				Machine_OpenStack machine_OpenStack = (Machine_OpenStack)theEObject;
				T result = caseMachine_OpenStack(machine_OpenStack);
				if (result == null) result = caseMachine(machine_OpenStack);
				if (result == null) result = caseCompute(machine_OpenStack);
				if (result == null) result = caseResource(machine_OpenStack);
				if (result == null) result = caseEntity(machine_OpenStack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_RACKSPACE: {
				Machine_Rackspace machine_Rackspace = (Machine_Rackspace)theEObject;
				T result = caseMachine_Rackspace(machine_Rackspace);
				if (result == null) result = caseMachine(machine_Rackspace);
				if (result == null) result = caseCompute(machine_Rackspace);
				if (result == null) result = caseResource(machine_Rackspace);
				if (result == null) result = caseEntity(machine_Rackspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_VIRTUAL_BOX: {
				Machine_VirtualBox machine_VirtualBox = (Machine_VirtualBox)theEObject;
				T result = caseMachine_VirtualBox(machine_VirtualBox);
				if (result == null) result = caseMachine(machine_VirtualBox);
				if (result == null) result = caseCompute(machine_VirtualBox);
				if (result == null) result = caseResource(machine_VirtualBox);
				if (result == null) result = caseEntity(machine_VirtualBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_VMWARE_FUSION: {
				Machine_VMware_Fusion machine_VMware_Fusion = (Machine_VMware_Fusion)theEObject;
				T result = caseMachine_VMware_Fusion(machine_VMware_Fusion);
				if (result == null) result = caseMachine(machine_VMware_Fusion);
				if (result == null) result = caseCompute(machine_VMware_Fusion);
				if (result == null) result = caseResource(machine_VMware_Fusion);
				if (result == null) result = caseEntity(machine_VMware_Fusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR: {
				Machine_VMware_vCloud_Air machine_VMware_vCloud_Air = (Machine_VMware_vCloud_Air)theEObject;
				T result = caseMachine_VMware_vCloud_Air(machine_VMware_vCloud_Air);
				if (result == null) result = caseMachine(machine_VMware_vCloud_Air);
				if (result == null) result = caseCompute(machine_VMware_vCloud_Air);
				if (result == null) result = caseResource(machine_VMware_vCloud_Air);
				if (result == null) result = caseEntity(machine_VMware_vCloud_Air);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.MACHINE_VMWARE_VSPHERE: {
				Machine_VMware_vSphere machine_VMware_vSphere = (Machine_VMware_vSphere)theEObject;
				T result = caseMachine_VMware_vSphere(machine_VMware_vSphere);
				if (result == null) result = caseMachine(machine_VMware_vSphere);
				if (result == null) result = caseCompute(machine_VMware_vSphere);
				if (result == null) result = caseResource(machine_VMware_vSphere);
				if (result == null) result = caseEntity(machine_VMware_vSphere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLink(NetworkLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volumesfrom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumesfrom(Volumesfrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Machine Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Generic(Machine_Generic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Amazon EC2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Amazon EC2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Amazon_EC2(Machine_Amazon_EC2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Digital Ocean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Digital Ocean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Digital_Ocean(Machine_Digital_Ocean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Google Compute Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Google Compute Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Google_Compute_Engine(Machine_Google_Compute_Engine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine IBM Soft Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine IBM Soft Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_IBM_SoftLayer(Machine_IBM_SoftLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Microsoft Azure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Microsoft Azure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Microsoft_Azure(Machine_Microsoft_Azure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Microsoft Hyper V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Microsoft Hyper V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Microsoft_Hyper_V(Machine_Microsoft_Hyper_V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Open Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Open Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_OpenStack(Machine_OpenStack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Rackspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Rackspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Rackspace(Machine_Rackspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Virtual Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Virtual Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_VirtualBox(Machine_VirtualBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine VMware Fusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine VMware Fusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_VMware_Fusion(Machine_VMware_Fusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine VMware vCloud Air</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine VMware vCloud Air</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_VMware_vCloud_Air(Machine_VMware_vCloud_Air object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine VMware vSphere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine VMware vSphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_VMware_vSphere(Machine_VMware_vSphere object) {
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
	public T caseOCCI_Link(org.occiware.clouddesigner.occi.Link object) {
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
	public T caseInfrastructure_Network(org.occiware.clouddesigner.occi.infrastructure.Network object) {
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

} //DockerSwitch
