import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	int speed;
	
	Projectile(int x, int y, int width, int height) {
		super(x+=20, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
	
	public void update() {
		super.update();
		y-=speed;
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
	
}
