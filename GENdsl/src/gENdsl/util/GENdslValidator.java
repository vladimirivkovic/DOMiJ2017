/**
 */
package gENdsl.util;

import gENdsl.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gENdsl.GENdslPackage
 * @generated
 */
public class GENdslValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GENdslValidator INSTANCE = new GENdslValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gENdsl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENdslValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GENdslPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GENdslPackage.GENEALOGY_TREE:
				return validateGenealogyTree((GenealogyTree)value, diagnostics, context);
			case GENdslPackage.MARRIAGE:
				return validateMarriage((Marriage)value, diagnostics, context);
			case GENdslPackage.COHABITATION:
				return validateCohabitation((Cohabitation)value, diagnostics, context);
			case GENdslPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case GENdslPackage.PERSON_HISTORY:
				return validatePersonHistory((PersonHistory)value, diagnostics, context);
			case GENdslPackage.DATE_X:
				return validateDateX((DateX)value, diagnostics, context);
			case GENdslPackage.TYPE_OF_PERSON:
				return validateTypeOfPerson((TypeOfPerson)value, diagnostics, context);
			case GENdslPackage.GENDER:
				return validateGender((Gender)value, diagnostics, context);
			case GENdslPackage.TYPE_OF_INTIMATE_RELATIONSHIP:
				return validateTypeOfIntimateRelationship((TypeOfIntimateRelationship)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenealogyTree(GenealogyTree genealogyTree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genealogyTree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarriage(Marriage marriage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(marriage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarriage_min2Spouses(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarriage_parentsOlder(marriage, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarriage_noOverlap(marriage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the min2Spouses constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MARRIAGE__MIN2_SPOUSES__EEXPRESSION = "spouses->size() >= 2";

	/**
	 * Validates the min2Spouses constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarriage_min2Spouses(Marriage marriage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.MARRIAGE,
				 marriage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "min2Spouses",
				 MARRIAGE__MIN2_SPOUSES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parentsOlder constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MARRIAGE__PARENTS_OLDER__EEXPRESSION = "spouses->forAll(s | children->forAll(c |\n" +
		"\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))";

	/**
	 * Validates the parentsOlder constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarriage_parentsOlder(Marriage marriage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.MARRIAGE,
				 marriage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "parentsOlder",
				 MARRIAGE__PARENTS_OLDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOverlap constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MARRIAGE__NO_OVERLAP__EEXPRESSION = "(self.fromDate.isNotNull() and self.toDate.isNotNull()) implies (spouses->forAll(s1 |\n" +
		"\t\t\t\t\ts1.marriages->forAll(m |\n" +
		"\t\t\t\t\t\t(m <> self and m.fromDate.isNotNull() and m.toDate.isNotNull()) implies (m.fromDate.after(self.toDate) or m.toDate.before(self.fromDate)))))";

	/**
	 * Validates the noOverlap constraint of '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarriage_noOverlap(Marriage marriage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.MARRIAGE,
				 marriage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOverlap",
				 MARRIAGE__NO_OVERLAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCohabitation(Cohabitation cohabitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cohabitation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCohabitation_min2Partners(cohabitation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCohabitation_parentsOlder(cohabitation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the min2Partners constraint of '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COHABITATION__MIN2_PARTNERS__EEXPRESSION = "partners->size() >= 2";

	/**
	 * Validates the min2Partners constraint of '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCohabitation_min2Partners(Cohabitation cohabitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.COHABITATION,
				 cohabitation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "min2Partners",
				 COHABITATION__MIN2_PARTNERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parentsOlder constraint of '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COHABITATION__PARENTS_OLDER__EEXPRESSION = "partners->forAll(s | children->forAll(c |\n" +
		"\t\t\t\t\t\t(c.birthDate.isNotNull() and s.birthDate.isNotNull()) implies (c.birthDate.after(s.birthDate))))";

	/**
	 * Validates the parentsOlder constraint of '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCohabitation_parentsOlder(Cohabitation cohabitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.COHABITATION,
				 cohabitation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "parentsOlder",
				 COHABITATION__PARENTS_OLDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_noName(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_leastOneMarriageOrCohabitation(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_oneRoot(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_inMyMarriages(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_inMyCohabitations(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_marrigesInLifetime(person, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noName constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__NO_NAME__EEXPRESSION = "not unknown implies givenName <> ''";

	/**
	 * Validates the noName constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_noName(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noName",
				 PERSON__NO_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the leastOneMarriageOrCohabitation constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__LEAST_ONE_MARRIAGE_OR_COHABITATION__EEXPRESSION = "(type = TypeOfPerson::MARRIED) implies (marriages->notEmpty() or cohabitations->notEmpty())";

	/**
	 * Validates the leastOneMarriageOrCohabitation constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_leastOneMarriageOrCohabitation(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "leastOneMarriageOrCohabitation",
				 PERSON__LEAST_ONE_MARRIAGE_OR_COHABITATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the oneRoot constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__ONE_ROOT__EEXPRESSION = "Person.allInstances()->select(p : Person |\n" +
		"\t\t\t\t\t((p.type <> TypeOfPerson::MARRIED) and \n" +
		"\t\t\t\t\t((Marriage.allInstances()->select(m : Marriage | m.children->includes(p))->isEmpty()) \n" +
		"\t\t\t\t\t\tand (Cohabitation.allInstances()->select(c : Cohabitation | c.children->includes(p))->isEmpty()))))->size() = 1";

	/**
	 * Validates the oneRoot constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_oneRoot(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneRoot",
				 PERSON__ONE_ROOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the inMyMarriages constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__IN_MY_MARRIAGES__EEXPRESSION = "marriage->forAll(spouses->count(self) = 1)";

	/**
	 * Validates the inMyMarriages constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_inMyMarriages(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "inMyMarriages",
				 PERSON__IN_MY_MARRIAGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the inMyCohabitations constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__IN_MY_COHABITATIONS__EEXPRESSION = "cohabitation->forAll(partners->count(self) = 1)";

	/**
	 * Validates the inMyCohabitations constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_inMyCohabitations(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "inMyCohabitations",
				 PERSON__IN_MY_COHABITATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the marrigesInLifetime constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__MARRIGES_IN_LIFETIME__EEXPRESSION = "(self.birthDate.isNotNull() implies marriages->forAll(m |\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.fromDate.isNotNull() implies self.birthDate.before(m.fromDate)))\n" +
		"\t\t\t\t\t\t\t\t\t\t  and\n" +
		"\t\t\t\t\t\t\t\t\t\t  (self.deathDate.isNotNull() implies marriages->forAll(m |\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\tm.toDate.isNotNull() implies self.deathDate.after(m.toDate)))\n" +
		"\t\t\t\t\t\t\t\t\t\t";

	/**
	 * Validates the marrigesInLifetime constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_marrigesInLifetime(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GENdslPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "marrigesInLifetime",
				 PERSON__MARRIGES_IN_LIFETIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonHistory(PersonHistory personHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateX(DateX dateX, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateX, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfPerson(TypeOfPerson typeOfPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGender(Gender gender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfIntimateRelationship(TypeOfIntimateRelationship typeOfIntimateRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GENdslValidator
