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

import org.occiware.clouddesigner.occi.infrastructure.provider.NetworkinterfaceItemProvider;

import org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.vmware.Hostnetworkadapter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HostnetworkadapterItemProvider extends NetworkinterfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostnetworkadapterItemProvider(AdapterFactory adapterFactory) {
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
			addDriverPropertyDescriptor(object);
			addKeyPropertyDescriptor(object);
			addPciPropertyDescriptor(object);
			addSubnetMaskPropertyDescriptor(object);
			addWakeOnLanSupportedPropertyDescriptor(object);
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
				 getString("_UI_Hostnetworkadapter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_name_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnetworkadapter_driver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_driver_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_Driver(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnetworkadapter_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_key_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_Key(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pci feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPciPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnetworkadapter_pci_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_pci_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_Pci(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnetMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnetworkadapter_subnetMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_subnetMask_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_SubnetMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wake On Lan Supported feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWakeOnLanSupportedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnetworkadapter_wakeOnLanSupported_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnetworkadapter_wakeOnLanSupported_feature", "_UI_Hostnetworkadapter_type"),
				 VmwarePackage.eINSTANCE.getHostnetworkadapter_WakeOnLanSupported(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Hostnetworkadapter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hostnetworkadapter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Hostnetworkadapter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Hostnetworkadapter_type") :
			getString("_UI_Hostnetworkadapter_type") + " " + label;
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

		switch (notification.getFeatureID(Hostnetworkadapter.class)) {
			case VmwarePackage.HOSTNETWORKADAPTER__NAME:
			case VmwarePackage.HOSTNETWORKADAPTER__DRIVER:
			case VmwarePackage.HOSTNETWORKADAPTER__KEY:
			case VmwarePackage.HOSTNETWORKADAPTER__PCI:
			case VmwarePackage.HOSTNETWORKADAPTER__SUBNET_MASK:
			case VmwarePackage.HOSTNETWORKADAPTER__WAKE_ON_LAN_SUPPORTED:
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
