/**
 */
package gENdsl.impl;

import gENdsl.DateX;
import gENdsl.GENdslPackage;
import gENdsl.Marriage;
import gENdsl.Person;
import gENdsl.TypeOfIntimateRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marriage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.impl.MarriageImpl#getSpouses <em>Spouses</em>}</li>
 *   <li>{@link gENdsl.impl.MarriageImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link gENdsl.impl.MarriageImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link gENdsl.impl.MarriageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link gENdsl.impl.MarriageImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarriageImpl extends MinimalEObjectImpl.Container implements Marriage {
	/**
	 * The cached value of the '{@link #getSpouses() <em>Spouses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpouses()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> spouses;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected DateX fromDate;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected DateX toDate;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> children;

	/**
	 * The cached setting delegate for the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)GENdslPackage.Literals.MARRIAGE__TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarriageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GENdslPackage.Literals.MARRIAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getSpouses() {
		if (spouses == null) {
			spouses = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, GENdslPackage.MARRIAGE__SPOUSES, GENdslPackage.PERSON__MARRIAGES);
		}
		return spouses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDate(DateX newFromDate, NotificationChain msgs) {
		DateX oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GENdslPackage.MARRIAGE__FROM_DATE, oldFromDate, newFromDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(DateX newFromDate) {
		if (newFromDate != fromDate) {
			NotificationChain msgs = null;
			if (fromDate != null)
				msgs = ((InternalEObject)fromDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.MARRIAGE__FROM_DATE, null, msgs);
			if (newFromDate != null)
				msgs = ((InternalEObject)newFromDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.MARRIAGE__FROM_DATE, null, msgs);
			msgs = basicSetFromDate(newFromDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.MARRIAGE__FROM_DATE, newFromDate, newFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDate(DateX newToDate, NotificationChain msgs) {
		DateX oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GENdslPackage.MARRIAGE__TO_DATE, oldToDate, newToDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(DateX newToDate) {
		if (newToDate != toDate) {
			NotificationChain msgs = null;
			if (toDate != null)
				msgs = ((InternalEObject)toDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.MARRIAGE__TO_DATE, null, msgs);
			if (newToDate != null)
				msgs = ((InternalEObject)newToDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.MARRIAGE__TO_DATE, null, msgs);
			msgs = basicSetToDate(newToDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.MARRIAGE__TO_DATE, newToDate, newToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Person>(Person.class, this, GENdslPackage.MARRIAGE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfIntimateRelationship getType() {
		return (TypeOfIntimateRelationship)TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeOfIntimateRelationship newType) {
		TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GENdslPackage.MARRIAGE__SPOUSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpouses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GENdslPackage.MARRIAGE__SPOUSES:
				return ((InternalEList<?>)getSpouses()).basicRemove(otherEnd, msgs);
			case GENdslPackage.MARRIAGE__FROM_DATE:
				return basicSetFromDate(null, msgs);
			case GENdslPackage.MARRIAGE__TO_DATE:
				return basicSetToDate(null, msgs);
			case GENdslPackage.MARRIAGE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case GENdslPackage.MARRIAGE__SPOUSES:
				return getSpouses();
			case GENdslPackage.MARRIAGE__FROM_DATE:
				return getFromDate();
			case GENdslPackage.MARRIAGE__TO_DATE:
				return getToDate();
			case GENdslPackage.MARRIAGE__CHILDREN:
				return getChildren();
			case GENdslPackage.MARRIAGE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GENdslPackage.MARRIAGE__SPOUSES:
				getSpouses().clear();
				getSpouses().addAll((Collection<? extends Person>)newValue);
				return;
			case GENdslPackage.MARRIAGE__FROM_DATE:
				setFromDate((DateX)newValue);
				return;
			case GENdslPackage.MARRIAGE__TO_DATE:
				setToDate((DateX)newValue);
				return;
			case GENdslPackage.MARRIAGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case GENdslPackage.MARRIAGE__TYPE:
				setType((TypeOfIntimateRelationship)newValue);
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
			case GENdslPackage.MARRIAGE__SPOUSES:
				getSpouses().clear();
				return;
			case GENdslPackage.MARRIAGE__FROM_DATE:
				setFromDate((DateX)null);
				return;
			case GENdslPackage.MARRIAGE__TO_DATE:
				setToDate((DateX)null);
				return;
			case GENdslPackage.MARRIAGE__CHILDREN:
				getChildren().clear();
				return;
			case GENdslPackage.MARRIAGE__TYPE:
				TYPE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case GENdslPackage.MARRIAGE__SPOUSES:
				return spouses != null && !spouses.isEmpty();
			case GENdslPackage.MARRIAGE__FROM_DATE:
				return fromDate != null;
			case GENdslPackage.MARRIAGE__TO_DATE:
				return toDate != null;
			case GENdslPackage.MARRIAGE__CHILDREN:
				return children != null && !children.isEmpty();
			case GENdslPackage.MARRIAGE__TYPE:
				return TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //MarriageImpl
