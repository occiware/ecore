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
package org.occiware.clouddesigner.occi.hypervisor.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_VirtualBoxItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VirtualBoxItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
			addOn_poweroffPropertyDescriptor(object);
			addOn_rebootPropertyDescriptor(object);
			addOn_crashPropertyDescriptor(object);
			addMaximum_memoryPropertyDescriptor(object);
			addCurrent_memoryPropertyDescriptor(object);
			addVcpuPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_type_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_features_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__FEATURES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On poweroff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOn_poweroffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_on_poweroff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_on_poweroff_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__ON_POWEROFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On reboot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOn_rebootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_on_reboot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_on_reboot_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__ON_REBOOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On crash feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOn_crashPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_on_crash_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_on_crash_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__ON_CRASH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum_memoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_maximum_memory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_maximum_memory_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_memoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_current_memory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_current_memory_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vcpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVcpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_vcpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_vcpu_feature", "_UI_Machine_VirtualBox_type"),
				 HypervisorPackage.Literals.MACHINE_VIRTUAL_BOX__VCPU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_VirtualBox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_VirtualBox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_VirtualBox)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_VirtualBox_type") :
			getString("_UI_Machine_VirtualBox_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_VirtualBox.class)) {
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__TYPE:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__FEATURES:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_POWEROFF:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_REBOOT:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__ON_CRASH:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__MAXIMUM_MEMORY:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__CURRENT_MEMORY:
			case HypervisorPackage.MACHINE_VIRTUAL_BOX__VCPU:
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
