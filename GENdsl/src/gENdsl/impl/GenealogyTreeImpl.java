/**
 */
package gENdsl.impl;

import gENdsl.DateX;
import gENdsl.GENdslPackage;
import gENdsl.GenealogyTree;
import gENdsl.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genealogy Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.impl.GenealogyTreeImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link gENdsl.impl.GenealogyTreeImpl#getEstablished <em>Established</em>}</li>
 *   <li>{@link gENdsl.impl.GenealogyTreeImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenealogyTreeImpl extends MinimalEObjectImpl.Container implements GenealogyTree {
	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstablished() <em>Established</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstablished()
	 * @generated
	 * @ordered
	 */
	protected DateX established;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenealogyTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GENdslPackage.Literals.GENEALOGY_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.GENEALOGY_TREE__FAMILY_NAME, oldFamilyName, familyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX getEstablished() {
		return established;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstablished(DateX newEstablished, NotificationChain msgs) {
		DateX oldEstablished = established;
		established = newEstablished;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GENdslPackage.GENEALOGY_TREE__ESTABLISHED, oldEstablished, newEstablished);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstablished(DateX newEstablished) {
		if (newEstablished != established) {
			NotificationChain msgs = null;
			if (established != null)
				msgs = ((InternalEObject)established).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.GENEALOGY_TREE__ESTABLISHED, null, msgs);
			if (newEstablished != null)
				msgs = ((InternalEObject)newEstablished).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.GENEALOGY_TREE__ESTABLISHED, null, msgs);
			msgs = basicSetEstablished(newEstablished, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.GENEALOGY_TREE__ESTABLISHED, newEstablished, newEstablished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, GENdslPackage.GENEALOGY_TREE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GENdslPackage.GENEALOGY_TREE__ESTABLISHED:
				return basicSetEstablished(null, msgs);
			case GENdslPackage.GENEALOGY_TREE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
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
			case GENdslPackage.GENEALOGY_TREE__FAMILY_NAME:
				return getFamilyName();
			case GENdslPackage.GENEALOGY_TREE__ESTABLISHED:
				return getEstablished();
			case GENdslPackage.GENEALOGY_TREE__PERSON:
				return getPerson();
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
			case GENdslPackage.GENEALOGY_TREE__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case GENdslPackage.GENEALOGY_TREE__ESTABLISHED:
				setEstablished((DateX)newValue);
				return;
			case GENdslPackage.GENEALOGY_TREE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
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
			case GENdslPackage.GENEALOGY_TREE__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
			case GENdslPackage.GENEALOGY_TREE__ESTABLISHED:
				setEstablished((DateX)null);
				return;
			case GENdslPackage.GENEALOGY_TREE__PERSON:
				getPerson().clear();
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
			case GENdslPackage.GENEALOGY_TREE__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
			case GENdslPackage.GENEALOGY_TREE__ESTABLISHED:
				return established != null;
			case GENdslPackage.GENEALOGY_TREE__PERSON:
				return person != null && !person.isEmpty();
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
		result.append(" (familyName: ");
		result.append(familyName);
		result.append(')');
		return result.toString();
	}

} //GenealogyTreeImpl
