/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Kind#getParent <em>Parent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Kind#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Kind#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getKind()
 * @model
 * @generated
 */
public interface Kind extends Category {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Kind)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getKind_Parent()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Kind!parent'"
	 * @generated
	 */
	Kind getParent();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.Kind#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Kind value);

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
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getKind_Actions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Kind!actions'"
	 * @generated
	 */
	EList<Action> getActions();

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
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getKind_Entities()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * Entity.allInstances()->select(kind = self)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_occi_c_c_Entity_0 = idResolver.getType(<%org.occiware.clouddesigner.occi.OCCITables%>.CLSSid_Entity, null);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0));\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.occi.OCCITables%>.SET_CLSSid_Entity);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.occi.Entity%> _1 = (<%org.occiware.clouddesigner.occi.Entity%>)ITERATOR__1.next();\n    /**\n     * kind = self\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'occi::Entity::kind\\\'\");\n    }\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.occi.Kind%> kind = _1.getKind();\n    final /*@Thrown\052/ boolean eq = this.equals(kind);\n    //\n    if (eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(_1);\n    }\n}\nfinal <%java.util.List%><<%org.occiware.clouddesigner.occi.Entity%>> UNBOXED_select = select.asEcoreObjects(idResolver, org.occiware.clouddesigner.occi.Entity.class);\nassert UNBOXED_select != null;\nreturn (<%org.eclipse.emf.common.util.EList<org.occiware.clouddesigner.occi.Entity>%>)UNBOXED_select;'"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Kind
