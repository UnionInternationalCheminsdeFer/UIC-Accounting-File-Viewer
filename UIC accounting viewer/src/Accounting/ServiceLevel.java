/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceLevel#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.ServiceLevel#getText <em>Text</em>}</li>
 *   <li>{@link Accounting.ServiceLevel#getCombiningServiceClasses <em>Combining Service Classes</em>}</li>
 *   <li>{@link Accounting.ServiceLevel#getReservationParameter <em>Reservation Parameter</em>}</li>
 *   <li>{@link Accounting.ServiceLevel#isIncludesClassName <em>Includes Class Name</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceLevel()
 * @model
 * @generated
 */
public interface ServiceLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getServiceLevel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.ServiceLevel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Accounting.AccountingPackage#getServiceLevel_Text()
	 * @model
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Accounting.ServiceLevel#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Combining Service Classes</b></em>' reference list.
	 * The list contents are of type {@link Accounting.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combining Service Classes</em>' reference list.
	 * @see Accounting.AccountingPackage#getServiceLevel_CombiningServiceClasses()
	 * @model
	 * @generated
	 */
	EList<ServiceClass> getCombiningServiceClasses();

	/**
	 * Returns the value of the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Parameter</em>' reference.
	 * @see #setReservationParameter(ReservationParameter)
	 * @see Accounting.AccountingPackage#getServiceLevel_ReservationParameter()
	 * @model
	 * @generated
	 */
	ReservationParameter getReservationParameter();

	/**
	 * Sets the value of the '{@link Accounting.ServiceLevel#getReservationParameter <em>Reservation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Parameter</em>' reference.
	 * @see #getReservationParameter()
	 * @generated
	 */
	void setReservationParameter(ReservationParameter value);

	/**
	 * Returns the value of the '<em><b>Includes Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Class Name</em>' attribute.
	 * @see #setIncludesClassName(boolean)
	 * @see Accounting.AccountingPackage#getServiceLevel_IncludesClassName()
	 * @model
	 * @generated
	 */
	boolean isIncludesClassName();

	/**
	 * Sets the value of the '{@link Accounting.ServiceLevel#isIncludesClassName <em>Includes Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Class Name</em>' attribute.
	 * @see #isIncludesClassName()
	 * @generated
	 */
	void setIncludesClassName(boolean value);

} // ServiceLevel
