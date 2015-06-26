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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.MixinImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.MixinImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.MixinImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.MixinImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixinImpl extends CategoryImpl implements Mixin {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> depends;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> applies;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.MIXIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, OCCIPackage.MIXIN__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getDepends() {
		if (depends == null) {
			depends = new EObjectResolvingEList<Mixin>(Mixin.class, this, OCCIPackage.MIXIN__DEPENDS);
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getApplies() {
		if (applies == null) {
			applies = new EObjectResolvingEList<Kind>(Kind.class, this, OCCIPackage.MIXIN__APPLIES);
		}
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, OCCIPackage.MIXIN__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ActionTermUnicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv ActionTermUnicity:
		 *   let severity : Integer[1] = 'Mixin::ActionTermUnicity'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = actions->isUnique(term)
		 *       in
		 *         'Mixin::ActionTermUnicity'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_ActionTermUnicity));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Action> actions = this.getActions();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Action);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_actions.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Action _1 = (Action)ITERATOR__1.next();
		            /**
		             * term
		             */
		            if (_1 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::term\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		            //
		            if (accumulator.includes(term) == ValueUtil.TRUE_VALUE) {
		                status = ValueUtil.FALSE_VALUE;			// Abort after second find
		                break;
		            }
		            else {
		                accumulator.add(term);
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_ActionTermUnicity, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoCyclicInheritance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv NoCyclicInheritance:
		 *   let severity : Integer[1] = 'Mixin::NoCyclicInheritance'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = depends->closure(depends)
		 *         ->excludes(self)
		 *       in
		 *         'Mixin::NoCyclicInheritance'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_NoCyclicInheritance));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.LibraryIteration IMPL_closure_0 = (org.eclipse.ocl.pivot.library.LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables.Operations._OrderedSet__closure);
		        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
		        /**
		         * Implementation of the iterator body.
		         */
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.AbstractBinaryOperation BODY_closure_0 = new org.eclipse.ocl.pivot.library.AbstractBinaryOperation() {
		            /**
		             * depends
		             */
		            @Override
		            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ org.eclipse.ocl.pivot.ids.TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		                final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1;
		                if (symbol_0 == null) {
		                    throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::depends\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		                final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		                return BOXED_depends_0;
		            }
		        };
		        final /*@NonNull*/  org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager MGR_closure_0 = new org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue closure = ClassUtil.nonNullState((org.eclipse.ocl.pivot.values.OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation.INSTANCE.evaluate(closure, this).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_NoCyclicInheritance, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv CorrectScheme:
		 *   let severity : Integer[1] = 'Mixin::CorrectScheme'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = let
		 *           ownerScheme : String[1] = self.oclContainer()
		 *           .oclAsType(Extension).scheme
		 *         in
		 *           scheme.substring(1, ownerScheme.size() - 1) =
		 *           ownerScheme.substring(1, ownerScheme.size() - 1)
		 *       in
		 *         'Mixin::CorrectScheme'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_CorrectScheme));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
		        final /*@Nullable*/ /*@NonInvalid*/ Object oclContainer = org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, this);
		        final /*@NonNull*/ /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_occi_c_c_Extension_0));
		        final /*@NonNull*/ /*@Thrown*/ String ownerScheme = oclAsType.getScheme();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.IntegerValue size_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringSizeOperation.INSTANCE.evaluate(ownerScheme));
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.IntegerValue diff_0 = ClassUtil.nonNullState((org.eclipse.ocl.pivot.values.IntegerValue)org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1));
		        final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		        final /*@NonNull*/ /*@Thrown*/ String substring = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0));
		        final /*@NonNull*/ /*@Thrown*/ String substring_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE.evaluate(ownerScheme, OCCITables.INT_1, diff_0));
		        final /*@Thrown*/ boolean eq = substring.equals(substring_0);
		        CAUGHT_eq = eq;
		    }
		    catch (Exception e) {
		        CAUGHT_eq = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_CorrectScheme, this, diagnostics, context, severity_0, CAUGHT_eq, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributesNameNotAlreadyDefinedInDepends(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AttributesNameNotAlreadyDefinedInDepends:
		 *   let
		 *     severity : Integer[1] = 'Mixin::AttributesNameNotAlreadyDefinedInDepends'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = attributes.name->excludesAll(
		 *           depends->closure(depends).attributes.name)
		 *       in
		 *         'Mixin::AttributesNameNotAlreadyDefinedInDepends'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = this.getAttributes();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Attribute _1 = (Attribute)ITERATOR__1.next();
		            /**
		             * name
		             */
		            if (_1 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Attribute::name\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String name = _1.getName();
		            //
		            accumulator.add(name);
		        }
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.LibraryIteration IMPL_closure_0 = (org.eclipse.ocl.pivot.library.LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables.Operations._OrderedSet__closure);
		        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
		        /**
		         * Implementation of the iterator body.
		         */
		        final /*@NonNull*/ org.eclipse.ocl.pivot.library.AbstractBinaryOperation BODY_closure_0 = new org.eclipse.ocl.pivot.library.AbstractBinaryOperation() {
		            /**
		             * depends
		             */
		            @Override
		            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ org.eclipse.ocl.pivot.ids.TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1_0) {
		                final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1_0;
		                if (symbol_0 == null) {
		                    throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::depends\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		                final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		                return BOXED_depends_0;
		            }
		        };
		        final /*@NonNull*/  org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager MGR_closure_0 = new org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue closure = ClassUtil.nonNullState((org.eclipse.ocl.pivot.values.OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Attribute);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = closure.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_1;
		        while (true) {
		            if (!ITERATOR__1_1.hasNext()) {
		                collect_1 = accumulator_0;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1_1 = (Mixin)ITERATOR__1_1.next();
		            /**
		             * attributes
		             */
		            if (_1_1 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::attributes\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes_0 = _1_1.getAttributes();
		            final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_attributes_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes_0);
		            //
		            for (Object value : BOXED_attributes_0.flatten().getElements()) {
		                accumulator_0.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_2 = collect_1.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_0;
		        while (true) {
		            if (!ITERATOR__1_2.hasNext()) {
		                collect_0 = accumulator_1;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Attribute _1_2 = (Attribute)ITERATOR__1_2.next();
		            /**
		             * name
		             */
		            if (_1_2 == null) {
		                throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Attribute::name\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String name_0 = _1_2.getName();
		            //
		            accumulator_1.add(name_0);
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation.INSTANCE.evaluate(collect, collect_0).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.MIXIN__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.MIXIN__ACTIONS:
				return getActions();
			case OCCIPackage.MIXIN__DEPENDS:
				return getDepends();
			case OCCIPackage.MIXIN__APPLIES:
				return getApplies();
			case OCCIPackage.MIXIN__ENTITIES:
				return getEntities();
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
			case OCCIPackage.MIXIN__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case OCCIPackage.MIXIN__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.MIXIN__APPLIES:
				getApplies().clear();
				getApplies().addAll((Collection<? extends Kind>)newValue);
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
			case OCCIPackage.MIXIN__ACTIONS:
				getActions().clear();
				return;
			case OCCIPackage.MIXIN__DEPENDS:
				getDepends().clear();
				return;
			case OCCIPackage.MIXIN__APPLIES:
				getApplies().clear();
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
			case OCCIPackage.MIXIN__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OCCIPackage.MIXIN__DEPENDS:
				return depends != null && !depends.isEmpty();
			case OCCIPackage.MIXIN__APPLIES:
				return applies != null && !applies.isEmpty();
			case OCCIPackage.MIXIN__ENTITIES:
				return entities != null && !entities.isEmpty();
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
			case OCCIPackage.MIXIN___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP:
				return ActionTermUnicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP:
				return NoCyclicInheritance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP:
				return AttributesNameNotAlreadyDefinedInDepends((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MixinImpl
