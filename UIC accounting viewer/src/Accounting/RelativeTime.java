/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RelativeTime#getUnit <em>Unit</em>}</li>
 *   <li>{@link Accounting.RelativeTime#getReference <em>Reference</em>}</li>
 *   <li>{@link Accounting.RelativeTime#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRelativeTime()
 * @model
 * @generated
 */
public interface RelativeTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see Accounting.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see Accounting.AccountingPackage#getRelativeTime_Unit()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link Accounting.RelativeTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see Accounting.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TimeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see Accounting.TimeReferenceType
	 * @see #setReference(TimeReferenceType)
	 * @see Accounting.AccountingPackage#getRelativeTime_Reference()
	 * @model
	 * @generated
	 */
	TimeReferenceType getReference();

	/**
	 * Sets the value of the '{@link Accounting.RelativeTime#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see Accounting.TimeReferenceType
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TimeReferenceType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see Accounting.AccountingPackage#getRelativeTime_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link Accounting.RelativeTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // RelativeTime
