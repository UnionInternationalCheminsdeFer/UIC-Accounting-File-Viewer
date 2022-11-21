/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Barcodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RequiredBarcodes#getRequiredBarcodes <em>Required Barcodes</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRequiredBarcodes()
 * @model
 * @generated
 */
public interface RequiredBarcodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Barcodes</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.BarcodeTypes}.
	 * The literals are from the enumeration {@link Accounting.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Barcodes</em>' attribute list.
	 * @see Accounting.BarcodeTypes
	 * @see Accounting.AccountingPackage#getRequiredBarcodes_RequiredBarcodes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getRequiredBarcodes();

} // RequiredBarcodes
