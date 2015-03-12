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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.examples.library.collection.CollectionIntersectionOperation;
import org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.examples.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.examples.library.string.StringSizeOperation;
import org.eclipse.ocl.examples.library.string.StringSubstringOperation;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Mixin;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;
import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.ExtensionImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements
		Extension {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> import_;

	/**
	 * The cached value of the '{@link #getKinds() <em>Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kinds;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> types;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getImport() {
		if (import_ == null) {
			import_ = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.EXTENSION__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getKinds() {
		if (kinds == null) {
			kinds = new EObjectContainmentEList<Kind>(Kind.class, this, OCCIPackage.EXTENSION__KINDS);
		}
		return kinds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.EXTENSION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<EDataType>(EDataType.class, this, OCCIPackage.EXTENSION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindsSchemeValid(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		/**
		 * inv KindsSchemeValid: kinds->forAll(k | k.scheme = self.scheme)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_forAll;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		    /*@NonNull*/ /*@Thrown*/ Object accumulator = ValuesUtil.TRUE_VALUE;
		    /*@Nullable*/ Iterator<?> ITERATOR_k = BOXED_kinds.iterator();
		    /*@Thrown*/ boolean forAll;
		    while (true) {
		        if (!ITERATOR_k.hasNext()) {
		            if (accumulator == ValuesUtil.TRUE_VALUE) {
		                forAll = (Boolean)accumulator;
		            }
		            else {
		                throw (InvalidValueException)accumulator;
		            }
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
		        /**
		         * k.scheme = self.scheme
		         */
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		        try {
		            if (k == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Category::scheme\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String scheme = k.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ String scheme_0 = this.getScheme();
		            final /*@Thrown*/ boolean eq = scheme.equals(scheme_0);
		            CAUGHT_eq = eq;
		        }
		        catch (Exception e) {
		            CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		        }
		        //
		        if (CAUGHT_eq == ValuesUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		            forAll = ValuesUtil.FALSE_VALUE;
		            break;														// Stop immediately 
		        }
		        else if (CAUGHT_eq == ValuesUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		            ;															// Carry on
		        }
		        else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
		            accumulator = CAUGHT_eq;									// Cache an exception failure
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
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Extension", "KindsSchemeValid", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.EXTENSION__KINDS_SCHEME_VALID, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // Generation failed
	 */
	public boolean KindParentLocalOrImported(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		// /**
		// *
		// * inv KindParentLocalOrImported: kinds->forAll(parent <> null implies
		// let parentExtension = parent.oclContainer() in parentExtension = self
		// or import->includes(parentExtension))
		// */
		// final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator =
		// PivotUtil.getEvaluator(this);
		// final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver =
		// evaluator.getIdResolver();
		// final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary
		// standardLibrary = idResolver.getStandardLibrary();
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_forAll;
		// try {
		// final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		// final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds =
		// idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		// final /*@NonNull*/ DomainType TYPE_forAll_0 =
		// evaluator.getStaticTypeOf(BOXED_kinds);
		// final /*@NonNull*/ LibraryIteration IMPL_forAll_0 =
		// (LibraryIteration)TYPE_forAll_0.lookupImplementation(standardLibrary,
		// OCLstdlibTables.Operations._Collection__0_forAll);
		// final /*@NonNull*/ Object ACC_forAll_0 =
		// IMPL_forAll_0.createAccumulatorValue(evaluator, TypeId.BOOLEAN,
		// TypeId.BOOLEAN);
		// /**
		// * Implementation of the iterator body.
		// */
		// final /*@NonNull*/ AbstractTernaryOperation BODY_forAll_0 = new
		// AbstractTernaryOperation() {
		// /**
		// * parent <> null implies
		// * let parentExtension : OclElement = parent.oclContainer()
		// * in parentExtension = self or import->includes(parentExtension)
		// */
		// @Override
		// public /*@Nullable*/ Object evaluate(final /*@NonNull*/
		// DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final
		// /*@Nullable*/ Object BOXED_kinds, final /*@Nullable*/ /*@NonInvalid*/
		// Object _1, final /*@Nullable*/ /*@NonInvalid*/ Object _2) {
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_implies;
		// try {
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_ne;
		// try {
		// final /*@Nullable*/ /*@Thrown*/ Kind parent = this.getParent();
		// final /*@Thrown*/ boolean ne = parent != null;
		// CAUGHT_ne = ne;
		// }
		// catch (Exception e) {
		// CAUGHT_ne = ValuesUtil.createInvalidValue(e);
		// }
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_or;
		// try {
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_parentExtension;
		// try {
		// final /*@Nullable*/ /*@Thrown*/ Kind parent_0 = this.getParent();
		// final /*@Nullable*/ /*@Thrown*/ Object parentExtension =
		// ClassifierOclContainerOperation.INSTANCE.evaluate(parent_0);
		// CAUGHT_parentExtension = parentExtension;
		// }
		// catch (Exception e) {
		// CAUGHT_parentExtension = ValuesUtil.createInvalidValue(e);
		// }
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		// try {
		// if (CAUGHT_parentExtension instanceof InvalidValueException) {
		// throw (InvalidValueException)CAUGHT_parentExtension;
		// }
		// final /*@Thrown*/ boolean eq = this.equals(CAUGHT_parentExtension);
		// CAUGHT_eq = eq;
		// }
		// catch (Exception e) {
		// CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		// }
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		// try {
		// final /*@NonNull*/ /*@Thrown*/ List<Extension> symbol_0 =
		// this.getImport();
		// final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_symbol_0 =
		// idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension,
		// symbol_0);
		// if (CAUGHT_parentExtension instanceof InvalidValueException) {
		// throw (InvalidValueException)CAUGHT_parentExtension;
		// }
		// final /*@Thrown*/ boolean includes =
		// DomainUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0,
		// CAUGHT_parentExtension).booleanValue());
		// CAUGHT_includes = includes;
		// }
		// catch (Exception e) {
		// CAUGHT_includes = ValuesUtil.createInvalidValue(e);
		// }
		// final /*@Nullable*/ /*@Thrown*/ Boolean or =
		// BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
		// CAUGHT_or = or;
		// }
		// catch (Exception e) {
		// CAUGHT_or = ValuesUtil.createInvalidValue(e);
		// }
		// final /*@Nullable*/ /*@Thrown*/ Boolean implies =
		// BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_or);
		// CAUGHT_implies = implies;
		// }
		// catch (Exception e) {
		// CAUGHT_implies = ValuesUtil.createInvalidValue(e);
		// }
		// return CAUGHT_implies;
		// }
		// };
		// final /*@NonNull*/ ExecutorDoubleIterationManager MGR_forAll_0 = new
		// ExecutorDoubleIterationManager(evaluator, TypeId.BOOLEAN,
		// BODY_forAll_0, BOXED_kinds, ACC_forAll_0);
		// final /*@Nullable*/ /*@Thrown*/ Boolean forAll =
		// (Boolean)IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
		// CAUGHT_forAll = forAll;
		// }
		// catch (Exception e) {
		// CAUGHT_forAll = ValuesUtil.createInvalidValue(e);
		// }
		// if (CAUGHT_forAll == ValuesUtil.TRUE_VALUE) {
		// return true;
		// }
		// if (diagnostics != null) {
		// int severity = CAUGHT_forAll == null ? Diagnostic.ERROR :
		// Diagnostic.WARNING;
		// String message =
		// DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
		// new Object[]{"Extension", "KindParentLocalOrImported",
		// EObjectValidator.getObjectLabel(this, context)});
		// diagnostics.add(new BasicDiagnostic(severity,
		// OCCIValidator.DIAGNOSTIC_SOURCE,
		// OCCIValidator.EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED, message, new
		// Object [] { this }));
		// }
		// return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinsSchemeValid(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		/**
		 * 
		 * inv MixinsSchemeValid: mixins->forAll(m | m.scheme.substring(1,scheme.size()-1) = scheme.substring(1,scheme.size()-1))
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_forAll;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		    /*@NonNull*/ /*@Thrown*/ Object accumulator = ValuesUtil.TRUE_VALUE;
		    /*@Nullable*/ Iterator<?> ITERATOR_m = BOXED_mixins.iterator();
		    /*@Thrown*/ boolean forAll;
		    while (true) {
		        if (!ITERATOR_m.hasNext()) {
		            if (accumulator == ValuesUtil.TRUE_VALUE) {
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
		         * m.scheme.substring(1, scheme.size() - 1) =
		         * scheme.substring(1, scheme.size() - 1)
		         */
		        /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		        try {
		            final /*@NonNull*/ /*@Thrown*/ String scheme_1 = this.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue size_0 = DomainUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(scheme_1));
		            final /*@NonNull*/ /*@Thrown*/ IntegerValue diff_0 = DomainUtil.nonNullState((IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1));
		            if (m == null) {
		                throw new InvalidValueException("Null source for \'OCCI::Category::scheme\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String scheme = m.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ String substring = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0));
		            final /*@NonNull*/ /*@Thrown*/ String substring_0 = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme_1, OCCITables.INT_1, diff_0));
		            final /*@Thrown*/ boolean eq = substring.equals(substring_0);
		            CAUGHT_eq = eq;
		        }
		        catch (Exception e) {
		            CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		        }
		        //
		        if (CAUGHT_eq == ValuesUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		            forAll = ValuesUtil.FALSE_VALUE;
		            break;														// Stop immediately 
		        }
		        else if (CAUGHT_eq == ValuesUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		            ;															// Carry on
		        }
		        else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
		            accumulator = CAUGHT_eq;									// Cache an exception failure
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
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Extension", "MixinsSchemeValid", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.EXTENSION__MIXINS_SCHEME_VALID, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TermUnicity(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		/**
		 * inv TermUnicity: kinds.term->intersection(mixins.term)->isEmpty()
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isEmpty;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		    /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_kinds.iterator();
		    /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            collect = accumulator;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Kind _1 = (Kind)ITERATOR__1.next();
		        /**
		         * term
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		        //
		        accumulator.add(term);
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		    /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_0 = BOXED_mixins.iterator();
		    /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
		    while (true) {
		        if (!ITERATOR__1_0.hasNext()) {
		            collect_0 = accumulator_0;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Mixin _1_0 = (Mixin)ITERATOR__1_0.next();
		        /**
		         * term
		         */
		        if (_1_0 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String term_0 = _1_0.getTerm();
		        //
		        accumulator_0.add(term_0);
		    }
		    final /*@NonNull*/ /*@Thrown*/ BagValue intersection = DomainUtil.nonNullState((BagValue)CollectionIntersectionOperation.INSTANCE.evaluate(collect, collect_0));
		    final /*@Thrown*/ boolean isEmpty = DomainUtil.nonNullState(CollectionIsEmptyOperation.INSTANCE.evaluate(intersection).booleanValue());
		    CAUGHT_isEmpty = isEmpty;
		}
		catch (Exception e) {
		    CAUGHT_isEmpty = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_isEmpty == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Extension", "TermUnicity", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.EXTENSION__TERM_UNICITY, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // Generation failed
	 */
	public boolean MixinAppliesLocalOrImported(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		// /**
		// *
		// * inv MixinAppliesLocalOrImported: mixins.applies->forAll(let
		// extension = oclContainer() in extension = self or
		// import->includes(extension))
		// */
		// final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator =
		// PivotUtil.getEvaluator(this);
		// final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver =
		// evaluator.getIdResolver();
		// final /*@NonNull*/ /*@NonInvalid*/ DomainStandardLibrary
		// standardLibrary = idResolver.getStandardLibrary();
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_forAll;
		// try {
		// final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		// final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins =
		// idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin,
		// mixins);
		// /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator =
		// ValuesUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		// /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_mixins.iterator();
		// /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		// while (true) {
		// if (!ITERATOR__1.hasNext()) {
		// collect = accumulator;
		// break;
		// }
		// /*@Nullable*/ /*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
		// /**
		// * applies
		// */
		// if (_1 == null) {
		// throw new
		// InvalidValueException("Null source for \'OCCI::Mixin::applies\'");
		// }
		// final /*@NonNull*/ /*@Thrown*/ List<Kind> applies = _1.getApplies();
		// final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies =
		// idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind,
		// applies);
		// //
		// for (Object value : BOXED_applies.flatten().getElements()) {
		// accumulator.add(value);
		// }
		// }
		// final /*@NonNull*/ DomainType TYPE_forAll_0 =
		// evaluator.getStaticTypeOf(collect);
		// final /*@NonNull*/ LibraryIteration IMPL_forAll_0 =
		// (LibraryIteration)TYPE_forAll_0.lookupImplementation(standardLibrary,
		// OCLstdlibTables.Operations._Collection__0_forAll);
		// final /*@NonNull*/ Object ACC_forAll_0 =
		// IMPL_forAll_0.createAccumulatorValue(evaluator, TypeId.BOOLEAN,
		// TypeId.BOOLEAN);
		// /**
		// * Implementation of the iterator body.
		// */
		// final /*@NonNull*/ AbstractTernaryOperation BODY_forAll_0 = new
		// AbstractTernaryOperation() {
		// /**
		// *
		// * let extension : OclElement = oclContainer()
		// * in extension = self or import->includes(extension)
		// */
		// @Override
		// public /*@Nullable*/ Object evaluate(final /*@NonNull*/
		// DomainEvaluator evaluator, final /*@NonNull*/ TypeId typeId, final
		// /*@Nullable*/ Object collect, final /*@Nullable*/ /*@NonInvalid*/
		// Object _1_0, final /*@Nullable*/ /*@NonInvalid*/ Object _2) {
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_or;
		// try {
		// /*@Nullable*/ /*@Caught*/ Object CAUGHT_extension;
		// try {
		// final /*@Nullable*/ /*@Thrown*/ Object extension =
		// ClassifierOclContainerOperation.INSTANCE.evaluate(this);
		// CAUGHT_extension = extension;
		// }
		// catch (Exception e) {
		// CAUGHT_extension = ValuesUtil.createInvalidValue(e);
		// }
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		// try {
		// if (CAUGHT_extension instanceof InvalidValueException) {
		// throw (InvalidValueException)CAUGHT_extension;
		// }
		// final /*@Thrown*/ boolean eq = this.equals(CAUGHT_extension);
		// CAUGHT_eq = eq;
		// }
		// catch (Exception e) {
		// CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		// }
		// /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		// try {
		// final /*@NonNull*/ /*@Thrown*/ List<Extension> symbol_0 =
		// this.getImport();
		// final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_symbol_0 =
		// idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension,
		// symbol_0);
		// if (CAUGHT_extension instanceof InvalidValueException) {
		// throw (InvalidValueException)CAUGHT_extension;
		// }
		// final /*@Thrown*/ boolean includes =
		// DomainUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0,
		// CAUGHT_extension).booleanValue());
		// CAUGHT_includes = includes;
		// }
		// catch (Exception e) {
		// CAUGHT_includes = ValuesUtil.createInvalidValue(e);
		// }
		// final /*@Nullable*/ /*@Thrown*/ Boolean or =
		// BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
		// CAUGHT_or = or;
		// }
		// catch (Exception e) {
		// CAUGHT_or = ValuesUtil.createInvalidValue(e);
		// }
		// return CAUGHT_or;
		// }
		// };
		// final /*@NonNull*/ ExecutorDoubleIterationManager MGR_forAll_0 = new
		// ExecutorDoubleIterationManager(evaluator, TypeId.BOOLEAN,
		// BODY_forAll_0, collect, ACC_forAll_0);
		// final /*@Nullable*/ /*@Thrown*/ Boolean forAll =
		// (Boolean)IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
		// CAUGHT_forAll = forAll;
		// }
		// catch (Exception e) {
		// CAUGHT_forAll = ValuesUtil.createInvalidValue(e);
		// }
		// if (CAUGHT_forAll == ValuesUtil.TRUE_VALUE) {
		// return true;
		// }
		// if (diagnostics != null) {
		// int severity = CAUGHT_forAll == null ? Diagnostic.ERROR :
		// Diagnostic.WARNING;
		// String message =
		// DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
		// new Object[]{"Extension", "MixinAppliesLocalOrImported",
		// EObjectValidator.getObjectLabel(this, context)});
		// diagnostics.add(new BasicDiagnostic(severity,
		// OCCIValidator.DIAGNOSTIC_SOURCE,
		// OCCIValidator.EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED, message,
		// new Object [] { this }));
		// }
		// return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SchemeUnique(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		/**
		 * inv SchemeUnique: Extension.allInstances()->isUnique(scheme)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Extension_0 = idResolver.getType(OCCITables.CLSSid_Extension, null);
		    final /*@NonNull*/ /*@Thrown*/ SetValue allInstances = DomainUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Extension, TYP_OCCI_c_c_Extension_0));
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Extension);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Extension _1 = (Extension)ITERATOR__1.next();
		        /**
		         * scheme
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Extension::scheme\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String scheme = _1.getScheme();
		        //
		        if (accumulator.includes(scheme) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(scheme);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Extension", "SchemeUnique", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.EXTENSION__SCHEME_UNIQUE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // Generation failed
	 */
	public boolean MixinDependsLocalOrImported(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		// /**
		// *
		// * inv MixinDependsLocalOrImported: mixins.depends->forAll(let
		// extension
		// * = oclContainer() in extension = self or
		// import->includes(extension))
		// */
		// final/* @NonNull *//* @NonInvalid */DomainEvaluator evaluator =
		// PivotUtil
		// .getEvaluator(this);
		// final/* @NonNull *//* @NonInvalid */IdResolver idResolver = evaluator
		// .getIdResolver();
		// final/* @NonNull *//* @NonInvalid */DomainStandardLibrary
		// standardLibrary = idResolver
		// .getStandardLibrary();
		// /* @Nullable *//* @Caught */Object CAUGHT_forAll;
		// try {
		// final/* @NonNull *//* @Thrown */List<Mixin> mixins =
		// this.getMixins();
		// final/* @NonNull *//* @Thrown */OrderedSetValue BOXED_mixins =
		// idResolver
		// .createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		// /* @NonNull *//* @Thrown */SequenceValue.Accumulator accumulator =
		// ValuesUtil
		// .createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		// /* @Nullable */Iterator<?> ITERATOR__1 = BOXED_mixins.iterator();
		// /* @NonNull *//* @Thrown */SequenceValue collect;
		// while (true) {
		// if (!ITERATOR__1.hasNext()) {
		// collect = accumulator;
		// break;
		// }
		// /* @Nullable *//* @NonInvalid */Mixin _1 = (Mixin) ITERATOR__1
		// .next();
		// /**
		// * depends
		// */
		// if (_1 == null) {
		// throw new InvalidValueException(
		// "Null source for \'OCCI::Mixin::depends\'");
		// }
		// final/* @NonNull *//* @Thrown */List<Mixin> depends = _1
		// .getDepends();
		// final/* @NonNull *//* @Thrown */OrderedSetValue BOXED_depends =
		// idResolver
		// .createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin,
		// depends);
		// //
		// for (Object value : BOXED_depends.flatten().getElements()) {
		// accumulator.add(value);
		// }
		// }
		// final/* @NonNull */DomainType TYPE_forAll_0 = evaluator
		// .getStaticTypeOf(collect);
		// final/* @NonNull */LibraryIteration IMPL_forAll_0 =
		// (LibraryIteration) TYPE_forAll_0
		// .lookupImplementation(standardLibrary,
		// OCLstdlibTables.Operations._Collection__0_forAll);
		// final/* @NonNull */Object ACC_forAll_0 = IMPL_forAll_0
		// .createAccumulatorValue(evaluator, TypeId.BOOLEAN,
		// TypeId.BOOLEAN);
		// /**
		// * Implementation of the iterator body.
		// */
		// final/* @NonNull */AbstractTernaryOperation BODY_forAll_0 = new
		// AbstractTernaryOperation() {
		// /**
		// *
		// * let extension : OclElement = oclContainer() in extension =
		// * self or import->includes(extension)
		// */
		// @Override
		// public/* @Nullable */Object evaluate(
		// final/* @NonNull */DomainEvaluator evaluator,
		// final/* @NonNull */TypeId typeId,
		// final/* @Nullable */Object collect,
		// final/* @Nullable *//* @NonInvalid */Object _1_0,
		// final/* @Nullable *//* @NonInvalid */Object _2) {
		// /* @Nullable *//* @Caught */Object CAUGHT_or;
		// try {
		// /* @Nullable *//* @Caught */Object CAUGHT_extension;
		// try {
		// final/* @Nullable *//* @Thrown */Object extension =
		// ClassifierOclContainerOperation.INSTANCE
		// .evaluate(this);
		// CAUGHT_extension = extension;
		// } catch (Exception e) {
		// CAUGHT_extension = ValuesUtil.createInvalidValue(e);
		// }
		// /* @NonNull *//* @Caught */Object CAUGHT_eq;
		// try {
		// if (CAUGHT_extension instanceof InvalidValueException) {
		// throw (InvalidValueException) CAUGHT_extension;
		// }
		// final/* @Thrown */boolean eq = this
		// .equals(CAUGHT_extension);
		// CAUGHT_eq = eq;
		// } catch (Exception e) {
		// CAUGHT_eq = ValuesUtil.createInvalidValue(e);
		// }
		// /* @NonNull *//* @Caught */Object CAUGHT_includes;
		// try {
		// final/* @NonNull *//* @Thrown */List<Extension> symbol_0 = this
		// .getImport();
		// final/* @NonNull *//* @Thrown */OrderedSetValue BOXED_symbol_0 =
		// idResolver
		// .createOrderedSetOfAll(
		// OCCITables.ORD_CLSSid_Extension,
		// symbol_0);
		// if (CAUGHT_extension instanceof InvalidValueException) {
		// throw (InvalidValueException) CAUGHT_extension;
		// }
		// final/* @Thrown */boolean includes = DomainUtil
		// .nonNullState(CollectionIncludesOperation.INSTANCE
		// .evaluate(BOXED_symbol_0,
		// CAUGHT_extension)
		// .booleanValue());
		// CAUGHT_includes = includes;
		// } catch (Exception e) {
		// CAUGHT_includes = ValuesUtil.createInvalidValue(e);
		// }
		// final/* @Nullable *//* @Thrown */Boolean or =
		// BooleanOrOperation.INSTANCE
		// .evaluate(CAUGHT_eq, CAUGHT_includes);
		// CAUGHT_or = or;
		// } catch (Exception e) {
		// CAUGHT_or = ValuesUtil.createInvalidValue(e);
		// }
		// return CAUGHT_or;
		// }
		// };
		// final/* @NonNull */ExecutorDoubleIterationManager MGR_forAll_0 = new
		// ExecutorDoubleIterationManager(
		// evaluator, TypeId.BOOLEAN, BODY_forAll_0, collect,
		// ACC_forAll_0);
		// final/* @Nullable *//* @Thrown */Boolean forAll = (Boolean)
		// IMPL_forAll_0
		// .evaluateIteration(MGR_forAll_0);
		// CAUGHT_forAll = forAll;
		// } catch (Exception e) {
		// CAUGHT_forAll = ValuesUtil.createInvalidValue(e);
		// }
		// if (CAUGHT_forAll == ValuesUtil.TRUE_VALUE) {
		// return true;
		// }
		// if (diagnostics != null) {
		// int severity = CAUGHT_forAll == null ? Diagnostic.ERROR
		// : Diagnostic.WARNING;
		// String message = DomainUtil
		// .bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
		// new Object[] {
		// "Extension",
		// "MixinDependsLocalOrImported",
		// EObjectValidator.getObjectLabel(this,
		// context) });
		// diagnostics.add(new BasicDiagnostic(severity,
		// OCCIValidator.DIAGNOSTIC_SOURCE,
		// OCCIValidator.EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED,
		// message, new Object[] { this }));
		// }
		// return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__KINDS:
				return ((InternalEList<?>)getKinds()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__MIXINS:
				return ((InternalEList<?>)getMixins()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				return getName();
			case OCCIPackage.EXTENSION__SCHEME:
				return getScheme();
			case OCCIPackage.EXTENSION__IMPORT:
				return getImport();
			case OCCIPackage.EXTENSION__KINDS:
				return getKinds();
			case OCCIPackage.EXTENSION__MIXINS:
				return getMixins();
			case OCCIPackage.EXTENSION__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				setName((String)newValue);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme((String)newValue);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Extension>)newValue);
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				getKinds().addAll((Collection<? extends Kind>)newValue);
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends EDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCCIPackage.EXTENSION__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case OCCIPackage.EXTENSION__IMPORT:
				return import_ != null && !import_.isEmpty();
			case OCCIPackage.EXTENSION__KINDS:
				return kinds != null && !kinds.isEmpty();
			case OCCIPackage.EXTENSION__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case OCCIPackage.EXTENSION__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP:
				return KindsSchemeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return KindParentLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP:
				return MixinsSchemeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP:
				return TermUnicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return MixinAppliesLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return SchemeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return MixinDependsLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} // ExtensionImpl
