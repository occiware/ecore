/**
 */
package org.occiware.clouddesigner.occi.infrastructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.Network;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl#getVlan <em>Vlan</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.NetworkImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends org.occiware.clouddesigner.occi.impl.ResourceImpl implements Network {
	/**
	 * The default value of the '{@link #getVlan() <em>Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlan()
	 * @generated
	 * @ordered
	 */
	protected static final int VLAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVlan() <em>Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlan()
	 * @generated
	 * @ordered
	 */
	protected int vlan = VLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ComputeStatus STATE_EDEFAULT = ComputeStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ComputeStatus state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVlan() {
		return vlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVlan(int newVlan) {
		int oldVlan = vlan;
		vlan = newVlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__VLAN, oldVlan, vlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeStatus getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ComputeStatus newState) {
		ComputeStatus oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void up() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Network!up()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void down() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Network!down()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__VLAN:
				return getVlan();
			case InfrastructurePackage.NETWORK__LABEL:
				return getLabel();
			case InfrastructurePackage.NETWORK__STATE:
				return getState();
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
			case InfrastructurePackage.NETWORK__VLAN:
				setVlan((Integer)newValue);
				return;
			case InfrastructurePackage.NETWORK__LABEL:
				setLabel((String)newValue);
				return;
			case InfrastructurePackage.NETWORK__STATE:
				setState((ComputeStatus)newValue);
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
			case InfrastructurePackage.NETWORK__VLAN:
				setVlan(VLAN_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__STATE:
				setState(STATE_EDEFAULT);
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
			case InfrastructurePackage.NETWORK__VLAN:
				return vlan != VLAN_EDEFAULT;
			case InfrastructurePackage.NETWORK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InfrastructurePackage.NETWORK__STATE:
				return state != STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InfrastructurePackage.NETWORK___UP:
				up();
				return null;
			case InfrastructurePackage.NETWORK___DOWN:
				down();
				return null;
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
		result.append(" (vlan: ");
		result.append(vlan);
		result.append(", label: ");
		result.append(label);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
