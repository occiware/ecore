/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine VMware vSphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getCompute_ip <em>Compute ip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getDatacenter <em>Datacenter</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl#getVcenter <em>Vcenter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_VMware_vSphereImpl extends MachineImpl implements Machine_VMware_vSphere {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;
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
	 * The default value of the '{@link #getCompute_ip() <em>Compute ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompute_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTE_IP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCompute_ip() <em>Compute ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompute_ip()
	 * @generated
	 * @ordered
	 */
	protected String compute_ip = COMPUTE_IP_EDEFAULT;
	/**
	 * The default value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_COUNT_EDEFAULT = 2;
	/**
	 * The cached value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected int cpu_count = CPU_COUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatacenter() <em>Datacenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenter()
	 * @generated
	 * @ordered
	 */
	protected String datacenter = DATACENTER_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatastore() <em>Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASTORE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatastore() <em>Datastore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected String datastore = DATASTORE_EDEFAULT;
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
	 * The default value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_SIZE_EDEFAULT = 2048;
	/**
	 * The cached value of the '{@link #getMemory_size() <em>Memory size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_size()
	 * @generated
	 * @ordered
	 */
	protected int memory_size = MEMORY_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;
	/**
	 * The default value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected String pool = POOL_EDEFAULT;
	/**
	 * The default value of the '{@link #getVcenter() <em>Vcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcenter()
	 * @generated
	 * @ordered
	 */
	protected static final String VCENTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVcenter() <em>Vcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcenter()
	 * @generated
	 * @ordered
	 */
	protected String vcenter = VCENTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_VMware_vSphereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_VMWARE_VSPHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL, oldBoot2docker_url, boot2docker_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompute_ip() {
		return compute_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompute_ip(String newCompute_ip) {
		String oldCompute_ip = compute_ip;
		compute_ip = newCompute_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP, oldCompute_ip, compute_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu_count() {
		return cpu_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_count(int newCpu_count) {
		int oldCpu_count = cpu_count;
		cpu_count = newCpu_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT, oldCpu_count, cpu_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenter() {
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenter(String newDatacenter) {
		String oldDatacenter = datacenter;
		datacenter = newDatacenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER, oldDatacenter, datacenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatastore() {
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastore(String newDatastore) {
		String oldDatastore = datastore;
		datastore = newDatastore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE, oldDatastore, datastore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE, oldDisk_size, disk_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory_size() {
		return memory_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_size(int newMemory_size) {
		int oldMemory_size = memory_size;
		memory_size = newMemory_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE, oldMemory_size, memory_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(String newPool) {
		String oldPool = pool;
		pool = newPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__POOL, oldPool, pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVcenter() {
		return vcenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcenter(String newVcenter) {
		String oldVcenter = vcenter;
		vcenter = newVcenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER, oldVcenter, vcenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL:
				return getBoot2docker_url();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP:
				return getCompute_ip();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT:
				return getCpu_count();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER:
				return getDatacenter();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE:
				return getDatastore();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE:
				return getDisk_size();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE:
				return getMemory_size();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK:
				return getNetwork();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__POOL:
				return getPool();
			case DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER:
				return getVcenter();
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
			case DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL:
				setBoot2docker_url((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP:
				setCompute_ip((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT:
				setCpu_count((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER:
				setDatacenter((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE:
				setDatastore((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE:
				setDisk_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE:
				setMemory_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK:
				setNetwork((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__POOL:
				setPool((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER:
				setVcenter((String)newValue);
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
			case DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL:
				setBoot2docker_url(BOOT2DOCKER_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP:
				setCompute_ip(COMPUTE_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT:
				setCpu_count(CPU_COUNT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER:
				setDatacenter(DATACENTER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE:
				setDatastore(DATASTORE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE:
				setDisk_size(DISK_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE:
				setMemory_size(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__POOL:
				setPool(POOL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER:
				setVcenter(VCENTER_EDEFAULT);
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
			case DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL:
				return BOOT2DOCKER_URL_EDEFAULT == null ? boot2docker_url != null : !BOOT2DOCKER_URL_EDEFAULT.equals(boot2docker_url);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP:
				return COMPUTE_IP_EDEFAULT == null ? compute_ip != null : !COMPUTE_IP_EDEFAULT.equals(compute_ip);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT:
				return cpu_count != CPU_COUNT_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER:
				return DATACENTER_EDEFAULT == null ? datacenter != null : !DATACENTER_EDEFAULT.equals(datacenter);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE:
				return DATASTORE_EDEFAULT == null ? datastore != null : !DATASTORE_EDEFAULT.equals(datastore);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE:
				return disk_size != DISK_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE:
				return memory_size != MEMORY_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__POOL:
				return POOL_EDEFAULT == null ? pool != null : !POOL_EDEFAULT.equals(pool);
			case DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER:
				return VCENTER_EDEFAULT == null ? vcenter != null : !VCENTER_EDEFAULT.equals(vcenter);
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", boot2docker_url: ");
		result.append(boot2docker_url);
		result.append(", compute_ip: ");
		result.append(compute_ip);
		result.append(", cpu_count: ");
		result.append(cpu_count);
		result.append(", datacenter: ");
		result.append(datacenter);
		result.append(", datastore: ");
		result.append(datastore);
		result.append(", disk_size: ");
		result.append(disk_size);
		result.append(", memory_size: ");
		result.append(memory_size);
		result.append(", network: ");
		result.append(network);
		result.append(", pool: ");
		result.append(pool);
		result.append(", vcenter: ");
		result.append(vcenter);
		result.append(')');
		return result.toString();
	}

} //Machine_VMware_vSphereImpl
