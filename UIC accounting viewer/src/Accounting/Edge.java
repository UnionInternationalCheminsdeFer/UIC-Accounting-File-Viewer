/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Edge#getSystem <em>System</em>}</li>
 *   <li>{@link Accounting.Edge#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link Accounting.Edge#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Accounting.Edge#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.GeoSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see Accounting.GeoSystem
	 * @see #setSystem(GeoSystem)
	 * @see Accounting.AccountingPackage#getEdge_System()
	 * @model
	 * @generated
	 */
	GeoSystem getSystem();

	/**
	 * Sets the value of the '{@link Accounting.Edge#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see Accounting.GeoSystem
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(GeoSystem value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(float)
	 * @see Accounting.AccountingPackage#getEdge_Accuracy()
	 * @model
	 * @generated
	 */
	float getAccuracy();

	/**
	 * Sets the value of the '{@link Accounting.Edge#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(float value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see Accounting.AccountingPackage#getEdge_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link Accounting.Edge#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see Accounting.AccountingPackage#getEdge_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link Accounting.Edge#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // Edge
