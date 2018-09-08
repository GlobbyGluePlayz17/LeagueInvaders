import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship roc;
	ArrayList<Projectile> listProjectiles;
	ArrayList<Alien> listAlien;
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	int score;
	
	
	ObjectManager(Rocketship rocket) {
		roc = rocket;
		listProjectiles = new ArrayList<Projectile>();
		listAlien = new ArrayList<Alien>();
		score = 0;
	}
	
	public void update() {
		for (int i = 0; i < listProjectiles.size(); i++) {
			listProjectiles.get(i).update();
		}
		for (int i = 0; i < listAlien.size(); i++) {
			listAlien.get(i).update();
		}
		roc.update();
	}
	
	public void draw(Graphics g) {
		for (int i = 0; i < listProjectiles.size(); i++) {
			listProjectiles.get(i).draw(g);
		}
		for (int i = 0; i < listAlien.size(); i++) {
			listAlien.get(i).draw(g);
			System.out.println("asdf");
		}
		roc.draw(g);
		
		System.out.println(listProjectiles.size());
		System.out.println(listAlien.size());
		System.out.println(score);
	}
	
	public void addProjectile(Projectile projectileADDList) {
		listProjectiles.add(projectileADDList);
	}
	
	public void addAlien(Alien alienADDList) {
		listAlien.add(alienADDList);
	}
	
		public void manageEnemies(){
	        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	                addAlien(new Alien(new Random().nextInt(LeagueInvaders.Width), 0, 50, 50));

	enemyTimer = System.currentTimeMillis();
	        }
	}
		
	public void purgeObjects() {
			for (int i = 0; i < listAlien.size(); i++) {
				if (listAlien.get(i).isAlive == false) {
					listAlien.remove(i);
					System.out.println("asdfasdf");
				}
			}
	}
	
	
	public void checkCollision() {
		for(Alien a : listAlien){
	        if(roc.collisionBox.intersects(a.collisionBox)){
	               roc.isAlive = false;
	        }
		}
		for (Projectile a : listProjectiles) {
			for (int i = 0; i < listAlien.size(); i++) {
				if (listAlien.get(i).collisionBox.intersects(a.collisionBox)) {
					listAlien.get(i).isAlive = false;
					a.isAlive = false;
					score++;
				}
			}
		}
	}
	
	public void scoreGetter() {
		this.score = score;
	}
}
