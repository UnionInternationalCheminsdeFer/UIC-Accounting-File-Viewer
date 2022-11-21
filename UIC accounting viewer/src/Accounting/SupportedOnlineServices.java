/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Online Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.SupportedOnlineServices#getSupportedOnlineServices <em>Supported Online Services</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getSupportedOnlineServices()
 * @model
 * @generated
 */
public interface SupportedOnlineServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Supported Online Services</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.OnlineServiceType}.
	 * The literals are from the enumeration {@link Accounting.OnlineServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Online Services</em>' attribute list.
	 * @see Accounting.OnlineServiceType
	 * @see Accounting.AccountingPackage#getSupportedOnlineServices_SupportedOnlineServices()
	 * @model
	 * @generated
	 */
	EList<OnlineServiceType> getSupportedOnlineServices();

} // SupportedOnlineServices
