/**
 */
package org.occiware.clouddesigner.OCCI.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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

import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation;
import org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation;

import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.examples.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;

import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.examples.library.string.StringSizeOperation;
import org.eclipse.ocl.examples.library.string.StringSubstringOperation;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Entity;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Mixin;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.MixinImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
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
		 * inv ActionTermUnicity: actions->isUnique(term)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Action> actions = this.getActions();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Action);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_actions.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Action _1 = (Action)ITERATOR__1.next();
		        /**
		         * term
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		        //
		        if (accumulator.includes(term) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(term);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Mixin", "ActionTermUnicity", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.MIXIN__ACTION_TERM_UNICITY, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoCyclicInheritance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv NoCyclicInheritance: depends->closure(depends)->excludes(self)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_excludes;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		    final /*@NonNull*/ DomainType TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
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
		        public /*@Nullable*/ Object evaluate(final /*@NonNull*/ DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1) {
		            final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1;
		            if (symbol_0 == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Mixin::depends\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		            return BOXED_depends_0;
		        }
		    };
		    final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue closure = (OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
		    final /*@Thrown*/ boolean excludes = DomainUtil.nonNullState(CollectionExcludesOperation.INSTANCE.evaluate(closure, this).booleanValue());
		    CAUGHT_excludes = excludes;
		}
		catch (Exception e) {
		    CAUGHT_excludes = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_excludes == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Mixin", "NoCyclicInheritance", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.MIXIN__NO_CYCLIC_INHERITANCE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv CorrectScheme: let ownerScheme = self.oclContainer().oclAsType(Extension).scheme in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Extension_0 = idResolver.getType(OCCITables.CLSSid_Extension, null);
		    final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(this);
		    final /*@Nullable*/ /*@Thrown*/ Extension oclAsType = (Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_OCCI_c_c_Extension_0);
		    if (oclAsType == null) {
		        throw new InvalidValueException("Null source for \'OCCI::Extension::scheme\'");
		    }
		    final /*@NonNull*/ /*@Thrown*/ String ownerScheme = oclAsType.getScheme();
		    final /*@NonNull*/ /*@Thrown*/ IntegerValue size_0 = DomainUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(ownerScheme));
		    final /*@NonNull*/ /*@Thrown*/ IntegerValue diff_0 = DomainUtil.nonNullState((IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1));
		    final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		    final /*@NonNull*/ /*@Thrown*/ String substring = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0));
		    final /*@NonNull*/ /*@Thrown*/ String substring_0 = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(ownerScheme, OCCITables.INT_1, diff_0));
		    final /*@Thrown*/ boolean eq = substring.equals(substring_0);
		    CAUGHT_eq = eq;
		}
		catch (Exception e) {
		    CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_eq == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Mixin", "CorrectScheme", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.MIXIN__CORRECT_SCHEME, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributesNameNotAlreadyDefinedInDepends(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AttributesNameNotAlreadyDefinedInDepends: attributes.name->excludesAll(depends->closure(depends).attributes.name)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_excludesAll;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = this.getAttributes();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		    /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
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
		            throw new InvalidValueException("Null source for \'OCCI::Attribute::name\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String name = _1.getName();
		        //
		        accumulator.add(name);
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = this.getDepends();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		    final /*@NonNull*/ DomainType TYPE_closure_0 = evaluator.getStaticTypeOf(BOXED_depends);
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
		        public /*@Nullable*/ Object evaluate(final /*@NonNull*/ DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_depends, final /*@Nullable*/ /*@NonInvalid*/ Object _1_0) {
		            final /*@Nullable*/ /*@NonInvalid*/ Mixin symbol_0 = (Mixin)_1_0;
		            if (symbol_0 == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Mixin::depends\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends_0 = symbol_0.getDepends();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends_0);
		            return BOXED_depends_0;
		        }
		    };
		    final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.ORD_CLSSid_Mixin, BODY_closure_0, BOXED_depends, ACC_closure_0);
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue closure = (OrderedSetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
		    /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Attribute);
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
		            throw new InvalidValueException("Null source for \'OCCI::Category::attributes\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes_0 = _1_1.getAttributes();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes_0);
		        //
		        for (Object value : BOXED_attributes_0.flatten().getElements()) {
		            accumulator_0.add(value);
		        }
		    }
		    /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
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
		            throw new InvalidValueException("Null source for \'OCCI::Attribute::name\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String name_0 = _1_2.getName();
		        //
		        accumulator_1.add(name_0);
		    }
		    final /*@Thrown*/ boolean excludesAll = DomainUtil.nonNullState(CollectionExcludesAllOperation.INSTANCE.evaluate(collect, collect_0).booleanValue());
		    CAUGHT_excludesAll = excludesAll;
		}
		catch (Exception e) {
		    CAUGHT_excludesAll = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_excludesAll == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Mixin", "AttributesNameNotAlreadyDefinedInDepends", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.MIXIN__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS, message, new Object [] { this }));
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
