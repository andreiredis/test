import java.util.Scanner;

public class Checkers {
	
	public static void main(String[] args) {
		
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		
		Board b = new Board(p1, p2);
		
		
		while(true) {
			
			b.drawGame();
				
		}
		
	}
	
}
