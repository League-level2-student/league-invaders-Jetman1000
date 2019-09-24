import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
//member variables
	 Rocketship rocket;
	  ArrayList<Alien> AlienObjects=new ArrayList<Alien>();
	  ArrayList<Projectile> Projectiles=new ArrayList<Projectile>();
Random random=new Random();
	 
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
	  
	  void update() { // Left off here *******
		  
		  
	  }
	 
}
