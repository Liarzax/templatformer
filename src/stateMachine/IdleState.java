package stateMachine;

import entities.Entity;

public class IdleState extends SuperState{
	
	private static final int STATE_WALK = 0;
	
	public IdleState(Entity entity) {
		super(entity);
		nextStates = new SuperState[0];
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
