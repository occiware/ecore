/**
 */
package org.occiware.clouddesigner.OCCI;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Category {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv CorrectScheme: let category = oclContainer().oclAsType(Category) in scheme = category.scheme.substring(1,category.scheme.size()-1) + \'/\' + category.term + \'/action#\'\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_OCCI_c_c_Category_0 = idResolver.getType(<%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Category, null);\n    final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(this);\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Category%> category = (<%org.occiware.clouddesigner.OCCI.Category%>)<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(evaluator, oclContainer, TYP_OCCI_c_c_Category_0);\n    if (category == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::term\\\'\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme_0 = category.getScheme();\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = this.getScheme();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.IntegerValue%> size = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringSizeOperation%>.INSTANCE.evaluate(scheme_0));\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.IntegerValue%> diff = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState((<%org.eclipse.ocl.examples.domain.values.IntegerValue%>)<%org.eclipse.ocl.examples.library.numeric.NumericMinusOperation%>.INSTANCE.evaluate(size, <%org.occiware.clouddesigner.OCCI.OCCITables%>.INT_1));\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> substring = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme_0, <%org.occiware.clouddesigner.OCCI.OCCITables%>.INT_1, diff));\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(substring, <%org.occiware.clouddesigner.OCCI.OCCITables%>.STR_quot));\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = category.getTerm();\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum, term));\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum_1 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_0, <%org.occiware.clouddesigner.OCCI.OCCITables%>.STR__s_action_35));\n    final /*@Thrown\052/ boolean eq = scheme.equals(sum_1);\n    CAUGHT_eq = eq;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_eq = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Action\", \"CorrectScheme\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.ACTION__CORRECT_SCHEME, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Action
