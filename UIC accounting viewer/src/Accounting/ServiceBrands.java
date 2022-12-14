/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Brands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceBrands#getServiceBrands <em>Service Brands</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceBrands()
 * @model
 * @generated
 */
public interface ServiceBrands extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Brands</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Brands</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getServiceBrands_ServiceBrands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBrand> getServiceBrands();

} // ServiceBrands
