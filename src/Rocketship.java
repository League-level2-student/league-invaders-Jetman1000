import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject{
//member variables
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	
	boolean space = false;
	

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("rocket.png");
		}
		// TODO Auto-generated constructor stub
		speed=8;
		
	}
 void draw(Graphics g) {
	 g.setColor(Color.BLUE);
	 g.fillRect(x, y, width, height);
	 if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}

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
	
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
// this method makes a projectile from the center of the rocket
public Projectile getProjectile() {
	return new Projectile(x+width/2,y,10,10);
}

}
