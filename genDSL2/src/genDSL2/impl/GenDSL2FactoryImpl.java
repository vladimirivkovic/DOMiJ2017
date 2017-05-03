/**
 */
package genDSL2.impl;

import genDSL2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenDSL2FactoryImpl extends EFactoryImpl implements GenDSL2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenDSL2Factory init() {
		try {
			GenDSL2Factory theGenDSL2Factory = (GenDSL2Factory)EPackage.Registry.INSTANCE.getEFactory(GenDSL2Package.eNS_URI);
			if (theGenDSL2Factory != null) {
				return theGenDSL2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenDSL2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDSL2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenDSL2Package.GENEALOGY_TREE: return createGenealogyTree();
			case GenDSL2Package.MARRIAGE: return createMarriage();
			case GenDSL2Package.COHABITATION: return createCohabitation();
			case GenDSL2Package.PERSON: return createPerson();
			case GenDSL2Package.PERSON_HISTORY: return createPersonHistory();
			case GenDSL2Package.DATE_X: return createDateX();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenDSL2Package.TYPE_OF_INTIMATE_RELATIONSHIP:
				return createTypeOfIntimateRelationshipFromString(eDataType, initialValue);
			case GenDSL2Package.TYPE_OF_PERSON:
				return createTypeOfPersonFromString(eDataType, initialValue);
			case GenDSL2Package.GENDER:
				return createGenderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenDSL2Package.TYPE_OF_INTIMATE_RELATIONSHIP:
				return convertTypeOfIntimateRelationshipToString(eDataType, instanceValue);
			case GenDSL2Package.TYPE_OF_PERSON:
				return convertTypeOfPersonToString(eDataType, instanceValue);
			case GenDSL2Package.GENDER:
				return convertGenderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenealogyTree createGenealogyTree() {
		GenealogyTreeImpl genealogyTree = new GenealogyTreeImpl();
		return genealogyTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marriage createMarriage() {
		MarriageImpl marriage = new MarriageImpl();
		return marriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cohabitation createCohabitation() {
		CohabitationImpl cohabitation = new CohabitationImpl();
		return cohabitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonHistory createPersonHistory() {
		PersonHistoryImpl personHistory = new PersonHistoryImpl();
		return personHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateX createDateX() {
		DateXImpl dateX = new DateXImpl();
		return dateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfIntimateRelationship createTypeOfIntimateRelationshipFromString(EDataType eDataType, String initialValue) {
		TypeOfIntimateRelationship result = TypeOfIntimateRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfIntimateRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfPerson createTypeOfPersonFromString(EDataType eDataType, String initialValue) {
		TypeOfPerson result = TypeOfPerson.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfPersonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenDSL2Package getGenDSL2Package() {
		return (GenDSL2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenDSL2Package getPackage() {
		return GenDSL2Package.eINSTANCE;
	}

} //GenDSL2FactoryImpl
