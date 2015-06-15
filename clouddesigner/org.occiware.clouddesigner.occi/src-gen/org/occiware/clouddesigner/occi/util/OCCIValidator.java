/**
 */
package org.occiware.clouddesigner.occi.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.OCCIPackage
 * @generated
 */
public class OCCIValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OCCIValidator INSTANCE = new OCCIValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.clouddesigner.occi";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ATTRIBUTES_NAME_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ID_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Targets In Configuration' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCCIValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OCCIPackage.eINSTANCE;
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
			case OCCIPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case OCCIPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case OCCIPackage.KIND:
				return validateKind((Kind)value, diagnostics, context);
			case OCCIPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case OCCIPackage.MIXIN:
				return validateMixin((Mixin)value, diagnostics, context);
			case OCCIPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OCCIPackage.ATTRIBUTE_STATE:
				return validateAttributeState((AttributeState)value, diagnostics, context);
			case OCCIPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case OCCIPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case OCCIPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case OCCIPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case OCCIPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case OCCIPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case OCCIPackage.NUMBER:
				return validateNumber((Integer)value, diagnostics, context);
			case OCCIPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(category, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mixin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_AttributesNameUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.AttributesNameUnique(diagnostics, context);
	}

	/**
	 * Validates the IdUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_IdUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.IdUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeState(AttributeState attributeState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(resource, diagnostics, context);
		return result;
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
		if (result || diagnostics != null) result &= validateEntity_IdUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(link, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configuration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksTargetsInConfiguration(configuration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllResourcesLinksTargetsInConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksTargetsInConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksTargetsInConfiguration(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(int number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OCCIValidator
