/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Items Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.LuggageItemsRestriction#getNumberOfItems <em>Number Of Items</em>}</li>
 *   <li>{@link Accounting.LuggageItemsRestriction#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getLuggageItemsRestriction()
 * @model
 * @generated
 */
public interface LuggageItemsRestriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Items</em>' attribute.
	 * @see #setNumberOfItems(int)
	 * @see Accounting.AccountingPackage#getLuggageItemsRestriction_NumberOfItems()
	 * @model
	 * @generated
	 */
	int getNumberOfItems();

	/**
	 * Sets the value of the '{@link Accounting.LuggageItemsRestriction#getNumberOfItems <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Items</em>' attribute.
	 * @see #getNumberOfItems()
	 * @generated
	 */
	void setNumberOfItems(int value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.LuggageDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getLuggageItemsRestriction_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	EList<LuggageDimension> getDimension();

} // LuggageItemsRestriction
