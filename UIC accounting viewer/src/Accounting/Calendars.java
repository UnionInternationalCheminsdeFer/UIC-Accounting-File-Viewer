/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Calendars#getCalendars <em>Calendars</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCalendars()
 * @model
 * @generated
 */
public interface Calendars extends EObject {
	/**
	 * Returns the value of the '<em><b>Calendars</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Calendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendars</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getCalendars_Calendars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Calendar> getCalendars();

} // Calendars
