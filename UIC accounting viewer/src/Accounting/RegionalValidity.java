/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Validity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.RegionalValidity#getSeqNb <em>Seq Nb</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getViaStation <em>Via Station</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getZone <em>Zone</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getLine <em>Line</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getPolygone <em>Polygone</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Accounting.RegionalValidity#getServiceConstraint <em>Service Constraint</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getRegionalValidity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_OF_VIA_ZONE_LINE_POLYGON'"
 * @generated
 */
public interface RegionalValidity extends EObject {
	/**
	 * Returns the value of the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Nb</em>' attribute.
	 * @see #setSeqNb(int)
	 * @see Accounting.AccountingPackage#getRegionalValidity_SeqNb()
	 * @model
	 * @generated
	 */
	int getSeqNb();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getSeqNb <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Nb</em>' attribute.
	 * @see #getSeqNb()
	 * @generated
	 */
	void setSeqNb(int value);

	/**
	 * Returns the value of the '<em><b>Via Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Via Station</em>' containment reference.
	 * @see #setViaStation(ViaStation)
	 * @see Accounting.AccountingPackage#getRegionalValidity_ViaStation()
	 * @model containment="true"
	 * @generated
	 */
	ViaStation getViaStation();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getViaStation <em>Via Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Via Station</em>' containment reference.
	 * @see #getViaStation()
	 * @generated
	 */
	void setViaStation(ViaStation value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' containment reference.
	 * @see #setZone(Zone)
	 * @see Accounting.AccountingPackage#getRegionalValidity_Zone()
	 * @model containment="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getZone <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' containment reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see Accounting.AccountingPackage#getRegionalValidity_Line()
	 * @model containment="true"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone</em>' containment reference.
	 * @see #setPolygone(Polygone)
	 * @see Accounting.AccountingPackage#getRegionalValidity_Polygone()
	 * @model containment="true"
	 * @generated
	 */
	Polygone getPolygone();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getPolygone <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygone</em>' containment reference.
	 * @see #getPolygone()
	 * @generated
	 */
	void setPolygone(Polygone value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Accounting.AccountingPackage#getRegionalValidity_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraint</em>' reference.
	 * @see #setServiceConstraint(ServiceConstraint)
	 * @see Accounting.AccountingPackage#getRegionalValidity_ServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getServiceConstraint();

	/**
	 * Sets the value of the '{@link Accounting.RegionalValidity#getServiceConstraint <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Constraint</em>' reference.
	 * @see #getServiceConstraint()
	 * @generated
	 */
	void setServiceConstraint(ServiceConstraint value);

} // RegionalValidity
