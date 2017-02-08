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

import static org.occiware.clouddesigner.occi.docker.DockerPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Link;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.Machine_Exoscale;
import org.occiware.clouddesigner.occi.docker.Machine_Generic;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.Mode;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.NetworkLink;
import org.occiware.clouddesigner.occi.docker.Volume;
import org.occiware.clouddesigner.occi.docker.Volumesfrom;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerPackageImpl extends EPackageImpl implements DockerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumesfromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_GenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Amazon_EC2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Digital_OceanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Google_Compute_EngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_IBM_SoftLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Microsoft_AzureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_Microsoft_Hyper_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_OpenStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_RackspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VirtualBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_FusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_vCloud_AirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_VMware_vSphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machine_ExoscaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerPackageImpl() {
		super(eNS_URI, DockerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DockerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerPackage init() {
		if (isInited) return (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Obtain or create and register package
		DockerPackageImpl theDockerPackage = (DockerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockerPackage.createPackageContents();

		// Initialize created meta-data
		theDockerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerPackage.eNS_URI, theDockerPackage);
		return theDockerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Containerid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Image() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Build() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Command() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ports() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Expose() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Volumes() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Environment() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Env_file() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Net() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Dns() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Dns_search() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cap_add() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cap_drop() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Working_dir() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Entrypoint() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_User() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Domainname() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Mem_limit() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Memory_swap() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Privileged() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Restart() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Stdin_open() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Interactive() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Tty() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpu_shares() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Pid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ipc() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Add_host() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Mac_address() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Rm() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Security_opt() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Device() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Lxc_conf() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpuset() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Publish_all() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Read_only() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Monitored() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpu_used() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Memory_used() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpu_percent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Memory_percent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Disk_used() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Disk_percent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Bandwidth_used() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Bandwidth_percent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Monitoring_interval() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Cpu_max_value() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Memory_max_value() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Core_max() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Create() {
		return containerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Start() {
		return containerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Stop() {
		return containerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Run() {
		return containerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Pause() {
		return containerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Unpause() {
		return containerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainer__Kill__String() {
		return containerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Alias() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLink() {
		return networkLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumesfrom() {
		return volumesfromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumesfrom_Mode() {
		return (EAttribute)volumesfromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Name() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_install_url() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_opt() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_insecure_registry() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_registry_mirror() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_label() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_storage_driver() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Engine_env() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_image() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_master() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_discovery() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_strategy() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_opt() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_host() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_addr() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Swarm_experimental() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Tls_san() {
		return (EAttribute)machineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Driver() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Labels() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Options() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Source() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Destination() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Mode() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Rw() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Propagation() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_NetworkId() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Aux_address() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Driver() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Gateway() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Internal() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Ip_range() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Ipam_driver() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Ipam_opt() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Ipv6() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Opt() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Subnet() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Generic() {
		return machine_GenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Generic_Engine_port() {
		return (EAttribute)machine_GenericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Generic_Ip_address() {
		return (EAttribute)machine_GenericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Generic_Ssh_key() {
		return (EAttribute)machine_GenericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Generic_Ssh_user() {
		return (EAttribute)machine_GenericEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Generic_Ssh_port() {
		return (EAttribute)machine_GenericEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Amazon_EC2() {
		return machine_Amazon_EC2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Access_key() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Ami() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Instance_type() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Region() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Root_size() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Secret_key() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Security_group() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Session_token() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Subnet_id() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Vpc_id() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Amazon_EC2_Zone() {
		return (EAttribute)machine_Amazon_EC2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Digital_Ocean() {
		return machine_Digital_OceanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Access_token() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Image() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Region() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Digital_Ocean_Size() {
		return (EAttribute)machine_Digital_OceanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Google_Compute_Engine() {
		return machine_Google_Compute_EngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Zone() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Machine_type() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Username() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Instance_name() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Google_Compute_Engine_Project() {
		return (EAttribute)machine_Google_Compute_EngineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_IBM_SoftLayer() {
		return machine_IBM_SoftLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Api_endpoint() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_User() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Api_key() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Cpu() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Disk_size() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Domain() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Hourly_billing() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Image() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Local_disk() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Private_net_only() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Region() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Public_vlan_id() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_IBM_SoftLayer_Private_vlan_id() {
		return (EAttribute)machine_IBM_SoftLayerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Microsoft_Azure() {
		return machine_Microsoft_AzureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Subscription_id() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Subscription_cert() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Environment() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Location() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Resource_group() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Size() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Ssh_user() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Vnet() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Subnet() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Subnet_prefix() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Availability_set() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Open_port() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Private_ip_address() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_No_public_ip() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Static_public_ip() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Docker_port() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Use_private_ip() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Azure_Image() {
		return (EAttribute)machine_Microsoft_AzureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Microsoft_Hyper_V() {
		return machine_Microsoft_Hyper_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Boot2docker_url() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Disk_size() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Static_macaddress() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Vlan_id() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Microsoft_Hyper_V_Virtual_switch() {
		return (EAttribute)machine_Microsoft_Hyper_VEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_OpenStack() {
		return machine_OpenStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Flavor_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Flavor_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Image_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Image_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Auth_url() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Username() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Password() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Tenant_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Tenant_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Region() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Endpoint_type() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Net_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Net_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Sec_groups() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Floatingip_pool() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Active_timeout() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Availability_zone() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Domain_id() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Domain_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Insecure() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Ip_version() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Keypair_name() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Private_key_file() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Ssh_port() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_OpenStack_Ssh_user() {
		return (EAttribute)machine_OpenStackEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Rackspace() {
		return machine_RackspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Username() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Api_key() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Region() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Endpoint_type() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Image_id() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Flavor_id() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Ssh_user() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Ssh_port() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Rackspace_Docker_install() {
		return (EAttribute)machine_RackspaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VirtualBox() {
		return machine_VirtualBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Boot2docker_url() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Disk_size() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Host_dns_resolver() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Import_boot2docker_vm() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Hostonly_cidr() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Hostonly_nictype() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Hostonly_nicpromisc() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_No_share() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_No_dns_proxy() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_No_vtx_check() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VirtualBox_Share_folder() {
		return (EAttribute)machine_VirtualBoxEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_Fusion() {
		return machine_VMware_FusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_Boot2docker_url() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_Disk_size() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_Memory_size() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_Fusion_No_share() {
		return (EAttribute)machine_VMware_FusionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_vCloud_Air() {
		return machine_VMware_vCloud_AirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Username() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Password() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Catalog() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Catalogitem() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Computeid() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Cpu_count() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Docker_port() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Edgegateway() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Memory_size() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Vapp_name() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Orgvdcnetwork() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Provision() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Publicip() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Ssh_port() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vCloud_Air_Vdcid() {
		return (EAttribute)machine_VMware_vCloud_AirEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_VMware_vSphere() {
		return machine_VMware_vSphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Username() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Password() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Boot2docker_url() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Compute_ip() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Cpu_count() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Datacenter() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Datastore() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Disk_size() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Memory_size() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Network() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Pool() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_VMware_vSphere_Vcenter() {
		return (EAttribute)machine_VMware_vSphereEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine_Exoscale() {
		return machine_ExoscaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Url() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Api_key() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Api_secret_key() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Instance_profile() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Image() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Security_group() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Availability_zone() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Ssh_user() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Userdata() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachine_Exoscale_Affinity_group() {
		return (EAttribute)machine_ExoscaleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactory getDockerFactory() {
		return (DockerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEAttribute(containerEClass, CONTAINER__CONTAINERID);
		createEAttribute(containerEClass, CONTAINER__IMAGE);
		createEAttribute(containerEClass, CONTAINER__BUILD);
		createEAttribute(containerEClass, CONTAINER__COMMAND);
		createEAttribute(containerEClass, CONTAINER__PORTS);
		createEAttribute(containerEClass, CONTAINER__EXPOSE);
		createEAttribute(containerEClass, CONTAINER__VOLUMES);
		createEAttribute(containerEClass, CONTAINER__ENVIRONMENT);
		createEAttribute(containerEClass, CONTAINER__ENV_FILE);
		createEAttribute(containerEClass, CONTAINER__NET);
		createEAttribute(containerEClass, CONTAINER__DNS);
		createEAttribute(containerEClass, CONTAINER__DNS_SEARCH);
		createEAttribute(containerEClass, CONTAINER__CAP_ADD);
		createEAttribute(containerEClass, CONTAINER__CAP_DROP);
		createEAttribute(containerEClass, CONTAINER__WORKING_DIR);
		createEAttribute(containerEClass, CONTAINER__ENTRYPOINT);
		createEAttribute(containerEClass, CONTAINER__USER);
		createEAttribute(containerEClass, CONTAINER__DOMAINNAME);
		createEAttribute(containerEClass, CONTAINER__MEM_LIMIT);
		createEAttribute(containerEClass, CONTAINER__MEMORY_SWAP);
		createEAttribute(containerEClass, CONTAINER__PRIVILEGED);
		createEAttribute(containerEClass, CONTAINER__RESTART);
		createEAttribute(containerEClass, CONTAINER__STDIN_OPEN);
		createEAttribute(containerEClass, CONTAINER__INTERACTIVE);
		createEAttribute(containerEClass, CONTAINER__TTY);
		createEAttribute(containerEClass, CONTAINER__CPU_SHARES);
		createEAttribute(containerEClass, CONTAINER__PID);
		createEAttribute(containerEClass, CONTAINER__IPC);
		createEAttribute(containerEClass, CONTAINER__ADD_HOST);
		createEAttribute(containerEClass, CONTAINER__MAC_ADDRESS);
		createEAttribute(containerEClass, CONTAINER__RM);
		createEAttribute(containerEClass, CONTAINER__SECURITY_OPT);
		createEAttribute(containerEClass, CONTAINER__DEVICE);
		createEAttribute(containerEClass, CONTAINER__LXC_CONF);
		createEAttribute(containerEClass, CONTAINER__CPUSET);
		createEAttribute(containerEClass, CONTAINER__PUBLISH_ALL);
		createEAttribute(containerEClass, CONTAINER__READ_ONLY);
		createEAttribute(containerEClass, CONTAINER__MONITORED);
		createEAttribute(containerEClass, CONTAINER__CPU_USED);
		createEAttribute(containerEClass, CONTAINER__MEMORY_USED);
		createEAttribute(containerEClass, CONTAINER__CPU_PERCENT);
		createEAttribute(containerEClass, CONTAINER__MEMORY_PERCENT);
		createEAttribute(containerEClass, CONTAINER__DISK_USED);
		createEAttribute(containerEClass, CONTAINER__DISK_PERCENT);
		createEAttribute(containerEClass, CONTAINER__BANDWIDTH_USED);
		createEAttribute(containerEClass, CONTAINER__BANDWIDTH_PERCENT);
		createEAttribute(containerEClass, CONTAINER__MONITORING_INTERVAL);
		createEAttribute(containerEClass, CONTAINER__CPU_MAX_VALUE);
		createEAttribute(containerEClass, CONTAINER__MEMORY_MAX_VALUE);
		createEAttribute(containerEClass, CONTAINER__CORE_MAX);
		createEOperation(containerEClass, CONTAINER___CREATE);
		createEOperation(containerEClass, CONTAINER___START);
		createEOperation(containerEClass, CONTAINER___STOP);
		createEOperation(containerEClass, CONTAINER___RUN);
		createEOperation(containerEClass, CONTAINER___PAUSE);
		createEOperation(containerEClass, CONTAINER___UNPAUSE);
		createEOperation(containerEClass, CONTAINER___KILL__STRING);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__ALIAS);

		networkLinkEClass = createEClass(NETWORK_LINK);

		volumesfromEClass = createEClass(VOLUMESFROM);
		createEAttribute(volumesfromEClass, VOLUMESFROM__MODE);

		containsEClass = createEClass(CONTAINS);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEAttribute(machineEClass, MACHINE__ENGINE_INSTALL_URL);
		createEAttribute(machineEClass, MACHINE__ENGINE_OPT);
		createEAttribute(machineEClass, MACHINE__ENGINE_INSECURE_REGISTRY);
		createEAttribute(machineEClass, MACHINE__ENGINE_REGISTRY_MIRROR);
		createEAttribute(machineEClass, MACHINE__ENGINE_LABEL);
		createEAttribute(machineEClass, MACHINE__ENGINE_STORAGE_DRIVER);
		createEAttribute(machineEClass, MACHINE__ENGINE_ENV);
		createEAttribute(machineEClass, MACHINE__SWARM);
		createEAttribute(machineEClass, MACHINE__SWARM_IMAGE);
		createEAttribute(machineEClass, MACHINE__SWARM_MASTER);
		createEAttribute(machineEClass, MACHINE__SWARM_DISCOVERY);
		createEAttribute(machineEClass, MACHINE__SWARM_STRATEGY);
		createEAttribute(machineEClass, MACHINE__SWARM_OPT);
		createEAttribute(machineEClass, MACHINE__SWARM_HOST);
		createEAttribute(machineEClass, MACHINE__SWARM_ADDR);
		createEAttribute(machineEClass, MACHINE__SWARM_EXPERIMENTAL);
		createEAttribute(machineEClass, MACHINE__TLS_SAN);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__DRIVER);
		createEAttribute(volumeEClass, VOLUME__LABELS);
		createEAttribute(volumeEClass, VOLUME__OPTIONS);
		createEAttribute(volumeEClass, VOLUME__SOURCE);
		createEAttribute(volumeEClass, VOLUME__DESTINATION);
		createEAttribute(volumeEClass, VOLUME__MODE);
		createEAttribute(volumeEClass, VOLUME__RW);
		createEAttribute(volumeEClass, VOLUME__PROPAGATION);
		createEAttribute(volumeEClass, VOLUME__NAME);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NETWORK_ID);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__AUX_ADDRESS);
		createEAttribute(networkEClass, NETWORK__DRIVER);
		createEAttribute(networkEClass, NETWORK__GATEWAY);
		createEAttribute(networkEClass, NETWORK__INTERNAL);
		createEAttribute(networkEClass, NETWORK__IP_RANGE);
		createEAttribute(networkEClass, NETWORK__IPAM_DRIVER);
		createEAttribute(networkEClass, NETWORK__IPAM_OPT);
		createEAttribute(networkEClass, NETWORK__IPV6);
		createEAttribute(networkEClass, NETWORK__OPT);
		createEAttribute(networkEClass, NETWORK__SUBNET);

		machine_GenericEClass = createEClass(MACHINE_GENERIC);
		createEAttribute(machine_GenericEClass, MACHINE_GENERIC__ENGINE_PORT);
		createEAttribute(machine_GenericEClass, MACHINE_GENERIC__IP_ADDRESS);
		createEAttribute(machine_GenericEClass, MACHINE_GENERIC__SSH_KEY);
		createEAttribute(machine_GenericEClass, MACHINE_GENERIC__SSH_USER);
		createEAttribute(machine_GenericEClass, MACHINE_GENERIC__SSH_PORT);

		machine_Amazon_EC2EClass = createEClass(MACHINE_AMAZON_EC2);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ACCESS_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__AMI);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__INSTANCE_TYPE);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__REGION);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ROOT_SIZE);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECRET_KEY);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SECURITY_GROUP);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SESSION_TOKEN);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__SUBNET_ID);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__VPC_ID);
		createEAttribute(machine_Amazon_EC2EClass, MACHINE_AMAZON_EC2__ZONE);

		machine_Digital_OceanEClass = createEClass(MACHINE_DIGITAL_OCEAN);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__ACCESS_TOKEN);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__IMAGE);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__REGION);
		createEAttribute(machine_Digital_OceanEClass, MACHINE_DIGITAL_OCEAN__SIZE);

		machine_Google_Compute_EngineEClass = createEClass(MACHINE_GOOGLE_COMPUTE_ENGINE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME);
		createEAttribute(machine_Google_Compute_EngineEClass, MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT);

		machine_IBM_SoftLayerEClass = createEClass(MACHINE_IBM_SOFT_LAYER);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__API_ENDPOINT);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__USER);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__API_KEY);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__CPU);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__DISK_SIZE);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__DOMAIN);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__IMAGE);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__LOCAL_DISK);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__REGION);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__PUBLIC_VLAN_ID);
		createEAttribute(machine_IBM_SoftLayerEClass, MACHINE_IBM_SOFT_LAYER__PRIVATE_VLAN_ID);

		machine_Microsoft_AzureEClass = createEClass(MACHINE_MICROSOFT_AZURE);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__ENVIRONMENT);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__LOCATION);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SIZE);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SSH_USER);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__VNET);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBNET);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__OPEN_PORT);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__DOCKER_PORT);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP);
		createEAttribute(machine_Microsoft_AzureEClass, MACHINE_MICROSOFT_AZURE__IMAGE);

		machine_Microsoft_Hyper_VEClass = createEClass(MACHINE_MICROSOFT_HYPER_V);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__DISK_SIZE);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__STATIC_MACADDRESS);
		createEAttribute(machine_Microsoft_Hyper_VEClass, MACHINE_MICROSOFT_HYPER_V__VLAN_ID);

		machine_OpenStackEClass = createEClass(MACHINE_OPEN_STACK);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLAVOR_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLAVOR_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IMAGE_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IMAGE_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__AUTH_URL);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__USERNAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__PASSWORD);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__TENANT_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__TENANT_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__REGION);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__ENDPOINT_TYPE);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__NET_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__NET_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__SEC_GROUPS);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__FLOATINGIP_POOL);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__ACTIVE_TIMEOUT);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__AVAILABILITY_ZONE);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__DOMAIN_ID);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__DOMAIN_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__INSECURE);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__IP_VERSION);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__KEYPAIR_NAME);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__PRIVATE_KEY_FILE);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__SSH_PORT);
		createEAttribute(machine_OpenStackEClass, MACHINE_OPEN_STACK__SSH_USER);

		machine_RackspaceEClass = createEClass(MACHINE_RACKSPACE);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__USERNAME);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__API_KEY);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__REGION);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__ENDPOINT_TYPE);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__IMAGE_ID);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__FLAVOR_ID);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__SSH_USER);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__SSH_PORT);
		createEAttribute(machine_RackspaceEClass, MACHINE_RACKSPACE__DOCKER_INSTALL);

		machine_VirtualBoxEClass = createEClass(MACHINE_VIRTUAL_BOX);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__DISK_SIZE);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__NO_SHARE);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__NO_DNS_PROXY);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__NO_VTX_CHECK);
		createEAttribute(machine_VirtualBoxEClass, MACHINE_VIRTUAL_BOX__SHARE_FOLDER);

		machine_VMware_FusionEClass = createEClass(MACHINE_VMWARE_FUSION);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__DISK_SIZE);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__MEMORY_SIZE);
		createEAttribute(machine_VMware_FusionEClass, MACHINE_VMWARE_FUSION__NO_SHARE);

		machine_VMware_vCloud_AirEClass = createEClass(MACHINE_VMWARE_VCLOUD_AIR);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__USERNAME);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PASSWORD);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CATALOG);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PROVISION);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT);
		createEAttribute(machine_VMware_vCloud_AirEClass, MACHINE_VMWARE_VCLOUD_AIR__VDCID);

		machine_VMware_vSphereEClass = createEClass(MACHINE_VMWARE_VSPHERE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__USERNAME);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__PASSWORD);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__COMPUTE_IP);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__CPU_COUNT);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DATACENTER);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DATASTORE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__DISK_SIZE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__MEMORY_SIZE);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__NETWORK);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__POOL);
		createEAttribute(machine_VMware_vSphereEClass, MACHINE_VMWARE_VSPHERE__VCENTER);

		machine_ExoscaleEClass = createEClass(MACHINE_EXOSCALE);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__URL);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__API_KEY);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__API_SECRET_KEY);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__INSTANCE_PROFILE);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__IMAGE);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__SECURITY_GROUP);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__AVAILABILITY_ZONE);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__SSH_USER);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__USERDATA);
		createEAttribute(machine_ExoscaleEClass, MACHINE_EXOSCALE__AFFINITY_GROUP);

		// Create enums
		modeEEnum = createEEnum(MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		linkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networkLinkEClass.getESuperTypes().add(this.getLink());
		volumesfromEClass.getESuperTypes().add(theOCCIPackage.getLink());
		containsEClass.getESuperTypes().add(theOCCIPackage.getLink());
		machineEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		volumeEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		networkEClass.getESuperTypes().add(theInfrastructurePackage.getNetwork());
		machine_GenericEClass.getESuperTypes().add(this.getMachine());
		machine_Amazon_EC2EClass.getESuperTypes().add(this.getMachine());
		machine_Digital_OceanEClass.getESuperTypes().add(this.getMachine());
		machine_Google_Compute_EngineEClass.getESuperTypes().add(this.getMachine());
		machine_IBM_SoftLayerEClass.getESuperTypes().add(this.getMachine());
		machine_Microsoft_AzureEClass.getESuperTypes().add(this.getMachine());
		machine_Microsoft_Hyper_VEClass.getESuperTypes().add(this.getMachine());
		machine_OpenStackEClass.getESuperTypes().add(this.getMachine());
		machine_RackspaceEClass.getESuperTypes().add(this.getMachine());
		machine_VirtualBoxEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_FusionEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_vCloud_AirEClass.getESuperTypes().add(this.getMachine());
		machine_VMware_vSphereEClass.getESuperTypes().add(this.getMachine());
		machine_ExoscaleEClass.getESuperTypes().add(this.getMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, org.occiware.clouddesigner.occi.docker.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), theOCCIPackage.getString(), "name", null, 1, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Containerid(), theOCCIPackage.getString(), "containerid", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Image(), theOCCIPackage.getString(), "image", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Build(), theOCCIPackage.getString(), "build", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), theOCCIPackage.getString(), "command", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ports(), theOCCIPackage.getString(), "ports", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Expose(), theOCCIPackage.getString(), "expose", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Volumes(), theOCCIPackage.getString(), "volumes", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Environment(), theOCCIPackage.getString(), "environment", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Env_file(), theOCCIPackage.getString(), "env_file", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Net(), theOCCIPackage.getString(), "net", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Dns(), theOCCIPackage.getString(), "dns", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Dns_search(), theOCCIPackage.getString(), "dns_search", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cap_add(), theOCCIPackage.getString(), "cap_add", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cap_drop(), theOCCIPackage.getString(), "cap_drop", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Working_dir(), theOCCIPackage.getString(), "working_dir", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Entrypoint(), theOCCIPackage.getString(), "entrypoint", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_User(), theOCCIPackage.getString(), "user", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Domainname(), theOCCIPackage.getString(), "domainname", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Mem_limit(), theOCCIPackage.getNumber(), "mem_limit", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Memory_swap(), theOCCIPackage.getNumber(), "memory_swap", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Privileged(), theOCCIPackage.getBoolean(), "privileged", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Restart(), theOCCIPackage.getString(), "restart", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Stdin_open(), theOCCIPackage.getBoolean(), "stdin_open", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Interactive(), theOCCIPackage.getBoolean(), "interactive", "false", 1, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Tty(), theOCCIPackage.getBoolean(), "tty", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpu_shares(), theOCCIPackage.getNumber(), "cpu_shares", "0", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Pid(), theOCCIPackage.getString(), "pid", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Ipc(), theOCCIPackage.getString(), "ipc", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Add_host(), theOCCIPackage.getString(), "add_host", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Mac_address(), theOCCIPackage.getString(), "mac_address", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Rm(), theOCCIPackage.getBoolean(), "rm", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Security_opt(), theOCCIPackage.getString(), "security_opt", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Device(), theOCCIPackage.getString(), "device", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Lxc_conf(), theOCCIPackage.getString(), "lxc_conf", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpuset(), theOCCIPackage.getString(), "cpuset", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Publish_all(), theOCCIPackage.getBoolean(), "publish_all", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Read_only(), theOCCIPackage.getBoolean(), "read_only", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Monitored(), theOCCIPackage.getBoolean(), "monitored", "false", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpu_used(), theOCCIPackage.getNumber(), "cpu_used", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Memory_used(), theOCCIPackage.getNumber(), "memory_used", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpu_percent(), theOCCIPackage.getString(), "cpu_percent", "0", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Memory_percent(), theOCCIPackage.getString(), "memory_percent", "0", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Disk_used(), theOCCIPackage.getNumber(), "disk_used", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Disk_percent(), theOCCIPackage.getString(), "disk_percent", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Bandwidth_used(), theOCCIPackage.getNumber(), "bandwidth_used", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Bandwidth_percent(), theOCCIPackage.getString(), "bandwidth_percent", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Monitoring_interval(), theOCCIPackage.getNumber(), "monitoring_interval", "1000", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Cpu_max_value(), theOCCIPackage.getNumber(), "cpu_max_value", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Memory_max_value(), theOCCIPackage.getNumber(), "memory_max_value", null, 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Core_max(), theOCCIPackage.getNumber(), "core_max", "1", 0, 1, org.occiware.clouddesigner.occi.docker.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContainer__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Pause(), null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContainer__Unpause(), null, "unpause", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getContainer__Kill__String(), null, "kill", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "signal", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Alias(), theOCCIPackage.getString(), "alias", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkEClass, NetworkLink.class, "NetworkLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumesfromEClass, Volumesfrom.class, "Volumesfrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumesfrom_Mode(), this.getMode(), "mode", "read_write", 0, 1, Volumesfrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_install_url(), theOCCIPackage.getString(), "engine_install_url", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_opt(), theOCCIPackage.getString(), "engine_opt", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_insecure_registry(), theOCCIPackage.getString(), "engine_insecure_registry", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_registry_mirror(), theOCCIPackage.getString(), "engine_registry_mirror", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_label(), theOCCIPackage.getString(), "engine_label", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_storage_driver(), theOCCIPackage.getString(), "engine_storage_driver", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Engine_env(), theOCCIPackage.getString(), "engine_env", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm(), theOCCIPackage.getBoolean(), "swarm", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_image(), theOCCIPackage.getString(), "swarm_image", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_master(), theOCCIPackage.getBoolean(), "swarm_master", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_discovery(), theOCCIPackage.getString(), "swarm_discovery", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_strategy(), theOCCIPackage.getString(), "swarm_strategy", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_opt(), theOCCIPackage.getString(), "swarm_opt", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_host(), theOCCIPackage.getString(), "swarm_host", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_addr(), theOCCIPackage.getString(), "swarm_addr", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Swarm_experimental(), theOCCIPackage.getString(), "swarm_experimental", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Tls_san(), theOCCIPackage.getString(), "tls_san", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Driver(), theOCCIPackage.getString(), "driver", "local", 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Labels(), theOCCIPackage.getString(), "labels", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Options(), theOCCIPackage.getString(), "options", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Source(), theOCCIPackage.getString(), "source", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Destination(), theOCCIPackage.getString(), "destination", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Mode(), theOCCIPackage.getString(), "mode", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Rw(), theOCCIPackage.getString(), "rw", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Propagation(), theOCCIPackage.getString(), "propagation", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_NetworkId(), theOCCIPackage.getString(), "networkId", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Name(), theOCCIPackage.getString(), "name", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Aux_address(), theOCCIPackage.getString(), "aux_address", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Driver(), theOCCIPackage.getString(), "driver", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Gateway(), theOCCIPackage.getString(), "gateway", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Internal(), theOCCIPackage.getBoolean(), "internal", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Ip_range(), theOCCIPackage.getString(), "ip_range", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Ipam_driver(), theOCCIPackage.getString(), "ipam_driver", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Ipam_opt(), theOCCIPackage.getString(), "ipam_opt", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Ipv6(), theOCCIPackage.getBoolean(), "ipv6", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Opt(), theOCCIPackage.getString(), "opt", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Subnet(), theOCCIPackage.getString(), "subnet", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_GenericEClass, Machine_Generic.class, "Machine_Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Generic_Engine_port(), theOCCIPackage.getNumber(), "engine_port", null, 0, 1, Machine_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Generic_Ip_address(), theOCCIPackage.getString(), "ip_address", null, 1, 1, Machine_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Generic_Ssh_key(), theOCCIPackage.getString(), "ssh_key", null, 0, 1, Machine_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Generic_Ssh_user(), theOCCIPackage.getString(), "ssh_user", null, 0, 1, Machine_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Generic_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", null, 0, 1, Machine_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Amazon_EC2EClass, Machine_Amazon_EC2.class, "Machine_Amazon_EC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Amazon_EC2_Access_key(), theOCCIPackage.getString(), "access_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Ami(), theOCCIPackage.getString(), "ami", "ami-4ae27e22", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Instance_type(), theOCCIPackage.getString(), "instance_type", "t2.micro", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Region(), theOCCIPackage.getString(), "region", "us-east-1", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Root_size(), theOCCIPackage.getNumber(), "root_size", "16", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Secret_key(), theOCCIPackage.getString(), "secret_key", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Security_group(), theOCCIPackage.getString(), "security_group", "docker-machine", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Session_token(), theOCCIPackage.getString(), "session_token", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Subnet_id(), theOCCIPackage.getString(), "subnet_id", null, 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Vpc_id(), theOCCIPackage.getString(), "vpc_id", null, 1, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Amazon_EC2_Zone(), theOCCIPackage.getString(), "zone", "a", 0, 1, Machine_Amazon_EC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Digital_OceanEClass, Machine_Digital_Ocean.class, "Machine_Digital_Ocean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Digital_Ocean_Access_token(), theOCCIPackage.getString(), "access_token", null, 1, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Image(), theOCCIPackage.getString(), "image", "docker", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Region(), theOCCIPackage.getString(), "region", "nyc3", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Digital_Ocean_Size(), theOCCIPackage.getString(), "size", "512mb", 0, 1, Machine_Digital_Ocean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Google_Compute_EngineEClass, Machine_Google_Compute_Engine.class, "Machine_Google_Compute_Engine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Google_Compute_Engine_Zone(), theOCCIPackage.getString(), "zone", "us-central1-a", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Machine_type(), theOCCIPackage.getString(), "machine_type", "f1-micro", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Username(), theOCCIPackage.getString(), "username", "docker-user", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Instance_name(), theOCCIPackage.getString(), "instance_name", "docker-machine", 0, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Google_Compute_Engine_Project(), theOCCIPackage.getString(), "project", null, 1, 1, Machine_Google_Compute_Engine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_IBM_SoftLayerEClass, Machine_IBM_SoftLayer.class, "Machine_IBM_SoftLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_IBM_SoftLayer_Api_endpoint(), theOCCIPackage.getString(), "api_endpoint", "api.softlayer.com/rest/v3", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_User(), theOCCIPackage.getString(), "user", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Cpu(), theOCCIPackage.getNumber(), "cpu", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Disk_size(), theOCCIPackage.getNumber(), "disk_size", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Domain(), theOCCIPackage.getString(), "domain", null, 1, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Hourly_billing(), theOCCIPackage.getBoolean(), "hourly_billing", "false", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Image(), theOCCIPackage.getString(), "image", "UBUNTU_LATEST", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Local_disk(), theOCCIPackage.getBoolean(), "local_disk", "false", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Private_net_only(), theOCCIPackage.getBoolean(), "private_net_only", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Public_vlan_id(), theOCCIPackage.getString(), "public_vlan_id", "0", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_IBM_SoftLayer_Private_vlan_id(), theOCCIPackage.getString(), "private_vlan_id", "0", 0, 1, Machine_IBM_SoftLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Microsoft_AzureEClass, Machine_Microsoft_Azure.class, "Machine_Microsoft_Azure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Microsoft_Azure_Subscription_id(), theOCCIPackage.getString(), "subscription_id", null, 1, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Subscription_cert(), theOCCIPackage.getString(), "subscription_cert", null, 1, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Environment(), theOCCIPackage.getString(), "environment", "AzurePublicCloud", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Location(), theOCCIPackage.getString(), "location", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Resource_group(), theOCCIPackage.getString(), "resource_group", "docker-machine", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Size(), theOCCIPackage.getString(), "size", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Ssh_user(), theOCCIPackage.getString(), "ssh_user", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Vnet(), theOCCIPackage.getString(), "vnet", "docker-machine", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Subnet(), theOCCIPackage.getString(), "subnet", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Subnet_prefix(), theOCCIPackage.getString(), "subnet_prefix", "192.168.0.0/16", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Availability_set(), theOCCIPackage.getString(), "availability_set", "docker-machine", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Open_port(), theOCCIPackage.getNumber(), "open_port", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Private_ip_address(), theOCCIPackage.getString(), "private_ip_address", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_No_public_ip(), theOCCIPackage.getString(), "no_public_ip", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Static_public_ip(), theOCCIPackage.getString(), "static_public_ip", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Docker_port(), theOCCIPackage.getString(), "docker_port", "2376", 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Use_private_ip(), theOCCIPackage.getString(), "use_private_ip", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Azure_Image(), theOCCIPackage.getString(), "image", null, 0, 1, Machine_Microsoft_Azure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_Microsoft_Hyper_VEClass, Machine_Microsoft_Hyper_V.class, "Machine_Microsoft_Hyper_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Microsoft_Hyper_V_Virtual_switch(), theOCCIPackage.getString(), "virtual_switch", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Static_macaddress(), theOCCIPackage.getString(), "static_macaddress", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Microsoft_Hyper_V_Vlan_id(), theOCCIPackage.getString(), "vlan_id", null, 0, 1, Machine_Microsoft_Hyper_V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_OpenStackEClass, Machine_OpenStack.class, "Machine_OpenStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_OpenStack_Flavor_id(), theOCCIPackage.getString(), "flavor_id", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Flavor_name(), theOCCIPackage.getString(), "flavor_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Image_id(), theOCCIPackage.getString(), "image_id", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Image_name(), theOCCIPackage.getString(), "image_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Auth_url(), theOCCIPackage.getString(), "auth_url", null, 1, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Tenant_name(), theOCCIPackage.getString(), "tenant_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Tenant_id(), theOCCIPackage.getString(), "tenant_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Region(), theOCCIPackage.getString(), "region", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Endpoint_type(), theOCCIPackage.getString(), "endpoint_type", "publicURL", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Net_id(), theOCCIPackage.getString(), "net_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Net_name(), theOCCIPackage.getString(), "net_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Sec_groups(), theOCCIPackage.getString(), "sec_groups", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Floatingip_pool(), theOCCIPackage.getString(), "floatingip_pool", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Active_timeout(), theOCCIPackage.getNumber(), "active_timeout", "200", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Availability_zone(), theOCCIPackage.getString(), "availability_zone", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Domain_id(), theOCCIPackage.getString(), "domain_id", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Domain_name(), theOCCIPackage.getString(), "domain_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Insecure(), theOCCIPackage.getBoolean(), "insecure", "false", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Ip_version(), theOCCIPackage.getNumber(), "ip_version", "4", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Keypair_name(), theOCCIPackage.getString(), "keypair_name", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Private_key_file(), theOCCIPackage.getString(), "private_key_file", null, 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", "22", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_OpenStack_Ssh_user(), theOCCIPackage.getString(), "ssh_user", "root", 0, 1, Machine_OpenStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_RackspaceEClass, Machine_Rackspace.class, "Machine_Rackspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Rackspace_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Region(), theOCCIPackage.getString(), "region", null, 1, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Endpoint_type(), theOCCIPackage.getString(), "endpoint_type", "publicURL", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Image_id(), theOCCIPackage.getString(), "image_id", "59a3fadd-93e7-4674-886a-64883e17115f", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Flavor_id(), theOCCIPackage.getString(), "flavor_id", "general1-1", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Ssh_user(), theOCCIPackage.getString(), "ssh_user", "root", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", "22", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Rackspace_Docker_install(), theOCCIPackage.getBoolean(), "docker_install", "true", 0, 1, Machine_Rackspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VirtualBoxEClass, Machine_VirtualBox.class, "Machine_VirtualBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VirtualBox_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Host_dns_resolver(), theOCCIPackage.getBoolean(), "host_dns_resolver", "false", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Import_boot2docker_vm(), theOCCIPackage.getString(), "import_boot2docker_vm", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Hostonly_cidr(), theOCCIPackage.getString(), "hostonly_cidr", "192.168.99.1/24", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Hostonly_nictype(), theOCCIPackage.getString(), "hostonly_nictype", "82540EM", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Hostonly_nicpromisc(), theOCCIPackage.getString(), "hostonly_nicpromisc", "deny", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_No_share(), theOCCIPackage.getBoolean(), "no_share", "false", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_No_dns_proxy(), theOCCIPackage.getBoolean(), "no_dns_proxy", "false", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_No_vtx_check(), theOCCIPackage.getBoolean(), "no_vtx_check", "false", 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VirtualBox_Share_folder(), theOCCIPackage.getString(), "share_folder", null, 0, 1, Machine_VirtualBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_FusionEClass, Machine_VMware_Fusion.class, "Machine_VMware_Fusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_Fusion_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_Fusion_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_Fusion_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "1024", 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_Fusion_No_share(), theOCCIPackage.getBoolean(), "no_share", "false", 0, 1, Machine_VMware_Fusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_vCloud_AirEClass, Machine_VMware_vCloud_Air.class, "Machine_VMware_vCloud_Air", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_vCloud_Air_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Catalog(), theOCCIPackage.getString(), "catalog", "Public Catalog", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Catalogitem(), theOCCIPackage.getString(), "catalogitem", "Ubuntu Server 12.04 LTS (amd64 20140927)", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Computeid(), theOCCIPackage.getString(), "computeid", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Cpu_count(), theOCCIPackage.getNumber(), "cpu_count", "1", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Docker_port(), theOCCIPackage.getNumber(), "docker_port", "2376", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Edgegateway(), theOCCIPackage.getString(), "edgegateway", "<vdcid>", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "2048", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Vapp_name(), theOCCIPackage.getString(), "vapp_name", "<autogenerated>", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Orgvdcnetwork(), theOCCIPackage.getString(), "orgvdcnetwork", "<vdcid>-default-routed", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Provision(), theOCCIPackage.getBoolean(), "provision", "true", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Publicip(), theOCCIPackage.getString(), "publicip", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Ssh_port(), theOCCIPackage.getNumber(), "ssh_port", "22", 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vCloud_Air_Vdcid(), theOCCIPackage.getString(), "vdcid", null, 0, 1, Machine_VMware_vCloud_Air.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_VMware_vSphereEClass, Machine_VMware_vSphere.class, "Machine_VMware_vSphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_VMware_vSphere_Username(), theOCCIPackage.getString(), "username", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Password(), theOCCIPackage.getString(), "password", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Boot2docker_url(), theOCCIPackage.getString(), "boot2docker_url", null, 1, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Compute_ip(), theOCCIPackage.getString(), "compute_ip", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Cpu_count(), theOCCIPackage.getNumber(), "cpu_count", "2", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Datacenter(), theOCCIPackage.getString(), "datacenter", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Datastore(), theOCCIPackage.getString(), "datastore", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Disk_size(), theOCCIPackage.getNumber(), "disk_size", "20000", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Memory_size(), theOCCIPackage.getNumber(), "memory_size", "2048", 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Network(), theOCCIPackage.getString(), "network", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Pool(), theOCCIPackage.getString(), "pool", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_VMware_vSphere_Vcenter(), theOCCIPackage.getString(), "vcenter", null, 0, 1, Machine_VMware_vSphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machine_ExoscaleEClass, Machine_Exoscale.class, "Machine_Exoscale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Exoscale_Url(), theOCCIPackage.getString(), "url", "https://api.exoscale.ch/compute", 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Api_key(), theOCCIPackage.getString(), "api_key", null, 1, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Api_secret_key(), theOCCIPackage.getString(), "api_secret_key", null, 1, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Instance_profile(), theOCCIPackage.getString(), "instance_profile", "small", 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Image(), theOCCIPackage.getString(), "image", "ubuntu-16.04", 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Security_group(), theOCCIPackage.getString(), "security_group", null, 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Availability_zone(), theOCCIPackage.getString(), "availability_zone", null, 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Ssh_user(), theOCCIPackage.getString(), "ssh_user", "ubuntu", 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Userdata(), theOCCIPackage.getString(), "userdata", null, 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Exoscale_Affinity_group(), theOCCIPackage.getString(), "affinity_group", "docker-machine", 0, 1, Machine_Exoscale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.READ_WRITE);
		addEEnumLiteral(modeEEnum, Mode.READ_ONLY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>OCCIE2Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCCIE2EcoreAnnotations() {
		String source = "OCCIE2Ecore";	
		addAnnotation
		  (containerEClass, 
		   source, 
		   new String[] {
			 "title", "Container Resource"
		   });	
		addAnnotation
		  (getContainer__Create(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getContainer__Start(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getContainer__Stop(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getContainer__Run(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getContainer__Pause(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getContainer__Unpause(), 
		   source, 
		   new String[] {
			 "title", ""
		   });	
		addAnnotation
		  (getContainer__Kill__String(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  ((getContainer__Kill__String()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Name(), 
		   source, 
		   new String[] {
			 "description", "The name of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Containerid(), 
		   source, 
		   new String[] {
			 "description", "The ID of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Image(), 
		   source, 
		   new String[] {
			 "description", "The image of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Build(), 
		   source, 
		   new String[] {
			 "description", "The build directory of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Command(), 
		   source, 
		   new String[] {
			 "description", "Override the default command in Dockerfile"
		   });	
		addAnnotation
		  (getContainer_Ports(), 
		   source, 
		   new String[] {
			 "description", "The ports of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Expose(), 
		   source, 
		   new String[] {
			 "description", "The exposed ports of this Container instance"
		   });	
		addAnnotation
		  (getContainer_Volumes(), 
		   source, 
		   new String[] {
			 "description", "The list of volumes"
		   });	
		addAnnotation
		  (getContainer_Environment(), 
		   source, 
		   new String[] {
			 "description", "Environment variables"
		   });	
		addAnnotation
		  (getContainer_Env_file(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Net(), 
		   source, 
		   new String[] {
			 "description", "\'bridge\',  \'none\', \'container:[name or id]\', or \'host\'"
		   });	
		addAnnotation
		  (getContainer_Dns(), 
		   source, 
		   new String[] {
			 "description", "Custom DNS servers"
		   });	
		addAnnotation
		  (getContainer_Dns_search(), 
		   source, 
		   new String[] {
			 "description", "Custom DNS search domains"
		   });	
		addAnnotation
		  (getContainer_Cap_add(), 
		   source, 
		   new String[] {
			 "description", "Add container capabilities"
		   });	
		addAnnotation
		  (getContainer_Cap_drop(), 
		   source, 
		   new String[] {
			 "description", "Drop container capabilities"
		   });	
		addAnnotation
		  (getContainer_Working_dir(), 
		   source, 
		   new String[] {
			 "description", "Working directory"
		   });	
		addAnnotation
		  (getContainer_Entrypoint(), 
		   source, 
		   new String[] {
			 "description", "Entry point"
		   });	
		addAnnotation
		  (getContainer_User(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Domainname(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Mem_limit(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Memory_swap(), 
		   source, 
		   new String[] {
			 "description", "Memory swap limit"
		   });	
		addAnnotation
		  (getContainer_Privileged(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Restart(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Stdin_open(), 
		   source, 
		   new String[] {
			 "description", ""
		   });	
		addAnnotation
		  (getContainer_Interactive(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Tty(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Cpu_shares(), 
		   source, 
		   new String[] {
			 "description", "CPU shares for this Docker container"
		   });	
		addAnnotation
		  (getContainer_Pid(), 
		   source, 
		   new String[] {
			 "description", "\'\' or \'host\'"
		   });	
		addAnnotation
		  (getContainer_Ipc(), 
		   source, 
		   new String[] {
			 "description", "\'\', \'host\' or \'container:[name:id]\'"
		   });	
		addAnnotation
		  (getContainer_Add_host(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Mac_address(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Rm(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Security_opt(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Device(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Lxc_conf(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getContainer_Cpuset(), 
		   source, 
		   new String[] {
			 "description", ""
		   });	
		addAnnotation
		  (getContainer_Publish_all(), 
		   source, 
		   new String[] {
			 "description", "Publish all exposed ports to random ports on the host interfaces"
		   });	
		addAnnotation
		  (getContainer_Read_only(), 
		   source, 
		   new String[] {
			 "description", "Mount the container\'s root filesystem as read only"
		   });	
		addAnnotation
		  (getContainer_Monitored(), 
		   source, 
		   new String[] {
			 "description", "This attribut allow us to monitor the container"
		   });	
		addAnnotation
		  (getContainer_Cpu_used(), 
		   source, 
		   new String[] {
			 "description", "CPU consumed by the conatiner"
		   });	
		addAnnotation
		  (getContainer_Memory_used(), 
		   source, 
		   new String[] {
			 "description", "Memory consumed by the container"
		   });	
		addAnnotation
		  (getContainer_Cpu_percent(), 
		   source, 
		   new String[] {
			 "description", "The percentage of CPU used."
		   });	
		addAnnotation
		  (getContainer_Memory_percent(), 
		   source, 
		   new String[] {
			 "description", "The percentage of Memory used."
		   });	
		addAnnotation
		  (getContainer_Disk_used(), 
		   source, 
		   new String[] {
			 "description", "The disk used."
		   });	
		addAnnotation
		  (getContainer_Disk_percent(), 
		   source, 
		   new String[] {
			 "description", "The percentage of disk used."
		   });	
		addAnnotation
		  (getContainer_Bandwidth_used(), 
		   source, 
		   new String[] {
			 "description", "The bandwidth used by the container."
		   });	
		addAnnotation
		  (getContainer_Bandwidth_percent(), 
		   source, 
		   new String[] {
			 "description", "The percentage of bandwith used."
		   });	
		addAnnotation
		  (getContainer_Monitoring_interval(), 
		   source, 
		   new String[] {
			 "description", "The time interval in which the metrics are retrieved from container. This value is in milliseconds."
		   });	
		addAnnotation
		  (getContainer_Cpu_max_value(), 
		   source, 
		   new String[] {
			 "description", "The CPU max value espression used by the Gauge."
		   });	
		addAnnotation
		  (getContainer_Memory_max_value(), 
		   source, 
		   new String[] {
			 "description", "The memory max value expression used by the gauge."
		   });	
		addAnnotation
		  (getContainer_Core_max(), 
		   source, 
		   new String[] {
			 "description", "The maximum number core availbale on the machine. This value is setting dynamically."
		   });	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "title", "Link between containers"
		   });	
		addAnnotation
		  (getLink_Alias(), 
		   source, 
		   new String[] {
			 "description", "The alias of this Link instance"
		   });	
		addAnnotation
		  (networkLinkEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (volumesfromEClass, 
		   source, 
		   new String[] {
			 "title", "VolumsFrom"
		   });	
		addAnnotation
		  (getVolumesfrom_Mode(), 
		   source, 
		   new String[] {
			 "description", "The mode of this VolumesFrom instance"
		   });	
		addAnnotation
		  (containsEClass, 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (machineEClass, 
		   source, 
		   new String[] {
			 "title", "Machine Resource"
		   });	
		addAnnotation
		  (getMachine_Name(), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getMachine_Engine_install_url(), 
		   source, 
		   new String[] {
			 "description", "Custom URL to use for engine installation [$MACHINE_DOCKER_INSTALL_URL]"
		   });	
		addAnnotation
		  (getMachine_Engine_opt(), 
		   source, 
		   new String[] {
			 "description", "Specify arbitrary flags to include with the created engine in the form flag=value"
		   });	
		addAnnotation
		  (getMachine_Engine_insecure_registry(), 
		   source, 
		   new String[] {
			 "description", "Specify insecure registries to allow with the created engine"
		   });	
		addAnnotation
		  (getMachine_Engine_registry_mirror(), 
		   source, 
		   new String[] {
			 "description", "Specify registry mirrors to use [$ENGINE_REGISTRY_MIRROR]"
		   });	
		addAnnotation
		  (getMachine_Engine_label(), 
		   source, 
		   new String[] {
			 "description", "Specify labels for the created engine"
		   });	
		addAnnotation
		  (getMachine_Engine_storage_driver(), 
		   source, 
		   new String[] {
			 "description", "Specify a storage driver to use with the engine"
		   });	
		addAnnotation
		  (getMachine_Engine_env(), 
		   source, 
		   new String[] {
			 "description", "Specify environment variables to set in the engine"
		   });	
		addAnnotation
		  (getMachine_Swarm(), 
		   source, 
		   new String[] {
			 "description", "Configure Machine with Swarm"
		   });	
		addAnnotation
		  (getMachine_Swarm_image(), 
		   source, 
		   new String[] {
			 "description", "Specify Docker image to use for Swarm [$MACHINE_SWARM_IMAGE]"
		   });	
		addAnnotation
		  (getMachine_Swarm_master(), 
		   source, 
		   new String[] {
			 "description", "Configure Machine to be a Swarm master"
		   });	
		addAnnotation
		  (getMachine_Swarm_discovery(), 
		   source, 
		   new String[] {
			 "description", "Discovery service to use with Swarm"
		   });	
		addAnnotation
		  (getMachine_Swarm_strategy(), 
		   source, 
		   new String[] {
			 "description", "Define a default scheduling strategy for Swarm"
		   });	
		addAnnotation
		  (getMachine_Swarm_opt(), 
		   source, 
		   new String[] {
			 "description", "Define arbitrary flags for swarm"
		   });	
		addAnnotation
		  (getMachine_Swarm_host(), 
		   source, 
		   new String[] {
			 "description", "ip/socket to listen on for Swarm master"
		   });	
		addAnnotation
		  (getMachine_Swarm_addr(), 
		   source, 
		   new String[] {
			 "description", "addr to advertise for Swarm (default: detect and use the machine IP)"
		   });	
		addAnnotation
		  (getMachine_Swarm_experimental(), 
		   source, 
		   new String[] {
			 "description", "Enable Swarm experimental features"
		   });	
		addAnnotation
		  (getMachine_Tls_san(), 
		   source, 
		   new String[] {
			 "description", "Support extra SANs for TLS certs"
		   });	
		addAnnotation
		  (volumeEClass, 
		   source, 
		   new String[] {
			 "title", "Volume disk"
		   });	
		addAnnotation
		  (getVolume_Driver(), 
		   source, 
		   new String[] {
			 "description", " Specify volume driver name (default \"local\")"
		   });	
		addAnnotation
		  (getVolume_Labels(), 
		   source, 
		   new String[] {
			 "description", "Set metadata for a volume (default [])"
		   });	
		addAnnotation
		  (getVolume_Options(), 
		   source, 
		   new String[] {
			 "description", "Set driver specific options (default map[])"
		   });	
		addAnnotation
		  (getVolume_Source(), 
		   source, 
		   new String[] {
			 "description", "The volume Mountpoint ex. the /host/directory"
		   });	
		addAnnotation
		  (getVolume_Destination(), 
		   source, 
		   new String[] {
			 "description", "The volume name inside the container ex. /container/path"
		   });	
		addAnnotation
		  (getVolume_Mode(), 
		   source, 
		   new String[] {
			 "description", "Specify volume driver name"
		   });	
		addAnnotation
		  (getVolume_Rw(), 
		   source, 
		   new String[] {
			 "description", "The volume Read/Write access"
		   });	
		addAnnotation
		  (getVolume_Propagation(), 
		   source, 
		   new String[] {
			 "description", "The volume propagation"
		   });	
		addAnnotation
		  (getVolume_Name(), 
		   source, 
		   new String[] {
			 "description", "The volume name."
		   });	
		addAnnotation
		  (networkEClass, 
		   source, 
		   new String[] {
			 "title", "Network resource"
		   });	
		addAnnotation
		  (getNetwork_NetworkId(), 
		   source, 
		   new String[] {
			 "description", "The network ID retreived when the creation is done"
		   });	
		addAnnotation
		  (getNetwork_Name(), 
		   source, 
		   new String[] {
			 "description", "The network name"
		   });	
		addAnnotation
		  (getNetwork_Aux_address(), 
		   source, 
		   new String[] {
			 "description", "Auxiliary IPv4 or IPv6 addresses used by Network driver (default map[])"
		   });	
		addAnnotation
		  (getNetwork_Driver(), 
		   source, 
		   new String[] {
			 "description", "Driver to manage the Network (default \"bridge\")"
		   });	
		addAnnotation
		  (getNetwork_Gateway(), 
		   source, 
		   new String[] {
			 "description", "IPv4 or IPv6 Gateway for the master subnet (default [])"
		   });	
		addAnnotation
		  (getNetwork_Internal(), 
		   source, 
		   new String[] {
			 "description", "Restrict external access to the network"
		   });	
		addAnnotation
		  (getNetwork_Ip_range(), 
		   source, 
		   new String[] {
			 "description", "Allocate container ip from a sub-range (default [])"
		   });	
		addAnnotation
		  (getNetwork_Ipam_driver(), 
		   source, 
		   new String[] {
			 "description", "IP Address Management Driver (default \"default\")"
		   });	
		addAnnotation
		  (getNetwork_Ipam_opt(), 
		   source, 
		   new String[] {
			 "description", "Set IPAM driver specific options (default map[])"
		   });	
		addAnnotation
		  (getNetwork_Ipv6(), 
		   source, 
		   new String[] {
			 "description", "Enable IPv6 networking"
		   });	
		addAnnotation
		  (getNetwork_Opt(), 
		   source, 
		   new String[] {
			 "description", "Set driver specific options (default map[])"
		   });	
		addAnnotation
		  (getNetwork_Subnet(), 
		   source, 
		   new String[] {
			 "description", "Subnet in CIDR format that represents a network segment (default [])"
		   });	
		addAnnotation
		  (machine_GenericEClass, 
		   source, 
		   new String[] {
			 "title", "Create machines using an existing VM/Host with SSH"
		   });	
		addAnnotation
		  (getMachine_Generic_Engine_port(), 
		   source, 
		   new String[] {
			 "description", "Port to use for Docker Daemon (Note: This flag will not work with boot2docker)."
		   });	
		addAnnotation
		  (getMachine_Generic_Ip_address(), 
		   source, 
		   new String[] {
			 "description", " required IP Address of host."
		   });	
		addAnnotation
		  (getMachine_Generic_Ssh_key(), 
		   source, 
		   new String[] {
			 "description", "Path to the SSH user private key."
		   });	
		addAnnotation
		  (getMachine_Generic_Ssh_user(), 
		   source, 
		   new String[] {
			 "description", "SSH username used to connect."
		   });	
		addAnnotation
		  (getMachine_Generic_Ssh_port(), 
		   source, 
		   new String[] {
			 "description", "Port to use for SSH."
		   });	
		addAnnotation
		  (machine_Amazon_EC2EClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Amazon EC2"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Access_key(), 
		   source, 
		   new String[] {
			 "description", "Your access key id for the Amazon Web Services API"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Ami(), 
		   source, 
		   new String[] {
			 "description", "The AMI ID of the instance to use"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Instance_type(), 
		   source, 
		   new String[] {
			 "description", "The instance type to run"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Region(), 
		   source, 
		   new String[] {
			 "description", "The region to use when launching the instance"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Root_size(), 
		   source, 
		   new String[] {
			 "description", "The root disk size of the instance (in GB)"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Secret_key(), 
		   source, 
		   new String[] {
			 "description", "Your secret access key for the Amazon Web Services API"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Security_group(), 
		   source, 
		   new String[] {
			 "description", "AWS VPC security group name"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Session_token(), 
		   source, 
		   new String[] {
			 "description", "Your session token for the Amazon Web Services API"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Subnet_id(), 
		   source, 
		   new String[] {
			 "description", "AWS VPC subnet id"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Vpc_id(), 
		   source, 
		   new String[] {
			 "description", "Your VPC ID to launch the instance in"
		   });	
		addAnnotation
		  (getMachine_Amazon_EC2_Zone(), 
		   source, 
		   new String[] {
			 "description", "The AWS zone launch the instance in (i.e. one of a,b,c,d,e)"
		   });	
		addAnnotation
		  (machine_Digital_OceanEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Digital Ocean"
		   });	
		addAnnotation
		  (getMachine_Digital_Ocean_Access_token(), 
		   source, 
		   new String[] {
			 "description", "Your personal access token for the Digital Ocean API"
		   });	
		addAnnotation
		  (getMachine_Digital_Ocean_Image(), 
		   source, 
		   new String[] {
			 "description", "The name of the Digital Ocean image to use"
		   });	
		addAnnotation
		  (getMachine_Digital_Ocean_Region(), 
		   source, 
		   new String[] {
			 "description", "The region to create the droplet in"
		   });	
		addAnnotation
		  (getMachine_Digital_Ocean_Size(), 
		   source, 
		   new String[] {
			 "description", "The size of the Digital Ocean driver (larger than default options are of the form 2gb)"
		   });	
		addAnnotation
		  (machine_Google_Compute_EngineEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Google Compute Engine"
		   });	
		addAnnotation
		  (getMachine_Google_Compute_Engine_Zone(), 
		   source, 
		   new String[] {
			 "description", "The zone to launch the instance"
		   });	
		addAnnotation
		  (getMachine_Google_Compute_Engine_Machine_type(), 
		   source, 
		   new String[] {
			 "description", "The type of instance"
		   });	
		addAnnotation
		  (getMachine_Google_Compute_Engine_Username(), 
		   source, 
		   new String[] {
			 "description", "The username to use for the instance"
		   });	
		addAnnotation
		  (getMachine_Google_Compute_Engine_Instance_name(), 
		   source, 
		   new String[] {
			 "description", "The name of the instance"
		   });	
		addAnnotation
		  (getMachine_Google_Compute_Engine_Project(), 
		   source, 
		   new String[] {
			 "description", "The name of your project to use when launching the instance"
		   });	
		addAnnotation
		  (machine_IBM_SoftLayerEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on IBM SoftLayer"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Api_endpoint(), 
		   source, 
		   new String[] {
			 "description", "Change softlayer API endpoint"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_User(), 
		   source, 
		   new String[] {
			 "description", "username for your softlayer account, api key needs to match this user"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Api_key(), 
		   source, 
		   new String[] {
			 "description", "API key for your user account"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Cpu(), 
		   source, 
		   new String[] {
			 "description", "Number of CPU\'s for the machine"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Disk_size(), 
		   source, 
		   new String[] {
			 "description", "Size of the disk in MB. 0 sets the softlayer default"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Domain(), 
		   source, 
		   new String[] {
			 "description", "domain name for the machine"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Hourly_billing(), 
		   source, 
		   new String[] {
			 "description", "Sets the hourly billing flag (default), otherwise uses monthly billing"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Image(), 
		   source, 
		   new String[] {
			 "description", "OS Image to use"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Local_disk(), 
		   source, 
		   new String[] {
			 "description", "Use local machine disk instead of softlayer SAN"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Private_net_only(), 
		   source, 
		   new String[] {
			 "description", "Disable public networking"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Region(), 
		   source, 
		   new String[] {
			 "description", "softlayer region"
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Public_vlan_id(), 
		   source, 
		   new String[] {
			 "description", "Your public VLAN ID."
		   });	
		addAnnotation
		  (getMachine_IBM_SoftLayer_Private_vlan_id(), 
		   source, 
		   new String[] {
			 "description", "Your private VLAN ID."
		   });	
		addAnnotation
		  (machine_Microsoft_AzureEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Microsoft Azure"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Subscription_id(), 
		   source, 
		   new String[] {
			 "description", "Your Azure subscription ID (A GUID like d255d8d7-5af0-4f5c-8a3e-1545044b861e)"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Subscription_cert(), 
		   source, 
		   new String[] {
			 "description", "Your Azure subscription cert"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Environment(), 
		   source, 
		   new String[] {
			 "description", "Azure environment (e.g. AzurePublicCloud, AzureChinaCloud)."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Location(), 
		   source, 
		   new String[] {
			 "description", "Azure region to create the virtual machine."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Resource_group(), 
		   source, 
		   new String[] {
			 "description", "Azure Resource Group name to create the resources in."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Size(), 
		   source, 
		   new String[] {
			 "description", "Size for Azure Virtual Machine."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Ssh_user(), 
		   source, 
		   new String[] {
			 "description", "Username for SSH login."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Vnet(), 
		   source, 
		   new String[] {
			 "description", "Azure Virtual Network name to connect the virtual machine. To specify a Virtual Network from another resource group, use resourcegroup:vnet-name format."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Subnet(), 
		   source, 
		   new String[] {
			 "description", "Azure Subnet Name to be used within the Virtual Network."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Subnet_prefix(), 
		   source, 
		   new String[] {
			 "description", "Private CIDR block. Used to create subnet if it does not exist. Must match in the case that the subnet does exist."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Availability_set(), 
		   source, 
		   new String[] {
			 "description", "Azure Availability Set to place the virtual machine into."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Open_port(), 
		   source, 
		   new String[] {
			 "description", " Make additional port number(s) accessible from the Internet"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Private_ip_address(), 
		   source, 
		   new String[] {
			 "description", "Specify a static private IP address for the machine."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_No_public_ip(), 
		   source, 
		   new String[] {
			 "description", "Do not create a public IP address for the machine (implies --azure-use-private-ip). "
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Static_public_ip(), 
		   source, 
		   new String[] {
			 "description", "Assign a static public IP address to the machine."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Docker_port(), 
		   source, 
		   new String[] {
			 "description", "Port number for Docker engine."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Use_private_ip(), 
		   source, 
		   new String[] {
			 "description", " Use private IP address of the machine to connect. It\u2019s useful for managing Docker machines from another machine on the same network e.g. while deploying Swarm."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Azure_Image(), 
		   source, 
		   new String[] {
			 "description", "Azure virtual machine image in the format of Publisher:Offer:Sku:Version"
		   });	
		addAnnotation
		  (machine_Microsoft_Hyper_VEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Microsoft Hyper-V"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Hyper_V_Virtual_switch(), 
		   source, 
		   new String[] {
			 "description", "Name of the virtual switch to use."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Hyper_V_Boot2docker_url(), 
		   source, 
		   new String[] {
			 "description", "The URL of the boot2docker iso. Defaults to the latest available version"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Hyper_V_Disk_size(), 
		   source, 
		   new String[] {
			 "description", "Size of disk for the host in MB"
		   });	
		addAnnotation
		  (getMachine_Microsoft_Hyper_V_Static_macaddress(), 
		   source, 
		   new String[] {
			 "description", "Hyper-V network adapter\u2019s static MAC address."
		   });	
		addAnnotation
		  (getMachine_Microsoft_Hyper_V_Vlan_id(), 
		   source, 
		   new String[] {
			 "description", "Hyper-V network adapter\u2019s VLAN ID if any."
		   });	
		addAnnotation
		  (machine_OpenStackEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on OpenStack"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Flavor_id(), 
		   source, 
		   new String[] {
			 "description", "The flavor ID to use when creating the machine"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Flavor_name(), 
		   source, 
		   new String[] {
			 "description", "The OS FLAVOR NAME"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Image_id(), 
		   source, 
		   new String[] {
			 "description", "The image ID to use when creating the machine"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Image_name(), 
		   source, 
		   new String[] {
			 "description", "The OS IMAGE NAME"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Auth_url(), 
		   source, 
		   new String[] {
			 "description", "Keystone service base URL"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Username(), 
		   source, 
		   new String[] {
			 "description", "User identifer to authenticate with"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Password(), 
		   source, 
		   new String[] {
			 "description", "User password. It can be omitted if the standard environment variable OS_PASSWORD is set."
		   });	
		addAnnotation
		  (getMachine_OpenStack_Tenant_name(), 
		   source, 
		   new String[] {
			 "description", "Identify the tenant in which the machine will be created"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Tenant_id(), 
		   source, 
		   new String[] {
			 "description", "Identify the tenant in which the machine will be created"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Region(), 
		   source, 
		   new String[] {
			 "description", "The region to work on. Can be omitted if there is only one region on the OpenStack"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Endpoint_type(), 
		   source, 
		   new String[] {
			 "description", "Endpoint type can be internalURL, adminURL on publicURL. If is a helper for the driver to choose the right URL in the OpenStack service catalog. If not provided the default id publicURL"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Net_id(), 
		   source, 
		   new String[] {
			 "description", "The private network id the machine will be connected on. If your OpenStack project project contains only one private network it will be use automatically"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Net_name(), 
		   source, 
		   new String[] {
			 "description", "The OS NETWORK NAME"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Sec_groups(), 
		   source, 
		   new String[] {
			 "description", "If security groups are available on your OpenStack you can specify a comma separated list to use for the machine (e.g. secgrp001,secgrp002)"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Floatingip_pool(), 
		   source, 
		   new String[] {
			 "description", "The IP pool that will be used to get a public IP an assign it to the machine. If there is an IP address already allocated but not assigned to any machine, this IP will be chosen and assigned to the machine. If there is no IP address already allocated a new IP will be allocated and assigned to the machine"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Active_timeout(), 
		   source, 
		   new String[] {
			 "description", "The OS ACTIVE TIMEOUT"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Availability_zone(), 
		   source, 
		   new String[] {
			 "description", "The OS AVAILABILITY ZONE"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Domain_id(), 
		   source, 
		   new String[] {
			 "description", "The OS DOMAIN ID"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Domain_name(), 
		   source, 
		   new String[] {
			 "description", "The OS DOMAIN NAME"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Insecure(), 
		   source, 
		   new String[] {
			 "description", "The OS INSECURE"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Ip_version(), 
		   source, 
		   new String[] {
			 "description", "The OS IP VERSION"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Keypair_name(), 
		   source, 
		   new String[] {
			 "description", "The OS KEYPAIR NAME"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Private_key_file(), 
		   source, 
		   new String[] {
			 "description", "The OS PRIVATE KEY FILE"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Ssh_port(), 
		   source, 
		   new String[] {
			 "description", "The OS SSH PORT"
		   });	
		addAnnotation
		  (getMachine_OpenStack_Ssh_user(), 
		   source, 
		   new String[] {
			 "description", "The OS SSH USER"
		   });	
		addAnnotation
		  (machine_RackspaceEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on Rackspace cloud"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Username(), 
		   source, 
		   new String[] {
			 "description", "Rackspace account username"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Api_key(), 
		   source, 
		   new String[] {
			 "description", "Rackspace API key"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Region(), 
		   source, 
		   new String[] {
			 "description", "Rackspace region name"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Endpoint_type(), 
		   source, 
		   new String[] {
			 "description", "Rackspace endpoint type (adminURL, internalURL or the default publicURL)"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Image_id(), 
		   source, 
		   new String[] {
			 "description", "Rackspace image ID "
		   });	
		addAnnotation
		  (getMachine_Rackspace_Flavor_id(), 
		   source, 
		   new String[] {
			 "description", "Rackspace flavor ID"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Ssh_user(), 
		   source, 
		   new String[] {
			 "description", "SSH user for the newly booted machine"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Ssh_port(), 
		   source, 
		   new String[] {
			 "description", "SSH port for the newly booted machine"
		   });	
		addAnnotation
		  (getMachine_Rackspace_Docker_install(), 
		   source, 
		   new String[] {
			 "description", "Set if Docker has to be installed on the machine."
		   });	
		addAnnotation
		  (machine_VirtualBoxEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on VirtualBox"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Boot2docker_url(), 
		   source, 
		   new String[] {
			 "description", "The URL of the boot2docker image. Default to the latest available version"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Disk_size(), 
		   source, 
		   new String[] {
			 "description", "Size of disk for the host in MB"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Host_dns_resolver(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX HOST DNS RESOLVER\t"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Import_boot2docker_vm(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX BOOT2DOCKER IMPORT VM"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Hostonly_cidr(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX HOSTONLY CIDR"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Hostonly_nictype(), 
		   source, 
		   new String[] {
			 "description", "The \tVIRTUALBOX HOSTONLY NIC TYPE"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Hostonly_nicpromisc(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX HOSTONLY NIC PROMISC"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_No_share(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX NO SHARE"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_No_dns_proxy(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX NO DNS PROXY"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_No_vtx_check(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX NO VTX CHECK"
		   });	
		addAnnotation
		  (getMachine_VirtualBox_Share_folder(), 
		   source, 
		   new String[] {
			 "description", "The VIRTUALBOX SHARE FOLDER"
		   });	
		addAnnotation
		  (machine_VMware_FusionEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on VMware Fusion"
		   });	
		addAnnotation
		  (getMachine_VMware_Fusion_Boot2docker_url(), 
		   source, 
		   new String[] {
			 "description", "URL for boot2docker image"
		   });	
		addAnnotation
		  (getMachine_VMware_Fusion_Disk_size(), 
		   source, 
		   new String[] {
			 "description", "Size of disk for host VM (in MB)"
		   });	
		addAnnotation
		  (getMachine_VMware_Fusion_Memory_size(), 
		   source, 
		   new String[] {
			 "description", "Size of memory for host VM (in MB)"
		   });	
		addAnnotation
		  (getMachine_VMware_Fusion_No_share(), 
		   source, 
		   new String[] {
			 "description", "Disable the mount of your home directory."
		   });	
		addAnnotation
		  (machine_VMware_vCloud_AirEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on VMware vCloud Air"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Username(), 
		   source, 
		   new String[] {
			 "description", "vCloud Air Username"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Password(), 
		   source, 
		   new String[] {
			 "description", "vCloud Air Password"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Catalog(), 
		   source, 
		   new String[] {
			 "description", "Catalog "
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Catalogitem(), 
		   source, 
		   new String[] {
			 "description", "Catalog Item "
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Computeid(), 
		   source, 
		   new String[] {
			 "description", "Compute ID (if using Dedicated Cloud)"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Cpu_count(), 
		   source, 
		   new String[] {
			 "description", "VM Cpu Count"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Docker_port(), 
		   source, 
		   new String[] {
			 "description", "Docker port "
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Edgegateway(), 
		   source, 
		   new String[] {
			 "description", "Organization Edge Gateway"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Memory_size(), 
		   source, 
		   new String[] {
			 "description", "VM Memory Size in MB"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Vapp_name(), 
		   source, 
		   new String[] {
			 "description", "vApp Name"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Orgvdcnetwork(), 
		   source, 
		   new String[] {
			 "description", "Organization VDC Network to attach"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Provision(), 
		   source, 
		   new String[] {
			 "description", "Install Docker binaries"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Publicip(), 
		   source, 
		   new String[] {
			 "description", "Org Public IP to use"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Ssh_port(), 
		   source, 
		   new String[] {
			 "description", "SSH port"
		   });	
		addAnnotation
		  (getMachine_VMware_vCloud_Air_Vdcid(), 
		   source, 
		   new String[] {
			 "description", "Virtual Data Center ID"
		   });	
		addAnnotation
		  (machine_VMware_vSphereEClass, 
		   source, 
		   new String[] {
			 "title", "Machine on VMware vSphere"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Username(), 
		   source, 
		   new String[] {
			 "description", "vSphere Username"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Password(), 
		   source, 
		   new String[] {
			 "description", "vSphere Password"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Boot2docker_url(), 
		   source, 
		   new String[] {
			 "description", "URL for boot2docker image"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Compute_ip(), 
		   source, 
		   new String[] {
			 "description", "Compute host IP where the Docker VM will be instantiated"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Cpu_count(), 
		   source, 
		   new String[] {
			 "description", "CPU number for Docker VM"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Datacenter(), 
		   source, 
		   new String[] {
			 "description", "Datacenter for Docker VM (must be set to ha-datacenter when connecting to a single host)"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Datastore(), 
		   source, 
		   new String[] {
			 "description", "Datastore for Docker VM"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Disk_size(), 
		   source, 
		   new String[] {
			 "description", "Size of disk for Docker VM (in MB)"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Memory_size(), 
		   source, 
		   new String[] {
			 "description", "Size of memory for Docker VM (in MB) "
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Network(), 
		   source, 
		   new String[] {
			 "description", "Network where the Docker VM will be attached"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Pool(), 
		   source, 
		   new String[] {
			 "description", "Resource pool for Docker VM"
		   });	
		addAnnotation
		  (getMachine_VMware_vSphere_Vcenter(), 
		   source, 
		   new String[] {
			 "description", " IP/hostname for vCenter (or ESXi if connecting directly to a single host)"
		   });	
		addAnnotation
		  (machine_ExoscaleEClass, 
		   source, 
		   new String[] {
			 "title", "Machine Exoscale"
		   });	
		addAnnotation
		  (getMachine_Exoscale_Url(), 
		   source, 
		   new String[] {
			 "description", "Your API endpoint."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Api_key(), 
		   source, 
		   new String[] {
			 "description", "required Your API key."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Api_secret_key(), 
		   source, 
		   new String[] {
			 "description", "required Your API secret key."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Instance_profile(), 
		   source, 
		   new String[] {
			 "description", "Instance profile."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Image(), 
		   source, 
		   new String[] {
			 "description", "Image template (e.g. ubuntu-16.04, ubuntu-15.10)."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Security_group(), 
		   source, 
		   new String[] {
			 "description", "Security group. It will be created if it doesn\u2019t exist."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Availability_zone(), 
		   source, 
		   new String[] {
			 "description", "Exoscale availability zone."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Ssh_user(), 
		   source, 
		   new String[] {
			 "description", "SSH username, which must match the default SSH user for the used image."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Userdata(), 
		   source, 
		   new String[] {
			 "description", "Path to file containing user data for cloud-init."
		   });	
		addAnnotation
		  (getMachine_Exoscale_Affinity_group(), 
		   source, 
		   new String[] {
			 "description", "Affinity group the machine will be started in."
		   });
	}

} //DockerPackageImpl
