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
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_Amazon_EC2ItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Amazon_EC2ItemProvider(AdapterFactory adapterFactory) {
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
			addAccess_keyPropertyDescriptor(object);
			addSecret_keyPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addSecurity_groupPropertyDescriptor(object);
			addKey_pairPropertyDescriptor(object);
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
				 getString("_UI_Machine_Amazon_EC2_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_provider_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccess_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_access_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_access_key_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__ACCESS_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secret key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecret_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_secret_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_secret_key_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__SECRET_KEY,
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
				 getString("_UI_Machine_Amazon_EC2_region_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_region_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__REGION,
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
				 getString("_UI_Machine_Amazon_EC2_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_image_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurity_groupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_security_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_security_group_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key pair feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKey_pairPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_key_pair_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_key_pair_feature", "_UI_Machine_Amazon_EC2_type"),
				 CloudPackage.Literals.MACHINE_AMAZON_EC2__KEY_PAIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_Amazon_EC2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_Amazon_EC2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_Amazon_EC2)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_Amazon_EC2_type") :
			getString("_UI_Machine_Amazon_EC2_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_Amazon_EC2.class)) {
			case CloudPackage.MACHINE_AMAZON_EC2__PROVIDER:
			case CloudPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
			case CloudPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
			case CloudPackage.MACHINE_AMAZON_EC2__REGION:
			case CloudPackage.MACHINE_AMAZON_EC2__IMAGE:
			case CloudPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
			case CloudPackage.MACHINE_AMAZON_EC2__KEY_PAIR:
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
