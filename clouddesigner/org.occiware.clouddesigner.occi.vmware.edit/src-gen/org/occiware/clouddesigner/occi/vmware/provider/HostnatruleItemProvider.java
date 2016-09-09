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

import org.occiware.clouddesigner.occi.OCCIPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory;

import org.occiware.clouddesigner.occi.provider.ResourceItemProvider;

import org.occiware.clouddesigner.occi.vmware.Hostnatrule;
import org.occiware.clouddesigner.occi.vmware.VmwareFactory;
import org.occiware.clouddesigner.occi.vmware.VmwarePackage;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.vmware.Hostnatrule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HostnatruleItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostnatruleItemProvider(AdapterFactory adapterFactory) {
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

			addActiveFtpPropertyDescriptor(object);
			addAllowAnyOuiPropertyDescriptor(object);
			addConfigPortPropertyDescriptor(object);
			addNatKeyPropertyDescriptor(object);
			addNatChangeOperationPropertyDescriptor(object);
			addIpGatewayAddressPropertyDescriptor(object);
			addUdpTimeOutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Active Ftp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveFtpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_activeFtp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_activeFtp_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_ActiveFtp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Any Oui feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowAnyOuiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_allowAnyOui_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_allowAnyOui_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_AllowAnyOui(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_configPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_configPort_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_ConfigPort(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nat Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_natKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_natKey_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_NatKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nat Change Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNatChangeOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_natChangeOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_natChangeOperation_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_NatChangeOperation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ip Gateway Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpGatewayAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_ipGatewayAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_ipGatewayAddress_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_IpGatewayAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Udp Time Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUdpTimeOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Hostnatrule_udpTimeOut_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Hostnatrule_udpTimeOut_feature", "_UI_Hostnatrule_type"),
				 VmwarePackage.eINSTANCE.getHostnatrule_UdpTimeOut(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Hostnatrule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Hostnatrule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Hostnatrule)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Hostnatrule_type") :
			getString("_UI_Hostnatrule_type") + " " + label;
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

		switch (notification.getFeatureID(Hostnatrule.class)) {
			case VmwarePackage.HOSTNATRULE__ACTIVE_FTP:
			case VmwarePackage.HOSTNATRULE__ALLOW_ANY_OUI:
			case VmwarePackage.HOSTNATRULE__CONFIG_PORT:
			case VmwarePackage.HOSTNATRULE__NAT_KEY:
			case VmwarePackage.HOSTNATRULE__NAT_CHANGE_OPERATION:
			case VmwarePackage.HOSTNATRULE__IP_GATEWAY_ADDRESS:
			case VmwarePackage.HOSTNATRULE__UDP_TIME_OUT:
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
				 VmwareFactory.eINSTANCE.createFolderlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createResourcepoollink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createClusterlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createDatacenterlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostsystemlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createDatastorelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualnetworkadapter()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualdisknetworklink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostnetworkadapter()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createSnapshotlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostfirewallrule()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHoststoragelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createServiceconsolenic()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createPortgrouplink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createHostnatportforwardlink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 VmwareFactory.eINSTANCE.createVirtualdisklink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createStoragelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createNetworkinterface()));
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
