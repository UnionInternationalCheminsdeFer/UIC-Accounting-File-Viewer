/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReductionCard#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.ReductionCard#getCardIssuer <em>Card Issuer</em>}</li>
 *   <li>{@link Accounting.ReductionCard#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.ReductionCard#getServiceClasses <em>Service Classes</em>}</li>
 *   <li>{@link Accounting.ReductionCard#isIdRequiredForBooking <em>Id Required For Booking</em>}</li>
 *   <li>{@link Accounting.ReductionCard#getIncludedReductionCards <em>Included Reduction Cards</em>}</li>
 *   <li>{@link Accounting.ReductionCard#isUicCode <em>Uic Code</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReductionCard()
 * @model
 * @generated
 */
public interface ReductionCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getReductionCard_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.ReductionCard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Card Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Issuer</em>' reference.
	 * @see #setCardIssuer(Carrier)
	 * @see Accounting.AccountingPackage#getReductionCard_CardIssuer()
	 * @model
	 * @generated
	 */
	Carrier getCardIssuer();

	/**
	 * Sets the value of the '{@link Accounting.ReductionCard#getCardIssuer <em>Card Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Issuer</em>' reference.
	 * @see #getCardIssuer()
	 * @generated
	 */
	void setCardIssuer(Carrier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Text)
	 * @see Accounting.AccountingPackage#getReductionCard_Name()
	 * @model
	 * @generated
	 */
	Text getName();

	/**
	 * Sets the value of the '{@link Accounting.ReductionCard#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Text value);

	/**
	 * Returns the value of the '<em><b>Service Classes</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Classes</em>' reference list.
	 * @see Accounting.AccountingPackage#getReductionCard_ServiceClasses()
	 * @model
	 * @generated
	 */
	EList<ServiceClass> getServiceClasses();

	/**
	 * Returns the value of the '<em><b>Id Required For Booking</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Required For Booking</em>' attribute.
	 * @see #setIdRequiredForBooking(boolean)
	 * @see Accounting.AccountingPackage#getReductionCard_IdRequiredForBooking()
	 * @model default="false"
	 * @generated
	 */
	boolean isIdRequiredForBooking();

	/**
	 * Sets the value of the '{@link Accounting.ReductionCard#isIdRequiredForBooking <em>Id Required For Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Required For Booking</em>' attribute.
	 * @see #isIdRequiredForBooking()
	 * @generated
	 */
	void setIdRequiredForBooking(boolean value);

	/**
	 * Returns the value of the '<em><b>Included Reduction Cards</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ReductionCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Reduction Cards</em>' reference list.
	 * @see Accounting.AccountingPackage#getReductionCard_IncludedReductionCards()
	 * @model
	 * @generated
	 */
	EList<ReductionCard> getIncludedReductionCards();

	/**
	 * Returns the value of the '<em><b>Uic Code</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uic Code</em>' attribute.
	 * @see #setUicCode(boolean)
	 * @see Accounting.AccountingPackage#getReductionCard_UicCode()
	 * @model default="false"
	 * @generated
	 */
	boolean isUicCode();

	/**
	 * Sets the value of the '{@link Accounting.ReductionCard#isUicCode <em>Uic Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uic Code</em>' attribute.
	 * @see #isUicCode()
	 * @generated
	 */
	void setUicCode(boolean value);

} // ReductionCard
