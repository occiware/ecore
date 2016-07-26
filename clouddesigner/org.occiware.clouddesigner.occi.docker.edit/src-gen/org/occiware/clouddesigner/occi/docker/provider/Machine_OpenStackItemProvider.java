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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_OpenStackItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_OpenStackItemProvider(AdapterFactory adapterFactory) {
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

			addFlavor_idPropertyDescriptor(object);
			addImage_idPropertyDescriptor(object);
			addAuth_urlPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addTenant_namePropertyDescriptor(object);
			addTenant_idPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addEndpoint_typePropertyDescriptor(object);
			addNet_idPropertyDescriptor(object);
			addSec_groupsPropertyDescriptor(object);
			addFloatingip_poolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Flavor id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlavor_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_flavor_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_flavor_id_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__FLAVOR_ID,
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
				 getString("_UI_Machine_OpenStack_image_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_image_id_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__IMAGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auth url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuth_urlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_auth_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_auth_url_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__AUTH_URL,
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
				 getString("_UI_Machine_OpenStack_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_username_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_password_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenant_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_tenant_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_tenant_name_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__TENANT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenant_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_tenant_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_tenant_id_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__TENANT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Machine_OpenStack_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_region_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpoint_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_endpoint_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_endpoint_type_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__ENDPOINT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Net id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNet_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_net_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_net_id_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__NET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sec groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSec_groupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_sec_groups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_sec_groups_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__SEC_GROUPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floatingip pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloatingip_poolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_floatingip_pool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_floatingip_pool_feature", "_UI_Machine_OpenStack_type"),
				 DockerPackage.Literals.MACHINE_OPEN_STACK__FLOATINGIP_POOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_OpenStack.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_OpenStack"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_OpenStack)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_OpenStack_type") :
			getString("_UI_Machine_OpenStack_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_OpenStack.class)) {
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
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
