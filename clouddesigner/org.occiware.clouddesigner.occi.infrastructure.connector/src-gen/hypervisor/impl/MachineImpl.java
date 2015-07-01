/**
 */
package hypervisor.impl;

import hypervisor.HypervisorPackage;
import hypervisor.Machine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hypervisor.impl.MachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link hypervisor.impl.MachineImpl#getBoot <em>Boot</em>}</li>
 *   <li>{@link hypervisor.impl.MachineImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link hypervisor.impl.MachineImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link hypervisor.impl.MachineImpl#getOs_type <em>Os type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends ComputeImpl implements Machine {
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
	 * The default value of the '{@link #getBoot() <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot() <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot()
	 * @generated
	 * @ordered
	 */
	protected String boot = BOOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = "localtime";

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs_type() <em>Os type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs_type()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs_type() <em>Os type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs_type()
	 * @generated
	 * @ordered
	 */
	protected String os_type = OS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot() {
		return boot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot(String newBoot) {
		String oldBoot = boot;
		boot = newBoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE__BOOT, oldBoot, boot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs_type() {
		return os_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs_type(String newOs_type) {
		String oldOs_type = os_type;
		os_type = newOs_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.MACHINE__OS_TYPE, oldOs_type, os_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.MACHINE__NAME:
				return getName();
			case HypervisorPackage.MACHINE__BOOT:
				return getBoot();
			case HypervisorPackage.MACHINE__UUID:
				return getUuid();
			case HypervisorPackage.MACHINE__OFFSET:
				return getOffset();
			case HypervisorPackage.MACHINE__OS_TYPE:
				return getOs_type();
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
			case HypervisorPackage.MACHINE__NAME:
				setName((String)newValue);
				return;
			case HypervisorPackage.MACHINE__BOOT:
				setBoot((String)newValue);
				return;
			case HypervisorPackage.MACHINE__UUID:
				setUuid((String)newValue);
				return;
			case HypervisorPackage.MACHINE__OFFSET:
				setOffset((String)newValue);
				return;
			case HypervisorPackage.MACHINE__OS_TYPE:
				setOs_type((String)newValue);
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
			case HypervisorPackage.MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE__BOOT:
				setBoot(BOOT_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case HypervisorPackage.MACHINE__OS_TYPE:
				setOs_type(OS_TYPE_EDEFAULT);
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
			case HypervisorPackage.MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HypervisorPackage.MACHINE__BOOT:
				return BOOT_EDEFAULT == null ? boot != null : !BOOT_EDEFAULT.equals(boot);
			case HypervisorPackage.MACHINE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case HypervisorPackage.MACHINE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case HypervisorPackage.MACHINE__OS_TYPE:
				return OS_TYPE_EDEFAULT == null ? os_type != null : !OS_TYPE_EDEFAULT.equals(os_type);
		}
		return super.eIsSet(featureID);
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
		result.append(", boot: ");
		result.append(boot);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", offset: ");
		result.append(offset);
		result.append(", os_type: ");
		result.append(os_type);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
