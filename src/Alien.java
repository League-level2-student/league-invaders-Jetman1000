import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Alien extends GameObject{
//member variables
	int speed=1;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("alien.png");
		}

		// TODO Auto-generated constructor stub
		 speed=1;
		 this.x=x;
			this.y=y;
			this.width=width;
			this.height=height;
			this.speed=speed;
			this.isActive=isActive;
			ArrayList<Object> Aliens=new ArrayList<Object>(); 

	}
	

	// methods
	void draw(Graphics g) {
	
		 g.fillRect(x, y, width, height);
		 if (gotImage) {
				g.drawImage(image, x, y, width, height, null);
			} else {
				g.setColor(Color.BLUE);
				g.fillRect(x, y, width, height);
			}
}
	 
	 void update() {
			super.update();
		y+=speed;
		if(y<0) {
	isActive=false;	
		}
}
	static void addProjectile(Alien object) {
		
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
	
	
	
	
}
