/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.LegacyDescription#getPassengerType <em>Passenger Type</em>}</li>
 *   <li>{@link Accounting.LegacyDescription#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link Accounting.LegacyDescription#getSeries <em>Series</em>}</li>
 *   <li>{@link Accounting.LegacyDescription#getTariff <em>Tariff</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getLegacyDescription()
 * @model
 * @generated
 */
public interface LegacyDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.TravelerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Type</em>' attribute.
	 * @see Accounting.TravelerType
	 * @see #setPassengerType(TravelerType)
	 * @see Accounting.AccountingPackage#getLegacyDescription_PassengerType()
	 * @model
	 * @generated
	 */
	TravelerType getPassengerType();

	/**
	 * Sets the value of the '{@link Accounting.LegacyDescription#getPassengerType <em>Passenger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Type</em>' attribute.
	 * @see Accounting.TravelerType
	 * @see #getPassengerType()
	 * @generated
	 */
	void setPassengerType(TravelerType value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.ClassicClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see Accounting.ClassicClassType
	 * @see #setClassCode(ClassicClassType)
	 * @see Accounting.AccountingPackage#getLegacyDescription_ClassCode()
	 * @model
	 * @generated
	 */
	ClassicClassType getClassCode();

	/**
	 * Sets the value of the '{@link Accounting.LegacyDescription#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see Accounting.ClassicClassType
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(ClassicClassType value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' attribute.
	 * @see #setSeries(int)
	 * @see Accounting.AccountingPackage#getLegacyDescription_Series()
	 * @model
	 * @generated
	 */
	int getSeries();

	/**
	 * Sets the value of the '{@link Accounting.LegacyDescription#getSeries <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' attribute.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(int value);

	/**
	 * Returns the value of the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff</em>' attribute.
	 * @see #setTariff(int)
	 * @see Accounting.AccountingPackage#getLegacyDescription_Tariff()
	 * @model
	 * @generated
	 */
	int getTariff();

	/**
	 * Sets the value of the '{@link Accounting.LegacyDescription#getTariff <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff</em>' attribute.
	 * @see #getTariff()
	 * @generated
	 */
	void setTariff(int value);

} // LegacyDescription
