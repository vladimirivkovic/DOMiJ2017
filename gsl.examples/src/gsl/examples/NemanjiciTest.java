package gsl.examples;

import gsl.examples.utilities.GSLToXMIConverter;
import gsl.generate.generator.GenealogyTreeMMGenerator;

public class NemanjiciTest {
	//this part should be changed on each computer
	//VD home PC
	private static final String PATH_TO_REPO 	= "/media/ragnar/3436171D3616DFA2/fax/DOMIJ/DOMiJ2017/test/";

	//this part is changed based on the example		
	private static final String GSL_M	 	= PATH_TO_REPO + "x.gsl";
	private static final String XMI_DIR 	= PATH_TO_REPO + "xmi/";




	public static void main(String[] args) {
		GSLToXMIConverter.convertERDSLtoXMI(GSL_M, XMI_DIR + "nem.xmi");

		GenealogyTreeMMGenerator.generateAll(GSL_M, XMI_DIR);
	}
}
