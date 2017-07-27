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
package org.occiware.clouddesigner.occi.linkeddata.provider;


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

import org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory;

import org.occiware.clouddesigner.occi.linkeddata.Ldproject;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataFactory;
import org.occiware.clouddesigner.occi.linkeddata.LinkeddataPackage;

import org.occiware.clouddesigner.occi.platform.PlatformFactory;

import org.occiware.clouddesigner.occi.provider.ResourceItemProvider;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.linkeddata.Ldproject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LdprojectItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdprojectItemProvider(AdapterFactory adapterFactory) {
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
			addLifecyclePropertyDescriptor(object);
			addRobustnessPropertyDescriptor(object);
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
				 getString("_UI_Ldproject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ldproject_name_feature", "_UI_Ldproject_type"),
				 LinkeddataPackage.Literals.LDPROJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lifecycle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifecyclePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ldproject_lifecycle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ldproject_lifecycle_feature", "_UI_Ldproject_type"),
				 LinkeddataPackage.Literals.LDPROJECT__LIFECYCLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Robustness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRobustnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ldproject_robustness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ldproject_robustness_feature", "_UI_Ldproject_type"),
				 LinkeddataPackage.Literals.LDPROJECT__ROBUSTNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Ldproject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ldproject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ldproject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Ldproject_type") :
			getString("_UI_Ldproject_type") + " " + label;
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

		switch (notification.getFeatureID(Ldproject.class)) {
			case LinkeddataPackage.LDPROJECT__NAME:
			case LinkeddataPackage.LDPROJECT__LIFECYCLE:
			case LinkeddataPackage.LDPROJECT__ROBUSTNESS:
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
				 LinkeddataFactory.eINSTANCE.createLddatabaselink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 LinkeddataFactory.eINSTANCE.createLdprojectlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 LinkeddataFactory.eINSTANCE.createLdcontains()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createStoragelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createNetworkinterface()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 PlatformFactory.eINSTANCE.createComponentlink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LinkeddataEditPlugin.INSTANCE;
	}

}
