/**
 */
package genDSL2.impl;

import genDSL2.Cohabitation;
import genDSL2.GenDSL2Package;
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
 * An implementation of the model object '<em><b>Cohabitation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genDSL2.impl.CohabitationImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link genDSL2.impl.CohabitationImpl#isLegitimate <em>Legitimate</em>}</li>
 *   <li>{@link genDSL2.impl.CohabitationImpl#getType <em>Type</em>}</li>
 *   <li>{@link genDSL2.impl.CohabitationImpl#getPartners <em>Partners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CohabitationImpl extends MinimalEObjectImpl.Container implements Cohabitation {
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
	 * The default value of the '{@link #isLegitimate() <em>Legitimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegitimate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEGITIMATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLegitimate() <em>Legitimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLegitimate()
	 * @generated
	 * @ordered
	 */
	protected boolean legitimate = LEGITIMATE_EDEFAULT;

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
	 * The cached value of the '{@link #getPartners() <em>Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> partners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CohabitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenDSL2Package.Literals.COHABITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Person>(Person.class, this, GenDSL2Package.COHABITATION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLegitimate() {
		return legitimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegitimate(boolean newLegitimate) {
		boolean oldLegitimate = legitimate;
		legitimate = newLegitimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.COHABITATION__LEGITIMATE, oldLegitimate, legitimate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenDSL2Package.COHABITATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPartners() {
		if (partners == null) {
			partners = new EObjectResolvingEList<Person>(Person.class, this, GenDSL2Package.COHABITATION__PARTNERS);
		}
		return partners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenDSL2Package.COHABITATION__CHILDREN:
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
			case GenDSL2Package.COHABITATION__CHILDREN:
				return getChildren();
			case GenDSL2Package.COHABITATION__LEGITIMATE:
				return isLegitimate();
			case GenDSL2Package.COHABITATION__TYPE:
				return getType();
			case GenDSL2Package.COHABITATION__PARTNERS:
				return getPartners();
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
			case GenDSL2Package.COHABITATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case GenDSL2Package.COHABITATION__LEGITIMATE:
				setLegitimate((Boolean)newValue);
				return;
			case GenDSL2Package.COHABITATION__TYPE:
				setType((TypeOfIntimateRelationship)newValue);
				return;
			case GenDSL2Package.COHABITATION__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends Person>)newValue);
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
			case GenDSL2Package.COHABITATION__CHILDREN:
				getChildren().clear();
				return;
			case GenDSL2Package.COHABITATION__LEGITIMATE:
				setLegitimate(LEGITIMATE_EDEFAULT);
				return;
			case GenDSL2Package.COHABITATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GenDSL2Package.COHABITATION__PARTNERS:
				getPartners().clear();
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
			case GenDSL2Package.COHABITATION__CHILDREN:
				return children != null && !children.isEmpty();
			case GenDSL2Package.COHABITATION__LEGITIMATE:
				return legitimate != LEGITIMATE_EDEFAULT;
			case GenDSL2Package.COHABITATION__TYPE:
				return type != TYPE_EDEFAULT;
			case GenDSL2Package.COHABITATION__PARTNERS:
				return partners != null && !partners.isEmpty();
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
		result.append(" (legitimate: ");
		result.append(legitimate);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CohabitationImpl
