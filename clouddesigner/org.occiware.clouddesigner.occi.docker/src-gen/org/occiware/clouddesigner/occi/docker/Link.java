/**
 */
package org.occiware.clouddesigner.occi.docker;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Link#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends org.occiware.clouddesigner.occi.Link {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getLink_Alias()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Link!alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Link#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv LinkTargetAsContainer: target.oclIsKindOf(Container)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Container_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Container, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target = this.getTarget();\n    final /*@Thrown\052/ boolean oclIsKindOf = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, target, TYP_docker_c_c_Container_0).booleanValue());\n    CAUGHT_oclIsKindOf = oclIsKindOf;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_oclIsKindOf = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_oclIsKindOf == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Link\", \"LinkTargetAsContainer\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.LINK__LINK_TARGET_AS_CONTAINER, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean LinkTargetAsContainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv LinkSourceAsContainer: source.oclIsKindOf(Container)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_oclIsKindOf;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Container_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Container, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> source = this.getSource();\n    final /*@Thrown\052/ boolean oclIsKindOf = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, source, TYP_docker_c_c_Container_0).booleanValue());\n    CAUGHT_oclIsKindOf = oclIsKindOf;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_oclIsKindOf = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_oclIsKindOf == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Link\", \"LinkSourceAsContainer\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.LINK__LINK_SOURCE_AS_CONTAINER, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean LinkSourceAsContainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv LinkCanOnlyConnectColocalizedContainers: \n * \t\t\tContains.allInstances()->select(contains | contains.target = self.source).source = \n * \t\t\tContains.allInstances()->select(contains | contains.target = self.target).source\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq_1;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Contains_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Contains, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.SET_CLSSid_Contains, TYP_docker_c_c_Contains_1));\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SET_CLSSid_Contains);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_contains = allInstances_0.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\n    while (true) {\n        if (!ITERATOR_contains.hasNext()) {\n            select = accumulator;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Contains%> contains = (<%org.occiware.clouddesigner.occi.docker.Contains%>)ITERATOR_contains.next();\n        /**\n         * contains.target = self.source\n         \052/\n        if (contains == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Link::target\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target = contains.getTarget();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> source = this.getSource();\n        final /*@Thrown\052/ boolean eq = target.equals(source);\n        //\n        if (eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            accumulator.add(contains);\n        }\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.BAG_CLSSid_Resource);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = select.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            collect = accumulator_0;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Contains%> _1 = (<%org.occiware.clouddesigner.occi.docker.Contains%>)ITERATOR__1.next();\n        /**\n         * source\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Link::source\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> source_0 = _1.getSource();\n        //\n        accumulator_0.add(source_0);\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SET_CLSSid_Contains);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_contains_0 = allInstances_0.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select_0;\n    while (true) {\n        if (!ITERATOR_contains_0.hasNext()) {\n            select_0 = accumulator_1;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Contains%> contains_0 = (<%org.occiware.clouddesigner.occi.docker.Contains%>)ITERATOR_contains_0.next();\n        /**\n         * contains.target = self.target\n         \052/\n        if (contains_0 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Link::target\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target_0 = contains_0.getTarget();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target_1 = this.getTarget();\n        final /*@Thrown\052/ boolean eq_0 = target_0.equals(target_1);\n        //\n        if (eq_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            accumulator_1.add(contains_0);\n        }\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_2 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.BAG_CLSSid_Resource);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = select_0.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect_0;\n    while (true) {\n        if (!ITERATOR__1_0.hasNext()) {\n            collect_0 = accumulator_2;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Contains%> _1_0 = (<%org.occiware.clouddesigner.occi.docker.Contains%>)ITERATOR__1_0.next();\n        /**\n         * source\n         \052/\n        if (_1_0 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Link::source\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> source_1 = _1_0.getSource();\n        //\n        accumulator_2.add(source_1);\n    }\n    final /*@Thrown\052/ boolean eq_1 = collect.equals(collect_0);\n    CAUGHT_eq_1 = eq_1;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_eq_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_eq_1 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Link\", \"LinkCanOnlyConnectColocalizedContainers\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.LINK__LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean LinkCanOnlyConnectColocalizedContainers(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Link
