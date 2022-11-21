/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.CarrierConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.CarrierConstraint#getIncludedCarriers <em>Included Carriers</em>}</li>
 *   <li>{@link Accounting.CarrierConstraint#getExcludedCarriers <em>Excluded Carriers</em>}</li>
 *   <li>{@link Accounting.CarrierConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.CarrierConstraint#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCarrierConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='INCLUDE_OR_EXCLUDE'"
 * @generated
 */
public interface CarrierConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getCarrierConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.CarrierConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Included Carriers</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Carriers</em>' reference list.
	 * @see Accounting.AccountingPackage#getCarrierConstraint_IncludedCarriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getIncludedCarriers();

	/**
	 * Returns the value of the '<em><b>Excluded Carriers</b></em>' reference list.
	 * The list contents are of type {@link Accounting.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Carriers</em>' reference list.
	 * @see Accounting.AccountingPackage#getCarrierConstraint_ExcludedCarriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getExcludedCarriers();

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getCarrierConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.CarrierConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getCarrierConstraint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.CarrierConstraint#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // CarrierConstraint
