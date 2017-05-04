/**
 */
package genDSL2;

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
 *   <li>{@link genDSL2.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link genDSL2.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link genDSL2.Person#getDeathDate <em>Death Date</em>}</li>
 *   <li>{@link genDSL2.Person#getBirthPlace <em>Birth Place</em>}</li>
 *   <li>{@link genDSL2.Person#getDeathPlace <em>Death Place</em>}</li>
 *   <li>{@link genDSL2.Person#getRestingPlace <em>Resting Place</em>}</li>
 *   <li>{@link genDSL2.Person#getType <em>Type</em>}</li>
 *   <li>{@link genDSL2.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link genDSL2.Person#getOtherNames <em>Other Names</em>}</li>
 *   <li>{@link genDSL2.Person#getNickname <em>Nickname</em>}</li>
 *   <li>{@link genDSL2.Person#getDeathCause <em>Death Cause</em>}</li>
 *   <li>{@link genDSL2.Person#getPersonhistory <em>Personhistory</em>}</li>
 *   <li>{@link genDSL2.Person#getCohabitation <em>Cohabitation</em>}</li>
 *   <li>{@link genDSL2.Person#getMarriage <em>Marriage</em>}</li>
 *   <li>{@link genDSL2.Person#isUnknown <em>Unknown</em>}</li>
 * </ul>
 *
 * @see genDSL2.GenDSL2Package#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noName leastOneMarriageOrCohabitation oneRoot inMyMarriages inMyCohabitations marrigesInLifetime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noName='not unknown implies givenName <> \'\'' leastOneMarriageOrCohabitation='\n                (type = TypeOfPerson::MARRIED) \n                implies (Marriage.allInstances()->exists(m | m.spouses->includes(self))\n                  or Cohabitation.allInstances()->exists(c | c.partners->includes(self))\n                )' oneRoot='Person.allInstances()->select(p : Person |\n\t\t\t\t\t((p.type <> TypeOfPerson::MARRIED) and ((Marriage.allInstances()->select(m : Marriage |\n\t\t\t\t\t\tm.children->includes(p))->isEmpty()) and (Cohabitation.allInstances()->select(c : Cohabitation |\n\t\t\t\t\t\tc.children->includes(p))->isEmpty()))))->size() = 1' inMyMarriages='marriage->forAll(spouses->count(self) = 1)' inMyCohabitations='cohabitation->forAll(partners->count(self) = 1)' marrigesInLifetime=' (self.birthDate.isNotNull() \n                                     implies (Marriage.allInstances()->forAll(m |\n                                        (m.spouses->includes(self) and m.fromDate.isNotNull()) \n                                        implies self.birthDate.before(m.fromDate))))\n                                     and (self.deathDate.isNotNull() \n                                     implies (Marriage.allInstances()->forAll(m |\n                                        (m.spouses->includes(self) and m.toDate.isNotNull())\n                                         implies self.deathDate.after(m.toDate))))'"
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
	 * @see genDSL2.GenDSL2Package#getPerson_GivenName()
	 * @model
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getGivenName <em>Given Name</em>}' attribute.
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
	 * @see genDSL2.GenDSL2Package#getPerson_BirthDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getBirthDate();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getBirthDate <em>Birth Date</em>}' containment reference.
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
	 * @see genDSL2.GenDSL2Package#getPerson_DeathDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getDeathDate();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getDeathDate <em>Death Date</em>}' containment reference.
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
	 * @see genDSL2.GenDSL2Package#getPerson_BirthPlace()
	 * @model
	 * @generated
	 */
	String getBirthPlace();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getBirthPlace <em>Birth Place</em>}' attribute.
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
	 * @see genDSL2.GenDSL2Package#getPerson_DeathPlace()
	 * @model
	 * @generated
	 */
	String getDeathPlace();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getDeathPlace <em>Death Place</em>}' attribute.
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
	 * @see genDSL2.GenDSL2Package#getPerson_RestingPlace()
	 * @model
	 * @generated
	 */
	String getRestingPlace();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getRestingPlace <em>Resting Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resting Place</em>' attribute.
	 * @see #getRestingPlace()
	 * @generated
	 */
	void setRestingPlace(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link genDSL2.TypeOfPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see genDSL2.TypeOfPerson
	 * @see #setType(TypeOfPerson)
	 * @see genDSL2.GenDSL2Package#getPerson_Type()
	 * @model
	 * @generated
	 */
	TypeOfPerson getType();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see genDSL2.TypeOfPerson
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfPerson value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link genDSL2.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see genDSL2.Gender
	 * @see #setGender(Gender)
	 * @see genDSL2.GenDSL2Package#getPerson_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see genDSL2.Gender
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
	 * @see genDSL2.GenDSL2Package#getPerson_OtherNames()
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
	 * @see genDSL2.GenDSL2Package#getPerson_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

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
	 * @see genDSL2.GenDSL2Package#getPerson_DeathCause()
	 * @model
	 * @generated
	 */
	String getDeathCause();

	/**
	 * Sets the value of the '{@link genDSL2.Person#getDeathCause <em>Death Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Cause</em>' attribute.
	 * @see #getDeathCause()
	 * @generated
	 */
	void setDeathCause(String value);

	/**
	 * Returns the value of the '<em><b>Personhistory</b></em>' containment reference list.
	 * The list contents are of type {@link genDSL2.PersonHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personhistory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personhistory</em>' containment reference list.
	 * @see genDSL2.GenDSL2Package#getPerson_Personhistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonHistory> getPersonhistory();

	/**
	 * Returns the value of the '<em><b>Cohabitation</b></em>' containment reference list.
	 * The list contents are of type {@link genDSL2.Cohabitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cohabitation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cohabitation</em>' containment reference list.
	 * @see genDSL2.GenDSL2Package#getPerson_Cohabitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cohabitation> getCohabitation();

	/**
	 * Returns the value of the '<em><b>Marriage</b></em>' containment reference list.
	 * The list contents are of type {@link genDSL2.Marriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marriage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marriage</em>' containment reference list.
	 * @see genDSL2.GenDSL2Package#getPerson_Marriage()
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
	 * @see genDSL2.GenDSL2Package#getPerson_Unknown()
	 * @model
	 * @generated
	 */
	boolean isUnknown();

	/**
	 * Sets the value of the '{@link genDSL2.Person#isUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #isUnknown()
	 * @generated
	 */
	void setUnknown(boolean value);

} // Person
