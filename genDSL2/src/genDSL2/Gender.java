/**
 */
package genDSL2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gender</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see genDSL2.GenDSL2Package#getGender()
 * @model
 * @generated
 */
public enum Gender implements Enumerator {
	/**
	 * The '<em><b>MALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALE_VALUE
	 * @generated
	 * @ordered
	 */
	MALE(0, "MALE", "MALE"),

	/**
	 * The '<em><b>FEMALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMALE_VALUE
	 * @generated
	 * @ordered
	 */
	FEMALE(1, "FEMALE", "FEMALE"),

	/**
	 * The '<em><b>BIGENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGENDER_VALUE
	 * @generated
	 * @ordered
	 */
	BIGENDER(2, "BIGENDER", "BIGENDER");

	/**
	 * The '<em><b>MALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MALE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MALE_VALUE = 0;

	/**
	 * The '<em><b>FEMALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEMALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEMALE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEMALE_VALUE = 1;

	/**
	 * The '<em><b>BIGENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIGENDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIGENDER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Gender</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Gender[] VALUES_ARRAY =
		new Gender[] {
			MALE,
			FEMALE,
			BIGENDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Gender</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Gender> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gender</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Gender get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Gender result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gender</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Gender getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Gender result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gender</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Gender get(int value) {
		switch (value) {
			case MALE_VALUE: return MALE;
			case FEMALE_VALUE: return FEMALE;
			case BIGENDER_VALUE: return BIGENDER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Gender(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Gender
