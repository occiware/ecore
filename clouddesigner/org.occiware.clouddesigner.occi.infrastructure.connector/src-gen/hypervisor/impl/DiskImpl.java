/**
 */
package hypervisor.impl;

import hypervisor.Disk;
import hypervisor.HypervisorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.infrastructure.impl.StorageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hypervisor.impl.DiskImpl#getName <em>Name</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#getType <em>Type</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#getTarget_dev <em>Target dev</em>}</li>
 *   <li>{@link hypervisor.impl.DiskImpl#getTarget_bus <em>Target bus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiskImpl extends StorageImpl implements Disk {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Disk";

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget_dev() <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_dev()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DEV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_dev() <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_dev()
	 * @generated
	 * @ordered
	 */
	protected String target_dev = TARGET_DEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget_bus() <em>Target bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_bus()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_BUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_bus() <em>Target bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_bus()
	 * @generated
	 * @ordered
	 */
	protected String target_bus = TARGET_BUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.DISK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget_dev() {
		return target_dev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_dev(String newTarget_dev) {
		String oldTarget_dev = target_dev;
		target_dev = newTarget_dev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__TARGET_DEV, oldTarget_dev, target_dev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget_bus() {
		return target_bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_bus(String newTarget_bus) {
		String oldTarget_bus = target_bus;
		target_bus = newTarget_bus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DISK__TARGET_BUS, oldTarget_bus, target_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.DISK__NAME:
				return getName();
			case HypervisorPackage.DISK__TYPE:
				return getType();
			case HypervisorPackage.DISK__DEVICE:
				return getDevice();
			case HypervisorPackage.DISK__SOURCE:
				return getSource();
			case HypervisorPackage.DISK__READONLY:
				return isReadonly();
			case HypervisorPackage.DISK__TARGET_DEV:
				return getTarget_dev();
			case HypervisorPackage.DISK__TARGET_BUS:
				return getTarget_bus();
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
			case HypervisorPackage.DISK__NAME:
				setName((String)newValue);
				return;
			case HypervisorPackage.DISK__TYPE:
				setType((String)newValue);
				return;
			case HypervisorPackage.DISK__DEVICE:
				setDevice((String)newValue);
				return;
			case HypervisorPackage.DISK__SOURCE:
				setSource((String)newValue);
				return;
			case HypervisorPackage.DISK__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case HypervisorPackage.DISK__TARGET_DEV:
				setTarget_dev((String)newValue);
				return;
			case HypervisorPackage.DISK__TARGET_BUS:
				setTarget_bus((String)newValue);
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
			case HypervisorPackage.DISK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HypervisorPackage.DISK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HypervisorPackage.DISK__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case HypervisorPackage.DISK__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case HypervisorPackage.DISK__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case HypervisorPackage.DISK__TARGET_DEV:
				setTarget_dev(TARGET_DEV_EDEFAULT);
				return;
			case HypervisorPackage.DISK__TARGET_BUS:
				setTarget_bus(TARGET_BUS_EDEFAULT);
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
			case HypervisorPackage.DISK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HypervisorPackage.DISK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case HypervisorPackage.DISK__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case HypervisorPackage.DISK__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case HypervisorPackage.DISK__READONLY:
				return readonly != READONLY_EDEFAULT;
			case HypervisorPackage.DISK__TARGET_DEV:
				return TARGET_DEV_EDEFAULT == null ? target_dev != null : !TARGET_DEV_EDEFAULT.equals(target_dev);
			case HypervisorPackage.DISK__TARGET_BUS:
				return TARGET_BUS_EDEFAULT == null ? target_bus != null : !TARGET_BUS_EDEFAULT.equals(target_bus);
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
		result.append(", type: ");
		result.append(type);
		result.append(", device: ");
		result.append(device);
		result.append(", source: ");
		result.append(source);
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", target_dev: ");
		result.append(target_dev);
		result.append(", target_bus: ");
		result.append(target_bus);
		result.append(')');
		return result.toString();
	}

} //DiskImpl
