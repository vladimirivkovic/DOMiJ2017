package gsl.examples;

import gsl.examples.utilities.GSLToXMIConverter;
import gsl.generate.generator.GenealogyTreeMMGenerator;

public class TestClass {

	public static void main(String[] args) {
		GSLToXMIConverter.convertERDSLtoXMI(
				"file://" + args[0] + args[1],
				"file://" + args[0] + args[1].split("\\.")[0] + ".xmi");

		GenealogyTreeMMGenerator.generateAll(
				"file://" + args[0] + args[1],
				args[0]);
	}

}
