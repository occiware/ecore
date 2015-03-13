/**
 */
package org.occiware.clouddesigner.OCCI.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.Resource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ResourceImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends EntityImpl implements Resource {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<Link>(Link.class, this, OCCIPackage.RESOURCE__LINKS, OCCIPackage.LINK__SOURCE);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean ResourceKindIsInParent(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		// /**
		// *
		// * inv ResourceKindIsInParent: kind->closure(parent)->exists(k |
		// k.term = 'resource' and k.scheme =
		// 'http://schemas.ogf.org/occi/core#')
		// */
		// final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator =
		// PivotUtil.getEvaluator(this);
		// final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver =
		// evaluator.getIdResolver();
		// final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary
		// standardLibrary = idResolver.getStandardLibrary();
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_exists;
		// try {
		// final /*@Nullable*/ /*@Thrown*/ Kind kind = this.getKind();
		// final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet =
		// DomainUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator,
		// OCCITables.SET_CLSSid_Kind, kind));
		// final /*@NonNull*/ DomainType TYPE_closure_0 =
		// evaluator.getStaticTypeOf(oclAsSet);
		// final /*@NonNull*/ LibraryIteration IMPL_closure_0 =
		// (LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary,
		// OCLstdlibTables.Operations._Set__closure);
		// final /*@NonNull*/ Object ACC_closure_0 =
		// IMPL_closure_0.createAccumulatorValue(evaluator,
		// OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
		// /**
		// * Implementation of the iterator body.
		// */
		// final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new
		// AbstractBinaryOperation() {
		// /**
		// * parent
		// */
		// @Override
		// public /*@Nullable*/ Object evaluate(final /*@NonNull*/
		// DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final
		// /*@Nullable*/ Object oclAsSet, final /*@Nullable*/ /*@NonInvalid*/
		// Object _1) {
		// final /*@Nullable*/ /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
		// if (symbol_0 == null) {
		// throw new
		// InvalidValueException("Null source for \'OCCI::Kind::parent\'");
		// }
		// final /*@Nullable*/ /*@Thrown*/ Kind parent = symbol_0.getParent();
		// return parent;
		// }
		// };
		// final /*@NonNull*/ ExecutorSingleIterationManager MGR_closure_0 = new
		// ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind,
		// BODY_closure_0, oclAsSet, ACC_closure_0);
		// final /*@NonNull*/ /*@Thrown*/ SetValue closure =
		// (SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
		// /*@Nullable*/ /*@Thrown*/ Object accumulator =
		// ValuesUtil.FALSE_VALUE;
		// /*@Nullable*/ Iterator<?> ITERATOR_k = closure.iterator();
		// /*@Nullable*/ /*@Thrown*/ Boolean exists;
		// while (true) {
		// if (!ITERATOR_k.hasNext()) {
		// if ((accumulator == null) || (accumulator == ValuesUtil.FALSE_VALUE))
		// {
		// exists = (Boolean)accumulator;
		// }
		// else {
		// throw (InvalidValueException)accumulator;
		// }
		// break;
		// }
		// /*@Nullable*/ /*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
		// /**
		// * k.term = 'resource' and k.scheme =
		// 'http://schemas.ogf.org/occi/core#'
		// */
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_and;
		// try {
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		// try {
		// if (k == null) {
		// throw new
		// InvalidValueException("Null source for \'OCCI::Category::term\'");
		// }
		// final /*@NonNull*/ /*@Thrown*/ String term = k.getTerm();
		// final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_resource);
		// CAUGHT_eq = eq;
		// }
		// catch (Exception e) {
		// CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		// }
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq_0;
		// try {
		// if (k == null) {
		// throw new
		// InvalidValueException("Null source for \'OCCI::Category::scheme\'");
		// }
		// final /*@NonNull*/ /*@Thrown*/ String scheme = k.getScheme();
		// final /*@Thrown*/ boolean eq_0 =
		// scheme.equals(OCCITables.STR_http_c_s_s_schemas_ogf_o);
		// CAUGHT_eq_0 = eq_0;
		// }
		// catch (Exception e) {
		// CAUGHT_eq_0 = ValuesUtil.createInvalidValue(e);
		// }
		// final /*@Nullable*/ /*@Thrown*/ Boolean and =
		// BooleanAndOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
		// CAUGHT_and = and;
		// }
		// catch (Exception e) {
		// CAUGHT_and = ValuesUtil.createInvalidValue(e);
		// }
		// //
		// if (CAUGHT_and == ValuesUtil.TRUE_VALUE) { // Normal successful body
		// evaluation result
		// exists = ValuesUtil.TRUE_VALUE;
		// break; // Stop immediately
		// }
		// else if (CAUGHT_and == ValuesUtil.FALSE_VALUE) { // Normal
		// unsuccessful body evaluation result
		// ; // Carry on
		// }
		// else if (CAUGHT_and == null) { // Abnormal null body evaluation
		// result
		// if (accumulator == ValuesUtil.FALSE_VALUE) {
		// accumulator = null; // Cache a null failure
		// }
		// }
		// else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal
		// exception evaluation result
		// accumulator = CAUGHT_and; // Cache an exception failure
		// }
		// else { // Impossible badly typed result
		// accumulator = new
		// InvalidValueException(EvaluatorMessages.NonBooleanBody, "exists");
		// }
		// }
		// CAUGHT_exists = exists;
		// }
		// catch (Exception e) {
		// CAUGHT_exists = ValuesUtil.createInvalidValue(e);
		// }
		// if (CAUGHT_exists == ValuesUtil.TRUE_VALUE) {
		// return true;
		// }
		// if (diagnostics != null) {
		// int severity = CAUGHT_exists == null ? Diagnostic.ERROR :
		// Diagnostic.WARNING;
		// String message =
		// DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
		// new Object[]{"Resource", "ResourceKindIsInParent",
		// EObjectValidator.getObjectLabel(this, context)});
		// diagnostics.add(new BasicDiagnostic(severity,
		// OCCIValidator.DIAGNOSTIC_SOURCE,
		// OCCIValidator.RESOURCE__RESOURCE_KIND_IS_IN_PARENT, message, new
		// Object [] { this }));
		// }
		// return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				getLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP:
				return ResourceKindIsInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ResourceImpl
