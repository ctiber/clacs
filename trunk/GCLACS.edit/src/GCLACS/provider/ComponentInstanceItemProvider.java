/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS.provider;


import GCLACS.ComponentInstance;
import GCLACS.GCLACSFactory;
import GCLACS.GCLACSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

/**
 * This is the item provider adapter for a {@link GCLACS.ComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstanceItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addDefineByDescriptorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_name_feature", "_UI_ComponentInstance_type"),
				 GCLACSPackage.Literals.COMPONENT_INSTANCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_kind_feature", "_UI_ComponentInstance_type"),
				 GCLACSPackage.Literals.COMPONENT_INSTANCE__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_width_feature", "_UI_ComponentInstance_type"),
				 GCLACSPackage.Literals.COMPONENT_INSTANCE__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_height_feature", "_UI_ComponentInstance_type"),
				 GCLACSPackage.Literals.COMPONENT_INSTANCE__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Define By Descriptor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefineByDescriptorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_defineByDescriptor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_defineByDescriptor_feature", "_UI_ComponentInstance_type"),
				 GCLACSPackage.Literals.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GCLACSPackage.Literals.COMPONENT_INSTANCE__INTERFACE);
			childrenFeatures.add(GCLACSPackage.Literals.COMPONENT_INSTANCE__COMPONENT_INSTANCE);
			childrenFeatures.add(GCLACSPackage.Literals.COMPONENT_INSTANCE__PORT);
			childrenFeatures.add(GCLACSPackage.Literals.COMPONENT_INSTANCE__BINDING);
			childrenFeatures.add(GCLACSPackage.Literals.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInstance_type") :
			getString("_UI_ComponentInstance_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInstance.class)) {
			case GCLACSPackage.COMPONENT_INSTANCE__NAME:
			case GCLACSPackage.COMPONENT_INSTANCE__KIND:
			case GCLACSPackage.COMPONENT_INSTANCE__WIDTH:
			case GCLACSPackage.COMPONENT_INSTANCE__HEIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
			case GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__INTERFACE,
				 GCLACSFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__COMPONENT_INSTANCE,
				 GCLACSFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__PORT,
				 GCLACSFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__PORT,
				 GCLACSFactory.eINSTANCE.createRequiredPort()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__PORT,
				 GCLACSFactory.eINSTANCE.createProvidedPort()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__BINDING,
				 GCLACSFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(GCLACSPackage.Literals.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR,
				 ""));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GclacsEditPlugin.INSTANCE;
	}

}
