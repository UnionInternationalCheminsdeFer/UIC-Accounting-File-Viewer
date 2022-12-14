/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Accounting Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.LegacyAccountingIdentifier#getSeriesId <em>Series Id</em>}</li>
 *   <li>{@link Accounting.LegacyAccountingIdentifier#getTariffId <em>Tariff Id</em>}</li>
 *   <li>{@link Accounting.LegacyAccountingIdentifier#getAddSeriesId <em>Add Series Id</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getLegacyAccountingIdentifier()
 * @model
 * @generated
 */
public interface LegacyAccountingIdentifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Id</em>' attribute.
	 * @see #setSeriesId(int)
	 * @see Accounting.AccountingPackage#getLegacyAccountingIdentifier_SeriesId()
	 * @model
	 * @generated
	 */
	int getSeriesId();

	/**
	 * Sets the value of the '{@link Accounting.LegacyAccountingIdentifier#getSeriesId <em>Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Id</em>' attribute.
	 * @see #getSeriesId()
	 * @generated
	 */
	void setSeriesId(int value);

	/**
	 * Returns the value of the '<em><b>Tariff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Id</em>' attribute.
	 * @see #setTariffId(int)
	 * @see Accounting.AccountingPackage#getLegacyAccountingIdentifier_TariffId()
	 * @model
	 * @generated
	 */
	int getTariffId();

	/**
	 * Sets the value of the '{@link Accounting.LegacyAccountingIdentifier#getTariffId <em>Tariff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Id</em>' attribute.
	 * @see #getTariffId()
	 * @generated
	 */
	void setTariffId(int value);

	/**
	 * Returns the value of the '<em><b>Add Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Series Id</em>' attribute.
	 * @see #setAddSeriesId(int)
	 * @see Accounting.AccountingPackage#getLegacyAccountingIdentifier_AddSeriesId()
	 * @model
	 * @generated
	 */
	int getAddSeriesId();

	/**
	 * Sets the value of the '{@link Accounting.LegacyAccountingIdentifier#getAddSeriesId <em>Add Series Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Series Id</em>' attribute.
	 * @see #getAddSeriesId()
	 * @generated
	 */
	void setAddSeriesId(int value);

} // LegacyAccountingIdentifier
