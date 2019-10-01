import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Projectile extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	//constructor
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("bullet.png");
		}
		// TODO Auto-generated constructor stub
		speed=10;
		 this.x=x;
			this.y=y;
			this.width=width;
			this.height=height;
			this.speed=speed;
			this.isActive=isActive;
			ArrayList<Object> Aliens=new ArrayList<Object>(); 
	}
//methods
void draw(Graphics g) {
	g.setColor(Color.YELLOW);
	g.fillRect(x, y, width, height);
	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
void update() {
	y-=speed;
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
