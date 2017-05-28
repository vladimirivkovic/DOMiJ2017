/**
 */
package genDSL2.impl;

import genDSL2.DateX;
import genDSL2.GenDSL2Package;
import genDSL2.Marriage;
import genDSL2.Person;
import genDSL2.TypeOfIntimateRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marriage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genDSL2.impl.MarriageImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link genDSL2.impl.MarriageImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link genDSL2.impl.MarriageImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link genDSL2.impl.MarriageImpl#getType <em>Type</em>}</li>
 *   <li>{@link genDSL2.impl.MarriageImpl#getSpouses <em>Spouses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarriageImpl extends MinimalEObjectImpl.Container implements Marriage {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfIntimateRelationship TYPE_EDEFAULT = TypeOfIntimateRelationship.MONOGAMY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeOfIntimateRelationship type = TYPE_EDEFAULT;

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
		return GenDSL2Package.Literals.MARRIAGE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenDSL2Package.MARRIAGE__FROM_DATE, oldFromDate, newFromDate);
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
				msgs = ((InternalEObject)fromDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenDSL2Package.MARRIAGE__FROM_DATE, null, msgs);
			if (newFromDate != null)
				msgs = ((InternalEObject)newFromDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenDSL2Package.MARRIAGE__FROM_DATE, null, msgs);
			msgs = basicSetFromDate(newFromDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.MARRIAGE__FROM_DATE, newFromDate, newFromDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenDSL2Package.MARRIAGE__TO_DATE, oldToDate, newToDate);
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
				msgs = ((InternalEObject)toDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenDSL2Package.MARRIAGE__TO_DATE, null, msgs);
			if (newToDate != null)
				msgs = ((InternalEObject)newToDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenDSL2Package.MARRIAGE__TO_DATE, null, msgs);
			msgs = basicSetToDate(newToDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.MARRIAGE__TO_DATE, newToDate, newToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Person>(Person.class, this, GenDSL2Package.MARRIAGE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfIntimateRelationship getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeOfIntimateRelationship newType) {
		TypeOfIntimateRelationship oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.MARRIAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getSpouses() {
		if (spouses == null) {
			spouses = new EObjectResolvingEList<Person>(Person.class, this, GenDSL2Package.MARRIAGE__SPOUSES);
		}
		return spouses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenDSL2Package.MARRIAGE__FROM_DATE:
				return basicSetFromDate(null, msgs);
			case GenDSL2Package.MARRIAGE__TO_DATE:
				return basicSetToDate(null, msgs);
			case GenDSL2Package.MARRIAGE__CHILDREN:
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
			case GenDSL2Package.MARRIAGE__FROM_DATE:
				return getFromDate();
			case GenDSL2Package.MARRIAGE__TO_DATE:
				return getToDate();
			case GenDSL2Package.MARRIAGE__CHILDREN:
				return getChildren();
			case GenDSL2Package.MARRIAGE__TYPE:
				return getType();
			case GenDSL2Package.MARRIAGE__SPOUSES:
				return getSpouses();
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
			case GenDSL2Package.MARRIAGE__FROM_DATE:
				setFromDate((DateX)newValue);
				return;
			case GenDSL2Package.MARRIAGE__TO_DATE:
				setToDate((DateX)newValue);
				return;
			case GenDSL2Package.MARRIAGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case GenDSL2Package.MARRIAGE__TYPE:
				setType((TypeOfIntimateRelationship)newValue);
				return;
			case GenDSL2Package.MARRIAGE__SPOUSES:
				getSpouses().clear();
				getSpouses().addAll((Collection<? extends Person>)newValue);
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
			case GenDSL2Package.MARRIAGE__FROM_DATE:
				setFromDate((DateX)null);
				return;
			case GenDSL2Package.MARRIAGE__TO_DATE:
				setToDate((DateX)null);
				return;
			case GenDSL2Package.MARRIAGE__CHILDREN:
				getChildren().clear();
				return;
			case GenDSL2Package.MARRIAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GenDSL2Package.MARRIAGE__SPOUSES:
				getSpouses().clear();
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
			case GenDSL2Package.MARRIAGE__FROM_DATE:
				return fromDate != null;
			case GenDSL2Package.MARRIAGE__TO_DATE:
				return toDate != null;
			case GenDSL2Package.MARRIAGE__CHILDREN:
				return children != null && !children.isEmpty();
			case GenDSL2Package.MARRIAGE__TYPE:
				return type != TYPE_EDEFAULT;
			case GenDSL2Package.MARRIAGE__SPOUSES:
				return spouses != null && !spouses.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MarriageImpl
