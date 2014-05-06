package world;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Area {
	private TiledMap map;
	// size of tiles on map
	private int tileSize;
	// tile at location blocked.
	private boolean[][] collidable;
	private int mapLevel = 0;
	private String mapDir = "assets/maps/map"+mapLevel+".tmx";
	
	public Area() {
		
	}
	
	public void init() {
		
	}
	
	public void loadMap(int mapLevel) {
		setMapLevel(mapLevel);
		
		try {
			setCurMap(new TiledMap(mapDir));
			loadMapCollision();
		} 
		catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// could not find the map brooo!!! BBOOOOMMMMM!!!!!
		}
	}
	
	private void loadMapCollision() {
		// Build Map Collision Array based on tile properties in the TileD map 
		collidable = new boolean[getCurMap().getWidth()][getCurMap().getHeight()];
		for (int xAxis=0;xAxis<getCurMap().getWidth(); xAxis++) {

			for (int yAxis=0;yAxis<getCurMap().getHeight(); yAxis++) {
				int tileID = getCurMap().getTileId(xAxis, yAxis, 0);
				String value = getCurMap().getTileProperty(tileID, "blocked", "false");

				if ("true".equals(value)) {
					collidable[xAxis][yAxis] = true;
				}
			}
		}
	}
	
	public boolean isBlocked(float x, float y) {
		int xBlock = (int)x / getTileSize();
		int yBlock = (int)y / getTileSize();
		return collidable[xBlock][yBlock];
	}
	
	public int getTileSize() {
		return this.tileSize;
	}
	
	public TiledMap getCurMap() {
		return this.map;
	}
	
	private void setCurMap(TiledMap map) {
		this.map = map;
	}
	
	private void setMapLevel(int mapLevel) {
		this.mapLevel = mapLevel;
	}
}
