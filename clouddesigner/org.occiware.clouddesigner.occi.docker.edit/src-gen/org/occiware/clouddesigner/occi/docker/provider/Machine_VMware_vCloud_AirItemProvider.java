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
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_VMware_vCloud_AirItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VMware_vCloud_AirItemProvider(AdapterFactory adapterFactory) {
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

			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addCatalogitemPropertyDescriptor(object);
			addComputeidPropertyDescriptor(object);
			addCpu_countPropertyDescriptor(object);
			addDocker_portPropertyDescriptor(object);
			addEdgegatewayPropertyDescriptor(object);
			addMemory_sizePropertyDescriptor(object);
			addVapp_namePropertyDescriptor(object);
			addOrgvdcnetworkPropertyDescriptor(object);
			addProvisionPropertyDescriptor(object);
			addPublicipPropertyDescriptor(object);
			addSsh_portPropertyDescriptor(object);
			addVdcidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Machine_VMware_vCloud_Air_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_username_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__USERNAME,
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
				 getString("_UI_Machine_VMware_vCloud_Air_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_password_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_catalog_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CATALOG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Catalogitem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCatalogitemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_catalogitem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_catalogitem_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Computeid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputeidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_computeid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_computeid_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpu_countPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_cpu_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_cpu_count_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Docker port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocker_portPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_docker_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_docker_port_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edgegateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgegatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_edgegateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_edgegateway_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemory_sizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_memory_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_memory_size_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vapp name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVapp_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_vapp_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_vapp_name_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orgvdcnetwork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrgvdcnetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_orgvdcnetwork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_orgvdcnetwork_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_provision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_provision_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PROVISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publicip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_publicip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_publicip_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssh port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSsh_portPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_ssh_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_ssh_port_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vdcid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVdcidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vCloud_Air_vdcid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vCloud_Air_vdcid_feature", "_UI_Machine_VMware_vCloud_Air_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__VDCID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_VMware_vCloud_Air.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_VMware_vCloud_Air"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_VMware_vCloud_Air)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_VMware_vCloud_Air_type") :
			getString("_UI_Machine_VMware_vCloud_Air_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_VMware_vCloud_Air.class)) {
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__USERNAME:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOG:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PROVISION:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT:
			case DockerPackage.MACHINE_VMWARE_VCLOUD_AIR__VDCID:
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
