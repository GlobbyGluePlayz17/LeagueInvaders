import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship roc;
	ArrayList<Projectile> listProjectiles;
	
	ObjectManager(Rocketship rocket) {
		roc = rocket;
		listProjectiles = new ArrayList<Projectile>();
	}
	
	public void update() {
		roc.update();
		
	}
	
	public void draw(Graphics g) {
		roc.draw(g);
	}
	
	public void addProjectile(Projectile listProjectiles) {
		
	}
}
