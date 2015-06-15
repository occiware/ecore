/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Mixin#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin()
 * @model
 * @generated
 */
public interface Mixin extends Category {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Actions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Mixin!actions'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Depends()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Mixin!depends'"
	 * @generated
	 */
	EList<Mixin> getDepends();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Applies()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Mixin!applies'"
	 * @generated
	 */
	EList<Kind> getApplies();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getMixin_Entities()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * Entity.allInstances()->select(mixins->includes(self))\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_occi_c_c_Entity_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Entity, null);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0));\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Entity%> _1 = (<%org.occiware.clouddesigner.occi.Entity%>)ITERATOR__1.next();\n    /**\n     * mixins->includes(self)\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Entity::mixins\\\'\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.occi.Mixin%>> mixins = _1.getMixins();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n    final /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_mixins, this).booleanValue());\n    //\n    if (includes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(_1);\n    }\n}\nfinal <%java.util.List%><<%org.occiware.clouddesigner.occi.Entity%>> UNBOXED_select = select.asEcoreObjects(idResolver, org.occiware.clouddesigner.occi.Entity.class);\nassert UNBOXED_select != null;\nreturn (<%org.eclipse.emf.common.util.EList<org.occiware.clouddesigner.occi.Entity>%>)UNBOXED_select;'"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Mixin
