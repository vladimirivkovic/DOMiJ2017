/**
 */
package genDSL2.impl;

import genDSL2.Cohabitation;
import genDSL2.DateX;
import genDSL2.GenDSL2Factory;
import genDSL2.GenDSL2Package;
import genDSL2.Gender;
import genDSL2.GenealogyTree;
import genDSL2.Marriage;
import genDSL2.Person;
import genDSL2.PersonHistory;
import genDSL2.TypeOfIntimateRelationship;
import genDSL2.TypeOfPerson;

import genDSL2.util.GenDSL2Validator;

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
public class GenDSL2PackageImpl extends EPackageImpl implements GenDSL2Package {
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
	private EEnum typeOfIntimateRelationshipEEnum = null;

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
	 * @see genDSL2.GenDSL2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenDSL2PackageImpl() {
		super(eNS_URI, GenDSL2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenDSL2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenDSL2Package init() {
		if (isInited) return (GenDSL2Package)EPackage.Registry.INSTANCE.getEPackage(GenDSL2Package.eNS_URI);

		// Obtain or create and register package
		GenDSL2PackageImpl theGenDSL2Package = (GenDSL2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenDSL2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenDSL2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGenDSL2Package.createPackageContents();

		// Initialize created meta-data
		theGenDSL2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGenDSL2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GenDSL2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGenDSL2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenDSL2Package.eNS_URI, theGenDSL2Package);
		return theGenDSL2Package;
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
	public EReference getMarriage_FromDate() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_ToDate() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Children() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarriage_Type() {
		return (EAttribute)marriageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarriage_Spouses() {
		return (EReference)marriageEClass.getEStructuralFeatures().get(4);
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
	public EReference getCohabitation_Children() {
		return (EReference)cohabitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCohabitation_Legitimate() {
		return (EAttribute)cohabitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCohabitation_Type() {
		return (EAttribute)cohabitationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCohabitation_Partners() {
		return (EReference)cohabitationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getPerson_DeathCause() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Personhistory() {
		return (EReference)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Cohabitation() {
		return (EReference)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Marriage() {
		return (EReference)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Unknown() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(14);
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
	public EEnum getTypeOfIntimateRelationship() {
		return typeOfIntimateRelationshipEEnum;
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
	public GenDSL2Factory getGenDSL2Factory() {
		return (GenDSL2Factory)getEFactoryInstance();
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
		createEReference(marriageEClass, MARRIAGE__FROM_DATE);
		createEReference(marriageEClass, MARRIAGE__TO_DATE);
		createEReference(marriageEClass, MARRIAGE__CHILDREN);
		createEAttribute(marriageEClass, MARRIAGE__TYPE);
		createEReference(marriageEClass, MARRIAGE__SPOUSES);

		cohabitationEClass = createEClass(COHABITATION);
		createEReference(cohabitationEClass, COHABITATION__CHILDREN);
		createEAttribute(cohabitationEClass, COHABITATION__LEGITIMATE);
		createEAttribute(cohabitationEClass, COHABITATION__TYPE);
		createEReference(cohabitationEClass, COHABITATION__PARTNERS);

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
		typeOfIntimateRelationshipEEnum = createEEnum(TYPE_OF_INTIMATE_RELATIONSHIP);
		typeOfPersonEEnum = createEEnum(TYPE_OF_PERSON);
		genderEEnum = createEEnum(GENDER);
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
		initEReference(getMarriage_FromDate(), this.getDateX(), null, "fromDate", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_ToDate(), this.getDateX(), null, "toDate", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_Children(), this.getPerson(), null, "children", null, 0, -1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarriage_Type(), this.getTypeOfIntimateRelationship(), "type", null, 0, 1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarriage_Spouses(), this.getPerson(), null, "spouses", null, 0, -1, Marriage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cohabitationEClass, Cohabitation.class, "Cohabitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCohabitation_Children(), this.getPerson(), null, "children", null, 0, -1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCohabitation_Legitimate(), ecorePackage.getEBoolean(), "legitimate", null, 0, 1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCohabitation_Type(), this.getTypeOfIntimateRelationship(), "type", null, 0, 1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCohabitation_Partners(), this.getPerson(), null, "partners", null, 0, -1, Cohabitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getPerson_DeathCause(), ecorePackage.getEString(), "deathCause", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Personhistory(), this.getPersonHistory(), null, "personhistory", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Cohabitation(), this.getCohabitation(), null, "cohabitation", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Marriage(), this.getMarriage(), null, "marriage", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Unknown(), ecorePackage.getEBoolean(), "unknown", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personHistoryEClass, PersonHistory.class, "PersonHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonHistory_Gender(), this.getGender(), "gender", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonHistory_GivenName(), ecorePackage.getEString(), "givenName", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonHistory_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, PersonHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateXEClass, DateX.class, "DateX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateX_Year(), ecorePackage.getEInt(), "year", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateX_Month(), ecorePackage.getEInt(), "month", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateX_Day(), ecorePackage.getEInt(), "day", null, 0, 1, DateX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDateX__Before__DateX(), ecorePackage.getEBoolean(), "before", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDateX(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDateX__After__DateX(), ecorePackage.getEBoolean(), "after", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDateX(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDateX__IsNull(), ecorePackage.getEBoolean(), "isNull", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDateX__IsNotNull(), ecorePackage.getEBoolean(), "isNotNull", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.class, "TypeOfIntimateRelationship");
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.MONOGAMY);
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.POLYGAMY);
		addEEnumLiteral(typeOfIntimateRelationshipEEnum, TypeOfIntimateRelationship.POLYFIDELITY);

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
			 "constraints", "noOverlap min2Spouses parentsOlder"
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
			 "noOverlap", "(self.fromDate.isNotNull() and self.toDate.isNotNull()) \n                            implies (spouses->forAll(s1 | Marriage.allInstances()->forAll(m1 | \n                              (m1->includes(s1) and m1 <> self )\n                              implies\n                              ((m1.fromDate.isNotNull() and m1.toDate.isNotNull())\n                                implies (m1.fromDate.after(self.toDate) or m1.toDate.before(self.fromDate))))))",
			 "min2Spouses", "spouses->size() >= 2",
			 "parentsOlder", "spouses->forAll(s | children->forAll(c |\n\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))"
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
			 "leastOneMarriageOrCohabitation", "\n                (type = TypeOfPerson::MARRIED) \n                implies (Marriage.allInstances()->exists(m | m.spouses->includes(self))\n                  or Cohabitation.allInstances()->exists(c | c.partners->includes(self))\n                )",
			 "oneRoot", "Person.allInstances()->select(p : Person |\n\t\t\t\t\t((p.type <> TypeOfPerson::MARRIED) and ((Marriage.allInstances()->select(m : Marriage |\n\t\t\t\t\t\tm.children->includes(p))->isEmpty()) and (Cohabitation.allInstances()->select(c : Cohabitation |\n\t\t\t\t\t\tc.children->includes(p))->isEmpty()))))->size() = 1",
			 "inMyMarriages", "marriage->forAll(spouses->count(self) = 1)",
			 "inMyCohabitations", "cohabitation->forAll(partners->count(self) = 1)",
			 "marrigesInLifetime", " (self.birthDate.isNotNull() \n                                     implies (Marriage.allInstances()->forAll(m |\n                                        (m.spouses->includes(self) and m.fromDate.isNotNull()) \n                                        implies self.birthDate.before(m.fromDate))))\n                                     and (self.deathDate.isNotNull() \n                                     implies (Marriage.allInstances()->forAll(m |\n                                        (m.spouses->includes(self) and m.toDate.isNotNull())\n                                         implies self.deathDate.after(m.toDate))))"
		   });	
		addAnnotation
		  (getDateX__Before__DateX(), 
		   source, 
		   new String[] {
			 "body", "if self.year->isEmpty() or d.year->isEmpty() then null\n\t\t\t\t\telse if self.year < d.year then true\n\t\t\t\t\t\telse if self.year > d.year then false\n\t\t\t\t\t\t\telse if self.month->isEmpty() or d.month->isEmpty() then null\n\t\t\t\t\t\t\t\telse if self.month < d.month then true\n\t\t\t\t\t\t\t\t\telse if self.month > d.month then false\n\t\t\t\t\t\t\t\t\t\telse if self.day->isEmpty() or d.day->isEmpty() then null\n\t\t\t\t\t\t\t\t\t\t\telse if self.day < d.day then true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif endif endif endif endif endif endif endif"
		   });	
		addAnnotation
		  (getDateX__After__DateX(), 
		   source, 
		   new String[] {
			 "body", "if self.year->isEmpty() or d.year->isEmpty() then null\n\t\t\t\t\telse if self.year > d.year then true\n\t\t\t\t\t\telse if self.year < d.year then false\n\t\t\t\t\t\t\telse if self.month->isEmpty() or d.month->isEmpty() then null\n\t\t\t\t\t\t\t\telse if self.month > d.month then true\n\t\t\t\t\t\t\t\t\telse if self.month < d.month then false\n\t\t\t\t\t\t\t\t\t\telse if self.day->isEmpty() or d.day->isEmpty() then null\n\t\t\t\t\t\t\t\t\t\t\telse if self.day > d.day then true\n\t\t\t\t\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\t\t\t\t\tendif endif endif endif endif endif endif endif"
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
			 "body", "if self->isEmpty()\n\t\t\t\t\tthen false\n\t\t\t\t\telse (if self.year->notEmpty() then true\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif) endif"
		   });
	}

} //GenDSL2PackageImpl
