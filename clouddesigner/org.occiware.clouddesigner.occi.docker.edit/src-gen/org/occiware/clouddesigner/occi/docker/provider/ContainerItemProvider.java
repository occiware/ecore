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
package org.occiware.clouddesigner.occi.docker.provider;


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

import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;

import org.occiware.clouddesigner.occi.infrastructure.provider.ComputeItemProvider;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
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
			addContaineridPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addBuildPropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addExposePropertyDescriptor(object);
			addVolumesPropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addEnv_filePropertyDescriptor(object);
			addNetPropertyDescriptor(object);
			addDnsPropertyDescriptor(object);
			addDns_searchPropertyDescriptor(object);
			addCap_addPropertyDescriptor(object);
			addCap_dropPropertyDescriptor(object);
			addWorking_dirPropertyDescriptor(object);
			addEntrypointPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addDomainnamePropertyDescriptor(object);
			addMem_limitPropertyDescriptor(object);
			addMemory_swapPropertyDescriptor(object);
			addPrivilegedPropertyDescriptor(object);
			addRestartPropertyDescriptor(object);
			addStdin_openPropertyDescriptor(object);
			addInteractivePropertyDescriptor(object);
			addTtyPropertyDescriptor(object);
			addCpu_sharesPropertyDescriptor(object);
			addPidPropertyDescriptor(object);
			addIpcPropertyDescriptor(object);
			addAdd_hostPropertyDescriptor(object);
			addMac_addressPropertyDescriptor(object);
			addRmPropertyDescriptor(object);
			addSecurity_optPropertyDescriptor(object);
			addDevicePropertyDescriptor(object);
			addLxc_confPropertyDescriptor(object);
			addCpusetPropertyDescriptor(object);
			addPublish_allPropertyDescriptor(object);
			addRead_onlyPropertyDescriptor(object);
			addMonitoredPropertyDescriptor(object);
			addCpu_usedPropertyDescriptor(object);
			addMemory_usedPropertyDescriptor(object);
			addCpu_percentPropertyDescriptor(object);
			addMemory_percentPropertyDescriptor(object);
			addDisk_usedPropertyDescriptor(object);
			addDisk_percentPropertyDescriptor(object);
			addBandwidth_usedPropertyDescriptor(object);
			addBandwidth_percentPropertyDescriptor(object);
			addMonitoring_intervalPropertyDescriptor(object);
			addCpu_max_valuePropertyDescriptor(object);
			addMemory_max_valuePropertyDescriptor(object);
			addCore_maxPropertyDescriptor(object);
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
				 getString("_UI_Container_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_name_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containerid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContaineridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_containerid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_containerid_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CONTAINERID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_image_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_build_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_build_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BUILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_command_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_ports_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_expose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_expose_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__EXPOSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_volumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_volumes_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__VOLUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_environment_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENVIRONMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Env file feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnv_filePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_env_file_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_env_file_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENV_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Net feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_net_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_net_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__NET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dns_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dns search feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDns_searchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_dns_search_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_dns_search_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DNS_SEARCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cap add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCap_addPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cap_add_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cap_add_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CAP_ADD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cap drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCap_dropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cap_drop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cap_drop_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CAP_DROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Working dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorking_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_working_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_working_dir_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__WORKING_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entrypoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntrypointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_entrypoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_entrypoint_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ENTRYPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_user_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domainname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_domainname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_domainname_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DOMAINNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mem limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMem_limitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_mem_limit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_mem_limit_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEM_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory swap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemory_swapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memory_swap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memory_swap_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_SWAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Privileged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivilegedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_privileged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_privileged_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PRIVILEGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_restart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_restart_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__RESTART,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stdin open feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStdin_openPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_stdin_open_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_stdin_open_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__STDIN_OPEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interactive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_interactive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_interactive_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__INTERACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTtyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_tty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_tty_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__TTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu shares feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_sharesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpu_shares_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpu_shares_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_SHARES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_pid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_pid_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ipc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_ipc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_ipc_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__IPC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Add host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdd_hostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_add_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_add_host_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__ADD_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mac address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMac_addressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_mac_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_mac_address_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MAC_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_rm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_rm_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__RM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurity_optPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_security_opt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_security_opt_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__SECURITY_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Device feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_device_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_device_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DEVICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lxc conf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLxc_confPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_lxc_conf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_lxc_conf_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__LXC_CONF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpuset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpusetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpuset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpuset_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPUSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publish all feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublish_allPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_publish_all_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_publish_all_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__PUBLISH_ALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRead_onlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_read_only_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_read_only_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitored feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_monitored_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_monitored_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MONITORED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_usedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpu_used_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpu_used_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemory_usedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memory_used_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memory_used_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_percentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpu_percent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpu_percent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemory_percentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memory_percent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memory_percent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisk_usedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_disk_used_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_disk_used_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DISK_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisk_percentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_disk_percent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_disk_percent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__DISK_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidth_usedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_bandwidth_used_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_bandwidth_used_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BANDWIDTH_USED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bandwidth percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBandwidth_percentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_bandwidth_percent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_bandwidth_percent_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__BANDWIDTH_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoring_intervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_monitoring_interval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_monitoring_interval_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MONITORING_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu max value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_max_valuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_cpu_max_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_cpu_max_value_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CPU_MAX_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory max value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemory_max_valuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_memory_max_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_memory_max_value_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__MEMORY_MAX_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Core max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCore_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_core_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_core_max_feature", "_UI_Container_type"),
				 DockerPackage.Literals.CONTAINER__CORE_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Container)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;
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

		switch (notification.getFeatureID(Container.class)) {
			case DockerPackage.CONTAINER__NAME:
			case DockerPackage.CONTAINER__CONTAINERID:
			case DockerPackage.CONTAINER__IMAGE:
			case DockerPackage.CONTAINER__BUILD:
			case DockerPackage.CONTAINER__COMMAND:
			case DockerPackage.CONTAINER__PORTS:
			case DockerPackage.CONTAINER__EXPOSE:
			case DockerPackage.CONTAINER__VOLUMES:
			case DockerPackage.CONTAINER__ENVIRONMENT:
			case DockerPackage.CONTAINER__ENV_FILE:
			case DockerPackage.CONTAINER__NET:
			case DockerPackage.CONTAINER__DNS:
			case DockerPackage.CONTAINER__DNS_SEARCH:
			case DockerPackage.CONTAINER__CAP_ADD:
			case DockerPackage.CONTAINER__CAP_DROP:
			case DockerPackage.CONTAINER__WORKING_DIR:
			case DockerPackage.CONTAINER__ENTRYPOINT:
			case DockerPackage.CONTAINER__USER:
			case DockerPackage.CONTAINER__DOMAINNAME:
			case DockerPackage.CONTAINER__MEM_LIMIT:
			case DockerPackage.CONTAINER__MEMORY_SWAP:
			case DockerPackage.CONTAINER__PRIVILEGED:
			case DockerPackage.CONTAINER__RESTART:
			case DockerPackage.CONTAINER__STDIN_OPEN:
			case DockerPackage.CONTAINER__INTERACTIVE:
			case DockerPackage.CONTAINER__TTY:
			case DockerPackage.CONTAINER__CPU_SHARES:
			case DockerPackage.CONTAINER__PID:
			case DockerPackage.CONTAINER__IPC:
			case DockerPackage.CONTAINER__ADD_HOST:
			case DockerPackage.CONTAINER__MAC_ADDRESS:
			case DockerPackage.CONTAINER__RM:
			case DockerPackage.CONTAINER__SECURITY_OPT:
			case DockerPackage.CONTAINER__DEVICE:
			case DockerPackage.CONTAINER__LXC_CONF:
			case DockerPackage.CONTAINER__CPUSET:
			case DockerPackage.CONTAINER__PUBLISH_ALL:
			case DockerPackage.CONTAINER__READ_ONLY:
			case DockerPackage.CONTAINER__MONITORED:
			case DockerPackage.CONTAINER__CPU_USED:
			case DockerPackage.CONTAINER__MEMORY_USED:
			case DockerPackage.CONTAINER__CPU_PERCENT:
			case DockerPackage.CONTAINER__MEMORY_PERCENT:
			case DockerPackage.CONTAINER__DISK_USED:
			case DockerPackage.CONTAINER__DISK_PERCENT:
			case DockerPackage.CONTAINER__BANDWIDTH_USED:
			case DockerPackage.CONTAINER__BANDWIDTH_PERCENT:
			case DockerPackage.CONTAINER__MONITORING_INTERVAL:
			case DockerPackage.CONTAINER__CPU_MAX_VALUE:
			case DockerPackage.CONTAINER__MEMORY_MAX_VALUE:
			case DockerPackage.CONTAINER__CORE_MAX:
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
				 DockerFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createVolumesfrom()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 DockerFactory.eINSTANCE.createContains()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DockerEditPlugin.INSTANCE;
	}

}
