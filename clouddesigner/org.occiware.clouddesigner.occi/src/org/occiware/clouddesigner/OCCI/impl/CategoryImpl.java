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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.domain.elements.DomainType;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;

import org.eclipse.ocl.examples.domain.types.IdResolver;

import org.eclipse.ocl.examples.domain.utilities.DomainUtil;

import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.OrderedSetValue;
import org.eclipse.ocl.examples.domain.values.SetValue;

import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;

import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;

import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.examples.library.string.StringConcatOperation;
import org.eclipse.ocl.examples.library.string.StringSizeOperation;
import org.eclipse.ocl.examples.library.string.StringSubstringOperation;

import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;

import org.occiware.clouddesigner.OCCI.util.OCCIValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.impl.CategoryImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
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
		 * inv AttributesNameUnique: attributes->isUnique(name)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@Thrown*/ List<Attribute> attributes = this.getAttributes();
		    final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Attribute);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_attributes.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
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
		        if (accumulator.includes(name) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(name);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Category", "AttributesNameUnique", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.CATEGORY__ATTRIBUTES_NAME_UNIQUE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IdentityUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv IdentityUnique: Category.allInstances()->isUnique(scheme + term)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_isUnique;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_OCCI_c_c_Category_0 = idResolver.getType(OCCITables.CLSSid_Category, null);
		    final /*@NonNull*/ /*@Thrown*/ SetValue allInstances = DomainUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, OCCITables.SET_CLSSid_Category, TYP_OCCI_c_c_Category_0));
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Category);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = allInstances.iterator();
		    /*@Thrown*/ boolean isUnique;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            isUnique = ValuesUtil.TRUE_VALUE;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Category _1 = (Category)ITERATOR__1.next();
		        /**
		         * scheme + term
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Category::term\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ String scheme = _1.getScheme();
		        final /*@NonNull*/ /*@Thrown*/ String term = _1.getTerm();
		        final /*@NonNull*/ /*@Thrown*/ String sum = DomainUtil.nonNullState(StringConcatOperation.INSTANCE.evaluate(scheme, term));
		        //
		        if (accumulator.includes(sum) == ValuesUtil.TRUE_VALUE) {
		            isUnique = ValuesUtil.FALSE_VALUE;			// Abort after second find
		            break;
		        }
		        else {
		            accumulator.add(sum);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Category", "IdentityUnique", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.CATEGORY__IDENTITY_UNIQUE, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SchemeEndsWithSharp(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv SchemeEndsWithSharp: scheme.substring(scheme.size(),scheme.size()) = '#'
		 */
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_eq;
		try {
		    final /*@NonNull*/ /*@Thrown*/ String scheme = this.getScheme();
		    final /*@NonNull*/ /*@Thrown*/ IntegerValue size_0 = DomainUtil.nonNullState(StringSizeOperation.INSTANCE.evaluate(scheme));
		    final /*@NonNull*/ /*@Thrown*/ String substring = DomainUtil.nonNullState(StringSubstringOperation.INSTANCE.evaluate(scheme, size_0, size_0));
		    final /*@Thrown*/ boolean eq = substring.equals(OCCITables.STR__35);
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
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Category", "SchemeEndsWithSharp", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, OCCIValidator.DIAGNOSTIC_SOURCE, OCCIValidator.CATEGORY__SCHEME_ENDS_WITH_SHARP, message, new Object [] { this }));
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
