/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.DockerTables;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getDisk_size <em>Disk size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_VirtualBoxImpl extends MachineImpl implements Machine_VirtualBox {
	/**
	 * The default value of the '{@link #getBoot2docker_url() <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_url()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2docker_url() <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_url()
	 * @generated
	 * @ordered
	 */
	protected String boot2docker_url = BOOT2DOCKER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_size() <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_size()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SIZE_EDEFAULT = 20000;

	/**
	 * The cached value of the '{@link #getDisk_size() <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_size()
	 * @generated
	 * @ordered
	 */
	protected int disk_size = DISK_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_VirtualBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_VIRTUAL_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2docker_url() {
		return boot2docker_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2docker_url(String newBoot2docker_url) {
		String oldBoot2docker_url = boot2docker_url;
		boot2docker_url = newBoot2docker_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL, oldBoot2docker_url, boot2docker_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisk_size() {
		return disk_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_size(int newDisk_size) {
		int oldDisk_size = disk_size;
		disk_size = newDisk_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE, oldDisk_size, disk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContainersUsedTooMemory(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv ContainersUsedTooMemory:
		 *   let
		 *     severity : Integer[1] = 'Machine_VirtualBox::ContainersUsedTooMemory'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : Boolean[1] = Tuple{message = 'Containers consume ' +
		 *           links->select(oclIsKindOf(Contains))
		 *           .target.oclAsType(Container)
		 *           .memory->sum()
		 *           .toString() + ' when memory is equals to ' +
		 *           memory.toString()
		 *           , status = links->select(oclIsKindOf(Contains))
		 *           .target.oclAsType(Container)
		 *           .memory->sum() <= memory
		 *         }.status
		 *       in
		 *         'Machine_VirtualBox::ContainersUsedTooMemory'.logDiagnostic(self, diagnostics, context, severity, status, 0)
		 *     endif
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Evaluator evaluator = PivotUtilInternal.getEvaluator(this);
		final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ IntegerValue severity_0 = ClassUtil.nonNullState(CGStringGetSeverityOperation.INSTANCE.evaluate(evaluator, DockerTables.STR_Machine_VirtualBox_c_c_ContainersUsedTooMemory));
		final /*@NonInvalid*/ boolean le = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, severity_0, DockerTables.INT_0).booleanValue());
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.internal.library.UnboxedExplicitNavigationProperty IMPPROPid_memory_2 = new org.eclipse.ocl.pivot.internal.library.UnboxedExplicitNavigationProperty(DockerTables.PROPid_memory);
		    final /*@NonNull*/ /*@Thrown*/ List<Link> links_0 = this.getLinks();
		    final /*@Nullable*/ /*@Thrown*/ Number memory_2 = (Number)IMPPROPid_memory_2.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.REAL, this);
		    final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue BOXED_links_0 = idResolver.createOrderedSetOfAll(DockerTables.ORD_CLSSid_Link, links_0);
		    final /*@Nullable*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.RealValue BOXED_memory_2 = memory_2 == null ? null : ValueUtil.realValueOf(memory_2);
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(DockerTables.ORD_CLSSid_Link);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_3 = BOXED_links_0.iterator();
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue select_0;
		    while (true) {
		        if (!ITERATOR__1_3.hasNext()) {
		            select_0 = accumulator;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Link _1_3 = (Link)ITERATOR__1_3.next();
		        /**
		         * oclIsKindOf(Contains)
		         */
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_docker_c_c_Contains_1 = idResolver.getClass(DockerTables.CLSSid_Contains, null);
		        final /*@Thrown*/ boolean oclIsKindOf_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, _1_3, TYP_docker_c_c_Contains_1).booleanValue());
		        //
		        if (oclIsKindOf_0 == ValueUtil.TRUE_VALUE) {
		            accumulator.add(_1_3);
		        }
		    }
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(DockerTables.SEQ_CLSSid_Resource);
		    /*@Nullable*/ Iterator<?> ITERATOR__1_4 = select_0.iterator();
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_4;
		    while (true) {
		        if (!ITERATOR__1_4.hasNext()) {
		            collect_4 = accumulator_0;
		            break;
		        }
		        /*@Nullable*/ /*@NonInvalid*/ Link _1_4 = (Link)ITERATOR__1_4.next();
		        /**
		         * target
		         */
		        if (_1_4 == null) {
		            throw new org.eclipse.ocl.pivot.values.InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi\'::Link::target\'");
		        }
		        final /*@NonNull*/ /*@Thrown*/ Resource target_0 = _1_4.getTarget();
		        //
		        accumulator_0.add(target_0);
		    }
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(DockerTables.SEQ_CLSSid_Container);
		    /*@NonNull*/ Iterator<?> ITERATOR__1_5 = collect_4.iterator();
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_3;
		    while (true) {
		        if (!ITERATOR__1_5.hasNext()) {
		            collect_3 = accumulator_1;
		            break;
		        }
		        /*@NonNull*/ /*@NonInvalid*/ Resource _1_5 = (Resource)ITERATOR__1_5.next();
		        /**
		         * oclAsType(Container)
		         */
		        final /*@NonNull*/ /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_docker_c_c_Container_1 = idResolver.getClass(DockerTables.CLSSid_Container, null);
		        final /*@NonNull*/ /*@Thrown*/ org.occiware.clouddesigner.occi.docker.Container oclAsType_0 = ClassUtil.nonNullState((org.occiware.clouddesigner.occi.docker.Container)org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1_5, TYP_docker_c_c_Container_1));
		        //
		        accumulator_1.add(oclAsType_0);
		    }
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_2 = ValueUtil.createSequenceAccumulatorValue(DockerTables.SEQ_PRIMid_Real);
		    /*@NonNull*/ Iterator<?> ITERATOR__1_6 = collect_3.iterator();
		    /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue collect_2;
		    while (true) {
		        if (!ITERATOR__1_6.hasNext()) {
		            collect_2 = accumulator_2;
		            break;
		        }
		        /*@NonNull*/ /*@NonInvalid*/ org.occiware.clouddesigner.occi.docker.Container _1_6 = (org.occiware.clouddesigner.occi.docker.Container)ITERATOR__1_6.next();
		        /**
		         * memory
		         */
		        final /*@Nullable*/ /*@Thrown*/ Number memory_1 = (Number)IMPPROPid_memory_2.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.REAL, _1_6);
		        final /*@Nullable*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.RealValue BOXED_memory_1 = memory_1 == null ? null : ValueUtil.realValueOf(memory_1);
		        //
		        accumulator_2.add(BOXED_memory_1);
		    }
		    final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.RealValue sum_3 = ClassUtil.nonNullState((org.eclipse.ocl.pivot.values.RealValue)org.eclipse.ocl.pivot.library.collection.CollectionSumOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.REAL, collect_2));
		    final /*@NonNull*/ /*@Thrown*/ String toString = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE.evaluate(sum_3));
		    final /*@NonNull*/ /*@NonInvalid*/ String sum_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE.evaluate(DockerTables.STR_Containers_32_consume_32, toString));
		    final /*@NonNull*/ /*@NonInvalid*/ String sum_1 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE.evaluate(sum_0, DockerTables.STR__32_when_32_memory_32_is_32_equals_32_to_32));
		    final /*@NonNull*/ /*@Thrown*/ String toString_0 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE.evaluate(BOXED_memory_2));
		    final /*@NonNull*/ /*@NonInvalid*/ String sum_2 = ClassUtil.nonNullState(org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0));
		    final /*@Thrown*/ boolean le_0 = ClassUtil.nonNullState(OclComparableLessThanEqualOperation.INSTANCE.evaluate(evaluator, sum_3, BOXED_memory_2).booleanValue());
		    final /*@NonNull*/ /*@Thrown*/ org.eclipse.ocl.pivot.values.TupleValue symbol_0 = ValueUtil.createTupleOfEach(DockerTables.TUPLid_, sum_2, le_0);
		    final /*@NonInvalid*/ boolean status = (Boolean)symbol_0.getValue(1/*status*/);
		    final /*@NonInvalid*/ boolean logDiagnostic = ClassUtil.nonNullState(CGStringLogDiagnosticOperation.INSTANCE.evaluate(evaluator, org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN, DockerTables.STR_Machine_VirtualBox_c_c_ContainersUsedTooMemory, this, diagnostics, context, severity_0, status, DockerTables.INT_0).booleanValue());
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL:
				return getBoot2docker_url();
			case DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE:
				return getDisk_size();
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL:
				setBoot2docker_url((String)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE:
				setDisk_size((Integer)newValue);
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL:
				setBoot2docker_url(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE:
				setDisk_size(DISK_SIZE_EDEFAULT);
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2docker_url != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2docker_url);
			case DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE:
				return disk_size != DISK_SIZE_EDEFAULT;
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
			case DockerPackage.MACHINE_VIRTUAL_BOX___CONTAINERS_USED_TOO_MEMORY__DIAGNOSTICCHAIN_MAP:
				return ContainersUsedTooMemory((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (boot2docker_url: ");
		result.append(boot2docker_url);
		result.append(", disk_size: ");
		result.append(disk_size);
		result.append(')');
		return result.toString();
	}

} //Machine_VirtualBoxImpl
