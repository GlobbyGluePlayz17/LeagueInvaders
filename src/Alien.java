import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject {
	int rand;

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		rand = new Random().nextInt(500);
	}
	
	public void update() {
		super.update();
		y = rand;
		System.out.println(rand);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, 30, 30);
	}
}