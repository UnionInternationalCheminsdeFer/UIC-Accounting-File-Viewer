/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RegionalConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getDistance <em>Distance</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getRegionalValidity <em>Regional Validity</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Accounting.RegionalConstraint#getLinkedFares <em>Linked Fares</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRegionalConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_REGIONAL_VALIDITY WARNING_DISTANCE_TOO_SHORT WARNING_DISTANCE_TOO_LONG NOT_REFERENCED NO_CLASS_SEPARATED_CONVERTABLE_FARES'"
 * @generated
 */
public interface RegionalConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Entry Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Connection Point</em>' reference.
	 * @see #setEntryConnectionPoint(ConnectionPoint)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_EntryConnectionPoint()
	 * @model
	 * @generated
	 */
	ConnectionPoint getEntryConnectionPoint();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Connection Point</em>' reference.
	 * @see #getEntryConnectionPoint()
	 * @generated
	 */
	void setEntryConnectionPoint(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Exit Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Connection Point</em>' reference.
	 * @see #setExitConnectionPoint(ConnectionPoint)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_ExitConnectionPoint()
	 * @model
	 * @generated
	 */
	ConnectionPoint getExitConnectionPoint();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Connection Point</em>' reference.
	 * @see #getExitConnectionPoint()
	 * @generated
	 */
	void setExitConnectionPoint(ConnectionPoint value);

	/**
	 * Returns the value of the '<em><b>Regional Validity</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.RegionalValidity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Validity</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getRegionalConstraint_RegionalValidity()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegionalValidity> getRegionalValidity();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Accounting.AccountingPackage#getRegionalConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Accounting.RegionalConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Linked Fares</b></em>' reference list.
	 * The list contents are of type {@link Accounting.FareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Fares</em>' reference list.
	 * @see Accounting.AccountingPackage#getRegionalConstraint_LinkedFares()
	 * @model
	 * @generated
	 */
	EList<FareElement> getLinkedFares();

} // RegionalConstraint
