/**
 */
package Accounting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Accounting.Delivery#getId <em>Id</em>}</li>
 *   <li>{@link Accounting.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}</li>
 *   <li>{@link Accounting.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}</li>
 *   <li>{@link Accounting.Delivery#isOptional <em>Optional</em>}</li>
 *   <li>{@link Accounting.Delivery#getProvider <em>Provider</em>}</li>
 *   <li>{@link Accounting.Delivery#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link Accounting.Delivery#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}</li>
 *   <li>{@link Accounting.Delivery#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see Accounting.AccountingPackage#getDelivery()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CARRIER_MUST DELIVERY_ID_CHARACTERS VERSION_MUST ACCEPTED_VERSIONS_MUST'"
 * @generated
 */
public interface Delivery extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Accounting.AccountingPackage#getDelivery_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Previous Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Delivery Id</em>' attribute.
	 * @see #setPreviousDeliveryId(String)
	 * @see Accounting.AccountingPackage#getDelivery_PreviousDeliveryId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPreviousDeliveryId();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Delivery Id</em>' attribute.
	 * @see #getPreviousDeliveryId()
	 * @generated
	 */
	void setPreviousDeliveryId(String value);

	/**
	 * Returns the value of the '<em><b>Replaced Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced Delivery Id</em>' attribute.
	 * @see #isSetReplacedDeliveryId()
	 * @see #unsetReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(String)
	 * @see Accounting.AccountingPackage#getDelivery_ReplacedDeliveryId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReplacedDeliveryId();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced Delivery Id</em>' attribute.
	 * @see #isSetReplacedDeliveryId()
	 * @see #unsetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @generated
	 */
	void setReplacedDeliveryId(String value);

	/**
	 * Unsets the value of the '{@link Accounting.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(String)
	 * @generated
	 */
	void unsetReplacedDeliveryId();

	/**
	 * Returns whether the value of the '{@link Accounting.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replaced Delivery Id</em>' attribute is set.
	 * @see #unsetReplacedDeliveryId()
	 * @see #getReplacedDeliveryId()
	 * @see #setReplacedDeliveryId(String)
	 * @generated
	 */
	boolean isSetReplacedDeliveryId();

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #setOptional(boolean)
	 * @see Accounting.AccountingPackage#getDelivery_Optional()
	 * @model default="false" unsettable="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Unsets the value of the '{@link Accounting.Delivery#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	void unsetOptional();

	/**
	 * Returns whether the value of the '{@link Accounting.Delivery#isOptional <em>Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional</em>' attribute is set.
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	boolean isSetOptional();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Carrier)
	 * @see Accounting.AccountingPackage#getDelivery_Provider()
	 * @model
	 * @generated
	 */
	Carrier getProvider();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Carrier value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.SchemaVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see Accounting.SchemaVersion
	 * @see #setSchemaVersion(SchemaVersion)
	 * @see Accounting.AccountingPackage#getDelivery_SchemaVersion()
	 * @model
	 * @generated
	 */
	SchemaVersion getSchemaVersion();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see Accounting.SchemaVersion
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(SchemaVersion value);

	/**
	 * Returns the value of the '<em><b>Accepted Schema Version</b></em>' attribute.
	 * The literals are from the enumeration {@link Accounting.SchemaVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Schema Version</em>' attribute.
	 * @see Accounting.SchemaVersion
	 * @see #setAcceptedSchemaVersion(SchemaVersion)
	 * @see Accounting.AccountingPackage#getDelivery_AcceptedSchemaVersion()
	 * @model
	 * @generated
	 */
	SchemaVersion getAcceptedSchemaVersion();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Schema Version</em>' attribute.
	 * @see Accounting.SchemaVersion
	 * @see #getAcceptedSchemaVersion()
	 * @generated
	 */
	void setAcceptedSchemaVersion(SchemaVersion value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The default value is <code>"PRODUCTION_DATA"</code>.
	 * The literals are from the enumeration {@link Accounting.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see Accounting.DataType
	 * @see #setUsage(DataType)
	 * @see Accounting.AccountingPackage#getDelivery_Usage()
	 * @model default="PRODUCTION_DATA"
	 * @generated
	 */
	DataType getUsage();

	/**
	 * Sets the value of the '{@link Accounting.Delivery#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see Accounting.DataType
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(DataType value);

} // Delivery
