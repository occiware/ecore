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
package org.occiware.clouddesigner.occi.simulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;

import org.occiware.clouddesigner.occi.simulation.SimulationFactory;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationResource;

import org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler;
import org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel;
import org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler;

import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPackageImpl extends EPackageImpl implements SimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType utilizationModelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ramProvisionerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bwProvisionerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cloudletSchedulerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vmSchedulerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mbEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType peProvisionerEDataType = null;

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulationPackageImpl() {
		super(eNS_URI, SimulationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulationPackage init() {
		if (isInited) return (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);

		// Obtain or create and register package
		SimulationPackageImpl theSimulationPackage = (SimulationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theSimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimulationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulationPackage.eNS_URI, theSimulationPackage);
		return theSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationResource() {
		return simulationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getfloatType() {
		return floatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUtilizationModel() {
		return utilizationModelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdoubleType() {
		return doubleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRamProvisioner() {
		return ramProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBwProvisioner() {
		return bwProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCloudletScheduler() {
		return cloudletSchedulerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVmScheduler() {
		return vmSchedulerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMB() {
		return mbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeProvisioner() {
		return peProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactory getSimulationFactory() {
		return (SimulationFactory)getEFactoryInstance();
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
		simulationResourceEClass = createEClass(SIMULATION_RESOURCE);

		// Create data types
		floatTypeEDataType = createEDataType(FLOAT_TYPE);
		utilizationModelEDataType = createEDataType(UTILIZATION_MODEL);
		doubleTypeEDataType = createEDataType(DOUBLE_TYPE);
		ramProvisionerEDataType = createEDataType(RAM_PROVISIONER);
		bwProvisionerEDataType = createEDataType(BW_PROVISIONER);
		cloudletSchedulerEDataType = createEDataType(CLOUDLET_SCHEDULER);
		vmSchedulerEDataType = createEDataType(VM_SCHEDULER);
		mbEDataType = createEDataType(MB);
		peProvisionerEDataType = createEDataType(PE_PROVISIONER);
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
		simulationResourceEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationResourceEClass, SimulationResource.class, "SimulationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(floatTypeEDataType, Float.class, "floatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(utilizationModelEDataType, UtilizationModel.class, "UtilizationModel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleTypeEDataType, Double.class, "doubleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ramProvisionerEDataType, RamProvisioner.class, "RamProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bwProvisionerEDataType, BwProvisioner.class, "BwProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cloudletSchedulerEDataType, CloudletScheduler.class, "CloudletScheduler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vmSchedulerEDataType, VmScheduler.class, "VmScheduler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mbEDataType, float.class, "MB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(peProvisionerEDataType, PeProvisioner.class, "PeProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (simulationResourceEClass, 
		   source, 
		   new String[] {
			 "title", ""
		   });
	}

} //SimulationPackageImpl
