/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.LuggageConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.LuggageConstraint#getMaxHandLuggage <em>Max Hand Luggage</em>}</li>
 *   <li>{@link Accounting.LuggageConstraint#getMaxLargeLuggage <em>Max Large Luggage</em>}</li>
 *   <li>{@link Accounting.LuggageConstraint#getRestrictedItems <em>Restricted Items</em>}</li>
 *   <li>{@link Accounting.LuggageConstraint#getRules <em>Rules</em>}</li>
 *   <li>{@link Accounting.LuggageConstraint#getDataDescription <em>Data Description</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getLuggageConstraint()
 * @model
 * @generated
 */
public interface LuggageConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getLuggageConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.LuggageConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Max Hand Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Hand Luggage</em>' attribute.
	 * @see #setMaxHandLuggage(int)
	 * @see Accounting.AccountingPackage#getLuggageConstraint_MaxHandLuggage()
	 * @model
	 * @generated
	 */
	int getMaxHandLuggage();

	/**
	 * Sets the value of the '{@link Accounting.LuggageConstraint#getMaxHandLuggage <em>Max Hand Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Hand Luggage</em>' attribute.
	 * @see #getMaxHandLuggage()
	 * @generated
	 */
	void setMaxHandLuggage(int value);

	/**
	 * Returns the value of the '<em><b>Max Large Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Large Luggage</em>' attribute.
	 * @see #setMaxLargeLuggage(int)
	 * @see Accounting.AccountingPackage#getLuggageConstraint_MaxLargeLuggage()
	 * @model
	 * @generated
	 */
	int getMaxLargeLuggage();

	/**
	 * Sets the value of the '{@link Accounting.LuggageConstraint#getMaxLargeLuggage <em>Max Large Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Large Luggage</em>' attribute.
	 * @see #getMaxLargeLuggage()
	 * @generated
	 */
	void setMaxLargeLuggage(int value);

	/**
	 * Returns the value of the '<em><b>Restricted Items</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.LuggageItemsRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted Items</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getLuggageConstraint_RestrictedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<LuggageItemsRestriction> getRestrictedItems();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.LuggageRule}.
	 * The literals are from the enumeration {@link Accounting.LuggageRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute list.
	 * @see Accounting.LuggageRule
	 * @see Accounting.AccountingPackage#getLuggageConstraint_Rules()
	 * @model
	 * @generated
	 */
	EList<LuggageRule> getRules();

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getLuggageConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.LuggageConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

} // LuggageConstraint
