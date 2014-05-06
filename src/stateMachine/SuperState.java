package stateMachine;

import entities.Hero;

public abstract class SuperState {
	protected Hero hero;
	
	public SuperState(Hero hero){
		this.hero = hero;
	}
	
	public abstract void init();
	public abstract void update(int delta);
}
