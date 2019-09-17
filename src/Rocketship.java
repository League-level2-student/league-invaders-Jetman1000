import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	public static int x= 250;
	public static int y= 700;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed=8;
		
	}
 void draw(Graphics g) {
	 g.setColor(Color.BLUE);
	 g.fillRect(x, y, width, height);
 }
 
 void update() {
	
	 if(up == true) {
		 up();
	 }
	 if(down == true) {
		 down();
	 }
	 if(left == true) {
		 left();
	 }
	 if(right == true) {
		 right();
	 }
 checkBounds();
 }
 
 void checkBounds() {
	 if(x>LeagueInvaders.WIDTH-width) {
		 x=LeagueInvaders.WIDTH-width;

	 }
	 
	 if(x<LeagueInvaders.WIDTH-500) {
		 x=LeagueInvaders.WIDTH-500;
		
	 }
	 
	 if(y>LeagueInvaders.HEIGHT-70) {
		 y=LeagueInvaders.HEIGHT-70;
		
	 }
	 
	 if(y<LeagueInvaders.HEIGHT-800) {
		 y=LeagueInvaders.HEIGHT-800;
		
	 }
	 
 }
 
public void up(){
	 y-=speed;
}

public void down() {
	y+=speed;
}

public void left() {
	x-=speed;
}

public void right() {
	x+=speed; 
}
	
}
