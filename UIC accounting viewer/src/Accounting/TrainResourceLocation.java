/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Resource Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.TrainResourceLocation#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link Accounting.TrainResourceLocation#getOnlineResources <em>Online Resources</em>}</li>
 *   <li>{@link Accounting.TrainResourceLocation#getTrainId <em>Train Id</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTrainResourceLocation()
 * @model
 * @generated
 */
public interface TrainResourceLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see Accounting.AccountingPackage#getTrainResourceLocation_Carrier()
	 * @model
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link Accounting.TrainResourceLocation#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Online Resources</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.OnlineResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Resources</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getTrainResourceLocation_OnlineResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnlineResource> getOnlineResources();

	/**
	 * Returns the value of the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Id</em>' attribute.
	 * @see #setTrainId(String)
	 * @see Accounting.AccountingPackage#getTrainResourceLocation_TrainId()
	 * @model
	 * @generated
	 */
	String getTrainId();

	/**
	 * Sets the value of the '{@link Accounting.TrainResourceLocation#getTrainId <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Id</em>' attribute.
	 * @see #getTrainId()
	 * @generated
	 */
	void setTrainId(String value);

} // TrainResourceLocation
