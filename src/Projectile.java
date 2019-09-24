import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Projectile extends GameObject{

	
	//constructor
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
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
}
void update() {
	y-=speed;
}
	
	
}
