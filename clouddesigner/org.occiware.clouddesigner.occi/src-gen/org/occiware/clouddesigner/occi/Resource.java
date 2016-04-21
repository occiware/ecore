/**
 * Copyright (c) 2015-2016 Obeo, Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Resource#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Resource#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResourceKindIsInParent'"
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getResource_Summary()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Resource!summary'"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.Resource#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Link}.
	 * It is bidirectional and its opposite is '{@link org.occiware.clouddesigner.occi.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getResource_Links()
	 * @see org.occiware.clouddesigner.occi.Link#getSource
	 * @model opposite="source" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Resource!links'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv ResourceKindIsInParent:\n *   let severity : Integer[1] = \'Resource::ResourceKindIsInParent\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[?] = kind->closure(parent)\n *         ->exists(k | k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')\n *       in\n *         \'Resource::ResourceKindIsInParent\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Resource_c_c_ResourceKindIsInParent));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n    symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Kind%> kind = this.getKind();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> oclAsSet = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Kind, kind));\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n        final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Kind, <%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Kind);\n        /**\n         * Implementation of the iterator body.\n         \052/\n        final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n        {\n            /**\n             * parent\n             \052/\n            @Override\n            public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n                final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Kind%> symbol_0 = (<%org.occiware.clouddesigner.occi.Kind%>)_1;\n                if (symbol_0 == null) {\n                    throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Kind::parent\\\'\");\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Kind%> parent = symbol_0.getParent();\n                return parent;\n            }\n        };\n        final /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n        /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n        /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_k = closure.iterator();\n        /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> status;\n        while (true) {\n            if (!ITERATOR_k.hasNext()) {\n                if (accumulator == null) {\n                    status = null;\n                }\n                else if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n                    status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n                }\n                else {\n                    throw (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n                }\n                break;\n            }\n            /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Kind%> k = (<%org.occiware.clouddesigner.occi.Kind%>)ITERATOR_k.next();\n            /**\n             * k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\'\n             \052/\n            /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_and;\n            try {\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\n                try {\n                    if (k == null) {\n                        throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::term\\\'\");\n                    }\n                    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = k.getTerm();\n                    final /*@Thrown\052/ boolean eq = term.equals(<%org.occiware.clouddesigner.occi.OCCITables%>.STR_resource);\n                    CAUGHT_eq = eq;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n                }\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq_0;\n                try {\n                    if (k == null) {\n                        throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::scheme\\\'\");\n                    }\n                    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = k.getScheme();\n                    final /*@Thrown\052/ boolean eq_0 = scheme.equals(<%org.occiware.clouddesigner.occi.OCCITables%>.STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35);\n                    CAUGHT_eq_0 = eq_0;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_eq_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> and = <%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);\n                CAUGHT_and = and;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n            }\n            //\n            if (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n            }\n            else if (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n                ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n            }\n            else if (CAUGHT_and == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n                if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n                    accumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n                }\n            }\n            else if (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n                accumulator = CAUGHT_and;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n            }\n            else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n                accumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Resource_c_c_ResourceKindIsInParent, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue());\n    symbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean ResourceKindIsInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Resource
