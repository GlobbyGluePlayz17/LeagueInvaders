import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship roc;
	ArrayList<Projectile> listProjectiles;
	ArrayList<Alien> listAlien;
	
	ObjectManager(Rocketship rocket) {
		roc = rocket;
		listProjectiles = new ArrayList<Projectile>();
	}
	
	public void update() {
		roc.update();
		for (int i = 0; i < listProjectiles.size(); i++) {
			listProjectiles.get(i).update();
		}
	}
	
	public void draw(Graphics g) {
		System.out.println(listProjectiles.size());
		for (int i = 0; i < listProjectiles.size(); i++) {
			listProjectiles.get(i).draw(g);
		}
		roc.draw(g);
	}
	
	public void addProjectile(Projectile projectileADDList) {
			listProjectiles.add(projectileADDList);
	}
	
	public void addAlien(Alien alienADDList) {
		listAlien.add(alienADDList);
	}
}
