import java.awt.Graphics;
import java.util.Random;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;
	
	GameObject(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height = height;
		boolean isAlive = true;
	}
	
	public void update() {
			
	}
	
	public void draw(Graphics g) {
		
	}
}
