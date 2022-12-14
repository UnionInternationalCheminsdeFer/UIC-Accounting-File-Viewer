/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Station Set Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.FareStationSetDefinitions#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getFareStationSetDefinitions()
 * @model
 * @generated
 */
public interface FareStationSetDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Fare Station Set Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.FareStationSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fare Station Set Definitions</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getFareStationSetDefinitions_FareStationSetDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FareStationSetDefinition> getFareStationSetDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model legacyCodeDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	FareStationSetDefinition findFareSet(Carrier carrier, int legacyCode);

} // FareStationSetDefinitions
