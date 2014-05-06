package stateMachine;

import entities.Hero;

public class FallState extends SuperState{

	public FallState(Hero hero) {
		super(hero);
		init();
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
		hero.setyVelocity(hero.getyVelocity() + hero.getGravity());
		if(hero.getyVelocity() > hero.getMaxSpeedY()){
			hero.setyVelocity(hero.getMaxSpeedY());
		}
		
		hero.setySpeed(hero.getySpeed() + hero.getyVelocity() );
	}

}
