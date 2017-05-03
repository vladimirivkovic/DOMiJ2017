/**
 */
package genDSL2;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genDSL2.PersonHistory#getGender <em>Gender</em>}</li>
 *   <li>{@link genDSL2.PersonHistory#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link genDSL2.PersonHistory#getChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see genDSL2.GenDSL2Package#getPersonHistory()
 * @model
 * @generated
 */
public interface PersonHistory extends EObject {
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
	 * @see genDSL2.GenDSL2Package#getPersonHistory_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link genDSL2.PersonHistory#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see genDSL2.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

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
	 * @see genDSL2.GenDSL2Package#getPersonHistory_GivenName()
	 * @model
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link genDSL2.PersonHistory#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(Date)
	 * @see genDSL2.GenDSL2Package#getPersonHistory_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link genDSL2.PersonHistory#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

} // PersonHistory
