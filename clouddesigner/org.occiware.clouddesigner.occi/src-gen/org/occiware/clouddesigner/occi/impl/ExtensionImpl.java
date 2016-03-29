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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Evaluator;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> import_;

	/**
	 * The cached value of the '{@link #getKinds() <em>Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kinds;

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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getImport() {
		if (import_ == null) {
			import_ = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.EXTENSION__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getKinds() {
		if (kinds == null) {
			kinds = new EObjectContainmentEList<Kind>(Kind.class, this, OCCIPackage.EXTENSION__KINDS);
		}
		return kinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.EXTENSION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<EDataType>(EDataType.class, this, OCCIPackage.EXTENSION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindsSchemeValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv KindsSchemeValid:
		 *   let severity : Integer[1] = 'Extension::KindsSchemeValid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[?] = kinds->forAll(k | k.scheme = self.scheme)
		 *       in
		 *         'Extension::KindsSchemeValid'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_KindsSchemeValid));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_k = BOXED_kinds.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR_k.hasNext()) {
		                if (accumulator == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
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
		                    throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::scheme\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ String scheme = k.getScheme();
		                final /*@NonNull*/ /*@Thrown*/ String scheme_0 = this.getScheme();
		                final /*@Thrown*/ boolean eq = scheme.equals(scheme_0);
		                CAUGHT_eq = eq;
		            }
		            catch (Exception e) {
		                CAUGHT_eq = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator = CAUGHT_eq;									// Cache an exception failure
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_KindsSchemeValid, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindParentLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv KindParentLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::KindParentLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = kinds->forAll(parent <> null implies
		 *           let parentExtension : OclElement[?] = parent.oclContainer()
		 *           in parentExtension = self or
		 *             import->includes(parentExtension))
		 *       in
		 *         'Extension::KindParentLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_KindParentLocalOrImported));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Nullable*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_kinds.iterator();
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
		            /*@Nullable*/ /*@NonInvalid*/ Kind _1 = (Kind)ITERATOR__1.next();
		            /**
		             * parent <> null implies
		             * let parentExtension : OclElement[?] = parent.oclContainer()
		             * in parentExtension = self or import->includes(parentExtension)
		             */
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_implies;
		            try {
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_ne;
		                try {
		                    if (_1 == null) {
		                        throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Kind::parent\'");
		                    }
		                    final /*@Nullable*/ /*@Thrown*/ Kind parent = _1.getParent();
		                    final /*@Thrown*/ boolean ne = parent != null;
		                    CAUGHT_ne = ne;
		                }
		                catch (Exception e) {
		                    CAUGHT_ne = ValueUtil.createInvalidValue(e);
		                }
		                /*@Nullable*/ /*@Caught*/ Object CAUGHT_or;
		                try {
		                    /*@Nullable*/ /*@Caught*/ Object CAUGHT_parentExtension;
		                    try {
		                        if (_1 == null) {
		                            throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Kind::parent\'");
		                        }
		                        final /*@Nullable*/ /*@Thrown*/ Kind parent_0 = _1.getParent();
		                        final /*@Nullable*/ /*@Thrown*/ Object parentExtension = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, parent_0);
		                        CAUGHT_parentExtension = parentExtension;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_parentExtension = ValueUtil.createInvalidValue(e);
		                    }
		                    /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		                    try {
		                        if (CAUGHT_parentExtension instanceof InvalidValueException) {
		                            throw (InvalidValueException)CAUGHT_parentExtension;
		                        }
		                        final /*@Thrown*/ boolean eq = this.equals(CAUGHT_parentExtension);
		                        CAUGHT_eq = eq;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_eq = ValueUtil.createInvalidValue(e);
		                    }
		                    /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		                    try {
		                        final /*@NonNull*/ /*@Thrown*/ List<Extension> symbol_0 = this.getImport();
		                        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
		                        if (CAUGHT_parentExtension instanceof InvalidValueException) {
		                            throw (InvalidValueException)CAUGHT_parentExtension;
		                        }
		                        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, CAUGHT_parentExtension).booleanValue());
		                        CAUGHT_includes = includes;
		                    }
		                    catch (Exception e) {
		                        CAUGHT_includes = ValueUtil.createInvalidValue(e);
		                    }
		                    final /*@Nullable*/ /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
		                    CAUGHT_or = or;
		                }
		                catch (Exception e) {
		                    CAUGHT_or = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean implies = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_ne, CAUGHT_or);
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_KindParentLocalOrImported, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinsSchemeValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv MixinsSchemeValid:
		 *   let severity : Integer[1] = 'Extension::MixinsSchemeValid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = mixins->forAll(m |
		 *           m.scheme.substring(1, scheme.size() - 1) =
		 *           scheme.substring(1, scheme.size() - 1))
		 *       in
		 *         'Extension::MixinsSchemeValid'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_MixinsSchemeValid));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		        /*@Nullable*/ /*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR_m = BOXED_mixins.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR_m.hasNext()) {
		                if (accumulator == ValueUtil.TRUE_VALUE) {
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
		             * m.scheme.substring(1, scheme.size() - 1) =
		             * scheme.substring(1, scheme.size() - 1)
		             */
		            /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		            try {
		                final /*@NonNull*/ /*@Thrown*/ String scheme_1 = this.getScheme();
		                final /*@NonNull*/ /*@Thrown*/ IntegerValue size_0 = ClassUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(scheme_1));
		                final /*@NonNull*/ /*@Thrown*/ IntegerValue diff_0 = ClassUtil.nonNullState((IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1));
		                if (m == null) {
		                    throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::scheme\'");
		                }
		                final /*@NonNull*/ /*@Thrown*/ String scheme = m.getScheme();
		                final /*@NonNull*/ /*@Thrown*/ String substring = ClassUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0));
		                final /*@NonNull*/ /*@Thrown*/ String substring_0 = ClassUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme_1, OCCITables.INT_1, diff_0));
		                final /*@Thrown*/ boolean eq = substring.equals(substring_0);
		                CAUGHT_eq = eq;
		            }
		            catch (Exception e) {
		                CAUGHT_eq = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator = CAUGHT_eq;									// Cache an exception failure
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinsSchemeValid, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TermUnicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv TermUnicity:
		 *   let severity : Integer[1] = 'Extension::TermUnicity'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[1] = kinds.term->intersection(mixins.term)
		 *         ->isEmpty()
		 *       in
		 *         'Extension::TermUnicity'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_TermUnicity));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Kind> kinds = this.getKinds();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::term\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		            //
		            accumulator.add(term);
		        }
		        final /*@NonNull*/ /*@Thrown*/ List<Mixin> mixins = this.getMixins();
		        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
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
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Category::term\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ String term_0 = _1_0.getTerm();
		            //
		            accumulator_0.add(term_0);
		        }
		        final /*@NonNull*/ /*@Thrown*/ BagValue intersection = ClassUtil.nonNullState((BagValue)CollectionIntersectionOperation.INSTANCE.evaluate(collect, collect_0));
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(CollectionIsEmptyOperation.INSTANCE.evaluate(intersection).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_TermUnicity, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinAppliesLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv MixinAppliesLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::MixinAppliesLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = mixins.applies->forAll(
		 *           let extension : OclElement[?] = oclContainer()
		 *           in extension = self or import->includes(extension))
		 *       in
		 *         'Extension::MixinAppliesLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_MixinAppliesLocalOrImported));
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
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_mixins.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
		            /**
		             * applies
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::applies\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Kind> applies = _1.getApplies();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_applies = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies);
		            //
		            for (Object value : BOXED_applies.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@Nullable*/ /*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect.iterator();
		        /*@Nullable*/ /*@Thrown*/ Boolean status;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                if (accumulator_0 == null) {
		                    status = null;
		                }
		                else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
		                }
		                else {
		                    throw (InvalidValueException)accumulator_0;
		                }
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Kind _1_0 = (Kind)ITERATOR__1_0.next();
		            /**
		             * 
		             * let extension : OclElement[?] = oclContainer()
		             * in extension = self or import->includes(extension)
		             */
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_or;
		            try {
		                /*@Nullable*/ /*@Caught*/ Object CAUGHT_extension;
		                try {
		                    final /*@Nullable*/ /*@Thrown*/ Object extension = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_0);
		                    CAUGHT_extension = extension;
		                }
		                catch (Exception e) {
		                    CAUGHT_extension = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		                try {
		                    if (CAUGHT_extension instanceof InvalidValueException) {
		                        throw (InvalidValueException)CAUGHT_extension;
		                    }
		                    final /*@Thrown*/ boolean eq = this.equals(CAUGHT_extension);
		                    CAUGHT_eq = eq;
		                }
		                catch (Exception e) {
		                    CAUGHT_eq = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		                try {
		                    final /*@NonNull*/ /*@Thrown*/ List<Extension> symbol_0 = this.getImport();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
		                    if (CAUGHT_extension instanceof InvalidValueException) {
		                        throw (InvalidValueException)CAUGHT_extension;
		                    }
		                    final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, CAUGHT_extension).booleanValue());
		                    CAUGHT_includes = includes;
		                }
		                catch (Exception e) {
		                    CAUGHT_includes = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
		                CAUGHT_or = or;
		            }
		            catch (Exception e) {
		                CAUGHT_or = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_or == null) {								// Abnormal null body evaluation result
		                if (accumulator_0 == ValueUtil.TRUE_VALUE) {
		                    accumulator_0 = null;										// Cache a null failure
		                }
		            }
		            else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator_0 = CAUGHT_or;									// Cache an exception failure
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinAppliesLocalOrImported, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SchemeUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv SchemeUnique:
		 *   let severity : Integer[1] = 'Extension::SchemeUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[1] = Extension.allInstances()->isUnique(scheme)
		 *       in
		 *         'Extension::SchemeUnique'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_SchemeUnique));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
		        final /*@NonNull*/ /*@NonInvalid*/ SetValue allInstances = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Extension, TYP_occi_c_c_Extension_0));
		        /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Extension);
		        /*@NonNull*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Extension _1 = (Extension)ITERATOR__1.next();
		            /**
		             * scheme
		             */
		            final /*@NonNull*/ /*@Thrown*/ String scheme = _1.getScheme();
		            //
		            if (accumulator.includes(scheme) == ValueUtil.TRUE_VALUE) {
		                status = ValueUtil.FALSE_VALUE;			// Abort after second find
		                break;
		            }
		            else {
		                accumulator.add(scheme);
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_SchemeUnique, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinDependsLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv MixinDependsLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::MixinDependsLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = mixins.depends->forAll(
		 *           let extension : OclElement[?] = oclContainer()
		 *           in extension = self or import->includes(extension))
		 *       in
		 *         'Extension::MixinDependsLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Extension_c_c_MixinDependsLocalOrImported));
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
		        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_mixins.iterator();
		        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect = accumulator;
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
		            /**
		             * depends
		             */
		            if (_1 == null) {
		                throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Mixin::depends\'");
		            }
		            final /*@NonNull*/ /*@Thrown*/ List<Mixin> depends = _1.getDepends();
		            final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
		            //
		            for (Object value : BOXED_depends.flatten().getElements()) {
		                accumulator.add(value);
		            }
		        }
		        /*@Nullable*/ /*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
		        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect.iterator();
		        /*@Nullable*/ /*@Thrown*/ Boolean status;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                if (accumulator_0 == null) {
		                    status = null;
		                }
		                else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
		                    status = ValueUtil.TRUE_VALUE;
		                }
		                else {
		                    throw (InvalidValueException)accumulator_0;
		                }
		                break;
		            }
		            /*@Nullable*/ /*@NonInvalid*/ Mixin _1_0 = (Mixin)ITERATOR__1_0.next();
		            /**
		             * 
		             * let extension : OclElement[?] = oclContainer()
		             * in extension = self or import->includes(extension)
		             */
		            /*@Nullable*/ /*@Caught*/ Object CAUGHT_or;
		            try {
		                /*@Nullable*/ /*@Caught*/ Object CAUGHT_extension;
		                try {
		                    final /*@Nullable*/ /*@Thrown*/ Object extension = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, _1_0);
		                    CAUGHT_extension = extension;
		                }
		                catch (Exception e) {
		                    CAUGHT_extension = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		                try {
		                    if (CAUGHT_extension instanceof InvalidValueException) {
		                        throw (InvalidValueException)CAUGHT_extension;
		                    }
		                    final /*@Thrown*/ boolean eq = this.equals(CAUGHT_extension);
		                    CAUGHT_eq = eq;
		                }
		                catch (Exception e) {
		                    CAUGHT_eq = ValueUtil.createInvalidValue(e);
		                }
		                /*@NonNull*/ /*@Caught*/ Object CAUGHT_includes;
		                try {
		                    final /*@NonNull*/ /*@Thrown*/ List<Extension> symbol_0 = this.getImport();
		                    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
		                    if (CAUGHT_extension instanceof InvalidValueException) {
		                        throw (InvalidValueException)CAUGHT_extension;
		                    }
		                    final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, CAUGHT_extension).booleanValue());
		                    CAUGHT_includes = includes;
		                }
		                catch (Exception e) {
		                    CAUGHT_includes = ValueUtil.createInvalidValue(e);
		                }
		                final /*@Nullable*/ /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
		                CAUGHT_or = or;
		            }
		            catch (Exception e) {
		                CAUGHT_or = ValueUtil.createInvalidValue(e);
		            }
		            //
		            if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
		                status = ValueUtil.FALSE_VALUE;
		                break;														// Stop immediately 
		            }
		            else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
		                ;															// Carry on
		            }
		            else if (CAUGHT_or == null) {								// Abnormal null body evaluation result
		                if (accumulator_0 == ValueUtil.TRUE_VALUE) {
		                    accumulator_0 = null;										// Cache a null failure
		                }
		            }
		            else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
		                accumulator_0 = CAUGHT_or;									// Cache an exception failure
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinDependsLocalOrImported, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //ExtensionImpl
