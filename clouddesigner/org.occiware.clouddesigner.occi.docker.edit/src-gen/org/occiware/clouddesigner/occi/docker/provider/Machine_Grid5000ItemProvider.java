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
import org.occiware.clouddesigner.occi.docker.Machine_Grid5000;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_Grid5000} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_Grid5000ItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Grid5000ItemProvider(AdapterFactory adapterFactory) {
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

			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addSitePropertyDescriptor(object);
			addWalltimePropertyDescriptor(object);
			addSsh_private_keyPropertyDescriptor(object);
			addSsh_public_keyPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addResource_propertiesPropertyDescriptor(object);
			addUse_job_reservationPropertyDescriptor(object);
			addHost_to_provisionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Machine_Grid5000_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_username_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__USERNAME,
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
				 getString("_UI_Machine_Grid5000_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_password_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_site_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_site_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__SITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Walltime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWalltimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_walltime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_walltime_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__WALLTIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh private key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSsh_private_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_ssh_private_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_ssh_private_key_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__SSH_PRIVATE_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh public key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSsh_public_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_ssh_public_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_ssh_public_key_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__SSH_PUBLIC_KEY,
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
				 getString("_UI_Machine_Grid5000_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_image_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResource_propertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_resource_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_resource_properties_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__RESOURCE_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use job reservation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUse_job_reservationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_use_job_reservation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_use_job_reservation_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__USE_JOB_RESERVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host to provision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHost_to_provisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Grid5000_host_to_provision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Grid5000_host_to_provision_feature", "_UI_Machine_Grid5000_type"),
				 DockerPackage.Literals.MACHINE_GRID5000__HOST_TO_PROVISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_Grid5000.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_Grid5000"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_Grid5000)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_Grid5000_type") :
			getString("_UI_Machine_Grid5000_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_Grid5000.class)) {
			case DockerPackage.MACHINE_GRID5000__USERNAME:
			case DockerPackage.MACHINE_GRID5000__PASSWORD:
			case DockerPackage.MACHINE_GRID5000__SITE:
			case DockerPackage.MACHINE_GRID5000__WALLTIME:
			case DockerPackage.MACHINE_GRID5000__SSH_PRIVATE_KEY:
			case DockerPackage.MACHINE_GRID5000__SSH_PUBLIC_KEY:
			case DockerPackage.MACHINE_GRID5000__IMAGE:
			case DockerPackage.MACHINE_GRID5000__RESOURCE_PROPERTIES:
			case DockerPackage.MACHINE_GRID5000__USE_JOB_RESERVATION:
			case DockerPackage.MACHINE_GRID5000__HOST_TO_PROVISION:
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
