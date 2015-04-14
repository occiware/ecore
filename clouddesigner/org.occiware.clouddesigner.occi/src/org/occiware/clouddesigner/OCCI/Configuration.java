/**
 */
package org.occiware.clouddesigner.OCCI;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Configuration#getUse <em>Use</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Configuration#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getConfiguration_Use()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Configuration!use'"
	 * @generated
	 */
	EList<Extension> getUse();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getConfiguration_Resources()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Configuration!resources'"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AllResourcesLinksTargetsInConfiguration: resources.links.target->forAll(r | r.oclContainer() = self)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_forAll;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Resource%>> resources = this.getResources();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_resources = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Resource, resources);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SEQ_CLSSid_Link);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_resources.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect_0;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            collect_0 = accumulator;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Resource%> _1 = (<%org.occiware.clouddesigner.OCCI.Resource%>)ITERATOR__1.next();\n        /**\n         * links\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Resource::links\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Link%>> links = _1.getLinks();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_links = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Link, links);\n        //\n        for (Object value : BOXED_links.flatten().getElements()) {\n            accumulator.add(value);\n        }\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SEQ_CLSSid_Resource);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_0 = collect_0.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect;\n    while (true) {\n        if (!ITERATOR__1_0.hasNext()) {\n            collect = accumulator_0;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Link%> _1_0 = (<%org.occiware.clouddesigner.OCCI.Link%>)ITERATOR__1_0.next();\n        /**\n         * target\n         \052/\n        if (_1_0 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Link::target\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Resource%> target = _1_0.getTarget();\n        //\n        accumulator_0.add(target);\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_r = collect.iterator();\n    /*@Thrown\052/ boolean forAll;\n    while (true) {\n        if (!ITERATOR_r.hasNext()) {\n            if (accumulator_1 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n                forAll = (<%java.lang.Boolean%>)accumulator_1;\n            }\n            else {\n                throw (<%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>)accumulator_1;\n            }\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Resource%> r = (<%org.occiware.clouddesigner.OCCI.Resource%>)ITERATOR_r.next();\n        /**\n         * r.oclContainer() = self\n         \052/\n        /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\n        try {\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(r);\n            final /*@Thrown\052/ boolean eq = this.equals(oclContainer);\n            CAUGHT_eq = eq;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_eq = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n        }\n        //\n        if (CAUGHT_eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n            forAll = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\n            break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n        }\n        else if (CAUGHT_eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n            ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n        }\n        else if (CAUGHT_eq instanceof <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n            accumulator_1 = CAUGHT_eq;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n        }\n        else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n            accumulator_1 = new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.NonBooleanBody, \"forAll\");\n        }\n    }\n    CAUGHT_forAll = forAll;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_forAll = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_forAll == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Configuration\", \"AllResourcesLinksTargetsInConfiguration\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean AllResourcesLinksTargetsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Configuration
