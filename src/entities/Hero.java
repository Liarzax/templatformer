package entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;

import stateMachine.IdleState;
import stateMachine.SuperState;

public class Hero extends Entity{

	private static final float BOX_WIDTH = 32,
							   BOX_HEIGHT = 32;
	private SuperState currentState;
	private boolean canWalk = false, 
					canFall = false;
	private float gravity = 1.1f, 
				  xSpeed = 0f, xVelocity = 0,
				  ySpeed = 0f, yVelocity = 0,
				  maxSpeedX = 3f, maxSpeedY = 150f,
				  jumpHeight = 150f;
	
	public Hero(Vector2f location) {
		super(location, BOX_WIDTH, BOX_HEIGHT);
		// TODO Auto-generated constructor stub
		currentState = new IdleState(this);
	}
	
	public void setCurrentState(SuperState state){currentState = state;}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		currentState.init();
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		currentState.update(delta);
		move(delta);
	}
	
	private void move(int delta){
		setNextX(getLocation().getX() + (xSpeed * delta)   / 1000f);
		setNextY(getLocation().getY() + (ySpeed * delta)   / 1000f);
		float temp = ySpeed;
		if(ySpeed < 0){
			System.out.println(temp);
		}
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
	
	

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(float xVelocity) {
		this.xVelocity = xVelocity;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public float getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(float yVelocity) {
		this.yVelocity = yVelocity;
	}

	public boolean isCanFall() {
		return canFall;
	}

	public void setCanFall(boolean canFall) {
		this.canFall = canFall;
	}

	public float getMaxSpeedX() {
		return maxSpeedX;
	}

	public void setMaxSpeedX(float maxSpeedX) {
		this.maxSpeedX = maxSpeedX;
	}

	public float getMaxSpeedY() {
		return maxSpeedY;
	}

	public void setMaxSpeedY(float maxSpeedY) {
		this.maxSpeedY = maxSpeedY;
	}

	public float getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}

	public float getGravity() {
		return gravity;
	}
	
	

}
