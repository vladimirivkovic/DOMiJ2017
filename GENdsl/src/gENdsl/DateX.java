/**
 */
package gENdsl;

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
 *   <li>{@link gENdsl.DateX#getYear <em>Year</em>}</li>
 *   <li>{@link gENdsl.DateX#getMonth <em>Month</em>}</li>
 *   <li>{@link gENdsl.DateX#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see gENdsl.GENdslPackage#getDateX()
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
	 * @see #setYear(Integer)
	 * @see gENdsl.GENdslPackage#getDateX_Year()
	 * @model
	 * @generated
	 */
	Integer getYear();

	/**
	 * Sets the value of the '{@link gENdsl.DateX#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(Integer)
	 * @see gENdsl.GENdslPackage#getDateX_Month()
	 * @model
	 * @generated
	 */
	Integer getMonth();

	/**
	 * Sets the value of the '{@link gENdsl.DateX#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Integer)
	 * @see gENdsl.GENdslPackage#getDateX_Day()
	 * @model
	 * @generated
	 */
	Integer getDay();

	/**
	 * Sets the value of the '{@link gENdsl.DateX#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.year->isEmpty() or d.year->isEmpty() then null else\n\t\t\t\t\t   \t\tif self.year < d.year then true else\n\t\t\t\t\t   \t\t\tif self.year > d.year then false else\n\t\t\t\t\t   \t\t\t\n\t\t\t\t\t   \t\t\t\tif self.month->isEmpty() or d.month->isEmpty() then null else\n\t\t\t\t\t\t\t\t   \t\tif self.month < d.month then true else\n\t\t\t\t\t\t\t\t   \t\t\tif self.month > d.month then false else\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\t\tif self.day->isEmpty() or d.day->isEmpty() then null else\n\t\t\t\t\t\t\t\t\t\t\t   \t\tif self.day < d.day then true else\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\t   \t\tendif\t\t\n\t\t\t\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t\t\t\t   \t\tendif\n\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \n\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t   \t\tendif\t\n\t\t\t\t\t   endif'"
	 * @generated
	 */
	boolean before(DateX d);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.year->isEmpty() or d.year->isEmpty() then null else\n\t\t\t\t\t   \t\tif self.year > d.year then true else\n\t\t\t\t\t   \t\t\tif self.year < d.year then false else\n\t\t\t\t\t   \t\t\t\n\t\t\t\t\t   \t\t\t\tif self.month->isEmpty() or d.month->isEmpty() then null else\n\t\t\t\t\t\t\t\t   \t\tif self.month > d.month then true else\n\t\t\t\t\t\t\t\t   \t\t\tif self.month < d.month then false else\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\t\tif self.day->isEmpty() or d.day->isEmpty() then null else\n\t\t\t\t\t\t\t\t\t\t\t   \t\tif self.day > d.day then true else\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\t   \t\tendif\t\t\n\t\t\t\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t\t\t\t   \t\tendif\n\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \n\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t   \t\tendif\t\n\t\t\t\t\t   endif'"
	 * @generated
	 */
	boolean after(DateX d);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.year->isEmpty()'"
	 * @generated
	 */
	boolean isNull();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self->isEmpty() then false else (if self.year->notEmpty() then true else false endif)\n\t\t\t\t\t  endif'"
	 * @generated
	 */
	boolean isNotNull();

} // DateX
