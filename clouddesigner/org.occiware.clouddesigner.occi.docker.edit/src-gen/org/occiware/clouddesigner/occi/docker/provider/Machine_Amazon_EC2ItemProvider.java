/**
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
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2} object.
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

			addAccess_keyPropertyDescriptor(object);
			addAmiPropertyDescriptor(object);
			addInstance_typePropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addRoot_sizePropertyDescriptor(object);
			addSecret_keyPropertyDescriptor(object);
			addSecurity_groupPropertyDescriptor(object);
			addSession_tokenPropertyDescriptor(object);
			addSubnet_idPropertyDescriptor(object);
			addVpc_idPropertyDescriptor(object);
			addZonePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__ACCESS_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ami feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_ami_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_ami_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__AMI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstance_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_instance_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_instance_type_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__INSTANCE_TYPE,
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
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoot_sizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_root_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_root_size_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__ROOT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__SECRET_KEY,
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
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSession_tokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_session_token_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_session_token_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__SESSION_TOKEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subnet id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubnet_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_subnet_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_subnet_id_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__SUBNET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vpc id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpc_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_Amazon_EC2_vpc_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_vpc_id_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__VPC_ID,
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
				 getString("_UI_Machine_Amazon_EC2_zone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_Amazon_EC2_zone_feature", "_UI_Machine_Amazon_EC2_type"),
				 DockerPackage.Literals.MACHINE_AMAZON_EC2__ZONE,
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
			case DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
			case DockerPackage.MACHINE_AMAZON_EC2__AMI:
			case DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE:
			case DockerPackage.MACHINE_AMAZON_EC2__REGION:
			case DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE:
			case DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
			case DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
			case DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN:
			case DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID:
			case DockerPackage.MACHINE_AMAZON_EC2__VPC_ID:
			case DockerPackage.MACHINE_AMAZON_EC2__ZONE:
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
