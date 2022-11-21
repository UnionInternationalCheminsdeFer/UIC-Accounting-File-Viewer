/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}</li>
 *   <li>{@link Accounting.OnlineResource#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link Accounting.OnlineResource#getVersion <em>Version</em>}</li>
 *   <li>{@link Accounting.OnlineResource#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getOnlineResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='REQUEST_TYPE_MUST INTERFACE_TYPE_MUST SYSTEM_MUST'"
 * @generated
 */
public interface OnlineResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Offer Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.OfferRequestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer Request Type</em>' attribute.
	 * @see Accounting.OfferRequestType
	 * @see #setOfferRequestType(OfferRequestType)
	 * @see Accounting.AccountingPackage#getOnlineResource_OfferRequestType()
	 * @model
	 * @generated
	 */
	OfferRequestType getOfferRequestType();

	/**
	 * Sets the value of the '{@link Accounting.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer Request Type</em>' attribute.
	 * @see Accounting.OfferRequestType
	 * @see #getOfferRequestType()
	 * @generated
	 */
	void setOfferRequestType(OfferRequestType value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.InterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see Accounting.InterfaceType
	 * @see #setInterfaceType(InterfaceType)
	 * @see Accounting.AccountingPackage#getOnlineResource_InterfaceType()
	 * @model
	 * @generated
	 */
	InterfaceType getInterfaceType();

	/**
	 * Sets the value of the '{@link Accounting.OnlineResource#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see Accounting.InterfaceType
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Accounting.AccountingPackage#getOnlineResource_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Accounting.OnlineResource#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see Accounting.AccountingPackage#getOnlineResource_System()
	 * @model
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link Accounting.OnlineResource#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // OnlineResource
