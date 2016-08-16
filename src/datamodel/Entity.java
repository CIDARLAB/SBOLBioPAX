package datamodel;

import org.biopax.paxtools.model.level3.PhysicalEntity;
import org.sbolstandard.core2.ComponentDefinition;

public class Entity {
	
	public Entity(PhysicalEntity paxEntity) {
		//Populate entity
	}
	
	public Entity(ComponentDefinition sbolCD) {
		//Populate entity
	}
	
	public PhysicalEntity convertToPhysicalEntity() {
		//Populate and produce physical entity
		return null;
	}
	
	public ComponentDefinition convertToComponentDefinition() {
		//Populate and produce component definition
		return null;
	}

}
