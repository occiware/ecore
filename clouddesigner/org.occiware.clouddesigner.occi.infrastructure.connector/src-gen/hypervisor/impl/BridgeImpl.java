/**
 */
package hypervisor.impl;

import hypervisor.Bridge;
import hypervisor.HypervisorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hypervisor.impl.BridgeImpl#getSource_bridge <em>Source bridge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeImpl extends InterfaceImpl implements Bridge {
	/**
	 * The default value of the '{@link #getSource_bridge() <em>Source bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_bridge()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_BRIDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource_bridge() <em>Source bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_bridge()
	 * @generated
	 * @ordered
	 */
	protected String source_bridge = SOURCE_BRIDGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypervisorPackage.Literals.BRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource_bridge() {
		return source_bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_bridge(String newSource_bridge) {
		String oldSource_bridge = source_bridge;
		source_bridge = newSource_bridge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypervisorPackage.BRIDGE__SOURCE_BRIDGE, oldSource_bridge, source_bridge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HypervisorPackage.BRIDGE__SOURCE_BRIDGE:
				return getSource_bridge();
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
			case HypervisorPackage.BRIDGE__SOURCE_BRIDGE:
				setSource_bridge((String)newValue);
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
			case HypervisorPackage.BRIDGE__SOURCE_BRIDGE:
				setSource_bridge(SOURCE_BRIDGE_EDEFAULT);
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
			case HypervisorPackage.BRIDGE__SOURCE_BRIDGE:
				return SOURCE_BRIDGE_EDEFAULT == null ? source_bridge != null : !SOURCE_BRIDGE_EDEFAULT.equals(source_bridge);
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
		result.append(" (source_bridge: ");
		result.append(source_bridge);
		result.append(')');
		return result.toString();
	}

} //BridgeImpl
