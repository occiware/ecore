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
import org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_ProfitBricksItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_ProfitBricksItemProvider(AdapterFactory adapterFactory) {
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
			addUsernamePropertyDescriptor(object);
			addApi_keyPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
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
				 getString("_UI_Machine_ProfitBricks_provider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_provider_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__PROVIDER,
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
				 getString("_UI_Machine_ProfitBricks_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_username_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Api key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApi_keyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_ProfitBricks_api_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_api_key_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__API_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_ProfitBricks_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_email_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__EMAIL,
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
				 getString("_UI_Machine_ProfitBricks_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_password_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_ProfitBricks_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_ProfitBricks_location_feature", "_UI_Machine_ProfitBricks_type"),
				 CloudPackage.Literals.MACHINE_PROFIT_BRICKS__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_ProfitBricks.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_ProfitBricks"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_ProfitBricks)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_ProfitBricks_type") :
			getString("_UI_Machine_ProfitBricks_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_ProfitBricks.class)) {
			case CloudPackage.MACHINE_PROFIT_BRICKS__PROVIDER:
			case CloudPackage.MACHINE_PROFIT_BRICKS__USERNAME:
			case CloudPackage.MACHINE_PROFIT_BRICKS__API_KEY:
			case CloudPackage.MACHINE_PROFIT_BRICKS__EMAIL:
			case CloudPackage.MACHINE_PROFIT_BRICKS__PASSWORD:
			case CloudPackage.MACHINE_PROFIT_BRICKS__LOCATION:
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
