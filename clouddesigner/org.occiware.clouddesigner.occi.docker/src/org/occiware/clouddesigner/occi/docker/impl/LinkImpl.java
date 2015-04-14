/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.DockerTables;
import org.occiware.clouddesigner.occi.docker.Link;
import org.occiware.clouddesigner.occi.docker.util.DockerValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.LinkImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends org.occiware.clouddesigner.OCCI.impl.LinkImpl implements Link {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.LINK__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkTargetAsContainer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv LinkTargetAsContainer: target.oclIsKindOf(Container)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_oclIsKindOf;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_docker_c_c_Container_0 = idResolver.getType(DockerTables.CLSSid_Container, null);
		    final /*@NonNull*/ /*@Thrown*/ Resource target = this.getTarget();
		    final /*@Thrown*/ boolean oclIsKindOf = DomainUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, target, TYP_docker_c_c_Container_0).booleanValue());
		    CAUGHT_oclIsKindOf = oclIsKindOf;
		}
		catch (Exception e) {
		    CAUGHT_oclIsKindOf = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_oclIsKindOf == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Link", "LinkTargetAsContainer", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, DockerValidator.DIAGNOSTIC_SOURCE, DockerValidator.LINK__LINK_TARGET_AS_CONTAINER, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkSourceAsContainer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv LinkSourceAsContainer: source.oclIsKindOf(Container)
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_oclIsKindOf;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_docker_c_c_Container_0 = idResolver.getType(DockerTables.CLSSid_Container, null);
		    final /*@NonNull*/ /*@Thrown*/ Resource source = this.getSource();
		    final /*@Thrown*/ boolean oclIsKindOf = DomainUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, source, TYP_docker_c_c_Container_0).booleanValue());
		    CAUGHT_oclIsKindOf = oclIsKindOf;
		}
		catch (Exception e) {
		    CAUGHT_oclIsKindOf = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_oclIsKindOf == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Link", "LinkSourceAsContainer", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, DockerValidator.DIAGNOSTIC_SOURCE, DockerValidator.LINK__LINK_SOURCE_AS_CONTAINER, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkCanOnlyConnectColocalizedContainers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv LinkCanOnlyConnectColocalizedContainers: 
		 * 			Contains.allInstances()->select(contains | contains.target = self.source).source = 
		 * 			Contains.allInstances()->select(contains | contains.target = self.target).source
		 */
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = PivotUtil.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		/*@NonNull*/ /*@Caught*/ Object CAUGHT_eq_1;
		try {
		    final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_docker_c_c_Contains_1 = idResolver.getType(DockerTables.CLSSid_Contains, null);
		    final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_0 = DomainUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, DockerTables.SET_CLSSid_Contains, TYP_docker_c_c_Contains_1));
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(DockerTables.SET_CLSSid_Contains);
		    /*@Nullable*/ Iterator<?> ITERATOR_contains = allInstances_0.iterator();
		    /*@NonNull*/ /*@Thrown*/ SetValue select;
		    while (true) {
		        if (!ITERATOR_contains.hasNext()) {
		            select = accumulator;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Contains contains = (Contains)ITERATOR_contains.next();
		        /**
		         * contains.target = self.source
		         */
		        if (contains == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Link::target\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ Resource target = contains.getTarget();
		        final /*@NonNull*/ /*@Thrown*/ Resource source = this.getSource();
		        final /*@Thrown*/ boolean eq = target.equals(source);
		        //
		        if (eq == ValuesUtil.TRUE_VALUE) {
		            accumulator.add(contains);
		        }
		    }
		    /*@NonNull*/ /*@Thrown*/ BagValue.Accumulator accumulator_0 = ValuesUtil.createBagAccumulatorValue(DockerTables.BAG_CLSSid_Resource);
		    /*@Nullable*/ Iterator<?> ITERATOR__1 = select.iterator();
		    /*@NonNull*/ /*@Thrown*/ BagValue collect;
		    while (true) {
		        if (!ITERATOR__1.hasNext()) {
		            collect = accumulator_0;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Contains _1 = (Contains)ITERATOR__1.next();
		        /**
		         * source
		         */
		        if (_1 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Link::source\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ Resource source_0 = _1.getSource();
		        //
		        accumulator_0.add(source_0);
		    }
		    /*@NonNull*/ /*@Thrown*/ SetValue.Accumulator accumulator_1 = ValuesUtil.createSetAccumulatorValue(DockerTables.SET_CLSSid_Contains);
		    /*@Nullable*/ Iterator<?> ITERATOR_contains_0 = allInstances_0.iterator();
		    /*@NonNull*/ /*@Thrown*/ SetValue select_0;
		    while (true) {
		        if (!ITERATOR_contains_0.hasNext()) {
		            select_0 = accumulator_1;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Contains contains_0 = (Contains)ITERATOR_contains_0.next();
		        /**
		         * contains.target = self.target
		         */
		        if (contains_0 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Link::target\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ Resource target_0 = contains_0.getTarget();
		        final /*@NonNull*/ /*@Thrown*/ Resource target_1 = this.getTarget();
		        final /*@Thrown*/ boolean eq_0 = target_0.equals(target_1);
		        //
		        if (eq_0 == ValuesUtil.TRUE_VALUE) {
		            accumulator_1.add(contains_0);
		        }
		    }
		    /*@NonNull*/ /*@Thrown*/ BagValue.Accumulator accumulator_2 = ValuesUtil.createBagAccumulatorValue(DockerTables.BAG_CLSSid_Resource);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_0 = select_0.iterator();
		    /*@NonNull*/ /*@Thrown*/ BagValue collect_0;
		    while (true) {
		        if (!ITERATOR__1_0.hasNext()) {
		            collect_0 = accumulator_2;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Contains _1_0 = (Contains)ITERATOR__1_0.next();
		        /**
		         * source
		         */
		        if (_1_0 == null) {
		            throw new InvalidValueException("Null source for \'OCCI::Link::source\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ Resource source_1 = _1_0.getSource();
		        //
		        accumulator_2.add(source_1);
		    }
		    final /*@Thrown*/ boolean eq_1 = collect.equals(collect_0);
		    CAUGHT_eq_1 = eq_1;
		}
		catch (Exception e) {
		    CAUGHT_eq_1 = ValuesUtil.createInvalidValue(e);
		}
		if (CAUGHT_eq_1 == ValuesUtil.TRUE_VALUE) {
		    return true;
		}
		if (diagnostics != null) {
		    int severity = Diagnostic.WARNING;
		    String message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{"Link", "LinkCanOnlyConnectColocalizedContainers", EObjectValidator.getObjectLabel(this, context)});
		    diagnostics.add(new BasicDiagnostic(severity, DockerValidator.DIAGNOSTIC_SOURCE, DockerValidator.LINK__LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS, message, new Object [] { this }));
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.LINK__ALIAS:
				return getAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.LINK__ALIAS:
				setAlias((String)newValue);
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
			case DockerPackage.LINK__ALIAS:
				setAlias(ALIAS_EDEFAULT);
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
			case DockerPackage.LINK__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
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
			case DockerPackage.LINK___LINK_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP:
				return LinkTargetAsContainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockerPackage.LINK___LINK_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP:
				return LinkSourceAsContainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockerPackage.LINK___LINK_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP:
				return LinkCanOnlyConnectColocalizedContainers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
