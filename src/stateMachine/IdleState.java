package stateMachine;

import entities.Hero;

public class IdleState extends SuperState{
	
	public IdleState(Hero hero) {
		super(hero);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		hero.setCanFall(true);
		hero.setCanWalk(true);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		if(true){
			hero.setCurrentState(new JumpState(hero));
		}
	}
	
}
