/**
 */
package org.occiware.clouddesigner.occi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
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
		 * 
		 * inv AttributesNameUnique:
		 *   let severity : Integer[1] = 'Entity::AttributesNameUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = attributes->isUnique(name)
		 *       in
		 *         'Entity::AttributesNameUnique'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Entity_c_c_AttributesNameUnique));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<AttributeState> attributes = this.getAttributes();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_AttributeState, attributes);
		        /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_AttributeState);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ AttributeState _1 = (AttributeState)ITERATOR__1.next();
		            /**
		             * name
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::AttributeState::name\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String name = _1.getName();
		            //
		            if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
		                status = ValueUtil.FALSE_VALUE;			// Abort after second find
		                break;
		            }
		            else {
		                accumulator.add(name);
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_AttributesNameUnique, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindCompatibleWithOneAppliesOfEachMixin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv KindCompatibleWithOneAppliesOfEachMixin:
		 *   let
		 *     severity : Integer[1] = 'Entity::KindCompatibleWithOneAppliesOfEachMixin'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[?] = mixins->forAll(m |
		 *           m.applies->notEmpty() implies
		 *           m.applies->exists(k | kind->closure(parent)->includes(k)))
		 *       in
		 *         'Entity::KindCompatibleWithOneAppliesOfEachMixin'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_m = BOXED_mixins.iterator();
		        /*@Nullable*/ /*@Thrown*/ Boolean status;
		        while (true) {
		            if (!ITERATOR_m.hasNext()) {
		                if (accumulator == null) {
		                    status = null;
		                }
		                else if (accumulator == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
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
		                        throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::applies\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ List<Kind> applies = m.getApplies();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies);
		                    final /*@Thrown*/ boolean notEmpty = ClassUtil.nonNullState(CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_applies).booleanValue());
		                    CAUGHT_notEmpty = notEmpty;
		                }
		                catch (Exception e) {
		                    CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_exists;
		                try {
		                    if (m == null) {
		                        throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::applies\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ List<Kind> applies_0 = m.getApplies();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies_0);
		                    /*@Nullable*/ /*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
		                    /*@Nullable*/ Iterator<?> ITERATOR_k = BOXED_applies_0.iterator();
		                    /*@Thrown*/ boolean exists;
		                    while (true) {
		                        if (!ITERATOR_k.hasNext()) {
		                            if (accumulator_0 == ValueUtil.FALSE_VALUE) {
		                                exists = ValueUtil.FALSE_VALUE;
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
		                        final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		                        /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		                        try {
		                            final /*@NonNull*/ /*@Thrown*/ Kind kind = this.getKind();
		                            final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = ClassUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, kind));
		                            final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);
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
		                                public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		                                    final /*@Nullable*/ /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
		                                    if (symbol_0 == null) {
		                                        throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Kind::parent\'");
		                                    }
		                                    final /*@Nullable*/ /*@Thrown*/ Kind parent = symbol_0.getParent();
		                                    return parent;
		                                }
		                            };
		                            final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
		                            final /*@NonNull*/ /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		                            final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(closure, k).booleanValue());
		                            CAUGHT_includes = includes;
		                        }
		                        catch (Exception e) {
		                            CAUGHT_includes = ValueUtil.createInvalidValue(e);
		                        }
		                        //
		                        if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		                            exists = ValueUtil.TRUE_VALUE;
		                            break;														// Stop immediately 
		                        }
		                        else if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		                            ;															// Carry on
		                        }
		                        else if (CAUGHT_includes instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                            accumulator_0 = CAUGHT_includes;									// Cache an exception failure
		                        }
		                        else {															// Impossible badly typed result
		                            accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
		                        }
		                    }
		                    CAUGHT_exists = exists;
		                }
		                catch (Exception e) {
		                    CAUGHT_exists = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean implies = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_notEmpty, CAUGHT_exists);
		                CAUGHT_implies = implies;
		            }
		            catch (Exception e) {
		                CAUGHT_implies = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
		                if (accumulator == ValueUtil.TRUE_VALUE) {
		                    accumulator = null;										// Cache a null failure
		                }
		            }
		            else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator = CAUGHT_implies;									// Cache an exception failure
		            }
		            else {															// Impossible badly typed result
		                accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IdUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv IdUnique:
		 *   let severity : Integer[1] = 'Entity::IdUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = Entity.allInstances()->isUnique(id)
		 *       in
		 *         'Entity::IdUnique'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Entity_c_c_IdUnique));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
		        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0));
		        /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
		        /*@NonNull*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Entity _1 = (Entity)ITERATOR__1.next();
		            /**
		             * id
		             */
		            final /*@NonNull*/ /*@Thrown*/ String id = _1.getId();
		            //
		            if (accumulator.includes(id) == ValueUtil.TRUE_VALUE) {
		                status = ValueUtil.FALSE_VALUE;			// Abort after second find
		                break;
		            }
		            else {
		                accumulator.add(id);
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_IdUnique, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
