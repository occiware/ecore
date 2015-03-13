/**
 */
package org.occiware.clouddesigner.OCCI.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;

import org.eclipse.ocl.examples.domain.ids.TypeId;

import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;

import org.eclipse.ocl.examples.domain.types.IdResolver;

import org.eclipse.ocl.examples.domain.utilities.DomainUtil;

import org.eclipse.ocl.examples.domain.values.SetValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.examples.library.logical.BooleanAndOperation;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation;

import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;
import org.occiware.clouddesigner.OCCI.Resource;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.LinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EntityImpl implements Link {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Resource target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (eContainerFeatureID() != OCCIPackage.LINK__SOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Resource newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OCCIPackage.LINK__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != OCCIPackage.LINK__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OCCIPackage.RESOURCE__LINKS, Resource.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Resource)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Resource newTarget) {
		Resource oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkKindIsInParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv LinkKindIsInParent: kind->closure(parent)->exists(k | k.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#')
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		/*@Nullable*/ /*@Caught*/ Object CAUGHT_exists;
		try {
		    final /*@Nullable*/ /*@Thrown*/ Kind kind = this.getKind();
		    final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = DomainUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, kind));
		    final /*@NonNull*/ DomainType TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);
		    final /*@NonNull*/ LibraryIteration IMPL_closure_0 = (LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
		    final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
		    /**
		     * Implementation of the iterator body.
		     */
		    final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
		        /**
		         * parent
		         */
		        @Override
		        public /*@Nullable*/ Object evaluate(final /*@NonNull*/ DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		            final /*@Nullable*/ /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
		            if (symbol_0 == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Kind::parent\'");
		            }
		            final /*@Nullable*/ /*@Thrown*/ Kind parent = symbol_0.getParent();
		            return parent;
		        }
		    };
		    final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
		    final /*@NonNull*/ /*@Thrown*/ SetValue closure = (SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
		    /*@Nullable*/ /*@Thrown*/ Object accumulator = ValuesUtil.FALSE_VALUE;
		    /*@Nullable*/ Iterator<?> ITERATOR_k = closure.iterator();
		    /*@Nullable*/ /*@Thrown*/ Boolean exists;
		    while (true) {
		        if (!ITERATOR_k.hasNext()) {
		            if ((accumulator == null) || (accumulator == ValuesUtil.FALSE_VALUE)) {
		                exists = (Boolean)accumulator;
		            }
		            else {
		                throw (InvalidValueException)accumulator;
		            }
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
		        /**
		         * k.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#'
		         */
		        /*@Nullable*/ /*@Caught*/ Object CAUGHT_and;
		        try {
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		            try {
		                if (k == null) {
		                    throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ String term = k.getTerm();
		                final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_link);
		                CAUGHT_eq = eq;
		            }
		            catch (Exception e) {
		                CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		            }
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq_0;
		            try {
		                if (k == null) {
		                    throw new InvalidValueException("Null source for \'OCCI::Category::scheme\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ String scheme = k.getScheme();
		                final /*@Thrown*/ boolean eq_0 = scheme.equals(OCCITables.STR_http_c_s_s_schemas_ogf_o);
		                CAUGHT_eq_0 = eq_0;
		            }
		            catch (Exception e) {
		                CAUGHT_eq_0 = ValuesUtil.createInvalidValue(e);
		            }
		            final /*@Nullable*/ /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
		            CAUGHT_and = and;
		        }
		        catch (Exception e) {
		            CAUGHT_and = ValuesUtil.createInvalidValue(e);
		        }
		        //
		        if (CAUGHT_and == ValuesUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		            exists = ValuesUtil.TRUE_VALUE;
		            break;														// Stop immediately 
		        }
		        else if (CAUGHT_and == ValuesUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		            ;															// Carry on
		        }
		        else if (CAUGHT_and == null) {								// Abnormal null body evaluation result
		            if (accumulator == ValuesUtil.FALSE_VALUE) {
		                accumulator = null;										// Cache a null failure
		            }
		        }
		        else if (CAUGHT_and instanceof InvalidValueException) {		// Abnormal exception evaluation result
		            accumulator = CAUGHT_and;									// Cache an exception failure
		        }
		        else {															// Impossible badly typed result
		            accumulator = new InvalidValueException(EvaluatorMessages.NonBooleanBody, "exists");
		        }
		    }
		    CAUGHT_exists = exists;
		}
		catch (Exception e) {
		    CAUGHT_exists = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_exists == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = CAUGHT_exists == null ? Diagnostic.ERROR : Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Link", "LinkKindIsInParent", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.LINK__LINK_KIND_IS_IN_PARENT, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((Resource)otherEnd, msgs);
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
			case OCCIPackage.LINK__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OCCIPackage.LINK__SOURCE:
				return eInternalContainer().eInverseRemove(this, OCCIPackage.RESOURCE__LINKS, Resource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				return getSource();
			case OCCIPackage.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				setSource((Resource)newValue);
				return;
			case OCCIPackage.LINK__TARGET:
				setTarget((Resource)newValue);
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
			case OCCIPackage.LINK__SOURCE:
				setSource((Resource)null);
				return;
			case OCCIPackage.LINK__TARGET:
				setTarget((Resource)null);
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
			case OCCIPackage.LINK__SOURCE:
				return getSource() != null;
			case OCCIPackage.LINK__TARGET:
				return target != null;
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
			case OCCIPackage.LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP:
				return LinkKindIsInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkImpl
