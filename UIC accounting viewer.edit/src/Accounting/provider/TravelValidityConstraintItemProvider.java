/**
 */
package Accounting.provider;


import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.TravelValidityConstraint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
 * This is the item provider adapter for a {@link Accounting.TravelValidityConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelValidityConstraintItemProvider 
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
	public TravelValidityConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addValidDaysPropertyDescriptor(object);
			addTravelDaysPropertyDescriptor(object);
			addValidityTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_id_feature", "_UI_TravelValidityConstraint_type"),
				 AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_dataDescription_feature", "_UI_TravelValidityConstraint_type"),
				 AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Days feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidDaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_validDays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_validDays_feature", "_UI_TravelValidityConstraint_type"),
				 AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Days feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelDaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_travelDays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_travelDays_feature", "_UI_TravelValidityConstraint_type"),
				 AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validity Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidityTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelValidityConstraint_validityType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelValidityConstraint_validityType_feature", "_UI_TravelValidityConstraint_type"),
				 AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE,
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
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RANGE);
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT);
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE);
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY);
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT);
			childrenFeatures.add(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT);
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
	 * This returns TravelValidityConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TravelValidityConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TravelValidityConstraint)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TravelValidityConstraint_type") :
			getString("_UI_TravelValidityConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(TravelValidityConstraint.class)) {
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__ID:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__RANGE:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT:
			case AccountingPackage.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT:
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
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RANGE,
				 AccountingFactory.eINSTANCE.createValidityRange()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT,
				 AccountingFactory.eINSTANCE.createReturnValidityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE,
				 AccountingFactory.eINSTANCE.createExcludedTimeRange()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY,
				 AccountingFactory.eINSTANCE.createTrainValidity()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT,
				 AccountingFactory.eINSTANCE.createTripInterruptionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT,
				 AccountingFactory.eINSTANCE.createTripAllocationConstraint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
