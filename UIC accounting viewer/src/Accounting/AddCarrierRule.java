/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Carrier Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AddCarrierRule#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Accounting.AddCarrierRule#getScope <em>Scope</em>}</li>
 *   <li>{@link Accounting.AddCarrierRule#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAddCarrierRule()
 * @model
 * @generated
 */
public interface AddCarrierRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Accounting.AccountingPackage#getAddCarrierRule_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Accounting.AddCarrierRule#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.AddCarrierScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Accounting.AddCarrierScope
	 * @see #setScope(AddCarrierScope)
	 * @see Accounting.AccountingPackage#getAddCarrierRule_Scope()
	 * @model
	 * @generated
	 */
	AddCarrierScope getScope();

	/**
	 * Sets the value of the '{@link Accounting.AddCarrierRule#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Accounting.AddCarrierScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(AddCarrierScope value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see Accounting.AccountingPackage#getAddCarrierRule_Stations()
	 * @model
	 * @generated
	 */
	EList<Station> getStations();

} // AddCarrierRule
