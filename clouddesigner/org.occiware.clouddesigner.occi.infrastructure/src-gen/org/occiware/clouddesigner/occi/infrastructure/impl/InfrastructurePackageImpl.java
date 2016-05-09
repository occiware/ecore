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
package org.occiware.clouddesigner.occi.infrastructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.Allocation;
import org.occiware.clouddesigner.occi.infrastructure.Architecture;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.NetworkInterfaceStatus;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.occiware.clouddesigner.occi.infrastructure.Networkinterface;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.SaveMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.Storage;
import org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus;
import org.occiware.clouddesigner.occi.infrastructure.StorageStatus;
import org.occiware.clouddesigner.occi.infrastructure.Storagelink;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

import org.occiware.clouddesigner.occi.infrastructure.util.InfrastructureValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {
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
	private EClass computeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suspendMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkInterfaceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum architectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stopMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageLinkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saveMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vlanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coreEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gHzEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType giBEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType macEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shareEDataType = null;

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
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited) return (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfrastructurePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInfrastructurePackage.createPackageContents();

		// Initialize created meta-data
		theInfrastructurePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInfrastructurePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InfrastructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInfrastructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
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
	public EAttribute getNetwork_Vlan() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Label() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_State() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Message() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetwork__Up() {
		return networkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetwork__Down() {
		return networkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompute() {
		return computeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Architecture() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Cores() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Hostname() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Share() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Speed() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Memory() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_State() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_Message() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Start() {
		return computeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Stop__StopMethod() {
		return computeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Restart__RestartMethod() {
		return computeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Suspend__SuspendMethod() {
		return computeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Save__SaveMethod_String() {
		return computeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Size() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_State() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Message() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorage__Online() {
		return storageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorage__Offline() {
		return storageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoragelink() {
		return storagelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_Deviceid() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_Mountpoint() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_State() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_Message() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkinterface() {
		return networkinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_Interface() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_Mac() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_State() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_Message() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuspendMethod() {
		return suspendMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkStatus() {
		return networkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComputeStatus() {
		return computeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkInterfaceStatus() {
		return networkInterfaceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArchitecture() {
		return architectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStopMethod() {
		return stopMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestartMethod() {
		return restartMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllocation() {
		return allocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageStatus() {
		return storageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageLinkStatus() {
		return storageLinkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSaveMethod() {
		return saveMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVlan() {
		return vlanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddress() {
		return ipAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCore() {
		return coreEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGHz() {
		return gHzEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGiB() {
		return giBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddressRange() {
		return ipAddressRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMac() {
		return macEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShare() {
		return shareEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory)getEFactoryInstance();
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
		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__VLAN);
		createEAttribute(networkEClass, NETWORK__LABEL);
		createEAttribute(networkEClass, NETWORK__STATE);
		createEAttribute(networkEClass, NETWORK__MESSAGE);
		createEOperation(networkEClass, NETWORK___UP);
		createEOperation(networkEClass, NETWORK___DOWN);

		computeEClass = createEClass(COMPUTE);
		createEAttribute(computeEClass, COMPUTE__ARCHITECTURE);
		createEAttribute(computeEClass, COMPUTE__CORES);
		createEAttribute(computeEClass, COMPUTE__HOSTNAME);
		createEAttribute(computeEClass, COMPUTE__SHARE);
		createEAttribute(computeEClass, COMPUTE__SPEED);
		createEAttribute(computeEClass, COMPUTE__MEMORY);
		createEAttribute(computeEClass, COMPUTE__STATE);
		createEAttribute(computeEClass, COMPUTE__MESSAGE);
		createEOperation(computeEClass, COMPUTE___START);
		createEOperation(computeEClass, COMPUTE___STOP__STOPMETHOD);
		createEOperation(computeEClass, COMPUTE___RESTART__RESTARTMETHOD);
		createEOperation(computeEClass, COMPUTE___SUSPEND__SUSPENDMETHOD);
		createEOperation(computeEClass, COMPUTE___SAVE__SAVEMETHOD_STRING);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__SIZE);
		createEAttribute(storageEClass, STORAGE__STATE);
		createEAttribute(storageEClass, STORAGE__MESSAGE);
		createEOperation(storageEClass, STORAGE___ONLINE);
		createEOperation(storageEClass, STORAGE___OFFLINE);

		storagelinkEClass = createEClass(STORAGELINK);
		createEAttribute(storagelinkEClass, STORAGELINK__DEVICEID);
		createEAttribute(storagelinkEClass, STORAGELINK__MOUNTPOINT);
		createEAttribute(storagelinkEClass, STORAGELINK__STATE);
		createEAttribute(storagelinkEClass, STORAGELINK__MESSAGE);

		networkinterfaceEClass = createEClass(NETWORKINTERFACE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__INTERFACE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__MAC);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__STATE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__MESSAGE);

		// Create enums
		suspendMethodEEnum = createEEnum(SUSPEND_METHOD);
		networkStatusEEnum = createEEnum(NETWORK_STATUS);
		computeStatusEEnum = createEEnum(COMPUTE_STATUS);
		networkInterfaceStatusEEnum = createEEnum(NETWORK_INTERFACE_STATUS);
		architectureEEnum = createEEnum(ARCHITECTURE);
		stopMethodEEnum = createEEnum(STOP_METHOD);
		restartMethodEEnum = createEEnum(RESTART_METHOD);
		allocationEEnum = createEEnum(ALLOCATION);
		storageStatusEEnum = createEEnum(STORAGE_STATUS);
		storageLinkStatusEEnum = createEEnum(STORAGE_LINK_STATUS);
		saveMethodEEnum = createEEnum(SAVE_METHOD);

		// Create data types
		vlanEDataType = createEDataType(VLAN);
		tokenEDataType = createEDataType(TOKEN);
		ipAddressEDataType = createEDataType(IP_ADDRESS);
		coreEDataType = createEDataType(CORE);
		gHzEDataType = createEDataType(GHZ);
		giBEDataType = createEDataType(GI_B);
		ipAddressRangeEDataType = createEDataType(IP_ADDRESS_RANGE);
		macEDataType = createEDataType(MAC);
		shareEDataType = createEDataType(SHARE);
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
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		networkEClass.getESuperTypes().add(theOCCIPackage.getResource());
		computeEClass.getESuperTypes().add(theOCCIPackage.getResource());
		storageEClass.getESuperTypes().add(theOCCIPackage.getResource());
		storagelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networkinterfaceEClass.getESuperTypes().add(theOCCIPackage.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Vlan(), this.getVlan(), "vlan", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Label(), this.getToken(), "label", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_State(), this.getNetworkStatus(), "state", "inactive", 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Message(), theOCCIPackage.getString(), "message", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNetwork__Up(), null, "up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNetwork__Down(), null, "down", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computeEClass, Compute.class, "Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompute_Architecture(), this.getArchitecture(), "architecture", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Cores(), this.getCore(), "cores", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Hostname(), theOCCIPackage.getString(), "hostname", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Share(), this.getShare(), "share", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Speed(), this.getGHz(), "speed", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Memory(), this.getGiB(), "memory", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_State(), this.getComputeStatus(), "state", "inactive", 1, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_Message(), theOCCIPackage.getString(), "message", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompute__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getCompute__Stop__StopMethod(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStopMethod(), "method", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Restart__RestartMethod(), null, "restart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRestartMethod(), "method", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Suspend__SuspendMethod(), null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSuspendMethod(), "method", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Save__SaveMethod_String(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSaveMethod(), "method", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_Size(), this.getGiB(), "size", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_State(), this.getStorageStatus(), "state", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Message(), theOCCIPackage.getString(), "message", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStorage__Online(), null, "online", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStorage__Offline(), null, "offline", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storagelinkEClass, Storagelink.class, "Storagelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoragelink_Deviceid(), theOCCIPackage.getString(), "deviceid", null, 1, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_Mountpoint(), theOCCIPackage.getString(), "mountpoint", null, 0, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_State(), this.getStorageLinkStatus(), "state", null, 1, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_Message(), theOCCIPackage.getString(), "message", null, 0, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkinterfaceEClass, Networkinterface.class, "Networkinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkinterface_Interface(), theOCCIPackage.getString(), "interface", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_Mac(), this.getMac(), "mac", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_State(), this.getNetworkInterfaceStatus(), "state", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_Message(), theOCCIPackage.getString(), "message", null, 0, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(suspendMethodEEnum, SuspendMethod.class, "SuspendMethod");
		addEEnumLiteral(suspendMethodEEnum, SuspendMethod.HIBERNATE);
		addEEnumLiteral(suspendMethodEEnum, SuspendMethod.SUSPEND);

		initEEnum(networkStatusEEnum, NetworkStatus.class, "NetworkStatus");
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.ACTIVE);
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.INACTIVE);
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.ERROR);

		initEEnum(computeStatusEEnum, ComputeStatus.class, "ComputeStatus");
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.ACTIVE);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.INACTIVE);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.SUSPENDED);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.ERROR);

		initEEnum(networkInterfaceStatusEEnum, NetworkInterfaceStatus.class, "NetworkInterfaceStatus");
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.ACTIVE);
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.INACTIVE);
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.ERROR);

		initEEnum(architectureEEnum, Architecture.class, "Architecture");
		addEEnumLiteral(architectureEEnum, Architecture.X86);
		addEEnumLiteral(architectureEEnum, Architecture.X64);

		initEEnum(stopMethodEEnum, StopMethod.class, "StopMethod");
		addEEnumLiteral(stopMethodEEnum, StopMethod.GRACEFUL);
		addEEnumLiteral(stopMethodEEnum, StopMethod.ACPIOFF);
		addEEnumLiteral(stopMethodEEnum, StopMethod.POWEROFF);

		initEEnum(restartMethodEEnum, RestartMethod.class, "RestartMethod");
		addEEnumLiteral(restartMethodEEnum, RestartMethod.GRACEFUL);
		addEEnumLiteral(restartMethodEEnum, RestartMethod.WARM);
		addEEnumLiteral(restartMethodEEnum, RestartMethod.COLD);

		initEEnum(allocationEEnum, Allocation.class, "Allocation");
		addEEnumLiteral(allocationEEnum, Allocation.DYNAMIC);
		addEEnumLiteral(allocationEEnum, Allocation.STATIC);

		initEEnum(storageStatusEEnum, StorageStatus.class, "StorageStatus");
		addEEnumLiteral(storageStatusEEnum, StorageStatus.ONLINE);
		addEEnumLiteral(storageStatusEEnum, StorageStatus.OFFLINE);
		addEEnumLiteral(storageStatusEEnum, StorageStatus.ERROR);

		initEEnum(storageLinkStatusEEnum, StorageLinkStatus.class, "StorageLinkStatus");
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.ACTIVE);
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.INACTIVE);
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.ERROR);

		initEEnum(saveMethodEEnum, SaveMethod.class, "SaveMethod");
		addEEnumLiteral(saveMethodEEnum, SaveMethod.HOT);
		addEEnumLiteral(saveMethodEEnum, SaveMethod.DEFERRED);

		// Initialize data types
		initEDataType(vlanEDataType, int.class, "Vlan", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tokenEDataType, String.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressEDataType, String.class, "IpAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coreEDataType, int.class, "Core", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gHzEDataType, float.class, "GHz", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(giBEDataType, float.class, "GiB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressRangeEDataType, String.class, "IpAddressRange", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(macEDataType, String.class, "Mac", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shareEDataType, int.class, "Share", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// OCCIE2Ecore
		createOCCIE2EcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (vlanEDataType, 
		   source, 
		   new String[] {
			 "minInclusive", "0",
			 "maxInclusive", "4095"
		   });	
		addAnnotation
		  (coreEDataType, 
		   source, 
		   new String[] {
			 "minExclusive", "0"
		   });	
		addAnnotation
		  (gHzEDataType, 
		   source, 
		   new String[] {
			 "minExclusive", "0"
		   });	
		addAnnotation
		  (giBEDataType, 
		   source, 
		   new String[] {
			 "minExclusive", "0"
		   });	
		addAnnotation
		  (shareEDataType, 
		   source, 
		   new String[] {
			 "minInclusive", "0"
		   });
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
		  (networkEClass, 
		   source, 
		   new String[] {
			 "title", "Network Resource"
		   });	
		addAnnotation
		  (getNetwork__Up(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getNetwork__Down(), 
		   source, 
		   new String[] {
			 "title", null
		   });	
		addAnnotation
		  (getNetwork_Vlan(), 
		   source, 
		   new String[] {
			 "description", "802.1q VLAN Identifier (e.g., 343)"
		   });	
		addAnnotation
		  (getNetwork_Label(), 
		   source, 
		   new String[] {
			 "description", "Tag based VLANs (e.g., external-dmz)"
		   });	
		addAnnotation
		  (getNetwork_State(), 
		   source, 
		   new String[] {
			 "description", "Current state of the instance"
		   });	
		addAnnotation
		  (getNetwork_Message(), 
		   source, 
		   new String[] {
			 "description", "Human-readable explanation of the current instance state"
		   });	
		addAnnotation
		  (computeEClass, 
		   source, 
		   new String[] {
			 "title", "Compute Resource"
		   });	
		addAnnotation
		  (getCompute__Start(), 
		   source, 
		   new String[] {
			 "title", "Start the system"
		   });	
		addAnnotation
		  (getCompute__Stop__StopMethod(), 
		   source, 
		   new String[] {
			 "title", "Stop the system (graceful, acpioff or poweroff)"
		   });	
		addAnnotation
		  ((getCompute__Stop__StopMethod()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getCompute__Restart__RestartMethod(), 
		   source, 
		   new String[] {
			 "title", "Restart the system (graceful, warm or cold)"
		   });	
		addAnnotation
		  ((getCompute__Restart__RestartMethod()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getCompute__Suspend__SuspendMethod(), 
		   source, 
		   new String[] {
			 "title", "Suspend the system (hibernate or in RAM)"
		   });	
		addAnnotation
		  ((getCompute__Suspend__SuspendMethod()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getCompute__Save__SaveMethod_String(), 
		   source, 
		   new String[] {
			 "title", "Save the system (hot, deferred)"
		   });	
		addAnnotation
		  ((getCompute__Save__SaveMethod_String()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  ((getCompute__Save__SaveMethod_String()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "description", null
		   });	
		addAnnotation
		  (getCompute_Architecture(), 
		   source, 
		   new String[] {
			 "description", "CPU Architecture of the instance"
		   });	
		addAnnotation
		  (getCompute_Cores(), 
		   source, 
		   new String[] {
			 "description", "Number of CPU cores assigned to the instance"
		   });	
		addAnnotation
		  (getCompute_Hostname(), 
		   source, 
		   new String[] {
			 "description", "Fully Qualified DNS hostname for the instance"
		   });	
		addAnnotation
		  (getCompute_Share(), 
		   source, 
		   new String[] {
			 "description", "Relative number of CPU shares for the instance"
		   });	
		addAnnotation
		  (getCompute_Speed(), 
		   source, 
		   new String[] {
			 "description", "CPU Clock frequency (speed) in gigahertz"
		   });	
		addAnnotation
		  (getCompute_Memory(), 
		   source, 
		   new String[] {
			 "description", "Maximum RAM in gigabytes allocated to the instance"
		   });	
		addAnnotation
		  (getCompute_State(), 
		   source, 
		   new String[] {
			 "description", "Current state of the instance"
		   });	
		addAnnotation
		  (getCompute_Message(), 
		   source, 
		   new String[] {
			 "description", "Human-readable explanation of the current instance state"
		   });	
		addAnnotation
		  (storageEClass, 
		   source, 
		   new String[] {
			 "title", "Storage Resource"
		   });	
		addAnnotation
		  (getStorage__Online(), 
		   source, 
		   new String[] {
			 "title", "Set storage online"
		   });	
		addAnnotation
		  (getStorage__Offline(), 
		   source, 
		   new String[] {
			 "title", "Set storage offline"
		   });	
		addAnnotation
		  (getStorage_Size(), 
		   source, 
		   new String[] {
			 "description", "Storage size of the instance in gigabytes"
		   });	
		addAnnotation
		  (getStorage_State(), 
		   source, 
		   new String[] {
			 "description", "Current status of the instance"
		   });	
		addAnnotation
		  (getStorage_Message(), 
		   source, 
		   new String[] {
			 "description", "Human-readable explanation of the current instance state"
		   });	
		addAnnotation
		  (storagelinkEClass, 
		   source, 
		   new String[] {
			 "title", "StorageLink Link"
		   });	
		addAnnotation
		  (getStoragelink_Deviceid(), 
		   source, 
		   new String[] {
			 "description", "Device identifier as defined by the OCCI service provider"
		   });	
		addAnnotation
		  (getStoragelink_Mountpoint(), 
		   source, 
		   new String[] {
			 "description", "Point to where the storage is mounted in the guest OS"
		   });	
		addAnnotation
		  (getStoragelink_State(), 
		   source, 
		   new String[] {
			 "description", "Current status of the instance"
		   });	
		addAnnotation
		  (getStoragelink_Message(), 
		   source, 
		   new String[] {
			 "description", "Human-readable explanation of the current instance state"
		   });	
		addAnnotation
		  (networkinterfaceEClass, 
		   source, 
		   new String[] {
			 "title", "NetworkInterface Link"
		   });	
		addAnnotation
		  (getNetworkinterface_Interface(), 
		   source, 
		   new String[] {
			 "description", "Identifier that relates the link to the link\'s device interface"
		   });	
		addAnnotation
		  (getNetworkinterface_Mac(), 
		   source, 
		   new String[] {
			 "description", "MAC address associated with the link\'s device interface"
		   });	
		addAnnotation
		  (getNetworkinterface_State(), 
		   source, 
		   new String[] {
			 "description", "Current status of the instance"
		   });	
		addAnnotation
		  (getNetworkinterface_Message(), 
		   source, 
		   new String[] {
			 "description", "Human-readable explanation of the current instance state"
		   });
	}

} //InfrastructurePackageImpl
