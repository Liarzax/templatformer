package com.me.temPlatformer;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import controller.ControlHandler;
import entities.Hero;

public class Main extends BasicGame{
	
	private static final int WIDTH = 800,
							 HEIGHT = 640,
							 FPS_LIMIT = 60;
	
	private static boolean showFPS = true,
						   fullscreen = false,
						   debug = true;
	private static String title = "Platformer v1.3";
	
	private ControlHandler controlHandler = new ControlHandler();
	private Hero h = new Hero(new Vector2f(200, 300));
	
	public Main(String title){
		super(title);
	}
	
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Main(title));
		app.setDisplayMode(WIDTH,  HEIGHT,  fullscreen);
		app.setSmoothDeltas(true);
		app.setTargetFrameRate(FPS_LIMIT);
		app.setShowFPS(showFPS);
		app.start();
		
	}

	public void render(GameContainer container, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		h.render(g, debug);
	}

	public void init(GameContainer container) throws SlickException {
		controlHandler.init(container);
		h.init();
	}

	public void update(GameContainer container, int delta) throws SlickException {
		controlHandler.update(container);
		h.update(delta);
		h.setLocation(h.getNextLocation());
	}
}
