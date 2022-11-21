/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ReturnValidityConstraint#getExcludedWeekdays <em>Excluded Weekdays</em>}</li>
 *   <li>{@link Accounting.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}</li>
 *   <li>{@link Accounting.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getReturnValidityConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EARLIEST_LAST_RETURN_ORDER'"
 * @generated
 */
public interface ReturnValidityConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Excluded Weekdays</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.WeekDay}.
	 * The literals are from the enumeration {@link Accounting.WeekDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Weekdays</em>' attribute list.
	 * @see Accounting.WeekDay
	 * @see Accounting.AccountingPackage#getReturnValidityConstraint_ExcludedWeekdays()
	 * @model
	 * @generated
	 */
	EList<WeekDay> getExcludedWeekdays();

	/**
	 * Returns the value of the '<em><b>Latest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Return</em>' attribute.
	 * @see #setLatestReturn(int)
	 * @see Accounting.AccountingPackage#getReturnValidityConstraint_LatestReturn()
	 * @model
	 * @generated
	 */
	int getLatestReturn();

	/**
	 * Sets the value of the '{@link Accounting.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Return</em>' attribute.
	 * @see #getLatestReturn()
	 * @generated
	 */
	void setLatestReturn(int value);

	/**
	 * Returns the value of the '<em><b>Earliest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Return</em>' attribute.
	 * @see #setEarliestReturn(int)
	 * @see Accounting.AccountingPackage#getReturnValidityConstraint_EarliestReturn()
	 * @model
	 * @generated
	 */
	int getEarliestReturn();

	/**
	 * Sets the value of the '{@link Accounting.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Return</em>' attribute.
	 * @see #getEarliestReturn()
	 * @generated
	 */
	void setEarliestReturn(int value);

} // ReturnValidityConstraint
