import javax.swing.JFrame;
// you left off on the VIEW part of the module (ADD Text)
public class LeagueInvaders {
	JFrame frame;
	GamePanel GP;
	public static final int WIDTH=500;
	public static final int HEIGHT=800;
	
	LeagueInvaders(){
		frame= new JFrame();
		GP=new GamePanel();
	}
	
	public static void main(String[] args) {
		LeagueInvaders LI= new LeagueInvaders();
		LI.setup();
	}
	
	void setup() {
		frame.add(GP);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}

