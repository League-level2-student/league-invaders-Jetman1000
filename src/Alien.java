import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Alien extends GameObject{
//member variables
	int speed=1;
	
	
	
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
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
		 g.setColor(Color.YELLOW);
		 g.fillRect(x, y, width, height);
}
	 
	 void update() {
		y+=speed;
		if(y<0) {
	isActive=false;	
		}
}
	static void addProjectile(Alien object) {
		
	}
	
	
}
