/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Country#getCode <em>Code</em>}</li>
 *   <li>{@link Accounting.Country#getName <em>Name</em>}</li>
 *   <li>{@link Accounting.Country#getISOcode <em>IS Ocode</em>}</li>
 *   <li>{@link Accounting.Country#getDefaultCharacterSet <em>Default Character Set</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see Accounting.AccountingPackage#getCountry_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link Accounting.Country#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Accounting.AccountingPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Accounting.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>IS Ocode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IS Ocode</em>' attribute.
	 * @see #setISOcode(String)
	 * @see Accounting.AccountingPackage#getCountry_ISOcode()
	 * @model
	 * @generated
	 */
	String getISOcode();

	/**
	 * Sets the value of the '{@link Accounting.Country#getISOcode <em>IS Ocode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IS Ocode</em>' attribute.
	 * @see #getISOcode()
	 * @generated
	 */
	void setISOcode(String value);

	/**
	 * Returns the value of the '<em><b>Default Character Set</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.CharacterSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Character Set</em>' attribute.
	 * @see Accounting.CharacterSet
	 * @see #setDefaultCharacterSet(CharacterSet)
	 * @see Accounting.AccountingPackage#getCountry_DefaultCharacterSet()
	 * @model
	 * @generated
	 */
	CharacterSet getDefaultCharacterSet();

	/**
	 * Sets the value of the '{@link Accounting.Country#getDefaultCharacterSet <em>Default Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Character Set</em>' attribute.
	 * @see Accounting.CharacterSet
	 * @see #getDefaultCharacterSet()
	 * @generated
	 */
	void setDefaultCharacterSet(CharacterSet value);

} // Country
