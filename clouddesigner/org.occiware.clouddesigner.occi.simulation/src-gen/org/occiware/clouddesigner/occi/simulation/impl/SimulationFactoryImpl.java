/**
 */
package org.occiware.clouddesigner.occi.simulation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.simulation.*;

import org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler;
import org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel;
import org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler;

import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationFactoryImpl extends EFactoryImpl implements SimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulationFactory init() {
		try {
			SimulationFactory theSimulationFactory = (SimulationFactory)EPackage.Registry.INSTANCE.getEFactory(SimulationPackage.eNS_URI);
			if (theSimulationFactory != null) {
				return theSimulationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactoryImpl() {
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
			case SimulationPackage.CONTAINS: return createContains();
			case SimulationPackage.SIMULATION_RESOURCE: return createSimulationResource();
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
			case SimulationPackage.FLOAT_TYPE:
				return createfloatTypeFromString(eDataType, initialValue);
			case SimulationPackage.UTILIZATION_MODEL:
				return createUtilizationModelFromString(eDataType, initialValue);
			case SimulationPackage.DOUBLE_TYPE:
				return createdoubleTypeFromString(eDataType, initialValue);
			case SimulationPackage.RAM_PROVISIONER:
				return createRamProvisionerFromString(eDataType, initialValue);
			case SimulationPackage.BW_PROVISIONER:
				return createBwProvisionerFromString(eDataType, initialValue);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return createCloudletSchedulerFromString(eDataType, initialValue);
			case SimulationPackage.VM_SCHEDULER:
				return createVmSchedulerFromString(eDataType, initialValue);
			case SimulationPackage.MB:
				return createMBFromString(eDataType, initialValue);
			case SimulationPackage.PE_PROVISIONER:
				return createPeProvisionerFromString(eDataType, initialValue);
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
			case SimulationPackage.FLOAT_TYPE:
				return convertfloatTypeToString(eDataType, instanceValue);
			case SimulationPackage.UTILIZATION_MODEL:
				return convertUtilizationModelToString(eDataType, instanceValue);
			case SimulationPackage.DOUBLE_TYPE:
				return convertdoubleTypeToString(eDataType, instanceValue);
			case SimulationPackage.RAM_PROVISIONER:
				return convertRamProvisionerToString(eDataType, instanceValue);
			case SimulationPackage.BW_PROVISIONER:
				return convertBwProvisionerToString(eDataType, instanceValue);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return convertCloudletSchedulerToString(eDataType, instanceValue);
			case SimulationPackage.VM_SCHEDULER:
				return convertVmSchedulerToString(eDataType, instanceValue);
			case SimulationPackage.MB:
				return convertMBToString(eDataType, instanceValue);
			case SimulationPackage.PE_PROVISIONER:
				return convertPeProvisionerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public SimulationResource createSimulationResource() {
		SimulationResourceImpl simulationResource = new SimulationResourceImpl();
		return simulationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createfloatTypeFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertfloatTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilizationModel createUtilizationModelFromString(EDataType eDataType, String initialValue) {
		return (UtilizationModel)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUtilizationModelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createdoubleTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdoubleTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamProvisioner createRamProvisionerFromString(EDataType eDataType, String initialValue) {
		return (RamProvisioner)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRamProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwProvisioner createBwProvisionerFromString(EDataType eDataType, String initialValue) {
		return (BwProvisioner)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBwProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudletScheduler createCloudletSchedulerFromString(EDataType eDataType, String initialValue) {
		return (CloudletScheduler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudletSchedulerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmScheduler createVmSchedulerFromString(EDataType eDataType, String initialValue) {
		return (VmScheduler)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmSchedulerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createMBFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeProvisioner createPeProvisionerFromString(EDataType eDataType, String initialValue) {
		return (PeProvisioner)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationPackage getSimulationPackage() {
		return (SimulationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulationPackage getPackage() {
		return SimulationPackage.eINSTANCE;
	}

} //SimulationFactoryImpl
