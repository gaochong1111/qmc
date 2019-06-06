package epmc.qmc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import epmc.main.options.UtilOptionsEPMC;
import epmc.options.Options;
import epmc.prism.model.ModelPRISM;
import epmc.qmc.model.ParseException;
import epmc.qmc.model.QMCParser;
public class Main {

	public static void main(String args[]) throws ParseException {
		File prismFile = new File("examples/loop.prism");
		InputStream input = null;
		try {
			input = new FileInputStream(prismFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QMCParser parser = new QMCParser(input);
		Options options = UtilOptionsEPMC.newOptions();
		Options.set(options);
	
		ModelPRISM modelPRISM = new ModelPRISM();
		parser.setModel(modelPRISM);
        parser.parseModel();
	  }

}
