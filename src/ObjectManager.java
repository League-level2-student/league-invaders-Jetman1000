import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
//member variables
	 Rocketship rocket;
	  ArrayList<Alien> AlienObjects=new ArrayList<Alien>();
	  ArrayList<Projectile> Projectiles=new ArrayList<Projectile>();
Random random=new Random();
	 
//constructor
	 ObjectManager(Rocketship rocket){
		 this.rocket=rocket;
		 
	 }

	 
	 
//methods
	 //This method adds projectiles to the ArrayList
	  void addProjectile(Projectile object) {
			
		}
	  
	  void addAlien() {
		  AlienObjects.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));

	  }
	 //This iterates through all the aliens (goes through every one of the aliens) 
	  void update() { 
		  for(int i=0; i<AlienObjects.size(); i++) {
			  Alien a=AlienObjects.get(i);
			  a.update();
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
		for(int i1=0; i1<AlienObjects.size(); i1++) {
					  Projectile p=Projectiles.get(i1);
					  if(p.isActive==false) {
						  Projectiles.remove(i1);
			  }
		  }
	  }
}  
