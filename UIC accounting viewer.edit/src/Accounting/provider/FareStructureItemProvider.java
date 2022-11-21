/**
 */
package Accounting.provider;


import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.FareStructure;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Accounting.FareStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareStructureItemProvider 
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
	public FareStructureItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__STATION_NAMES);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__CALENDARS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__TEXTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__PRICES);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS);
			childrenFeatures.add(AccountingPackage.Literals.FARE_STRUCTURE__LUGGAGE_CONSTRAINTS);
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
	 * This returns FareStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FareStructure_type");
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

		switch (notification.getFeatureID(FareStructure.class)) {
			case AccountingPackage.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS:
			case AccountingPackage.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS:
			case AccountingPackage.FARE_STRUCTURE__STATION_NAMES:
			case AccountingPackage.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS:
			case AccountingPackage.FARE_STRUCTURE__CALENDARS:
			case AccountingPackage.FARE_STRUCTURE__TEXTS:
			case AccountingPackage.FARE_STRUCTURE__REDUCTION_CARDS:
			case AccountingPackage.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES:
			case AccountingPackage.FARE_STRUCTURE__FARE_ELEMENTS:
			case AccountingPackage.FARE_STRUCTURE__COMBINATION_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__REGIONAL_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__CONNECTION_POINTS:
			case AccountingPackage.FARE_STRUCTURE__CARRIER_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__SERVICE_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__PASSENGER_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__REDUCTION_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__AFTER_SALES_RULES:
			case AccountingPackage.FARE_STRUCTURE__PRICES:
			case AccountingPackage.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS:
			case AccountingPackage.FARE_STRUCTURE__RESERVATION_PARAMETERS:
			case AccountingPackage.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES:
			case AccountingPackage.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS:
			case AccountingPackage.FARE_STRUCTURE__ZONE_DEFINITIONS:
			case AccountingPackage.FARE_STRUCTURE__LUGGAGE_CONSTRAINTS:
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
				(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS,
				 AccountingFactory.eINSTANCE.createServiceClassDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS,
				 AccountingFactory.eINSTANCE.createServiceLevelDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__STATION_NAMES,
				 AccountingFactory.eINSTANCE.createStationNames()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS,
				 AccountingFactory.eINSTANCE.createFareStationSetDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__CALENDARS,
				 AccountingFactory.eINSTANCE.createCalendars()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__TEXTS,
				 AccountingFactory.eINSTANCE.createTexts()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS,
				 AccountingFactory.eINSTANCE.createReductionCards()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES,
				 AccountingFactory.eINSTANCE.createFareConstraintBundles()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS,
				 AccountingFactory.eINSTANCE.createFareElements()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createCombinationConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createSalesAvailabilityConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createTravelValidityConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createRegionalConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS,
				 AccountingFactory.eINSTANCE.createConnectionPoints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createCarrierConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createServiceConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createPassengerConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createTotalPassengerCombinationConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createReductionConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createPersonalDataConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES,
				 AccountingFactory.eINSTANCE.createAfterSalesRules()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__PRICES,
				 AccountingFactory.eINSTANCE.createPrices()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createFulfillmentConstraints()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS,
				 AccountingFactory.eINSTANCE.createReservationParameters()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES,
				 AccountingFactory.eINSTANCE.createSupportedOnlineServices()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS,
				 AccountingFactory.eINSTANCE.createFareResourceLocations()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS,
				 AccountingFactory.eINSTANCE.createZoneDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(AccountingPackage.Literals.FARE_STRUCTURE__LUGGAGE_CONSTRAINTS,
				 AccountingFactory.eINSTANCE.createLuggageConstraints()));
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
