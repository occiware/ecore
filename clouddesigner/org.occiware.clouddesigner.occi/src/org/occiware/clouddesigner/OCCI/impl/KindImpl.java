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

import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation;
import org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation;

import org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.examples.library.logical.BooleanAndOperation;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;

import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Entity;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.KindImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.KindImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.KindImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KindImpl extends CategoryImpl implements Kind {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Kind parent;

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
	protected KindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Kind)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.KIND__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Kind newParent) {
		Kind oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, OCCIPackage.KIND__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, OCCIPackage.KIND__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv CorrectScheme: scheme = self.oclContainer().oclAsType(Extension).scheme
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Extension_0 = idResolver.getType(OCCITables.CLSSid_Extension, null);
		    final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		    final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(this);
		    final /*@Nullable*/ /*@Thrown*/ Extension oclAsType = (Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_OCCI_c_c_Extension_0);
		    if (oclAsType == null) {
		        throw new InvalidValueException("Null source for \'OCCI::Extension::scheme\'");
		    }
		    final /*@NonNull*/ /*@Thrown*/ String scheme_0 = oclAsType.getScheme();
		    final /*@Thrown*/ boolean eq = scheme.equals(scheme_0);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Kind", "CorrectScheme", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.KIND__CORRECT_SCHEME, message, new Object [] { this }));
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
		 * inv NoCyclicInheritance: parent->closure(parent)->excludes(self)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_excludes;
		try {
		    final /*@Nullable*/ /*@Thrown*/ Kind parent = this.getParent();
		    final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = DomainUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, parent));
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
		            final /*@Nullable*/ /*@Thrown*/ Kind parent_0 = symbol_0.getParent();
		            return parent_0;
		        }
		    };
		    final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
		    final /*@NonNull*/ /*@Thrown*/ SetValue closure = (SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Kind", "NoCyclicInheritance", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.KIND__NO_CYCLIC_INHERITANCE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributesNameNotAlreadyDefinedInParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AttributesNameNotAlreadyDefinedInParent: attributes.name->excludesAll(parent->closure(parent).attributes.name)
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
		    final /*@Nullable*/ /*@Thrown*/ Kind parent = this.getParent();
		    final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = DomainUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, parent));
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
		        public /*@Nullable*/ Object evaluate(final /*@NonNull*/ DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@Nullable*/ /*@NonInvalid*/ Object _1_0) {
		            final /*@Nullable*/ /*@NonInvalid*/ Kind symbol_0 = (Kind)_1_0;
		            if (symbol_0 == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Kind::parent\'");
		            }
		            final /*@Nullable*/ /*@Thrown*/ Kind parent_0 = symbol_0.getParent();
		            return parent_0;
		        }
		    };
		    final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(evaluator, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
		    final /*@NonNull*/ /*@Thrown*/ SetValue closure = (SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0);
		    /*@NonNull*/ /*@Thrown*/ BagValue.Accumulator accumulator_0 = ValuesUtil.createBagAccumulatorValue(OCCITables.BAG_CLSSid_Attribute);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_1 = closure.iterator();
		    /*@NonNull*/ /*@Thrown*/ BagValue collect_1;
		    while (true) {
		        if (!ITERATOR__1_1.hasNext()) {
		            collect_1 = accumulator_0;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Kind _1_1 = (Kind)ITERATOR__1_1.next();
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
		    /*@NonNull*/ /*@Thrown*/ BagValue.Accumulator accumulator_1 = ValuesUtil.createBagAccumulatorValue(OCCITables.BAG_PRIMid_String);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_2 = collect_1.iterator();
		    /*@NonNull*/ /*@Thrown*/ BagValue collect_0;
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Kind", "AttributesNameNotAlreadyDefinedInParent", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT, message, new Object [] { this }));
		}
		return false;
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Kind", "ActionTermUnicity", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.KIND__ACTION_TERM_UNICITY, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EntityKindIsRootParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv EntityKindIsRootParent: self->closure(parent)->exists(k | k.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary standardLibrary = idResolver.getStandardLibrary();
		/*@Nullable*/ /*@Caught*/ Object CAUGHT_exists;
		try {
		    final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = DomainUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Kind, this));
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
		         * k.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null
		         */
		        /*@Nullable*/ /*@Caught*/ Object CAUGHT_and_0;
		        try {
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_and;
		            try {
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		                try {
		                    if (k == null) {
		                        throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		                    }
		                    final /*@NonNull*/ /*@Thrown*/ String term = k.getTerm();
		                    final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_entity);
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
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq_1;
		            try {
		                if (k == null) {
		                    throw new InvalidValueException("Null source for \'OCCI::Kind::parent\'");
		                }
		                final /*@Nullable*/ /*@Thrown*/ Kind parent_0 = k.getParent();
		                final /*@Thrown*/ boolean eq_1 = parent_0 == null;
		                CAUGHT_eq_1 = eq_1;
		            }
		            catch (Exception e) {
		                CAUGHT_eq_1 = ValuesUtil.createInvalidValue(e);
		            }
		            final /*@Nullable*/ /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_eq_1);
		            CAUGHT_and_0 = and_0;
		        }
		        catch (Exception e) {
		            CAUGHT_and_0 = ValuesUtil.createInvalidValue(e);
		        }
		        //
		        if (CAUGHT_and_0 == ValuesUtil.TRUE_VALUE) {					// Normal successful body evaluation result
		            exists = ValuesUtil.TRUE_VALUE;
		            break;														// Stop immediately 
		        }
		        else if (CAUGHT_and_0 == ValuesUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
		            ;															// Carry on
		        }
		        else if (CAUGHT_and_0 == null) {								// Abnormal null body evaluation result
		            if (accumulator == ValuesUtil.FALSE_VALUE) {
		                accumulator = null;										// Cache a null failure
		            }
		        }
		        else if (CAUGHT_and_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
		            accumulator = CAUGHT_and_0;									// Cache an exception failure
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Kind", "EntityKindIsRootParent", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.KIND__ENTITY_KIND_IS_ROOT_PARENT, message, new Object [] { this }));
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
			case OCCIPackage.KIND__ACTIONS:
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
			case OCCIPackage.KIND__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OCCIPackage.KIND__ACTIONS:
				return getActions();
			case OCCIPackage.KIND__ENTITIES:
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
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)newValue);
				return;
			case OCCIPackage.KIND__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)null);
				return;
			case OCCIPackage.KIND__ACTIONS:
				getActions().clear();
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
			case OCCIPackage.KIND__PARENT:
				return parent != null;
			case OCCIPackage.KIND__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OCCIPackage.KIND__ENTITIES:
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
			case OCCIPackage.KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP:
				return NoCyclicInheritance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP:
				return AttributesNameNotAlreadyDefinedInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP:
				return ActionTermUnicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP:
				return EntityKindIsRootParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //KindImpl
