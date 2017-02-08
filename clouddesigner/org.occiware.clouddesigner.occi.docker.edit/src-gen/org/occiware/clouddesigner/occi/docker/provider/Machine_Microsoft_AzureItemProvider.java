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
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_Microsoft_AzureItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Microsoft_AzureItemProvider(AdapterFactory adapterFactory) {
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

			addSubscription_idPropertyDescriptor(object);
			addSubscription_certPropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addResource_groupPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addSsh_userPropertyDescriptor(object);
			addVnetPropertyDescriptor(object);
			addSubnetPropertyDescriptor(object);
			addSubnet_prefixPropertyDescriptor(object);
			addAvailability_setPropertyDescriptor(object);
			addOpen_portPropertyDescriptor(object);
			addPrivate_ip_addressPropertyDescriptor(object);
			addNo_public_ipPropertyDescriptor(object);
			addStatic_public_ipPropertyDescriptor(object);
			addDocker_portPropertyDescriptor(object);
			addUse_private_ipPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Subscription id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscription_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_subscription_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_subscription_id_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscription cert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscription_certPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_subscription_cert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_subscription_cert_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT,
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
				 getString("_UI_Machine_Microsoft_Azure_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_environment_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__ENVIRONMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_location_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResource_groupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_resource_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_resource_group_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_size_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh user feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSsh_userPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_ssh_user_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_ssh_user_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SSH_USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_vnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_vnet_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__VNET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_subnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_subnet_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBNET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnet_prefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_subnet_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_subnet_prefix_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availability set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailability_setPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_availability_set_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_availability_set_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpen_portPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_open_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_open_port_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__OPEN_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Private ip address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivate_ip_addressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_private_ip_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_private_ip_address_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No public ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNo_public_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_no_public_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_no_public_ip_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static public ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatic_public_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_static_public_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_static_public_ip_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Docker port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocker_portPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_docker_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_docker_port_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__DOCKER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use private ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUse_private_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Microsoft_Azure_use_private_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_use_private_ip_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP,
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
				 getString("_UI_Machine_Microsoft_Azure_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Microsoft_Azure_image_feature", "_UI_Machine_Microsoft_Azure_type"),
				 DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_Microsoft_Azure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_Microsoft_Azure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_Microsoft_Azure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_Microsoft_Azure_type") :
			getString("_UI_Machine_Microsoft_Azure_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_Microsoft_Azure.class)) {
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__ENVIRONMENT:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__LOCATION:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__RESOURCE_GROUP:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SIZE:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SSH_USER:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__VNET:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__SUBNET_PREFIX:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__AVAILABILITY_SET:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__OPEN_PORT:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__PRIVATE_IP_ADDRESS:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__NO_PUBLIC_IP:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__STATIC_PUBLIC_IP:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__DOCKER_PORT:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__USE_PRIVATE_IP:
			case DockerPackage.MACHINE_MICROSOFT_AZURE__IMAGE:
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
