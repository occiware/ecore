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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Resource;

import org.occiware.clouddesigner.occi.docker.*;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage
 * @generated
 */
public class DockerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DockerPackage.eINSTANCE;
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
	protected DockerSwitch<Adapter> modelSwitch =
		new DockerSwitch<Adapter>() {
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNetworkLink(NetworkLink object) {
				return createNetworkLinkAdapter();
			}
			@Override
			public Adapter caseVolumesfrom(Volumesfrom object) {
				return createVolumesfromAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseMachine_Amazon_EC2(Machine_Amazon_EC2 object) {
				return createMachine_Amazon_EC2Adapter();
			}
			@Override
			public Adapter caseMachine_Digital_Ocean(Machine_Digital_Ocean object) {
				return createMachine_Digital_OceanAdapter();
			}
			@Override
			public Adapter caseMachine_Google_Compute_Engine(Machine_Google_Compute_Engine object) {
				return createMachine_Google_Compute_EngineAdapter();
			}
			@Override
			public Adapter caseMachine_IBM_SoftLayer(Machine_IBM_SoftLayer object) {
				return createMachine_IBM_SoftLayerAdapter();
			}
			@Override
			public Adapter caseMachine_Microsoft_Azure(Machine_Microsoft_Azure object) {
				return createMachine_Microsoft_AzureAdapter();
			}
			@Override
			public Adapter caseMachine_Microsoft_Hyper_V(Machine_Microsoft_Hyper_V object) {
				return createMachine_Microsoft_Hyper_VAdapter();
			}
			@Override
			public Adapter caseMachine_OpenStack(Machine_OpenStack object) {
				return createMachine_OpenStackAdapter();
			}
			@Override
			public Adapter caseMachine_Rackspace(Machine_Rackspace object) {
				return createMachine_RackspaceAdapter();
			}
			@Override
			public Adapter caseMachine_VirtualBox(Machine_VirtualBox object) {
				return createMachine_VirtualBoxAdapter();
			}
			@Override
			public Adapter caseMachine_VMware_Fusion(Machine_VMware_Fusion object) {
				return createMachine_VMware_FusionAdapter();
			}
			@Override
			public Adapter caseMachine_VMware_vCloud_Air(Machine_VMware_vCloud_Air object) {
				return createMachine_VMware_vCloud_AirAdapter();
			}
			@Override
			public Adapter caseMachine_VMware_vSphere(Machine_VMware_vSphere object) {
				return createMachine_VMware_vSphereAdapter();
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
			public Adapter caseOCCI_Link(org.occiware.clouddesigner.occi.Link object) {
				return createOCCI_LinkAdapter();
			}
			@Override
			public Adapter caseInfrastructure_Network(org.occiware.clouddesigner.occi.infrastructure.Network object) {
				return createInfrastructure_NetworkAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.NetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.NetworkLink
	 * @generated
	 */
	public Adapter createNetworkLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom <em>Volumesfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Volumesfrom
	 * @generated
	 */
	public Adapter createVolumesfromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2 <em>Machine Amazon EC2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2
	 * @generated
	 */
	public Adapter createMachine_Amazon_EC2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean <em>Machine Digital Ocean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean
	 * @generated
	 */
	public Adapter createMachine_Digital_OceanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine <em>Machine Google Compute Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine
	 * @generated
	 */
	public Adapter createMachine_Google_Compute_EngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer <em>Machine IBM Soft Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer
	 * @generated
	 */
	public Adapter createMachine_IBM_SoftLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure <em>Machine Microsoft Azure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure
	 * @generated
	 */
	public Adapter createMachine_Microsoft_AzureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V <em>Machine Microsoft Hyper V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V
	 * @generated
	 */
	public Adapter createMachine_Microsoft_Hyper_VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack <em>Machine Open Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_OpenStack
	 * @generated
	 */
	public Adapter createMachine_OpenStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_Rackspace <em>Machine Rackspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_Rackspace
	 * @generated
	 */
	public Adapter createMachine_RackspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox <em>Machine Virtual Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VirtualBox
	 * @generated
	 */
	public Adapter createMachine_VirtualBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion <em>Machine VMware Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion
	 * @generated
	 */
	public Adapter createMachine_VMware_FusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air <em>Machine VMware vCloud Air</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air
	 * @generated
	 */
	public Adapter createMachine_VMware_vCloud_AirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere <em>Machine VMware vSphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere
	 * @generated
	 */
	public Adapter createMachine_VMware_vSphereAdapter() {
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
	public Adapter createOCCI_LinkAdapter() {
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
	public Adapter createInfrastructure_NetworkAdapter() {
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

} //DockerAdapterFactory
