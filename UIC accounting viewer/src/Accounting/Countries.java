/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Countries#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCountries()
 * @model
 * @generated
 */
public interface Countries extends EObject {
	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCountries_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

} // Countries
