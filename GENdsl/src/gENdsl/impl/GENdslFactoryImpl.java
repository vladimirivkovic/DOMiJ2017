/**
 */
package gENdsl.impl;

import gENdsl.*;

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
public class GENdslFactoryImpl extends EFactoryImpl implements GENdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GENdslFactory init() {
		try {
			GENdslFactory theGENdslFactory = (GENdslFactory)EPackage.Registry.INSTANCE.getEFactory(GENdslPackage.eNS_URI);
			if (theGENdslFactory != null) {
				return theGENdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GENdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENdslFactoryImpl() {
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
			case GENdslPackage.GENEALOGY_TREE: return createGenealogyTree();
			case GENdslPackage.MARRIAGE: return createMarriage();
			case GENdslPackage.COHABITATION: return createCohabitation();
			case GENdslPackage.PERSON: return createPerson();
			case GENdslPackage.PERSON_HISTORY: return createPersonHistory();
			case GENdslPackage.DATE_X: return createDateX();
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
			case GENdslPackage.TYPE_OF_PERSON:
				return createTypeOfPersonFromString(eDataType, initialValue);
			case GENdslPackage.GENDER:
				return createGenderFromString(eDataType, initialValue);
			case GENdslPackage.TYPE_OF_INTIMATE_RELATIONSHIP:
				return createTypeOfIntimateRelationshipFromString(eDataType, initialValue);
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
			case GENdslPackage.TYPE_OF_PERSON:
				return convertTypeOfPersonToString(eDataType, instanceValue);
			case GENdslPackage.GENDER:
				return convertGenderToString(eDataType, instanceValue);
			case GENdslPackage.TYPE_OF_INTIMATE_RELATIONSHIP:
				return convertTypeOfIntimateRelationshipToString(eDataType, instanceValue);
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
	public GENdslPackage getGENdslPackage() {
		return (GENdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GENdslPackage getPackage() {
		return GENdslPackage.eINSTANCE;
	}

} //GENdslFactoryImpl
