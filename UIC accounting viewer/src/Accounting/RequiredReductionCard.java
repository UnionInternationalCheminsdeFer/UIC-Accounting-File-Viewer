/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RequiredReductionCard#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link Accounting.RequiredReductionCard#getCard <em>Card</em>}</li>
 *   <li>{@link Accounting.RequiredReductionCard#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRequiredReductionCard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NAME_FORMAT CARD_MUST'"
 * @generated
 */
public interface RequiredReductionCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' reference.
	 * @see #setCardClass(ServiceClass)
	 * @see Accounting.AccountingPackage#getRequiredReductionCard_CardClass()
	 * @model
	 * @generated
	 */
	ServiceClass getCardClass();

	/**
	 * Sets the value of the '{@link Accounting.RequiredReductionCard#getCardClass <em>Card Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Class</em>' reference.
	 * @see #getCardClass()
	 * @generated
	 */
	void setCardClass(ServiceClass value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(ReductionCard)
	 * @see Accounting.AccountingPackage#getRequiredReductionCard_Card()
	 * @model
	 * @generated
	 */
	ReductionCard getCard();

	/**
	 * Sets the value of the '{@link Accounting.RequiredReductionCard#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(ReductionCard value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getRequiredReductionCard_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.RequiredReductionCard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RequiredReductionCard
