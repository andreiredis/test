import java.util.Scanner;

public class Checkers {
	
	public static void main(String[] args) {
		
		Player p1 = new Player(1, "A");
		Player p2 = new Player(2, "B");
		
		Game g = new Game(p1, p2);
		setPlayer(p1);
		
		while(true) {
			
			g.drawGame();
			g.playerMove();
			g.changePlayer();
				
		}
		
	}
	
}
