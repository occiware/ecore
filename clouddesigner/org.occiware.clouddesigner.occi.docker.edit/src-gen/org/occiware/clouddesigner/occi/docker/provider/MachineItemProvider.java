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

import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;

import org.occiware.clouddesigner.occi.infrastructure.provider.ComputeItemProvider;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MachineItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineItemProvider(AdapterFactory adapterFactory) {
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
			addEngine_install_urlPropertyDescriptor(object);
			addEngine_optPropertyDescriptor(object);
			addEngine_insecure_registryPropertyDescriptor(object);
			addEngine_registry_mirrorPropertyDescriptor(object);
			addEngine_labelPropertyDescriptor(object);
			addEngine_storage_driverPropertyDescriptor(object);
			addEngine_envPropertyDescriptor(object);
			addSwarmPropertyDescriptor(object);
			addSwarm_imagePropertyDescriptor(object);
			addSwarm_masterPropertyDescriptor(object);
			addSwarm_discoveryPropertyDescriptor(object);
			addSwarm_strategyPropertyDescriptor(object);
			addSwarm_optPropertyDescriptor(object);
			addSwarm_hostPropertyDescriptor(object);
			addSwarm_addrPropertyDescriptor(object);
			addSwarm_experimentalPropertyDescriptor(object);
			addTls_sanPropertyDescriptor(object);
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
				 getString("_UI_Machine_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_name_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine install url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_install_urlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_install_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_install_url_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_INSTALL_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_optPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_opt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_opt_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine insecure registry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_insecure_registryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_insecure_registry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_insecure_registry_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_INSECURE_REGISTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine registry mirror feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_registry_mirrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_registry_mirror_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_registry_mirror_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_REGISTRY_MIRROR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_labelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_label_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine storage driver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_storage_driverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_storage_driver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_storage_driver_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_STORAGE_DRIVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Engine env feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEngine_envPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_engine_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_engine_env_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__ENGINE_ENV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_imagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_image_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_masterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_master_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_master_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_MASTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm discovery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_discoveryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_discovery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_discovery_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_DISCOVERY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_strategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_strategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_strategy_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_optPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_opt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_opt_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_OPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_hostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_host_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm addr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_addrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_addr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_addr_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_ADDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swarm experimental feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwarm_experimentalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_swarm_experimental_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_swarm_experimental_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__SWARM_EXPERIMENTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tls san feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTls_sanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_tls_san_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_tls_san_feature", "_UI_Machine_type"),
				 DockerPackage.Literals.MACHINE__TLS_SAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_type") :
			getString("_UI_Machine_type") + " " + label;
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

		switch (notification.getFeatureID(Machine.class)) {
			case DockerPackage.MACHINE__NAME:
			case DockerPackage.MACHINE__ENGINE_INSTALL_URL:
			case DockerPackage.MACHINE__ENGINE_OPT:
			case DockerPackage.MACHINE__ENGINE_INSECURE_REGISTRY:
			case DockerPackage.MACHINE__ENGINE_REGISTRY_MIRROR:
			case DockerPackage.MACHINE__ENGINE_LABEL:
			case DockerPackage.MACHINE__ENGINE_STORAGE_DRIVER:
			case DockerPackage.MACHINE__ENGINE_ENV:
			case DockerPackage.MACHINE__SWARM:
			case DockerPackage.MACHINE__SWARM_IMAGE:
			case DockerPackage.MACHINE__SWARM_MASTER:
			case DockerPackage.MACHINE__SWARM_DISCOVERY:
			case DockerPackage.MACHINE__SWARM_STRATEGY:
			case DockerPackage.MACHINE__SWARM_OPT:
			case DockerPackage.MACHINE__SWARM_HOST:
			case DockerPackage.MACHINE__SWARM_ADDR:
			case DockerPackage.MACHINE__SWARM_EXPERIMENTAL:
			case DockerPackage.MACHINE__TLS_SAN:
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
				 DockerFactory.eINSTANCE.createNetworkLink()));

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
