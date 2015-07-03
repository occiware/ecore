/**
 */
package org.occiware.clouddesigner.occi.hypervisor.provider;


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

import org.occiware.clouddesigner.occi.hypervisor.Ethernet;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructureFactory;

import org.occiware.clouddesigner.occi.provider.ResourceItemProvider;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.hypervisor.Ethernet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EthernetItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetItemProvider(AdapterFactory adapterFactory) {
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

			addTarget_devPropertyDescriptor(object);
			addScript_pathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target dev feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTarget_devPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ethernet_target_dev_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ethernet_target_dev_feature", "_UI_Ethernet_type"),
				 HypervisorPackage.Literals.ETHERNET__TARGET_DEV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScript_pathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ethernet_script_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ethernet_script_path_feature", "_UI_Ethernet_type"),
				 HypervisorPackage.Literals.ETHERNET__SCRIPT_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Ethernet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ethernet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ethernet)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Ethernet_type") :
			getString("_UI_Ethernet_type") + " " + label;
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

		switch (notification.getFeatureID(Ethernet.class)) {
			case HypervisorPackage.ETHERNET__TARGET_DEV:
			case HypervisorPackage.ETHERNET__SCRIPT_PATH:
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
				 HypervisorFactory.eINSTANCE.createContains()));

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
		return HypervisorEditPlugin.INSTANCE;
	}

}
