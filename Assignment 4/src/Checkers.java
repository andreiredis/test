import java.util.Scanner;

public class Checkers {
	public Scanner s = new Scanner(System.in);
	
	void changePlayer() {
		if (player == 1) {
			player = 2;
		} else {
			player = 1;
		}
	}
	
	public static void main(String[] args) {
		
		Board b = new Board();
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		
		
		while(true) {
			
			tabHeader();
			printTab(b.m);
			tabFooter();
			p.change();
			
			System.out.print("\nTurn of Player no. " + pno + "\n");
			
			
		}
		
	}
	
}
