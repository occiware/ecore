/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine IBM Soft Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getApi_endpoint <em>Api endpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#isHourly_billing <em>Hourly billing</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#isLocal_disk <em>Local disk</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#isPrivate_net_only <em>Private net only</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_IBM_SoftLayerImpl extends MachineImpl implements Machine_IBM_SoftLayer {
	/**
	 * The default value of the '{@link #getApi_endpoint() <em>Api endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_endpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_endpoint() <em>Api endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_endpoint()
	 * @generated
	 * @ordered
	 */
	protected String api_endpoint = API_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected String api_key = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected int cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_size() <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_size()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SIZE_EDEFAULT = 0;

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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isHourly_billing() <em>Hourly billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHourly_billing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOURLY_BILLING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHourly_billing() <em>Hourly billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHourly_billing()
	 * @generated
	 * @ordered
	 */
	protected boolean hourly_billing = HOURLY_BILLING_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocal_disk() <em>Local disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal_disk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_DISK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocal_disk() <em>Local disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal_disk()
	 * @generated
	 * @ordered
	 */
	protected boolean local_disk = LOCAL_DISK_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivate_net_only() <em>Private net only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate_net_only()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_NET_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate_net_only() <em>Private net only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate_net_only()
	 * @generated
	 * @ordered
	 */
	protected boolean private_net_only = PRIVATE_NET_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_IBM_SoftLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_endpoint() {
		return api_endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_endpoint(String newApi_endpoint) {
		String oldApi_endpoint = api_endpoint;
		api_endpoint = newApi_endpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT, oldApi_endpoint, api_endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_key() {
		return api_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_key(String newApi_key) {
		String oldApi_key = api_key;
		api_key = newApi_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY, oldApi_key, api_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(int newCpu) {
		int oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU, oldCpu, cpu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE, oldDisk_size, disk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHourly_billing() {
		return hourly_billing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourly_billing(boolean newHourly_billing) {
		boolean oldHourly_billing = hourly_billing;
		hourly_billing = newHourly_billing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING, oldHourly_billing, hourly_billing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal_disk() {
		return local_disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal_disk(boolean newLocal_disk) {
		boolean oldLocal_disk = local_disk;
		local_disk = newLocal_disk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK, oldLocal_disk, local_disk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate_net_only() {
		return private_net_only;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate_net_only(boolean newPrivate_net_only) {
		boolean oldPrivate_net_only = private_net_only;
		private_net_only = newPrivate_net_only;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY, oldPrivate_net_only, private_net_only));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT:
				return getApi_endpoint();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__USER:
				return getUser();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY:
				return getApi_key();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU:
				return getCpu();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE:
				return getDisk_size();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN:
				return getDomain();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING:
				return isHourly_billing();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE:
				return getImage();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK:
				return isLocal_disk();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY:
				return isPrivate_net_only();
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION:
				return getRegion();
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
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT:
				setApi_endpoint((String)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__USER:
				setUser((String)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY:
				setApi_key((String)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU:
				setCpu((Integer)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE:
				setDisk_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN:
				setDomain((String)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING:
				setHourly_billing((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK:
				setLocal_disk((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY:
				setPrivate_net_only((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION:
				setRegion((String)newValue);
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
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT:
				setApi_endpoint(API_ENDPOINT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__USER:
				setUser(USER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY:
				setApi_key(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU:
				setCpu(CPU_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE:
				setDisk_size(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING:
				setHourly_billing(HOURLY_BILLING_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK:
				setLocal_disk(LOCAL_DISK_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY:
				setPrivate_net_only(PRIVATE_NET_ONLY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION:
				setRegion(REGION_EDEFAULT);
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
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT:
				return API_ENDPOINT_EDEFAULT == null ? api_endpoint != null : !API_ENDPOINT_EDEFAULT.equals(api_endpoint);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY:
				return API_KEY_EDEFAULT == null ? api_key != null : !API_KEY_EDEFAULT.equals(api_key);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU:
				return cpu != CPU_EDEFAULT;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE:
				return disk_size != DISK_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING:
				return hourly_billing != HOURLY_BILLING_EDEFAULT;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK:
				return local_disk != LOCAL_DISK_EDEFAULT;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY:
				return private_net_only != PRIVATE_NET_ONLY_EDEFAULT;
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
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
		result.append(" (api_endpoint: ");
		result.append(api_endpoint);
		result.append(", user: ");
		result.append(user);
		result.append(", api_key: ");
		result.append(api_key);
		result.append(", cpu: ");
		result.append(cpu);
		result.append(", disk_size: ");
		result.append(disk_size);
		result.append(", domain: ");
		result.append(domain);
		result.append(", hourly_billing: ");
		result.append(hourly_billing);
		result.append(", image: ");
		result.append(image);
		result.append(", local_disk: ");
		result.append(local_disk);
		result.append(", private_net_only: ");
		result.append(private_net_only);
		result.append(", region: ");
		result.append(region);
		result.append(')');
		return result.toString();
	}

} //Machine_IBM_SoftLayerImpl
