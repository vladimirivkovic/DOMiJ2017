/**
 */
package gENdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marriage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.Marriage#getSpouses <em>Spouses</em>}</li>
 *   <li>{@link gENdsl.Marriage#getFromDate <em>From Date</em>}</li>
 *   <li>{@link gENdsl.Marriage#getToDate <em>To Date</em>}</li>
 *   <li>{@link gENdsl.Marriage#getChildren <em>Children</em>}</li>
 *   <li>{@link gENdsl.Marriage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gENdsl.GENdslPackage#getMarriage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min2Spouses parentsOlder noOverlap'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot min2Spouses='spouses->size() >= 2' parentsOlder='spouses->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))' noOverlap='(self.fromDate.isNotNull() and self.toDate.isNotNull()) implies (spouses->forAll(s1 |\n\t\t\t\t\ts1.marriages->forAll(m |\n\t\t\t\t\t\t(m <> self and m.fromDate.isNotNull() and m.toDate.isNotNull()) implies (m.fromDate.after(self.toDate) or m.toDate.before(self.fromDate)))))'"
 * @generated
 */
public interface Marriage extends EObject {
	/**
	 * Returns the value of the '<em><b>Spouses</b></em>' reference list.
	 * The list contents are of type {@link gENdsl.Person}.
	 * It is bidirectional and its opposite is '{@link gENdsl.Person#getMarriages <em>Marriages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spouses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spouses</em>' reference list.
	 * @see gENdsl.GENdslPackage#getMarriage_Spouses()
	 * @see gENdsl.Person#getMarriages
	 * @model opposite="marriages"
	 * @generated
	 */
	EList<Person> getSpouses();

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {
	 * initial: OrderedSet{}->append(Person.allInstances()->select(p : Person | p.marriage->count(self) > 0)->asSequence()->first());
	 * }*
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Date</em>' containment reference.
	 * @see #setFromDate(DateX)
	 * @see gENdsl.GENdslPackage#getMarriage_FromDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getFromDate();

	/**
	 * Sets the value of the '{@link gENdsl.Marriage#getFromDate <em>From Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' containment reference.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(DateX value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' containment reference.
	 * @see #setToDate(DateX)
	 * @see gENdsl.GENdslPackage#getMarriage_ToDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getToDate();

	/**
	 * Sets the value of the '{@link gENdsl.Marriage#getToDate <em>To Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' containment reference.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(DateX value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link gENdsl.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see gENdsl.GENdslPackage#getMarriage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gENdsl.TypeOfIntimateRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gENdsl.TypeOfIntimateRelationship
	 * @see #setType(TypeOfIntimateRelationship)
	 * @see gENdsl.GENdslPackage#getMarriage_Type()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if self.spouses->size() > 2 then (if (self.spouses->iterate(p : Person; m : Integer = 0 | if\n\t\t\t\t\t\t\t\tp.gender = Gender::MALE then m + 1\n\t\t\t\t\t\t\telse m\n\t\t\t\t\t\t\tendif) > 1 and self.spouses->iterate(p : Person; m : Integer = 0 | if p.gender = Gender::FEMALE then m + 1\n\t\t\t\t\t\t\telse m\n\t\t\t\t\t\t\tendif) > 1) then TypeOfIntimateRelationship::POLYFIDELITY\n\t\t\t\t\telse TypeOfIntimateRelationship::POLYGAMY\n\t\t\t\t\tendif) else TypeOfIntimateRelationship::MONOGAMY\n\t\t\t\t\tendif'"
	 * @generated
	 */
	TypeOfIntimateRelationship getType();

	/**
	 * Sets the value of the '{@link gENdsl.Marriage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gENdsl.TypeOfIntimateRelationship
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfIntimateRelationship value);

} // Marriage
