/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.Calendar;
import Accounting.EndOfSale;
import Accounting.SalesRestriction;
import Accounting.StartOfSale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.SalesRestrictionImpl#getSalesDates <em>Sales Dates</em>}</li>
 *   <li>{@link Accounting.impl.SalesRestrictionImpl#getStartOfSale <em>Start Of Sale</em>}</li>
 *   <li>{@link Accounting.impl.SalesRestrictionImpl#getEndOfSale <em>End Of Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesRestrictionImpl extends MinimalEObjectImpl.Container implements SalesRestriction {
	/**
	 * The cached value of the '{@link #getSalesDates() <em>Sales Dates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesDates()
	 * @generated
	 * @ordered
	 */
	protected Calendar salesDates;

	/**
	 * The cached value of the '{@link #getStartOfSale() <em>Start Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfSale()
	 * @generated
	 * @ordered
	 */
	protected StartOfSale startOfSale;

	/**
	 * The cached value of the '{@link #getEndOfSale() <em>End Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfSale()
	 * @generated
	 * @ordered
	 */
	protected EndOfSale endOfSale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.SALES_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getSalesDates() {
		if (salesDates != null && salesDates.eIsProxy()) {
			InternalEObject oldSalesDates = (InternalEObject)salesDates;
			salesDates = (Calendar)eResolveProxy(oldSalesDates);
			if (salesDates != oldSalesDates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.SALES_RESTRICTION__SALES_DATES, oldSalesDates, salesDates));
			}
		}
		return salesDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar basicGetSalesDates() {
		return salesDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalesDates(Calendar newSalesDates) {
		Calendar oldSalesDates = salesDates;
		salesDates = newSalesDates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SALES_RESTRICTION__SALES_DATES, oldSalesDates, salesDates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfSale getStartOfSale() {
		return startOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOfSale(StartOfSale newStartOfSale, NotificationChain msgs) {
		StartOfSale oldStartOfSale = startOfSale;
		startOfSale = newStartOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.SALES_RESTRICTION__START_OF_SALE, oldStartOfSale, newStartOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfSale(StartOfSale newStartOfSale) {
		if (newStartOfSale != startOfSale) {
			NotificationChain msgs = null;
			if (startOfSale != null)
				msgs = ((InternalEObject)startOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.SALES_RESTRICTION__START_OF_SALE, null, msgs);
			if (newStartOfSale != null)
				msgs = ((InternalEObject)newStartOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.SALES_RESTRICTION__START_OF_SALE, null, msgs);
			msgs = basicSetStartOfSale(newStartOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SALES_RESTRICTION__START_OF_SALE, newStartOfSale, newStartOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfSale getEndOfSale() {
		return endOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfSale(EndOfSale newEndOfSale, NotificationChain msgs) {
		EndOfSale oldEndOfSale = endOfSale;
		endOfSale = newEndOfSale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.SALES_RESTRICTION__END_OF_SALE, oldEndOfSale, newEndOfSale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfSale(EndOfSale newEndOfSale) {
		if (newEndOfSale != endOfSale) {
			NotificationChain msgs = null;
			if (endOfSale != null)
				msgs = ((InternalEObject)endOfSale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.SALES_RESTRICTION__END_OF_SALE, null, msgs);
			if (newEndOfSale != null)
				msgs = ((InternalEObject)newEndOfSale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.SALES_RESTRICTION__END_OF_SALE, null, msgs);
			msgs = basicSetEndOfSale(newEndOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.SALES_RESTRICTION__END_OF_SALE, newEndOfSale, newEndOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.SALES_RESTRICTION__START_OF_SALE:
				return basicSetStartOfSale(null, msgs);
			case AccountingPackage.SALES_RESTRICTION__END_OF_SALE:
				return basicSetEndOfSale(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.SALES_RESTRICTION__SALES_DATES:
				if (resolve) return getSalesDates();
				return basicGetSalesDates();
			case AccountingPackage.SALES_RESTRICTION__START_OF_SALE:
				return getStartOfSale();
			case AccountingPackage.SALES_RESTRICTION__END_OF_SALE:
				return getEndOfSale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountingPackage.SALES_RESTRICTION__SALES_DATES:
				setSalesDates((Calendar)newValue);
				return;
			case AccountingPackage.SALES_RESTRICTION__START_OF_SALE:
				setStartOfSale((StartOfSale)newValue);
				return;
			case AccountingPackage.SALES_RESTRICTION__END_OF_SALE:
				setEndOfSale((EndOfSale)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccountingPackage.SALES_RESTRICTION__SALES_DATES:
				setSalesDates((Calendar)null);
				return;
			case AccountingPackage.SALES_RESTRICTION__START_OF_SALE:
				setStartOfSale((StartOfSale)null);
				return;
			case AccountingPackage.SALES_RESTRICTION__END_OF_SALE:
				setEndOfSale((EndOfSale)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccountingPackage.SALES_RESTRICTION__SALES_DATES:
				return salesDates != null;
			case AccountingPackage.SALES_RESTRICTION__START_OF_SALE:
				return startOfSale != null;
			case AccountingPackage.SALES_RESTRICTION__END_OF_SALE:
				return endOfSale != null;
		}
		return super.eIsSet(featureID);
	}

} //SalesRestrictionImpl
