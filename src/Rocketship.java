import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Timer;

public class Rocketship extends GameObject{
	int speed;
	GameObject object;
	Timer timer2;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		object = new GameObject(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		
	}	
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 50, 50);
		
	}
	
}
