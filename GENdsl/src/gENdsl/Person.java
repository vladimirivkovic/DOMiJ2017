/**
 */
package gENdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link gENdsl.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link gENdsl.Person#getDeathDate <em>Death Date</em>}</li>
 *   <li>{@link gENdsl.Person#getBirthPlace <em>Birth Place</em>}</li>
 *   <li>{@link gENdsl.Person#getDeathPlace <em>Death Place</em>}</li>
 *   <li>{@link gENdsl.Person#getRestingPlace <em>Resting Place</em>}</li>
 *   <li>{@link gENdsl.Person#getType <em>Type</em>}</li>
 *   <li>{@link gENdsl.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link gENdsl.Person#getOtherNames <em>Other Names</em>}</li>
 *   <li>{@link gENdsl.Person#getNickname <em>Nickname</em>}</li>
 *   <li>{@link gENdsl.Person#getMarriages <em>Marriages</em>}</li>
 *   <li>{@link gENdsl.Person#getCohabitations <em>Cohabitations</em>}</li>
 *   <li>{@link gENdsl.Person#getDeathCause <em>Death Cause</em>}</li>
 *   <li>{@link gENdsl.Person#getPersonhistory <em>Personhistory</em>}</li>
 *   <li>{@link gENdsl.Person#getCohabitation <em>Cohabitation</em>}</li>
 *   <li>{@link gENdsl.Person#getMarriage <em>Marriage</em>}</li>
 *   <li>{@link gENdsl.Person#isUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @see gENdsl.GENdslPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noName leastOneMarriageOrCohabitation oneRoot inMyMarriages inMyCohabitations marrigesInLifetime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noName='not unknown implies givenName <> \'\'' leastOneMarriageOrCohabitation='(type = TypeOfPerson::MARRIED) implies (marriages->notEmpty() or cohabitations->notEmpty())' oneRoot='Person.allInstances()->select(p : Person |\n\t\t\t\t\t((p.type <> TypeOfPerson::MARRIED) and \n\t\t\t\t\t((Marriage.allInstances()->select(m : Marriage | m.children->includes(p))->isEmpty()) \n\t\t\t\t\t\tand (Cohabitation.allInstances()->select(c : Cohabitation | c.children->includes(p))->isEmpty()))))->size() = 1' inMyMarriages='marriage->forAll(spouses->count(self) = 1)' inMyCohabitations='cohabitation->forAll(partners->count(self) = 1)' marrigesInLifetime='(self.birthDate.isNotNull() implies marriages->forAll(m |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.fromDate.isNotNull() implies self.birthDate.before(m.fromDate)))\n\t\t\t\t\t\t\t\t\t\t  and\n\t\t\t\t\t\t\t\t\t\t  (self.deathDate.isNotNull() implies marriages->forAll(m |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.toDate.isNotNull() implies self.deathDate.after(m.toDate)))\n\t\t\t\t\t\t\t\t\t\t'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see gENdsl.GENdslPackage#getPerson_GivenName()
	 * @model
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(DateX)
	 * @see gENdsl.GENdslPackage#getPerson_BirthDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getBirthDate();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(DateX value);

	/**
	 * Returns the value of the '<em><b>Death Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Date</em>' containment reference.
	 * @see #setDeathDate(DateX)
	 * @see gENdsl.GENdslPackage#getPerson_DeathDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getDeathDate();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getDeathDate <em>Death Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Date</em>' containment reference.
	 * @see #getDeathDate()
	 * @generated
	 */
	void setDeathDate(DateX value);

	/**
	 * Returns the value of the '<em><b>Birth Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Place</em>' attribute.
	 * @see #setBirthPlace(String)
	 * @see gENdsl.GENdslPackage#getPerson_BirthPlace()
	 * @model
	 * @generated
	 */
	String getBirthPlace();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getBirthPlace <em>Birth Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Place</em>' attribute.
	 * @see #getBirthPlace()
	 * @generated
	 */
	void setBirthPlace(String value);

	/**
	 * Returns the value of the '<em><b>Death Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Place</em>' attribute.
	 * @see #setDeathPlace(String)
	 * @see gENdsl.GENdslPackage#getPerson_DeathPlace()
	 * @model
	 * @generated
	 */
	String getDeathPlace();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getDeathPlace <em>Death Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Place</em>' attribute.
	 * @see #getDeathPlace()
	 * @generated
	 */
	void setDeathPlace(String value);

	/**
	 * Returns the value of the '<em><b>Resting Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resting Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resting Place</em>' attribute.
	 * @see #setRestingPlace(String)
	 * @see gENdsl.GENdslPackage#getPerson_RestingPlace()
	 * @model
	 * @generated
	 */
	String getRestingPlace();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getRestingPlace <em>Resting Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resting Place</em>' attribute.
	 * @see #getRestingPlace()
	 * @generated
	 */
	void setRestingPlace(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gENdsl.TypeOfPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gENdsl.TypeOfPerson
	 * @see #setType(TypeOfPerson)
	 * @see gENdsl.GENdslPackage#getPerson_Type()
	 * @model
	 * @generated
	 */
	TypeOfPerson getType();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gENdsl.TypeOfPerson
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfPerson value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link gENdsl.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see gENdsl.Gender
	 * @see #setGender(Gender)
	 * @see gENdsl.GENdslPackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see gENdsl.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Other Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Names</em>' attribute list.
	 * @see gENdsl.GENdslPackage#getPerson_OtherNames()
	 * @model
	 * @generated
	 */
	EList<String> getOtherNames();

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see gENdsl.GENdslPackage#getPerson_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Marriages</b></em>' reference list.
	 * The list contents are of type {@link gENdsl.Marriage}.
	 * It is bidirectional and its opposite is '{@link gENdsl.Marriage#getSpouses <em>Spouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marriages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marriages</em>' reference list.
	 * @see gENdsl.GENdslPackage#getPerson_Marriages()
	 * @see gENdsl.Marriage#getSpouses
	 * @model opposite="spouses"
	 * @generated
	 */
	EList<Marriage> getMarriages();

	/**
	 * Returns the value of the '<em><b>Cohabitations</b></em>' reference list.
	 * The list contents are of type {@link gENdsl.Cohabitation}.
	 * It is bidirectional and its opposite is '{@link gENdsl.Cohabitation#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cohabitations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cohabitations</em>' reference list.
	 * @see gENdsl.GENdslPackage#getPerson_Cohabitations()
	 * @see gENdsl.Cohabitation#getPartners
	 * @model opposite="partners"
	 * @generated
	 */
	EList<Cohabitation> getCohabitations();

	/**
	 * Returns the value of the '<em><b>Death Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Cause</em>' attribute.
	 * @see #setDeathCause(String)
	 * @see gENdsl.GENdslPackage#getPerson_DeathCause()
	 * @model
	 * @generated
	 */
	String getDeathCause();

	/**
	 * Sets the value of the '{@link gENdsl.Person#getDeathCause <em>Death Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Cause</em>' attribute.
	 * @see #getDeathCause()
	 * @generated
	 */
	void setDeathCause(String value);

	/**
	 * Returns the value of the '<em><b>Personhistory</b></em>' containment reference list.
	 * The list contents are of type {@link gENdsl.PersonHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personhistory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personhistory</em>' containment reference list.
	 * @see gENdsl.GENdslPackage#getPerson_Personhistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonHistory> getPersonhistory();

	/**
	 * Returns the value of the '<em><b>Cohabitation</b></em>' containment reference list.
	 * The list contents are of type {@link gENdsl.Cohabitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cohabitation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cohabitation</em>' containment reference list.
	 * @see gENdsl.GENdslPackage#getPerson_Cohabitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cohabitation> getCohabitation();

	/**
	 * Returns the value of the '<em><b>Marriage</b></em>' containment reference list.
	 * The list contents are of type {@link gENdsl.Marriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marriage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marriage</em>' containment reference list.
	 * @see gENdsl.GENdslPackage#getPerson_Marriage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marriage> getMarriage();

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' attribute.
	 * @see #setUnknown(boolean)
	 * @see gENdsl.GENdslPackage#getPerson_Unknown()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnknown();

	/**
	 * Sets the value of the '{@link gENdsl.Person#isUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #isUnknown()
	 * @generated
	 */
	void setUnknown(boolean value);

} // Person
