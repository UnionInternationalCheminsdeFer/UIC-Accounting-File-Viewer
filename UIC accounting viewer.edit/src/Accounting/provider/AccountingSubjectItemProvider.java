/**
 */
package Accounting.provider;


import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.AccountingSubject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;

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
 * This is the item provider adapter for a {@link Accounting.AccountingSubject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingSubjectItemProvider 
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
	public AccountingSubjectItemProvider(AdapterFactory adapterFactory) {
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

			addFareIdPropertyDescriptor(object);
			addNumberOfItemsPropertyDescriptor(object);
			addSalesOfficeIdPropertyDescriptor(object);
			addSalesChannelPropertyDescriptor(object);
			addTrainPropertyDescriptor(object);
			addTravelDatePropertyDescriptor(object);
			addCountryOfSalePropertyDescriptor(object);
			addCarriersPropertyDescriptor(object);
			addRetailerPropertyDescriptor(object);
			addBilateralTariffIdentifierPropertyDescriptor(object);
			addInternationalJourneyPropertyDescriptor(object);
			addTripOriginPropertyDescriptor(object);
			addTripDestinationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fare Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_fareId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_fareId_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__FARE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_numberOfItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_numberOfItems_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales Office Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesOfficeIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_salesOfficeId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_salesOfficeId_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__SALES_OFFICE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sales Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSalesChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_salesChannel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_salesChannel_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__SALES_CHANNEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Train feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_train_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_train_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__TRAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_travelDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_travelDate_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__TRAVEL_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd")));
	}

	/**
	 * This adds a property descriptor for the Country Of Sale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountryOfSalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_countryOfSale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_countryOfSale_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__COUNTRY_OF_SALE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carriers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarriersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_carriers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_carriers_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__CARRIERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retailer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetailerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_retailer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_retailer_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__RETAILER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bilateral Tariff Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBilateralTariffIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_bilateralTariffIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_bilateralTariffIdentifier_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the International Journey feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternationalJourneyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_internationalJourney_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_internationalJourney_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trip Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTripOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_tripOrigin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_tripOrigin_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__TRIP_ORIGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trip Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTripDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingSubject_tripDestination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingSubject_tripDestination_feature", "_UI_AccountingSubject_type"),
				 AccountingPackage.Literals.ACCOUNTING_SUBJECT__TRIP_DESTINATION,
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
			childrenFeatures.add(AccountingPackage.Literals.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION);
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
	 * This returns AccountingSubject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AccountingSubject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AccountingSubject)object).getFareId();
		return label == null || label.length() == 0 ?
			getString("_UI_AccountingSubject_type") :
			getString("_UI_AccountingSubject_type") + " " + label;
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

		switch (notification.getFeatureID(AccountingSubject.class)) {
			case AccountingPackage.ACCOUNTING_SUBJECT__FARE_ID:
			case AccountingPackage.ACCOUNTING_SUBJECT__NUMBER_OF_ITEMS:
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_OFFICE_ID:
			case AccountingPackage.ACCOUNTING_SUBJECT__SALES_CHANNEL:
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAIN:
			case AccountingPackage.ACCOUNTING_SUBJECT__TRAVEL_DATE:
			case AccountingPackage.ACCOUNTING_SUBJECT__BILATERAL_TARIFF_IDENTIFIER:
			case AccountingPackage.ACCOUNTING_SUBJECT__INTERNATIONAL_JOURNEY:
			case AccountingPackage.ACCOUNTING_SUBJECT__TRIP_ORIGIN:
			case AccountingPackage.ACCOUNTING_SUBJECT__TRIP_DESTINATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AccountingPackage.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION:
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
				(AccountingPackage.Literals.ACCOUNTING_SUBJECT__LEGACY_DESCRIPTION,
				 AccountingFactory.eINSTANCE.createLegacyDescription()));
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
