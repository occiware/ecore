/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.vmware.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.infrastructure.impl.ComputeImpl;

import org.occiware.clouddesigner.occi.vmware.HostConnectionState;
import org.occiware.clouddesigner.occi.vmware.Hostsystem;
import org.occiware.clouddesigner.occi.vmware.OverallStatus;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hostsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isClusterSupported <em>Cluster Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isInDasCluster <em>In Das Cluster</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getServerip <em>Serverip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isVimAccountNameRequired <em>Vim Account Name Required</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getAgentVmDatastoreName <em>Agent Vm Datastore Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getAgentVmNetworkName <em>Agent Vm Network Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isFaultToleranceEnabled <em>Fault Tolerance Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getHostFeatureVersionKeys <em>Host Feature Version Keys</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getHostFeatureVersionValues <em>Host Feature Version Values</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isVmotionEnabled <em>Vmotion Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getCurrentEVCModeKey <em>Current EVC Mode Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getCustomValues <em>Custom Values</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getManagementServerip <em>Management Serverip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getMaxEVCKey <em>Max EVC Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getOverallStatus <em>Overall Status</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getDistributedCPUFairness <em>Distributed CPU Fairness</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getDistributedMemoryFairness <em>Distributed Memory Fairness</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getOverallCPUUsage <em>Overall CPU Usage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getOverallMemoryUsage <em>Overall Memory Usage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isRebootRequired <em>Reboot Required</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getBootTime <em>Boot Time</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#getConnectionState <em>Connection State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.impl.HostsystemImpl#isInMaintenanceMode <em>In Maintenance Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostsystemImpl extends ComputeImpl implements Hostsystem {
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
	 * The default value of the '{@link #isClusterSupported() <em>Cluster Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClusterSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClusterSupported() <em>Cluster Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClusterSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean clusterSupported = CLUSTER_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInDasCluster() <em>In Das Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInDasCluster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_DAS_CLUSTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInDasCluster() <em>In Das Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInDasCluster()
	 * @generated
	 * @ordered
	 */
	protected boolean inDasCluster = IN_DAS_CLUSTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerip() <em>Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerip()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVERIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerip() <em>Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerip()
	 * @generated
	 * @ordered
	 */
	protected String serverip = SERVERIP_EDEFAULT;

	/**
	 * The default value of the '{@link #isVimAccountNameRequired() <em>Vim Account Name Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVimAccountNameRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIM_ACCOUNT_NAME_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVimAccountNameRequired() <em>Vim Account Name Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVimAccountNameRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean vimAccountNameRequired = VIM_ACCOUNT_NAME_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentVmDatastoreName() <em>Agent Vm Datastore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentVmDatastoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_VM_DATASTORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentVmDatastoreName() <em>Agent Vm Datastore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentVmDatastoreName()
	 * @generated
	 * @ordered
	 */
	protected String agentVmDatastoreName = AGENT_VM_DATASTORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentVmNetworkName() <em>Agent Vm Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentVmNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_VM_NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentVmNetworkName() <em>Agent Vm Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentVmNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String agentVmNetworkName = AGENT_VM_NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFaultToleranceEnabled() <em>Fault Tolerance Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFaultToleranceEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAULT_TOLERANCE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFaultToleranceEnabled() <em>Fault Tolerance Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFaultToleranceEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean faultToleranceEnabled = FAULT_TOLERANCE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostFeatureVersionKeys() <em>Host Feature Version Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFeatureVersionKeys()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_FEATURE_VERSION_KEYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostFeatureVersionKeys() <em>Host Feature Version Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFeatureVersionKeys()
	 * @generated
	 * @ordered
	 */
	protected String hostFeatureVersionKeys = HOST_FEATURE_VERSION_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostFeatureVersionValues() <em>Host Feature Version Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFeatureVersionValues()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_FEATURE_VERSION_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostFeatureVersionValues() <em>Host Feature Version Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFeatureVersionValues()
	 * @generated
	 * @ordered
	 */
	protected String hostFeatureVersionValues = HOST_FEATURE_VERSION_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #isVmotionEnabled() <em>Vmotion Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmotionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VMOTION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVmotionEnabled() <em>Vmotion Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmotionEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean vmotionEnabled = VMOTION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentEVCModeKey() <em>Current EVC Mode Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEVCModeKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_EVC_MODE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentEVCModeKey() <em>Current EVC Mode Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEVCModeKey()
	 * @generated
	 * @ordered
	 */
	protected String currentEVCModeKey = CURRENT_EVC_MODE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomValues() <em>Custom Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomValues()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOM_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomValues() <em>Custom Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomValues()
	 * @generated
	 * @ordered
	 */
	protected int customValues = CUSTOM_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagementServerip() <em>Management Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementServerip()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEMENT_SERVERIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagementServerip() <em>Management Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementServerip()
	 * @generated
	 * @ordered
	 */
	protected String managementServerip = MANAGEMENT_SERVERIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEVCKey() <em>Max EVC Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEVCKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EVC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxEVCKey() <em>Max EVC Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEVCKey()
	 * @generated
	 * @ordered
	 */
	protected String maxEVCKey = MAX_EVC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallStatus() <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OverallStatus OVERALL_STATUS_EDEFAULT = OverallStatus.GRAY;

	/**
	 * The cached value of the '{@link #getOverallStatus() <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallStatus()
	 * @generated
	 * @ordered
	 */
	protected OverallStatus overallStatus = OVERALL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistributedCPUFairness() <em>Distributed CPU Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributedCPUFairness()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTRIBUTED_CPU_FAIRNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistributedCPUFairness() <em>Distributed CPU Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributedCPUFairness()
	 * @generated
	 * @ordered
	 */
	protected int distributedCPUFairness = DISTRIBUTED_CPU_FAIRNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistributedMemoryFairness() <em>Distributed Memory Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributedMemoryFairness()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTRIBUTED_MEMORY_FAIRNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistributedMemoryFairness() <em>Distributed Memory Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributedMemoryFairness()
	 * @generated
	 * @ordered
	 */
	protected int distributedMemoryFairness = DISTRIBUTED_MEMORY_FAIRNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallCPUUsage() <em>Overall CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallCPUUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int OVERALL_CPU_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOverallCPUUsage() <em>Overall CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallCPUUsage()
	 * @generated
	 * @ordered
	 */
	protected int overallCPUUsage = OVERALL_CPU_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallMemoryUsage() <em>Overall Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int OVERALL_MEMORY_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOverallMemoryUsage() <em>Overall Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected int overallMemoryUsage = OVERALL_MEMORY_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRebootRequired() <em>Reboot Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRebootRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REBOOT_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRebootRequired() <em>Reboot Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRebootRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean rebootRequired = REBOOT_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBootTime() <em>Boot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BOOT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBootTime() <em>Boot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootTime()
	 * @generated
	 * @ordered
	 */
	protected Date bootTime = BOOT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionState()
	 * @generated
	 * @ordered
	 */
	protected static final HostConnectionState CONNECTION_STATE_EDEFAULT = HostConnectionState.CONNECTED;

	/**
	 * The cached value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionState()
	 * @generated
	 * @ordered
	 */
	protected HostConnectionState connectionState = CONNECTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInMaintenanceMode() <em>In Maintenance Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInMaintenanceMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_MAINTENANCE_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInMaintenanceMode() <em>In Maintenance Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInMaintenanceMode()
	 * @generated
	 * @ordered
	 */
	protected boolean inMaintenanceMode = IN_MAINTENANCE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.eINSTANCE.getHostsystem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClusterSupported() {
		return clusterSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterSupported(boolean newClusterSupported) {
		boolean oldClusterSupported = clusterSupported;
		clusterSupported = newClusterSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED, oldClusterSupported, clusterSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInDasCluster() {
		return inDasCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInDasCluster(boolean newInDasCluster) {
		boolean oldInDasCluster = inDasCluster;
		inDasCluster = newInDasCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER, oldInDasCluster, inDasCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerip() {
		return serverip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerip(String newServerip) {
		String oldServerip = serverip;
		serverip = newServerip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__SERVERIP, oldServerip, serverip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVimAccountNameRequired() {
		return vimAccountNameRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVimAccountNameRequired(boolean newVimAccountNameRequired) {
		boolean oldVimAccountNameRequired = vimAccountNameRequired;
		vimAccountNameRequired = newVimAccountNameRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED, oldVimAccountNameRequired, vimAccountNameRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentVmDatastoreName() {
		return agentVmDatastoreName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentVmDatastoreName(String newAgentVmDatastoreName) {
		String oldAgentVmDatastoreName = agentVmDatastoreName;
		agentVmDatastoreName = newAgentVmDatastoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME, oldAgentVmDatastoreName, agentVmDatastoreName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentVmNetworkName() {
		return agentVmNetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentVmNetworkName(String newAgentVmNetworkName) {
		String oldAgentVmNetworkName = agentVmNetworkName;
		agentVmNetworkName = newAgentVmNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME, oldAgentVmNetworkName, agentVmNetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFaultToleranceEnabled() {
		return faultToleranceEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultToleranceEnabled(boolean newFaultToleranceEnabled) {
		boolean oldFaultToleranceEnabled = faultToleranceEnabled;
		faultToleranceEnabled = newFaultToleranceEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED, oldFaultToleranceEnabled, faultToleranceEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostFeatureVersionKeys() {
		return hostFeatureVersionKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostFeatureVersionKeys(String newHostFeatureVersionKeys) {
		String oldHostFeatureVersionKeys = hostFeatureVersionKeys;
		hostFeatureVersionKeys = newHostFeatureVersionKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS, oldHostFeatureVersionKeys, hostFeatureVersionKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostFeatureVersionValues() {
		return hostFeatureVersionValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostFeatureVersionValues(String newHostFeatureVersionValues) {
		String oldHostFeatureVersionValues = hostFeatureVersionValues;
		hostFeatureVersionValues = newHostFeatureVersionValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES, oldHostFeatureVersionValues, hostFeatureVersionValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVmotionEnabled() {
		return vmotionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmotionEnabled(boolean newVmotionEnabled) {
		boolean oldVmotionEnabled = vmotionEnabled;
		vmotionEnabled = newVmotionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED, oldVmotionEnabled, vmotionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentEVCModeKey() {
		return currentEVCModeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentEVCModeKey(String newCurrentEVCModeKey) {
		String oldCurrentEVCModeKey = currentEVCModeKey;
		currentEVCModeKey = newCurrentEVCModeKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY, oldCurrentEVCModeKey, currentEVCModeKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomValues() {
		return customValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomValues(int newCustomValues) {
		int oldCustomValues = customValues;
		customValues = newCustomValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES, oldCustomValues, customValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagementServerip() {
		return managementServerip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementServerip(String newManagementServerip) {
		String oldManagementServerip = managementServerip;
		managementServerip = newManagementServerip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP, oldManagementServerip, managementServerip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxEVCKey() {
		return maxEVCKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEVCKey(String newMaxEVCKey) {
		String oldMaxEVCKey = maxEVCKey;
		maxEVCKey = newMaxEVCKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY, oldMaxEVCKey, maxEVCKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverallStatus getOverallStatus() {
		return overallStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallStatus(OverallStatus newOverallStatus) {
		OverallStatus oldOverallStatus = overallStatus;
		overallStatus = newOverallStatus == null ? OVERALL_STATUS_EDEFAULT : newOverallStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__OVERALL_STATUS, oldOverallStatus, overallStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistributedCPUFairness() {
		return distributedCPUFairness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributedCPUFairness(int newDistributedCPUFairness) {
		int oldDistributedCPUFairness = distributedCPUFairness;
		distributedCPUFairness = newDistributedCPUFairness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS, oldDistributedCPUFairness, distributedCPUFairness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistributedMemoryFairness() {
		return distributedMemoryFairness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributedMemoryFairness(int newDistributedMemoryFairness) {
		int oldDistributedMemoryFairness = distributedMemoryFairness;
		distributedMemoryFairness = newDistributedMemoryFairness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS, oldDistributedMemoryFairness, distributedMemoryFairness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOverallCPUUsage() {
		return overallCPUUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallCPUUsage(int newOverallCPUUsage) {
		int oldOverallCPUUsage = overallCPUUsage;
		overallCPUUsage = newOverallCPUUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE, oldOverallCPUUsage, overallCPUUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOverallMemoryUsage() {
		return overallMemoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallMemoryUsage(int newOverallMemoryUsage) {
		int oldOverallMemoryUsage = overallMemoryUsage;
		overallMemoryUsage = newOverallMemoryUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE, oldOverallMemoryUsage, overallMemoryUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRebootRequired() {
		return rebootRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRebootRequired(boolean newRebootRequired) {
		boolean oldRebootRequired = rebootRequired;
		rebootRequired = newRebootRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED, oldRebootRequired, rebootRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBootTime() {
		return bootTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBootTime(Date newBootTime) {
		Date oldBootTime = bootTime;
		bootTime = newBootTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__BOOT_TIME, oldBootTime, bootTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostConnectionState getConnectionState() {
		return connectionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionState(HostConnectionState newConnectionState) {
		HostConnectionState oldConnectionState = connectionState;
		connectionState = newConnectionState == null ? CONNECTION_STATE_EDEFAULT : newConnectionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__CONNECTION_STATE, oldConnectionState, connectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInMaintenanceMode() {
		return inMaintenanceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMaintenanceMode(boolean newInMaintenanceMode) {
		boolean oldInMaintenanceMode = inMaintenanceMode;
		inMaintenanceMode = newInMaintenanceMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE, oldInMaintenanceMode, inMaintenanceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnectHost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterlLockDownMode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterMaintenanceMode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exitLockDownMode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exitMaintenanceMode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconfigureHostForDAS() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnectHost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmwarePackage.HOSTSYSTEM__NAME:
				return getName();
			case VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED:
				return isClusterSupported();
			case VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER:
				return isInDasCluster();
			case VmwarePackage.HOSTSYSTEM__SERVERIP:
				return getServerip();
			case VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED:
				return isVimAccountNameRequired();
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME:
				return getAgentVmDatastoreName();
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME:
				return getAgentVmNetworkName();
			case VmwarePackage.HOSTSYSTEM__PORT:
				return getPort();
			case VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED:
				return isFaultToleranceEnabled();
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS:
				return getHostFeatureVersionKeys();
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES:
				return getHostFeatureVersionValues();
			case VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED:
				return isVmotionEnabled();
			case VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY:
				return getCurrentEVCModeKey();
			case VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES:
				return getCustomValues();
			case VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP:
				return getManagementServerip();
			case VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY:
				return getMaxEVCKey();
			case VmwarePackage.HOSTSYSTEM__OVERALL_STATUS:
				return getOverallStatus();
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS:
				return getDistributedCPUFairness();
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS:
				return getDistributedMemoryFairness();
			case VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE:
				return getOverallCPUUsage();
			case VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE:
				return getOverallMemoryUsage();
			case VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED:
				return isRebootRequired();
			case VmwarePackage.HOSTSYSTEM__BOOT_TIME:
				return getBootTime();
			case VmwarePackage.HOSTSYSTEM__CONNECTION_STATE:
				return getConnectionState();
			case VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE:
				return isInMaintenanceMode();
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
			case VmwarePackage.HOSTSYSTEM__NAME:
				setName((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED:
				setClusterSupported((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER:
				setInDasCluster((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__SERVERIP:
				setServerip((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED:
				setVimAccountNameRequired((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME:
				setAgentVmDatastoreName((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME:
				setAgentVmNetworkName((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__PORT:
				setPort((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED:
				setFaultToleranceEnabled((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS:
				setHostFeatureVersionKeys((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES:
				setHostFeatureVersionValues((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED:
				setVmotionEnabled((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY:
				setCurrentEVCModeKey((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES:
				setCustomValues((Integer)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP:
				setManagementServerip((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY:
				setMaxEVCKey((String)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_STATUS:
				setOverallStatus((OverallStatus)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS:
				setDistributedCPUFairness((Integer)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS:
				setDistributedMemoryFairness((Integer)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE:
				setOverallCPUUsage((Integer)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE:
				setOverallMemoryUsage((Integer)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED:
				setRebootRequired((Boolean)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__BOOT_TIME:
				setBootTime((Date)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__CONNECTION_STATE:
				setConnectionState((HostConnectionState)newValue);
				return;
			case VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE:
				setInMaintenanceMode((Boolean)newValue);
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
			case VmwarePackage.HOSTSYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED:
				setClusterSupported(CLUSTER_SUPPORTED_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER:
				setInDasCluster(IN_DAS_CLUSTER_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__SERVERIP:
				setServerip(SERVERIP_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED:
				setVimAccountNameRequired(VIM_ACCOUNT_NAME_REQUIRED_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME:
				setAgentVmDatastoreName(AGENT_VM_DATASTORE_NAME_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME:
				setAgentVmNetworkName(AGENT_VM_NETWORK_NAME_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED:
				setFaultToleranceEnabled(FAULT_TOLERANCE_ENABLED_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS:
				setHostFeatureVersionKeys(HOST_FEATURE_VERSION_KEYS_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES:
				setHostFeatureVersionValues(HOST_FEATURE_VERSION_VALUES_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED:
				setVmotionEnabled(VMOTION_ENABLED_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY:
				setCurrentEVCModeKey(CURRENT_EVC_MODE_KEY_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES:
				setCustomValues(CUSTOM_VALUES_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP:
				setManagementServerip(MANAGEMENT_SERVERIP_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY:
				setMaxEVCKey(MAX_EVC_KEY_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_STATUS:
				setOverallStatus(OVERALL_STATUS_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS:
				setDistributedCPUFairness(DISTRIBUTED_CPU_FAIRNESS_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS:
				setDistributedMemoryFairness(DISTRIBUTED_MEMORY_FAIRNESS_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE:
				setOverallCPUUsage(OVERALL_CPU_USAGE_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE:
				setOverallMemoryUsage(OVERALL_MEMORY_USAGE_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED:
				setRebootRequired(REBOOT_REQUIRED_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__BOOT_TIME:
				setBootTime(BOOT_TIME_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__CONNECTION_STATE:
				setConnectionState(CONNECTION_STATE_EDEFAULT);
				return;
			case VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE:
				setInMaintenanceMode(IN_MAINTENANCE_MODE_EDEFAULT);
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
			case VmwarePackage.HOSTSYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED:
				return clusterSupported != CLUSTER_SUPPORTED_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER:
				return inDasCluster != IN_DAS_CLUSTER_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__SERVERIP:
				return SERVERIP_EDEFAULT == null ? serverip != null : !SERVERIP_EDEFAULT.equals(serverip);
			case VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED:
				return vimAccountNameRequired != VIM_ACCOUNT_NAME_REQUIRED_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME:
				return AGENT_VM_DATASTORE_NAME_EDEFAULT == null ? agentVmDatastoreName != null : !AGENT_VM_DATASTORE_NAME_EDEFAULT.equals(agentVmDatastoreName);
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME:
				return AGENT_VM_NETWORK_NAME_EDEFAULT == null ? agentVmNetworkName != null : !AGENT_VM_NETWORK_NAME_EDEFAULT.equals(agentVmNetworkName);
			case VmwarePackage.HOSTSYSTEM__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED:
				return faultToleranceEnabled != FAULT_TOLERANCE_ENABLED_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS:
				return HOST_FEATURE_VERSION_KEYS_EDEFAULT == null ? hostFeatureVersionKeys != null : !HOST_FEATURE_VERSION_KEYS_EDEFAULT.equals(hostFeatureVersionKeys);
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES:
				return HOST_FEATURE_VERSION_VALUES_EDEFAULT == null ? hostFeatureVersionValues != null : !HOST_FEATURE_VERSION_VALUES_EDEFAULT.equals(hostFeatureVersionValues);
			case VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED:
				return vmotionEnabled != VMOTION_ENABLED_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY:
				return CURRENT_EVC_MODE_KEY_EDEFAULT == null ? currentEVCModeKey != null : !CURRENT_EVC_MODE_KEY_EDEFAULT.equals(currentEVCModeKey);
			case VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES:
				return customValues != CUSTOM_VALUES_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP:
				return MANAGEMENT_SERVERIP_EDEFAULT == null ? managementServerip != null : !MANAGEMENT_SERVERIP_EDEFAULT.equals(managementServerip);
			case VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY:
				return MAX_EVC_KEY_EDEFAULT == null ? maxEVCKey != null : !MAX_EVC_KEY_EDEFAULT.equals(maxEVCKey);
			case VmwarePackage.HOSTSYSTEM__OVERALL_STATUS:
				return overallStatus != OVERALL_STATUS_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS:
				return distributedCPUFairness != DISTRIBUTED_CPU_FAIRNESS_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS:
				return distributedMemoryFairness != DISTRIBUTED_MEMORY_FAIRNESS_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE:
				return overallCPUUsage != OVERALL_CPU_USAGE_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE:
				return overallMemoryUsage != OVERALL_MEMORY_USAGE_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED:
				return rebootRequired != REBOOT_REQUIRED_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__BOOT_TIME:
				return BOOT_TIME_EDEFAULT == null ? bootTime != null : !BOOT_TIME_EDEFAULT.equals(bootTime);
			case VmwarePackage.HOSTSYSTEM__CONNECTION_STATE:
				return connectionState != CONNECTION_STATE_EDEFAULT;
			case VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE:
				return inMaintenanceMode != IN_MAINTENANCE_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VmwarePackage.HOSTSYSTEM___DISCONNECT_HOST:
				disconnectHost();
				return null;
			case VmwarePackage.HOSTSYSTEM___ENTERL_LOCK_DOWN_MODE:
				enterlLockDownMode();
				return null;
			case VmwarePackage.HOSTSYSTEM___ENTER_MAINTENANCE_MODE:
				enterMaintenanceMode();
				return null;
			case VmwarePackage.HOSTSYSTEM___EXIT_LOCK_DOWN_MODE:
				exitLockDownMode();
				return null;
			case VmwarePackage.HOSTSYSTEM___EXIT_MAINTENANCE_MODE:
				exitMaintenanceMode();
				return null;
			case VmwarePackage.HOSTSYSTEM___RECONFIGURE_HOST_FOR_DAS:
				reconfigureHostForDAS();
				return null;
			case VmwarePackage.HOSTSYSTEM___RECONNECT_HOST:
				reconnectHost();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", clusterSupported: ");
		result.append(clusterSupported);
		result.append(", inDasCluster: ");
		result.append(inDasCluster);
		result.append(", serverip: ");
		result.append(serverip);
		result.append(", vimAccountNameRequired: ");
		result.append(vimAccountNameRequired);
		result.append(", agentVmDatastoreName: ");
		result.append(agentVmDatastoreName);
		result.append(", agentVmNetworkName: ");
		result.append(agentVmNetworkName);
		result.append(", port: ");
		result.append(port);
		result.append(", faultToleranceEnabled: ");
		result.append(faultToleranceEnabled);
		result.append(", hostFeatureVersionKeys: ");
		result.append(hostFeatureVersionKeys);
		result.append(", hostFeatureVersionValues: ");
		result.append(hostFeatureVersionValues);
		result.append(", vmotionEnabled: ");
		result.append(vmotionEnabled);
		result.append(", currentEVCModeKey: ");
		result.append(currentEVCModeKey);
		result.append(", customValues: ");
		result.append(customValues);
		result.append(", managementServerip: ");
		result.append(managementServerip);
		result.append(", maxEVCKey: ");
		result.append(maxEVCKey);
		result.append(", overallStatus: ");
		result.append(overallStatus);
		result.append(", distributedCPUFairness: ");
		result.append(distributedCPUFairness);
		result.append(", distributedMemoryFairness: ");
		result.append(distributedMemoryFairness);
		result.append(", overallCPUUsage: ");
		result.append(overallCPUUsage);
		result.append(", overallMemoryUsage: ");
		result.append(overallMemoryUsage);
		result.append(", rebootRequired: ");
		result.append(rebootRequired);
		result.append(", bootTime: ");
		result.append(bootTime);
		result.append(", connectionState: ");
		result.append(connectionState);
		result.append(", inMaintenanceMode: ");
		result.append(inMaintenanceMode);
		result.append(')');
		return result.toString();
	}

} //HostsystemImpl
