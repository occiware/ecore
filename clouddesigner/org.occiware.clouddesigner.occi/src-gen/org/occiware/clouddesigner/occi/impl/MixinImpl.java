/**
 * Copyright (c) 2015-2016 Obeo, Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
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

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

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
		/**
		 * Entity.allInstances()->select(mixins->includes(self))
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
		final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0));
		/*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
		/*@NonNull*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		/*@NonNull*/ /*@Thrown*/ SetValue select;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        select = accumulator;
		        break;
		    }
		    /*@NonNull*/ /*@NonInvalid*/ Entity _1 = (Entity)ITERATOR__1.next();
		    /**
		     * mixins->includes(self)
		     */
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = _1.getMixins();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		    final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_mixins, this).booleanValue());
		    //
		    if (includes == ValueUtil.TRUE_VALUE) {
		        accumulator.add(_1);
		    }
		}
		final List<Entity> UNBOXED_select = select.asEcoreObjects(idResolver, org.occiware.clouddesigner.occi.Entity.class);
		assert UNBOXED_select != null;
		return (EList<Entity>)UNBOXED_select;
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
		 *       let status : OclAny[1] = actions->isUnique(term)
		 *       in
		 *         'Mixin::ActionTermUnicity'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_ActionTermUnicity));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Action> actions = this.getActions();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
		        /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Action);
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Category::term\'");
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_ActionTermUnicity, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
		 *         status : OclAny[1] = depends->closure(depends)
		 *         ->excludes(self)
		 *       in
		 *         'Mixin::NoCyclicInheritance'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_NoCyclicInheritance));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
		        final /*@NonNull*/ LibraryIteration IMPL_closure_0 = (LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._OrderedSet__closure);
		        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
		        /**
		         * Implementation of the iterator body.
		         */
		        final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
		            /**
		             * depends
		             */
		            @Override
		            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		                final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1;
		                if (symbol_0 == null) {
		                    throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Mixin::depends\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		                return BOXED_depends_0;
		            }
		        };
		        final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue closure = ClassUtil.nonNullState((OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(CollectionExcludesOperation.INSTANCE.evaluate(closure, this).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_NoCyclicInheritance, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
		 *         status : OclAny[1] = let owner : OclElement[?] = self.oclContainer()
		 *         in
		 *           if owner.oclIsTypeOf(Extension)
		 *           then
		 *             let
		 *               ownerScheme : String[1] = owner.oclAsType(Extension).scheme
		 *             in
		 *               scheme.substring(1, ownerScheme.size() - 1) =
		 *               ownerScheme.substring(1, ownerScheme.size() - 1)
		 *           else true
		 *           endif
		 *       in
		 *         'Mixin::CorrectScheme'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_CorrectScheme));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_symbol_0;
		    try {
		        final /*@Nullable*/ /*@NonInvalid*/ Object owner = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, this);
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
		        final /*@Thrown*/ boolean oclIsTypeOf = ClassUtil.nonNullState(OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(evaluator, owner, TYP_occi_c_c_Extension_0).booleanValue());
		        /*@Thrown*/ boolean symbol_0;
		        if (oclIsTypeOf) {
		            final /*@NonNull*/ /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, owner, TYP_occi_c_c_Extension_0));
		            final /*@NonNull*/ /*@Thrown*/ String ownerScheme = oclAsType.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue size_0 = ClassUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(ownerScheme));
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue diff_0 = ClassUtil.nonNullState((IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1));
		            final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ String substring = ClassUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0));
		            final /*@NonNull*/ /*@Thrown*/ String substring_0 = ClassUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(ownerScheme, OCCITables.INT_1, diff_0));
		            final /*@Thrown*/ boolean eq = substring.equals(substring_0);
		            symbol_0 = eq;
		        }
		        else {
		            symbol_0 = ValueUtil.TRUE_VALUE;
		        }
		        CAUGHT_symbol_0 = symbol_0;
		    }
		    catch (Exception e) {
		        CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_CorrectScheme, this, null, diagnostics, context, null, severity_0, CAUGHT_symbol_0, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
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
		 *         status : OclAny[1] = attributes.name->excludesAll(
		 *           depends->closure(depends).attributes.name)
		 *       in
		 *         'Mixin::AttributesNameNotAlreadyDefinedInDepends'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = this.getAttributes();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Attribute::name\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String name = _1.getName();
		            //
		            accumulator.add(name);
		        }
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		        final /*@NonNull*/ org.eclipse.ocl.pivot.Class TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
		        final /*@NonNull*/ LibraryIteration IMPL_closure_0 = (LibraryIteration)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._OrderedSet__closure);
		        final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, OCCITables.ORD_CLSSid_Mixin, OCCITables.ORD_CLSSid_Mixin);
		        /**
		         * Implementation of the iterator body.
		         */
		        final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
		            /**
		             * depends
		             */
		            @Override
		            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Evaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1_0) {
		                final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1_0;
		                if (symbol_0 == null) {
		                    throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Mixin::depends\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		                final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		                return BOXED_depends_0;
		            }
		        };
		        final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue closure = ClassUtil.nonNullState((OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Attribute);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = closure.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_1;
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Category::attributes\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes_0 = _1_1.getAttributes();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes_0);
		            //
		            for (Object value : BOXED_attributes_0.flatten().getElements()) {
		                accumulator_0.add(value);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		        /*@Nullable*/ Iterator<?> ITERATOR__1_2 = collect_1.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Attribute::name\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String name_0 = _1_2.getName();
		            //
		            accumulator_1.add(name_0);
		        }
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(CollectionExcludesAllOperation.INSTANCE.evaluate(collect, collect_0).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
				return !getEntities().isEmpty();
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
