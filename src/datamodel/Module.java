package datamodel;

import org.biopax.paxtools.model.level3.Pathway;
import org.sbolstandard.core2.ModuleDefinition;

public class Module {
	
	public Module(Pathway paxPathway) {
		//Populate entity
	}
	
	public Module(ModuleDefinition sbolMD) {
		//Populate entity
	}
	
	public Pathway convertToPathway() {
		//Populate and produce pathway
		return null;
	}
	
	public ModuleDefinition convertToModuleDefinition() {
		//Populate and produce module definition
		return null;
	}

}
