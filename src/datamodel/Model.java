package datamodel;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Entity> entities;
	
	private List<Module> modules;
	
	private List<Interaction> interactions;
	
	public Model() {
		entities = new ArrayList<Entity>();
		modules = new ArrayList<Module>();
		interactions = new ArrayList<Interaction>();
	}
	
	public List<Entity> getEntities() {
		return entities;
	}
	
	public List<Module> getModules() {
		return modules;
	}
	
	public List<Interaction> getInteractions() {
		return interactions;
	}
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	public void addInteraction(Interaction interaction) {
		interactions.add(interaction);
	}
	
	public void removeEntity(Entity entity) {
		entities.remove(entity);
	}
	
	public void removeModule(Module module) {
		modules.remove(module);
	}
	
	public void removeInteraction(Interaction interaction) {
		interactions.remove(interaction);
	}
	

}
