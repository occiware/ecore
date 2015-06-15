/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Microsoft Hyper V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl#getBoot2docker_location <em>Boot2docker location</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl#getVirtual_switch <em>Virtual switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Microsoft_Hyper_VImpl extends MachineImpl implements Machine_Microsoft_Hyper_V {
	/**
	 * The default value of the '{@link #getBoot2docker_location() <em>Boot2docker location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_location()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT2DOCKER_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoot2docker_location() <em>Boot2docker location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoot2docker_location()
	 * @generated
	 * @ordered
	 */
	protected String boot2docker_location = BOOT2DOCKER_LOCATION_EDEFAULT;

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
	 * The default value of the '{@link #getVirtual_switch() <em>Virtual switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual_switch()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_SWITCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtual_switch() <em>Virtual switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual_switch()
	 * @generated
	 * @ordered
	 */
	protected String virtual_switch = VIRTUAL_SWITCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Microsoft_Hyper_VImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoot2docker_location() {
		return boot2docker_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot2docker_location(String newBoot2docker_location) {
		String oldBoot2docker_location = boot2docker_location;
		boot2docker_location = newBoot2docker_location;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION, oldBoot2docker_location, boot2docker_location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL, oldBoot2docker_url, boot2docker_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE, oldDisk_size, disk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtual_switch() {
		return virtual_switch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual_switch(String newVirtual_switch) {
		String oldVirtual_switch = virtual_switch;
		virtual_switch = newVirtual_switch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH, oldVirtual_switch, virtual_switch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION:
				return getBoot2docker_location();
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL:
				return getBoot2docker_url();
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE:
				return getDisk_size();
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH:
				return getVirtual_switch();
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
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION:
				setBoot2docker_location((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL:
				setBoot2docker_url((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE:
				setDisk_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH:
				setVirtual_switch((String)newValue);
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
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION:
				setBoot2docker_location(BOOT2DOCKER_LOCATION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL:
				setBoot2docker_url(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE:
				setDisk_size(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH:
				setVirtual_switch(VIRTUAL_SWITCH_EDEFAULT);
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
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION:
				return BOOT2DOCKER_LOCATION_EDEFAULT == null ? boot2docker_location != null : !BOOT2DOCKER_LOCATION_EDEFAULT.equals(boot2docker_location);
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2docker_url != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2docker_url);
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE:
				return disk_size != DISK_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH:
				return VIRTUAL_SWITCH_EDEFAULT == null ? virtual_switch != null : !VIRTUAL_SWITCH_EDEFAULT.equals(virtual_switch);
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
		result.append(" (boot2docker_location: ");
		result.append(boot2docker_location);
		result.append(", boot2docker_url: ");
		result.append(boot2docker_url);
		result.append(", disk_size: ");
		result.append(disk_size);
		result.append(", virtual_switch: ");
		result.append(virtual_switch);
		result.append(')');
		return result.toString();
	}

} //Machine_Microsoft_Hyper_VImpl
