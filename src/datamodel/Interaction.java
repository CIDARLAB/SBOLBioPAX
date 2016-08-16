package datamodel;

public class Interaction {
	
	public Interaction(org.biopax.paxtools.model.level3.Interaction paxInteraction) {
		//Populate interaction
	}
	
	public Interaction(org.sbolstandard.core2.Interaction sbolInteraction) {
		//Populate interaction
	}
	
	public org.biopax.paxtools.model.level3.Interaction convertToPAXInteraction() {
		//Populate and produce BioPAX Interaction
		return null;
	}
	
	public org.sbolstandard.core2.Interaction convertToSBOLInteraction() {
		//Populate and produce SBOL Interaction
		return null;
	}

}
