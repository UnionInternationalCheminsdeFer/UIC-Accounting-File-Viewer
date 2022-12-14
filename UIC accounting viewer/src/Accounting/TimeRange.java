/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.TimeRange#getScope <em>Scope</em>}</li>
 *   <li>{@link Accounting.TimeRange#getFrom <em>From</em>}</li>
 *   <li>{@link Accounting.TimeRange#getUntil <em>Until</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTimeRange()
 * @model
 * @generated
 */
public interface TimeRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TimeRangeScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Accounting.TimeRangeScope
	 * @see #setScope(TimeRangeScope)
	 * @see Accounting.AccountingPackage#getTimeRange_Scope()
	 * @model
	 * @generated
	 */
	TimeRangeScope getScope();

	/**
	 * Sets the value of the '{@link Accounting.TimeRange#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Accounting.TimeRangeScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(TimeRangeScope value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see Accounting.AccountingPackage#getTimeRange_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link Accounting.TimeRange#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' attribute.
	 * @see #setUntil(int)
	 * @see Accounting.AccountingPackage#getTimeRange_Until()
	 * @model
	 * @generated
	 */
	int getUntil();

	/**
	 * Sets the value of the '{@link Accounting.TimeRange#getUntil <em>Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' attribute.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(int value);

} // TimeRange
