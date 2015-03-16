/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getDisk_size <em>Disk size</em>}</li>
 * </ul>
 * </p>
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
