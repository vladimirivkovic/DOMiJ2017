/**
 */
package genDSL2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genDSL2.GenDSL2Package
 * @generated
 */
public interface GenDSL2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenDSL2Factory eINSTANCE = genDSL2.impl.GenDSL2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Genealogy Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genealogy Tree</em>'.
	 * @generated
	 */
	GenealogyTree createGenealogyTree();

	/**
	 * Returns a new object of class '<em>Marriage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marriage</em>'.
	 * @generated
	 */
	Marriage createMarriage();

	/**
	 * Returns a new object of class '<em>Cohabitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cohabitation</em>'.
	 * @generated
	 */
	Cohabitation createCohabitation();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Person History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person History</em>'.
	 * @generated
	 */
	PersonHistory createPersonHistory();

	/**
	 * Returns a new object of class '<em>Date X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date X</em>'.
	 * @generated
	 */
	DateX createDateX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenDSL2Package getGenDSL2Package();

} //GenDSL2Factory
