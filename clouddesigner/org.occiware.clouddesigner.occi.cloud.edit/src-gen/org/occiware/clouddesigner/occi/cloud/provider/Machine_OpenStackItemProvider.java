/**
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
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.cloud.Machine_OpenStack} object.
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

			addProviderPropertyDescriptor(object);
			addTenantPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addEndpointPropertyDescriptor(object);
			addImage_idPropertyDescriptor(object);
			addFlavor_namePropertyDescriptor(object);
			addFlavor_idPropertyDescriptor(object);
			addSecurity_groupPropertyDescriptor(object);
			addNetwork_namePropertyDescriptor(object);
			addNetwork_idPropertyDescriptor(object);
			addFloating_ip_poolPropertyDescriptor(object);
			addImage_namePropertyDescriptor(object);
			addKeypairPropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
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
				 getString("_UI_Machine_OpenStack_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_provider_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tenant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTenantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_tenant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_tenant_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__TENANT,
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
				 CloudPackage.Literals.MACHINE_OPEN_STACK__USERNAME,
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
				 CloudPackage.Literals.MACHINE_OPEN_STACK__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_endpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_endpoint_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__ENDPOINT,
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
				 CloudPackage.Literals.MACHINE_OPEN_STACK__IMAGE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flavor name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlavor_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_flavor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_flavor_name_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__FLAVOR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 CloudPackage.Literals.MACHINE_OPEN_STACK__FLAVOR_ID,
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
				 getString("_UI_Machine_OpenStack_security_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_security_group_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetwork_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_network_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_network_name_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__NETWORK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetwork_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_network_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_network_id_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__NETWORK_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floating ip pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloating_ip_poolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_floating_ip_pool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_floating_ip_pool_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__FLOATING_IP_POOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImage_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_image_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_image_name_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__IMAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keypair feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeypairPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_OpenStack_keypair_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_OpenStack_keypair_feature", "_UI_Machine_OpenStack_type"),
				 CloudPackage.Literals.MACHINE_OPEN_STACK__KEYPAIR,
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
				 CloudPackage.Literals.MACHINE_OPEN_STACK__REGION,
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
			case CloudPackage.MACHINE_OPEN_STACK__PROVIDER:
			case CloudPackage.MACHINE_OPEN_STACK__TENANT:
			case CloudPackage.MACHINE_OPEN_STACK__USERNAME:
			case CloudPackage.MACHINE_OPEN_STACK__PASSWORD:
			case CloudPackage.MACHINE_OPEN_STACK__ENDPOINT:
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_ID:
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_NAME:
			case CloudPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
			case CloudPackage.MACHINE_OPEN_STACK__SECURITY_GROUP:
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_NAME:
			case CloudPackage.MACHINE_OPEN_STACK__NETWORK_ID:
			case CloudPackage.MACHINE_OPEN_STACK__FLOATING_IP_POOL:
			case CloudPackage.MACHINE_OPEN_STACK__IMAGE_NAME:
			case CloudPackage.MACHINE_OPEN_STACK__KEYPAIR:
			case CloudPackage.MACHINE_OPEN_STACK__REGION:
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
