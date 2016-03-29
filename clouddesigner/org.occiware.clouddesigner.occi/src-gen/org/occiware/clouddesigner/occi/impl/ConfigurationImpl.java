/**
 */
package org.occiware.clouddesigner.occi.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Evaluator;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;
import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ConfigurationImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ConfigurationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ConfigurationImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> use;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.CONFIGURATION__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, OCCIPackage.CONFIGURATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.CONFIGURATION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllMixinsAreTags(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllMixinsAreTags:
		 *   let severity : Integer[1] = 'Configuration::AllMixinsAreTags'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = mixins->forAll(
		 *           attributes->isEmpty() and
		 *           actions->isEmpty() and
		 *           depends->isEmpty())
		 *       in
		 *         'Configuration::AllMixinsAreTags'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllMixinsAreTags));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_mixins.iterator();
		        /*@Nullable*/ /*@Thrown*/ Boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
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
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
		            /**
		             * attributes->isEmpty() and actions->isEmpty() and depends->isEmpty()
		             */
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_and_0;
		            try {
		                /*@Nullable*/ /*@Caught*/ Object CAUGHT_and;
		                try {
		                    /*@NonNull*/ /*@Caught*/ Object CAUGHT_isEmpty;
		                    try {
		                        if (_1 == null) {
		                            throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::attributes\'");
		                        }
		                        final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = _1.getAttributes();
		                        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		                        final /*@Thrown*/ boolean isEmpty = ClassUtil.nonNullState(CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_attributes).booleanValue());
		                        CAUGHT_isEmpty = isEmpty;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
		                    }
		                    /*@NonNull*/ /*@Caught*/ Object CAUGHT_isEmpty_0;
		                    try {
		                        if (_1 == null) {
		                            throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::actions\'");
		                        }
		                        final /*@NonNull*/ /*@Thrown*/ List<Action> actions = _1.getActions();
		                        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
		                        final /*@Thrown*/ boolean isEmpty_0 = ClassUtil.nonNullState(CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_actions).booleanValue());
		                        CAUGHT_isEmpty_0 = isEmpty_0;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
		                    }
		                    final /*@Nullable*/ /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_isEmpty, CAUGHT_isEmpty_0);
		                    CAUGHT_and = and;
		                }
		                catch (Exception e) {
		                    CAUGHT_and = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_isEmpty_1;
		                try {
		                    if (_1 == null) {
		                        throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::depends\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = _1.getDepends();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		                    final /*@Thrown*/ boolean isEmpty_1 = ClassUtil.nonNullState(CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_depends).booleanValue());
		                    CAUGHT_isEmpty_1 = isEmpty_1;
		                }
		                catch (Exception e) {
		                    CAUGHT_isEmpty_1 = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_isEmpty_1);
		                CAUGHT_and_0 = and_0;
		            }
		            catch (Exception e) {
		                CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_and_0 == null) {								// Abnormal null body evaluation result
		                if (accumulator == ValueUtil.TRUE_VALUE) {
		                    accumulator = null;										// Cache a null failure
		                }
		            }
		            else if (CAUGHT_and_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator = CAUGHT_and_0;									// Cache an exception failure
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllMixinsAreTags, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksTargetsInConfiguration(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllResourcesLinksTargetsInConfiguration:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksTargetsInConfiguration'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = resources.links.target->forAll(r |
		 *           r.oclContainer() = self)
		 *       in
		 *         'Configuration::AllResourcesLinksTargetsInConfiguration'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect_0 = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * links
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Resource);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
		            /**
		             * target
		             */
		            if (_1_0 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Link::target\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ Resource target = _1_0.getTarget();
		            //
		            accumulator_0.add(target);
		        }
		        /*@Nullable*/ /*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
		        /*@NonNull*/ Iterator<?> ITERATOR_r = collect.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR_r.hasNext()) {
		                if (accumulator_1 == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
		                }
		                else {
		                    throw (InvalidValueException)accumulator_1;
		                }
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Resource r = (Resource)ITERATOR_r.next();
		            /**
		             * r.oclContainer() = self
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, r);
		            final /*@NonInvalid*/ boolean eq = this.equals(oclContainer);
		            //
		            if (eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else {															// Impossible badly typed result
		                accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesKindsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllResourcesKindsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesKindsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[1] = use->includesAll(resources.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesKindsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesKindsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect_0 = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * kind
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::kind\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ Kind kind = _1.getKind();
		            //
		            accumulator.add(kind);
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Kind _1_0 = (Kind)ITERATOR__1_0.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_0);
		            //
		            if (oclContainer instanceof CollectionValue) {
		                for (Object value : ((CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_0.add(value);
		                }
		            }
		            else {
		                accumulator_0.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesKindsInUse, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksMixinsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllResourcesLinksMixinsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksMixinsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = resources.links.mixins->forAll(mo |
		 *           let mixinOwner : OclElement[?] = mo.oclContainer()
		 *           in
		 *             if mixinOwner.oclIsTypeOf(Extension)
		 *             then
		 *               self.use->includes(mo.oclAsType(Extension))
		 *             else self.mixins->includes(mo)
		 *             endif)
		 *       in
		 *         'Configuration::AllResourcesLinksMixinsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect_0 = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * links
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
		            /**
		             * mixins
		             */
		            if (_1_0 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::mixins\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = _1_0.getMixins();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		            //
		            for (Object value : BOXED_mixins.flatten().getElements()) {
		                accumulator_0.add(value);
		            }
		        }
		        /*@Nullable*/ /*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_mo = collect.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR_mo.hasNext()) {
		                if (accumulator_1 == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
		                }
		                else {
		                    throw (InvalidValueException)accumulator_1;
		                }
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin mo = (Mixin)ITERATOR_mo.next();
		            /**
		             * 
		             * let mixinOwner : OclElement[?] = mo.oclContainer()
		             * in
		             *   if mixinOwner.oclIsTypeOf(Extension)
		             *   then
		             *     self.use->includes(mo.oclAsType(Extension))
		             *   else self.mixins->includes(mo)
		             *   endif
		             */
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_symbol_0;
		            try {
		                final /*@Nullable*/ /*@Thrown*/ Object mixinOwner = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, mo);
		                final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
		                final /*@Thrown*/ boolean oclIsTypeOf = ClassUtil.nonNullState(OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(evaluator, mixinOwner, TYP_occi_c_c_Extension_0).booleanValue());
		                /*@Thrown*/ boolean symbol_0;
		                if (oclIsTypeOf) {
		                    final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		                    final /*@NonNull*/ /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, mo, TYP_occi_c_c_Extension_0));
		                    final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_use, oclAsType).booleanValue());
		                    symbol_0 = includes;
		                }
		                else {
		                    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins_0 = this.getMixins();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins_0);
		                    final /*@Thrown*/ boolean includes_0 = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_mixins_0, mo).booleanValue());
		                    symbol_0 = includes_0;
		                }
		                CAUGHT_symbol_0 = symbol_0;
		            }
		            catch (Exception e) {
		                CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_symbol_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_symbol_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_symbol_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator_1 = CAUGHT_symbol_0;									// Cache an exception failure
		            }
		            else {															// Impossible badly typed result
		                accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesMixinsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllResourcesMixinsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesMixinsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = resources.mixins->forAll(mo |
		 *           let mixinOwner : OclElement[?] = mo.oclContainer()
		 *           in
		 *             if mixinOwner.oclIsTypeOf(Extension)
		 *             then
		 *               self.use->includes(mo.oclAsType(Extension))
		 *             else self.mixins->includes(mo)
		 *             endif)
		 *       in
		 *         'Configuration::AllResourcesMixinsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * mixins
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::mixins\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = _1.getMixins();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		            //
		            for (Object value : BOXED_mixins.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@Nullable*/ /*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_mo = collect.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR_mo.hasNext()) {
		                if (accumulator_0 == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
		                }
		                else {
		                    throw (InvalidValueException)accumulator_0;
		                }
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin mo = (Mixin)ITERATOR_mo.next();
		            /**
		             * 
		             * let mixinOwner : OclElement[?] = mo.oclContainer()
		             * in
		             *   if mixinOwner.oclIsTypeOf(Extension)
		             *   then
		             *     self.use->includes(mo.oclAsType(Extension))
		             *   else self.mixins->includes(mo)
		             *   endif
		             */
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_symbol_0;
		            try {
		                final /*@Nullable*/ /*@Thrown*/ Object mixinOwner = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, mo);
		                final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
		                final /*@Thrown*/ boolean oclIsTypeOf = ClassUtil.nonNullState(OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(evaluator, mixinOwner, TYP_occi_c_c_Extension_0).booleanValue());
		                /*@Thrown*/ boolean symbol_0;
		                if (oclIsTypeOf) {
		                    final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		                    final /*@NonNull*/ /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, mo, TYP_occi_c_c_Extension_0));
		                    final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_use, oclAsType).booleanValue());
		                    symbol_0 = includes;
		                }
		                else {
		                    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins_0 = this.getMixins();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins_0);
		                    final /*@Thrown*/ boolean includes_0 = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_mixins_0, mo).booleanValue());
		                    symbol_0 = includes_0;
		                }
		                CAUGHT_symbol_0 = symbol_0;
		            }
		            catch (Exception e) {
		                CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_symbol_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_symbol_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_symbol_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator_0 = CAUGHT_symbol_0;									// Cache an exception failure
		            }
		            else {															// Impossible badly typed result
		                accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksKindsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AllResourcesLinksKindsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksKindsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[1] = use->includesAll(
		 *           resources.links.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesLinksKindsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesLinksKindsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_1;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect_1 = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * links
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_1.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect_0 = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
		            /**
		             * kind
		             */
		            if (_1_0 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::kind\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ Kind kind = _1_0.getKind();
		            //
		            accumulator_0.add(kind);
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@NonNull*/ Iterator<?> ITERATOR__1_1 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_1.hasNext()) {
		                collect = accumulator_1;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Kind _1_1 = (Kind)ITERATOR__1_1.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_1);
		            //
		            if (oclContainer instanceof CollectionValue) {
		                for (Object value : ((CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_1.add(value);
		                }
		            }
		            else {
		                accumulator_1.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksKindsInUse, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case OCCIPackage.CONFIGURATION__MIXINS:
				return ((InternalEList<?>)getMixins()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.CONFIGURATION__USE:
				return getUse();
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return getResources();
			case OCCIPackage.CONFIGURATION__MIXINS:
				return getMixins();
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
			case OCCIPackage.CONFIGURATION__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends Extension>)newValue);
				return;
			case OCCIPackage.CONFIGURATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case OCCIPackage.CONFIGURATION__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
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
			case OCCIPackage.CONFIGURATION__USE:
				getUse().clear();
				return;
			case OCCIPackage.CONFIGURATION__RESOURCES:
				getResources().clear();
				return;
			case OCCIPackage.CONFIGURATION__MIXINS:
				getMixins().clear();
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
			case OCCIPackage.CONFIGURATION__USE:
				return use != null && !use.isEmpty();
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case OCCIPackage.CONFIGURATION__MIXINS:
				return mixins != null && !mixins.isEmpty();
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
			case OCCIPackage.CONFIGURATION___ALL_MIXINS_ARE_TAGS__DIAGNOSTICCHAIN_MAP:
				return AllMixinsAreTags((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksTargetsInConfiguration((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConfigurationImpl
