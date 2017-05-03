/**
 */
package genDSL2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genDSL2.GenDSL2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GenDSL2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genDSL2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/genDSL2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genDSL2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenDSL2Package eINSTANCE = genDSL2.impl.GenDSL2PackageImpl.init();

	/**
	 * The meta object id for the '{@link genDSL2.impl.GenealogyTreeImpl <em>Genealogy Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.GenealogyTreeImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getGenealogyTree()
	 * @generated
	 */
	int GENEALOGY_TREE = 0;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_TREE__FAMILY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Established</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_TREE__ESTABLISHED = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_TREE__PERSON = 2;

	/**
	 * The number of structural features of the '<em>Genealogy Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_TREE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Genealogy Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENEALOGY_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genDSL2.impl.MarriageImpl <em>Marriage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.MarriageImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getMarriage()
	 * @generated
	 */
	int MARRIAGE = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__FROM_DATE = 0;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__TO_DATE = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Spouses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__SPOUSES = 4;

	/**
	 * The number of structural features of the '<em>Marriage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Marriage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genDSL2.impl.CohabitationImpl <em>Cohabitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.CohabitationImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getCohabitation()
	 * @generated
	 */
	int COHABITATION = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Legitimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__LEGITIMATE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__PARTNERS = 3;

	/**
	 * The number of structural features of the '<em>Cohabitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cohabitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genDSL2.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.PersonImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GIVEN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = 1;

	/**
	 * The feature id for the '<em><b>Death Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_DATE = 2;

	/**
	 * The feature id for the '<em><b>Birth Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Death Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_PLACE = 4;

	/**
	 * The feature id for the '<em><b>Resting Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RESTING_PLACE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 7;

	/**
	 * The feature id for the '<em><b>Other Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OTHER_NAMES = 8;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICKNAME = 9;

	/**
	 * The feature id for the '<em><b>Death Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_CAUSE = 10;

	/**
	 * The feature id for the '<em><b>Personhistory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONHISTORY = 11;

	/**
	 * The feature id for the '<em><b>Cohabitation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COHABITATION = 12;

	/**
	 * The feature id for the '<em><b>Marriage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARRIAGE = 13;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__UNKNOWN = 14;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genDSL2.impl.PersonHistoryImpl <em>Person History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.PersonHistoryImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getPersonHistory()
	 * @generated
	 */
	int PERSON_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_HISTORY__GENDER = 0;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_HISTORY__GIVEN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_HISTORY__CHANGED = 2;

	/**
	 * The number of structural features of the '<em>Person History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_HISTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genDSL2.impl.DateXImpl <em>Date X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.impl.DateXImpl
	 * @see genDSL2.impl.GenDSL2PackageImpl#getDateX()
	 * @generated
	 */
	int DATE_X = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X__MONTH = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X__DAY = 2;

	/**
	 * The number of structural features of the '<em>Date X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X___BEFORE__DATEX = 0;

	/**
	 * The operation id for the '<em>After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X___AFTER__DATEX = 1;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X___IS_NULL = 2;

	/**
	 * The operation id for the '<em>Is Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X___IS_NOT_NULL = 3;

	/**
	 * The number of operations of the '<em>Date X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_X_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link genDSL2.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.TypeOfIntimateRelationship
	 * @see genDSL2.impl.GenDSL2PackageImpl#getTypeOfIntimateRelationship()
	 * @generated
	 */
	int TYPE_OF_INTIMATE_RELATIONSHIP = 6;

	/**
	 * The meta object id for the '{@link genDSL2.TypeOfPerson <em>Type Of Person</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.TypeOfPerson
	 * @see genDSL2.impl.GenDSL2PackageImpl#getTypeOfPerson()
	 * @generated
	 */
	int TYPE_OF_PERSON = 7;

	/**
	 * The meta object id for the '{@link genDSL2.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genDSL2.Gender
	 * @see genDSL2.impl.GenDSL2PackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 8;


	/**
	 * Returns the meta object for class '{@link genDSL2.GenealogyTree <em>Genealogy Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genealogy Tree</em>'.
	 * @see genDSL2.GenealogyTree
	 * @generated
	 */
	EClass getGenealogyTree();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.GenealogyTree#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see genDSL2.GenealogyTree#getFamilyName()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EAttribute getGenealogyTree_FamilyName();

	/**
	 * Returns the meta object for the containment reference '{@link genDSL2.GenealogyTree#getEstablished <em>Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Established</em>'.
	 * @see genDSL2.GenealogyTree#getEstablished()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EReference getGenealogyTree_Established();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.GenealogyTree#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see genDSL2.GenealogyTree#getPerson()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EReference getGenealogyTree_Person();

	/**
	 * Returns the meta object for class '{@link genDSL2.Marriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage</em>'.
	 * @see genDSL2.Marriage
	 * @generated
	 */
	EClass getMarriage();

	/**
	 * Returns the meta object for the containment reference '{@link genDSL2.Marriage#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Date</em>'.
	 * @see genDSL2.Marriage#getFromDate()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_FromDate();

	/**
	 * Returns the meta object for the containment reference '{@link genDSL2.Marriage#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Date</em>'.
	 * @see genDSL2.Marriage#getToDate()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_ToDate();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.Marriage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see genDSL2.Marriage#getChildren()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Children();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Marriage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see genDSL2.Marriage#getType()
	 * @see #getMarriage()
	 * @generated
	 */
	EAttribute getMarriage_Type();

	/**
	 * Returns the meta object for the reference list '{@link genDSL2.Marriage#getSpouses <em>Spouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spouses</em>'.
	 * @see genDSL2.Marriage#getSpouses()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Spouses();

	/**
	 * Returns the meta object for class '{@link genDSL2.Cohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cohabitation</em>'.
	 * @see genDSL2.Cohabitation
	 * @generated
	 */
	EClass getCohabitation();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.Cohabitation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see genDSL2.Cohabitation#getChildren()
	 * @see #getCohabitation()
	 * @generated
	 */
	EReference getCohabitation_Children();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Cohabitation#isLegitimate <em>Legitimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legitimate</em>'.
	 * @see genDSL2.Cohabitation#isLegitimate()
	 * @see #getCohabitation()
	 * @generated
	 */
	EAttribute getCohabitation_Legitimate();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Cohabitation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see genDSL2.Cohabitation#getType()
	 * @see #getCohabitation()
	 * @generated
	 */
	EAttribute getCohabitation_Type();

	/**
	 * Returns the meta object for the reference '{@link genDSL2.Cohabitation#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partners</em>'.
	 * @see genDSL2.Cohabitation#getPartners()
	 * @see #getCohabitation()
	 * @generated
	 */
	EReference getCohabitation_Partners();

	/**
	 * Returns the meta object for class '{@link genDSL2.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see genDSL2.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see genDSL2.Person#getGivenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GivenName();

	/**
	 * Returns the meta object for the containment reference '{@link genDSL2.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Date</em>'.
	 * @see genDSL2.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_BirthDate();

	/**
	 * Returns the meta object for the containment reference '{@link genDSL2.Person#getDeathDate <em>Death Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Death Date</em>'.
	 * @see genDSL2.Person#getDeathDate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DeathDate();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getBirthPlace <em>Birth Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Place</em>'.
	 * @see genDSL2.Person#getBirthPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthPlace();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getDeathPlace <em>Death Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Place</em>'.
	 * @see genDSL2.Person#getDeathPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathPlace();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getRestingPlace <em>Resting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resting Place</em>'.
	 * @see genDSL2.Person#getRestingPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_RestingPlace();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see genDSL2.Person#getType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Type();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see genDSL2.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute list '{@link genDSL2.Person#getOtherNames <em>Other Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Names</em>'.
	 * @see genDSL2.Person#getOtherNames()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_OtherNames();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see genDSL2.Person#getNickname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#getDeathCause <em>Death Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Cause</em>'.
	 * @see genDSL2.Person#getDeathCause()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathCause();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.Person#getPersonhistory <em>Personhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personhistory</em>'.
	 * @see genDSL2.Person#getPersonhistory()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Personhistory();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.Person#getCohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cohabitation</em>'.
	 * @see genDSL2.Person#getCohabitation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Cohabitation();

	/**
	 * Returns the meta object for the containment reference list '{@link genDSL2.Person#getMarriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marriage</em>'.
	 * @see genDSL2.Person#getMarriage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Marriage();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.Person#isUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown</em>'.
	 * @see genDSL2.Person#isUnknown()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Unknown();

	/**
	 * Returns the meta object for class '{@link genDSL2.PersonHistory <em>Person History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person History</em>'.
	 * @see genDSL2.PersonHistory
	 * @generated
	 */
	EClass getPersonHistory();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.PersonHistory#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see genDSL2.PersonHistory#getGender()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_Gender();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.PersonHistory#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see genDSL2.PersonHistory#getGivenName()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.PersonHistory#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see genDSL2.PersonHistory#getChanged()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_Changed();

	/**
	 * Returns the meta object for class '{@link genDSL2.DateX <em>Date X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date X</em>'.
	 * @see genDSL2.DateX
	 * @generated
	 */
	EClass getDateX();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.DateX#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see genDSL2.DateX#getYear()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Year();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.DateX#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see genDSL2.DateX#getMonth()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Month();

	/**
	 * Returns the meta object for the attribute '{@link genDSL2.DateX#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see genDSL2.DateX#getDay()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Day();

	/**
	 * Returns the meta object for the '{@link genDSL2.DateX#before(genDSL2.DateX) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Before</em>' operation.
	 * @see genDSL2.DateX#before(genDSL2.DateX)
	 * @generated
	 */
	EOperation getDateX__Before__DateX();

	/**
	 * Returns the meta object for the '{@link genDSL2.DateX#after(genDSL2.DateX) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>After</em>' operation.
	 * @see genDSL2.DateX#after(genDSL2.DateX)
	 * @generated
	 */
	EOperation getDateX__After__DateX();

	/**
	 * Returns the meta object for the '{@link genDSL2.DateX#isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Null</em>' operation.
	 * @see genDSL2.DateX#isNull()
	 * @generated
	 */
	EOperation getDateX__IsNull();

	/**
	 * Returns the meta object for the '{@link genDSL2.DateX#isNotNull() <em>Is Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Not Null</em>' operation.
	 * @see genDSL2.DateX#isNotNull()
	 * @generated
	 */
	EOperation getDateX__IsNotNull();

	/**
	 * Returns the meta object for enum '{@link genDSL2.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Intimate Relationship</em>'.
	 * @see genDSL2.TypeOfIntimateRelationship
	 * @generated
	 */
	EEnum getTypeOfIntimateRelationship();

	/**
	 * Returns the meta object for enum '{@link genDSL2.TypeOfPerson <em>Type Of Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Person</em>'.
	 * @see genDSL2.TypeOfPerson
	 * @generated
	 */
	EEnum getTypeOfPerson();

	/**
	 * Returns the meta object for enum '{@link genDSL2.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see genDSL2.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenDSL2Factory getGenDSL2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genDSL2.impl.GenealogyTreeImpl <em>Genealogy Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.GenealogyTreeImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getGenealogyTree()
		 * @generated
		 */
		EClass GENEALOGY_TREE = eINSTANCE.getGenealogyTree();

		/**
		 * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENEALOGY_TREE__FAMILY_NAME = eINSTANCE.getGenealogyTree_FamilyName();

		/**
		 * The meta object literal for the '<em><b>Established</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENEALOGY_TREE__ESTABLISHED = eINSTANCE.getGenealogyTree_Established();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENEALOGY_TREE__PERSON = eINSTANCE.getGenealogyTree_Person();

		/**
		 * The meta object literal for the '{@link genDSL2.impl.MarriageImpl <em>Marriage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.MarriageImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getMarriage()
		 * @generated
		 */
		EClass MARRIAGE = eINSTANCE.getMarriage();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__FROM_DATE = eINSTANCE.getMarriage_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__TO_DATE = eINSTANCE.getMarriage_ToDate();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__CHILDREN = eINSTANCE.getMarriage_Children();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARRIAGE__TYPE = eINSTANCE.getMarriage_Type();

		/**
		 * The meta object literal for the '<em><b>Spouses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__SPOUSES = eINSTANCE.getMarriage_Spouses();

		/**
		 * The meta object literal for the '{@link genDSL2.impl.CohabitationImpl <em>Cohabitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.CohabitationImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getCohabitation()
		 * @generated
		 */
		EClass COHABITATION = eINSTANCE.getCohabitation();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COHABITATION__CHILDREN = eINSTANCE.getCohabitation_Children();

		/**
		 * The meta object literal for the '<em><b>Legitimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COHABITATION__LEGITIMATE = eINSTANCE.getCohabitation_Legitimate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COHABITATION__TYPE = eINSTANCE.getCohabitation_Type();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COHABITATION__PARTNERS = eINSTANCE.getCohabitation_Partners();

		/**
		 * The meta object literal for the '{@link genDSL2.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.PersonImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Given Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GIVEN_NAME = eINSTANCE.getPerson_GivenName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Death Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEATH_DATE = eINSTANCE.getPerson_DeathDate();

		/**
		 * The meta object literal for the '<em><b>Birth Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_PLACE = eINSTANCE.getPerson_BirthPlace();

		/**
		 * The meta object literal for the '<em><b>Death Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEATH_PLACE = eINSTANCE.getPerson_DeathPlace();

		/**
		 * The meta object literal for the '<em><b>Resting Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__RESTING_PLACE = eINSTANCE.getPerson_RestingPlace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TYPE = eINSTANCE.getPerson_Type();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Other Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OTHER_NAMES = eINSTANCE.getPerson_OtherNames();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICKNAME = eINSTANCE.getPerson_Nickname();

		/**
		 * The meta object literal for the '<em><b>Death Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEATH_CAUSE = eINSTANCE.getPerson_DeathCause();

		/**
		 * The meta object literal for the '<em><b>Personhistory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSONHISTORY = eINSTANCE.getPerson_Personhistory();

		/**
		 * The meta object literal for the '<em><b>Cohabitation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__COHABITATION = eINSTANCE.getPerson_Cohabitation();

		/**
		 * The meta object literal for the '<em><b>Marriage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MARRIAGE = eINSTANCE.getPerson_Marriage();

		/**
		 * The meta object literal for the '<em><b>Unknown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__UNKNOWN = eINSTANCE.getPerson_Unknown();

		/**
		 * The meta object literal for the '{@link genDSL2.impl.PersonHistoryImpl <em>Person History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.PersonHistoryImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getPersonHistory()
		 * @generated
		 */
		EClass PERSON_HISTORY = eINSTANCE.getPersonHistory();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_HISTORY__GENDER = eINSTANCE.getPersonHistory_Gender();

		/**
		 * The meta object literal for the '<em><b>Given Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_HISTORY__GIVEN_NAME = eINSTANCE.getPersonHistory_GivenName();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_HISTORY__CHANGED = eINSTANCE.getPersonHistory_Changed();

		/**
		 * The meta object literal for the '{@link genDSL2.impl.DateXImpl <em>Date X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.impl.DateXImpl
		 * @see genDSL2.impl.GenDSL2PackageImpl#getDateX()
		 * @generated
		 */
		EClass DATE_X = eINSTANCE.getDateX();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_X__YEAR = eINSTANCE.getDateX_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_X__MONTH = eINSTANCE.getDateX_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_X__DAY = eINSTANCE.getDateX_Day();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_X___BEFORE__DATEX = eINSTANCE.getDateX__Before__DateX();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_X___AFTER__DATEX = eINSTANCE.getDateX__After__DateX();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_X___IS_NULL = eINSTANCE.getDateX__IsNull();

		/**
		 * The meta object literal for the '<em><b>Is Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_X___IS_NOT_NULL = eINSTANCE.getDateX__IsNotNull();

		/**
		 * The meta object literal for the '{@link genDSL2.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.TypeOfIntimateRelationship
		 * @see genDSL2.impl.GenDSL2PackageImpl#getTypeOfIntimateRelationship()
		 * @generated
		 */
		EEnum TYPE_OF_INTIMATE_RELATIONSHIP = eINSTANCE.getTypeOfIntimateRelationship();

		/**
		 * The meta object literal for the '{@link genDSL2.TypeOfPerson <em>Type Of Person</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.TypeOfPerson
		 * @see genDSL2.impl.GenDSL2PackageImpl#getTypeOfPerson()
		 * @generated
		 */
		EEnum TYPE_OF_PERSON = eINSTANCE.getTypeOfPerson();

		/**
		 * The meta object literal for the '{@link genDSL2.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genDSL2.Gender
		 * @see genDSL2.impl.GenDSL2PackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //GenDSL2Package
