package gsl.generate.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import genDSL2.GenDSL2Package;
import genDSL2.GenealogyTree;
import gsl.generate.generator.HTMLGenerator;

public class GenealogyTreeMMGenerator {

	public static void generateAll(String inputPath, String outputDir) {
		
		//open directory chooser
		//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//		DirectoryDialog dirDialog = new DirectoryDialog(shell);
//		dirDialog.setText("Select generation directory");
//		dirDialog.setMessage("Please select directory where you want to put generated files.");
//		String selectedDir = dirDialog.open();
		if (outputDir != null) {
			GenealogyTree ft = loadGTreeModel(inputPath);
			HTMLGenerator html = new HTMLGenerator();
			
			System.out.println(ft.getFamilyName());
			CharSequence cs = html.generate(ft);
			saveFile(outputDir + ft.getFamilyName().toLowerCase() +".js", cs);
			
			GedcomGenerator gedcom = new GedcomGenerator();
			
			System.out.println(ft.getFamilyName());
			cs = gedcom.generate(ft);
			saveFile(outputDir + ft.getFamilyName().toLowerCase() +".ged", cs);
		}
		
	}

	private static GenealogyTree loadGTreeModel(String modulePath) {
		// Initialize the model
		GenDSL2Package.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modulePath), true);
		//Resource resource = resSet.getResource(URI.createURI("rdbms/RDBMSModel.xmi"), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is included in this first node
		GenealogyTree db = (GenealogyTree) resource.getContents().get(0);

		return db;
	}

	private static void saveFile(String path, CharSequence cs) {
		File output = new File(path);
		PrintWriter pw = null;
		try {
			if (output.getParentFile() != null) {
				output.getParentFile().mkdirs();
			}			
			output.createNewFile();
			pw = new PrintWriter(new FileOutputStream(output));
			pw.print(cs);

			System.out.println("saved " + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}
