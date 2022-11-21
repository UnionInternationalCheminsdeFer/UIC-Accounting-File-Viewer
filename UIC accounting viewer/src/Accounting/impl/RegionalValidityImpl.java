/**
 */
package Accounting.impl;

import Accounting.AccountingPackage;
import Accounting.CarrierConstraint;
import Accounting.Line;
import Accounting.Polygone;
import Accounting.RegionalValidity;
import Accounting.ServiceConstraint;
import Accounting.ViaStation;
import Accounting.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regional Validity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getSeqNb <em>Seq Nb</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getViaStation <em>Via Station</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getLine <em>Line</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getPolygone <em>Polygone</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Accounting.impl.RegionalValidityImpl#getServiceConstraint <em>Service Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalValidityImpl extends MinimalEObjectImpl.Container implements RegionalValidity {
	/**
	 * The default value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQ_NB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeqNb() <em>Seq Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqNb()
	 * @generated
	 * @ordered
	 */
	protected int seqNb = SEQ_NB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViaStation() <em>Via Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaStation()
	 * @generated
	 * @ordered
	 */
	protected ViaStation viaStation;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Line line;

	/**
	 * The cached value of the '{@link #getPolygone() <em>Polygone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygone()
	 * @generated
	 * @ordered
	 */
	protected Polygone polygone;

	/**
	 * The cached value of the '{@link #getCarrierConstraint() <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierConstraint()
	 * @generated
	 * @ordered
	 */
	protected CarrierConstraint carrierConstraint;

	/**
	 * The cached value of the '{@link #getServiceConstraint() <em>Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConstraint()
	 * @generated
	 * @ordered
	 */
	protected ServiceConstraint serviceConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalValidityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.REGIONAL_VALIDITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeqNb() {
		return seqNb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqNb(int newSeqNb) {
		int oldSeqNb = seqNb;
		seqNb = newSeqNb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__SEQ_NB, oldSeqNb, seqNb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViaStation getViaStation() {
		return viaStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViaStation(ViaStation newViaStation, NotificationChain msgs) {
		ViaStation oldViaStation = viaStation;
		viaStation = newViaStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__VIA_STATION, oldViaStation, newViaStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViaStation(ViaStation newViaStation) {
		if (newViaStation != viaStation) {
			NotificationChain msgs = null;
			if (viaStation != null)
				msgs = ((InternalEObject)viaStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__VIA_STATION, null, msgs);
			if (newViaStation != null)
				msgs = ((InternalEObject)newViaStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__VIA_STATION, null, msgs);
			msgs = basicSetViaStation(newViaStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__VIA_STATION, newViaStation, newViaStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(Zone newZone, NotificationChain msgs) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__ZONE, oldZone, newZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(Zone newZone) {
		if (newZone != zone) {
			NotificationChain msgs = null;
			if (zone != null)
				msgs = ((InternalEObject)zone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__ZONE, null, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__ZONE, null, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__ZONE, newZone, newZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs) {
		Line oldLine = line;
		line = newLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__LINE, oldLine, newLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Line newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__LINE, newLine, newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygone getPolygone() {
		return polygone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygone(Polygone newPolygone, NotificationChain msgs) {
		Polygone oldPolygone = polygone;
		polygone = newPolygone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__POLYGONE, oldPolygone, newPolygone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygone(Polygone newPolygone) {
		if (newPolygone != polygone) {
			NotificationChain msgs = null;
			if (polygone != null)
				msgs = ((InternalEObject)polygone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__POLYGONE, null, msgs);
			if (newPolygone != null)
				msgs = ((InternalEObject)newPolygone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountingPackage.REGIONAL_VALIDITY__POLYGONE, null, msgs);
			msgs = basicSetPolygone(newPolygone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__POLYGONE, newPolygone, newPolygone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint getCarrierConstraint() {
		if (carrierConstraint != null && carrierConstraint.eIsProxy()) {
			InternalEObject oldCarrierConstraint = (InternalEObject)carrierConstraint;
			carrierConstraint = (CarrierConstraint)eResolveProxy(oldCarrierConstraint);
			if (carrierConstraint != oldCarrierConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
			}
		}
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierConstraint basicGetCarrierConstraint() {
		return carrierConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierConstraint(CarrierConstraint newCarrierConstraint) {
		CarrierConstraint oldCarrierConstraint = carrierConstraint;
		carrierConstraint = newCarrierConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT, oldCarrierConstraint, carrierConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint getServiceConstraint() {
		if (serviceConstraint != null && serviceConstraint.eIsProxy()) {
			InternalEObject oldServiceConstraint = (InternalEObject)serviceConstraint;
			serviceConstraint = (ServiceConstraint)eResolveProxy(oldServiceConstraint);
			if (serviceConstraint != oldServiceConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
			}
		}
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConstraint basicGetServiceConstraint() {
		return serviceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConstraint(ServiceConstraint newServiceConstraint) {
		ServiceConstraint oldServiceConstraint = serviceConstraint;
		serviceConstraint = newServiceConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT, oldServiceConstraint, serviceConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.REGIONAL_VALIDITY__VIA_STATION:
				return basicSetViaStation(null, msgs);
			case AccountingPackage.REGIONAL_VALIDITY__ZONE:
				return basicSetZone(null, msgs);
			case AccountingPackage.REGIONAL_VALIDITY__LINE:
				return basicSetLine(null, msgs);
			case AccountingPackage.REGIONAL_VALIDITY__POLYGONE:
				return basicSetPolygone(null, msgs);
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
			case AccountingPackage.REGIONAL_VALIDITY__SEQ_NB:
				return getSeqNb();
			case AccountingPackage.REGIONAL_VALIDITY__VIA_STATION:
				return getViaStation();
			case AccountingPackage.REGIONAL_VALIDITY__ZONE:
				return getZone();
			case AccountingPackage.REGIONAL_VALIDITY__LINE:
				return getLine();
			case AccountingPackage.REGIONAL_VALIDITY__POLYGONE:
				return getPolygone();
			case AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT:
				if (resolve) return getCarrierConstraint();
				return basicGetCarrierConstraint();
			case AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				if (resolve) return getServiceConstraint();
				return basicGetServiceConstraint();
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
			case AccountingPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb((Integer)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__VIA_STATION:
				setViaStation((ViaStation)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__ZONE:
				setZone((Zone)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__LINE:
				setLine((Line)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__POLYGONE:
				setPolygone((Polygone)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)newValue);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)newValue);
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
			case AccountingPackage.REGIONAL_VALIDITY__SEQ_NB:
				setSeqNb(SEQ_NB_EDEFAULT);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__VIA_STATION:
				setViaStation((ViaStation)null);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__ZONE:
				setZone((Zone)null);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__LINE:
				setLine((Line)null);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__POLYGONE:
				setPolygone((Polygone)null);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT:
				setCarrierConstraint((CarrierConstraint)null);
				return;
			case AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				setServiceConstraint((ServiceConstraint)null);
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
			case AccountingPackage.REGIONAL_VALIDITY__SEQ_NB:
				return seqNb != SEQ_NB_EDEFAULT;
			case AccountingPackage.REGIONAL_VALIDITY__VIA_STATION:
				return viaStation != null;
			case AccountingPackage.REGIONAL_VALIDITY__ZONE:
				return zone != null;
			case AccountingPackage.REGIONAL_VALIDITY__LINE:
				return line != null;
			case AccountingPackage.REGIONAL_VALIDITY__POLYGONE:
				return polygone != null;
			case AccountingPackage.REGIONAL_VALIDITY__CARRIER_CONSTRAINT:
				return carrierConstraint != null;
			case AccountingPackage.REGIONAL_VALIDITY__SERVICE_CONSTRAINT:
				return serviceConstraint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (seqNb: ");
		result.append(seqNb);
		result.append(')');
		return result.toString();
	}

} //RegionalValidityImpl
