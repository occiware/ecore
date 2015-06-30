/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.DockerTables;
import org.occiware.clouddesigner.occi.docker.Mode;
import org.occiware.clouddesigner.occi.docker.Volumesfrom;
import org.occiware.clouddesigner.occi.impl.LinkImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumesfrom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.VolumesfromImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumesfromImpl extends LinkImpl implements Volumesfrom {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final Mode MODE_EDEFAULT = Mode.READ_WRITE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Mode mode = MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumesfromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.VOLUMESFROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Mode newMode) {
		Mode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.VOLUMESFROM__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean VolumesFromSourceAsContainer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv VolumesFromSourceAsContainer:
		 *   let
		 *     severity : Integer[1] = 'Volumesfrom::VolumesFromSourceAsContainer'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = source.oclIsKindOf(Container)
		 *       in
		 *         'Volumesfrom::VolumesFromSourceAsContainer'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DockerTables.STR_Volumesfrom_c_c_VolumesFromSourceAsContainer));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DockerTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_docker_c_c_Container_0 = idResolver.getClass(DockerTables.CLSSid_Container, null);
		        final /*@NonNull*/ /*@Thrown*/ Resource source = this.getSource();
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, source, TYP_docker_c_c_Container_0).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, DockerTables.STR_Volumesfrom_c_c_VolumesFromSourceAsContainer, this, diagnostics, context, severity_0, CAUGHT_status, DockerTables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean VolumesFromTargetAsContainer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv VolumesFromTargetAsContainer:
		 *   let
		 *     severity : Integer[1] = 'Volumesfrom::VolumesFromTargetAsContainer'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : Boolean[1] = target.oclIsKindOf(Container)
		 *       in
		 *         'Volumesfrom::VolumesFromTargetAsContainer'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DockerTables.STR_Volumesfrom_c_c_VolumesFromTargetAsContainer));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DockerTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_docker_c_c_Container_0 = idResolver.getClass(DockerTables.CLSSid_Container, null);
		        final /*@NonNull*/ /*@Thrown*/ Resource target = this.getTarget();
		        final /*@Thrown*/ boolean status = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, target, TYP_docker_c_c_Container_0).booleanValue());
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, DockerTables.STR_Volumesfrom_c_c_VolumesFromTargetAsContainer, this, diagnostics, context, severity_0, CAUGHT_status, DockerTables.INT_0).booleanValue());
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean VolumesFromCanOnlyConnectColocalizedContainers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv VolumesFromCanOnlyConnectColocalizedContainers:
		 *   let
		 *     severity : Integer[1] = 'Volumesfrom::VolumesFromCanOnlyConnectColocalizedContainers'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = Contains.allInstances()
		 *         ->select(contains | contains.target = self.source).source =
		 *         Contains.allInstances()
		 *         ->select(contains | contains.target = self.target).source
		 *       in
		 *         'Volumesfrom::VolumesFromCanOnlyConnectColocalizedContainers'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DockerTables.STR_Volumesfrom_c_c_VolumesFromCanOnlyConnectColocalizedContainers));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DockerTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@NonNull*/ /*@Caught*/ Object CAUGHT_status;
		    try {
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_docker_c_c_Contains_1 = idResolver.getClass(DockerTables.CLSSid_Contains, null);
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.values.SetValue allInstances_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, DockerTables.SET_CLSSid_Contains, TYP_docker_c_c_Contains_1));
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(DockerTables.SET_CLSSid_Contains);
		        /*@NonNull*/ Iterator<?> ITERATOR_contains = allInstances_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue select;
		        while (true) {
		            if (!ITERATOR_contains.hasNext()) {
		                select = accumulator;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Contains contains = (Contains)ITERATOR_contains.next();
		            /**
		             * contains.target = self.source
		             */
		            final /*@NonNull*/ /*@Thrown*/ Resource target = contains.getTarget();
		            final /*@NonNull*/ /*@Thrown*/ Resource source = this.getSource();
		            final /*@Thrown*/ boolean eq = target.equals(source);
		            //
		            if (eq == ValueUtil.TRUE_VALUE) {
		                accumulator.add(contains);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(DockerTables.BAG_CLSSid_Resource);
		        /*@NonNull*/ Iterator<?> ITERATOR__1 = select.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue collect;
		        while (true) {
		            if (!ITERATOR__1.hasNext()) {
		                collect = accumulator_0;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Contains _1 = (Contains)ITERATOR__1.next();
		            /**
		             * source
		             */
		            final /*@NonNull*/ /*@Thrown*/ Resource source_0 = _1.getSource();
		            //
		            accumulator_0.add(source_0);
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_1 = ValueUtil.createSetAccumulatorValue(DockerTables.SET_CLSSid_Contains);
		        /*@NonNull*/ Iterator<?> ITERATOR_contains_0 = allInstances_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue select_0;
		        while (true) {
		            if (!ITERATOR_contains_0.hasNext()) {
		                select_0 = accumulator_1;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Contains contains_0 = (Contains)ITERATOR_contains_0.next();
		            /**
		             * contains.target = self.target
		             */
		            final /*@NonNull*/ /*@Thrown*/ Resource target_0 = contains_0.getTarget();
		            final /*@NonNull*/ /*@Thrown*/ Resource target_1 = this.getTarget();
		            final /*@Thrown*/ boolean eq_0 = target_0.equals(target_1);
		            //
		            if (eq_0 == ValueUtil.TRUE_VALUE) {
		                accumulator_1.add(contains_0);
		            }
		        }
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(DockerTables.BAG_CLSSid_Resource);
		        /*@NonNull*/ Iterator<?> ITERATOR__1_0 = select_0.iterator();
		        /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue collect_0;
		        while (true) {
		            if (!ITERATOR__1_0.hasNext()) {
		                collect_0 = accumulator_2;
		                break;
		            }
		            /*@NonNull*/ /*@NonInvalid*/ Contains _1_0 = (Contains)ITERATOR__1_0.next();
		            /**
		             * source
		             */
		            final /*@NonNull*/ /*@Thrown*/ Resource source_1 = _1_0.getSource();
		            //
		            accumulator_2.add(source_1);
		        }
		        final /*@Thrown*/ boolean status = collect.equals(collect_0);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, TypeId.BOOLEAN, DockerTables.STR_Volumesfrom_c_c_VolumesFromCanOnlyConnectColocalizedContainers, this, diagnostics, context, severity_0, CAUGHT_status, DockerTables.INT_0).booleanValue());
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.VOLUMESFROM__MODE:
				return getMode();
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
			case DockerPackage.VOLUMESFROM__MODE:
				setMode((Mode)newValue);
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
			case DockerPackage.VOLUMESFROM__MODE:
				setMode(MODE_EDEFAULT);
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
			case DockerPackage.VOLUMESFROM__MODE:
				return mode != MODE_EDEFAULT;
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
			case DockerPackage.VOLUMESFROM___VOLUMES_FROM_SOURCE_AS_CONTAINER__DIAGNOSTICCHAIN_MAP:
				return VolumesFromSourceAsContainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockerPackage.VOLUMESFROM___VOLUMES_FROM_TARGET_AS_CONTAINER__DIAGNOSTICCHAIN_MAP:
				return VolumesFromTargetAsContainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DockerPackage.VOLUMESFROM___VOLUMES_FROM_CAN_ONLY_CONNECT_COLOCALIZED_CONTAINERS__DIAGNOSTICCHAIN_MAP:
				return VolumesFromCanOnlyConnectColocalizedContainers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //VolumesfromImpl
