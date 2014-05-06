package controller;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

public class ControlHandler {
	
	private boolean downEsc = false;
	
	public ControlHandler(){
		
	}
	
	public void init(GameContainer container){
		
	}
	
	public void update(GameContainer container){
		checkKeys(container);
		if(downEsc){
			container.exit();
		}
	}
	
	public void checkKeys(GameContainer container){
		Input input = container.getInput();
		if(input.isKeyPressed(Keyboard.KEY_ESCAPE)){
			downEsc = true;
		}
		else if(input.isKeyDown(Keyboard.KEY_ESCAPE)){
			downEsc = true;
		}else 
		{
			downEsc = false;
		}
	}
}
