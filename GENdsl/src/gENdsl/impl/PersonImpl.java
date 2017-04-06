/**
 */
package gENdsl.impl;

import gENdsl.Cohabitation;
import gENdsl.DateX;
import gENdsl.GENdslPackage;
import gENdsl.Gender;
import gENdsl.Marriage;
import gENdsl.Person;
import gENdsl.PersonHistory;
import gENdsl.TypeOfPerson;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getDeathDate <em>Death Date</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getBirthPlace <em>Birth Place</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getDeathPlace <em>Death Place</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getRestingPlace <em>Resting Place</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getType <em>Type</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getOtherNames <em>Other Names</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getMarriages <em>Marriages</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getCohabitations <em>Cohabitations</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getDeathCause <em>Death Cause</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getPersonhistory <em>Personhistory</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getCohabitation <em>Cohabitation</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#getMarriage <em>Marriage</em>}</li>
 *   <li>{@link gENdsl.impl.PersonImpl#isUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected DateX birthDate;

	/**
	 * The cached value of the '{@link #getDeathDate() <em>Death Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathDate()
	 * @generated
	 * @ordered
	 */
	protected DateX deathDate;

	/**
	 * The default value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTH_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected String birthPlace = BIRTH_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeathPlace() <em>Death Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String DEATH_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeathPlace() <em>Death Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathPlace()
	 * @generated
	 * @ordered
	 */
	protected String deathPlace = DEATH_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestingPlace() <em>Resting Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestingPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTING_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestingPlace() <em>Resting Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestingPlace()
	 * @generated
	 * @ordered
	 */
	protected String restingPlace = RESTING_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfPerson TYPE_EDEFAULT = TypeOfPerson.BIOLOGICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeOfPerson type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherNames() <em>Other Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherNames;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarriages() <em>Marriages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarriages()
	 * @generated
	 * @ordered
	 */
	protected EList<Marriage> marriages;

	/**
	 * The cached value of the '{@link #getCohabitations() <em>Cohabitations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCohabitations()
	 * @generated
	 * @ordered
	 */
	protected EList<Cohabitation> cohabitations;

	/**
	 * The default value of the '{@link #getDeathCause() <em>Death Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathCause()
	 * @generated
	 * @ordered
	 */
	protected static final String DEATH_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeathCause() <em>Death Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathCause()
	 * @generated
	 * @ordered
	 */
	protected String deathCause = DEATH_CAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonhistory() <em>Personhistory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonhistory()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonHistory> personhistory;

	/**
	 * The cached value of the '{@link #getCohabitation() <em>Cohabitation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCohabitation()
	 * @generated
	 * @ordered
	 */
	protected EList<Cohabitation> cohabitation;

	/**
	 * The cached value of the '{@link #getMarriage() <em>Marriage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarriage()
	 * @generated
	 * @ordered
	 */
	protected EList<Marriage> marriage;

	/**
	 * The default value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNKNOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnknown()
	 * @generated
	 * @ordered
	 */
	protected boolean unknown = UNKNOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GENdslPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthDate(DateX newBirthDate, NotificationChain msgs) {
		DateX oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__BIRTH_DATE, oldBirthDate, newBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(DateX newBirthDate) {
		if (newBirthDate != birthDate) {
			NotificationChain msgs = null;
			if (birthDate != null)
				msgs = ((InternalEObject)birthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.PERSON__BIRTH_DATE, null, msgs);
			if (newBirthDate != null)
				msgs = ((InternalEObject)newBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.PERSON__BIRTH_DATE, null, msgs);
			msgs = basicSetBirthDate(newBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__BIRTH_DATE, newBirthDate, newBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX getDeathDate() {
		return deathDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeathDate(DateX newDeathDate, NotificationChain msgs) {
		DateX oldDeathDate = deathDate;
		deathDate = newDeathDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__DEATH_DATE, oldDeathDate, newDeathDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathDate(DateX newDeathDate) {
		if (newDeathDate != deathDate) {
			NotificationChain msgs = null;
			if (deathDate != null)
				msgs = ((InternalEObject)deathDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.PERSON__DEATH_DATE, null, msgs);
			if (newDeathDate != null)
				msgs = ((InternalEObject)newDeathDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GENdslPackage.PERSON__DEATH_DATE, null, msgs);
			msgs = basicSetDeathDate(newDeathDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__DEATH_DATE, newDeathDate, newDeathDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthPlace(String newBirthPlace) {
		String oldBirthPlace = birthPlace;
		birthPlace = newBirthPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__BIRTH_PLACE, oldBirthPlace, birthPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeathPlace() {
		return deathPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathPlace(String newDeathPlace) {
		String oldDeathPlace = deathPlace;
		deathPlace = newDeathPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__DEATH_PLACE, oldDeathPlace, deathPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestingPlace() {
		return restingPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestingPlace(String newRestingPlace) {
		String oldRestingPlace = restingPlace;
		restingPlace = newRestingPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__RESTING_PLACE, oldRestingPlace, restingPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfPerson getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeOfPerson newType) {
		TypeOfPerson oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOtherNames() {
		if (otherNames == null) {
			otherNames = new EDataTypeUniqueEList<String>(String.class, this, GENdslPackage.PERSON__OTHER_NAMES);
		}
		return otherNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marriage> getMarriages() {
		if (marriages == null) {
			marriages = new EObjectWithInverseResolvingEList.ManyInverse<Marriage>(Marriage.class, this, GENdslPackage.PERSON__MARRIAGES, GENdslPackage.MARRIAGE__SPOUSES);
		}
		return marriages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cohabitation> getCohabitations() {
		if (cohabitations == null) {
			cohabitations = new EObjectWithInverseResolvingEList.ManyInverse<Cohabitation>(Cohabitation.class, this, GENdslPackage.PERSON__COHABITATIONS, GENdslPackage.COHABITATION__PARTNERS);
		}
		return cohabitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeathCause() {
		return deathCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathCause(String newDeathCause) {
		String oldDeathCause = deathCause;
		deathCause = newDeathCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__DEATH_CAUSE, oldDeathCause, deathCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonHistory> getPersonhistory() {
		if (personhistory == null) {
			personhistory = new EObjectContainmentEList<PersonHistory>(PersonHistory.class, this, GENdslPackage.PERSON__PERSONHISTORY);
		}
		return personhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cohabitation> getCohabitation() {
		if (cohabitation == null) {
			cohabitation = new EObjectContainmentEList<Cohabitation>(Cohabitation.class, this, GENdslPackage.PERSON__COHABITATION);
		}
		return cohabitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marriage> getMarriage() {
		if (marriage == null) {
			marriage = new EObjectContainmentEList<Marriage>(Marriage.class, this, GENdslPackage.PERSON__MARRIAGE);
		}
		return marriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnknown() {
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknown(boolean newUnknown) {
		boolean oldUnknown = unknown;
		unknown = newUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GENdslPackage.PERSON__UNKNOWN, oldUnknown, unknown));
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
			case GENdslPackage.PERSON__MARRIAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarriages()).basicAdd(otherEnd, msgs);
			case GENdslPackage.PERSON__COHABITATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCohabitations()).basicAdd(otherEnd, msgs);
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
			case GENdslPackage.PERSON__BIRTH_DATE:
				return basicSetBirthDate(null, msgs);
			case GENdslPackage.PERSON__DEATH_DATE:
				return basicSetDeathDate(null, msgs);
			case GENdslPackage.PERSON__MARRIAGES:
				return ((InternalEList<?>)getMarriages()).basicRemove(otherEnd, msgs);
			case GENdslPackage.PERSON__COHABITATIONS:
				return ((InternalEList<?>)getCohabitations()).basicRemove(otherEnd, msgs);
			case GENdslPackage.PERSON__PERSONHISTORY:
				return ((InternalEList<?>)getPersonhistory()).basicRemove(otherEnd, msgs);
			case GENdslPackage.PERSON__COHABITATION:
				return ((InternalEList<?>)getCohabitation()).basicRemove(otherEnd, msgs);
			case GENdslPackage.PERSON__MARRIAGE:
				return ((InternalEList<?>)getMarriage()).basicRemove(otherEnd, msgs);
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
			case GENdslPackage.PERSON__GIVEN_NAME:
				return getGivenName();
			case GENdslPackage.PERSON__BIRTH_DATE:
				return getBirthDate();
			case GENdslPackage.PERSON__DEATH_DATE:
				return getDeathDate();
			case GENdslPackage.PERSON__BIRTH_PLACE:
				return getBirthPlace();
			case GENdslPackage.PERSON__DEATH_PLACE:
				return getDeathPlace();
			case GENdslPackage.PERSON__RESTING_PLACE:
				return getRestingPlace();
			case GENdslPackage.PERSON__TYPE:
				return getType();
			case GENdslPackage.PERSON__GENDER:
				return getGender();
			case GENdslPackage.PERSON__OTHER_NAMES:
				return getOtherNames();
			case GENdslPackage.PERSON__NICKNAME:
				return getNickname();
			case GENdslPackage.PERSON__MARRIAGES:
				return getMarriages();
			case GENdslPackage.PERSON__COHABITATIONS:
				return getCohabitations();
			case GENdslPackage.PERSON__DEATH_CAUSE:
				return getDeathCause();
			case GENdslPackage.PERSON__PERSONHISTORY:
				return getPersonhistory();
			case GENdslPackage.PERSON__COHABITATION:
				return getCohabitation();
			case GENdslPackage.PERSON__MARRIAGE:
				return getMarriage();
			case GENdslPackage.PERSON__UNKNOWN:
				return isUnknown();
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
			case GENdslPackage.PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case GENdslPackage.PERSON__BIRTH_DATE:
				setBirthDate((DateX)newValue);
				return;
			case GENdslPackage.PERSON__DEATH_DATE:
				setDeathDate((DateX)newValue);
				return;
			case GENdslPackage.PERSON__BIRTH_PLACE:
				setBirthPlace((String)newValue);
				return;
			case GENdslPackage.PERSON__DEATH_PLACE:
				setDeathPlace((String)newValue);
				return;
			case GENdslPackage.PERSON__RESTING_PLACE:
				setRestingPlace((String)newValue);
				return;
			case GENdslPackage.PERSON__TYPE:
				setType((TypeOfPerson)newValue);
				return;
			case GENdslPackage.PERSON__GENDER:
				setGender((Gender)newValue);
				return;
			case GENdslPackage.PERSON__OTHER_NAMES:
				getOtherNames().clear();
				getOtherNames().addAll((Collection<? extends String>)newValue);
				return;
			case GENdslPackage.PERSON__NICKNAME:
				setNickname((String)newValue);
				return;
			case GENdslPackage.PERSON__MARRIAGES:
				getMarriages().clear();
				getMarriages().addAll((Collection<? extends Marriage>)newValue);
				return;
			case GENdslPackage.PERSON__COHABITATIONS:
				getCohabitations().clear();
				getCohabitations().addAll((Collection<? extends Cohabitation>)newValue);
				return;
			case GENdslPackage.PERSON__DEATH_CAUSE:
				setDeathCause((String)newValue);
				return;
			case GENdslPackage.PERSON__PERSONHISTORY:
				getPersonhistory().clear();
				getPersonhistory().addAll((Collection<? extends PersonHistory>)newValue);
				return;
			case GENdslPackage.PERSON__COHABITATION:
				getCohabitation().clear();
				getCohabitation().addAll((Collection<? extends Cohabitation>)newValue);
				return;
			case GENdslPackage.PERSON__MARRIAGE:
				getMarriage().clear();
				getMarriage().addAll((Collection<? extends Marriage>)newValue);
				return;
			case GENdslPackage.PERSON__UNKNOWN:
				setUnknown((Boolean)newValue);
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
			case GENdslPackage.PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case GENdslPackage.PERSON__BIRTH_DATE:
				setBirthDate((DateX)null);
				return;
			case GENdslPackage.PERSON__DEATH_DATE:
				setDeathDate((DateX)null);
				return;
			case GENdslPackage.PERSON__BIRTH_PLACE:
				setBirthPlace(BIRTH_PLACE_EDEFAULT);
				return;
			case GENdslPackage.PERSON__DEATH_PLACE:
				setDeathPlace(DEATH_PLACE_EDEFAULT);
				return;
			case GENdslPackage.PERSON__RESTING_PLACE:
				setRestingPlace(RESTING_PLACE_EDEFAULT);
				return;
			case GENdslPackage.PERSON__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GENdslPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case GENdslPackage.PERSON__OTHER_NAMES:
				getOtherNames().clear();
				return;
			case GENdslPackage.PERSON__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case GENdslPackage.PERSON__MARRIAGES:
				getMarriages().clear();
				return;
			case GENdslPackage.PERSON__COHABITATIONS:
				getCohabitations().clear();
				return;
			case GENdslPackage.PERSON__DEATH_CAUSE:
				setDeathCause(DEATH_CAUSE_EDEFAULT);
				return;
			case GENdslPackage.PERSON__PERSONHISTORY:
				getPersonhistory().clear();
				return;
			case GENdslPackage.PERSON__COHABITATION:
				getCohabitation().clear();
				return;
			case GENdslPackage.PERSON__MARRIAGE:
				getMarriage().clear();
				return;
			case GENdslPackage.PERSON__UNKNOWN:
				setUnknown(UNKNOWN_EDEFAULT);
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
			case GENdslPackage.PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case GENdslPackage.PERSON__BIRTH_DATE:
				return birthDate != null;
			case GENdslPackage.PERSON__DEATH_DATE:
				return deathDate != null;
			case GENdslPackage.PERSON__BIRTH_PLACE:
				return BIRTH_PLACE_EDEFAULT == null ? birthPlace != null : !BIRTH_PLACE_EDEFAULT.equals(birthPlace);
			case GENdslPackage.PERSON__DEATH_PLACE:
				return DEATH_PLACE_EDEFAULT == null ? deathPlace != null : !DEATH_PLACE_EDEFAULT.equals(deathPlace);
			case GENdslPackage.PERSON__RESTING_PLACE:
				return RESTING_PLACE_EDEFAULT == null ? restingPlace != null : !RESTING_PLACE_EDEFAULT.equals(restingPlace);
			case GENdslPackage.PERSON__TYPE:
				return type != TYPE_EDEFAULT;
			case GENdslPackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case GENdslPackage.PERSON__OTHER_NAMES:
				return otherNames != null && !otherNames.isEmpty();
			case GENdslPackage.PERSON__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case GENdslPackage.PERSON__MARRIAGES:
				return marriages != null && !marriages.isEmpty();
			case GENdslPackage.PERSON__COHABITATIONS:
				return cohabitations != null && !cohabitations.isEmpty();
			case GENdslPackage.PERSON__DEATH_CAUSE:
				return DEATH_CAUSE_EDEFAULT == null ? deathCause != null : !DEATH_CAUSE_EDEFAULT.equals(deathCause);
			case GENdslPackage.PERSON__PERSONHISTORY:
				return personhistory != null && !personhistory.isEmpty();
			case GENdslPackage.PERSON__COHABITATION:
				return cohabitation != null && !cohabitation.isEmpty();
			case GENdslPackage.PERSON__MARRIAGE:
				return marriage != null && !marriage.isEmpty();
			case GENdslPackage.PERSON__UNKNOWN:
				return unknown != UNKNOWN_EDEFAULT;
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
		result.append(" (givenName: ");
		result.append(givenName);
		result.append(", birthPlace: ");
		result.append(birthPlace);
		result.append(", deathPlace: ");
		result.append(deathPlace);
		result.append(", restingPlace: ");
		result.append(restingPlace);
		result.append(", type: ");
		result.append(type);
		result.append(", gender: ");
		result.append(gender);
		result.append(", otherNames: ");
		result.append(otherNames);
		result.append(", nickname: ");
		result.append(nickname);
		result.append(", deathCause: ");
		result.append(deathCause);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
