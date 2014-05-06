package stateMachine;

import entities.Hero;

public class JumpState extends SuperState {

	public JumpState(Hero hero) {
		super(hero);
		init();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		hero.setCanFall(true);
		hero.setCanWalk(true);
		hero.setyVelocity(0);
		hero.setySpeed(-hero.getJumpHeight());
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
		// TODO - buggy
		hero.setyVelocity(hero.getyVelocity() + hero.getGravity());
		if(hero.getyVelocity() >= 0){
			hero.setCurrentState(new FallState(hero));
		}
		
		hero.setySpeed(hero.getySpeed() + hero.getyVelocity());
	}

}
