/**
 */
package gENdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genealogy Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gENdsl.GenealogyTree#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link gENdsl.GenealogyTree#getEstablished <em>Established</em>}</li>
 *   <li>{@link gENdsl.GenealogyTree#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see gENdsl.GENdslPackage#getGenealogyTree()
 * @model
 * @generated
 */
public interface GenealogyTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see gENdsl.GENdslPackage#getGenealogyTree_FamilyName()
	 * @model required="true"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link gENdsl.GenealogyTree#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Returns the value of the '<em><b>Established</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Established</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Established</em>' containment reference.
	 * @see #setEstablished(DateX)
	 * @see gENdsl.GENdslPackage#getGenealogyTree_Established()
	 * @model containment="true"
	 * @generated
	 */
	DateX getEstablished();

	/**
	 * Sets the value of the '{@link gENdsl.GenealogyTree#getEstablished <em>Established</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Established</em>' containment reference.
	 * @see #getEstablished()
	 * @generated
	 */
	void setEstablished(DateX value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gENdsl.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gENdsl.GENdslPackage#getGenealogyTree_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

} // GenealogyTree
