/**
 */
package gENdsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Intimate Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gENdsl.GENdslPackage#getTypeOfIntimateRelationship()
 * @model
 * @generated
 */
public enum TypeOfIntimateRelationship implements Enumerator {
	/**
	 * The '<em><b>MONOGAMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOGAMY_VALUE
	 * @generated
	 * @ordered
	 */
	MONOGAMY(0, "MONOGAMY", "MONOGAMY"),

	/**
	 * The '<em><b>POLYGAMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGAMY_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGAMY(1, "POLYGAMY", "POLYGAMY"),

	/**
	 * The '<em><b>POLYFIDELITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYFIDELITY_VALUE
	 * @generated
	 * @ordered
	 */
	POLYFIDELITY(2, "POLYFIDELITY", "POLYFIDELITY");

	/**
	 * The '<em><b>MONOGAMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONOGAMY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONOGAMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONOGAMY_VALUE = 0;

	/**
	 * The '<em><b>POLYGAMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLYGAMY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYGAMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLYGAMY_VALUE = 1;

	/**
	 * The '<em><b>POLYFIDELITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLYFIDELITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYFIDELITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLYFIDELITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Of Intimate Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfIntimateRelationship[] VALUES_ARRAY =
		new TypeOfIntimateRelationship[] {
			MONOGAMY,
			POLYGAMY,
			POLYFIDELITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Intimate Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfIntimateRelationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Intimate Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfIntimateRelationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfIntimateRelationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Intimate Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfIntimateRelationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfIntimateRelationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Intimate Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfIntimateRelationship get(int value) {
		switch (value) {
			case MONOGAMY_VALUE: return MONOGAMY;
			case POLYGAMY_VALUE: return POLYGAMY;
			case POLYFIDELITY_VALUE: return POLYFIDELITY;
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
	private TypeOfIntimateRelationship(int value, String name, String literal) {
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
	
} //TypeOfIntimateRelationship
