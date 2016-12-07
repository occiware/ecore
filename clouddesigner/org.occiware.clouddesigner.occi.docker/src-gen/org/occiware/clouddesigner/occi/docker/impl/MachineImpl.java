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
import org.occiware.clouddesigner.occi.docker.Machine;

import org.occiware.clouddesigner.occi.docker.Mode;
import org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_install_url <em>Engine install url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_opt <em>Engine opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_insecure_registry <em>Engine insecure registry</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_registry_mirror <em>Engine registry mirror</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_label <em>Engine label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_storage_driver <em>Engine storage driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getEngine_env <em>Engine env</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#isSwarm <em>Swarm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_image <em>Swarm image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#isSwarm_master <em>Swarm master</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_discovery <em>Swarm discovery</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_strategy <em>Swarm strategy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_opt <em>Swarm opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_host <em>Swarm host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_addr <em>Swarm addr</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getSwarm_experimental <em>Swarm experimental</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.MachineImpl#getTls_san <em>Tls san</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends ComputeImpl implements Machine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_install_url() <em>Engine install url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_install_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_INSTALL_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_install_url() <em>Engine install url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_install_url()
	 * @generated
	 * @ordered
	 */
	protected String engine_install_url = ENGINE_INSTALL_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_opt() <em>Engine opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_opt()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_opt() <em>Engine opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_opt()
	 * @generated
	 * @ordered
	 */
	protected String engine_opt = ENGINE_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_insecure_registry() <em>Engine insecure registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_insecure_registry()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_INSECURE_REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_insecure_registry() <em>Engine insecure registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_insecure_registry()
	 * @generated
	 * @ordered
	 */
	protected String engine_insecure_registry = ENGINE_INSECURE_REGISTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_registry_mirror() <em>Engine registry mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_registry_mirror()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_REGISTRY_MIRROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_registry_mirror() <em>Engine registry mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_registry_mirror()
	 * @generated
	 * @ordered
	 */
	protected String engine_registry_mirror = ENGINE_REGISTRY_MIRROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_label() <em>Engine label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_label()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_label() <em>Engine label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_label()
	 * @generated
	 * @ordered
	 */
	protected String engine_label = ENGINE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_storage_driver() <em>Engine storage driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_storage_driver()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_STORAGE_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_storage_driver() <em>Engine storage driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_storage_driver()
	 * @generated
	 * @ordered
	 */
	protected String engine_storage_driver = ENGINE_STORAGE_DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine_env() <em>Engine env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_env()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_ENV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine_env() <em>Engine env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine_env()
	 * @generated
	 * @ordered
	 */
	protected String engine_env = ENGINE_ENV_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwarm() <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWARM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwarm() <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm()
	 * @generated
	 * @ordered
	 */
	protected boolean swarm = SWARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_image() <em>Swarm image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_image()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_image() <em>Swarm image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_image()
	 * @generated
	 * @ordered
	 */
	protected String swarm_image = SWARM_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwarm_master() <em>Swarm master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm_master()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWARM_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwarm_master() <em>Swarm master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwarm_master()
	 * @generated
	 * @ordered
	 */
	protected boolean swarm_master = SWARM_MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_discovery() <em>Swarm discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_discovery()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_DISCOVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_discovery() <em>Swarm discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_discovery()
	 * @generated
	 * @ordered
	 */
	protected String swarm_discovery = SWARM_DISCOVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_strategy() <em>Swarm strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_strategy()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_strategy() <em>Swarm strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_strategy()
	 * @generated
	 * @ordered
	 */
	protected String swarm_strategy = SWARM_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_opt() <em>Swarm opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_opt()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_opt() <em>Swarm opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_opt()
	 * @generated
	 * @ordered
	 */
	protected String swarm_opt = SWARM_OPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_host() <em>Swarm host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_host()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_host() <em>Swarm host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_host()
	 * @generated
	 * @ordered
	 */
	protected String swarm_host = SWARM_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_addr() <em>Swarm addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_addr()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_addr() <em>Swarm addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_addr()
	 * @generated
	 * @ordered
	 */
	protected String swarm_addr = SWARM_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwarm_experimental() <em>Swarm experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_experimental()
	 * @generated
	 * @ordered
	 */
	protected static final String SWARM_EXPERIMENTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwarm_experimental() <em>Swarm experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm_experimental()
	 * @generated
	 * @ordered
	 */
	protected String swarm_experimental = SWARM_EXPERIMENTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTls_san() <em>Tls san</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTls_san()
	 * @generated
	 * @ordered
	 */
	protected static final String TLS_SAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTls_san() <em>Tls san</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTls_san()
	 * @generated
	 * @ordered
	 */
	protected String tls_san = TLS_SAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_install_url() {
		return engine_install_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_install_url(String newEngine_install_url) {
		String oldEngine_install_url = engine_install_url;
		engine_install_url = newEngine_install_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_INSTALL_URL, oldEngine_install_url, engine_install_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_opt() {
		return engine_opt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_opt(String newEngine_opt) {
		String oldEngine_opt = engine_opt;
		engine_opt = newEngine_opt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_OPT, oldEngine_opt, engine_opt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_insecure_registry() {
		return engine_insecure_registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_insecure_registry(String newEngine_insecure_registry) {
		String oldEngine_insecure_registry = engine_insecure_registry;
		engine_insecure_registry = newEngine_insecure_registry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY, oldEngine_insecure_registry, engine_insecure_registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_registry_mirror() {
		return engine_registry_mirror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_registry_mirror(String newEngine_registry_mirror) {
		String oldEngine_registry_mirror = engine_registry_mirror;
		engine_registry_mirror = newEngine_registry_mirror;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR, oldEngine_registry_mirror, engine_registry_mirror));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_label() {
		return engine_label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_label(String newEngine_label) {
		String oldEngine_label = engine_label;
		engine_label = newEngine_label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_LABEL, oldEngine_label, engine_label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_storage_driver() {
		return engine_storage_driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_storage_driver(String newEngine_storage_driver) {
		String oldEngine_storage_driver = engine_storage_driver;
		engine_storage_driver = newEngine_storage_driver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER, oldEngine_storage_driver, engine_storage_driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine_env() {
		return engine_env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine_env(String newEngine_env) {
		String oldEngine_env = engine_env;
		engine_env = newEngine_env;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__ENGINE_ENV, oldEngine_env, engine_env));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSwarm() {
		return swarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm(boolean newSwarm) {
		boolean oldSwarm = swarm;
		swarm = newSwarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM, oldSwarm, swarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_image() {
		return swarm_image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_image(String newSwarm_image) {
		String oldSwarm_image = swarm_image;
		swarm_image = newSwarm_image;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_IMAGE, oldSwarm_image, swarm_image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSwarm_master() {
		return swarm_master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_master(boolean newSwarm_master) {
		boolean oldSwarm_master = swarm_master;
		swarm_master = newSwarm_master;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_MASTER, oldSwarm_master, swarm_master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_discovery() {
		return swarm_discovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_discovery(String newSwarm_discovery) {
		String oldSwarm_discovery = swarm_discovery;
		swarm_discovery = newSwarm_discovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_DISCOVERY, oldSwarm_discovery, swarm_discovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_strategy() {
		return swarm_strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_strategy(String newSwarm_strategy) {
		String oldSwarm_strategy = swarm_strategy;
		swarm_strategy = newSwarm_strategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_STRATEGY, oldSwarm_strategy, swarm_strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_opt() {
		return swarm_opt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_opt(String newSwarm_opt) {
		String oldSwarm_opt = swarm_opt;
		swarm_opt = newSwarm_opt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_OPT, oldSwarm_opt, swarm_opt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_host() {
		return swarm_host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_host(String newSwarm_host) {
		String oldSwarm_host = swarm_host;
		swarm_host = newSwarm_host;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_HOST, oldSwarm_host, swarm_host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_addr() {
		return swarm_addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_addr(String newSwarm_addr) {
		String oldSwarm_addr = swarm_addr;
		swarm_addr = newSwarm_addr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_ADDR, oldSwarm_addr, swarm_addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwarm_experimental() {
		return swarm_experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm_experimental(String newSwarm_experimental) {
		String oldSwarm_experimental = swarm_experimental;
		swarm_experimental = newSwarm_experimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__SWARM_EXPERIMENTAL, oldSwarm_experimental, swarm_experimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTls_san() {
		return tls_san;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTls_san(String newTls_san) {
		String oldTls_san = tls_san;
		tls_san = newTls_san;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE__TLS_SAN, oldTls_san, tls_san));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE__NAME:
				return getName();
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				return getEngine_install_url();
			case DockerPackage.MACHINE__ENGINE_OPT:
				return getEngine_opt();
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				return getEngine_insecure_registry();
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				return getEngine_registry_mirror();
			case DockerPackage.MACHINE__ENGINE_LABEL:
				return getEngine_label();
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				return getEngine_storage_driver();
			case DockerPackage.MACHINE__ENGINE_ENV:
				return getEngine_env();
			case DockerPackage.MACHINE__SWARM:
				return isSwarm();
			case DockerPackage.MACHINE__SWARM_IMAGE:
				return getSwarm_image();
			case DockerPackage.MACHINE__SWARM_MASTER:
				return isSwarm_master();
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				return getSwarm_discovery();
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				return getSwarm_strategy();
			case DockerPackage.MACHINE__SWARM_OPT:
				return getSwarm_opt();
			case DockerPackage.MACHINE__SWARM_HOST:
				return getSwarm_host();
			case DockerPackage.MACHINE__SWARM_ADDR:
				return getSwarm_addr();
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				return getSwarm_experimental();
			case DockerPackage.MACHINE__TLS_SAN:
				return getTls_san();
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
			case DockerPackage.MACHINE__NAME:
				setName((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				setEngine_install_url((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_OPT:
				setEngine_opt((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				setEngine_insecure_registry((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				setEngine_registry_mirror((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_LABEL:
				setEngine_label((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				setEngine_storage_driver((String)newValue);
				return;
			case DockerPackage.MACHINE__ENGINE_ENV:
				setEngine_env((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM:
				setSwarm((Boolean)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				setSwarm_image((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_MASTER:
				setSwarm_master((Boolean)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				setSwarm_discovery((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				setSwarm_strategy((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_OPT:
				setSwarm_opt((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_HOST:
				setSwarm_host((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_ADDR:
				setSwarm_addr((String)newValue);
				return;
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				setSwarm_experimental((String)newValue);
				return;
			case DockerPackage.MACHINE__TLS_SAN:
				setTls_san((String)newValue);
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
			case DockerPackage.MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				setEngine_install_url(ENGINE_INSTALL_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_OPT:
				setEngine_opt(ENGINE_OPT_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				setEngine_insecure_registry(ENGINE_INSECURE_REGISTRY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				setEngine_registry_mirror(ENGINE_REGISTRY_MIRROR_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_LABEL:
				setEngine_label(ENGINE_LABEL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				setEngine_storage_driver(ENGINE_STORAGE_DRIVER_EDEFAULT);
				return;
			case DockerPackage.MACHINE__ENGINE_ENV:
				setEngine_env(ENGINE_ENV_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM:
				setSwarm(SWARM_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				setSwarm_image(SWARM_IMAGE_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_MASTER:
				setSwarm_master(SWARM_MASTER_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				setSwarm_discovery(SWARM_DISCOVERY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				setSwarm_strategy(SWARM_STRATEGY_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_OPT:
				setSwarm_opt(SWARM_OPT_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_HOST:
				setSwarm_host(SWARM_HOST_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_ADDR:
				setSwarm_addr(SWARM_ADDR_EDEFAULT);
				return;
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				setSwarm_experimental(SWARM_EXPERIMENTAL_EDEFAULT);
				return;
			case DockerPackage.MACHINE__TLS_SAN:
				setTls_san(TLS_SAN_EDEFAULT);
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
			case DockerPackage.MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
				return ENGINE_INSTALL_URL_EDEFAULT == null ? engine_install_url != null : !ENGINE_INSTALL_URL_EDEFAULT.equals(engine_install_url);
			case DockerPackage.MACHINE__ENGINE_OPT:
				return ENGINE_OPT_EDEFAULT == null ? engine_opt != null : !ENGINE_OPT_EDEFAULT.equals(engine_opt);
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
				return ENGINE_INSECURE_REGISTRY_EDEFAULT == null ? engine_insecure_registry != null : !ENGINE_INSECURE_REGISTRY_EDEFAULT.equals(engine_insecure_registry);
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
				return ENGINE_REGISTRY_MIRROR_EDEFAULT == null ? engine_registry_mirror != null : !ENGINE_REGISTRY_MIRROR_EDEFAULT.equals(engine_registry_mirror);
			case DockerPackage.MACHINE__ENGINE_LABEL:
				return ENGINE_LABEL_EDEFAULT == null ? engine_label != null : !ENGINE_LABEL_EDEFAULT.equals(engine_label);
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
				return ENGINE_STORAGE_DRIVER_EDEFAULT == null ? engine_storage_driver != null : !ENGINE_STORAGE_DRIVER_EDEFAULT.equals(engine_storage_driver);
			case DockerPackage.MACHINE__ENGINE_ENV:
				return ENGINE_ENV_EDEFAULT == null ? engine_env != null : !ENGINE_ENV_EDEFAULT.equals(engine_env);
			case DockerPackage.MACHINE__SWARM:
				return swarm != SWARM_EDEFAULT;
			case DockerPackage.MACHINE__SWARM_IMAGE:
				return SWARM_IMAGE_EDEFAULT == null ? swarm_image != null : !SWARM_IMAGE_EDEFAULT.equals(swarm_image);
			case DockerPackage.MACHINE__SWARM_MASTER:
				return swarm_master != SWARM_MASTER_EDEFAULT;
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
				return SWARM_DISCOVERY_EDEFAULT == null ? swarm_discovery != null : !SWARM_DISCOVERY_EDEFAULT.equals(swarm_discovery);
			case DockerPackage.MACHINE__SWARM_STRATEGY:
				return SWARM_STRATEGY_EDEFAULT == null ? swarm_strategy != null : !SWARM_STRATEGY_EDEFAULT.equals(swarm_strategy);
			case DockerPackage.MACHINE__SWARM_OPT:
				return SWARM_OPT_EDEFAULT == null ? swarm_opt != null : !SWARM_OPT_EDEFAULT.equals(swarm_opt);
			case DockerPackage.MACHINE__SWARM_HOST:
				return SWARM_HOST_EDEFAULT == null ? swarm_host != null : !SWARM_HOST_EDEFAULT.equals(swarm_host);
			case DockerPackage.MACHINE__SWARM_ADDR:
				return SWARM_ADDR_EDEFAULT == null ? swarm_addr != null : !SWARM_ADDR_EDEFAULT.equals(swarm_addr);
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
				return SWARM_EXPERIMENTAL_EDEFAULT == null ? swarm_experimental != null : !SWARM_EXPERIMENTAL_EDEFAULT.equals(swarm_experimental);
			case DockerPackage.MACHINE__TLS_SAN:
				return TLS_SAN_EDEFAULT == null ? tls_san != null : !TLS_SAN_EDEFAULT.equals(tls_san);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", engine_install_url: ");
		result.append(engine_install_url);
		result.append(", engine_opt: ");
		result.append(engine_opt);
		result.append(", engine_insecure_registry: ");
		result.append(engine_insecure_registry);
		result.append(", engine_registry_mirror: ");
		result.append(engine_registry_mirror);
		result.append(", engine_label: ");
		result.append(engine_label);
		result.append(", engine_storage_driver: ");
		result.append(engine_storage_driver);
		result.append(", engine_env: ");
		result.append(engine_env);
		result.append(", swarm: ");
		result.append(swarm);
		result.append(", swarm_image: ");
		result.append(swarm_image);
		result.append(", swarm_master: ");
		result.append(swarm_master);
		result.append(", swarm_discovery: ");
		result.append(swarm_discovery);
		result.append(", swarm_strategy: ");
		result.append(swarm_strategy);
		result.append(", swarm_opt: ");
		result.append(swarm_opt);
		result.append(", swarm_host: ");
		result.append(swarm_host);
		result.append(", swarm_addr: ");
		result.append(swarm_addr);
		result.append(", swarm_experimental: ");
		result.append(swarm_experimental);
		result.append(", tls_san: ");
		result.append(tls_san);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
