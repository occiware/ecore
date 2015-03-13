/**
 */
package org.occiware.clouddesigner.OCCI.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;

import org.eclipse.ocl.examples.domain.ids.TypeId;

import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryIteration;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;

import org.eclipse.ocl.examples.domain.types.IdResolver;

import org.eclipse.ocl.examples.domain.utilities.DomainUtil;

import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SetValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation;

import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.AttributeState;
import org.occiware.clouddesigner.OCCI.Entity;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Mixin;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeState> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.ENTITY__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<Mixin>(Mixin.class, this, OCCIPackage.ENTITY__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeState> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeState>(AttributeState.class, this, OCCIPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributesNameUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv AttributesNameUnique: attributes->isUnique(name)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<AttributeState> attributes = this.getAttributes();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_AttributeState, attributes);
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_AttributeState);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ AttributeState _1 = (AttributeState)ITERATOR__1.next();
		        /**
		         * name
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::AttributeState::name\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String name = _1.getName();
		        //
		        if (accumulator.includes(name) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(name);
		        }
		    }
		    CAUGHT_isUnique = isUnique;
		}
		catch (Exception e) {
		    CAUGHT_isUnique = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_isUnique == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Entity", "AttributesNameUnique", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.ENTITY__ATTRIBUTES_NAME_UNIQUE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindCompatibleWithOneAppliesOfEachMixin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv KindCompatibleWithOneAppliesOfEachMixin: mixins->forAll(m | m.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@Nullable*/ /*@Caught*/ Object CAUGHT_forAll;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		    /*@Nullable*/ /*@Thrown*/ Object accumulator = ValuesUtil.TRUE_VALUE;
		    /*@Nullable*/ Iterator<?> ITERATOR_m = BOXED_mixins.iterator();
		    /*@Nullable*/ /*@Thrown*/ Boolean forAll;
		    while (true) {
		        if (!ITERATOR_m.hasNext()) {
		            if ((accumulator == null) || (accumulator == ValuesUtil.TRUE_VALUE)) {
		                forAll = (Boolean)accumulator;
		            }
		            else {
		                throw (InvalidValueException)accumulator;
		            }
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Mixin m = (Mixin)ITERATOR_m.next();
		        /**
		         * 
		         * m.applies->notEmpty() implies
		         * m.applies->exists(k | kind->closure(parent)->includes(k))
		         */
		        /*@Nullable*/ /*@Caught*/ Object CAUGHT_implies;
		        try {
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_notEmpty;
		            try {
		                if (m == null) {
		                    throw new InvalidValueException("Null source for \'OCCI::Mixin::applies\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Kind> applies = m.getApplies();
		                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies);
		                final /*@Thrown*/ boolean notEmpty = DomainUtil.nonNullState(CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_applies).booleanValue());
		                CAUGHT_notEmpty = notEmpty;
		            }
		            catch (Exception e) {
		                CAUGHT_notEmpty = ValuesUtil.createInvalidValue(e);
		            }
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_exists;
		            try {
		                if (m == null) {
		                    throw new InvalidValueException("Null source for \'OCCI::Mixin::applies\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Kind> applies_0 = m.getApplies();
		                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies_0);
		                /*@NonNull*/ /*@Thrown*/ Object accumulator_0 = ValuesUtil.FALSE_VALUE;
		                /*@Nullable*/ Iterator<?> ITERATOR_k = BOXED_applies_0.iterator();
		                /*@Thrown*/ boolean exists;
		                while (true) {
		                    if (!ITERATOR_k.hasNext()) {
		                        if (accumulator_0 == ValuesUtil.FALSE_VALUE) {
		                            exists = (Boolean)accumulator_0;
		                        }
		                        else {
		                            throw (InvalidValueException)accumulator_0;
		                        }
		                        break;
		                    }
		                    /*@Nullable*/ /*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
		                    /**
		                     * kind->closure(parent)->includes(k)
		                     */
		                    final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		                    /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
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
		                        final /*@Thrown*/ boolean includes = DomainUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(closure, k).booleanValue());
		                        CAUGHT_includes = includes;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_includes = ValuesUtil.createInvalidValue(e);
		                    }
		                    //
		                    if (CAUGHT_includes == ValuesUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		                        exists = ValuesUtil.TRUE_VALUE;
		                        break;														// Stop immediately 
		                    }
		                    else if (CAUGHT_includes == ValuesUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		                        ;															// Carry on
		                    }
		                    else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                        accumulator_0 = CAUGHT_includes;									// Cache an exception failure
		                    }
		                    else {															// Impossible badly typed result
		                        accumulator_0 = new InvalidValueException(EvaluatorMessages.NonBooleanBody, "exists");
		                    }
		                }
		                CAUGHT_exists = exists;
		            }
		            catch (Exception e) {
		                CAUGHT_exists = ValuesUtil.createInvalidValue(e);
		            }
		            final /*@Nullable*/ /*@Thrown*/ Boolean implies = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_notEmpty, CAUGHT_exists);
		            CAUGHT_implies = implies;
		        }
		        catch (Exception e) {
		            CAUGHT_implies = ValuesUtil.createInvalidValue(e);
		        }
		        //
		        if (CAUGHT_implies == ValuesUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		            forAll = ValuesUtil.FALSE_VALUE;
		            break;														// Stop immediately 
		        }
		        else if (CAUGHT_implies == ValuesUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		            ;															// Carry on
		        }
		        else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
		            if (accumulator == ValuesUtil.TRUE_VALUE) {
		                accumulator = null;										// Cache a null failure
		            }
		        }
		        else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
		            accumulator = CAUGHT_implies;									// Cache an exception failure
		        }
		        else {															// Impossible badly typed result
		            accumulator = new InvalidValueException(EvaluatorMessages.NonBooleanBody, "forAll");
		        }
		    }
		    CAUGHT_forAll = forAll;
		}
		catch (Exception e) {
		    CAUGHT_forAll = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_forAll == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = CAUGHT_forAll == null ? Diagnostic.ERROR : Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Entity", "KindCompatibleWithOneAppliesOfEachMixin", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IdUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv IdUnique: Entity.allInstances()->isUnique(id)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Entity_0 = idResolver.getType(OCCITables.CLSSid_Entity, null);
		    final /*@NonNull*/ /*@Thrown*/ SetValue allInstances = DomainUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Entity, TYP_OCCI_c_c_Entity_0));
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Entity _1 = (Entity)ITERATOR__1.next();
		        /**
		         * id
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Entity::id\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String id = _1.getId();
		        //
		        if (accumulator.includes(id) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(id);
		        }
		    }
		    CAUGHT_isUnique = isUnique;
		}
		catch (Exception e) {
		    CAUGHT_isUnique = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_isUnique == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Entity", "IdUnique", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.ENTITY__ID_UNIQUE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.ENTITY__ID:
				return getId();
			case OCCIPackage.ENTITY__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case OCCIPackage.ENTITY__MIXINS:
				return getMixins();
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
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
			case OCCIPackage.ENTITY__ID:
				setId((String)newValue);
				return;
			case OCCIPackage.ENTITY__KIND:
				setKind((Kind)newValue);
				return;
			case OCCIPackage.ENTITY__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeState>)newValue);
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
			case OCCIPackage.ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case OCCIPackage.ENTITY__KIND:
				setKind((Kind)null);
				return;
			case OCCIPackage.ENTITY__MIXINS:
				getMixins().clear();
				return;
			case OCCIPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
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
			case OCCIPackage.ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OCCIPackage.ENTITY__KIND:
				return kind != null;
			case OCCIPackage.ENTITY__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
			case OCCIPackage.ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return AttributesNameUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP:
				return KindCompatibleWithOneAppliesOfEachMixin((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return IdUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
