/**
 */
package Accounting.provider;


import Accounting.AccountingDelivery;
import Accounting.AccountingPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;

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
 * This is the item provider adapter for a {@link Accounting.AccountingDelivery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountingDeliveryItemProvider 
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
	public AccountingDeliveryItemProvider(AdapterFactory adapterFactory) {
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
			addCreationDatePropertyDescriptor(object);
			addInvoicingPartyPropertyDescriptor(object);
			addInvoiceRecipientPropertyDescriptor(object);
			addStartStatementPeriodPropertyDescriptor(object);
			addEndStatementPeriodPropertyDescriptor(object);
			addPaymentTypePropertyDescriptor(object);
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
				 getString("_UI_AccountingDelivery_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingDelivery_id_feature", "_UI_AccountingDelivery_type"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_creationDate_feature"),
				 getString("_UI_AccountingDelivery_creationDate_description"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd\'T\'HH:mm:ssZZZ")));
	}

	/**
	 * This adds a property descriptor for the Invoicing Party feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvoicingPartyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_invoicingParty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingDelivery_invoicingParty_feature", "_UI_AccountingDelivery_type"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__INVOICING_PARTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invoice Recipient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvoiceRecipientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_invoiceRecipient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingDelivery_invoiceRecipient_feature", "_UI_AccountingDelivery_type"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__INVOICE_RECIPIENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Statement Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartStatementPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_startStatementPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingDelivery_startStatementPeriod_feature", "_UI_AccountingDelivery_type"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd\'T\'HH:mm:ssZZZ")));
	}

	/**
	 * This adds a property descriptor for the End Statement Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndStatementPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_endStatementPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AccountingDelivery_endStatementPeriod_feature", "_UI_AccountingDelivery_type"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd\'T\'HH:mm:ssZZZ")));
	}

	/**
	 * This adds a property descriptor for the Payment Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaymentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AccountingDelivery_paymentType_feature"),
				 getString("_UI_AccountingDelivery_paymentType_description"),
				 AccountingPackage.Literals.ACCOUNTING_DELIVERY__PAYMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AccountingDelivery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AccountingDelivery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AccountingDelivery)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AccountingDelivery_type") :
			getString("_UI_AccountingDelivery_type") + " " + label;
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

		switch (notification.getFeatureID(AccountingDelivery.class)) {
			case AccountingPackage.ACCOUNTING_DELIVERY__ID:
			case AccountingPackage.ACCOUNTING_DELIVERY__CREATION_DATE:
			case AccountingPackage.ACCOUNTING_DELIVERY__START_STATEMENT_PERIOD:
			case AccountingPackage.ACCOUNTING_DELIVERY__END_STATEMENT_PERIOD:
			case AccountingPackage.ACCOUNTING_DELIVERY__PAYMENT_TYPE:
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
