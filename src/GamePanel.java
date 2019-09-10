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
	//drawing the text
		Font titleFont;
		Font startFont;
		Font instructionsFont; 
		Timer frameDraw;
		//member variables
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2; 
	
	int currentState = MENU;
	
	Rocketship rocket=new Rocketship(250,700,50,50);
	
	GamePanel(){
		titleFont = new Font("Arial",Font.PLAIN, 48);
		startFont = new Font("Arial",Font.PLAIN, 30);
		instructionsFont = new Font("Arial",Font.PLAIN, 28);
		//the first parameter is in milliseconds (1000 milliseconds = 1 second)
		frameDraw = new Timer(1000/60,this);
		frameDraw.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU) {
			drawMenuState(g);
		}else if(currentState == GAME) {
			drawGameState(g);
		}else if(currentState == END) {
			drawEndState(g);
		}
	}
	
	
//methods for updating the game
	void updateMenuState(){
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	
//methods for drawing the game in each state
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		//code for the title "LEAGUE INVADERS"
		g.setFont(titleFont);
		g.setColor(Color.white);
		g.drawString("LEAGUE INVADERS", 25, 130);
		//code for the text: "Press ENTER to start"
		g.setFont(startFont);
		g.setColor(Color.yellow);
		g.drawString("Press ENTER to start", 105, 350);
		//code for the text: "Press SPACE  FOR INSTRUCTIONS"
		g.setFont(instructionsFont);
		g.setColor(Color.yellow);
		g.drawString("Press SPACE for instructions", 68, 500);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		rocket.draw(g);
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		//code for title "GAME OVER"
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString("GAME OVER", 110, 130);
		//code for the text: "You killed - enemies"
		g.setFont(startFont);
		g.setColor(Color.black);
		g.drawString("----------", 200, 350); 											// <---- not finished yet
		//code for the text: "Press ENTER to restart"
		g.setFont(instructionsFont);
		g.setColor(Color.black);
		g.drawString("Press ENTER to restart", 100, 500);
		
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU) {
			updateMenuState();
		}else if (currentState == GAME) {
			updateGameState();
		}else if (currentState == END) {
			updateEndState();
		}
	System.out.println("action");
	repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//code for the ENTER key and the ARROW keys too.
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
		} else {
			currentState++;
		}
}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
		    rocket.up();
			System.out.println("UP");
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			rocket.down();
			System.out.println("DOWN");
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			rocket.left();
			System.out.println("LEFT");
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			rocket.right();
			System.out.println("RIGHT");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
