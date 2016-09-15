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
package org.occiware.clouddesigner.occi.vmware;

import java.util.Date;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hostsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isClusterSupported <em>Cluster Supported</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInDasCluster <em>In Das Cluster</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getServerip <em>Serverip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVimAccountNameRequired <em>Vim Account Name Required</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmDatastoreName <em>Agent Vm Datastore Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmNetworkName <em>Agent Vm Network Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getPort <em>Port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isFaultToleranceEnabled <em>Fault Tolerance Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionKeys <em>Host Feature Version Keys</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionValues <em>Host Feature Version Values</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVmotionEnabled <em>Vmotion Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCurrentEVCModeKey <em>Current EVC Mode Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCustomValues <em>Custom Values</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getManagementServerip <em>Management Serverip</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getMaxEVCKey <em>Max EVC Key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallStatus <em>Overall Status</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedCPUFairness <em>Distributed CPU Fairness</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedMemoryFairness <em>Distributed Memory Fairness</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallCPUUsage <em>Overall CPU Usage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallMemoryUsage <em>Overall Memory Usage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isRebootRequired <em>Reboot Required</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getBootTime <em>Boot Time</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getConnectionState <em>Connection State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInMaintenanceMode <em>In Maintenance Mode</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Hostsystem extends Compute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cluster Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Supported</em>' attribute.
	 * @see #setClusterSupported(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_ClusterSupported()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Whether or not the host supports clustering capabilities such as HA or DRS and therefore can be added to a cluster. If false, the host must be added as a standalone host.\nSee HostConnectInfo'"
	 * @generated
	 */
	boolean isClusterSupported();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isClusterSupported <em>Cluster Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Supported</em>' attribute.
	 * @see #isClusterSupported()
	 * @generated
	 */
	void setClusterSupported(boolean value);

	/**
	 * Returns the value of the '<em><b>In Das Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Das Cluster</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Das Cluster</em>' attribute.
	 * @see #setInDasCluster(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_InDasCluster()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='If the host is already being managed by a vCenter Server, this property reports true if the host is also part of a vSphere HA enabled cluster. If this is the case, remove or disconnect the host from this cluster before adding it to another vCenter Server.'"
	 * @generated
	 */
	boolean isInDasCluster();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInDasCluster <em>In Das Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Das Cluster</em>' attribute.
	 * @see #isInDasCluster()
	 * @generated
	 */
	void setInDasCluster(boolean value);

	/**
	 * Returns the value of the '<em><b>Serverip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverip</em>' attribute.
	 * @see #setServerip(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_Serverip()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The IP address of the VirtualCenter already managing this host, if any.'"
	 * @generated
	 */
	String getServerip();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getServerip <em>Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serverip</em>' attribute.
	 * @see #getServerip()
	 * @generated
	 */
	void setServerip(String value);

	/**
	 * Returns the value of the '<em><b>Vim Account Name Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vim Account Name Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vim Account Name Required</em>' attribute.
	 * @see #setVimAccountNameRequired(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_VimAccountNameRequired()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Whether or not the host requires a vimAccountName and password to be set in the ConnectSpec. This is normally only required for VMware Server hosts. '"
	 * @generated
	 */
	boolean isVimAccountNameRequired();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVimAccountNameRequired <em>Vim Account Name Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vim Account Name Required</em>' attribute.
	 * @see #isVimAccountNameRequired()
	 * @generated
	 */
	void setVimAccountNameRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Agent Vm Datastore Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Vm Datastore Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Vm Datastore Name</em>' attribute.
	 * @see #setAgentVmDatastoreName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_AgentVmDatastoreName()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Datastore used to deploy Agent VMs on for this host.'"
	 * @generated
	 */
	String getAgentVmDatastoreName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmDatastoreName <em>Agent Vm Datastore Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Vm Datastore Name</em>' attribute.
	 * @see #getAgentVmDatastoreName()
	 * @generated
	 */
	void setAgentVmDatastoreName(String value);

	/**
	 * Returns the value of the '<em><b>Agent Vm Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Vm Network Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Vm Network Name</em>' attribute.
	 * @see #setAgentVmNetworkName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_AgentVmNetworkName()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Management network for Agent VMs.'"
	 * @generated
	 */
	String getAgentVmNetworkName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getAgentVmNetworkName <em>Agent Vm Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Vm Network Name</em>' attribute.
	 * @see #getAgentVmNetworkName()
	 * @generated
	 */
	void setAgentVmNetworkName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_Port()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The port number. '"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Fault Tolerance Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Tolerance Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Tolerance Enabled</em>' attribute.
	 * @see #setFaultToleranceEnabled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_FaultToleranceEnabled()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not Fault Tolerance logging is enabled on this host.'"
	 * @generated
	 */
	boolean isFaultToleranceEnabled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isFaultToleranceEnabled <em>Fault Tolerance Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Tolerance Enabled</em>' attribute.
	 * @see #isFaultToleranceEnabled()
	 * @generated
	 */
	void setFaultToleranceEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Host Feature Version Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Feature Version Keys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Feature Version Keys</em>' attribute.
	 * @see #setHostFeatureVersionKeys(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_HostFeatureVersionKeys()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHostFeatureVersionKeys();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionKeys <em>Host Feature Version Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Feature Version Keys</em>' attribute.
	 * @see #getHostFeatureVersionKeys()
	 * @generated
	 */
	void setHostFeatureVersionKeys(String value);

	/**
	 * Returns the value of the '<em><b>Host Feature Version Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Feature Version Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Feature Version Values</em>' attribute.
	 * @see #setHostFeatureVersionValues(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_HostFeatureVersionValues()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHostFeatureVersionValues();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getHostFeatureVersionValues <em>Host Feature Version Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Feature Version Values</em>' attribute.
	 * @see #getHostFeatureVersionValues()
	 * @generated
	 */
	void setHostFeatureVersionValues(String value);

	/**
	 * Returns the value of the '<em><b>Vmotion Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmotion Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmotion Enabled</em>' attribute.
	 * @see #setVmotionEnabled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_VmotionEnabled()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not VMotion is enabled on this host. '"
	 * @generated
	 */
	boolean isVmotionEnabled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isVmotionEnabled <em>Vmotion Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmotion Enabled</em>' attribute.
	 * @see #isVmotionEnabled()
	 * @generated
	 */
	void setVmotionEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Current EVC Mode Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current EVC Mode Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current EVC Mode Key</em>' attribute.
	 * @see #setCurrentEVCModeKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_CurrentEVCModeKey()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The Enhanced VMotion Compatibility mode that is currently in effect for this host. If the host is in a cluster where EVC is active, this will match the cluster\'s EVC mode; otherwise this will be unset.'"
	 * @generated
	 */
	String getCurrentEVCModeKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCurrentEVCModeKey <em>Current EVC Mode Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current EVC Mode Key</em>' attribute.
	 * @see #getCurrentEVCModeKey()
	 * @generated
	 */
	void setCurrentEVCModeKey(String value);

	/**
	 * Returns the value of the '<em><b>Custom Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Values</em>' attribute.
	 * @see #setCustomValues(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_CustomValues()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The customized field values. '"
	 * @generated
	 */
	int getCustomValues();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getCustomValues <em>Custom Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Values</em>' attribute.
	 * @see #getCustomValues()
	 * @generated
	 */
	void setCustomValues(int value);

	/**
	 * Returns the value of the '<em><b>Management Serverip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management Serverip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Serverip</em>' attribute.
	 * @see #setManagementServerip(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_ManagementServerip()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='IP address of the VirtualCenter server managing this host, if any.'"
	 * @generated
	 */
	String getManagementServerip();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getManagementServerip <em>Management Serverip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Serverip</em>' attribute.
	 * @see #getManagementServerip()
	 * @generated
	 */
	void setManagementServerip(String value);

	/**
	 * Returns the value of the '<em><b>Max EVC Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max EVC Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max EVC Key</em>' attribute.
	 * @see #setMaxEVCKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_MaxEVCKey()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The most capable Enhanced VMotion Compatibility mode supported by the host hardware and software; unset if this host cannot participate in any EVC mode.\nSee supportedEVCMode'"
	 * @generated
	 */
	String getMaxEVCKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getMaxEVCKey <em>Max EVC Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max EVC Key</em>' attribute.
	 * @see #getMaxEVCKey()
	 * @generated
	 */
	void setMaxEVCKey(String value);

	/**
	 * Returns the value of the '<em><b>Overall Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.OverallStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Status</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @see #setOverallStatus(OverallStatus)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_OverallStatus()
	 * @model annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	OverallStatus getOverallStatus();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallStatus <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Status</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @see #getOverallStatus()
	 * @generated
	 */
	void setOverallStatus(OverallStatus value);

	/**
	 * Returns the value of the '<em><b>Distributed CPU Fairness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distributed CPU Fairness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributed CPU Fairness</em>' attribute.
	 * @see #setDistributedCPUFairness(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_DistributedCPUFairness()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The fairness of distributed CPU resource allocation on the host. '"
	 * @generated
	 */
	int getDistributedCPUFairness();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedCPUFairness <em>Distributed CPU Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributed CPU Fairness</em>' attribute.
	 * @see #getDistributedCPUFairness()
	 * @generated
	 */
	void setDistributedCPUFairness(int value);

	/**
	 * Returns the value of the '<em><b>Distributed Memory Fairness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distributed Memory Fairness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributed Memory Fairness</em>' attribute.
	 * @see #setDistributedMemoryFairness(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_DistributedMemoryFairness()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The fairness of distributed memory resource allocation on the host. '"
	 * @generated
	 */
	int getDistributedMemoryFairness();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getDistributedMemoryFairness <em>Distributed Memory Fairness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributed Memory Fairness</em>' attribute.
	 * @see #getDistributedMemoryFairness()
	 * @generated
	 */
	void setDistributedMemoryFairness(int value);

	/**
	 * Returns the value of the '<em><b>Overall CPU Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall CPU Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall CPU Usage</em>' attribute.
	 * @see #setOverallCPUUsage(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_OverallCPUUsage()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Aggregated CPU usage across all cores on the host in MHz. This is only available if the host is connected. '"
	 * @generated
	 */
	int getOverallCPUUsage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallCPUUsage <em>Overall CPU Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall CPU Usage</em>' attribute.
	 * @see #getOverallCPUUsage()
	 * @generated
	 */
	void setOverallCPUUsage(int value);

	/**
	 * Returns the value of the '<em><b>Overall Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Memory Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Memory Usage</em>' attribute.
	 * @see #setOverallMemoryUsage(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_OverallMemoryUsage()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Physical memory usage on the host in MB. This is only available if the host is connected. '"
	 * @generated
	 */
	int getOverallMemoryUsage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getOverallMemoryUsage <em>Overall Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Memory Usage</em>' attribute.
	 * @see #getOverallMemoryUsage()
	 * @generated
	 */
	void setOverallMemoryUsage(int value);

	/**
	 * Returns the value of the '<em><b>Reboot Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reboot Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reboot Required</em>' attribute.
	 * @see #setRebootRequired(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_RebootRequired()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Indicates whether or not the host requires a reboot due to a configuration change.'"
	 * @generated
	 */
	boolean isRebootRequired();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isRebootRequired <em>Reboot Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reboot Required</em>' attribute.
	 * @see #isRebootRequired()
	 * @generated
	 */
	void setRebootRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Boot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot Time</em>' attribute.
	 * @see #setBootTime(Date)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_BootTime()
	 * @model dataType="org.occiware.clouddesigner.occi.vmware.Datetype"
	 *        annotation="OCCIE2Ecore description='The time when the host was booted. '"
	 * @generated
	 */
	Date getBootTime();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getBootTime <em>Boot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot Time</em>' attribute.
	 * @see #getBootTime()
	 * @generated
	 */
	void setBootTime(Date value);

	/**
	 * Returns the value of the '<em><b>Connection State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.HostConnectionState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostConnectionState
	 * @see #setConnectionState(HostConnectionState)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_ConnectionState()
	 * @model annotation="OCCIE2Ecore description='The host connection state. See the decription in the enums for the ConnectionState data object type. '"
	 * @generated
	 */
	HostConnectionState getConnectionState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#getConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.HostConnectionState
	 * @see #getConnectionState()
	 * @generated
	 */
	void setConnectionState(HostConnectionState value);

	/**
	 * Returns the value of the '<em><b>In Maintenance Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Maintenance Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Maintenance Mode</em>' attribute.
	 * @see #setInMaintenanceMode(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostsystem_InMaintenanceMode()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='The flag to indicate whether or not the host is in maintenance mode. This flag is set when the host has entered the maintenance mode. It is not set during the entering phase of maintenance mode.\nSee EnterMaintenanceMode_Task\nSee ExitMaintenanceMode_Task'"
	 * @generated
	 */
	boolean isInMaintenanceMode();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Hostsystem#isInMaintenanceMode <em>In Maintenance Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Maintenance Mode</em>' attribute.
	 * @see #isInMaintenanceMode()
	 * @generated
	 */
	void setInMaintenanceMode(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Disconnects from a host and instructs the server to stop sending heartbeats.'"
	 * @generated
	 */
	void disconnectHost();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Modifies the permissions on the host, so that it will only be accessible through local console or an authorized centralized management application. Any user defined permissions found on the host are lost.Access via a VI client connected to the host is blocked. Access though other services running on the host is also blocked.If the operation is successful, adminDisabled will be set to true. This API is not supported on the host, If invoked directly on a host, a NotSupported fault will be thrown.'"
	 * @generated
	 */
	void enterlLockDownMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Puts the host in maintenance mode. While this task is running and when the host is in maintenance mode, no virtual machines can be powered on and no provisioning operations can be performed on the host. Once the call completes, it is safe to turn off a host without disrupting any virtual machines'"
	 * @generated
	 */
	void enterMaintenanceMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Restores Administrator permission for the local administrative account for the host that was removed by prior call to EnterLockdownMode. If the operation is successful, adminDisabled will be set to false. This API is not supported on the host. If invoked directly on a host, a NotSupported fault will be thrown.'"
	 * @generated
	 */
	void exitLockDownMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Takes the host out of maintenance mode. This blocks if any concurrent running maintenance-only host configurations operations are being performed. For example, if VMFS volumes are being upgraded.'"
	 * @generated
	 */
	void exitMaintenanceMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='reconfigures the host for the VMware High Availability (HA) cluster. If the host is part of an HA cluster, this operation reconfigures the host for HA. For example, this operation may be used if a host is added to an HA-enabled cluster and the automatic HA configuration system task fails. Automatic HA configuration may fail for a variety of rea- sons. For example, the host may be configured incorrectly'"
	 * @generated
	 */
	void reconfigureHostForDAS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='reconnects to a host. This method is supported only in VirtualCenter'"
	 * @generated
	 */
	void reconnectHost();

} // Hostsystem
