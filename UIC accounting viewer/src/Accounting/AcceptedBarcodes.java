/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accepted Barcodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.AcceptedBarcodes#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getAcceptedBarcodes()
 * @model
 * @generated
 */
public interface AcceptedBarcodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * The list contents are of type {@link Accounting.BarcodeTypes}.
	 * The literals are from the enumeration {@link Accounting.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcodes</em>' attribute list.
	 * @see Accounting.BarcodeTypes
	 * @see Accounting.AccountingPackage#getAcceptedBarcodes_AcceptedBarcodes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getAcceptedBarcodes();

} // AcceptedBarcodes
