/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceLevelDefinitions#getServiceLevelDefinition <em>Service Level Definition</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceLevelDefinitions()
 * @model
 * @generated
 */
public interface ServiceLevelDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Level Definition</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ServiceLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Definition</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getServiceLevelDefinitions_ServiceLevelDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLevel> getServiceLevelDefinition();

} // ServiceLevelDefinitions
