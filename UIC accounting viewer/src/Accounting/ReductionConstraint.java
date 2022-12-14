/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReductionConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.ReductionConstraint#getRequiredReductionCards <em>Required Reduction Cards</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReductionConstraint()
 * @model
 * @generated
 */
public interface ReductionConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getReductionConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.ReductionConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Required Reduction Cards</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.RequiredReductionCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Reduction Cards</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getReductionConstraint_RequiredReductionCards()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredReductionCard> getRequiredReductionCards();

} // ReductionConstraint
