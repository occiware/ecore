/**
 */
package org.occiware.clouddesigner.occi.docker;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MachineNameUnique'"
 * @generated
 */
public interface Machine extends Compute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv MachineNameUnique:\n *   let severity : Integer[1] = \'Machine::MachineNameUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : Boolean[1] = Machine.allInstances()->isUnique(name)\n *       in\n *         \'Machine::MachineNameUnique\'.logDiagnostic(self, diagnostics, context, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Evaluator%> evaluator = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.STR_Machine_c_c_MachineNameUnique));\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(evaluator, severity_0, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.INT_0).booleanValue());\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_docker_c_c_Machine = idResolver.getClass(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.CLSSid_Machine, null);\n        final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.SET_CLSSid_Machine, TYP_docker_c_c_Machine));\n        /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.docker.DockerTables%>.SET_CLSSid_Machine);\n        /*@NonNull\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n        /*@Thrown\052/ boolean status;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                break;\n            }\n            /*@NonNull\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.docker.Machine%> _1 = (<%org.occiware.clouddesigner.occi.docker.Machine%>)ITERATOR__1.next();\n            /**\n             * name\n             \052/\n            final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n            //\n            if (accumulator.includes(name) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n                break;\n            }\n            else {\n                accumulator.add(name);\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(<%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.STR_Machine_c_c_MachineNameUnique, this, diagnostics, context, severity_0, CAUGHT_status, <%org.occiware.clouddesigner.occi.docker.DockerTables%>.INT_0).booleanValue());\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean MachineNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Machine
