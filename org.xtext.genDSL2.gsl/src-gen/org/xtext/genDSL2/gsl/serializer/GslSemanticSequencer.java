/*
 * generated by Xtext 2.10.0
 */
package org.xtext.genDSL2.gsl.serializer;

import com.google.inject.Inject;
import genDSL2.Cohabitation;
import genDSL2.DateX;
import genDSL2.GenDSL2Package;
import genDSL2.GenealogyTree;
import genDSL2.Marriage;
import genDSL2.Person;
import genDSL2.PersonHistory;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.genDSL2.gsl.services.GslGrammarAccess;

@SuppressWarnings("all")
public class GslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GenDSL2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GenDSL2Package.COHABITATION:
				sequence_Cohabitation(context, (Cohabitation) semanticObject); 
				return; 
			case GenDSL2Package.DATE_X:
				sequence_DateX(context, (DateX) semanticObject); 
				return; 
			case GenDSL2Package.GENEALOGY_TREE:
				sequence_GenealogyTree(context, (GenealogyTree) semanticObject); 
				return; 
			case GenDSL2Package.MARRIAGE:
				sequence_Marriage(context, (Marriage) semanticObject); 
				return; 
			case GenDSL2Package.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case GenDSL2Package.PERSON_HISTORY:
				sequence_PersonHistory(context, (PersonHistory) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Cohabitation returns Cohabitation
	 *
	 * Constraint:
	 *     (
	 *         legitimate?='legitimate'? 
	 *         type=TypeOfIntimateRelationship? 
	 *         (partners+=[Person|EString] partners+=[Person|EString]*)? 
	 *         (children+=Person children+=Person*)?
	 *     )
	 */
	protected void sequence_Cohabitation(ISerializationContext context, Cohabitation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DateX returns DateX
	 *
	 * Constraint:
	 *     (year=EInt? month=EInt? day=EInt?)
	 */
	protected void sequence_DateX(ISerializationContext context, DateX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenealogyTree returns GenealogyTree
	 *
	 * Constraint:
	 *     (familyName=EString established=DateX? (person+=Person person+=Person*)?)
	 */
	protected void sequence_GenealogyTree(ISerializationContext context, GenealogyTree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Marriage returns Marriage
	 *
	 * Constraint:
	 *     (
	 *         type=TypeOfIntimateRelationship? 
	 *         (spouses+=[Person|EString] spouses+=[Person|EString]*)? 
	 *         fromDate=DateX? 
	 *         toDate=DateX? 
	 *         (children+=Person children+=Person*)?
	 *     )
	 */
	protected void sequence_Marriage(ISerializationContext context, Marriage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PersonHistory returns PersonHistory
	 *
	 * Constraint:
	 *     (gender=Gender? givenName=EString? changed=EDATE?)
	 */
	protected void sequence_PersonHistory(ISerializationContext context, PersonHistory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     (
	 *         givenName=EString 
	 *         (
	 *             (
	 *                 unknown=EBoolean | 
	 *                 birthPlace=EString | 
	 *                 deathPlace=EString | 
	 *                 restingPlace=EString | 
	 *                 type=TypeOfPerson | 
	 *                 gender=Gender | 
	 *                 nickname=EString | 
	 *                 deathCause=EString | 
	 *                 birthDate=DateX | 
	 *                 deathDate=DateX
	 *             )? 
	 *             (otherNames+=EString otherNames+=EString*)?
	 *         )+ 
	 *         (personhistory+=PersonHistory personhistory+=PersonHistory*)? 
	 *         (cohabitation+=Cohabitation cohabitation+=Cohabitation*)? 
	 *         (marriage+=Marriage marriage+=Marriage*)?
	 *     )
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
