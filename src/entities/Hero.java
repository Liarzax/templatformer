package entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import org.newdawn.slick.geom.Vector2f;

import stateMachine.SuperState;

public class Hero extends Entity{

	private static final float BOX_WIDTH = 32,
							   BOX_HEIGHT = 32;
	private SuperState currentState;
	
	public Hero(Vector2f location) {
		super(location, BOX_WIDTH, BOX_HEIGHT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g, boolean debug) {
		if(debug){
			debugRender(g);
		}
		
	}

	@Override
	protected void debugRender(Graphics g) {
		g.setColor(new Color(0f,0f,1f,1f));
		g.drawRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());
	}

}
