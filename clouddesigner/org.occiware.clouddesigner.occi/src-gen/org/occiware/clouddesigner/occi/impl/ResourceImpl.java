/**
 */
package org.occiware.clouddesigner.occi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;
import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ResourceImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends EntityImpl implements Resource {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<Link>(Link.class, this, OCCIPackage.RESOURCE__LINKS, OCCIPackage.LINK__SOURCE);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResourceKindIsInParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv ResourceKindIsInParent:
		 *   let severity : Integer[1] = 'Resource::ResourceKindIsInParent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[?] = kind->closure(parent)
		 *         ->exists(k | k.term = 'resource' and k.scheme = 'http://schemas.ogf.org/occi/core#')
		 *       in
		 *         'Resource::ResourceKindIsInParent'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Resource_c_c_ResourceKindIsInParent));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ Kind kind = this.getKind();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue oclAsSet = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, kind));
		        final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.LibraryIteration IMPL_closure_0 = (org.eclipse.ocl.pivot.library.LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables.Operations._Set__closure);
		        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
		        /**
		         * Implementation of the iterator body.
		         */
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.AbstractBinaryOperation BODY_closure_0 = new org.eclipse.ocl.pivot.library.AbstractBinaryOperation() {
		            /**
		             * parent
		             */
		            @Override
		            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ org.eclipse.ocl.pivot.ids.TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		                final /*@Nullable*/ /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
		                if (symbol_0 == null) {
		                    throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Kind::parent\'");
		                }
		                final /*@Nullable*/ /*@Thrown*/ Kind parent = symbol_0.getParent();
		                return parent;
		            }
		        };
		        final /*@NonNull*/  org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager MGR_closure_0 = new org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue closure = ClassUtil.nonNullState((org.eclipse.ocl.pivot.values.SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_k = closure.iterator();
		        /*@Nullable*/ /*@Thrown*/ Boolean status;
		        while (true) {
		            if (!ITERATOR_k.hasNext()) {
		                if (accumulator == null) {
		                    status = null;
		                }
		                else if (accumulator == ValueUtil.FALSE_VALUE) {
		                    status = ValueUtil.FALSE_VALUE;
		                }
		                else {
		                    throw (org.eclipse.ocl.pivot.values.InvalidValueException)accumulator;
		                }
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
		            /**
		             * k.term = 'resource' and k.scheme = 'http://schemas.ogf.org/occi/core#'
		             */
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_and;
		            try {
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		                try {
		                    if (k == null) {
		                        throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::term\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ String term = k.getTerm();
		                    final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_resource);
		                    CAUGHT_eq = eq;
		                }
		                catch (Exception e) {
		                    CAUGHT_eq = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq_0;
		                try {
		                    if (k == null) {
		                        throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::scheme\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ String scheme = k.getScheme();
		                    final /*@Thrown*/ boolean eq_0 = scheme.equals(OCCITables.STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35);
		                    CAUGHT_eq_0 = eq_0;
		                }
		                catch (Exception e) {
		                    CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean and = org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
		                CAUGHT_and = and;
		            }
		            catch (Exception e) {
		                CAUGHT_and = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_and == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		                status = ValueUtil.TRUE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_and == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_and == null) {								// Abnormal null body evaluation result
		                if (accumulator == ValueUtil.FALSE_VALUE) {
		                    accumulator = null;										// Cache a null failure
		                }
		            }
		            else if (CAUGHT_and instanceof org.eclipse.ocl.pivot.values.InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator = CAUGHT_and;									// Cache an exception failure
		            }
		            else {															// Impossible badly typed result
		                accumulator = new org.eclipse.ocl.pivot.values.InvalidValueException(PivotMessages.NonBooleanBody, "exists");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, OCCITables.STR_Resource_c_c_ResourceKindIsInParent, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.RESOURCE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP:
				return ResourceKindIsInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ResourceImpl
