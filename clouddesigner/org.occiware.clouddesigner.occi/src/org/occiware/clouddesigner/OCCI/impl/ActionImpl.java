/**
 */
package org.occiware.clouddesigner.OCCI.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.ocl.examples.domain.elements.DomainType;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;

import org.eclipse.ocl.examples.domain.types.IdResolver;

import org.eclipse.ocl.examples.domain.utilities.DomainUtil;

import org.eclipse.ocl.examples.domain.values.IntegerValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.examples.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;

import org.eclipse.ocl.examples.library.string.StringConcatOperation;
import org.eclipse.ocl.examples.library.string.StringSizeOperation;
import org.eclipse.ocl.examples.library.string.StringSubstringOperation;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends CategoryImpl implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv CorrectScheme: let category = oclContainer().oclAsType(Category) in scheme = category.scheme.substring(1,category.scheme.size()-1) + '/' + category.term + '/action#'
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Category_0 = idResolver.getType(OCCITables.CLSSid_Category, null);
		    final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(this);
		    final /*@Nullable*/ /*@Thrown*/ Category category = (Category)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_OCCI_c_c_Category_0);
		    if (category == null) {
		        throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		    }
		    final /*@NonNull*/ /*@Thrown*/ String scheme_0 = category.getScheme();
		    final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		    final /*@NonNull*/ /*@Thrown*/ IntegerValue size = DomainUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(scheme_0));
		    final /*@NonNull*/ /*@Thrown*/ IntegerValue diff = DomainUtil.nonNullState((IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, OCCITables.INT_1));
		    final /*@NonNull*/ /*@Thrown*/ String substring = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme_0, OCCITables.INT_1, diff));
		    final /*@NonNull*/ /*@Thrown*/ String sum = DomainUtil.nonNullState(StringConcatOperation.INSTANCE.evaluate(substring, OCCITables.STR_quot));
		    final /*@NonNull*/ /*@Thrown*/ String term = category.getTerm();
		    final /*@NonNull*/ /*@Thrown*/ String sum_0 = DomainUtil.nonNullState(StringConcatOperation.INSTANCE.evaluate(sum, term));
		    final /*@NonNull*/ /*@Thrown*/ String sum_1 = DomainUtil.nonNullState(StringConcatOperation.INSTANCE.evaluate(sum_0, OCCITables.STR__s_action_35));
		    final /*@Thrown*/ boolean eq = scheme.equals(sum_1);
		    CAUGHT_eq = eq;
		}
		catch (Exception e) {
		    CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_eq == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Action", "CorrectScheme", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.ACTION__CORRECT_SCHEME, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
