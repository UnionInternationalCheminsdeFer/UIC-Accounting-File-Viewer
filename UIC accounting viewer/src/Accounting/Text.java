/**
 */
package Accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Text#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.Text#getTextUTF8 <em>Text UTF8</em>}</li>
 *   <li>{@link Accounting.Text#getTextICAO <em>Text ICAO</em>}</li>
 *   <li>{@link Accounting.Text#getShortTextUTF8 <em>Short Text UTF8</em>}</li>
 *   <li>{@link Accounting.Text#getShortTextICAO <em>Short Text ICAO</em>}</li>
 *   <li>{@link Accounting.Text#getTranslations <em>Translations</em>}</li>
 *   <li>{@link Accounting.Text#isStandardText <em>Standard Text</em>}</li>
 *   <li>{@link Accounting.Text#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getText()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FORMAT_TEXT FORMAT_TEXT_SHORT FORMAT_TEXT_UTF8 FORMAT_TEXT_SHORT_UTF8'"
 * @generated
 */
public interface Text extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getText_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.Text#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UTF8</em>' attribute.
	 * @see #setTextUTF8(String)
	 * @see Accounting.AccountingPackage#getText_TextUTF8()
	 * @model
	 * @generated
	 */
	String getTextUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Text#getTextUTF8 <em>Text UTF8</em>}' attribute.
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
	 * @see Accounting.AccountingPackage#getText_TextICAO()
	 * @model
	 * @generated
	 */
	String getTextICAO();

	/**
	 * Sets the value of the '{@link Accounting.Text#getTextICAO <em>Text ICAO</em>}' attribute.
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
	 * @see Accounting.AccountingPackage#getText_ShortTextUTF8()
	 * @model
	 * @generated
	 */
	String getShortTextUTF8();

	/**
	 * Sets the value of the '{@link Accounting.Text#getShortTextUTF8 <em>Short Text UTF8</em>}' attribute.
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
	 * @see Accounting.AccountingPackage#getText_ShortTextICAO()
	 * @model
	 * @generated
	 */
	String getShortTextICAO();

	/**
	 * Sets the value of the '{@link Accounting.Text#getShortTextICAO <em>Short Text ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Text ICAO</em>' attribute.
	 * @see #getShortTextICAO()
	 * @generated
	 */
	void setShortTextICAO(String value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
	 * The list contents are of type {@link Accounting.Translation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference list.
	 * @see Accounting.AccountingPackage#getText_Translations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Translation> getTranslations();

	/**
	 * Returns the value of the '<em><b>Standard Text</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Text</em>' attribute.
	 * @see #setStandardText(boolean)
	 * @see Accounting.AccountingPackage#getText_StandardText()
	 * @model default="false"
	 * @generated
	 */
	boolean isStandardText();

	/**
	 * Sets the value of the '{@link Accounting.Text#isStandardText <em>Standard Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Text</em>' attribute.
	 * @see #isStandardText()
	 * @generated
	 */
	void setStandardText(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Accounting.AccountingPackage#getText_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Accounting.Text#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Accounting.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

} // Text
