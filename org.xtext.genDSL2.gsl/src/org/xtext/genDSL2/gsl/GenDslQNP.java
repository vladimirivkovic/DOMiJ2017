package org.xtext.genDSL2.gsl;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import genDSL2.Person;

public class GenDslQNP extends DefaultDeclarativeQualifiedNameProvider {

	QualifiedName qualifiedName(Person e) {
		String postfix = "";
		if (e.getNickname() != null) {
			postfix += e.getNickname();
		}
		if (e.getBirthDate() != null)
			postfix += e.getBirthDate().getYear() + "";

		return QualifiedName.create(e.getGivenName() + postfix);
	}
}
