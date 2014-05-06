package com.me.temPlatformer;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import controller.ControlHandler;

public class Main extends BasicGame{
	
	private static final int WIDTH = 800,
							 HEIGHT = 640,
							 FPS_LIMIT = 60;
	
	private static boolean showFPS = true,
						   fullscreen = false;
	private static String title = "Platformer v1.0";
	
	private ControlHandler controlHandler = new ControlHandler();
	
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
		
	}

	public void init(GameContainer container) throws SlickException {
		controlHandler.init(container);
		
	}

	public void update(GameContainer container, int delta) throws SlickException {
		controlHandler.update(container);
		
	}
}
