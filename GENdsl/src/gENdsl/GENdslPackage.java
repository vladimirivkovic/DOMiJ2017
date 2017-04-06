/**
 */
package gENdsl;

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
 * @see gENdsl.GENdslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GENdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gENdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gENdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gENdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GENdslPackage eINSTANCE = gENdsl.impl.GENdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link gENdsl.impl.GenealogyTreeImpl <em>Genealogy Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.GenealogyTreeImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getGenealogyTree()
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
	 * The meta object id for the '{@link gENdsl.impl.MarriageImpl <em>Marriage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.MarriageImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getMarriage()
	 * @generated
	 */
	int MARRIAGE = 1;

	/**
	 * The feature id for the '<em><b>Spouses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__SPOUSES = 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__FROM_DATE = 1;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__TO_DATE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE__TYPE = 4;

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
	 * The meta object id for the '{@link gENdsl.impl.CohabitationImpl <em>Cohabitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.CohabitationImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getCohabitation()
	 * @generated
	 */
	int COHABITATION = 2;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__PARTNERS = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Legitimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__LEGITIMATE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COHABITATION__TYPE = 3;

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
	 * The meta object id for the '{@link gENdsl.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.PersonImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getPerson()
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
	 * The feature id for the '<em><b>Marriages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARRIAGES = 10;

	/**
	 * The feature id for the '<em><b>Cohabitations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COHABITATIONS = 11;

	/**
	 * The feature id for the '<em><b>Death Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_CAUSE = 12;

	/**
	 * The feature id for the '<em><b>Personhistory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONHISTORY = 13;

	/**
	 * The feature id for the '<em><b>Cohabitation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COHABITATION = 14;

	/**
	 * The feature id for the '<em><b>Marriage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARRIAGE = 15;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__UNKNOWN = 16;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gENdsl.impl.PersonHistoryImpl <em>Person History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.PersonHistoryImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getPersonHistory()
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
	 * The meta object id for the '{@link gENdsl.impl.DateXImpl <em>Date X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.impl.DateXImpl
	 * @see gENdsl.impl.GENdslPackageImpl#getDateX()
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
	 * The meta object id for the '{@link gENdsl.TypeOfPerson <em>Type Of Person</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.TypeOfPerson
	 * @see gENdsl.impl.GENdslPackageImpl#getTypeOfPerson()
	 * @generated
	 */
	int TYPE_OF_PERSON = 6;

	/**
	 * The meta object id for the '{@link gENdsl.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.Gender
	 * @see gENdsl.impl.GENdslPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 7;

	/**
	 * The meta object id for the '{@link gENdsl.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gENdsl.TypeOfIntimateRelationship
	 * @see gENdsl.impl.GENdslPackageImpl#getTypeOfIntimateRelationship()
	 * @generated
	 */
	int TYPE_OF_INTIMATE_RELATIONSHIP = 8;


	/**
	 * Returns the meta object for class '{@link gENdsl.GenealogyTree <em>Genealogy Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genealogy Tree</em>'.
	 * @see gENdsl.GenealogyTree
	 * @generated
	 */
	EClass getGenealogyTree();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.GenealogyTree#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see gENdsl.GenealogyTree#getFamilyName()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EAttribute getGenealogyTree_FamilyName();

	/**
	 * Returns the meta object for the containment reference '{@link gENdsl.GenealogyTree#getEstablished <em>Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Established</em>'.
	 * @see gENdsl.GenealogyTree#getEstablished()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EReference getGenealogyTree_Established();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.GenealogyTree#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see gENdsl.GenealogyTree#getPerson()
	 * @see #getGenealogyTree()
	 * @generated
	 */
	EReference getGenealogyTree_Person();

	/**
	 * Returns the meta object for class '{@link gENdsl.Marriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage</em>'.
	 * @see gENdsl.Marriage
	 * @generated
	 */
	EClass getMarriage();

	/**
	 * Returns the meta object for the reference list '{@link gENdsl.Marriage#getSpouses <em>Spouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spouses</em>'.
	 * @see gENdsl.Marriage#getSpouses()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Spouses();

	/**
	 * Returns the meta object for the containment reference '{@link gENdsl.Marriage#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Date</em>'.
	 * @see gENdsl.Marriage#getFromDate()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_FromDate();

	/**
	 * Returns the meta object for the containment reference '{@link gENdsl.Marriage#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Date</em>'.
	 * @see gENdsl.Marriage#getToDate()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_ToDate();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.Marriage#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see gENdsl.Marriage#getChildren()
	 * @see #getMarriage()
	 * @generated
	 */
	EReference getMarriage_Children();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Marriage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gENdsl.Marriage#getType()
	 * @see #getMarriage()
	 * @generated
	 */
	EAttribute getMarriage_Type();

	/**
	 * Returns the meta object for class '{@link gENdsl.Cohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cohabitation</em>'.
	 * @see gENdsl.Cohabitation
	 * @generated
	 */
	EClass getCohabitation();

	/**
	 * Returns the meta object for the reference list '{@link gENdsl.Cohabitation#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partners</em>'.
	 * @see gENdsl.Cohabitation#getPartners()
	 * @see #getCohabitation()
	 * @generated
	 */
	EReference getCohabitation_Partners();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.Cohabitation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see gENdsl.Cohabitation#getChildren()
	 * @see #getCohabitation()
	 * @generated
	 */
	EReference getCohabitation_Children();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Cohabitation#isLegitimate <em>Legitimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legitimate</em>'.
	 * @see gENdsl.Cohabitation#isLegitimate()
	 * @see #getCohabitation()
	 * @generated
	 */
	EAttribute getCohabitation_Legitimate();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Cohabitation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gENdsl.Cohabitation#getType()
	 * @see #getCohabitation()
	 * @generated
	 */
	EAttribute getCohabitation_Type();

	/**
	 * Returns the meta object for class '{@link gENdsl.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see gENdsl.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see gENdsl.Person#getGivenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GivenName();

	/**
	 * Returns the meta object for the containment reference '{@link gENdsl.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Date</em>'.
	 * @see gENdsl.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_BirthDate();

	/**
	 * Returns the meta object for the containment reference '{@link gENdsl.Person#getDeathDate <em>Death Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Death Date</em>'.
	 * @see gENdsl.Person#getDeathDate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DeathDate();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getBirthPlace <em>Birth Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Place</em>'.
	 * @see gENdsl.Person#getBirthPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthPlace();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getDeathPlace <em>Death Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Place</em>'.
	 * @see gENdsl.Person#getDeathPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathPlace();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getRestingPlace <em>Resting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resting Place</em>'.
	 * @see gENdsl.Person#getRestingPlace()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_RestingPlace();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gENdsl.Person#getType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Type();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see gENdsl.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute list '{@link gENdsl.Person#getOtherNames <em>Other Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Names</em>'.
	 * @see gENdsl.Person#getOtherNames()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_OtherNames();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see gENdsl.Person#getNickname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nickname();

	/**
	 * Returns the meta object for the reference list '{@link gENdsl.Person#getMarriages <em>Marriages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Marriages</em>'.
	 * @see gENdsl.Person#getMarriages()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Marriages();

	/**
	 * Returns the meta object for the reference list '{@link gENdsl.Person#getCohabitations <em>Cohabitations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cohabitations</em>'.
	 * @see gENdsl.Person#getCohabitations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Cohabitations();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#getDeathCause <em>Death Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Cause</em>'.
	 * @see gENdsl.Person#getDeathCause()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathCause();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.Person#getPersonhistory <em>Personhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personhistory</em>'.
	 * @see gENdsl.Person#getPersonhistory()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Personhistory();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.Person#getCohabitation <em>Cohabitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cohabitation</em>'.
	 * @see gENdsl.Person#getCohabitation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Cohabitation();

	/**
	 * Returns the meta object for the containment reference list '{@link gENdsl.Person#getMarriage <em>Marriage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marriage</em>'.
	 * @see gENdsl.Person#getMarriage()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Marriage();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.Person#isUnknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown</em>'.
	 * @see gENdsl.Person#isUnknown()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Unknown();

	/**
	 * Returns the meta object for class '{@link gENdsl.PersonHistory <em>Person History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person History</em>'.
	 * @see gENdsl.PersonHistory
	 * @generated
	 */
	EClass getPersonHistory();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.PersonHistory#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see gENdsl.PersonHistory#getGender()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_Gender();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.PersonHistory#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see gENdsl.PersonHistory#getGivenName()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.PersonHistory#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see gENdsl.PersonHistory#getChanged()
	 * @see #getPersonHistory()
	 * @generated
	 */
	EAttribute getPersonHistory_Changed();

	/**
	 * Returns the meta object for class '{@link gENdsl.DateX <em>Date X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date X</em>'.
	 * @see gENdsl.DateX
	 * @generated
	 */
	EClass getDateX();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.DateX#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see gENdsl.DateX#getYear()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Year();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.DateX#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see gENdsl.DateX#getMonth()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Month();

	/**
	 * Returns the meta object for the attribute '{@link gENdsl.DateX#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see gENdsl.DateX#getDay()
	 * @see #getDateX()
	 * @generated
	 */
	EAttribute getDateX_Day();

	/**
	 * Returns the meta object for the '{@link gENdsl.DateX#before(gENdsl.DateX) <em>Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Before</em>' operation.
	 * @see gENdsl.DateX#before(gENdsl.DateX)
	 * @generated
	 */
	EOperation getDateX__Before__DateX();

	/**
	 * Returns the meta object for the '{@link gENdsl.DateX#after(gENdsl.DateX) <em>After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>After</em>' operation.
	 * @see gENdsl.DateX#after(gENdsl.DateX)
	 * @generated
	 */
	EOperation getDateX__After__DateX();

	/**
	 * Returns the meta object for the '{@link gENdsl.DateX#isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Null</em>' operation.
	 * @see gENdsl.DateX#isNull()
	 * @generated
	 */
	EOperation getDateX__IsNull();

	/**
	 * Returns the meta object for the '{@link gENdsl.DateX#isNotNull() <em>Is Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Not Null</em>' operation.
	 * @see gENdsl.DateX#isNotNull()
	 * @generated
	 */
	EOperation getDateX__IsNotNull();

	/**
	 * Returns the meta object for enum '{@link gENdsl.TypeOfPerson <em>Type Of Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Person</em>'.
	 * @see gENdsl.TypeOfPerson
	 * @generated
	 */
	EEnum getTypeOfPerson();

	/**
	 * Returns the meta object for enum '{@link gENdsl.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see gENdsl.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link gENdsl.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Intimate Relationship</em>'.
	 * @see gENdsl.TypeOfIntimateRelationship
	 * @generated
	 */
	EEnum getTypeOfIntimateRelationship();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GENdslFactory getGENdslFactory();

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
		 * The meta object literal for the '{@link gENdsl.impl.GenealogyTreeImpl <em>Genealogy Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.GenealogyTreeImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getGenealogyTree()
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
		 * The meta object literal for the '{@link gENdsl.impl.MarriageImpl <em>Marriage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.MarriageImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getMarriage()
		 * @generated
		 */
		EClass MARRIAGE = eINSTANCE.getMarriage();

		/**
		 * The meta object literal for the '<em><b>Spouses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARRIAGE__SPOUSES = eINSTANCE.getMarriage_Spouses();

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
		 * The meta object literal for the '{@link gENdsl.impl.CohabitationImpl <em>Cohabitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.CohabitationImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getCohabitation()
		 * @generated
		 */
		EClass COHABITATION = eINSTANCE.getCohabitation();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COHABITATION__PARTNERS = eINSTANCE.getCohabitation_Partners();

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
		 * The meta object literal for the '{@link gENdsl.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.PersonImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getPerson()
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
		 * The meta object literal for the '<em><b>Marriages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MARRIAGES = eINSTANCE.getPerson_Marriages();

		/**
		 * The meta object literal for the '<em><b>Cohabitations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__COHABITATIONS = eINSTANCE.getPerson_Cohabitations();

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
		 * The meta object literal for the '{@link gENdsl.impl.PersonHistoryImpl <em>Person History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.PersonHistoryImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getPersonHistory()
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
		 * The meta object literal for the '{@link gENdsl.impl.DateXImpl <em>Date X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.impl.DateXImpl
		 * @see gENdsl.impl.GENdslPackageImpl#getDateX()
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
		 * The meta object literal for the '{@link gENdsl.TypeOfPerson <em>Type Of Person</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.TypeOfPerson
		 * @see gENdsl.impl.GENdslPackageImpl#getTypeOfPerson()
		 * @generated
		 */
		EEnum TYPE_OF_PERSON = eINSTANCE.getTypeOfPerson();

		/**
		 * The meta object literal for the '{@link gENdsl.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.Gender
		 * @see gENdsl.impl.GENdslPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link gENdsl.TypeOfIntimateRelationship <em>Type Of Intimate Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gENdsl.TypeOfIntimateRelationship
		 * @see gENdsl.impl.GENdslPackageImpl#getTypeOfIntimateRelationship()
		 * @generated
		 */
		EEnum TYPE_OF_INTIMATE_RELATIONSHIP = eINSTANCE.getTypeOfIntimateRelationship();

	}

} //GENdslPackage
