/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Texts#getTexts <em>Texts</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTexts()
 * @model
 * @generated
 */
public interface Texts extends EObject {
	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getTexts_Texts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getTexts();

} // Texts
