import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Timer;

public class Rocketship extends GameObject{
	int speed;
	GameObject object;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		object = new GameObject(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		super.update();
	}	
	
	public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
  	}
	
}
