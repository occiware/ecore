/**
 */
package hypervisor.impl;

import hypervisor.Direct;
import hypervisor.HypervisorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hypervisor.impl.DirectImpl#getSource_dev <em>Source dev</em>}</li>
 *   <li>{@link hypervisor.impl.DirectImpl#getSource_mode <em>Source mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectImpl extends InterfaceImpl implements Direct {
	/**
	 * The default value of the '{@link #getSource_dev() <em>Source dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_dev()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DEV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_dev() <em>Source dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_dev()
	 * @generated
	 * @ordered
	 */
	protected String source_dev = SOURCE_DEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource_mode() <em>Source mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_mode() <em>Source mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_mode()
	 * @generated
	 * @ordered
	 */
	protected String source_mode = SOURCE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.DIRECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource_dev() {
		return source_dev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_dev(String newSource_dev) {
		String oldSource_dev = source_dev;
		source_dev = newSource_dev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DIRECT__SOURCE_DEV, oldSource_dev, source_dev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource_mode() {
		return source_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_mode(String newSource_mode) {
		String oldSource_mode = source_mode;
		source_mode = newSource_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.DIRECT__SOURCE_MODE, oldSource_mode, source_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.DIRECT__SOURCE_DEV:
				return getSource_dev();
			case HypervisorPackage.DIRECT__SOURCE_MODE:
				return getSource_mode();
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
			case HypervisorPackage.DIRECT__SOURCE_DEV:
				setSource_dev((String)newValue);
				return;
			case HypervisorPackage.DIRECT__SOURCE_MODE:
				setSource_mode((String)newValue);
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
			case HypervisorPackage.DIRECT__SOURCE_DEV:
				setSource_dev(SOURCE_DEV_EDEFAULT);
				return;
			case HypervisorPackage.DIRECT__SOURCE_MODE:
				setSource_mode(SOURCE_MODE_EDEFAULT);
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
			case HypervisorPackage.DIRECT__SOURCE_DEV:
				return SOURCE_DEV_EDEFAULT == null ? source_dev != null : !SOURCE_DEV_EDEFAULT.equals(source_dev);
			case HypervisorPackage.DIRECT__SOURCE_MODE:
				return SOURCE_MODE_EDEFAULT == null ? source_mode != null : !SOURCE_MODE_EDEFAULT.equals(source_mode);
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
		result.append(" (source_dev: ");
		result.append(source_dev);
		result.append(", source_mode: ");
		result.append(source_mode);
		result.append(')');
		return result.toString();
	}

} //DirectImpl
