/**
 */
package genDSL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genDSL2.DateX#getYear <em>Year</em>}</li>
 *   <li>{@link genDSL2.DateX#getMonth <em>Month</em>}</li>
 *   <li>{@link genDSL2.DateX#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see genDSL2.GenDSL2Package#getDateX()
 * @model
 * @generated
 */
public interface DateX extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see genDSL2.GenDSL2Package#getDateX_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link genDSL2.DateX#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see genDSL2.GenDSL2Package#getDateX_Month()
	 * @model
	 * @generated
	 */
	int getMonth();

	/**
	 * Sets the value of the '{@link genDSL2.DateX#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(int value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see genDSL2.GenDSL2Package#getDateX_Day()
	 * @model
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link genDSL2.DateX#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.year->isEmpty() or d.year->isEmpty() then null\n\t\t\t\t\telse if self.year < d.year then true\n\t\t\t\t\t\telse if self.year > d.year then false\n\t\t\t\t\t\t\telse if self.month->isEmpty() or d.month->isEmpty() then null\n\t\t\t\t\t\t\t\telse if self.month < d.month then true\n\t\t\t\t\t\t\t\t\telse if self.month > d.month then false\n\t\t\t\t\t\t\t\t\t\telse if self.day->isEmpty() or d.day->isEmpty() then null\n\t\t\t\t\t\t\t\t\t\t\telse if self.day < d.day then true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif endif endif endif endif endif endif endif'"
	 * @generated
	 */
	boolean before(DateX d);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.year->isEmpty() or d.year->isEmpty() then null\n\t\t\t\t\telse if self.year > d.year then true\n\t\t\t\t\t\telse if self.year < d.year then false\n\t\t\t\t\t\t\telse if self.month->isEmpty() or d.month->isEmpty() then null\n\t\t\t\t\t\t\t\telse if self.month > d.month then true\n\t\t\t\t\t\t\t\t\telse if self.month < d.month then false\n\t\t\t\t\t\t\t\t\t\telse if self.day->isEmpty() or d.day->isEmpty() then null\n\t\t\t\t\t\t\t\t\t\t\telse if self.day > d.day then true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif endif endif endif endif endif endif endif'"
	 * @generated
	 */
	boolean after(DateX d);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.year->isEmpty()'"
	 * @generated
	 */
	boolean isNull();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self->isEmpty()\n\t\t\t\t\tthen false\n\t\t\t\t\telse (if self.year->notEmpty() then true\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif) endif'"
	 * @generated
	 */
	boolean isNotNull();

} // DateX
