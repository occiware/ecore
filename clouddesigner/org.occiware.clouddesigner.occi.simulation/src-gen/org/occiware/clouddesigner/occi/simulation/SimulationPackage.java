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
package org.occiware.clouddesigner.occi.simulation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://occiware.org/simulation/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationPackage eINSTANCE = org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.SimulationResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationResourceImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getSimulationResource()
	 * @generated
	 */
	int SIMULATION_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESOURCE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>float Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getfloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 1;

	/**
	 * The meta object id for the '<em>Utilization Model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getUtilizationModel()
	 * @generated
	 */
	int UTILIZATION_MODEL = 2;

	/**
	 * The meta object id for the '<em>double Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getdoubleType()
	 * @generated
	 */
	int DOUBLE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Ram Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getRamProvisioner()
	 * @generated
	 */
	int RAM_PROVISIONER = 4;

	/**
	 * The meta object id for the '<em>Bw Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBwProvisioner()
	 * @generated
	 */
	int BW_PROVISIONER = 5;

	/**
	 * The meta object id for the '<em>Cloudlet Scheduler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
	 * @generated
	 */
	int CLOUDLET_SCHEDULER = 6;

	/**
	 * The meta object id for the '<em>Vm Scheduler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVmScheduler()
	 * @generated
	 */
	int VM_SCHEDULER = 7;

	/**
	 * The meta object id for the '<em>MB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getMB()
	 * @generated
	 */
	int MB = 8;

	/**
	 * The meta object id for the '<em>Pe Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPeProvisioner()
	 * @generated
	 */
	int PE_PROVISIONER = 9;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.SimulationResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationResource
	 * @generated
	 */
	EClass getSimulationResource();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>float Type</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getfloatType();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel <em>Utilization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Utilization Model</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel"
	 * @generated
	 */
	EDataType getUtilizationModel();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double Type</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdoubleType();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner <em>Ram Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ram Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner"
	 * @generated
	 */
	EDataType getRamProvisioner();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner <em>Bw Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bw Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner"
	 * @generated
	 */
	EDataType getBwProvisioner();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler <em>Cloudlet Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cloudlet Scheduler</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler"
	 * @generated
	 */
	EDataType getCloudletScheduler();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler <em>Vm Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vm Scheduler</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler"
	 * @generated
	 */
	EDataType getVmScheduler();

	/**
	 * Returns the meta object for data type '<em>MB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MB</em>'.
	 * @model instanceClass="float"
	 * @generated
	 */
	EDataType getMB();

	/**
	 * Returns the meta object for data type '{@link org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner <em>Pe Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pe Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner
	 * @model instanceClass="org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner"
	 * @generated
	 */
	EDataType getPeProvisioner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulationFactory getSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.SimulationResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationResourceImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getSimulationResource()
		 * @generated
		 */
		EClass SIMULATION_RESOURCE = eINSTANCE.getSimulationResource();

		/**
		 * The meta object literal for the '<em>float Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getfloatType()
		 * @generated
		 */
		EDataType FLOAT_TYPE = eINSTANCE.getfloatType();

		/**
		 * The meta object literal for the '<em>Utilization Model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getUtilizationModel()
		 * @generated
		 */
		EDataType UTILIZATION_MODEL = eINSTANCE.getUtilizationModel();

		/**
		 * The meta object literal for the '<em>double Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getdoubleType()
		 * @generated
		 */
		EDataType DOUBLE_TYPE = eINSTANCE.getdoubleType();

		/**
		 * The meta object literal for the '<em>Ram Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getRamProvisioner()
		 * @generated
		 */
		EDataType RAM_PROVISIONER = eINSTANCE.getRamProvisioner();

		/**
		 * The meta object literal for the '<em>Bw Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBwProvisioner()
		 * @generated
		 */
		EDataType BW_PROVISIONER = eINSTANCE.getBwProvisioner();

		/**
		 * The meta object literal for the '<em>Cloudlet Scheduler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
		 * @generated
		 */
		EDataType CLOUDLET_SCHEDULER = eINSTANCE.getCloudletScheduler();

		/**
		 * The meta object literal for the '<em>Vm Scheduler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVmScheduler()
		 * @generated
		 */
		EDataType VM_SCHEDULER = eINSTANCE.getVmScheduler();

		/**
		 * The meta object literal for the '<em>MB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getMB()
		 * @generated
		 */
		EDataType MB = eINSTANCE.getMB();

		/**
		 * The meta object literal for the '<em>Pe Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPeProvisioner()
		 * @generated
		 */
		EDataType PE_PROVISIONER = eINSTANCE.getPeProvisioner();

	}

} //SimulationPackage
