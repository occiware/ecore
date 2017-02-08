/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
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
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#isHost_dns_resolver <em>Host dns resolver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getImport_boot2docker_vm <em>Import boot2docker vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getHostonly_cidr <em>Hostonly cidr</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getHostonly_nictype <em>Hostonly nictype</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getHostonly_nicpromisc <em>Hostonly nicpromisc</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#isNo_share <em>No share</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#isNo_dns_proxy <em>No dns proxy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#isNo_vtx_check <em>No vtx check</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl#getShare_folder <em>Share folder</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #isHost_dns_resolver() <em>Host dns resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHost_dns_resolver()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOST_DNS_RESOLVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHost_dns_resolver() <em>Host dns resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHost_dns_resolver()
	 * @generated
	 * @ordered
	 */
	protected boolean host_dns_resolver = HOST_DNS_RESOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getImport_boot2docker_vm() <em>Import boot2docker vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_boot2docker_vm()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_BOOT2DOCKER_VM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImport_boot2docker_vm() <em>Import boot2docker vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_boot2docker_vm()
	 * @generated
	 * @ordered
	 */
	protected String import_boot2docker_vm = IMPORT_BOOT2DOCKER_VM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostonly_cidr() <em>Hostonly cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_cidr()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTONLY_CIDR_EDEFAULT = "192.168.99.1/24";

	/**
	 * The cached value of the '{@link #getHostonly_cidr() <em>Hostonly cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_cidr()
	 * @generated
	 * @ordered
	 */
	protected String hostonly_cidr = HOSTONLY_CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostonly_nictype() <em>Hostonly nictype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_nictype()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTONLY_NICTYPE_EDEFAULT = "82540EM";

	/**
	 * The cached value of the '{@link #getHostonly_nictype() <em>Hostonly nictype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_nictype()
	 * @generated
	 * @ordered
	 */
	protected String hostonly_nictype = HOSTONLY_NICTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostonly_nicpromisc() <em>Hostonly nicpromisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_nicpromisc()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTONLY_NICPROMISC_EDEFAULT = "deny";

	/**
	 * The cached value of the '{@link #getHostonly_nicpromisc() <em>Hostonly nicpromisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostonly_nicpromisc()
	 * @generated
	 * @ordered
	 */
	protected String hostonly_nicpromisc = HOSTONLY_NICPROMISC_EDEFAULT;

	/**
	 * The default value of the '{@link #isNo_share() <em>No share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_share()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SHARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNo_share() <em>No share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_share()
	 * @generated
	 * @ordered
	 */
	protected boolean no_share = NO_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNo_dns_proxy() <em>No dns proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_dns_proxy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DNS_PROXY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNo_dns_proxy() <em>No dns proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_dns_proxy()
	 * @generated
	 * @ordered
	 */
	protected boolean no_dns_proxy = NO_DNS_PROXY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNo_vtx_check() <em>No vtx check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_vtx_check()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_VTX_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNo_vtx_check() <em>No vtx check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNo_vtx_check()
	 * @generated
	 * @ordered
	 */
	protected boolean no_vtx_check = NO_VTX_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getShare_folder() <em>Share folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare_folder()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARE_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShare_folder() <em>Share folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShare_folder()
	 * @generated
	 * @ordered
	 */
	protected String share_folder = SHARE_FOLDER_EDEFAULT;

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
	public boolean isHost_dns_resolver() {
		return host_dns_resolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost_dns_resolver(boolean newHost_dns_resolver) {
		boolean oldHost_dns_resolver = host_dns_resolver;
		host_dns_resolver = newHost_dns_resolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER, oldHost_dns_resolver, host_dns_resolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImport_boot2docker_vm() {
		return import_boot2docker_vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_boot2docker_vm(String newImport_boot2docker_vm) {
		String oldImport_boot2docker_vm = import_boot2docker_vm;
		import_boot2docker_vm = newImport_boot2docker_vm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM, oldImport_boot2docker_vm, import_boot2docker_vm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostonly_cidr() {
		return hostonly_cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostonly_cidr(String newHostonly_cidr) {
		String oldHostonly_cidr = hostonly_cidr;
		hostonly_cidr = newHostonly_cidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR, oldHostonly_cidr, hostonly_cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostonly_nictype() {
		return hostonly_nictype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostonly_nictype(String newHostonly_nictype) {
		String oldHostonly_nictype = hostonly_nictype;
		hostonly_nictype = newHostonly_nictype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE, oldHostonly_nictype, hostonly_nictype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostonly_nicpromisc() {
		return hostonly_nicpromisc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostonly_nicpromisc(String newHostonly_nicpromisc) {
		String oldHostonly_nicpromisc = hostonly_nicpromisc;
		hostonly_nicpromisc = newHostonly_nicpromisc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC, oldHostonly_nicpromisc, hostonly_nicpromisc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNo_share() {
		return no_share;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_share(boolean newNo_share) {
		boolean oldNo_share = no_share;
		no_share = newNo_share;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE, oldNo_share, no_share));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNo_dns_proxy() {
		return no_dns_proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_dns_proxy(boolean newNo_dns_proxy) {
		boolean oldNo_dns_proxy = no_dns_proxy;
		no_dns_proxy = newNo_dns_proxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY, oldNo_dns_proxy, no_dns_proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNo_vtx_check() {
		return no_vtx_check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_vtx_check(boolean newNo_vtx_check) {
		boolean oldNo_vtx_check = no_vtx_check;
		no_vtx_check = newNo_vtx_check;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK, oldNo_vtx_check, no_vtx_check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShare_folder() {
		return share_folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShare_folder(String newShare_folder) {
		String oldShare_folder = share_folder;
		share_folder = newShare_folder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER, oldShare_folder, share_folder));
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER:
				return isHost_dns_resolver();
			case DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM:
				return getImport_boot2docker_vm();
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR:
				return getHostonly_cidr();
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE:
				return getHostonly_nictype();
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC:
				return getHostonly_nicpromisc();
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE:
				return isNo_share();
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY:
				return isNo_dns_proxy();
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK:
				return isNo_vtx_check();
			case DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER:
				return getShare_folder();
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER:
				setHost_dns_resolver((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM:
				setImport_boot2docker_vm((String)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR:
				setHostonly_cidr((String)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE:
				setHostonly_nictype((String)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC:
				setHostonly_nicpromisc((String)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE:
				setNo_share((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY:
				setNo_dns_proxy((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK:
				setNo_vtx_check((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER:
				setShare_folder((String)newValue);
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER:
				setHost_dns_resolver(HOST_DNS_RESOLVER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM:
				setImport_boot2docker_vm(IMPORT_BOOT2DOCKER_VM_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR:
				setHostonly_cidr(HOSTONLY_CIDR_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE:
				setHostonly_nictype(HOSTONLY_NICTYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC:
				setHostonly_nicpromisc(HOSTONLY_NICPROMISC_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE:
				setNo_share(NO_SHARE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY:
				setNo_dns_proxy(NO_DNS_PROXY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK:
				setNo_vtx_check(NO_VTX_CHECK_EDEFAULT);
				return;
			case DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER:
				setShare_folder(SHARE_FOLDER_EDEFAULT);
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER:
				return host_dns_resolver != HOST_DNS_RESOLVER_EDEFAULT;
			case DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM:
				return IMPORT_BOOT2DOCKER_VM_EDEFAULT == null ? import_boot2docker_vm != null : !IMPORT_BOOT2DOCKER_VM_EDEFAULT.equals(import_boot2docker_vm);
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR:
				return HOSTONLY_CIDR_EDEFAULT == null ? hostonly_cidr != null : !HOSTONLY_CIDR_EDEFAULT.equals(hostonly_cidr);
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE:
				return HOSTONLY_NICTYPE_EDEFAULT == null ? hostonly_nictype != null : !HOSTONLY_NICTYPE_EDEFAULT.equals(hostonly_nictype);
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC:
				return HOSTONLY_NICPROMISC_EDEFAULT == null ? hostonly_nicpromisc != null : !HOSTONLY_NICPROMISC_EDEFAULT.equals(hostonly_nicpromisc);
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE:
				return no_share != NO_SHARE_EDEFAULT;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY:
				return no_dns_proxy != NO_DNS_PROXY_EDEFAULT;
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK:
				return no_vtx_check != NO_VTX_CHECK_EDEFAULT;
			case DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER:
				return SHARE_FOLDER_EDEFAULT == null ? share_folder != null : !SHARE_FOLDER_EDEFAULT.equals(share_folder);
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
		result.append(", host_dns_resolver: ");
		result.append(host_dns_resolver);
		result.append(", import_boot2docker_vm: ");
		result.append(import_boot2docker_vm);
		result.append(", hostonly_cidr: ");
		result.append(hostonly_cidr);
		result.append(", hostonly_nictype: ");
		result.append(hostonly_nictype);
		result.append(", hostonly_nicpromisc: ");
		result.append(hostonly_nicpromisc);
		result.append(", no_share: ");
		result.append(no_share);
		result.append(", no_dns_proxy: ");
		result.append(no_dns_proxy);
		result.append(", no_vtx_check: ");
		result.append(no_vtx_check);
		result.append(", share_folder: ");
		result.append(share_folder);
		result.append(')');
		return result.toString();
	}

} //Machine_VirtualBoxImpl
