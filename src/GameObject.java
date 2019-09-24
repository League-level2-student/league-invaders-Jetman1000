import java.util.ArrayList;

public class GameObject {
	//member variables
int x;
int y;
int width;
int height;
int speed=0;
static boolean isActive=true;
//constructor
GameObject(int x, int y, int width, int height){
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	this.speed=speed;
	this.isActive=isActive;
	ArrayList<Object> projectiles=new ArrayList<Object>(); 

	}



}
