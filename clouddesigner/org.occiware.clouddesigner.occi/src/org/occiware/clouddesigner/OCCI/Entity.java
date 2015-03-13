/**
 */
package org.occiware.clouddesigner.OCCI;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Entity#getId <em>Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Entity#getKind <em>Kind</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Entity#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getEntity_Id()
	 * @model dataType="org.occiware.clouddesigner.OCCI.URI" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Entity!id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getEntity_Kind()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Entity!kind'"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Entity#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getEntity_Mixins()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Entity!mixins'"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.AttributeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getEntity_Attributes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Entity!attributes'"
	 * @generated
	 */
	EList<AttributeState> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv AttributesNameUnique: attributes->isUnique(name)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.AttributeState%>> attributes = this.getAttributes();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_AttributeState, attributes);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_AttributeState);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_attributes.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.AttributeState%> _1 = (<%org.occiware.clouddesigner.OCCI.AttributeState%>)ITERATOR__1.next();\n        /**\n         * name\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::AttributeState::name\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n        //\n        if (accumulator.includes(name) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator.add(name);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Entity\", \"AttributesNameUnique\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.ENTITY__ATTRIBUTES_NAME_UNIQUE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean AttributesNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv KindCompatibleWithOneAppliesOfEachMixin: mixins->forAll(m | m.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_forAll;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Mixin%>> mixins = this.getMixins();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n    /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_m = BOXED_mixins.iterator();\n    /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> forAll;\n    while (true) {\n        if (!ITERATOR_m.hasNext()) {\n            if ((accumulator == null) || (accumulator == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE)) {\n                forAll = (<%java.lang.Boolean%>)accumulator;\n            }\n            else {\n                throw (<%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>)accumulator;\n            }\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Mixin%> m = (<%org.occiware.clouddesigner.OCCI.Mixin%>)ITERATOR_m.next();\n        /**\n         * \n         * m.applies->notEmpty() implies\n         * m.applies->exists(k | kind->closure(parent)->includes(k))\n         \052/\n        /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_implies;\n        try {\n            /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_notEmpty;\n            try {\n                if (m == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Mixin::applies\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Kind%>> applies = m.getApplies();\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_applies = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Kind, applies);\n                final /*@Thrown\052/ boolean notEmpty = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation%>.INSTANCE.evaluate(BOXED_applies).booleanValue());\n                CAUGHT_notEmpty = notEmpty;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_notEmpty = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n            }\n            /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_exists;\n            try {\n                if (m == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Mixin::applies\\\'\");\n                }\n                final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Kind%>> applies_0 = m.getApplies();\n                final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_applies_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Kind, applies_0);\n                /*@NonNull\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\n                /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_k = BOXED_applies_0.iterator();\n                /*@Thrown\052/ boolean exists;\n                while (true) {\n                    if (!ITERATOR_k.hasNext()) {\n                        if (accumulator_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\n                            exists = (<%java.lang.Boolean%>)accumulator_0;\n                        }\n                        else {\n                            throw (<%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>)accumulator_0;\n                        }\n                        break;\n                    }\n                    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> k = (<%org.occiware.clouddesigner.OCCI.Kind%>)ITERATOR_k.next();\n                    /**\n                     * kind->closure(parent)->includes(k)\n                     \052/\n                    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n                    /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_includes;\n                    try {\n                        final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> kind = this.getKind();\n                        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> oclAsSet = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, kind));\n                        final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);\n                        final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.examples.domain.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n                        final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, <%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Kind);\n                        /**\n                         * Implementation of the iterator body.\n                         \052/\n                        final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%>()\n                        {\n                            /**\n                             * parent\n                             \052/\n                            @Override\n                            public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n                                final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> symbol_0 = (<%org.occiware.clouddesigner.OCCI.Kind%>)_1;\n                                if (symbol_0 == null) {\n                                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Kind::parent\\\'\");\n                                }\n                                final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent = symbol_0.getParent();\n                                return parent;\n                            }\n                        };\n                        final /*@NonNull\052/  <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n                        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> closure = (<%org.eclipse.ocl.examples.domain.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0);\n                        final /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(closure, k).booleanValue());\n                        CAUGHT_includes = includes;\n                    }\n                    catch (<%java.lang.Exception%> e) {\n                        CAUGHT_includes = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                    }\n                    //\n                    if (CAUGHT_includes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n                        exists = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n                        break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n                    }\n                    else if (CAUGHT_includes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n                        ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n                    }\n                    else if (CAUGHT_includes instanceof <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n                        accumulator_0 = CAUGHT_includes;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n                    }\n                    else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n                        accumulator_0 = new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.NonBooleanBody, \"exists\");\n                    }\n                }\n                CAUGHT_exists = exists;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_exists = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> implies = <%org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation%>.INSTANCE.evaluate(CAUGHT_notEmpty, CAUGHT_exists);\n            CAUGHT_implies = implies;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_implies = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n        }\n        //\n        if (CAUGHT_implies == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n            forAll = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\n            break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n        }\n        else if (CAUGHT_implies == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n            ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n        }\n        else if (CAUGHT_implies == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n            if (accumulator == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n                accumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n            }\n        }\n        else if (CAUGHT_implies instanceof <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n            accumulator = CAUGHT_implies;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n        }\n        else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n            accumulator = new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.NonBooleanBody, \"forAll\");\n        }\n    }\n    CAUGHT_forAll = forAll;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_forAll = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_forAll == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = CAUGHT_forAll == null ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Entity\", \"KindCompatibleWithOneAppliesOfEachMixin\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean KindCompatibleWithOneAppliesOfEachMixin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv IdUnique: Entity.allInstances()->isUnique(id)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_OCCI_c_c_Entity_0 = idResolver.getType(<%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Entity, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Entity, TYP_OCCI_c_c_Entity_0));\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Entity);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Entity%> _1 = (<%org.occiware.clouddesigner.OCCI.Entity%>)ITERATOR__1.next();\n        /**\n         * id\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Entity::id\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> id = _1.getId();\n        //\n        if (accumulator.includes(id) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator.add(id);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Entity\", \"IdUnique\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.ENTITY__ID_UNIQUE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean IdUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
