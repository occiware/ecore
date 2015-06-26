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
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
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
		 *         status : Boolean[1] = use->includesAll(
		 *           resources.links.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesLinksKindsInUse'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
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
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_1;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_1.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::kind\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ Kind kind = _1_0.getKind();
		            //
		            accumulator_0.add(kind);
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@NonNull*/ Iterator<?> ITERATOR__1_1 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_1.hasNext()) {
		                collect = accumulator_1;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Kind _1_1 = (Kind)ITERATOR__1_1.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_1);
		            //
		            if (oclContainer instanceof org.eclipse.ocl.pivot.values.CollectionValue) {
		                for (Object value : ((org.eclipse.ocl.pivot.values.CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_1.add(value);
		                }
		            }
		            else {
		                accumulator_1.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksKindsInUse, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
		 *         status : Boolean[?] = resources.links.target->forAll(r |
		 *           r.oclContainer() = self)
		 *       in
		 *         'Configuration::AllResourcesLinksTargetsInConfiguration'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
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
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Resource);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Link::target\'");
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
		                    throw (org.eclipse.ocl.pivot.values.InvalidValueException)accumulator_1;
		                }
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Resource r = (Resource)ITERATOR_r.next();
		            /**
		             * r.oclContainer() = self
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, r);
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
		                accumulator_1 = new org.eclipse.ocl.pivot.values.InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
		 *         status : Boolean[1] = use->includesAll(resources.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesKindsInUse'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
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
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::kind\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ Kind kind = _1.getKind();
		            //
		            accumulator.add(kind);
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Kind _1_0 = (Kind)ITERATOR__1_0.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_0);
		            //
		            if (oclContainer instanceof org.eclipse.ocl.pivot.values.CollectionValue) {
		                for (Object value : ((org.eclipse.ocl.pivot.values.CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_0.add(value);
		                }
		            }
		            else {
		                accumulator_0.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesKindsInUse, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
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
		 *         status : Boolean[1] = use->includesAll(
		 *           resources.mixins.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesMixinsInUse'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect_0 = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
		            /**
		             * mixins
		             */
		            if (_1 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::mixins\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = _1.getMixins();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		            //
		            for (Object value : BOXED_mixins.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1_0 = (Mixin)ITERATOR__1_0.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@Thrown*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_0);
		            //
		            if (oclContainer instanceof org.eclipse.ocl.pivot.values.CollectionValue) {
		                for (Object value : ((org.eclipse.ocl.pivot.values.CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_0.add(value);
		                }
		            }
		            else {
		                accumulator_0.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
		 *         status : Boolean[1] = use->includesAll(
		 *           resources.links.mixins.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesLinksMixinsInUse'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Extension> use = this.getUse();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
		        final /*@NonNull*/ /*@Thrown*/ List<Resource> resources = this.getResources();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_resources.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_1;
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
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Resource::links\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Link> links = _1.getLinks();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
		            //
		            for (Object value : BOXED_links.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_1.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect_0 = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
		            /**
		             * mixins
		             */
		            if (_1_0 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Entity::mixins\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = _1_0.getMixins();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		            //
		            for (Object value : BOXED_mixins.flatten().getElements()) {
		                accumulator_0.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = collect_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1_1.hasNext()) {
		                collect = accumulator_1;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1_1 = (Mixin)ITERATOR__1_1.next();
		            /**
		             * oclContainer()
		             */
		            final /*@Nullable*/ /*@Thrown*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_1);
		            //
		            if (oclContainer instanceof org.eclipse.ocl.pivot.values.CollectionValue) {
		                for (Object value : ((org.eclipse.ocl.pivot.values.CollectionValue)oclContainer).flatten().getElements()) {
		                    accumulator_1.add(value);
		                }
		            }
		            else {
		                accumulator_1.add(oclContainer);
		            }
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksTargetsInConfiguration((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConfigurationImpl
