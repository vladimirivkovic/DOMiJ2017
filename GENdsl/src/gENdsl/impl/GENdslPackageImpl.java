/**
 */
package gENdsl.impl;

import gENdsl.Cohabitation;
import gENdsl.DateX;
import gENdsl.GENdslFactory;
import gENdsl.GENdslPackage;
import gENdsl.Gender;
import gENdsl.GenealogyTree;
import gENdsl.Marriage;
import gENdsl.Person;
import gENdsl.PersonHistory;
import gENdsl.TypeOfIntimateRelationship;
import gENdsl.TypeOfPerson;

import gENdsl.util.GENdslValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GENdslPackageImpl extends EPackageImpl implements GENdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genealogyTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marriageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cohabitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOfPersonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOfIntimateRelationshipEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gENdsl.GENdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GENdslPackageImpl() {
		super(eNS_URI, GENdslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GENdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GENdslPackage init() {
		if (isInited) return (GENdslPackage)EPackage.Registry.INSTANCE.getEPackage(GENdslPackage.eNS_URI);

		// Obtain or create and register package
		GENdslPackageImpl theGENdslPackage = (GENdslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GENdslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GENdslPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGENdslPackage.createPackageContents();

		// Initialize created meta-data
		theGENdslPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGENdslPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GENdslValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGENdslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GENdslPackage.eNS_URI, theGENdslPackage);
		return theGENdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenealogyTree() {
		return genealogyTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenealogyTree_FamilyName() {
		return (EAttribute)genealogyTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenealogyTree_Established() {
		return (EReference)genealogyTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenealogyTree_Person() {
		return (EReference)genealogyTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarriage() {
		return marriageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Spouses() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_FromDate() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_ToDate() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Children() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarriage_Type() {
		return (EAttribute)marriageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCohabitation() {
		return cohabitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCohabitation_Partners() {
		return (EReference)cohabitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCohabitation_Children() {
		return (EReference)cohabitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCohabitation_Legitimate() {
		return (EAttribute)cohabitationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCohabitation_Type() {
		return (EAttribute)cohabitationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_GivenName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_BirthDate() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_DeathDate() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_BirthPlace() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_DeathPlace() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_RestingPlace() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Type() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_OtherNames() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Nickname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Marriages() {
		return (EReference)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Cohabitations() {
		return (EReference)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_DeathCause() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Personhistory() {
		return (EReference)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Cohabitation() {
		return (EReference)personEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Marriage() {
		return (EReference)personEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Unknown() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonHistory() {
		return personHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonHistory_Gender() {
		return (EAttribute)personHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonHistory_GivenName() {
		return (EAttribute)personHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonHistory_Changed() {
		return (EAttribute)personHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateX() {
		return dateXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateX_Year() {
		return (EAttribute)dateXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateX_Month() {
		return (EAttribute)dateXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateX_Day() {
		return (EAttribute)dateXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateX__Before__DateX() {
		return dateXEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateX__After__DateX() {
		return dateXEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateX__IsNull() {
		return dateXEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDateX__IsNotNull() {
		return dateXEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOfPerson() {
		return typeOfPersonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOfIntimateRelationship() {
		return typeOfIntimateRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENdslFactory getGENdslFactory() {
		return (GENdslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		genealogyTreeEClass = createEClass(GENEALOGY_TREE);
		createEAttribute(genealogyTreeEClass, GENEALOGY_TREE__FAMILY_NAME);
		createEReference(genealogyTreeEClass, GENEALOGY_TREE__ESTABLISHED);
		createEReference(genealogyTreeEClass, GENEALOGY_TREE__PERSON);

		marriageEClass = createEClass(MARRIAGE);
		createEReference(marriageEClass, MARRIAGE__SPOUSES);
		createEReference(marriageEClass, MARRIAGE__FROM_DATE);
		createEReference(marriageEClass, MARRIAGE__TO_DATE);
		createEReference(marriageEClass, MARRIAGE__CHILDREN);
		createEAttribute(marriageEClass, MARRIAGE__TYPE);

		cohabitationEClass = createEClass(COHABITATION);
		createEReference(cohabitationEClass, COHABITATION__PARTNERS);
		createEReference(cohabitationEClass, COHABITATION__CHILDREN);
		createEAttribute(cohabitationEClass, COHABITATION__LEGITIMATE);
		createEAttribute(cohabitationEClass, COHABITATION__TYPE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__GIVEN_NAME);
		createEReference(personEClass, PERSON__BIRTH_DATE);
		createEReference(personEClass, PERSON__DEATH_DATE);
		createEAttribute(personEClass, PERSON__BIRTH_PLACE);
		createEAttribute(personEClass, PERSON__DEATH_PLACE);
		createEAttribute(personEClass, PERSON__RESTING_PLACE);
		createEAttribute(personEClass, PERSON__TYPE);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__OTHER_NAMES);
		createEAttribute(personEClass, PERSON__NICKNAME);
		createEReference(personEClass, PERSON__MARRIAGES);
		createEReference(personEClass, PERSON__COHABITATIONS);
		createEAttribute(personEClass, PERSON__DEATH_CAUSE);
		createEReference(personEClass, PERSON__PERSONHISTORY);
		createEReference(personEClass, PERSON__COHABITATION);
		createEReference(personEClass, PERSON__MARRIAGE);
		createEAttribute(personEClass, PERSON__UNKNOWN);

		personHistoryEClass = createEClass(PERSON_HISTORY);
		createEAttribute(personHistoryEClass, PERSON_HISTORY__GENDER);
		createEAttribute(personHistoryEClass, PERSON_HISTORY__GIVEN_NAME);
		createEAttribute(personHistoryEClass, PERSON_HISTORY__CHANGED);

		dateXEClass = createEClass(DATE_X);
		createEAttribute(dateXEClass, DATE_X__YEAR);
		createEAttribute(dateXEClass, DATE_X__MONTH);
		createEAttribute(dateXEClass, DATE_X__DAY);
		createEOperation(dateXEClass, DATE_X___BEFORE__DATEX);
		createEOperation(dateXEClass, DATE_X___AFTER__DATEX);
		createEOperation(dateXEClass, DATE_X___IS_NULL);
		createEOperation(dateXEClass, DATE_X___IS_NOT_NULL);

		// Create enums
		typeOfPersonEEnum = createEEnum(TYPE_OF_PERSON);
		genderEEnum = createEEnum(GENDER);
		typeOfIntimateRelationshipEEnum = createEEnum(TYPE_OF_INTIMATE_RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(genealogyTreeEClass, GenealogyTree.class, "GenealogyTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenealogyTree_FamilyName(), ecorePackage.getEString(), "familyName", null, 1, 1, GenealogyTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenealogyTree_Established(), this.getDateX(), null, "established", null, 0, 1, GenealogyTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenealogyTree_Person(), this.getPerson(), null, "person", null, 0, -1, GenealogyTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marriageEClass, Marriage.class, "Marriage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarriage_Spouses(), this.getPerson(), this.getPerson_Marriages(), "spouses", null, 0, -1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_FromDate(), this.getDateX(), null, "fromDate", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_ToDate(), this.getDateX(), null, "toDate", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_Children(), this.getPerson(), null, "children", null, 0, -1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarriage_Type(), this.getTypeOfIntimateRelationship(), "type", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cohabitationEClass, Cohabitation.class, "Cohabitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCohabitation_Partners(), this.getPerson(), this.getPerson_Cohabitations(), "partners", null, 0, -1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCohabitation_Children(), this.getPerson(), null, "children", null, 0, -1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCohabitation_Legitimate(), ecorePackage.getEBoolean(), "legitimate", null, 0, 1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCohabitation_Type(), this.getTypeOfIntimateRelationship(), "type", null, 0, 1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_GivenName(), ecorePackage.getEString(), "givenName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_BirthDate(), this.getDateX(), null, "birthDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_DeathDate(), this.getDateX(), null, "deathDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_BirthPlace(), ecorePackage.getEString(), "birthPlace", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeathPlace(), ecorePackage.getEString(), "deathPlace", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_RestingPlace(), ecorePackage.getEString(), "restingPlace", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Type(), this.getTypeOfPerson(), "type", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), this.getGender(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_OtherNames(), ecorePackage.getEString(), "otherNames", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Marriages(), this.getMarriage(), this.getMarriage_Spouses(), "marriages", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Cohabitations(), this.getCohabitation(), this.getCohabitation_Partners(), "cohabitations", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeathCause(), ecorePackage.getEString(), "deathCause", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Personhistory(), this.getPersonHistory(), null, "personhistory", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Cohabitation(), this.getCohabitation(), null, "cohabitation", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Marriage(), this.getMarriage(), null, "marriage", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Unknown(), ecorePackage.getEBoolean(), "unknown", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personHistoryEClass, PersonHistory.class, "PersonHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonHistory_Gender(), this.getGender(), "gender", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonHistory_GivenName(), ecorePackage.getEString(), "givenName", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonHistory_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateXEClass, DateX.class, "DateX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateX_Year(), ecorePackage.getEIntegerObject(), "year", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateX_Month(), ecorePackage.getEIntegerObject(), "month", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateX_Day(), ecorePackage.getEIntegerObject(), "day", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDateX__Before__DateX(), ecorePackage.getEBoolean(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDateX(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDateX__After__DateX(), ecorePackage.getEBoolean(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDateX(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDateX__IsNull(), ecorePackage.getEBoolean(), "isNull", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDateX__IsNotNull(), ecorePackage.getEBoolean(), "isNotNull", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeOfPersonEEnum, TypeOfPerson.class, "TypeOfPerson");
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.BIOLOGICAL);
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.ADOPTED);
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.SEMIADOPTED);
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.MARRIED);
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.DISOWNED);
		addEEnumLiteral(typeOfPersonEEnum, TypeOfPerson.ILLEGITIMATE);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
		addEEnumLiteral(genderEEnum, Gender.BIGENDER);

		initEEnum(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.class, "TypeOfIntimateRelationship");
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.MONOGAMY);
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.POLYGAMY);
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.POLYFIDELITY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (marriageEClass, 
		   source, 
		   new String[] {
			 "constraints", "min2Spouses parentsOlder noOverlap"
		   });	
		addAnnotation
		  (cohabitationEClass, 
		   source, 
		   new String[] {
			 "constraints", "min2Partners parentsOlder"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "constraints", "noName leastOneMarriageOrCohabitation oneRoot inMyMarriages inMyCohabitations marrigesInLifetime"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (marriageEClass, 
		   source, 
		   new String[] {
			 "min2Spouses", "spouses->size() >= 2",
			 "parentsOlder", "spouses->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))",
			 "noOverlap", "(self.fromDate.isNotNull() and self.toDate.isNotNull()) implies (spouses->forAll(s1 |\n\t\t\t\t\ts1.marriages->forAll(m |\n\t\t\t\t\t\t(m <> self and m.fromDate.isNotNull() and m.toDate.isNotNull()) implies (m.fromDate.after(self.toDate) or m.toDate.before(self.fromDate)))))"
		   });	
		addAnnotation
		  (getMarriage_Type(), 
		   source, 
		   new String[] {
			 "derivation", "if self.spouses->size() > 2 then (if (self.spouses->iterate(p : Person; m : Integer = 0 | if\n\t\t\t\t\t\t\t\tp.gender = Gender::MALE then m + 1\n\t\t\t\t\t\t\telse m\n\t\t\t\t\t\t\tendif) > 1 and self.spouses->iterate(p : Person; m : Integer = 0 | if p.gender = Gender::FEMALE then m + 1\n\t\t\t\t\t\t\telse m\n\t\t\t\t\t\t\tendif) > 1) then TypeOfIntimateRelationship::POLYFIDELITY\n\t\t\t\t\telse TypeOfIntimateRelationship::POLYGAMY\n\t\t\t\t\tendif) else TypeOfIntimateRelationship::MONOGAMY\n\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (cohabitationEClass, 
		   source, 
		   new String[] {
			 "min2Partners", "partners->size() >= 2",
			 "parentsOlder", "partners->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "noName", "not unknown implies givenName <> \'\'",
			 "leastOneMarriageOrCohabitation", "(type = TypeOfPerson::MARRIED) implies (marriages->notEmpty() or cohabitations->notEmpty())",
			 "oneRoot", "Person.allInstances()->select(p : Person |\n\t\t\t\t\t((p.type <> TypeOfPerson::MARRIED) and \n\t\t\t\t\t((Marriage.allInstances()->select(m : Marriage | m.children->includes(p))->isEmpty()) \n\t\t\t\t\t\tand (Cohabitation.allInstances()->select(c : Cohabitation | c.children->includes(p))->isEmpty()))))->size() = 1",
			 "inMyMarriages", "marriage->forAll(spouses->count(self) = 1)",
			 "inMyCohabitations", "cohabitation->forAll(partners->count(self) = 1)",
			 "marrigesInLifetime", "(self.birthDate.isNotNull() implies marriages->forAll(m |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.fromDate.isNotNull() implies self.birthDate.before(m.fromDate)))\n\t\t\t\t\t\t\t\t\t\t  and\n\t\t\t\t\t\t\t\t\t\t  (self.deathDate.isNotNull() implies marriages->forAll(m |\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.toDate.isNotNull() implies self.deathDate.after(m.toDate)))\n\t\t\t\t\t\t\t\t\t\t"
		   });	
		addAnnotation
		  (getDateX__Before__DateX(), 
		   source, 
		   new String[] {
			 "body", "if self.year->isEmpty() or d.year->isEmpty() then null else\n\t\t\t\t\t   \t\tif self.year < d.year then true else\n\t\t\t\t\t   \t\t\tif self.year > d.year then false else\n\t\t\t\t\t   \t\t\t\n\t\t\t\t\t   \t\t\t\tif self.month->isEmpty() or d.month->isEmpty() then null else\n\t\t\t\t\t\t\t\t   \t\tif self.month < d.month then true else\n\t\t\t\t\t\t\t\t   \t\t\tif self.month > d.month then false else\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\t\tif self.day->isEmpty() or d.day->isEmpty() then null else\n\t\t\t\t\t\t\t\t\t\t\t   \t\tif self.day < d.day then true else\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\t   \t\tendif\t\t\n\t\t\t\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t\t\t\t   \t\tendif\n\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \n\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t   \t\tendif\t\n\t\t\t\t\t   endif"
		   });	
		addAnnotation
		  (getDateX__After__DateX(), 
		   source, 
		   new String[] {
			 "body", "if self.year->isEmpty() or d.year->isEmpty() then null else\n\t\t\t\t\t   \t\tif self.year > d.year then true else\n\t\t\t\t\t   \t\t\tif self.year < d.year then false else\n\t\t\t\t\t   \t\t\t\n\t\t\t\t\t   \t\t\t\tif self.month->isEmpty() or d.month->isEmpty() then null else\n\t\t\t\t\t\t\t\t   \t\tif self.month > d.month then true else\n\t\t\t\t\t\t\t\t   \t\t\tif self.month < d.month then false else\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\t\tif self.day->isEmpty() or d.day->isEmpty() then null else\n\t\t\t\t\t\t\t\t\t\t\t   \t\tif self.day > d.day then true else\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\t   \t\tendif\t\t\n\t\t\t\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \t\t\t\t\n\t\t\t\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t\t\t\t   \t\tendif\n\t\t\t\t\t\t\t\t   endif\n\t\t\t\t\t\t\t\t   \n\t\t\t\t\t   \t\t\tendif\n\t\t\t\t\t   \t\tendif\t\n\t\t\t\t\t   endif"
		   });	
		addAnnotation
		  (getDateX__IsNull(), 
		   source, 
		   new String[] {
			 "body", "self.year->isEmpty()"
		   });	
		addAnnotation
		  (getDateX__IsNotNull(), 
		   source, 
		   new String[] {
			 "body", "if self->isEmpty() then false else (if self.year->notEmpty() then true else false endif)\n\t\t\t\t\t  endif"
		   });
	}

} //GENdslPackageImpl
