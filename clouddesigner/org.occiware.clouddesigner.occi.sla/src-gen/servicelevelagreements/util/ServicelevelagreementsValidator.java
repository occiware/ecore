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
package servicelevelagreements.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

import org.occiware.clouddesigner.occi.util.OCCIValidator;

import servicelevelagreements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see servicelevelagreements.ServicelevelagreementsPackage
 * @generated
 */
public class ServicelevelagreementsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ServicelevelagreementsValidator INSTANCE = new ServicelevelagreementsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "servicelevelagreements";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public ServicelevelagreementsValidator() {
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
	  return ServicelevelagreementsPackage.eINSTANCE;
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
			case ServicelevelagreementsPackage.AGREEMENT:
				return validateAgreement((Agreement)value, diagnostics, context);
			case ServicelevelagreementsPackage.AGREEMENT_LINK:
				return validateAgreement_link((Agreement_link)value, diagnostics, context);
			case ServicelevelagreementsPackage.AGREEMENT_STATUS:
				return validateAgreementStatus((AgreementStatus)value, diagnostics, context);
			case ServicelevelagreementsPackage.AGREEMENT_TERM_TYPE:
				return validateAgreementTermType((AgreementTermType)value, diagnostics, context);
			case ServicelevelagreementsPackage.AGREEMENT_TERM_STATUS:
				return validateAgreementTermStatus((AgreementTermStatus)value, diagnostics, context);
			case ServicelevelagreementsPackage.DATE_TIME:
				return validateDateTime((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreement(Agreement agreement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agreement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(agreement, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(agreement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreement_link(Agreement_link agreement_link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agreement_link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(agreement_link, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(agreement_link, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreementStatus(AgreementStatus agreementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreementTermType(AgreementTermType agreementTermType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgreementTermStatus(AgreementTermStatus agreementTermStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(String dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTime_Pattern(dateTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTime_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Pattern(String dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ServicelevelagreementsPackage.Literals.DATE_TIME, dateTime, DATE_TIME__PATTERN__VALUES, diagnostics, context);
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

} //ServicelevelagreementsValidator
