package datamodel;

import org.biopax.paxtools.model.level3.Pathway;
import org.sbolstandard.core2.ModuleDefinition;

public class Module {
	
	public Module(Pathway paxPathway) {
		//Populate module
	}
	
	public Module(ModuleDefinition sbolMD) {
		//Populate module
	}
	
	public Pathway convertToPAXPathway() {
		//Populate and produce pathway
		return null;
	}
	
	public ModuleDefinition convertToSBOLModuleDefinition() {
		//Populate and produce module definition
		return null;
	}

}
