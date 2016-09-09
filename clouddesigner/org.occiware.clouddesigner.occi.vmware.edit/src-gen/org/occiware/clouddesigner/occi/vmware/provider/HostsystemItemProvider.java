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
package org.occiware.clouddesigner.occi.vmware.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.provider.ComputeItemProvider;

import org.occiware.clouddesigner.occi.vmware.Hostsystem;
import org.occiware.clouddesigner.occi.vmware.VmwareFactory;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.vmware.Hostsystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HostsystemItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostsystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addClusterSupportedPropertyDescriptor(object);
			addInDasClusterPropertyDescriptor(object);
			addServeripPropertyDescriptor(object);
			addVimAccountNameRequiredPropertyDescriptor(object);
			addAgentVmDatastoreNamePropertyDescriptor(object);
			addAgentVmNetworkNamePropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addFaultToleranceEnabledPropertyDescriptor(object);
			addHostFeatureVersionKeysPropertyDescriptor(object);
			addHostFeatureVersionValuesPropertyDescriptor(object);
			addVmotionEnabledPropertyDescriptor(object);
			addCurrentEVCModeKeyPropertyDescriptor(object);
			addCustomValuesPropertyDescriptor(object);
			addManagementServeripPropertyDescriptor(object);
			addMaxEVCKeyPropertyDescriptor(object);
			addOverallStatusPropertyDescriptor(object);
			addDistributedCPUFairnessPropertyDescriptor(object);
			addDistributedMemoryFairnessPropertyDescriptor(object);
			addOverallCPUUsagePropertyDescriptor(object);
			addOverallMemoryUsagePropertyDescriptor(object);
			addRebootRequiredPropertyDescriptor(object);
			addBootTimePropertyDescriptor(object);
			addConnectionStatePropertyDescriptor(object);
			addInMaintenanceModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_name_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cluster Supported feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterSupportedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_clusterSupported_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_clusterSupported_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_ClusterSupported(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Das Cluster feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInDasClusterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_inDasCluster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_inDasCluster_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_InDasCluster(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serverip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServeripPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_serverip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_serverip_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_Serverip(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vim Account Name Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVimAccountNameRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_vimAccountNameRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_vimAccountNameRequired_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_VimAccountNameRequired(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agent Vm Datastore Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentVmDatastoreNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_agentVmDatastoreName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_agentVmDatastoreName_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_AgentVmDatastoreName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agent Vm Network Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentVmNetworkNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_agentVmNetworkName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_agentVmNetworkName_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_AgentVmNetworkName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_port_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_Port(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault Tolerance Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaultToleranceEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_faultToleranceEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_faultToleranceEnabled_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_FaultToleranceEnabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Feature Version Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostFeatureVersionKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_hostFeatureVersionKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_hostFeatureVersionKeys_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_HostFeatureVersionKeys(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Feature Version Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostFeatureVersionValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_hostFeatureVersionValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_hostFeatureVersionValues_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_HostFeatureVersionValues(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vmotion Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmotionEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_vmotionEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_vmotionEnabled_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_VmotionEnabled(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current EVC Mode Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentEVCModeKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_currentEVCModeKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_currentEVCModeKey_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_CurrentEVCModeKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_customValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_customValues_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_CustomValues(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Management Serverip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagementServeripPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_managementServerip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_managementServerip_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_ManagementServerip(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max EVC Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxEVCKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_maxEVCKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_maxEVCKey_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_MaxEVCKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_overallStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_overallStatus_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_OverallStatus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distributed CPU Fairness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributedCPUFairnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_distributedCPUFairness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_distributedCPUFairness_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_DistributedCPUFairness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Distributed Memory Fairness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDistributedMemoryFairnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_distributedMemoryFairness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_distributedMemoryFairness_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_DistributedMemoryFairness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall CPU Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallCPUUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_overallCPUUsage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_overallCPUUsage_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_OverallCPUUsage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overall Memory Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallMemoryUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_overallMemoryUsage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_overallMemoryUsage_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_OverallMemoryUsage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reboot Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRebootRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_rebootRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_rebootRequired_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_RebootRequired(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boot Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBootTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_bootTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_bootTime_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_BootTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_connectionState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_connectionState_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_ConnectionState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Maintenance Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInMaintenanceModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostsystem_inMaintenanceMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostsystem_inMaintenanceMode_feature", "_UI_Hostsystem_type"),
				 VmwarePackage.eINSTANCE.getHostsystem_InMaintenanceMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Hostsystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hostsystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Hostsystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Hostsystem_type") :
			getString("_UI_Hostsystem_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Hostsystem.class)) {
			case VmwarePackage.HOSTSYSTEM__NAME:
			case VmwarePackage.HOSTSYSTEM__CLUSTER_SUPPORTED:
			case VmwarePackage.HOSTSYSTEM__IN_DAS_CLUSTER:
			case VmwarePackage.HOSTSYSTEM__SERVERIP:
			case VmwarePackage.HOSTSYSTEM__VIM_ACCOUNT_NAME_REQUIRED:
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_DATASTORE_NAME:
			case VmwarePackage.HOSTSYSTEM__AGENT_VM_NETWORK_NAME:
			case VmwarePackage.HOSTSYSTEM__PORT:
			case VmwarePackage.HOSTSYSTEM__FAULT_TOLERANCE_ENABLED:
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_KEYS:
			case VmwarePackage.HOSTSYSTEM__HOST_FEATURE_VERSION_VALUES:
			case VmwarePackage.HOSTSYSTEM__VMOTION_ENABLED:
			case VmwarePackage.HOSTSYSTEM__CURRENT_EVC_MODE_KEY:
			case VmwarePackage.HOSTSYSTEM__CUSTOM_VALUES:
			case VmwarePackage.HOSTSYSTEM__MANAGEMENT_SERVERIP:
			case VmwarePackage.HOSTSYSTEM__MAX_EVC_KEY:
			case VmwarePackage.HOSTSYSTEM__OVERALL_STATUS:
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_CPU_FAIRNESS:
			case VmwarePackage.HOSTSYSTEM__DISTRIBUTED_MEMORY_FAIRNESS:
			case VmwarePackage.HOSTSYSTEM__OVERALL_CPU_USAGE:
			case VmwarePackage.HOSTSYSTEM__OVERALL_MEMORY_USAGE:
			case VmwarePackage.HOSTSYSTEM__REBOOT_REQUIRED:
			case VmwarePackage.HOSTSYSTEM__BOOT_TIME:
			case VmwarePackage.HOSTSYSTEM__CONNECTION_STATE:
			case VmwarePackage.HOSTSYSTEM__IN_MAINTENANCE_MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createFolderlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createResourcepoollink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createClusterlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createDatacenterlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostsystemlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createDatastorelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualnetworkadapter()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualdisknetworklink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostnetworkadapter()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createSnapshotlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostfirewallrule()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHoststoragelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createServiceconsolenic()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createPortgrouplink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostnatportforwardlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualdisklink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VmwareEditPlugin.INSTANCE;
	}

}
