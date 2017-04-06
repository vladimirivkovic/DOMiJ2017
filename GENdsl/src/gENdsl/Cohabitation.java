/**
 */
package gENdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cohabitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.Cohabitation#getPartners <em>Partners</em>}</li>
 *   <li>{@link gENdsl.Cohabitation#getChildren <em>Children</em>}</li>
 *   <li>{@link gENdsl.Cohabitation#isLegitimate <em>Legitimate</em>}</li>
 *   <li>{@link gENdsl.Cohabitation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gENdsl.GENdslPackage#getCohabitation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min2Partners parentsOlder'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot min2Partners='partners->size() >= 2' parentsOlder='partners->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))'"
 * @generated
 */
public interface Cohabitation extends EObject {
	/**
	 * Returns the value of the '<em><b>Partners</b></em>' reference list.
	 * The list contents are of type {@link gENdsl.Person}.
	 * It is bidirectional and its opposite is '{@link gENdsl.Person#getCohabitations <em>Cohabitations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partners</em>' reference list.
	 * @see gENdsl.GENdslPackage#getCohabitation_Partners()
	 * @see gENdsl.Person#getCohabitations
	 * @model opposite="cohabitations"
	 * @generated
	 */
	EList<Person> getPartners();

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
	 * @see gENdsl.GENdslPackage#getCohabitation_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Legitimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legitimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legitimate</em>' attribute.
	 * @see #setLegitimate(boolean)
	 * @see gENdsl.GENdslPackage#getCohabitation_Legitimate()
	 * @model
	 * @generated
	 */
	boolean isLegitimate();

	/**
	 * Sets the value of the '{@link gENdsl.Cohabitation#isLegitimate <em>Legitimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legitimate</em>' attribute.
	 * @see #isLegitimate()
	 * @generated
	 */
	void setLegitimate(boolean value);

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
	 * @see gENdsl.GENdslPackage#getCohabitation_Type()
	 * @model
	 * @generated
	 */
	TypeOfIntimateRelationship getType();

	/**
	 * Sets the value of the '{@link gENdsl.Cohabitation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gENdsl.TypeOfIntimateRelationship
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfIntimateRelationship value);

} // Cohabitation
