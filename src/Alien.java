import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		y++;
	}
	
	public void draw(Graphics g) {
		
	}
}