/*
 * generated by Xtext 2.10.0
 */
package org.xtext.genDSL2.gsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.genDSL2.gsl.ui.internal.GslActivator;

public class GslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GslActivator.getInstance().getInjector("org.xtext.genDSL2.gsl.Gsl");
	}

}
