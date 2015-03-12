/**
 */
package org.occiware.clouddesigner.OCCI.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.clouddesigner.OCCI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage
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
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.clouddesigner.OCCI";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Unique' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__ATTRIBUTES_NAME_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Identity Unique' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__IDENTITY_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scheme Ends With Sharp' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__SCHEME_ENDS_WITH_SHARP = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__CORRECT_SCHEME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Cyclic Inheritance' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__NO_CYCLIC_INHERITANCE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Not Already Defined In Parent' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Action Term Unicity' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__ACTION_TERM_UNICITY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entity Kind Is Root Parent' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__ENTITY_KIND_IS_ROOT_PARENT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION__CORRECT_SCHEME = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Action Term Unicity' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__ACTION_TERM_UNICITY = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Cyclic Inheritance' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__NO_CYCLIC_INHERITANCE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__CORRECT_SCHEME = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Not Already Defined In Depends' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ATTRIBUTES_NAME_UNIQUE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kind Compatible With One Applies Of Each Mixin' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ID_UNIQUE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Kind Is In Parent' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__RESOURCE_KIND_IS_IN_PARENT = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Link Kind Is In Parent' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__LINK_KIND_IS_IN_PARENT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kinds Scheme Valid' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__KINDS_SCHEME_VALID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kind Parent Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixins Scheme Valid' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXINS_SCHEME_VALID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Term Unicity' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__TERM_UNICITY = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixin Applies Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scheme Unique' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__SCHEME_UNIQUE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixin Depends Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Kinds In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_KINDS_IN_USE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Targets In Configuration' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Kinds In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_KINDS_IN_USE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Mixins In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_MIXINS_IN_USE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Mixins In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_MIXINS_IN_USE = 30;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 30;

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
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(category, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_AttributesNameUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.AttributesNameUnique(diagnostics, context);
	}

	/**
	 * Validates the IdentityUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_IdentityUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.IdentityUnique(diagnostics, context);
	}

	/**
	 * Validates the SchemeEndsWithSharp constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_SchemeEndsWithSharp(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.SchemeEndsWithSharp(diagnostics, context);
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
		if (!validate_NoCircularContainment(kind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_CorrectScheme(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_NoCyclicInheritance(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_AttributesNameNotAlreadyDefinedInParent(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_ActionTermUnicity(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_EntityKindIsRootParent(kind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_CorrectScheme(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.CorrectScheme(diagnostics, context);
	}

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_NoCyclicInheritance(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.NoCyclicInheritance(diagnostics, context);
	}

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_AttributesNameNotAlreadyDefinedInParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.AttributesNameNotAlreadyDefinedInParent(diagnostics, context);
	}

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_ActionTermUnicity(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.ActionTermUnicity(diagnostics, context);
	}

	/**
	 * Validates the EntityKindIsRootParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_EntityKindIsRootParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.EntityKindIsRootParent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_CorrectScheme(action, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_CorrectScheme(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return action.CorrectScheme(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mixin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_ActionTermUnicity(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_NoCyclicInheritance(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_CorrectScheme(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_AttributesNameNotAlreadyDefinedInDepends(mixin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_ActionTermUnicity(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.ActionTermUnicity(diagnostics, context);
	}

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_NoCyclicInheritance(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.NoCyclicInheritance(diagnostics, context);
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_CorrectScheme(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.CorrectScheme(diagnostics, context);
	}

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInDepends constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_AttributesNameNotAlreadyDefinedInDepends(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.AttributesNameNotAlreadyDefinedInDepends(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(entity, diagnostics, context);
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
	 * Validates the KindCompatibleWithOneAppliesOfEachMixin constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_KindCompatibleWithOneAppliesOfEachMixin(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.KindCompatibleWithOneAppliesOfEachMixin(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_ResourceKindIsInParent(resource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceKindIsInParent constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ResourceKindIsInParent(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resource.ResourceKindIsInParent(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkKindIsInParent(link, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LinkKindIsInParent constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkKindIsInParent(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.LinkKindIsInParent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindParentLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_TermUnicity(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinAppliesLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_SchemeUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinDependsLocalOrImported(extension, diagnostics, context);
		return result;
	}

	/**
	 * Validates the KindsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.KindsSchemeValid(diagnostics, context);
	}

	/**
	 * Validates the KindParentLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindParentLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.KindParentLocalOrImported(diagnostics, context);
	}

	/**
	 * Validates the MixinsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinsSchemeValid(diagnostics, context);
	}

	/**
	 * Validates the TermUnicity constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_TermUnicity(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.TermUnicity(diagnostics, context);
	}

	/**
	 * Validates the MixinAppliesLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinAppliesLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinAppliesLocalOrImported(diagnostics, context);
	}

	/**
	 * Validates the SchemeUnique constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_SchemeUnique(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.SchemeUnique(diagnostics, context);
	}

	/**
	 * Validates the MixinDependsLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinDependsLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinDependsLocalOrImported(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksTargetsInConfiguration(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesMixinsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksMixinsInUse(configuration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllResourcesLinksKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksKindsInUse(diagnostics, context);
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
	 * Validates the AllResourcesKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesKindsInUse(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesMixinsInUse(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesLinksMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksMixinsInUse(diagnostics, context);
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
