/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.cloud.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_SoftLayerItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_SoftLayerItemProvider(AdapterFactory adapterFactory) {
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

			addProviderPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addApi_keyPropertyDescriptor(object);
			addLocation_idPropertyDescriptor(object);
			addImage_idPropertyDescriptor(object);
			addDomain_namePropertyDescriptor(object);
			addDisk_typePropertyDescriptor(object);
			addTenantPropertyDescriptor(object);
			addEndpointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_provider_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_username_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__USERNAME,
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
				 getString("_UI_Machine_SoftLayer_api_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_api_key_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__API_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocation_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_location_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_location_id_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__LOCATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImage_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_image_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_image_id_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__IMAGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomain_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_domain_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_domain_name_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__DOMAIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disk type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisk_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_disk_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_disk_type_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__DISK_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_tenant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_tenant_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__TENANT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_SoftLayer_endpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_SoftLayer_endpoint_feature", "_UI_Machine_SoftLayer_type"),
				 CloudPackage.Literals.MACHINE_SOFT_LAYER__ENDPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_SoftLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_SoftLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_SoftLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_SoftLayer_type") :
			getString("_UI_Machine_SoftLayer_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_SoftLayer.class)) {
			case CloudPackage.MACHINE_SOFT_LAYER__PROVIDER:
			case CloudPackage.MACHINE_SOFT_LAYER__USERNAME:
			case CloudPackage.MACHINE_SOFT_LAYER__API_KEY:
			case CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID:
			case CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID:
			case CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME:
			case CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE:
			case CloudPackage.MACHINE_SOFT_LAYER__TENANT:
			case CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT:
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
