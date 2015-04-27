/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Microsoft Azure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSubscription_id <em>Subscription id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSubscription_cert <em>Subscription cert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Microsoft_AzureImpl extends MachineImpl implements Machine_Microsoft_Azure {
	/**
	 * The default value of the '{@link #getSubscription_id() <em>Subscription id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubscription_id() <em>Subscription id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_id()
	 * @generated
	 * @ordered
	 */
	protected String subscription_id = SUBSCRIPTION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubscription_cert() <em>Subscription cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_cert()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_CERT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubscription_cert() <em>Subscription cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_cert()
	 * @generated
	 * @ordered
	 */
	protected String subscription_cert = SUBSCRIPTION_CERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Microsoft_AzureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_MICROSOFT_AZURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscription_id() {
		return subscription_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription_id(String newSubscription_id) {
		String oldSubscription_id = subscription_id;
		subscription_id = newSubscription_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID, oldSubscription_id, subscription_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscription_cert() {
		return subscription_cert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription_cert(String newSubscription_cert) {
		String oldSubscription_cert = subscription_cert;
		subscription_cert = newSubscription_cert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT, oldSubscription_cert, subscription_cert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID:
				return getSubscription_id();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT:
				return getSubscription_cert();
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID:
				setSubscription_id((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT:
				setSubscription_cert((String)newValue);
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID:
				setSubscription_id(SUBSCRIPTION_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT:
				setSubscription_cert(SUBSCRIPTION_CERT_EDEFAULT);
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscription_id != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscription_id);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT:
				return SUBSCRIPTION_CERT_EDEFAULT == null ? subscription_cert != null : !SUBSCRIPTION_CERT_EDEFAULT.equals(subscription_cert);
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
		result.append(" (subscription_id: ");
		result.append(subscription_id);
		result.append(", subscription_cert: ");
		result.append(subscription_cert);
		result.append(')');
		return result.toString();
	}

} //Machine_Microsoft_AzureImpl
