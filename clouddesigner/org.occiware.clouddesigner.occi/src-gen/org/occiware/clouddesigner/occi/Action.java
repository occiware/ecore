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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme'"
 * @generated
 */
public interface Action extends Category {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv CorrectScheme:\n *   let severity : Integer[1] = \'Action::CorrectScheme\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[1] = let\n *           category : ::Category[1] = oclContainer()\n *           .oclAsType(Category)\n *         in scheme =\n *           category.scheme.substring(1, category.scheme.size() - 1) + \'/\' + category.term + \'/action#\'\n *       in\n *         \'Action::CorrectScheme\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Action_c_c_CorrectScheme);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq;\n    try {\n        final /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Category_0 = idResolver.getClass(<%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Category, null);\n        final /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n        final /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Category%> category = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.occiware.clouddesigner.occi.Category%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Category_0));\n        final /*@Thrown\052/ <%java.lang.String%> scheme_0 = category.getScheme();\n        final /*@Thrown\052/ <%java.lang.String%> scheme = this.getScheme();\n        final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size = <%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(scheme_0);\n        final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%>.INSTANCE.evaluate(size, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_1);\n        final /*@Thrown\052/ <%java.lang.String%> substring = <%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme_0, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_1, diff);\n        final /*@Thrown\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(substring, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_quot);\n        final /*@Thrown\052/ <%java.lang.String%> term = category.getTerm();\n        final /*@Thrown\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum, term);\n        final /*@Thrown\052/ <%java.lang.String%> sum_1 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_0, <%org.occiware.clouddesigner.occi.OCCITables%>.STR__s_action_35);\n        final /*@Thrown\052/ boolean eq = scheme.equals(sum_1);\n        CAUGHT_eq = eq;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.OCCITables%>.STR_Action_c_c_CorrectScheme, this, null, diagnostics, context, null, severity_0, CAUGHT_eq, <%org.occiware.clouddesigner.occi.OCCITables%>.INT_0).booleanValue();\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Action
