/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.ServiceClassDefinitions#getServiceClassDefinitions <em>Service Class Definitions</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getServiceClassDefinitions()
 * @model
 * @generated
 */
public interface ServiceClassDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Definitions</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getServiceClassDefinitions_ServiceClassDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceClass> getServiceClassDefinitions();

} // ServiceClassDefinitions
