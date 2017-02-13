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
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox} object.
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

			addBoot2docker_urlPropertyDescriptor(object);
			addDisk_sizePropertyDescriptor(object);
			addHost_dns_resolverPropertyDescriptor(object);
			addImport_boot2docker_vmPropertyDescriptor(object);
			addHostonly_cidrPropertyDescriptor(object);
			addHostonly_nictypePropertyDescriptor(object);
			addHostonly_nicpromiscPropertyDescriptor(object);
			addNo_sharePropertyDescriptor(object);
			addNo_dns_proxyPropertyDescriptor(object);
			addNo_vtx_checkPropertyDescriptor(object);
			addShare_folderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Boot2docker url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoot2docker_urlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_boot2docker_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_boot2docker_url_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Machine_VirtualBox_disk_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_disk_size_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host dns resolver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHost_dns_resolverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_host_dns_resolver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_host_dns_resolver_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import boot2docker vm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImport_boot2docker_vmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_import_boot2docker_vm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_import_boot2docker_vm_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hostonly cidr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostonly_cidrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_hostonly_cidr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_hostonly_cidr_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hostonly nictype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostonly_nictypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_hostonly_nictype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_hostonly_nictype_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hostonly nicpromisc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostonly_nicpromiscPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_hostonly_nicpromisc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_hostonly_nicpromisc_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No share feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNo_sharePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_no_share_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_no_share_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__NO_SHARE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No dns proxy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNo_dns_proxyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_no_dns_proxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_no_dns_proxy_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No vtx check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNo_vtx_checkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_no_vtx_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_no_vtx_check_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Share folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShare_folderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VirtualBox_share_folder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VirtualBox_share_folder_feature", "_UI_Machine_VirtualBox_type"),
				 DockerPackage.Literals.MACHINE_VIRTUAL_BOX__SHARE_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			case DockerPackage.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL:
			case DockerPackage.MACHINE_VIRTUAL_BOX__DISK_SIZE:
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOST_DNS_RESOLVER:
			case DockerPackage.MACHINE_VIRTUAL_BOX__IMPORT_BOOT2DOCKER_VM:
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_CIDR:
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICTYPE:
			case DockerPackage.MACHINE_VIRTUAL_BOX__HOSTONLY_NICPROMISC:
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_SHARE:
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_DNS_PROXY:
			case DockerPackage.MACHINE_VIRTUAL_BOX__NO_VTX_CHECK:
			case DockerPackage.MACHINE_VIRTUAL_BOX__SHARE_FOLDER:
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
