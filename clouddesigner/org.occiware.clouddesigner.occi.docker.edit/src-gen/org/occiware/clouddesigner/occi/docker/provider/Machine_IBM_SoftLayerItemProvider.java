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
package org.occiware.clouddesigner.occi.docker.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_IBM_SoftLayerItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_IBM_SoftLayerItemProvider(AdapterFactory adapterFactory) {
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

			addApi_endpointPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addApi_keyPropertyDescriptor(object);
			addCpuPropertyDescriptor(object);
			addDisk_sizePropertyDescriptor(object);
			addDomainPropertyDescriptor(object);
			addHourly_billingPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addLocal_diskPropertyDescriptor(object);
			addPrivate_net_onlyPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Api endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApi_endpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_api_endpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_api_endpoint_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT,
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
				 getString("_UI_Machine_IBM_SoftLayer_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_user_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Api key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApi_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_api_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_api_key_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__API_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_cpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_cpu_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__CPU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisk_sizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_disk_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_disk_size_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_domain_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__DOMAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hourly billing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHourly_billingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_hourly_billing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_hourly_billing_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Machine_IBM_SoftLayer_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_image_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local disk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocal_diskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_local_disk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_local_disk_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private net only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivate_net_onlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_private_net_only_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_private_net_only_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_IBM_SoftLayer_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_IBM_SoftLayer_region_feature", "_UI_Machine_IBM_SoftLayer_type"),
				 DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_IBM_SoftLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_IBM_SoftLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_IBM_SoftLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_IBM_SoftLayer_type") :
			getString("_UI_Machine_IBM_SoftLayer_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_IBM_SoftLayer.class)) {
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__USER:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__API_KEY:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__CPU:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DISK_SIZE:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__DOMAIN:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__IMAGE:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY:
			case DockerPackage.MACHINE_IBM_SOFT_LAYER__REGION:
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
	}

}
