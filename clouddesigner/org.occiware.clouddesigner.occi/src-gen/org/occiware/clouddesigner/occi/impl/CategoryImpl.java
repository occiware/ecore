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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.CategoryImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.CategoryImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.CategoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.CategoryImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.CATEGORY__TERM, oldTerm, term));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.CATEGORY__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.CATEGORY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, OCCIPackage.CATEGORY__ATTRIBUTES);
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
		 *   let severity : Integer[1] = 'Category::AttributesNameUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = attributes->isUnique(name)
		 *       in
		 *         'Category::AttributesNameUnique'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Category_c_c_AttributesNameUnique));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = this.getAttributes();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Attribute);
		        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
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
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Category_c_c_AttributesNameUnique, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IdentityUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv IdentityUnique:
		 *   let severity : Integer[1] = 'Category::IdentityUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = Category.allInstances()
		 *         ->isUnique(scheme + term)
		 *       in
		 *         'Category::IdentityUnique'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Category_c_c_IdentityUnique));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Category = idResolver.getClass(OCCITables.CLSSid_Category, null);
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.SetValue allInstances = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Category, TYP_occi_c_c_Category));
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Category);
		        /*@NonNull*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		        /*@Thrown*/ boolean status;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                status = ValueUtil.TRUE_VALUE;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Category _1 = (Category)ITERATOR__1.next();
		            /**
		             * scheme + term
		             */
		            final /*@NonNull*/ /*@Thrown*/ String scheme = _1.getScheme();
		            final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		            final /*@NonNull*/ /*@Thrown*/ String sum = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE.evaluate(scheme, term));
		            //
		            if (accumulator.includes(sum) == ValueUtil.TRUE_VALUE) {
		                status = ValueUtil.FALSE_VALUE;			// Abort after second find
		                break;
		            }
		            else {
		                accumulator.add(sum);
		            }
		        }
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Category_c_c_IdentityUnique, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SchemeEndsWithSharp(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv SchemeEndsWithSharp:
		 *   let severity : Integer[1] = 'Category::SchemeEndsWithSharp'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = scheme.substring(
		 *           scheme.size(),
		 *           scheme.size()) = '#'
		 *       in
		 *         'Category::SchemeEndsWithSharp'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, OCCITables.STR_Category_c_c_SchemeEndsWithSharp));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, OCCITables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		        final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.IntegerValue size_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringSizeOperation.INSTANCE.evaluate(scheme));
		        final /*@NonNull*/ /*@Thrown*/ String substring = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE.evaluate(scheme, size_0, size_0));
		        final /*@Thrown*/ boolean status = substring.equals(OCCITables.STR__35);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, OCCITables.STR_Category_c_c_SchemeEndsWithSharp, this, diagnostics, context, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue());
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
			case OCCIPackage.CATEGORY__ATTRIBUTES:
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
			case OCCIPackage.CATEGORY__TERM:
				return getTerm();
			case OCCIPackage.CATEGORY__SCHEME:
				return getScheme();
			case OCCIPackage.CATEGORY__TITLE:
				return getTitle();
			case OCCIPackage.CATEGORY__ATTRIBUTES:
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
			case OCCIPackage.CATEGORY__TERM:
				setTerm((String)newValue);
				return;
			case OCCIPackage.CATEGORY__SCHEME:
				setScheme((String)newValue);
				return;
			case OCCIPackage.CATEGORY__TITLE:
				setTitle((String)newValue);
				return;
			case OCCIPackage.CATEGORY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case OCCIPackage.CATEGORY__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case OCCIPackage.CATEGORY__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case OCCIPackage.CATEGORY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OCCIPackage.CATEGORY__ATTRIBUTES:
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
			case OCCIPackage.CATEGORY__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case OCCIPackage.CATEGORY__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case OCCIPackage.CATEGORY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OCCIPackage.CATEGORY__ATTRIBUTES:
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
			case OCCIPackage.CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return AttributesNameUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return IdentityUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP:
				return SchemeEndsWithSharp((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (term: ");
		result.append(term);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
