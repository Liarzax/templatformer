package stateMachine;

import entities.Entity;

public abstract class SuperState {
	private Entity entity;
	
	protected SuperState[] nextStates;
	
	public SuperState(Entity entity){
		this.entity = entity;
	}
	
	public abstract void init();
	public abstract void update();
}
