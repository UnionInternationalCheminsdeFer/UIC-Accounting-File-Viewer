/**
 */
package Accounting.provider;


import Accounting.AccountingPackage;
import Accounting.FareConstraintBundle;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link Accounting.FareConstraintBundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareConstraintBundleItemProvider 
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
	public FareConstraintBundleItemProvider(AdapterFactory adapterFactory) {
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
			addDefaultFareTypePropertyDescriptor(object);
			addDataDescriptionPropertyDescriptor(object);
			addCarrierConstraintPropertyDescriptor(object);
			addSalesAvailabilityPropertyDescriptor(object);
			addTravelValidityPropertyDescriptor(object);
			addCombinationConstraintPropertyDescriptor(object);
			addPersonalDataConstraintPropertyDescriptor(object);
			addFulfillmentConstraintPropertyDescriptor(object);
			addTotalPassengerConstraintPropertyDescriptor(object);
			addDefaultRegulatoryConditionsPropertyDescriptor(object);
			addDataSourcePropertyDescriptor(object);
			addConvertedBundlesPropertyDescriptor(object);
			addLuggageConstraintPropertyDescriptor(object);
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
				 getString("_UI_FareConstraintBundle_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_id_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Fare Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFareTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_defaultFareType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_defaultFareType_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE,
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
				 getString("_UI_FareConstraintBundle_dataDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_dataDescription_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_carrierConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_carrierConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales Availability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesAvailabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_salesAvailability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_salesAvailability_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Validity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelValidityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_travelValidity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_travelValidity_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combination Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinationConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_combinationConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_combinationConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Personal Data Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersonalDataConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_personalDataConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_personalDataConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fulfillment Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFulfillmentConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_fulfillmentConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_fulfillmentConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Passenger Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalPassengerConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_totalPassengerConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_totalPassengerConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Regulatory Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRegulatoryConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_defaultRegulatoryConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_defaultRegulatoryConditions_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_dataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_dataSource_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Converted Bundles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvertedBundlesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_convertedBundles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_convertedBundles_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luggage Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggageConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareConstraintBundle_luggageConstraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareConstraintBundle_luggageConstraint_feature", "_UI_FareConstraintBundle_type"),
				 AccountingPackage.Literals.FARE_CONSTRAINT_BUNDLE__LUGGAGE_CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FareConstraintBundle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareConstraintBundle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FareConstraintBundle)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_FareConstraintBundle_type") :
			getString("_UI_FareConstraintBundle_type") + " " + label;
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

		switch (notification.getFeatureID(FareConstraintBundle.class)) {
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE__ID:
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE:
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION:
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS:
			case AccountingPackage.FARE_CONSTRAINT_BUNDLE__DATA_SOURCE:
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
