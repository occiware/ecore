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
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_Hp_HelionItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_Hp_HelionItemProvider(AdapterFactory adapterFactory) {
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
			addAccess_keyPropertyDescriptor(object);
			addSecret_keyPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addZonePropertyDescriptor(object);
			addFlavor_idPropertyDescriptor(object);
			addKey_pairPropertyDescriptor(object);
			addSecurity_groupPropertyDescriptor(object);
			addFloating_ipPropertyDescriptor(object);
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
				 getString("_UI_Machine_Hp_Helion_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_provider_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__PROVIDER,
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
				 getString("_UI_Machine_Hp_Helion_tenant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_tenant_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__TENANT,
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
				 getString("_UI_Machine_Hp_Helion_access_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_access_key_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__ACCESS_KEY,
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
				 getString("_UI_Machine_Hp_Helion_secret_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_secret_key_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__SECRET_KEY,
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
				 getString("_UI_Machine_Hp_Helion_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_image_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Hp_Helion_zone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_zone_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__ZONE,
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
				 getString("_UI_Machine_Hp_Helion_flavor_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_flavor_id_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__FLAVOR_ID,
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
				 getString("_UI_Machine_Hp_Helion_key_pair_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_key_pair_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__KEY_PAIR,
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
				 getString("_UI_Machine_Hp_Helion_security_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_security_group_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floating ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloating_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Hp_Helion_floating_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Hp_Helion_floating_ip_feature", "_UI_Machine_Hp_Helion_type"),
				 CloudPackage.Literals.MACHINE_HP_HELION__FLOATING_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_Hp_Helion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_Hp_Helion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_Hp_Helion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_Hp_Helion_type") :
			getString("_UI_Machine_Hp_Helion_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_Hp_Helion.class)) {
			case CloudPackage.MACHINE_HP_HELION__PROVIDER:
			case CloudPackage.MACHINE_HP_HELION__TENANT:
			case CloudPackage.MACHINE_HP_HELION__ACCESS_KEY:
			case CloudPackage.MACHINE_HP_HELION__SECRET_KEY:
			case CloudPackage.MACHINE_HP_HELION__IMAGE:
			case CloudPackage.MACHINE_HP_HELION__ZONE:
			case CloudPackage.MACHINE_HP_HELION__FLAVOR_ID:
			case CloudPackage.MACHINE_HP_HELION__KEY_PAIR:
			case CloudPackage.MACHINE_HP_HELION__SECURITY_GROUP:
			case CloudPackage.MACHINE_HP_HELION__FLOATING_IP:
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
