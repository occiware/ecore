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
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.docker.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerFactoryImpl extends EFactoryImpl implements DockerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerFactory init() {
		try {
			DockerFactory theDockerFactory = (DockerFactory)EPackage.Registry.INSTANCE.getEFactory(DockerPackage.eNS_URI);
			if (theDockerFactory != null) {
				return theDockerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactoryImpl() {
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
			case DockerPackage.CONTAINER: return createContainer();
			case DockerPackage.LINK: return createLink();
			case DockerPackage.NETWORK_LINK: return createNetworkLink();
			case DockerPackage.VOLUMESFROM: return createVolumesfrom();
			case DockerPackage.CONTAINS: return createContains();
			case DockerPackage.MACHINE: return createMachine();
			case DockerPackage.VOLUME: return createVolume();
			case DockerPackage.NETWORK: return createNetwork();
			case DockerPackage.MACHINE_GENERIC: return createMachine_Generic();
			case DockerPackage.MACHINE_AMAZON_EC2: return createMachine_Amazon_EC2();
			case DockerPackage.MACHINE_DIGITAL_OCEAN: return createMachine_Digital_Ocean();
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE: return createMachine_Google_Compute_Engine();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER: return createMachine_IBM_SoftLayer();
			case DockerPackage.MACHINE_MICROSOFT_AZURE: return createMachine_Microsoft_Azure();
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V: return createMachine_Microsoft_Hyper_V();
			case DockerPackage.MACHINE_OPEN_STACK: return createMachine_OpenStack();
			case DockerPackage.MACHINE_RACKSPACE: return createMachine_Rackspace();
			case DockerPackage.MACHINE_VIRTUAL_BOX: return createMachine_VirtualBox();
			case DockerPackage.MACHINE_VMWARE_FUSION: return createMachine_VMware_Fusion();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR: return createMachine_VMware_vCloud_Air();
			case DockerPackage.MACHINE_VMWARE_VSPHERE: return createMachine_VMware_vSphere();
			case DockerPackage.MACHINE_EXOSCALE: return createMachine_Exoscale();
			case DockerPackage.MACHINE_GRID5000: return createMachine_Grid5000();
			case DockerPackage.CLUSTER: return createCluster();
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
			case DockerPackage.MODE:
				return createModeFromString(eDataType, initialValue);
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
			case DockerPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.occiware.clouddesigner.occi.docker.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLink createNetworkLink() {
		NetworkLinkImpl networkLink = new NetworkLinkImpl();
		return networkLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volumesfrom createVolumesfrom() {
		VolumesfromImpl volumesfrom = new VolumesfromImpl();
		return volumesfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Generic createMachine_Generic() {
		Machine_GenericImpl machine_Generic = new Machine_GenericImpl();
		return machine_Generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Amazon_EC2 createMachine_Amazon_EC2() {
		Machine_Amazon_EC2Impl machine_Amazon_EC2 = new Machine_Amazon_EC2Impl();
		return machine_Amazon_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Digital_Ocean createMachine_Digital_Ocean() {
		Machine_Digital_OceanImpl machine_Digital_Ocean = new Machine_Digital_OceanImpl();
		return machine_Digital_Ocean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Google_Compute_Engine createMachine_Google_Compute_Engine() {
		Machine_Google_Compute_EngineImpl machine_Google_Compute_Engine = new Machine_Google_Compute_EngineImpl();
		return machine_Google_Compute_Engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_IBM_SoftLayer createMachine_IBM_SoftLayer() {
		Machine_IBM_SoftLayerImpl machine_IBM_SoftLayer = new Machine_IBM_SoftLayerImpl();
		return machine_IBM_SoftLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Microsoft_Azure createMachine_Microsoft_Azure() {
		Machine_Microsoft_AzureImpl machine_Microsoft_Azure = new Machine_Microsoft_AzureImpl();
		return machine_Microsoft_Azure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Microsoft_Hyper_V createMachine_Microsoft_Hyper_V() {
		Machine_Microsoft_Hyper_VImpl machine_Microsoft_Hyper_V = new Machine_Microsoft_Hyper_VImpl();
		return machine_Microsoft_Hyper_V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_OpenStack createMachine_OpenStack() {
		Machine_OpenStackImpl machine_OpenStack = new Machine_OpenStackImpl();
		return machine_OpenStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Rackspace createMachine_Rackspace() {
		Machine_RackspaceImpl machine_Rackspace = new Machine_RackspaceImpl();
		return machine_Rackspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VirtualBox createMachine_VirtualBox() {
		Machine_VirtualBoxImpl machine_VirtualBox = new Machine_VirtualBoxImpl();
		return machine_VirtualBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VMware_Fusion createMachine_VMware_Fusion() {
		Machine_VMware_FusionImpl machine_VMware_Fusion = new Machine_VMware_FusionImpl();
		return machine_VMware_Fusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VMware_vCloud_Air createMachine_VMware_vCloud_Air() {
		Machine_VMware_vCloud_AirImpl machine_VMware_vCloud_Air = new Machine_VMware_vCloud_AirImpl();
		return machine_VMware_vCloud_Air;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VMware_vSphere createMachine_VMware_vSphere() {
		Machine_VMware_vSphereImpl machine_VMware_vSphere = new Machine_VMware_vSphereImpl();
		return machine_VMware_vSphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Exoscale createMachine_Exoscale() {
		Machine_ExoscaleImpl machine_Exoscale = new Machine_ExoscaleImpl();
		return machine_Exoscale;
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
	public Machine_Grid5000 createMachine_Grid5000() {
		Machine_Grid5000Impl machine_Grid5000 = new Machine_Grid5000Impl();
		return machine_Grid5000;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerPackage getDockerPackage() {
		return (DockerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerPackage getPackage() {
		return DockerPackage.eINSTANCE;
	}

} //DockerFactoryImpl
