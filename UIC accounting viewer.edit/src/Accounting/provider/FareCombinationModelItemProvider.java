/**
 */
package Accounting.provider;


import Accounting.AccountingPackage;
import Accounting.CombinationModel;
import Accounting.FareCombinationModel;

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
 * This is the item provider adapter for a {@link Accounting.FareCombinationModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FareCombinationModelItemProvider 
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
	public FareCombinationModelItemProvider(AdapterFactory adapterFactory) {
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

			addModelPropertyDescriptor(object);
			addCombinableCarriersPropertyDescriptor(object);
			addOnlyWhenCombinedPropertyDescriptor(object);
			addAllowedAllocatorsPropertyDescriptor(object);
			addReferenceClusterPropertyDescriptor(object);
			addAllowedClustersPropertyDescriptor(object);
			addAllowedCommonContractsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_model_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combinable Carriers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinableCarriersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_combinableCarriers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_combinableCarriers_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Only When Combined feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlyWhenCombinedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_onlyWhenCombined_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_onlyWhenCombined_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Allocators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedAllocatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_allowedAllocators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_allowedAllocators_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Cluster feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceClusterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_referenceCluster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_referenceCluster_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Clusters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedClustersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_allowedClusters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_allowedClusters_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Common Contracts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedCommonContractsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FareCombinationModel_allowedCommonContracts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FareCombinationModel_allowedCommonContracts_feature", "_UI_FareCombinationModel_type"),
				 AccountingPackage.Literals.FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FareCombinationModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FareCombinationModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CombinationModel labelValue = ((FareCombinationModel)object).getModel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_FareCombinationModel_type") :
			getString("_UI_FareCombinationModel_type") + " " + label;
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

		switch (notification.getFeatureID(FareCombinationModel.class)) {
			case AccountingPackage.FARE_COMBINATION_MODEL__MODEL:
			case AccountingPackage.FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED:
			case AccountingPackage.FARE_COMBINATION_MODEL__REFERENCE_CLUSTER:
			case AccountingPackage.FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS:
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
