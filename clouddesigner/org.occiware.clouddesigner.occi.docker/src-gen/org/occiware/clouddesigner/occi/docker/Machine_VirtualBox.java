/**
 */
package org.occiware.clouddesigner.occi.docker;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox()
 * @model
 * @generated
 */
public interface Machine_VirtualBox extends Machine {
	/**
	 * Returns the value of the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker url</em>' attribute.
	 * @see #setBoot2docker_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VirtualBox!boot2docker_url'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_VirtualBox!disk_size'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv ContainersUsedTooMemory: Tuple {\n * \tmessage : String = \'Containers consume \' + (links->select(oclIsKindOf(docker::Contains)).target.oclAsType(Container).memory->sum()).toString() + \' when memory is equals to \' + memory.toString(),\n * \tstatus : Boolean = \n * \t\t\t(links->select(oclIsKindOf(docker::Contains)).target.oclAsType(Container).memory->sum()) <= memory\n * }.status\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.codegen.java.UnboxedExplicitNavigationProperty%> IMPPROPid_memory_2 = new <%org.eclipse.ocl.examples.codegen.java.UnboxedExplicitNavigationProperty%>(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.PROPid_memory);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Link%>> links_0 = this.getLinks();\nfinal /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Number%> memory_2 = (<%java.lang.Number%>)IMPPROPid_memory_2.evaluate(evaluator, <%org.eclipse.ocl.examples.domain.ids.TypeId%>.REAL, this);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_links_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link, links_0);\nfinal /*@Nullable\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.RealValue%> BOXED_memory_2 = memory_2 == null ? null : <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.realValueOf(memory_2);\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createOrderedSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.ORD_CLSSid_Link);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_3 = BOXED_links_0.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> select_0;\nwhile (true) {\n    if (!ITERATOR__1_3.hasNext()) {\n        select_0 = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Link%> _1_3 = (<%org.occiware.clouddesigner.occi.Link%>)ITERATOR__1_3.next();\n    /**\n     * oclIsKindOf(Contains)\n     \052/\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Contains_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Contains, null);\n    final /*@Thrown\052/ boolean oclIsKindOf_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(evaluator, _1_3, TYP_docker_c_c_Contains_1).booleanValue());\n    //\n    if (oclIsKindOf_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(_1_3);\n    }\n}\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Resource);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_4 = select_0.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_4;\nwhile (true) {\n    if (!ITERATOR__1_4.hasNext()) {\n        collect_4 = accumulator_0;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Link%> _1_4 = (<%org.occiware.clouddesigner.occi.Link%>)ITERATOR__1_4.next();\n    /**\n     * target\n     \052/\n    if (_1_4 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Link::target\\\'\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Resource%> target_0 = _1_4.getTarget();\n    //\n    accumulator_0.add(target_0);\n}\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_CLSSid_Container);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_5 = collect_4.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_3;\nwhile (true) {\n    if (!ITERATOR__1_5.hasNext()) {\n        collect_3 = accumulator_1;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Resource%> _1_5 = (<%org.occiware.clouddesigner.occi.Resource%>)ITERATOR__1_5.next();\n    /**\n     * oclAsType(Container)\n     \052/\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_docker_c_c_Container_1 = idResolver.getType(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Container, null);\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.docker.Container%> oclAsType_0 = (<%org.occiware.clouddesigner.occi.docker.Container%>)<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(evaluator, _1_5, TYP_docker_c_c_Container_1);\n    //\n    accumulator_1.add(oclAsType_0);\n}\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_2 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SEQ_PRIMid_Real);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_6 = collect_3.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_2;\nwhile (true) {\n    if (!ITERATOR__1_6.hasNext()) {\n        collect_2 = accumulator_2;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Container%> _1_6 = (<%org.occiware.clouddesigner.occi.docker.Container%>)ITERATOR__1_6.next();\n    /**\n     * memory\n     \052/\n    if (_1_6 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'infrastructure::Compute::memory\\\'\");\n    }\n    final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Number%> memory_1 = (<%java.lang.Number%>)IMPPROPid_memory_2.evaluate(evaluator, <%org.eclipse.ocl.examples.domain.ids.TypeId%>.REAL, _1_6);\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.RealValue%> BOXED_memory_1 = memory_1 == null ? null : <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.realValueOf(memory_1);\n    //\n    accumulator_2.add(BOXED_memory_1);\n}\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.RealValue%> sum_3 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState((<%org.eclipse.ocl.examples.domain.values.RealValue%>)<%org.eclipse.ocl.examples.library.collection.CollectionSumOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.examples.domain.ids.TypeId%>.REAL, collect_2));\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> toString = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation%>.INSTANCE.evaluate(sum_3));\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.STR_Containers_32_consume_32, toString));\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum_1 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_0, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.STR__32_when_32_memory_32_is_32_equa));\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> toString_0 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation%>.INSTANCE.evaluate(BOXED_memory_2));\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> sum_2 = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_1, toString_0));\nfinal /*@Thrown\052/ boolean le = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation%>.INSTANCE.evaluate(sum_3, BOXED_memory_2).booleanValue());\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.TupleValue%> symbol_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createTupleOfEach(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.TUPLid_, sum_2, le);\nfinal /*@NonInvalid\052/ boolean status = (<%java.lang.Boolean%>)symbol_0.getValue(1/*status\052/);\nif (status == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Machine_VirtualBox\", \"ContainersUsedTooMemory\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.occi.docker.util.DockerValidator%>.MACHINE_VIRTUAL_BOX__CONTAINERS_USED_TOO_MEMORY, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean ContainersUsedTooMemory(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Machine_VirtualBox
