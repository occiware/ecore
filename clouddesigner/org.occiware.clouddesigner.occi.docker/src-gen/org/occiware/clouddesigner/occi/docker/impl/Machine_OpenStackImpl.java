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
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getFlavor_name <em>Flavor name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getImage_name <em>Image name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getAuth_url <em>Auth url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getTenant_name <em>Tenant name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getEndpoint_type <em>Endpoint type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getNet_id <em>Net id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getNet_name <em>Net name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getSec_groups <em>Sec groups</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getFloatingip_pool <em>Floatingip pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getActive_timeout <em>Active timeout</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getDomain_id <em>Domain id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getDomain_name <em>Domain name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#isInsecure <em>Insecure</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getKeypair_name <em>Keypair name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getPrivate_key_file <em>Private key file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getSsh_port <em>Ssh port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getSsh_user <em>Ssh user</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_OpenStackImpl extends MachineImpl implements Machine_OpenStack {
	/**
	 * The default value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected String flavor_id = FLAVOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavor_name() <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavor_name() <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_name()
	 * @generated
	 * @ordered
	 */
	protected String flavor_name = FLAVOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected String image_id = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected String image_name = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuth_url() <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_url()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuth_url() <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_url()
	 * @generated
	 * @ordered
	 */
	protected String auth_url = AUTH_URL_EDEFAULT;

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
	 * The default value of the '{@link #getTenant_name() <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant_name() <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_name()
	 * @generated
	 * @ordered
	 */
	protected String tenant_name = TENANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected String tenant_id = TENANT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEndpoint_type() <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint_type()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_TYPE_EDEFAULT = "publicURL";

	/**
	 * The cached value of the '{@link #getEndpoint_type() <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint_type()
	 * @generated
	 * @ordered
	 */
	protected String endpoint_type = ENDPOINT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNet_id() <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNet_id() <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_id()
	 * @generated
	 * @ordered
	 */
	protected String net_id = NET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNet_name() <em>Net name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_name()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNet_name() <em>Net name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_name()
	 * @generated
	 * @ordered
	 */
	protected String net_name = NET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSec_groups() <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec_groups()
	 * @generated
	 * @ordered
	 */
	protected static final String SEC_GROUPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSec_groups() <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec_groups()
	 * @generated
	 * @ordered
	 */
	protected String sec_groups = SEC_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatingip_pool() <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingip_pool()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATINGIP_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingip_pool() <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingip_pool()
	 * @generated
	 * @ordered
	 */
	protected String floatingip_pool = FLOATINGIP_POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_timeout() <em>Active timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_timeout()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_TIMEOUT_EDEFAULT = 200;

	/**
	 * The cached value of the '{@link #getActive_timeout() <em>Active timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_timeout()
	 * @generated
	 * @ordered
	 */
	protected int active_timeout = ACTIVE_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected String availability_zone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain_id() <em>Domain id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_id()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain_id() <em>Domain id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_id()
	 * @generated
	 * @ordered
	 */
	protected String domain_id = DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain_name() <em>Domain name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain_name() <em>Domain name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_name()
	 * @generated
	 * @ordered
	 */
	protected String domain_name = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSECURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected boolean insecure = INSECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected static final int IP_VERSION_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getIp_version() <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_version()
	 * @generated
	 * @ordered
	 */
	protected int ip_version = IP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypair_name() <em>Keypair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair_name()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPAIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypair_name() <em>Keypair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypair_name()
	 * @generated
	 * @ordered
	 */
	protected String keypair_name = KEYPAIR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivate_key_file() <em>Private key file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_key_file()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivate_key_file() <em>Private key file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_key_file()
	 * @generated
	 * @ordered
	 */
	protected String private_key_file = PRIVATE_KEY_FILE_EDEFAULT;

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
	 * The default value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "root";

	/**
	 * The cached value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected String ssh_user = SSH_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_OpenStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_OPEN_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor_id() {
		return flavor_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor_id(String newFlavor_id) {
		String oldFlavor_id = flavor_id;
		flavor_id = newFlavor_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID, oldFlavor_id, flavor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor_name() {
		return flavor_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor_name(String newFlavor_name) {
		String oldFlavor_name = flavor_name;
		flavor_name = newFlavor_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__FLAVOR_NAME, oldFlavor_name, flavor_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_id() {
		return image_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_id(String newImage_id) {
		String oldImage_id = image_id;
		image_id = newImage_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID, oldImage_id, image_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_name() {
		return image_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_name(String newImage_name) {
		String oldImage_name = image_name;
		image_name = newImage_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__IMAGE_NAME, oldImage_name, image_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuth_url() {
		return auth_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuth_url(String newAuth_url) {
		String oldAuth_url = auth_url;
		auth_url = newAuth_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__AUTH_URL, oldAuth_url, auth_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_name() {
		return tenant_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_name(String newTenant_name) {
		String oldTenant_name = tenant_name;
		tenant_name = newTenant_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME, oldTenant_name, tenant_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_id() {
		return tenant_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_id(String newTenant_id) {
		String oldTenant_id = tenant_id;
		tenant_id = newTenant_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__TENANT_ID, oldTenant_id, tenant_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint_type() {
		return endpoint_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint_type(String newEndpoint_type) {
		String oldEndpoint_type = endpoint_type;
		endpoint_type = newEndpoint_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE, oldEndpoint_type, endpoint_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNet_id() {
		return net_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet_id(String newNet_id) {
		String oldNet_id = net_id;
		net_id = newNet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__NET_ID, oldNet_id, net_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNet_name() {
		return net_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet_name(String newNet_name) {
		String oldNet_name = net_name;
		net_name = newNet_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__NET_NAME, oldNet_name, net_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSec_groups() {
		return sec_groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec_groups(String newSec_groups) {
		String oldSec_groups = sec_groups;
		sec_groups = newSec_groups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS, oldSec_groups, sec_groups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingip_pool() {
		return floatingip_pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingip_pool(String newFloatingip_pool) {
		String oldFloatingip_pool = floatingip_pool;
		floatingip_pool = newFloatingip_pool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL, oldFloatingip_pool, floatingip_pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActive_timeout() {
		return active_timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_timeout(int newActive_timeout) {
		int oldActive_timeout = active_timeout;
		active_timeout = newActive_timeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__ACTIVE_TIMEOUT, oldActive_timeout, active_timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability_zone() {
		return availability_zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability_zone(String newAvailability_zone) {
		String oldAvailability_zone = availability_zone;
		availability_zone = newAvailability_zone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__AVAILABILITY_ZONE, oldAvailability_zone, availability_zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain_id() {
		return domain_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain_id(String newDomain_id) {
		String oldDomain_id = domain_id;
		domain_id = newDomain_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__DOMAIN_ID, oldDomain_id, domain_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain_name() {
		return domain_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain_name(String newDomain_name) {
		String oldDomain_name = domain_name;
		domain_name = newDomain_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__DOMAIN_NAME, oldDomain_name, domain_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsecure() {
		return insecure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsecure(boolean newInsecure) {
		boolean oldInsecure = insecure;
		insecure = newInsecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__INSECURE, oldInsecure, insecure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIp_version() {
		return ip_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_version(int newIp_version) {
		int oldIp_version = ip_version;
		ip_version = newIp_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__IP_VERSION, oldIp_version, ip_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeypair_name() {
		return keypair_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeypair_name(String newKeypair_name) {
		String oldKeypair_name = keypair_name;
		keypair_name = newKeypair_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__KEYPAIR_NAME, oldKeypair_name, keypair_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivate_key_file() {
		return private_key_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate_key_file(String newPrivate_key_file) {
		String oldPrivate_key_file = private_key_file;
		private_key_file = newPrivate_key_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__PRIVATE_KEY_FILE, oldPrivate_key_file, private_key_file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__SSH_PORT, oldSsh_port, ssh_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_user() {
		return ssh_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_user(String newSsh_user) {
		String oldSsh_user = ssh_user;
		ssh_user = newSsh_user;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__SSH_USER, oldSsh_user, ssh_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return getFlavor_id();
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				return getFlavor_name();
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return getImage_id();
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				return getImage_name();
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				return getAuth_url();
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				return getTenant_name();
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				return getTenant_id();
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				return getRegion();
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				return getEndpoint_type();
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				return getNet_id();
			case DockerPackage.MACHINE_OPEN_STACK__NET_NAME:
				return getNet_name();
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				return getSec_groups();
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				return getFloatingip_pool();
			case DockerPackage.MACHINE_OPEN_STACK__ACTIVE_TIMEOUT:
				return getActive_timeout();
			case DockerPackage.MACHINE_OPEN_STACK__AVAILABILITY_ZONE:
				return getAvailability_zone();
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_ID:
				return getDomain_id();
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_NAME:
				return getDomain_name();
			case DockerPackage.MACHINE_OPEN_STACK__INSECURE:
				return isInsecure();
			case DockerPackage.MACHINE_OPEN_STACK__IP_VERSION:
				return getIp_version();
			case DockerPackage.MACHINE_OPEN_STACK__KEYPAIR_NAME:
				return getKeypair_name();
			case DockerPackage.MACHINE_OPEN_STACK__PRIVATE_KEY_FILE:
				return getPrivate_key_file();
			case DockerPackage.MACHINE_OPEN_STACK__SSH_PORT:
				return getSsh_port();
			case DockerPackage.MACHINE_OPEN_STACK__SSH_USER:
				return getSsh_user();
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				setFlavor_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				setImage_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				setAuth_url((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				setTenant_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				setEndpoint_type((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				setNet_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_NAME:
				setNet_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				setSec_groups((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				setFloatingip_pool((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ACTIVE_TIMEOUT:
				setActive_timeout((Integer)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AVAILABILITY_ZONE:
				setAvailability_zone((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_ID:
				setDomain_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_NAME:
				setDomain_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__INSECURE:
				setInsecure((Boolean)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IP_VERSION:
				setIp_version((Integer)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__KEYPAIR_NAME:
				setKeypair_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PRIVATE_KEY_FILE:
				setPrivate_key_file((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SSH_PORT:
				setSsh_port((Integer)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SSH_USER:
				setSsh_user((String)newValue);
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id(FLAVOR_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				setFlavor_name(FLAVOR_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				setImage_name(IMAGE_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				setAuth_url(AUTH_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				setTenant_name(TENANT_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				setEndpoint_type(ENDPOINT_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				setNet_id(NET_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_NAME:
				setNet_name(NET_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				setSec_groups(SEC_GROUPS_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				setFloatingip_pool(FLOATINGIP_POOL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ACTIVE_TIMEOUT:
				setActive_timeout(ACTIVE_TIMEOUT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AVAILABILITY_ZONE:
				setAvailability_zone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_ID:
				setDomain_id(DOMAIN_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_NAME:
				setDomain_name(DOMAIN_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__INSECURE:
				setInsecure(INSECURE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IP_VERSION:
				setIp_version(IP_VERSION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__KEYPAIR_NAME:
				setKeypair_name(KEYPAIR_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PRIVATE_KEY_FILE:
				setPrivate_key_file(PRIVATE_KEY_FILE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SSH_PORT:
				setSsh_port(SSH_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SSH_USER:
				setSsh_user(SSH_USER_EDEFAULT);
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavor_id != null : !FLAVOR_ID_EDEFAULT.equals(flavor_id);
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
				return FLAVOR_NAME_EDEFAULT == null ? flavor_name != null : !FLAVOR_NAME_EDEFAULT.equals(flavor_name);
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? image_id != null : !IMAGE_ID_EDEFAULT.equals(image_id);
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? image_name != null : !IMAGE_NAME_EDEFAULT.equals(image_name);
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				return AUTH_URL_EDEFAULT == null ? auth_url != null : !AUTH_URL_EDEFAULT.equals(auth_url);
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				return TENANT_NAME_EDEFAULT == null ? tenant_name != null : !TENANT_NAME_EDEFAULT.equals(tenant_name);
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				return ENDPOINT_TYPE_EDEFAULT == null ? endpoint_type != null : !ENDPOINT_TYPE_EDEFAULT.equals(endpoint_type);
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				return NET_ID_EDEFAULT == null ? net_id != null : !NET_ID_EDEFAULT.equals(net_id);
			case DockerPackage.MACHINE_OPEN_STACK__NET_NAME:
				return NET_NAME_EDEFAULT == null ? net_name != null : !NET_NAME_EDEFAULT.equals(net_name);
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				return SEC_GROUPS_EDEFAULT == null ? sec_groups != null : !SEC_GROUPS_EDEFAULT.equals(sec_groups);
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				return FLOATINGIP_POOL_EDEFAULT == null ? floatingip_pool != null : !FLOATINGIP_POOL_EDEFAULT.equals(floatingip_pool);
			case DockerPackage.MACHINE_OPEN_STACK__ACTIVE_TIMEOUT:
				return active_timeout != ACTIVE_TIMEOUT_EDEFAULT;
			case DockerPackage.MACHINE_OPEN_STACK__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availability_zone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availability_zone);
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_ID:
				return DOMAIN_ID_EDEFAULT == null ? domain_id != null : !DOMAIN_ID_EDEFAULT.equals(domain_id);
			case DockerPackage.MACHINE_OPEN_STACK__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domain_name != null : !DOMAIN_NAME_EDEFAULT.equals(domain_name);
			case DockerPackage.MACHINE_OPEN_STACK__INSECURE:
				return insecure != INSECURE_EDEFAULT;
			case DockerPackage.MACHINE_OPEN_STACK__IP_VERSION:
				return ip_version != IP_VERSION_EDEFAULT;
			case DockerPackage.MACHINE_OPEN_STACK__KEYPAIR_NAME:
				return KEYPAIR_NAME_EDEFAULT == null ? keypair_name != null : !KEYPAIR_NAME_EDEFAULT.equals(keypair_name);
			case DockerPackage.MACHINE_OPEN_STACK__PRIVATE_KEY_FILE:
				return PRIVATE_KEY_FILE_EDEFAULT == null ? private_key_file != null : !PRIVATE_KEY_FILE_EDEFAULT.equals(private_key_file);
			case DockerPackage.MACHINE_OPEN_STACK__SSH_PORT:
				return ssh_port != SSH_PORT_EDEFAULT;
			case DockerPackage.MACHINE_OPEN_STACK__SSH_USER:
				return SSH_USER_EDEFAULT == null ? ssh_user != null : !SSH_USER_EDEFAULT.equals(ssh_user);
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
		result.append(" (flavor_id: ");
		result.append(flavor_id);
		result.append(", flavor_name: ");
		result.append(flavor_name);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", image_name: ");
		result.append(image_name);
		result.append(", auth_url: ");
		result.append(auth_url);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", tenant_name: ");
		result.append(tenant_name);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", region: ");
		result.append(region);
		result.append(", endpoint_type: ");
		result.append(endpoint_type);
		result.append(", net_id: ");
		result.append(net_id);
		result.append(", net_name: ");
		result.append(net_name);
		result.append(", sec_groups: ");
		result.append(sec_groups);
		result.append(", floatingip_pool: ");
		result.append(floatingip_pool);
		result.append(", active_timeout: ");
		result.append(active_timeout);
		result.append(", availability_zone: ");
		result.append(availability_zone);
		result.append(", domain_id: ");
		result.append(domain_id);
		result.append(", domain_name: ");
		result.append(domain_name);
		result.append(", insecure: ");
		result.append(insecure);
		result.append(", ip_version: ");
		result.append(ip_version);
		result.append(", keypair_name: ");
		result.append(keypair_name);
		result.append(", private_key_file: ");
		result.append(private_key_file);
		result.append(", ssh_port: ");
		result.append(ssh_port);
		result.append(", ssh_user: ");
		result.append(ssh_user);
		result.append(')');
		return result.toString();
	}

} //Machine_OpenStackImpl
