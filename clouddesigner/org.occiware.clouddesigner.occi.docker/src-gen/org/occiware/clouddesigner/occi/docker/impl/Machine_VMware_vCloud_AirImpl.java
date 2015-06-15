/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine VMware vCloud Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getCatalogitem <em>Catalogitem</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getComputeid <em>Computeid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getDocker_port <em>Docker port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getEdgegateway <em>Edgegateway</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getMemory_size <em>Memory size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getVapp_name <em>Vapp name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getOrgvdcnetwork <em>Orgvdcnetwork</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#isProvision <em>Provision</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getPublicip <em>Publicip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getSsh_port <em>Ssh port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl#getVdcid <em>Vdcid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_VMware_vCloud_AirImpl extends MachineImpl implements Machine_VMware_vCloud_Air {
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
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = "Public Catalog";

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalogitem() <em>Catalogitem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogitem()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOGITEM_EDEFAULT = "Ubuntu Server 12.04 LTS (amd64 20140927)";

	/**
	 * The cached value of the '{@link #getCatalogitem() <em>Catalogitem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogitem()
	 * @generated
	 * @ordered
	 */
	protected String catalogitem = CATALOGITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputeid() <em>Computeid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeid()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputeid() <em>Computeid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeid()
	 * @generated
	 * @ordered
	 */
	protected String computeid = COMPUTEID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_COUNT_EDEFAULT = 1;

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
	 * The default value of the '{@link #getDocker_port() <em>Docker port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_port()
	 * @generated
	 * @ordered
	 */
	protected static final int DOCKER_PORT_EDEFAULT = 2376;

	/**
	 * The cached value of the '{@link #getDocker_port() <em>Docker port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_port()
	 * @generated
	 * @ordered
	 */
	protected int docker_port = DOCKER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdgegateway() <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgegateway()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGEGATEWAY_EDEFAULT = "<vdcid>";

	/**
	 * The cached value of the '{@link #getEdgegateway() <em>Edgegateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgegateway()
	 * @generated
	 * @ordered
	 */
	protected String edgegateway = EDGEGATEWAY_EDEFAULT;

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
	 * The default value of the '{@link #getVapp_name() <em>Vapp name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVapp_name()
	 * @generated
	 * @ordered
	 */
	protected static final String VAPP_NAME_EDEFAULT = "<autogenerated>";

	/**
	 * The cached value of the '{@link #getVapp_name() <em>Vapp name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVapp_name()
	 * @generated
	 * @ordered
	 */
	protected String vapp_name = VAPP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrgvdcnetwork() <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgvdcnetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGVDCNETWORK_EDEFAULT = "<vdcid>-default-routed";

	/**
	 * The cached value of the '{@link #getOrgvdcnetwork() <em>Orgvdcnetwork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrgvdcnetwork()
	 * @generated
	 * @ordered
	 */
	protected String orgvdcnetwork = ORGVDCNETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvision() <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVISION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isProvision() <em>Provision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvision()
	 * @generated
	 * @ordered
	 */
	protected boolean provision = PROVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicip() <em>Publicip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicip()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicip() <em>Publicip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicip()
	 * @generated
	 * @ordered
	 */
	protected String publicip = PUBLICIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected static final int SSH_PORT_EDEFAULT = 22;

	/**
	 * The cached value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected int ssh_port = SSH_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVdcid() <em>Vdcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdcid()
	 * @generated
	 * @ordered
	 */
	protected static final String VDCID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdcid() <em>Vdcid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdcid()
	 * @generated
	 * @ordered
	 */
	protected String vdcid = VDCID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_VMware_vCloud_AirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalogitem() {
		return catalogitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogitem(String newCatalogitem) {
		String oldCatalogitem = catalogitem;
		catalogitem = newCatalogitem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM, oldCatalogitem, catalogitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputeid() {
		return computeid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputeid(String newComputeid) {
		String oldComputeid = computeid;
		computeid = newComputeid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID, oldComputeid, computeid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT, oldCpu_count, cpu_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDocker_port() {
		return docker_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocker_port(int newDocker_port) {
		int oldDocker_port = docker_port;
		docker_port = newDocker_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT, oldDocker_port, docker_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdgegateway() {
		return edgegateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgegateway(String newEdgegateway) {
		String oldEdgegateway = edgegateway;
		edgegateway = newEdgegateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY, oldEdgegateway, edgegateway));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE, oldMemory_size, memory_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVapp_name() {
		return vapp_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVapp_name(String newVapp_name) {
		String oldVapp_name = vapp_name;
		vapp_name = newVapp_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME, oldVapp_name, vapp_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrgvdcnetwork() {
		return orgvdcnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrgvdcnetwork(String newOrgvdcnetwork) {
		String oldOrgvdcnetwork = orgvdcnetwork;
		orgvdcnetwork = newOrgvdcnetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK, oldOrgvdcnetwork, orgvdcnetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvision() {
		return provision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvision(boolean newProvision) {
		boolean oldProvision = provision;
		provision = newProvision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION, oldProvision, provision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicip() {
		return publicip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicip(String newPublicip) {
		String oldPublicip = publicip;
		publicip = newPublicip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP, oldPublicip, publicip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSsh_port() {
		return ssh_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_port(int newSsh_port) {
		int oldSsh_port = ssh_port;
		ssh_port = newSsh_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT, oldSsh_port, ssh_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVdcid() {
		return vdcid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdcid(String newVdcid) {
		String oldVdcid = vdcid;
		vdcid = newVdcid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID, oldVdcid, vdcid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG:
				return getCatalog();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM:
				return getCatalogitem();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID:
				return getComputeid();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT:
				return getCpu_count();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT:
				return getDocker_port();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY:
				return getEdgegateway();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE:
				return getMemory_size();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME:
				return getVapp_name();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK:
				return getOrgvdcnetwork();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION:
				return isProvision();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP:
				return getPublicip();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT:
				return getSsh_port();
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID:
				return getVdcid();
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
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG:
				setCatalog((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM:
				setCatalogitem((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID:
				setComputeid((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT:
				setCpu_count((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT:
				setDocker_port((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY:
				setEdgegateway((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE:
				setMemory_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME:
				setVapp_name((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK:
				setOrgvdcnetwork((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION:
				setProvision((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP:
				setPublicip((String)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT:
				setSsh_port((Integer)newValue);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID:
				setVdcid((String)newValue);
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
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM:
				setCatalogitem(CATALOGITEM_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID:
				setComputeid(COMPUTEID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT:
				setCpu_count(CPU_COUNT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT:
				setDocker_port(DOCKER_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY:
				setEdgegateway(EDGEGATEWAY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE:
				setMemory_size(MEMORY_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME:
				setVapp_name(VAPP_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK:
				setOrgvdcnetwork(ORGVDCNETWORK_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION:
				setProvision(PROVISION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP:
				setPublicip(PUBLICIP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT:
				setSsh_port(SSH_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID:
				setVdcid(VDCID_EDEFAULT);
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
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM:
				return CATALOGITEM_EDEFAULT == null ? catalogitem != null : !CATALOGITEM_EDEFAULT.equals(catalogitem);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID:
				return COMPUTEID_EDEFAULT == null ? computeid != null : !COMPUTEID_EDEFAULT.equals(computeid);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT:
				return cpu_count != CPU_COUNT_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT:
				return docker_port != DOCKER_PORT_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY:
				return EDGEGATEWAY_EDEFAULT == null ? edgegateway != null : !EDGEGATEWAY_EDEFAULT.equals(edgegateway);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE:
				return memory_size != MEMORY_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME:
				return VAPP_NAME_EDEFAULT == null ? vapp_name != null : !VAPP_NAME_EDEFAULT.equals(vapp_name);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK:
				return ORGVDCNETWORK_EDEFAULT == null ? orgvdcnetwork != null : !ORGVDCNETWORK_EDEFAULT.equals(orgvdcnetwork);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION:
				return provision != PROVISION_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP:
				return PUBLICIP_EDEFAULT == null ? publicip != null : !PUBLICIP_EDEFAULT.equals(publicip);
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT:
				return ssh_port != SSH_PORT_EDEFAULT;
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID:
				return VDCID_EDEFAULT == null ? vdcid != null : !VDCID_EDEFAULT.equals(vdcid);
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
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", catalogitem: ");
		result.append(catalogitem);
		result.append(", computeid: ");
		result.append(computeid);
		result.append(", cpu_count: ");
		result.append(cpu_count);
		result.append(", docker_port: ");
		result.append(docker_port);
		result.append(", edgegateway: ");
		result.append(edgegateway);
		result.append(", memory_size: ");
		result.append(memory_size);
		result.append(", vapp_name: ");
		result.append(vapp_name);
		result.append(", orgvdcnetwork: ");
		result.append(orgvdcnetwork);
		result.append(", provision: ");
		result.append(provision);
		result.append(", publicip: ");
		result.append(publicip);
		result.append(", ssh_port: ");
		result.append(ssh_port);
		result.append(", vdcid: ");
		result.append(vdcid);
		result.append(')');
		return result.toString();
	}

} //Machine_VMware_vCloud_AirImpl
