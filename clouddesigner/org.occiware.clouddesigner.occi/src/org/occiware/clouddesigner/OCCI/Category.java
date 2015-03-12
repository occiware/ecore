/**
 */
package org.occiware.clouddesigner.OCCI;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Category#getTerm <em>Term</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Category#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Category#getTitle <em>Title</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Category#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getCategory()
 * @model abstract="true"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getCategory_Term()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Category!term'"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Category#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getCategory_Scheme()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Category!scheme'"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Category#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getCategory_Title()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Category!title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Category#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getCategory_Attributes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Category!attributes'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv AttributesNameUnique: attributes->isUnique(name)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Attribute%>> attributes = this.getAttributes();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Attribute, attributes);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Attribute);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_attributes.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Attribute%> _1 = (<%org.occiware.clouddesigner.OCCI.Attribute%>)ITERATOR__1.next();\n        /**\n         * name\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Attribute::name\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n        //\n        if (accumulator.includes(name) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator.add(name);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Category\", \"AttributesNameUnique\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.CATEGORY__ATTRIBUTES_NAME_UNIQUE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean AttributesNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv IdentityUnique: Category.allInstances()->isUnique(scheme + term)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_OCCI_c_c_Category_0 = idResolver.getType(<%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Category, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Category, TYP_OCCI_c_c_Category_0));\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Category);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Category%> _1 = (<%org.occiware.clouddesigner.OCCI.Category%>)ITERATOR__1.next();\n        /**\n         * scheme + term\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::term\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = _1.getScheme();\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = _1.getTerm();\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(scheme, term));\n        //\n        if (accumulator.includes(sum) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator.add(sum);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Category\", \"IdentityUnique\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.CATEGORY__IDENTITY_UNIQUE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean IdentityUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv SchemeEndsWithSharp: scheme.substring(scheme.size(),scheme.size()) = \'#\'\n \052/\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = this.getScheme();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.IntegerValue%> size_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringSizeOperation%>.INSTANCE.evaluate(scheme));\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> substring = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme, size_0, size_0));\n    final /*@Thrown\052/ boolean eq = substring.equals(<%org.occiware.clouddesigner.OCCI.OCCITables%>.STR__35);\n    CAUGHT_eq = eq;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_eq = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Category\", \"SchemeEndsWithSharp\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.CATEGORY__SCHEME_ENDS_WITH_SHARP, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean SchemeEndsWithSharp(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Category
