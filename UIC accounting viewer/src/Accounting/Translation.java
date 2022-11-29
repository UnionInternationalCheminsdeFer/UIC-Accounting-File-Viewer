/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Translation#getLanguage <em>Language</em>}</li>
 *   <li>{@link Accounting.Translation#getTextUTF8 <em>Text UTF8</em>}</li>
 *   <li>{@link Accounting.Translation#getTextICAO <em>Text ICAO</em>}</li>
 *   <li>{@link Accounting.Translation#getShortTextUTF8 <em>Short Text UTF8</em>}</li>
 *   <li>{@link Accounting.Translation#getShortTextICAO <em>Short Text ICAO</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getTranslation()
 * @model
 * @generated
 */
public interface Translation extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Language)
	 * @see Accounting.AccountingPackage#getTranslation_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link Accounting.Translation#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UTF8</em>' attribute.
	 * @see #setTextUTF8(String)
	 * @see Accounting.AccountingPackage#getTranslation_TextUTF8()
	 * @model
	 * @generated
	 */
	String getTextUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Translation#getTextUTF8 <em>Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text UTF8</em>' attribute.
	 * @see #getTextUTF8()
	 * @generated
	 */
	void setTextUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text ICAO</em>' attribute.
	 * @see #setTextICAO(String)
	 * @see Accounting.AccountingPackage#getTranslation_TextICAO()
	 * @model
	 * @generated
	 */
	String getTextICAO();

	/**
	 * Sets the value of the '{@link Accounting.Translation#getTextICAO <em>Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text ICAO</em>' attribute.
	 * @see #getTextICAO()
	 * @generated
	 */
	void setTextICAO(String value);

	/**
	 * Returns the value of the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text UTF8</em>' attribute.
	 * @see #setShortTextUTF8(String)
	 * @see Accounting.AccountingPackage#getTranslation_ShortTextUTF8()
	 * @model
	 * @generated
	 */
	String getShortTextUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Translation#getShortTextUTF8 <em>Short Text UTF8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text UTF8</em>' attribute.
	 * @see #getShortTextUTF8()
	 * @generated
	 */
	void setShortTextUTF8(String value);

	/**
	 * Returns the value of the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text ICAO</em>' attribute.
	 * @see #setShortTextICAO(String)
	 * @see Accounting.AccountingPackage#getTranslation_ShortTextICAO()
	 * @model
	 * @generated
	 */
	String getShortTextICAO();

	/**
	 * Sets the value of the '{@link Accounting.Translation#getShortTextICAO <em>Short Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text ICAO</em>' attribute.
	 * @see #getShortTextICAO()
	 * @generated
	 */
	void setShortTextICAO(String value);

} // Translation
