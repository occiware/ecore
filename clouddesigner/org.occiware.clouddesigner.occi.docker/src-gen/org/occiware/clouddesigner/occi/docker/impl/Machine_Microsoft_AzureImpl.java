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
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getResource_group <em>Resource group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getVnet <em>Vnet</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getSubnet_prefix <em>Subnet prefix</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getAvailability_set <em>Availability set</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getOpen_port <em>Open port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getPrivate_ip_address <em>Private ip address</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getNo_public_ip <em>No public ip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getStatic_public_ip <em>Static public ip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getDocker_port <em>Docker port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getUse_private_ip <em>Use private ip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl#getImage <em>Image</em>}</li>
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
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = "AzurePublicCloud";

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource_group() <em>Resource group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_group()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_GROUP_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getResource_group() <em>Resource group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_group()
	 * @generated
	 * @ordered
	 */
	protected String resource_group = RESOURCE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = null;

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
	 * The default value of the '{@link #getVnet() <em>Vnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnet()
	 * @generated
	 * @ordered
	 */
	protected static final String VNET_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getVnet() <em>Vnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnet()
	 * @generated
	 * @ordered
	 */
	protected String vnet = VNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected String subnet = SUBNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet_prefix() <em>Subnet prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_prefix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_PREFIX_EDEFAULT = "192.168.0.0/16";

	/**
	 * The cached value of the '{@link #getSubnet_prefix() <em>Subnet prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_prefix()
	 * @generated
	 * @ordered
	 */
	protected String subnet_prefix = SUBNET_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability_set() <em>Availability set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_set()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_SET_EDEFAULT = "docker-machine";

	/**
	 * The cached value of the '{@link #getAvailability_set() <em>Availability set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_set()
	 * @generated
	 * @ordered
	 */
	protected String availability_set = AVAILABILITY_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen_port() <em>Open port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_port()
	 * @generated
	 * @ordered
	 */
	protected static final int OPEN_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpen_port() <em>Open port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_port()
	 * @generated
	 * @ordered
	 */
	protected int open_port = OPEN_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivate_ip_address() <em>Private ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_ip_address()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivate_ip_address() <em>Private ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_ip_address()
	 * @generated
	 * @ordered
	 */
	protected String private_ip_address = PRIVATE_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNo_public_ip() <em>No public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_public_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String NO_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNo_public_ip() <em>No public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_public_ip()
	 * @generated
	 * @ordered
	 */
	protected String no_public_ip = NO_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic_public_ip() <em>Static public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic_public_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatic_public_ip() <em>Static public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic_public_ip()
	 * @generated
	 * @ordered
	 */
	protected String static_public_ip = STATIC_PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocker_port() <em>Docker port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_port()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_PORT_EDEFAULT = "2376";

	/**
	 * The cached value of the '{@link #getDocker_port() <em>Docker port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker_port()
	 * @generated
	 * @ordered
	 */
	protected String docker_port = DOCKER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUse_private_ip() <em>Use private ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse_private_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse_private_ip() <em>Use private ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse_private_ip()
	 * @generated
	 * @ordered
	 */
	protected String use_private_ip = USE_PRIVATE_IP_EDEFAULT;

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
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource_group() {
		return resource_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_group(String newResource_group) {
		String oldResource_group = resource_group;
		resource_group = newResource_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP, oldResource_group, resource_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER, oldSsh_user, ssh_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnet() {
		return vnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnet(String newVnet) {
		String oldVnet = vnet;
		vnet = newVnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__VNET, oldVnet, vnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet(String newSubnet) {
		String oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET, oldSubnet, subnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet_prefix() {
		return subnet_prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet_prefix(String newSubnet_prefix) {
		String oldSubnet_prefix = subnet_prefix;
		subnet_prefix = newSubnet_prefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX, oldSubnet_prefix, subnet_prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability_set() {
		return availability_set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability_set(String newAvailability_set) {
		String oldAvailability_set = availability_set;
		availability_set = newAvailability_set;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET, oldAvailability_set, availability_set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpen_port() {
		return open_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen_port(int newOpen_port) {
		int oldOpen_port = open_port;
		open_port = newOpen_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT, oldOpen_port, open_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivate_ip_address() {
		return private_ip_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate_ip_address(String newPrivate_ip_address) {
		String oldPrivate_ip_address = private_ip_address;
		private_ip_address = newPrivate_ip_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS, oldPrivate_ip_address, private_ip_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNo_public_ip() {
		return no_public_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_public_ip(String newNo_public_ip) {
		String oldNo_public_ip = no_public_ip;
		no_public_ip = newNo_public_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP, oldNo_public_ip, no_public_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatic_public_ip() {
		return static_public_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic_public_ip(String newStatic_public_ip) {
		String oldStatic_public_ip = static_public_ip;
		static_public_ip = newStatic_public_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP, oldStatic_public_ip, static_public_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocker_port() {
		return docker_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocker_port(String newDocker_port) {
		String oldDocker_port = docker_port;
		docker_port = newDocker_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT, oldDocker_port, docker_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUse_private_ip() {
		return use_private_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse_private_ip(String newUse_private_ip) {
		String oldUse_private_ip = use_private_ip;
		use_private_ip = newUse_private_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP, oldUse_private_ip, use_private_ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE, oldImage, image));
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT:
				return getEnvironment();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION:
				return getLocation();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP:
				return getResource_group();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE:
				return getSize();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER:
				return getSsh_user();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__VNET:
				return getVnet();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET:
				return getSubnet();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX:
				return getSubnet_prefix();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET:
				return getAvailability_set();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT:
				return getOpen_port();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS:
				return getPrivate_ip_address();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP:
				return getNo_public_ip();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP:
				return getStatic_public_ip();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT:
				return getDocker_port();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP:
				return getUse_private_ip();
			case DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE:
				return getImage();
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION:
				setLocation((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP:
				setResource_group((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE:
				setSize((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER:
				setSsh_user((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__VNET:
				setVnet((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET:
				setSubnet((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX:
				setSubnet_prefix((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET:
				setAvailability_set((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT:
				setOpen_port((Integer)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS:
				setPrivate_ip_address((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP:
				setNo_public_ip((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP:
				setStatic_public_ip((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT:
				setDocker_port((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP:
				setUse_private_ip((String)newValue);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE:
				setImage((String)newValue);
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP:
				setResource_group(RESOURCE_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER:
				setSsh_user(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__VNET:
				setVnet(VNET_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX:
				setSubnet_prefix(SUBNET_PREFIX_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET:
				setAvailability_set(AVAILABILITY_SET_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT:
				setOpen_port(OPEN_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS:
				setPrivate_ip_address(PRIVATE_IP_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP:
				setNo_public_ip(NO_PUBLIC_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP:
				setStatic_public_ip(STATIC_PUBLIC_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT:
				setDocker_port(DOCKER_PORT_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP:
				setUse_private_ip(USE_PRIVATE_IP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE:
				setImage(IMAGE_EDEFAULT);
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
			case DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP:
				return RESOURCE_GROUP_EDEFAULT == null ? resource_group != null : !RESOURCE_GROUP_EDEFAULT.equals(resource_group);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? ssh_user != null : !SSH_USER_EDEFAULT.equals(ssh_user);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__VNET:
				return VNET_EDEFAULT == null ? vnet != null : !VNET_EDEFAULT.equals(vnet);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX:
				return SUBNET_PREFIX_EDEFAULT == null ? subnet_prefix != null : !SUBNET_PREFIX_EDEFAULT.equals(subnet_prefix);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET:
				return AVAILABILITY_SET_EDEFAULT == null ? availability_set != null : !AVAILABILITY_SET_EDEFAULT.equals(availability_set);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT:
				return open_port != OPEN_PORT_EDEFAULT;
			case DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS:
				return PRIVATE_IP_ADDRESS_EDEFAULT == null ? private_ip_address != null : !PRIVATE_IP_ADDRESS_EDEFAULT.equals(private_ip_address);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP:
				return NO_PUBLIC_IP_EDEFAULT == null ? no_public_ip != null : !NO_PUBLIC_IP_EDEFAULT.equals(no_public_ip);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP:
				return STATIC_PUBLIC_IP_EDEFAULT == null ? static_public_ip != null : !STATIC_PUBLIC_IP_EDEFAULT.equals(static_public_ip);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT:
				return DOCKER_PORT_EDEFAULT == null ? docker_port != null : !DOCKER_PORT_EDEFAULT.equals(docker_port);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP:
				return USE_PRIVATE_IP_EDEFAULT == null ? use_private_ip != null : !USE_PRIVATE_IP_EDEFAULT.equals(use_private_ip);
			case DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
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
		result.append(", environment: ");
		result.append(environment);
		result.append(", location: ");
		result.append(location);
		result.append(", resource_group: ");
		result.append(resource_group);
		result.append(", size: ");
		result.append(size);
		result.append(", ssh_user: ");
		result.append(ssh_user);
		result.append(", vnet: ");
		result.append(vnet);
		result.append(", subnet: ");
		result.append(subnet);
		result.append(", subnet_prefix: ");
		result.append(subnet_prefix);
		result.append(", availability_set: ");
		result.append(availability_set);
		result.append(", open_port: ");
		result.append(open_port);
		result.append(", private_ip_address: ");
		result.append(private_ip_address);
		result.append(", no_public_ip: ");
		result.append(no_public_ip);
		result.append(", static_public_ip: ");
		result.append(static_public_ip);
		result.append(", docker_port: ");
		result.append(docker_port);
		result.append(", use_private_ip: ");
		result.append(use_private_ip);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //Machine_Microsoft_AzureImpl
