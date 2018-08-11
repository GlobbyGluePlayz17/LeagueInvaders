import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer timer1;
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	Font titleFont;
	Font	 GameOverFont;
	Rocketship rocket;
	ObjectManager om;

	GamePanel() {
		timer1 = new Timer(1000/60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		GameOverFont = new Font("Arial", Font.PLAIN, 48);
		rocket = new Rocketship(250, 700, 50, 50);
		om = new ObjectManager(rocket);
	}
	
	public void startGame() {
		timer1.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		 if (currentState == MENU_STATE) {
			 updateMenuState();
		 } else if (currentState == GAME_STATE) {
			updateGameState();
		 } else if (currentState == END_STATE) {
			updateEndState();
		 }
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tesser");
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			if (currentState == 0) {
				currentState = 1;
			} else if (currentState == 1) {
				currentState = 2;
			} else if (currentState == 2) {
				currentState = 0;
			}
		}
			System.out.println(currentState);
		
		if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			rocket.x-=rocket.speed;
			System.out.println("left");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.x+=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.y-=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.y+=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_UP + KeyEvent.VK_LEFT) {
			rocket.x-=rocket.speed;
			rocket.y-=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_UP + KeyEvent.VK_RIGHT) {
			rocket.x+=rocket.speed;
			rocket.y-=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN + KeyEvent.VK_LEFT) {
			rocket.x-=rocket.speed;
			rocket.y+=rocket.speed;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN + KeyEvent.VK_RIGHT) {
			rocket.x+=rocket.speed;
			rocket.y+=rocket.speed;
		} 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("set");
	}
	
	@Override
	public void paintComponent(Graphics g){
		 if (currentState == MENU_STATE) {
			 drawMenuState(g);
		 } else if (currentState == GAME_STATE) {
			drawGameState(g);
		 } else if (currentState == END_STATE) {
			drawEndState(g);
		 }
	}
	
	public void updateMenuState() {
		
	}
	
	public void updateGameState() {
		om.update();
	}
	
	public void updateEndState() {
		
	}
	
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("LeagueInvaders", 80, 150);
	}
	
	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		om.draw(g);
	}
	
	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("Game Over", 115, 150);
	}
}
