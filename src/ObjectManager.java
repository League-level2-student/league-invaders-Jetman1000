import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
//member variables
	 Rocketship rocket;
	  ArrayList<Alien> AlienObjects=new ArrayList<Alien>();
	  ArrayList<Projectile> Projectiles=new ArrayList<Projectile>();
Random random=new Random();
int score=0;
	 
//constructor
	 ObjectManager(Rocketship rocket){
		 this.rocket=rocket;
		 
	 }

	 
	 
//methods
	 //This method adds projectiles to the ArrayList
	  void addProjectile(Projectile object) {
			Projectiles.add(new Projectile(rocket.x,rocket.y,20,20));
			
		}
	  
	  void addAlien() {
		  AlienObjects.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));

	  }
	  
	  int getScore() {
		return score;
	  }
	  
	 //This iterates through all the aliens (goes through every one of the aliens) 
	  void update() { 
		  rocket.update();
		  for(int i=0; i<AlienObjects.size(); i++) {
			  Alien a=AlienObjects.get(i);
			  a.update();
			  checkCollision();
			  purgeObjects();
		  }
		  for(int i=0; i<Projectiles.size(); i++) {
			  Projectile p=Projectiles.get(i);
			  p.update();
			  checkCollision();
			  purgeObjects(); 
	  }
		 
}
	  void draw(Graphics g) {
		  rocket.draw(g);
		  for(int i=0; i<AlienObjects.size(); i++) {
			  Alien a=AlienObjects.get(i);
			  a.draw(g);
		for(int i1=0; i1<Projectiles.size(); i1++) {
				  Projectile p=Projectiles.get(i1);
				  p.draw(g);
		  }
	  }
}
	  //removes all not Active aliens and projectiles
	  void purgeObjects() {
		  for(int i=0; i<AlienObjects.size(); i++) {
			  Alien a=AlienObjects.get(i);
			  if(a.isActive==false) {
				  AlienObjects.remove(i);
			  }
		  }
		for(int i1=0; i1<Projectiles.size(); i1++) {
					  Projectile p=Projectiles.get(i1);
					  if(p.isActive==false) {
						  Projectiles.remove(i1);
			  }
		  }
	  }

void scoreReset() {
	score=0;
}
	  
 void reset() {
	AlienObjects.clear();
	Projectiles.clear();

}
 
 void checkCollision() {
	 //this part of the method checks if the rocket collides with the aliens**
	 for(int i=0; i<AlienObjects.size(); i++) {
		  Alien a = AlienObjects.get(i); //<---- This is one out of all the aliens in the arraylist
		  if(a.collisionBox.intersects(rocket.collisionBox)) {
				 a.isActive=false;
				 rocket.isActive=false;
				 
				 
			 }
		  //this part of the method checks if the projectiles collides with the aliens**
		  for(int i1=0; i1<Projectiles.size();i1++) {
				Projectile p= Projectiles.get(i1);
			 if(p.collisionBox.intersects(a.collisionBox)) {
				 a.isActive=false;
				 p.isActive=false;
				 score++;
			 }
		
		  }
 
	 }
	
	
	 
 }

 
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
		
		
	}
}  

