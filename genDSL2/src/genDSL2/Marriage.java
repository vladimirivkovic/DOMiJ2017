/**
 */
package genDSL2;

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
 *   <li>{@link genDSL2.Marriage#getFromDate <em>From Date</em>}</li>
 *   <li>{@link genDSL2.Marriage#getToDate <em>To Date</em>}</li>
 *   <li>{@link genDSL2.Marriage#getChildren <em>Children</em>}</li>
 *   <li>{@link genDSL2.Marriage#getType <em>Type</em>}</li>
 *   <li>{@link genDSL2.Marriage#getSpouses <em>Spouses</em>}</li>
 * </ul>
 *
 * @see genDSL2.GenDSL2Package#getMarriage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOverlap min2Spouses parentsOlder'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noOverlap='(self.fromDate.isNotNull() and self.toDate.isNotNull()) \n                            implies (spouses->forAll(s1 | Marriage.allInstances()->forAll(m1 | \n                              (m1->includes(s1) and m1 <> self )\n                              implies\n                              ((m1.fromDate.isNotNull() and m1.toDate.isNotNull())\n                                implies (m1.fromDate.after(self.toDate) or m1.toDate.before(self.fromDate))))))' min2Spouses='spouses->size() >= 2' parentsOlder='spouses->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))'"
 * @generated
 */
public interface Marriage extends EObject {
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
	 * @see genDSL2.GenDSL2Package#getMarriage_FromDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getFromDate();

	/**
	 * Sets the value of the '{@link genDSL2.Marriage#getFromDate <em>From Date</em>}' containment reference.
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
	 * @see genDSL2.GenDSL2Package#getMarriage_ToDate()
	 * @model containment="true"
	 * @generated
	 */
	DateX getToDate();

	/**
	 * Sets the value of the '{@link genDSL2.Marriage#getToDate <em>To Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' containment reference.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(DateX value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link genDSL2.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see genDSL2.GenDSL2Package#getMarriage_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link genDSL2.TypeOfIntimateRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see genDSL2.TypeOfIntimateRelationship
	 * @see #setType(TypeOfIntimateRelationship)
	 * @see genDSL2.GenDSL2Package#getMarriage_Type()
	 * @model
	 * @generated
	 */
	TypeOfIntimateRelationship getType();

	/**
	 * Sets the value of the '{@link genDSL2.Marriage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see genDSL2.TypeOfIntimateRelationship
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfIntimateRelationship value);

	/**
	 * Returns the value of the '<em><b>Spouses</b></em>' reference list.
	 * The list contents are of type {@link genDSL2.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spouses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {
	 * initial: if self.spouses->size() > 2 then (if (self.spouses->iterate(p : Person; m : Integer = 0 | if
	 * p.gender = Gender::MALE then m + 1
	 * else m
	 * endif) > 1 and self.spouses->iterate(p : Person; m : Integer = 0 | if p.gender = Gender::FEMALE then m + 1
	 * else m
	 * endif) > 1) then TypeOfIntimateRelationship::POLYFIDELITY
	 * else TypeOfIntimateRelationship::POLYGAMY
	 * endif) else TypeOfIntimateRelationship::MONOGAMY
	 * endif;
	 * }
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spouses</em>' reference list.
	 * @see genDSL2.GenDSL2Package#getMarriage_Spouses()
	 * @model
	 * @generated
	 */
	EList<Person> getSpouses();

} // Marriage
