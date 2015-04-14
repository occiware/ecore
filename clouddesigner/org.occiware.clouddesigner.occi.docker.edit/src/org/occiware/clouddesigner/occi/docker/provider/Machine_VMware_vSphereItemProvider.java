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
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;

/**
 * This is the item provider adapter for a {@link org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Machine_VMware_vSphereItemProvider extends MachineItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine_VMware_vSphereItemProvider(AdapterFactory adapterFactory) {
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
			addBoot2docker_urlPropertyDescriptor(object);
			addCompute_ipPropertyDescriptor(object);
			addCpu_countPropertyDescriptor(object);
			addDatacenterPropertyDescriptor(object);
			addDatastorePropertyDescriptor(object);
			addDisk_sizePropertyDescriptor(object);
			addMemory_sizePropertyDescriptor(object);
			addNetworkPropertyDescriptor(object);
			addPoolPropertyDescriptor(object);
			addVcenterPropertyDescriptor(object);
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
				 getString("_UI_Machine_VMware_vSphere_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_username_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__USERNAME,
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
				 getString("_UI_Machine_VMware_vSphere_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_password_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Machine_VMware_vSphere_boot2docker_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_boot2docker_url_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compute ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompute_ipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_compute_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_compute_ip_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__COMPUTE_IP,
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
				 getString("_UI_Machine_VMware_vSphere_cpu_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_cpu_count_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__CPU_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_datacenter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_datacenter_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DATACENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datastore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatastorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_datastore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_datastore_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DATASTORE,
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
				 getString("_UI_Machine_VMware_vSphere_disk_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_disk_size_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DISK_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_Machine_VMware_vSphere_memory_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_memory_size_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_network_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_network_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__NETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_pool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_pool_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__POOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vcenter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVcenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Machine_VMware_vSphere_vcenter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Machine_VMware_vSphere_vcenter_feature", "_UI_Machine_VMware_vSphere_type"),
				 DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__VCENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Machine_VMware_vSphere.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Machine_VMware_vSphere"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Machine_VMware_vSphere)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Machine_VMware_vSphere_type") :
			getString("_UI_Machine_VMware_vSphere_type") + " " + label;
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

		switch (notification.getFeatureID(Machine_VMware_vSphere.class)) {
			case DockerPackage.MACHINE_VMWARE_VSPHERE__USERNAME:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__PASSWORD:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__COMPUTE_IP:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__CPU_COUNT:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATACENTER:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DATASTORE:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__DISK_SIZE:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__NETWORK:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__POOL:
			case DockerPackage.MACHINE_VMWARE_VSPHERE__VCENTER:
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
