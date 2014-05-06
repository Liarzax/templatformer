package entities;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public abstract class Entity {
	
	protected Rectangle box;
	protected Vector2f nextLocation;
	
	public Entity(Vector2f location, float width, float height){
		box = new Rectangle(0,0, width, height);
		setLocation(location);
		nextLocation = getLocation().copy();
	}
	
	public abstract void init();
	public abstract void update(int delta);
	public abstract void render(Graphics g, boolean debug);
	protected abstract void debugRender(Graphics g);
	
	public Vector2f getLocation() { return new Vector2f(box.getCenterX(), box.getCenterY()); }
	public void setLocation(Vector2f location) 
	{
		box.setX(location.x - box.getWidth() / 2);
		box.setY(location.y - box.getHeight() / 2);
	}
	
	public Vector2f getNextLocation() {
		return this.nextLocation;
	}
	
	protected void setNextLocation(Vector2f nextLocation) {
		this.nextLocation = nextLocation;
	}
	protected void setNextX(float nextX) {
		nextLocation.x = nextX;
	}
	protected void setNextY(float nextY) {
		nextLocation.y = nextY;
	}
	
	public Rectangle getBox(){ return box;}
	public void setBox(Rectangle box){ this.box = box;}
}
