/**
 */
package org.occiware.clouddesigner.occi.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * This is the item provider adapter for a
 * {@link org.occiware.clouddesigner.occi.Attribute} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addMultiple_valuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_name_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mutable feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_mutable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_mutable_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__MUTABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_required_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_required_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__REQUIRED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_default_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_default_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__DEFAULT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_description_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		final IItemLabelProvider lp = new IItemLabelProvider() {
			public String getText(Object object) {
				if (object instanceof EDataType) {
					if (((EDataType) object).eContainer() instanceof EPackage) {
						return ((EPackage) ((EDataType) object).eContainer()).getNsURI() + '#'
								+ ((EDataType) object).getName();
					} else if (((EDataType) object).eContainer() instanceof Extension) {
						return ((Extension) ((EDataType) object).eContainer()).getScheme() + '#'
								+ ((EDataType) object).getName();
					}
					return ((EDataType) object).getName() + '[' + ((EDataType) object).getInstanceTypeName() + ']';
				}
				return "";
			}

			public Object getImage(Object object) {
				return null;
			}
		};
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_type_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__TYPE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						List<EDataType> list = new ArrayList<EDataType>();
						for (Object choice : super.getChoiceOfValues(object)) {
							if (choice instanceof EDataType && ((EDataType) choice).eContainer() != null
									&& ((((EDataType) choice).eContainer() instanceof Extension)
											|| (((EPackage) ((EDataType) choice).eContainer()).getNsURI()
													.equals(OCCIPackage.eINSTANCE.getNsURI())))) {
								list.add((EDataType) choice);
							}
						}
						return list;
					}

					@Override
					public IItemLabelProvider getLabelProvider(Object object) {
						if (object instanceof Attribute) {
							return lp;
						}
						return super.getLabelProvider(object);
					}

				});
	}

	/**
	 * This adds a property descriptor for the Multiple values feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMultiple_valuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_multiple_values_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_multiple_values_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__MULTIPLE_VALUES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Attribute.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Attribute) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Attribute_type")
				: getString("_UI_Attribute_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Attribute.class)) {
		case OCCIPackage.ATTRIBUTE__NAME:
		case OCCIPackage.ATTRIBUTE__MUTABLE:
		case OCCIPackage.ATTRIBUTE__REQUIRED:
		case OCCIPackage.ATTRIBUTE__DEFAULT:
		case OCCIPackage.ATTRIBUTE__DESCRIPTION:
		case OCCIPackage.ATTRIBUTE__MULTIPLE_VALUES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OCCIEditPlugin.INSTANCE;
	}

}
