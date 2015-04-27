/**
 */
package org.occiware.clouddesigner.occi.docker.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

import org.occiware.clouddesigner.occi.docker.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage
 * @generated
 */
public class DockerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DockerValidator INSTANCE = new DockerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.clouddesigner.occi.docker";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Container Link Alias Unique' of 'Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINER__CONTAINER_LINK_ALIAS_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Container No Cycle Between Containers' of 'Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINER__CONTAINER_NO_CYCLE_BETWEEN_CONTAINERS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Link Target As Container' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__LINK_TARGET_AS_CONTAINER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Link Source As Container' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__LINK_SOURCE_AS_CONTAINER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Link Can Only Connect Colocalized Containers' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Volumes From Source As Container' of 'Volumesfrom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLUMESFROM__VOLUMES_FROM_SOURCE_AS_CONTAINER = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Volumes From Target As Container' of 'Volumesfrom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLUMESFROM__VOLUMES_FROM_TARGET_AS_CONTAINER = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Volumes From Can Only Connect Colocalized Containers' of 'Volumesfrom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLUMESFROM__VOLUMES_FROM_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machine Name Unique' of 'Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MACHINE__MACHINE_NAME_UNIQUE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Containers Used Too Memory' of 'Machine Virtual Box'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MACHINE_VIRTUAL_BOX__CONTAINERS_USED_TOO_MEMORY = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DockerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DockerPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case DockerPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case DockerPackage.VOLUMESFROM:
				return validateVolumesfrom((Volumesfrom)value, diagnostics, context);
			case DockerPackage.CONTAINS:
				return validateContains((Contains)value, diagnostics, context);
			case DockerPackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case DockerPackage.MACHINE_AMAZON_EC2:
				return validateMachine_Amazon_EC2((Machine_Amazon_EC2)value, diagnostics, context);
			case DockerPackage.MACHINE_DIGITAL_OCEAN:
				return validateMachine_Digital_Ocean((Machine_Digital_Ocean)value, diagnostics, context);
			case DockerPackage.MACHINE_GOOGLE_COMPUTE_ENGINE:
				return validateMachine_Google_Compute_Engine((Machine_Google_Compute_Engine)value, diagnostics, context);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER:
				return validateMachine_IBM_SoftLayer((Machine_IBM_SoftLayer)value, diagnostics, context);
			case DockerPackage.MACHINE_MICROSOFT_AZURE:
				return validateMachine_Microsoft_Azure((Machine_Microsoft_Azure)value, diagnostics, context);
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V:
				return validateMachine_Microsoft_Hyper_V((Machine_Microsoft_Hyper_V)value, diagnostics, context);
			case DockerPackage.MACHINE_OPEN_STACK:
				return validateMachine_OpenStack((Machine_OpenStack)value, diagnostics, context);
			case DockerPackage.MACHINE_RACKSPACE:
				return validateMachine_Rackspace((Machine_Rackspace)value, diagnostics, context);
			case DockerPackage.MACHINE_VIRTUAL_BOX:
				return validateMachine_VirtualBox((Machine_VirtualBox)value, diagnostics, context);
			case DockerPackage.MACHINE_VMWARE_FUSION:
				return validateMachine_VMware_Fusion((Machine_VMware_Fusion)value, diagnostics, context);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR:
				return validateMachine_VMware_vCloud_Air((Machine_VMware_vCloud_Air)value, diagnostics, context);
			case DockerPackage.MACHINE_VMWARE_VSPHERE:
				return validateMachine_VMware_vSphere((Machine_VMware_vSphere)value, diagnostics, context);
			case DockerPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_ContainerLinkAliasUnique(container, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainer_ContainerNoCycleBetweenContainers(container, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContainerLinkAliasUnique constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_ContainerLinkAliasUnique(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return container.ContainerLinkAliasUnique(diagnostics, context);
	}

	/**
	 * Validates the ContainerNoCycleBetweenContainers constraint of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer_ContainerNoCycleBetweenContainers(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return container.ContainerNoCycleBetweenContainers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkTargetAsContainer(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkSourceAsContainer(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkCanOnlyConnectColocalizedContainers(link, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LinkTargetAsContainer constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkTargetAsContainer(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.LinkTargetAsContainer(diagnostics, context);
	}

	/**
	 * Validates the LinkSourceAsContainer constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkSourceAsContainer(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.LinkSourceAsContainer(diagnostics, context);
	}

	/**
	 * Validates the LinkCanOnlyConnectColocalizedContainers constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkCanOnlyConnectColocalizedContainers(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.LinkCanOnlyConnectColocalizedContainers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumesfrom(Volumesfrom volumesfrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(volumesfrom, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolumesfrom_VolumesFromSourceAsContainer(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolumesfrom_VolumesFromTargetAsContainer(volumesfrom, diagnostics, context);
		if (result || diagnostics != null) result &= validateVolumesfrom_VolumesFromCanOnlyConnectColocalizedContainers(volumesfrom, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VolumesFromSourceAsContainer constraint of '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumesfrom_VolumesFromSourceAsContainer(Volumesfrom volumesfrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return volumesfrom.VolumesFromSourceAsContainer(diagnostics, context);
	}

	/**
	 * Validates the VolumesFromTargetAsContainer constraint of '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumesfrom_VolumesFromTargetAsContainer(Volumesfrom volumesfrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return volumesfrom.VolumesFromTargetAsContainer(diagnostics, context);
	}

	/**
	 * Validates the VolumesFromCanOnlyConnectColocalizedContainers constraint of '<em>Volumesfrom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumesfrom_VolumesFromCanOnlyConnectColocalizedContainers(Volumesfrom volumesfrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return volumesfrom.VolumesFromCanOnlyConnectColocalizedContainers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContains(Contains contains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contains, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contains, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(contains, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(contains, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MachineNameUnique constraint of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_MachineNameUnique(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return machine.MachineNameUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Amazon_EC2(Machine_Amazon_EC2 machine_Amazon_EC2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Amazon_EC2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Amazon_EC2, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Amazon_EC2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Digital_Ocean(Machine_Digital_Ocean machine_Digital_Ocean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Digital_Ocean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Digital_Ocean, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Digital_Ocean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Google_Compute_Engine(Machine_Google_Compute_Engine machine_Google_Compute_Engine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Google_Compute_Engine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Google_Compute_Engine, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Google_Compute_Engine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_IBM_SoftLayer(Machine_IBM_SoftLayer machine_IBM_SoftLayer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_IBM_SoftLayer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_IBM_SoftLayer, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_IBM_SoftLayer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Microsoft_Azure(Machine_Microsoft_Azure machine_Microsoft_Azure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Microsoft_Azure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Microsoft_Azure, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Microsoft_Azure, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Microsoft_Hyper_V(Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Microsoft_Hyper_V, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Microsoft_Hyper_V, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Microsoft_Hyper_V, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_OpenStack(Machine_OpenStack machine_OpenStack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_OpenStack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_OpenStack, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_OpenStack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_Rackspace(Machine_Rackspace machine_Rackspace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_Rackspace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_Rackspace, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_Rackspace, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_VirtualBox(Machine_VirtualBox machine_VirtualBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_VirtualBox, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_VirtualBox, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_VirtualBox_ContainersUsedTooMemory(machine_VirtualBox, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContainersUsedTooMemory constraint of '<em>Machine Virtual Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_VirtualBox_ContainersUsedTooMemory(Machine_VirtualBox machine_VirtualBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return machine_VirtualBox.ContainersUsedTooMemory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_VMware_Fusion(Machine_VMware_Fusion machine_VMware_Fusion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_VMware_Fusion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_VMware_Fusion, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_VMware_Fusion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_VMware_vCloud_Air(Machine_VMware_vCloud_Air machine_VMware_vCloud_Air, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_VMware_vCloud_Air, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_VMware_vCloud_Air, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_VMware_vCloud_Air, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine_VMware_vSphere(Machine_VMware_vSphere machine_VMware_vSphere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine_VMware_vSphere, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(machine_VMware_vSphere, diagnostics, context);
		if (result || diagnostics != null) result &= validateMachine_MachineNameUnique(machine_VMware_vSphere, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DockerValidator
